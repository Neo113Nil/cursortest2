package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.an;
import defpackage.e90;
import defpackage.h5;
import defpackage.i0;
import defpackage.nz;
import defpackage.o30;
import defpackage.o8;
import defpackage.oz;
import defpackage.sm;
import defpackage.sq;
import defpackage.tq;
import defpackage.tz;
import defpackage.uq;
import defpackage.zz;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final h5 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new h5(17);
        this.L = new Rect();
        m1(nz.I(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final boolean A0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(zz zzVar, uq uqVar, sm smVar) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = uqVar.d) >= 0 && i < zzVar.b() && i2 > 0; i3++) {
            smVar.a(uqVar.d, Math.max(0, uqVar.g));
            this.K.getClass();
            i2--;
            uqVar.d += uqVar.e;
        }
    }

    @Override // defpackage.nz
    public final int J(tz tzVar, zz zzVar) {
        if (this.p == 0) {
            return this.F;
        }
        if (zzVar.b() < 1) {
            return 0;
        }
        return i1(zzVar.b() - 1, tzVar, zzVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(tz tzVar, zz zzVar, boolean z, boolean z2) {
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
        int b = zzVar.b();
        H0();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = nz.H(u);
            if (H >= 0 && H < b && j1(H, tzVar, zzVar) == 0) {
                if (((oz) u.getLayoutParams()).a.h()) {
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
    
        if (((java.util.ArrayList) r22.a.d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, tz tzVar, zz zzVar) {
        View A;
        int v;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        tz tzVar2 = tzVar;
        zz zzVar2 = zzVar;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            A = recyclerView.A(view);
            if (A != null) {
            }
        }
        A = null;
        if (A != null) {
            an anVar = (an) A.getLayoutParams();
            int i6 = anVar.e;
            int i7 = anVar.f + i6;
            if (super.T(view, i, tzVar, zzVar) != null) {
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
                int i1 = i1(i3, tzVar2, zzVar2);
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
                    int i13 = i1(i11, tzVar2, zzVar2);
                    View u = u(i11);
                    if (u == A) {
                        break;
                    }
                    if (!u.hasFocusable() || i13 == i1) {
                        an anVar2 = (an) u.getLayoutParams();
                        int i14 = anVar2.e;
                        view3 = A;
                        int i15 = anVar2.f + i14;
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
                                    if (!this.c.x(u) || !this.d.x(u)) {
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
                        int i16 = anVar2.e;
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
                        tzVar2 = tzVar;
                        zzVar2 = zzVar;
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
                    tzVar2 = tzVar;
                    zzVar2 = zzVar;
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
    public final void U0(tz tzVar, zz zzVar, uq uqVar, tq tqVar) {
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
        boolean z2 = uqVar.e == 1;
        int i10 = this.F;
        if (!z2) {
            i10 = j1(uqVar.d, tzVar, zzVar) + k1(uqVar.d, tzVar, zzVar);
        }
        int i11 = 0;
        while (i11 < this.F && (i8 = uqVar.d) >= 0 && i8 < zzVar.b() && i10 > 0) {
            int i12 = uqVar.d;
            int k1 = k1(i12, tzVar, zzVar);
            if (k1 > this.F) {
                throw new IllegalArgumentException("Item at position " + i12 + " requires " + k1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i10 -= k1;
            if (i10 < 0 || (b = uqVar.b(tzVar)) == null) {
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
            an anVar = (an) view.getLayoutParams();
            int k12 = k1(nz.H(view), tzVar, zzVar);
            anVar.f = k12;
            anVar.e = i13;
            i13 += k12;
            i += i3;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.H[i15];
            if (uqVar.k != null) {
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
            float d = (this.r.d(view2) * 1.0f) / ((an) view2.getLayoutParams()).f;
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
                an anVar2 = (an) view4.getLayoutParams();
                Rect rect2 = anVar2.b;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) anVar2).topMargin + ((ViewGroup.MarginLayoutParams) anVar2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) anVar2).leftMargin + ((ViewGroup.MarginLayoutParams) anVar2).rightMargin;
                int h1 = h1(anVar2.e, anVar2.f);
                if (this.p == 1) {
                    i7 = nz.w(false, h1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) anVar2).width);
                    w = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    w = nz.w(false, h1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) anVar2).height);
                    i7 = makeMeasureSpec;
                }
                if (x0(view4, i7, w, (oz) view4.getLayoutParams())) {
                    view4.measure(i7, w);
                }
            }
        }
        tqVar.a = i14;
        int i20 = this.p;
        int i21 = uqVar.f;
        int i22 = uqVar.b;
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
            an anVar3 = (an) view5.getLayoutParams();
            if (this.p != 1) {
                i5 = G() + this.G[anVar3.e];
                i22 = this.r.d(view5) + i5;
            } else if (T0()) {
                int E = E() + this.G[this.F - anVar3.e];
                i4 = E;
                i6 = E - this.r.d(view5);
            } else {
                i6 = E() + this.G[anVar3.e];
                i4 = this.r.d(view5) + i6;
            }
            nz.N(view5, i6, i5, i4, i22);
            if (anVar3.a.h() || anVar3.a.k()) {
                tqVar.c = true;
            }
            tqVar.d = view5.hasFocusable() | tqVar.d;
            i23++;
        }
    }

    @Override // defpackage.nz
    public final void V(tz tzVar, zz zzVar, View view, i0 i0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof an)) {
            W(view, i0Var);
            return;
        }
        an anVar = (an) layoutParams;
        int i1 = i1(anVar.a.b(), tzVar, zzVar);
        int i = this.p;
        int i2 = anVar.e;
        int i3 = anVar.f;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(tz tzVar, zz zzVar, sq sqVar, int i) {
        n1();
        if (zzVar.b() > 0 && !zzVar.g) {
            boolean z = i == 1;
            int j1 = j1(sqVar.b, tzVar, zzVar);
            if (z) {
                while (j1 > 0) {
                    int i2 = sqVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    sqVar.b = i3;
                    j1 = j1(i3, tzVar, zzVar);
                }
            } else {
                int b = zzVar.b() - 1;
                int i4 = sqVar.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int j12 = j1(i5, tzVar, zzVar);
                    if (j12 <= j1) {
                        break;
                    }
                    i4 = i5;
                    j1 = j12;
                }
                sqVar.b = i4;
            }
        }
        g1();
    }

    @Override // defpackage.nz
    public final void X(int i, int i2) {
        h5 h5Var = this.K;
        h5Var.w();
        ((SparseIntArray) h5Var.h).clear();
    }

    @Override // defpackage.nz
    public final void Y() {
        h5 h5Var = this.K;
        h5Var.w();
        ((SparseIntArray) h5Var.h).clear();
    }

    @Override // defpackage.nz
    public final void Z(int i, int i2) {
        h5 h5Var = this.K;
        h5Var.w();
        ((SparseIntArray) h5Var.h).clear();
    }

    @Override // defpackage.nz
    public final void a0(int i, int i2) {
        h5 h5Var = this.K;
        h5Var.w();
        ((SparseIntArray) h5Var.h).clear();
    }

    @Override // defpackage.nz
    public final void b0(int i, int i2) {
        h5 h5Var = this.K;
        h5Var.w();
        ((SparseIntArray) h5Var.h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z) {
        if (z) {
            o8.w("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.b1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void c0(tz tzVar, zz zzVar) {
        boolean z = zzVar.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                an anVar = (an) u(i).getLayoutParams();
                int b = anVar.a.b();
                sparseIntArray2.put(b, anVar.f);
                sparseIntArray.put(b, anVar.e);
            }
        }
        super.c0(tzVar, zzVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void d0(zz zzVar) {
        super.d0(zzVar);
        this.E = false;
    }

    @Override // defpackage.nz
    public final boolean f(oz ozVar) {
        return ozVar instanceof an;
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

    public final int i1(int i, tz tzVar, zz zzVar) {
        boolean z = zzVar.g;
        h5 h5Var = this.K;
        if (!z) {
            int i2 = this.F;
            h5Var.getClass();
            return h5.v(i, i2);
        }
        int b = tzVar.b(i);
        if (b != -1) {
            int i3 = this.F;
            h5Var.getClass();
            return h5.v(b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int j1(int i, tz tzVar, zz zzVar) {
        boolean z = zzVar.g;
        h5 h5Var = this.K;
        if (!z) {
            int i2 = this.F;
            h5Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = tzVar.b(i);
        if (b != -1) {
            int i4 = this.F;
            h5Var.getClass();
            return b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int k(zz zzVar) {
        return E0(zzVar);
    }

    public final int k1(int i, tz tzVar, zz zzVar) {
        boolean z = zzVar.g;
        h5 h5Var = this.K;
        if (!z) {
            h5Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (tzVar.b(i) != -1) {
            h5Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int l(zz zzVar) {
        return F0(zzVar);
    }

    public final void l1(View view, int i, boolean z) {
        int i2;
        int i3;
        an anVar = (an) view.getLayoutParams();
        Rect rect = anVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) anVar).topMargin + ((ViewGroup.MarginLayoutParams) anVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) anVar).leftMargin + ((ViewGroup.MarginLayoutParams) anVar).rightMargin;
        int h1 = h1(anVar.e, anVar.f);
        if (this.p == 1) {
            i3 = nz.w(false, h1, i, i5, ((ViewGroup.MarginLayoutParams) anVar).width);
            i2 = nz.w(true, this.r.l(), this.m, i4, ((ViewGroup.MarginLayoutParams) anVar).height);
        } else {
            int w = nz.w(false, h1, i, i4, ((ViewGroup.MarginLayoutParams) anVar).height);
            int w2 = nz.w(true, this.r.l(), this.l, i5, ((ViewGroup.MarginLayoutParams) anVar).width);
            i2 = w;
            i3 = w2;
        }
        oz ozVar = (oz) view.getLayoutParams();
        if (z ? x0(view, i3, i2, ozVar) : v0(view, i3, i2, ozVar)) {
            view.measure(i3, i2);
        }
    }

    public final void m1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            o8.j(o30.e("Span count should be at least 1. Provided ", i));
            return;
        }
        this.F = i;
        this.K.w();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int n(zz zzVar) {
        return E0(zzVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int n0(int i, tz tzVar, zz zzVar) {
        n1();
        g1();
        return super.n0(i, tzVar, zzVar);
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

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int o(zz zzVar) {
        return F0(zzVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int p0(int i, tz tzVar, zz zzVar) {
        n1();
        g1();
        return super.p0(i, tzVar, zzVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final oz r() {
        return this.p == 0 ? new an(-2, -1) : new an(-1, -2);
    }

    @Override // defpackage.nz
    public final oz s(Context context, AttributeSet attributeSet) {
        an anVar = new an(context, attributeSet);
        anVar.e = -1;
        anVar.f = 0;
        return anVar;
    }

    @Override // defpackage.nz
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
            WeakHashMap weakHashMap = e90.a;
            g2 = nz.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g = nz.g(i, iArr[iArr.length - 1] + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = e90.a;
            g = nz.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g2 = nz.g(i2, iArr2[iArr2.length - 1] + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.nz
    public final oz t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            an anVar = new an((ViewGroup.MarginLayoutParams) layoutParams);
            anVar.e = -1;
            anVar.f = 0;
            return anVar;
        }
        an anVar2 = new an(layoutParams);
        anVar2.e = -1;
        anVar2.f = 0;
        return anVar2;
    }

    @Override // defpackage.nz
    public final int x(tz tzVar, zz zzVar) {
        if (this.p == 1) {
            return this.F;
        }
        if (zzVar.b() < 1) {
            return 0;
        }
        return i1(zzVar.b() - 1, tzVar, zzVar) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new h5(17);
        this.L = new Rect();
        m1(i);
    }
}
