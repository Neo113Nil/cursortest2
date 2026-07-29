package com.dancingbogo.skyrolline.ad.interstitial.admob;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.dancingbogo.skyrolline.R;

/* loaded from: classes2.dex */
public class AdmobTestActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "AdmobTestActivity";

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cmplay_admob_test_layout);
        Button button = (Button) findViewById(R.id.test_admob);
        Button button2 = (Button) findViewById(R.id.test_chartboost);
        Button button3 = (Button) findViewById(R.id.test_unity);
        Button button4 = (Button) findViewById(R.id.test_vungle);
        Button button5 = (Button) findViewById(R.id.test_mopub);
        Button button6 = (Button) findViewById(R.id.test_adx);
        Button button7 = (Button) findViewById(R.id.test_facebook);
        Button button8 = (Button) findViewById(R.id.test_ironsource);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.test_admob /* 2131230960 */:
                Log.v(TAG, "into test_admob");
                isCreatAdmobAds("ca-app-pub-6783879517274907/8100040079");
                break;
            case R.id.test_adx /* 2131230961 */:
                Log.v(TAG, "into test_adx");
                isCreatAdmobAds("ca-app-pub-6783879517274907/4138800035");
                break;
            case R.id.test_chartboost /* 2131230962 */:
                Log.v(TAG, "into test_chartboost");
                isCreatAdmobAds("ca-app-pub-6783879517274907/1328000552");
                break;
            case R.id.test_facebook /* 2131230963 */:
                Log.v(TAG, "into test_facebook");
                isCreatAdmobAds("ca-app-pub-6783879517274907/4003100064");
                break;
            case R.id.test_ironsource /* 2131230964 */:
                Log.v(TAG, "into test_ironsource");
                isCreatAdmobAds("ca-app-pub-6783879517274907/8081000879");
                break;
            case R.id.test_mopub /* 2131230965 */:
                Log.v(TAG, "into test_mopub");
                isCreatAdmobAds(AdmobAdsTestUtil.DEV_ID_Mopub);
                break;
            case R.id.test_unity /* 2131230966 */:
                Log.v(TAG, "into test_unity");
                isCreatAdmobAds("ca-app-pub-6783879517274907/4792000986");
                break;
            case R.id.test_vungle /* 2131230967 */:
                Log.v(TAG, "into test_vungle");
                isCreatAdmobAds("ca-app-pub-6783879517274907/1117400005");
                break;
        }
        finish();
    }

    private void isCreatAdmobAds(String str) {
        Log.v(TAG, "into AdmobAds.DEV_ID = " + AdmobAds.DEV_ID);
        Log.v(TAG, "into newID = " + str);
        Log.v(TAG, "into boolean = " + AdmobAds.DEV_ID.equals(str));
        if (AdmobAds.DEV_ID.equals(str)) {
            Log.v(TAG, "into ID is same");
        } else {
            Log.v(TAG, "into ID is dif");
            AdmobAds.cleanInstance();
            AdmobAds.DEV_ID = str;
            new AdmobAds();
        }
        AdmobAds.getInstance().prepare();
        AdmobAds.getInstance().prepare();
    }
}
