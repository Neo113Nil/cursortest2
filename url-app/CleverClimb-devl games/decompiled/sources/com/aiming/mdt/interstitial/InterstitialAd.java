package com.aiming.mdt.interstitial;

import android.app.Activity;
import com.aiming.mdt.a.C0089;
import com.aiming.mdt.a.C0111;

/* loaded from: classes.dex */
public class InterstitialAd {
    private C0089 mInterstitial;

    public InterstitialAd(Activity activity, String str, InterstitialAdListener interstitialAdListener) {
        this.mInterstitial = C0111.m419().m423(activity, str, interstitialAdListener);
        this.mInterstitial.m321(interstitialAdListener);
    }

    public void destroy() {
        this.mInterstitial.mo73();
    }

    public boolean isReady() {
        return this.mInterstitial.mo71();
    }

    public void loadAd() {
        this.mInterstitial.m898();
    }

    public void showAd() {
        this.mInterstitial.m320();
    }
}
