package c2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f1593a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1595c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1597e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1598f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f1599h;

    /* renamed from: i, reason: collision with root package name */
    public int f1600i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1601k;

    /* renamed from: l, reason: collision with root package name */
    public int f1602l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1603m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1604n;

    /* renamed from: o, reason: collision with root package name */
    public int f1605o;

    /* renamed from: q, reason: collision with root package name */
    public s0 f1607q;

    /* renamed from: d, reason: collision with root package name */
    public c0 f1596d = c0.f1509s;

    /* renamed from: p, reason: collision with root package name */
    public final w0 f1606p = new w0(this);

    public k0(g0 g0Var) {
        this.f1593a = g0Var;
    }

    public final i1 a() {
        return (i1) this.f1593a.S.f1494e;
    }

    public final void b() {
        c0 c0Var = this.f1593a.T.f1596d;
        if (c0Var == c0.f1507i || c0Var == c0.f1508r) {
            if (this.f1606p.N) {
                g(true);
            } else {
                f(true);
            }
        }
        if (c0Var == c0.f1508r) {
            s0 s0Var = this.f1607q;
            if (s0Var == null || !s0Var.H) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        s0 s0Var = this.f1607q;
        if (s0Var != null) {
            c0 c0Var = c0.f1506e;
            k0 k0Var = s0Var.f1661t;
            k0Var.f1596d = c0Var;
            g0 g0Var = k0Var.f1593a;
            k0Var.f1597e = false;
            s0Var.L = j;
            q1 snapshotObserver = j0.a(g0Var).getSnapshotObserver();
            r0 r0Var = s0Var.M;
            snapshotObserver.f1645a.c(g0Var, snapshotObserver.f1646b, r0Var);
            k0Var.f1598f = true;
            k0Var.g = true;
            boolean q3 = k.q(g0Var);
            w0 w0Var = k0Var.f1606p;
            if (q3) {
                w0Var.I = true;
                w0Var.J = true;
            } else {
                w0Var.H = true;
            }
            k0Var.f1596d = c0.f1509s;
        }
    }

    public final void d(int i3) {
        int i10 = this.f1602l;
        this.f1602l = i3;
        if ((i10 == 0) != (i3 == 0)) {
            g0 s3 = this.f1593a.s();
            k0 k0Var = s3 != null ? s3.T : null;
            if (k0Var != null) {
                int i11 = k0Var.f1602l;
                if (i3 == 0) {
                    k0Var.d(i11 - 1);
                } else {
                    k0Var.d(i11 + 1);
                }
            }
        }
    }

    public final void e(int i3) {
        int i10 = this.f1605o;
        this.f1605o = i3;
        if ((i10 == 0) != (i3 == 0)) {
            g0 s3 = this.f1593a.s();
            k0 k0Var = s3 != null ? s3.T : null;
            if (k0Var != null) {
                int i11 = k0Var.f1605o;
                if (i3 == 0) {
                    k0Var.e(i11 - 1);
                } else {
                    k0Var.e(i11 + 1);
                }
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f1601k != z10) {
            this.f1601k = z10;
            if (z10 && !this.j) {
                d(this.f1602l + 1);
            } else {
                if (z10 || this.j) {
                    return;
                }
                d(this.f1602l - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.j != z10) {
            this.j = z10;
            if (z10 && !this.f1601k) {
                d(this.f1602l + 1);
            } else {
                if (z10 || this.f1601k) {
                    return;
                }
                d(this.f1602l - 1);
            }
        }
    }

    public final void h(boolean z10) {
        if (this.f1604n != z10) {
            this.f1604n = z10;
            if (z10 && !this.f1603m) {
                e(this.f1605o + 1);
            } else {
                if (z10 || this.f1603m) {
                    return;
                }
                e(this.f1605o - 1);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f1603m != z10) {
            this.f1603m = z10;
            if (z10 && !this.f1604n) {
                e(this.f1605o + 1);
            } else {
                if (z10 || this.f1604n) {
                    return;
                }
                e(this.f1605o - 1);
            }
        }
    }

    public final void j() {
        w0 w0Var = this.f1606p;
        k0 k0Var = w0Var.f1687t;
        Object obj = w0Var.E;
        g0 g0Var = this.f1593a;
        if ((obj != null || k0Var.a().h() != null) && w0Var.D) {
            w0Var.D = false;
            w0Var.E = k0Var.a().h();
            g0 s3 = g0Var.s();
            if (s3 != null) {
                g0.R(s3, false, 7);
            }
        }
        s0 s0Var = this.f1607q;
        if (s0Var != null) {
            k0 k0Var2 = s0Var.f1661t;
            if (s0Var.K == null) {
                p0 B0 = k0Var2.a().B0();
                B0.getClass();
                if (B0.B.h() == null) {
                    return;
                }
            }
            if (s0Var.J) {
                s0Var.J = false;
                p0 B02 = k0Var2.a().B0();
                B02.getClass();
                s0Var.K = B02.B.h();
                if (k.q(g0Var)) {
                    g0 s10 = g0Var.s();
                    if (s10 != null) {
                        g0.R(s10, false, 7);
                        return;
                    }
                    return;
                }
                g0 s11 = g0Var.s();
                if (s11 != null) {
                    g0.P(s11, false, 7);
                }
            }
        }
    }
}
