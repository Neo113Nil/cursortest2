package androidx.recyclerview.widget;

import B.j;
import K.T;
import Y.V;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import g0.C0129o;
import g0.C0133t;
import g0.C0134u;
import g0.C0135v;
import g0.L;
import g0.M;
import g0.S;
import g0.Y;
import g0.r;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1506E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f1507G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f1508H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1509I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1510J;

    /* renamed from: K, reason: collision with root package name */
    public final j f1511K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1512L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1506E = false;
        this.F = -1;
        this.f1509I = new SparseIntArray();
        this.f1510J = new SparseIntArray();
        this.f1511K = new j(12);
        this.f1512L = new Rect();
        n1(L.I(context, attributeSet, i, i2).f2273b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final boolean B0() {
        return this.f1527z == null && !this.f1506E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(Y y2, C0135v c0135v, C0129o c0129o) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = c0135v.d) >= 0 && i < y2.b() && i2 > 0; i3++) {
            c0129o.a(c0135v.d, Math.max(0, c0135v.f2490g));
            this.f1511K.getClass();
            i2--;
            c0135v.d += c0135v.f2488e;
        }
    }

    @Override // g0.L
    public final int J(S s2, Y y2) {
        if (this.f1517p == 0) {
            return this.F;
        }
        if (y2.b() < 1) {
            return 0;
        }
        return j1(y2.b() - 1, s2, y2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(S s2, Y y2, boolean z2, boolean z3) {
        int i;
        int i2;
        int v2 = v();
        int i3 = 1;
        if (z3) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v2;
            i2 = 0;
        }
        int b2 = y2.b();
        I0();
        int k2 = this.f1519r.k();
        int g2 = this.f1519r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = L.H(u2);
            if (H2 >= 0 && H2 < b2 && k1(H2, s2, y2) == 0) {
                if (((M) u2.getLayoutParams()).f2287a.j()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1519r.e(u2) < g2 && this.f1519r.b(u2) >= k2) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0101, code lost:
    
        if (r13 == (r2 > r8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0020, code lost:
    
        if (r22.f2275a.f2357c.contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, S s2, Y y2) {
        View D2;
        int v2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        S s3 = s2;
        Y y3 = y2;
        RecyclerView recyclerView = this.f2276b;
        View view4 = null;
        if (recyclerView != null) {
            D2 = recyclerView.D(view);
            if (D2 != null) {
            }
        }
        D2 = null;
        if (D2 == null) {
            return null;
        }
        r rVar = (r) D2.getLayoutParams();
        int i5 = rVar.f2470e;
        int i6 = rVar.f2471f + i5;
        if (super.T(view, i, s2, y2) == null) {
            return null;
        }
        if ((H0(i) == 1) != this.f1522u) {
            i3 = v() - 1;
            v2 = -1;
            i2 = -1;
        } else {
            v2 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f1517p == 1 && U0();
        int j12 = j1(i3, s3, y3);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v2) {
            int i13 = v2;
            int j13 = j1(i12, s3, y3);
            View u2 = u(i12);
            if (u2 == D2) {
                break;
            }
            if (!u2.hasFocusable() || j13 == j12) {
                r rVar2 = (r) u2.getLayoutParams();
                int i14 = rVar2.f2470e;
                view2 = D2;
                int i15 = rVar2.f2471f + i14;
                if (u2.hasFocusable() && i14 == i5 && i15 == i6) {
                    return u2;
                }
                if (!(u2.hasFocusable() && view4 == null) && (u2.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (u2.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (!this.f2277c.y(u2) || !this.d.y(u2)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u2.hasFocusable()) {
                                int i16 = rVar2.f2470e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u2;
                            } else {
                                int i17 = rVar2.f2470e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u2;
                            }
                            i12 += i9;
                            s3 = s2;
                            y3 = y2;
                            v2 = i13;
                            D2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        s3 = s2;
                        y3 = y2;
                        v2 = i13;
                        D2 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (u2.hasFocusable()) {
                }
                i12 += i9;
                s3 = s2;
                y3 = y2;
                v2 = i13;
                D2 = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = D2;
                view3 = view5;
            }
            i4 = i10;
            i10 = i4;
            view5 = view3;
            i12 += i9;
            s3 = s2;
            y3 = y2;
            v2 = i13;
            D2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // g0.L
    public final void V(S s2, Y y2, L.j jVar) {
        super.V(s2, y2, jVar);
        jVar.h(GridView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f2483b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(S s2, Y y2, C0135v c0135v, C0134u c0134u) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int w2;
        int i8;
        ?? r8;
        int i9;
        View b2;
        int j2 = this.f1519r.j();
        boolean z2 = j2 != 1073741824;
        int i10 = v() > 0 ? this.f1507G[this.F] : 0;
        if (z2) {
            o1();
        }
        boolean z3 = c0135v.f2488e == 1;
        int i11 = this.F;
        if (!z3) {
            i11 = k1(c0135v.d, s2, y2) + l1(c0135v.d, s2, y2);
        }
        int i12 = 0;
        while (i12 < this.F && (i9 = c0135v.d) >= 0 && i9 < y2.b() && i11 > 0) {
            int i13 = c0135v.d;
            int l12 = l1(i13, s2, y2);
            if (l12 > this.F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + l12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i11 -= l12;
            if (i11 < 0 || (b2 = c0135v.b(s2)) == null) {
                break;
            }
            this.f1508H[i12] = b2;
            i12++;
        }
        if (z3) {
            i3 = 1;
            i2 = i12;
            i = 0;
        } else {
            i = i12 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i14 = 0;
        while (i != i2) {
            View view = this.f1508H[i];
            r rVar = (r) view.getLayoutParams();
            int l13 = l1(L.H(view), s2, y2);
            rVar.f2471f = l13;
            rVar.f2470e = i14;
            i14 += l13;
            i += i3;
        }
        float f2 = RecyclerView.f1530C0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f1508H[i16];
            if (c0135v.f2492k != null) {
                r8 = 0;
                r8 = 0;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f2276b;
            Rect rect = this.f1512L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.M(view2));
            }
            m1(view2, j2, r8);
            int c2 = this.f1519r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d = (this.f1519r.d(view2) * 1.0f) / ((r) view2.getLayoutParams()).f2471f;
            if (d > f2) {
                f2 = d;
            }
        }
        if (z2) {
            g1(Math.max(Math.round(f2 * this.F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f1508H[i17];
                m1(view3, 1073741824, true);
                int c3 = this.f1519r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f1508H[i18];
            if (this.f1519r.c(view4) != i15) {
                r rVar2 = (r) view4.getLayoutParams();
                Rect rect2 = rVar2.f2288b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar2).topMargin + ((ViewGroup.MarginLayoutParams) rVar2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar2).leftMargin + ((ViewGroup.MarginLayoutParams) rVar2).rightMargin;
                int i110 = i1(rVar2.f2470e, rVar2.f2471f);
                if (this.f1517p == 1) {
                    i8 = L.w(false, i110, 1073741824, i20, ((ViewGroup.MarginLayoutParams) rVar2).width);
                    w2 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w2 = L.w(false, i110, 1073741824, i19, ((ViewGroup.MarginLayoutParams) rVar2).height);
                    i8 = makeMeasureSpec;
                }
                if (y0(view4, i8, w2, (M) view4.getLayoutParams())) {
                    view4.measure(i8, w2);
                }
            }
        }
        c0134u.f2482a = i15;
        if (this.f1517p != 1) {
            if (c0135v.f2489f == -1) {
                int i21 = c0135v.f2486b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0135v.f2486b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0135v.f2489f == -1) {
            i7 = c0135v.f2486b;
            i6 = i7 - i15;
            i5 = 0;
            i4 = 0;
        } else {
            int i23 = c0135v.f2486b;
            i6 = i23;
            i4 = 0;
            i7 = i23 + i15;
            i5 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f1508H[i24];
            r rVar3 = (r) view5.getLayoutParams();
            if (this.f1517p != 1) {
                i6 = G() + this.f1507G[rVar3.f2470e];
                i7 = this.f1519r.d(view5) + i6;
            } else if (U0()) {
                int E2 = E() + this.f1507G[this.F - rVar3.f2470e];
                i4 = E2;
                i5 = E2 - this.f1519r.d(view5);
            } else {
                i5 = E() + this.f1507G[rVar3.f2470e];
                i4 = this.f1519r.d(view5) + i5;
            }
            L.N(view5, i5, i6, i4, i7);
            if (rVar3.f2287a.j() || rVar3.f2287a.m()) {
                c0134u.f2484c = true;
            }
            c0134u.d = view5.hasFocusable() | c0134u.d;
        }
        Arrays.fill(this.f1508H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(S s2, Y y2, C0133t c0133t, int i) {
        o1();
        if (y2.b() > 0 && !y2.f2315g) {
            boolean z2 = i == 1;
            int k12 = k1(c0133t.f2479b, s2, y2);
            if (z2) {
                while (k12 > 0) {
                    int i2 = c0133t.f2479b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0133t.f2479b = i3;
                    k12 = k1(i3, s2, y2);
                }
            } else {
                int b2 = y2.b() - 1;
                int i4 = c0133t.f2479b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int k13 = k1(i5, s2, y2);
                    if (k13 <= k12) {
                        break;
                    }
                    i4 = i5;
                    k12 = k13;
                }
                c0133t.f2479b = i4;
            }
        }
        h1();
    }

    @Override // g0.L
    public final void X(S s2, Y y2, View view, L.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            W(view, jVar);
            return;
        }
        r rVar = (r) layoutParams;
        int j12 = j1(rVar.f2287a.c(), s2, y2);
        int i = this.f1517p;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f544a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(rVar.f2470e, rVar.f2471f, j12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(j12, 1, rVar.f2470e, rVar.f2471f, false, false));
        }
    }

    @Override // g0.L
    public final void Y(int i, int i2) {
        j jVar = this.f1511K;
        jVar.x();
        ((SparseIntArray) jVar.f32c).clear();
    }

    @Override // g0.L
    public final void Z() {
        j jVar = this.f1511K;
        jVar.x();
        ((SparseIntArray) jVar.f32c).clear();
    }

    @Override // g0.L
    public final void a0(int i, int i2) {
        j jVar = this.f1511K;
        jVar.x();
        ((SparseIntArray) jVar.f32c).clear();
    }

    @Override // g0.L
    public final void b0(int i, int i2) {
        j jVar = this.f1511K;
        jVar.x();
        ((SparseIntArray) jVar.f32c).clear();
    }

    @Override // g0.L
    public final void c0(int i, int i2) {
        j jVar = this.f1511K;
        jVar.x();
        ((SparseIntArray) jVar.f32c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.c1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final void d0(S s2, Y y2) {
        boolean z2 = y2.f2315g;
        SparseIntArray sparseIntArray = this.f1510J;
        SparseIntArray sparseIntArray2 = this.f1509I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                r rVar = (r) u(i).getLayoutParams();
                int c2 = rVar.f2287a.c();
                sparseIntArray2.put(c2, rVar.f2471f);
                sparseIntArray.put(c2, rVar.f2470e);
            }
        }
        super.d0(s2, y2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final void e0(Y y2) {
        super.e0(y2);
        this.f1506E = false;
    }

    @Override // g0.L
    public final boolean f(M m2) {
        return m2 instanceof r;
    }

    public final void g1(int i) {
        int i2;
        int[] iArr = this.f1507G;
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
        this.f1507G = iArr;
    }

    public final void h1() {
        View[] viewArr = this.f1508H;
        if (viewArr == null || viewArr.length != this.F) {
            this.f1508H = new View[this.F];
        }
    }

    public final int i1(int i, int i2) {
        if (this.f1517p != 1 || !U0()) {
            int[] iArr = this.f1507G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1507G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int j1(int i, S s2, Y y2) {
        boolean z2 = y2.f2315g;
        j jVar = this.f1511K;
        if (!z2) {
            int i2 = this.F;
            jVar.getClass();
            return j.w(i, i2);
        }
        int b2 = s2.b(i);
        if (b2 != -1) {
            int i3 = this.F;
            jVar.getClass();
            return j.w(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final int k(Y y2) {
        return F0(y2);
    }

    public final int k1(int i, S s2, Y y2) {
        boolean z2 = y2.f2315g;
        j jVar = this.f1511K;
        if (!z2) {
            int i2 = this.F;
            jVar.getClass();
            return i % i2;
        }
        int i3 = this.f1510J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = s2.b(i);
        if (b2 != -1) {
            int i4 = this.F;
            jVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final int l(Y y2) {
        return G0(y2);
    }

    public final int l1(int i, S s2, Y y2) {
        boolean z2 = y2.f2315g;
        j jVar = this.f1511K;
        if (!z2) {
            jVar.getClass();
            return 1;
        }
        int i2 = this.f1509I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (s2.b(i) != -1) {
            jVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void m1(View view, int i, boolean z2) {
        int i2;
        int i3;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f2288b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int i12 = i1(rVar.f2470e, rVar.f2471f);
        if (this.f1517p == 1) {
            i3 = L.w(false, i12, i, i5, ((ViewGroup.MarginLayoutParams) rVar).width);
            i2 = L.w(true, this.f1519r.l(), this.f2284m, i4, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int w2 = L.w(false, i12, i, i4, ((ViewGroup.MarginLayoutParams) rVar).height);
            int w3 = L.w(true, this.f1519r.l(), this.f2283l, i5, ((ViewGroup.MarginLayoutParams) rVar).width);
            i2 = w2;
            i3 = w3;
        }
        M m2 = (M) view.getLayoutParams();
        if (z2 ? y0(view, i3, i2, m2) : w0(view, i3, i2, m2)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final int n(Y y2) {
        return F0(y2);
    }

    public final void n1(int i) {
        if (i == this.F) {
            return;
        }
        this.f1506E = true;
        if (i < 1) {
            throw new IllegalArgumentException(V.e("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.f1511K.x();
        n0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final int o(Y y2) {
        return G0(y2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final int o0(int i, S s2, Y y2) {
        o1();
        h1();
        return super.o0(i, s2, y2);
    }

    public final void o1() {
        int D2;
        int G2;
        if (this.f1517p == 1) {
            D2 = this.f2285n - F();
            G2 = E();
        } else {
            D2 = this.f2286o - D();
            G2 = G();
        }
        g1(D2 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final int q0(int i, S s2, Y y2) {
        o1();
        h1();
        return super.q0(i, s2, y2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final M r() {
        return this.f1517p == 0 ? new r(-2, -1) : new r(-1, -2);
    }

    @Override // g0.L
    public final M s(Context context, AttributeSet attributeSet) {
        r rVar = new r(context, attributeSet);
        rVar.f2470e = -1;
        rVar.f2471f = 0;
        return rVar;
    }

    @Override // g0.L
    public final M t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r rVar = new r((ViewGroup.MarginLayoutParams) layoutParams);
            rVar.f2470e = -1;
            rVar.f2471f = 0;
            return rVar;
        }
        r rVar2 = new r(layoutParams);
        rVar2.f2470e = -1;
        rVar2.f2471f = 0;
        return rVar2;
    }

    @Override // g0.L
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.f1507G == null) {
            super.t0(rect, i, i2);
        }
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1517p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2276b;
            WeakHashMap weakHashMap = T.f423a;
            g3 = L.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1507G;
            g2 = L.g(i, iArr[iArr.length - 1] + F, this.f2276b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2276b;
            WeakHashMap weakHashMap2 = T.f423a;
            g2 = L.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1507G;
            g3 = L.g(i2, iArr2[iArr2.length - 1] + D2, this.f2276b.getMinimumHeight());
        }
        this.f2276b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.L
    public final int x(S s2, Y y2) {
        if (this.f1517p == 1) {
            return this.F;
        }
        if (y2.b() < 1) {
            return 0;
        }
        return j1(y2.b() - 1, s2, y2) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1506E = false;
        this.F = -1;
        this.f1509I = new SparseIntArray();
        this.f1510J = new SparseIntArray();
        this.f1511K = new j(12);
        this.f1512L = new Rect();
        n1(i);
    }
}
