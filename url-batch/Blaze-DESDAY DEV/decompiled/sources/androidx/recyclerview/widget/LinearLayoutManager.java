package androidx.recyclerview.widget;

import U.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.C0130n;
import g0.C0134s;
import g0.C0135t;
import g0.C0136u;
import g0.C0137v;
import g0.C0138w;
import g0.I;
import g0.J;
import g0.K;
import g0.P;
import g0.V;
import g0.W;
import g0.a0;
import java.util.List;
import z1.d;

/* loaded from: classes.dex */
public class LinearLayoutManager extends J implements V {

    /* renamed from: A, reason: collision with root package name */
    public final C0134s f1544A;

    /* renamed from: B, reason: collision with root package name */
    public final C0135t f1545B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1546C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1547D;

    /* renamed from: p, reason: collision with root package name */
    public int f1548p;

    /* renamed from: q, reason: collision with root package name */
    public C0136u f1549q;

    /* renamed from: r, reason: collision with root package name */
    public g f1550r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1551s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1552t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1553u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1554v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1555w;

    /* renamed from: x, reason: collision with root package name */
    public int f1556x;

    /* renamed from: y, reason: collision with root package name */
    public int f1557y;

    /* renamed from: z, reason: collision with root package name */
    public C0137v f1558z;

    public LinearLayoutManager(int i) {
        this.f1548p = 1;
        this.f1552t = false;
        this.f1553u = false;
        this.f1554v = false;
        this.f1555w = true;
        this.f1556x = -1;
        this.f1557y = Integer.MIN_VALUE;
        this.f1558z = null;
        this.f1544A = new C0134s();
        this.f1545B = new C0135t();
        this.f1546C = 2;
        this.f1547D = new int[2];
        b1(i);
        c(null);
        if (this.f1552t) {
            this.f1552t = false;
            n0();
        }
    }

    @Override // g0.J
    public boolean B0() {
        return this.f1558z == null && this.f1551s == this.f1554v;
    }

    public void C0(W w2, int[] iArr) {
        int i;
        int l2 = w2.f2345a != -1 ? this.f1550r.l() : 0;
        if (this.f1549q.f2519f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void D0(W w2, C0136u c0136u, C0130n c0130n) {
        int i = c0136u.d;
        if (i < 0 || i >= w2.b()) {
            return;
        }
        c0130n.a(i, Math.max(0, c0136u.f2520g));
    }

    public final int E0(W w2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1550r;
        boolean z2 = !this.f1555w;
        return d.t(w2, gVar, L0(z2), K0(z2), this, this.f1555w);
    }

    public final int F0(W w2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1550r;
        boolean z2 = !this.f1555w;
        return d.u(w2, gVar, L0(z2), K0(z2), this, this.f1555w, this.f1553u);
    }

    public final int G0(W w2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1550r;
        boolean z2 = !this.f1555w;
        return d.v(w2, gVar, L0(z2), K0(z2), this, this.f1555w);
    }

    public final int H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1548p == 1) ? 1 : Integer.MIN_VALUE : this.f1548p == 0 ? 1 : Integer.MIN_VALUE : this.f1548p == 1 ? -1 : Integer.MIN_VALUE : this.f1548p == 0 ? -1 : Integer.MIN_VALUE : (this.f1548p != 1 && U0()) ? -1 : 1 : (this.f1548p != 1 && U0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1549q == null) {
            C0136u c0136u = new C0136u();
            c0136u.f2515a = true;
            c0136u.h = 0;
            c0136u.i = 0;
            c0136u.f2522k = null;
            this.f1549q = c0136u;
        }
    }

