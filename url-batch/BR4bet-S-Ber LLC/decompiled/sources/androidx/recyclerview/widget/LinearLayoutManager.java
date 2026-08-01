package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a20;
import defpackage.b20;
import defpackage.c20;
import defpackage.f60;
import defpackage.g9;
import defpackage.h20;
import defpackage.ij;
import defpackage.kr;
import defpackage.m20;
import defpackage.n20;
import defpackage.q20;
import defpackage.ro;
import defpackage.ts;
import defpackage.us;
import defpackage.vs;
import defpackage.ws;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends b20 implements m20 {
    public final ts A;
    public final us B;
    public final int C;
    public final int[] D;
    public int p;
    public vs q;
    public ij r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public ws z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new ts();
        this.B = new us();
        this.C = 2;
        this.D = new int[2];
        a20 I = b20.I(context, attributeSet, i, i2);
        a1(I.a);
        boolean z = I.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        b1(I.d);
    }

    @Override // defpackage.b20
    public boolean A0() {
        return this.z == null && this.s == this.v;
    }

    public void B0(n20 n20Var, int[] iArr) {
        int i;
        int l = n20Var.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    public void C0(n20 n20Var, vs vsVar, ro roVar) {
        int i = vsVar.d;
        if (i < 0 || i >= n20Var.b()) {
            return;
        }
        roVar.a(i, Math.max(0, vsVar.g));
    }

    public final int D0(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        ij ijVar = this.r;
        boolean z = !this.w;
        return kr.l(n20Var, ijVar, K0(z), J0(z), this, this.w);
    }

    public final int E0(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        ij ijVar = this.r;
        boolean z = !this.w;
        return kr.m(n20Var, ijVar, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        ij ijVar = this.r;
        boolean z = !this.w;
        return kr.n(n20Var, ijVar, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && T0()) ? -1 : 1 : (this.p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.q == null) {
            vs vsVar = new vs();
            vsVar.a = true;
            vsVar.h = 0;
            vsVar.i = 0;
            vsVar.k = null;
            this.q = vsVar;
        }
    }

    public final int I0(h20 h20Var, vs vsVar, n20 n20Var, boolean z) {
        int i;
        int i2 = vsVar.c;
        int i3 = vsVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                vsVar.g = i3 + i2;
            }
            W0(h20Var, vsVar);
        }
        int i4 = vsVar.c + vsVar.h;
        while (true) {
            if ((!vsVar.l && i4 <= 0) || (i = vsVar.d) < 0 || i >= n20Var.b()) {
                break;
            }
            us usVar = this.B;
            usVar.a = 0;
            usVar.b = false;
            usVar.c = false;
            usVar.d = false;
            U0(h20Var, n20Var, vsVar, usVar);
            if (!usVar.b) {
                int i5 = vsVar.b;
                int i6 = usVar.a;
                vsVar.b = (vsVar.f * i6) + i5;
                if (!usVar.c || vsVar.k != null || !n20Var.g) {
                    vsVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = vsVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    vsVar.g = i8;
                    int i9 = vsVar.c;
                    if (i9 < 0) {
                        vsVar.g = i8 + i9;
                    }
                    W0(h20Var, vsVar);
                }
                if (z && usVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - vsVar.c;
    }

    public final View J0(boolean z) {
        return this.u ? N0(0, v(), z) : N0(v() - 1, -1, z);
    }

    public final View K0(boolean z) {
        return this.u ? N0(v() - 1, -1, z) : N0(0, v(), z);
    }

    @Override // defpackage.b20
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return b20.H(N0);
    }

    public final View M0(int i, int i2) {
        int i3;
        int i4;
        H0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.z(i, i2, i3, i4) : this.d.z(i, i2, i3, i4);
    }

    public final View N0(int i, int i2, boolean z) {
        H0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.z(i, i2, i3, 320) : this.d.z(i, i2, i3, 320);
    }

    public View O0(h20 h20Var, n20 n20Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        H0();
        int v = v();
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
            i3 = 1;
        }
        int b = n20Var.b();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = b20.H(u);
            int e = this.r.e(u);
            int b2 = this.r.b(u);
            if (H >= 0 && H < b) {
                if (!((c20) u.getLayoutParams()).a.h()) {
                    boolean z3 = b2 <= k && e < k;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return u;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    }
                } else if (view3 == null) {
                    view3 = u;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int P0(int i, h20 h20Var, n20 n20Var, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -Z0(-g2, h20Var, n20Var);
        int i3 = i + i2;
        if (!z || (g = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(g);
        return g + i2;
    }

    public final int Q0(int i, h20 h20Var, n20 n20Var, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -Z0(k2, h20Var, n20Var);
        int i3 = i + i2;
        if (!z || (k = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-k);
        return i2 - k;
    }

    public final View R0() {
        return u(this.u ? 0 : v() - 1);
    }

    public final View S0() {
        return u(this.u ? v() - 1 : 0);
    }

    @Override // defpackage.b20
    public View T(View view, int i, h20 h20Var, n20 n20Var) {
        int G0;
        Y0();
        if (v() != 0 && (G0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.r.l() * 0.33333334f), false, n20Var);
            vs vsVar = this.q;
            vsVar.g = Integer.MIN_VALUE;
            vsVar.a = false;
            I0(h20Var, vsVar, n20Var, true);
            boolean z = this.u;
            View M0 = G0 == -1 ? z ? M0(v() - 1, -1) : M0(0, v()) : z ? M0(0, v()) : M0(v() - 1, -1);
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

    @Override // defpackage.b20
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(N0 == null ? -1 : b20.H(N0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(h20 h20Var, n20 n20Var, vs vsVar, us usVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = vsVar.b(h20Var);
        if (b == null) {
            usVar.b = true;
            return;
        }
        c20 c20Var = (c20) b.getLayoutParams();
        List list = vsVar.k;
        boolean z = this.u;
        int i5 = vsVar.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                b(b, -1, false);
            } else {
                b(b, 0, false);
            }
        } else {
            if (z == (i5 == -1)) {
                b(b, -1, true);
            } else {
                b(b, 0, true);
            }
        }
        c20 c20Var2 = (c20) b.getLayoutParams();
        Rect J = this.b.J(b);
        int i6 = J.left + J.right;
        int i7 = J.top + J.bottom;
        int w = b20.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) c20Var2).leftMargin + ((ViewGroup.MarginLayoutParams) c20Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) c20Var2).width);
        int w2 = b20.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) c20Var2).topMargin + ((ViewGroup.MarginLayoutParams) c20Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) c20Var2).height);
        if (v0(b, w, w2, c20Var2)) {
            b.measure(w, w2);
        }
        usVar.a = this.r.c(b);
        if (this.p == 1) {
            if (T0()) {
                i4 = this.n - F();
                i2 = i4 - this.r.d(b);
            } else {
                int E = E();
                i4 = this.r.d(b) + E;
                i2 = E;
            }
            int i8 = vsVar.f;
            i3 = vsVar.b;
            int i9 = usVar.a;
            if (i8 == -1) {
                int i10 = i3 - i9;
                i = i3;
                i3 = i10;
            } else {
                i = i9 + i3;
            }
        } else {
            int G = G();
            int d = this.r.d(b) + G;
            int i11 = vsVar.f;
            int i12 = vsVar.b;
            int i13 = usVar.a;
            if (i11 == -1) {
                int i14 = i12 - i13;
                i4 = i12;
                i3 = G;
                i = d;
                i2 = i14;
            } else {
                int i15 = i12 + i13;
                i = d;
                i2 = i12;
                i3 = G;
                i4 = i15;
            }
        }
        b20.N(b, i2, i3, i4, i);
        if (c20Var.a.h() || c20Var.a.k()) {
            usVar.c = true;
        }
        usVar.d = b.hasFocusable();
    }

    public final void W0(h20 h20Var, vs vsVar) {
        if (!vsVar.a || vsVar.l) {
            return;
        }
        int i = vsVar.g;
        int i2 = vsVar.i;
        if (vsVar.f == -1) {
            int v = v();
            if (i < 0) {
                return;
            }
            int f = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < v; i3++) {
                    View u = u(i3);
                    if (this.r.e(u) < f || this.r.n(u) < f) {
                        X0(h20Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u2 = u(i5);
                if (this.r.e(u2) < f || this.r.n(u2) < f) {
                    X0(h20Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int v2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < v2; i7++) {
                View u3 = u(i7);
                if (this.r.b(u3) > i6 || this.r.m(u3) > i6) {
                    X0(h20Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u4 = u(i9);
            if (this.r.b(u4) > i6 || this.r.m(u4) > i6) {
                X0(h20Var, i8, i9);
                return;
            }
        }
    }

    public final void X0(h20 h20Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u = u(i);
                k0(i);
                h20Var.g(u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u2 = u(i3);
            k0(i3);
            h20Var.g(u2);
        }
    }

    public final void Y0() {
        if (this.p == 1 || !T0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Z0(int i, h20 h20Var, n20 n20Var) {
        if (v() != 0 && i != 0) {
            H0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            c1(i2, abs, true, n20Var);
            vs vsVar = this.q;
            int I0 = I0(h20Var, vsVar, n20Var, false) + vsVar.g;
            if (I0 >= 0) {
                if (abs > I0) {
                    i = i2 * I0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.m20
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < b20.H(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            g9.i(f60.e("invalid orientation:", i));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            ij a = ij.a(this, i);
            this.r = a;
            this.A.a = a;
            this.p = i;
            m0();
        }
    }

    public void b1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        m0();
    }

    @Override // defpackage.b20
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.b20
    public void c0(h20 h20Var, n20 n20Var) {
        View view;
        View view2;
        View O0;
        int i;
        int e;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int P0;
        int i6;
        View q;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && n20Var.b() == 0) {
            h0(h20Var);
            return;
        }
        ws wsVar = this.z;
        if (wsVar != null && (i8 = wsVar.f) >= 0) {
            this.x = i8;
        }
        H0();
        boolean z = false;
        this.q.a = false;
        Y0();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.i).contains(view)) {
            view = null;
        }
        ts tsVar = this.A;
        if (!tsVar.e || this.x != -1 || this.z != null) {
            tsVar.c();
            tsVar.d = this.u ^ this.v;
            if (!n20Var.g && (i = this.x) != -1) {
                if (i < 0 || i >= n20Var.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    tsVar.b = i10;
                    ws wsVar2 = this.z;
                    if (wsVar2 != null && wsVar2.f >= 0) {
                        boolean z2 = wsVar2.h;
                        tsVar.d = z2;
                        ij ijVar = this.r;
                        if (z2) {
                            tsVar.c = ijVar.g() - this.z.g;
                        } else {
                            tsVar.c = ijVar.k() + this.z.g;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i10);
                        if (q2 == null) {
                            if (v() > 0) {
                                tsVar.d = (this.x < b20.H(u(0))) == this.u;
                            }
                            tsVar.a();
                        } else if (this.r.c(q2) > this.r.l()) {
                            tsVar.a();
                        } else {
                            int e3 = this.r.e(q2) - this.r.k();
                            ij ijVar2 = this.r;
                            if (e3 < 0) {
                                tsVar.c = ijVar2.k();
                                tsVar.d = false;
                            } else if (ijVar2.g() - this.r.b(q2) < 0) {
                                tsVar.c = this.r.g();
                                tsVar.d = true;
                            } else {
                                boolean z3 = tsVar.d;
                                ij ijVar3 = this.r;
                                if (z3) {
                                    int b = ijVar3.b(q2);
                                    ij ijVar4 = this.r;
                                    e = (Integer.MIN_VALUE == ijVar4.a ? 0 : ijVar4.l() - ijVar4.a) + b;
                                } else {
                                    e = ijVar3.e(q2);
                                }
                                tsVar.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.u;
                        tsVar.d = z4;
                        ij ijVar5 = this.r;
                        if (z4) {
                            tsVar.c = ijVar5.g() - this.y;
                        } else {
                            tsVar.c = ijVar5.k() + this.y;
                        }
                    }
                    tsVar.e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.i).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    c20 c20Var = (c20) view2.getLayoutParams();
                    if (!c20Var.a.h() && c20Var.a.b() >= 0 && c20Var.a.b() < n20Var.b()) {
                        tsVar.b(view2, b20.H(view2));
                        tsVar.e = true;
                    }
                }
                boolean z5 = this.s;
                boolean z6 = this.v;
                if (z5 == z6 && (O0 = O0(h20Var, n20Var, tsVar.d, z6)) != null) {
                    int H = b20.H(O0);
                    boolean z7 = tsVar.d;
                    ij ijVar6 = tsVar.a;
                    if (z7) {
                        int b2 = ijVar6.b(O0);
                        ij ijVar7 = tsVar.a;
                        tsVar.c = (Integer.MIN_VALUE == ijVar7.a ? 0 : ijVar7.l() - ijVar7.a) + b2;
                    } else {
                        tsVar.c = ijVar6.e(O0);
                    }
                    tsVar.b = H;
                    if (!n20Var.g && A0()) {
                        int e4 = this.r.e(O0);
                        int b3 = this.r.b(O0);
                        int k = this.r.k();
                        int g = this.r.g();
                        boolean z8 = b3 <= k && e4 < k;
                        boolean z9 = e4 >= g && b3 > g;
                        if (z8 || z9) {
                            if (tsVar.d) {
                                k = g;
                            }
                            tsVar.c = k;
                        }
                    }
                    tsVar.e = true;
                }
            }
            tsVar.a();
            tsVar.b = this.v ? n20Var.b() - 1 : 0;
            tsVar.e = true;
        } else if (view != null && (this.r.e(view) >= this.r.g() || this.r.b(view) <= this.r.k())) {
            tsVar.b(view, b20.H(view));
        }
        vs vsVar = this.q;
        vsVar.f = vsVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(n20Var, iArr);
        int k2 = this.r.k() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (n20Var.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i6)) != null) {
            boolean z10 = this.u;
            ij ijVar8 = this.r;
            if (z10) {
                i7 = ijVar8.g() - this.r.b(q);
                e2 = this.y;
            } else {
                e2 = ijVar8.e(q) - this.r.k();
                i7 = this.y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        boolean z11 = tsVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        V0(h20Var, n20Var, tsVar, i9);
        p(h20Var);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = tsVar.d;
        int i12 = tsVar.b;
        if (z13) {
            e1(i12, tsVar.c);
            vs vsVar2 = this.q;
            vsVar2.h = k2;
            I0(h20Var, vsVar2, n20Var, false);
            vs vsVar3 = this.q;
            i3 = vsVar3.b;
            int i13 = vsVar3.d;
            int i14 = vsVar3.c;
            if (i14 > 0) {
                h += i14;
            }
            d1(tsVar.b, tsVar.c);
            vs vsVar4 = this.q;
            vsVar4.h = h;
            vsVar4.d += vsVar4.e;
            I0(h20Var, vsVar4, n20Var, false);
            vs vsVar5 = this.q;
            i2 = vsVar5.b;
            int i15 = vsVar5.c;
            if (i15 > 0) {
                e1(i13, i3);
                vs vsVar6 = this.q;
                vsVar6.h = i15;
                I0(h20Var, vsVar6, n20Var, false);
                i3 = this.q.b;
            }
        } else {
            d1(i12, tsVar.c);
            vs vsVar7 = this.q;
            vsVar7.h = h;
            I0(h20Var, vsVar7, n20Var, false);
            vs vsVar8 = this.q;
            i2 = vsVar8.b;
            int i16 = vsVar8.d;
            int i17 = vsVar8.c;
            if (i17 > 0) {
                k2 += i17;
            }
            e1(tsVar.b, tsVar.c);
            vs vsVar9 = this.q;
            vsVar9.h = k2;
            vsVar9.d += vsVar9.e;
            I0(h20Var, vsVar9, n20Var, false);
            vs vsVar10 = this.q;
            int i18 = vsVar10.b;
            int i19 = vsVar10.c;
            if (i19 > 0) {
                d1(i16, i2);
                vs vsVar11 = this.q;
                vsVar11.h = i19;
                I0(h20Var, vsVar11, n20Var, false);
                i2 = this.q.b;
            }
            i3 = i18;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int P02 = P0(i2, h20Var, n20Var, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                P0 = Q0(i4, h20Var, n20Var, false);
            } else {
                int Q0 = Q0(i3, h20Var, n20Var, true);
                i4 = i3 + Q0;
                i5 = i2 + Q0;
                P0 = P0(i5, h20Var, n20Var, false);
            }
            i3 = i4 + P0;
            i2 = i5 + P0;
        }
        if (n20Var.k && v() != 0 && !n20Var.g && A0()) {
            List list2 = h20Var.d;
            int size = list2.size();
            int H2 = b20.H(u(0));
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size) {
                q20 q20Var = (q20) list2.get(i20);
                boolean h2 = q20Var.h();
                View view3 = q20Var.a;
                if (!h2) {
                    boolean z14 = q20Var.b() < H2 ? true : z;
                    boolean z15 = this.u;
                    ij ijVar9 = this.r;
                    if (z14 != z15) {
                        i21 += ijVar9.c(view3);
                    } else {
                        i22 += ijVar9.c(view3);
                    }
                }
                i20++;
                z = false;
            }
            this.q.k = list2;
            if (i21 > 0) {
                e1(b20.H(S0()), i3);
                vs vsVar12 = this.q;
                vsVar12.h = i21;
                r4 = 0;
                vsVar12.c = 0;
                vsVar12.a(null);
                I0(h20Var, this.q, n20Var, false);
            } else {
                r4 = 0;
            }
            if (i22 > 0) {
                d1(b20.H(R0()), i2);
                vs vsVar13 = this.q;
                vsVar13.h = i22;
                vsVar13.c = r4;
                list = null;
                vsVar13.a(null);
                I0(h20Var, this.q, n20Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (n20Var.g) {
            tsVar.c();
        } else {
            ij ijVar10 = this.r;
            ijVar10.a = ijVar10.l();
        }
        this.s = this.v;
    }

    public final void c1(int i, int i2, boolean z, n20 n20Var) {
        int k;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(n20Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        vs vsVar = this.q;
        int i3 = z2 ? max2 : max;
        vsVar.h = i3;
        if (!z2) {
            max = max2;
        }
        vsVar.i = max;
        if (z2) {
            vsVar.h = this.r.h() + i3;
            View R0 = R0();
            vs vsVar2 = this.q;
            vsVar2.e = this.u ? -1 : 1;
            int H = b20.H(R0);
            vs vsVar3 = this.q;
            vsVar2.d = H + vsVar3.e;
            vsVar3.b = this.r.b(R0);
            k = this.r.b(R0) - this.r.g();
        } else {
            View S0 = S0();
            vs vsVar4 = this.q;
            vsVar4.h = this.r.k() + vsVar4.h;
            vs vsVar5 = this.q;
            vsVar5.e = this.u ? 1 : -1;
            int H2 = b20.H(S0);
            vs vsVar6 = this.q;
            vsVar5.d = H2 + vsVar6.e;
            vsVar6.b = this.r.e(S0);
            k = (-this.r.e(S0)) + this.r.k();
        }
        vs vsVar7 = this.q;
        vsVar7.c = i2;
        if (z) {
            vsVar7.c = i2 - k;
        }
        vsVar7.g = k;
    }

    @Override // defpackage.b20
    public final boolean d() {
        return this.p == 0;
    }

    @Override // defpackage.b20
    public void d0(n20 n20Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        vs vsVar = this.q;
        vsVar.e = this.u ? -1 : 1;
        vsVar.d = i;
        vsVar.f = 1;
        vsVar.b = i2;
        vsVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.b20
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.b20
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof ws) {
            ws wsVar = (ws) parcelable;
            this.z = wsVar;
            if (this.x != -1) {
                wsVar.f = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        vs vsVar = this.q;
        vsVar.d = i;
        vsVar.e = this.u ? 1 : -1;
        vsVar.f = -1;
        vsVar.b = i2;
        vsVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.b20
    public final Parcelable f0() {
        ws wsVar = this.z;
        if (wsVar != null) {
            ws wsVar2 = new ws();
            wsVar2.f = wsVar.f;
            wsVar2.g = wsVar.g;
            wsVar2.h = wsVar.h;
            return wsVar2;
        }
        ws wsVar3 = new ws();
        if (v() <= 0) {
            wsVar3.f = -1;
            return wsVar3;
        }
        H0();
        boolean z = this.s ^ this.u;
        wsVar3.h = z;
        if (z) {
            View R0 = R0();
            wsVar3.g = this.r.g() - this.r.b(R0);
            wsVar3.f = b20.H(R0);
            return wsVar3;
        }
        View S0 = S0();
        wsVar3.f = b20.H(S0);
        wsVar3.g = this.r.e(S0) - this.r.k();
        return wsVar3;
    }

    @Override // defpackage.b20
    public final void h(int i, int i2, n20 n20Var, ro roVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        c1(i > 0 ? 1 : -1, Math.abs(i), true, n20Var);
        C0(n20Var, this.q, roVar);
    }

    @Override // defpackage.b20
    public final void i(int i, ro roVar) {
        boolean z;
        int i2;
        ws wsVar = this.z;
        if (wsVar == null || (i2 = wsVar.f) < 0) {
            Y0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = wsVar.h;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            roVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.b20
    public final int j(n20 n20Var) {
        return D0(n20Var);
    }

    @Override // defpackage.b20
    public int k(n20 n20Var) {
        return E0(n20Var);
    }

    @Override // defpackage.b20
    public int l(n20 n20Var) {
        return F0(n20Var);
    }

    @Override // defpackage.b20
    public final int m(n20 n20Var) {
        return D0(n20Var);
    }

    @Override // defpackage.b20
    public int n(n20 n20Var) {
        return E0(n20Var);
    }

    @Override // defpackage.b20
    public int n0(int i, h20 h20Var, n20 n20Var) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, h20Var, n20Var);
    }

    @Override // defpackage.b20
    public int o(n20 n20Var) {
        return F0(n20Var);
    }

    @Override // defpackage.b20
    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        ws wsVar = this.z;
        if (wsVar != null) {
            wsVar.f = -1;
        }
        m0();
    }

    @Override // defpackage.b20
    public int p0(int i, h20 h20Var, n20 n20Var) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, h20Var, n20Var);
    }

    @Override // defpackage.b20
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int H = i - b20.H(u(0));
        if (H >= 0 && H < v) {
            View u = u(H);
            if (b20.H(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.b20
    public c20 r() {
        return new c20(-2, -2);
    }

    @Override // defpackage.b20
    public final boolean w0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int v = v();
            for (int i = 0; i < v; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.b20
    public void y0(RecyclerView recyclerView, int i) {
        xs xsVar = new xs(recyclerView.getContext());
        xsVar.a = i;
        z0(xsVar);
    }

    @Override // defpackage.b20
    public final void S(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new ts();
        this.B = new us();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    public void V0(h20 h20Var, n20 n20Var, ts tsVar, int i) {
    }
}
