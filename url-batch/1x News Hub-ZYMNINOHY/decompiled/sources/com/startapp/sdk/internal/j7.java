package com.startapp.sdk.internal;

import android.view.View;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes.dex */
public final class j7 extends RewardedAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n7 f4002a;

    public j7(n7 n7Var) {
        this.f4002a = n7Var;
    }

    public final void onAdFailedToLoad(LoadAdError adError) {
        kotlin.jvm.internal.j.e(adError, "adError");
        n7 n7Var = this.f4002a;
        n7Var.f4191e = null;
        n7Var.f4190d = null;
        com.startapp.sdk.adsbase.l lVar = n7Var.f4189c;
        if (lVar != null) {
            lVar.a(adError.toString());
        }
    }

    public final void onAdLoaded(Object obj) {
        RewardedAd rewardedAd = (RewardedAd) obj;
        kotlin.jvm.internal.j.e(rewardedAd, "rewardedAd");
        n7 n7Var = this.f4002a;
        n7Var.f4190d = null;
        n7Var.f4191e = rewardedAd;
        com.startapp.sdk.adsbase.l lVar = n7Var.f4189c;
        if (lVar != null) {
            lVar.a((View) null);
        }
    }
}
