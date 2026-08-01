package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.a5;
import defpackage.b20;
import defpackage.c20;
import defpackage.f60;
import defpackage.g9;
import defpackage.h20;
import defpackage.ic0;
import defpackage.k0;
import defpackage.n20;
import defpackage.ro;
import defpackage.ts;
import defpackage.us;
import defpackage.vs;
import defpackage.xo;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final a5 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a5(19);
        this.L = new Rect();
        m1(b20.I(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final boolean A0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(n20 n20Var, vs vsVar, ro roVar) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = vsVar.d) >= 0 && i < n20Var.b() && i2 > 0; i3++) {
            roVar.a(vsVar.d, Math.max(0, vsVar.g));
            this.K.getClass();
            i2--;
            vsVar.d += vsVar.e;
        }
    }

    @Override // defpackage.b20
    public final int J(h20 h20Var, n20 n20Var) {
        if (this.p == 0) {
            return this.F;
        }
        if (n20Var.b() < 1) {
            return 0;
        }
        return i1(n20Var.b() - 1, h20Var, n20Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(h20 h20Var, n20 n20Var, boolean z, boolean z2) {
        int i;
        int i2;
        int v = v();
        int i3 = 1;
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
        }
        int b = n20Var.b();
        H0();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = b20.H(u);
            if (H >= 0 && H < b && j1(H, h20Var, n20Var) == 0) {
                if (((c20) u.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = u;
                    }
                } else {
                    if (this.r.e(u) < g && this.r.b(u) >= k) {
                        return u;
                    }
                    if (view == null) {
                        view = u;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.a.i).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, h20 h20Var, n20 n20Var) {
        View A;
        int v;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        h20 h20Var2 = h20Var;
        n20 n20Var2 = n20Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            A = recyclerView.A(view);
            if (A != null) {
            }
        }
        A = null;
        if (A != null) {
            xo xoVar = (xo) A.getLayoutParams();
            int i6 = xoVar.e;
            int i7 = xoVar.f + i6;
            if (super.T(view, i, h20Var, n20Var) != null) {
                if ((G0(i) == 1) != this.u) {
                    i3 = v() - 1;
                    v = -1;
                    i2 = -1;
                } else {
                    v = v();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.p == 1 && T0();
                int i1 = i1(i3, h20Var2, n20Var2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == v) {
                        break;
                    }
                    int i13 = i1(i11, h20Var2, n20Var2);
                    View u = u(i11);
                    if (u == A) {
                        break;
                    }
                    if (!u.hasFocusable() || i13 == i1) {
                        xo xoVar2 = (xo) u.getLayoutParams();
                        int i14 = xoVar2.e;
                        view3 = A;
                        int i15 = xoVar2.f + i14;
                        if (u.hasFocusable() && i14 == i6 && i15 == i7) {
                            return u;
                        }
                        if (!(u.hasFocusable() && view4 == null) && (u.hasFocusable() || view2 != null)) {
                            i4 = v;
                            int min = Math.min(i15, i7) - Math.max(i14, i6);
                            if (u.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!this.c.D(u) || !this.d.D(u)) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        } else {
                            i5 = i10;
                            i4 = v;
                        }
                        boolean hasFocusable = u.hasFocusable();
                        int i16 = xoVar2.e;
                        if (hasFocusable) {
                            i10 = Math.min(i15, i7) - Math.max(i14, i6);
                            view4 = u;
                            i9 = i16;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i15, i7) - Math.max(i14, i6);
                            i8 = i16;
                            i10 = i5;
                            view5 = u;
                        }
                        i11 += i2;
                        h20Var2 = h20Var;
                        n20Var2 = n20Var;
                        A = view3;
                        v = i4;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = A;
                        i5 = i10;
                        i4 = v;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    h20Var2 = h20Var;
                    n20Var2 = n20Var;
                    A = view3;
                    v = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(h20 h20Var, n20 n20Var, vs vsVar, us usVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int w;
        int i7;
        ?? r12;
        int i8;
        View b;
        int j = this.r.j();
        boolean z = j != 1073741824;
        int i9 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            n1();
        }
        boolean z2 = vsVar.e == 1;
        int i10 = this.F;
        if (!z2) {
            i10 = j1(vsVar.d, h20Var, n20Var) + k1(vsVar.d, h20Var, n20Var);
        }
        int i11 = 0;
        while (i11 < this.F && (i8 = vsVar.d) >= 0 && i8 < n20Var.b() && i10 > 0) {
            int i12 = vsVar.d;
            int k1 = k1(i12, h20Var, n20Var);
            if (k1 > this.F) {
                throw new IllegalArgumentException("Item at position " + i12 + " requires " + k1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i10 -= k1;
            if (i10 < 0 || (b = vsVar.b(h20Var)) == null) {
                break;
            }
            this.H[i11] = b;
            i11++;
        }
        if (z2) {
            i3 = 1;
            i2 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            View view = this.H[i];
            xo xoVar = (xo) view.getLayoutParams();
            int k12 = k1(b20.H(view), h20Var, n20Var);
            xoVar.f = k12;
            xoVar.e = i13;
            i13 += k12;
            i += i3;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.H[i15];
            if (vsVar.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.J(view2));
            }
            l1(view2, j, r12);
            int c = this.r.c(view2);
            if (c > i14) {
                i14 = c;
            }
            float d = (this.r.d(view2) * 1.0f) / ((xo) view2.getLayoutParams()).f;
            if (d > f) {
                f = d;
            }
        }
        if (z) {
            f1(Math.max(Math.round(f * this.F), i9));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.H[i16];
                l1(view3, 1073741824, true);
                int c2 = this.r.c(view3);
                if (c2 > i14) {
                    i14 = c2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.H[i17];
            if (this.r.c(view4) != i14) {
                xo xoVar2 = (xo) view4.getLayoutParams();
                Rect rect2 = xoVar2.b;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) xoVar2).topMargin + ((ViewGroup.MarginLayoutParams) xoVar2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) xoVar2).leftMargin + ((ViewGroup.MarginLayoutParams) xoVar2).rightMargin;
                int h1 = h1(xoVar2.e, xoVar2.f);
                if (this.p == 1) {
                    i7 = b20.w(false, h1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) xoVar2).width);
                    w = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    w = b20.w(false, h1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) xoVar2).height);
                    i7 = makeMeasureSpec;
                }
                if (x0(view4, i7, w, (c20) view4.getLayoutParams())) {
                    view4.measure(i7, w);
                }
            }
        }
        usVar.a = i14;
        int i20 = this.p;
        int i21 = vsVar.f;
        int i22 = vsVar.b;
        if (i20 != 1) {
            if (i21 == -1) {
                i6 = i22 - i14;
                i5 = 0;
                i4 = i22;
            } else {
                i4 = i22 + i14;
                i5 = 0;
                i6 = i22;
            }
            i22 = i5;
        } else if (i21 == -1) {
            i5 = i22 - i14;
            i6 = 0;
            i4 = 0;
        } else {
            i4 = 0;
            i5 = i22;
            i22 += i14;
            i6 = 0;
        }
        int i23 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i23 >= i11) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i23];
            xo xoVar3 = (xo) view5.getLayoutParams();
            if (this.p != 1) {
                i5 = G() + this.G[xoVar3.e];
                i22 = this.r.d(view5) + i5;
            } else if (T0()) {
                int E = E() + this.G[this.F - xoVar3.e];
                i4 = E;
                i6 = E - this.r.d(view5);
            } else {
                i6 = E() + this.G[xoVar3.e];
                i4 = this.r.d(view5) + i6;
            }
            b20.N(view5, i6, i5, i4, i22);
            if (xoVar3.a.h() || xoVar3.a.k()) {
                usVar.c = true;
            }
            usVar.d = view5.hasFocusable() | usVar.d;
            i23++;
        }
    }

    @Override // defpackage.b20
    public final void V(h20 h20Var, n20 n20Var, View view, k0 k0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof xo)) {
            W(view, k0Var);
            return;
        }
        xo xoVar = (xo) layoutParams;
        int i1 = i1(xoVar.a.b(), h20Var, n20Var);
        int i = this.p;
        int i2 = xoVar.e;
        int i3 = xoVar.f;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(h20 h20Var, n20 n20Var, ts tsVar, int i) {
        n1();
        if (n20Var.b() > 0 && !n20Var.g) {
            boolean z = i == 1;
            int j1 = j1(tsVar.b, h20Var, n20Var);
            if (z) {
                while (j1 > 0) {
                    int i2 = tsVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    tsVar.b = i3;
                    j1 = j1(i3, h20Var, n20Var);
                }
            } else {
                int b = n20Var.b() - 1;
                int i4 = tsVar.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int j12 = j1(i5, h20Var, n20Var);
                    if (j12 <= j1) {
                        break;
                    }
                    i4 = i5;
                    j1 = j12;
                }
                tsVar.b = i4;
            }
        }
        g1();
    }

    @Override // defpackage.b20
    public final void X(int i, int i2) {
        a5 a5Var = this.K;
        a5Var.C();
        ((SparseIntArray) a5Var.h).clear();
    }

    @Override // defpackage.b20
    public final void Y() {
        a5 a5Var = this.K;
        a5Var.C();
        ((SparseIntArray) a5Var.h).clear();
    }

    @Override // defpackage.b20
    public final void Z(int i, int i2) {
        a5 a5Var = this.K;
        a5Var.C();
        ((SparseIntArray) a5Var.h).clear();
    }

    @Override // defpackage.b20
    public final void a0(int i, int i2) {
        a5 a5Var = this.K;
        a5Var.C();
        ((SparseIntArray) a5Var.h).clear();
    }

    @Override // defpackage.b20
    public final void b0(int i, int i2) {
        a5 a5Var = this.K;
        a5Var.C();
        ((SparseIntArray) a5Var.h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z) {
        if (z) {
            g9.u("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.b1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final void c0(h20 h20Var, n20 n20Var) {
        boolean z = n20Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                xo xoVar = (xo) u(i).getLayoutParams();
                int b = xoVar.a.b();
                sparseIntArray2.put(b, xoVar.f);
                sparseIntArray.put(b, xoVar.e);
            }
        }
        super.c0(h20Var, n20Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final void d0(n20 n20Var) {
        super.d0(n20Var);
        this.E = false;
    }

    @Override // defpackage.b20
    public final boolean f(c20 c20Var) {
        return c20Var instanceof xo;
    }

    public final void f1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i, int i2) {
        if (this.p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int i1(int i, h20 h20Var, n20 n20Var) {
        boolean z = n20Var.g;
        a5 a5Var = this.K;
        if (!z) {
            int i2 = this.F;
            a5Var.getClass();
            return a5.B(i, i2);
        }
        int b = h20Var.b(i);
        if (b != -1) {
            int i3 = this.F;
            a5Var.getClass();
            return a5.B(b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int j1(int i, h20 h20Var, n20 n20Var) {
        boolean z = n20Var.g;
        a5 a5Var = this.K;
        if (!z) {
            int i2 = this.F;
            a5Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = h20Var.b(i);
        if (b != -1) {
            int i4 = this.F;
            a5Var.getClass();
            return b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final int k(n20 n20Var) {
        return E0(n20Var);
    }

    public final int k1(int i, h20 h20Var, n20 n20Var) {
        boolean z = n20Var.g;
        a5 a5Var = this.K;
        if (!z) {
            a5Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (h20Var.b(i) != -1) {
            a5Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final int l(n20 n20Var) {
        return F0(n20Var);
    }

    public final void l1(View view, int i, boolean z) {
        int i2;
        int i3;
        xo xoVar = (xo) view.getLayoutParams();
        Rect rect = xoVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) xoVar).topMargin + ((ViewGroup.MarginLayoutParams) xoVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) xoVar).leftMargin + ((ViewGroup.MarginLayoutParams) xoVar).rightMargin;
        int h1 = h1(xoVar.e, xoVar.f);
        if (this.p == 1) {
            i3 = b20.w(false, h1, i, i5, ((ViewGroup.MarginLayoutParams) xoVar).width);
            i2 = b20.w(true, this.r.l(), this.m, i4, ((ViewGroup.MarginLayoutParams) xoVar).height);
        } else {
            int w = b20.w(false, h1, i, i4, ((ViewGroup.MarginLayoutParams) xoVar).height);
            int w2 = b20.w(true, this.r.l(), this.l, i5, ((ViewGroup.MarginLayoutParams) xoVar).width);
            i2 = w;
            i3 = w2;
        }
        c20 c20Var = (c20) view.getLayoutParams();
        if (z ? x0(view, i3, i2, c20Var) : v0(view, i3, i2, c20Var)) {
            view.measure(i3, i2);
        }
    }

    public final void m1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            g9.i(f60.e("Span count should be at least 1. Provided ", i));
            return;
        }
        this.F = i;
        this.K.C();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final int n(n20 n20Var) {
        return E0(n20Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final int n0(int i, h20 h20Var, n20 n20Var) {
        n1();
        g1();
        return super.n0(i, h20Var, n20Var);
    }

    public final void n1() {
        int D;
        int G;
        if (this.p == 1) {
            D = this.n - F();
            G = E();
        } else {
            D = this.o - D();
            G = G();
        }
        f1(D - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final int o(n20 n20Var) {
        return F0(n20Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final int p0(int i, h20 h20Var, n20 n20Var) {
        n1();
        g1();
        return super.p0(i, h20Var, n20Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final c20 r() {
        return this.p == 0 ? new xo(-2, -1) : new xo(-1, -2);
    }

    @Override // defpackage.b20
    public final c20 s(Context context, AttributeSet attributeSet) {
        xo xoVar = new xo(context, attributeSet);
        xoVar.e = -1;
        xoVar.f = 0;
        return xoVar;
    }

    @Override // defpackage.b20
    public final void s0(Rect rect, int i, int i2) {
        int g;
        int g2;
        if (this.G == null) {
            super.s0(rect, i, i2);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ic0.a;
            g2 = b20.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g = b20.g(i, iArr[iArr.length - 1] + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ic0.a;
            g = b20.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g2 = b20.g(i2, iArr2[iArr2.length - 1] + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.b20
    public final c20 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            xo xoVar = new xo((ViewGroup.MarginLayoutParams) layoutParams);
            xoVar.e = -1;
            xoVar.f = 0;
            return xoVar;
        }
        xo xoVar2 = new xo(layoutParams);
        xoVar2.e = -1;
        xoVar2.f = 0;
        return xoVar2;
    }

    @Override // defpackage.b20
    public final int x(h20 h20Var, n20 n20Var) {
        if (this.p == 1) {
            return this.F;
        }
        if (n20Var.b() < 1) {
            return 0;
        }
        return i1(n20Var.b() - 1, h20Var, n20Var) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a5(19);
        this.L = new Rect();
        m1(i);
    }
}
