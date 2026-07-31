package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class ic4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    private final long f6607a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6608b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6609c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6610d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6611e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6612f;

    public ic4(long j7, long j8, int i7, int i8, boolean z6) {
        long e7;
        this.f6607a = j7;
        this.f6608b = j8;
        this.f6609c = i8 == -1 ? 1 : i8;
        this.f6611e = i7;
        if (j7 == -1) {
            this.f6610d = -1L;
            e7 = -9223372036854775807L;
        } else {
            this.f6610d = j7 - j8;
            e7 = e(j7, j8, i7);
        }
        this.f6612f = e7;
    }

    private static long e(long j7, long j8, int i7) {
        return (Math.max(0L, j7 - j8) * 8000000) / i7;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f6612f;
    }

    public final long c(long j7) {
        return e(j7, this.f6608b, this.f6611e);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        long j8 = this.f6610d;
        if (j8 == -1) {
            qd4 qd4Var = new qd4(0L, this.f6608b);
            return new nd4(qd4Var, qd4Var);
        }
        int i7 = this.f6611e;
        long j9 = this.f6609c;
        long j10 = (((i7 * j7) / 8000000) / j9) * j9;
        if (j8 != -1) {
            j10 = Math.min(j10, j8 - j9);
        }
        long max = this.f6608b + Math.max(j10, 0L);
        long c7 = c(max);
        qd4 qd4Var2 = new qd4(c7, max);
        if (this.f6610d != -1 && c7 < j7) {
            long j11 = max + this.f6609c;
            if (j11 < this.f6607a) {
                return new nd4(qd4Var2, new qd4(c(j11), j11));
            }
        }
        return new nd4(qd4Var2, qd4Var2);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return this.f6610d != -1;
    }
}
