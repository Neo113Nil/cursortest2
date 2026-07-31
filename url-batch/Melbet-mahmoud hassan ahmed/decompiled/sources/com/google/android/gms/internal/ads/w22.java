package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w22 implements td1, lc1, ya1, xd1 {

    /* renamed from: f, reason: collision with root package name */
    private final ww2 f13673f;

    /* renamed from: g, reason: collision with root package name */
    private final xw2 f13674g;

    /* renamed from: h, reason: collision with root package name */
    private final xn0 f13675h;

    public w22(ww2 ww2Var, xw2 xw2Var, xn0 xn0Var) {
        this.f13673f = ww2Var;
        this.f13674g = xw2Var;
        this.f13675h = xn0Var;
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(cv cvVar) {
        ww2 ww2Var = this.f13673f;
        ww2Var.a("action", "ftl");
        ww2Var.a("ftl", String.valueOf(cvVar.f3954f));
        ww2Var.a("ed", cvVar.f3956h);
        this.f13674g.a(this.f13673f);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void h(boolean z6) {
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            this.f13673f.a("scar", "true");
        }
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        xw2 xw2Var = this.f13674g;
        ww2 ww2Var = this.f13673f;
        ww2Var.a("action", "loaded");
        xw2Var.a(ww2Var);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
        this.f13673f.i(vi0Var.f13401f);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(ds2 ds2Var) {
        this.f13673f.h(ds2Var, this.f13675h);
    }
}
