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
import f0.C0096m;
import f0.C0101s;
import f0.C0102t;
import f0.C0103u;
import f0.C0104v;
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
import q1.d;

/* loaded from: classes.dex */
public class LinearLayoutManager extends I implements T {

    /* renamed from: A, reason: collision with root package name */
    public final r f1391A;

    /* renamed from: B, reason: collision with root package name */
    public final C0101s f1392B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1393C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1394D;

    /* renamed from: p, reason: collision with root package name */
    public int f1395p;

    /* renamed from: q, reason: collision with root package name */
    public C0102t f1396q;

    /* renamed from: r, reason: collision with root package name */
    public g f1397r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1398s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1399t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1400u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1401v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1402w;

    /* renamed from: x, reason: collision with root package name */
    public int f1403x;

    /* renamed from: y, reason: collision with root package name */
    public int f1404y;

    /* renamed from: z, reason: collision with root package name */
    public C0103u f1405z;

    public LinearLayoutManager(int i) {
        this.f1395p = 1;
        this.f1399t = false;
        this.f1400u = false;
        this.f1401v = false;
        this.f1402w = true;
        this.f1403x = -1;
        this.f1404y = Integer.MIN_VALUE;
        this.f1405z = null;
        this.f1391A = new r();
        this.f1392B = new C0101s();
        this.f1393C = 2;
        this.f1394D = new int[2];
        Z0(i);
        c(null);
        if (this.f1399t) {
            this.f1399t = false;
            l0();
        }
    }

    public void A0(U u2, int[] iArr) {
        int i;
        int l2 = u2.f1989a != -1 ? this.f1397r.l() : 0;
        if (this.f1396q.f2158f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void B0(U u2, C0102t c0102t, C0096m c0096m) {
        int i = c0102t.d;
        if (i < 0 || i >= u2.b()) {
            return;
        }
        c0096m.a(i, Math.max(0, c0102t.f2159g));
    }

    public final int C0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1397r;
        boolean z2 = !this.f1402w;
        return d.l(u2, gVar, J0(z2), I0(z2), this, this.f1402w);
    }

    public final int D0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1397r;
        boolean z2 = !this.f1402w;
        return d.m(u2, gVar, J0(z2), I0(z2), this, this.f1402w, this.f1400u);
    }

    public final int E0(U u2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1397r;
        boolean z2 = !this.f1402w;
        return d.n(u2, gVar, J0(z2), I0(z2), this, this.f1402w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1395p == 1) ? 1 : Integer.MIN_VALUE : this.f1395p == 0 ? 1 : Integer.MIN_VALUE : this.f1395p == 1 ? -1 : Integer.MIN_VALUE : this.f1395p == 0 ? -1 : Integer.MIN_VALUE : (this.f1395p != 1 && S0()) ? -1 : 1 : (this.f1395p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f1396q == null) {
            C0102t c0102t = new C0102t();
            c0102t.f2154a = true;
            c0102t.h = 0;
            c0102t.i = 0;
            c0102t.f2161k = null;
            this.f1396q = c0102t;
        }
    }

