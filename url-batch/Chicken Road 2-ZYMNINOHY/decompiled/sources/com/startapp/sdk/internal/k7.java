package com.startapp.sdk.internal;

import android.view.View;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

/* loaded from: classes.dex */
public final class k7 extends AdManagerInterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n7 f7180a;

    public k7(n7 n7Var) {
        this.f7180a = n7Var;
    }

    public final void onAdFailedToLoad(LoadAdError adError) {
        kotlin.jvm.internal.i.e(adError, "adError");
        n7 n7Var = this.f7180a;
        n7Var.f7322d = null;
        n7Var.f7323e = null;
        com.startapp.sdk.adsbase.l lVar = n7Var.f7321c;
        if (lVar != null) {
            lVar.a(adError.toString());
        }
    }

    public final void onAdLoaded(Object obj) {
        AdManagerInterstitialAd interstitialAd = (AdManagerInterstitialAd) obj;
        kotlin.jvm.internal.i.e(interstitialAd, "interstitialAd");
        n7 n7Var = this.f7180a;
        n7Var.f7323e = null;
        n7Var.f7322d = interstitialAd;
        com.startapp.sdk.adsbase.l lVar = n7Var.f7321c;
        if (lVar != null) {
            lVar.a((View) null);
        }
    }
}
