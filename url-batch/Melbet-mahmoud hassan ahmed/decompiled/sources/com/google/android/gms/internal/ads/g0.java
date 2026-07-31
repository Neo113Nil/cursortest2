package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class g0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f5399a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f5400b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5401c;

    private g0(long[] jArr, long[] jArr2, long j7) {
        this.f5399a = jArr;
        this.f5400b = jArr2;
        this.f5401c = j7 == -9223372036854775807L ? nz3.c(jArr2[jArr2.length - 1]) : j7;
    }

    public static g0 c(long j7, ag4 ag4Var, long j8) {
        int length = ag4Var.f2765j.length;
        int i7 = length + 1;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        jArr[0] = j7;
        long j9 = 0;
        jArr2[0] = 0;
        for (int i8 = 1; i8 <= length; i8++) {
            int i9 = i8 - 1;
            j7 += ag4Var.f2763h + ag4Var.f2765j[i9];
            j9 += ag4Var.f2764i + ag4Var.f2766k[i9];
            jArr[i8] = j7;
            jArr2[i8] = j9;
        }
        return new g0(jArr, jArr2, j8);
    }

    private static Pair<Long, Long> e(long j7, long[] jArr, long[] jArr2) {
        double d7;
        Long valueOf;
        Long valueOf2;
        int J = n13.J(jArr, j7, true, true);
        long j8 = jArr[J];
        long j9 = jArr2[J];
        int i7 = J + 1;
        if (i7 == jArr.length) {
            valueOf = Long.valueOf(j8);
            valueOf2 = Long.valueOf(j9);
        } else {
            long j10 = jArr[i7];
            long j11 = jArr2[i7];
            if (j10 == j8) {
                d7 = 0.0d;
            } else {
                double d8 = j7;
                double d9 = j8;
                Double.isNaN(d8);
                Double.isNaN(d9);
                double d10 = j10 - j8;
                Double.isNaN(d10);
                d7 = (d8 - d9) / d10;
            }
            valueOf = Long.valueOf(j7);
            double d11 = j11 - j9;
            Double.isNaN(d11);
            valueOf2 = Long.valueOf(((long) (d7 * d11)) + j9);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final long a() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f5401c;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        Pair<Long, Long> e7 = e(nz3.d(n13.U(j7, 0L, this.f5401c)), this.f5400b, this.f5399a);
        qd4 qd4Var = new qd4(nz3.c(((Long) e7.first).longValue()), ((Long) e7.second).longValue());
        return new nd4(qd4Var, qd4Var);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final long i(long j7) {
        return nz3.c(((Long) e(j7, this.f5399a, this.f5400b).second).longValue());
    }
}
