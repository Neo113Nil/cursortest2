package androidx.recyclerview.widget;

import D.j;
import M.Q;
import N.i;
import X0.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import h0.C0126m;
import h0.C0129p;
import h0.C0131s;
import h0.C0132t;
import h0.I;
import h0.J;
import h0.O;
import h0.U;
import h0.r;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1594E;

    /* renamed from: F, reason: collision with root package name */
    public int f1595F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f1596G;
    public View[] H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1597I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1598J;

    /* renamed from: K, reason: collision with root package name */
    public final j f1599K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1600L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1594E = false;
        this.f1595F = -1;
        this.f1597I = new SparseIntArray();
        this.f1598J = new SparseIntArray();
        this.f1599K = new j(12);
        this.f1600L = new Rect();
        l1(I.I(context, attributeSet, i, i2).f2377b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(U u2, C0132t c0132t, C0126m c0126m) {
        int i;
        int i2 = this.f1595F;
        for (int i3 = 0; i3 < this.f1595F && (i = c0132t.d) >= 0 && i < u2.b() && i2 > 0; i3++) {
            c0126m.a(c0132t.d, Math.max(0, c0132t.f2586g));
            this.f1599K.getClass();
            i2--;
            c0132t.d += c0132t.f2584e;
        }
    }

    @Override // h0.I
    public final int J(O o2, U u2) {
        if (this.f1605p == 0) {
            return this.f1595F;
        }
        if (u2.b() < 1) {
            return 0;
        }
        return h1(u2.b() - 1, o2, u2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(O o2, U u2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1607r.k();
        int g2 = this.f1607r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u3 = u(i);
            int H = I.H(u3);
            if (H >= 0 && H < i3 && i1(H, o2, u2) == 0) {
                if (((J) u3.getLayoutParams()).f2391a.i()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f1607r.e(u3) < g2 && this.f1607r.b(u3) >= k2) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
    
        if (r13 == (r2 > r8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0022, code lost:
    
        if (((java.util.ArrayList) r22.f2379a.d).contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, O o2, U u2) {
        View A2;
        int v2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        O o3 = o2;
        U u3 = u2;
        RecyclerView recyclerView = this.f2380b;
        View view4 = null;
        if (recyclerView != null) {
            A2 = recyclerView.A(view);
            if (A2 != null) {
            }
        }
        A2 = null;
        if (A2 == null) {
            return null;
        }
        C0129p c0129p = (C0129p) A2.getLayoutParams();
        int i5 = c0129p.f2566e;
        int i6 = c0129p.f2567f + i5;
        if (super.S(view, i, o2, u2) == null) {
            return null;
        }
        if ((F0(i) == 1) != this.f1610u) {
            i3 = v() - 1;
            v2 = -1;
            i2 = -1;
        } else {
            v2 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f1605p == 1 && S0();
        int h12 = h1(i3, o3, u3);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v2) {
            int i13 = v2;
            int h13 = h1(i12, o3, u3);
            View u4 = u(i12);
            if (u4 == A2) {
                break;
            }
            if (!u4.hasFocusable() || h13 == h12) {
                C0129p c0129p2 = (C0129p) u4.getLayoutParams();
                int i14 = c0129p2.f2566e;
                view2 = A2;
                int i15 = c0129p2.f2567f + i14;
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
                        if (!this.f2381c.y(u4) || !this.d.y(u4)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u4.hasFocusable()) {
                                int i16 = c0129p2.f2566e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u4;
                            } else {
                                int i17 = c0129p2.f2566e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u4;
                            }
                            i12 += i9;
                            o3 = o2;
                            u3 = u2;
                            v2 = i13;
                            A2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        o3 = o2;
                        u3 = u2;
                        v2 = i13;
                        A2 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (u4.hasFocusable()) {
                }
                i12 += i9;
                o3 = o2;
                u3 = u2;
                v2 = i13;
                A2 = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = A2;
                view3 = view5;
            }
            i4 = i10;
            i10 = i4;
            view5 = view3;
            i12 += i9;
            o3 = o2;
            u3 = u2;
            v2 = i13;
            A2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f2579b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(O o2, U u2, C0132t c0132t, C0131s c0131s) {
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
        int j2 = this.f1607r.j();
        boolean z2 = j2 != 1073741824;
        int i10 = v() > 0 ? this.f1596G[this.f1595F] : 0;
        if (z2) {
            m1();
        }
        boolean z3 = c0132t.f2584e == 1;
        int i11 = this.f1595F;
        if (!z3) {
            i11 = i1(c0132t.d, o2, u2) + j1(c0132t.d, o2, u2);
        }
        int i12 = 0;
        while (i12 < this.f1595F && (i9 = c0132t.d) >= 0 && i9 < u2.b() && i11 > 0) {
            int i13 = c0132t.d;
            int j12 = j1(i13, o2, u2);
            if (j12 > this.f1595F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + j12 + " spans but GridLayoutManager has only " + this.f1595F + " spans.");
            }
            i11 -= j12;
            if (i11 < 0 || (b2 = c0132t.b(o2)) == null) {
                break;
            }
            this.H[i12] = b2;
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
            View view = this.H[i];
            C0129p c0129p = (C0129p) view.getLayoutParams();
            int j13 = j1(I.H(view), o2, u2);
            c0129p.f2567f = j13;
            c0129p.f2566e = i14;
            i14 += j13;
            i += i3;
        }
        float f2 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.H[i16];
            if (c0132t.f2588k != null) {
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
            RecyclerView recyclerView = this.f2380b;
            Rect rect = this.f1600L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j2, r8);
            int c2 = this.f1607r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d = (this.f1607r.d(view2) * 1.0f) / ((C0129p) view2.getLayoutParams()).f2567f;
            if (d > f2) {
                f2 = d;
            }
        }
        if (z2) {
            e1(Math.max(Math.round(f2 * this.f1595F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.H[i17];
                k1(view3, 1073741824, true);
                int c3 = this.f1607r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.H[i18];
            if (this.f1607r.c(view4) != i15) {
                C0129p c0129p2 = (C0129p) view4.getLayoutParams();
                Rect rect2 = c0129p2.f2392b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0129p2).topMargin + ((ViewGroup.MarginLayoutParams) c0129p2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0129p2).leftMargin + ((ViewGroup.MarginLayoutParams) c0129p2).rightMargin;
                int g12 = g1(c0129p2.f2566e, c0129p2.f2567f);
                if (this.f1605p == 1) {
                    i8 = I.w(false, g12, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c0129p2).width);
                    w2 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w2 = I.w(false, g12, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0129p2).height);
                    i8 = makeMeasureSpec;
                }
                if (w0(view4, i8, w2, (J) view4.getLayoutParams())) {
                    view4.measure(i8, w2);
                }
            }
        }
        c0131s.f2578a = i15;
        if (this.f1605p != 1) {
            if (c0132t.f2585f == -1) {
                int i21 = c0132t.f2582b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0132t.f2582b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0132t.f2585f == -1) {
            int i23 = c0132t.f2582b;
            i5 = 0;
            i4 = 0;
            i7 = i23 - i15;
            i6 = i23;
        } else {
            i7 = c0132t.f2582b;
            i6 = i7 + i15;
            i5 = 0;
            i4 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.H[i24];
            C0129p c0129p3 = (C0129p) view5.getLayoutParams();
            if (this.f1605p != 1) {
                int G2 = G() + this.f1596G[c0129p3.f2566e];
                i7 = G2;
                i6 = this.f1607r.d(view5) + G2;
            } else if (S0()) {
                int E2 = E() + this.f1596G[this.f1595F - c0129p3.f2566e];
                i4 = E2;
                i5 = E2 - this.f1607r.d(view5);
            } else {
                i5 = E() + this.f1596G[c0129p3.f2566e];
                i4 = this.f1607r.d(view5) + i5;
            }
            I.N(view5, i5, i7, i4, i6);
            if (c0129p3.f2391a.i() || c0129p3.f2391a.l()) {
                c0131s.f2580c = true;
            }
            c0131s.d = view5.hasFocusable() | c0131s.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(O o2, U u2, r rVar, int i) {
        m1();
        if (u2.b() > 0 && !u2.f2417g) {
            boolean z2 = i == 1;
            int i12 = i1(rVar.f2575b, o2, u2);
            if (z2) {
                while (i12 > 0) {
                    int i2 = rVar.f2575b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    rVar.f2575b = i3;
                    i12 = i1(i3, o2, u2);
                }
            } else {
                int b2 = u2.b() - 1;
                int i4 = rVar.f2575b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int i13 = i1(i5, o2, u2);
                    if (i13 <= i12) {
                        break;
                    }
                    i4 = i5;
                    i12 = i13;
                }
                rVar.f2575b = i4;
            }
        }
        f1();
    }

    @Override // h0.I
    public final void V(O o2, U u2, View view, N.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0129p)) {
            U(view, jVar);
            return;
        }
        C0129p c0129p = (C0129p) layoutParams;
        int h12 = h1(c0129p.f2391a.b(), o2, u2);
        if (this.f1605p == 0) {
            jVar.h(i.a(false, c0129p.f2566e, c0129p.f2567f, h12, 1));
        } else {
            jVar.h(i.a(false, h12, 1, c0129p.f2566e, c0129p.f2567f));
        }
    }

    @Override // h0.I
    public final void W(int i, int i2) {
        j jVar = this.f1599K;
        jVar.x();
        ((SparseIntArray) jVar.f134c).clear();
    }

    @Override // h0.I
    public final void X() {
        j jVar = this.f1599K;
        jVar.x();
        ((SparseIntArray) jVar.f134c).clear();
    }

    @Override // h0.I
    public final void Y(int i, int i2) {
        j jVar = this.f1599K;
        jVar.x();
        ((SparseIntArray) jVar.f134c).clear();
    }

    @Override // h0.I
    public final void Z(int i, int i2) {
        j jVar = this.f1599K;
        jVar.x();
        ((SparseIntArray) jVar.f134c).clear();
    }

    @Override // h0.I
    public final void a0(int i, int i2) {
        j jVar = this.f1599K;
        jVar.x();
        ((SparseIntArray) jVar.f134c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final void b0(O o2, U u2) {
        boolean z2 = u2.f2417g;
        SparseIntArray sparseIntArray = this.f1598J;
        SparseIntArray sparseIntArray2 = this.f1597I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                C0129p c0129p = (C0129p) u(i).getLayoutParams();
                int b2 = c0129p.f2391a.b();
                sparseIntArray2.put(b2, c0129p.f2567f);
                sparseIntArray.put(b2, c0129p.f2566e);
            }
        }
        super.b0(o2, u2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final void c0(U u2) {
        super.c0(u2);
        this.f1594E = false;
    }

    public final void e1(int i) {
        int i2;
        int[] iArr = this.f1596G;
        int i3 = this.f1595F;
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
        this.f1596G = iArr;
    }

    @Override // h0.I
    public final boolean f(J j2) {
        return j2 instanceof C0129p;
    }

    public final void f1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.f1595F) {
            this.H = new View[this.f1595F];
        }
    }

    public final int g1(int i, int i2) {
        if (this.f1605p != 1 || !S0()) {
            int[] iArr = this.f1596G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1596G;
        int i3 = this.f1595F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int h1(int i, O o2, U u2) {
        boolean z2 = u2.f2417g;
        j jVar = this.f1599K;
        if (!z2) {
            int i2 = this.f1595F;
            jVar.getClass();
            return j.w(i, i2);
        }
        int b2 = o2.b(i);
        if (b2 != -1) {
            int i3 = this.f1595F;
            jVar.getClass();
            return j.w(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, O o2, U u2) {
        boolean z2 = u2.f2417g;
        j jVar = this.f1599K;
        if (!z2) {
            int i2 = this.f1595F;
            jVar.getClass();
            return i % i2;
        }
        int i3 = this.f1598J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = o2.b(i);
        if (b2 != -1) {
            int i4 = this.f1595F;
            jVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, O o2, U u2) {
        boolean z2 = u2.f2417g;
        j jVar = this.f1599K;
        if (!z2) {
            jVar.getClass();
            return 1;
        }
        int i2 = this.f1597I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (o2.b(i) != -1) {
            jVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final int k(U u2) {
        return D0(u2);
    }

    public final void k1(View view, int i, boolean z2) {
        int i2;
        int i3;
        C0129p c0129p = (C0129p) view.getLayoutParams();
        Rect rect = c0129p.f2392b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0129p).topMargin + ((ViewGroup.MarginLayoutParams) c0129p).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0129p).leftMargin + ((ViewGroup.MarginLayoutParams) c0129p).rightMargin;
        int g12 = g1(c0129p.f2566e, c0129p.f2567f);
        if (this.f1605p == 1) {
            i3 = I.w(false, g12, i, i5, ((ViewGroup.MarginLayoutParams) c0129p).width);
            i2 = I.w(true, this.f1607r.l(), this.f2388m, i4, ((ViewGroup.MarginLayoutParams) c0129p).height);
        } else {
            int w2 = I.w(false, g12, i, i4, ((ViewGroup.MarginLayoutParams) c0129p).height);
            int w3 = I.w(true, this.f1607r.l(), this.f2387l, i5, ((ViewGroup.MarginLayoutParams) c0129p).width);
            i2 = w2;
            i3 = w3;
        }
        J j2 = (J) view.getLayoutParams();
        if (z2 ? w0(view, i3, i2, j2) : u0(view, i3, i2, j2)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final int l(U u2) {
        return E0(u2);
    }

    public final void l1(int i) {
        if (i == this.f1595F) {
            return;
        }
        this.f1594E = true;
        if (i < 1) {
            throw new IllegalArgumentException(a.e("Span count should be at least 1. Provided ", i));
        }
        this.f1595F = i;
        this.f1599K.x();
        l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final int m0(int i, O o2, U u2) {
        m1();
        f1();
        return super.m0(i, o2, u2);
    }

    public final void m1() {
        int D2;
        int G2;
        if (this.f1605p == 1) {
            D2 = this.f2389n - F();
            G2 = E();
        } else {
            D2 = this.f2390o - D();
            G2 = G();
        }
        e1(D2 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final int n(U u2) {
        return D0(u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final int o(U u2) {
        return E0(u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final int o0(int i, O o2, U u2) {
        m1();
        f1();
        return super.o0(i, o2, u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final J r() {
        return this.f1605p == 0 ? new C0129p(-2, -1) : new C0129p(-1, -2);
    }

    @Override // h0.I
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.f1596G == null) {
            super.r0(rect, i, i2);
        }
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1605p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2380b;
            WeakHashMap weakHashMap = Q.f513a;
            g3 = I.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1596G;
            g2 = I.g(i, iArr[iArr.length - 1] + F2, this.f2380b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f2380b;
            WeakHashMap weakHashMap2 = Q.f513a;
            g2 = I.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1596G;
            g3 = I.g(i2, iArr2[iArr2.length - 1] + D2, this.f2380b.getMinimumHeight());
        }
        this.f2380b.setMeasuredDimension(g2, g3);
    }

    @Override // h0.I
    public final J s(Context context, AttributeSet attributeSet) {
        C0129p c0129p = new C0129p(context, attributeSet);
        c0129p.f2566e = -1;
        c0129p.f2567f = 0;
        return c0129p;
    }

    @Override // h0.I
    public final J t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0129p c0129p = new C0129p((ViewGroup.MarginLayoutParams) layoutParams);
            c0129p.f2566e = -1;
            c0129p.f2567f = 0;
            return c0129p;
        }
        C0129p c0129p2 = new C0129p(layoutParams);
        c0129p2.f2566e = -1;
        c0129p2.f2567f = 0;
        return c0129p2;
    }

    @Override // h0.I
    public final int x(O o2, U u2) {
        if (this.f1605p == 1) {
            return this.f1595F;
        }
        if (u2.b() < 1) {
            return 0;
        }
        return h1(u2.b() - 1, o2, u2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final boolean z0() {
        return this.f1615z == null && !this.f1594E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1594E = false;
        this.f1595F = -1;
        this.f1597I = new SparseIntArray();
        this.f1598J = new SparseIntArray();
        this.f1599K = new j(12);
        this.f1600L = new Rect();
        l1(i);
    }
}
