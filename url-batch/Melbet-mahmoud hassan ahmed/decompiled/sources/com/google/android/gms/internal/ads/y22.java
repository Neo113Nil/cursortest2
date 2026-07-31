package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y22 implements vh1 {

    /* renamed from: h, reason: collision with root package name */
    private final String f14517h;

    /* renamed from: i, reason: collision with root package name */
    private final xw2 f14518i;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14515f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14516g = false;

    /* renamed from: j, reason: collision with root package name */
    private final a3.t1 f14519j = y2.t.p().h();

    public y22(String str, xw2 xw2Var) {
        this.f14517h = str;
        this.f14518i = xw2Var;
    }

    private final ww2 a(String str) {
        String str2 = this.f14519j.K() ? "" : this.f14517h;
        ww2 b7 = ww2.b(str);
        b7.a("tms", Long.toString(y2.t.a().a(), 10));
        b7.a("tid", str2);
        return b7;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final synchronized void b() {
        if (this.f14515f) {
            return;
        }
        this.f14518i.a(a("init_started"));
        this.f14515f = true;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final synchronized void g() {
        if (this.f14516g) {
            return;
        }
        this.f14518i.a(a("init_finished"));
        this.f14516g = true;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void j0(String str) {
        xw2 xw2Var = this.f14518i;
        ww2 a7 = a("adapter_init_finished");
        a7.a("ancn", str);
        xw2Var.a(a7);
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void s(String str) {
        xw2 xw2Var = this.f14518i;
        ww2 a7 = a("adapter_init_started");
        a7.a("ancn", str);
        xw2Var.a(a7);
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void z(String str, String str2) {
        xw2 xw2Var = this.f14518i;
        ww2 a7 = a("adapter_init_finished");
        a7.a("ancn", str);
        a7.a("rqe", str2);
        xw2Var.a(a7);
    }
}
