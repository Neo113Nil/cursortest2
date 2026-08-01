package androidx.recyclerview.widget;

import T.d;
import T.h;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f0.C0107m;
import f0.C0112s;
import f0.C0113t;
import f0.C0114u;
import f0.C0115v;
import f0.G;
import f0.H;
import f0.I;
import f0.N;
import f0.S;
import f0.T;
import f0.W;
import f0.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends H implements S {

    /* renamed from: A, reason: collision with root package name */
    public final r f1541A;

    /* renamed from: B, reason: collision with root package name */
    public final C0112s f1542B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1543C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1544D;

    /* renamed from: p, reason: collision with root package name */
    public int f1545p;

    /* renamed from: q, reason: collision with root package name */
    public C0113t f1546q;

    /* renamed from: r, reason: collision with root package name */
    public h f1547r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1548s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1549t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1550u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1551v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1552w;

    /* renamed from: x, reason: collision with root package name */
    public int f1553x;

    /* renamed from: y, reason: collision with root package name */
    public int f1554y;

    /* renamed from: z, reason: collision with root package name */
    public C0114u f1555z;

    public LinearLayoutManager(int i) {
        this.f1545p = 1;
        this.f1549t = false;
        this.f1550u = false;
        this.f1551v = false;
        this.f1552w = true;
        this.f1553x = -1;
        this.f1554y = Integer.MIN_VALUE;
        this.f1555z = null;
        this.f1541A = new r();
        this.f1542B = new C0112s();
        this.f1543C = 2;
        this.f1544D = new int[2];
        Z0(i);
        c(null);
        if (this.f1549t) {
            this.f1549t = false;
            l0();
        }
    }

    public void A0(T t2, int[] iArr) {
        int i;
        int l2 = t2.f2175a != -1 ? this.f1547r.l() : 0;
        if (this.f1546q.f2343f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void B0(T t2, C0113t c0113t, C0107m c0107m) {
        int i = c0113t.d;
        if (i < 0 || i >= t2.b()) {
            return;
        }
        c0107m.a(i, Math.max(0, c0113t.f2344g));
    }

    public final int C0(T t2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        h hVar = this.f1547r;
        boolean z2 = !this.f1552w;
        return d.l(t2, hVar, J0(z2), I0(z2), this, this.f1552w);
    }

    public final int D0(T t2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        h hVar = this.f1547r;
        boolean z2 = !this.f1552w;
        return d.m(t2, hVar, J0(z2), I0(z2), this, this.f1552w, this.f1550u);
    }

    public final int E0(T t2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        h hVar = this.f1547r;
        boolean z2 = !this.f1552w;
        return d.n(t2, hVar, J0(z2), I0(z2), this, this.f1552w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1545p == 1) ? 1 : Integer.MIN_VALUE : this.f1545p == 0 ? 1 : Integer.MIN_VALUE : this.f1545p == 1 ? -1 : Integer.MIN_VALUE : this.f1545p == 0 ? -1 : Integer.MIN_VALUE : (this.f1545p != 1 && S0()) ? -1 : 1 : (this.f1545p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f1546q == null) {
            C0113t c0113t = new C0113t();
            c0113t.f2339a = true;
            c0113t.h = 0;
            c0113t.i = 0;
            c0113t.f2346k = null;
            this.f1546q = c0113t;
        }
    }

    public final int H0(N n2, C0113t c0113t, T t2, boolean z2) {
        int i;
        int i2 = c0113t.f2341c;
        int i3 = c0113t.f2344g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0113t.f2344g = i3 + i2;
            }
            V0(n2, c0113t);
        }
        int i4 = c0113t.f2341c + c0113t.h;
        while (true) {
            if ((!c0113t.f2347l && i4 <= 0) || (i = c0113t.d) < 0 || i >= t2.b()) {
                break;
            }
            C0112s c0112s = this.f1542B;
            c0112s.f2336a = 0;
            c0112s.f2337b = false;
            c0112s.f2338c = false;
            c0112s.d = false;
            T0(n2, t2, c0113t, c0112s);
            if (!c0112s.f2337b) {
                int i5 = c0113t.f2340b;
                int i6 = c0112s.f2336a;
                c0113t.f2340b = (c0113t.f2343f * i6) + i5;
                if (!c0112s.f2338c || c0113t.f2346k != null || !t2.f2180g) {
                    c0113t.f2341c -= i6;
                    i4 -= i6;
                }
                int i7 = c0113t.f2344g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0113t.f2344g = i8;
                    int i9 = c0113t.f2341c;
                    if (i9 < 0) {
                        c0113t.f2344g = i8 + i9;
                    }
                    V0(n2, c0113t);
                }
                if (z2 && c0112s.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0113t.f2341c;
    }

    public final View I0(boolean z2) {
        return this.f1550u ? M0(0, v(), z2) : M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        return this.f1550u ? M0(v() - 1, -1, z2) : M0(0, v(), z2);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return H.H(M02);
    }

    @Override // f0.H
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
        if (this.f1547r.e(u(i)) < this.f1547r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1545p == 0 ? this.f2144c.w(i, i2, i3, i4) : this.d.w(i, i2, i3, i4);
    }

    public final View M0(int i, int i2, boolean z2) {
        G0();
        int i3 = z2 ? 24579 : 320;
        return this.f1545p == 0 ? this.f2144c.w(i, i2, i3, 320) : this.d.w(i, i2, i3, 320);
    }

    public View N0(N n2, T t2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1547r.k();
        int g2 = this.f1547r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u2 = u(i);
            int H2 = H.H(u2);
            if (H2 >= 0 && H2 < i3) {
                if (((I) u2.getLayoutParams()).f2154a.i()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1547r.e(u2) < g2 && this.f1547r.b(u2) >= k2) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int O0(int i, N n2, T t2, boolean z2) {
        int g2;
        int g3 = this.f1547r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -Y0(-g3, n2, t2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1547r.g() - i3) <= 0) {
            return i2;
        }
        this.f1547r.p(g2);
        return g2 + i2;
    }

    public final int P0(int i, N n2, T t2, boolean z2) {
        int k2;
        int k3 = i - this.f1547r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -Y0(k3, n2, t2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1547r.k()) <= 0) {
            return i2;
        }
        this.f1547r.p(-k2);
        return i2 - k2;
    }

    public final View Q0() {
        return u(this.f1550u ? 0 : v() - 1);
    }

    @Override // f0.H
    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        return u(this.f1550u ? v() - 1 : 0);
    }

    @Override // f0.H
    public View S(View view, int i, N n2, T t2) {
        int F02;
        X0();
        if (v() == 0 || (F02 = F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        b1(F02, (int) (this.f1547r.l() * 0.33333334f), false, t2);
        C0113t c0113t = this.f1546q;
        c0113t.f2344g = Integer.MIN_VALUE;
        c0113t.f2339a = false;
        H0(n2, c0113t, t2, true);
        View L02 = F02 == -1 ? this.f1550u ? L0(v() - 1, -1) : L0(0, v()) : this.f1550u ? L0(0, v()) : L0(v() - 1, -1);
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

    @Override // f0.H
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : H.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(N n2, T t2, C0113t c0113t, C0112s c0112s) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0113t.b(n2);
        if (b2 == null) {
            c0112s.f2337b = true;
            return;
        }
        I i5 = (I) b2.getLayoutParams();
        if (c0113t.f2346k == null) {
            if (this.f1550u == (c0113t.f2343f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1550u == (c0113t.f2343f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        I i6 = (I) b2.getLayoutParams();
        Rect J2 = this.f2143b.J(b2);
        int i7 = J2.left + J2.right;
        int i8 = J2.top + J2.bottom;
        int w2 = H.w(d(), this.f2152n, this.f2150l, F() + E() + ((ViewGroup.MarginLayoutParams) i6).leftMargin + ((ViewGroup.MarginLayoutParams) i6).rightMargin + i7, ((ViewGroup.MarginLayoutParams) i6).width);
        int w3 = H.w(e(), this.f2153o, this.f2151m, D() + G() + ((ViewGroup.MarginLayoutParams) i6).topMargin + ((ViewGroup.MarginLayoutParams) i6).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) i6).height);
        if (u0(b2, w2, w3, i6)) {
            b2.measure(w2, w3);
        }
        c0112s.f2336a = this.f1547r.c(b2);
        if (this.f1545p == 1) {
            if (S0()) {
                i4 = this.f2152n - F();
                i = i4 - this.f1547r.d(b2);
            } else {
                i = E();
                i4 = this.f1547r.d(b2) + i;
            }
            if (c0113t.f2343f == -1) {
                i2 = c0113t.f2340b;
                i3 = i2 - c0112s.f2336a;
            } else {
                i3 = c0113t.f2340b;
                i2 = c0112s.f2336a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1547r.d(b2) + G2;
            if (c0113t.f2343f == -1) {
                int i9 = c0113t.f2340b;
                int i10 = i9 - c0112s.f2336a;
                i4 = i9;
                i2 = d;
                i = i10;
                i3 = G2;
            } else {
                int i11 = c0113t.f2340b;
                int i12 = c0112s.f2336a + i11;
                i = i11;
                i2 = d;
                i3 = G2;
                i4 = i12;
            }
        }
        H.N(b2, i, i3, i4, i2);
        if (i5.f2154a.i() || i5.f2154a.l()) {
            c0112s.f2338c = true;
        }
        c0112s.d = b2.hasFocusable();
    }

    public void U0(N n2, T t2, r rVar, int i) {
    }

    public final void V0(N n2, C0113t c0113t) {
        if (!c0113t.f2339a || c0113t.f2347l) {
            return;
        }
        int i = c0113t.f2344g;
        int i2 = c0113t.i;
        if (c0113t.f2343f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1547r.f() - i) + i2;
            if (this.f1550u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1547r.e(u2) < f2 || this.f1547r.o(u2) < f2) {
                        W0(n2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1547r.e(u3) < f2 || this.f1547r.o(u3) < f2) {
                    W0(n2, i4, i5);
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
        if (!this.f1550u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1547r.b(u4) > i6 || this.f1547r.n(u4) > i6) {
                    W0(n2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1547r.b(u5) > i6 || this.f1547r.n(u5) > i6) {
                W0(n2, i8, i9);
                return;
            }
        }
    }

    public final void W0(N n2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                j0(i);
                n2.f(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            j0(i3);
            n2.f(u3);
        }
    }

    public final void X0() {
        if (this.f1545p == 1 || !S0()) {
            this.f1550u = this.f1549t;
        } else {
            this.f1550u = !this.f1549t;
        }
    }

    public final int Y0(int i, N n2, T t2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        G0();
        this.f1546q.f2339a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        b1(i2, abs, true, t2);
        C0113t c0113t = this.f1546q;
        int H02 = H0(n2, c0113t, t2, false) + c0113t.f2344g;
        if (H02 < 0) {
            return 0;
        }
        if (abs > H02) {
            i = i2 * H02;
        }
        this.f1547r.p(-i);
        this.f1546q.f2345j = i;
        return i;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        c(null);
        if (i != this.f1545p || this.f1547r == null) {
            h a2 = h.a(this, i);
            this.f1547r = a2;
            this.f1541A.f2332a = a2;
            this.f1545p = i;
            l0();
        }
    }

    @Override // f0.S
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < H.H(u(0))) != this.f1550u ? -1 : 1;
        return this.f1545p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(boolean z2) {
        c(null);
        if (this.f1551v == z2) {
            return;
        }
        this.f1551v = z2;
        l0();
    }

    @Override // f0.H
    public void b0(N n2, T t2) {
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
        if (!(this.f1555z == null && this.f1553x == -1) && t2.b() == 0) {
            g0(n2);
            return;
        }
        C0114u c0114u = this.f1555z;
        if (c0114u != null && (i8 = c0114u.f2348a) >= 0) {
            this.f1553x = i8;
        }
        G0();
        this.f1546q.f2339a = false;
        X0();
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f2142a.d).contains(focusedChild)) {
            focusedChild = null;
        }
        r rVar = this.f1541A;
        if (!rVar.f2335e || this.f1553x != -1 || this.f1555z != null) {
            rVar.d();
            rVar.d = this.f1550u ^ this.f1551v;
            if (!t2.f2180g && (i = this.f1553x) != -1) {
                if (i < 0 || i >= t2.b()) {
                    this.f1553x = -1;
                    this.f1554y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1553x;
                    rVar.f2333b = i10;
                    C0114u c0114u2 = this.f1555z;
                    if (c0114u2 != null && c0114u2.f2348a >= 0) {
                        boolean z2 = c0114u2.f2350c;
                        rVar.d = z2;
                        if (z2) {
                            rVar.f2334c = this.f1547r.g() - this.f1555z.f2349b;
                        } else {
                            rVar.f2334c = this.f1547r.k() + this.f1555z.f2349b;
                        }
                    } else if (this.f1554y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                rVar.d = (this.f1553x < H.H(u(0))) == this.f1550u;
                            }
                            rVar.a();
                        } else if (this.f1547r.c(q3) > this.f1547r.l()) {
                            rVar.a();
                        } else if (this.f1547r.e(q3) - this.f1547r.k() < 0) {
                            rVar.f2334c = this.f1547r.k();
                            rVar.d = false;
                        } else if (this.f1547r.g() - this.f1547r.b(q3) < 0) {
                            rVar.f2334c = this.f1547r.g();
                            rVar.d = true;
                        } else {
                            rVar.f2334c = rVar.d ? this.f1547r.m() + this.f1547r.b(q3) : this.f1547r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1550u;
                        rVar.d = z3;
                        if (z3) {
                            rVar.f2334c = this.f1547r.g() - this.f1554y;
                        } else {
                            rVar.f2334c = this.f1547r.k() + this.f1554y;
                        }
                    }
                    rVar.f2335e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2143b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f2142a.d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    I i11 = (I) focusedChild2.getLayoutParams();
                    if (!i11.f2154a.i() && i11.f2154a.b() >= 0 && i11.f2154a.b() < t2.b()) {
                        rVar.c(focusedChild2, H.H(focusedChild2));
                        rVar.f2335e = true;
                    }
                }
                if (this.f1548s == this.f1551v) {
                    View N02 = rVar.d ? this.f1550u ? N0(n2, t2, 0, v(), t2.b()) : N0(n2, t2, v() - 1, -1, t2.b()) : this.f1550u ? N0(n2, t2, v() - 1, -1, t2.b()) : N0(n2, t2, 0, v(), t2.b());
                    if (N02 != null) {
                        rVar.b(N02, H.H(N02));
                        if (!t2.f2180g && z0() && (this.f1547r.e(N02) >= this.f1547r.g() || this.f1547r.b(N02) < this.f1547r.k())) {
                            rVar.f2334c = rVar.d ? this.f1547r.g() : this.f1547r.k();
                        }
                        rVar.f2335e = true;
                    }
                }
            }
            rVar.a();
            rVar.f2333b = this.f1551v ? t2.b() - 1 : 0;
            rVar.f2335e = true;
        } else if (focusedChild != null && (this.f1547r.e(focusedChild) >= this.f1547r.g() || this.f1547r.b(focusedChild) <= this.f1547r.k())) {
            rVar.c(focusedChild, H.H(focusedChild));
        }
        C0113t c0113t = this.f1546q;
        c0113t.f2343f = c0113t.f2345j >= 0 ? 1 : -1;
        int[] iArr = this.f1544D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(t2, iArr);
        int k2 = this.f1547r.k() + Math.max(0, iArr[0]);
        int h = this.f1547r.h() + Math.max(0, iArr[1]);
        if (t2.f2180g && (i6 = this.f1553x) != -1 && this.f1554y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1550u) {
                i7 = this.f1547r.g() - this.f1547r.b(q2);
                e2 = this.f1554y;
            } else {
                e2 = this.f1547r.e(q2) - this.f1547r.k();
                i7 = this.f1554y;
            }
            int i12 = i7 - e2;
            if (i12 > 0) {
                k2 += i12;
            } else {
                h -= i12;
            }
        }
        if (!rVar.d ? !this.f1550u : this.f1550u) {
            i9 = 1;
        }
        U0(n2, t2, rVar, i9);
        p(n2);
        this.f1546q.f2347l = this.f1547r.i() == 0 && this.f1547r.f() == 0;
        this.f1546q.getClass();
        this.f1546q.i = 0;
        if (rVar.d) {
            d1(rVar.f2333b, rVar.f2334c);
            C0113t c0113t2 = this.f1546q;
            c0113t2.h = k2;
            H0(n2, c0113t2, t2, false);
            C0113t c0113t3 = this.f1546q;
            i3 = c0113t3.f2340b;
            int i13 = c0113t3.d;
            int i14 = c0113t3.f2341c;
            if (i14 > 0) {
                h += i14;
            }
            c1(rVar.f2333b, rVar.f2334c);
            C0113t c0113t4 = this.f1546q;
            c0113t4.h = h;
            c0113t4.d += c0113t4.f2342e;
            H0(n2, c0113t4, t2, false);
            C0113t c0113t5 = this.f1546q;
            i2 = c0113t5.f2340b;
            int i15 = c0113t5.f2341c;
            if (i15 > 0) {
                d1(i13, i3);
                C0113t c0113t6 = this.f1546q;
                c0113t6.h = i15;
                H0(n2, c0113t6, t2, false);
                i3 = this.f1546q.f2340b;
            }
        } else {
            c1(rVar.f2333b, rVar.f2334c);
            C0113t c0113t7 = this.f1546q;
            c0113t7.h = h;
            H0(n2, c0113t7, t2, false);
            C0113t c0113t8 = this.f1546q;
            i2 = c0113t8.f2340b;
            int i16 = c0113t8.d;
            int i17 = c0113t8.f2341c;
            if (i17 > 0) {
                k2 += i17;
            }
            d1(rVar.f2333b, rVar.f2334c);
            C0113t c0113t9 = this.f1546q;
            c0113t9.h = k2;
            c0113t9.d += c0113t9.f2342e;
            H0(n2, c0113t9, t2, false);
            C0113t c0113t10 = this.f1546q;
            i3 = c0113t10.f2340b;
            int i18 = c0113t10.f2341c;
            if (i18 > 0) {
                c1(i16, i2);
                C0113t c0113t11 = this.f1546q;
                c0113t11.h = i18;
                H0(n2, c0113t11, t2, false);
                i2 = this.f1546q.f2340b;
            }
        }
        if (v() > 0) {
            if (this.f1550u ^ this.f1551v) {
                int O03 = O0(i2, n2, t2, true);
                i4 = i3 + O03;
                i5 = i2 + O03;
                O02 = P0(i4, n2, t2, false);
            } else {
                int P02 = P0(i3, n2, t2, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                O02 = O0(i5, n2, t2, false);
            }
            i3 = i4 + O02;
            i2 = i5 + O02;
        }
        if (t2.f2182k && v() != 0 && !t2.f2180g && z0()) {
            List list2 = n2.d;
            int size = list2.size();
            int H2 = H.H(u(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                W w2 = (W) list2.get(i21);
                if (!w2.i()) {
                    boolean z4 = w2.b() < H2;
                    boolean z5 = this.f1550u;
                    View view = w2.f2193a;
                    if (z4 != z5) {
                        i19 += this.f1547r.c(view);
                    } else {
                        i20 += this.f1547r.c(view);
                    }
                }
            }
            this.f1546q.f2346k = list2;
            if (i19 > 0) {
                d1(H.H(R0()), i3);
                C0113t c0113t12 = this.f1546q;
                c0113t12.h = i19;
                c0113t12.f2341c = 0;
                c0113t12.a(null);
                H0(n2, this.f1546q, t2, false);
            }
            if (i20 > 0) {
                c1(H.H(Q0()), i2);
                C0113t c0113t13 = this.f1546q;
                c0113t13.h = i20;
                c0113t13.f2341c = 0;
                list = null;
                c0113t13.a(null);
                H0(n2, this.f1546q, t2, false);
            } else {
                list = null;
            }
            this.f1546q.f2346k = list;
        }
        if (t2.f2180g) {
            rVar.d();
        } else {
            h hVar = this.f1547r;
            hVar.f812a = hVar.l();
        }
        this.f1548s = this.f1551v;
    }

    public final void b1(int i, int i2, boolean z2, T t2) {
        int k2;
        this.f1546q.f2347l = this.f1547r.i() == 0 && this.f1547r.f() == 0;
        this.f1546q.f2343f = i;
        int[] iArr = this.f1544D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(t2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0113t c0113t = this.f1546q;
        int i3 = z3 ? max2 : max;
        c0113t.h = i3;
        if (!z3) {
            max = max2;
        }
        c0113t.i = max;
        if (z3) {
            c0113t.h = this.f1547r.h() + i3;
            View Q02 = Q0();
            C0113t c0113t2 = this.f1546q;
            c0113t2.f2342e = this.f1550u ? -1 : 1;
            int H2 = H.H(Q02);
            C0113t c0113t3 = this.f1546q;
            c0113t2.d = H2 + c0113t3.f2342e;
            c0113t3.f2340b = this.f1547r.b(Q02);
            k2 = this.f1547r.b(Q02) - this.f1547r.g();
        } else {
            View R02 = R0();
            C0113t c0113t4 = this.f1546q;
            c0113t4.h = this.f1547r.k() + c0113t4.h;
            C0113t c0113t5 = this.f1546q;
            c0113t5.f2342e = this.f1550u ? 1 : -1;
            int H3 = H.H(R02);
            C0113t c0113t6 = this.f1546q;
            c0113t5.d = H3 + c0113t6.f2342e;
            c0113t6.f2340b = this.f1547r.e(R02);
            k2 = (-this.f1547r.e(R02)) + this.f1547r.k();
        }
        C0113t c0113t7 = this.f1546q;
        c0113t7.f2341c = i2;
        if (z2) {
            c0113t7.f2341c = i2 - k2;
        }
        c0113t7.f2344g = k2;
    }

    @Override // f0.H
    public final void c(String str) {
        if (this.f1555z == null) {
            super.c(str);
        }
    }

    @Override // f0.H
    public void c0(T t2) {
        this.f1555z = null;
        this.f1553x = -1;
        this.f1554y = Integer.MIN_VALUE;
        this.f1541A.d();
    }

    public final void c1(int i, int i2) {
        this.f1546q.f2341c = this.f1547r.g() - i2;
        C0113t c0113t = this.f1546q;
        c0113t.f2342e = this.f1550u ? -1 : 1;
        c0113t.d = i;
        c0113t.f2343f = 1;
        c0113t.f2340b = i2;
        c0113t.f2344g = Integer.MIN_VALUE;
    }

    @Override // f0.H
    public final boolean d() {
        return this.f1545p == 0;
    }

    @Override // f0.H
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0114u) {
            this.f1555z = (C0114u) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i2) {
        this.f1546q.f2341c = i2 - this.f1547r.k();
        C0113t c0113t = this.f1546q;
        c0113t.d = i;
        c0113t.f2342e = this.f1550u ? 1 : -1;
        c0113t.f2343f = -1;
        c0113t.f2340b = i2;
        c0113t.f2344g = Integer.MIN_VALUE;
    }

    @Override // f0.H
    public final boolean e() {
        return this.f1545p == 1;
    }

    @Override // f0.H
    public final Parcelable e0() {
        C0114u c0114u = this.f1555z;
        if (c0114u != null) {
            C0114u c0114u2 = new C0114u();
            c0114u2.f2348a = c0114u.f2348a;
            c0114u2.f2349b = c0114u.f2349b;
            c0114u2.f2350c = c0114u.f2350c;
            return c0114u2;
        }
        C0114u c0114u3 = new C0114u();
        if (v() > 0) {
            G0();
            boolean z2 = this.f1548s ^ this.f1550u;
            c0114u3.f2350c = z2;
            if (z2) {
                View Q02 = Q0();
                c0114u3.f2349b = this.f1547r.g() - this.f1547r.b(Q02);
                c0114u3.f2348a = H.H(Q02);
            } else {
                View R02 = R0();
                c0114u3.f2348a = H.H(R02);
                c0114u3.f2349b = this.f1547r.e(R02) - this.f1547r.k();
            }
        } else {
            c0114u3.f2348a = -1;
        }
        return c0114u3;
    }

    @Override // f0.H
    public final void h(int i, int i2, T t2, C0107m c0107m) {
        if (this.f1545p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, t2);
        B0(t2, this.f1546q, c0107m);
    }

    @Override // f0.H
    public final void i(int i, C0107m c0107m) {
        boolean z2;
        int i2;
        C0114u c0114u = this.f1555z;
        if (c0114u == null || (i2 = c0114u.f2348a) < 0) {
            X0();
            z2 = this.f1550u;
            i2 = this.f1553x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0114u.f2350c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1543C && i2 >= 0 && i2 < i; i4++) {
            c0107m.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // f0.H
    public final int j(T t2) {
        return C0(t2);
    }

    @Override // f0.H
    public int k(T t2) {
        return D0(t2);
    }

    @Override // f0.H
    public int l(T t2) {
        return E0(t2);
    }

    @Override // f0.H
    public final int m(T t2) {
        return C0(t2);
    }

    @Override // f0.H
    public int m0(int i, N n2, T t2) {
        if (this.f1545p == 1) {
            return 0;
        }
        return Y0(i, n2, t2);
    }

    @Override // f0.H
    public int n(T t2) {
        return D0(t2);
    }

    @Override // f0.H
    public final void n0(int i) {
        this.f1553x = i;
        this.f1554y = Integer.MIN_VALUE;
        C0114u c0114u = this.f1555z;
        if (c0114u != null) {
            c0114u.f2348a = -1;
        }
        l0();
    }

    @Override // f0.H
    public int o(T t2) {
        return E0(t2);
    }

    @Override // f0.H
    public int o0(int i, N n2, T t2) {
        if (this.f1545p == 0) {
            return 0;
        }
        return Y0(i, n2, t2);
    }

    @Override // f0.H
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

    @Override // f0.H
    public I r() {
        return new I(-2, -2);
    }

    @Override // f0.H
    public final boolean v0() {
        if (this.f2151m == 1073741824 || this.f2150l == 1073741824) {
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

    @Override // f0.H
    public void x0(RecyclerView recyclerView, int i) {
        C0115v c0115v = new C0115v(recyclerView.getContext());
        c0115v.f2351a = i;
        y0(c0115v);
    }

    @Override // f0.H
    public boolean z0() {
        return this.f1555z == null && this.f1548s == this.f1551v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1545p = 1;
        this.f1549t = false;
        this.f1550u = false;
        this.f1551v = false;
        this.f1552w = true;
        this.f1553x = -1;
        this.f1554y = Integer.MIN_VALUE;
        this.f1555z = null;
        this.f1541A = new r();
        this.f1542B = new C0112s();
        this.f1543C = 2;
        this.f1544D = new int[2];
        G I2 = H.I(context, attributeSet, i, i2);
        Z0(I2.f2139a);
        boolean z2 = I2.f2141c;
        c(null);
        if (z2 != this.f1549t) {
            this.f1549t = z2;
            l0();
        }
        a1(I2.d);
    }
}
