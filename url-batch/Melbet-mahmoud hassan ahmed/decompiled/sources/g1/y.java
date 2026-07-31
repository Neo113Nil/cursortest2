package g1;

import o2.m0;

/* loaded from: classes.dex */
final class y {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16586c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16587d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16588e;

    /* renamed from: a, reason: collision with root package name */
    private final o2.i0 f16584a = new o2.i0(0);

    /* renamed from: f, reason: collision with root package name */
    private long f16589f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f16590g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f16591h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16585b = new o2.a0();

    y() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(w0.m mVar) {
        this.f16585b.L(m0.f19757f);
        this.f16586c = true;
        mVar.h();
        return 0;
    }

    private int f(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    private int h(w0.m mVar, w0.a0 a0Var) {
        int min = (int) Math.min(20000L, mVar.a());
        long j7 = 0;
        if (mVar.p() != j7) {
            a0Var.f22873a = j7;
            return 1;
        }
        this.f16585b.K(min);
        mVar.h();
        mVar.n(this.f16585b.d(), 0, min);
        this.f16589f = i(this.f16585b);
        this.f16587d = true;
        return 0;
    }

    private long i(o2.a0 a0Var) {
        int f7 = a0Var.f();
        for (int e7 = a0Var.e(); e7 < f7 - 3; e7++) {
            if (f(a0Var.d(), e7) == 442) {
                a0Var.O(e7 + 4);
                long l7 = l(a0Var);
                if (l7 != -9223372036854775807L) {
                    return l7;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(w0.m mVar, w0.a0 a0Var) {
        long a7 = mVar.a();
        int min = (int) Math.min(20000L, a7);
        long j7 = a7 - min;
        if (mVar.p() != j7) {
            a0Var.f22873a = j7;
            return 1;
        }
        this.f16585b.K(min);
        mVar.h();
        mVar.n(this.f16585b.d(), 0, min);
        this.f16590g = k(this.f16585b);
        this.f16588e = true;
        return 0;
    }

    private long k(o2.a0 a0Var) {
        int e7 = a0Var.e();
        for (int f7 = a0Var.f() - 4; f7 >= e7; f7--) {
            if (f(a0Var.d(), f7) == 442) {
                a0Var.O(f7 + 4);
                long l7 = l(a0Var);
                if (l7 != -9223372036854775807L) {
                    return l7;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(o2.a0 a0Var) {
        int e7 = a0Var.e();
        if (a0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.j(bArr, 0, 9);
        a0Var.O(e7);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.f16591h;
    }

    public o2.i0 d() {
        return this.f16584a;
    }

    public boolean e() {
        return this.f16586c;
    }

    public int g(w0.m mVar, w0.a0 a0Var) {
        if (!this.f16588e) {
            return j(mVar, a0Var);
        }
        if (this.f16590g == -9223372036854775807L) {
            return b(mVar);
        }
        if (!this.f16587d) {
            return h(mVar, a0Var);
        }
        long j7 = this.f16589f;
        if (j7 == -9223372036854775807L) {
            return b(mVar);
        }
        long b7 = this.f16584a.b(this.f16590g) - this.f16584a.b(j7);
        this.f16591h = b7;
        if (b7 < 0) {
            o2.r.i("PsDurationReader", "Invalid duration: " + this.f16591h + ". Using TIME_UNSET instead.");
            this.f16591h = -9223372036854775807L;
        }
        return b(mVar);
    }
}
