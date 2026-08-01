package androidx.recyclerview.widget;

import a.y;
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
import f1.b1;
import f1.l0;
import f1.m0;
import f1.n;
import f1.n0;
import f1.s;
import f1.s0;
import f1.t;
import f1.u;
import f1.v;
import f1.w;
import f1.x0;
import f1.y0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class LinearLayoutManager extends m0 implements x0 {
    public final s A;
    public final t B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f648p;

    /* renamed from: q, reason: collision with root package name */
    public u f649q;

    /* renamed from: r, reason: collision with root package name */
    public g f650r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f651s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f652t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f653u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f654v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f655w;

    /* renamed from: x, reason: collision with root package name */
    public int f656x;

    /* renamed from: y, reason: collision with root package name */
    public int f657y;

    /* renamed from: z, reason: collision with root package name */
    public v f658z;

    public LinearLayoutManager(int i) {
        this.f648p = 1;
        this.f652t = false;
        this.f653u = false;
        this.f654v = false;
        this.f655w = true;
        this.f656x = -1;
        this.f657y = Integer.MIN_VALUE;
        this.f658z = null;
        this.A = new s();
        this.B = new t();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.f652t) {
            this.f652t = false;
            m0();
        }
    }

    @Override // f1.m0
    public boolean A0() {
        return this.f658z == null && this.f651s == this.f654v;
    }

    public void B0(y0 y0Var, int[] iArr) {
        int i;
        int l4 = y0Var.f1536a != -1 ? this.f650r.l() : 0;
        if (this.f649q.f1504f == -1) {
            i = 0;
        } else {
            i = l4;
            l4 = 0;
        }
        iArr[0] = l4;
        iArr[1] = i;
    }

    public void C0(y0 y0Var, u uVar, n nVar) {
        int i = uVar.d;
        if (i < 0 || i >= y0Var.b()) {
            return;
        }
        nVar.a(i, Math.max(0, uVar.f1505g));
    }

    public final int D0(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f650r;
        boolean z3 = !this.f655w;
        return y.k(y0Var, gVar, K0(z3), J0(z3), this, this.f655w);
    }

    public final int E0(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f650r;
        boolean z3 = !this.f655w;
        return y.l(y0Var, gVar, K0(z3), J0(z3), this, this.f655w, this.f653u);
    }

    public final int F0(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f650r;
        boolean z3 = !this.f655w;
        return y.m(y0Var, gVar, K0(z3), J0(z3), this, this.f655w);
    }

    public final int G0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f648p == 1) ? 1 : Integer.MIN_VALUE : this.f648p == 0 ? 1 : Integer.MIN_VALUE : this.f648p == 1 ? -1 : Integer.MIN_VALUE : this.f648p == 0 ? -1 : Integer.MIN_VALUE : (this.f648p != 1 && T0()) ? -1 : 1 : (this.f648p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.f649q == null) {
            u uVar = new u();
            uVar.f1500a = true;
            uVar.f1506h = 0;
            uVar.i = 0;
            uVar.f1508k = null;
            this.f649q = uVar;
        }
    }

    public final int I0(s0 s0Var, u uVar, y0 y0Var, boolean z3) {
        int i;
        int i4 = uVar.f1502c;
        int i5 = uVar.f1505g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                uVar.f1505g = i5 + i4;
            }
            W0(s0Var, uVar);
        }
        int i6 = uVar.f1502c + uVar.f1506h;
        while (true) {
            if ((!uVar.f1509l && i6 <= 0) || (i = uVar.d) < 0 || i >= y0Var.b()) {
                break;
            }
            t tVar = this.B;
            tVar.f1497a = 0;
            tVar.f1498b = false;
            tVar.f1499c = false;
            tVar.d = false;
            U0(s0Var, y0Var, uVar, tVar);
            if (!tVar.f1498b) {
                int i7 = uVar.f1501b;
                int i8 = tVar.f1497a;
                uVar.f1501b = (uVar.f1504f * i8) + i7;
                if (!tVar.f1499c || uVar.f1508k != null || !y0Var.f1541g) {
                    uVar.f1502c -= i8;
                    i6 -= i8;
                }
                int i9 = uVar.f1505g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + i8;
                    uVar.f1505g = i10;
                    int i11 = uVar.f1502c;
                    if (i11 < 0) {
                        uVar.f1505g = i10 + i11;
                    }
                    W0(s0Var, uVar);
                }
                if (z3 && tVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - uVar.f1502c;
    }

    public final View J0(boolean z3) {
        return this.f653u ? N0(0, v(), z3) : N0(v() - 1, -1, z3);
    }

    public final View K0(boolean z3) {
        return this.f653u ? N0(v() - 1, -1, z3) : N0(0, v(), z3);
    }

    @Override // f1.m0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return m0.H(N0);
    }

    public final View M0(int i, int i4) {
        int i5;
        int i6;
        H0();
        if (i4 <= i && i4 >= i) {
            return u(i);
        }
        if (this.f650r.e(u(i)) < this.f650r.k()) {
            i5 = 16644;
            i6 = 16388;
        } else {
            i5 = 4161;
            i6 = 4097;
        }
        return this.f648p == 0 ? this.f1446c.u(i, i4, i5, i6) : this.d.u(i, i4, i5, i6);
    }

    public final View N0(int i, int i4, boolean z3) {
        H0();
        int i5 = z3 ? 24579 : 320;
        return this.f648p == 0 ? this.f1446c.u(i, i4, i5, 320) : this.d.u(i, i4, i5, 320);
    }

    public View O0(s0 s0Var, y0 y0Var, boolean z3, boolean z4) {
        int i;
        int i4;
        int i5;
        H0();
        int v3 = v();
        if (z4) {
            i4 = v() - 1;
            i = -1;
            i5 = -1;
        } else {
            i = v3;
            i4 = 0;
            i5 = 1;
        }
        int b4 = y0Var.b();
        int k4 = this.f650r.k();
        int g4 = this.f650r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i4 != i) {
            View u3 = u(i4);
            int H = m0.H(u3);
            int e4 = this.f650r.e(u3);
            int b5 = this.f650r.b(u3);
            if (H >= 0 && H < b4) {
                if (!((n0) u3.getLayoutParams()).f1460a.h()) {
                    boolean z5 = b5 <= k4 && e4 < k4;
                    boolean z6 = e4 >= g4 && b5 > g4;
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
            i4 += i5;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int P0(int i, s0 s0Var, y0 y0Var, boolean z3) {
        int g4;
        int g5 = this.f650r.g() - i;
        if (g5 <= 0) {
            return 0;
        }
        int i4 = -Z0(-g5, s0Var, y0Var);
        int i5 = i + i4;
        if (!z3 || (g4 = this.f650r.g() - i5) <= 0) {
            return i4;
        }
        this.f650r.o(g4);
        return g4 + i4;
    }

    public final int Q0(int i, s0 s0Var, y0 y0Var, boolean z3) {
        int k4;
        int k5 = i - this.f650r.k();
        if (k5 <= 0) {
            return 0;
        }
        int i4 = -Z0(k5, s0Var, y0Var);
        int i5 = i + i4;
        if (!z3 || (k4 = i5 - this.f650r.k()) <= 0) {
            return i4;
        }
        this.f650r.o(-k4);
        return i4 - k4;
    }

    public final View R0() {
        return u(this.f653u ? 0 : v() - 1);
    }

    public final View S0() {
        return u(this.f653u ? v() - 1 : 0);
    }

    @Override // f1.m0
    public View T(View view, int i, s0 s0Var, y0 y0Var) {
        int G0;
        Y0();
        if (v() != 0 && (G0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.f650r.l() * 0.33333334f), false, y0Var);
            u uVar = this.f649q;
            uVar.f1505g = Integer.MIN_VALUE;
            uVar.f1500a = false;
            I0(s0Var, uVar, y0Var, true);
            View M0 = G0 == -1 ? this.f653u ? M0(v() - 1, -1) : M0(0, v()) : this.f653u ? M0(0, v()) : M0(v() - 1, -1);
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

    @Override // f1.m0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(N0 == null ? -1 : m0.H(N0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(s0 s0Var, y0 y0Var, u uVar, t tVar) {
        int i;
        int i4;
        int i5;
        int i6;
        View b4 = uVar.b(s0Var);
        if (b4 == null) {
            tVar.f1498b = true;
            return;
        }
        n0 n0Var = (n0) b4.getLayoutParams();
        if (uVar.f1508k == null) {
            if (this.f653u == (uVar.f1504f == -1)) {
                b(b4, -1, false);
            } else {
                b(b4, 0, false);
            }
        } else {
            if (this.f653u == (uVar.f1504f == -1)) {
                b(b4, -1, true);
            } else {
                b(b4, 0, true);
            }
        }
        n0 n0Var2 = (n0) b4.getLayoutParams();
        Rect J = this.f1445b.J(b4);
        int i7 = J.left + J.right;
        int i8 = J.top + J.bottom;
        int w3 = m0.w(d(), this.f1455n, this.f1453l, F() + E() + ((ViewGroup.MarginLayoutParams) n0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) n0Var2).rightMargin + i7, ((ViewGroup.MarginLayoutParams) n0Var2).width);
        int w4 = m0.w(e(), this.f1456o, this.f1454m, D() + G() + ((ViewGroup.MarginLayoutParams) n0Var2).topMargin + ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) n0Var2).height);
        if (v0(b4, w3, w4, n0Var2)) {
            b4.measure(w3, w4);
        }
        tVar.f1497a = this.f650r.c(b4);
        if (this.f648p == 1) {
            if (T0()) {
                i6 = this.f1455n - F();
                i = i6 - this.f650r.d(b4);
            } else {
                i = E();
                i6 = this.f650r.d(b4) + i;
            }
            if (uVar.f1504f == -1) {
                i4 = uVar.f1501b;
                i5 = i4 - tVar.f1497a;
            } else {
                i5 = uVar.f1501b;
                i4 = tVar.f1497a + i5;
            }
        } else {
            int G = G();
            int d = this.f650r.d(b4) + G;
            if (uVar.f1504f == -1) {
                int i9 = uVar.f1501b;
                int i10 = i9 - tVar.f1497a;
                i6 = i9;
                i4 = d;
                i = i10;
                i5 = G;
            } else {
                int i11 = uVar.f1501b;
                int i12 = tVar.f1497a + i11;
                i = i11;
                i4 = d;
                i5 = G;
                i6 = i12;
            }
        }
        m0.N(b4, i, i5, i6, i4);
        if (n0Var.f1460a.h() || n0Var.f1460a.k()) {
            tVar.f1499c = true;
        }
        tVar.d = b4.hasFocusable();
    }

    public final void W0(s0 s0Var, u uVar) {
        if (!uVar.f1500a || uVar.f1509l) {
            return;
        }
        int i = uVar.f1505g;
        int i4 = uVar.i;
        if (uVar.f1504f == -1) {
            int v3 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f650r.f() - i) + i4;
            if (this.f653u) {
                for (int i5 = 0; i5 < v3; i5++) {
                    View u3 = u(i5);
                    if (this.f650r.e(u3) < f2 || this.f650r.n(u3) < f2) {
                        X0(s0Var, 0, i5);
                        return;
                    }
                }
                return;
            }
            int i6 = v3 - 1;
            for (int i7 = i6; i7 >= 0; i7--) {
                View u4 = u(i7);
                if (this.f650r.e(u4) < f2 || this.f650r.n(u4) < f2) {
                    X0(s0Var, i6, i7);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i8 = i - i4;
        int v4 = v();
        if (!this.f653u) {
            for (int i9 = 0; i9 < v4; i9++) {
                View u5 = u(i9);
                if (this.f650r.b(u5) > i8 || this.f650r.m(u5) > i8) {
                    X0(s0Var, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = v4 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View u6 = u(i11);
            if (this.f650r.b(u6) > i8 || this.f650r.m(u6) > i8) {
                X0(s0Var, i10, i11);
                return;
            }
        }
    }

    public final void X0(s0 s0Var, int i, int i4) {
        if (i == i4) {
            return;
        }
        if (i4 <= i) {
            while (i > i4) {
                View u3 = u(i);
                k0(i);
                s0Var.g(u3);
                i--;
            }
            return;
        }
        for (int i5 = i4 - 1; i5 >= i; i5--) {
            View u4 = u(i5);
            k0(i5);
            s0Var.g(u4);
        }
    }

    public final void Y0() {
        if (this.f648p == 1 || !T0()) {
            this.f653u = this.f652t;
        } else {
            this.f653u = !this.f652t;
        }
    }

    public final int Z0(int i, s0 s0Var, y0 y0Var) {
        if (v() != 0 && i != 0) {
            H0();
            this.f649q.f1500a = true;
            int i4 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            c1(i4, abs, true, y0Var);
            u uVar = this.f649q;
            int I0 = I0(s0Var, uVar, y0Var, false) + uVar.f1505g;
            if (I0 >= 0) {
                if (abs > I0) {
                    i = i4 * I0;
                }
                this.f650r.o(-i);
                this.f649q.f1507j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // f1.x0
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i4 = (i < m0.H(u(0))) != this.f653u ? -1 : 1;
        return this.f648p == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(w0.d("invalid orientation:", i));
        }
        c(null);
        if (i != this.f648p || this.f650r == null) {
            g a2 = g.a(this, i);
            this.f650r = a2;
            this.A.f1486a = a2;
            this.f648p = i;
            m0();
        }
    }

    public void b1(boolean z3) {
        c(null);
        if (this.f654v == z3) {
            return;
        }
        this.f654v = z3;
        m0();
    }

    @Override // f1.m0
    public final void c(String str) {
        if (this.f658z == null) {
            super.c(str);
        }
    }

    @Override // f1.m0
    public void c0(s0 s0Var, y0 y0Var) {
        View view;
        View view2;
        View O0;
        int i;
        int e4;
        int i4;
        int i5;
        List list;
        int i6;
        int i7;
        int P0;
        int i8;
        View q3;
        int e5;
        int i9;
        int i10;
        int i11 = -1;
        if (!(this.f658z == null && this.f656x == -1) && y0Var.b() == 0) {
            h0(s0Var);
            return;
        }
        v vVar = this.f658z;
        if (vVar != null && (i10 = vVar.f1511f) >= 0) {
            this.f656x = i10;
        }
        H0();
        this.f649q.f1500a = false;
        Y0();
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f1444a.d).contains(view)) {
            view = null;
        }
        s sVar = this.A;
        if (!sVar.f1489e || this.f656x != -1 || this.f658z != null) {
            sVar.d();
            sVar.d = this.f653u ^ this.f654v;
            if (!y0Var.f1541g && (i = this.f656x) != -1) {
                if (i < 0 || i >= y0Var.b()) {
                    this.f656x = -1;
                    this.f657y = Integer.MIN_VALUE;
                } else {
                    int i12 = this.f656x;
                    sVar.f1487b = i12;
                    v vVar2 = this.f658z;
                    if (vVar2 != null && vVar2.f1511f >= 0) {
                        boolean z3 = vVar2.f1513h;
                        sVar.d = z3;
                        if (z3) {
                            sVar.f1488c = this.f650r.g() - this.f658z.f1512g;
                        } else {
                            sVar.f1488c = this.f650r.k() + this.f658z.f1512g;
                        }
                    } else if (this.f657y == Integer.MIN_VALUE) {
                        View q4 = q(i12);
                        if (q4 == null) {
                            if (v() > 0) {
                                sVar.d = (this.f656x < m0.H(u(0))) == this.f653u;
                            }
                            sVar.a();
                        } else if (this.f650r.c(q4) > this.f650r.l()) {
                            sVar.a();
                        } else if (this.f650r.e(q4) - this.f650r.k() < 0) {
                            sVar.f1488c = this.f650r.k();
                            sVar.d = false;
                        } else if (this.f650r.g() - this.f650r.b(q4) < 0) {
                            sVar.f1488c = this.f650r.g();
                            sVar.d = true;
                        } else {
                            if (sVar.d) {
                                int b4 = this.f650r.b(q4);
                                g gVar = this.f650r;
                                e4 = (Integer.MIN_VALUE == gVar.f325a ? 0 : gVar.l() - gVar.f325a) + b4;
                            } else {
                                e4 = this.f650r.e(q4);
                            }
                            sVar.f1488c = e4;
                        }
                    } else {
                        boolean z4 = this.f653u;
                        sVar.d = z4;
                        if (z4) {
                            sVar.f1488c = this.f650r.g() - this.f657y;
                        } else {
                            sVar.f1488c = this.f650r.k() + this.f657y;
                        }
                    }
                    sVar.f1489e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f1445b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f1444a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    n0 n0Var = (n0) view2.getLayoutParams();
                    if (!n0Var.f1460a.h() && n0Var.f1460a.b() >= 0 && n0Var.f1460a.b() < y0Var.b()) {
                        sVar.c(view2, m0.H(view2));
                        sVar.f1489e = true;
                    }
                }
                boolean z5 = this.f651s;
                boolean z6 = this.f654v;
                if (z5 == z6 && (O0 = O0(s0Var, y0Var, sVar.d, z6)) != null) {
                    sVar.b(O0, m0.H(O0));
                    if (!y0Var.f1541g && A0()) {
                        int e6 = this.f650r.e(O0);
                        int b5 = this.f650r.b(O0);
                        int k4 = this.f650r.k();
                        int g4 = this.f650r.g();
                        boolean z7 = b5 <= k4 && e6 < k4;
                        boolean z8 = e6 >= g4 && b5 > g4;
                        if (z7 || z8) {
                            if (sVar.d) {
                                k4 = g4;
                            }
                            sVar.f1488c = k4;
                        }
                    }
                    sVar.f1489e = true;
                }
            }
            sVar.a();
            sVar.f1487b = this.f654v ? y0Var.b() - 1 : 0;
            sVar.f1489e = true;
        } else if (view != null && (this.f650r.e(view) >= this.f650r.g() || this.f650r.b(view) <= this.f650r.k())) {
            sVar.c(view, m0.H(view));
        }
        u uVar = this.f649q;
        uVar.f1504f = uVar.f1507j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(y0Var, iArr);
        int k5 = this.f650r.k() + Math.max(0, iArr[0]);
        int h4 = this.f650r.h() + Math.max(0, iArr[1]);
        if (y0Var.f1541g && (i8 = this.f656x) != -1 && this.f657y != Integer.MIN_VALUE && (q3 = q(i8)) != null) {
            if (this.f653u) {
                i9 = this.f650r.g() - this.f650r.b(q3);
                e5 = this.f657y;
            } else {
                e5 = this.f650r.e(q3) - this.f650r.k();
                i9 = this.f657y;
            }
            int i13 = i9 - e5;
            if (i13 > 0) {
                k5 += i13;
            } else {
                h4 -= i13;
            }
        }
        if (!sVar.d ? !this.f653u : this.f653u) {
            i11 = 1;
        }
        V0(s0Var, y0Var, sVar, i11);
        p(s0Var);
        this.f649q.f1509l = this.f650r.i() == 0 && this.f650r.f() == 0;
        this.f649q.getClass();
        this.f649q.i = 0;
        if (sVar.d) {
            e1(sVar.f1487b, sVar.f1488c);
            u uVar2 = this.f649q;
            uVar2.f1506h = k5;
            I0(s0Var, uVar2, y0Var, false);
            u uVar3 = this.f649q;
            i5 = uVar3.f1501b;
            int i14 = uVar3.d;
            int i15 = uVar3.f1502c;
            if (i15 > 0) {
                h4 += i15;
            }
            d1(sVar.f1487b, sVar.f1488c);
            u uVar4 = this.f649q;
            uVar4.f1506h = h4;
            uVar4.d += uVar4.f1503e;
            I0(s0Var, uVar4, y0Var, false);
            u uVar5 = this.f649q;
            i4 = uVar5.f1501b;
            int i16 = uVar5.f1502c;
            if (i16 > 0) {
                e1(i14, i5);
                u uVar6 = this.f649q;
                uVar6.f1506h = i16;
                I0(s0Var, uVar6, y0Var, false);
                i5 = this.f649q.f1501b;
            }
        } else {
            d1(sVar.f1487b, sVar.f1488c);
            u uVar7 = this.f649q;
            uVar7.f1506h = h4;
            I0(s0Var, uVar7, y0Var, false);
            u uVar8 = this.f649q;
            i4 = uVar8.f1501b;
            int i17 = uVar8.d;
            int i18 = uVar8.f1502c;
            if (i18 > 0) {
                k5 += i18;
            }
            e1(sVar.f1487b, sVar.f1488c);
            u uVar9 = this.f649q;
            uVar9.f1506h = k5;
            uVar9.d += uVar9.f1503e;
            I0(s0Var, uVar9, y0Var, false);
            u uVar10 = this.f649q;
            int i19 = uVar10.f1501b;
            int i20 = uVar10.f1502c;
            if (i20 > 0) {
                d1(i17, i4);
                u uVar11 = this.f649q;
                uVar11.f1506h = i20;
                I0(s0Var, uVar11, y0Var, false);
                i4 = this.f649q.f1501b;
            }
            i5 = i19;
        }
        if (v() > 0) {
            if (this.f653u ^ this.f654v) {
                int P02 = P0(i4, s0Var, y0Var, true);
                i6 = i5 + P02;
                i7 = i4 + P02;
                P0 = Q0(i6, s0Var, y0Var, false);
            } else {
                int Q0 = Q0(i5, s0Var, y0Var, true);
                i6 = i5 + Q0;
                i7 = i4 + Q0;
                P0 = P0(i7, s0Var, y0Var, false);
            }
            i5 = i6 + P0;
            i4 = i7 + P0;
        }
        if (y0Var.f1544k && v() != 0 && !y0Var.f1541g && A0()) {
            List list2 = s0Var.d;
            int size = list2.size();
            int H = m0.H(u(0));
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                b1 b1Var = (b1) list2.get(i23);
                boolean h5 = b1Var.h();
                View view3 = b1Var.f1309a;
                if (!h5) {
                    if ((b1Var.b() < H) != this.f653u) {
                        i21 += this.f650r.c(view3);
                    } else {
                        i22 += this.f650r.c(view3);
                    }
                }
            }
            this.f649q.f1508k = list2;
            if (i21 > 0) {
                e1(m0.H(S0()), i5);
                u uVar12 = this.f649q;
                uVar12.f1506h = i21;
                uVar12.f1502c = 0;
                uVar12.a(null);
                I0(s0Var, this.f649q, y0Var, false);
            }
            if (i22 > 0) {
                d1(m0.H(R0()), i4);
                u uVar13 = this.f649q;
                uVar13.f1506h = i22;
                uVar13.f1502c = 0;
                list = null;
                uVar13.a(null);
                I0(s0Var, this.f649q, y0Var, false);
            } else {
                list = null;
            }
            this.f649q.f1508k = list;
        }
        if (y0Var.f1541g) {
            sVar.d();
        } else {
            g gVar2 = this.f650r;
            gVar2.f325a = gVar2.l();
        }
        this.f651s = this.f654v;
    }

    public final void c1(int i, int i4, boolean z3, y0 y0Var) {
        int k4;
        this.f649q.f1509l = this.f650r.i() == 0 && this.f650r.f() == 0;
        this.f649q.f1504f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(y0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z4 = i == 1;
        u uVar = this.f649q;
        int i5 = z4 ? max2 : max;
        uVar.f1506h = i5;
        if (!z4) {
            max = max2;
        }
        uVar.i = max;
        if (z4) {
            uVar.f1506h = this.f650r.h() + i5;
            View R0 = R0();
            u uVar2 = this.f649q;
            uVar2.f1503e = this.f653u ? -1 : 1;
            int H = m0.H(R0);
            u uVar3 = this.f649q;
            uVar2.d = H + uVar3.f1503e;
            uVar3.f1501b = this.f650r.b(R0);
            k4 = this.f650r.b(R0) - this.f650r.g();
        } else {
            View S0 = S0();
            u uVar4 = this.f649q;
            uVar4.f1506h = this.f650r.k() + uVar4.f1506h;
            u uVar5 = this.f649q;
            uVar5.f1503e = this.f653u ? 1 : -1;
            int H2 = m0.H(S0);
            u uVar6 = this.f649q;
            uVar5.d = H2 + uVar6.f1503e;
            uVar6.f1501b = this.f650r.e(S0);
            k4 = (-this.f650r.e(S0)) + this.f650r.k();
        }
        u uVar7 = this.f649q;
        uVar7.f1502c = i4;
        if (z3) {
            uVar7.f1502c = i4 - k4;
        }
        uVar7.f1505g = k4;
    }

    @Override // f1.m0
    public final boolean d() {
        return this.f648p == 0;
    }

    @Override // f1.m0
    public void d0(y0 y0Var) {
        this.f658z = null;
        this.f656x = -1;
        this.f657y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void d1(int i, int i4) {
        this.f649q.f1502c = this.f650r.g() - i4;
        u uVar = this.f649q;
        uVar.f1503e = this.f653u ? -1 : 1;
        uVar.d = i;
        uVar.f1504f = 1;
        uVar.f1501b = i4;
        uVar.f1505g = Integer.MIN_VALUE;
    }

    @Override // f1.m0
    public final boolean e() {
        return this.f648p == 1;
    }

    @Override // f1.m0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof v) {
            v vVar = (v) parcelable;
            this.f658z = vVar;
            if (this.f656x != -1) {
                vVar.f1511f = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i4) {
        this.f649q.f1502c = i4 - this.f650r.k();
        u uVar = this.f649q;
        uVar.d = i;
        uVar.f1503e = this.f653u ? 1 : -1;
        uVar.f1504f = -1;
        uVar.f1501b = i4;
        uVar.f1505g = Integer.MIN_VALUE;
    }

    @Override // f1.m0
    public final Parcelable f0() {
        v vVar = this.f658z;
        if (vVar != null) {
            v vVar2 = new v();
            vVar2.f1511f = vVar.f1511f;
            vVar2.f1512g = vVar.f1512g;
            vVar2.f1513h = vVar.f1513h;
            return vVar2;
        }
        v vVar3 = new v();
        if (v() <= 0) {
            vVar3.f1511f = -1;
            return vVar3;
        }
        H0();
        boolean z3 = this.f651s ^ this.f653u;
        vVar3.f1513h = z3;
        if (z3) {
            View R0 = R0();
            vVar3.f1512g = this.f650r.g() - this.f650r.b(R0);
            vVar3.f1511f = m0.H(R0);
            return vVar3;
        }
        View S0 = S0();
        vVar3.f1511f = m0.H(S0);
        vVar3.f1512g = this.f650r.e(S0) - this.f650r.k();
        return vVar3;
    }

    @Override // f1.m0
    public final void h(int i, int i4, y0 y0Var, n nVar) {
        if (this.f648p != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        c1(i > 0 ? 1 : -1, Math.abs(i), true, y0Var);
        C0(y0Var, this.f649q, nVar);
    }

    @Override // f1.m0
    public final void i(int i, n nVar) {
        boolean z3;
        int i4;
        v vVar = this.f658z;
        if (vVar == null || (i4 = vVar.f1511f) < 0) {
            Y0();
            z3 = this.f653u;
            i4 = this.f656x;
            if (i4 == -1) {
                i4 = z3 ? i - 1 : 0;
            }
        } else {
            z3 = vVar.f1513h;
        }
        int i5 = z3 ? -1 : 1;
        for (int i6 = 0; i6 < this.C && i4 >= 0 && i4 < i; i6++) {
            nVar.a(i4, 0);
            i4 += i5;
        }
    }

    @Override // f1.m0
    public final int j(y0 y0Var) {
        return D0(y0Var);
    }

    @Override // f1.m0
    public int k(y0 y0Var) {
        return E0(y0Var);
    }

    @Override // f1.m0
    public int l(y0 y0Var) {
        return F0(y0Var);
    }

    @Override // f1.m0
    public final int m(y0 y0Var) {
        return D0(y0Var);
    }

    @Override // f1.m0
    public int n(y0 y0Var) {
        return E0(y0Var);
    }

    @Override // f1.m0
    public int n0(int i, s0 s0Var, y0 y0Var) {
        if (this.f648p == 1) {
            return 0;
        }
        return Z0(i, s0Var, y0Var);
    }

    @Override // f1.m0
    public int o(y0 y0Var) {
        return F0(y0Var);
    }

    @Override // f1.m0
    public final void o0(int i) {
        this.f656x = i;
        this.f657y = Integer.MIN_VALUE;
        v vVar = this.f658z;
        if (vVar != null) {
            vVar.f1511f = -1;
        }
        m0();
    }

    @Override // f1.m0
    public int p0(int i, s0 s0Var, y0 y0Var) {
        if (this.f648p == 0) {
            return 0;
        }
        return Z0(i, s0Var, y0Var);
    }

    @Override // f1.m0
    public final View q(int i) {
        int v3 = v();
        if (v3 == 0) {
            return null;
        }
        int H = i - m0.H(u(0));
        if (H >= 0 && H < v3) {
            View u3 = u(H);
            if (m0.H(u3) == i) {
                return u3;
            }
        }
        return super.q(i);
    }

    @Override // f1.m0
    public n0 r() {
        return new n0(-2, -2);
    }

    @Override // f1.m0
    public final boolean w0() {
        if (this.f1454m != 1073741824 && this.f1453l != 1073741824) {
            int v3 = v();
            for (int i = 0; i < v3; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f1.m0
    public void y0(RecyclerView recyclerView, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.f1515a = i;
        z0(wVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f648p = 1;
        this.f652t = false;
        this.f653u = false;
        this.f654v = false;
        this.f655w = true;
        this.f656x = -1;
        this.f657y = Integer.MIN_VALUE;
        this.f658z = null;
        this.A = new s();
        this.B = new t();
        this.C = 2;
        this.D = new int[2];
        l0 I = m0.I(context, attributeSet, i, i4);
        a1(I.f1414a);
        boolean z3 = I.f1416c;
        c(null);
        if (z3 != this.f652t) {
            this.f652t = z3;
            m0();
        }
        b1(I.d);
    }

    @Override // f1.m0
    public final void S(RecyclerView recyclerView) {
    }

    public void V0(s0 s0Var, y0 y0Var, s sVar, int i) {
    }
}
