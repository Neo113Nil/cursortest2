package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import g1.a1;
import g1.b;
import g1.b1;
import g1.d0;
import g1.e0;
import g1.f0;
import g1.g0;
import g1.g1;
import g1.h0;
import g1.l1;
import g1.m1;
import g1.q0;
import g1.q1;
import g1.y;
import g1.z0;
import java.util.List;
import o0.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends a1 implements l1 {
    public final d0 A;
    public final e0 B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f750p;

    /* renamed from: q, reason: collision with root package name */
    public f0 f751q;

    /* renamed from: r, reason: collision with root package name */
    public g f752r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f753s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f754t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f755u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f756v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f757w;

    /* renamed from: x, reason: collision with root package name */
    public int f758x;

    /* renamed from: y, reason: collision with root package name */
    public int f759y;

    /* renamed from: z, reason: collision with root package name */
    public g0 f760z;

    public LinearLayoutManager(int i) {
        this.f750p = 1;
        this.f754t = false;
        this.f755u = false;
        this.f756v = false;
        this.f757w = true;
        this.f758x = -1;
        this.f759y = Integer.MIN_VALUE;
        this.f760z = null;
        this.A = new d0();
        this.B = new e0();
        this.C = 2;
        this.D = new int[2];
        c1(i);
        c(null);
        if (this.f754t) {
            this.f754t = false;
            o0();
        }
    }

    @Override // g1.a1
    public void A0(RecyclerView recyclerView, int i) {
        h0 h0Var = new h0(recyclerView.getContext());
        h0Var.f1675a = i;
        B0(h0Var);
    }

    @Override // g1.a1
    public boolean C0() {
        return this.f760z == null && this.f753s == this.f756v;
    }

    public void D0(m1 m1Var, int[] iArr) {
        int i;
        int l4 = m1Var.f1720a != -1 ? this.f752r.l() : 0;
        if (this.f751q.f1652f == -1) {
            i = 0;
        } else {
            i = l4;
            l4 = 0;
        }
        iArr[0] = l4;
        iArr[1] = i;
    }

    public void E0(m1 m1Var, f0 f0Var, y yVar) {
        int i = f0Var.d;
        if (i < 0 || i >= m1Var.b()) {
            return;
        }
        yVar.a(i, Math.max(0, f0Var.f1653g));
    }

    public final int F0(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        g gVar = this.f752r;
        boolean z4 = !this.f757w;
        return b.a(m1Var, gVar, M0(z4), L0(z4), this, this.f757w);
    }

    public final int G0(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        g gVar = this.f752r;
        boolean z4 = !this.f757w;
        return b.b(m1Var, gVar, M0(z4), L0(z4), this, this.f757w, this.f755u);
    }

    public final int H0(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        g gVar = this.f752r;
        boolean z4 = !this.f757w;
        return b.c(m1Var, gVar, M0(z4), L0(z4), this, this.f757w);
    }

    public final int I0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f750p == 1) ? 1 : Integer.MIN_VALUE : this.f750p == 0 ? 1 : Integer.MIN_VALUE : this.f750p == 1 ? -1 : Integer.MIN_VALUE : this.f750p == 0 ? -1 : Integer.MIN_VALUE : (this.f750p != 1 && V0()) ? -1 : 1 : (this.f750p != 1 && V0()) ? 1 : -1;
    }

    public final void J0() {
        if (this.f751q == null) {
            f0 f0Var = new f0();
            f0Var.f1648a = true;
            f0Var.h = 0;
            f0Var.i = 0;
            f0Var.f1655k = null;
            this.f751q = f0Var;
        }
    }

    @Override // g1.a1
    public final boolean K() {
        return true;
    }

    public final int K0(g1 g1Var, f0 f0Var, m1 m1Var, boolean z4) {
        int i;
        int i4 = f0Var.f1650c;
        int i5 = f0Var.f1653g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                f0Var.f1653g = i5 + i4;
            }
            Y0(g1Var, f0Var);
        }
        int i6 = f0Var.f1650c + f0Var.h;
        while (true) {
            if ((!f0Var.f1656l && i6 <= 0) || (i = f0Var.d) < 0 || i >= m1Var.b()) {
                break;
            }
            e0 e0Var = this.B;
            e0Var.f1640a = 0;
            e0Var.f1641b = false;
            e0Var.f1642c = false;
            e0Var.d = false;
            W0(g1Var, m1Var, f0Var, e0Var);
            if (!e0Var.f1641b) {
                int i7 = f0Var.f1649b;
                int i8 = e0Var.f1640a;
                f0Var.f1649b = (f0Var.f1652f * i8) + i7;
                if (!e0Var.f1642c || f0Var.f1655k != null || !m1Var.f1725g) {
                    f0Var.f1650c -= i8;
                    i6 -= i8;
                }
                int i9 = f0Var.f1653g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + i8;
                    f0Var.f1653g = i10;
                    int i11 = f0Var.f1650c;
                    if (i11 < 0) {
                        f0Var.f1653g = i10 + i11;
                    }
                    Y0(g1Var, f0Var);
                }
                if (z4 && e0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - f0Var.f1650c;
    }

    @Override // g1.a1
    public final boolean L() {
        return this.f754t;
    }

    public final View L0(boolean z4) {
        return this.f755u ? P0(0, v(), z4) : P0(v() - 1, -1, z4);
    }

    public final View M0(boolean z4) {
        return this.f755u ? P0(v() - 1, -1, z4) : P0(0, v(), z4);
    }

    public final int N0() {
        View P0 = P0(v() - 1, -1, false);
        if (P0 == null) {
            return -1;
        }
        return a1.G(P0);
    }

    public final View O0(int i, int i4) {
        int i5;
        int i6;
        J0();
        if (i4 <= i && i4 >= i) {
            return u(i);
        }
        if (this.f752r.e(u(i)) < this.f752r.k()) {
            i5 = 16644;
            i6 = 16388;
        } else {
            i5 = 4161;
            i6 = 4097;
        }
        return this.f750p == 0 ? this.f1599c.u(i, i4, i5, i6) : this.d.u(i, i4, i5, i6);
    }

    public final View P0(int i, int i4, boolean z4) {
        J0();
        int i5 = z4 ? 24579 : 320;
        return this.f750p == 0 ? this.f1599c.u(i, i4, i5, 320) : this.d.u(i, i4, i5, 320);
    }

    public View Q0(g1 g1Var, m1 m1Var, boolean z4, boolean z5) {
        int i;
        int i4;
        int i5;
        J0();
        int v4 = v();
        if (z5) {
            i4 = v() - 1;
            i = -1;
            i5 = -1;
        } else {
            i = v4;
            i4 = 0;
            i5 = 1;
        }
        int b2 = m1Var.b();
        int k4 = this.f752r.k();
        int g3 = this.f752r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i4 != i) {
            View u4 = u(i4);
            int G = a1.G(u4);
            int e4 = this.f752r.e(u4);
            int b5 = this.f752r.b(u4);
            if (G >= 0 && G < b2) {
                if (!((b1) u4.getLayoutParams()).f1617a.h()) {
                    boolean z6 = b5 <= k4 && e4 < k4;
                    boolean z7 = e4 >= g3 && b5 > g3;
                    if (!z6 && !z7) {
                        return u4;
                    }
                    if (z4) {
                        if (!z7) {
                            if (view != null) {
                            }
                            view = u4;
                        }
                        view2 = u4;
                    } else {
                        if (!z6) {
                            if (view != null) {
                            }
                            view = u4;
                        }
                        view2 = u4;
                    }
                } else if (view3 == null) {
                    view3 = u4;
                }
            }
            i4 += i5;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int R0(int i, g1 g1Var, m1 m1Var, boolean z4) {
        int g3;
        int g5 = this.f752r.g() - i;
        if (g5 <= 0) {
            return 0;
        }
        int i4 = -b1(-g5, g1Var, m1Var);
        int i5 = i + i4;
        if (!z4 || (g3 = this.f752r.g() - i5) <= 0) {
            return i4;
        }
        this.f752r.o(g3);
        return g3 + i4;
    }

    public final int S0(int i, g1 g1Var, m1 m1Var, boolean z4) {
        int k4;
        int k5 = i - this.f752r.k();
        if (k5 <= 0) {
            return 0;
        }
        int i4 = -b1(k5, g1Var, m1Var);
        int i5 = i + i4;
        if (!z4 || (k4 = i5 - this.f752r.k()) <= 0) {
            return i4;
        }
        this.f752r.o(-k4);
        return i4 - k4;
    }

    @Override // g1.a1
    public View T(View view, int i, g1 g1Var, m1 m1Var) {
        int I0;
        a1();
        if (v() != 0 && (I0 = I0(i)) != Integer.MIN_VALUE) {
            J0();
            e1(I0, (int) (this.f752r.l() * 0.33333334f), false, m1Var);
            f0 f0Var = this.f751q;
            f0Var.f1653g = Integer.MIN_VALUE;
            f0Var.f1648a = false;
            K0(g1Var, f0Var, m1Var, true);
            View O0 = I0 == -1 ? this.f755u ? O0(v() - 1, -1) : O0(0, v()) : this.f755u ? O0(0, v()) : O0(v() - 1, -1);
            View U0 = I0 == -1 ? U0() : T0();
            if (!U0.hasFocusable()) {
                return O0;
            }
            if (O0 != null) {
                return U0;
            }
        }
        return null;
    }

    public final View T0() {
        return u(this.f755u ? 0 : v() - 1);
    }

    @Override // g1.a1
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View P0 = P0(0, v(), false);
            accessibilityEvent.setFromIndex(P0 == null ? -1 : a1.G(P0));
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View U0() {
        return u(this.f755u ? v() - 1 : 0);
    }

    @Override // g1.a1
    public void V(g1 g1Var, m1 m1Var, o0.g gVar) {
        super.V(g1Var, m1Var, gVar);
        q0 q0Var = this.f1598b.f786r;
        if (q0Var == null || q0Var.a() <= 0) {
            return;
        }
        gVar.b(c.f2873j);
    }

    public final boolean V0() {
        return this.f1598b.getLayoutDirection() == 1;
    }

    public void W0(g1 g1Var, m1 m1Var, f0 f0Var, e0 e0Var) {
        int i;
        int i4;
        int i5;
        int i6;
        View b2 = f0Var.b(g1Var);
        if (b2 == null) {
            e0Var.f1641b = true;
            return;
        }
        b1 b1Var = (b1) b2.getLayoutParams();
        if (f0Var.f1655k == null) {
            if (this.f755u == (f0Var.f1652f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f755u == (f0Var.f1652f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        b1 b1Var2 = (b1) b2.getLayoutParams();
        Rect N = this.f1598b.N(b2);
        int i7 = N.left + N.right;
        int i8 = N.top + N.bottom;
        int w4 = a1.w(d(), this.f1607n, this.f1605l, E() + D() + ((ViewGroup.MarginLayoutParams) b1Var2).leftMargin + ((ViewGroup.MarginLayoutParams) b1Var2).rightMargin + i7, ((ViewGroup.MarginLayoutParams) b1Var2).width);
        int w5 = a1.w(e(), this.f1608o, this.f1606m, C() + F() + ((ViewGroup.MarginLayoutParams) b1Var2).topMargin + ((ViewGroup.MarginLayoutParams) b1Var2).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) b1Var2).height);
        if (x0(b2, w4, w5, b1Var2)) {
            b2.measure(w4, w5);
        }
        e0Var.f1640a = this.f752r.c(b2);
        if (this.f750p == 1) {
            if (V0()) {
                i6 = this.f1607n - E();
                i = i6 - this.f752r.d(b2);
            } else {
                i = D();
                i6 = this.f752r.d(b2) + i;
            }
            if (f0Var.f1652f == -1) {
                i4 = f0Var.f1649b;
                i5 = i4 - e0Var.f1640a;
            } else {
                i5 = f0Var.f1649b;
                i4 = e0Var.f1640a + i5;
            }
        } else {
            int F = F();
            int d = this.f752r.d(b2) + F;
            if (f0Var.f1652f == -1) {
                int i9 = f0Var.f1649b;
                int i10 = i9 - e0Var.f1640a;
                i6 = i9;
                i4 = d;
                i = i10;
                i5 = F;
            } else {
                int i11 = f0Var.f1649b;
                int i12 = e0Var.f1640a + i11;
                i = i11;
                i4 = d;
                i5 = F;
                i6 = i12;
            }
        }
        a1.N(b2, i, i5, i6, i4);
        if (b1Var.f1617a.h() || b1Var.f1617a.k()) {
            e0Var.f1642c = true;
        }
        e0Var.d = b2.hasFocusable();
    }

    public final void Y0(g1 g1Var, f0 f0Var) {
        if (!f0Var.f1648a || f0Var.f1656l) {
            return;
        }
        int i = f0Var.f1653g;
        int i4 = f0Var.i;
        if (f0Var.f1652f == -1) {
            int v4 = v();
            if (i < 0) {
                return;
            }
            int f5 = (this.f752r.f() - i) + i4;
            if (this.f755u) {
                for (int i5 = 0; i5 < v4; i5++) {
                    View u4 = u(i5);
                    if (this.f752r.e(u4) < f5 || this.f752r.n(u4) < f5) {
                        Z0(g1Var, 0, i5);
                        return;
                    }
                }
                return;
            }
            int i6 = v4 - 1;
            for (int i7 = i6; i7 >= 0; i7--) {
                View u5 = u(i7);
                if (this.f752r.e(u5) < f5 || this.f752r.n(u5) < f5) {
                    Z0(g1Var, i6, i7);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i8 = i - i4;
        int v5 = v();
        if (!this.f755u) {
            for (int i9 = 0; i9 < v5; i9++) {
                View u6 = u(i9);
                if (this.f752r.b(u6) > i8 || this.f752r.m(u6) > i8) {
                    Z0(g1Var, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = v5 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View u7 = u(i11);
            if (this.f752r.b(u7) > i8 || this.f752r.m(u7) > i8) {
                Z0(g1Var, i10, i11);
                return;
            }
        }
    }

    public final void Z0(g1 g1Var, int i, int i4) {
        if (i == i4) {
            return;
        }
        if (i4 <= i) {
            while (i > i4) {
                View u4 = u(i);
                m0(i);
                g1Var.i(u4);
                i--;
            }
            return;
        }
        for (int i5 = i4 - 1; i5 >= i; i5--) {
            View u5 = u(i5);
            m0(i5);
            g1Var.i(u5);
        }
    }

    @Override // g1.l1
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i4 = (i < a1.G(u(0))) != this.f755u ? -1 : 1;
        return this.f750p == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    public final void a1() {
        if (this.f750p == 1 || !V0()) {
            this.f755u = this.f754t;
        } else {
            this.f755u = !this.f754t;
        }
    }

    public final int b1(int i, g1 g1Var, m1 m1Var) {
        if (v() != 0 && i != 0) {
            J0();
            this.f751q.f1648a = true;
            int i4 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            e1(i4, abs, true, m1Var);
            f0 f0Var = this.f751q;
            int K0 = K0(g1Var, f0Var, m1Var, false) + f0Var.f1653g;
            if (K0 >= 0) {
                if (abs > K0) {
                    i = i4 * K0;
                }
                this.f752r.o(-i);
                this.f751q.f1654j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // g1.a1
    public final void c(String str) {
        if (this.f760z == null) {
            super.c(str);
        }
    }

    public final void c1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a4.b.f("invalid orientation:", i));
        }
        c(null);
        if (i != this.f750p || this.f752r == null) {
            g a5 = g.a(this, i);
            this.f752r = a5;
            this.A.f1630a = a5;
            this.f750p = i;
            o0();
        }
    }

    @Override // g1.a1
    public final boolean d() {
        return this.f750p == 0;
    }

    @Override // g1.a1
    public void d0(g1 g1Var, m1 m1Var) {
        View view;
        View view2;
        View Q0;
        int i;
        int e4;
        int i4;
        int i5;
        List list;
        int i6;
        int i7;
        int R0;
        int i8;
        View q4;
        int e5;
        int i9;
        int i10;
        int i11 = -1;
        if (!(this.f760z == null && this.f758x == -1) && m1Var.b() == 0) {
            j0(g1Var);
            return;
        }
        g0 g0Var = this.f760z;
        if (g0Var != null && (i10 = g0Var.f1663f) >= 0) {
            this.f758x = i10;
        }
        J0();
        this.f751q.f1648a = false;
        a1();
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.f1597a.f1673c.contains(view)) {
            view = null;
        }
        d0 d0Var = this.A;
        if (!d0Var.f1633e || this.f758x != -1 || this.f760z != null) {
            d0Var.d();
            d0Var.d = this.f755u ^ this.f756v;
            if (!m1Var.f1725g && (i = this.f758x) != -1) {
                if (i < 0 || i >= m1Var.b()) {
                    this.f758x = -1;
                    this.f759y = Integer.MIN_VALUE;
                } else {
                    int i12 = this.f758x;
                    d0Var.f1631b = i12;
                    g0 g0Var2 = this.f760z;
                    if (g0Var2 != null && g0Var2.f1663f >= 0) {
                        boolean z4 = g0Var2.h;
                        d0Var.d = z4;
                        if (z4) {
                            d0Var.f1632c = this.f752r.g() - this.f760z.f1664g;
                        } else {
                            d0Var.f1632c = this.f752r.k() + this.f760z.f1664g;
                        }
                    } else if (this.f759y == Integer.MIN_VALUE) {
                        View q5 = q(i12);
                        if (q5 == null) {
                            if (v() > 0) {
                                d0Var.d = (this.f758x < a1.G(u(0))) == this.f755u;
                            }
                            d0Var.a();
                        } else if (this.f752r.c(q5) > this.f752r.l()) {
                            d0Var.a();
                        } else if (this.f752r.e(q5) - this.f752r.k() < 0) {
                            d0Var.f1632c = this.f752r.k();
                            d0Var.d = false;
                        } else if (this.f752r.g() - this.f752r.b(q5) < 0) {
                            d0Var.f1632c = this.f752r.g();
                            d0Var.d = true;
                        } else {
                            if (d0Var.d) {
                                int b2 = this.f752r.b(q5);
                                g gVar = this.f752r;
                                e4 = (Integer.MIN_VALUE == gVar.f448a ? 0 : gVar.l() - gVar.f448a) + b2;
                            } else {
                                e4 = this.f752r.e(q5);
                            }
                            d0Var.f1632c = e4;
                        }
                    } else {
                        boolean z5 = this.f755u;
                        d0Var.d = z5;
                        if (z5) {
                            d0Var.f1632c = this.f752r.g() - this.f759y;
                        } else {
                            d0Var.f1632c = this.f752r.k() + this.f759y;
                        }
                    }
                    d0Var.f1633e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f1598b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.f1597a.f1673c.contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    b1 b1Var = (b1) view2.getLayoutParams();
                    if (!b1Var.f1617a.h() && b1Var.f1617a.b() >= 0 && b1Var.f1617a.b() < m1Var.b()) {
                        d0Var.c(view2, a1.G(view2));
                        d0Var.f1633e = true;
                    }
                }
                boolean z6 = this.f753s;
                boolean z7 = this.f756v;
                if (z6 == z7 && (Q0 = Q0(g1Var, m1Var, d0Var.d, z7)) != null) {
                    d0Var.b(Q0, a1.G(Q0));
                    if (!m1Var.f1725g && C0()) {
                        int e6 = this.f752r.e(Q0);
                        int b5 = this.f752r.b(Q0);
                        int k4 = this.f752r.k();
                        int g3 = this.f752r.g();
                        boolean z8 = b5 <= k4 && e6 < k4;
                        boolean z9 = e6 >= g3 && b5 > g3;
                        if (z8 || z9) {
                            if (d0Var.d) {
                                k4 = g3;
                            }
                            d0Var.f1632c = k4;
                        }
                    }
                    d0Var.f1633e = true;
                }
            }
            d0Var.a();
            d0Var.f1631b = this.f756v ? m1Var.b() - 1 : 0;
            d0Var.f1633e = true;
        } else if (view != null && (this.f752r.e(view) >= this.f752r.g() || this.f752r.b(view) <= this.f752r.k())) {
            d0Var.c(view, a1.G(view));
        }
        f0 f0Var = this.f751q;
        f0Var.f1652f = f0Var.f1654j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(m1Var, iArr);
        int k5 = this.f752r.k() + Math.max(0, iArr[0]);
        int h = this.f752r.h() + Math.max(0, iArr[1]);
        if (m1Var.f1725g && (i8 = this.f758x) != -1 && this.f759y != Integer.MIN_VALUE && (q4 = q(i8)) != null) {
            if (this.f755u) {
                i9 = this.f752r.g() - this.f752r.b(q4);
                e5 = this.f759y;
            } else {
                e5 = this.f752r.e(q4) - this.f752r.k();
                i9 = this.f759y;
            }
            int i13 = i9 - e5;
            if (i13 > 0) {
                k5 += i13;
            } else {
                h -= i13;
            }
        }
        if (!d0Var.d ? !this.f755u : this.f755u) {
            i11 = 1;
        }
        X0(g1Var, m1Var, d0Var, i11);
        p(g1Var);
        this.f751q.f1656l = this.f752r.i() == 0 && this.f752r.f() == 0;
        this.f751q.getClass();
        this.f751q.i = 0;
        if (d0Var.d) {
            g1(d0Var.f1631b, d0Var.f1632c);
            f0 f0Var2 = this.f751q;
            f0Var2.h = k5;
            K0(g1Var, f0Var2, m1Var, false);
            f0 f0Var3 = this.f751q;
            i5 = f0Var3.f1649b;
            int i14 = f0Var3.d;
            int i15 = f0Var3.f1650c;
            if (i15 > 0) {
                h += i15;
            }
            f1(d0Var.f1631b, d0Var.f1632c);
            f0 f0Var4 = this.f751q;
            f0Var4.h = h;
            f0Var4.d += f0Var4.f1651e;
            K0(g1Var, f0Var4, m1Var, false);
            f0 f0Var5 = this.f751q;
            i4 = f0Var5.f1649b;
            int i16 = f0Var5.f1650c;
            if (i16 > 0) {
                g1(i14, i5);
                f0 f0Var6 = this.f751q;
                f0Var6.h = i16;
                K0(g1Var, f0Var6, m1Var, false);
                i5 = this.f751q.f1649b;
            }
        } else {
            f1(d0Var.f1631b, d0Var.f1632c);
            f0 f0Var7 = this.f751q;
            f0Var7.h = h;
            K0(g1Var, f0Var7, m1Var, false);
            f0 f0Var8 = this.f751q;
            i4 = f0Var8.f1649b;
            int i17 = f0Var8.d;
            int i18 = f0Var8.f1650c;
            if (i18 > 0) {
                k5 += i18;
            }
            g1(d0Var.f1631b, d0Var.f1632c);
            f0 f0Var9 = this.f751q;
            f0Var9.h = k5;
            f0Var9.d += f0Var9.f1651e;
            K0(g1Var, f0Var9, m1Var, false);
            f0 f0Var10 = this.f751q;
            int i19 = f0Var10.f1649b;
            int i20 = f0Var10.f1650c;
            if (i20 > 0) {
                f1(i17, i4);
                f0 f0Var11 = this.f751q;
                f0Var11.h = i20;
                K0(g1Var, f0Var11, m1Var, false);
                i4 = this.f751q.f1649b;
            }
            i5 = i19;
        }
        if (v() > 0) {
            if (this.f755u ^ this.f756v) {
                int R02 = R0(i4, g1Var, m1Var, true);
                i6 = i5 + R02;
                i7 = i4 + R02;
                R0 = S0(i6, g1Var, m1Var, false);
            } else {
                int S0 = S0(i5, g1Var, m1Var, true);
                i6 = i5 + S0;
                i7 = i4 + S0;
                R0 = R0(i7, g1Var, m1Var, false);
            }
            i5 = i6 + R0;
            i4 = i7 + R0;
        }
        if (m1Var.f1727k && v() != 0 && !m1Var.f1725g && C0()) {
            List list2 = g1Var.d;
            int size = list2.size();
            int G = a1.G(u(0));
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                q1 q1Var = (q1) list2.get(i23);
                boolean h5 = q1Var.h();
                View view3 = q1Var.f1768a;
                if (!h5) {
                    if ((q1Var.b() < G) != this.f755u) {
                        i21 += this.f752r.c(view3);
                    } else {
                        i22 += this.f752r.c(view3);
                    }
                }
            }
            this.f751q.f1655k = list2;
            if (i21 > 0) {
                g1(a1.G(U0()), i5);
                f0 f0Var12 = this.f751q;
                f0Var12.h = i21;
                f0Var12.f1650c = 0;
                f0Var12.a(null);
                K0(g1Var, this.f751q, m1Var, false);
            }
            if (i22 > 0) {
                f1(a1.G(T0()), i4);
                f0 f0Var13 = this.f751q;
                f0Var13.h = i22;
                f0Var13.f1650c = 0;
                list = null;
                f0Var13.a(null);
                K0(g1Var, this.f751q, m1Var, false);
            } else {
                list = null;
            }
            this.f751q.f1655k = list;
        }
        if (m1Var.f1725g) {
            d0Var.d();
        } else {
            g gVar2 = this.f752r;
            gVar2.f448a = gVar2.l();
        }
        this.f753s = this.f756v;
    }

    public void d1(boolean z4) {
        c(null);
        if (this.f756v == z4) {
            return;
        }
        this.f756v = z4;
        o0();
    }

    @Override // g1.a1
    public final boolean e() {
        return this.f750p == 1;
    }

    @Override // g1.a1
    public void e0(m1 m1Var) {
        this.f760z = null;
        this.f758x = -1;
        this.f759y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void e1(int i, int i4, boolean z4, m1 m1Var) {
        int k4;
        this.f751q.f1656l = this.f752r.i() == 0 && this.f752r.f() == 0;
        this.f751q.f1652f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(m1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z5 = i == 1;
        f0 f0Var = this.f751q;
        int i5 = z5 ? max2 : max;
        f0Var.h = i5;
        if (!z5) {
            max = max2;
        }
        f0Var.i = max;
        if (z5) {
            f0Var.h = this.f752r.h() + i5;
            View T0 = T0();
            f0 f0Var2 = this.f751q;
            f0Var2.f1651e = this.f755u ? -1 : 1;
            int G = a1.G(T0);
            f0 f0Var3 = this.f751q;
            f0Var2.d = G + f0Var3.f1651e;
            f0Var3.f1649b = this.f752r.b(T0);
            k4 = this.f752r.b(T0) - this.f752r.g();
        } else {
            View U0 = U0();
            f0 f0Var4 = this.f751q;
            f0Var4.h = this.f752r.k() + f0Var4.h;
            f0 f0Var5 = this.f751q;
            f0Var5.f1651e = this.f755u ? 1 : -1;
            int G2 = a1.G(U0);
            f0 f0Var6 = this.f751q;
            f0Var5.d = G2 + f0Var6.f1651e;
            f0Var6.f1649b = this.f752r.e(U0);
            k4 = (-this.f752r.e(U0)) + this.f752r.k();
        }
        f0 f0Var7 = this.f751q;
        f0Var7.f1650c = i4;
        if (z4) {
            f0Var7.f1650c = i4 - k4;
        }
        f0Var7.f1653g = k4;
    }

    @Override // g1.a1
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof g0) {
            g0 g0Var = (g0) parcelable;
            this.f760z = g0Var;
            if (this.f758x != -1) {
                g0Var.f1663f = -1;
            }
            o0();
        }
    }

    public final void f1(int i, int i4) {
        this.f751q.f1650c = this.f752r.g() - i4;
        f0 f0Var = this.f751q;
        f0Var.f1651e = this.f755u ? -1 : 1;
        f0Var.d = i;
        f0Var.f1652f = 1;
        f0Var.f1649b = i4;
        f0Var.f1653g = Integer.MIN_VALUE;
    }

    @Override // g1.a1
    public final Parcelable g0() {
        g0 g0Var = this.f760z;
        if (g0Var != null) {
            g0 g0Var2 = new g0();
            g0Var2.f1663f = g0Var.f1663f;
            g0Var2.f1664g = g0Var.f1664g;
            g0Var2.h = g0Var.h;
            return g0Var2;
        }
        g0 g0Var3 = new g0();
        if (v() <= 0) {
            g0Var3.f1663f = -1;
            return g0Var3;
        }
        J0();
        boolean z4 = this.f753s ^ this.f755u;
        g0Var3.h = z4;
        if (z4) {
            View T0 = T0();
            g0Var3.f1664g = this.f752r.g() - this.f752r.b(T0);
            g0Var3.f1663f = a1.G(T0);
            return g0Var3;
        }
        View U0 = U0();
        g0Var3.f1663f = a1.G(U0);
        g0Var3.f1664g = this.f752r.e(U0) - this.f752r.k();
        return g0Var3;
    }

    public final void g1(int i, int i4) {
        this.f751q.f1650c = i4 - this.f752r.k();
        f0 f0Var = this.f751q;
        f0Var.d = i;
        f0Var.f1651e = this.f755u ? 1 : -1;
        f0Var.f1652f = -1;
        f0Var.f1649b = i4;
        f0Var.f1653g = Integer.MIN_VALUE;
    }

    @Override // g1.a1
    public final void h(int i, int i4, m1 m1Var, y yVar) {
        if (this.f750p != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        J0();
        e1(i > 0 ? 1 : -1, Math.abs(i), true, m1Var);
        E0(m1Var, this.f751q, yVar);
    }

    @Override // g1.a1
    public final void i(int i, y yVar) {
        boolean z4;
        int i4;
        g0 g0Var = this.f760z;
        if (g0Var == null || (i4 = g0Var.f1663f) < 0) {
            a1();
            z4 = this.f755u;
            i4 = this.f758x;
            if (i4 == -1) {
                i4 = z4 ? i - 1 : 0;
            }
        } else {
            z4 = g0Var.h;
        }
        int i5 = z4 ? -1 : 1;
        for (int i6 = 0; i6 < this.C && i4 >= 0 && i4 < i; i6++) {
            yVar.a(i4, 0);
            i4 += i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // g1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i0(int i, Bundle bundle) {
        int min;
        if (super.i0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f750p == 1) {
                int i4 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i4 >= 0) {
                    RecyclerView recyclerView = this.f1598b;
                    min = Math.min(i4, I(recyclerView.h, recyclerView.f775l0) - 1);
                    if (min >= 0) {
                        this.f758x = min;
                        this.f759y = 0;
                        g0 g0Var = this.f760z;
                        if (g0Var != null) {
                            g0Var.f1663f = -1;
                        }
                        o0();
                        return true;
                    }
                }
            } else {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i5 >= 0) {
                    RecyclerView recyclerView2 = this.f1598b;
                    min = Math.min(i5, x(recyclerView2.h, recyclerView2.f775l0) - 1);
                    if (min >= 0) {
                    }
                }
            }
        }
        return false;
    }

    @Override // g1.a1
    public final int j(m1 m1Var) {
        return F0(m1Var);
    }

    @Override // g1.a1
    public int k(m1 m1Var) {
        return G0(m1Var);
    }

    @Override // g1.a1
    public int l(m1 m1Var) {
        return H0(m1Var);
    }

    @Override // g1.a1
    public final int m(m1 m1Var) {
        return F0(m1Var);
    }

    @Override // g1.a1
    public int n(m1 m1Var) {
        return G0(m1Var);
    }

    @Override // g1.a1
    public int o(m1 m1Var) {
        return H0(m1Var);
    }

    @Override // g1.a1
    public int p0(int i, g1 g1Var, m1 m1Var) {
        if (this.f750p == 1) {
            return 0;
        }
        return b1(i, g1Var, m1Var);
    }

    @Override // g1.a1
    public final View q(int i) {
        int v4 = v();
        if (v4 == 0) {
            return null;
        }
        int G = i - a1.G(u(0));
        if (G >= 0 && G < v4) {
            View u4 = u(G);
            if (a1.G(u4) == i) {
                return u4;
            }
        }
        return super.q(i);
    }

    @Override // g1.a1
    public final void q0(int i) {
        this.f758x = i;
        this.f759y = Integer.MIN_VALUE;
        g0 g0Var = this.f760z;
        if (g0Var != null) {
            g0Var.f1663f = -1;
        }
        o0();
    }

    @Override // g1.a1
    public b1 r() {
        return new b1(-2, -2);
    }

    @Override // g1.a1
    public int r0(int i, g1 g1Var, m1 m1Var) {
        if (this.f750p == 0) {
            return 0;
        }
        return b1(i, g1Var, m1Var);
    }

    @Override // g1.a1
    public final boolean y0() {
        if (this.f1606m != 1073741824 && this.f1605l != 1073741824) {
            int v4 = v();
            for (int i = 0; i < v4; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f750p = 1;
        this.f754t = false;
        this.f755u = false;
        this.f756v = false;
        this.f757w = true;
        this.f758x = -1;
        this.f759y = Integer.MIN_VALUE;
        this.f760z = null;
        this.A = new d0();
        this.B = new e0();
        this.C = 2;
        this.D = new int[2];
        z0 H = a1.H(context, attributeSet, i, i4);
        c1(H.f1866a);
        boolean z4 = H.f1868c;
        c(null);
        if (z4 != this.f754t) {
            this.f754t = z4;
            o0();
        }
        d1(H.d);
    }

    @Override // g1.a1
    public final void S(RecyclerView recyclerView) {
    }

    public void X0(g1 g1Var, m1 m1Var, d0 d0Var, int i) {
    }
}
