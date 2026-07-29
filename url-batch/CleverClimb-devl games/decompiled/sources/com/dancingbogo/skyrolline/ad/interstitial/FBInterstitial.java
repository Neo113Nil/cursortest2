package com.dancingbogo.skyrolline.ad.interstitial;

import android.app.Activity;
import android.text.TextUtils;
import com.cmplay.a.d;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.customevent.CustomEventInterstitial;
import com.google.ads.mediation.customevent.CustomEventInterstitialListener;

/* loaded from: classes2.dex */
public class FBInterstitial implements CustomEventInterstitial {
    private InterstitialAd interstitialAd;
    private CustomEventInterstitialListener mListener;

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(CustomEventInterstitialListener customEventInterstitialListener, Activity activity, String str, String str2, MediationAdRequest mediationAdRequest, Object obj) {
        if (this.interstitialAd == null && activity != null && !TextUtils.isEmpty(str2)) {
            this.interstitialAd = new InterstitialAd(activity, str2);
            this.mListener = customEventInterstitialListener;
            this.interstitialAd.setAdListener(new InterstitialAdListener() { // from class: com.dancingbogo.skyrolline.ad.interstitial.FBInterstitial.1
                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                }

                @Override // com.facebook.ads.InterstitialAdListener
                public void onInterstitialDisplayed(Ad ad) {
                    if (FBInterstitial.this.mListener != null) {
                        FBInterstitial.this.mListener.onPresentScreen();
                    }
                    new d().a(1, 4, 0, 105, 99);
                }

                @Override // com.facebook.ads.InterstitialAdListener
                public void onInterstitialDismissed(Ad ad) {
                    if (FBInterstitial.this.mListener != null) {
                        FBInterstitial.this.mListener.onDismissScreen();
                    }
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    if (FBInterstitial.this.mListener != null) {
                        FBInterstitial.this.mListener.onFailedToReceiveAd();
                    }
                    new d().a(1, 3, adError.getErrorCode(), 105, 99);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    if (FBInterstitial.this.mListener != null) {
                        FBInterstitial.this.mListener.onReceivedAd();
                    }
                    new d().a(1, 2, 0, 105, 99);
                }
            });
        }
        if (this.interstitialAd != null) {
            this.interstitialAd.loadAd();
        }
        new d().a(1, 1, 0, 105, 99);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        if (this.interstitialAd != null) {
            this.interstitialAd.show();
        }
    }

    @Override // com.google.ads.mediation.customevent.CustomEvent
    public void destroy() {
        if (this.interstitialAd != null) {
            this.interstitialAd.destroy();
        }
    }
}
