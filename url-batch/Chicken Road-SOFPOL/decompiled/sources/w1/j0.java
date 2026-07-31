package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f7686a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7687b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7688c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7692g;

    /* renamed from: h, reason: collision with root package name */
    public int f7693h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7694j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7695k;

    /* renamed from: l, reason: collision with root package name */
    public int f7696l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7697m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7698n;

    /* renamed from: o, reason: collision with root package name */
    public int f7699o;

    /* renamed from: q, reason: collision with root package name */
    public s0 f7701q;

    /* renamed from: d, reason: collision with root package name */
    public b0 f7689d = b0.f7594h;

    /* renamed from: p, reason: collision with root package name */
    public final w0 f7700p = new w0(this);

    public j0(f0 f0Var) {
        this.f7686a = f0Var;
    }

    public final d1 a() {
        return this.f7686a.F.f7598d;
    }

    public final void b() {
        b0 b0Var = this.f7686a.G.f7689d;
        b0 b0Var2 = b0.f7592f;
        b0 b0Var3 = b0.f7593g;
        if (b0Var == b0Var2 || b0Var == b0Var3) {
            if (this.f7700p.C) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b0Var == b0Var3) {
            s0 s0Var = this.f7701q;
            if (s0Var == null || !s0Var.f7775w) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j7) {
        s0 s0Var = this.f7701q;
        if (s0Var != null) {
            j0 j0Var = s0Var.i;
            j0Var.f7689d = b0.f7591e;
            w0 w0Var = j0Var.f7700p;
            f0 f0Var = j0Var.f7686a;
            j0Var.f7690e = false;
            m1 snapshotObserver = ((x1.t) i0.a(f0Var)).getSnapshotObserver();
            q0 q0Var = new q0(s0Var, j7);
            snapshotObserver.getClass();
            if (f0Var.f7644j != null) {
                snapshotObserver.a(f0Var, snapshotObserver.f7719b, q0Var);
            } else {
                snapshotObserver.a(f0Var, snapshotObserver.f7720c, q0Var);
            }
            j0Var.f7691f = true;
            j0Var.f7692g = true;
            if (f.q(f0Var)) {
                w0Var.f7814x = true;
                w0Var.f7815y = true;
            } else {
                w0Var.f7813w = true;
            }
            j0Var.f7689d = b0.f7594h;
        }
    }

    public final void d(int i) {
        int i8 = this.f7696l;
        this.f7696l = i;
        if ((i8 == 0) != (i == 0)) {
            f0 s5 = this.f7686a.s();
            j0 j0Var = s5 != null ? s5.G : null;
            if (j0Var != null) {
                if (i == 0) {
                    j0Var.d(j0Var.f7696l - 1);
                } else {
                    j0Var.d(j0Var.f7696l + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i8 = this.f7699o;
        this.f7699o = i;
        if ((i8 == 0) != (i == 0)) {
            f0 s5 = this.f7686a.s();
            j0 j0Var = s5 != null ? s5.G : null;
            if (j0Var != null) {
                if (i == 0) {
                    j0Var.e(j0Var.f7699o - 1);
                } else {
                    j0Var.e(j0Var.f7699o + 1);
                }
            }
        }
    }

    public final void f(boolean z3) {
        if (this.f7695k != z3) {
            this.f7695k = z3;
            if (z3 && !this.f7694j) {
                d(this.f7696l + 1);
            } else {
                if (z3 || this.f7694j) {
                    return;
                }
                d(this.f7696l - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.f7694j != z3) {
            this.f7694j = z3;
            if (z3 && !this.f7695k) {
                d(this.f7696l + 1);
            } else {
                if (z3 || this.f7695k) {
                    return;
                }
                d(this.f7696l - 1);
            }
        }
    }

    public final void h(boolean z3) {
        if (this.f7698n != z3) {
            this.f7698n = z3;
            if (z3 && !this.f7697m) {
                e(this.f7699o + 1);
            } else {
                if (z3 || this.f7697m) {
                    return;
                }
                e(this.f7699o - 1);
            }
        }
    }

    public final void i(boolean z3) {
        if (this.f7697m != z3) {
            this.f7697m = z3;
            if (z3 && !this.f7698n) {
                e(this.f7699o + 1);
            } else {
                if (z3 || this.f7698n) {
                    return;
                }
                e(this.f7699o - 1);
            }
        }
    }

    public final void j() {
        w0 w0Var = this.f7700p;
        j0 j0Var = w0Var.i;
        Object obj = w0Var.f7810t;
        f0 f0Var = this.f7686a;
        if ((obj != null || j0Var.a().g() != null) && w0Var.f7809s) {
            w0Var.f7809s = false;
            w0Var.f7810t = j0Var.a().g();
            f0 s5 = f0Var.s();
            if (s5 != null) {
                f0.U(s5, false, 7);
            }
        }
        s0 s0Var = this.f7701q;
        if (s0Var != null) {
            j0 j0Var2 = s0Var.i;
            if (s0Var.f7777y == null) {
                o0 C0 = j0Var2.a().C0();
                q6.i.b(C0);
                if (C0.f7737r.g() == null) {
                    return;
                }
            }
            if (s0Var.f7776x) {
                s0Var.f7776x = false;
                o0 C02 = j0Var2.a().C0();
                q6.i.b(C02);
                s0Var.f7777y = C02.f7737r.g();
                if (f.q(f0Var)) {
                    f0 s7 = f0Var.s();
                    if (s7 != null) {
                        f0.U(s7, false, 7);
                        return;
                    }
                    return;
                }
                f0 s8 = f0Var.s();
                if (s8 != null) {
                    f0.S(s8, false, 7);
                }
            }
        }
    }
}
