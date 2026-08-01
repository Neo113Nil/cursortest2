package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import androidx.fragment.app.w0;
import b1.c1;
import b1.m0;
import b1.n0;
import b1.o;
import b1.o0;
import b1.t;
import b1.t0;
import b1.u;
import b1.v;
import b1.w;
import b1.x;
import b1.y0;
import b1.z0;
import java.util.ArrayList;
import java.util.List;
import k3.d;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends n0 implements y0 {
    public final t A;
    public final u B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f617p;

    /* renamed from: q, reason: collision with root package name */
    public v f618q;

    /* renamed from: r, reason: collision with root package name */
    public g f619r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f620s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f621t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f622u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f623v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f624w;

    /* renamed from: x, reason: collision with root package name */
    public int f625x;

    /* renamed from: y, reason: collision with root package name */
    public int f626y;

    /* renamed from: z, reason: collision with root package name */
    public w f627z;

    public LinearLayoutManager(int i4) {
        this.f617p = 1;
        this.f621t = false;
        this.f622u = false;
        this.f623v = false;
        this.f624w = true;
        this.f625x = -1;
        this.f626y = Integer.MIN_VALUE;
        this.f627z = null;
        this.A = new t();
        this.B = new u();
        this.C = 2;
        this.D = new int[2];
        a1(i4);
        c(null);
        if (this.f621t) {
            this.f621t = false;
            m0();
        }
    }

    @Override // b1.n0
    public boolean A0() {
        return this.f627z == null && this.f620s == this.f623v;
    }

    public void B0(z0 z0Var, int[] iArr) {
        int i4;
        int l4 = z0Var.f956a != -1 ? this.f619r.l() : 0;
        if (this.f618q.f929f == -1) {
            i4 = 0;
        } else {
            i4 = l4;
            l4 = 0;
        }
        iArr[0] = l4;
        iArr[1] = i4;
    }

    public void C0(z0 z0Var, v vVar, o oVar) {
        int i4 = vVar.f927d;
        if (i4 < 0 || i4 >= z0Var.b()) {
            return;
        }
        oVar.a(i4, Math.max(0, vVar.g));
    }

    public final int D0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f619r;
        boolean z3 = !this.f624w;
        return d.l(z0Var, gVar, K0(z3), J0(z3), this, this.f624w);
    }

    public final int E0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f619r;
        boolean z3 = !this.f624w;
        return d.m(z0Var, gVar, K0(z3), J0(z3), this, this.f624w, this.f622u);
    }

    public final int F0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f619r;
        boolean z3 = !this.f624w;
        return d.n(z0Var, gVar, K0(z3), J0(z3), this, this.f624w);
    }

    public final int G0(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.f617p == 1) ? 1 : Integer.MIN_VALUE : this.f617p == 0 ? 1 : Integer.MIN_VALUE : this.f617p == 1 ? -1 : Integer.MIN_VALUE : this.f617p == 0 ? -1 : Integer.MIN_VALUE : (this.f617p != 1 && T0()) ? -1 : 1 : (this.f617p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.f618q == null) {
            v vVar = new v();
            vVar.f925a = true;
            vVar.h = 0;
            vVar.f930i = 0;
            vVar.f932k = null;
            this.f618q = vVar;
        }
    }

    public final int I0(t0 t0Var, v vVar, z0 z0Var, boolean z3) {
        int i4;
        int i5 = vVar.c;
        int i6 = vVar.g;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                vVar.g = i6 + i5;
            }
            W0(t0Var, vVar);
        }
        int i7 = vVar.c + vVar.h;
        while (true) {
            if ((!vVar.f933l && i7 <= 0) || (i4 = vVar.f927d) < 0 || i4 >= z0Var.b()) {
                break;
            }
            u uVar = this.B;
            uVar.f922a = 0;
            uVar.f923b = false;
            uVar.c = false;
            uVar.f924d = false;
            U0(t0Var, z0Var, vVar, uVar);
            if (!uVar.f923b) {
                int i8 = vVar.f926b;
                int i9 = uVar.f922a;
                vVar.f926b = (vVar.f929f * i9) + i8;
                if (!uVar.c || vVar.f932k != null || !z0Var.g) {
                    vVar.c -= i9;
                    i7 -= i9;
                }
                int i10 = vVar.g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + i9;
                    vVar.g = i11;
                    int i12 = vVar.c;
                    if (i12 < 0) {
                        vVar.g = i11 + i12;
                    }
                    W0(t0Var, vVar);
                }
                if (z3 && uVar.f924d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - vVar.c;
    }

    public final View J0(boolean z3) {
        return this.f622u ? N0(0, v(), z3) : N0(v() - 1, -1, z3);
    }

    public final View K0(boolean z3) {
        return this.f622u ? N0(v() - 1, -1, z3) : N0(0, v(), z3);
    }

    @Override // b1.n0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return n0.H(N0);
    }

    public final View M0(int i4, int i5) {
        int i6;
        int i7;
        H0();
        if (i5 <= i4 && i5 >= i4) {
            return u(i4);
        }
        if (this.f619r.e(u(i4)) < this.f619r.k()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = 4097;
        }
        return this.f617p == 0 ? this.c.u(i4, i5, i6, i7) : this.f876d.u(i4, i5, i6, i7);
    }

    public final View N0(int i4, int i5, boolean z3) {
        H0();
        int i6 = z3 ? 24579 : 320;
        return this.f617p == 0 ? this.c.u(i4, i5, i6, 320) : this.f876d.u(i4, i5, i6, 320);
    }

    public View O0(t0 t0Var, z0 z0Var, boolean z3, boolean z4) {
        int i4;
        int i5;
        int i6;
        H0();
        int v3 = v();
        if (z4) {
            i5 = v() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = v3;
            i5 = 0;
            i6 = 1;
        }
        int b2 = z0Var.b();
        int k4 = this.f619r.k();
        int g = this.f619r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i5 != i4) {
            View u3 = u(i5);
            int H = n0.H(u3);
            int e4 = this.f619r.e(u3);
            int b4 = this.f619r.b(u3);
            if (H >= 0 && H < b2) {
                if (!((o0) u3.getLayoutParams()).f889a.h()) {
                    boolean z5 = b4 <= k4 && e4 < k4;
                    boolean z6 = e4 >= g && b4 > g;
                    if (!z5 && !z6) {
                        return u3;
                    }
                    if (z3) {
                        if (!z6) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                        view2 = u3;
                    } else {
                        if (!z5) {
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
            i5 += i6;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int P0(int i4, t0 t0Var, z0 z0Var, boolean z3) {
        int g;
        int g4 = this.f619r.g() - i4;
        if (g4 <= 0) {
            return 0;
        }
        int i5 = -Z0(-g4, t0Var, z0Var);
        int i6 = i4 + i5;
        if (!z3 || (g = this.f619r.g() - i6) <= 0) {
            return i5;
        }
        this.f619r.o(g);
        return g + i5;
    }

    public final int Q0(int i4, t0 t0Var, z0 z0Var, boolean z3) {
        int k4;
        int k5 = i4 - this.f619r.k();
        if (k5 <= 0) {
            return 0;
        }
        int i5 = -Z0(k5, t0Var, z0Var);
        int i6 = i4 + i5;
        if (!z3 || (k4 = i6 - this.f619r.k()) <= 0) {
            return i5;
        }
        this.f619r.o(-k4);
        return i5 - k4;
    }

    public final View R0() {
        return u(this.f622u ? 0 : v() - 1);
    }

    public final View S0() {
        return u(this.f622u ? v() - 1 : 0);
    }

    @Override // b1.n0
    public View T(View view, int i4, t0 t0Var, z0 z0Var) {
        int G0;
        Y0();
        if (v() != 0 && (G0 = G0(i4)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.f619r.l() * 0.33333334f), false, z0Var);
            v vVar = this.f618q;
            vVar.g = Integer.MIN_VALUE;
            vVar.f925a = false;
            I0(t0Var, vVar, z0Var, true);
            View M0 = G0 == -1 ? this.f622u ? M0(v() - 1, -1) : M0(0, v()) : this.f622u ? M0(0, v()) : M0(v() - 1, -1);
            View S0 = G0 == -1 ? S0() : R0();
            if (!S0.hasFocusable()) {
                return M0;
            }
            if (M0 != null) {
                return S0;
            }
        }
        return null;
    }

    public final boolean T0() {
        return C() == 1;
    }

    @Override // b1.n0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(N0 == null ? -1 : n0.H(N0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(t0 t0Var, z0 z0Var, v vVar, u uVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        View b2 = vVar.b(t0Var);
        if (b2 == null) {
            uVar.f923b = true;
            return;
        }
        o0 o0Var = (o0) b2.getLayoutParams();
        if (vVar.f932k == null) {
            if (this.f622u == (vVar.f929f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f622u == (vVar.f929f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        o0 o0Var2 = (o0) b2.getLayoutParams();
        Rect J = this.f875b.J(b2);
        int i8 = J.left + J.right;
        int i9 = J.top + J.bottom;
        int w3 = n0.w(d(), this.f884n, this.f882l, F() + E() + ((ViewGroup.MarginLayoutParams) o0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var2).rightMargin + i8, ((ViewGroup.MarginLayoutParams) o0Var2).width);
        int w4 = n0.w(e(), this.f885o, this.f883m, D() + G() + ((ViewGroup.MarginLayoutParams) o0Var2).topMargin + ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) o0Var2).height);
        if (v0(b2, w3, w4, o0Var2)) {
            b2.measure(w3, w4);
        }
        uVar.f922a = this.f619r.c(b2);
        if (this.f617p == 1) {
            if (T0()) {
                i7 = this.f884n - F();
                i4 = i7 - this.f619r.d(b2);
            } else {
                i4 = E();
                i7 = this.f619r.d(b2) + i4;
            }
            if (vVar.f929f == -1) {
                i5 = vVar.f926b;
                i6 = i5 - uVar.f922a;
            } else {
                i6 = vVar.f926b;
                i5 = uVar.f922a + i6;
            }
        } else {
            int G = G();
            int d4 = this.f619r.d(b2) + G;
            if (vVar.f929f == -1) {
                int i10 = vVar.f926b;
                int i11 = i10 - uVar.f922a;
                i7 = i10;
                i5 = d4;
                i4 = i11;
                i6 = G;
            } else {
                int i12 = vVar.f926b;
                int i13 = uVar.f922a + i12;
                i4 = i12;
                i5 = d4;
                i6 = G;
                i7 = i13;
            }
        }
        n0.N(b2, i4, i6, i7, i5);
        if (o0Var.f889a.h() || o0Var.f889a.k()) {
            uVar.c = true;
        }
        uVar.f924d = b2.hasFocusable();
    }

    public final void W0(t0 t0Var, v vVar) {
        if (!vVar.f925a || vVar.f933l) {
            return;
        }
        int i4 = vVar.g;
        int i5 = vVar.f930i;
        if (vVar.f929f == -1) {
            int v3 = v();
            if (i4 < 0) {
                return;
            }
            int f4 = (this.f619r.f() - i4) + i5;
            if (this.f622u) {
                for (int i6 = 0; i6 < v3; i6++) {
                    View u3 = u(i6);
                    if (this.f619r.e(u3) < f4 || this.f619r.n(u3) < f4) {
                        X0(t0Var, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = v3 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View u4 = u(i8);
                if (this.f619r.e(u4) < f4 || this.f619r.n(u4) < f4) {
                    X0(t0Var, i7, i8);
                    return;
                }
            }
            return;
        }
        if (i4 < 0) {
            return;
        }
        int i9 = i4 - i5;
        int v4 = v();
        if (!this.f622u) {
            for (int i10 = 0; i10 < v4; i10++) {
                View u5 = u(i10);
                if (this.f619r.b(u5) > i9 || this.f619r.m(u5) > i9) {
                    X0(t0Var, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = v4 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View u6 = u(i12);
            if (this.f619r.b(u6) > i9 || this.f619r.m(u6) > i9) {
                X0(t0Var, i11, i12);
                return;
            }
        }
    }

    public final void X0(t0 t0Var, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 <= i4) {
            while (i4 > i5) {
                View u3 = u(i4);
                k0(i4);
                t0Var.g(u3);
                i4--;
            }
            return;
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            View u4 = u(i6);
            k0(i6);
            t0Var.g(u4);
        }
    }

    public final void Y0() {
        if (this.f617p == 1 || !T0()) {
            this.f622u = this.f621t;
        } else {
            this.f622u = !this.f621t;
        }
    }

    public final int Z0(int i4, t0 t0Var, z0 z0Var) {
        if (v() != 0 && i4 != 0) {
            H0();
            this.f618q.f925a = true;
            int i5 = i4 > 0 ? 1 : -1;
            int abs = Math.abs(i4);
            c1(i5, abs, true, z0Var);
            v vVar = this.f618q;
            int I0 = I0(t0Var, vVar, z0Var, false) + vVar.g;
            if (I0 >= 0) {
                if (abs > I0) {
                    i4 = i5 * I0;
                }
                this.f619r.o(-i4);
                this.f618q.f931j = i4;
                return i4;
            }
        }
        return 0;
    }

    @Override // b1.y0
    public final PointF a(int i4) {
        if (v() == 0) {
            return null;
        }
        int i5 = (i4 < n0.H(u(0))) != this.f622u ? -1 : 1;
        return this.f617p == 0 ? new PointF(i5, 0.0f) : new PointF(0.0f, i5);
    }

    public final void a1(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(w0.e("invalid orientation:", i4));
        }
        c(null);
        if (i4 != this.f617p || this.f619r == null) {
            g a4 = g.a(this, i4);
            this.f619r = a4;
            this.A.f913a = a4;
            this.f617p = i4;
            m0();
        }
    }

    public void b1(boolean z3) {
        c(null);
        if (this.f623v == z3) {
            return;
        }
        this.f623v = z3;
        m0();
    }

    @Override // b1.n0
    public final void c(String str) {
        if (this.f627z == null) {
            super.c(str);
        }
    }

    @Override // b1.n0
    public void c0(t0 t0Var, z0 z0Var) {
        View view;
        View view2;
        View O0;
        int i4;
        int e4;
        int i5;
        int i6;
        List list;
        int i7;
        int i8;
        int P0;
        int i9;
        View q4;
        int e5;
        int i10;
        int i11;
        int i12 = -1;
        if (!(this.f627z == null && this.f625x == -1) && z0Var.b() == 0) {
            h0(t0Var);
            return;
        }
        w wVar = this.f627z;
        if (wVar != null && (i11 = wVar.f935f) >= 0) {
            this.f625x = i11;
        }
        H0();
        this.f618q.f925a = false;
        Y0();
        RecyclerView recyclerView = this.f875b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f874a.f358d).contains(view)) {
            view = null;
        }
        t tVar = this.A;
        if (!tVar.f916e || this.f625x != -1 || this.f627z != null) {
            tVar.d();
            tVar.f915d = this.f622u ^ this.f623v;
            if (!z0Var.g && (i4 = this.f625x) != -1) {
                if (i4 < 0 || i4 >= z0Var.b()) {
                    this.f625x = -1;
                    this.f626y = Integer.MIN_VALUE;
                } else {
                    int i13 = this.f625x;
                    tVar.f914b = i13;
                    w wVar2 = this.f627z;
                    if (wVar2 != null && wVar2.f935f >= 0) {
                        boolean z3 = wVar2.h;
                        tVar.f915d = z3;
                        if (z3) {
                            tVar.c = this.f619r.g() - this.f627z.g;
                        } else {
                            tVar.c = this.f619r.k() + this.f627z.g;
                        }
                    } else if (this.f626y == Integer.MIN_VALUE) {
                        View q5 = q(i13);
                        if (q5 == null) {
                            if (v() > 0) {
                                tVar.f915d = (this.f625x < n0.H(u(0))) == this.f622u;
                            }
                            tVar.a();
                        } else if (this.f619r.c(q5) > this.f619r.l()) {
                            tVar.a();
                        } else if (this.f619r.e(q5) - this.f619r.k() < 0) {
                            tVar.c = this.f619r.k();
                            tVar.f915d = false;
                        } else if (this.f619r.g() - this.f619r.b(q5) < 0) {
                            tVar.c = this.f619r.g();
                            tVar.f915d = true;
                        } else {
                            if (tVar.f915d) {
                                int b2 = this.f619r.b(q5);
                                g gVar = this.f619r;
                                e4 = (Integer.MIN_VALUE == gVar.f336a ? 0 : gVar.l() - gVar.f336a) + b2;
                            } else {
                                e4 = this.f619r.e(q5);
                            }
                            tVar.c = e4;
                        }
                    } else {
                        boolean z4 = this.f622u;
                        tVar.f915d = z4;
                        if (z4) {
                            tVar.c = this.f619r.g() - this.f626y;
                        } else {
                            tVar.c = this.f619r.k() + this.f626y;
                        }
                    }
                    tVar.f916e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f875b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f874a.f358d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    o0 o0Var = (o0) view2.getLayoutParams();
                    if (!o0Var.f889a.h() && o0Var.f889a.b() >= 0 && o0Var.f889a.b() < z0Var.b()) {
                        tVar.c(view2, n0.H(view2));
                        tVar.f916e = true;
                    }
                }
                boolean z5 = this.f620s;
                boolean z6 = this.f623v;
                if (z5 == z6 && (O0 = O0(t0Var, z0Var, tVar.f915d, z6)) != null) {
                    tVar.b(O0, n0.H(O0));
                    if (!z0Var.g && A0()) {
                        int e6 = this.f619r.e(O0);
                        int b4 = this.f619r.b(O0);
                        int k4 = this.f619r.k();
                        int g = this.f619r.g();
                        boolean z7 = b4 <= k4 && e6 < k4;
                        boolean z8 = e6 >= g && b4 > g;
                        if (z7 || z8) {
                            if (tVar.f915d) {
                                k4 = g;
                            }
                            tVar.c = k4;
                        }
                    }
                    tVar.f916e = true;
                }
            }
            tVar.a();
            tVar.f914b = this.f623v ? z0Var.b() - 1 : 0;
            tVar.f916e = true;
        } else if (view != null && (this.f619r.e(view) >= this.f619r.g() || this.f619r.b(view) <= this.f619r.k())) {
            tVar.c(view, n0.H(view));
        }
        v vVar = this.f618q;
        vVar.f929f = vVar.f931j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(z0Var, iArr);
        int k5 = this.f619r.k() + Math.max(0, iArr[0]);
        int h = this.f619r.h() + Math.max(0, iArr[1]);
        if (z0Var.g && (i9 = this.f625x) != -1 && this.f626y != Integer.MIN_VALUE && (q4 = q(i9)) != null) {
            if (this.f622u) {
                i10 = this.f619r.g() - this.f619r.b(q4);
                e5 = this.f626y;
            } else {
                e5 = this.f619r.e(q4) - this.f619r.k();
                i10 = this.f626y;
            }
            int i14 = i10 - e5;
            if (i14 > 0) {
                k5 += i14;
            } else {
                h -= i14;
            }
        }
        if (!tVar.f915d ? !this.f622u : this.f622u) {
            i12 = 1;
        }
        V0(t0Var, z0Var, tVar, i12);
        p(t0Var);
        this.f618q.f933l = this.f619r.i() == 0 && this.f619r.f() == 0;
        this.f618q.getClass();
        this.f618q.f930i = 0;
        if (tVar.f915d) {
            e1(tVar.f914b, tVar.c);
            v vVar2 = this.f618q;
            vVar2.h = k5;
            I0(t0Var, vVar2, z0Var, false);
            v vVar3 = this.f618q;
            i6 = vVar3.f926b;
            int i15 = vVar3.f927d;
            int i16 = vVar3.c;
            if (i16 > 0) {
                h += i16;
            }
            d1(tVar.f914b, tVar.c);
            v vVar4 = this.f618q;
            vVar4.h = h;
            vVar4.f927d += vVar4.f928e;
            I0(t0Var, vVar4, z0Var, false);
            v vVar5 = this.f618q;
            i5 = vVar5.f926b;
            int i17 = vVar5.c;
            if (i17 > 0) {
                e1(i15, i6);
                v vVar6 = this.f618q;
                vVar6.h = i17;
                I0(t0Var, vVar6, z0Var, false);
                i6 = this.f618q.f926b;
            }
        } else {
            d1(tVar.f914b, tVar.c);
            v vVar7 = this.f618q;
            vVar7.h = h;
            I0(t0Var, vVar7, z0Var, false);
            v vVar8 = this.f618q;
            i5 = vVar8.f926b;
            int i18 = vVar8.f927d;
            int i19 = vVar8.c;
            if (i19 > 0) {
                k5 += i19;
            }
            e1(tVar.f914b, tVar.c);
            v vVar9 = this.f618q;
            vVar9.h = k5;
            vVar9.f927d += vVar9.f928e;
            I0(t0Var, vVar9, z0Var, false);
            v vVar10 = this.f618q;
            int i20 = vVar10.f926b;
            int i21 = vVar10.c;
            if (i21 > 0) {
                d1(i18, i5);
                v vVar11 = this.f618q;
                vVar11.h = i21;
                I0(t0Var, vVar11, z0Var, false);
                i5 = this.f618q.f926b;
            }
            i6 = i20;
        }
        if (v() > 0) {
            if (this.f622u ^ this.f623v) {
                int P02 = P0(i5, t0Var, z0Var, true);
                i7 = i6 + P02;
                i8 = i5 + P02;
                P0 = Q0(i7, t0Var, z0Var, false);
            } else {
                int Q0 = Q0(i6, t0Var, z0Var, true);
                i7 = i6 + Q0;
                i8 = i5 + Q0;
                P0 = P0(i8, t0Var, z0Var, false);
            }
            i6 = i7 + P0;
            i5 = i8 + P0;
        }
        if (z0Var.f963k && v() != 0 && !z0Var.g && A0()) {
            List list2 = t0Var.f919d;
            int size = list2.size();
            int H = n0.H(u(0));
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < size; i24++) {
                c1 c1Var = (c1) list2.get(i24);
                boolean h4 = c1Var.h();
                View view3 = c1Var.f747a;
                if (!h4) {
                    if ((c1Var.b() < H) != this.f622u) {
                        i22 += this.f619r.c(view3);
                    } else {
                        i23 += this.f619r.c(view3);
                    }
                }
            }
            this.f618q.f932k = list2;
            if (i22 > 0) {
                e1(n0.H(S0()), i6);
                v vVar12 = this.f618q;
                vVar12.h = i22;
                vVar12.c = 0;
                vVar12.a(null);
                I0(t0Var, this.f618q, z0Var, false);
            }
            if (i23 > 0) {
                d1(n0.H(R0()), i5);
                v vVar13 = this.f618q;
                vVar13.h = i23;
                vVar13.c = 0;
                list = null;
                vVar13.a(null);
                I0(t0Var, this.f618q, z0Var, false);
            } else {
                list = null;
            }
            this.f618q.f932k = list;
        }
        if (z0Var.g) {
            tVar.d();
        } else {
            g gVar2 = this.f619r;
            gVar2.f336a = gVar2.l();
        }
        this.f620s = this.f623v;
    }

    public final void c1(int i4, int i5, boolean z3, z0 z0Var) {
        int k4;
        this.f618q.f933l = this.f619r.i() == 0 && this.f619r.f() == 0;
        this.f618q.f929f = i4;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(z0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z4 = i4 == 1;
        v vVar = this.f618q;
        int i6 = z4 ? max2 : max;
        vVar.h = i6;
        if (!z4) {
            max = max2;
        }
        vVar.f930i = max;
        if (z4) {
            vVar.h = this.f619r.h() + i6;
            View R0 = R0();
            v vVar2 = this.f618q;
            vVar2.f928e = this.f622u ? -1 : 1;
            int H = n0.H(R0);
            v vVar3 = this.f618q;
            vVar2.f927d = H + vVar3.f928e;
            vVar3.f926b = this.f619r.b(R0);
            k4 = this.f619r.b(R0) - this.f619r.g();
        } else {
            View S0 = S0();
            v vVar4 = this.f618q;
            vVar4.h = this.f619r.k() + vVar4.h;
            v vVar5 = this.f618q;
            vVar5.f928e = this.f622u ? 1 : -1;
            int H2 = n0.H(S0);
            v vVar6 = this.f618q;
            vVar5.f927d = H2 + vVar6.f928e;
            vVar6.f926b = this.f619r.e(S0);
            k4 = (-this.f619r.e(S0)) + this.f619r.k();
        }
        v vVar7 = this.f618q;
        vVar7.c = i5;
        if (z3) {
            vVar7.c = i5 - k4;
        }
        vVar7.g = k4;
    }

    @Override // b1.n0
    public final boolean d() {
        return this.f617p == 0;
    }

    @Override // b1.n0
    public void d0(z0 z0Var) {
        this.f627z = null;
        this.f625x = -1;
        this.f626y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void d1(int i4, int i5) {
        this.f618q.c = this.f619r.g() - i5;
        v vVar = this.f618q;
        vVar.f928e = this.f622u ? -1 : 1;
        vVar.f927d = i4;
        vVar.f929f = 1;
        vVar.f926b = i5;
        vVar.g = Integer.MIN_VALUE;
    }

    @Override // b1.n0
    public final boolean e() {
        return this.f617p == 1;
    }

    @Override // b1.n0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof w) {
            w wVar = (w) parcelable;
            this.f627z = wVar;
            if (this.f625x != -1) {
                wVar.f935f = -1;
            }
            m0();
        }
    }

    public final void e1(int i4, int i5) {
        this.f618q.c = i5 - this.f619r.k();
        v vVar = this.f618q;
        vVar.f927d = i4;
        vVar.f928e = this.f622u ? 1 : -1;
        vVar.f929f = -1;
        vVar.f926b = i5;
        vVar.g = Integer.MIN_VALUE;
    }

    @Override // b1.n0
    public final Parcelable f0() {
        w wVar = this.f627z;
        if (wVar != null) {
            w wVar2 = new w();
            wVar2.f935f = wVar.f935f;
            wVar2.g = wVar.g;
            wVar2.h = wVar.h;
            return wVar2;
        }
        w wVar3 = new w();
        if (v() <= 0) {
            wVar3.f935f = -1;
            return wVar3;
        }
        H0();
        boolean z3 = this.f620s ^ this.f622u;
        wVar3.h = z3;
        if (z3) {
            View R0 = R0();
            wVar3.g = this.f619r.g() - this.f619r.b(R0);
            wVar3.f935f = n0.H(R0);
            return wVar3;
        }
        View S0 = S0();
        wVar3.f935f = n0.H(S0);
        wVar3.g = this.f619r.e(S0) - this.f619r.k();
        return wVar3;
    }

    @Override // b1.n0
    public final void h(int i4, int i5, z0 z0Var, o oVar) {
        if (this.f617p != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        H0();
        c1(i4 > 0 ? 1 : -1, Math.abs(i4), true, z0Var);
        C0(z0Var, this.f618q, oVar);
    }

    @Override // b1.n0
    public final void i(int i4, o oVar) {
        boolean z3;
        int i5;
        w wVar = this.f627z;
        if (wVar == null || (i5 = wVar.f935f) < 0) {
            Y0();
            z3 = this.f622u;
            i5 = this.f625x;
            if (i5 == -1) {
                i5 = z3 ? i4 - 1 : 0;
            }
        } else {
            z3 = wVar.h;
        }
        int i6 = z3 ? -1 : 1;
        for (int i7 = 0; i7 < this.C && i5 >= 0 && i5 < i4; i7++) {
            oVar.a(i5, 0);
            i5 += i6;
        }
    }

    @Override // b1.n0
    public final int j(z0 z0Var) {
        return D0(z0Var);
    }

    @Override // b1.n0
    public int k(z0 z0Var) {
        return E0(z0Var);
    }

    @Override // b1.n0
    public int l(z0 z0Var) {
        return F0(z0Var);
    }

    @Override // b1.n0
    public final int m(z0 z0Var) {
        return D0(z0Var);
    }

    @Override // b1.n0
    public int n(z0 z0Var) {
        return E0(z0Var);
    }

    @Override // b1.n0
    public int n0(int i4, t0 t0Var, z0 z0Var) {
        if (this.f617p == 1) {
            return 0;
        }
        return Z0(i4, t0Var, z0Var);
    }

    @Override // b1.n0
    public int o(z0 z0Var) {
        return F0(z0Var);
    }

    @Override // b1.n0
    public final void o0(int i4) {
        this.f625x = i4;
        this.f626y = Integer.MIN_VALUE;
        w wVar = this.f627z;
        if (wVar != null) {
            wVar.f935f = -1;
        }
        m0();
    }

    @Override // b1.n0
    public int p0(int i4, t0 t0Var, z0 z0Var) {
        if (this.f617p == 0) {
            return 0;
        }
        return Z0(i4, t0Var, z0Var);
    }

    @Override // b1.n0
    public final View q(int i4) {
        int v3 = v();
        if (v3 == 0) {
            return null;
        }
        int H = i4 - n0.H(u(0));
        if (H >= 0 && H < v3) {
            View u3 = u(H);
            if (n0.H(u3) == i4) {
                return u3;
            }
        }
        return super.q(i4);
    }

    @Override // b1.n0
    public o0 r() {
        return new o0(-2, -2);
    }

    @Override // b1.n0
    public final boolean w0() {
        if (this.f883m != 1073741824 && this.f882l != 1073741824) {
            int v3 = v();
            for (int i4 = 0; i4 < v3; i4++) {
                ViewGroup.LayoutParams layoutParams = u(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b1.n0
    public void y0(RecyclerView recyclerView, int i4) {
        x xVar = new x(recyclerView.getContext());
        xVar.f936a = i4;
        z0(xVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f617p = 1;
        this.f621t = false;
        this.f622u = false;
        this.f623v = false;
        this.f624w = true;
        this.f625x = -1;
        this.f626y = Integer.MIN_VALUE;
        this.f627z = null;
        this.A = new t();
        this.B = new u();
        this.C = 2;
        this.D = new int[2];
        m0 I = n0.I(context, attributeSet, i4, i5);
        a1(I.f845a);
        boolean z3 = I.c;
        c(null);
        if (z3 != this.f621t) {
            this.f621t = z3;
            m0();
        }
        b1(I.f847d);
    }

    @Override // b1.n0
    public final void S(RecyclerView recyclerView) {
    }

    public void V0(t0 t0Var, z0 z0Var, t tVar, int i4) {
    }
}
