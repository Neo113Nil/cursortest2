package androidx.recyclerview.widget;

import T.g;
import X0.e;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import e0.C0126m;
import e0.C0131s;
import e0.C0132t;
import e0.C0133u;
import e0.C0134v;
import e0.H;
import e0.I;
import e0.J;
import e0.O;
import e0.T;
import e0.U;
import e0.X;
import e0.r;
import java.util.ArrayList;
import java.util.List;
import q1.l;

/* loaded from: classes.dex */
public class LinearLayoutManager extends I implements T {

    /* renamed from: A, reason: collision with root package name */
    public final r f1526A;

    /* renamed from: B, reason: collision with root package name */
    public final C0131s f1527B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1528C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1529D;

    /* renamed from: p, reason: collision with root package name */
    public int f1530p;

    /* renamed from: q, reason: collision with root package name */
    public C0132t f1531q;

    /* renamed from: r, reason: collision with root package name */
    public g f1532r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1533s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1534t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1535u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1536v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1537w;

    /* renamed from: x, reason: collision with root package name */
    public int f1538x;

    /* renamed from: y, reason: collision with root package name */
    public int f1539y;

    /* renamed from: z, reason: collision with root package name */
    public C0133u f1540z;

    public LinearLayoutManager(int i) {
        this.f1530p = 1;
        this.f1534t = false;
        this.f1535u = false;
        this.f1536v = false;
        this.f1537w = true;
        this.f1538x = -1;
        this.f1539y = Integer.MIN_VALUE;
        this.f1540z = null;
        this.f1526A = new r();
        this.f1527B = new C0131s();
        this.f1528C = 2;
        this.f1529D = new int[2];
        Z0(i);
        c(null);
        if (this.f1534t) {
            this.f1534t = false;
            l0();
        }
    }

    public void A0(U u2, int[] iArr) {
        int i;
        int l2 = u2.f2152a != -1 ? this.f1532r.l() : 0;
        if (this.f1531q.f2345f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void B0(U u2, C0132t c0132t, C0126m c0126m) {
        int i = c0132t.f2343d;
        if (i < 0 || i >= u2.b()) {
            return;
        }
        c0126m.a(i, Math.max(0, c0132t.f2346g));
    }

    public final int C0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1532r;
        boolean z2 = !this.f1537w;
        return l.k(u2, gVar, J0(z2), I0(z2), this, this.f1537w);
    }

    public final int D0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1532r;
        boolean z2 = !this.f1537w;
        return l.l(u2, gVar, J0(z2), I0(z2), this, this.f1537w, this.f1535u);
    }

