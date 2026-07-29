package com.dancingbogo.skyrolline.ad.interstitial;

import android.app.Activity;
import android.os.Bundle;
import com.cmplay.a.d;
import com.cmplay.base.util.h;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.ad.a;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.customevent.CustomEventInterstitial;
import com.google.ads.mediation.customevent.CustomEventInterstitialListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* loaded from: classes2.dex */
public class AdxAds implements CustomEventInterstitial {
    private InterstitialAd mInterstitial;
    private CustomEventInterstitialListener mCustomEventListener = null;
    private AdListener mAdListener = new AdListener() { // from class: com.dancingbogo.skyrolline.ad.interstitial.AdxAds.1
        @Override // com.google.android.gms.ads.AdListener
        public void onAdLeftApplication() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            if (AdxAds.this.mCustomEventListener != null) {
                AdxAds.this.mCustomEventListener.onDismissScreen();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(int i) {
            h.a("zzb_adx", "onAdFailedToLoad ---" + i);
            if (AdxAds.this.mCustomEventListener != null) {
                AdxAds.this.mCustomEventListener.onFailedToReceiveAd();
            }
            new d().a(1, 3, i, 104, 99);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            if (AdxAds.this.mCustomEventListener != null) {
                AdxAds.this.mCustomEventListener.onPresentScreen();
            }
            h.a("zzb_adx", "onAdOpened ---");
            new d().a(1, 4, 0, 104, 99);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            h.a("zzb_adx", "onAdLoaded ---");
            if (AdxAds.this.mCustomEventListener != null) {
                AdxAds.this.mCustomEventListener.onReceivedAd();
            }
            new d().a(1, 2, 0, 104, 99);
        }
    };

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(CustomEventInterstitialListener customEventInterstitialListener, Activity activity, String str, String str2, MediationAdRequest mediationAdRequest, Object obj) {
        AdRequest build;
        h.a("zzb_adx", "requestInterstitialAd ---" + str2);
        if (!a.i) {
            a.j = com.dancingbogo.skyrolline.util.d.b(activity);
            a.i = true;
        }
        if (a.j && a.i) {
            this.mCustomEventListener = customEventInterstitialListener;
            this.mInterstitial = new InterstitialAd(activity);
            this.mInterstitial.setAdUnitId(str2);
            this.mInterstitial.setAdListener(this.mAdListener);
            if (!GDPRController.checkIfGDPRAgreedAdStayInformed(activity)) {
                Bundle bundle = new Bundle();
                bundle.putString("npa", "1");
                build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            } else {
                build = new AdRequest.Builder().build();
            }
            this.mInterstitial.loadAd(build);
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
