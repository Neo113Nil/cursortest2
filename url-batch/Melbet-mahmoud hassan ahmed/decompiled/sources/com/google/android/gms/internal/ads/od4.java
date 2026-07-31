package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class od4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    private final long f9618a;

    /* renamed from: b, reason: collision with root package name */
    private final nd4 f9619b;

    public od4(long j7, long j8) {
        this.f9618a = j7;
        qd4 qd4Var = j8 == 0 ? qd4.f10660c : new qd4(0L, j8);
        this.f9619b = new nd4(qd4Var, qd4Var);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f9618a;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        return this.f9619b;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return false;
    }
}