    public final int E0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1532r;
        boolean z2 = !this.f1537w;
        return l.m(u2, gVar, J0(z2), I0(z2), this, this.f1537w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1530p == 1) ? 1 : Integer.MIN_VALUE : this.f1530p == 0 ? 1 : Integer.MIN_VALUE : this.f1530p == 1 ? -1 : Integer.MIN_VALUE : this.f1530p == 0 ? -1 : Integer.MIN_VALUE : (this.f1530p != 1 && S0()) ? -1 : 1 : (this.f1530p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f1531q == null) {
            C0132t c0132t = new C0132t();
            c0132t.f2340a = true;
            c0132t.h = 0;
            c0132t.i = 0;
            c0132t.f2348k = null;
            this.f1531q = c0132t;
        }
    }

    public final int H0(O o2, C0132t c0132t, U u2, boolean z2) {
        int i;
        int i2 = c0132t.f2342c;
        int i3 = c0132t.f2346g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0132t.f2346g = i3 + i2;
            }
            V0(o2, c0132t);
        }
        int i4 = c0132t.f2342c + c0132t.h;
        while (true) {
            if ((!c0132t.f2349l && i4 <= 0) || (i = c0132t.f2343d) < 0 || i >= u2.b()) {
                break;
            }
            C0131s c0131s = this.f1527B;
            c0131s.f2336a = 0;
            c0131s.f2337b = false;
            c0131s.f2338c = false;
            c0131s.f2339d = false;
            T0(o2, u2, c0132t, c0131s);
            if (!c0131s.f2337b) {
                int i5 = c0132t.f2341b;
                int i6 = c0131s.f2336a;
                c0132t.f2341b = (c0132t.f2345f * i6) + i5;
                if (!c0131s.f2338c || c0132t.f2348k != null || !u2.f2158g) {
                    c0132t.f2342c -= i6;
                    i4 -= i6;
                }
                int i7 = c0132t.f2346g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0132t.f2346g = i8;
                    int i9 = c0132t.f2342c;
                    if (i9 < 0) {
                        c0132t.f2346g = i8 + i9;
                    }
                    V0(o2, c0132t);
                }
                if (z2 && c0131s.f2339d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0132t.f2342c;
    }

    public final View I0(boolean z2) {
        return this.f1535u ? M0(0, v(), z2) : M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        return this.f1535u ? M0(v() - 1, -1, z2) : M0(0, v(), z2);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return I.H(M02);
    }

    @Override // e0.I
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
        if (this.f1532r.e(u(i)) < this.f1532r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1530p == 0 ? this.f2116c.y(i, i2, i3, i4) : this.f2117d.y(i, i2, i3, i4);
    }

    public final View M0(int i, int i2, boolean z2) {
        G0();
        int i3 = z2 ? 24579 : 320;
        return this.f1530p == 0 ? this.f2116c.y(i, i2, i3, 320) : this.f2117d.y(i, i2, i3, 320);
    }

    public View N0(O o2, U u2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1532r.k();
        int g2 = this.f1532r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u3 = u(i);
            int H2 = I.H(u3);
            if (H2 >= 0 && H2 < i3) {
                if (((J) u3.getLayoutParams()).f2127a.i()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f1532r.e(u3) < g2 && this.f1532r.b(u3) >= k2) {
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
        int g3 = this.f1532r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -Y0(-g3, o2, u2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1532r.g() - i3) <= 0) {
            return i2;
        }
        this.f1532r.p(g2);
        return g2 + i2;
    }

    public final int P0(int i, O o2, U u2, boolean z2) {
        int k2;
        int k3 = i - this.f1532r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -Y0(k3, o2, u2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1532r.k()) <= 0) {
            return i2;
        }
        this.f1532r.p(-k2);
        return i2 - k2;
    }

    public final View Q0() {
        return u(this.f1535u ? 0 : v() - 1);
    }

    @Override // e0.I
    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        return u(this.f1535u ? v() - 1 : 0);
    }

    @Override // e0.I
    public View S(View view, int i, O o2, U u2) {
        int F02;
        X0();
        if (v() == 0 || (F02 = F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        b1(F02, (int) (this.f1532r.l() * 0.33333334f), false, u2);
        C0132t c0132t = this.f1531q;
        c0132t.f2346g = Integer.MIN_VALUE;
        c0132t.f2340a = false;
        H0(o2, c0132t, u2, true);
        View L02 = F02 == -1 ? this.f1535u ? L0(v() - 1, -1) : L0(0, v()) : this.f1535u ? L0(0, v()) : L0(v() - 1, -1);
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

    @Override // e0.I
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : I.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(O o2, U u2, C0132t c0132t, C0131s c0131s) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0132t.b(o2);
        if (b2 == null) {
            c0131s.f2337b = true;
            return;
        }
        J j2 = (J) b2.getLayoutParams();
        if (c0132t.f2348k == null) {
            if (this.f1535u == (c0132t.f2345f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1535u == (c0132t.f2345f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        J j3 = (J) b2.getLayoutParams();
        Rect J2 = this.f2115b.J(b2);
        int i5 = J2.left + J2.right;
        int i6 = J2.top + J2.bottom;
        int w2 = I.w(d(), this.f2125n, this.f2123l, F() + E() + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin + i5, ((ViewGroup.MarginLayoutParams) j3).width);
        int w3 = I.w(e(), this.f2126o, this.f2124m, D() + G() + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) j3).height);
        if (u0(b2, w2, w3, j3)) {
            b2.measure(w2, w3);
        }
        c0131s.f2336a = this.f1532r.c(b2);
        if (this.f1530p == 1) {
            if (S0()) {
                i4 = this.f2125n - F();
                i = i4 - this.f1532r.d(b2);
            } else {
                i = E();
                i4 = this.f1532r.d(b2) + i;
            }
            if (c0132t.f2345f == -1) {
                i2 = c0132t.f2341b;
                i3 = i2 - c0131s.f2336a;
            } else {
                i3 = c0132t.f2341b;
                i2 = c0131s.f2336a + i3;
            }
        } else {
            int G2 = G();
            int d2 = this.f1532r.d(b2) + G2;
            if (c0132t.f2345f == -1) {
                int i7 = c0132t.f2341b;
                int i8 = i7 - c0131s.f2336a;
                i4 = i7;
                i2 = d2;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0132t.f2341b;
                int i10 = c0131s.f2336a + i9;
                i = i9;
                i2 = d2;
                i3 = G2;
                i4 = i10;
            }
        }
        I.N(b2, i, i3, i4, i2);
        if (j2.f2127a.i() || j2.f2127a.l()) {
            c0131s.f2338c = true;
        }
        c0131s.f2339d = b2.hasFocusable();
    }

    public void U0(O o2, U u2, r rVar, int i) {
    }

    public final void V0(O o2, C0132t c0132t) {
        if (!c0132t.f2340a || c0132t.f2349l) {
            return;
        }
        int i = c0132t.f2346g;
        int i2 = c0132t.i;
        if (c0132t.f2345f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1532r.f() - i) + i2;
            if (this.f1535u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1532r.e(u2) < f2 || this.f1532r.o(u2) < f2) {
                        W0(o2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1532r.e(u3) < f2 || this.f1532r.o(u3) < f2) {
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
        if (!this.f1535u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1532r.b(u4) > i6 || this.f1532r.n(u4) > i6) {
                    W0(o2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1532r.b(u5) > i6 || this.f1532r.n(u5) > i6) {
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
        if (this.f1530p == 1 || !S0()) {
            this.f1535u = this.f1534t;
        } else {
            this.f1535u = !this.f1534t;
        }
    }

    public final int Y0(int i, O o2, U u2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        G0();
        this.f1531q.f2340a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        b1(i2, abs, true, u2);
        C0132t c0132t = this.f1531q;
        int H02 = H0(o2, c0132t, u2, false) + c0132t.f2346g;
        if (H02 < 0) {
            return 0;
        }
        if (abs > H02) {
            i = i2 * H02;
        }
        this.f1532r.p(-i);
        this.f1531q.f2347j = i;
        return i;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(e.d("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1530p || this.f1532r == null) {
            g a2 = g.a(this, i);
            this.f1532r = a2;
            this.f1526A.f2331a = a2;
            this.f1530p = i;
            l0();
        }
    }

    @Override // e0.T
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < I.H(u(0))) != this.f1535u ? -1 : 1;
        return this.f1530p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(boolean z2) {
        c(null);
        if (this.f1536v == z2) {
            return;
        }
        this.f1536v = z2;
        l0();
    }

    @Override // e0.I
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
        if (!(this.f1540z == null && this.f1538x == -1) && u2.b() == 0) {
            g0(o2);
            return;
        }
        C0133u c0133u = this.f1540z;
        if (c0133u != null && (i8 = c0133u.f2350a) >= 0) {
            this.f1538x = i8;
        }
        G0();
        this.f1531q.f2340a = false;
        X0();
        RecyclerView recyclerView = this.f2115b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f2114a.f813d).contains(focusedChild)) {
            focusedChild = null;
        }
        r rVar = this.f1526A;
        if (!rVar.f2335e || this.f1538x != -1 || this.f1540z != null) {
            rVar.d();
            rVar.f2334d = this.f1535u ^ this.f1536v;
            if (!u2.f2158g && (i = this.f1538x) != -1) {
                if (i < 0 || i >= u2.b()) {
                    this.f1538x = -1;
                    this.f1539y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1538x;
                    rVar.f2332b = i10;
                    C0133u c0133u2 = this.f1540z;
                    if (c0133u2 != null && c0133u2.f2350a >= 0) {
                        boolean z2 = c0133u2.f2352c;
                        rVar.f2334d = z2;
                        if (z2) {
                            rVar.f2333c = this.f1532r.g() - this.f1540z.f2351b;
                        } else {
                            rVar.f2333c = this.f1532r.k() + this.f1540z.f2351b;
                        }
                    } else if (this.f1539y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                rVar.f2334d = (this.f1538x < I.H(u(0))) == this.f1535u;
                            }
                            rVar.a();
                        } else if (this.f1532r.c(q3) > this.f1532r.l()) {
                            rVar.a();
                        } else if (this.f1532r.e(q3) - this.f1532r.k() < 0) {
                            rVar.f2333c = this.f1532r.k();
                            rVar.f2334d = false;
                        } else if (this.f1532r.g() - this.f1532r.b(q3) < 0) {
                            rVar.f2333c = this.f1532r.g();
                            rVar.f2334d = true;
                        } else {
                            rVar.f2333c = rVar.f2334d ? this.f1532r.m() + this.f1532r.b(q3) : this.f1532r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1535u;
                        rVar.f2334d = z3;
                        if (z3) {
                            rVar.f2333c = this.f1532r.g() - this.f1539y;
                        } else {
                            rVar.f2333c = this.f1532r.k() + this.f1539y;
                        }
                    }
                    rVar.f2335e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2115b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f2114a.f813d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    J j2 = (J) focusedChild2.getLayoutParams();
                    if (!j2.f2127a.i() && j2.f2127a.b() >= 0 && j2.f2127a.b() < u2.b()) {
                        rVar.c(focusedChild2, I.H(focusedChild2));
                        rVar.f2335e = true;
                    }
                }
                if (this.f1533s == this.f1536v) {
                    View N02 = rVar.f2334d ? this.f1535u ? N0(o2, u2, 0, v(), u2.b()) : N0(o2, u2, v() - 1, -1, u2.b()) : this.f1535u ? N0(o2, u2, v() - 1, -1, u2.b()) : N0(o2, u2, 0, v(), u2.b());
                    if (N02 != null) {
                        rVar.b(N02, I.H(N02));
                        if (!u2.f2158g && z0() && (this.f1532r.e(N02) >= this.f1532r.g() || this.f1532r.b(N02) < this.f1532r.k())) {
                            rVar.f2333c = rVar.f2334d ? this.f1532r.g() : this.f1532r.k();
                        }
                        rVar.f2335e = true;
                    }
                }
            }
            rVar.a();
            rVar.f2332b = this.f1536v ? u2.b() - 1 : 0;
            rVar.f2335e = true;
        } else if (focusedChild != null && (this.f1532r.e(focusedChild) >= this.f1532r.g() || this.f1532r.b(focusedChild) <= this.f1532r.k())) {
            rVar.c(focusedChild, I.H(focusedChild));
        }
        C0132t c0132t = this.f1531q;
        c0132t.f2345f = c0132t.f2347j >= 0 ? 1 : -1;
        int[] iArr = this.f1529D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(u2, iArr);
        int k2 = this.f1532r.k() + Math.max(0, iArr[0]);
        int h = this.f1532r.h() + Math.max(0, iArr[1]);
        if (u2.f2158g && (i6 = this.f1538x) != -1 && this.f1539y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1535u) {
                i7 = this.f1532r.g() - this.f1532r.b(q2);
                e2 = this.f1539y;
            } else {
                e2 = this.f1532r.e(q2) - this.f1532r.k();
                i7 = this.f1539y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        if (!rVar.f2334d ? !this.f1535u : this.f1535u) {
            i9 = 1;
        }
        U0(o2, u2, rVar, i9);
        p(o2);
        this.f1531q.f2349l = this.f1532r.i() == 0 && this.f1532r.f() == 0;
        this.f1531q.getClass();
        this.f1531q.i = 0;
        if (rVar.f2334d) {
            d1(rVar.f2332b, rVar.f2333c);
            C0132t c0132t2 = this.f1531q;
            c0132t2.h = k2;
            H0(o2, c0132t2, u2, false);
            C0132t c0132t3 = this.f1531q;
            i3 = c0132t3.f2341b;
            int i12 = c0132t3.f2343d;
            int i13 = c0132t3.f2342c;
            if (i13 > 0) {
                h += i13;
            }
            c1(rVar.f2332b, rVar.f2333c);
            C0132t c0132t4 = this.f1531q;
            c0132t4.h = h;
            c0132t4.f2343d += c0132t4.f2344e;
            H0(o2, c0132t4, u2, false);
            C0132t c0132t5 = this.f1531q;
            i2 = c0132t5.f2341b;
            int i14 = c0132t5.f2342c;
            if (i14 > 0) {
                d1(i12, i3);
                C0132t c0132t6 = this.f1531q;
                c0132t6.h = i14;
                H0(o2, c0132t6, u2, false);
                i3 = this.f1531q.f2341b;
            }
        } else {
            c1(rVar.f2332b, rVar.f2333c);
            C0132t c0132t7 = this.f1531q;
            c0132t7.h = h;
            H0(o2, c0132t7, u2, false);
            C0132t c0132t8 = this.f1531q;
            i2 = c0132t8.f2341b;
            int i15 = c0132t8.f2343d;
            int i16 = c0132t8.f2342c;
            if (i16 > 0) {
                k2 += i16;
            }
            d1(rVar.f2332b, rVar.f2333c);
            C0132t c0132t9 = this.f1531q;
            c0132t9.h = k2;
            c0132t9.f2343d += c0132t9.f2344e;
            H0(o2, c0132t9, u2, false);
            C0132t c0132t10 = this.f1531q;
            i3 = c0132t10.f2341b;
            int i17 = c0132t10.f2342c;
            if (i17 > 0) {
                c1(i15, i2);
                C0132t c0132t11 = this.f1531q;
                c0132t11.h = i17;
                H0(o2, c0132t11, u2, false);
                i2 = this.f1531q.f2341b;
            }
        }
        if (v() > 0) {
            if (this.f1535u ^ this.f1536v) {
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
        if (u2.f2160k && v() != 0 && !u2.f2158g && z0()) {
            List list2 = o2.f2140d;
            int size = list2.size();
            int H2 = I.H(u(0));
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                X x2 = (X) list2.get(i20);
                if (!x2.i()) {
                    boolean z4 = x2.b() < H2;
                    boolean z5 = this.f1535u;
                    View view = x2.f2172a;
                    if (z4 != z5) {
                        i18 += this.f1532r.c(view);
                    } else {
                        i19 += this.f1532r.c(view);
                    }
                }
            }
            this.f1531q.f2348k = list2;
            if (i18 > 0) {
                d1(I.H(R0()), i3);
                C0132t c0132t12 = this.f1531q;
                c0132t12.h = i18;
                c0132t12.f2342c = 0;
                c0132t12.a(null);
                H0(o2, this.f1531q, u2, false);
            }
            if (i19 > 0) {
                c1(I.H(Q0()), i2);
                C0132t c0132t13 = this.f1531q;
                c0132t13.h = i19;
                c0132t13.f2342c = 0;
                list = null;
                c0132t13.a(null);
                H0(o2, this.f1531q, u2, false);
            } else {
                list = null;
            }
            this.f1531q.f2348k = list;
        }
        if (u2.f2158g) {
            rVar.d();
        } else {
            g gVar = this.f1532r;
            gVar.f785a = gVar.l();
        }
        this.f1533s = this.f1536v;
    }

    public final void b1(int i, int i2, boolean z2, U u2) {
        int k2;
        this.f1531q.f2349l = this.f1532r.i() == 0 && this.f1532r.f() == 0;
        this.f1531q.f2345f = i;
        int[] iArr = this.f1529D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(u2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0132t c0132t = this.f1531q;
        int i3 = z3 ? max2 : max;
        c0132t.h = i3;
        if (!z3) {
            max = max2;
        }
        c0132t.i = max;
        if (z3) {
            c0132t.h = this.f1532r.h() + i3;
            View Q02 = Q0();
            C0132t c0132t2 = this.f1531q;
            c0132t2.f2344e = this.f1535u ? -1 : 1;
            int H2 = I.H(Q02);
            C0132t c0132t3 = this.f1531q;
            c0132t2.f2343d = H2 + c0132t3.f2344e;
            c0132t3.f2341b = this.f1532r.b(Q02);
            k2 = this.f1532r.b(Q02) - this.f1532r.g();
        } else {
            View R02 = R0();
            C0132t c0132t4 = this.f1531q;
            c0132t4.h = this.f1532r.k() + c0132t4.h;
            C0132t c0132t5 = this.f1531q;
            c0132t5.f2344e = this.f1535u ? 1 : -1;
            int H3 = I.H(R02);
            C0132t c0132t6 = this.f1531q;
            c0132t5.f2343d = H3 + c0132t6.f2344e;
            c0132t6.f2341b = this.f1532r.e(R02);
            k2 = (-this.f1532r.e(R02)) + this.f1532r.k();
        }
        C0132t c0132t7 = this.f1531q;
        c0132t7.f2342c = i2;
        if (z2) {
            c0132t7.f2342c = i2 - k2;
        }
        c0132t7.f2346g = k2;
    }

    @Override // e0.I
    public final void c(String str) {
        if (this.f1540z == null) {
            super.c(str);
        }
    }

    @Override // e0.I
    public void c0(U u2) {
        this.f1540z = null;
        this.f1538x = -1;
        this.f1539y = Integer.MIN_VALUE;
        this.f1526A.d();
    }

    public final void c1(int i, int i2) {
        this.f1531q.f2342c = this.f1532r.g() - i2;
        C0132t c0132t = this.f1531q;
        c0132t.f2344e = this.f1535u ? -1 : 1;
        c0132t.f2343d = i;
        c0132t.f2345f = 1;
        c0132t.f2341b = i2;
        c0132t.f2346g = Integer.MIN_VALUE;
    }

    @Override // e0.I
    public final boolean d() {
        return this.f1530p == 0;
    }

    @Override // e0.I
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0133u) {
            this.f1540z = (C0133u) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i2) {
        this.f1531q.f2342c = i2 - this.f1532r.k();
        C0132t c0132t = this.f1531q;
        c0132t.f2343d = i;
        c0132t.f2344e = this.f1535u ? 1 : -1;
        c0132t.f2345f = -1;
        c0132t.f2341b = i2;
        c0132t.f2346g = Integer.MIN_VALUE;
    }

    @Override // e0.I
    public final boolean e() {
        return this.f1530p == 1;
    }

    @Override // e0.I
    public final Parcelable e0() {
        C0133u c0133u = this.f1540z;
        if (c0133u != null) {
            C0133u c0133u2 = new C0133u();
            c0133u2.f2350a = c0133u.f2350a;
            c0133u2.f2351b = c0133u.f2351b;
            c0133u2.f2352c = c0133u.f2352c;
            return c0133u2;
        }
        C0133u c0133u3 = new C0133u();
        if (v() > 0) {
            G0();
            boolean z2 = this.f1533s ^ this.f1535u;
            c0133u3.f2352c = z2;
            if (z2) {
                View Q02 = Q0();
                c0133u3.f2351b = this.f1532r.g() - this.f1532r.b(Q02);
                c0133u3.f2350a = I.H(Q02);
            } else {
                View R02 = R0();
                c0133u3.f2350a = I.H(R02);
                c0133u3.f2351b = this.f1532r.e(R02) - this.f1532r.k();
            }
        } else {
            c0133u3.f2350a = -1;
        }
        return c0133u3;
    }

    @Override // e0.I
    public final void h(int i, int i2, U u2, C0126m c0126m) {
        if (this.f1530p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, u2);
        B0(u2, this.f1531q, c0126m);
    }

    @Override // e0.I
    public final void i(int i, C0126m c0126m) {
        boolean z2;
        int i2;
        C0133u c0133u = this.f1540z;
        if (c0133u == null || (i2 = c0133u.f2350a) < 0) {
            X0();
            z2 = this.f1535u;
            i2 = this.f1538x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0133u.f2352c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1528C && i2 >= 0 && i2 < i; i4++) {
            c0126m.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // e0.I
    public final int j(U u2) {
        return C0(u2);
    }

    @Override // e0.I
    public int k(U u2) {
        return D0(u2);
    }

    @Override // e0.I
    public int l(U u2) {
        return E0(u2);
    }

    @Override // e0.I
    public final int m(U u2) {
        return C0(u2);
    }

    @Override // e0.I
    public int m0(int i, O o2, U u2) {
        if (this.f1530p == 1) {
            return 0;
        }
        return Y0(i, o2, u2);
    }

    @Override // e0.I
    public int n(U u2) {
        return D0(u2);
    }

    @Override // e0.I
    public final void n0(int i) {
        this.f1538x = i;
        this.f1539y = Integer.MIN_VALUE;
        C0133u c0133u = this.f1540z;
        if (c0133u != null) {
            c0133u.f2350a = -1;
        }
        l0();
    }

    @Override // e0.I
    public int o(U u2) {
        return E0(u2);
    }

    @Override // e0.I
    public int o0(int i, O o2, U u2) {
        if (this.f1530p == 0) {
            return 0;
        }
        return Y0(i, o2, u2);
    }

    @Override // e0.I
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

    @Override // e0.I
    public J r() {
        return new J(-2, -2);
    }

    @Override // e0.I
    public final boolean v0() {
        if (this.f2124m == 1073741824 || this.f2123l == 1073741824) {
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

    @Override // e0.I
    public void x0(RecyclerView recyclerView, int i) {
        C0134v c0134v = new C0134v(recyclerView.getContext());
        c0134v.f2353a = i;
        y0(c0134v);
    }

    @Override // e0.I
    public boolean z0() {
        return this.f1540z == null && this.f1533s == this.f1536v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1530p = 1;
        this.f1534t = false;
        this.f1535u = false;
        this.f1536v = false;
        this.f1537w = true;
        this.f1538x = -1;
        this.f1539y = Integer.MIN_VALUE;
        this.f1540z = null;
        this.f1526A = new r();
        this.f1527B = new C0131s();
        this.f1528C = 2;
        this.f1529D = new int[2];
        H I2 = I.I(context, attributeSet, i, i2);
        Z0(I2.f2110a);
        boolean z2 = I2.f2112c;
        c(null);
        if (z2 != this.f1534t) {
            this.f1534t = z2;
            l0();
        }
        a1(I2.f2113d);
    }
}
