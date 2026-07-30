package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m91 {
    public final i91 a;
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
    public xg1 q;
    public e91 d = e91.q;
    public final nj1 p = new nj1(this);

    public m91(i91 i91Var) {
        this.a = i91Var;
    }

    public final ks1 a() {
        return this.a.P.d;
    }

    public final void b() {
        e91 e91Var = this.a.Q.d;
        if (e91Var == e91.o || e91Var == e91.p) {
            if (this.p.L) {
                g(true);
            } else {
                f(true);
            }
        }
        if (e91Var == e91.p) {
            xg1 xg1Var = this.q;
            if (xg1Var == null || !xg1Var.F) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        xg1 xg1Var = this.q;
        if (xg1Var != null) {
            e91 e91Var = e91.n;
            m91 m91Var = xg1Var.r;
            m91Var.d = e91Var;
            i91 i91Var = m91Var.a;
            m91Var.e = false;
            tx1 snapshotObserver = ((t7) l91.a(i91Var)).getSnapshotObserver();
            vg1 vg1Var = new vg1(xg1Var, j);
            snapshotObserver.getClass();
            if (i91Var.s != null) {
                snapshotObserver.a(i91Var, snapshotObserver.b, vg1Var);
            } else {
                snapshotObserver.a(i91Var, snapshotObserver.c, vg1Var);
            }
            m91Var.f = true;
            m91Var.g = true;
            boolean N = j8.N(i91Var);
            nj1 nj1Var = m91Var.p;
            if (N) {
                nj1Var.G = true;
                nj1Var.H = true;
            } else {
                nj1Var.F = true;
            }
            m91Var.d = e91.q;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            i91 u = this.a.u();
            m91 m91Var = u != null ? u.Q : null;
            if (m91Var != null) {
                int i3 = m91Var.l;
                if (i == 0) {
                    m91Var.d(i3 - 1);
                } else {
                    m91Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            i91 u = this.a.u();
            m91 m91Var = u != null ? u.Q : null;
            if (m91Var != null) {
                int i3 = m91Var.o;
                if (i == 0) {
                    m91Var.e(i3 - 1);
                } else {
                    m91Var.e(i3 + 1);
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
        nj1 nj1Var = this.p;
        m91 m91Var = nj1Var.r;
        Object obj = nj1Var.C;
        i91 i91Var = this.a;
        if ((obj != null || m91Var.a().i() != null) && nj1Var.B) {
            nj1Var.B = false;
            nj1Var.C = m91Var.a().i();
            i91 u = i91Var.u();
            if (u != null) {
                i91.W(u, false, 7);
            }
        }
        xg1 xg1Var = this.q;
        if (xg1Var != null) {
            m91 m91Var2 = xg1Var.r;
            if (xg1Var.H == null) {
                sg1 O0 = m91Var2.a().O0();
                O0.getClass();
                if (O0.A.i() == null) {
                    return;
                }
            }
            if (xg1Var.G) {
                xg1Var.G = false;
                sg1 O02 = m91Var2.a().O0();
                O02.getClass();
                xg1Var.H = O02.A.i();
                if (j8.N(i91Var)) {
                    i91 u2 = i91Var.u();
                    if (u2 != null) {
                        i91.W(u2, false, 7);
                        return;
                    }
                    return;
                }
                i91 u3 = i91Var.u();
                if (u3 != null) {
                    i91.U(u3, false, 7);
                }
            }
        }
    }
}
