package androidx.recyclerview.widget;

import G1.AbstractC0001b;
import U.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.C0149m;
import g0.C0154s;
import g0.C0155t;
import g0.C0156u;
import g0.C0157v;
import g0.G;
import g0.H;
import g0.I;
import g0.N;
import g0.T;
import g0.U;
import g0.Y;
import g0.r;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends H implements T {

    /* renamed from: A, reason: collision with root package name */
    public final r f1922A;

    /* renamed from: B, reason: collision with root package name */
    public final C0154s f1923B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1924C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1925D;

    /* renamed from: p, reason: collision with root package name */
    public int f1926p;

    /* renamed from: q, reason: collision with root package name */
    public C0155t f1927q;

    /* renamed from: r, reason: collision with root package name */
    public g f1928r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1929s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1930t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1931u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1932v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1933w;

    /* renamed from: x, reason: collision with root package name */
    public int f1934x;

    /* renamed from: y, reason: collision with root package name */
    public int f1935y;

    /* renamed from: z, reason: collision with root package name */
    public C0156u f1936z;

    public LinearLayoutManager(int i) {
        this.f1926p = 1;
        this.f1930t = false;
        this.f1931u = false;
        this.f1932v = false;
        this.f1933w = true;
        this.f1934x = -1;
        this.f1935y = Integer.MIN_VALUE;
        this.f1936z = null;
        this.f1922A = new r();
        this.f1923B = new C0154s();
        this.f1924C = 2;
        this.f1925D = new int[2];
        b1(i);
        c(null);
        if (this.f1930t) {
            this.f1930t = false;
            n0();
        }
    }

    @Override // g0.H
    public boolean B0() {
        return this.f1936z == null && this.f1929s == this.f1932v;
    }

    public void C0(U u2, int[] iArr) {
        int i;
        int l2 = u2.f2759a != -1 ? this.f1928r.l() : 0;
        if (this.f1927q.f2930f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void D0(U u2, C0155t c0155t, C0149m c0149m) {
        int i = c0155t.d;
        if (i < 0 || i >= u2.b()) {
            return;
        }
        c0149m.a(i, Math.max(0, c0155t.f2931g));
    }

    public final int E0(U u2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1928r;
        boolean z2 = !this.f1933w;
        return b1.g.f(u2, gVar, L0(z2), K0(z2), this, this.f1933w);
    }

    public final int F0(U u2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1928r;
        boolean z2 = !this.f1933w;
        return b1.g.g(u2, gVar, L0(z2), K0(z2), this, this.f1933w, this.f1931u);
    }

    public final int G0(U u2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1928r;
        boolean z2 = !this.f1933w;
        return b1.g.h(u2, gVar, L0(z2), K0(z2), this, this.f1933w);
    }

    public final int H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1926p == 1) ? 1 : Integer.MIN_VALUE : this.f1926p == 0 ? 1 : Integer.MIN_VALUE : this.f1926p == 1 ? -1 : Integer.MIN_VALUE : this.f1926p == 0 ? -1 : Integer.MIN_VALUE : (this.f1926p != 1 && U0()) ? -1 : 1 : (this.f1926p != 1 && U0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1927q == null) {
            C0155t c0155t = new C0155t();
            c0155t.f2926a = true;
            c0155t.h = 0;
            c0155t.i = 0;
            c0155t.f2933k = null;
            this.f1927q = c0155t;
        }
    }

    public final int J0(N n2, C0155t c0155t, U u2, boolean z2) {
        int i;
        int i2 = c0155t.f2928c;
        int i3 = c0155t.f2931g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0155t.f2931g = i3 + i2;
            }
            X0(n2, c0155t);
        }
        int i4 = c0155t.f2928c + c0155t.h;
        while (true) {
            if ((!c0155t.f2934l && i4 <= 0) || (i = c0155t.d) < 0 || i >= u2.b()) {
                break;
            }
            C0154s c0154s = this.f1923B;
            c0154s.f2923a = 0;
            c0154s.f2924b = false;
            c0154s.f2925c = false;
            c0154s.d = false;
            V0(n2, u2, c0155t, c0154s);
            if (!c0154s.f2924b) {
                int i5 = c0155t.f2927b;
                int i6 = c0154s.f2923a;
                c0155t.f2927b = (c0155t.f2930f * i6) + i5;
                if (!c0154s.f2925c || c0155t.f2933k != null || !u2.f2764g) {
                    c0155t.f2928c -= i6;
                    i4 -= i6;
                }
                int i7 = c0155t.f2931g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0155t.f2931g = i8;
                    int i9 = c0155t.f2928c;
                    if (i9 < 0) {
                        c0155t.f2931g = i8 + i9;
                    }
                    X0(n2, c0155t);
                }
                if (z2 && c0154s.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0155t.f2928c;
    }

    public final View K0(boolean z2) {
        return this.f1931u ? O0(0, v(), z2) : O0(v() - 1, -1, z2);
    }

    @Override // g0.H
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z2) {
        return this.f1931u ? O0(v() - 1, -1, z2) : O0(0, v(), z2);
    }

    public final int M0() {
        View O02 = O0(v() - 1, -1, false);
        if (O02 == null) {
            return -1;
        }
        return H.H(O02);
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        I0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1928r.e(u(i)) < this.f1928r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1926p == 0 ? this.f2726c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z2) {
        I0();
        int i3 = z2 ? 24579 : 320;
        return this.f1926p == 0 ? this.f2726c.a(i, i2, i3, 320) : this.d.a(i, i2, i3, 320);
    }

    public View P0(N n2, U u2, boolean z2, boolean z3) {
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
        int b2 = u2.b();
        int k2 = this.f1928r.k();
        int g2 = this.f1928r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u3 = u(i2);
            int H2 = H.H(u3);
            int e2 = this.f1928r.e(u3);
            int b3 = this.f1928r.b(u3);
            if (H2 >= 0 && H2 < b2) {
                if (!((I) u3.getLayoutParams()).f2736a.i()) {
                    boolean z4 = b3 <= k2 && e2 < k2;
                    boolean z5 = e2 >= g2 && b3 > g2;
                    if (!z4 && !z5) {
                        return u3;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                        view2 = u3;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                        view2 = u3;
                    }
                } else if (view3 == null) {
                    view3 = u3;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int Q0(int i, N n2, U u2, boolean z2) {
        int g2;
        int g3 = this.f1928r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -a1(-g3, n2, u2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1928r.g() - i3) <= 0) {
            return i2;
        }
        this.f1928r.p(g2);
        return g2 + i2;
    }

    public final int R0(int i, N n2, U u2, boolean z2) {
        int k2;
        int k3 = i - this.f1928r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -a1(k3, n2, u2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1928r.k()) <= 0) {
            return i2;
        }
        this.f1928r.p(-k2);
        return i2 - k2;
    }

    @Override // g0.H
    public final void S(RecyclerView recyclerView) {
    }

    public final View S0() {
        return u(this.f1931u ? 0 : v() - 1);
    }

    @Override // g0.H
    public View T(View view, int i, N n2, U u2) {
        int H0;
        Z0();
        if (v() == 0 || (H0 = H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        d1(H0, (int) (this.f1928r.l() * 0.33333334f), false, u2);
        C0155t c0155t = this.f1927q;
        c0155t.f2931g = Integer.MIN_VALUE;
        c0155t.f2926a = false;
        J0(n2, c0155t, u2, true);
        View N02 = H0 == -1 ? this.f1931u ? N0(v() - 1, -1) : N0(0, v()) : this.f1931u ? N0(0, v()) : N0(v() - 1, -1);
        View T02 = H0 == -1 ? T0() : S0();
        if (!T02.hasFocusable()) {
            return N02;
        }
        if (N02 == null) {
            return null;
        }
        return T02;
    }

    public final View T0() {
        return u(this.f1931u ? v() - 1 : 0);
    }

    @Override // g0.H
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View O02 = O0(0, v(), false);
            accessibilityEvent.setFromIndex(O02 == null ? -1 : H.H(O02));
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final boolean U0() {
        return C() == 1;
    }

    public void V0(N n2, U u2, C0155t c0155t, C0154s c0154s) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0155t.b(n2);
        if (b2 == null) {
            c0154s.f2924b = true;
            return;
        }
        I i5 = (I) b2.getLayoutParams();
        if (c0155t.f2933k == null) {
            if (this.f1931u == (c0155t.f2930f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1931u == (c0155t.f2930f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        I i6 = (I) b2.getLayoutParams();
        Rect M2 = this.f2725b.M(b2);
        int i7 = M2.left + M2.right;
        int i8 = M2.top + M2.bottom;
        int w2 = H.w(d(), this.f2734n, this.f2732l, F() + E() + ((ViewGroup.MarginLayoutParams) i6).leftMargin + ((ViewGroup.MarginLayoutParams) i6).rightMargin + i7, ((ViewGroup.MarginLayoutParams) i6).width);
        int w3 = H.w(e(), this.f2735o, this.f2733m, D() + G() + ((ViewGroup.MarginLayoutParams) i6).topMargin + ((ViewGroup.MarginLayoutParams) i6).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) i6).height);
        if (w0(b2, w2, w3, i6)) {
            b2.measure(w2, w3);
        }
        c0154s.f2923a = this.f1928r.c(b2);
        if (this.f1926p == 1) {
            if (U0()) {
                i4 = this.f2734n - F();
                i = i4 - this.f1928r.d(b2);
            } else {
                i = E();
                i4 = this.f1928r.d(b2) + i;
            }
            if (c0155t.f2930f == -1) {
                i2 = c0155t.f2927b;
                i3 = i2 - c0154s.f2923a;
            } else {
                i3 = c0155t.f2927b;
                i2 = c0154s.f2923a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1928r.d(b2) + G2;
            if (c0155t.f2930f == -1) {
                int i9 = c0155t.f2927b;
                int i10 = i9 - c0154s.f2923a;
                i4 = i9;
                i2 = d;
                i = i10;
                i3 = G2;
            } else {
                int i11 = c0155t.f2927b;
                int i12 = c0154s.f2923a + i11;
                i = i11;
                i2 = d;
                i3 = G2;
                i4 = i12;
            }
        }
        H.N(b2, i, i3, i4, i2);
        if (i5.f2736a.i() || i5.f2736a.l()) {
            c0154s.f2925c = true;
        }
        c0154s.d = b2.hasFocusable();
    }

    public void W0(N n2, U u2, r rVar, int i) {
    }

    public final void X0(N n2, C0155t c0155t) {
        if (!c0155t.f2926a || c0155t.f2934l) {
            return;
        }
        int i = c0155t.f2931g;
        int i2 = c0155t.i;
        if (c0155t.f2930f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1928r.f() - i) + i2;
            if (this.f1931u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1928r.e(u2) < f2 || this.f1928r.o(u2) < f2) {
                        Y0(n2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1928r.e(u3) < f2 || this.f1928r.o(u3) < f2) {
                    Y0(n2, i4, i5);
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
        if (!this.f1931u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1928r.b(u4) > i6 || this.f1928r.n(u4) > i6) {
                    Y0(n2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1928r.b(u5) > i6 || this.f1928r.n(u5) > i6) {
                Y0(n2, i8, i9);
                return;
            }
        }
    }

    public final void Y0(N n2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                l0(i);
                n2.h(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            l0(i3);
            n2.h(u3);
        }
    }

    public final void Z0() {
        if (this.f1926p == 1 || !U0()) {
            this.f1931u = this.f1930t;
        } else {
            this.f1931u = !this.f1930t;
        }
    }

    @Override // g0.T
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < H.H(u(0))) != this.f1931u ? -1 : 1;
        return this.f1926p == 0 ? new PointF(i2, RecyclerView.f1937A0) : new PointF(RecyclerView.f1937A0, i2);
    }

    public final int a1(int i, N n2, U u2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        I0();
        this.f1927q.f2926a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        d1(i2, abs, true, u2);
        C0155t c0155t = this.f1927q;
        int J02 = J0(n2, c0155t, u2, false) + c0155t.f2931g;
        if (J02 < 0) {
            return 0;
        }
        if (abs > J02) {
            i = i2 * J02;
        }
        this.f1928r.p(-i);
        this.f1927q.f2932j = i;
        return i;
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0001b.f("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1926p || this.f1928r == null) {
            g a2 = g.a(this, i);
            this.f1928r = a2;
            this.f1922A.f2919a = a2;
            this.f1926p = i;
            n0();
        }
    }

    @Override // g0.H
    public final void c(String str) {
        if (this.f1936z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z2) {
        c(null);
        if (this.f1932v == z2) {
            return;
        }
        this.f1932v = z2;
        n0();
    }

    @Override // g0.H
    public final boolean d() {
        return this.f1926p == 0;
    }

    @Override // g0.H
    public void d0(N n2, U u2) {
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
        if (!(this.f1936z == null && this.f1934x == -1) && u2.b() == 0) {
            i0(n2);
            return;
        }
        C0156u c0156u = this.f1936z;
        if (c0156u != null && (i8 = c0156u.f2935a) >= 0) {
            this.f1934x = i8;
        }
        I0();
        this.f1927q.f2926a = false;
        Z0();
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2724a.f2800c.contains(focusedChild)) {
            focusedChild = null;
        }
        r rVar = this.f1922A;
        if (!rVar.f2922e || this.f1934x != -1 || this.f1936z != null) {
            rVar.d();
            rVar.d = this.f1931u ^ this.f1932v;
            if (!u2.f2764g && (i = this.f1934x) != -1) {
                if (i < 0 || i >= u2.b()) {
                    this.f1934x = -1;
                    this.f1935y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1934x;
                    rVar.f2920b = i10;
                    C0156u c0156u2 = this.f1936z;
                    if (c0156u2 != null && c0156u2.f2935a >= 0) {
                        boolean z2 = c0156u2.f2937c;
                        rVar.d = z2;
                        if (z2) {
                            rVar.f2921c = this.f1928r.g() - this.f1936z.f2936b;
                        } else {
                            rVar.f2921c = this.f1928r.k() + this.f1936z.f2936b;
                        }
                    } else if (this.f1935y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                rVar.d = (this.f1934x < H.H(u(0))) == this.f1931u;
                            }
                            rVar.a();
                        } else if (this.f1928r.c(q3) > this.f1928r.l()) {
                            rVar.a();
                        } else if (this.f1928r.e(q3) - this.f1928r.k() < 0) {
                            rVar.f2921c = this.f1928r.k();
                            rVar.d = false;
                        } else if (this.f1928r.g() - this.f1928r.b(q3) < 0) {
                            rVar.f2921c = this.f1928r.g();
                            rVar.d = true;
                        } else {
                            rVar.f2921c = rVar.d ? this.f1928r.m() + this.f1928r.b(q3) : this.f1928r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1931u;
                        rVar.d = z3;
                        if (z3) {
                            rVar.f2921c = this.f1928r.g() - this.f1935y;
                        } else {
                            rVar.f2921c = this.f1928r.k() + this.f1935y;
                        }
                    }
                    rVar.f2922e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2725b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f2724a.f2800c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    I i11 = (I) focusedChild2.getLayoutParams();
                    if (!i11.f2736a.i() && i11.f2736a.b() >= 0 && i11.f2736a.b() < u2.b()) {
                        rVar.c(focusedChild2, H.H(focusedChild2));
                        rVar.f2922e = true;
                    }
                }
                boolean z4 = this.f1929s;
                boolean z5 = this.f1932v;
                if (z4 == z5 && (P02 = P0(n2, u2, rVar.d, z5)) != null) {
                    rVar.b(P02, H.H(P02));
                    if (!u2.f2764g && B0()) {
                        int e3 = this.f1928r.e(P02);
                        int b2 = this.f1928r.b(P02);
                        int k2 = this.f1928r.k();
                        int g2 = this.f1928r.g();
                        boolean z6 = b2 <= k2 && e3 < k2;
                        boolean z7 = e3 >= g2 && b2 > g2;
                        if (z6 || z7) {
                            if (rVar.d) {
                                k2 = g2;
                            }
                            rVar.f2921c = k2;
                        }
                    }
                    rVar.f2922e = true;
                }
            }
            rVar.a();
            rVar.f2920b = this.f1932v ? u2.b() - 1 : 0;
            rVar.f2922e = true;
        } else if (focusedChild != null && (this.f1928r.e(focusedChild) >= this.f1928r.g() || this.f1928r.b(focusedChild) <= this.f1928r.k())) {
            rVar.c(focusedChild, H.H(focusedChild));
        }
        C0155t c0155t = this.f1927q;
        c0155t.f2930f = c0155t.f2932j >= 0 ? 1 : -1;
        int[] iArr = this.f1925D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(u2, iArr);
        int k3 = this.f1928r.k() + Math.max(0, iArr[0]);
        int h = this.f1928r.h() + Math.max(0, iArr[1]);
        if (u2.f2764g && (i6 = this.f1934x) != -1 && this.f1935y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1931u) {
                i7 = this.f1928r.g() - this.f1928r.b(q2);
                e2 = this.f1935y;
            } else {
                e2 = this.f1928r.e(q2) - this.f1928r.k();
                i7 = this.f1935y;
            }
            int i12 = i7 - e2;
            if (i12 > 0) {
                k3 += i12;
            } else {
                h -= i12;
            }
        }
        if (!rVar.d ? !this.f1931u : this.f1931u) {
            i9 = 1;
        }
        W0(n2, u2, rVar, i9);
        p(n2);
        this.f1927q.f2934l = this.f1928r.i() == 0 && this.f1928r.f() == 0;
        this.f1927q.getClass();
        this.f1927q.i = 0;
        if (rVar.d) {
            f1(rVar.f2920b, rVar.f2921c);
            C0155t c0155t2 = this.f1927q;
            c0155t2.h = k3;
            J0(n2, c0155t2, u2, false);
            C0155t c0155t3 = this.f1927q;
            i3 = c0155t3.f2927b;
            int i13 = c0155t3.d;
            int i14 = c0155t3.f2928c;
            if (i14 > 0) {
                h += i14;
            }
            e1(rVar.f2920b, rVar.f2921c);
            C0155t c0155t4 = this.f1927q;
            c0155t4.h = h;
            c0155t4.d += c0155t4.f2929e;
            J0(n2, c0155t4, u2, false);
            C0155t c0155t5 = this.f1927q;
            i2 = c0155t5.f2927b;
            int i15 = c0155t5.f2928c;
            if (i15 > 0) {
                f1(i13, i3);
                C0155t c0155t6 = this.f1927q;
                c0155t6.h = i15;
                J0(n2, c0155t6, u2, false);
                i3 = this.f1927q.f2927b;
            }
        } else {
            e1(rVar.f2920b, rVar.f2921c);
            C0155t c0155t7 = this.f1927q;
            c0155t7.h = h;
            J0(n2, c0155t7, u2, false);
            C0155t c0155t8 = this.f1927q;
            i2 = c0155t8.f2927b;
            int i16 = c0155t8.d;
            int i17 = c0155t8.f2928c;
            if (i17 > 0) {
                k3 += i17;
            }
            f1(rVar.f2920b, rVar.f2921c);
            C0155t c0155t9 = this.f1927q;
            c0155t9.h = k3;
            c0155t9.d += c0155t9.f2929e;
            J0(n2, c0155t9, u2, false);
            C0155t c0155t10 = this.f1927q;
            int i18 = c0155t10.f2927b;
            int i19 = c0155t10.f2928c;
            if (i19 > 0) {
                e1(i16, i2);
                C0155t c0155t11 = this.f1927q;
                c0155t11.h = i19;
                J0(n2, c0155t11, u2, false);
                i2 = this.f1927q.f2927b;
            }
            i3 = i18;
        }
        if (v() > 0) {
            if (this.f1931u ^ this.f1932v) {
                int Q03 = Q0(i2, n2, u2, true);
                i4 = i3 + Q03;
                i5 = i2 + Q03;
                Q02 = R0(i4, n2, u2, false);
            } else {
                int R02 = R0(i3, n2, u2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                Q02 = Q0(i5, n2, u2, false);
            }
            i3 = i4 + Q02;
            i2 = i5 + Q02;
        }
        if (u2.f2766k && v() != 0 && !u2.f2764g && B0()) {
            List list2 = n2.d;
            int size = list2.size();
            int H2 = H.H(u(0));
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < size; i22++) {
                Y y2 = (Y) list2.get(i22);
                if (!y2.i()) {
                    boolean z8 = y2.b() < H2;
                    boolean z9 = this.f1931u;
                    View view = y2.f2777a;
                    if (z8 != z9) {
                        i20 += this.f1928r.c(view);
                    } else {
                        i21 += this.f1928r.c(view);
                    }
                }
            }
            this.f1927q.f2933k = list2;
            if (i20 > 0) {
                f1(H.H(T0()), i3);
                C0155t c0155t12 = this.f1927q;
                c0155t12.h = i20;
                c0155t12.f2928c = 0;
                c0155t12.a(null);
                J0(n2, this.f1927q, u2, false);
            }
            if (i21 > 0) {
                e1(H.H(S0()), i2);
                C0155t c0155t13 = this.f1927q;
                c0155t13.h = i21;
                c0155t13.f2928c = 0;
                list = null;
                c0155t13.a(null);
                J0(n2, this.f1927q, u2, false);
            } else {
                list = null;
            }
            this.f1927q.f2933k = list;
        }
        if (u2.f2764g) {
            rVar.d();
        } else {
            g gVar = this.f1928r;
            gVar.f1085a = gVar.l();
        }
        this.f1929s = this.f1932v;
    }

    public final void d1(int i, int i2, boolean z2, U u2) {
        int k2;
        this.f1927q.f2934l = this.f1928r.i() == 0 && this.f1928r.f() == 0;
        this.f1927q.f2930f = i;
        int[] iArr = this.f1925D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(u2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0155t c0155t = this.f1927q;
        int i3 = z3 ? max2 : max;
        c0155t.h = i3;
        if (!z3) {
            max = max2;
        }
        c0155t.i = max;
        if (z3) {
            c0155t.h = this.f1928r.h() + i3;
            View S02 = S0();
            C0155t c0155t2 = this.f1927q;
            c0155t2.f2929e = this.f1931u ? -1 : 1;
            int H2 = H.H(S02);
            C0155t c0155t3 = this.f1927q;
            c0155t2.d = H2 + c0155t3.f2929e;
            c0155t3.f2927b = this.f1928r.b(S02);
            k2 = this.f1928r.b(S02) - this.f1928r.g();
        } else {
            View T02 = T0();
            C0155t c0155t4 = this.f1927q;
            c0155t4.h = this.f1928r.k() + c0155t4.h;
            C0155t c0155t5 = this.f1927q;
            c0155t5.f2929e = this.f1931u ? 1 : -1;
            int H3 = H.H(T02);
            C0155t c0155t6 = this.f1927q;
            c0155t5.d = H3 + c0155t6.f2929e;
            c0155t6.f2927b = this.f1928r.e(T02);
            k2 = (-this.f1928r.e(T02)) + this.f1928r.k();
        }
        C0155t c0155t7 = this.f1927q;
        c0155t7.f2928c = i2;
        if (z2) {
            c0155t7.f2928c = i2 - k2;
        }
        c0155t7.f2931g = k2;
    }

    @Override // g0.H
    public final boolean e() {
        return this.f1926p == 1;
    }

    @Override // g0.H
    public void e0(U u2) {
        this.f1936z = null;
        this.f1934x = -1;
        this.f1935y = Integer.MIN_VALUE;
        this.f1922A.d();
    }

    public final void e1(int i, int i2) {
        this.f1927q.f2928c = this.f1928r.g() - i2;
        C0155t c0155t = this.f1927q;
        c0155t.f2929e = this.f1931u ? -1 : 1;
        c0155t.d = i;
        c0155t.f2930f = 1;
        c0155t.f2927b = i2;
        c0155t.f2931g = Integer.MIN_VALUE;
    }

    @Override // g0.H
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof C0156u) {
            C0156u c0156u = (C0156u) parcelable;
            this.f1936z = c0156u;
            if (this.f1934x != -1) {
                c0156u.f2935a = -1;
            }
            n0();
        }
    }

    public final void f1(int i, int i2) {
        this.f1927q.f2928c = i2 - this.f1928r.k();
        C0155t c0155t = this.f1927q;
        c0155t.d = i;
        c0155t.f2929e = this.f1931u ? 1 : -1;
        c0155t.f2930f = -1;
        c0155t.f2927b = i2;
        c0155t.f2931g = Integer.MIN_VALUE;
    }

    @Override // g0.H
    public final Parcelable g0() {
        C0156u c0156u = this.f1936z;
        if (c0156u != null) {
            C0156u c0156u2 = new C0156u();
            c0156u2.f2935a = c0156u.f2935a;
            c0156u2.f2936b = c0156u.f2936b;
            c0156u2.f2937c = c0156u.f2937c;
            return c0156u2;
        }
        C0156u c0156u3 = new C0156u();
        if (v() > 0) {
            I0();
            boolean z2 = this.f1929s ^ this.f1931u;
            c0156u3.f2937c = z2;
            if (z2) {
                View S02 = S0();
                c0156u3.f2936b = this.f1928r.g() - this.f1928r.b(S02);
                c0156u3.f2935a = H.H(S02);
            } else {
                View T02 = T0();
                c0156u3.f2935a = H.H(T02);
                c0156u3.f2936b = this.f1928r.e(T02) - this.f1928r.k();
            }
        } else {
            c0156u3.f2935a = -1;
        }
        return c0156u3;
    }

    @Override // g0.H
    public final void h(int i, int i2, U u2, C0149m c0149m) {
        if (this.f1926p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, u2);
        D0(u2, this.f1927q, c0149m);
    }

    @Override // g0.H
    public final void i(int i, C0149m c0149m) {
        boolean z2;
        int i2;
        C0156u c0156u = this.f1936z;
        if (c0156u == null || (i2 = c0156u.f2935a) < 0) {
            Z0();
            z2 = this.f1931u;
            i2 = this.f1934x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0156u.f2937c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1924C && i2 >= 0 && i2 < i; i4++) {
            c0149m.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // g0.H
    public final int j(U u2) {
        return E0(u2);
    }

    @Override // g0.H
    public int k(U u2) {
        return F0(u2);
    }

    @Override // g0.H
    public int l(U u2) {
        return G0(u2);
    }

    @Override // g0.H
    public final int m(U u2) {
        return E0(u2);
    }

    @Override // g0.H
    public int n(U u2) {
        return F0(u2);
    }

    @Override // g0.H
    public int o(U u2) {
        return G0(u2);
    }

    @Override // g0.H
    public int o0(int i, N n2, U u2) {
        if (this.f1926p == 1) {
            return 0;
        }
        return a1(i, n2, u2);
    }

    @Override // g0.H
    public final void p0(int i) {
        this.f1934x = i;
        this.f1935y = Integer.MIN_VALUE;
        C0156u c0156u = this.f1936z;
        if (c0156u != null) {
            c0156u.f2935a = -1;
        }
        n0();
    }

    @Override // g0.H
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - H.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (H.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // g0.H
    public int q0(int i, N n2, U u2) {
        if (this.f1926p == 0) {
            return 0;
        }
        return a1(i, n2, u2);
    }

    @Override // g0.H
    public I r() {
        return new I(-2, -2);
    }

    @Override // g0.H
    public final boolean x0() {
        if (this.f2733m == 1073741824 || this.f2732l == 1073741824) {
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

    @Override // g0.H
    public void z0(RecyclerView recyclerView, int i) {
        C0157v c0157v = new C0157v(recyclerView.getContext());
        c0157v.f2938a = i;
        A0(c0157v);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1926p = 1;
        this.f1930t = false;
        this.f1931u = false;
        this.f1932v = false;
        this.f1933w = true;
        this.f1934x = -1;
        this.f1935y = Integer.MIN_VALUE;
        this.f1936z = null;
        this.f1922A = new r();
        this.f1923B = new C0154s();
        this.f1924C = 2;
        this.f1925D = new int[2];
        G I2 = H.I(context, attributeSet, i, i2);
        b1(I2.f2721a);
        boolean z2 = I2.f2723c;
        c(null);
        if (z2 != this.f1930t) {
            this.f1930t = z2;
            n0();
        }
        c1(I2.d);
    }
}
