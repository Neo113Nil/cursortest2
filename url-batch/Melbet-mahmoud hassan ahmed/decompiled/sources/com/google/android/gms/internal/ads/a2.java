package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2555a;

    /* renamed from: b, reason: collision with root package name */
    public long f2556b;

    /* renamed from: c, reason: collision with root package name */
    public int f2557c;

    /* renamed from: d, reason: collision with root package name */
    public int f2558d;

    /* renamed from: e, reason: collision with root package name */
    public int f2559e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2560f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    private final dr2 f2561g = new dr2(255);

    a2() {
    }

    public final void a() {
        this.f2555a = 0;
        this.f2556b = 0L;
        this.f2557c = 0;
        this.f2558d = 0;
        this.f2559e = 0;
    }

    public final boolean b(pc4 pc4Var, boolean z6) {
        a();
        this.f2561g.c(27);
        if (sc4.c(pc4Var, this.f2561g.h(), 0, 27, z6) && this.f2561g.A() == 1332176723) {
            if (this.f2561g.s() != 0) {
                if (z6) {
                    return false;
                }
                throw dz.c("unsupported bit stream revision");
            }
            this.f2555a = this.f2561g.s();
            this.f2556b = this.f2561g.x();
            this.f2561g.y();
            this.f2561g.y();
            this.f2561g.y();
            int s7 = this.f2561g.s();
            this.f2557c = s7;
            this.f2558d = s7 + 27;
            this.f2561g.c(s7);
            if (sc4.c(pc4Var, this.f2561g.h(), 0, this.f2557c, z6)) {
                for (int i7 = 0; i7 < this.f2557c; i7++) {
                    this.f2560f[i7] = this.f2561g.s();
                    this.f2559e += this.f2560f[i7];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(pc4 pc4Var, long j7) {
        wu1.d(pc4Var.b() == pc4Var.g());
        this.f2561g.c(4);
        while (true) {
            if ((j7 == -1 || pc4Var.b() + 4 < j7) && sc4.c(pc4Var, this.f2561g.h(), 0, 4, true)) {
                this.f2561g.f(0);
                if (this.f2561g.A() == 1332176723) {
                    pc4Var.i();
                    return true;
                }
                ((jc4) pc4Var).p(1, false);
            }
        }
        do {
            if (j7 != -1 && pc4Var.b() >= j7) {
                break;
            }
        } while (pc4Var.F(1) != -1);
        return false;
    }
}
