package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jv1 implements td1, lc1, ya1, xd1 {

    /* renamed from: f, reason: collision with root package name */
    private final sv1 f7257f;

    /* renamed from: g, reason: collision with root package name */
    private final cw1 f7258g;

    public jv1(sv1 sv1Var, cw1 cw1Var) {
        this.f7257f = sv1Var;
        this.f7258g = cw1Var;
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(cv cvVar) {
        this.f7257f.a().put("action", "ftl");
        this.f7257f.a().put("ftl", String.valueOf(cvVar.f3954f));
        this.f7257f.a().put("ed", cvVar.f3956h);
        this.f7258g.b(this.f7257f.a());
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void h(boolean z6) {
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            this.f7257f.a().put("scar", "true");
        }
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        this.f7257f.a().put("action", "loaded");
        this.f7258g.b(this.f7257f.a());
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
        this.f7257f.c(vi0Var.f13401f);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(ds2 ds2Var) {
        this.f7257f.b(ds2Var);
    }
}
