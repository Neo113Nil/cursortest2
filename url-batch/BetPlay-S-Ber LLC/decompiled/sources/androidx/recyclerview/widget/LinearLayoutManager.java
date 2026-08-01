package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.c00;
import defpackage.mz;
import defpackage.nz;
import defpackage.o30;
import defpackage.o8;
import defpackage.op;
import defpackage.oz;
import defpackage.sm;
import defpackage.sq;
import defpackage.tq;
import defpackage.tz;
import defpackage.uq;
import defpackage.vq;
import defpackage.wq;
import defpackage.yz;
import defpackage.zg;
import defpackage.zz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends nz implements yz {
    public final sq A;
    public final tq B;
    public final int C;
    public final int[] D;
    public int p;
    public uq q;
    public zg r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public vq z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new sq();
        this.B = new tq();
        this.C = 2;
        this.D = new int[2];
        mz I = nz.I(context, attributeSet, i, i2);
        a1(I.a);
        boolean z = I.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        b1(I.d);
    }

    @Override // defpackage.nz
    public boolean A0() {
        return this.z == null && this.s == this.v;
    }

    public void B0(zz zzVar, int[] iArr) {
        int i;
        int l = zzVar.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    public void C0(zz zzVar, uq uqVar, sm smVar) {
        int i = uqVar.d;
        if (i < 0 || i >= zzVar.b()) {
            return;
        }
        smVar.a(i, Math.max(0, uqVar.g));
    }

    public final int D0(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        zg zgVar = this.r;
        boolean z = !this.w;
        return op.j(zzVar, zgVar, K0(z), J0(z), this, this.w);
    }

    public final int E0(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        zg zgVar = this.r;
        boolean z = !this.w;
        return op.k(zzVar, zgVar, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        H0();
        zg zgVar = this.r;
        boolean z = !this.w;
        return op.l(zzVar, zgVar, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && T0()) ? -1 : 1 : (this.p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.q == null) {
            uq uqVar = new uq();
            uqVar.a = true;
            uqVar.h = 0;
            uqVar.i = 0;
            uqVar.k = null;
            this.q = uqVar;
        }
    }

    public final int I0(tz tzVar, uq uqVar, zz zzVar, boolean z) {
        int i;
        int i2 = uqVar.c;
        int i3 = uqVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                uqVar.g = i3 + i2;
            }
            W0(tzVar, uqVar);
        }
        int i4 = uqVar.c + uqVar.h;
        while (true) {
            if ((!uqVar.l && i4 <= 0) || (i = uqVar.d) < 0 || i >= zzVar.b()) {
                break;
            }
            tq tqVar = this.B;
            tqVar.a = 0;
            tqVar.b = false;
            tqVar.c = false;
            tqVar.d = false;
            U0(tzVar, zzVar, uqVar, tqVar);
            if (!tqVar.b) {
                int i5 = uqVar.b;
                int i6 = tqVar.a;
                uqVar.b = (uqVar.f * i6) + i5;
                if (!tqVar.c || uqVar.k != null || !zzVar.g) {
                    uqVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = uqVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    uqVar.g = i8;
                    int i9 = uqVar.c;
                    if (i9 < 0) {
                        uqVar.g = i8 + i9;
                    }
                    W0(tzVar, uqVar);
                }
                if (z && tqVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - uqVar.c;
    }

    public final View J0(boolean z) {
        return this.u ? N0(0, z, v()) : N0(v() - 1, z, -1);
    }

    public final View K0(boolean z) {
        return this.u ? N0(v() - 1, z, -1) : N0(0, z, v());
    }

    @Override // defpackage.nz
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, false, -1);
        if (N0 == null) {
            return -1;
        }
        return nz.H(N0);
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
        return this.p == 0 ? this.c.t(i, i2, i3, i4) : this.d.t(i, i2, i3, i4);
    }

    public final View N0(int i, boolean z, int i2) {
        H0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.t(i, i2, i3, 320) : this.d.t(i, i2, i3, 320);
    }

    public View O0(tz tzVar, zz zzVar, boolean z, boolean z2) {
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
        int b = zzVar.b();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = nz.H(u);
            int e = this.r.e(u);
            int b2 = this.r.b(u);
            if (H >= 0 && H < b) {
                if (!((oz) u.getLayoutParams()).a.h()) {
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

    public final int P0(int i, tz tzVar, zz zzVar, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -Z0(-g2, tzVar, zzVar);
        int i3 = i + i2;
        if (!z || (g = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(g);
        return g + i2;
    }

    public final int Q0(int i, tz tzVar, zz zzVar, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -Z0(k2, tzVar, zzVar);
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

    @Override // defpackage.nz
    public View T(View view, int i, tz tzVar, zz zzVar) {
        int G0;
        Y0();
        if (v() != 0 && (G0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.r.l() * 0.33333334f), false, zzVar);
            uq uqVar = this.q;
            uqVar.g = Integer.MIN_VALUE;
            uqVar.a = false;
            I0(tzVar, uqVar, zzVar, true);
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

    @Override // defpackage.nz
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, false, v());
            accessibilityEvent.setFromIndex(N0 == null ? -1 : nz.H(N0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(tz tzVar, zz zzVar, uq uqVar, tq tqVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = uqVar.b(tzVar);
        if (b == null) {
            tqVar.b = true;
            return;
        }
        oz ozVar = (oz) b.getLayoutParams();
        List list = uqVar.k;
        boolean z = this.u;
        int i5 = uqVar.f;
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
        oz ozVar2 = (oz) b.getLayoutParams();
        Rect J = this.b.J(b);
        int i6 = J.left + J.right;
        int i7 = J.top + J.bottom;
        int w = nz.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) ozVar2).leftMargin + ((ViewGroup.MarginLayoutParams) ozVar2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) ozVar2).width);
        int w2 = nz.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) ozVar2).topMargin + ((ViewGroup.MarginLayoutParams) ozVar2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) ozVar2).height);
        if (v0(b, w, w2, ozVar2)) {
            b.measure(w, w2);
        }
        tqVar.a = this.r.c(b);
        if (this.p == 1) {
            if (T0()) {
                i4 = this.n - F();
                i2 = i4 - this.r.d(b);
            } else {
                int E = E();
                i4 = this.r.d(b) + E;
                i2 = E;
            }
            int i8 = uqVar.f;
            i3 = uqVar.b;
            int i9 = tqVar.a;
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
            int i11 = uqVar.f;
            int i12 = uqVar.b;
            int i13 = tqVar.a;
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
        nz.N(b, i2, i3, i4, i);
        if (ozVar.a.h() || ozVar.a.k()) {
            tqVar.c = true;
        }
        tqVar.d = b.hasFocusable();
    }

    public final void W0(tz tzVar, uq uqVar) {
        if (!uqVar.a || uqVar.l) {
            return;
        }
        int i = uqVar.g;
        int i2 = uqVar.i;
        if (uqVar.f == -1) {
            int v = v();
            if (i < 0) {
                return;
            }
            int f = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < v; i3++) {
                    View u = u(i3);
                    if (this.r.e(u) < f || this.r.n(u) < f) {
                        X0(tzVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u2 = u(i5);
                if (this.r.e(u2) < f || this.r.n(u2) < f) {
                    X0(tzVar, i4, i5);
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
                    X0(tzVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u4 = u(i9);
            if (this.r.b(u4) > i6 || this.r.m(u4) > i6) {
                X0(tzVar, i8, i9);
                return;
            }
        }
    }

    public final void X0(tz tzVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u = u(i);
                k0(i);
                tzVar.g(u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u2 = u(i3);
            k0(i3);
            tzVar.g(u2);
        }
    }

    public final void Y0() {
        if (this.p == 1 || !T0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Z0(int i, tz tzVar, zz zzVar) {
        if (v() != 0 && i != 0) {
            H0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            c1(i2, abs, true, zzVar);
            uq uqVar = this.q;
            int I0 = I0(tzVar, uqVar, zzVar, false) + uqVar.g;
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

    @Override // defpackage.yz
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < nz.H(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            o8.j(o30.e("invalid orientation:", i));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            zg a = zg.a(this, i);
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

    @Override // defpackage.nz
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.nz
    public void c0(tz tzVar, zz zzVar) {
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
        if (!(this.z == null && this.x == -1) && zzVar.b() == 0) {
            h0(tzVar);
            return;
        }
        vq vqVar = this.z;
        if (vqVar != null && (i8 = vqVar.f) >= 0) {
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
        sq sqVar = this.A;
        if (!sqVar.e || this.x != -1 || this.z != null) {
            sqVar.c();
            sqVar.d = this.u ^ this.v;
            if (!zzVar.g && (i = this.x) != -1) {
                if (i < 0 || i >= zzVar.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    sqVar.b = i10;
                    vq vqVar2 = this.z;
                    if (vqVar2 != null && vqVar2.f >= 0) {
                        boolean z2 = vqVar2.h;
                        sqVar.d = z2;
                        zg zgVar = this.r;
                        if (z2) {
                            sqVar.c = zgVar.g() - this.z.g;
                        } else {
                            sqVar.c = zgVar.k() + this.z.g;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i10);
                        if (q2 == null) {
                            if (v() > 0) {
                                sqVar.d = (this.x < nz.H(u(0))) == this.u;
                            }
                            sqVar.a();
                        } else if (this.r.c(q2) > this.r.l()) {
                            sqVar.a();
                        } else {
                            int e3 = this.r.e(q2) - this.r.k();
                            zg zgVar2 = this.r;
                            if (e3 < 0) {
                                sqVar.c = zgVar2.k();
                                sqVar.d = false;
                            } else if (zgVar2.g() - this.r.b(q2) < 0) {
                                sqVar.c = this.r.g();
                                sqVar.d = true;
                            } else {
                                boolean z3 = sqVar.d;
                                zg zgVar3 = this.r;
                                if (z3) {
                                    int b = zgVar3.b(q2);
                                    zg zgVar4 = this.r;
                                    e = (Integer.MIN_VALUE == zgVar4.a ? 0 : zgVar4.l() - zgVar4.a) + b;
                                } else {
                                    e = zgVar3.e(q2);
                                }
                                sqVar.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.u;
                        sqVar.d = z4;
                        zg zgVar5 = this.r;
                        if (z4) {
                            sqVar.c = zgVar5.g() - this.y;
                        } else {
                            sqVar.c = zgVar5.k() + this.y;
                        }
                    }
                    sqVar.e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    oz ozVar = (oz) view2.getLayoutParams();
                    if (!ozVar.a.h() && ozVar.a.b() >= 0 && ozVar.a.b() < zzVar.b()) {
                        sqVar.b(view2, nz.H(view2));
                        sqVar.e = true;
                    }
                }
                boolean z5 = this.s;
                boolean z6 = this.v;
                if (z5 == z6 && (O0 = O0(tzVar, zzVar, sqVar.d, z6)) != null) {
                    int H = nz.H(O0);
                    boolean z7 = sqVar.d;
                    zg zgVar6 = sqVar.a;
                    if (z7) {
                        int b2 = zgVar6.b(O0);
                        zg zgVar7 = sqVar.a;
                        sqVar.c = (Integer.MIN_VALUE == zgVar7.a ? 0 : zgVar7.l() - zgVar7.a) + b2;
                    } else {
                        sqVar.c = zgVar6.e(O0);
                    }
                    sqVar.b = H;
                    if (!zzVar.g && A0()) {
                        int e4 = this.r.e(O0);
                        int b3 = this.r.b(O0);
                        int k = this.r.k();
                        int g = this.r.g();
                        boolean z8 = b3 <= k && e4 < k;
                        boolean z9 = e4 >= g && b3 > g;
                        if (z8 || z9) {
                            if (sqVar.d) {
                                k = g;
                            }
                            sqVar.c = k;
                        }
                    }
                    sqVar.e = true;
                }
            }
            sqVar.a();
            sqVar.b = this.v ? zzVar.b() - 1 : 0;
            sqVar.e = true;
        } else if (view != null && (this.r.e(view) >= this.r.g() || this.r.b(view) <= this.r.k())) {
            sqVar.b(view, nz.H(view));
        }
        uq uqVar = this.q;
        uqVar.f = uqVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(zzVar, iArr);
        int k2 = this.r.k() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (zzVar.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i6)) != null) {
            boolean z10 = this.u;
            zg zgVar8 = this.r;
            if (z10) {
                i7 = zgVar8.g() - this.r.b(q);
                e2 = this.y;
            } else {
                e2 = zgVar8.e(q) - this.r.k();
                i7 = this.y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        boolean z11 = sqVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        V0(tzVar, zzVar, sqVar, i9);
        p(tzVar);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = sqVar.d;
        int i12 = sqVar.b;
        if (z13) {
            e1(i12, sqVar.c);
            uq uqVar2 = this.q;
            uqVar2.h = k2;
            I0(tzVar, uqVar2, zzVar, false);
            uq uqVar3 = this.q;
            i3 = uqVar3.b;
            int i13 = uqVar3.d;
            int i14 = uqVar3.c;
            if (i14 > 0) {
                h += i14;
            }
            d1(sqVar.b, sqVar.c);
            uq uqVar4 = this.q;
            uqVar4.h = h;
            uqVar4.d += uqVar4.e;
            I0(tzVar, uqVar4, zzVar, false);
            uq uqVar5 = this.q;
            i2 = uqVar5.b;
            int i15 = uqVar5.c;
            if (i15 > 0) {
                e1(i13, i3);
                uq uqVar6 = this.q;
                uqVar6.h = i15;
                I0(tzVar, uqVar6, zzVar, false);
                i3 = this.q.b;
            }
        } else {
            d1(i12, sqVar.c);
            uq uqVar7 = this.q;
            uqVar7.h = h;
            I0(tzVar, uqVar7, zzVar, false);
            uq uqVar8 = this.q;
            i2 = uqVar8.b;
            int i16 = uqVar8.d;
            int i17 = uqVar8.c;
            if (i17 > 0) {
                k2 += i17;
            }
            e1(sqVar.b, sqVar.c);
            uq uqVar9 = this.q;
            uqVar9.h = k2;
            uqVar9.d += uqVar9.e;
            I0(tzVar, uqVar9, zzVar, false);
            uq uqVar10 = this.q;
            int i18 = uqVar10.b;
            int i19 = uqVar10.c;
            if (i19 > 0) {
                d1(i16, i2);
                uq uqVar11 = this.q;
                uqVar11.h = i19;
                I0(tzVar, uqVar11, zzVar, false);
                i2 = this.q.b;
            }
            i3 = i18;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int P02 = P0(i2, tzVar, zzVar, true);
                i4 = i3 + P02;
                i5 = i2 + P02;
                P0 = Q0(i4, tzVar, zzVar, false);
            } else {
                int Q0 = Q0(i3, tzVar, zzVar, true);
                i4 = i3 + Q0;
                i5 = i2 + Q0;
                P0 = P0(i5, tzVar, zzVar, false);
            }
            i3 = i4 + P0;
            i2 = i5 + P0;
        }
        if (zzVar.k && v() != 0 && !zzVar.g && A0()) {
            List list2 = tzVar.d;
            int size = list2.size();
            int H2 = nz.H(u(0));
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size) {
                c00 c00Var = (c00) list2.get(i20);
                boolean h2 = c00Var.h();
                View view3 = c00Var.a;
                if (!h2) {
                    boolean z14 = c00Var.b() < H2 ? true : z;
                    boolean z15 = this.u;
                    zg zgVar9 = this.r;
                    if (z14 != z15) {
                        i21 += zgVar9.c(view3);
                    } else {
                        i22 += zgVar9.c(view3);
                    }
                }
                i20++;
                z = false;
            }
            this.q.k = list2;
            if (i21 > 0) {
                e1(nz.H(S0()), i3);
                uq uqVar12 = this.q;
                uqVar12.h = i21;
                r4 = 0;
                uqVar12.c = 0;
                uqVar12.a(null);
                I0(tzVar, this.q, zzVar, false);
            } else {
                r4 = 0;
            }
            if (i22 > 0) {
                d1(nz.H(R0()), i2);
                uq uqVar13 = this.q;
                uqVar13.h = i22;
                uqVar13.c = r4;
                list = null;
                uqVar13.a(null);
                I0(tzVar, this.q, zzVar, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (zzVar.g) {
            sqVar.c();
        } else {
            zg zgVar10 = this.r;
            zgVar10.a = zgVar10.l();
        }
        this.s = this.v;
    }

    public final void c1(int i, int i2, boolean z, zz zzVar) {
        int k;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(zzVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        uq uqVar = this.q;
        int i3 = z2 ? max2 : max;
        uqVar.h = i3;
        if (!z2) {
            max = max2;
        }
        uqVar.i = max;
        if (z2) {
            uqVar.h = this.r.h() + i3;
            View R0 = R0();
            uq uqVar2 = this.q;
            uqVar2.e = this.u ? -1 : 1;
            int H = nz.H(R0);
            uq uqVar3 = this.q;
            uqVar2.d = H + uqVar3.e;
            uqVar3.b = this.r.b(R0);
            k = this.r.b(R0) - this.r.g();
        } else {
            View S0 = S0();
            uq uqVar4 = this.q;
            uqVar4.h = this.r.k() + uqVar4.h;
            uq uqVar5 = this.q;
            uqVar5.e = this.u ? 1 : -1;
            int H2 = nz.H(S0);
            uq uqVar6 = this.q;
            uqVar5.d = H2 + uqVar6.e;
            uqVar6.b = this.r.e(S0);
            k = (-this.r.e(S0)) + this.r.k();
        }
        uq uqVar7 = this.q;
        uqVar7.c = i2;
        if (z) {
            uqVar7.c = i2 - k;
        }
        uqVar7.g = k;
    }

    @Override // defpackage.nz
    public final boolean d() {
        return this.p == 0;
    }

    @Override // defpackage.nz
    public void d0(zz zzVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        uq uqVar = this.q;
        uqVar.e = this.u ? -1 : 1;
        uqVar.d = i;
        uqVar.f = 1;
        uqVar.b = i2;
        uqVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.nz
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.nz
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof vq) {
            vq vqVar = (vq) parcelable;
            this.z = vqVar;
            if (this.x != -1) {
                vqVar.f = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        uq uqVar = this.q;
        uqVar.d = i;
        uqVar.e = this.u ? 1 : -1;
        uqVar.f = -1;
        uqVar.b = i2;
        uqVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.nz
    public final Parcelable f0() {
        vq vqVar = this.z;
        if (vqVar != null) {
            vq vqVar2 = new vq();
            vqVar2.f = vqVar.f;
            vqVar2.g = vqVar.g;
            vqVar2.h = vqVar.h;
            return vqVar2;
        }
        vq vqVar3 = new vq();
        if (v() <= 0) {
            vqVar3.f = -1;
            return vqVar3;
        }
        H0();
        boolean z = this.s ^ this.u;
        vqVar3.h = z;
        if (z) {
            View R0 = R0();
            vqVar3.g = this.r.g() - this.r.b(R0);
            vqVar3.f = nz.H(R0);
            return vqVar3;
        }
        View S0 = S0();
        vqVar3.f = nz.H(S0);
        vqVar3.g = this.r.e(S0) - this.r.k();
        return vqVar3;
    }

    @Override // defpackage.nz
    public final void h(int i, int i2, zz zzVar, sm smVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        c1(i > 0 ? 1 : -1, Math.abs(i), true, zzVar);
        C0(zzVar, this.q, smVar);
    }

    @Override // defpackage.nz
    public final void i(int i, sm smVar) {
        boolean z;
        int i2;
        vq vqVar = this.z;
        if (vqVar == null || (i2 = vqVar.f) < 0) {
            Y0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = vqVar.h;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            smVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.nz
    public final int j(zz zzVar) {
        return D0(zzVar);
    }

    @Override // defpackage.nz
    public int k(zz zzVar) {
        return E0(zzVar);
    }

    @Override // defpackage.nz
    public int l(zz zzVar) {
        return F0(zzVar);
    }

    @Override // defpackage.nz
    public final int m(zz zzVar) {
        return D0(zzVar);
    }

    @Override // defpackage.nz
    public int n(zz zzVar) {
        return E0(zzVar);
    }

    @Override // defpackage.nz
    public int n0(int i, tz tzVar, zz zzVar) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, tzVar, zzVar);
    }

    @Override // defpackage.nz
    public int o(zz zzVar) {
        return F0(zzVar);
    }

    @Override // defpackage.nz
    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        vq vqVar = this.z;
        if (vqVar != null) {
            vqVar.f = -1;
        }
        m0();
    }

    @Override // defpackage.nz
    public int p0(int i, tz tzVar, zz zzVar) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, tzVar, zzVar);
    }

    @Override // defpackage.nz
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int H = i - nz.H(u(0));
        if (H >= 0 && H < v) {
            View u = u(H);
            if (nz.H(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.nz
    public oz r() {
        return new oz(-2, -2);
    }

    @Override // defpackage.nz
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

    @Override // defpackage.nz
    public void y0(RecyclerView recyclerView, int i) {
        wq wqVar = new wq(recyclerView.getContext());
        wqVar.a = i;
        z0(wqVar);
    }

    @Override // defpackage.nz
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
        this.A = new sq();
        this.B = new tq();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    public void V0(tz tzVar, zz zzVar, sq sqVar, int i) {
    }
}
