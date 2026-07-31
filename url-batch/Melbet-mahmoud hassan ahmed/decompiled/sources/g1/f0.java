package g1;

import o2.m0;

/* loaded from: classes.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16293a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16296d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16297e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16298f;

    /* renamed from: b, reason: collision with root package name */
    private final o2.i0 f16294b = new o2.i0(0);

    /* renamed from: g, reason: collision with root package name */
    private long f16299g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f16300h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f16301i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final o2.a0 f16295c = new o2.a0();

    f0(int i7) {
        this.f16293a = i7;
    }

    private int a(w0.m mVar) {
        this.f16295c.L(m0.f19757f);
        this.f16296d = true;
        mVar.h();
        return 0;
    }

    private int f(w0.m mVar, w0.a0 a0Var, int i7) {
        int min = (int) Math.min(this.f16293a, mVar.a());
        long j7 = 0;
        if (mVar.p() != j7) {
            a0Var.f22873a = j7;
            return 1;
        }
        this.f16295c.K(min);
        mVar.h();
        mVar.n(this.f16295c.d(), 0, min);
        this.f16299g = g(this.f16295c, i7);
        this.f16297e = true;
        return 0;
    }

    private long g(o2.a0 a0Var, int i7) {
        int f7 = a0Var.f();
        for (int e7 = a0Var.e(); e7 < f7; e7++) {
            if (a0Var.d()[e7] == 71) {
                long c7 = j0.c(a0Var, e7, i7);
                if (c7 != -9223372036854775807L) {
                    return c7;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(w0.m mVar, w0.a0 a0Var, int i7) {
        long a7 = mVar.a();
        int min = (int) Math.min(this.f16293a, a7);
        long j7 = a7 - min;
        if (mVar.p() != j7) {
            a0Var.f22873a = j7;
            return 1;
        }
        this.f16295c.K(min);
        mVar.h();
        mVar.n(this.f16295c.d(), 0, min);
        this.f16300h = i(this.f16295c, i7);
        this.f16298f = true;
        return 0;
    }

    private long i(o2.a0 a0Var, int i7) {
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        for (int i8 = f7 - 188; i8 >= e7; i8--) {
            if (j0.b(a0Var.d(), e7, f7, i8)) {
                long c7 = j0.c(a0Var, i8, i7);
                if (c7 != -9223372036854775807L) {
                    return c7;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f16301i;
    }

    public o2.i0 c() {
        return this.f16294b;
    }

    public boolean d() {
        return this.f16296d;
    }

    public int e(w0.m mVar, w0.a0 a0Var, int i7) {
        if (i7 <= 0) {
            return a(mVar);
        }
        if (!this.f16298f) {
            return h(mVar, a0Var, i7);
        }
        if (this.f16300h == -9223372036854775807L) {
            return a(mVar);
        }
        if (!this.f16297e) {
            return f(mVar, a0Var, i7);
        }
        long j7 = this.f16299g;
        if (j7 == -9223372036854775807L) {
            return a(mVar);
        }
        long b7 = this.f16294b.b(this.f16300h) - this.f16294b.b(j7);
        this.f16301i = b7;
        if (b7 < 0) {
            o2.r.i("TsDurationReader", "Invalid duration: " + this.f16301i + ". Using TIME_UNSET instead.");
            this.f16301i = -9223372036854775807L;
        }
        return a(mVar);
    }
}
