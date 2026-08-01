package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ac;
import defpackage.g80;
import defpackage.h80;
import defpackage.i80;
import defpackage.o80;
import defpackage.r7;
import defpackage.s9;
import defpackage.sx;
import defpackage.t80;
import defpackage.tx;
import defpackage.u80;
import defpackage.ux;
import defpackage.vx;
import defpackage.wl;
import defpackage.wx;
import defpackage.x80;
import defpackage.zb0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends h80 implements t80 {
    public final sx A;
    public final tx B;
    public final int C;
    public final int[] D;
    public int p;
    public ux q;
    public wl r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public vx z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new sx();
        this.B = new tx();
        this.C = 2;
        this.D = new int[2];
        g80 I = h80.I(context, attributeSet, i, i2);
        a1(I.a);
        boolean z = I.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        b1(I.d);
    }

    @Override // defpackage.h80
    public boolean A0() {
        return this.z == null && this.s == this.v;
    }

    public void B0(u80 u80Var, int[] iArr) {
        int i;
        int l = u80Var.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    public void C0(u80 u80Var, ux uxVar, ac acVar) {
        int i = uxVar.d;
        if (i < 0 || i >= u80Var.b()) {
            return;
        }
        acVar.b(i, Math.max(0, uxVar.g));
    }

    public final int D0(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        wl wlVar = this.r;
        boolean z = !this.w;
        return zb0.c(u80Var, wlVar, K0(z), J0(z), this, this.w);
    }

    public final int E0(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        wl wlVar = this.r;
        boolean z = !this.w;
        return zb0.d(u80Var, wlVar, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        wl wlVar = this.r;
        boolean z = !this.w;
        return zb0.e(u80Var, wlVar, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && T0()) ? -1 : 1 : (this.p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.q == null) {
            ux uxVar = new ux();
            uxVar.a = true;
            uxVar.h = 0;
            uxVar.i = 0;
            uxVar.k = null;
            this.q = uxVar;
        }
    }

    public final int I0(o80 o80Var, ux uxVar, u80 u80Var, boolean z) {
        int i;
        int i2 = uxVar.c;
        int i3 = uxVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                uxVar.g = i3 + i2;
            }
            W0(o80Var, uxVar);
        }
        int i4 = uxVar.c + uxVar.h;
        while (true) {
            if ((!uxVar.l && i4 <= 0) || (i = uxVar.d) < 0 || i >= u80Var.b()) {
                break;
            }
            tx txVar = this.B;
            txVar.a = 0;
            txVar.b = false;
            txVar.c = false;
            txVar.d = false;
            U0(o80Var, u80Var, uxVar, txVar);
            if (!txVar.b) {
                int i5 = uxVar.b;
                int i6 = txVar.a;
                uxVar.b = (uxVar.f * i6) + i5;
                if (!txVar.c || uxVar.k != null || !u80Var.g) {
                    uxVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = uxVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    uxVar.g = i8;
                    int i9 = uxVar.c;
                    if (i9 < 0) {
                        uxVar.g = i8 + i9;
                    }
                    W0(o80Var, uxVar);
                }
                if (z && txVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - uxVar.c;
    }

    public final View J0(boolean z) {
        return this.u ? N0(0, v(), z) : N0(v() - 1, -1, z);
    }

    public final View K0(boolean z) {
        return this.u ? N0(v() - 1, -1, z) : N0(0, v(), z);
    }

    @Override // defpackage.h80
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return h80.H(N0);
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
        return this.p == 0 ? this.c.b(i, i2, i3, i4) : this.d.b(i, i2, i3, i4);
    }

    public final View N0(int i, int i2, boolean z) {
        H0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.b(i, i2, i3, 320) : this.d.b(i, i2, i3, 320);
    }

    public View O0(o80 o80Var, u80 u80Var, boolean z, boolean z2) {
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
        int b = u80Var.b();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = h80.H(u);
            int e = this.r.e(u);
            int b2 = this.r.b(u);
            if (H >= 0 && H < b) {
                if (!((i80) u.getLayoutParams()).a.i()) {
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

    public final int P0(int i, o80 o80Var, u80 u80Var, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -Z0(-g2, o80Var, u80Var);
        int i3 = i + i2;
        if (!z || (g = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(g);
        return g + i2;
    }

    public final int Q0(int i, o80 o80Var, u80 u80Var, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -Z0(k2, o80Var, u80Var);
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

    @Override // defpackage.h80
    public View T(View view, int i, o80 o80Var, u80 u80Var) {
        int G0;
        Y0();
        if (v() != 0 && (G0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.r.l() * 0.33333334f), false, u80Var);
            ux uxVar = this.q;
            uxVar.g = Integer.MIN_VALUE;
            uxVar.a = false;
            I0(o80Var, uxVar, u80Var, true);
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

    @Override // defpackage.h80
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(N0 == null ? -1 : h80.H(N0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(o80 o80Var, u80 u80Var, ux uxVar, tx txVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = uxVar.b(o80Var);
        if (b == null) {
            txVar.b = true;
            return;
        }
        i80 i80Var = (i80) b.getLayoutParams();
        List list = uxVar.k;
        boolean z = this.u;
        int i5 = uxVar.f;
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
        i80 i80Var2 = (i80) b.getLayoutParams();
        Rect K = this.b.K(b);
        int i6 = K.left + K.right;
        int i7 = K.top + K.bottom;
        int w = h80.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) i80Var2).leftMargin + ((ViewGroup.MarginLayoutParams) i80Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) i80Var2).width);
        int w2 = h80.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) i80Var2).topMargin + ((ViewGroup.MarginLayoutParams) i80Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) i80Var2).height);
        if (v0(b, w, w2, i80Var2)) {
            b.measure(w, w2);
        }
        txVar.a = this.r.c(b);
        if (this.p == 1) {
            if (T0()) {
                i4 = this.n - F();
                i2 = i4 - this.r.d(b);
            } else {
                int E = E();
                i4 = this.r.d(b) + E;
                i2 = E;
            }
            int i8 = uxVar.f;
            i3 = uxVar.b;
            int i9 = txVar.a;
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
            int i11 = uxVar.f;
            int i12 = uxVar.b;
            int i13 = txVar.a;
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
        h80.N(b, i2, i3, i4, i);
        if (i80Var.a.i() || i80Var.a.l()) {
            txVar.c = true;
        }
        txVar.d = b.hasFocusable();
    }

    public final void W0(o80 o80Var, ux uxVar) {
        if (!uxVar.a || uxVar.l) {
            return;
        }
        int i = uxVar.g;
        int i2 = uxVar.i;
        if (uxVar.f == -1) {
            int v = v();
            if (i < 0) {
                return;
            }
            int f = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < v; i3++) {
                    View u = u(i3);
                    if (this.r.e(u) < f || this.r.n(u) < f) {
                        X0(o80Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u2 = u(i5);
                if (this.r.e(u2) < f || this.r.n(u2) < f) {
                    X0(o80Var, i4, i5);
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
                    X0(o80Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u4 = u(i9);
            if (this.r.b(u4) > i6 || this.r.m(u4) > i6) {
                X0(o80Var, i8, i9);
                return;
            }
        }
    }

    public final void X0(o80 o80Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u = u(i);
                k0(i);
                o80Var.g(u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u2 = u(i3);
            k0(i3);
            o80Var.g(u2);
        }
    }

    public final void Y0() {
        if (this.p == 1 || !T0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Z0(int i, o80 o80Var, u80 u80Var) {
        if (v() != 0 && i != 0) {
            H0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            c1(i2, abs, true, u80Var);
            ux uxVar = this.q;
            int I0 = I0(o80Var, uxVar, u80Var, false) + uxVar.g;
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

    @Override // defpackage.t80
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < h80.H(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            s9.k(r7.b("invalid orientation:", i));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            wl a = wl.a(this, i);
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

    @Override // defpackage.h80
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.h80
    public void c0(o80 o80Var, u80 u80Var) {
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
        if (!(this.z == null && this.x == -1) && u80Var.b() == 0) {
            h0(o80Var);
            return;
        }
        vx vxVar = this.z;
        if (vxVar != null && (i8 = vxVar.f) >= 0) {
            this.x = i8;
        }
        H0();
        boolean z = false;
        this.q.a = false;
        Y0();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view)) {
            view = null;
        }
        sx sxVar = this.A;
        if (!sxVar.e || this.x != -1 || this.z != null) {
            sxVar.c();
            sxVar.d = this.u ^ this.v;
            if (!u80Var.g && (i = this.x) != -1) {
                if (i < 0 || i >= u80Var.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    sxVar.b = i10;
                    vx vxVar2 = this.z;
                    if (vxVar2 != null && vxVar2.f >= 0) {
                        boolean z2 = vxVar2.h;
                        sxVar.d = z2;
                        wl wlVar = this.r;
                        if (z2) {
                            sxVar.c = wlVar.g() - this.z.g;
                        } else {
                            sxVar.c = wlVar.k() + this.z.g;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i10);
                        if (q2 == null) {
                            if (v() > 0) {
                                sxVar.d = (this.x < h80.H(u(0))) == this.u;
                            }
                            sxVar.a();
                        } else if (this.r.c(q2) > this.r.l()) {
                            sxVar.a();
                        } else {
                            int e3 = this.r.e(q2) - this.r.k();
                            wl wlVar2 = this.r;
                            if (e3 < 0) {
                                sxVar.c = wlVar2.k();
                                sxVar.d = false;
                            } else if (wlVar2.g() - this.r.b(q2) < 0) {
                                sxVar.c = this.r.g();
                                sxVar.d = true;
                            } else {
                                boolean z3 = sxVar.d;
                                wl wlVar3 = this.r;
                                if (z3) {
                                    int b = wlVar3.b(q2);
                                    wl wlVar4 = this.r;
                                    e = (Integer.MIN_VALUE == wlVar4.a ? 0 : wlVar4.l() - wlVar4.a) + b;
                                } else {
                                    e = wlVar3.e(q2);
                                }
                                sxVar.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.u;
                        sxVar.d = z4;
                        wl wlVar5 = this.r;
                        if (z4) {
                            sxVar.c = wlVar5.g() - this.y;
                        } else {
                            sxVar.c = wlVar5.k() + this.y;
                        }
                    }
                    sxVar.e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    i80 i80Var = (i80) view2.getLayoutParams();
                    if (!i80Var.a.i() && i80Var.a.c() >= 0 && i80Var.a.c() < u80Var.b()) {
                        sxVar.b(view2, h80.H(view2));
                        sxVar.e = true;
                    }
                }
                boolean z5 = this.s;
                boolean z6 = this.v;
                if (z5 == z6 && (O0 = O0(o80Var, u80Var, sxVar.d, z6)) != null) {
                    int H = h80.H(O0);
                    boolean z7 = sxVar.d;
                    wl wlVar6 = sxVar.a;
                    if (z7) {
                        int b2 = wlVar6.b(O0);
                        wl wlVar7 = sxVar.a;
                        sxVar.c = (Integer.MIN_VALUE == wlVar7.a ? 0 : wlVar7.l() - wlVar7.a) + b2;
                    } else {
                        sxVar.c = wlVar6.e(O0);
                    }
                    sxVar.b = H;
                    if (!u80Var.g && A0()) {
                        int e4 = this.r.e(O0);
                        int b3 = this.r.b(O0);
                        int k = this.r.k();
                        int g = this.r.g();
                        boolean z8 = b3 <= k && e4 < k;
                        boolean z9 = e4 >= g && b3 > g;
                        if (z8 || z9) {
                            if (sxVar.d) {
                                k = g;
                            }
                            sxVar.c = k;
                        }
                    }
                    sxVar.e = true;
                }
            }
            sxVar.a();
            sxVar.b = this.v ? u80Var.b() - 1 : 0;
            sxVar.e = true;
        } else if (view != null && (this.r.e(view) >= this.r.g() || this.r.b(view) <= this.r.k())) {
            sxVar.b(view, h80.H(view));
        }
        ux uxVar = this.q;
        uxVar.f = uxVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(u80Var, iArr);
        int k2 = this.r.k() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (u80Var.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i6)) != null) {
            boolean z10 = this.u;
            wl wlVar8 = this.r;
            if (z10) {
                i7 = wlVar8.g() - this.r.b(q);
                e2 = this.y;
            } else {
                e2 = wlVar8.e(q) - this.r.k();
                i7 = this.y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        boolean z11 = sxVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        V0(o80Var, u80Var, sxVar, i9);
        p(o80Var);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = sxVar.d;
        int i12 = sxVar.b;
        if (z13) {
            e1(i12, sxVar.c);
            ux uxVar2 = this.q;
            uxVar2.h = k2;
            I0(o80Var, uxVar2, u80Var, false);
            ux uxVar3 = this.q;
            i3 = uxVar3.b;
            int i13 = uxVar3.d;
            int i14 = uxVar3.c;
            if (i14 > 0) {
                h += i14;
            }
            d1(sxVar.b, sxVar.c);
            ux uxVar4 = this.q;
            uxVar4.h = h;
            uxVar4.d += uxVar4.e;
            I0(o80Var, uxVar4, u80Var, false);
            ux uxVar5 = this.q;
            i2 = uxVar5.b;
            int i15 = uxVar5.c;
            if (i15 > 0) {
                e1(i13, i3);
                ux uxVar6 = this.q;
                uxVar6.h = i15;
                I0(o80Var, uxVar6, u80Var, false);
                i3 = this.q.b;
            }
        } else {
            d1(i12, sxVar.c);
            ux uxVar7 = this.q;
            uxVar7.h = h;
            I0(o80Var, uxVar7, u80Var, false);
            ux uxVar8 = this.q;
            i2 = uxVar8.b;
            int i16 = uxVar8.d;
            int i17 = uxVar8.c;
            if (i17 > 0) {
                k2 += i17;
            }
            e1(sxVar.b, sxVar.c);
            ux uxVar9 = this.q;
            uxVar9.h = k2;
            uxVar9.d += uxVar9.e;
            I0(o80Var, uxVar9, u80Var, false);
            ux uxVar10 = this.q;
            int i18 = uxVar10.b;
            int i19 = uxVar10.c;
            if (i19 > 0) {
                d1(i16, i2);
                ux uxVar11 = this.q;
                uxVar11.h = i19;
                I0(o80Var, uxVar11, u80Var, false);
                i2 = this.q.b;
            }
            i3 = i18;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int P02 = P0(i2, o80Var, u80Var, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                P0 = Q0(i4, o80Var, u80Var, false);
            } else {
                int Q0 = Q0(i3, o80Var, u80Var, true);
                i4 = i3 + Q0;
                i5 = i2 + Q0;
                P0 = P0(i5, o80Var, u80Var, false);
            }
            i3 = i4 + P0;
            i2 = i5 + P0;
        }
        if (u80Var.k && v() != 0 && !u80Var.g && A0()) {
            List list2 = o80Var.d;
            int size = list2.size();
            int H2 = h80.H(u(0));
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size) {
                x80 x80Var = (x80) list2.get(i20);
                boolean i23 = x80Var.i();
                View view3 = x80Var.a;
                if (!i23) {
                    boolean z14 = x80Var.c() < H2 ? true : z;
                    boolean z15 = this.u;
                    wl wlVar9 = this.r;
                    if (z14 != z15) {
                        i21 += wlVar9.c(view3);
                    } else {
                        i22 += wlVar9.c(view3);
                    }
                }
                i20++;
                z = false;
            }
            this.q.k = list2;
            if (i21 > 0) {
                e1(h80.H(S0()), i3);
                ux uxVar12 = this.q;
                uxVar12.h = i21;
                r4 = 0;
                uxVar12.c = 0;
                uxVar12.a(null);
                I0(o80Var, this.q, u80Var, false);
            } else {
                r4 = 0;
            }
            if (i22 > 0) {
                d1(h80.H(R0()), i2);
                ux uxVar13 = this.q;
                uxVar13.h = i22;
                uxVar13.c = r4;
                list = null;
                uxVar13.a(null);
                I0(o80Var, this.q, u80Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (u80Var.g) {
            sxVar.c();
        } else {
            wl wlVar10 = this.r;
            wlVar10.a = wlVar10.l();
        }
        this.s = this.v;
    }

    public final void c1(int i, int i2, boolean z, u80 u80Var) {
        int k;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(u80Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        ux uxVar = this.q;
        int i3 = z2 ? max2 : max;
        uxVar.h = i3;
        if (!z2) {
            max = max2;
        }
        uxVar.i = max;
        if (z2) {
            uxVar.h = this.r.h() + i3;
            View R0 = R0();
            ux uxVar2 = this.q;
            uxVar2.e = this.u ? -1 : 1;
            int H = h80.H(R0);
            ux uxVar3 = this.q;
            uxVar2.d = H + uxVar3.e;
            uxVar3.b = this.r.b(R0);
            k = this.r.b(R0) - this.r.g();
        } else {
            View S0 = S0();
            ux uxVar4 = this.q;
            uxVar4.h = this.r.k() + uxVar4.h;
            ux uxVar5 = this.q;
            uxVar5.e = this.u ? 1 : -1;
            int H2 = h80.H(S0);
            ux uxVar6 = this.q;
            uxVar5.d = H2 + uxVar6.e;
            uxVar6.b = this.r.e(S0);
            k = (-this.r.e(S0)) + this.r.k();
        }
        ux uxVar7 = this.q;
        uxVar7.c = i2;
        if (z) {
            uxVar7.c = i2 - k;
        }
        uxVar7.g = k;
    }

    @Override // defpackage.h80
    public final boolean d() {
        return this.p == 0;
    }

    @Override // defpackage.h80
    public void d0(u80 u80Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        ux uxVar = this.q;
        uxVar.e = this.u ? -1 : 1;
        uxVar.d = i;
        uxVar.f = 1;
        uxVar.b = i2;
        uxVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.h80
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.h80
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof vx) {
            vx vxVar = (vx) parcelable;
            this.z = vxVar;
            if (this.x != -1) {
                vxVar.f = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        ux uxVar = this.q;
        uxVar.d = i;
        uxVar.e = this.u ? 1 : -1;
        uxVar.f = -1;
        uxVar.b = i2;
        uxVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.h80
    public final Parcelable f0() {
        vx vxVar = this.z;
        if (vxVar != null) {
            vx vxVar2 = new vx();
            vxVar2.f = vxVar.f;
            vxVar2.g = vxVar.g;
            vxVar2.h = vxVar.h;
            return vxVar2;
        }
        vx vxVar3 = new vx();
        if (v() <= 0) {
            vxVar3.f = -1;
            return vxVar3;
        }
        H0();
        boolean z = this.s ^ this.u;
        vxVar3.h = z;
        if (z) {
            View R0 = R0();
            vxVar3.g = this.r.g() - this.r.b(R0);
            vxVar3.f = h80.H(R0);
            return vxVar3;
        }
        View S0 = S0();
        vxVar3.f = h80.H(S0);
        vxVar3.g = this.r.e(S0) - this.r.k();
        return vxVar3;
    }

    @Override // defpackage.h80
    public final void h(int i, int i2, u80 u80Var, ac acVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        c1(i > 0 ? 1 : -1, Math.abs(i), true, u80Var);
        C0(u80Var, this.q, acVar);
    }

    @Override // defpackage.h80
    public final void i(int i, ac acVar) {
        boolean z;
        int i2;
        vx vxVar = this.z;
        if (vxVar == null || (i2 = vxVar.f) < 0) {
            Y0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = vxVar.h;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            acVar.b(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.h80
    public final int j(u80 u80Var) {
        return D0(u80Var);
    }

    @Override // defpackage.h80
    public int k(u80 u80Var) {
        return E0(u80Var);
    }

    @Override // defpackage.h80
    public int l(u80 u80Var) {
        return F0(u80Var);
    }

    @Override // defpackage.h80
    public final int m(u80 u80Var) {
        return D0(u80Var);
    }

    @Override // defpackage.h80
    public int n(u80 u80Var) {
        return E0(u80Var);
    }

    @Override // defpackage.h80
    public int n0(int i, o80 o80Var, u80 u80Var) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, o80Var, u80Var);
    }

    @Override // defpackage.h80
    public int o(u80 u80Var) {
        return F0(u80Var);
    }

    @Override // defpackage.h80
    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        vx vxVar = this.z;
        if (vxVar != null) {
            vxVar.f = -1;
        }
        m0();
    }

    @Override // defpackage.h80
    public int p0(int i, o80 o80Var, u80 u80Var) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, o80Var, u80Var);
    }

    @Override // defpackage.h80
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int H = i - h80.H(u(0));
        if (H >= 0 && H < v) {
            View u = u(H);
            if (h80.H(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.h80
    public i80 r() {
        return new i80(-2, -2);
    }

    @Override // defpackage.h80
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

    @Override // defpackage.h80
    public void y0(RecyclerView recyclerView, int i) {
        wx wxVar = new wx(recyclerView.getContext());
        wxVar.a = i;
        z0(wxVar);
    }

    @Override // defpackage.h80
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
        this.A = new sx();
        this.B = new tx();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    public void V0(o80 o80Var, u80 u80Var, sx sxVar, int i) {
    }
}
