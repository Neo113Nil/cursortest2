package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nd0 {
    public final jd0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public kj0 q;
    public fd0 d = fd0.i;
    public final uk0 p = new uk0(this);

    public nd0(jd0 jd0Var) {
        this.a = jd0Var;
    }

    public final qp0 a() {
        return (qp0) this.a.J.e;
    }

    public final void b() {
        fd0 fd0Var = this.a.K.d;
        if (fd0Var == fd0.g || fd0Var == fd0.h) {
            if (this.p.D) {
                g(true);
            } else {
                f(true);
            }
        }
        if (fd0Var == fd0.h) {
            kj0 kj0Var = this.q;
            if (kj0Var == null || !kj0Var.x) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        kj0 kj0Var = this.q;
        if (kj0Var != null) {
            fd0 fd0Var = fd0.e;
            nd0 nd0Var = kj0Var.j;
            nd0Var.d = fd0Var;
            jd0 jd0Var = nd0Var.a;
            nd0Var.e = false;
            kj0Var.B = j;
            gu0 snapshotObserver = ((d4) md0.a(jd0Var)).getSnapshotObserver();
            jj0 jj0Var = kj0Var.C;
            snapshotObserver.a.b(jd0Var, snapshotObserver.b, jj0Var);
            nd0Var.f = true;
            nd0Var.g = true;
            boolean r = ca0.r(jd0Var);
            uk0 uk0Var = nd0Var.p;
            if (r) {
                uk0Var.y = true;
                uk0Var.z = true;
            } else {
                uk0Var.x = true;
            }
            nd0Var.d = fd0.i;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            jd0 s = this.a.s();
            nd0 nd0Var = s != null ? s.K : null;
            if (nd0Var != null) {
                int i3 = nd0Var.l;
                if (i == 0) {
                    nd0Var.d(i3 - 1);
                } else {
                    nd0Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            jd0 s = this.a.s();
            nd0 nd0Var = s != null ? s.K : null;
            if (nd0Var != null) {
                int i3 = nd0Var.o;
                if (i == 0) {
                    nd0Var.e(i3 - 1);
                } else {
                    nd0Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        uk0 uk0Var = this.p;
        nd0 nd0Var = uk0Var.j;
        Object obj = uk0Var.u;
        jd0 jd0Var = this.a;
        if ((obj != null || nd0Var.a().h() != null) && uk0Var.t) {
            uk0Var.t = false;
            uk0Var.u = nd0Var.a().h();
            jd0 s = jd0Var.s();
            if (s != null) {
                jd0.T(s, false, 7);
            }
        }
        kj0 kj0Var = this.q;
        if (kj0Var != null) {
            nd0 nd0Var2 = kj0Var.j;
            if (kj0Var.A == null) {
                gj0 H0 = nd0Var2.a().H0();
                H0.getClass();
                if (H0.s.h() == null) {
                    return;
                }
            }
            if (kj0Var.z) {
                kj0Var.z = false;
                gj0 H02 = nd0Var2.a().H0();
                H02.getClass();
                kj0Var.A = H02.s.h();
                if (ca0.r(jd0Var)) {
                    jd0 s2 = jd0Var.s();
                    if (s2 != null) {
                        jd0.T(s2, false, 7);
                        return;
                    }
                    return;
                }
                jd0 s3 = jd0Var.s();
                if (s3 != null) {
                    jd0.R(s3, false, 7);
                }
            }
        }
    }
}
