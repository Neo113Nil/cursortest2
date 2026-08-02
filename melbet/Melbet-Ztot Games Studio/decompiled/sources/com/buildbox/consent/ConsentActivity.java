package com.buildbox.consent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.adventuretime.superstorm.PTPlayer;
import com.adventuretime.superstorm.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConsentActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.consent);
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        ((Button) findViewById(R.id.buttonYesToAll)).setOnClickListener(new View.OnClickListener() { // from class: com.buildbox.consent.ConsentActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConsentActivity.this.setConsentForAll(true);
                ConsentActivity.this.startPTPlayer();
            }
        });
        ((TextView) findViewById(R.id.buttonNoToAll)).setOnClickListener(new View.OnClickListener() { // from class: com.buildbox.consent.ConsentActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConsentActivity.this.setConsentForAll(false);
                ConsentActivity.this.startPTPlayer();
            }
        });
        ((TextView) findViewById(R.id.textPrivacyPolicy)).setOnClickListener(new View.OnClickListener() { // from class: com.buildbox.consent.ConsentActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new ConsentDetailFragment().show(ConsentActivity.this.getSupportFragmentManager(), "consent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsentForAll(boolean z) {
        Iterator<SdkConsentInfo> it = ConsentHelper.getSdkConsentInfos().iterator();
        while (it.hasNext()) {
            this.sharedPreferences.edit().putBoolean(ConsentHelper.getConsentKey(it.next().getSdkId()), z).commit();
        }
    }

    void startPTPlayer() {
        if (isFinishing()) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) PTPlayer.class));
        finish();
    }
}
