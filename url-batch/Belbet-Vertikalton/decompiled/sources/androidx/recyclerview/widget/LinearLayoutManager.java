package androidx.recyclerview.widget;

import G1.AbstractC0001b;
import H1.l;
import V.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h0.AbstractC0141G;
import h0.C0140F;
import h0.C0142H;
import h0.C0147M;
import h0.C0162l;
import h0.C0167q;
import h0.C0168s;
import h0.C0169t;
import h0.C0170u;
import h0.Q;
import h0.S;
import h0.V;
import h0.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0141G implements Q {

    /* renamed from: A, reason: collision with root package name */
    public final C0167q f1973A;

    /* renamed from: B, reason: collision with root package name */
    public final r f1974B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1975C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1976D;

    /* renamed from: p, reason: collision with root package name */
    public int f1977p;

    /* renamed from: q, reason: collision with root package name */
    public C0168s f1978q;

    /* renamed from: r, reason: collision with root package name */
    public g f1979r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1980s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1981t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1982u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1983v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1984w;

    /* renamed from: x, reason: collision with root package name */
    public int f1985x;

    /* renamed from: y, reason: collision with root package name */
    public int f1986y;

    /* renamed from: z, reason: collision with root package name */
    public C0169t f1987z;

    public LinearLayoutManager(int i) {
        this.f1977p = 1;
        this.f1981t = false;
        this.f1982u = false;
        this.f1983v = false;
        this.f1984w = true;
        this.f1985x = -1;
        this.f1986y = Integer.MIN_VALUE;
        this.f1987z = null;
        this.f1973A = new C0167q();
        this.f1974B = new r();
        this.f1975C = 2;
        this.f1976D = new int[2];
        Z0(i);
        c(null);
        if (this.f1981t) {
            this.f1981t = false;
            l0();
        }
    }

    public void A0(S s2, int[] iArr) {
        int i;
        int l2 = s2.f2940a != -1 ? this.f1979r.l() : 0;
        if (this.f1978q.f3109f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void B0(S s2, C0168s c0168s, C0162l c0162l) {
        int i = c0168s.f3108d;
        if (i < 0 || i >= s2.b()) {
            return;
        }
        c0162l.a(i, Math.max(0, c0168s.f3110g));
    }

    public final int C0(S s2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1979r;
        boolean z2 = !this.f1984w;
        return l.l(s2, gVar, J0(z2), I0(z2), this, this.f1984w);
    }

    public final int D0(S s2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1979r;
        boolean z2 = !this.f1984w;
        return l.m(s2, gVar, J0(z2), I0(z2), this, this.f1984w, this.f1982u);
    }

    public final int E0(S s2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1979r;
        boolean z2 = !this.f1984w;
        return l.n(s2, gVar, J0(z2), I0(z2), this, this.f1984w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1977p == 1) ? 1 : Integer.MIN_VALUE : this.f1977p == 0 ? 1 : Integer.MIN_VALUE : this.f1977p == 1 ? -1 : Integer.MIN_VALUE : this.f1977p == 0 ? -1 : Integer.MIN_VALUE : (this.f1977p != 1 && S0()) ? -1 : 1 : (this.f1977p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f1978q == null) {
            C0168s c0168s = new C0168s();
            c0168s.f3105a = true;
            c0168s.f3111h = 0;
            c0168s.i = 0;
            c0168s.f3112k = null;
            this.f1978q = c0168s;
        }
    }

    public final int H0(C0147M c0147m, C0168s c0168s, S s2, boolean z2) {
        int i;
        int i2 = c0168s.f3107c;
        int i3 = c0168s.f3110g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0168s.f3110g = i3 + i2;
            }
            V0(c0147m, c0168s);
        }
        int i4 = c0168s.f3107c + c0168s.f3111h;
        while (true) {
            if ((!c0168s.f3113l && i4 <= 0) || (i = c0168s.f3108d) < 0 || i >= s2.b()) {
                break;
            }
            r rVar = this.f1974B;
            rVar.f3101a = 0;
            rVar.f3102b = false;
            rVar.f3103c = false;
            rVar.f3104d = false;
            T0(c0147m, s2, c0168s, rVar);
            if (!rVar.f3102b) {
                int i5 = c0168s.f3106b;
                int i6 = rVar.f3101a;
                c0168s.f3106b = (c0168s.f3109f * i6) + i5;
                if (!rVar.f3103c || c0168s.f3112k != null || !s2.f2945g) {
                    c0168s.f3107c -= i6;
                    i4 -= i6;
                }
                int i7 = c0168s.f3110g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0168s.f3110g = i8;
                    int i9 = c0168s.f3107c;
                    if (i9 < 0) {
                        c0168s.f3110g = i8 + i9;
                    }
                    V0(c0147m, c0168s);
                }
                if (z2 && rVar.f3104d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0168s.f3107c;
    }

    public final View I0(boolean z2) {
        return this.f1982u ? M0(0, v(), z2) : M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        return this.f1982u ? M0(v() - 1, -1, z2) : M0(0, v(), z2);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return AbstractC0141G.H(M02);
    }

    @Override // h0.AbstractC0141G
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
        if (this.f1979r.e(u(i)) < this.f1979r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1977p == 0 ? this.f2906c.w(i, i2, i3, i4) : this.f2907d.w(i, i2, i3, i4);
    }

    public final View M0(int i, int i2, boolean z2) {
        G0();
        int i3 = z2 ? 24579 : 320;
        return this.f1977p == 0 ? this.f2906c.w(i, i2, i3, 320) : this.f2907d.w(i, i2, i3, 320);
    }

    public View N0(C0147M c0147m, S s2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1979r.k();
        int g2 = this.f1979r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u2 = u(i);
            int H = AbstractC0141G.H(u2);
            if (H >= 0 && H < i3) {
                if (((C0142H) u2.getLayoutParams()).f2916a.i()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1979r.e(u2) < g2 && this.f1979r.b(u2) >= k2) {
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

    public final int O0(int i, C0147M c0147m, S s2, boolean z2) {
        int g2;
        int g3 = this.f1979r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -Y0(-g3, c0147m, s2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1979r.g() - i3) <= 0) {
            return i2;
        }
        this.f1979r.p(g2);
        return g2 + i2;
    }

    public final int P0(int i, C0147M c0147m, S s2, boolean z2) {
        int k2;
        int k3 = i - this.f1979r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -Y0(k3, c0147m, s2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1979r.k()) <= 0) {
            return i2;
        }
        this.f1979r.p(-k2);
        return i2 - k2;
    }

    public final View Q0() {
        return u(this.f1982u ? 0 : v() - 1);
    }

    @Override // h0.AbstractC0141G
    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        return u(this.f1982u ? v() - 1 : 0);
    }

    @Override // h0.AbstractC0141G
    public View S(View view, int i, C0147M c0147m, S s2) {
        int F02;
        X0();
        if (v() == 0 || (F02 = F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        b1(F02, (int) (this.f1979r.l() * 0.33333334f), false, s2);
        C0168s c0168s = this.f1978q;
        c0168s.f3110g = Integer.MIN_VALUE;
        c0168s.f3105a = false;
        H0(c0147m, c0168s, s2, true);
        View L02 = F02 == -1 ? this.f1982u ? L0(v() - 1, -1) : L0(0, v()) : this.f1982u ? L0(0, v()) : L0(v() - 1, -1);
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

    @Override // h0.AbstractC0141G
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : AbstractC0141G.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(C0147M c0147m, S s2, C0168s c0168s, r rVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0168s.b(c0147m);
        if (b2 == null) {
            rVar.f3102b = true;
            return;
        }
        C0142H c0142h = (C0142H) b2.getLayoutParams();
        if (c0168s.f3112k == null) {
            if (this.f1982u == (c0168s.f3109f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1982u == (c0168s.f3109f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        C0142H c0142h2 = (C0142H) b2.getLayoutParams();
        Rect J2 = this.f2905b.J(b2);
        int i5 = J2.left + J2.right;
        int i6 = J2.top + J2.bottom;
        int w2 = AbstractC0141G.w(d(), this.f2914n, this.f2912l, F() + E() + ((ViewGroup.MarginLayoutParams) c0142h2).leftMargin + ((ViewGroup.MarginLayoutParams) c0142h2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) c0142h2).width);
        int w3 = AbstractC0141G.w(e(), this.f2915o, this.f2913m, D() + G() + ((ViewGroup.MarginLayoutParams) c0142h2).topMargin + ((ViewGroup.MarginLayoutParams) c0142h2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) c0142h2).height);
        if (u0(b2, w2, w3, c0142h2)) {
            b2.measure(w2, w3);
        }
        rVar.f3101a = this.f1979r.c(b2);
        if (this.f1977p == 1) {
            if (S0()) {
                i4 = this.f2914n - F();
                i = i4 - this.f1979r.d(b2);
            } else {
                i = E();
                i4 = this.f1979r.d(b2) + i;
            }
            if (c0168s.f3109f == -1) {
                i2 = c0168s.f3106b;
                i3 = i2 - rVar.f3101a;
            } else {
                i3 = c0168s.f3106b;
                i2 = rVar.f3101a + i3;
            }
        } else {
            int G2 = G();
            int d2 = this.f1979r.d(b2) + G2;
            if (c0168s.f3109f == -1) {
                int i7 = c0168s.f3106b;
                int i8 = i7 - rVar.f3101a;
                i4 = i7;
                i2 = d2;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0168s.f3106b;
                int i10 = rVar.f3101a + i9;
                i = i9;
                i2 = d2;
                i3 = G2;
                i4 = i10;
            }
        }
        AbstractC0141G.N(b2, i, i3, i4, i2);
        if (c0142h.f2916a.i() || c0142h.f2916a.l()) {
            rVar.f3103c = true;
        }
        rVar.f3104d = b2.hasFocusable();
    }

    public void U0(C0147M c0147m, S s2, C0167q c0167q, int i) {
    }

    public final void V0(C0147M c0147m, C0168s c0168s) {
        if (!c0168s.f3105a || c0168s.f3113l) {
            return;
        }
        int i = c0168s.f3110g;
        int i2 = c0168s.i;
        if (c0168s.f3109f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1979r.f() - i) + i2;
            if (this.f1982u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1979r.e(u2) < f2 || this.f1979r.o(u2) < f2) {
                        W0(c0147m, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1979r.e(u3) < f2 || this.f1979r.o(u3) < f2) {
                    W0(c0147m, i4, i5);
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
        if (!this.f1982u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1979r.b(u4) > i6 || this.f1979r.n(u4) > i6) {
                    W0(c0147m, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1979r.b(u5) > i6 || this.f1979r.n(u5) > i6) {
                W0(c0147m, i8, i9);
                return;
            }
        }
    }

    public final void W0(C0147M c0147m, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                j0(i);
                c0147m.f(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            j0(i3);
            c0147m.f(u3);
        }
    }

    public final void X0() {
        if (this.f1977p == 1 || !S0()) {
            this.f1982u = this.f1981t;
        } else {
            this.f1982u = !this.f1981t;
        }
    }

    public final int Y0(int i, C0147M c0147m, S s2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        G0();
        this.f1978q.f3105a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        b1(i2, abs, true, s2);
        C0168s c0168s = this.f1978q;
        int H02 = H0(c0147m, c0168s, s2, false) + c0168s.f3110g;
        if (H02 < 0) {
            return 0;
        }
        if (abs > H02) {
            i = i2 * H02;
        }
        this.f1979r.p(-i);
        this.f1978q.j = i;
        return i;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0001b.e("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1977p || this.f1979r == null) {
            g a2 = g.a(this, i);
            this.f1979r = a2;
            this.f1973A.f3097a = a2;
            this.f1977p = i;
            l0();
        }
    }

    @Override // h0.Q
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0141G.H(u(0))) != this.f1982u ? -1 : 1;
        return this.f1977p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(boolean z2) {
        c(null);
        if (this.f1983v == z2) {
            return;
        }
        this.f1983v = z2;
        l0();
    }

    @Override // h0.AbstractC0141G
    public void b0(C0147M c0147m, S s2) {
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
        int e;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f1987z == null && this.f1985x == -1) && s2.b() == 0) {
            g0(c0147m);
            return;
        }
        C0169t c0169t = this.f1987z;
        if (c0169t != null && (i8 = c0169t.f3114a) >= 0) {
            this.f1985x = i8;
        }
        G0();
        this.f1978q.f3105a = false;
        X0();
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f2904a.f593d).contains(focusedChild)) {
            focusedChild = null;
        }
        C0167q c0167q = this.f1973A;
        if (!c0167q.e || this.f1985x != -1 || this.f1987z != null) {
            c0167q.d();
            c0167q.f3100d = this.f1982u ^ this.f1983v;
            if (!s2.f2945g && (i = this.f1985x) != -1) {
                if (i < 0 || i >= s2.b()) {
                    this.f1985x = -1;
                    this.f1986y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1985x;
                    c0167q.f3098b = i10;
                    C0169t c0169t2 = this.f1987z;
                    if (c0169t2 != null && c0169t2.f3114a >= 0) {
                        boolean z2 = c0169t2.f3116c;
                        c0167q.f3100d = z2;
                        if (z2) {
                            c0167q.f3099c = this.f1979r.g() - this.f1987z.f3115b;
                        } else {
                            c0167q.f3099c = this.f1979r.k() + this.f1987z.f3115b;
                        }
                    } else if (this.f1986y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                c0167q.f3100d = (this.f1985x < AbstractC0141G.H(u(0))) == this.f1982u;
                            }
                            c0167q.a();
                        } else if (this.f1979r.c(q3) > this.f1979r.l()) {
                            c0167q.a();
                        } else if (this.f1979r.e(q3) - this.f1979r.k() < 0) {
                            c0167q.f3099c = this.f1979r.k();
                            c0167q.f3100d = false;
                        } else if (this.f1979r.g() - this.f1979r.b(q3) < 0) {
                            c0167q.f3099c = this.f1979r.g();
                            c0167q.f3100d = true;
                        } else {
                            c0167q.f3099c = c0167q.f3100d ? this.f1979r.m() + this.f1979r.b(q3) : this.f1979r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1982u;
                        c0167q.f3100d = z3;
                        if (z3) {
                            c0167q.f3099c = this.f1979r.g() - this.f1986y;
                        } else {
                            c0167q.f3099c = this.f1979r.k() + this.f1986y;
                        }
                    }
                    c0167q.e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2905b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f2904a.f593d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    C0142H c0142h = (C0142H) focusedChild2.getLayoutParams();
                    if (!c0142h.f2916a.i() && c0142h.f2916a.b() >= 0 && c0142h.f2916a.b() < s2.b()) {
                        c0167q.c(focusedChild2, AbstractC0141G.H(focusedChild2));
                        c0167q.e = true;
                    }
                }
                if (this.f1980s == this.f1983v) {
                    View N02 = c0167q.f3100d ? this.f1982u ? N0(c0147m, s2, 0, v(), s2.b()) : N0(c0147m, s2, v() - 1, -1, s2.b()) : this.f1982u ? N0(c0147m, s2, v() - 1, -1, s2.b()) : N0(c0147m, s2, 0, v(), s2.b());
                    if (N02 != null) {
                        c0167q.b(N02, AbstractC0141G.H(N02));
                        if (!s2.f2945g && z0() && (this.f1979r.e(N02) >= this.f1979r.g() || this.f1979r.b(N02) < this.f1979r.k())) {
                            c0167q.f3099c = c0167q.f3100d ? this.f1979r.g() : this.f1979r.k();
                        }
                        c0167q.e = true;
                    }
                }
            }
            c0167q.a();
            c0167q.f3098b = this.f1983v ? s2.b() - 1 : 0;
            c0167q.e = true;
        } else if (focusedChild != null && (this.f1979r.e(focusedChild) >= this.f1979r.g() || this.f1979r.b(focusedChild) <= this.f1979r.k())) {
            c0167q.c(focusedChild, AbstractC0141G.H(focusedChild));
        }
        C0168s c0168s = this.f1978q;
        c0168s.f3109f = c0168s.j >= 0 ? 1 : -1;
        int[] iArr = this.f1976D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(s2, iArr);
        int k2 = this.f1979r.k() + Math.max(0, iArr[0]);
        int h2 = this.f1979r.h() + Math.max(0, iArr[1]);
        if (s2.f2945g && (i6 = this.f1985x) != -1 && this.f1986y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1982u) {
                i7 = this.f1979r.g() - this.f1979r.b(q2);
                e = this.f1986y;
            } else {
                e = this.f1979r.e(q2) - this.f1979r.k();
                i7 = this.f1986y;
            }
            int i11 = i7 - e;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h2 -= i11;
            }
        }
        if (!c0167q.f3100d ? !this.f1982u : this.f1982u) {
            i9 = 1;
        }
        U0(c0147m, s2, c0167q, i9);
        p(c0147m);
        this.f1978q.f3113l = this.f1979r.i() == 0 && this.f1979r.f() == 0;
        this.f1978q.getClass();
        this.f1978q.i = 0;
        if (c0167q.f3100d) {
            d1(c0167q.f3098b, c0167q.f3099c);
            C0168s c0168s2 = this.f1978q;
            c0168s2.f3111h = k2;
            H0(c0147m, c0168s2, s2, false);
            C0168s c0168s3 = this.f1978q;
            i3 = c0168s3.f3106b;
            int i12 = c0168s3.f3108d;
            int i13 = c0168s3.f3107c;
            if (i13 > 0) {
                h2 += i13;
            }
            c1(c0167q.f3098b, c0167q.f3099c);
            C0168s c0168s4 = this.f1978q;
            c0168s4.f3111h = h2;
            c0168s4.f3108d += c0168s4.e;
            H0(c0147m, c0168s4, s2, false);
            C0168s c0168s5 = this.f1978q;
            i2 = c0168s5.f3106b;
            int i14 = c0168s5.f3107c;
            if (i14 > 0) {
                d1(i12, i3);
                C0168s c0168s6 = this.f1978q;
                c0168s6.f3111h = i14;
                H0(c0147m, c0168s6, s2, false);
                i3 = this.f1978q.f3106b;
            }
        } else {
            c1(c0167q.f3098b, c0167q.f3099c);
            C0168s c0168s7 = this.f1978q;
            c0168s7.f3111h = h2;
            H0(c0147m, c0168s7, s2, false);
            C0168s c0168s8 = this.f1978q;
            i2 = c0168s8.f3106b;
            int i15 = c0168s8.f3108d;
            int i16 = c0168s8.f3107c;
            if (i16 > 0) {
                k2 += i16;
            }
            d1(c0167q.f3098b, c0167q.f3099c);
            C0168s c0168s9 = this.f1978q;
            c0168s9.f3111h = k2;
            c0168s9.f3108d += c0168s9.e;
            H0(c0147m, c0168s9, s2, false);
            C0168s c0168s10 = this.f1978q;
            i3 = c0168s10.f3106b;
            int i17 = c0168s10.f3107c;
            if (i17 > 0) {
                c1(i15, i2);
                C0168s c0168s11 = this.f1978q;
                c0168s11.f3111h = i17;
                H0(c0147m, c0168s11, s2, false);
                i2 = this.f1978q.f3106b;
            }
        }
        if (v() > 0) {
            if (this.f1982u ^ this.f1983v) {
                int O03 = O0(i2, c0147m, s2, true);
                i4 = i3 + O03;
                i5 = i2 + O03;
                O02 = P0(i4, c0147m, s2, false);
            } else {
                int P02 = P0(i3, c0147m, s2, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                O02 = O0(i5, c0147m, s2, false);
            }
            i3 = i4 + O02;
            i2 = i5 + O02;
        }
        if (s2.f2947k && v() != 0 && !s2.f2945g && z0()) {
            List list2 = c0147m.f2929d;
            int size = list2.size();
            int H = AbstractC0141G.H(u(0));
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                V v2 = (V) list2.get(i20);
                if (!v2.i()) {
                    boolean z4 = v2.b() < H;
                    boolean z5 = this.f1982u;
                    View view = v2.f2958a;
                    if (z4 != z5) {
                        i18 += this.f1979r.c(view);
                    } else {
                        i19 += this.f1979r.c(view);
                    }
                }
            }
            this.f1978q.f3112k = list2;
            if (i18 > 0) {
                d1(AbstractC0141G.H(R0()), i3);
                C0168s c0168s12 = this.f1978q;
                c0168s12.f3111h = i18;
                c0168s12.f3107c = 0;
                c0168s12.a(null);
                H0(c0147m, this.f1978q, s2, false);
            }
            if (i19 > 0) {
                c1(AbstractC0141G.H(Q0()), i2);
                C0168s c0168s13 = this.f1978q;
                c0168s13.f3111h = i19;
                c0168s13.f3107c = 0;
                list = null;
                c0168s13.a(null);
                H0(c0147m, this.f1978q, s2, false);
            } else {
                list = null;
            }
            this.f1978q.f3112k = list;
        }
        if (s2.f2945g) {
            c0167q.d();
        } else {
            g gVar = this.f1979r;
            gVar.f1271a = gVar.l();
        }
        this.f1980s = this.f1983v;
    }

    public final void b1(int i, int i2, boolean z2, S s2) {
        int k2;
        this.f1978q.f3113l = this.f1979r.i() == 0 && this.f1979r.f() == 0;
        this.f1978q.f3109f = i;
        int[] iArr = this.f1976D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(s2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0168s c0168s = this.f1978q;
        int i3 = z3 ? max2 : max;
        c0168s.f3111h = i3;
        if (!z3) {
            max = max2;
        }
        c0168s.i = max;
        if (z3) {
            c0168s.f3111h = this.f1979r.h() + i3;
            View Q02 = Q0();
            C0168s c0168s2 = this.f1978q;
            c0168s2.e = this.f1982u ? -1 : 1;
            int H = AbstractC0141G.H(Q02);
            C0168s c0168s3 = this.f1978q;
            c0168s2.f3108d = H + c0168s3.e;
            c0168s3.f3106b = this.f1979r.b(Q02);
            k2 = this.f1979r.b(Q02) - this.f1979r.g();
        } else {
            View R02 = R0();
            C0168s c0168s4 = this.f1978q;
            c0168s4.f3111h = this.f1979r.k() + c0168s4.f3111h;
            C0168s c0168s5 = this.f1978q;
            c0168s5.e = this.f1982u ? 1 : -1;
            int H2 = AbstractC0141G.H(R02);
            C0168s c0168s6 = this.f1978q;
            c0168s5.f3108d = H2 + c0168s6.e;
            c0168s6.f3106b = this.f1979r.e(R02);
            k2 = (-this.f1979r.e(R02)) + this.f1979r.k();
        }
        C0168s c0168s7 = this.f1978q;
        c0168s7.f3107c = i2;
        if (z2) {
            c0168s7.f3107c = i2 - k2;
        }
        c0168s7.f3110g = k2;
    }

    @Override // h0.AbstractC0141G
    public final void c(String str) {
        if (this.f1987z == null) {
            super.c(str);
        }
    }

    @Override // h0.AbstractC0141G
    public void c0(S s2) {
        this.f1987z = null;
        this.f1985x = -1;
        this.f1986y = Integer.MIN_VALUE;
        this.f1973A.d();
    }

    public final void c1(int i, int i2) {
        this.f1978q.f3107c = this.f1979r.g() - i2;
        C0168s c0168s = this.f1978q;
        c0168s.e = this.f1982u ? -1 : 1;
        c0168s.f3108d = i;
        c0168s.f3109f = 1;
        c0168s.f3106b = i2;
        c0168s.f3110g = Integer.MIN_VALUE;
    }

    @Override // h0.AbstractC0141G
    public final boolean d() {
        return this.f1977p == 0;
    }

    @Override // h0.AbstractC0141G
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0169t) {
            this.f1987z = (C0169t) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i2) {
        this.f1978q.f3107c = i2 - this.f1979r.k();
        C0168s c0168s = this.f1978q;
        c0168s.f3108d = i;
        c0168s.e = this.f1982u ? 1 : -1;
        c0168s.f3109f = -1;
        c0168s.f3106b = i2;
        c0168s.f3110g = Integer.MIN_VALUE;
    }

    @Override // h0.AbstractC0141G
    public final boolean e() {
        return this.f1977p == 1;
    }

    @Override // h0.AbstractC0141G
    public final Parcelable e0() {
        C0169t c0169t = this.f1987z;
        if (c0169t != null) {
            C0169t c0169t2 = new C0169t();
            c0169t2.f3114a = c0169t.f3114a;
            c0169t2.f3115b = c0169t.f3115b;
            c0169t2.f3116c = c0169t.f3116c;
            return c0169t2;
        }
        C0169t c0169t3 = new C0169t();
        if (v() > 0) {
            G0();
            boolean z2 = this.f1980s ^ this.f1982u;
            c0169t3.f3116c = z2;
            if (z2) {
                View Q02 = Q0();
                c0169t3.f3115b = this.f1979r.g() - this.f1979r.b(Q02);
                c0169t3.f3114a = AbstractC0141G.H(Q02);
            } else {
                View R02 = R0();
                c0169t3.f3114a = AbstractC0141G.H(R02);
                c0169t3.f3115b = this.f1979r.e(R02) - this.f1979r.k();
            }
        } else {
            c0169t3.f3114a = -1;
        }
        return c0169t3;
    }

    @Override // h0.AbstractC0141G
    public final void h(int i, int i2, S s2, C0162l c0162l) {
        if (this.f1977p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, s2);
        B0(s2, this.f1978q, c0162l);
    }

    @Override // h0.AbstractC0141G
    public final void i(int i, C0162l c0162l) {
        boolean z2;
        int i2;
        C0169t c0169t = this.f1987z;
        if (c0169t == null || (i2 = c0169t.f3114a) < 0) {
            X0();
            z2 = this.f1982u;
            i2 = this.f1985x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0169t.f3116c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1975C && i2 >= 0 && i2 < i; i4++) {
            c0162l.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // h0.AbstractC0141G
    public final int j(S s2) {
        return C0(s2);
    }

    @Override // h0.AbstractC0141G
    public int k(S s2) {
        return D0(s2);
    }

    @Override // h0.AbstractC0141G
    public int l(S s2) {
        return E0(s2);
    }

    @Override // h0.AbstractC0141G
    public final int m(S s2) {
        return C0(s2);
    }

    @Override // h0.AbstractC0141G
    public int m0(int i, C0147M c0147m, S s2) {
        if (this.f1977p == 1) {
            return 0;
        }
        return Y0(i, c0147m, s2);
    }

    @Override // h0.AbstractC0141G
    public int n(S s2) {
        return D0(s2);
    }

    @Override // h0.AbstractC0141G
    public final void n0(int i) {
        this.f1985x = i;
        this.f1986y = Integer.MIN_VALUE;
        C0169t c0169t = this.f1987z;
        if (c0169t != null) {
            c0169t.f3114a = -1;
        }
        l0();
    }

    @Override // h0.AbstractC0141G
    public int o(S s2) {
        return E0(s2);
    }

    @Override // h0.AbstractC0141G
    public int o0(int i, C0147M c0147m, S s2) {
        if (this.f1977p == 0) {
            return 0;
        }
        return Y0(i, c0147m, s2);
    }

    @Override // h0.AbstractC0141G
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H = i - AbstractC0141G.H(u(0));
        if (H >= 0 && H < v2) {
            View u2 = u(H);
            if (AbstractC0141G.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // h0.AbstractC0141G
    public C0142H r() {
        return new C0142H(-2, -2);
    }

    @Override // h0.AbstractC0141G
    public final boolean v0() {
        if (this.f2913m == 1073741824 || this.f2912l == 1073741824) {
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

    @Override // h0.AbstractC0141G
    public void x0(RecyclerView recyclerView, int i) {
        C0170u c0170u = new C0170u(recyclerView.getContext());
        c0170u.f3117a = i;
        y0(c0170u);
    }

    @Override // h0.AbstractC0141G
    public boolean z0() {
        return this.f1987z == null && this.f1980s == this.f1983v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1977p = 1;
        this.f1981t = false;
        this.f1982u = false;
        this.f1983v = false;
        this.f1984w = true;
        this.f1985x = -1;
        this.f1986y = Integer.MIN_VALUE;
        this.f1987z = null;
        this.f1973A = new C0167q();
        this.f1974B = new r();
        this.f1975C = 2;
        this.f1976D = new int[2];
        C0140F I2 = AbstractC0141G.I(context, attributeSet, i, i2);
        Z0(I2.f2900a);
        boolean z2 = I2.f2902c;
        c(null);
        if (z2 != this.f1981t) {
            this.f1981t = z2;
            l0();
        }
        a1(I2.f2903d);
    }
}
