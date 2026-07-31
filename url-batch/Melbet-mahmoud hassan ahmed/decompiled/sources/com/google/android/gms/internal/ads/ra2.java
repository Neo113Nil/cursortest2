package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class ra2 implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp0 f11090a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ds2 f11091b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ rr2 f11092c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ xa2 f11093d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ sa2 f11094e;

    ra2(sa2 sa2Var, bp0 bp0Var, ds2 ds2Var, rr2 rr2Var, xa2 xa2Var) {
        this.f11094e = sa2Var;
        this.f11090a = bp0Var;
        this.f11091b = ds2Var;
        this.f11092c = rr2Var;
        this.f11093d = xa2Var;
    }

    @Override // y2.f
    public final void a() {
    }

    @Override // y2.f
    public final void b(View view) {
        bb2 bb2Var;
        bp0 bp0Var = this.f11090a;
        bb2Var = this.f11094e.f11748d;
        bp0Var.e(bb2Var.a(this.f11091b, this.f11092c, view, this.f11093d));
    }

    @Override // y2.f
    public final void c() {
    }
}
