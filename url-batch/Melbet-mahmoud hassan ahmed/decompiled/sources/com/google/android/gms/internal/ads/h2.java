package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class h2 {

    /* renamed from: b, reason: collision with root package name */
    private td4 f5999b;

    /* renamed from: c, reason: collision with root package name */
    private rc4 f6000c;

    /* renamed from: d, reason: collision with root package name */
    private b2 f6001d;

    /* renamed from: e, reason: collision with root package name */
    private long f6002e;

    /* renamed from: f, reason: collision with root package name */
    private long f6003f;

    /* renamed from: g, reason: collision with root package name */
    private long f6004g;

    /* renamed from: h, reason: collision with root package name */
    private int f6005h;

    /* renamed from: i, reason: collision with root package name */
    private int f6006i;

    /* renamed from: k, reason: collision with root package name */
    private long f6008k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6009l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6010m;

    /* renamed from: a, reason: collision with root package name */
    private final z1 f5998a = new z1();

    /* renamed from: j, reason: collision with root package name */
    private d2 f6007j = new d2();

    protected abstract long a(dr2 dr2Var);

    protected void b(boolean z6) {
        int i7;
        if (z6) {
            this.f6007j = new d2();
            this.f6003f = 0L;
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f6005h = i7;
        this.f6002e = -1L;
        this.f6004g = 0L;
    }

    protected abstract boolean c(dr2 dr2Var, long j7, d2 d2Var);

    final int d(pc4 pc4Var, md4 md4Var) {
        wu1.b(this.f5999b);
        int i7 = n13.f8865a;
        int i8 = this.f6005h;
        if (i8 == 0) {
            while (this.f5998a.e(pc4Var)) {
                this.f6008k = pc4Var.b() - this.f6003f;
                if (!c(this.f5998a.a(), this.f6003f, this.f6007j)) {
                    c0 c0Var = this.f6007j.f4046a;
                    this.f6006i = c0Var.f3674z;
                    if (!this.f6010m) {
                        this.f5999b.b(c0Var);
                        this.f6010m = true;
                    }
                    b2 b2Var = this.f6007j.f4047b;
                    if (b2Var != null) {
                        this.f6001d = b2Var;
                    } else if (pc4Var.c() == -1) {
                        this.f6001d = new g2(null);
                    } else {
                        a2 b7 = this.f5998a.b();
                        this.f6001d = new u1(this, this.f6003f, pc4Var.c(), b7.f2558d + b7.f2559e, b7.f2556b, (b7.f2555a & 4) != 0);
                    }
                    this.f6005h = 2;
                    this.f5998a.d();
                    return 0;
                }
                this.f6003f = pc4Var.b();
            }
            this.f6005h = 3;
            return -1;
        }
        if (i8 == 1) {
            ((jc4) pc4Var).p((int) this.f6003f, false);
            this.f6005h = 2;
            return 0;
        }
        if (i8 != 2) {
            return -1;
        }
        long c7 = this.f6001d.c(pc4Var);
        if (c7 >= 0) {
            md4Var.f8503a = c7;
            return 1;
        }
        if (c7 < -1) {
            h(-(c7 + 2));
        }
        if (!this.f6009l) {
            pd4 b8 = this.f6001d.b();
            wu1.b(b8);
            this.f6000c.p(b8);
            this.f6009l = true;
        }
        if (this.f6008k <= 0 && !this.f5998a.e(pc4Var)) {
            this.f6005h = 3;
            return -1;
        }
        this.f6008k = 0L;
        dr2 a7 = this.f5998a.a();
        long a8 = a(a7);
        if (a8 >= 0) {
            long j7 = this.f6004g;
            if (j7 + a8 >= this.f6002e) {
                long e7 = e(j7);
                rd4.b(this.f5999b, a7, a7.l());
                this.f5999b.a(e7, 1, a7.l(), 0, null);
                this.f6002e = -1L;
            }
        }
        this.f6004g += a8;
        return 0;
    }

    protected final long e(long j7) {
        return (j7 * 1000000) / this.f6006i;
    }

    protected final long f(long j7) {
        return (this.f6006i * j7) / 1000000;
    }

    final void g(rc4 rc4Var, td4 td4Var) {
        this.f6000c = rc4Var;
        this.f5999b = td4Var;
        b(true);
    }

    protected void h(long j7) {
        this.f6004g = j7;
    }

    final void i(long j7, long j8) {
        this.f5998a.c();
        if (j7 == 0) {
            b(!this.f6009l);
            return;
        }
        if (this.f6005h != 0) {
            long f7 = f(j8);
            this.f6002e = f7;
            b2 b2Var = this.f6001d;
            int i7 = n13.f8865a;
            b2Var.d(f7);
            this.f6005h = 2;
        }
    }
}
