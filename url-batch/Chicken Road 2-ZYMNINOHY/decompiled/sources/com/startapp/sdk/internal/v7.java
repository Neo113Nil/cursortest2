package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class v7 extends t1 {

    /* renamed from: m, reason: collision with root package name */
    public final int f7746m;

    public v7(Context context, a1 a1Var, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, int i4) {
        super(context, a1Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, ibVar, ibVar2, ibVar3, ibVar4);
        this.f7746m = i4;
    }

    @Override // com.startapp.sdk.internal.t1
    public final void a(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        a1 a1Var = (a1) this.f6383b;
        e1 e1Var = new e1();
        a((com.startapp.sdk.adsbase.model.a) e1Var);
        e1Var.f6479t0 = BannerMetaData.c().a().a();
        e1Var.f6457E0 = this.f7746m;
        e1Var.f6828V0 = a1Var.f6637c;
        e1Var.g(this.f6382a);
        return e1Var;
    }
}
