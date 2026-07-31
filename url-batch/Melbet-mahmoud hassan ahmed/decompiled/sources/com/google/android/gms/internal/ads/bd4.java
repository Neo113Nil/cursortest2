package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bd4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    private final dd4 f3358a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3359b;

    public bd4(dd4 dd4Var, long j7) {
        this.f3358a = dd4Var;
        this.f3359b = j7;
    }

    private final qd4 c(long j7, long j8) {
        return new qd4((j7 * 1000000) / this.f3358a.f4175e, this.f3359b + j8);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f3358a.a();
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        wu1.b(this.f3358a.f4181k);
        dd4 dd4Var = this.f3358a;
        cd4 cd4Var = dd4Var.f4181k;
        long[] jArr = cd4Var.f3818a;
        long[] jArr2 = cd4Var.f3819b;
        int J = n13.J(jArr, dd4Var.b(j7), true, false);
        qd4 c7 = c(J == -1 ? 0L : jArr[J], J != -1 ? jArr2[J] : 0L);
        if (c7.f10661a == j7 || J == jArr.length - 1) {
            return new nd4(c7, c7);
        }
        int i7 = J + 1;
        return new nd4(c7, c(jArr[i7], jArr2[i7]));
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }
}
