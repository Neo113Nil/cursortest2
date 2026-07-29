package com.youappi.sdk.mediation.admob;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.ads.YAInterstitialAd;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class YouAppiInterstitialAd implements CustomEventInterstitial, YAInterstitialAd.InterstitialAdListener {
    private static final String TAG = "YouAppiInterstitialAd";
    private String accessToken;
    private YAInterstitialAd interstitialAd;
    private CustomEventInterstitialListener listener;

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onAdLeftApplication(String str) {
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onAdStarted(String str) {
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onCardClose(String str) {
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(Context context, CustomEventInterstitialListener customEventInterstitialListener, String str, MediationAdRequest mediationAdRequest, Bundle bundle) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.accessToken = jSONObject.getString(ParamNames.ACCESS_TOKEN);
                if (YouAppiAdMobUtils.initSdk(TAG, context.getApplicationContext(), this.accessToken, bundle)) {
                    String string = jSONObject.getString(ParamNames.AD_UNIT_ID);
                    if (string != null) {
                        Log.i(TAG, "Loading Interstitial Ad for ad unit: " + string + " with access token: " + this.accessToken);
                        this.interstitialAd = YouAPPi.getInstance().interstitialAd(string);
                        this.interstitialAd.setInterstitialAdListener(this);
                        this.interstitialAd.load();
                        this.listener = customEventInterstitialListener;
                    } else {
                        Log.e(TAG, "Failed loading YouAppi Interstitial Ad. Ad Unit Id is not configured in AdMob console");
                        this.listener.onAdFailedToLoad(1);
                    }
                }
                return;
            } catch (JSONException unused) {
                Log.e(TAG, "Failed Initializing YouAppi SDK. Param value is not setup properly in AdMob console");
                this.listener.onAdFailedToLoad(1);
                return;
            }
        }
        Log.e(TAG, "Failed Initializing YouAppi SDK. Param value missing for custom event in AdMob console");
        this.listener.onAdFailedToLoad(1);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        Log.i(TAG, "Showing YouAppi Interstitial Ad");
        this.interstitialAd.show();
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        Log.i(TAG, "onDestroy");
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
        Log.i(TAG, "onPause");
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
        Log.i(TAG, "onResume");
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onCardShow(String str) {
        if (this.listener != null) {
            this.listener.onAdOpened();
        }
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onAdClick(String str) {
        if (this.listener != null) {
            this.listener.onAdClicked();
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onLoadFailure(String str, YAErrorCode yAErrorCode, Exception exc) {
        Log.e(TAG, "Failed loading YouAppi Interstitial Ad for Ad Unit Id: " + str + " and access token: " + this.accessToken + " for reason: " + yAErrorCode, exc);
        if (this.listener != null) {
            this.listener.onAdFailedToLoad(YouAppiAdMobUtils.toAdMobErrorCode(yAErrorCode));
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onShowFailure(String str, YAErrorCode yAErrorCode, Exception exc) {
        Log.e(TAG, "Failed showing YouAppi Interstitial Ad for Ad Unit Id: " + str + " with accessToken: " + this.accessToken + " for reason: " + yAErrorCode, exc);
        if (this.listener != null) {
            this.listener.onAdFailedToLoad(0);
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onAdEnded(String str) {
        Log.i(TAG, "onAdEnded. Ad unit id: " + str);
        if (this.listener != null) {
            this.listener.onAdClosed();
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onLoadSuccess(String str) {
        Log.i(TAG, "YouAppi Interstitial Ad for Ad Unit Id: " + str + " was loaded successfully");
        if (this.listener != null) {
            this.listener.onAdLoaded();
        }
    }
}
