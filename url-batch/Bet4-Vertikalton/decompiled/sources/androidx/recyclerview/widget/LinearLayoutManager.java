package androidx.recyclerview.widget;

import U.g;
import Y.V;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.C0129o;
import g0.C0133t;
import g0.C0134u;
import g0.C0135v;
import g0.C0136w;
import g0.C0137x;
import g0.K;
import g0.L;
import g0.M;
import g0.S;
import g0.X;
import g0.Y;
import g0.c0;
import java.util.List;
import w1.d;

/* loaded from: classes.dex */
public class LinearLayoutManager extends L implements X {

    /* renamed from: A, reason: collision with root package name */
    public final C0133t f1513A;

    /* renamed from: B, reason: collision with root package name */
    public final C0134u f1514B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1515C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1516D;

    /* renamed from: p, reason: collision with root package name */
    public int f1517p;

    /* renamed from: q, reason: collision with root package name */
    public C0135v f1518q;

    /* renamed from: r, reason: collision with root package name */
    public g f1519r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1520s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1521t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1522u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1523v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1524w;

    /* renamed from: x, reason: collision with root package name */
    public int f1525x;

    /* renamed from: y, reason: collision with root package name */
    public int f1526y;

    /* renamed from: z, reason: collision with root package name */
    public C0136w f1527z;

    public LinearLayoutManager(int i) {
        this.f1517p = 1;
        this.f1521t = false;
        this.f1522u = false;
        this.f1523v = false;
        this.f1524w = true;
        this.f1525x = -1;
        this.f1526y = Integer.MIN_VALUE;
        this.f1527z = null;
        this.f1513A = new C0133t();
        this.f1514B = new C0134u();
        this.f1515C = 2;
        this.f1516D = new int[2];
        b1(i);
        c(null);
        if (this.f1521t) {
            this.f1521t = false;
            n0();
        }
    }

    @Override // g0.L
    public boolean B0() {
        return this.f1527z == null && this.f1520s == this.f1523v;
    }

    public void C0(Y y2, int[] iArr) {
        int i;
        int l2 = y2.f2310a != -1 ? this.f1519r.l() : 0;
        if (this.f1518q.f2489f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void D0(Y y2, C0135v c0135v, C0129o c0129o) {
        int i = c0135v.d;
        if (i < 0 || i >= y2.b()) {
            return;
        }
        c0129o.a(i, Math.max(0, c0135v.f2490g));
    }

    public final int E0(Y y2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1519r;
        boolean z2 = !this.f1524w;
        return d.q(y2, gVar, L0(z2), K0(z2), this, this.f1524w);
    }

    public final int F0(Y y2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1519r;
        boolean z2 = !this.f1524w;
        return d.r(y2, gVar, L0(z2), K0(z2), this, this.f1524w, this.f1522u);
    }

    public final int G0(Y y2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1519r;
        boolean z2 = !this.f1524w;
        return d.s(y2, gVar, L0(z2), K0(z2), this, this.f1524w);
    }

    public final int H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1517p == 1) ? 1 : Integer.MIN_VALUE : this.f1517p == 0 ? 1 : Integer.MIN_VALUE : this.f1517p == 1 ? -1 : Integer.MIN_VALUE : this.f1517p == 0 ? -1 : Integer.MIN_VALUE : (this.f1517p != 1 && U0()) ? -1 : 1 : (this.f1517p != 1 && U0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1518q == null) {
            C0135v c0135v = new C0135v();
            c0135v.f2485a = true;
            c0135v.h = 0;
            c0135v.i = 0;
            c0135v.f2492k = null;
            this.f1518q = c0135v;
        }
    }

