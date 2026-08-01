package androidx.recyclerview.widget;

import V.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h0.C0132n;
import h0.C0136s;
import h0.C0137t;
import h0.C0138u;
import h0.C0139v;
import h0.C0140w;
import h0.I;
import h0.J;
import h0.K;
import h0.P;
import h0.V;
import h0.W;
import h0.a0;
import h0.d0;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends J implements V {

    /* renamed from: A, reason: collision with root package name */
    public final C0136s f1607A;

    /* renamed from: B, reason: collision with root package name */
    public final C0137t f1608B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1609C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1610D;

    /* renamed from: p, reason: collision with root package name */
    public int f1611p;

    /* renamed from: q, reason: collision with root package name */
    public C0138u f1612q;

    /* renamed from: r, reason: collision with root package name */
    public g f1613r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1614s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1615t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1616u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1617v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1618w;

    /* renamed from: x, reason: collision with root package name */
    public int f1619x;

    /* renamed from: y, reason: collision with root package name */
    public int f1620y;

    /* renamed from: z, reason: collision with root package name */
    public C0139v f1621z;

    public LinearLayoutManager(int i) {
        this.f1611p = 1;
        this.f1615t = false;
        this.f1616u = false;
        this.f1617v = false;
        this.f1618w = true;
        this.f1619x = -1;
        this.f1620y = Integer.MIN_VALUE;
        this.f1621z = null;
        this.f1607A = new C0136s();
        this.f1608B = new C0137t();
        this.f1609C = 2;
        this.f1610D = new int[2];
        b1(i);
        c(null);
        if (this.f1615t) {
            this.f1615t = false;
            n0();
        }
    }

    @Override // h0.J
    public boolean B0() {
        return this.f1621z == null && this.f1614s == this.f1617v;
    }

    public void C0(W w2, int[] iArr) {
        int i;
        int l2 = w2.f2433a != -1 ? this.f1613r.l() : 0;
        if (this.f1612q.f2616f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void D0(W w2, C0138u c0138u, C0132n c0132n) {
        int i = c0138u.d;
        if (i < 0 || i >= w2.b()) {
            return;
        }
        c0132n.a(i, Math.max(0, c0138u.f2617g));
    }

    public final int E0(W w2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1613r;
        boolean z2 = !this.f1618w;
        return d0.e(w2, gVar, L0(z2), K0(z2), this, this.f1618w);
    }

    public final int F0(W w2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1613r;
        boolean z2 = !this.f1618w;
        return d0.f(w2, gVar, L0(z2), K0(z2), this, this.f1618w, this.f1616u);
    }

    public final int G0(W w2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1613r;
        boolean z2 = !this.f1618w;
        return d0.g(w2, gVar, L0(z2), K0(z2), this, this.f1618w);
    }

    public final int H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1611p == 1) ? 1 : Integer.MIN_VALUE : this.f1611p == 0 ? 1 : Integer.MIN_VALUE : this.f1611p == 1 ? -1 : Integer.MIN_VALUE : this.f1611p == 0 ? -1 : Integer.MIN_VALUE : (this.f1611p != 1 && U0()) ? -1 : 1 : (this.f1611p != 1 && U0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1612q == null) {
            C0138u c0138u = new C0138u();
            c0138u.f2612a = true;
            c0138u.f2618h = 0;
            c0138u.i = 0;
            c0138u.f2620k = null;
            this.f1612q = c0138u;
        }
    }

    public final int J0(P p2, C0138u c0138u, W w2, boolean z2) {
        int i;
        int i2 = c0138u.f2614c;
        int i3 = c0138u.f2617g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0138u.f2617g = i3 + i2;
            }
            X0(p2, c0138u);
        }
        int i4 = c0138u.f2614c + c0138u.f2618h;
        while (true) {
            if ((!c0138u.f2621l && i4 <= 0) || (i = c0138u.d) < 0 || i >= w2.b()) {
                break;
            }
            C0137t c0137t = this.f1608B;
            c0137t.f2609a = 0;
            c0137t.f2610b = false;
            c0137t.f2611c = false;
            c0137t.d = false;
            V0(p2, w2, c0138u, c0137t);
            if (!c0137t.f2610b) {
                int i5 = c0138u.f2613b;
                int i6 = c0137t.f2609a;
                c0138u.f2613b = (c0138u.f2616f * i6) + i5;
                if (!c0137t.f2611c || c0138u.f2620k != null || !w2.f2438g) {
                    c0138u.f2614c -= i6;
                    i4 -= i6;
                }
                int i7 = c0138u.f2617g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0138u.f2617g = i8;
                    int i9 = c0138u.f2614c;
                    if (i9 < 0) {
                        c0138u.f2617g = i8 + i9;
                    }
                    X0(p2, c0138u);
                }
                if (z2 && c0137t.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0138u.f2614c;
    }

    public final View K0(boolean z2) {
        return this.f1616u ? O0(0, v(), z2) : O0(v() - 1, -1, z2);
    }

    @Override // h0.J
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z2) {
        return this.f1616u ? O0(v() - 1, -1, z2) : O0(0, v(), z2);
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
        if (this.f1613r.e(u(i)) < this.f1613r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1611p == 0 ? this.f2398c.v(i, i2, i3, i4) : this.d.v(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z2) {
        I0();
        int i3 = z2 ? 24579 : 320;
        return this.f1611p == 0 ? this.f2398c.v(i, i2, i3, 320) : this.d.v(i, i2, i3, 320);
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
        int k2 = this.f1613r.k();
        int g2 = this.f1613r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = J.H(u2);
            int e2 = this.f1613r.e(u2);
            int b3 = this.f1613r.b(u2);
            if (H2 >= 0 && H2 < b2) {
                if (!((K) u2.getLayoutParams()).f2409a.i()) {
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
        int g3 = this.f1613r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -a1(-g3, p2, w2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1613r.g() - i3) <= 0) {
            return i2;
        }
        this.f1613r.p(g2);
        return g2 + i2;
    }

    public final int R0(int i, P p2, W w2, boolean z2) {
        int k2;
        int k3 = i - this.f1613r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -a1(k3, p2, w2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1613r.k()) <= 0) {
            return i2;
        }
        this.f1613r.p(-k2);
        return i2 - k2;
    }

    @Override // h0.J
    public final void S(RecyclerView recyclerView) {
    }

    public final View S0() {
        return u(this.f1616u ? 0 : v() - 1);
    }

    @Override // h0.J
    public View T(View view, int i, P p2, W w2) {
        int H02;
        Z0();
        if (v() == 0 || (H02 = H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        d1(H02, (int) (this.f1613r.l() * 0.33333334f), false, w2);
        C0138u c0138u = this.f1612q;
        c0138u.f2617g = Integer.MIN_VALUE;
        c0138u.f2612a = false;
        J0(p2, c0138u, w2, true);
        View N02 = H02 == -1 ? this.f1616u ? N0(v() - 1, -1) : N0(0, v()) : this.f1616u ? N0(0, v()) : N0(v() - 1, -1);
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
        return u(this.f1616u ? v() - 1 : 0);
    }

    @Override // h0.J
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

    public void V0(P p2, W w2, C0138u c0138u, C0137t c0137t) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0138u.b(p2);
        if (b2 == null) {
            c0137t.f2610b = true;
            return;
        }
        K k2 = (K) b2.getLayoutParams();
        if (c0138u.f2620k == null) {
            if (this.f1616u == (c0138u.f2616f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1616u == (c0138u.f2616f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        K k3 = (K) b2.getLayoutParams();
        Rect M2 = this.f2397b.M(b2);
        int i5 = M2.left + M2.right;
        int i6 = M2.top + M2.bottom;
        int w3 = J.w(d(), this.f2407n, this.f2405l, F() + E() + ((ViewGroup.MarginLayoutParams) k3).leftMargin + ((ViewGroup.MarginLayoutParams) k3).rightMargin + i5, ((ViewGroup.MarginLayoutParams) k3).width);
        int w4 = J.w(e(), this.f2408o, this.f2406m, D() + G() + ((ViewGroup.MarginLayoutParams) k3).topMargin + ((ViewGroup.MarginLayoutParams) k3).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) k3).height);
        if (w0(b2, w3, w4, k3)) {
            b2.measure(w3, w4);
        }
        c0137t.f2609a = this.f1613r.c(b2);
        if (this.f1611p == 1) {
            if (U0()) {
                i4 = this.f2407n - F();
                i = i4 - this.f1613r.d(b2);
            } else {
                i = E();
                i4 = this.f1613r.d(b2) + i;
            }
            if (c0138u.f2616f == -1) {
                i2 = c0138u.f2613b;
                i3 = i2 - c0137t.f2609a;
            } else {
                i3 = c0138u.f2613b;
                i2 = c0137t.f2609a + i3;
            }
        } else {
            int G = G();
            int d = this.f1613r.d(b2) + G;
            if (c0138u.f2616f == -1) {
                int i7 = c0138u.f2613b;
                int i8 = i7 - c0137t.f2609a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = G;
            } else {
                int i9 = c0138u.f2613b;
                int i10 = c0137t.f2609a + i9;
                i = i9;
                i2 = d;
                i3 = G;
                i4 = i10;
            }
        }
        J.N(b2, i, i3, i4, i2);
        if (k2.f2409a.i() || k2.f2409a.l()) {
            c0137t.f2611c = true;
        }
        c0137t.d = b2.hasFocusable();
    }

    public void W0(P p2, W w2, C0136s c0136s, int i) {
    }

    public final void X0(P p2, C0138u c0138u) {
        if (!c0138u.f2612a || c0138u.f2621l) {
            return;
        }
        int i = c0138u.f2617g;
        int i2 = c0138u.i;
        if (c0138u.f2616f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1613r.f() - i) + i2;
            if (this.f1616u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1613r.e(u2) < f2 || this.f1613r.o(u2) < f2) {
                        Y0(p2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1613r.e(u3) < f2 || this.f1613r.o(u3) < f2) {
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
        if (!this.f1616u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1613r.b(u4) > i6 || this.f1613r.n(u4) > i6) {
                    Y0(p2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1613r.b(u5) > i6 || this.f1613r.n(u5) > i6) {
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
        if (this.f1611p == 1 || !U0()) {
            this.f1616u = this.f1615t;
        } else {
            this.f1616u = !this.f1615t;
        }
    }

    @Override // h0.V
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < J.H(u(0))) != this.f1616u ? -1 : 1;
        return this.f1611p == 0 ? new PointF(i2, RecyclerView.A0) : new PointF(RecyclerView.A0, i2);
    }

    public final int a1(int i, P p2, W w2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        I0();
        this.f1612q.f2612a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        d1(i2, abs, true, w2);
        C0138u c0138u = this.f1612q;
        int J02 = J0(p2, c0138u, w2, false) + c0138u.f2617g;
        if (J02 < 0) {
            return 0;
        }
        if (abs > J02) {
            i = i2 * J02;
        }
        this.f1613r.p(-i);
        this.f1612q.f2619j = i;
        return i;
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Z.V.e("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1611p || this.f1613r == null) {
            g a2 = g.a(this, i);
            this.f1613r = a2;
            this.f1607A.f2605a = a2;
            this.f1611p = i;
            n0();
        }
    }

    @Override // h0.J
    public final void c(String str) {
        if (this.f1621z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z2) {
        c(null);
        if (this.f1617v == z2) {
            return;
        }
        this.f1617v = z2;
        n0();
    }

    @Override // h0.J
    public final boolean d() {
        return this.f1611p == 0;
    }

    @Override // h0.J
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
        if (!(this.f1621z == null && this.f1619x == -1) && w2.b() == 0) {
            i0(p2);
            return;
        }
        C0139v c0139v = this.f1621z;
        if (c0139v != null && (i8 = c0139v.f2622a) >= 0) {
            this.f1619x = i8;
        }
        I0();
        this.f1612q.f2612a = false;
        Z0();
        RecyclerView recyclerView = this.f2397b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2396a.f2478c.contains(focusedChild)) {
            focusedChild = null;
        }
        C0136s c0136s = this.f1607A;
        if (!c0136s.f2608e || this.f1619x != -1 || this.f1621z != null) {
            c0136s.d();
            c0136s.d = this.f1616u ^ this.f1617v;
            if (!w2.f2438g && (i = this.f1619x) != -1) {
                if (i < 0 || i >= w2.b()) {
                    this.f1619x = -1;
                    this.f1620y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1619x;
                    c0136s.f2606b = i10;
                    C0139v c0139v2 = this.f1621z;
                    if (c0139v2 != null && c0139v2.f2622a >= 0) {
                        boolean z2 = c0139v2.f2624c;
                        c0136s.d = z2;
                        if (z2) {
                            c0136s.f2607c = this.f1613r.g() - this.f1621z.f2623b;
                        } else {
                            c0136s.f2607c = this.f1613r.k() + this.f1621z.f2623b;
                        }
                    } else if (this.f1620y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                c0136s.d = (this.f1619x < J.H(u(0))) == this.f1616u;
                            }
                            c0136s.a();
                        } else if (this.f1613r.c(q3) > this.f1613r.l()) {
                            c0136s.a();
                        } else if (this.f1613r.e(q3) - this.f1613r.k() < 0) {
                            c0136s.f2607c = this.f1613r.k();
                            c0136s.d = false;
                        } else if (this.f1613r.g() - this.f1613r.b(q3) < 0) {
                            c0136s.f2607c = this.f1613r.g();
                            c0136s.d = true;
                        } else {
                            c0136s.f2607c = c0136s.d ? this.f1613r.m() + this.f1613r.b(q3) : this.f1613r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1616u;
                        c0136s.d = z3;
                        if (z3) {
                            c0136s.f2607c = this.f1613r.g() - this.f1620y;
                        } else {
                            c0136s.f2607c = this.f1613r.k() + this.f1620y;
                        }
                    }
                    c0136s.f2608e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2397b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f2396a.f2478c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    K k2 = (K) focusedChild2.getLayoutParams();
                    if (!k2.f2409a.i() && k2.f2409a.b() >= 0 && k2.f2409a.b() < w2.b()) {
                        c0136s.c(focusedChild2, J.H(focusedChild2));
                        c0136s.f2608e = true;
                    }
                }
                boolean z4 = this.f1614s;
                boolean z5 = this.f1617v;
                if (z4 == z5 && (P02 = P0(p2, w2, c0136s.d, z5)) != null) {
                    c0136s.b(P02, J.H(P02));
                    if (!w2.f2438g && B0()) {
                        int e3 = this.f1613r.e(P02);
                        int b2 = this.f1613r.b(P02);
                        int k3 = this.f1613r.k();
                        int g2 = this.f1613r.g();
                        boolean z6 = b2 <= k3 && e3 < k3;
                        boolean z7 = e3 >= g2 && b2 > g2;
                        if (z6 || z7) {
                            if (c0136s.d) {
                                k3 = g2;
                            }
                            c0136s.f2607c = k3;
                        }
                    }
                    c0136s.f2608e = true;
                }
            }
            c0136s.a();
            c0136s.f2606b = this.f1617v ? w2.b() - 1 : 0;
            c0136s.f2608e = true;
        } else if (focusedChild != null && (this.f1613r.e(focusedChild) >= this.f1613r.g() || this.f1613r.b(focusedChild) <= this.f1613r.k())) {
            c0136s.c(focusedChild, J.H(focusedChild));
        }
        C0138u c0138u = this.f1612q;
        c0138u.f2616f = c0138u.f2619j >= 0 ? 1 : -1;
        int[] iArr = this.f1610D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(w2, iArr);
        int k4 = this.f1613r.k() + Math.max(0, iArr[0]);
        int h2 = this.f1613r.h() + Math.max(0, iArr[1]);
        if (w2.f2438g && (i6 = this.f1619x) != -1 && this.f1620y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1616u) {
                i7 = this.f1613r.g() - this.f1613r.b(q2);
                e2 = this.f1620y;
            } else {
                e2 = this.f1613r.e(q2) - this.f1613r.k();
                i7 = this.f1620y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k4 += i11;
            } else {
                h2 -= i11;
            }
        }
        if (!c0136s.d ? !this.f1616u : this.f1616u) {
            i9 = 1;
        }
        W0(p2, w2, c0136s, i9);
        p(p2);
        this.f1612q.f2621l = this.f1613r.i() == 0 && this.f1613r.f() == 0;
        this.f1612q.getClass();
        this.f1612q.i = 0;
        if (c0136s.d) {
            f1(c0136s.f2606b, c0136s.f2607c);
            C0138u c0138u2 = this.f1612q;
            c0138u2.f2618h = k4;
            J0(p2, c0138u2, w2, false);
            C0138u c0138u3 = this.f1612q;
            i3 = c0138u3.f2613b;
            int i12 = c0138u3.d;
            int i13 = c0138u3.f2614c;
            if (i13 > 0) {
                h2 += i13;
            }
            e1(c0136s.f2606b, c0136s.f2607c);
            C0138u c0138u4 = this.f1612q;
            c0138u4.f2618h = h2;
            c0138u4.d += c0138u4.f2615e;
            J0(p2, c0138u4, w2, false);
            C0138u c0138u5 = this.f1612q;
            i2 = c0138u5.f2613b;
            int i14 = c0138u5.f2614c;
            if (i14 > 0) {
                f1(i12, i3);
                C0138u c0138u6 = this.f1612q;
                c0138u6.f2618h = i14;
                J0(p2, c0138u6, w2, false);
                i3 = this.f1612q.f2613b;
            }
        } else {
            e1(c0136s.f2606b, c0136s.f2607c);
            C0138u c0138u7 = this.f1612q;
            c0138u7.f2618h = h2;
            J0(p2, c0138u7, w2, false);
            C0138u c0138u8 = this.f1612q;
            i2 = c0138u8.f2613b;
            int i15 = c0138u8.d;
            int i16 = c0138u8.f2614c;
            if (i16 > 0) {
                k4 += i16;
            }
            f1(c0136s.f2606b, c0136s.f2607c);
            C0138u c0138u9 = this.f1612q;
            c0138u9.f2618h = k4;
            c0138u9.d += c0138u9.f2615e;
            J0(p2, c0138u9, w2, false);
            C0138u c0138u10 = this.f1612q;
            int i17 = c0138u10.f2613b;
            int i18 = c0138u10.f2614c;
            if (i18 > 0) {
                e1(i15, i2);
                C0138u c0138u11 = this.f1612q;
                c0138u11.f2618h = i18;
                J0(p2, c0138u11, w2, false);
                i2 = this.f1612q.f2613b;
            }
            i3 = i17;
        }
        if (v() > 0) {
            if (this.f1616u ^ this.f1617v) {
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
        if (w2.f2441k && v() != 0 && !w2.f2438g && B0()) {
            List list2 = p2.d;
            int size = list2.size();
            int H2 = J.H(u(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                a0 a0Var = (a0) list2.get(i21);
                if (!a0Var.i()) {
                    boolean z8 = a0Var.b() < H2;
                    boolean z9 = this.f1616u;
                    View view = a0Var.f2455a;
                    if (z8 != z9) {
                        i19 += this.f1613r.c(view);
                    } else {
                        i20 += this.f1613r.c(view);
                    }
                }
            }
            this.f1612q.f2620k = list2;
            if (i19 > 0) {
                f1(J.H(T0()), i3);
                C0138u c0138u12 = this.f1612q;
                c0138u12.f2618h = i19;
                c0138u12.f2614c = 0;
                c0138u12.a(null);
                J0(p2, this.f1612q, w2, false);
            }
            if (i20 > 0) {
                e1(J.H(S0()), i2);
                C0138u c0138u13 = this.f1612q;
                c0138u13.f2618h = i20;
                c0138u13.f2614c = 0;
                list = null;
                c0138u13.a(null);
                J0(p2, this.f1612q, w2, false);
            } else {
                list = null;
            }
            this.f1612q.f2620k = list;
        }
        if (w2.f2438g) {
            c0136s.d();
        } else {
            g gVar = this.f1613r;
            gVar.f893a = gVar.l();
        }
        this.f1614s = this.f1617v;
    }

    public final void d1(int i, int i2, boolean z2, W w2) {
        int k2;
        this.f1612q.f2621l = this.f1613r.i() == 0 && this.f1613r.f() == 0;
        this.f1612q.f2616f = i;
        int[] iArr = this.f1610D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(w2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0138u c0138u = this.f1612q;
        int i3 = z3 ? max2 : max;
        c0138u.f2618h = i3;
        if (!z3) {
            max = max2;
        }
        c0138u.i = max;
        if (z3) {
            c0138u.f2618h = this.f1613r.h() + i3;
            View S02 = S0();
            C0138u c0138u2 = this.f1612q;
            c0138u2.f2615e = this.f1616u ? -1 : 1;
            int H2 = J.H(S02);
            C0138u c0138u3 = this.f1612q;
            c0138u2.d = H2 + c0138u3.f2615e;
            c0138u3.f2613b = this.f1613r.b(S02);
            k2 = this.f1613r.b(S02) - this.f1613r.g();
        } else {
            View T02 = T0();
            C0138u c0138u4 = this.f1612q;
            c0138u4.f2618h = this.f1613r.k() + c0138u4.f2618h;
            C0138u c0138u5 = this.f1612q;
            c0138u5.f2615e = this.f1616u ? 1 : -1;
            int H3 = J.H(T02);
            C0138u c0138u6 = this.f1612q;
            c0138u5.d = H3 + c0138u6.f2615e;
            c0138u6.f2613b = this.f1613r.e(T02);
            k2 = (-this.f1613r.e(T02)) + this.f1613r.k();
        }
        C0138u c0138u7 = this.f1612q;
        c0138u7.f2614c = i2;
        if (z2) {
            c0138u7.f2614c = i2 - k2;
        }
        c0138u7.f2617g = k2;
    }

    @Override // h0.J
    public final boolean e() {
        return this.f1611p == 1;
    }

    @Override // h0.J
    public void e0(W w2) {
        this.f1621z = null;
        this.f1619x = -1;
        this.f1620y = Integer.MIN_VALUE;
        this.f1607A.d();
    }

    public final void e1(int i, int i2) {
        this.f1612q.f2614c = this.f1613r.g() - i2;
        C0138u c0138u = this.f1612q;
        c0138u.f2615e = this.f1616u ? -1 : 1;
        c0138u.d = i;
        c0138u.f2616f = 1;
        c0138u.f2613b = i2;
        c0138u.f2617g = Integer.MIN_VALUE;
    }

    @Override // h0.J
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof C0139v) {
            C0139v c0139v = (C0139v) parcelable;
            this.f1621z = c0139v;
            if (this.f1619x != -1) {
                c0139v.f2622a = -1;
            }
            n0();
        }
    }

    public final void f1(int i, int i2) {
        this.f1612q.f2614c = i2 - this.f1613r.k();
        C0138u c0138u = this.f1612q;
        c0138u.d = i;
        c0138u.f2615e = this.f1616u ? 1 : -1;
        c0138u.f2616f = -1;
        c0138u.f2613b = i2;
        c0138u.f2617g = Integer.MIN_VALUE;
    }

    @Override // h0.J
    public final Parcelable g0() {
        C0139v c0139v = this.f1621z;
        if (c0139v != null) {
            C0139v c0139v2 = new C0139v();
            c0139v2.f2622a = c0139v.f2622a;
            c0139v2.f2623b = c0139v.f2623b;
            c0139v2.f2624c = c0139v.f2624c;
            return c0139v2;
        }
        C0139v c0139v3 = new C0139v();
        if (v() > 0) {
            I0();
            boolean z2 = this.f1614s ^ this.f1616u;
            c0139v3.f2624c = z2;
            if (z2) {
                View S02 = S0();
                c0139v3.f2623b = this.f1613r.g() - this.f1613r.b(S02);
                c0139v3.f2622a = J.H(S02);
            } else {
                View T02 = T0();
                c0139v3.f2622a = J.H(T02);
                c0139v3.f2623b = this.f1613r.e(T02) - this.f1613r.k();
            }
        } else {
            c0139v3.f2622a = -1;
        }
        return c0139v3;
    }

    @Override // h0.J
    public final void h(int i, int i2, W w2, C0132n c0132n) {
        if (this.f1611p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, w2);
        D0(w2, this.f1612q, c0132n);
    }

    @Override // h0.J
    public final void i(int i, C0132n c0132n) {
        boolean z2;
        int i2;
        C0139v c0139v = this.f1621z;
        if (c0139v == null || (i2 = c0139v.f2622a) < 0) {
            Z0();
            z2 = this.f1616u;
            i2 = this.f1619x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0139v.f2624c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1609C && i2 >= 0 && i2 < i; i4++) {
            c0132n.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // h0.J
    public final int j(W w2) {
        return E0(w2);
    }

    @Override // h0.J
    public int k(W w2) {
        return F0(w2);
    }

    @Override // h0.J
    public int l(W w2) {
        return G0(w2);
    }

    @Override // h0.J
    public final int m(W w2) {
        return E0(w2);
    }

    @Override // h0.J
    public int n(W w2) {
        return F0(w2);
    }

    @Override // h0.J
    public int o(W w2) {
        return G0(w2);
    }

    @Override // h0.J
    public int o0(int i, P p2, W w2) {
        if (this.f1611p == 1) {
            return 0;
        }
        return a1(i, p2, w2);
    }

    @Override // h0.J
    public final void p0(int i) {
        this.f1619x = i;
        this.f1620y = Integer.MIN_VALUE;
        C0139v c0139v = this.f1621z;
        if (c0139v != null) {
            c0139v.f2622a = -1;
        }
        n0();
    }

    @Override // h0.J
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

    @Override // h0.J
    public int q0(int i, P p2, W w2) {
        if (this.f1611p == 0) {
            return 0;
        }
        return a1(i, p2, w2);
    }

    @Override // h0.J
    public K r() {
        return new K(-2, -2);
    }

    @Override // h0.J
    public final boolean x0() {
        if (this.f2406m == 1073741824 || this.f2405l == 1073741824) {
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

    @Override // h0.J
    public void z0(RecyclerView recyclerView, int i) {
        C0140w c0140w = new C0140w(recyclerView.getContext());
        c0140w.f2625a = i;
        A0(c0140w);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1611p = 1;
        this.f1615t = false;
        this.f1616u = false;
        this.f1617v = false;
        this.f1618w = true;
        this.f1619x = -1;
        this.f1620y = Integer.MIN_VALUE;
        this.f1621z = null;
        this.f1607A = new C0136s();
        this.f1608B = new C0137t();
        this.f1609C = 2;
        this.f1610D = new int[2];
        I I2 = J.I(context, attributeSet, i, i2);
        b1(I2.f2393a);
        boolean z2 = I2.f2395c;
        c(null);
        if (z2 != this.f1615t) {
            this.f1615t = z2;
            n0();
        }
        c1(I2.d);
    }
}