    public final int H0(O o2, C0102t c0102t, U u2, boolean z2) {
        int i;
        int i2 = c0102t.f2156c;
        int i3 = c0102t.f2159g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0102t.f2159g = i3 + i2;
            }
            V0(o2, c0102t);
        }
        int i4 = c0102t.f2156c + c0102t.h;
        while (true) {
            if ((!c0102t.f2162l && i4 <= 0) || (i = c0102t.d) < 0 || i >= u2.b()) {
                break;
            }
            C0101s c0101s = this.f1392B;
            c0101s.f2151a = 0;
            c0101s.f2152b = false;
            c0101s.f2153c = false;
            c0101s.d = false;
            T0(o2, u2, c0102t, c0101s);
            if (!c0101s.f2152b) {
                int i5 = c0102t.f2155b;
                int i6 = c0101s.f2151a;
                c0102t.f2155b = (c0102t.f2158f * i6) + i5;
                if (!c0101s.f2153c || c0102t.f2161k != null || !u2.f1994g) {
                    c0102t.f2156c -= i6;
                    i4 -= i6;
                }
                int i7 = c0102t.f2159g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0102t.f2159g = i8;
                    int i9 = c0102t.f2156c;
                    if (i9 < 0) {
                        c0102t.f2159g = i8 + i9;
                    }
                    V0(o2, c0102t);
                }
                if (z2 && c0101s.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0102t.f2156c;
    }

    public final View I0(boolean z2) {
        return this.f1400u ? M0(0, v(), z2) : M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        return this.f1400u ? M0(v() - 1, -1, z2) : M0(0, v(), z2);
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
        if (this.f1397r.e(u(i)) < this.f1397r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1395p == 0 ? this.f1958c.u(i, i2, i3, i4) : this.d.u(i, i2, i3, i4);
    }

    public final View M0(int i, int i2, boolean z2) {
        G0();
        int i3 = z2 ? 24579 : 320;
        return this.f1395p == 0 ? this.f1958c.u(i, i2, i3, 320) : this.d.u(i, i2, i3, 320);
    }

    public View N0(O o2, U u2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1397r.k();
        int g2 = this.f1397r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u3 = u(i);
            int H2 = I.H(u3);
            if (H2 >= 0 && H2 < i3) {
                if (((J) u3.getLayoutParams()).f1968a.i()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f1397r.e(u3) < g2 && this.f1397r.b(u3) >= k2) {
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
        int g3 = this.f1397r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -Y0(-g3, o2, u2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1397r.g() - i3) <= 0) {
            return i2;
        }
        this.f1397r.p(g2);
        return g2 + i2;
    }

    public final int P0(int i, O o2, U u2, boolean z2) {
        int k2;
        int k3 = i - this.f1397r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -Y0(k3, o2, u2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1397r.k()) <= 0) {
            return i2;
        }
        this.f1397r.p(-k2);
        return i2 - k2;
    }

    public final View Q0() {
        return u(this.f1400u ? 0 : v() - 1);
    }

    @Override // f0.I
    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        return u(this.f1400u ? v() - 1 : 0);
    }

    @Override // f0.I
    public View S(View view, int i, O o2, U u2) {
        int F02;
        X0();
        if (v() == 0 || (F02 = F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        b1(F02, (int) (this.f1397r.l() * 0.33333334f), false, u2);
        C0102t c0102t = this.f1396q;
        c0102t.f2159g = Integer.MIN_VALUE;
        c0102t.f2154a = false;
        H0(o2, c0102t, u2, true);
        View L02 = F02 == -1 ? this.f1400u ? L0(v() - 1, -1) : L0(0, v()) : this.f1400u ? L0(0, v()) : L0(v() - 1, -1);
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

    public void T0(O o2, U u2, C0102t c0102t, C0101s c0101s) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0102t.b(o2);
        if (b2 == null) {
            c0101s.f2152b = true;
            return;
        }
        J j2 = (J) b2.getLayoutParams();
        if (c0102t.f2161k == null) {
            if (this.f1400u == (c0102t.f2158f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1400u == (c0102t.f2158f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        J j3 = (J) b2.getLayoutParams();
        Rect J2 = this.f1957b.J(b2);
        int i5 = J2.left + J2.right;
        int i6 = J2.top + J2.bottom;
        int w2 = I.w(d(), this.f1966n, this.f1964l, F() + E() + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin + i5, ((ViewGroup.MarginLayoutParams) j3).width);
        int w3 = I.w(e(), this.f1967o, this.f1965m, D() + G() + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) j3).height);
        if (u0(b2, w2, w3, j3)) {
            b2.measure(w2, w3);
        }
        c0101s.f2151a = this.f1397r.c(b2);
        if (this.f1395p == 1) {
            if (S0()) {
                i4 = this.f1966n - F();
                i = i4 - this.f1397r.d(b2);
            } else {
                i = E();
                i4 = this.f1397r.d(b2) + i;
            }
            if (c0102t.f2158f == -1) {
                i2 = c0102t.f2155b;
                i3 = i2 - c0101s.f2151a;
            } else {
                i3 = c0102t.f2155b;
                i2 = c0101s.f2151a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1397r.d(b2) + G2;
            if (c0102t.f2158f == -1) {
                int i7 = c0102t.f2155b;
                int i8 = i7 - c0101s.f2151a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0102t.f2155b;
                int i10 = c0101s.f2151a + i9;
                i = i9;
                i2 = d;
                i3 = G2;
                i4 = i10;
            }
        }
        I.N(b2, i, i3, i4, i2);
        if (j2.f1968a.i() || j2.f1968a.l()) {
            c0101s.f2153c = true;
        }
        c0101s.d = b2.hasFocusable();
    }

    public void U0(O o2, U u2, r rVar, int i) {
    }

    public final void V0(O o2, C0102t c0102t) {
        if (!c0102t.f2154a || c0102t.f2162l) {
            return;
        }
        int i = c0102t.f2159g;
        int i2 = c0102t.i;
        if (c0102t.f2158f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1397r.f() - i) + i2;
            if (this.f1400u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1397r.e(u2) < f2 || this.f1397r.o(u2) < f2) {
                        W0(o2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1397r.e(u3) < f2 || this.f1397r.o(u3) < f2) {
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
        if (!this.f1400u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1397r.b(u4) > i6 || this.f1397r.n(u4) > i6) {
                    W0(o2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1397r.b(u5) > i6 || this.f1397r.n(u5) > i6) {
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
        if (this.f1395p == 1 || !S0()) {
            this.f1400u = this.f1399t;
        } else {
            this.f1400u = !this.f1399t;
        }
    }

    public final int Y0(int i, O o2, U u2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        G0();
        this.f1396q.f2154a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        b1(i2, abs, true, u2);
        C0102t c0102t = this.f1396q;
        int H02 = H0(o2, c0102t, u2, false) + c0102t.f2159g;
        if (H02 < 0) {
            return 0;
        }
        if (abs > H02) {
            i = i2 * H02;
        }
        this.f1397r.p(-i);
        this.f1396q.f2160j = i;
        return i;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(V.d("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1395p || this.f1397r == null) {
            g a2 = g.a(this, i);
            this.f1397r = a2;
            this.f1391A.f2147a = a2;
            this.f1395p = i;
            l0();
        }
    }

    @Override // f0.T
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < I.H(u(0))) != this.f1400u ? -1 : 1;
        return this.f1395p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(boolean z2) {
        c(null);
        if (this.f1401v == z2) {
            return;
        }
        this.f1401v = z2;
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
        if (!(this.f1405z == null && this.f1403x == -1) && u2.b() == 0) {
            g0(o2);
            return;
        }
        C0103u c0103u = this.f1405z;
        if (c0103u != null && (i8 = c0103u.f2163a) >= 0) {
            this.f1403x = i8;
        }
        G0();
        this.f1396q.f2154a = false;
        X0();
        RecyclerView recyclerView = this.f1957b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f1956a.d).contains(focusedChild)) {
            focusedChild = null;
        }
        r rVar = this.f1391A;
        if (!rVar.f2150e || this.f1403x != -1 || this.f1405z != null) {
            rVar.d();
            rVar.d = this.f1400u ^ this.f1401v;
            if (!u2.f1994g && (i = this.f1403x) != -1) {
                if (i < 0 || i >= u2.b()) {
                    this.f1403x = -1;
                    this.f1404y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1403x;
                    rVar.f2148b = i10;
                    C0103u c0103u2 = this.f1405z;
                    if (c0103u2 != null && c0103u2.f2163a >= 0) {
                        boolean z2 = c0103u2.f2165c;
                        rVar.d = z2;
                        if (z2) {
                            rVar.f2149c = this.f1397r.g() - this.f1405z.f2164b;
                        } else {
                            rVar.f2149c = this.f1397r.k() + this.f1405z.f2164b;
                        }
                    } else if (this.f1404y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                rVar.d = (this.f1403x < I.H(u(0))) == this.f1400u;
                            }
                            rVar.a();
                        } else if (this.f1397r.c(q3) > this.f1397r.l()) {
                            rVar.a();
                        } else if (this.f1397r.e(q3) - this.f1397r.k() < 0) {
                            rVar.f2149c = this.f1397r.k();
                            rVar.d = false;
                        } else if (this.f1397r.g() - this.f1397r.b(q3) < 0) {
                            rVar.f2149c = this.f1397r.g();
                            rVar.d = true;
                        } else {
                            rVar.f2149c = rVar.d ? this.f1397r.m() + this.f1397r.b(q3) : this.f1397r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1400u;
                        rVar.d = z3;
                        if (z3) {
                            rVar.f2149c = this.f1397r.g() - this.f1404y;
                        } else {
                            rVar.f2149c = this.f1397r.k() + this.f1404y;
                        }
                    }
                    rVar.f2150e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f1957b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f1956a.d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    J j2 = (J) focusedChild2.getLayoutParams();
                    if (!j2.f1968a.i() && j2.f1968a.b() >= 0 && j2.f1968a.b() < u2.b()) {
                        rVar.c(focusedChild2, I.H(focusedChild2));
                        rVar.f2150e = true;
                    }
                }
                if (this.f1398s == this.f1401v) {
                    View N02 = rVar.d ? this.f1400u ? N0(o2, u2, 0, v(), u2.b()) : N0(o2, u2, v() - 1, -1, u2.b()) : this.f1400u ? N0(o2, u2, v() - 1, -1, u2.b()) : N0(o2, u2, 0, v(), u2.b());
                    if (N02 != null) {
                        rVar.b(N02, I.H(N02));
                        if (!u2.f1994g && z0() && (this.f1397r.e(N02) >= this.f1397r.g() || this.f1397r.b(N02) < this.f1397r.k())) {
                            rVar.f2149c = rVar.d ? this.f1397r.g() : this.f1397r.k();
                        }
                        rVar.f2150e = true;
                    }
                }
            }
            rVar.a();
            rVar.f2148b = this.f1401v ? u2.b() - 1 : 0;
            rVar.f2150e = true;
        } else if (focusedChild != null && (this.f1397r.e(focusedChild) >= this.f1397r.g() || this.f1397r.b(focusedChild) <= this.f1397r.k())) {
            rVar.c(focusedChild, I.H(focusedChild));
        }
        C0102t c0102t = this.f1396q;
        c0102t.f2158f = c0102t.f2160j >= 0 ? 1 : -1;
        int[] iArr = this.f1394D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(u2, iArr);
        int k2 = this.f1397r.k() + Math.max(0, iArr[0]);
        int h = this.f1397r.h() + Math.max(0, iArr[1]);
        if (u2.f1994g && (i6 = this.f1403x) != -1 && this.f1404y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1400u) {
                i7 = this.f1397r.g() - this.f1397r.b(q2);
                e2 = this.f1404y;
            } else {
                e2 = this.f1397r.e(q2) - this.f1397r.k();
                i7 = this.f1404y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        if (!rVar.d ? !this.f1400u : this.f1400u) {
            i9 = 1;
        }
        U0(o2, u2, rVar, i9);
        p(o2);
        this.f1396q.f2162l = this.f1397r.i() == 0 && this.f1397r.f() == 0;
        this.f1396q.getClass();
        this.f1396q.i = 0;
        if (rVar.d) {
            d1(rVar.f2148b, rVar.f2149c);
            C0102t c0102t2 = this.f1396q;
            c0102t2.h = k2;
            H0(o2, c0102t2, u2, false);
            C0102t c0102t3 = this.f1396q;
            i3 = c0102t3.f2155b;
            int i12 = c0102t3.d;
            int i13 = c0102t3.f2156c;
            if (i13 > 0) {
                h += i13;
            }
            c1(rVar.f2148b, rVar.f2149c);
            C0102t c0102t4 = this.f1396q;
            c0102t4.h = h;
            c0102t4.d += c0102t4.f2157e;
            H0(o2, c0102t4, u2, false);
            C0102t c0102t5 = this.f1396q;
            i2 = c0102t5.f2155b;
            int i14 = c0102t5.f2156c;
            if (i14 > 0) {
                d1(i12, i3);
                C0102t c0102t6 = this.f1396q;
                c0102t6.h = i14;
                H0(o2, c0102t6, u2, false);
                i3 = this.f1396q.f2155b;
            }
        } else {
            c1(rVar.f2148b, rVar.f2149c);
            C0102t c0102t7 = this.f1396q;
            c0102t7.h = h;
            H0(o2, c0102t7, u2, false);
            C0102t c0102t8 = this.f1396q;
            i2 = c0102t8.f2155b;
            int i15 = c0102t8.d;
            int i16 = c0102t8.f2156c;
            if (i16 > 0) {
                k2 += i16;
            }
            d1(rVar.f2148b, rVar.f2149c);
            C0102t c0102t9 = this.f1396q;
            c0102t9.h = k2;
            c0102t9.d += c0102t9.f2157e;
            H0(o2, c0102t9, u2, false);
            C0102t c0102t10 = this.f1396q;
            i3 = c0102t10.f2155b;
            int i17 = c0102t10.f2156c;
            if (i17 > 0) {
                c1(i15, i2);
                C0102t c0102t11 = this.f1396q;
                c0102t11.h = i17;
                H0(o2, c0102t11, u2, false);
                i2 = this.f1396q.f2155b;
            }
        }
        if (v() > 0) {
            if (this.f1400u ^ this.f1401v) {
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
        if (u2.f1996k && v() != 0 && !u2.f1994g && z0()) {
            List list2 = o2.d;
            int size = list2.size();
            int H2 = I.H(u(0));
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                X x2 = (X) list2.get(i20);
                if (!x2.i()) {
                    boolean z4 = x2.b() < H2;
                    boolean z5 = this.f1400u;
                    View view = x2.f2007a;
                    if (z4 != z5) {
                        i18 += this.f1397r.c(view);
                    } else {
                        i19 += this.f1397r.c(view);
                    }
                }
            }
            this.f1396q.f2161k = list2;
            if (i18 > 0) {
                d1(I.H(R0()), i3);
                C0102t c0102t12 = this.f1396q;
                c0102t12.h = i18;
                c0102t12.f2156c = 0;
                c0102t12.a(null);
                H0(o2, this.f1396q, u2, false);
            }
            if (i19 > 0) {
                c1(I.H(Q0()), i2);
                C0102t c0102t13 = this.f1396q;
                c0102t13.h = i19;
                c0102t13.f2156c = 0;
                list = null;
                c0102t13.a(null);
                H0(o2, this.f1396q, u2, false);
            } else {
                list = null;
            }
            this.f1396q.f2161k = list;
        }
        if (u2.f1994g) {
            rVar.d();
        } else {
            g gVar = this.f1397r;
            gVar.f714a = gVar.l();
        }
        this.f1398s = this.f1401v;
    }

    public final void b1(int i, int i2, boolean z2, U u2) {
        int k2;
        this.f1396q.f2162l = this.f1397r.i() == 0 && this.f1397r.f() == 0;
        this.f1396q.f2158f = i;
        int[] iArr = this.f1394D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(u2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0102t c0102t = this.f1396q;
        int i3 = z3 ? max2 : max;
        c0102t.h = i3;
        if (!z3) {
            max = max2;
        }
        c0102t.i = max;
        if (z3) {
            c0102t.h = this.f1397r.h() + i3;
            View Q02 = Q0();
            C0102t c0102t2 = this.f1396q;
            c0102t2.f2157e = this.f1400u ? -1 : 1;
            int H2 = I.H(Q02);
            C0102t c0102t3 = this.f1396q;
            c0102t2.d = H2 + c0102t3.f2157e;
            c0102t3.f2155b = this.f1397r.b(Q02);
            k2 = this.f1397r.b(Q02) - this.f1397r.g();
        } else {
            View R02 = R0();
            C0102t c0102t4 = this.f1396q;
            c0102t4.h = this.f1397r.k() + c0102t4.h;
            C0102t c0102t5 = this.f1396q;
            c0102t5.f2157e = this.f1400u ? 1 : -1;
            int H3 = I.H(R02);
            C0102t c0102t6 = this.f1396q;
            c0102t5.d = H3 + c0102t6.f2157e;
            c0102t6.f2155b = this.f1397r.e(R02);
            k2 = (-this.f1397r.e(R02)) + this.f1397r.k();
        }
        C0102t c0102t7 = this.f1396q;
        c0102t7.f2156c = i2;
        if (z2) {
            c0102t7.f2156c = i2 - k2;
        }
        c0102t7.f2159g = k2;
    }

    @Override // f0.I
    public final void c(String str) {
        if (this.f1405z == null) {
            super.c(str);
        }
    }

    @Override // f0.I
    public void c0(U u2) {
        this.f1405z = null;
        this.f1403x = -1;
        this.f1404y = Integer.MIN_VALUE;
        this.f1391A.d();
    }

    public final void c1(int i, int i2) {
        this.f1396q.f2156c = this.f1397r.g() - i2;
        C0102t c0102t = this.f1396q;
        c0102t.f2157e = this.f1400u ? -1 : 1;
        c0102t.d = i;
        c0102t.f2158f = 1;
        c0102t.f2155b = i2;
        c0102t.f2159g = Integer.MIN_VALUE;
    }

    @Override // f0.I
    public final boolean d() {
        return this.f1395p == 0;
    }

    @Override // f0.I
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0103u) {
            this.f1405z = (C0103u) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i2) {
        this.f1396q.f2156c = i2 - this.f1397r.k();
        C0102t c0102t = this.f1396q;
        c0102t.d = i;
        c0102t.f2157e = this.f1400u ? 1 : -1;
        c0102t.f2158f = -1;
        c0102t.f2155b = i2;
        c0102t.f2159g = Integer.MIN_VALUE;
    }

    @Override // f0.I
    public final boolean e() {
        return this.f1395p == 1;
    }

    @Override // f0.I
    public final Parcelable e0() {
        C0103u c0103u = this.f1405z;
        if (c0103u != null) {
            C0103u c0103u2 = new C0103u();
            c0103u2.f2163a = c0103u.f2163a;
            c0103u2.f2164b = c0103u.f2164b;
            c0103u2.f2165c = c0103u.f2165c;
            return c0103u2;
        }
        C0103u c0103u3 = new C0103u();
        if (v() > 0) {
            G0();
            boolean z2 = this.f1398s ^ this.f1400u;
            c0103u3.f2165c = z2;
            if (z2) {
                View Q02 = Q0();
                c0103u3.f2164b = this.f1397r.g() - this.f1397r.b(Q02);
                c0103u3.f2163a = I.H(Q02);
            } else {
                View R02 = R0();
                c0103u3.f2163a = I.H(R02);
                c0103u3.f2164b = this.f1397r.e(R02) - this.f1397r.k();
            }
        } else {
            c0103u3.f2163a = -1;
        }
        return c0103u3;
    }

    @Override // f0.I
    public final void h(int i, int i2, U u2, C0096m c0096m) {
        if (this.f1395p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, u2);
        B0(u2, this.f1396q, c0096m);
    }

    @Override // f0.I
    public final void i(int i, C0096m c0096m) {
        boolean z2;
        int i2;
        C0103u c0103u = this.f1405z;
        if (c0103u == null || (i2 = c0103u.f2163a) < 0) {
            X0();
            z2 = this.f1400u;
            i2 = this.f1403x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0103u.f2165c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1393C && i2 >= 0 && i2 < i; i4++) {
            c0096m.a(i2, 0);
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
        if (this.f1395p == 1) {
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
        this.f1403x = i;
        this.f1404y = Integer.MIN_VALUE;
        C0103u c0103u = this.f1405z;
        if (c0103u != null) {
            c0103u.f2163a = -1;
        }
        l0();
    }

    @Override // f0.I
    public int o(U u2) {
        return E0(u2);
    }

    @Override // f0.I
    public int o0(int i, O o2, U u2) {
        if (this.f1395p == 0) {
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
        if (this.f1965m == 1073741824 || this.f1964l == 1073741824) {
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
        C0104v c0104v = new C0104v(recyclerView.getContext());
        c0104v.f2166a = i;
        y0(c0104v);
    }

    @Override // f0.I
    public boolean z0() {
        return this.f1405z == null && this.f1398s == this.f1401v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1395p = 1;
        this.f1399t = false;
        this.f1400u = false;
        this.f1401v = false;
        this.f1402w = true;
        this.f1403x = -1;
        this.f1404y = Integer.MIN_VALUE;
        this.f1405z = null;
        this.f1391A = new r();
        this.f1392B = new C0101s();
        this.f1393C = 2;
        this.f1394D = new int[2];
        H I2 = I.I(context, attributeSet, i, i2);
        Z0(I2.f1953a);
        boolean z2 = I2.f1955c;
        c(null);
        if (z2 != this.f1399t) {
            this.f1399t = z2;
            l0();
        }
        a1(I2.d);
    }
}
