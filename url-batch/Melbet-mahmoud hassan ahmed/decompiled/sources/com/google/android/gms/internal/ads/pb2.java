package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class pb2 extends ix {

    /* renamed from: f, reason: collision with root package name */
    private final Context f10164f;

    /* renamed from: g, reason: collision with root package name */
    private final bw0 f10165g;

    /* renamed from: h, reason: collision with root package name */
    final is2 f10166h;

    /* renamed from: i, reason: collision with root package name */
    final an1 f10167i;

    /* renamed from: j, reason: collision with root package name */
    private zw f10168j;

    public pb2(bw0 bw0Var, Context context, String str) {
        is2 is2Var = new is2();
        this.f10166h = is2Var;
        this.f10167i = new an1();
        this.f10165g = bw0Var;
        is2Var.H(str);
        this.f10164f = context;
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void C4(u2.a aVar) {
        this.f10166h.F(aVar);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void D5(zw zwVar) {
        this.f10168j = zwVar;
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void F5(yx yxVar) {
        this.f10166h.o(yxVar);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void V4(y50 y50Var) {
        this.f10167i.f(y50Var);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void X5(u2.g gVar) {
        this.f10166h.c(gVar);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void a5(l50 l50Var) {
        this.f10167i.b(l50Var);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final gx b() {
        cn1 g7 = this.f10167i.g();
        this.f10166h.a(g7.i());
        this.f10166h.b(g7.h());
        is2 is2Var = this.f10166h;
        if (is2Var.v() == null) {
            is2Var.G(pv.h());
        }
        return new qb2(this.f10164f, this.f10165g, this.f10166h, g7, this.f10168j);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void d2(r90 r90Var) {
        this.f10166h.K(r90Var);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void e6(i50 i50Var) {
        this.f10167i.a(i50Var);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void g4(String str, r50 r50Var, o50 o50Var) {
        this.f10167i.c(str, r50Var, o50Var);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void i1(v50 v50Var, pv pvVar) {
        this.f10167i.e(v50Var);
        this.f10166h.G(pvVar);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void u4(b40 b40Var) {
        this.f10166h.O(b40Var);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void w3(ba0 ba0Var) {
        this.f10167i.d(ba0Var);
    }
}
