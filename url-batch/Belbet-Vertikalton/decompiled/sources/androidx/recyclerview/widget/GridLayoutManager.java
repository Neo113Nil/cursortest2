package androidx.recyclerview.widget;

import B1.c;
import G1.AbstractC0001b;
import M.P;
import N.h;
import N.i;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC0141G;
import h0.C0142H;
import h0.C0147M;
import h0.C0162l;
import h0.C0165o;
import h0.C0167q;
import h0.C0168s;
import h0.S;
import h0.r;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1966E;

    /* renamed from: F, reason: collision with root package name */
    public int f1967F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f1968G;
    public View[] H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1969I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1970J;

    /* renamed from: K, reason: collision with root package name */
    public final c f1971K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1972L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1966E = false;
        this.f1967F = -1;
        this.f1969I = new SparseIntArray();
        this.f1970J = new SparseIntArray();
        this.f1971K = new c(14);
        this.f1972L = new Rect();
        l1(AbstractC0141G.I(context, attributeSet, i, i2).f2901b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(S s2, C0168s c0168s, C0162l c0162l) {
        int i;
        int i2 = this.f1967F;
        for (int i3 = 0; i3 < this.f1967F && (i = c0168s.f3108d) >= 0 && i < s2.b() && i2 > 0; i3++) {
            c0162l.a(c0168s.f3108d, Math.max(0, c0168s.f3110g));
            this.f1971K.getClass();
            i2--;
            c0168s.f3108d += c0168s.e;
        }
    }

    @Override // h0.AbstractC0141G
    public final int J(C0147M c0147m, S s2) {
        if (this.f1977p == 0) {
            return this.f1967F;
        }
        if (s2.b() < 1) {
            return 0;
        }
        return h1(s2.b() - 1, c0147m, s2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(C0147M c0147m, S s2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1979r.k();
        int g2 = this.f1979r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u2 = u(i);
            int H = AbstractC0141G.H(u2);
            if (H >= 0 && H < i3 && i1(H, c0147m, s2) == 0) {
                if (((C0142H) u2.getLayoutParams()).f2916a.i()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1979r.e(u2) < g2 && this.f1979r.b(u2) >= k2) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
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
    
        if (((java.util.ArrayList) r22.f2904a.f593d).contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, C0147M c0147m, S s2) {
        View A2;
        int v2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        C0147M c0147m2 = c0147m;
        S s3 = s2;
        RecyclerView recyclerView = this.f2905b;
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
        C0165o c0165o = (C0165o) A2.getLayoutParams();
        int i5 = c0165o.e;
        int i6 = c0165o.f3089f + i5;
        if (super.S(view, i, c0147m, s2) == null) {
            return null;
        }
        if ((F0(i) == 1) != this.f1982u) {
            i3 = v() - 1;
            v2 = -1;
            i2 = -1;
        } else {
            v2 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f1977p == 1 && S0();
        int h1 = h1(i3, c0147m2, s3);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v2) {
            int i13 = v2;
            int h12 = h1(i12, c0147m2, s3);
            View u2 = u(i12);
            if (u2 == A2) {
                break;
            }
            if (!u2.hasFocusable() || h12 == h1) {
                C0165o c0165o2 = (C0165o) u2.getLayoutParams();
                int i14 = c0165o2.e;
                view2 = A2;
                int i15 = c0165o2.f3089f + i14;
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
                        if (!this.f2906c.z(u2) || !this.f2907d.z(u2)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u2.hasFocusable()) {
                                int i16 = c0165o2.e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u2;
                            } else {
                                int i17 = c0165o2.e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u2;
                            }
                            i12 += i9;
                            c0147m2 = c0147m;
                            s3 = s2;
                            v2 = i13;
                            A2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        c0147m2 = c0147m;
                        s3 = s2;
                        v2 = i13;
                        A2 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (u2.hasFocusable()) {
                }
                i12 += i9;
                c0147m2 = c0147m;
                s3 = s2;
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
            c0147m2 = c0147m;
            s3 = s2;
            v2 = i13;
            A2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f3102b = true;
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
    public final void T0(C0147M c0147m, S s2, C0168s c0168s, r rVar) {
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
        int j = this.f1979r.j();
        boolean z2 = j != 1073741824;
        int i10 = v() > 0 ? this.f1968G[this.f1967F] : 0;
        if (z2) {
            m1();
        }
        boolean z3 = c0168s.e == 1;
        int i11 = this.f1967F;
        if (!z3) {
            i11 = i1(c0168s.f3108d, c0147m, s2) + j1(c0168s.f3108d, c0147m, s2);
        }
        int i12 = 0;
        while (i12 < this.f1967F && (i9 = c0168s.f3108d) >= 0 && i9 < s2.b() && i11 > 0) {
            int i13 = c0168s.f3108d;
            int j12 = j1(i13, c0147m, s2);
            if (j12 > this.f1967F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + j12 + " spans but GridLayoutManager has only " + this.f1967F + " spans.");
            }
            i11 -= j12;
            if (i11 < 0 || (b2 = c0168s.b(c0147m)) == null) {
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
            C0165o c0165o = (C0165o) view.getLayoutParams();
            int j13 = j1(AbstractC0141G.H(view), c0147m, s2);
            c0165o.f3089f = j13;
            c0165o.e = i14;
            i14 += j13;
            i += i3;
        }
        float f2 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.H[i16];
            if (c0168s.f3112k != null) {
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
            RecyclerView recyclerView = this.f2905b;
            Rect rect = this.f1972L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j, r8);
            int c2 = this.f1979r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d2 = (this.f1979r.d(view2) * 1.0f) / ((C0165o) view2.getLayoutParams()).f3089f;
            if (d2 > f2) {
                f2 = d2;
            }
        }
        if (z2) {
            e1(Math.max(Math.round(f2 * this.f1967F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.H[i17];
                k1(view3, 1073741824, true);
                int c3 = this.f1979r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.H[i18];
            if (this.f1979r.c(view4) != i15) {
                C0165o c0165o2 = (C0165o) view4.getLayoutParams();
                Rect rect2 = c0165o2.f2917b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0165o2).topMargin + ((ViewGroup.MarginLayoutParams) c0165o2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0165o2).leftMargin + ((ViewGroup.MarginLayoutParams) c0165o2).rightMargin;
                int g1 = g1(c0165o2.e, c0165o2.f3089f);
                if (this.f1977p == 1) {
                    i8 = AbstractC0141G.w(false, g1, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c0165o2).width);
                    w2 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w2 = AbstractC0141G.w(false, g1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0165o2).height);
                    i8 = makeMeasureSpec;
                }
                if (w0(view4, i8, w2, (C0142H) view4.getLayoutParams())) {
                    view4.measure(i8, w2);
                }
            }
        }
        rVar.f3101a = i15;
        if (this.f1977p != 1) {
            if (c0168s.f3109f == -1) {
                int i21 = c0168s.f3106b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0168s.f3106b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0168s.f3109f == -1) {
            int i23 = c0168s.f3106b;
            i5 = 0;
            i4 = 0;
            i7 = i23 - i15;
            i6 = i23;
        } else {
            i7 = c0168s.f3106b;
            i6 = i7 + i15;
            i5 = 0;
            i4 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.H[i24];
            C0165o c0165o3 = (C0165o) view5.getLayoutParams();
            if (this.f1977p != 1) {
                int G2 = G() + this.f1968G[c0165o3.e];
                i7 = G2;
                i6 = this.f1979r.d(view5) + G2;
            } else if (S0()) {
                int E2 = E() + this.f1968G[this.f1967F - c0165o3.e];
                i4 = E2;
                i5 = E2 - this.f1979r.d(view5);
            } else {
                i5 = E() + this.f1968G[c0165o3.e];
                i4 = this.f1979r.d(view5) + i5;
            }
            AbstractC0141G.N(view5, i5, i7, i4, i6);
            if (c0165o3.f2916a.i() || c0165o3.f2916a.l()) {
                rVar.f3103c = true;
            }
            rVar.f3104d = view5.hasFocusable() | rVar.f3104d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(C0147M c0147m, S s2, C0167q c0167q, int i) {
        m1();
        if (s2.b() > 0 && !s2.f2945g) {
            boolean z2 = i == 1;
            int i12 = i1(c0167q.f3098b, c0147m, s2);
            if (z2) {
                while (i12 > 0) {
                    int i2 = c0167q.f3098b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0167q.f3098b = i3;
                    i12 = i1(i3, c0147m, s2);
                }
            } else {
                int b2 = s2.b() - 1;
                int i4 = c0167q.f3098b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int i13 = i1(i5, c0147m, s2);
                    if (i13 <= i12) {
                        break;
                    }
                    i4 = i5;
                    i12 = i13;
                }
                c0167q.f3098b = i4;
            }
        }
        f1();
    }

    @Override // h0.AbstractC0141G
    public final void V(C0147M c0147m, S s2, View view, i iVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0165o)) {
            U(view, iVar);
            return;
        }
        C0165o c0165o = (C0165o) layoutParams;
        int h1 = h1(c0165o.f2916a.b(), c0147m, s2);
        if (this.f1977p == 0) {
            iVar.h(h.a(false, c0165o.e, c0165o.f3089f, h1, 1));
        } else {
            iVar.h(h.a(false, h1, 1, c0165o.e, c0165o.f3089f));
        }
    }

    @Override // h0.AbstractC0141G
    public final void W(int i, int i2) {
        c cVar = this.f1971K;
        cVar.y();
        ((SparseIntArray) cVar.f69c).clear();
    }

    @Override // h0.AbstractC0141G
    public final void X() {
        c cVar = this.f1971K;
        cVar.y();
        ((SparseIntArray) cVar.f69c).clear();
    }

    @Override // h0.AbstractC0141G
    public final void Y(int i, int i2) {
        c cVar = this.f1971K;
        cVar.y();
        ((SparseIntArray) cVar.f69c).clear();
    }

    @Override // h0.AbstractC0141G
    public final void Z(int i, int i2) {
        c cVar = this.f1971K;
        cVar.y();
        ((SparseIntArray) cVar.f69c).clear();
    }

    @Override // h0.AbstractC0141G
    public final void a0(int i, int i2) {
        c cVar = this.f1971K;
        cVar.y();
        ((SparseIntArray) cVar.f69c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final void b0(C0147M c0147m, S s2) {
        boolean z2 = s2.f2945g;
        SparseIntArray sparseIntArray = this.f1970J;
        SparseIntArray sparseIntArray2 = this.f1969I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                C0165o c0165o = (C0165o) u(i).getLayoutParams();
                int b2 = c0165o.f2916a.b();
                sparseIntArray2.put(b2, c0165o.f3089f);
                sparseIntArray.put(b2, c0165o.e);
            }
        }
        super.b0(c0147m, s2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final void c0(S s2) {
        super.c0(s2);
        this.f1966E = false;
    }

    public final void e1(int i) {
        int i2;
        int[] iArr = this.f1968G;
        int i3 = this.f1967F;
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
        this.f1968G = iArr;
    }

    @Override // h0.AbstractC0141G
    public final boolean f(C0142H c0142h) {
        return c0142h instanceof C0165o;
    }

    public final void f1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.f1967F) {
            this.H = new View[this.f1967F];
        }
    }

    public final int g1(int i, int i2) {
        if (this.f1977p != 1 || !S0()) {
            int[] iArr = this.f1968G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1968G;
        int i3 = this.f1967F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int h1(int i, C0147M c0147m, S s2) {
        boolean z2 = s2.f2945g;
        c cVar = this.f1971K;
        if (!z2) {
            int i2 = this.f1967F;
            cVar.getClass();
            return c.x(i, i2);
        }
        int b2 = c0147m.b(i);
        if (b2 != -1) {
            int i3 = this.f1967F;
            cVar.getClass();
            return c.x(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, C0147M c0147m, S s2) {
        boolean z2 = s2.f2945g;
        c cVar = this.f1971K;
        if (!z2) {
            int i2 = this.f1967F;
            cVar.getClass();
            return i % i2;
        }
        int i3 = this.f1970J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = c0147m.b(i);
        if (b2 != -1) {
            int i4 = this.f1967F;
            cVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, C0147M c0147m, S s2) {
        boolean z2 = s2.f2945g;
        c cVar = this.f1971K;
        if (!z2) {
            cVar.getClass();
            return 1;
        }
        int i2 = this.f1969I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0147m.b(i) != -1) {
            cVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final int k(S s2) {
        return D0(s2);
    }

    public final void k1(View view, int i, boolean z2) {
        int i2;
        int i3;
        C0165o c0165o = (C0165o) view.getLayoutParams();
        Rect rect = c0165o.f2917b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0165o).topMargin + ((ViewGroup.MarginLayoutParams) c0165o).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0165o).leftMargin + ((ViewGroup.MarginLayoutParams) c0165o).rightMargin;
        int g1 = g1(c0165o.e, c0165o.f3089f);
        if (this.f1977p == 1) {
            i3 = AbstractC0141G.w(false, g1, i, i5, ((ViewGroup.MarginLayoutParams) c0165o).width);
            i2 = AbstractC0141G.w(true, this.f1979r.l(), this.f2913m, i4, ((ViewGroup.MarginLayoutParams) c0165o).height);
        } else {
            int w2 = AbstractC0141G.w(false, g1, i, i4, ((ViewGroup.MarginLayoutParams) c0165o).height);
            int w3 = AbstractC0141G.w(true, this.f1979r.l(), this.f2912l, i5, ((ViewGroup.MarginLayoutParams) c0165o).width);
            i2 = w2;
            i3 = w3;
        }
        C0142H c0142h = (C0142H) view.getLayoutParams();
        if (z2 ? w0(view, i3, i2, c0142h) : u0(view, i3, i2, c0142h)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final int l(S s2) {
        return E0(s2);
    }

    public final void l1(int i) {
        if (i == this.f1967F) {
            return;
        }
        this.f1966E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0001b.e("Span count should be at least 1. Provided ", i));
        }
        this.f1967F = i;
        this.f1971K.y();
        l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final int m0(int i, C0147M c0147m, S s2) {
        m1();
        f1();
        return super.m0(i, c0147m, s2);
    }

    public final void m1() {
        int D2;
        int G2;
        if (this.f1977p == 1) {
            D2 = this.f2914n - F();
            G2 = E();
        } else {
            D2 = this.f2915o - D();
            G2 = G();
        }
        e1(D2 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final int n(S s2) {
        return D0(s2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final int o(S s2) {
        return E0(s2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final int o0(int i, C0147M c0147m, S s2) {
        m1();
        f1();
        return super.o0(i, c0147m, s2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final C0142H r() {
        return this.f1977p == 0 ? new C0165o(-2, -1) : new C0165o(-1, -2);
    }

    @Override // h0.AbstractC0141G
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.f1968G == null) {
            super.r0(rect, i, i2);
        }
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1977p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2905b;
            WeakHashMap weakHashMap = P.f711a;
            g3 = AbstractC0141G.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1968G;
            g2 = AbstractC0141G.g(i, iArr[iArr.length - 1] + F2, this.f2905b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f2905b;
            WeakHashMap weakHashMap2 = P.f711a;
            g2 = AbstractC0141G.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1968G;
            g3 = AbstractC0141G.g(i2, iArr2[iArr2.length - 1] + D2, this.f2905b.getMinimumHeight());
        }
        this.f2905b.setMeasuredDimension(g2, g3);
    }

    @Override // h0.AbstractC0141G
    public final C0142H s(Context context, AttributeSet attributeSet) {
        C0165o c0165o = new C0165o(context, attributeSet);
        c0165o.e = -1;
        c0165o.f3089f = 0;
        return c0165o;
    }

    @Override // h0.AbstractC0141G
    public final C0142H t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0165o c0165o = new C0165o((ViewGroup.MarginLayoutParams) layoutParams);
            c0165o.e = -1;
            c0165o.f3089f = 0;
            return c0165o;
        }
        C0165o c0165o2 = new C0165o(layoutParams);
        c0165o2.e = -1;
        c0165o2.f3089f = 0;
        return c0165o2;
    }

    @Override // h0.AbstractC0141G
    public final int x(C0147M c0147m, S s2) {
        if (this.f1977p == 1) {
            return this.f1967F;
        }
        if (s2.b() < 1) {
            return 0;
        }
        return h1(s2.b() - 1, c0147m, s2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final boolean z0() {
        return this.f1987z == null && !this.f1966E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1966E = false;
        this.f1967F = -1;
        this.f1969I = new SparseIntArray();
        this.f1970J = new SparseIntArray();
        this.f1971K = new c(14);
        this.f1972L = new Rect();
        l1(i);
    }
}
