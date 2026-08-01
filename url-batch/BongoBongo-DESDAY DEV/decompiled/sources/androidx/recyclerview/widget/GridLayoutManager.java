package androidx.recyclerview.widget;

import C.j;
import L.T;
import Z.V;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import h0.C0132n;
import h0.C0135q;
import h0.C0136s;
import h0.C0137t;
import h0.C0138u;
import h0.J;
import h0.K;
import h0.P;
import h0.W;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1600E;

    /* renamed from: F, reason: collision with root package name */
    public int f1601F;
    public int[] G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f1602H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1603I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1604J;

    /* renamed from: K, reason: collision with root package name */
    public final j f1605K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1606L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1600E = false;
        this.f1601F = -1;
        this.f1603I = new SparseIntArray();
        this.f1604J = new SparseIntArray();
        this.f1605K = new j(11);
        this.f1606L = new Rect();
        n1(J.I(context, attributeSet, i, i2).f2394b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final boolean B0() {
        return this.f1621z == null && !this.f1600E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(W w2, C0138u c0138u, C0132n c0132n) {
        int i;
        int i2 = this.f1601F;
        for (int i3 = 0; i3 < this.f1601F && (i = c0138u.d) >= 0 && i < w2.b() && i2 > 0; i3++) {
            c0132n.a(c0138u.d, Math.max(0, c0138u.f2617g));
            this.f1605K.getClass();
            i2--;
            c0138u.d += c0138u.f2615e;
        }
    }

    @Override // h0.J
    public final int J(P p2, W w2) {
        if (this.f1611p == 0) {
            return this.f1601F;
        }
        if (w2.b() < 1) {
            return 0;
        }
        return j1(w2.b() - 1, p2, w2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(P p2, W w2, boolean z2, boolean z3) {
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
        int b2 = w2.b();
        I0();
        int k2 = this.f1613r.k();
        int g2 = this.f1613r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = J.H(u2);
            if (H2 >= 0 && H2 < b2 && k1(H2, p2, w2) == 0) {
                if (((K) u2.getLayoutParams()).f2409a.i()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1613r.e(u2) < g2 && this.f1613r.b(u2) >= k2) {
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
    
        if (r22.f2396a.f2478c.contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, P p2, W w2) {
        View D2;
        int v2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        P p3 = p2;
        W w3 = w2;
        RecyclerView recyclerView = this.f2397b;
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
        C0135q c0135q = (C0135q) D2.getLayoutParams();
        int i5 = c0135q.f2596e;
        int i6 = c0135q.f2597f + i5;
        if (super.T(view, i, p2, w2) == null) {
            return null;
        }
        if ((H0(i) == 1) != this.f1616u) {
            i3 = v() - 1;
            v2 = -1;
            i2 = -1;
        } else {
            v2 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f1611p == 1 && U0();
        int j12 = j1(i3, p3, w3);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v2) {
            int i13 = v2;
            int j13 = j1(i12, p3, w3);
            View u2 = u(i12);
            if (u2 == D2) {
                break;
            }
            if (!u2.hasFocusable() || j13 == j12) {
                C0135q c0135q2 = (C0135q) u2.getLayoutParams();
                int i14 = c0135q2.f2596e;
                view2 = D2;
                int i15 = c0135q2.f2597f + i14;
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
                        if (!this.f2398c.y(u2) || !this.d.y(u2)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u2.hasFocusable()) {
                                int i16 = c0135q2.f2596e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u2;
                            } else {
                                int i17 = c0135q2.f2596e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u2;
                            }
                            i12 += i9;
                            p3 = p2;
                            w3 = w2;
                            v2 = i13;
                            D2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        p3 = p2;
                        w3 = w2;
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
                p3 = p2;
                w3 = w2;
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
            p3 = p2;
            w3 = w2;
            v2 = i13;
            D2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // h0.J
    public final void V(P p2, W w2, M.j jVar) {
        super.V(p2, w2, jVar);
        jVar.h(GridView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f2610b = true;
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
    public final void V0(P p2, W w2, C0138u c0138u, C0137t c0137t) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int w3;
        int i8;
        ?? r8;
        int i9;
        View b2;
        int j2 = this.f1613r.j();
        boolean z2 = j2 != 1073741824;
        int i10 = v() > 0 ? this.G[this.f1601F] : 0;
        if (z2) {
            o1();
        }
        boolean z3 = c0138u.f2615e == 1;
        int i11 = this.f1601F;
        if (!z3) {
            i11 = k1(c0138u.d, p2, w2) + l1(c0138u.d, p2, w2);
        }
        int i12 = 0;
        while (i12 < this.f1601F && (i9 = c0138u.d) >= 0 && i9 < w2.b() && i11 > 0) {
            int i13 = c0138u.d;
            int l12 = l1(i13, p2, w2);
            if (l12 > this.f1601F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + l12 + " spans but GridLayoutManager has only " + this.f1601F + " spans.");
            }
            i11 -= l12;
            if (i11 < 0 || (b2 = c0138u.b(p2)) == null) {
                break;
            }
            this.f1602H[i12] = b2;
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
            View view = this.f1602H[i];
            C0135q c0135q = (C0135q) view.getLayoutParams();
            int l13 = l1(J.H(view), p2, w2);
            c0135q.f2597f = l13;
            c0135q.f2596e = i14;
            i14 += l13;
            i += i3;
        }
        float f2 = RecyclerView.A0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f1602H[i16];
            if (c0138u.f2620k != null) {
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
            RecyclerView recyclerView = this.f2397b;
            Rect rect = this.f1606L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.M(view2));
            }
            m1(view2, j2, r8);
            int c2 = this.f1613r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d = (this.f1613r.d(view2) * 1.0f) / ((C0135q) view2.getLayoutParams()).f2597f;
            if (d > f2) {
                f2 = d;
            }
        }
        if (z2) {
            g1(Math.max(Math.round(f2 * this.f1601F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f1602H[i17];
                m1(view3, 1073741824, true);
                int c3 = this.f1613r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f1602H[i18];
            if (this.f1613r.c(view4) != i15) {
                C0135q c0135q2 = (C0135q) view4.getLayoutParams();
                Rect rect2 = c0135q2.f2410b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0135q2).topMargin + ((ViewGroup.MarginLayoutParams) c0135q2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0135q2).leftMargin + ((ViewGroup.MarginLayoutParams) c0135q2).rightMargin;
                int i110 = i1(c0135q2.f2596e, c0135q2.f2597f);
                if (this.f1611p == 1) {
                    i8 = J.w(false, i110, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c0135q2).width);
                    w3 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w3 = J.w(false, i110, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0135q2).height);
                    i8 = makeMeasureSpec;
                }
                if (y0(view4, i8, w3, (K) view4.getLayoutParams())) {
                    view4.measure(i8, w3);
                }
            }
        }
        c0137t.f2609a = i15;
        if (this.f1611p != 1) {
            if (c0138u.f2616f == -1) {
                int i21 = c0138u.f2613b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0138u.f2613b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0138u.f2616f == -1) {
            i7 = c0138u.f2613b;
            i6 = i7 - i15;
            i5 = 0;
            i4 = 0;
        } else {
            int i23 = c0138u.f2613b;
            i6 = i23;
            i4 = 0;
            i7 = i23 + i15;
            i5 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f1602H[i24];
            C0135q c0135q3 = (C0135q) view5.getLayoutParams();
            if (this.f1611p != 1) {
                i6 = G() + this.G[c0135q3.f2596e];
                i7 = this.f1613r.d(view5) + i6;
            } else if (U0()) {
                int E2 = E() + this.G[this.f1601F - c0135q3.f2596e];
                i4 = E2;
                i5 = E2 - this.f1613r.d(view5);
            } else {
                i5 = E() + this.G[c0135q3.f2596e];
                i4 = this.f1613r.d(view5) + i5;
            }
            J.N(view5, i5, i6, i4, i7);
            if (c0135q3.f2409a.i() || c0135q3.f2409a.l()) {
                c0137t.f2611c = true;
            }
            c0137t.d = view5.hasFocusable() | c0137t.d;
        }
        Arrays.fill(this.f1602H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(P p2, W w2, C0136s c0136s, int i) {
        o1();
        if (w2.b() > 0 && !w2.f2438g) {
            boolean z2 = i == 1;
            int k12 = k1(c0136s.f2606b, p2, w2);
            if (z2) {
                while (k12 > 0) {
                    int i2 = c0136s.f2606b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0136s.f2606b = i3;
                    k12 = k1(i3, p2, w2);
                }
            } else {
                int b2 = w2.b() - 1;
                int i4 = c0136s.f2606b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int k13 = k1(i5, p2, w2);
                    if (k13 <= k12) {
                        break;
                    }
                    i4 = i5;
                    k12 = k13;
                }
                c0136s.f2606b = i4;
            }
        }
        h1();
    }

    @Override // h0.J
    public final void X(P p2, W w2, View view, M.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0135q)) {
            W(view, jVar);
            return;
        }
        C0135q c0135q = (C0135q) layoutParams;
        int j12 = j1(c0135q.f2409a.b(), p2, w2);
        int i = this.f1611p;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f615a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c0135q.f2596e, c0135q.f2597f, j12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(j12, 1, c0135q.f2596e, c0135q.f2597f, false, false));
        }
    }

    @Override // h0.J
    public final void Y(int i, int i2) {
        j jVar = this.f1605K;
        jVar.x();
        ((SparseIntArray) jVar.f87c).clear();
    }

    @Override // h0.J
    public final void Z() {
        j jVar = this.f1605K;
        jVar.x();
        ((SparseIntArray) jVar.f87c).clear();
    }

    @Override // h0.J
    public final void a0(int i, int i2) {
        j jVar = this.f1605K;
        jVar.x();
        ((SparseIntArray) jVar.f87c).clear();
    }

    @Override // h0.J
    public final void b0(int i, int i2) {
        j jVar = this.f1605K;
        jVar.x();
        ((SparseIntArray) jVar.f87c).clear();
    }

    @Override // h0.J
    public final void c0(int i, int i2) {
        j jVar = this.f1605K;
        jVar.x();
        ((SparseIntArray) jVar.f87c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.c1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final void d0(P p2, W w2) {
        boolean z2 = w2.f2438g;
        SparseIntArray sparseIntArray = this.f1604J;
        SparseIntArray sparseIntArray2 = this.f1603I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                C0135q c0135q = (C0135q) u(i).getLayoutParams();
                int b2 = c0135q.f2409a.b();
                sparseIntArray2.put(b2, c0135q.f2597f);
                sparseIntArray.put(b2, c0135q.f2596e);
            }
        }
        super.d0(p2, w2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final void e0(W w2) {
        super.e0(w2);
        this.f1600E = false;
    }

    @Override // h0.J
    public final boolean f(K k2) {
        return k2 instanceof C0135q;
    }

    public final void g1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.f1601F;
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

    public final void h1() {
        View[] viewArr = this.f1602H;
        if (viewArr == null || viewArr.length != this.f1601F) {
            this.f1602H = new View[this.f1601F];
        }
    }

    public final int i1(int i, int i2) {
        if (this.f1611p != 1 || !U0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.f1601F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int j1(int i, P p2, W w2) {
        boolean z2 = w2.f2438g;
        j jVar = this.f1605K;
        if (!z2) {
            int i2 = this.f1601F;
            jVar.getClass();
            return j.w(i, i2);
        }
        int b2 = p2.b(i);
        if (b2 != -1) {
            int i3 = this.f1601F;
            jVar.getClass();
            return j.w(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final int k(W w2) {
        return F0(w2);
    }

    public final int k1(int i, P p2, W w2) {
        boolean z2 = w2.f2438g;
        j jVar = this.f1605K;
        if (!z2) {
            int i2 = this.f1601F;
            jVar.getClass();
            return i % i2;
        }
        int i3 = this.f1604J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = p2.b(i);
        if (b2 != -1) {
            int i4 = this.f1601F;
            jVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final int l(W w2) {
        return G0(w2);
    }

    public final int l1(int i, P p2, W w2) {
        boolean z2 = w2.f2438g;
        j jVar = this.f1605K;
        if (!z2) {
            jVar.getClass();
            return 1;
        }
        int i2 = this.f1603I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (p2.b(i) != -1) {
            jVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void m1(View view, int i, boolean z2) {
        int i2;
        int i3;
        C0135q c0135q = (C0135q) view.getLayoutParams();
        Rect rect = c0135q.f2410b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0135q).topMargin + ((ViewGroup.MarginLayoutParams) c0135q).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0135q).leftMargin + ((ViewGroup.MarginLayoutParams) c0135q).rightMargin;
        int i12 = i1(c0135q.f2596e, c0135q.f2597f);
        if (this.f1611p == 1) {
            i3 = J.w(false, i12, i, i5, ((ViewGroup.MarginLayoutParams) c0135q).width);
            i2 = J.w(true, this.f1613r.l(), this.f2406m, i4, ((ViewGroup.MarginLayoutParams) c0135q).height);
        } else {
            int w2 = J.w(false, i12, i, i4, ((ViewGroup.MarginLayoutParams) c0135q).height);
            int w3 = J.w(true, this.f1613r.l(), this.f2405l, i5, ((ViewGroup.MarginLayoutParams) c0135q).width);
            i2 = w2;
            i3 = w3;
        }
        K k2 = (K) view.getLayoutParams();
        if (z2 ? y0(view, i3, i2, k2) : w0(view, i3, i2, k2)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final int n(W w2) {
        return F0(w2);
    }

    public final void n1(int i) {
        if (i == this.f1601F) {
            return;
        }
        this.f1600E = true;
        if (i < 1) {
            throw new IllegalArgumentException(V.e("Span count should be at least 1. Provided ", i));
        }
        this.f1601F = i;
        this.f1605K.x();
        n0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final int o(W w2) {
        return G0(w2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final int o0(int i, P p2, W w2) {
        o1();
        h1();
        return super.o0(i, p2, w2);
    }

    public final void o1() {
        int D2;
        int G;
        if (this.f1611p == 1) {
            D2 = this.f2407n - F();
            G = E();
        } else {
            D2 = this.f2408o - D();
            G = G();
        }
        g1(D2 - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final int q0(int i, P p2, W w2) {
        o1();
        h1();
        return super.q0(i, p2, w2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final K r() {
        return this.f1611p == 0 ? new C0135q(-2, -1) : new C0135q(-1, -2);
    }

    @Override // h0.J
    public final K s(Context context, AttributeSet attributeSet) {
        C0135q c0135q = new C0135q(context, attributeSet);
        c0135q.f2596e = -1;
        c0135q.f2597f = 0;
        return c0135q;
    }

    @Override // h0.J
    public final K t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0135q c0135q = new C0135q((ViewGroup.MarginLayoutParams) layoutParams);
            c0135q.f2596e = -1;
            c0135q.f2597f = 0;
            return c0135q;
        }
        C0135q c0135q2 = new C0135q(layoutParams);
        c0135q2.f2596e = -1;
        c0135q2.f2597f = 0;
        return c0135q2;
    }

    @Override // h0.J
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.G == null) {
            super.t0(rect, i, i2);
        }
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1611p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2397b;
            WeakHashMap weakHashMap = T.f490a;
            g3 = J.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g2 = J.g(i, iArr[iArr.length - 1] + F2, this.f2397b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f2397b;
            WeakHashMap weakHashMap2 = T.f490a;
            g2 = J.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g3 = J.g(i2, iArr2[iArr2.length - 1] + D2, this.f2397b.getMinimumHeight());
        }
        this.f2397b.setMeasuredDimension(g2, g3);
    }

    @Override // h0.J
    public final int x(P p2, W w2) {
        if (this.f1611p == 1) {
            return this.f1601F;
        }
        if (w2.b() < 1) {
            return 0;
        }
        return j1(w2.b() - 1, p2, w2) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1600E = false;
        this.f1601F = -1;
        this.f1603I = new SparseIntArray();
        this.f1604J = new SparseIntArray();
        this.f1605K = new j(11);
        this.f1606L = new Rect();
        n1(i);
    }
}
