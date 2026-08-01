package androidx.recyclerview.widget;

import T.g;
import X.V;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f0.C0099m;
import f0.C0104s;
import f0.C0105t;
import f0.C0106u;
import f0.C0107v;
import f0.H;
import f0.I;
import f0.J;
import f0.O;
import f0.T;
import f0.U;
import f0.X;
import f0.r;
import java.util.ArrayList;
import java.util.List;
import u1.d;

/* loaded from: classes.dex */
public class LinearLayoutManager extends I implements T {

    /* renamed from: A, reason: collision with root package name */
    public final r f1471A;

    /* renamed from: B, reason: collision with root package name */
    public final C0104s f1472B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1473C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1474D;

    /* renamed from: p, reason: collision with root package name */
    public int f1475p;

    /* renamed from: q, reason: collision with root package name */
    public C0105t f1476q;

    /* renamed from: r, reason: collision with root package name */
    public g f1477r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1478s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1479t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1480u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1481v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1482w;

    /* renamed from: x, reason: collision with root package name */
    public int f1483x;

    /* renamed from: y, reason: collision with root package name */
    public int f1484y;

    /* renamed from: z, reason: collision with root package name */
    public C0106u f1485z;

    public LinearLayoutManager(int i) {
        this.f1475p = 1;
        this.f1479t = false;
        this.f1480u = false;
        this.f1481v = false;
        this.f1482w = true;
        this.f1483x = -1;
        this.f1484y = Integer.MIN_VALUE;
        this.f1485z = null;
        this.f1471A = new r();
        this.f1472B = new C0104s();
        this.f1473C = 2;
        this.f1474D = new int[2];
        Z0(i);
        c(null);
        if (this.f1479t) {
            this.f1479t = false;
            l0();
        }
    }

    public void A0(U u2, int[] iArr) {
        int i;
        int l2 = u2.f2100a != -1 ? this.f1477r.l() : 0;
        if (this.f1476q.f2269f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void B0(U u2, C0105t c0105t, C0099m c0099m) {
        int i = c0105t.d;
        if (i < 0 || i >= u2.b()) {
            return;
        }
        c0099m.a(i, Math.max(0, c0105t.f2270g));
    }

    public final int C0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1477r;
        boolean z2 = !this.f1482w;
        return d.o(u2, gVar, J0(z2), I0(z2), this, this.f1482w);
    }

    public final int D0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1477r;
        boolean z2 = !this.f1482w;
        return d.p(u2, gVar, J0(z2), I0(z2), this, this.f1482w, this.f1480u);
    }

