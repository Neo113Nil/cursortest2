package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class te4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pd4 f12189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ue4 f12190b;

    te4(ue4 ue4Var, pd4 pd4Var) {
        this.f12190b = ue4Var;
        this.f12189a = pd4Var;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f12189a.b();
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        long j8;
        long j9;
        nd4 d7 = this.f12189a.d(j7);
        qd4 qd4Var = d7.f9056a;
        long j10 = qd4Var.f10661a;
        long j11 = qd4Var.f10662b;
        j8 = this.f12190b.f12768f;
        qd4 qd4Var2 = new qd4(j10, j11 + j8);
        qd4 qd4Var3 = d7.f9057b;
        long j12 = qd4Var3.f10661a;
        long j13 = qd4Var3.f10662b;
        j9 = this.f12190b.f12768f;
        return new nd4(qd4Var2, new qd4(j12, j13 + j9));
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return this.f12189a.f();
    }
}
