package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.d30;
import defpackage.e70;
import defpackage.ez;
import defpackage.fq;
import defpackage.gq;
import defpackage.hh;
import defpackage.hq;
import defpackage.im;
import defpackage.iq;
import defpackage.jq;
import defpackage.jz;
import defpackage.kz;
import defpackage.nz;
import defpackage.t8;
import defpackage.wy;
import defpackage.xy;
import defpackage.yy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class LinearLayoutManager extends xy implements jz {
    public final fq A;
    public final gq B;
    public final int C;
    public final int[] D;
    public int p;
    public hq q;
    public hh r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public iq z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new fq();
        this.B = new gq();
        this.C = 2;
        this.D = new int[2];
        wy I = xy.I(context, attributeSet, i, i2);
        a1(I.a);
        boolean z = I.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        b1(I.d);
    }

    @Override // defpackage.xy
    public boolean A0() {
        return this.z == null && this.s == this.v;
    }

    public void B0(kz kzVar, int[] iArr) {
        int i;
        int l = kzVar.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    public void C0(kz kzVar, hq hqVar, im imVar) {
        int i = hqVar.d;
        if (i < 0 || i >= kzVar.b()) {
            return;
        }
        imVar.a(i, Math.max(0, hqVar.g));
    }

    public final int D0(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        hh hhVar = this.r;
        boolean z = !this.w;
        return e70.f(kzVar, hhVar, K0(z), J0(z), this, this.w);
    }

    public final int E0(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        hh hhVar = this.r;
        boolean z = !this.w;
        return e70.g(kzVar, hhVar, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        hh hhVar = this.r;
        boolean z = !this.w;
        return e70.h(kzVar, hhVar, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && T0()) ? -1 : 1 : (this.p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.q == null) {
            hq hqVar = new hq();
            hqVar.a = true;
            hqVar.h = 0;
            hqVar.i = 0;
            hqVar.k = null;
            this.q = hqVar;
        }
    }

    public final int I0(ez ezVar, hq hqVar, kz kzVar, boolean z) {
        int i;
        int i2 = hqVar.c;
        int i3 = hqVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                hqVar.g = i3 + i2;
            }
            W0(ezVar, hqVar);
        }
        int i4 = hqVar.c + hqVar.h;
        while (true) {
            if ((!hqVar.l && i4 <= 0) || (i = hqVar.d) < 0 || i >= kzVar.b()) {
                break;
            }
            gq gqVar = this.B;
            gqVar.a = 0;
            gqVar.b = false;
            gqVar.c = false;
            gqVar.d = false;
            U0(ezVar, kzVar, hqVar, gqVar);
            if (!gqVar.b) {
                int i5 = hqVar.b;
                int i6 = gqVar.a;
                hqVar.b = (hqVar.f * i6) + i5;
                if (!gqVar.c || hqVar.k != null || !kzVar.g) {
                    hqVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = hqVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    hqVar.g = i8;
                    int i9 = hqVar.c;
                    if (i9 < 0) {
                        hqVar.g = i8 + i9;
                    }
                    W0(ezVar, hqVar);
                }
                if (z && gqVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - hqVar.c;
    }

    public final View J0(boolean z) {
        return this.u ? N0(0, v(), z) : N0(v() - 1, -1, z);
    }

    public final View K0(boolean z) {
        return this.u ? N0(v() - 1, -1, z) : N0(0, v(), z);
    }

    @Override // defpackage.xy
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return xy.H(N0);
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
        return this.p == 0 ? this.c.v(i, i2, i3, i4) : this.d.v(i, i2, i3, i4);
    }

    public final View N0(int i, int i2, boolean z) {
        H0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.v(i, i2, i3, 320) : this.d.v(i, i2, i3, 320);
    }

    public View O0(ez ezVar, kz kzVar, boolean z, boolean z2) {
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
        int b = kzVar.b();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = xy.H(u);
            int e = this.r.e(u);
            int b2 = this.r.b(u);
            if (H >= 0 && H < b) {
                if (!((yy) u.getLayoutParams()).a.i()) {
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

    public final int P0(int i, ez ezVar, kz kzVar, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -Z0(-g2, ezVar, kzVar);
        int i3 = i + i2;
        if (!z || (g = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(g);
        return g + i2;
    }

    public final int Q0(int i, ez ezVar, kz kzVar, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -Z0(k2, ezVar, kzVar);
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

    @Override // defpackage.xy
    public View T(View view, int i, ez ezVar, kz kzVar) {
        int G0;
        Y0();
        if (v() != 0 && (G0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.r.l() * 0.33333334f), false, kzVar);
            hq hqVar = this.q;
            hqVar.g = Integer.MIN_VALUE;
            hqVar.a = false;
            I0(ezVar, hqVar, kzVar, true);
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

    @Override // defpackage.xy
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(N0 == null ? -1 : xy.H(N0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(ez ezVar, kz kzVar, hq hqVar, gq gqVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = hqVar.b(ezVar);
        if (b == null) {
            gqVar.b = true;
            return;
        }
        yy yyVar = (yy) b.getLayoutParams();
        List list = hqVar.k;
        boolean z = this.u;
        int i5 = hqVar.f;
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
        yy yyVar2 = (yy) b.getLayoutParams();
        Rect K = this.b.K(b);
        int i6 = K.left + K.right;
        int i7 = K.top + K.bottom;
        int w = xy.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) yyVar2).leftMargin + ((ViewGroup.MarginLayoutParams) yyVar2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) yyVar2).width);
        int w2 = xy.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) yyVar2).topMargin + ((ViewGroup.MarginLayoutParams) yyVar2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) yyVar2).height);
        if (v0(b, w, w2, yyVar2)) {
            b.measure(w, w2);
        }
        gqVar.a = this.r.c(b);
        if (this.p == 1) {
            if (T0()) {
                i4 = this.n - F();
                i2 = i4 - this.r.d(b);
            } else {
                int E = E();
                i4 = this.r.d(b) + E;
                i2 = E;
            }
            int i8 = hqVar.f;
            i3 = hqVar.b;
            int i9 = gqVar.a;
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
            int i11 = hqVar.f;
            int i12 = hqVar.b;
            int i13 = gqVar.a;
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
        xy.N(b, i2, i3, i4, i);
        if (yyVar.a.i() || yyVar.a.l()) {
            gqVar.c = true;
        }
        gqVar.d = b.hasFocusable();
    }

    public final void W0(ez ezVar, hq hqVar) {
        if (!hqVar.a || hqVar.l) {
            return;
        }
        int i = hqVar.g;
        int i2 = hqVar.i;
        if (hqVar.f == -1) {
            int v = v();
            if (i < 0) {
                return;
            }
            int f = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < v; i3++) {
                    View u = u(i3);
                    if (this.r.e(u) < f || this.r.n(u) < f) {
                        X0(ezVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u2 = u(i5);
                if (this.r.e(u2) < f || this.r.n(u2) < f) {
                    X0(ezVar, i4, i5);
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
                    X0(ezVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u4 = u(i9);
            if (this.r.b(u4) > i6 || this.r.m(u4) > i6) {
                X0(ezVar, i8, i9);
                return;
            }
        }
    }

    public final void X0(ez ezVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u = u(i);
                k0(i);
                ezVar.g(u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u2 = u(i3);
            k0(i3);
            ezVar.g(u2);
        }
    }

    public final void Y0() {
        if (this.p == 1 || !T0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Z0(int i, ez ezVar, kz kzVar) {
        if (v() != 0 && i != 0) {
            H0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            c1(i2, abs, true, kzVar);
            hq hqVar = this.q;
            int I0 = I0(ezVar, hqVar, kzVar, false) + hqVar.g;
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

    @Override // defpackage.jz
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < xy.H(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            t8.k(d30.e("invalid orientation:", i));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            hh a = hh.a(this, i);
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

    @Override // defpackage.xy
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.xy
    public void c0(ez ezVar, kz kzVar) {
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
        if (!(this.z == null && this.x == -1) && kzVar.b() == 0) {
            h0(ezVar);
            return;
        }
        iq iqVar = this.z;
        if (iqVar != null && (i8 = iqVar.f) >= 0) {
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
        fq fqVar = this.A;
        if (!fqVar.e || this.x != -1 || this.z != null) {
            fqVar.c();
            fqVar.d = this.u ^ this.v;
            if (!kzVar.g && (i = this.x) != -1) {
                if (i < 0 || i >= kzVar.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    fqVar.b = i10;
                    iq iqVar2 = this.z;
                    if (iqVar2 != null && iqVar2.f >= 0) {
                        boolean z2 = iqVar2.h;
                        fqVar.d = z2;
                        hh hhVar = this.r;
                        if (z2) {
                            fqVar.c = hhVar.g() - this.z.g;
                        } else {
                            fqVar.c = hhVar.k() + this.z.g;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i10);
                        if (q2 == null) {
                            if (v() > 0) {
                                fqVar.d = (this.x < xy.H(u(0))) == this.u;
                            }
                            fqVar.a();
                        } else if (this.r.c(q2) > this.r.l()) {
                            fqVar.a();
                        } else {
                            int e3 = this.r.e(q2) - this.r.k();
                            hh hhVar2 = this.r;
                            if (e3 < 0) {
                                fqVar.c = hhVar2.k();
                                fqVar.d = false;
                            } else if (hhVar2.g() - this.r.b(q2) < 0) {
                                fqVar.c = this.r.g();
                                fqVar.d = true;
                            } else {
                                boolean z3 = fqVar.d;
                                hh hhVar3 = this.r;
                                if (z3) {
                                    int b = hhVar3.b(q2);
                                    hh hhVar4 = this.r;
                                    e = (Integer.MIN_VALUE == hhVar4.a ? 0 : hhVar4.l() - hhVar4.a) + b;
                                } else {
                                    e = hhVar3.e(q2);
                                }
                                fqVar.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.u;
                        fqVar.d = z4;
                        hh hhVar5 = this.r;
                        if (z4) {
                            fqVar.c = hhVar5.g() - this.y;
                        } else {
                            fqVar.c = hhVar5.k() + this.y;
                        }
                    }
                    fqVar.e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    yy yyVar = (yy) view2.getLayoutParams();
                    if (!yyVar.a.i() && yyVar.a.c() >= 0 && yyVar.a.c() < kzVar.b()) {
                        fqVar.b(view2, xy.H(view2));
                        fqVar.e = true;
                    }
                }
                boolean z5 = this.s;
                boolean z6 = this.v;
                if (z5 == z6 && (O0 = O0(ezVar, kzVar, fqVar.d, z6)) != null) {
                    int H = xy.H(O0);
                    boolean z7 = fqVar.d;
                    hh hhVar6 = fqVar.a;
                    if (z7) {
                        int b2 = hhVar6.b(O0);
                        hh hhVar7 = fqVar.a;
                        fqVar.c = (Integer.MIN_VALUE == hhVar7.a ? 0 : hhVar7.l() - hhVar7.a) + b2;
                    } else {
                        fqVar.c = hhVar6.e(O0);
                    }
                    fqVar.b = H;
                    if (!kzVar.g && A0()) {
                        int e4 = this.r.e(O0);
                        int b3 = this.r.b(O0);
                        int k = this.r.k();
                        int g = this.r.g();
                        boolean z8 = b3 <= k && e4 < k;
                        boolean z9 = e4 >= g && b3 > g;
                        if (z8 || z9) {
                            if (fqVar.d) {
                                k = g;
                            }
                            fqVar.c = k;
                        }
                    }
                    fqVar.e = true;
                }
            }
            fqVar.a();
            fqVar.b = this.v ? kzVar.b() - 1 : 0;
            fqVar.e = true;
        } else if (view != null && (this.r.e(view) >= this.r.g() || this.r.b(view) <= this.r.k())) {
            fqVar.b(view, xy.H(view));
        }
        hq hqVar = this.q;
        hqVar.f = hqVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(kzVar, iArr);
        int k2 = this.r.k() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (kzVar.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i6)) != null) {
            boolean z10 = this.u;
            hh hhVar8 = this.r;
            if (z10) {
                i7 = hhVar8.g() - this.r.b(q);
                e2 = this.y;
            } else {
                e2 = hhVar8.e(q) - this.r.k();
                i7 = this.y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        boolean z11 = fqVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        V0(ezVar, kzVar, fqVar, i9);
        p(ezVar);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = fqVar.d;
        int i12 = fqVar.b;
        if (z13) {
            e1(i12, fqVar.c);
            hq hqVar2 = this.q;
            hqVar2.h = k2;
            I0(ezVar, hqVar2, kzVar, false);
            hq hqVar3 = this.q;
            i3 = hqVar3.b;
            int i13 = hqVar3.d;
            int i14 = hqVar3.c;
            if (i14 > 0) {
                h += i14;
            }
            d1(fqVar.b, fqVar.c);
            hq hqVar4 = this.q;
            hqVar4.h = h;
            hqVar4.d += hqVar4.e;
            I0(ezVar, hqVar4, kzVar, false);
            hq hqVar5 = this.q;
            i2 = hqVar5.b;
            int i15 = hqVar5.c;
            if (i15 > 0) {
                e1(i13, i3);
                hq hqVar6 = this.q;
                hqVar6.h = i15;
                I0(ezVar, hqVar6, kzVar, false);
                i3 = this.q.b;
            }
        } else {
            d1(i12, fqVar.c);
            hq hqVar7 = this.q;
            hqVar7.h = h;
            I0(ezVar, hqVar7, kzVar, false);
            hq hqVar8 = this.q;
            i2 = hqVar8.b;
            int i16 = hqVar8.d;
            int i17 = hqVar8.c;
            if (i17 > 0) {
                k2 += i17;
            }
            e1(fqVar.b, fqVar.c);
            hq hqVar9 = this.q;
            hqVar9.h = k2;
            hqVar9.d += hqVar9.e;
            I0(ezVar, hqVar9, kzVar, false);
            hq hqVar10 = this.q;
            int i18 = hqVar10.b;
            int i19 = hqVar10.c;
            if (i19 > 0) {
                d1(i16, i2);
                hq hqVar11 = this.q;
                hqVar11.h = i19;
                I0(ezVar, hqVar11, kzVar, false);
                i2 = this.q.b;
            }
            i3 = i18;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int P02 = P0(i2, ezVar, kzVar, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                P0 = Q0(i4, ezVar, kzVar, false);
            } else {
                int Q0 = Q0(i3, ezVar, kzVar, true);
                i4 = i3 + Q0;
                i5 = i2 + Q0;
                P0 = P0(i5, ezVar, kzVar, false);
            }
            i3 = i4 + P0;
            i2 = i5 + P0;
        }
        if (kzVar.k && v() != 0 && !kzVar.g && A0()) {
            List list2 = ezVar.d;
            int size = list2.size();
            int H2 = xy.H(u(0));
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size) {
                nz nzVar = (nz) list2.get(i20);
                boolean i23 = nzVar.i();
                View view3 = nzVar.a;
                if (!i23) {
                    boolean z14 = nzVar.c() < H2 ? true : z;
                    boolean z15 = this.u;
                    hh hhVar9 = this.r;
                    if (z14 != z15) {
                        i21 += hhVar9.c(view3);
                    } else {
                        i22 += hhVar9.c(view3);
                    }
                }
                i20++;
                z = false;
            }
            this.q.k = list2;
            if (i21 > 0) {
                e1(xy.H(S0()), i3);
                hq hqVar12 = this.q;
                hqVar12.h = i21;
                r4 = 0;
                hqVar12.c = 0;
                hqVar12.a(null);
                I0(ezVar, this.q, kzVar, false);
            } else {
                r4 = 0;
            }
            if (i22 > 0) {
                d1(xy.H(R0()), i2);
                hq hqVar13 = this.q;
                hqVar13.h = i22;
                hqVar13.c = r4;
                list = null;
                hqVar13.a(null);
                I0(ezVar, this.q, kzVar, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (kzVar.g) {
            fqVar.c();
        } else {
            hh hhVar10 = this.r;
            hhVar10.a = hhVar10.l();
        }
        this.s = this.v;
    }

    public final void c1(int i, int i2, boolean z, kz kzVar) {
        int k;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(kzVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        hq hqVar = this.q;
        int i3 = z2 ? max2 : max;
        hqVar.h = i3;
        if (!z2) {
            max = max2;
        }
        hqVar.i = max;
        if (z2) {
            hqVar.h = this.r.h() + i3;
            View R0 = R0();
            hq hqVar2 = this.q;
            hqVar2.e = this.u ? -1 : 1;
            int H = xy.H(R0);
            hq hqVar3 = this.q;
            hqVar2.d = H + hqVar3.e;
            hqVar3.b = this.r.b(R0);
            k = this.r.b(R0) - this.r.g();
        } else {
            View S0 = S0();
            hq hqVar4 = this.q;
            hqVar4.h = this.r.k() + hqVar4.h;
            hq hqVar5 = this.q;
            hqVar5.e = this.u ? 1 : -1;
            int H2 = xy.H(S0);
            hq hqVar6 = this.q;
            hqVar5.d = H2 + hqVar6.e;
            hqVar6.b = this.r.e(S0);
            k = (-this.r.e(S0)) + this.r.k();
        }
        hq hqVar7 = this.q;
        hqVar7.c = i2;
        if (z) {
            hqVar7.c = i2 - k;
        }
        hqVar7.g = k;
    }

    @Override // defpackage.xy
    public final boolean d() {
        return this.p == 0;
    }

    @Override // defpackage.xy
    public void d0(kz kzVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        hq hqVar = this.q;
        hqVar.e = this.u ? -1 : 1;
        hqVar.d = i;
        hqVar.f = 1;
        hqVar.b = i2;
        hqVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.xy
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.xy
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof iq) {
            iq iqVar = (iq) parcelable;
            this.z = iqVar;
            if (this.x != -1) {
                iqVar.f = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        hq hqVar = this.q;
        hqVar.d = i;
        hqVar.e = this.u ? 1 : -1;
        hqVar.f = -1;
        hqVar.b = i2;
        hqVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.xy
    public final Parcelable f0() {
        iq iqVar = this.z;
        if (iqVar != null) {
            iq iqVar2 = new iq();
            iqVar2.f = iqVar.f;
            iqVar2.g = iqVar.g;
            iqVar2.h = iqVar.h;
            return iqVar2;
        }
        iq iqVar3 = new iq();
        if (v() <= 0) {
            iqVar3.f = -1;
            return iqVar3;
        }
        H0();
        boolean z = this.s ^ this.u;
        iqVar3.h = z;
        if (z) {
            View R0 = R0();
            iqVar3.g = this.r.g() - this.r.b(R0);
            iqVar3.f = xy.H(R0);
            return iqVar3;
        }
        View S0 = S0();
        iqVar3.f = xy.H(S0);
        iqVar3.g = this.r.e(S0) - this.r.k();
        return iqVar3;
    }

    @Override // defpackage.xy
    public final void h(int i, int i2, kz kzVar, im imVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        c1(i > 0 ? 1 : -1, Math.abs(i), true, kzVar);
        C0(kzVar, this.q, imVar);
    }

    @Override // defpackage.xy
    public final void i(int i, im imVar) {
        boolean z;
        int i2;
        iq iqVar = this.z;
        if (iqVar == null || (i2 = iqVar.f) < 0) {
            Y0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = iqVar.h;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            imVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.xy
    public final int j(kz kzVar) {
        return D0(kzVar);
    }

    @Override // defpackage.xy
    public int k(kz kzVar) {
        return E0(kzVar);
    }

    @Override // defpackage.xy
    public int l(kz kzVar) {
        return F0(kzVar);
    }

    @Override // defpackage.xy
    public final int m(kz kzVar) {
        return D0(kzVar);
    }

    @Override // defpackage.xy
    public int n(kz kzVar) {
        return E0(kzVar);
    }

    @Override // defpackage.xy
    public int n0(int i, ez ezVar, kz kzVar) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, ezVar, kzVar);
    }

    @Override // defpackage.xy
    public int o(kz kzVar) {
        return F0(kzVar);
    }

    @Override // defpackage.xy
    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        iq iqVar = this.z;
        if (iqVar != null) {
            iqVar.f = -1;
        }
        m0();
    }

    @Override // defpackage.xy
    public int p0(int i, ez ezVar, kz kzVar) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, ezVar, kzVar);
    }

    @Override // defpackage.xy
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int H = i - xy.H(u(0));
        if (H >= 0 && H < v) {
            View u = u(H);
            if (xy.H(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.xy
    public yy r() {
        return new yy(-2, -2);
    }

    @Override // defpackage.xy
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

    @Override // defpackage.xy
    public void y0(RecyclerView recyclerView, int i) {
        jq jqVar = new jq(recyclerView.getContext());
        jqVar.a = i;
        z0(jqVar);
    }

    @Override // defpackage.xy
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
        this.A = new fq();
        this.B = new gq();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    public void V0(ez ezVar, kz kzVar, fq fqVar, int i) {
    }
}
