package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f7831a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7832b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7835e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7836f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7838h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7839i;

    /* renamed from: j, reason: collision with root package name */
    public int f7840j;

    /* renamed from: k, reason: collision with root package name */
    public int f7841k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7842l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7843m;

    /* renamed from: n, reason: collision with root package name */
    public int f7844n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7845o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7846p;

    /* renamed from: q, reason: collision with root package name */
    public int f7847q;

    /* renamed from: s, reason: collision with root package name */
    public i0 f7849s;

    /* renamed from: c, reason: collision with root package name */
    public int f7833c = 5;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f7848r = new j0(this);

    /* renamed from: t, reason: collision with root package name */
    public long f7850t = r4.a.c(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.r0 f7851u = new androidx.lifecycle.r0(28, this);

    public l0(d0 d0Var) {
        this.f7831a = d0Var;
    }

    public final a1 a() {
        return (a1) this.f7831a.A.f3893d;
    }

    public final void b(int i7) {
        int i8 = this.f7844n;
        this.f7844n = i7;
        if ((i8 == 0) != (i7 == 0)) {
            d0 s5 = this.f7831a.s();
            l0 l0Var = s5 != null ? s5.B : null;
            if (l0Var != null) {
                if (i7 == 0) {
                    l0Var.b(l0Var.f7844n - 1);
                } else {
                    l0Var.b(l0Var.f7844n + 1);
                }
            }
        }
    }

    public final void c(int i7) {
        int i8 = this.f7847q;
        this.f7847q = i7;
        if ((i8 == 0) != (i7 == 0)) {
            d0 s5 = this.f7831a.s();
            l0 l0Var = s5 != null ? s5.B : null;
            if (l0Var != null) {
                if (i7 == 0) {
                    l0Var.c(l0Var.f7847q - 1);
                } else {
                    l0Var.c(l0Var.f7847q + 1);
                }
            }
        }
    }

    public final void d(boolean z8) {
        if (this.f7843m != z8) {
            this.f7843m = z8;
            if (z8 && !this.f7842l) {
                b(this.f7844n + 1);
            } else {
                if (z8 || this.f7842l) {
                    return;
                }
                b(this.f7844n - 1);
            }
        }
    }

    public final void e(boolean z8) {
        if (this.f7842l != z8) {
            this.f7842l = z8;
            if (z8 && !this.f7843m) {
                b(this.f7844n + 1);
            } else {
                if (z8 || this.f7843m) {
                    return;
                }
                b(this.f7844n - 1);
            }
        }
    }

    public final void f(boolean z8) {
        if (this.f7846p != z8) {
            this.f7846p = z8;
            if (z8 && !this.f7845o) {
                c(this.f7847q + 1);
            } else {
                if (z8 || this.f7845o) {
                    return;
                }
                c(this.f7847q - 1);
            }
        }
    }

    public final void g(boolean z8) {
        if (this.f7845o != z8) {
            this.f7845o = z8;
            if (z8 && !this.f7846p) {
                c(this.f7847q + 1);
            } else {
                if (z8 || this.f7846p) {
                    return;
                }
                c(this.f7847q - 1);
            }
        }
    }

    public final void h() {
        j0 j0Var = this.f7848r;
        l0 l0Var = j0Var.K;
        Object obj = j0Var.f7822v;
        d0 d0Var = this.f7831a;
        if ((obj != null || l0Var.a().g() != null) && j0Var.f7821u) {
            j0Var.f7821u = false;
            j0Var.f7822v = l0Var.a().g();
            d0 s5 = d0Var.s();
            if (s5 != null) {
                d0.T(s5, false, 7);
            }
        }
        i0 i0Var = this.f7849s;
        if (i0Var != null) {
            l0 l0Var2 = i0Var.C;
            if (i0Var.A == null) {
                p0 K0 = l0Var2.a().K0();
                r6.k.c(K0);
                if (K0.f7870q.g() == null) {
                    return;
                }
            }
            if (i0Var.f7801z) {
                i0Var.f7801z = false;
                p0 K02 = l0Var2.a().K0();
                r6.k.c(K02);
                i0Var.A = K02.f7870q.g();
                if (f.p(d0Var)) {
                    d0 s8 = d0Var.s();
                    if (s8 != null) {
                        d0.T(s8, false, 7);
                        return;
                    }
                    return;
                }
                d0 s9 = d0Var.s();
                if (s9 != null) {
                    d0.R(s9, false, 7);
                }
            }
        }
    }
}
