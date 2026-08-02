package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.startapp.sdk.ads.external.config.AdUnitConfig;

/* loaded from: classes.dex */
public final class n7 implements f7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7319a;

    /* renamed from: b, reason: collision with root package name */
    public final AdUnitConfig f7320b;

    /* renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.adsbase.l f7321c;

    /* renamed from: d, reason: collision with root package name */
    public AdManagerInterstitialAd f7322d;

    /* renamed from: e, reason: collision with root package name */
    public RewardedAd f7323e;

    public n7(Context context, AdUnitConfig config) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(config, "config");
        this.f7319a = context;
        this.f7320b = config;
    }

    public static final void a(n7 this$0, RewardItem it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        com.startapp.sdk.adsbase.l lVar = this$0.f7321c;
        if (lVar != null) {
            lVar.f();
        }
    }

    public final void a(Activity activity) {
        RewardedAd rewardedAd = this.f7323e;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new m7(this));
        }
        RewardedAd rewardedAd2 = this.f7323e;
        if (rewardedAd2 != null) {
            rewardedAd2.show(activity, new G());
        }
    }
}
