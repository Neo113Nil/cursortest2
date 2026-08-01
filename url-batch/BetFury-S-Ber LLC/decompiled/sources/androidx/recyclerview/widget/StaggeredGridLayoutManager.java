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
import defpackage.fz;
import defpackage.g80;
import defpackage.h80;
import defpackage.hm0;
import defpackage.i5;
import defpackage.i80;
import defpackage.o80;
import defpackage.s9;
import defpackage.t80;
import defpackage.u80;
import defpackage.v7;
import defpackage.ve0;
import defpackage.vw;
import defpackage.we0;
import defpackage.wl;
import defpackage.wx;
import defpackage.xe0;
import defpackage.ye0;
import defpackage.zb0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends h80 implements t80 {
    public final i5 B;
    public final int C;
    public boolean D;
    public boolean E;
    public ye0 F;
    public final Rect G;
    public final ve0 H;
    public final boolean I;
    public int[] J;
    public final v7 K;
    public final int p;
    public final fz[] q;
    public final wl r;
    public final wl s;
    public final int t;
    public int u;
    public final vw v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        i5 i5Var = new i5(29, false);
        this.B = i5Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new ve0(this);
        this.I = true;
        this.K = new v7(9, this);
        g80 I = h80.I(context, attributeSet, i, i2);
        int i3 = I.a;
        if (i3 != 0 && i3 != 1) {
            s9.k("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            wl wlVar = this.r;
            this.r = this.s;
            this.s = wlVar;
            m0();
        }
        int i4 = I.b;
        c(null);
        if (i4 != this.p) {
            i5Var.e();
            m0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new fz[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new fz(this, i5);
            }
            m0();
        }
        boolean z = I.c;
        c(null);
        ye0 ye0Var = this.F;
        if (ye0Var != null && ye0Var.m != z) {
            ye0Var.m = z;
        }
        this.w = z;
        m0();
        vw vwVar = new vw();
        vwVar.a = true;
        vwVar.f = 0;
        vwVar.g = 0;
        this.v = vwVar;
        this.r = wl.a(this, this.t);
        this.s = wl.a(this, 1 - this.t);
    }

    public static int b1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.h80
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int I0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                I0 = J0();
                I0();
            } else {
                I0 = I0();
                J0();
            }
            if (I0 == 0 && N0() != null) {
                this.B.e();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return zb0.d(u80Var, this.r, F0(z), E0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0270, code lost:
    
        T0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D0(o80 o80Var, vw vwVar, u80 u80Var) {
        fz[] fzVarArr;
        BitSet bitSet;
        int i;
        fz[] fzVarArr2;
        fz fzVar;
        ?? r5;
        int i2;
        int c;
        int i3;
        int i4;
        BitSet bitSet2;
        int i5;
        int i6;
        o80 o80Var2 = o80Var;
        BitSet bitSet3 = this.y;
        int i7 = this.p;
        bitSet3.set(0, i7, true);
        vw vwVar2 = this.v;
        int i8 = vwVar2.i ? vwVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : vwVar.e == 1 ? vwVar.g + vwVar.b : vwVar.f - vwVar.b;
        int i9 = vwVar.e;
        int i10 = 0;
        while (true) {
            fzVarArr = this.q;
            if (i10 >= i7) {
                break;
            }
            if (!((ArrayList) fzVarArr[i10].f).isEmpty()) {
                a1(fzVarArr[i10], i9, i8);
            }
            i10++;
        }
        boolean z = this.x;
        wl wlVar = this.r;
        int g = z ? wlVar.g() : wlVar.k();
        boolean z2 = false;
        while (true) {
            int i11 = vwVar.c;
            if (i11 < 0 || i11 >= u80Var.b() || (!vwVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View d = o80Var2.d(vwVar.c);
            vwVar.c += vwVar.d;
            we0 we0Var = (we0) d.getLayoutParams();
            int c2 = we0Var.a.c();
            i5 i5Var = this.B;
            int[] iArr = (int[]) i5Var.g;
            int i12 = (iArr == null || c2 >= iArr.length) ? -1 : iArr[c2];
            if (i12 == -1) {
                if (R0(vwVar.e)) {
                    i = i7;
                    i6 = i7 - 1;
                    i7 = -1;
                    i5 = -1;
                } else {
                    i = i7;
                    i5 = 1;
                    i6 = 0;
                }
                fz fzVar2 = null;
                int i13 = i5;
                if (vwVar.e == 1) {
                    int k = wlVar.k();
                    fzVarArr2 = fzVarArr;
                    int i14 = i6;
                    int i15 = Integer.MAX_VALUE;
                    while (i14 != i7) {
                        int i16 = i14;
                        fz fzVar3 = fzVarArr2[i16];
                        BitSet bitSet4 = bitSet3;
                        int g2 = fzVar3.g(k);
                        if (g2 < i15) {
                            i15 = g2;
                            fzVar2 = fzVar3;
                        }
                        i14 = i16 + i13;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    fzVarArr2 = fzVarArr;
                    int g3 = wlVar.g();
                    int i17 = i6;
                    int i18 = Integer.MIN_VALUE;
                    while (i17 != i7) {
                        fz fzVar4 = fzVarArr2[i17];
                        int i19 = i7;
                        int i20 = fzVar4.i(g3);
                        if (i20 > i18) {
                            i18 = i20;
                            fzVar2 = fzVar4;
                        }
                        i17 += i13;
                        i7 = i19;
                    }
                }
                fzVar = fzVar2;
                i5Var.v(c2);
                ((int[]) i5Var.g)[c2] = fzVar.e;
            } else {
                bitSet = bitSet3;
                i = i7;
                fzVarArr2 = fzVarArr;
                fzVar = fzVarArr2[i12];
            }
            we0Var.e = fzVar;
            if (vwVar.e == 1) {
                r5 = 0;
                b(d, -1, false);
            } else {
                r5 = 0;
                b(d, 0, false);
            }
            int i21 = this.t;
            if (i21 == 1) {
                P0(d, h80.w(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) we0Var).width), h80.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) we0Var).height));
            } else {
                P0(d, h80.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) we0Var).width), h80.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) we0Var).height));
            }
            if (vwVar.e == 1) {
                c = fzVar.g(g);
                i2 = wlVar.c(d) + c;
            } else {
                i2 = fzVar.i(g);
                c = i2 - wlVar.c(d);
            }
            int i22 = vwVar.e;
            fz fzVar5 = we0Var.e;
            if (i22 == 1) {
                fzVar5.getClass();
                we0 we0Var2 = (we0) d.getLayoutParams();
                we0Var2.e = fzVar5;
                ArrayList arrayList = (ArrayList) fzVar5.f;
                arrayList.add(d);
                fzVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fzVar5.b = Integer.MIN_VALUE;
                }
                if (we0Var2.a.i() || we0Var2.a.l()) {
                    fzVar5.d = ((StaggeredGridLayoutManager) fzVar5.g).r.c(d) + fzVar5.d;
                }
            } else {
                fzVar5.getClass();
                we0 we0Var3 = (we0) d.getLayoutParams();
                we0Var3.e = fzVar5;
                ArrayList arrayList2 = (ArrayList) fzVar5.f;
                arrayList2.add(0, d);
                fzVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fzVar5.c = Integer.MIN_VALUE;
                }
                if (we0Var3.a.i() || we0Var3.a.l()) {
                    fzVar5.d = ((StaggeredGridLayoutManager) fzVar5.g).r.c(d) + fzVar5.d;
                }
            }
            boolean O0 = O0();
            wl wlVar2 = this.s;
            if (O0 && i21 == 1) {
                i4 = wlVar2.g() - (((i - 1) - fzVar.e) * this.u);
                i3 = i4 - wlVar2.c(d);
            } else {
                int k2 = (fzVar.e * this.u) + wlVar2.k();
                int c3 = wlVar2.c(d) + k2;
                i3 = k2;
                i4 = c3;
            }
            z2 = true;
            if (i21 == 1) {
                h80.N(d, i3, c, i4, i2);
            } else {
                h80.N(d, c, i3, i2, i4);
            }
            a1(fzVar, vwVar2.e, i8);
            o80Var2 = o80Var;
            T0(o80Var2, vwVar2);
            if (vwVar2.h && d.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(fzVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i7 = i;
            fzVarArr = fzVarArr2;
        }
        int k3 = vwVar2.e == -1 ? wlVar.k() - L0(wlVar.k()) : K0(wlVar.g()) - wlVar.g();
        if (k3 > 0) {
            return Math.min(vwVar.b, k3);
        }
        return 0;
    }

    public final View E0(boolean z) {
        wl wlVar = this.r;
        int k = wlVar.k();
        int g = wlVar.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = wlVar.e(u);
            int b = wlVar.b(u);
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
        wl wlVar = this.r;
        int k = wlVar.k();
        int g = wlVar.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = wlVar.e(u);
            if (wlVar.b(u) > k && e < g) {
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

    public final void G0(o80 o80Var, u80 u80Var, boolean z) {
        int g;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g = this.r.g() - K0) > 0) {
            int i = g - (-X0(-g, o80Var, u80Var));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void H0(o80 o80Var, u80 u80Var, boolean z) {
        int k;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k = L0 - this.r.k()) > 0) {
            int X0 = k - X0(k, o80Var, u80Var);
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
        return h80.H(u(0));
    }

    public final int J0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return h80.H(u(v - 1));
    }

    public final int K0(int i) {
        int g = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int g2 = this.q[i2].g(i);
            if (g2 > g) {
                g = g2;
            }
        }
        return g;
    }

    @Override // defpackage.h80
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(int i, int i2, int i3) {
        int i4;
        int i5;
        i5 i5Var;
        int[] iArr;
        ArrayList arrayList;
        xe0 xe0Var;
        int i6;
        int J0 = this.x ? J0() : I0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                i5Var = this.B;
                iArr = (int[]) i5Var.g;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) i5Var.h;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                xe0Var = (xe0) ((ArrayList) i5Var.h).get(size);
                                if (xe0Var.f == i5) {
                                    break;
                                }
                            }
                        }
                        xe0Var = null;
                        if (xe0Var != null) {
                            ((ArrayList) i5Var.h).remove(xe0Var);
                        }
                        int size2 = ((ArrayList) i5Var.h).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((xe0) ((ArrayList) i5Var.h).get(i7)).f >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            xe0 xe0Var2 = (xe0) ((ArrayList) i5Var.h).get(i7);
                            ((ArrayList) i5Var.h).remove(i7);
                            i6 = xe0Var2.f;
                            int[] iArr2 = (int[]) i5Var.g;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) i5Var.g).length;
                            } else {
                                Arrays.fill((int[]) i5Var.g, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) i5Var.g;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    i5Var.C(i, i2);
                } else if (i3 == 2) {
                    i5Var.D(i, i2);
                } else if (i3 == 8) {
                    i5Var.D(i, 1);
                    i5Var.C(i2, 1);
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
        i5Var = this.B;
        iArr = (int[]) i5Var.g;
        if (iArr != null) {
            arrayList = (ArrayList) i5Var.h;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) i5Var.g;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > J0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View N0() {
        int v = v();
        int i = v - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        char c = (this.t == 1 && O0()) ? (char) 1 : (char) 65535;
        if (this.x) {
            v = -1;
        } else {
            i = 0;
        }
        int i3 = i < v ? 1 : -1;
        while (i != v) {
            View u = u(i);
            we0 we0Var = (we0) u.getLayoutParams();
            boolean z = bitSet.get(we0Var.e.e);
            wl wlVar = this.r;
            if (z) {
                fz fzVar = we0Var.e;
                if (this.x) {
                    int i4 = fzVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        fzVar.a();
                        i4 = fzVar.c;
                    }
                    if (i4 < wlVar.g()) {
                        ArrayList arrayList = (ArrayList) fzVar.f;
                        ((we0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u;
                    }
                } else {
                    int i5 = fzVar.b;
                    ArrayList arrayList2 = (ArrayList) fzVar.f;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        we0 we0Var2 = (we0) view.getLayoutParams();
                        fzVar.b = ((StaggeredGridLayoutManager) fzVar.g).r.e(view);
                        we0Var2.getClass();
                        i5 = fzVar.b;
                    }
                    if (i5 > wlVar.k()) {
                        ((we0) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u;
                    }
                }
                bitSet.clear(we0Var.e.e);
            }
            i += i3;
            if (i != v) {
                View u2 = u(i);
                if (this.x) {
                    int b = wlVar.b(u);
                    int b2 = wlVar.b(u2);
                    if (b < b2) {
                        return u;
                    }
                    if (b == b2) {
                        if ((we0Var.e.e - ((we0) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                            return u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e = wlVar.e(u);
                    int e2 = wlVar.e(u2);
                    if (e > e2) {
                        return u;
                    }
                    if (e == e2) {
                        if ((we0Var.e.e - ((we0) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.h80
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            fz fzVar = this.q[i2];
            int i3 = fzVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fzVar.b = i3 + i;
            }
            int i4 = fzVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fzVar.c = i4 + i;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // defpackage.h80
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            fz fzVar = this.q[i2];
            int i3 = fzVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fzVar.b = i3 + i;
            }
            int i4 = fzVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fzVar.c = i4 + i;
            }
        }
    }

    public final void P0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.K(view));
        }
        we0 we0Var = (we0) view.getLayoutParams();
        int b1 = b1(i, ((ViewGroup.MarginLayoutParams) we0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) we0Var).rightMargin + rect.right);
        int b12 = b1(i2, ((ViewGroup.MarginLayoutParams) we0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) we0Var).bottomMargin + rect.bottom);
        if (v0(view, b1, b12, we0Var)) {
            view.measure(b1, b12);
        }
    }

    @Override // defpackage.h80
    public final void Q() {
        this.B.e();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if ((r4 < I0()) != r17.x) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.x != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(o80 o80Var, u80 u80Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        ye0 ye0Var;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        ye0 ye0Var2 = this.F;
        ve0 ve0Var = this.H;
        if (!(ye0Var2 == null && this.z == -1) && u80Var.b() == 0) {
            h0(o80Var);
            ve0Var.a();
            return;
        }
        boolean z6 = ve0Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = ve0Var.g;
        boolean z7 = (z6 && this.z == -1 && this.F == null) ? false : true;
        fz[] fzVarArr = this.q;
        int i4 = this.p;
        i5 i5Var = this.B;
        if (z7) {
            ve0Var.a();
            ye0 ye0Var3 = this.F;
            wl wlVar = this.r;
            if (ye0Var3 != null) {
                int i5 = ye0Var3.h;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            fzVarArr[i6].b();
                            ye0 ye0Var4 = this.F;
                            int i7 = ye0Var4.i[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += ye0Var4.n ? wlVar.g() : wlVar.k();
                            }
                            fz fzVar = fzVarArr[i6];
                            fzVar.b = i7;
                            fzVar.c = i7;
                        }
                    } else {
                        ye0Var3.i = null;
                        ye0Var3.h = 0;
                        ye0Var3.j = 0;
                        ye0Var3.k = null;
                        ye0Var3.l = null;
                        ye0Var3.f = ye0Var3.g;
                    }
                }
                ye0 ye0Var5 = this.F;
                this.E = ye0Var5.o;
                boolean z8 = ye0Var5.m;
                c(null);
                ye0 ye0Var6 = this.F;
                if (ye0Var6 != null && ye0Var6.m != z8) {
                    ye0Var6.m = z8;
                }
                this.w = z8;
                m0();
                W0();
                ye0 ye0Var7 = this.F;
                int i8 = ye0Var7.f;
                if (i8 != -1) {
                    this.z = i8;
                    ve0Var.c = ye0Var7.n;
                } else {
                    ve0Var.c = this.x;
                }
                if (ye0Var7.j > 1) {
                    i5Var.g = ye0Var7.k;
                    i5Var.h = ye0Var7.l;
                }
            } else {
                W0();
                ve0Var.c = this.x;
            }
            if (!u80Var.g && (i3 = this.z) != -1) {
                if (i3 < 0 || i3 >= u80Var.b()) {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    ye0 ye0Var8 = this.F;
                    if (ye0Var8 == null || ye0Var8.f == -1 || ye0Var8.h < 1) {
                        View q = q(this.z);
                        if (q != null) {
                            ve0Var.a = this.x ? J0() : I0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (ve0Var.c) {
                                    ve0Var.b = (wlVar.g() - this.A) - wlVar.b(q);
                                } else {
                                    ve0Var.b = (wlVar.k() + this.A) - wlVar.e(q);
                                }
                            } else if (wlVar.c(q) > wlVar.l()) {
                                ve0Var.b = ve0Var.c ? wlVar.g() : wlVar.k();
                            } else {
                                int e = wlVar.e(q) - wlVar.k();
                                if (e < 0) {
                                    ve0Var.b = -e;
                                } else {
                                    int g = wlVar.g() - wlVar.b(q);
                                    if (g < 0) {
                                        ve0Var.b = g;
                                    } else {
                                        ve0Var.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.z;
                            ve0Var.a = i9;
                            int i10 = this.A;
                            if (i10 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                ve0Var.c = z5;
                                wl wlVar2 = staggeredGridLayoutManager.r;
                                ve0Var.b = z5 ? wlVar2.g() : wlVar2.k();
                            } else {
                                boolean z9 = ve0Var.c;
                                wl wlVar3 = staggeredGridLayoutManager.r;
                                if (z9) {
                                    ve0Var.b = wlVar3.g() - i10;
                                } else {
                                    ve0Var.b = wlVar3.k() + i10;
                                }
                            }
                            z4 = true;
                            ve0Var.d = true;
                            ve0Var.e = z4;
                        }
                    } else {
                        ve0Var.b = Integer.MIN_VALUE;
                        ve0Var.a = this.z;
                    }
                    z4 = true;
                    ve0Var.e = z4;
                }
            }
            if (this.D) {
                int b = u80Var.b();
                for (int v = v() - 1; v >= 0; v--) {
                    i2 = h80.H(u(v));
                    if (i2 >= 0 && i2 < b) {
                        break;
                    }
                }
                i2 = 0;
                ve0Var.a = i2;
                ve0Var.b = Integer.MIN_VALUE;
                z4 = true;
                ve0Var.e = z4;
            } else {
                int b2 = u80Var.b();
                int v2 = v();
                for (int i11 = 0; i11 < v2; i11++) {
                    int H = h80.H(u(i11));
                    if (H >= 0 && H < b2) {
                        i2 = H;
                        break;
                    }
                }
                i2 = 0;
                ve0Var.a = i2;
                ve0Var.b = Integer.MIN_VALUE;
                z4 = true;
                ve0Var.e = z4;
            }
        }
        if (this.F == null && this.z == -1 && !(ve0Var.c == this.D && O0() == this.E)) {
            i5Var.e();
            i = 1;
            ve0Var.d = true;
        } else {
            i = 1;
        }
        if (v() > 0 && ((ye0Var = this.F) == null || ye0Var.h < i)) {
            if (ve0Var.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    fzVarArr[i12].b();
                    int i13 = ve0Var.b;
                    if (i13 != Integer.MIN_VALUE) {
                        fz fzVar2 = fzVarArr[i12];
                        fzVar2.b = i13;
                        fzVar2.c = i13;
                    }
                }
            } else if (z7 || ve0Var.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    fz fzVar3 = fzVarArr[i14];
                    boolean z10 = this.x;
                    int i15 = ve0Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) fzVar3.g;
                    int g2 = z10 ? fzVar3.g(Integer.MIN_VALUE) : fzVar3.i(Integer.MIN_VALUE);
                    fzVar3.b();
                    if (g2 != Integer.MIN_VALUE && ((!z10 || g2 >= staggeredGridLayoutManager2.r.g()) && (z10 || g2 <= staggeredGridLayoutManager2.r.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            g2 += i15;
                        }
                        fzVar3.c = g2;
                        fzVar3.b = g2;
                    }
                }
                int length = fzVarArr.length;
                int[] iArr = ve0Var.f;
                if (iArr == null || iArr.length < length) {
                    ve0Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    ve0Var.f[i16] = fzVarArr[i16].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    fz fzVar4 = fzVarArr[i17];
                    fzVar4.b();
                    int i18 = ve0Var.f[i17];
                    fzVar4.b = i18;
                    fzVar4.c = i18;
                }
            }
        }
        p(o80Var);
        vw vwVar = this.v;
        vwVar.a = false;
        wl wlVar4 = this.s;
        int l = wlVar4.l();
        this.u = l / i4;
        View.MeasureSpec.makeMeasureSpec(l, wlVar4.i());
        Z0(ve0Var.a, u80Var);
        if (ve0Var.c) {
            Y0(-1);
            D0(o80Var, vwVar, u80Var);
            Y0(1);
            vwVar.c = ve0Var.a + vwVar.d;
            D0(o80Var, vwVar, u80Var);
        } else {
            Y0(1);
            D0(o80Var, vwVar, u80Var);
            Y0(-1);
            vwVar.c = ve0Var.a + vwVar.d;
            D0(o80Var, vwVar, u80Var);
        }
        if (wlVar4.i() != 1073741824) {
            int v3 = v();
            float f = 0.0f;
            for (int i19 = 0; i19 < v3; i19++) {
                View u = u(i19);
                float c = wlVar4.c(u);
                if (c >= f) {
                    ((we0) u.getLayoutParams()).getClass();
                    f = Math.max(f, c);
                }
            }
            int i20 = this.u;
            int round = Math.round(f * i4);
            if (wlVar4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, wlVar4.l());
            }
            this.u = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, wlVar4.i());
            if (this.u != i20) {
                for (int i21 = 0; i21 < v3; i21++) {
                    View u2 = u(i21);
                    we0 we0Var = (we0) u2.getLayoutParams();
                    we0Var.getClass();
                    boolean O0 = O0();
                    int i22 = this.t;
                    if (O0 && i22 == 1) {
                        int i23 = -((i4 - 1) - we0Var.e.e);
                        u2.offsetLeftAndRight((this.u * i23) - (i23 * i20));
                    } else {
                        int i24 = we0Var.e.e;
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
        if (v() <= 0) {
            z2 = true;
        } else if (this.x) {
            z2 = true;
            G0(o80Var, u80Var, true);
            H0(o80Var, u80Var, false);
        } else {
            z2 = true;
            H0(o80Var, u80Var, true);
            G0(o80Var, u80Var, false);
        }
        if (z && !u80Var.g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (B0()) {
                z3 = z2;
                if (u80Var.g) {
                    ve0Var.a();
                }
                this.D = ve0Var.c;
                this.E = O0();
                if (z3) {
                    return;
                }
                ve0Var.a();
                Q0(o80Var, u80Var, false);
                return;
            }
        }
        z3 = false;
        if (u80Var.g) {
        }
        this.D = ve0Var.c;
        this.E = O0();
        if (z3) {
        }
    }

    public final boolean R0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == O0();
    }

    @Override // defpackage.h80
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i, u80 u80Var) {
        int I0;
        int i2;
        if (i > 0) {
            I0 = J0();
            i2 = 1;
        } else {
            I0 = I0();
            i2 = -1;
        }
        vw vwVar = this.v;
        vwVar.a = true;
        Z0(I0, u80Var);
        Y0(i2);
        vwVar.c = I0 + vwVar.d;
        vwVar.b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005b, code lost:
    
        if (O0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (O0() == false) goto L34;
     */
    @Override // defpackage.h80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, o80 o80Var, u80 u80Var) {
        View view2;
        int i2;
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
                    we0 we0Var = (we0) view2.getLayoutParams();
                    we0Var.getClass();
                    fz fzVar = we0Var.e;
                    int J0 = i2 == 1 ? J0() : I0();
                    Z0(J0, u80Var);
                    Y0(i2);
                    vw vwVar = this.v;
                    vwVar.c = vwVar.d + J0;
                    vwVar.b = (int) (this.r.l() * 0.33333334f);
                    vwVar.h = true;
                    vwVar.a = false;
                    D0(o80Var, vwVar, u80Var);
                    this.D = this.x;
                    View h = fzVar.h(J0, i2);
                    if (h != null && h != view2) {
                        return h;
                    }
                    boolean R0 = R0(i2);
                    fz[] fzVarArr = this.q;
                    int i4 = this.p;
                    if (R0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View h2 = fzVarArr[i5].h(J0, i2);
                            if (h2 != null && h2 != view2) {
                                return h2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View h3 = fzVarArr[i6].h(J0, i2);
                            if (h3 != null && h3 != view2) {
                                return h3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View q = q(z ? fzVar.c() : fzVar.d());
                    if (q != null && q != view2) {
                        return q;
                    }
                    if (R0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != fzVar.e) {
                                View q2 = q(z ? fzVarArr[i7].c() : fzVarArr[i7].d());
                                if (q2 != null && q2 != view2) {
                                    return q2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View q3 = q(z ? fzVarArr[i8].c() : fzVarArr[i8].d());
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

    public final void T0(o80 o80Var, vw vwVar) {
        if (!vwVar.a || vwVar.i) {
            return;
        }
        int i = vwVar.b;
        int i2 = vwVar.e;
        if (i == 0) {
            if (i2 == -1) {
                U0(o80Var, vwVar.g);
                return;
            } else {
                V0(o80Var, vwVar.f);
                return;
            }
        }
        int i3 = this.p;
        fz[] fzVarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = vwVar.f;
            int i6 = fzVarArr[0].i(i5);
            while (i4 < i3) {
                int i7 = fzVarArr[i4].i(i5);
                if (i7 > i6) {
                    i6 = i7;
                }
                i4++;
            }
            int i8 = i5 - i6;
            int i9 = vwVar.g;
            if (i8 >= 0) {
                i9 -= Math.min(i8, vwVar.b);
            }
            U0(o80Var, i9);
            return;
        }
        int i10 = vwVar.g;
        int g = fzVarArr[0].g(i10);
        while (i4 < i3) {
            int g2 = fzVarArr[i4].g(i10);
            if (g2 < g) {
                g = g2;
            }
            i4++;
        }
        int i11 = g - vwVar.g;
        int i12 = vwVar.f;
        if (i11 >= 0) {
            i12 += Math.min(i11, vwVar.b);
        }
        V0(o80Var, i12);
    }

    @Override // defpackage.h80
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 == null || E0 == null) {
                return;
            }
            int H = h80.H(F0);
            int H2 = h80.H(E0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
            } else {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H);
            }
        }
    }

    public final void U0(o80 o80Var, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            wl wlVar = this.r;
            if (wlVar.e(u) < i || wlVar.n(u) < i) {
                return;
            }
            we0 we0Var = (we0) u.getLayoutParams();
            we0Var.getClass();
            if (((ArrayList) we0Var.e.f).size() == 1) {
                return;
            }
            fz fzVar = we0Var.e;
            ArrayList arrayList = (ArrayList) fzVar.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            we0 we0Var2 = (we0) view.getLayoutParams();
            we0Var2.e = null;
            if (we0Var2.a.i() || we0Var2.a.l()) {
                fzVar.d -= ((StaggeredGridLayoutManager) fzVar.g).r.c(view);
            }
            if (size == 1) {
                fzVar.b = Integer.MIN_VALUE;
            }
            fzVar.c = Integer.MIN_VALUE;
            j0(u, o80Var);
        }
    }

    public final void V0(o80 o80Var, int i) {
        while (v() > 0) {
            View u = u(0);
            wl wlVar = this.r;
            if (wlVar.b(u) > i || wlVar.m(u) > i) {
                return;
            }
            we0 we0Var = (we0) u.getLayoutParams();
            we0Var.getClass();
            if (((ArrayList) we0Var.e.f).size() == 1) {
                return;
            }
            fz fzVar = we0Var.e;
            ArrayList arrayList = (ArrayList) fzVar.f;
            View view = (View) arrayList.remove(0);
            we0 we0Var2 = (we0) view.getLayoutParams();
            we0Var2.e = null;
            if (arrayList.size() == 0) {
                fzVar.c = Integer.MIN_VALUE;
            }
            if (we0Var2.a.i() || we0Var2.a.l()) {
                fzVar.d -= ((StaggeredGridLayoutManager) fzVar.g).r.c(view);
            }
            fzVar.b = Integer.MIN_VALUE;
            j0(u, o80Var);
        }
    }

    public final void W0() {
        if (this.t == 1 || !O0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.h80
    public final void X(int i, int i2) {
        M0(i, i2, 1);
    }

    public final int X0(int i, o80 o80Var, u80 u80Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, u80Var);
        vw vwVar = this.v;
        int D0 = D0(o80Var, vwVar, u80Var);
        if (vwVar.b >= D0) {
            i = i < 0 ? -D0 : D0;
        }
        this.r.o(-i);
        this.D = this.x;
        vwVar.b = 0;
        T0(o80Var, vwVar);
        return i;
    }

    @Override // defpackage.h80
    public final void Y() {
        this.B.e();
        m0();
    }

    public final void Y0(int i) {
        vw vwVar = this.v;
        vwVar.e = i;
        vwVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.h80
    public final void Z(int i, int i2) {
        M0(i, i2, 8);
    }

    public final void Z0(int i, u80 u80Var) {
        int i2;
        int i3;
        int i4;
        vw vwVar = this.v;
        boolean z = false;
        vwVar.b = 0;
        vwVar.c = i;
        wx wxVar = this.e;
        wl wlVar = this.r;
        if (wxVar == null || !wxVar.e || (i4 = u80Var.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i2 = wlVar.l();
                i3 = 0;
            } else {
                i3 = wlVar.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.l) {
            vwVar.g = wlVar.f() + i2;
            vwVar.f = -i3;
        } else {
            vwVar.f = wlVar.k() - i3;
            vwVar.g = wlVar.g() + i2;
        }
        vwVar.h = false;
        vwVar.a = true;
        if (wlVar.i() == 0 && wlVar.f() == 0) {
            z = true;
        }
        vwVar.i = z;
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
    @Override // defpackage.t80
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

    @Override // defpackage.h80
    public final void a0(int i, int i2) {
        M0(i, i2, 2);
    }

    public final void a1(fz fzVar, int i, int i2) {
        int i3 = fzVar.d;
        int i4 = fzVar.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = fzVar.c;
            if (i5 == Integer.MIN_VALUE) {
                fzVar.a();
                i5 = fzVar.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = fzVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) fzVar.f).get(0);
            we0 we0Var = (we0) view.getLayoutParams();
            fzVar.b = ((StaggeredGridLayoutManager) fzVar.g).r.e(view);
            we0Var.getClass();
            i6 = fzVar.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.h80
    public final void b0(int i, int i2) {
        M0(i, i2, 4);
    }

    @Override // defpackage.h80
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.h80
    public final void c0(o80 o80Var, u80 u80Var) {
        Q0(o80Var, u80Var, true);
    }

    @Override // defpackage.h80
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.h80
    public final void d0(u80 u80Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.h80
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.h80
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof ye0) {
            ye0 ye0Var = (ye0) parcelable;
            this.F = ye0Var;
            if (this.z != -1) {
                ye0Var.f = -1;
                ye0Var.g = -1;
                ye0Var.i = null;
                ye0Var.h = 0;
                ye0Var.j = 0;
                ye0Var.k = null;
                ye0Var.l = null;
            }
            m0();
        }
    }

    @Override // defpackage.h80
    public final boolean f(i80 i80Var) {
        return i80Var instanceof we0;
    }

    @Override // defpackage.h80
    public final Parcelable f0() {
        int i;
        int k;
        int[] iArr;
        ye0 ye0Var = this.F;
        if (ye0Var != null) {
            ye0 ye0Var2 = new ye0();
            ye0Var2.h = ye0Var.h;
            ye0Var2.f = ye0Var.f;
            ye0Var2.g = ye0Var.g;
            ye0Var2.i = ye0Var.i;
            ye0Var2.j = ye0Var.j;
            ye0Var2.k = ye0Var.k;
            ye0Var2.m = ye0Var.m;
            ye0Var2.n = ye0Var.n;
            ye0Var2.o = ye0Var.o;
            ye0Var2.l = ye0Var.l;
            return ye0Var2;
        }
        ye0 ye0Var3 = new ye0();
        ye0Var3.m = this.w;
        ye0Var3.n = this.D;
        ye0Var3.o = this.E;
        i5 i5Var = this.B;
        if (i5Var == null || (iArr = (int[]) i5Var.g) == null) {
            ye0Var3.j = 0;
        } else {
            ye0Var3.k = iArr;
            ye0Var3.j = iArr.length;
            ye0Var3.l = (ArrayList) i5Var.h;
        }
        if (v() <= 0) {
            ye0Var3.f = -1;
            ye0Var3.g = -1;
            ye0Var3.h = 0;
            return ye0Var3;
        }
        ye0Var3.f = this.D ? J0() : I0();
        View E0 = this.x ? E0(true) : F0(true);
        ye0Var3.g = E0 != null ? h80.H(E0) : -1;
        int i2 = this.p;
        ye0Var3.h = i2;
        ye0Var3.i = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = this.D;
            wl wlVar = this.r;
            fz[] fzVarArr = this.q;
            if (z) {
                i = fzVarArr[i3].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = wlVar.g();
                    i -= k;
                    ye0Var3.i[i3] = i;
                } else {
                    ye0Var3.i[i3] = i;
                }
            } else {
                i = fzVarArr[i3].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = wlVar.k();
                    i -= k;
                    ye0Var3.i[i3] = i;
                } else {
                    ye0Var3.i[i3] = i;
                }
            }
        }
        return ye0Var3;
    }

    @Override // defpackage.h80
    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // defpackage.h80
    public final void h(int i, int i2, u80 u80Var, ac acVar) {
        vw vwVar;
        int g;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        S0(i, u80Var);
        int[] iArr = this.J;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            vwVar = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = vwVar.d;
            fz[] fzVarArr = this.q;
            if (i6 == -1) {
                int i7 = vwVar.f;
                g = i7 - fzVarArr[i4].i(i7);
            } else {
                g = fzVarArr[i4].g(vwVar.g) - vwVar.g;
            }
            if (g >= 0) {
                this.J[i5] = g;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = vwVar.c;
            if (i9 < 0 || i9 >= u80Var.b()) {
                return;
            }
            acVar.b(vwVar.c, this.J[i8]);
            vwVar.c += vwVar.d;
        }
    }

    @Override // defpackage.h80
    public final int j(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return zb0.c(u80Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.h80
    public final int k(u80 u80Var) {
        return C0(u80Var);
    }

    @Override // defpackage.h80
    public final int l(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return zb0.e(u80Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.h80
    public final int m(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return zb0.c(u80Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.h80
    public final int n(u80 u80Var) {
        return C0(u80Var);
    }

    @Override // defpackage.h80
    public final int n0(int i, o80 o80Var, u80 u80Var) {
        return X0(i, o80Var, u80Var);
    }

    @Override // defpackage.h80
    public final int o(u80 u80Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return zb0.e(u80Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.h80
    public final void o0(int i) {
        ye0 ye0Var = this.F;
        if (ye0Var != null && ye0Var.f != i) {
            ye0Var.i = null;
            ye0Var.h = 0;
            ye0Var.f = -1;
            ye0Var.g = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // defpackage.h80
    public final int p0(int i, o80 o80Var, u80 u80Var) {
        return X0(i, o80Var, u80Var);
    }

    @Override // defpackage.h80
    public final i80 r() {
        return this.t == 0 ? new we0(-2, -1) : new we0(-1, -2);
    }

    @Override // defpackage.h80
    public final i80 s(Context context, AttributeSet attributeSet) {
        return new we0(context, attributeSet);
    }

    @Override // defpackage.h80
    public final void s0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int F = F() + E();
        int D = D() + G();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = hm0.a;
            g2 = h80.g(i2, height, recyclerView.getMinimumHeight());
            g = h80.g(i, (this.u * i4) + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = hm0.a;
            g = h80.g(i, width, recyclerView2.getMinimumWidth());
            g2 = h80.g(i2, (this.u * i4) + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.h80
    public final i80 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new we0((ViewGroup.MarginLayoutParams) layoutParams) : new we0(layoutParams);
    }

    @Override // defpackage.h80
    public final void y0(RecyclerView recyclerView, int i) {
        wx wxVar = new wx(recyclerView.getContext());
        wxVar.a = i;
        z0(wxVar);
    }
}
