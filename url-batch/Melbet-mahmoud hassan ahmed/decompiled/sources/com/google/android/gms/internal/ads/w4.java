package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class w4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    private final t4 f13694a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13695b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13696c;

    /* renamed from: d, reason: collision with root package name */
    private final long f13697d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13698e;

    public w4(t4 t4Var, int i7, long j7, long j8) {
        this.f13694a = t4Var;
        this.f13695b = i7;
        this.f13696c = j7;
        long j9 = (j8 - j7) / t4Var.f12074d;
        this.f13697d = j9;
        this.f13698e = c(j9);
    }

    private final long c(long j7) {
        return n13.Z(j7 * this.f13695b, 1000000L, this.f13694a.f12073c);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f13698e;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        long U = n13.U((this.f13694a.f12073c * j7) / (this.f13695b * 1000000), 0L, this.f13697d - 1);
        long j8 = this.f13696c;
        int i7 = this.f13694a.f12074d;
        long c7 = c(U);
        qd4 qd4Var = new qd4(c7, j8 + (i7 * U));
        if (c7 >= j7 || U == this.f13697d - 1) {
            return new nd4(qd4Var, qd4Var);
        }
        long j9 = U + 1;
        return new nd4(qd4Var, new qd4(c(j9), this.f13696c + (j9 * this.f13694a.f12074d)));
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }
}
