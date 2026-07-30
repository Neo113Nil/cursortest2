package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4081vo implements InterfaceC3919so {

    /* renamed from: a, reason: collision with root package name */
    public final long f34862a;

    /* renamed from: b, reason: collision with root package name */
    public final Ir f34863b;

    public C4081vo(long j9, Context context, C3562m7 c3562m7, C3214fi c3214fi, String str) {
        this.f34862a = j9;
        C3214fi c3214fi2 = c3214fi.f30795b;
        q2.g1 g1Var = new q2.g1();
        str.getClass();
        Ir ir = (Ir) ((C4009uN) new C3562m7(c3214fi2, context, str, g1Var).f32668u).d();
        this.f34863b = ir;
        ir.r0(new BinderC4027uo(this, c3562m7));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3919so
    public final void a(q2.d1 d1Var) {
        this.f34863b.f0(d1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3919so
    public final void d() {
        this.f34863b.T2(new V2.b(null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3919so
    public final void i() {
        this.f34863b.x();
    }
}