    public final int J0(S s2, C0135v c0135v, Y y2, boolean z2) {
        int i;
        int i2 = c0135v.f2487c;
        int i3 = c0135v.f2490g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0135v.f2490g = i3 + i2;
            }
            X0(s2, c0135v);
        }
        int i4 = c0135v.f2487c + c0135v.h;
        while (true) {
            if ((!c0135v.f2493l && i4 <= 0) || (i = c0135v.d) < 0 || i >= y2.b()) {
                break;
            }
            C0134u c0134u = this.f1514B;
            c0134u.f2482a = 0;
            c0134u.f2483b = false;
            c0134u.f2484c = false;
            c0134u.d = false;
            V0(s2, y2, c0135v, c0134u);
            if (!c0134u.f2483b) {
                int i5 = c0135v.f2486b;
                int i6 = c0134u.f2482a;
                c0135v.f2486b = (c0135v.f2489f * i6) + i5;
                if (!c0134u.f2484c || c0135v.f2492k != null || !y2.f2315g) {
                    c0135v.f2487c -= i6;
                    i4 -= i6;
                }
                int i7 = c0135v.f2490g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0135v.f2490g = i8;
                    int i9 = c0135v.f2487c;
                    if (i9 < 0) {
                        c0135v.f2490g = i8 + i9;
                    }
                    X0(s2, c0135v);
                }
                if (z2 && c0134u.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0135v.f2487c;
    }

    public final View K0(boolean z2) {
        return this.f1522u ? O0(0, v(), z2) : O0(v() - 1, -1, z2);
    }

    @Override // g0.L
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z2) {
        return this.f1522u ? O0(v() - 1, -1, z2) : O0(0, v(), z2);
    }

    public final int M0() {
        View O02 = O0(v() - 1, -1, false);
        if (O02 == null) {
            return -1;
        }
        return L.H(O02);
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        I0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1519r.e(u(i)) < this.f1519r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1517p == 0 ? this.f2277c.v(i, i2, i3, i4) : this.d.v(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z2) {
        I0();
        int i3 = z2 ? 24579 : 320;
        return this.f1517p == 0 ? this.f2277c.v(i, i2, i3, 320) : this.d.v(i, i2, i3, 320);
    }

    public View P0(S s2, Y y2, boolean z2, boolean z3) {
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
        int b2 = y2.b();
        int k2 = this.f1519r.k();
        int g2 = this.f1519r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = L.H(u2);
            int e2 = this.f1519r.e(u2);
            int b3 = this.f1519r.b(u2);
            if (H2 >= 0 && H2 < b2) {
                if (!((M) u2.getLayoutParams()).f2287a.j()) {
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

    public final int Q0(int i, S s2, Y y2, boolean z2) {
        int g2;
        int g3 = this.f1519r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -a1(-g3, s2, y2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1519r.g() - i3) <= 0) {
            return i2;
        }
        this.f1519r.p(g2);
        return g2 + i2;
    }

    public final int R0(int i, S s2, Y y2, boolean z2) {
        int k2;
        int k3 = i - this.f1519r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -a1(k3, s2, y2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1519r.k()) <= 0) {
            return i2;
        }
        this.f1519r.p(-k2);
        return i2 - k2;
    }

    @Override // g0.L
    public final void S(RecyclerView recyclerView) {
    }

    public final View S0() {
        return u(this.f1522u ? 0 : v() - 1);
    }

    @Override // g0.L
    public View T(View view, int i, S s2, Y y2) {
        int H02;
        Z0();
        if (v() == 0 || (H02 = H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        d1(H02, (int) (this.f1519r.l() * 0.33333334f), false, y2);
        C0135v c0135v = this.f1518q;
        c0135v.f2490g = Integer.MIN_VALUE;
        c0135v.f2485a = false;
        J0(s2, c0135v, y2, true);
        View N02 = H02 == -1 ? this.f1522u ? N0(v() - 1, -1) : N0(0, v()) : this.f1522u ? N0(0, v()) : N0(v() - 1, -1);
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
        return u(this.f1522u ? v() - 1 : 0);
    }

    @Override // g0.L
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View O02 = O0(0, v(), false);
            accessibilityEvent.setFromIndex(O02 == null ? -1 : L.H(O02));
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final boolean U0() {
        return C() == 1;
    }

    public void V0(S s2, Y y2, C0135v c0135v, C0134u c0134u) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0135v.b(s2);
        if (b2 == null) {
            c0134u.f2483b = true;
            return;
        }
        M m2 = (M) b2.getLayoutParams();
        if (c0135v.f2492k == null) {
            if (this.f1522u == (c0135v.f2489f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1522u == (c0135v.f2489f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        M m3 = (M) b2.getLayoutParams();
        Rect M2 = this.f2276b.M(b2);
        int i5 = M2.left + M2.right;
        int i6 = M2.top + M2.bottom;
        int w2 = L.w(d(), this.f2285n, this.f2283l, F() + E() + ((ViewGroup.MarginLayoutParams) m3).leftMargin + ((ViewGroup.MarginLayoutParams) m3).rightMargin + i5, ((ViewGroup.MarginLayoutParams) m3).width);
        int w3 = L.w(e(), this.f2286o, this.f2284m, D() + G() + ((ViewGroup.MarginLayoutParams) m3).topMargin + ((ViewGroup.MarginLayoutParams) m3).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) m3).height);
        if (w0(b2, w2, w3, m3)) {
            b2.measure(w2, w3);
        }
        c0134u.f2482a = this.f1519r.c(b2);
        if (this.f1517p == 1) {
            if (U0()) {
                i4 = this.f2285n - F();
                i = i4 - this.f1519r.d(b2);
            } else {
                i = E();
                i4 = this.f1519r.d(b2) + i;
            }
            if (c0135v.f2489f == -1) {
                i2 = c0135v.f2486b;
                i3 = i2 - c0134u.f2482a;
            } else {
                i3 = c0135v.f2486b;
                i2 = c0134u.f2482a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1519r.d(b2) + G2;
            if (c0135v.f2489f == -1) {
                int i7 = c0135v.f2486b;
                int i8 = i7 - c0134u.f2482a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0135v.f2486b;
                int i10 = c0134u.f2482a + i9;
                i = i9;
                i2 = d;
                i3 = G2;
                i4 = i10;
            }
        }
        L.N(b2, i, i3, i4, i2);
        if (m2.f2287a.j() || m2.f2287a.m()) {
            c0134u.f2484c = true;
        }
        c0134u.d = b2.hasFocusable();
    }

    public void W0(S s2, Y y2, C0133t c0133t, int i) {
    }

    public final void X0(S s2, C0135v c0135v) {
        if (!c0135v.f2485a || c0135v.f2493l) {
            return;
        }
        int i = c0135v.f2490g;
        int i2 = c0135v.i;
        if (c0135v.f2489f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1519r.f() - i) + i2;
            if (this.f1522u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1519r.e(u2) < f2 || this.f1519r.o(u2) < f2) {
                        Y0(s2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1519r.e(u3) < f2 || this.f1519r.o(u3) < f2) {
                    Y0(s2, i4, i5);
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
        if (!this.f1522u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1519r.b(u4) > i6 || this.f1519r.n(u4) > i6) {
                    Y0(s2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1519r.b(u5) > i6 || this.f1519r.n(u5) > i6) {
                Y0(s2, i8, i9);
                return;
            }
        }
    }

    public final void Y0(S s2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                l0(i);
                s2.h(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            l0(i3);
            s2.h(u3);
        }
    }

    public final void Z0() {
        if (this.f1517p == 1 || !U0()) {
            this.f1522u = this.f1521t;
        } else {
            this.f1522u = !this.f1521t;
        }
    }

    @Override // g0.X
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < L.H(u(0))) != this.f1522u ? -1 : 1;
        return this.f1517p == 0 ? new PointF(i2, RecyclerView.f1530C0) : new PointF(RecyclerView.f1530C0, i2);
    }

    public final int a1(int i, S s2, Y y2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        I0();
        this.f1518q.f2485a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        d1(i2, abs, true, y2);
        C0135v c0135v = this.f1518q;
        int J02 = J0(s2, c0135v, y2, false) + c0135v.f2490g;
        if (J02 < 0) {
            return 0;
        }
        if (abs > J02) {
            i = i2 * J02;
        }
        this.f1519r.p(-i);
        this.f1518q.f2491j = i;
        return i;
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(V.e("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1517p || this.f1519r == null) {
            g a2 = g.a(this, i);
            this.f1519r = a2;
            this.f1513A.f2478a = a2;
            this.f1517p = i;
            n0();
        }
    }

    @Override // g0.L
    public final void c(String str) {
        if (this.f1527z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z2) {
        c(null);
        if (this.f1523v == z2) {
            return;
        }
        this.f1523v = z2;
        n0();
    }

    @Override // g0.L
    public final boolean d() {
        return this.f1517p == 0;
    }

    @Override // g0.L
    public void d0(S s2, Y y2) {
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
        if (!(this.f1527z == null && this.f1525x == -1) && y2.b() == 0) {
            i0(s2);
            return;
        }
        C0136w c0136w = this.f1527z;
        if (c0136w != null && (i8 = c0136w.f2494a) >= 0) {
            this.f1525x = i8;
        }
        I0();
        this.f1518q.f2485a = false;
        Z0();
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2275a.f2357c.contains(focusedChild)) {
            focusedChild = null;
        }
        C0133t c0133t = this.f1513A;
        if (!c0133t.f2481e || this.f1525x != -1 || this.f1527z != null) {
            c0133t.d();
            c0133t.d = this.f1522u ^ this.f1523v;
            if (!y2.f2315g && (i = this.f1525x) != -1) {
                if (i < 0 || i >= y2.b()) {
                    this.f1525x = -1;
                    this.f1526y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1525x;
                    c0133t.f2479b = i10;
                    C0136w c0136w2 = this.f1527z;
                    if (c0136w2 != null && c0136w2.f2494a >= 0) {
                        boolean z2 = c0136w2.f2496c;
                        c0133t.d = z2;
                        if (z2) {
                            c0133t.f2480c = this.f1519r.g() - this.f1527z.f2495b;
                        } else {
                            c0133t.f2480c = this.f1519r.k() + this.f1527z.f2495b;
                        }
                    } else if (this.f1526y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                c0133t.d = (this.f1525x < L.H(u(0))) == this.f1522u;
                            }
                            c0133t.a();
                        } else if (this.f1519r.c(q3) > this.f1519r.l()) {
                            c0133t.a();
                        } else if (this.f1519r.e(q3) - this.f1519r.k() < 0) {
                            c0133t.f2480c = this.f1519r.k();
                            c0133t.d = false;
                        } else if (this.f1519r.g() - this.f1519r.b(q3) < 0) {
                            c0133t.f2480c = this.f1519r.g();
                            c0133t.d = true;
                        } else {
                            c0133t.f2480c = c0133t.d ? this.f1519r.m() + this.f1519r.b(q3) : this.f1519r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1522u;
                        c0133t.d = z3;
                        if (z3) {
                            c0133t.f2480c = this.f1519r.g() - this.f1526y;
                        } else {
                            c0133t.f2480c = this.f1519r.k() + this.f1526y;
                        }
                    }
                    c0133t.f2481e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2276b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f2275a.f2357c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    M m2 = (M) focusedChild2.getLayoutParams();
                    if (!m2.f2287a.j() && m2.f2287a.c() >= 0 && m2.f2287a.c() < y2.b()) {
                        c0133t.c(focusedChild2, L.H(focusedChild2));
                        c0133t.f2481e = true;
                    }
                }
                boolean z4 = this.f1520s;
                boolean z5 = this.f1523v;
                if (z4 == z5 && (P02 = P0(s2, y2, c0133t.d, z5)) != null) {
                    c0133t.b(P02, L.H(P02));
                    if (!y2.f2315g && B0()) {
                        int e3 = this.f1519r.e(P02);
                        int b2 = this.f1519r.b(P02);
                        int k2 = this.f1519r.k();
                        int g2 = this.f1519r.g();
                        boolean z6 = b2 <= k2 && e3 < k2;
                        boolean z7 = e3 >= g2 && b2 > g2;
                        if (z6 || z7) {
                            if (c0133t.d) {
                                k2 = g2;
                            }
                            c0133t.f2480c = k2;
                        }
                    }
                    c0133t.f2481e = true;
                }
            }
            c0133t.a();
            c0133t.f2479b = this.f1523v ? y2.b() - 1 : 0;
            c0133t.f2481e = true;
        } else if (focusedChild != null && (this.f1519r.e(focusedChild) >= this.f1519r.g() || this.f1519r.b(focusedChild) <= this.f1519r.k())) {
            c0133t.c(focusedChild, L.H(focusedChild));
        }
        C0135v c0135v = this.f1518q;
        c0135v.f2489f = c0135v.f2491j >= 0 ? 1 : -1;
        int[] iArr = this.f1516D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(y2, iArr);
        int k3 = this.f1519r.k() + Math.max(0, iArr[0]);
        int h = this.f1519r.h() + Math.max(0, iArr[1]);
        if (y2.f2315g && (i6 = this.f1525x) != -1 && this.f1526y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1522u) {
                i7 = this.f1519r.g() - this.f1519r.b(q2);
                e2 = this.f1526y;
            } else {
                e2 = this.f1519r.e(q2) - this.f1519r.k();
                i7 = this.f1526y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k3 += i11;
            } else {
                h -= i11;
            }
        }
        if (!c0133t.d ? !this.f1522u : this.f1522u) {
            i9 = 1;
        }
        W0(s2, y2, c0133t, i9);
        p(s2);
        this.f1518q.f2493l = this.f1519r.i() == 0 && this.f1519r.f() == 0;
        this.f1518q.getClass();
        this.f1518q.i = 0;
        if (c0133t.d) {
            f1(c0133t.f2479b, c0133t.f2480c);
            C0135v c0135v2 = this.f1518q;
            c0135v2.h = k3;
            J0(s2, c0135v2, y2, false);
            C0135v c0135v3 = this.f1518q;
            i3 = c0135v3.f2486b;
            int i12 = c0135v3.d;
            int i13 = c0135v3.f2487c;
            if (i13 > 0) {
                h += i13;
            }
            e1(c0133t.f2479b, c0133t.f2480c);
            C0135v c0135v4 = this.f1518q;
            c0135v4.h = h;
            c0135v4.d += c0135v4.f2488e;
            J0(s2, c0135v4, y2, false);
            C0135v c0135v5 = this.f1518q;
            i2 = c0135v5.f2486b;
            int i14 = c0135v5.f2487c;
            if (i14 > 0) {
                f1(i12, i3);
                C0135v c0135v6 = this.f1518q;
                c0135v6.h = i14;
                J0(s2, c0135v6, y2, false);
                i3 = this.f1518q.f2486b;
            }
        } else {
            e1(c0133t.f2479b, c0133t.f2480c);
            C0135v c0135v7 = this.f1518q;
            c0135v7.h = h;
            J0(s2, c0135v7, y2, false);
            C0135v c0135v8 = this.f1518q;
            i2 = c0135v8.f2486b;
            int i15 = c0135v8.d;
            int i16 = c0135v8.f2487c;
            if (i16 > 0) {
                k3 += i16;
            }
            f1(c0133t.f2479b, c0133t.f2480c);
            C0135v c0135v9 = this.f1518q;
            c0135v9.h = k3;
            c0135v9.d += c0135v9.f2488e;
            J0(s2, c0135v9, y2, false);
            C0135v c0135v10 = this.f1518q;
            int i17 = c0135v10.f2486b;
            int i18 = c0135v10.f2487c;
            if (i18 > 0) {
                e1(i15, i2);
                C0135v c0135v11 = this.f1518q;
                c0135v11.h = i18;
                J0(s2, c0135v11, y2, false);
                i2 = this.f1518q.f2486b;
            }
            i3 = i17;
        }
        if (v() > 0) {
            if (this.f1522u ^ this.f1523v) {
                int Q03 = Q0(i2, s2, y2, true);
                i4 = i3 + Q03;
                i5 = i2 + Q03;
                Q02 = R0(i4, s2, y2, false);
            } else {
                int R02 = R0(i3, s2, y2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                Q02 = Q0(i5, s2, y2, false);
            }
            i3 = i4 + Q02;
            i2 = i5 + Q02;
        }
        if (y2.f2317k && v() != 0 && !y2.f2315g && B0()) {
            List list2 = s2.d;
            int size = list2.size();
            int H2 = L.H(u(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                c0 c0Var = (c0) list2.get(i21);
                if (!c0Var.j()) {
                    boolean z8 = c0Var.c() < H2;
                    boolean z9 = this.f1522u;
                    View view = c0Var.f2339a;
                    if (z8 != z9) {
                        i19 += this.f1519r.c(view);
                    } else {
                        i20 += this.f1519r.c(view);
                    }
                }
            }
            this.f1518q.f2492k = list2;
            if (i19 > 0) {
                f1(L.H(T0()), i3);
                C0135v c0135v12 = this.f1518q;
                c0135v12.h = i19;
                c0135v12.f2487c = 0;
                c0135v12.a(null);
                J0(s2, this.f1518q, y2, false);
            }
            if (i20 > 0) {
                e1(L.H(S0()), i2);
                C0135v c0135v13 = this.f1518q;
                c0135v13.h = i20;
                c0135v13.f2487c = 0;
                list = null;
                c0135v13.a(null);
                J0(s2, this.f1518q, y2, false);
            } else {
                list = null;
            }
            this.f1518q.f2492k = list;
        }
        if (y2.f2315g) {
            c0133t.d();
        } else {
            g gVar = this.f1519r;
            gVar.f843a = gVar.l();
        }
        this.f1520s = this.f1523v;
    }

    public final void d1(int i, int i2, boolean z2, Y y2) {
        int k2;
        this.f1518q.f2493l = this.f1519r.i() == 0 && this.f1519r.f() == 0;
        this.f1518q.f2489f = i;
        int[] iArr = this.f1516D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(y2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0135v c0135v = this.f1518q;
        int i3 = z3 ? max2 : max;
        c0135v.h = i3;
        if (!z3) {
            max = max2;
        }
        c0135v.i = max;
        if (z3) {
            c0135v.h = this.f1519r.h() + i3;
            View S02 = S0();
            C0135v c0135v2 = this.f1518q;
            c0135v2.f2488e = this.f1522u ? -1 : 1;
            int H2 = L.H(S02);
            C0135v c0135v3 = this.f1518q;
            c0135v2.d = H2 + c0135v3.f2488e;
            c0135v3.f2486b = this.f1519r.b(S02);
            k2 = this.f1519r.b(S02) - this.f1519r.g();
        } else {
            View T02 = T0();
            C0135v c0135v4 = this.f1518q;
            c0135v4.h = this.f1519r.k() + c0135v4.h;
            C0135v c0135v5 = this.f1518q;
            c0135v5.f2488e = this.f1522u ? 1 : -1;
            int H3 = L.H(T02);
            C0135v c0135v6 = this.f1518q;
            c0135v5.d = H3 + c0135v6.f2488e;
            c0135v6.f2486b = this.f1519r.e(T02);
            k2 = (-this.f1519r.e(T02)) + this.f1519r.k();
        }
        C0135v c0135v7 = this.f1518q;
        c0135v7.f2487c = i2;
        if (z2) {
            c0135v7.f2487c = i2 - k2;
        }
        c0135v7.f2490g = k2;
    }

    @Override // g0.L
    public final boolean e() {
        return this.f1517p == 1;
    }

    @Override // g0.L
    public void e0(Y y2) {
        this.f1527z = null;
        this.f1525x = -1;
        this.f1526y = Integer.MIN_VALUE;
        this.f1513A.d();
    }

    public final void e1(int i, int i2) {
        this.f1518q.f2487c = this.f1519r.g() - i2;
        C0135v c0135v = this.f1518q;
        c0135v.f2488e = this.f1522u ? -1 : 1;
        c0135v.d = i;
        c0135v.f2489f = 1;
        c0135v.f2486b = i2;
        c0135v.f2490g = Integer.MIN_VALUE;
    }

    @Override // g0.L
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof C0136w) {
            C0136w c0136w = (C0136w) parcelable;
            this.f1527z = c0136w;
            if (this.f1525x != -1) {
                c0136w.f2494a = -1;
            }
            n0();
        }
    }

    public final void f1(int i, int i2) {
        this.f1518q.f2487c = i2 - this.f1519r.k();
        C0135v c0135v = this.f1518q;
        c0135v.d = i;
        c0135v.f2488e = this.f1522u ? 1 : -1;
        c0135v.f2489f = -1;
        c0135v.f2486b = i2;
        c0135v.f2490g = Integer.MIN_VALUE;
    }

    @Override // g0.L
    public final Parcelable g0() {
        C0136w c0136w = this.f1527z;
        if (c0136w != null) {
            C0136w c0136w2 = new C0136w();
            c0136w2.f2494a = c0136w.f2494a;
            c0136w2.f2495b = c0136w.f2495b;
            c0136w2.f2496c = c0136w.f2496c;
            return c0136w2;
        }
        C0136w c0136w3 = new C0136w();
        if (v() > 0) {
            I0();
            boolean z2 = this.f1520s ^ this.f1522u;
            c0136w3.f2496c = z2;
            if (z2) {
                View S02 = S0();
                c0136w3.f2495b = this.f1519r.g() - this.f1519r.b(S02);
                c0136w3.f2494a = L.H(S02);
            } else {
                View T02 = T0();
                c0136w3.f2494a = L.H(T02);
                c0136w3.f2495b = this.f1519r.e(T02) - this.f1519r.k();
            }
        } else {
            c0136w3.f2494a = -1;
        }
        return c0136w3;
    }

    @Override // g0.L
    public final void h(int i, int i2, Y y2, C0129o c0129o) {
        if (this.f1517p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, y2);
        D0(y2, this.f1518q, c0129o);
    }

    @Override // g0.L
    public final void i(int i, C0129o c0129o) {
        boolean z2;
        int i2;
        C0136w c0136w = this.f1527z;
        if (c0136w == null || (i2 = c0136w.f2494a) < 0) {
            Z0();
            z2 = this.f1522u;
            i2 = this.f1525x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0136w.f2496c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1515C && i2 >= 0 && i2 < i; i4++) {
            c0129o.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // g0.L
    public final int j(Y y2) {
        return E0(y2);
    }

    @Override // g0.L
    public int k(Y y2) {
        return F0(y2);
    }

    @Override // g0.L
    public int l(Y y2) {
        return G0(y2);
    }

    @Override // g0.L
    public final int m(Y y2) {
        return E0(y2);
    }

    @Override // g0.L
    public int n(Y y2) {
        return F0(y2);
    }

    @Override // g0.L
    public int o(Y y2) {
        return G0(y2);
    }

    @Override // g0.L
    public int o0(int i, S s2, Y y2) {
        if (this.f1517p == 1) {
            return 0;
        }
        return a1(i, s2, y2);
    }

    @Override // g0.L
    public final void p0(int i) {
        this.f1525x = i;
        this.f1526y = Integer.MIN_VALUE;
        C0136w c0136w = this.f1527z;
        if (c0136w != null) {
            c0136w.f2494a = -1;
        }
        n0();
    }

    @Override // g0.L
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - L.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (L.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // g0.L
    public int q0(int i, S s2, Y y2) {
        if (this.f1517p == 0) {
            return 0;
        }
        return a1(i, s2, y2);
    }

    @Override // g0.L
    public M r() {
        return new M(-2, -2);
    }

    @Override // g0.L
    public final boolean x0() {
        if (this.f2284m == 1073741824 || this.f2283l == 1073741824) {
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

    @Override // g0.L
    public void z0(RecyclerView recyclerView, int i) {
        C0137x c0137x = new C0137x(recyclerView.getContext());
        c0137x.f2497a = i;
        A0(c0137x);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1517p = 1;
        this.f1521t = false;
        this.f1522u = false;
        this.f1523v = false;
        this.f1524w = true;
        this.f1525x = -1;
        this.f1526y = Integer.MIN_VALUE;
        this.f1527z = null;
        this.f1513A = new C0133t();
        this.f1514B = new C0134u();
        this.f1515C = 2;
        this.f1516D = new int[2];
        K I2 = L.I(context, attributeSet, i, i2);
        b1(I2.f2272a);
        boolean z2 = I2.f2274c;
        c(null);
        if (z2 != this.f1521t) {
            this.f1521t = z2;
            n0();
        }
        c1(I2.d);
    }
}