    public final int E0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1477r;
        boolean z2 = !this.f1482w;
        return d.q(u2, gVar, J0(z2), I0(z2), this, this.f1482w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1475p == 1) ? 1 : Integer.MIN_VALUE : this.f1475p == 0 ? 1 : Integer.MIN_VALUE : this.f1475p == 1 ? -1 : Integer.MIN_VALUE : this.f1475p == 0 ? -1 : Integer.MIN_VALUE : (this.f1475p != 1 && S0()) ? -1 : 1 : (this.f1475p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f1476q == null) {
            C0105t c0105t = new C0105t();
            c0105t.f2265a = true;
            c0105t.h = 0;
            c0105t.i = 0;
            c0105t.f2272k = null;
            this.f1476q = c0105t;
        }
    }

    public final int H0(O o2, C0105t c0105t, U u2, boolean z2) {
        int i;
        int i2 = c0105t.f2267c;
        int i3 = c0105t.f2270g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0105t.f2270g = i3 + i2;
            }
            V0(o2, c0105t);
        }
        int i4 = c0105t.f2267c + c0105t.h;
        while (true) {
            if ((!c0105t.f2273l && i4 <= 0) || (i = c0105t.d) < 0 || i >= u2.b()) {
                break;
            }
            C0104s c0104s = this.f1472B;
            c0104s.f2262a = 0;
            c0104s.f2263b = false;
            c0104s.f2264c = false;
            c0104s.d = false;
            T0(o2, u2, c0105t, c0104s);
            if (!c0104s.f2263b) {
                int i5 = c0105t.f2266b;
                int i6 = c0104s.f2262a;
                c0105t.f2266b = (c0105t.f2269f * i6) + i5;
                if (!c0104s.f2264c || c0105t.f2272k != null || !u2.f2105g) {
                    c0105t.f2267c -= i6;
                    i4 -= i6;
                }
                int i7 = c0105t.f2270g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0105t.f2270g = i8;
                    int i9 = c0105t.f2267c;
                    if (i9 < 0) {
                        c0105t.f2270g = i8 + i9;
                    }
                    V0(o2, c0105t);
                }
                if (z2 && c0104s.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0105t.f2267c;
    }

    public final View I0(boolean z2) {
        return this.f1480u ? M0(0, v(), z2) : M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        return this.f1480u ? M0(v() - 1, -1, z2) : M0(0, v(), z2);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return I.H(M02);
    }

    @Override // f0.I
    public final boolean L() {
        return true;
    }

    public final View L0(int i, int i2) {
        int i3;
        int i4;
        G0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1477r.e(u(i)) < this.f1477r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1475p == 0 ? this.f2069c.u(i, i2, i3, i4) : this.d.u(i, i2, i3, i4);
    }

    public final View M0(int i, int i2, boolean z2) {
        G0();
        int i3 = z2 ? 24579 : 320;
        return this.f1475p == 0 ? this.f2069c.u(i, i2, i3, 320) : this.d.u(i, i2, i3, 320);
    }

    public View N0(O o2, U u2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1477r.k();
        int g2 = this.f1477r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u3 = u(i);
            int H2 = I.H(u3);
            if (H2 >= 0 && H2 < i3) {
                if (((J) u3.getLayoutParams()).f2079a.i()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f1477r.e(u3) < g2 && this.f1477r.b(u3) >= k2) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int O0(int i, O o2, U u2, boolean z2) {
        int g2;
        int g3 = this.f1477r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -Y0(-g3, o2, u2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1477r.g() - i3) <= 0) {
            return i2;
        }
        this.f1477r.p(g2);
        return g2 + i2;
    }

    public final int P0(int i, O o2, U u2, boolean z2) {
        int k2;
        int k3 = i - this.f1477r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -Y0(k3, o2, u2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1477r.k()) <= 0) {
            return i2;
        }
        this.f1477r.p(-k2);
        return i2 - k2;
    }

    public final View Q0() {
        return u(this.f1480u ? 0 : v() - 1);
    }

    @Override // f0.I
    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        return u(this.f1480u ? v() - 1 : 0);
    }

    @Override // f0.I
    public View S(View view, int i, O o2, U u2) {
        int F02;
        X0();
        if (v() == 0 || (F02 = F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        b1(F02, (int) (this.f1477r.l() * 0.33333334f), false, u2);
        C0105t c0105t = this.f1476q;
        c0105t.f2270g = Integer.MIN_VALUE;
        c0105t.f2265a = false;
        H0(o2, c0105t, u2, true);
        View L02 = F02 == -1 ? this.f1480u ? L0(v() - 1, -1) : L0(0, v()) : this.f1480u ? L0(0, v()) : L0(v() - 1, -1);
        View R02 = F02 == -1 ? R0() : Q0();
        if (!R02.hasFocusable()) {
            return L02;
        }
        if (L02 == null) {
            return null;
        }
        return R02;
    }

    public final boolean S0() {
        return C() == 1;
    }

    @Override // f0.I
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : I.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(O o2, U u2, C0105t c0105t, C0104s c0104s) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0105t.b(o2);
        if (b2 == null) {
            c0104s.f2263b = true;
            return;
        }
        J j2 = (J) b2.getLayoutParams();
        if (c0105t.f2272k == null) {
            if (this.f1480u == (c0105t.f2269f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1480u == (c0105t.f2269f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        J j3 = (J) b2.getLayoutParams();
        Rect J2 = this.f2068b.J(b2);
        int i5 = J2.left + J2.right;
        int i6 = J2.top + J2.bottom;
        int w2 = I.w(d(), this.f2077n, this.f2075l, F() + E() + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin + i5, ((ViewGroup.MarginLayoutParams) j3).width);
        int w3 = I.w(e(), this.f2078o, this.f2076m, D() + G() + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) j3).height);
        if (u0(b2, w2, w3, j3)) {
            b2.measure(w2, w3);
        }
        c0104s.f2262a = this.f1477r.c(b2);
        if (this.f1475p == 1) {
            if (S0()) {
                i4 = this.f2077n - F();
                i = i4 - this.f1477r.d(b2);
            } else {
                i = E();
                i4 = this.f1477r.d(b2) + i;
            }
            if (c0105t.f2269f == -1) {
                i2 = c0105t.f2266b;
                i3 = i2 - c0104s.f2262a;
            } else {
                i3 = c0105t.f2266b;
                i2 = c0104s.f2262a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1477r.d(b2) + G2;
            if (c0105t.f2269f == -1) {
                int i7 = c0105t.f2266b;
                int i8 = i7 - c0104s.f2262a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0105t.f2266b;
                int i10 = c0104s.f2262a + i9;
                i = i9;
                i2 = d;
                i3 = G2;
                i4 = i10;
            }
        }
        I.N(b2, i, i3, i4, i2);
        if (j2.f2079a.i() || j2.f2079a.l()) {
            c0104s.f2264c = true;
        }
        c0104s.d = b2.hasFocusable();
    }

    public void U0(O o2, U u2, r rVar, int i) {
    }

    public final void V0(O o2, C0105t c0105t) {
        if (!c0105t.f2265a || c0105t.f2273l) {
            return;
        }
        int i = c0105t.f2270g;
        int i2 = c0105t.i;
        if (c0105t.f2269f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1477r.f() - i) + i2;
            if (this.f1480u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1477r.e(u2) < f2 || this.f1477r.o(u2) < f2) {
                        W0(o2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1477r.e(u3) < f2 || this.f1477r.o(u3) < f2) {
                    W0(o2, i4, i5);
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
        if (!this.f1480u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1477r.b(u4) > i6 || this.f1477r.n(u4) > i6) {
                    W0(o2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1477r.b(u5) > i6 || this.f1477r.n(u5) > i6) {
                W0(o2, i8, i9);
                return;
            }
        }
    }

    public final void W0(O o2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                j0(i);
                o2.f(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            j0(i3);
            o2.f(u3);
        }
    }

    public final void X0() {
        if (this.f1475p == 1 || !S0()) {
            this.f1480u = this.f1479t;
        } else {
            this.f1480u = !this.f1479t;
        }
    }

    public final int Y0(int i, O o2, U u2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        G0();
        this.f1476q.f2265a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        b1(i2, abs, true, u2);
        C0105t c0105t = this.f1476q;
        int H0 = H0(o2, c0105t, u2, false) + c0105t.f2270g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i = i2 * H0;
        }
        this.f1477r.p(-i);
        this.f1476q.f2271j = i;
        return i;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(V.d("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1475p || this.f1477r == null) {
            g a2 = g.a(this, i);
            this.f1477r = a2;
            this.f1471A.f2258a = a2;
            this.f1475p = i;
            l0();
        }
    }

    @Override // f0.T
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < I.H(u(0))) != this.f1480u ? -1 : 1;
        return this.f1475p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(boolean z2) {
        c(null);
        if (this.f1481v == z2) {
            return;
        }
        this.f1481v = z2;
        l0();
    }

    @Override // f0.I
    public void b0(O o2, U u2) {
        View focusedChild;
        View focusedChild2;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int O02;
        int i6;
        View q2;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f1485z == null && this.f1483x == -1) && u2.b() == 0) {
            g0(o2);
            return;
        }
        C0106u c0106u = this.f1485z;
        if (c0106u != null && (i8 = c0106u.f2274a) >= 0) {
            this.f1483x = i8;
        }
        G0();
        this.f1476q.f2265a = false;
        X0();
        RecyclerView recyclerView = this.f2068b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f2067a.d).contains(focusedChild)) {
            focusedChild = null;
        }
        r rVar = this.f1471A;
        if (!rVar.f2261e || this.f1483x != -1 || this.f1485z != null) {
            rVar.d();
            rVar.d = this.f1480u ^ this.f1481v;
            if (!u2.f2105g && (i = this.f1483x) != -1) {
                if (i < 0 || i >= u2.b()) {
                    this.f1483x = -1;
                    this.f1484y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1483x;
                    rVar.f2259b = i10;
                    C0106u c0106u2 = this.f1485z;
                    if (c0106u2 != null && c0106u2.f2274a >= 0) {
                        boolean z2 = c0106u2.f2276c;
                        rVar.d = z2;
                        if (z2) {
                            rVar.f2260c = this.f1477r.g() - this.f1485z.f2275b;
                        } else {
                            rVar.f2260c = this.f1477r.k() + this.f1485z.f2275b;
                        }
                    } else if (this.f1484y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                rVar.d = (this.f1483x < I.H(u(0))) == this.f1480u;
                            }
                            rVar.a();
                        } else if (this.f1477r.c(q3) > this.f1477r.l()) {
                            rVar.a();
                        } else if (this.f1477r.e(q3) - this.f1477r.k() < 0) {
                            rVar.f2260c = this.f1477r.k();
                            rVar.d = false;
                        } else if (this.f1477r.g() - this.f1477r.b(q3) < 0) {
                            rVar.f2260c = this.f1477r.g();
                            rVar.d = true;
                        } else {
                            rVar.f2260c = rVar.d ? this.f1477r.m() + this.f1477r.b(q3) : this.f1477r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1480u;
                        rVar.d = z3;
                        if (z3) {
                            rVar.f2260c = this.f1477r.g() - this.f1484y;
                        } else {
                            rVar.f2260c = this.f1477r.k() + this.f1484y;
                        }
                    }
                    rVar.f2261e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2068b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f2067a.d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    J j2 = (J) focusedChild2.getLayoutParams();
                    if (!j2.f2079a.i() && j2.f2079a.b() >= 0 && j2.f2079a.b() < u2.b()) {
                        rVar.c(focusedChild2, I.H(focusedChild2));
                        rVar.f2261e = true;
                    }
                }
                if (this.f1478s == this.f1481v) {
                    View N02 = rVar.d ? this.f1480u ? N0(o2, u2, 0, v(), u2.b()) : N0(o2, u2, v() - 1, -1, u2.b()) : this.f1480u ? N0(o2, u2, v() - 1, -1, u2.b()) : N0(o2, u2, 0, v(), u2.b());
                    if (N02 != null) {
                        rVar.b(N02, I.H(N02));
                        if (!u2.f2105g && z0() && (this.f1477r.e(N02) >= this.f1477r.g() || this.f1477r.b(N02) < this.f1477r.k())) {
                            rVar.f2260c = rVar.d ? this.f1477r.g() : this.f1477r.k();
                        }
                        rVar.f2261e = true;
                    }
                }
            }
            rVar.a();
            rVar.f2259b = this.f1481v ? u2.b() - 1 : 0;
            rVar.f2261e = true;
        } else if (focusedChild != null && (this.f1477r.e(focusedChild) >= this.f1477r.g() || this.f1477r.b(focusedChild) <= this.f1477r.k())) {
            rVar.c(focusedChild, I.H(focusedChild));
        }
        C0105t c0105t = this.f1476q;
        c0105t.f2269f = c0105t.f2271j >= 0 ? 1 : -1;
        int[] iArr = this.f1474D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(u2, iArr);
        int k2 = this.f1477r.k() + Math.max(0, iArr[0]);
        int h = this.f1477r.h() + Math.max(0, iArr[1]);
        if (u2.f2105g && (i6 = this.f1483x) != -1 && this.f1484y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1480u) {
                i7 = this.f1477r.g() - this.f1477r.b(q2);
                e2 = this.f1484y;
            } else {
                e2 = this.f1477r.e(q2) - this.f1477r.k();
                i7 = this.f1484y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        if (!rVar.d ? !this.f1480u : this.f1480u) {
            i9 = 1;
        }
        U0(o2, u2, rVar, i9);
        p(o2);
        this.f1476q.f2273l = this.f1477r.i() == 0 && this.f1477r.f() == 0;
        this.f1476q.getClass();
        this.f1476q.i = 0;
        if (rVar.d) {
            d1(rVar.f2259b, rVar.f2260c);
            C0105t c0105t2 = this.f1476q;
            c0105t2.h = k2;
            H0(o2, c0105t2, u2, false);
            C0105t c0105t3 = this.f1476q;
            i3 = c0105t3.f2266b;
            int i12 = c0105t3.d;
            int i13 = c0105t3.f2267c;
            if (i13 > 0) {
                h += i13;
            }
            c1(rVar.f2259b, rVar.f2260c);
            C0105t c0105t4 = this.f1476q;
            c0105t4.h = h;
            c0105t4.d += c0105t4.f2268e;
            H0(o2, c0105t4, u2, false);
            C0105t c0105t5 = this.f1476q;
            i2 = c0105t5.f2266b;
            int i14 = c0105t5.f2267c;
            if (i14 > 0) {
                d1(i12, i3);
                C0105t c0105t6 = this.f1476q;
                c0105t6.h = i14;
                H0(o2, c0105t6, u2, false);
                i3 = this.f1476q.f2266b;
            }
        } else {
            c1(rVar.f2259b, rVar.f2260c);
            C0105t c0105t7 = this.f1476q;
            c0105t7.h = h;
            H0(o2, c0105t7, u2, false);
            C0105t c0105t8 = this.f1476q;
            i2 = c0105t8.f2266b;
            int i15 = c0105t8.d;
            int i16 = c0105t8.f2267c;
            if (i16 > 0) {
                k2 += i16;
            }
            d1(rVar.f2259b, rVar.f2260c);
            C0105t c0105t9 = this.f1476q;
            c0105t9.h = k2;
            c0105t9.d += c0105t9.f2268e;
            H0(o2, c0105t9, u2, false);
            C0105t c0105t10 = this.f1476q;
            i3 = c0105t10.f2266b;
            int i17 = c0105t10.f2267c;
            if (i17 > 0) {
                c1(i15, i2);
                C0105t c0105t11 = this.f1476q;
                c0105t11.h = i17;
                H0(o2, c0105t11, u2, false);
                i2 = this.f1476q.f2266b;
            }
        }
        if (v() > 0) {
            if (this.f1480u ^ this.f1481v) {
                int O03 = O0(i2, o2, u2, true);
                i4 = i3 + O03;
                i5 = i2 + O03;
                O02 = P0(i4, o2, u2, false);
            } else {
                int P02 = P0(i3, o2, u2, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                O02 = O0(i5, o2, u2, false);
            }
            i3 = i4 + O02;
            i2 = i5 + O02;
        }
        if (u2.f2107k && v() != 0 && !u2.f2105g && z0()) {
            List list2 = o2.d;
            int size = list2.size();
            int H2 = I.H(u(0));
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                X x2 = (X) list2.get(i20);
                if (!x2.i()) {
                    boolean z4 = x2.b() < H2;
                    boolean z5 = this.f1480u;
                    View view = x2.f2118a;
                    if (z4 != z5) {
                        i18 += this.f1477r.c(view);
                    } else {
                        i19 += this.f1477r.c(view);
                    }
                }
            }
            this.f1476q.f2272k = list2;
            if (i18 > 0) {
                d1(I.H(R0()), i3);
                C0105t c0105t12 = this.f1476q;
                c0105t12.h = i18;
                c0105t12.f2267c = 0;
                c0105t12.a(null);
                H0(o2, this.f1476q, u2, false);
            }
            if (i19 > 0) {
                c1(I.H(Q0()), i2);
                C0105t c0105t13 = this.f1476q;
                c0105t13.h = i19;
                c0105t13.f2267c = 0;
                list = null;
                c0105t13.a(null);
                H0(o2, this.f1476q, u2, false);
            } else {
                list = null;
            }
            this.f1476q.f2272k = list;
        }
        if (u2.f2105g) {
            rVar.d();
        } else {
            g gVar = this.f1477r;
            gVar.f785a = gVar.l();
        }
        this.f1478s = this.f1481v;
    }

    public final void b1(int i, int i2, boolean z2, U u2) {
        int k2;
        this.f1476q.f2273l = this.f1477r.i() == 0 && this.f1477r.f() == 0;
        this.f1476q.f2269f = i;
        int[] iArr = this.f1474D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(u2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0105t c0105t = this.f1476q;
        int i3 = z3 ? max2 : max;
        c0105t.h = i3;
        if (!z3) {
            max = max2;
        }
        c0105t.i = max;
        if (z3) {
            c0105t.h = this.f1477r.h() + i3;
            View Q02 = Q0();
            C0105t c0105t2 = this.f1476q;
            c0105t2.f2268e = this.f1480u ? -1 : 1;
            int H2 = I.H(Q02);
            C0105t c0105t3 = this.f1476q;
            c0105t2.d = H2 + c0105t3.f2268e;
            c0105t3.f2266b = this.f1477r.b(Q02);
            k2 = this.f1477r.b(Q02) - this.f1477r.g();
        } else {
            View R02 = R0();
            C0105t c0105t4 = this.f1476q;
            c0105t4.h = this.f1477r.k() + c0105t4.h;
            C0105t c0105t5 = this.f1476q;
            c0105t5.f2268e = this.f1480u ? 1 : -1;
            int H3 = I.H(R02);
            C0105t c0105t6 = this.f1476q;
            c0105t5.d = H3 + c0105t6.f2268e;
            c0105t6.f2266b = this.f1477r.e(R02);
            k2 = (-this.f1477r.e(R02)) + this.f1477r.k();
        }
        C0105t c0105t7 = this.f1476q;
        c0105t7.f2267c = i2;
        if (z2) {
            c0105t7.f2267c = i2 - k2;
        }
        c0105t7.f2270g = k2;
    }

    @Override // f0.I
    public final void c(String str) {
        if (this.f1485z == null) {
            super.c(str);
        }
    }

    @Override // f0.I
    public void c0(U u2) {
        this.f1485z = null;
        this.f1483x = -1;
        this.f1484y = Integer.MIN_VALUE;
        this.f1471A.d();
    }

    public final void c1(int i, int i2) {
        this.f1476q.f2267c = this.f1477r.g() - i2;
        C0105t c0105t = this.f1476q;
        c0105t.f2268e = this.f1480u ? -1 : 1;
        c0105t.d = i;
        c0105t.f2269f = 1;
        c0105t.f2266b = i2;
        c0105t.f2270g = Integer.MIN_VALUE;
    }

    @Override // f0.I
    public final boolean d() {
        return this.f1475p == 0;
    }

    @Override // f0.I
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0106u) {
            this.f1485z = (C0106u) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i2) {
        this.f1476q.f2267c = i2 - this.f1477r.k();
        C0105t c0105t = this.f1476q;
        c0105t.d = i;
        c0105t.f2268e = this.f1480u ? 1 : -1;
        c0105t.f2269f = -1;
        c0105t.f2266b = i2;
        c0105t.f2270g = Integer.MIN_VALUE;
    }

    @Override // f0.I
    public final boolean e() {
        return this.f1475p == 1;
    }

    @Override // f0.I
    public final Parcelable e0() {
        C0106u c0106u = this.f1485z;
        if (c0106u != null) {
            C0106u c0106u2 = new C0106u();
            c0106u2.f2274a = c0106u.f2274a;
            c0106u2.f2275b = c0106u.f2275b;
            c0106u2.f2276c = c0106u.f2276c;
            return c0106u2;
        }
        C0106u c0106u3 = new C0106u();
        if (v() > 0) {
            G0();
            boolean z2 = this.f1478s ^ this.f1480u;
            c0106u3.f2276c = z2;
            if (z2) {
                View Q02 = Q0();
                c0106u3.f2275b = this.f1477r.g() - this.f1477r.b(Q02);
                c0106u3.f2274a = I.H(Q02);
            } else {
                View R02 = R0();
                c0106u3.f2274a = I.H(R02);
                c0106u3.f2275b = this.f1477r.e(R02) - this.f1477r.k();
            }
        } else {
            c0106u3.f2274a = -1;
        }
        return c0106u3;
    }

    @Override // f0.I
    public final void h(int i, int i2, U u2, C0099m c0099m) {
        if (this.f1475p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, u2);
        B0(u2, this.f1476q, c0099m);
    }

    @Override // f0.I
    public final void i(int i, C0099m c0099m) {
        boolean z2;
        int i2;
        C0106u c0106u = this.f1485z;
        if (c0106u == null || (i2 = c0106u.f2274a) < 0) {
            X0();
            z2 = this.f1480u;
            i2 = this.f1483x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0106u.f2276c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1473C && i2 >= 0 && i2 < i; i4++) {
            c0099m.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // f0.I
    public final int j(U u2) {
        return C0(u2);
    }

    @Override // f0.I
    public int k(U u2) {
        return D0(u2);
    }

    @Override // f0.I
    public int l(U u2) {
        return E0(u2);
    }

    @Override // f0.I
    public final int m(U u2) {
        return C0(u2);
    }

    @Override // f0.I
    public int m0(int i, O o2, U u2) {
        if (this.f1475p == 1) {
            return 0;
        }
        return Y0(i, o2, u2);
    }

    @Override // f0.I
    public int n(U u2) {
        return D0(u2);
    }

    @Override // f0.I
    public final void n0(int i) {
        this.f1483x = i;
        this.f1484y = Integer.MIN_VALUE;
        C0106u c0106u = this.f1485z;
        if (c0106u != null) {
            c0106u.f2274a = -1;
        }
        l0();
    }

    @Override // f0.I
    public int o(U u2) {
        return E0(u2);
    }

    @Override // f0.I
    public int o0(int i, O o2, U u2) {
        if (this.f1475p == 0) {
            return 0;
        }
        return Y0(i, o2, u2);
    }

    @Override // f0.I
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - I.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (I.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // f0.I
    public J r() {
        return new J(-2, -2);
    }

    @Override // f0.I
    public final boolean v0() {
        if (this.f2076m == 1073741824 || this.f2075l == 1073741824) {
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

    @Override // f0.I
    public void x0(RecyclerView recyclerView, int i) {
        C0107v c0107v = new C0107v(recyclerView.getContext());
        c0107v.f2277a = i;
        y0(c0107v);
    }

    @Override // f0.I
    public boolean z0() {
        return this.f1485z == null && this.f1478s == this.f1481v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1475p = 1;
        this.f1479t = false;
        this.f1480u = false;
        this.f1481v = false;
        this.f1482w = true;
        this.f1483x = -1;
        this.f1484y = Integer.MIN_VALUE;
        this.f1485z = null;
        this.f1471A = new r();
        this.f1472B = new C0104s();
        this.f1473C = 2;
        this.f1474D = new int[2];
        H I2 = I.I(context, attributeSet, i, i2);
        Z0(I2.f2064a);
        boolean z2 = I2.f2066c;
        c(null);
        if (z2 != this.f1479t) {
            this.f1479t = z2;
            l0();
        }
        a1(I2.d);
    }
}
