package sg.edu.rp.c346.id20011119.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu,View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");

        if (v == tvTranslatedText) {
            wordClicked = "hello";
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (wordClicked.equalsIgnoreCase("Hello")) {
            if (item.getItemId() == 0) {
                tvTranslatedText.setText("Hello");
                return true;
            } else if (item.getItemId() == 1) {
                tvTranslatedText.setText("Ciao");
                return true;
            }
        }
        return super.onContextItemSelected(item);
    }}