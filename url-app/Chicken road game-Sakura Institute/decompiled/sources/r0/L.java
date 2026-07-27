package r0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final E f9674a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9675b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9677d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9678e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9679f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9680g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9681h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9682i;

    /* renamed from: j, reason: collision with root package name */
    public int f9683j;

    /* renamed from: k, reason: collision with root package name */
    public int f9684k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9685l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9686m;

    /* renamed from: n, reason: collision with root package name */
    public int f9687n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9688o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9689p;

    /* renamed from: q, reason: collision with root package name */
    public int f9690q;

    /* renamed from: s, reason: collision with root package name */
    public J f9692s;

    /* renamed from: c, reason: collision with root package name */
    public int f9676c = 5;

    /* renamed from: r, reason: collision with root package name */
    public final K f9691r = new K(this);

    /* renamed from: t, reason: collision with root package name */
    public long f9693t = u3.d.b(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final A3.e f9694u = new A3.e(27, this);

    public L(E e4) {
        this.f9674a = e4;
    }

    public final a0 a() {
        return (a0) this.f9674a.B.f2910d;
    }

    public final void b(int i2) {
        int i4 = this.f9687n;
        this.f9687n = i2;
        if ((i4 == 0) != (i2 == 0)) {
            E s4 = this.f9674a.s();
            L l4 = s4 != null ? s4.f9584C : null;
            if (l4 != null) {
                if (i2 == 0) {
                    l4.b(l4.f9687n - 1);
                } else {
                    l4.b(l4.f9687n + 1);
                }
            }
        }
    }

    public final void c(int i2) {
        int i4 = this.f9690q;
        this.f9690q = i2;
        if ((i4 == 0) != (i2 == 0)) {
            E s4 = this.f9674a.s();
            L l4 = s4 != null ? s4.f9584C : null;
            if (l4 != null) {
                if (i2 == 0) {
                    l4.c(l4.f9690q - 1);
                } else {
                    l4.c(l4.f9690q + 1);
                }
            }
        }
    }

    public final void d(boolean z4) {
        if (this.f9686m != z4) {
            this.f9686m = z4;
            if (z4 && !this.f9685l) {
                b(this.f9687n + 1);
            } else {
                if (z4 || this.f9685l) {
                    return;
                }
                b(this.f9687n - 1);
            }
        }
    }

    public final void e(boolean z4) {
        if (this.f9685l != z4) {
            this.f9685l = z4;
            if (z4 && !this.f9686m) {
                b(this.f9687n + 1);
            } else {
                if (z4 || this.f9686m) {
                    return;
                }
                b(this.f9687n - 1);
            }
        }
    }

    public final void f(boolean z4) {
        if (this.f9689p != z4) {
            this.f9689p = z4;
            if (z4 && !this.f9688o) {
                c(this.f9690q + 1);
            } else {
                if (z4 || this.f9688o) {
                    return;
                }
                c(this.f9690q - 1);
            }
        }
    }

    public final void g(boolean z4) {
        if (this.f9688o != z4) {
            this.f9688o = z4;
            if (z4 && !this.f9689p) {
                c(this.f9690q + 1);
            } else {
                if (z4 || this.f9689p) {
                    return;
                }
                c(this.f9690q - 1);
            }
        }
    }

    public final void h() {
        K k4 = this.f9691r;
        Object obj = k4.f9670w;
        E e4 = this.f9674a;
        L l4 = k4.f9658L;
        if ((obj != null || l4.a().r() != null) && k4.f9669v) {
            k4.f9669v = false;
            k4.f9670w = l4.a().r();
            E s4 = e4.s();
            if (s4 != null) {
                E.T(s4, false, 7);
            }
        }
        J j4 = this.f9692s;
        if (j4 != null) {
            Object obj2 = j4.B;
            L l5 = j4.f9632D;
            if (obj2 == null) {
                P M02 = l5.a().M0();
                Intrinsics.c(M02);
                if (M02.f9707r.r() == null) {
                    return;
                }
            }
            if (j4.f9630A) {
                j4.f9630A = false;
                P M03 = l5.a().M0();
                Intrinsics.c(M03);
                j4.B = M03.f9707r.r();
                if (AbstractC1065f.r(e4)) {
                    E s5 = e4.s();
                    if (s5 != null) {
                        E.T(s5, false, 7);
                        return;
                    }
                    return;
                }
                E s6 = e4.s();
                if (s6 != null) {
                    E.R(s6, false, 7);
                }
            }
        }
    }
}
