package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class t1 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u1 f12027a;

    /* synthetic */ t1(u1 u1Var, s1 s1Var) {
        this.f12027a = u1Var;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        h2 h2Var;
        long j7;
        h2Var = this.f12027a.f12553d;
        j7 = this.f12027a.f12555f;
        return h2Var.e(j7);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        h2 h2Var;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        h2Var = this.f12027a.f12553d;
        long f7 = h2Var.f(j7);
        j8 = this.f12027a.f12551b;
        j9 = this.f12027a.f12552c;
        j10 = this.f12027a.f12551b;
        j11 = this.f12027a.f12555f;
        long j14 = (f7 * (j9 - j10)) / j11;
        j12 = this.f12027a.f12551b;
        j13 = this.f12027a.f12552c;
        qd4 qd4Var = new qd4(j7, n13.U((-30000) + j8 + j14, j12, j13 - 1));
        return new nd4(qd4Var, qd4Var);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }
}