    public final int J0(P p2, C0136u c0136u, W w2, boolean z2) {
        int i;
        int i2 = c0136u.f2517c;
        int i3 = c0136u.f2520g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0136u.f2520g = i3 + i2;
            }
            X0(p2, c0136u);
        }
        int i4 = c0136u.f2517c + c0136u.h;
        while (true) {
            if ((!c0136u.f2523l && i4 <= 0) || (i = c0136u.d) < 0 || i >= w2.b()) {
                break;
            }
            C0135t c0135t = this.f1545B;
            c0135t.f2512a = 0;
            c0135t.f2513b = false;
            c0135t.f2514c = false;
            c0135t.d = false;
            V0(p2, w2, c0136u, c0135t);
            if (!c0135t.f2513b) {
                int i5 = c0136u.f2516b;
                int i6 = c0135t.f2512a;
                c0136u.f2516b = (c0136u.f2519f * i6) + i5;
                if (!c0135t.f2514c || c0136u.f2522k != null || !w2.f2350g) {
                    c0136u.f2517c -= i6;
                    i4 -= i6;
                }
                int i7 = c0136u.f2520g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0136u.f2520g = i8;
                    int i9 = c0136u.f2517c;
                    if (i9 < 0) {
                        c0136u.f2520g = i8 + i9;
                    }
                    X0(p2, c0136u);
                }
                if (z2 && c0135t.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0136u.f2517c;
    }

    public final View K0(boolean z2) {
        return this.f1553u ? O0(0, v(), z2) : O0(v() - 1, -1, z2);
    }

    @Override // g0.J
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z2) {
        return this.f1553u ? O0(v() - 1, -1, z2) : O0(0, v(), z2);
    }

    public final int M0() {
        View O02 = O0(v() - 1, -1, false);
        if (O02 == null) {
            return -1;
        }
        return J.H(O02);
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        I0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1550r.e(u(i)) < this.f1550r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1548p == 0 ? this.f2312c.v(i, i2, i3, i4) : this.d.v(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z2) {
        I0();
        int i3 = z2 ? 24579 : 320;
        return this.f1548p == 0 ? this.f2312c.v(i, i2, i3, 320) : this.d.v(i, i2, i3, 320);
    }

    public View P0(P p2, W w2, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        I0();
        int v2 = v();
        if (z3) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v2;
            i2 = 0;
            i3 = 1;
        }
        int b2 = w2.b();
        int k2 = this.f1550r.k();
        int g2 = this.f1550r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = J.H(u2);
            int e2 = this.f1550r.e(u2);
            int b3 = this.f1550r.b(u2);
            if (H2 >= 0 && H2 < b2) {
                if (!((K) u2.getLayoutParams()).f2322a.i()) {
                    boolean z4 = b3 <= k2 && e2 < k2;
                    boolean z5 = e2 >= g2 && b3 > g2;
                    if (!z4 && !z5) {
                        return u2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    }
                } else if (view3 == null) {
                    view3 = u2;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int Q0(int i, P p2, W w2, boolean z2) {
        int g2;
        int g3 = this.f1550r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -a1(-g3, p2, w2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1550r.g() - i3) <= 0) {
            return i2;
        }
        this.f1550r.p(g2);
        return g2 + i2;
    }

    public final int R0(int i, P p2, W w2, boolean z2) {
        int k2;
        int k3 = i - this.f1550r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -a1(k3, p2, w2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1550r.k()) <= 0) {
            return i2;
        }
        this.f1550r.p(-k2);
        return i2 - k2;
    }

    @Override // g0.J
    public final void S(RecyclerView recyclerView) {
    }

    public final View S0() {
        return u(this.f1553u ? 0 : v() - 1);
    }

    @Override // g0.J
    public View T(View view, int i, P p2, W w2) {
        int H02;
        Z0();
        if (v() == 0 || (H02 = H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        d1(H02, (int) (this.f1550r.l() * 0.33333334f), false, w2);
        C0136u c0136u = this.f1549q;
        c0136u.f2520g = Integer.MIN_VALUE;
        c0136u.f2515a = false;
        J0(p2, c0136u, w2, true);
        View N02 = H02 == -1 ? this.f1553u ? N0(v() - 1, -1) : N0(0, v()) : this.f1553u ? N0(0, v()) : N0(v() - 1, -1);
        View T02 = H02 == -1 ? T0() : S0();
        if (!T02.hasFocusable()) {
            return N02;
        }
        if (N02 == null) {
            return null;
        }
        return T02;
    }

    public final View T0() {
        return u(this.f1553u ? v() - 1 : 0);
    }

    @Override // g0.J
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View O02 = O0(0, v(), false);
            accessibilityEvent.setFromIndex(O02 == null ? -1 : J.H(O02));
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final boolean U0() {
        return C() == 1;
    }

    public void V0(P p2, W w2, C0136u c0136u, C0135t c0135t) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0136u.b(p2);
        if (b2 == null) {
            c0135t.f2513b = true;
            return;
        }
        K k2 = (K) b2.getLayoutParams();
        if (c0136u.f2522k == null) {
            if (this.f1553u == (c0136u.f2519f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1553u == (c0136u.f2519f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        K k3 = (K) b2.getLayoutParams();
        Rect M2 = this.f2311b.M(b2);
        int i5 = M2.left + M2.right;
        int i6 = M2.top + M2.bottom;
        int w3 = J.w(d(), this.f2320n, this.f2318l, F() + E() + ((ViewGroup.MarginLayoutParams) k3).leftMargin + ((ViewGroup.MarginLayoutParams) k3).rightMargin + i5, ((ViewGroup.MarginLayoutParams) k3).width);
        int w4 = J.w(e(), this.f2321o, this.f2319m, D() + G() + ((ViewGroup.MarginLayoutParams) k3).topMargin + ((ViewGroup.MarginLayoutParams) k3).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) k3).height);
        if (w0(b2, w3, w4, k3)) {
            b2.measure(w3, w4);
        }
        c0135t.f2512a = this.f1550r.c(b2);
        if (this.f1548p == 1) {
            if (U0()) {
                i4 = this.f2320n - F();
                i = i4 - this.f1550r.d(b2);
            } else {
                i = E();
                i4 = this.f1550r.d(b2) + i;
            }
            if (c0136u.f2519f == -1) {
                i2 = c0136u.f2516b;
                i3 = i2 - c0135t.f2512a;
            } else {
                i3 = c0136u.f2516b;
                i2 = c0135t.f2512a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1550r.d(b2) + G2;
            if (c0136u.f2519f == -1) {
                int i7 = c0136u.f2516b;
                int i8 = i7 - c0135t.f2512a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0136u.f2516b;
                int i10 = c0135t.f2512a + i9;
                i = i9;
                i2 = d;
                i3 = G2;
                i4 = i10;
            }
        }
        J.N(b2, i, i3, i4, i2);
        if (k2.f2322a.i() || k2.f2322a.l()) {
            c0135t.f2514c = true;
        }
        c0135t.d = b2.hasFocusable();
    }

    public void W0(P p2, W w2, C0134s c0134s, int i) {
    }

    public final void X0(P p2, C0136u c0136u) {
        if (!c0136u.f2515a || c0136u.f2523l) {
            return;
        }
        int i = c0136u.f2520g;
        int i2 = c0136u.i;
        if (c0136u.f2519f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1550r.f() - i) + i2;
            if (this.f1553u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1550r.e(u2) < f2 || this.f1550r.o(u2) < f2) {
                        Y0(p2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1550r.e(u3) < f2 || this.f1550r.o(u3) < f2) {
                    Y0(p2, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int v3 = v();
        if (!this.f1553u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1550r.b(u4) > i6 || this.f1550r.n(u4) > i6) {
                    Y0(p2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1550r.b(u5) > i6 || this.f1550r.n(u5) > i6) {
                Y0(p2, i8, i9);
                return;
            }
        }
    }

    public final void Y0(P p2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                l0(i);
                p2.h(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            l0(i3);
            p2.h(u3);
        }
    }

    public final void Z0() {
        if (this.f1548p == 1 || !U0()) {
            this.f1553u = this.f1552t;
        } else {
            this.f1553u = !this.f1552t;
        }
    }

    @Override // g0.V
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < J.H(u(0))) != this.f1553u ? -1 : 1;
        return this.f1548p == 0 ? new PointF(i2, RecyclerView.f1559A0) : new PointF(RecyclerView.f1559A0, i2);
    }

    public final int a1(int i, P p2, W w2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        I0();
        this.f1549q.f2515a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        d1(i2, abs, true, w2);
        C0136u c0136u = this.f1549q;
        int J02 = J0(p2, c0136u, w2, false) + c0136u.f2520g;
        if (J02 < 0) {
            return 0;
        }
        if (abs > J02) {
            i = i2 * J02;
        }
        this.f1550r.p(-i);
        this.f1549q.f2521j = i;
        return i;
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Y.V.e("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1548p || this.f1550r == null) {
            g a2 = g.a(this, i);
            this.f1550r = a2;
            this.f1544A.f2508a = a2;
            this.f1548p = i;
            n0();
        }
    }

    @Override // g0.J
    public final void c(String str) {
        if (this.f1558z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z2) {
        c(null);
        if (this.f1554v == z2) {
            return;
        }
        this.f1554v = z2;
        n0();
    }

    @Override // g0.J
    public final boolean d() {
        return this.f1548p == 0;
    }

    @Override // g0.J
    public void d0(P p2, W w2) {
        View focusedChild;
        View focusedChild2;
        View P02;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int Q02;
        int i6;
        View q2;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f1558z == null && this.f1556x == -1) && w2.b() == 0) {
            i0(p2);
            return;
        }
        C0137v c0137v = this.f1558z;
        if (c0137v != null && (i8 = c0137v.f2524a) >= 0) {
            this.f1556x = i8;
        }
        I0();
        this.f1549q.f2515a = false;
        Z0();
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2310a.f2388c.contains(focusedChild)) {
            focusedChild = null;
        }
        C0134s c0134s = this.f1544A;
        if (!c0134s.f2511e || this.f1556x != -1 || this.f1558z != null) {
            c0134s.d();
            c0134s.d = this.f1553u ^ this.f1554v;
            if (!w2.f2350g && (i = this.f1556x) != -1) {
                if (i < 0 || i >= w2.b()) {
                    this.f1556x = -1;
                    this.f1557y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1556x;
                    c0134s.f2509b = i10;
                    C0137v c0137v2 = this.f1558z;
                    if (c0137v2 != null && c0137v2.f2524a >= 0) {
                        boolean z2 = c0137v2.f2526c;
                        c0134s.d = z2;
                        if (z2) {
                            c0134s.f2510c = this.f1550r.g() - this.f1558z.f2525b;
                        } else {
                            c0134s.f2510c = this.f1550r.k() + this.f1558z.f2525b;
                        }
                    } else if (this.f1557y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                c0134s.d = (this.f1556x < J.H(u(0))) == this.f1553u;
                            }
                            c0134s.a();
                        } else if (this.f1550r.c(q3) > this.f1550r.l()) {
                            c0134s.a();
                        } else if (this.f1550r.e(q3) - this.f1550r.k() < 0) {
                            c0134s.f2510c = this.f1550r.k();
                            c0134s.d = false;
                        } else if (this.f1550r.g() - this.f1550r.b(q3) < 0) {
                            c0134s.f2510c = this.f1550r.g();
                            c0134s.d = true;
                        } else {
                            c0134s.f2510c = c0134s.d ? this.f1550r.m() + this.f1550r.b(q3) : this.f1550r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1553u;
                        c0134s.d = z3;
                        if (z3) {
                            c0134s.f2510c = this.f1550r.g() - this.f1557y;
                        } else {
                            c0134s.f2510c = this.f1550r.k() + this.f1557y;
                        }
                    }
                    c0134s.f2511e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2311b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f2310a.f2388c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    K k2 = (K) focusedChild2.getLayoutParams();
                    if (!k2.f2322a.i() && k2.f2322a.b() >= 0 && k2.f2322a.b() < w2.b()) {
                        c0134s.c(focusedChild2, J.H(focusedChild2));
                        c0134s.f2511e = true;
                    }
                }
                boolean z4 = this.f1551s;
                boolean z5 = this.f1554v;
                if (z4 == z5 && (P02 = P0(p2, w2, c0134s.d, z5)) != null) {
                    c0134s.b(P02, J.H(P02));
                    if (!w2.f2350g && B0()) {
                        int e3 = this.f1550r.e(P02);
                        int b2 = this.f1550r.b(P02);
                        int k3 = this.f1550r.k();
                        int g2 = this.f1550r.g();
                        boolean z6 = b2 <= k3 && e3 < k3;
                        boolean z7 = e3 >= g2 && b2 > g2;
                        if (z6 || z7) {
                            if (c0134s.d) {
                                k3 = g2;
                            }
                            c0134s.f2510c = k3;
                        }
                    }
                    c0134s.f2511e = true;
                }
            }
            c0134s.a();
            c0134s.f2509b = this.f1554v ? w2.b() - 1 : 0;
            c0134s.f2511e = true;
        } else if (focusedChild != null && (this.f1550r.e(focusedChild) >= this.f1550r.g() || this.f1550r.b(focusedChild) <= this.f1550r.k())) {
            c0134s.c(focusedChild, J.H(focusedChild));
        }
        C0136u c0136u = this.f1549q;
        c0136u.f2519f = c0136u.f2521j >= 0 ? 1 : -1;
        int[] iArr = this.f1547D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(w2, iArr);
        int k4 = this.f1550r.k() + Math.max(0, iArr[0]);
        int h = this.f1550r.h() + Math.max(0, iArr[1]);
        if (w2.f2350g && (i6 = this.f1556x) != -1 && this.f1557y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1553u) {
                i7 = this.f1550r.g() - this.f1550r.b(q2);
                e2 = this.f1557y;
            } else {
                e2 = this.f1550r.e(q2) - this.f1550r.k();
                i7 = this.f1557y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k4 += i11;
            } else {
                h -= i11;
            }
        }
        if (!c0134s.d ? !this.f1553u : this.f1553u) {
            i9 = 1;
        }
        W0(p2, w2, c0134s, i9);
        p(p2);
        this.f1549q.f2523l = this.f1550r.i() == 0 && this.f1550r.f() == 0;
        this.f1549q.getClass();
        this.f1549q.i = 0;
        if (c0134s.d) {
            f1(c0134s.f2509b, c0134s.f2510c);
            C0136u c0136u2 = this.f1549q;
            c0136u2.h = k4;
            J0(p2, c0136u2, w2, false);
            C0136u c0136u3 = this.f1549q;
            i3 = c0136u3.f2516b;
            int i12 = c0136u3.d;
            int i13 = c0136u3.f2517c;
            if (i13 > 0) {
                h += i13;
            }
            e1(c0134s.f2509b, c0134s.f2510c);
            C0136u c0136u4 = this.f1549q;
            c0136u4.h = h;
            c0136u4.d += c0136u4.f2518e;
            J0(p2, c0136u4, w2, false);
            C0136u c0136u5 = this.f1549q;
            i2 = c0136u5.f2516b;
            int i14 = c0136u5.f2517c;
            if (i14 > 0) {
                f1(i12, i3);
                C0136u c0136u6 = this.f1549q;
                c0136u6.h = i14;
                J0(p2, c0136u6, w2, false);
                i3 = this.f1549q.f2516b;
            }
        } else {
            e1(c0134s.f2509b, c0134s.f2510c);
            C0136u c0136u7 = this.f1549q;
            c0136u7.h = h;
            J0(p2, c0136u7, w2, false);
            C0136u c0136u8 = this.f1549q;
            i2 = c0136u8.f2516b;
            int i15 = c0136u8.d;
            int i16 = c0136u8.f2517c;
            if (i16 > 0) {
                k4 += i16;
            }
            f1(c0134s.f2509b, c0134s.f2510c);
            C0136u c0136u9 = this.f1549q;
            c0136u9.h = k4;
            c0136u9.d += c0136u9.f2518e;
            J0(p2, c0136u9, w2, false);
            C0136u c0136u10 = this.f1549q;
            int i17 = c0136u10.f2516b;
            int i18 = c0136u10.f2517c;
            if (i18 > 0) {
                e1(i15, i2);
                C0136u c0136u11 = this.f1549q;
                c0136u11.h = i18;
                J0(p2, c0136u11, w2, false);
                i2 = this.f1549q.f2516b;
            }
            i3 = i17;
        }
        if (v() > 0) {
            if (this.f1553u ^ this.f1554v) {
                int Q03 = Q0(i2, p2, w2, true);
                i4 = i3 + Q03;
                i5 = i2 + Q03;
                Q02 = R0(i4, p2, w2, false);
            } else {
                int R02 = R0(i3, p2, w2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                Q02 = Q0(i5, p2, w2, false);
            }
            i3 = i4 + Q02;
            i2 = i5 + Q02;
        }
        if (w2.f2352k && v() != 0 && !w2.f2350g && B0()) {
            List list2 = p2.d;
            int size = list2.size();
            int H2 = J.H(u(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                a0 a0Var = (a0) list2.get(i21);
                if (!a0Var.i()) {
                    boolean z8 = a0Var.b() < H2;
                    boolean z9 = this.f1553u;
                    View view = a0Var.f2366a;
                    if (z8 != z9) {
                        i19 += this.f1550r.c(view);
                    } else {
                        i20 += this.f1550r.c(view);
                    }
                }
            }
            this.f1549q.f2522k = list2;
            if (i19 > 0) {
                f1(J.H(T0()), i3);
                C0136u c0136u12 = this.f1549q;
                c0136u12.h = i19;
                c0136u12.f2517c = 0;
                c0136u12.a(null);
                J0(p2, this.f1549q, w2, false);
            }
            if (i20 > 0) {
                e1(J.H(S0()), i2);
                C0136u c0136u13 = this.f1549q;
                c0136u13.h = i20;
                c0136u13.f2517c = 0;
                list = null;
                c0136u13.a(null);
                J0(p2, this.f1549q, w2, false);
            } else {
                list = null;
            }
            this.f1549q.f2522k = list;
        }
        if (w2.f2350g) {
            c0134s.d();
        } else {
            g gVar = this.f1550r;
            gVar.f852a = gVar.l();
        }
        this.f1551s = this.f1554v;
    }

    public final void d1(int i, int i2, boolean z2, W w2) {
        int k2;
        this.f1549q.f2523l = this.f1550r.i() == 0 && this.f1550r.f() == 0;
        this.f1549q.f2519f = i;
        int[] iArr = this.f1547D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(w2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0136u c0136u = this.f1549q;
        int i3 = z3 ? max2 : max;
        c0136u.h = i3;
        if (!z3) {
            max = max2;
        }
        c0136u.i = max;
        if (z3) {
            c0136u.h = this.f1550r.h() + i3;
            View S02 = S0();
            C0136u c0136u2 = this.f1549q;
            c0136u2.f2518e = this.f1553u ? -1 : 1;
            int H2 = J.H(S02);
            C0136u c0136u3 = this.f1549q;
            c0136u2.d = H2 + c0136u3.f2518e;
            c0136u3.f2516b = this.f1550r.b(S02);
            k2 = this.f1550r.b(S02) - this.f1550r.g();
        } else {
            View T02 = T0();
            C0136u c0136u4 = this.f1549q;
            c0136u4.h = this.f1550r.k() + c0136u4.h;
            C0136u c0136u5 = this.f1549q;
            c0136u5.f2518e = this.f1553u ? 1 : -1;
            int H3 = J.H(T02);
            C0136u c0136u6 = this.f1549q;
            c0136u5.d = H3 + c0136u6.f2518e;
            c0136u6.f2516b = this.f1550r.e(T02);
            k2 = (-this.f1550r.e(T02)) + this.f1550r.k();
        }
        C0136u c0136u7 = this.f1549q;
        c0136u7.f2517c = i2;
        if (z2) {
            c0136u7.f2517c = i2 - k2;
        }
        c0136u7.f2520g = k2;
    }

    @Override // g0.J
    public final boolean e() {
        return this.f1548p == 1;
    }

    @Override // g0.J
    public void e0(W w2) {
        this.f1558z = null;
        this.f1556x = -1;
        this.f1557y = Integer.MIN_VALUE;
        this.f1544A.d();
    }

    public final void e1(int i, int i2) {
        this.f1549q.f2517c = this.f1550r.g() - i2;
        C0136u c0136u = this.f1549q;
        c0136u.f2518e = this.f1553u ? -1 : 1;
        c0136u.d = i;
        c0136u.f2519f = 1;
        c0136u.f2516b = i2;
        c0136u.f2520g = Integer.MIN_VALUE;
    }

    @Override // g0.J
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof C0137v) {
            C0137v c0137v = (C0137v) parcelable;
            this.f1558z = c0137v;
            if (this.f1556x != -1) {
                c0137v.f2524a = -1;
            }
            n0();
        }
    }

    public final void f1(int i, int i2) {
        this.f1549q.f2517c = i2 - this.f1550r.k();
        C0136u c0136u = this.f1549q;
        c0136u.d = i;
        c0136u.f2518e = this.f1553u ? 1 : -1;
        c0136u.f2519f = -1;
        c0136u.f2516b = i2;
        c0136u.f2520g = Integer.MIN_VALUE;
    }

    @Override // g0.J
    public final Parcelable g0() {
        C0137v c0137v = this.f1558z;
        if (c0137v != null) {
            C0137v c0137v2 = new C0137v();
            c0137v2.f2524a = c0137v.f2524a;
            c0137v2.f2525b = c0137v.f2525b;
            c0137v2.f2526c = c0137v.f2526c;
            return c0137v2;
        }
        C0137v c0137v3 = new C0137v();
        if (v() > 0) {
            I0();
            boolean z2 = this.f1551s ^ this.f1553u;
            c0137v3.f2526c = z2;
            if (z2) {
                View S02 = S0();
                c0137v3.f2525b = this.f1550r.g() - this.f1550r.b(S02);
                c0137v3.f2524a = J.H(S02);
            } else {
                View T02 = T0();
                c0137v3.f2524a = J.H(T02);
                c0137v3.f2525b = this.f1550r.e(T02) - this.f1550r.k();
            }
        } else {
            c0137v3.f2524a = -1;
        }
        return c0137v3;
    }

    @Override // g0.J
    public final void h(int i, int i2, W w2, C0130n c0130n) {
        if (this.f1548p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, w2);
        D0(w2, this.f1549q, c0130n);
    }

    @Override // g0.J
    public final void i(int i, C0130n c0130n) {
        boolean z2;
        int i2;
        C0137v c0137v = this.f1558z;
        if (c0137v == null || (i2 = c0137v.f2524a) < 0) {
            Z0();
            z2 = this.f1553u;
            i2 = this.f1556x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0137v.f2526c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1546C && i2 >= 0 && i2 < i; i4++) {
            c0130n.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // g0.J
    public final int j(W w2) {
        return E0(w2);
    }

    @Override // g0.J
    public int k(W w2) {
        return F0(w2);
    }

    @Override // g0.J
    public int l(W w2) {
        return G0(w2);
    }

    @Override // g0.J
    public final int m(W w2) {
        return E0(w2);
    }

    @Override // g0.J
    public int n(W w2) {
        return F0(w2);
    }

    @Override // g0.J
    public int o(W w2) {
        return G0(w2);
    }

    @Override // g0.J
    public int o0(int i, P p2, W w2) {
        if (this.f1548p == 1) {
            return 0;
        }
        return a1(i, p2, w2);
    }

    @Override // g0.J
    public final void p0(int i) {
        this.f1556x = i;
        this.f1557y = Integer.MIN_VALUE;
        C0137v c0137v = this.f1558z;
        if (c0137v != null) {
            c0137v.f2524a = -1;
        }
        n0();
    }

    @Override // g0.J
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - J.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (J.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // g0.J
    public int q0(int i, P p2, W w2) {
        if (this.f1548p == 0) {
            return 0;
        }
        return a1(i, p2, w2);
    }

    @Override // g0.J
    public K r() {
        return new K(-2, -2);
    }

    @Override // g0.J
    public final boolean x0() {
        if (this.f2319m == 1073741824 || this.f2318l == 1073741824) {
            return false;
        }
        int v2 = v();
        for (int i = 0; i < v2; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.J
    public void z0(RecyclerView recyclerView, int i) {
        C0138w c0138w = new C0138w(recyclerView.getContext());
        c0138w.f2527a = i;
        A0(c0138w);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1548p = 1;
        this.f1552t = false;
        this.f1553u = false;
        this.f1554v = false;
        this.f1555w = true;
        this.f1556x = -1;
        this.f1557y = Integer.MIN_VALUE;
        this.f1558z = null;
        this.f1544A = new C0134s();
        this.f1545B = new C0135t();
        this.f1546C = 2;
        this.f1547D = new int[2];
        I I2 = J.I(context, attributeSet, i, i2);
        b1(I2.f2307a);
        boolean z2 = I2.f2309c;
        c(null);
        if (z2 != this.f1552t) {
            this.f1552t = z2;
            n0();
        }
        c1(I2.d);
    }
}
