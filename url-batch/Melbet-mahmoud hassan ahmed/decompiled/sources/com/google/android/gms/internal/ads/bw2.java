package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bw2 implements nb3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rv2 f3555a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dw2 f3556b;

    bw2(dw2 dw2Var, rv2 rv2Var) {
        this.f3556b = dw2Var;
        this.f3555a = rv2Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void a(Object obj) {
        fw2 fw2Var;
        fw2Var = this.f3556b.f4368f.f4793c;
        fw2Var.a0(this.f3555a);
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        fw2 fw2Var;
        fw2Var = this.f3556b.f4368f.f4793c;
        fw2Var.Z(this.f3555a, th);
    }
}
