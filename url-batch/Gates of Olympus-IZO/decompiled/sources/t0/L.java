package t0;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final D f7797a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7798b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7800d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7801e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7803g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7804h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7805i;

    /* renamed from: j, reason: collision with root package name */
    public int f7806j;

    /* renamed from: k, reason: collision with root package name */
    public int f7807k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7808l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7809m;

    /* renamed from: n, reason: collision with root package name */
    public int f7810n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7811o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public int f7812q;

    /* renamed from: s, reason: collision with root package name */
    public I f7814s;

    /* renamed from: c, reason: collision with root package name */
    public int f7799c = 5;

    /* renamed from: r, reason: collision with root package name */
    public final J f7813r = new J(this);

    /* renamed from: t, reason: collision with root package name */
    public long f7815t = I2.l.b(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final r1.r f7816u = new r1.r(4, this);

    public L(D d3) {
        this.f7797a = d3;
    }

    public final a0 a() {
        return (a0) this.f7797a.f7735x.f2354d;
    }

    public final void b(int i3) {
        int i4 = this.f7810n;
        this.f7810n = i3;
        if ((i4 == 0) != (i3 == 0)) {
            D q2 = this.f7797a.q();
            L l3 = q2 != null ? q2.f7736y : null;
            if (l3 != null) {
                if (i3 == 0) {
                    l3.b(l3.f7810n - 1);
                } else {
                    l3.b(l3.f7810n + 1);
                }
            }
        }
    }

    public final void c(int i3) {
        int i4 = this.f7812q;
        this.f7812q = i3;
        if ((i4 == 0) != (i3 == 0)) {
            D q2 = this.f7797a.q();
            L l3 = q2 != null ? q2.f7736y : null;
            if (l3 != null) {
                if (i3 == 0) {
                    l3.c(l3.f7812q - 1);
                } else {
                    l3.c(l3.f7812q + 1);
                }
            }
        }
    }

    public final void d(boolean z3) {
        if (this.f7809m != z3) {
            this.f7809m = z3;
            if (z3 && !this.f7808l) {
                b(this.f7810n + 1);
            } else {
                if (z3 || this.f7808l) {
                    return;
                }
                b(this.f7810n - 1);
            }
        }
    }

    public final void e(boolean z3) {
        if (this.f7808l != z3) {
            this.f7808l = z3;
            if (z3 && !this.f7809m) {
                b(this.f7810n + 1);
            } else {
                if (z3 || this.f7809m) {
                    return;
                }
                b(this.f7810n - 1);
            }
        }
    }

    public final void f(boolean z3) {
        if (this.p != z3) {
            this.p = z3;
            if (z3 && !this.f7811o) {
                c(this.f7812q + 1);
            } else {
                if (z3 || this.f7811o) {
                    return;
                }
                c(this.f7812q - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.f7811o != z3) {
            this.f7811o = z3;
            if (z3 && !this.p) {
                c(this.f7812q + 1);
            } else {
                if (z3 || this.p) {
                    return;
                }
                c(this.f7812q - 1);
            }
        }
    }

    public final void h() {
        J j3 = this.f7813r;
        Object obj = j3.f7788t;
        D d3 = this.f7797a;
        L l3 = j3.f7777I;
        if ((obj != null || l3.a().r() != null) && j3.f7787s) {
            j3.f7787s = false;
            j3.f7788t = l3.a().r();
            D q2 = d3.q();
            if (q2 != null) {
                D.R(q2, false, 7);
            }
        }
        I i3 = this.f7814s;
        if (i3 != null) {
            Object obj2 = i3.f7770y;
            L l4 = i3.f7754A;
            if (obj2 == null) {
                P z02 = l4.a().z0();
                Z1.i.c(z02);
                if (z02.f7829o.r() == null) {
                    return;
                }
            }
            if (i3.f7769x) {
                i3.f7769x = false;
                P z03 = l4.a().z0();
                Z1.i.c(z03);
                i3.f7770y = z03.f7829o.r();
                if (AbstractC0898f.p(d3)) {
                    D q3 = d3.q();
                    if (q3 != null) {
                        D.R(q3, false, 7);
                        return;
                    }
                    return;
                }
                D q4 = d3.q();
                if (q4 != null) {
                    D.P(q4, false, 7);
                }
            }
        }
    }
}
