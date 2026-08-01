package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.e70;
import defpackage.ez;
import defpackage.hh;
import defpackage.im;
import defpackage.ir;
import defpackage.jq;
import defpackage.jz;
import defpackage.kz;
import defpackage.n30;
import defpackage.o30;
import defpackage.p30;
import defpackage.pp;
import defpackage.q30;
import defpackage.q4;
import defpackage.t8;
import defpackage.wy;
import defpackage.x80;
import defpackage.xy;
import defpackage.yy;
import defpackage.z6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends xy implements jz {
    public int A;
    public final q4 B;
    public final int C;
    public boolean D;
    public boolean E;
    public q30 F;
    public int G;
    public final Rect H;
    public final n30 I;
    public boolean J;
    public final boolean K;
    public int[] L;
    public final z6 M;
    public int p;
    public ir[] q;
    public final hh r;
    public final hh s;
    public final int t;
    public int u;
    public final pp v;
    public boolean w;
    public boolean x;
    public BitSet y;
    public int z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new q4(25, false);
        this.C = 2;
        this.H = new Rect();
        this.I = new n30(this);
        this.J = false;
        this.K = true;
        this.M = new z6(8, this);
        wy I = xy.I(context, attributeSet, i, i2);
        int i3 = I.a;
        if (i3 != 0 && i3 != 1) {
            t8.k("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            hh hhVar = this.r;
            this.r = this.s;
            this.s = hhVar;
            m0();
        }
        Z0(I.b);
        boolean z = I.c;
        c(null);
        q30 q30Var = this.F;
        if (q30Var != null && q30Var.m != z) {
            q30Var.m = z;
        }
        this.w = z;
        m0();
        this.v = new pp();
        this.r = hh.a(this, this.t);
        this.s = hh.a(this, 1 - this.t);
    }

    public static int d1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.xy
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int I0;
        int J0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                I0 = J0();
                J0 = I0();
            } else {
                I0 = I0();
                J0 = J0();
            }
            q4 q4Var = this.B;
            if (I0 == 0 && N0() != null) {
                q4Var.d();
                this.f = true;
                m0();
                return true;
            }
            if (this.J) {
                int i = this.x ? -1 : 1;
                int i2 = J0 + 1;
                p30 x = q4Var.x(I0, i2, i);
                if (x == null) {
                    this.J = false;
                    q4Var.w(i2);
                    return false;
                }
                p30 x2 = q4Var.x(I0, x.f, i * (-1));
                if (x2 == null) {
                    q4Var.w(x.f);
                } else {
                    q4Var.w(x2.f + 1);
                }
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return e70.g(kzVar, this.r, F0(z), E0(z), this, this.K, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x035b, code lost:
    
        T0(r1, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D0(ez ezVar, pp ppVar, kz kzVar) {
        int i;
        ir irVar;
        pp ppVar2;
        int i2;
        int i3;
        int L0;
        int c;
        int i4;
        int i5;
        boolean O0;
        hh hhVar;
        int k;
        int c2;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        ez ezVar2 = ezVar;
        int i9 = 0;
        int i10 = 1;
        this.y.set(0, this.p, true);
        pp ppVar3 = this.v;
        int i11 = ppVar3.i ? ppVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : ppVar.e == 1 ? ppVar.g + ppVar.b : ppVar.f - ppVar.b;
        a1(ppVar.e, i11);
        boolean z4 = this.x;
        hh hhVar2 = this.r;
        int g = z4 ? hhVar2.g() : hhVar2.k();
        boolean z5 = false;
        while (true) {
            int i12 = ppVar.c;
            if (i12 < 0 || i12 >= kzVar.b() || (!ppVar3.i && this.y.isEmpty())) {
                break;
            }
            View d = ezVar2.d(ppVar.c);
            ppVar.c += ppVar.d;
            o30 o30Var = (o30) d.getLayoutParams();
            int c3 = o30Var.a.c();
            q4 q4Var = this.B;
            int[] iArr = (int[]) q4Var.g;
            int i13 = (iArr == null || c3 >= iArr.length) ? -1 : iArr[c3];
            int i14 = i13 == -1 ? i10 : i9;
            if (i14 != 0) {
                if (o30Var.f) {
                    irVar = this.q[i9];
                    i = i14;
                } else {
                    boolean R0 = R0(ppVar.e);
                    int i15 = this.p;
                    if (R0) {
                        i8 = i15 - 1;
                        i15 = -1;
                        i7 = -1;
                    } else {
                        i7 = i10;
                        i8 = 0;
                    }
                    ir irVar2 = null;
                    if (ppVar.e == i10) {
                        int k2 = hhVar2.k();
                        int i16 = Integer.MAX_VALUE;
                        while (i8 != i15) {
                            int i17 = i8;
                            ir irVar3 = this.q[i17];
                            int i18 = i14;
                            int i19 = irVar3.i(k2);
                            if (i19 < i16) {
                                irVar2 = irVar3;
                                i16 = i19;
                            }
                            i8 = i17 + i7;
                            i14 = i18;
                        }
                        i = i14;
                    } else {
                        i = i14;
                        int g2 = hhVar2.g();
                        int i20 = Integer.MIN_VALUE;
                        while (i8 != i15) {
                            ir irVar4 = this.q[i8];
                            int i21 = i15;
                            int k3 = irVar4.k(g2);
                            if (k3 > i20) {
                                i20 = k3;
                                irVar2 = irVar4;
                            }
                            i8 += i7;
                            i15 = i21;
                        }
                    }
                    irVar = irVar2;
                }
                q4Var.u(c3);
                ((int[]) q4Var.g)[c3] = irVar.e;
            } else {
                i = i14;
                irVar = this.q[i13];
            }
            o30Var.e = irVar;
            if (ppVar.e == 1) {
                b(d, -1, false);
            } else {
                b(d, 0, false);
            }
            boolean z6 = o30Var.f;
            int i22 = this.t;
            if (!z6) {
                ppVar2 = ppVar3;
                i2 = i11;
                i3 = 1;
                if (i22 == 1) {
                    P0(d, xy.w(false, this.u, this.l, 0, ((ViewGroup.MarginLayoutParams) o30Var).width), xy.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) o30Var).height));
                } else {
                    P0(d, xy.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) o30Var).width), xy.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) o30Var).height));
                }
            } else if (i22 == 1) {
                i2 = i11;
                ppVar2 = ppVar3;
                i3 = 1;
                P0(d, this.G, xy.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) o30Var).height));
            } else {
                ppVar2 = ppVar3;
                i2 = i11;
                i3 = 1;
                P0(d, xy.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) o30Var).width), this.G);
            }
            int i23 = ppVar.e;
            boolean z7 = o30Var.f;
            if (i23 == i3) {
                c = z7 ? K0(g) : irVar.i(g);
                L0 = hhVar2.c(d) + c;
                if (i != 0 && o30Var.f) {
                    p30 p30Var = new p30();
                    p30Var.h = new int[this.p];
                    for (int i24 = 0; i24 < this.p; i24++) {
                        p30Var.h[i24] = c - this.q[i24].i(c);
                    }
                    p30Var.g = -1;
                    p30Var.f = c3;
                    q4Var.a(p30Var);
                }
            } else {
                L0 = z7 ? L0(g) : irVar.k(g);
                c = L0 - hhVar2.c(d);
                if (i != 0 && o30Var.f) {
                    p30 p30Var2 = new p30();
                    p30Var2.h = new int[this.p];
                    for (int i25 = 0; i25 < this.p; i25++) {
                        p30Var2.h[i25] = this.q[i25].k(L0) - L0;
                    }
                    p30Var2.g = 1;
                    p30Var2.f = c3;
                    q4Var.a(p30Var2);
                }
            }
            if (!o30Var.f || ppVar.d != -1) {
                i4 = 1;
            } else if (i != 0) {
                this.J = true;
                i4 = 1;
            } else {
                int i26 = ppVar.e;
                ir[] irVarArr = this.q;
                if (i26 != 1) {
                    int k4 = irVarArr[0].k(Integer.MIN_VALUE);
                    int i27 = 1;
                    while (true) {
                        if (i27 >= this.p) {
                            z3 = true;
                            break;
                        }
                        if (this.q[i27].k(Integer.MIN_VALUE) != k4) {
                            z3 = false;
                            break;
                        }
                        i27++;
                    }
                } else {
                    int i28 = irVarArr[0].i(Integer.MIN_VALUE);
                    int i29 = 1;
                    while (true) {
                        if (i29 >= this.p) {
                            z3 = true;
                            break;
                        }
                        if (this.q[i29].i(Integer.MIN_VALUE) != i28) {
                            z3 = false;
                            break;
                        }
                        i29++;
                    }
                }
                i4 = 1;
                if (!z3) {
                    p30 y = q4Var.y(c3);
                    if (y != null) {
                        y.i = true;
                    }
                    this.J = true;
                }
                i5 = ppVar.e;
                boolean z8 = o30Var.f;
                if (i5 != i4) {
                    if (z8) {
                        for (int i30 = this.p - i4; i30 >= 0; i30--) {
                            this.q[i30].a(d);
                        }
                    } else {
                        o30Var.e.a(d);
                    }
                } else if (z8) {
                    for (int i31 = this.p - 1; i31 >= 0; i31--) {
                        this.q[i31].n(d);
                    }
                } else {
                    o30Var.e.n(d);
                }
                O0 = O0();
                hhVar = this.s;
                if (O0 || i22 != 1) {
                    k = !o30Var.f ? hhVar.k() : hhVar.k() + (irVar.e * this.u);
                    c2 = hhVar.c(d) + k;
                } else {
                    c2 = o30Var.f ? hhVar.g() : hhVar.g() - (((this.p - 1) - irVar.e) * this.u);
                    k = c2 - hhVar.c(d);
                }
                if (i22 != 1) {
                    xy.N(d, k, c, c2, L0);
                } else {
                    xy.N(d, c, k, L0, c2);
                }
                z = o30Var.f;
                ppVar3 = ppVar2;
                int i32 = ppVar3.e;
                if (z) {
                    i6 = i2;
                    c1(irVar, i32, i6);
                } else {
                    i6 = i2;
                    a1(i32, i6);
                }
                ezVar2 = ezVar;
                T0(ezVar2, ppVar3);
                if (ppVar3.h && d.hasFocusable()) {
                    z2 = o30Var.f;
                    BitSet bitSet = this.y;
                    if (z2) {
                        bitSet.set(irVar.e, false);
                    } else {
                        bitSet.clear();
                    }
                }
                i10 = 1;
                z5 = true;
                i11 = i6;
                i9 = 0;
            }
            i5 = ppVar.e;
            boolean z82 = o30Var.f;
            if (i5 != i4) {
            }
            O0 = O0();
            hhVar = this.s;
            if (O0) {
            }
            if (!o30Var.f) {
            }
            c2 = hhVar.c(d) + k;
            if (i22 != 1) {
            }
            z = o30Var.f;
            ppVar3 = ppVar2;
            int i322 = ppVar3.e;
            if (z) {
            }
            ezVar2 = ezVar;
            T0(ezVar2, ppVar3);
            if (ppVar3.h) {
                z2 = o30Var.f;
                BitSet bitSet2 = this.y;
                if (z2) {
                }
            }
            i10 = 1;
            z5 = true;
            i11 = i6;
            i9 = 0;
        }
        int k5 = ppVar3.e == -1 ? hhVar2.k() - L0(hhVar2.k()) : K0(hhVar2.g()) - hhVar2.g();
        if (k5 > 0) {
            return Math.min(ppVar.b, k5);
        }
        return 0;
    }

    public final View E0(boolean z) {
        hh hhVar = this.r;
        int k = hhVar.k();
        int g = hhVar.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = hhVar.e(u);
            int b = hhVar.b(u);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return u;
                }
                if (view == null) {
                    view = u;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z) {
        hh hhVar = this.r;
        int k = hhVar.k();
        int g = hhVar.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = hhVar.e(u);
            if (hhVar.b(u) > k && e < g) {
                if (e >= k || !z) {
                    return u;
                }
                if (view == null) {
                    view = u;
                }
            }
        }
        return view;
    }

    public final void G0(ez ezVar, kz kzVar, boolean z) {
        int g;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g = this.r.g() - K0) > 0) {
            int i = g - (-X0(-g, ezVar, kzVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void H0(ez ezVar, kz kzVar, boolean z) {
        int k;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k = L0 - this.r.k()) > 0) {
            int X0 = k - X0(k, ezVar, kzVar);
            if (!z || X0 <= 0) {
                return;
            }
            this.r.o(-X0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return xy.H(u(0));
    }

    public final int J0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return xy.H(u(v - 1));
    }

    public final int K0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // defpackage.xy
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i) {
        int k = this.q[0].k(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int k2 = this.q[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(int i, int i2, int i3) {
        int i4;
        int i5;
        int J0 = this.x ? J0() : I0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                q4 q4Var = this.B;
                q4Var.B(i5);
                if (i3 != 1) {
                    q4Var.F(i, i2);
                } else if (i3 == 2) {
                    q4Var.G(i, i2);
                } else if (i3 == 8) {
                    q4Var.G(i, 1);
                    q4Var.F(i2, 1);
                }
                if (i4 > J0) {
                    return;
                }
                if (i5 <= (this.x ? I0() : J0())) {
                    m0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        q4 q4Var2 = this.B;
        q4Var2.B(i5);
        if (i3 != 1) {
        }
        if (i4 > J0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        if (r11 == r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d1, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cd, code lost:
    
        if (r11 == r10) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View N0() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int v = v();
        int i2 = v - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        char c = (this.t == 1 && O0()) ? (char) 1 : (char) 65535;
        if (this.x) {
            v = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < v ? 1 : -1;
        while (i2 != v) {
            View u = u(i2);
            o30 o30Var = (o30) u.getLayoutParams();
            boolean z4 = bitSet.get(o30Var.e.e);
            hh hhVar = this.r;
            if (z4) {
                ir irVar = o30Var.e;
                if (this.x) {
                    int i4 = irVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        irVar.b();
                        i4 = irVar.c;
                    }
                    if (i4 < hhVar.g()) {
                        ArrayList arrayList = (ArrayList) irVar.f;
                        z2 = ((o30) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).f;
                        z3 = !z2;
                    }
                    z3 = false;
                } else {
                    int i5 = irVar.b;
                    if (i5 == Integer.MIN_VALUE) {
                        irVar.c();
                        i5 = irVar.b;
                    }
                    if (i5 > hhVar.k()) {
                        z2 = ((o30) ((View) ((ArrayList) irVar.f).get(0)).getLayoutParams()).f;
                        z3 = !z2;
                    }
                    z3 = false;
                }
                if (z3) {
                    return u;
                }
                bitSet.clear(o30Var.e.e);
            }
            if (!o30Var.f && (i = i2 + i3) != v) {
                View u2 = u(i);
                if (this.x) {
                    int b = hhVar.b(u);
                    int b2 = hhVar.b(u2);
                    if (b < b2) {
                        return u;
                    }
                } else {
                    int e = hhVar.e(u);
                    int e2 = hhVar.e(u2);
                    if (e > e2) {
                        return u;
                    }
                }
                if (z) {
                    if ((o30Var.e.e - ((o30) u2.getLayoutParams()).e.e < 0) != (c < 0)) {
                        return u;
                    }
                } else {
                    continue;
                }
            }
            i2 += i3;
        }
        return null;
    }

    @Override // defpackage.xy
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            ir irVar = this.q[i2];
            int i3 = irVar.b;
            if (i3 != Integer.MIN_VALUE) {
                irVar.b = i3 + i;
            }
            int i4 = irVar.c;
            if (i4 != Integer.MIN_VALUE) {
                irVar.c = i4 + i;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // defpackage.xy
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            ir irVar = this.q[i2];
            int i3 = irVar.b;
            if (i3 != Integer.MIN_VALUE) {
                irVar.b = i3 + i;
            }
            int i4 = irVar.c;
            if (i4 != Integer.MIN_VALUE) {
                irVar.c = i4 + i;
            }
        }
    }

    public final void P0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.H;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.K(view));
        }
        o30 o30Var = (o30) view.getLayoutParams();
        int d1 = d1(i, ((ViewGroup.MarginLayoutParams) o30Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) o30Var).rightMargin + rect.right);
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) o30Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) o30Var).bottomMargin + rect.bottom);
        if (v0(view, d1, d12, o30Var)) {
            view.measure(d1, d12);
        }
    }

    @Override // defpackage.xy
    public final void Q() {
        this.B.d();
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0190, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        if ((r11 < I0()) != r16.x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x03fe, code lost:
    
        if (B0() != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017e, code lost:
    
        if (r16.x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018e, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(ez ezVar, kz kzVar, boolean z) {
        q30 q30Var;
        ir[] irVarArr;
        int i;
        int i2;
        boolean z2;
        q30 q30Var2 = this.F;
        n30 n30Var = this.I;
        if (!(q30Var2 == null && this.z == -1) && kzVar.b() == 0) {
            h0(ezVar);
            n30Var.a();
            return;
        }
        boolean z3 = n30Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = n30Var.g;
        boolean z4 = true;
        boolean z5 = (z3 && this.z == -1 && this.F == null) ? false : true;
        q4 q4Var = this.B;
        if (z5) {
            n30Var.a();
            q30 q30Var3 = this.F;
            hh hhVar = this.r;
            if (q30Var3 != null) {
                int i3 = q30Var3.h;
                if (i3 > 0) {
                    if (i3 == this.p) {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            this.q[i4].d();
                            q30 q30Var4 = this.F;
                            int i5 = q30Var4.i[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += q30Var4.n ? hhVar.g() : hhVar.k();
                            }
                            ir irVar = this.q[i4];
                            irVar.b = i5;
                            irVar.c = i5;
                        }
                    } else {
                        q30Var3.i = null;
                        q30Var3.h = 0;
                        q30Var3.j = 0;
                        q30Var3.k = null;
                        q30Var3.l = null;
                        q30Var3.f = q30Var3.g;
                    }
                }
                q30 q30Var5 = this.F;
                this.E = q30Var5.o;
                boolean z6 = q30Var5.m;
                c(null);
                q30 q30Var6 = this.F;
                if (q30Var6 != null && q30Var6.m != z6) {
                    q30Var6.m = z6;
                }
                this.w = z6;
                m0();
                W0();
                q30 q30Var7 = this.F;
                int i6 = q30Var7.f;
                if (i6 != -1) {
                    this.z = i6;
                    n30Var.c = q30Var7.n;
                } else {
                    n30Var.c = this.x;
                }
                if (q30Var7.j > 1) {
                    q4Var.g = q30Var7.k;
                    q4Var.h = q30Var7.l;
                }
            } else {
                W0();
                n30Var.c = this.x;
            }
            if (!kzVar.g && (i2 = this.z) != -1) {
                if (i2 < 0 || i2 >= kzVar.b()) {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    q30 q30Var8 = this.F;
                    if (q30Var8 == null || q30Var8.f == -1 || q30Var8.h < 1) {
                        View q = q(this.z);
                        if (q != null) {
                            n30Var.a = this.x ? J0() : I0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (n30Var.c) {
                                    n30Var.b = (hhVar.g() - this.A) - hhVar.b(q);
                                } else {
                                    n30Var.b = (hhVar.k() + this.A) - hhVar.e(q);
                                }
                            } else if (hhVar.c(q) > hhVar.l()) {
                                n30Var.b = n30Var.c ? hhVar.g() : hhVar.k();
                            } else {
                                int e = hhVar.e(q) - hhVar.k();
                                if (e < 0) {
                                    n30Var.b = -e;
                                } else {
                                    int g = hhVar.g() - hhVar.b(q);
                                    if (g < 0) {
                                        n30Var.b = g;
                                    } else {
                                        n30Var.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.z;
                            n30Var.a = i7;
                            int i8 = this.A;
                            if (i8 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                n30Var.c = z2;
                                hh hhVar2 = staggeredGridLayoutManager.r;
                                n30Var.b = z2 ? hhVar2.g() : hhVar2.k();
                            } else {
                                boolean z7 = n30Var.c;
                                hh hhVar3 = staggeredGridLayoutManager.r;
                                if (z7) {
                                    n30Var.b = hhVar3.g() - i8;
                                } else {
                                    n30Var.b = hhVar3.k() + i8;
                                }
                            }
                            n30Var.d = true;
                        }
                    } else {
                        n30Var.b = Integer.MIN_VALUE;
                        n30Var.a = this.z;
                    }
                    n30Var.e = true;
                }
            }
            if (this.D) {
                int b = kzVar.b();
                for (int v = v() - 1; v >= 0; v--) {
                    i = xy.H(u(v));
                    if (i >= 0 && i < b) {
                        break;
                    }
                }
                i = 0;
                n30Var.a = i;
                n30Var.b = Integer.MIN_VALUE;
                n30Var.e = true;
            } else {
                int b2 = kzVar.b();
                int v2 = v();
                for (int i9 = 0; i9 < v2; i9++) {
                    int H = xy.H(u(i9));
                    if (H >= 0 && H < b2) {
                        i = H;
                        break;
                    }
                }
                i = 0;
                n30Var.a = i;
                n30Var.b = Integer.MIN_VALUE;
                n30Var.e = true;
            }
        }
        if (this.F == null && this.z == -1 && (n30Var.c != this.D || O0() != this.E)) {
            q4Var.d();
            n30Var.d = true;
        }
        if (v() > 0 && ((q30Var = this.F) == null || q30Var.h < 1)) {
            if (n30Var.d) {
                for (int i10 = 0; i10 < this.p; i10++) {
                    this.q[i10].d();
                    int i11 = n30Var.b;
                    if (i11 != Integer.MIN_VALUE) {
                        ir irVar2 = this.q[i10];
                        irVar2.b = i11;
                        irVar2.c = i11;
                    }
                }
            } else if (z5 || n30Var.f == null) {
                int i12 = 0;
                while (true) {
                    int i13 = this.p;
                    irVarArr = this.q;
                    if (i12 >= i13) {
                        break;
                    }
                    ir irVar3 = irVarArr[i12];
                    boolean z8 = this.x;
                    int i14 = n30Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) irVar3.g;
                    int i15 = z8 ? irVar3.i(Integer.MIN_VALUE) : irVar3.k(Integer.MIN_VALUE);
                    irVar3.d();
                    if (i15 != Integer.MIN_VALUE && ((!z8 || i15 >= staggeredGridLayoutManager2.r.g()) && (z8 || i15 <= staggeredGridLayoutManager2.r.k()))) {
                        if (i14 != Integer.MIN_VALUE) {
                            i15 += i14;
                        }
                        irVar3.c = i15;
                        irVar3.b = i15;
                    }
                    i12++;
                }
                int length = irVarArr.length;
                int[] iArr = n30Var.f;
                if (iArr == null || iArr.length < length) {
                    n30Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    n30Var.f[i16] = irVarArr[i16].k(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < this.p; i17++) {
                    ir irVar4 = this.q[i17];
                    irVar4.d();
                    int i18 = n30Var.f[i17];
                    irVar4.b = i18;
                    irVar4.c = i18;
                }
            }
        }
        p(ezVar);
        pp ppVar = this.v;
        ppVar.a = false;
        this.J = false;
        hh hhVar4 = this.s;
        int l = hhVar4.l();
        this.u = l / this.p;
        this.G = View.MeasureSpec.makeMeasureSpec(l, hhVar4.i());
        b1(n30Var.a, kzVar);
        if (n30Var.c) {
            Y0(-1);
            D0(ezVar, ppVar, kzVar);
            Y0(1);
            ppVar.c = n30Var.a + ppVar.d;
            D0(ezVar, ppVar, kzVar);
        } else {
            Y0(1);
            D0(ezVar, ppVar, kzVar);
            Y0(-1);
            ppVar.c = n30Var.a + ppVar.d;
            D0(ezVar, ppVar, kzVar);
        }
        if (hhVar4.i() != 1073741824) {
            int v3 = v();
            float f = 0.0f;
            for (int i19 = 0; i19 < v3; i19++) {
                View u = u(i19);
                float c = hhVar4.c(u);
                if (c >= f) {
                    if (((o30) u.getLayoutParams()).f) {
                        c = (c * 1.0f) / this.p;
                    }
                    f = Math.max(f, c);
                }
            }
            int i20 = this.u;
            int round = Math.round(f * this.p);
            if (hhVar4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, hhVar4.l());
            }
            this.u = round / this.p;
            this.G = View.MeasureSpec.makeMeasureSpec(round, hhVar4.i());
            if (this.u != i20) {
                for (int i21 = 0; i21 < v3; i21++) {
                    View u2 = u(i21);
                    o30 o30Var = (o30) u2.getLayoutParams();
                    if (!o30Var.f) {
                        boolean O0 = O0();
                        int i22 = this.t;
                        if (O0 && i22 == 1) {
                            int i23 = -((this.p - 1) - o30Var.e.e);
                            u2.offsetLeftAndRight((this.u * i23) - (i23 * i20));
                        } else {
                            int i24 = o30Var.e.e;
                            int i25 = this.u * i24;
                            int i26 = i24 * i20;
                            if (i22 == 1) {
                                u2.offsetLeftAndRight(i25 - i26);
                            } else {
                                u2.offsetTopAndBottom(i25 - i26);
                            }
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                G0(ezVar, kzVar, true);
                H0(ezVar, kzVar, false);
            } else {
                H0(ezVar, kzVar, true);
                G0(ezVar, kzVar, false);
            }
        }
        if (z && !kzVar.g && this.C != 0 && v() > 0 && (this.J || N0() != null)) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.M);
            }
        }
        z4 = false;
        if (kzVar.g) {
            n30Var.a();
        }
        this.D = n30Var.c;
        this.E = O0();
        if (z4) {
            n30Var.a();
            Q0(ezVar, kzVar, false);
        }
    }

    public final boolean R0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == O0();
    }

    @Override // defpackage.xy
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.M);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i, kz kzVar) {
        int I0;
        int i2;
        if (i > 0) {
            I0 = J0();
            i2 = 1;
        } else {
            I0 = I0();
            i2 = -1;
        }
        pp ppVar = this.v;
        ppVar.a = true;
        b1(I0, kzVar);
        Y0(i2);
        ppVar.c = I0 + ppVar.d;
        ppVar.b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x005b, code lost:
    
        if (O0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0065, code lost:
    
        if (O0() == false) goto L34;
     */
    @Override // defpackage.xy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, ez ezVar, kz kzVar) {
        View view2;
        int i2;
        View j;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (view2 = recyclerView.B(view)) == null || ((ArrayList) this.a.d).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                W0();
                int i3 = this.t;
                if (i == 1) {
                    if (i3 != 1) {
                    }
                    i2 = -1;
                } else if (i == 2) {
                    if (i3 != 1) {
                    }
                    i2 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                }
                if (i2 != Integer.MIN_VALUE) {
                    o30 o30Var = (o30) view2.getLayoutParams();
                    boolean z = o30Var.f;
                    ir irVar = o30Var.e;
                    int J0 = i2 == 1 ? J0() : I0();
                    b1(J0, kzVar);
                    Y0(i2);
                    pp ppVar = this.v;
                    ppVar.c = ppVar.d + J0;
                    ppVar.b = (int) (this.r.l() * 0.33333334f);
                    ppVar.h = true;
                    ppVar.a = false;
                    D0(ezVar, ppVar, kzVar);
                    this.D = this.x;
                    if (!z && (j = irVar.j(J0, i2)) != null && j != view2) {
                        return j;
                    }
                    if (R0(i2)) {
                        for (int i4 = this.p - 1; i4 >= 0; i4--) {
                            View j2 = this.q[i4].j(J0, i2);
                            if (j2 != null && j2 != view2) {
                                return j2;
                            }
                        }
                    } else {
                        for (int i5 = 0; i5 < this.p; i5++) {
                            View j3 = this.q[i5].j(J0, i2);
                            if (j3 != null && j3 != view2) {
                                return j3;
                            }
                        }
                    }
                    boolean z2 = (this.w ^ true) == (i2 == -1);
                    if (!z) {
                        View q = q(z2 ? irVar.e() : irVar.f());
                        if (q != null && q != view2) {
                            return q;
                        }
                    }
                    if (R0(i2)) {
                        for (int i6 = this.p - 1; i6 >= 0; i6--) {
                            if (i6 != irVar.e) {
                                ir[] irVarArr = this.q;
                                View q2 = q(z2 ? irVarArr[i6].e() : irVarArr[i6].f());
                                if (q2 != null && q2 != view2) {
                                    return q2;
                                }
                            }
                        }
                    } else {
                        for (int i7 = 0; i7 < this.p; i7++) {
                            ir[] irVarArr2 = this.q;
                            View q3 = q(z2 ? irVarArr2[i7].e() : irVarArr2[i7].f());
                            if (q3 != null && q3 != view2) {
                                return q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void T0(ez ezVar, pp ppVar) {
        if (!ppVar.a || ppVar.i) {
            return;
        }
        int i = ppVar.b;
        int i2 = ppVar.e;
        if (i == 0) {
            if (i2 == -1) {
                U0(ezVar, ppVar.g);
                return;
            } else {
                V0(ezVar, ppVar.f);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = ppVar.f;
            int k = this.q[0].k(i4);
            while (i3 < this.p) {
                int k2 = this.q[i3].k(i4);
                if (k2 > k) {
                    k = k2;
                }
                i3++;
            }
            int i5 = i4 - k;
            int i6 = ppVar.g;
            if (i5 >= 0) {
                i6 -= Math.min(i5, ppVar.b);
            }
            U0(ezVar, i6);
            return;
        }
        int i7 = ppVar.g;
        int i8 = this.q[0].i(i7);
        while (i3 < this.p) {
            int i9 = this.q[i3].i(i7);
            if (i9 < i8) {
                i8 = i9;
            }
            i3++;
        }
        int i10 = i8 - ppVar.g;
        int i11 = ppVar.f;
        if (i10 >= 0) {
            i11 += Math.min(i10, ppVar.b);
        }
        V0(ezVar, i11);
    }

    @Override // defpackage.xy
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 == null || E0 == null) {
                return;
            }
            int H = xy.H(F0);
            int H2 = xy.H(E0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
            } else {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H);
            }
        }
    }

    public final void U0(ez ezVar, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            hh hhVar = this.r;
            if (hhVar.e(u) < i || hhVar.n(u) < i) {
                return;
            }
            o30 o30Var = (o30) u.getLayoutParams();
            if (o30Var.f) {
                for (int i2 = 0; i2 < this.p; i2++) {
                    if (((ArrayList) this.q[i2].f).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.p; i3++) {
                    this.q[i3].l();
                }
            } else if (((ArrayList) o30Var.e.f).size() == 1) {
                return;
            } else {
                o30Var.e.l();
            }
            j0(u, ezVar);
        }
    }

    public final void V0(ez ezVar, int i) {
        while (v() > 0) {
            View u = u(0);
            hh hhVar = this.r;
            if (hhVar.b(u) > i || hhVar.m(u) > i) {
                return;
            }
            o30 o30Var = (o30) u.getLayoutParams();
            if (o30Var.f) {
                for (int i2 = 0; i2 < this.p; i2++) {
                    if (((ArrayList) this.q[i2].f).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.p; i3++) {
                    this.q[i3].m();
                }
            } else if (((ArrayList) o30Var.e.f).size() == 1) {
                return;
            } else {
                o30Var.e.m();
            }
            j0(u, ezVar);
        }
    }

    public final void W0() {
        if (this.t == 1 || !O0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.xy
    public final void X(int i, int i2) {
        M0(i, i2, 1);
    }

    public final int X0(int i, ez ezVar, kz kzVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, kzVar);
        pp ppVar = this.v;
        int D0 = D0(ezVar, ppVar, kzVar);
        if (ppVar.b >= D0) {
            i = i < 0 ? -D0 : D0;
        }
        this.r.o(-i);
        this.D = this.x;
        ppVar.b = 0;
        T0(ezVar, ppVar);
        return i;
    }

    @Override // defpackage.xy
    public final void Y() {
        this.B.d();
        m0();
    }

    public final void Y0(int i) {
        pp ppVar = this.v;
        ppVar.e = i;
        ppVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.xy
    public final void Z(int i, int i2) {
        M0(i, i2, 8);
    }

    public final void Z0(int i) {
        c(null);
        if (i != this.p) {
            this.B.d();
            m0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new ir[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new ir(this, i2);
            }
            m0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < I0()) != r3.x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // defpackage.jz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        int i2 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.xy
    public final void a0(int i, int i2) {
        M0(i, i2, 2);
    }

    public final void a1(int i, int i2) {
        for (int i3 = 0; i3 < this.p; i3++) {
            if (!((ArrayList) this.q[i3].f).isEmpty()) {
                c1(this.q[i3], i, i2);
            }
        }
    }

    @Override // defpackage.xy
    public final void b0(int i, int i2) {
        M0(i, i2, 4);
    }

    public final void b1(int i, kz kzVar) {
        int i2;
        int i3;
        int i4;
        pp ppVar = this.v;
        boolean z = false;
        ppVar.b = 0;
        ppVar.c = i;
        jq jqVar = this.e;
        hh hhVar = this.r;
        if (jqVar == null || !jqVar.e || (i4 = kzVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i2 = hhVar.l();
                i3 = 0;
            } else {
                i3 = hhVar.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.l) {
            ppVar.g = hhVar.f() + i2;
            ppVar.f = -i3;
        } else {
            ppVar.f = hhVar.k() - i3;
            ppVar.g = hhVar.g() + i2;
        }
        ppVar.h = false;
        ppVar.a = true;
        if (hhVar.i() == 0 && hhVar.f() == 0) {
            z = true;
        }
        ppVar.i = z;
    }

    @Override // defpackage.xy
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.xy
    public final void c0(ez ezVar, kz kzVar) {
        Q0(ezVar, kzVar, true);
    }

    public final void c1(ir irVar, int i, int i2) {
        int i3 = irVar.d;
        int i4 = irVar.e;
        if (i == -1) {
            int i5 = irVar.b;
            if (i5 == Integer.MIN_VALUE) {
                irVar.c();
                i5 = irVar.b;
            }
            if (i5 + i3 <= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = irVar.c;
        if (i6 == Integer.MIN_VALUE) {
            irVar.b();
            i6 = irVar.c;
        }
        if (i6 - i3 >= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // defpackage.xy
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.xy
    public final void d0(kz kzVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.I.a();
    }

    @Override // defpackage.xy
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.xy
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof q30) {
            q30 q30Var = (q30) parcelable;
            this.F = q30Var;
            if (this.z != -1) {
                q30Var.f = -1;
                q30Var.g = -1;
                q30Var.i = null;
                q30Var.h = 0;
                q30Var.j = 0;
                q30Var.k = null;
                q30Var.l = null;
            }
            m0();
        }
    }

    @Override // defpackage.xy
    public final boolean f(yy yyVar) {
        return yyVar instanceof o30;
    }

    @Override // defpackage.xy
    public final Parcelable f0() {
        int k;
        int k2;
        int[] iArr;
        q30 q30Var = this.F;
        if (q30Var != null) {
            q30 q30Var2 = new q30();
            q30Var2.h = q30Var.h;
            q30Var2.f = q30Var.f;
            q30Var2.g = q30Var.g;
            q30Var2.i = q30Var.i;
            q30Var2.j = q30Var.j;
            q30Var2.k = q30Var.k;
            q30Var2.m = q30Var.m;
            q30Var2.n = q30Var.n;
            q30Var2.o = q30Var.o;
            q30Var2.l = q30Var.l;
            return q30Var2;
        }
        q30 q30Var3 = new q30();
        q30Var3.m = this.w;
        q30Var3.n = this.D;
        q30Var3.o = this.E;
        q4 q4Var = this.B;
        if (q4Var == null || (iArr = (int[]) q4Var.g) == null) {
            q30Var3.j = 0;
        } else {
            q30Var3.k = iArr;
            q30Var3.j = iArr.length;
            q30Var3.l = (ArrayList) q4Var.h;
        }
        if (v() <= 0) {
            q30Var3.f = -1;
            q30Var3.g = -1;
            q30Var3.h = 0;
            return q30Var3;
        }
        q30Var3.f = this.D ? J0() : I0();
        View E0 = this.x ? E0(true) : F0(true);
        q30Var3.g = E0 != null ? xy.H(E0) : -1;
        int i = this.p;
        q30Var3.h = i;
        q30Var3.i = new int[i];
        for (int i2 = 0; i2 < this.p; i2++) {
            boolean z = this.D;
            ir[] irVarArr = this.q;
            hh hhVar = this.r;
            if (z) {
                k = irVarArr[i2].i(Integer.MIN_VALUE);
                if (k != Integer.MIN_VALUE) {
                    k2 = hhVar.g();
                    k -= k2;
                    q30Var3.i[i2] = k;
                } else {
                    q30Var3.i[i2] = k;
                }
            } else {
                k = irVarArr[i2].k(Integer.MIN_VALUE);
                if (k != Integer.MIN_VALUE) {
                    k2 = hhVar.k();
                    k -= k2;
                    q30Var3.i[i2] = k;
                } else {
                    q30Var3.i[i2] = k;
                }
            }
        }
        return q30Var3;
    }

    @Override // defpackage.xy
    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // defpackage.xy
    public final void h(int i, int i2, kz kzVar, im imVar) {
        pp ppVar;
        int i3;
        int i4;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        S0(i, kzVar);
        int[] iArr = this.L;
        if (iArr == null || iArr.length < this.p) {
            this.L = new int[this.p];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = this.p;
            ppVar = this.v;
            if (i5 >= i7) {
                break;
            }
            if (ppVar.d == -1) {
                i3 = ppVar.f;
                i4 = this.q[i5].k(i3);
            } else {
                i3 = this.q[i5].i(ppVar.g);
                i4 = ppVar.g;
            }
            int i8 = i3 - i4;
            if (i8 >= 0) {
                this.L[i6] = i8;
                i6++;
            }
            i5++;
        }
        Arrays.sort(this.L, 0, i6);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = ppVar.c;
            if (i10 < 0 || i10 >= kzVar.b()) {
                return;
            }
            imVar.a(ppVar.c, this.L[i9]);
            ppVar.c += ppVar.d;
        }
    }

    @Override // defpackage.xy
    public final int j(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return e70.f(kzVar, this.r, F0(z), E0(z), this, this.K);
    }

    @Override // defpackage.xy
    public final int k(kz kzVar) {
        return C0(kzVar);
    }

    @Override // defpackage.xy
    public final int l(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return e70.h(kzVar, this.r, F0(z), E0(z), this, this.K);
    }

    @Override // defpackage.xy
    public final int m(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return e70.f(kzVar, this.r, F0(z), E0(z), this, this.K);
    }

    @Override // defpackage.xy
    public final int n(kz kzVar) {
        return C0(kzVar);
    }

    @Override // defpackage.xy
    public final int n0(int i, ez ezVar, kz kzVar) {
        return X0(i, ezVar, kzVar);
    }

    @Override // defpackage.xy
    public final int o(kz kzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return e70.h(kzVar, this.r, F0(z), E0(z), this, this.K);
    }

    @Override // defpackage.xy
    public final void o0(int i) {
        q30 q30Var = this.F;
        if (q30Var != null && q30Var.f != i) {
            q30Var.i = null;
            q30Var.h = 0;
            q30Var.f = -1;
            q30Var.g = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // defpackage.xy
    public final int p0(int i, ez ezVar, kz kzVar) {
        return X0(i, ezVar, kzVar);
    }

    @Override // defpackage.xy
    public final yy r() {
        return this.t == 0 ? new o30(-2, -1) : new o30(-1, -2);
    }

    @Override // defpackage.xy
    public final yy s(Context context, AttributeSet attributeSet) {
        return new o30(context, attributeSet);
    }

    @Override // defpackage.xy
    public final void s0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int F = F() + E();
        int D = D() + G();
        if (this.t == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = x80.a;
            g2 = xy.g(i2, height, recyclerView.getMinimumHeight());
            g = xy.g(i, (this.u * this.p) + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = x80.a;
            g = xy.g(i, width, recyclerView2.getMinimumWidth());
            g2 = xy.g(i2, (this.u * this.p) + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.xy
    public final yy t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new o30((ViewGroup.MarginLayoutParams) layoutParams) : new o30(layoutParams);
    }

    @Override // defpackage.xy
    public final void y0(RecyclerView recyclerView, int i) {
        jq jqVar = new jq(recyclerView.getContext());
        jqVar.a = i;
        z0(jqVar);
    }

    public StaggeredGridLayoutManager() {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new q4(25, false);
        this.C = 2;
        this.H = new Rect();
        this.I = new n30(this);
        this.J = false;
        this.K = true;
        this.M = new z6(8, this);
        this.t = 1;
        Z0(2);
        this.v = new pp();
        this.r = hh.a(this, this.t);
        this.s = hh.a(this, 1 - this.t);
    }
}
