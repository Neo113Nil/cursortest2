package com.dancingbogo.skyrolline.ad.interstitial.admob;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.dancingbogo.skyrolline.AppActivity;

/* loaded from: classes2.dex */
public class AdmobAdsTestUtil {
    public static final Boolean DEBUG = false;
    public static final String DEV_ID_ADX = "ca-app-pub-6783879517274907/4100032435";
    public static final String DEV_ID_Admob = "ca-app-pub-6783879517274907/8000240079";
    public static final String DEV_ID_Chartboost = "ca-app-pub-6783879517274907/1300099552";
    public static final String DEV_ID_FaceBook = "ca-app-pub-6783879517274907/4003000064";
    public static final String DEV_ID_IronSource = "ca-app-pub-6783879517274907/8080006879";
    public static final String DEV_ID_Mopub = "ca-app-pub-6783879517274907/1978000090";
    public static final String DEV_ID_Unity = "ca-app-pub-6783879517274907/4790003986";
    public static final String DEV_ID_Vungle = "ca-app-pub-6783879517274907/1110007005";
    private static final String TAG = "AdmobAdsTestUtil";
    private static AdmobAdsTestUtil sInstance;

    public static AdmobAdsTestUtil getInstance() {
        if (sInstance == null) {
            synchronized (AdmobAdsTestUtil.class) {
                if (sInstance == null) {
                    sInstance = new AdmobAdsTestUtil();
                }
            }
        }
        return sInstance;
    }

    public void showInterstitialAd() {
        Log.v(TAG, "into showInterstitialAd");
        AdmobAds.getInstance().show(0);
    }

    public void chooseAd() {
        Log.v(TAG, "into chooseAd");
        try {
            AppActivity.getActivityRef().startActivity(new Intent(AppActivity.getActivityRef().getBaseContext(), (Class<?>) AdmobTestActivity.class));
        } catch (Exception e) {
            Log.v(TAG, "startActivity Exception:" + e.getMessage());
        }
    }

    public void showToast(String str) {
        if (DEBUG.booleanValue()) {
            Toast.makeText(AppActivity.getActivityRef(), str, 1).show();
        }
    }
}
