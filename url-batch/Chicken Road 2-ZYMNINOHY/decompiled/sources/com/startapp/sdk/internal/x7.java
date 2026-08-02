package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class x7 extends s1 {

    /* renamed from: q, reason: collision with root package name */
    public final int f7859q;

    public x7(Context context, q1 q1Var, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, int i4) {
        super(context, q1Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, false);
        this.f7859q = i4;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        q1 q1Var = (q1) this.f6383b;
        e1 e1Var = new e1();
        a((com.startapp.sdk.adsbase.model.a) e1Var);
        e1Var.L = q1Var.f7259c;
        e1Var.f7897M = q1Var.f7260d;
        e1Var.f6457E0 = this.f7859q;
        e1Var.f6479t0 = BannerMetaData.c().a().f();
        e1Var.f6828V0 = q1Var.f7471s;
        e1Var.f6829W0 = q1Var.f7472t;
        e1Var.g(this.f6382a);
        return e1Var;
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        e(z);
    }
}
