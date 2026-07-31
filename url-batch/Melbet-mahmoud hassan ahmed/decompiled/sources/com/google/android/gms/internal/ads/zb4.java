package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zb4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    private final cc4 f15066a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15067b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15068c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15069d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15070e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15071f;

    public zb4(cc4 cc4Var, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f15066a = cc4Var;
        this.f15067b = j7;
        this.f15068c = j9;
        this.f15069d = j10;
        this.f15070e = j11;
        this.f15071f = j12;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f15067b;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        qd4 qd4Var = new qd4(j7, bc4.f(this.f15066a.b(j7), 0L, this.f15068c, this.f15069d, this.f15070e, this.f15071f));
        return new nd4(qd4Var, qd4Var);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }

    public final long j(long j7) {
        return this.f15066a.b(j7);
    }
}
