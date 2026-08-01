package androidx.recyclerview.widget;

import G1.AbstractC0001b;
import K.Q;
import L.j;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import g0.C0149m;
import g0.C0152p;
import g0.C0154s;
import g0.C0155t;
import g0.H;
import g0.I;
import g0.N;
import g0.U;
import g0.r;
import java.util.Arrays;
import java.util.WeakHashMap;
import u0.C0365d;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1915E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f1916G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f1917H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1918I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1919J;

    /* renamed from: K, reason: collision with root package name */
    public final C0365d f1920K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1921L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1915E = false;
        this.F = -1;
        this.f1918I = new SparseIntArray();
        this.f1919J = new SparseIntArray();
        this.f1920K = new C0365d(7);
        this.f1921L = new Rect();
        n1(H.I(context, attributeSet, i, i2).f2722b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final boolean B0() {
        return this.f1936z == null && !this.f1915E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(U u2, C0155t c0155t, C0149m c0149m) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = c0155t.d) >= 0 && i < u2.b() && i2 > 0; i3++) {
            c0149m.a(c0155t.d, Math.max(0, c0155t.f2931g));
            this.f1920K.getClass();
            i2--;
            c0155t.d += c0155t.f2929e;
        }
    }

    @Override // g0.H
    public final int J(N n2, U u2) {
        if (this.f1926p == 0) {
            return this.F;
        }
        if (u2.b() < 1) {
            return 0;
        }
        return j1(u2.b() - 1, n2, u2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(N n2, U u2, boolean z2, boolean z3) {
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
        int b2 = u2.b();
        I0();
        int k2 = this.f1928r.k();
        int g2 = this.f1928r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u3 = u(i2);
            int H2 = H.H(u3);
            if (H2 >= 0 && H2 < b2 && k1(H2, n2, u2) == 0) {
                if (((I) u3.getLayoutParams()).f2736a.i()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f1928r.e(u3) < g2 && this.f1928r.b(u3) >= k2) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
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
    
        if (r22.f2724a.f2800c.contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, N n2, U u2) {
        View D2;
        int v2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        N n3 = n2;
        U u3 = u2;
        RecyclerView recyclerView = this.f2725b;
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
        C0152p c0152p = (C0152p) D2.getLayoutParams();
        int i5 = c0152p.f2911e;
        int i6 = c0152p.f2912f + i5;
        if (super.T(view, i, n2, u2) == null) {
            return null;
        }
        if ((H0(i) == 1) != this.f1931u) {
            i3 = v() - 1;
            v2 = -1;
            i2 = -1;
        } else {
            v2 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f1926p == 1 && U0();
        int j12 = j1(i3, n3, u3);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v2) {
            int i13 = v2;
            int j13 = j1(i12, n3, u3);
            View u4 = u(i12);
            if (u4 == D2) {
                break;
            }
            if (!u4.hasFocusable() || j13 == j12) {
                C0152p c0152p2 = (C0152p) u4.getLayoutParams();
                int i14 = c0152p2.f2911e;
                view2 = D2;
                int i15 = c0152p2.f2912f + i14;
                if (u4.hasFocusable() && i14 == i5 && i15 == i6) {
                    return u4;
                }
                if (!(u4.hasFocusable() && view4 == null) && (u4.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (u4.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (!this.f2726c.f(u4) || !this.d.f(u4)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u4.hasFocusable()) {
                                int i16 = c0152p2.f2911e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u4;
                            } else {
                                int i17 = c0152p2.f2911e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u4;
                            }
                            i12 += i9;
                            n3 = n2;
                            u3 = u2;
                            v2 = i13;
                            D2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        n3 = n2;
                        u3 = u2;
                        v2 = i13;
                        D2 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (u4.hasFocusable()) {
                }
                i12 += i9;
                n3 = n2;
                u3 = u2;
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
            n3 = n2;
            u3 = u2;
            v2 = i13;
            D2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // g0.H
    public final void V(N n2, U u2, j jVar) {
        super.V(n2, u2, jVar);
        jVar.h(GridView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f2924b = true;
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
    public final void V0(N n2, U u2, C0155t c0155t, C0154s c0154s) {
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
        int j2 = this.f1928r.j();
        boolean z2 = j2 != 1073741824;
        int i10 = v() > 0 ? this.f1916G[this.F] : 0;
        if (z2) {
            o1();
        }
        boolean z3 = c0155t.f2929e == 1;
        int i11 = this.F;
        if (!z3) {
            i11 = k1(c0155t.d, n2, u2) + l1(c0155t.d, n2, u2);
        }
        int i12 = 0;
        while (i12 < this.F && (i9 = c0155t.d) >= 0 && i9 < u2.b() && i11 > 0) {
            int i13 = c0155t.d;
            int l12 = l1(i13, n2, u2);
            if (l12 > this.F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + l12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i11 -= l12;
            if (i11 < 0 || (b2 = c0155t.b(n2)) == null) {
                break;
            }
            this.f1917H[i12] = b2;
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
            View view = this.f1917H[i];
            C0152p c0152p = (C0152p) view.getLayoutParams();
            int l13 = l1(H.H(view), n2, u2);
            c0152p.f2912f = l13;
            c0152p.f2911e = i14;
            i14 += l13;
            i += i3;
        }
        float f2 = RecyclerView.f1937A0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f1917H[i16];
            if (c0155t.f2933k != null) {
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
            RecyclerView recyclerView = this.f2725b;
            Rect rect = this.f1921L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.M(view2));
            }
            m1(view2, j2, r8);
            int c2 = this.f1928r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d = (this.f1928r.d(view2) * 1.0f) / ((C0152p) view2.getLayoutParams()).f2912f;
            if (d > f2) {
                f2 = d;
            }
        }
        if (z2) {
            g1(Math.max(Math.round(f2 * this.F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f1917H[i17];
                m1(view3, 1073741824, true);
                int c3 = this.f1928r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f1917H[i18];
            if (this.f1928r.c(view4) != i15) {
                C0152p c0152p2 = (C0152p) view4.getLayoutParams();
                Rect rect2 = c0152p2.f2737b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0152p2).topMargin + ((ViewGroup.MarginLayoutParams) c0152p2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0152p2).leftMargin + ((ViewGroup.MarginLayoutParams) c0152p2).rightMargin;
                int i1 = i1(c0152p2.f2911e, c0152p2.f2912f);
                if (this.f1926p == 1) {
                    i8 = H.w(false, i1, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c0152p2).width);
                    w2 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w2 = H.w(false, i1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0152p2).height);
                    i8 = makeMeasureSpec;
                }
                if (y0(view4, i8, w2, (I) view4.getLayoutParams())) {
                    view4.measure(i8, w2);
                }
            }
        }
        c0154s.f2923a = i15;
        if (this.f1926p != 1) {
            if (c0155t.f2930f == -1) {
                int i21 = c0155t.f2927b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0155t.f2927b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0155t.f2930f == -1) {
            i7 = c0155t.f2927b;
            i6 = i7 - i15;
            i5 = 0;
            i4 = 0;
        } else {
            int i23 = c0155t.f2927b;
            i6 = i23;
            i4 = 0;
            i7 = i23 + i15;
            i5 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f1917H[i24];
            C0152p c0152p3 = (C0152p) view5.getLayoutParams();
            if (this.f1926p != 1) {
                i6 = G() + this.f1916G[c0152p3.f2911e];
                i7 = this.f1928r.d(view5) + i6;
            } else if (U0()) {
                int E2 = E() + this.f1916G[this.F - c0152p3.f2911e];
                i4 = E2;
                i5 = E2 - this.f1928r.d(view5);
            } else {
                i5 = E() + this.f1916G[c0152p3.f2911e];
                i4 = this.f1928r.d(view5) + i5;
            }
            H.N(view5, i5, i6, i4, i7);
            if (c0152p3.f2736a.i() || c0152p3.f2736a.l()) {
                c0154s.f2925c = true;
            }
            c0154s.d = view5.hasFocusable() | c0154s.d;
        }
        Arrays.fill(this.f1917H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(N n2, U u2, r rVar, int i) {
        o1();
        if (u2.b() > 0 && !u2.f2764g) {
            boolean z2 = i == 1;
            int k12 = k1(rVar.f2920b, n2, u2);
            if (z2) {
                while (k12 > 0) {
                    int i2 = rVar.f2920b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    rVar.f2920b = i3;
                    k12 = k1(i3, n2, u2);
                }
            } else {
                int b2 = u2.b() - 1;
                int i4 = rVar.f2920b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int k13 = k1(i5, n2, u2);
                    if (k13 <= k12) {
                        break;
                    }
                    i4 = i5;
                    k12 = k13;
                }
                rVar.f2920b = i4;
            }
        }
        h1();
    }

    @Override // g0.H
    public final void X(N n2, U u2, View view, j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0152p)) {
            W(view, jVar);
            return;
        }
        C0152p c0152p = (C0152p) layoutParams;
        int j12 = j1(c0152p.f2736a.b(), n2, u2);
        int i = this.f1926p;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c0152p.f2911e, c0152p.f2912f, j12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(j12, 1, c0152p.f2911e, c0152p.f2912f, false, false));
        }
    }

    @Override // g0.H
    public final void Y(int i, int i2) {
        C0365d c0365d = this.f1920K;
        c0365d.e();
        ((SparseIntArray) c0365d.f4176c).clear();
    }

    @Override // g0.H
    public final void Z() {
        C0365d c0365d = this.f1920K;
        c0365d.e();
        ((SparseIntArray) c0365d.f4176c).clear();
    }

    @Override // g0.H
    public final void a0(int i, int i2) {
        C0365d c0365d = this.f1920K;
        c0365d.e();
        ((SparseIntArray) c0365d.f4176c).clear();
    }

    @Override // g0.H
    public final void b0(int i, int i2) {
        C0365d c0365d = this.f1920K;
        c0365d.e();
        ((SparseIntArray) c0365d.f4176c).clear();
    }

    @Override // g0.H
    public final void c0(int i, int i2) {
        C0365d c0365d = this.f1920K;
        c0365d.e();
        ((SparseIntArray) c0365d.f4176c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.c1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final void d0(N n2, U u2) {
        boolean z2 = u2.f2764g;
        SparseIntArray sparseIntArray = this.f1919J;
        SparseIntArray sparseIntArray2 = this.f1918I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                C0152p c0152p = (C0152p) u(i).getLayoutParams();
                int b2 = c0152p.f2736a.b();
                sparseIntArray2.put(b2, c0152p.f2912f);
                sparseIntArray.put(b2, c0152p.f2911e);
            }
        }
        super.d0(n2, u2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final void e0(U u2) {
        super.e0(u2);
        this.f1915E = false;
    }

    @Override // g0.H
    public final boolean f(I i) {
        return i instanceof C0152p;
    }

    public final void g1(int i) {
        int i2;
        int[] iArr = this.f1916G;
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
        this.f1916G = iArr;
    }

    public final void h1() {
        View[] viewArr = this.f1917H;
        if (viewArr == null || viewArr.length != this.F) {
            this.f1917H = new View[this.F];
        }
    }

    public final int i1(int i, int i2) {
        if (this.f1926p != 1 || !U0()) {
            int[] iArr = this.f1916G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1916G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int j1(int i, N n2, U u2) {
        boolean z2 = u2.f2764g;
        C0365d c0365d = this.f1920K;
        if (!z2) {
            int i2 = this.F;
            c0365d.getClass();
            return C0365d.c(i, i2);
        }
        int b2 = n2.b(i);
        if (b2 != -1) {
            int i3 = this.F;
            c0365d.getClass();
            return C0365d.c(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final int k(U u2) {
        return F0(u2);
    }

    public final int k1(int i, N n2, U u2) {
        boolean z2 = u2.f2764g;
        C0365d c0365d = this.f1920K;
        if (!z2) {
            int i2 = this.F;
            c0365d.getClass();
            return i % i2;
        }
        int i3 = this.f1919J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = n2.b(i);
        if (b2 != -1) {
            int i4 = this.F;
            c0365d.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final int l(U u2) {
        return G0(u2);
    }

    public final int l1(int i, N n2, U u2) {
        boolean z2 = u2.f2764g;
        C0365d c0365d = this.f1920K;
        if (!z2) {
            c0365d.getClass();
            return 1;
        }
        int i2 = this.f1918I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (n2.b(i) != -1) {
            c0365d.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void m1(View view, int i, boolean z2) {
        int i2;
        int i3;
        C0152p c0152p = (C0152p) view.getLayoutParams();
        Rect rect = c0152p.f2737b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0152p).topMargin + ((ViewGroup.MarginLayoutParams) c0152p).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0152p).leftMargin + ((ViewGroup.MarginLayoutParams) c0152p).rightMargin;
        int i1 = i1(c0152p.f2911e, c0152p.f2912f);
        if (this.f1926p == 1) {
            i3 = H.w(false, i1, i, i5, ((ViewGroup.MarginLayoutParams) c0152p).width);
            i2 = H.w(true, this.f1928r.l(), this.f2733m, i4, ((ViewGroup.MarginLayoutParams) c0152p).height);
        } else {
            int w2 = H.w(false, i1, i, i4, ((ViewGroup.MarginLayoutParams) c0152p).height);
            int w3 = H.w(true, this.f1928r.l(), this.f2732l, i5, ((ViewGroup.MarginLayoutParams) c0152p).width);
            i2 = w2;
            i3 = w3;
        }
        I i6 = (I) view.getLayoutParams();
        if (z2 ? y0(view, i3, i2, i6) : w0(view, i3, i2, i6)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final int n(U u2) {
        return F0(u2);
    }

    public final void n1(int i) {
        if (i == this.F) {
            return;
        }
        this.f1915E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0001b.f("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.f1920K.e();
        n0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final int o(U u2) {
        return G0(u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final int o0(int i, N n2, U u2) {
        o1();
        h1();
        return super.o0(i, n2, u2);
    }

    public final void o1() {
        int D2;
        int G2;
        if (this.f1926p == 1) {
            D2 = this.f2734n - F();
            G2 = E();
        } else {
            D2 = this.f2735o - D();
            G2 = G();
        }
        g1(D2 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final int q0(int i, N n2, U u2) {
        o1();
        h1();
        return super.q0(i, n2, u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.H
    public final I r() {
        return this.f1926p == 0 ? new C0152p(-2, -1) : new C0152p(-1, -2);
    }

    @Override // g0.H
    public final I s(Context context, AttributeSet attributeSet) {
        C0152p c0152p = new C0152p(context, attributeSet);
        c0152p.f2911e = -1;
        c0152p.f2912f = 0;
        return c0152p;
    }

    @Override // g0.H
    public final I t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0152p c0152p = new C0152p((ViewGroup.MarginLayoutParams) layoutParams);
            c0152p.f2911e = -1;
            c0152p.f2912f = 0;
            return c0152p;
        }
        C0152p c0152p2 = new C0152p(layoutParams);
        c0152p2.f2911e = -1;
        c0152p2.f2912f = 0;
        return c0152p2;
    }

    @Override // g0.H
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.f1916G == null) {
            super.t0(rect, i, i2);
        }
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1926p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2725b;
            WeakHashMap weakHashMap = Q.f578a;
            g3 = H.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1916G;
            g2 = H.g(i, iArr[iArr.length - 1] + F, this.f2725b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2725b;
            WeakHashMap weakHashMap2 = Q.f578a;
            g2 = H.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1916G;
            g3 = H.g(i2, iArr2[iArr2.length - 1] + D2, this.f2725b.getMinimumHeight());
        }
        this.f2725b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.H
    public final int x(N n2, U u2) {
        if (this.f1926p == 1) {
            return this.F;
        }
        if (u2.b() < 1) {
            return 0;
        }
        return j1(u2.b() - 1, n2, u2) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1915E = false;
        this.F = -1;
        this.f1918I = new SparseIntArray();
        this.f1919J = new SparseIntArray();
        this.f1920K = new C0365d(7);
        this.f1921L = new Rect();
        n1(i);
    }
}
