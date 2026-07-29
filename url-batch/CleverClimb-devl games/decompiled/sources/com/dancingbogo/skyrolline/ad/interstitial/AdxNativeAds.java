package com.dancingbogo.skyrolline.ad.interstitial;

import android.app.Activity;
import com.cmplay.a.d;
import com.cmplay.base.util.h;
import com.dancingbogo.skyrolline.ad.a;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.customevent.CustomEventInterstitial;
import com.google.ads.mediation.customevent.CustomEventInterstitialListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* loaded from: classes2.dex */
public class AdxNativeAds implements CustomEventInterstitial {
    private static final String TAG = "Adx_NativeAdsHigh";
    private InterstitialAd mInterstitial;
    private CustomEventInterstitialListener mCustomEventListener = null;
    private AdListener mAdListener = new AdListener() { // from class: com.dancingbogo.skyrolline.ad.interstitial.AdxNativeAds.1
        @Override // com.google.android.gms.ads.AdListener
        public void onAdLeftApplication() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            if (AdxNativeAds.this.mCustomEventListener != null) {
                AdxNativeAds.this.mCustomEventListener.onDismissScreen();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(int i) {
            h.a(AdxNativeAds.TAG, "onAdFailedToLoad ---" + i);
            if (AdxNativeAds.this.mCustomEventListener != null) {
                AdxNativeAds.this.mCustomEventListener.onFailedToReceiveAd();
            }
            new d().a(1, 3, i, 104, 99);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            if (AdxNativeAds.this.mCustomEventListener != null) {
                AdxNativeAds.this.mCustomEventListener.onPresentScreen();
            }
            h.a(AdxNativeAds.TAG, "onAdOpened ---");
            new d().a(1, 4, 0, 104, 99);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            h.a(AdxNativeAds.TAG, "onAdLoaded ---");
            if (AdxNativeAds.this.mCustomEventListener != null) {
                AdxNativeAds.this.mCustomEventListener.onReceivedAd();
            }
            new d().a(1, 2, 0, 104, 99);
        }
    };

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(CustomEventInterstitialListener customEventInterstitialListener, Activity activity, String str, String str2, MediationAdRequest mediationAdRequest, Object obj) {
        h.a(TAG, "requestInterstitialAd ---" + str2);
        if (!a.i) {
            a.j = com.dancingbogo.skyrolline.util.d.b(activity);
            a.i = true;
        }
        if (a.j && a.i) {
            this.mCustomEventListener = customEventInterstitialListener;
            this.mInterstitial = new InterstitialAd(activity);
            this.mInterstitial.setAdUnitId(str2);
            this.mInterstitial.setAdListener(this.mAdListener);
            this.mInterstitial.loadAd(new AdRequest.Builder().build());
            new d().a(1, 1, 0, 104, 99);
        }
    }

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        if (this.mInterstitial == null || !this.mInterstitial.isLoaded()) {
            return;
        }
        this.mInterstitial.show();
    }

    @Override // com.google.ads.mediation.customevent.CustomEvent
    public void destroy() {
        this.mInterstitial = null;
    }
}
