package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class j7 extends o1 {
    public final int q;

    public j7(Context context, l1 l1Var, AdPreferences adPreferences, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, int i) {
        super(context, l1Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, paVar, paVar2, paVar3, paVar4, paVar5, false);
        this.q = i;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        l1 l1Var = (l1) this.b;
        b1 b1Var = new b1();
        a((com.startapp.sdk.adsbase.model.a) b1Var);
        b1Var.L = l1Var.c;
        b1Var.M = l1Var.d;
        b1Var.E0 = this.q;
        b1Var.t0 = BannerMetaData.c().a().f();
        b1Var.V0 = l1Var.s;
        b1Var.W0 = l1Var.t;
        b1Var.g(this.f132a);
        return b1Var;
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        d(z);
    }
}
