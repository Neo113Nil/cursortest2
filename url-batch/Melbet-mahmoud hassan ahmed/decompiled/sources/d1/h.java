package d1;

import o2.a0;
import o2.m0;
import o2.r;
import t0.e0;
import w0.b0;
import w0.c0;

/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f15543a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15544b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15545c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15546d;

    private h(long[] jArr, long[] jArr2, long j7, long j8) {
        this.f15543a = jArr;
        this.f15544b = jArr2;
        this.f15545c = j7;
        this.f15546d = j8;
    }

    public static h a(long j7, long j8, e0.a aVar, a0 a0Var) {
        int C;
        a0Var.P(10);
        int m7 = a0Var.m();
        if (m7 <= 0) {
            return null;
        }
        int i7 = aVar.f21730d;
        long N0 = m0.N0(m7, 1000000 * (i7 >= 32000 ? 1152 : 576), i7);
        int I = a0Var.I();
        int I2 = a0Var.I();
        int I3 = a0Var.I();
        a0Var.P(2);
        long j9 = j8 + aVar.f21729c;
        long[] jArr = new long[I];
        long[] jArr2 = new long[I];
        int i8 = 0;
        long j10 = j8;
        while (i8 < I) {
            int i9 = I2;
            long j11 = j9;
            jArr[i8] = (i8 * N0) / I;
            jArr2[i8] = Math.max(j10, j11);
            if (I3 == 1) {
                C = a0Var.C();
            } else if (I3 == 2) {
                C = a0Var.I();
            } else if (I3 == 3) {
                C = a0Var.F();
            } else {
                if (I3 != 4) {
                    return null;
                }
                C = a0Var.G();
            }
            j10 += C * i9;
            i8++;
            jArr = jArr;
            I2 = i9;
            j9 = j11;
        }
        long[] jArr3 = jArr;
        if (j7 != -1 && j7 != j10) {
            r.i("VbriSeeker", "VBRI data size mismatch: " + j7 + ", " + j10);
        }
        return new h(jArr3, jArr2, N0, j10);
    }

    @Override // d1.g
    public long c(long j7) {
        return this.f15543a[m0.i(this.f15544b, j7, true, true)];
    }

    @Override // d1.g
    public long f() {
        return this.f15546d;
    }

    @Override // w0.b0
    public boolean g() {
        return true;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        int i7 = m0.i(this.f15543a, j7, true, true);
        c0 c0Var = new c0(this.f15543a[i7], this.f15544b[i7]);
        if (c0Var.f22879a >= j7 || i7 == this.f15543a.length - 1) {
            return new b0.a(c0Var);
        }
        int i8 = i7 + 1;
        return new b0.a(c0Var, new c0(this.f15543a[i8], this.f15544b[i8]));
    }

    @Override // w0.b0
    public long j() {
        return this.f15545c;
    }
}
