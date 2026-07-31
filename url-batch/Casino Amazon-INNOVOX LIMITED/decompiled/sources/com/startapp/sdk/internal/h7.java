package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h7 extends p1 {
    public final int m;

    public h7(Context context, x0 x0Var, AdPreferences adPreferences, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, pa paVar4, int i) {
        super(context, x0Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, paVar, paVar2, paVar3, paVar4);
        this.m = i;
    }

    @Override // com.startapp.sdk.internal.p1
    public final void a(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        x0 x0Var = (x0) this.b;
        b1 b1Var = new b1();
        a((com.startapp.sdk.adsbase.model.a) b1Var);
        b1Var.t0 = BannerMetaData.c().a().a();
        b1Var.E0 = this.m;
        b1Var.V0 = x0Var.c;
        b1Var.g(this.f132a);
        return b1Var;
    }
}
