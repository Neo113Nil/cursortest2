package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class n0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f8839a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8840b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8841c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8842d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8843e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f8844f;

    private n0(long j7, int i7, long j8, long j9, long[] jArr) {
        this.f8839a = j7;
        this.f8840b = i7;
        this.f8841c = j8;
        this.f8844f = jArr;
        this.f8842d = j9;
        this.f8843e = j9 != -1 ? j7 + j9 : -1L;
    }

    public static n0 c(long j7, long j8, jd4 jd4Var, dr2 dr2Var) {
        int v6;
        int i7 = jd4Var.f7101g;
        int i8 = jd4Var.f7098d;
        int m7 = dr2Var.m();
        if ((m7 & 1) != 1 || (v6 = dr2Var.v()) == 0) {
            return null;
        }
        long Z = n13.Z(v6, i7 * 1000000, i8);
        if ((m7 & 6) != 6) {
            return new n0(j8, jd4Var.f7097c, Z, -1L, null);
        }
        long A = dr2Var.A();
        long[] jArr = new long[100];
        for (int i9 = 0; i9 < 100; i9++) {
            jArr[i9] = dr2Var.s();
        }
        if (j7 != -1) {
            long j9 = j8 + A;
            if (j7 != j9) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j7);
                sb.append(", ");
                sb.append(j9);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new n0(j8, jd4Var.f7097c, Z, A, jArr);
    }

    private final long e(int i7) {
        return (this.f8841c * i7) / 100;
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final long a() {
        return this.f8843e;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f8841c;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        if (!f()) {
            qd4 qd4Var = new qd4(0L, this.f8839a + this.f8840b);
            return new nd4(qd4Var, qd4Var);
        }
        long U = n13.U(j7, 0L, this.f8841c);
        double d7 = U;
        Double.isNaN(d7);
        double d8 = this.f8841c;
        Double.isNaN(d8);
        double d9 = (d7 * 100.0d) / d8;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i7 = (int) d9;
                double d11 = ((long[]) wu1.b(this.f8844f))[i7];
                double d12 = i7 == 99 ? 256.0d : r3[i7 + 1];
                double d13 = i7;
                Double.isNaN(d13);
                Double.isNaN(d11);
                Double.isNaN(d11);
                d10 = d11 + ((d9 - d13) * (d12 - d11));
            }
        }
        double d14 = this.f8842d;
        Double.isNaN(d14);
        qd4 qd4Var2 = new qd4(U, this.f8839a + n13.U(Math.round((d10 / 256.0d) * d14), this.f8840b, this.f8842d - 1));
        return new nd4(qd4Var2, qd4Var2);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return this.f8844f != null;
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final long i(long j7) {
        double d7;
        long j8 = j7 - this.f8839a;
        if (!f() || j8 <= this.f8840b) {
            return 0L;
        }
        long[] jArr = (long[]) wu1.b(this.f8844f);
        double d8 = j8;
        Double.isNaN(d8);
        double d9 = this.f8842d;
        Double.isNaN(d9);
        double d10 = (d8 * 256.0d) / d9;
        int J = n13.J(jArr, (long) d10, true, true);
        long e7 = e(J);
        long j9 = jArr[J];
        int i7 = J + 1;
        long e8 = e(i7);
        long j10 = J == 99 ? 256L : jArr[i7];
        if (j9 == j10) {
            d7 = 0.0d;
        } else {
            double d11 = j9;
            Double.isNaN(d11);
            double d12 = j10 - j9;
            Double.isNaN(d12);
            d7 = (d10 - d11) / d12;
        }
        double d13 = e8 - e7;
        Double.isNaN(d13);
        return e7 + Math.round(d7 * d13);
    }
}
