package d1;

import o2.a0;
import o2.m0;
import o2.r;
import t0.e0;
import w0.b0;
import w0.c0;

/* loaded from: classes.dex */
final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f15547a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15548b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15549c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15550d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15551e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f15552f;

    private i(long j7, int i7, long j8) {
        this(j7, i7, j8, -1L, null);
    }

    private i(long j7, int i7, long j8, long j9, long[] jArr) {
        this.f15547a = j7;
        this.f15548b = i7;
        this.f15549c = j8;
        this.f15552f = jArr;
        this.f15550d = j9;
        this.f15551e = j9 != -1 ? j7 + j9 : -1L;
    }

    public static i a(long j7, long j8, e0.a aVar, a0 a0Var) {
        int G;
        int i7 = aVar.f21733g;
        int i8 = aVar.f21730d;
        int m7 = a0Var.m();
        if ((m7 & 1) != 1 || (G = a0Var.G()) == 0) {
            return null;
        }
        long N0 = m0.N0(G, i7 * 1000000, i8);
        if ((m7 & 6) != 6) {
            return new i(j8, aVar.f21729c, N0);
        }
        long E = a0Var.E();
        long[] jArr = new long[100];
        for (int i9 = 0; i9 < 100; i9++) {
            jArr[i9] = a0Var.C();
        }
        if (j7 != -1) {
            long j9 = j8 + E;
            if (j7 != j9) {
                r.i("XingSeeker", "XING data size mismatch: " + j7 + ", " + j9);
            }
        }
        return new i(j8, aVar.f21729c, N0, E, jArr);
    }

    private long b(int i7) {
        return (this.f15549c * i7) / 100;
    }

    @Override // d1.g
    public long c(long j7) {
        double d7;
        long j8 = j7 - this.f15547a;
        if (!g() || j8 <= this.f15548b) {
            return 0L;
        }
        long[] jArr = (long[]) o2.a.h(this.f15552f);
        double d8 = j8;
        Double.isNaN(d8);
        double d9 = this.f15550d;
        Double.isNaN(d9);
        double d10 = (d8 * 256.0d) / d9;
        int i7 = m0.i(jArr, (long) d10, true, true);
        long b7 = b(i7);
        long j9 = jArr[i7];
        int i8 = i7 + 1;
        long b8 = b(i8);
        long j10 = i7 == 99 ? 256L : jArr[i8];
        if (j9 == j10) {
            d7 = 0.0d;
        } else {
            double d11 = j9;
            Double.isNaN(d11);
            double d12 = j10 - j9;
            Double.isNaN(d12);
            d7 = (d10 - d11) / d12;
        }
        double d13 = b8 - b7;
        Double.isNaN(d13);
        return b7 + Math.round(d7 * d13);
    }

    @Override // d1.g
    public long f() {
        return this.f15551e;
    }

    @Override // w0.b0
    public boolean g() {
        return this.f15552f != null;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        if (!g()) {
            return new b0.a(new c0(0L, this.f15547a + this.f15548b));
        }
        long r7 = m0.r(j7, 0L, this.f15549c);
        double d7 = r7;
        Double.isNaN(d7);
        double d8 = this.f15549c;
        Double.isNaN(d8);
        double d9 = (d7 * 100.0d) / d8;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i7 = (int) d9;
                double d11 = ((long[]) o2.a.h(this.f15552f))[i7];
                double d12 = i7 == 99 ? 256.0d : r3[i7 + 1];
                double d13 = i7;
                Double.isNaN(d13);
                Double.isNaN(d11);
                Double.isNaN(d11);
                d10 = d11 + ((d9 - d13) * (d12 - d11));
            }
        }
        double d14 = this.f15550d;
        Double.isNaN(d14);
        return new b0.a(new c0(r7, this.f15547a + m0.r(Math.round((d10 / 256.0d) * d14), this.f15548b, this.f15550d - 1)));
    }

    @Override // w0.b0
    public long j() {
        return this.f15549c;
    }
}
