package androidx.recyclerview.widget;

import a4.b;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.emoji2.text.q;
import g1.a1;
import g1.b0;
import g1.b1;
import g1.d0;
import g1.e0;
import g1.f0;
import g1.g0;
import g1.g1;
import g1.m1;
import g1.q0;
import g1.q1;
import g1.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import n0.p0;
import o0.c;
import o0.f;
import o0.g;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final q K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q(7);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(a1.H(context, attributeSet, i, i4).f1867b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final boolean C0() {
        return this.f760z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(m1 m1Var, f0 f0Var, y yVar) {
        int i;
        int i4 = this.F;
        for (int i5 = 0; i5 < this.F && (i = f0Var.d) >= 0 && i < m1Var.b() && i4 > 0; i5++) {
            yVar.a(f0Var.d, Math.max(0, f0Var.f1653g));
            this.K.getClass();
            i4--;
            f0Var.d += f0Var.f1651e;
        }
    }

    @Override // g1.a1
    public final int I(g1 g1Var, m1 m1Var) {
        if (this.f750p == 0) {
            return Math.min(this.F, B());
        }
        if (m1Var.b() < 1) {
            return 0;
        }
        return o1(m1Var.b() - 1, g1Var, m1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(g1 g1Var, m1 m1Var, boolean z4, boolean z5) {
        int i;
        int i4;
        int v4 = v();
        int i5 = 1;
        if (z5) {
            i4 = v() - 1;
            i = -1;
            i5 = -1;
        } else {
            i = v4;
            i4 = 0;
        }
        int b2 = m1Var.b();
        J0();
        int k4 = this.f752r.k();
        int g3 = this.f752r.g();
        View view = null;
        View view2 = null;
        while (i4 != i) {
            View u4 = u(i4);
            int G = a1.G(u4);
            if (G >= 0 && G < b2 && p1(G, g1Var, m1Var) == 0) {
                if (((b1) u4.getLayoutParams()).f1617a.h()) {
                    if (view2 == null) {
                        view2 = u4;
                    }
                } else {
                    if (this.f752r.e(u4) < g3 && this.f752r.b(u4) >= k4) {
                        return u4;
                    }
                    if (view == null) {
                        view = u4;
                    }
                }
            }
            i4 += i5;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x001f, code lost:
    
        if (r22.f1597a.f1673c.contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, g1 g1Var, m1 m1Var) {
        View D;
        int v4;
        int i4;
        int i5;
        View view2;
        View view3;
        int i6;
        int i7;
        g1 g1Var2 = g1Var;
        m1 m1Var2 = m1Var;
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            D = recyclerView.D(view);
            if (D != null) {
            }
        }
        D = null;
        if (D != null) {
            b0 b0Var = (b0) D.getLayoutParams();
            int i8 = b0Var.f1615e;
            int i9 = b0Var.f1616f + i8;
            if (super.T(view, i, g1Var, m1Var) != null) {
                if ((I0(i) == 1) != this.f755u) {
                    i5 = v() - 1;
                    v4 = -1;
                    i4 = -1;
                } else {
                    v4 = v();
                    i4 = 1;
                    i5 = 0;
                }
                boolean z4 = this.f750p == 1 && V0();
                int o12 = o1(i5, g1Var2, m1Var2);
                View view4 = null;
                int i10 = -1;
                int i11 = -1;
                int i12 = 0;
                int i13 = i5;
                int i14 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i13 == v4) {
                        break;
                    }
                    int o13 = o1(i13, g1Var2, m1Var2);
                    View u4 = u(i13);
                    if (u4 == D) {
                        break;
                    }
                    if (!u4.hasFocusable() || o13 == o12) {
                        b0 b0Var2 = (b0) u4.getLayoutParams();
                        int i15 = b0Var2.f1615e;
                        view3 = D;
                        int i16 = b0Var2.f1616f + i15;
                        if (u4.hasFocusable() && i15 == i8 && i16 == i9) {
                            return u4;
                        }
                        if (!(u4.hasFocusable() && view4 == null) && (u4.hasFocusable() || view2 != null)) {
                            i6 = v4;
                            int min = Math.min(i16, i9) - Math.max(i15, i8);
                            if (u4.hasFocusable()) {
                                if (min <= i12) {
                                    if (min == i12) {
                                    }
                                    i7 = i12;
                                }
                                i7 = i12;
                            } else {
                                if (view4 == null) {
                                    i7 = i12;
                                    if (!this.f1599c.x(u4) || !this.d.x(u4)) {
                                        if (min <= i14) {
                                            if (min == i14) {
                                            }
                                        }
                                    }
                                }
                                i7 = i12;
                            }
                        } else {
                            i7 = i12;
                            i6 = v4;
                        }
                        if (u4.hasFocusable()) {
                            int i17 = b0Var2.f1615e;
                            i12 = Math.min(i16, i9) - Math.max(i15, i8);
                            view4 = u4;
                            i11 = i17;
                            view5 = view2;
                        } else {
                            int i18 = b0Var2.f1615e;
                            view5 = u4;
                            i10 = i18;
                            i12 = i7;
                            i14 = Math.min(i16, i9) - Math.max(i15, i8);
                        }
                        i13 += i4;
                        g1Var2 = g1Var;
                        m1Var2 = m1Var;
                        D = view3;
                        v4 = i6;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = D;
                        i7 = i12;
                        i6 = v4;
                    }
                    view5 = view2;
                    i12 = i7;
                    i13 += i4;
                    g1Var2 = g1Var;
                    m1Var2 = m1Var;
                    D = view3;
                    v4 = i6;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final void V(g1 g1Var, m1 m1Var, g gVar) {
        super.V(g1Var, m1Var, gVar);
        gVar.h(GridView.class.getName());
        q0 q0Var = this.f1598b.f786r;
        if (q0Var == null || q0Var.a() <= 1) {
            return;
        }
        gVar.b(c.f2876m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f1641b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(g1 g1Var, m1 m1Var, f0 f0Var, e0 e0Var) {
        int i;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int w4;
        int i10;
        ?? r12;
        int i11;
        View b2;
        int j2 = this.f752r.j();
        boolean z4 = j2 != 1073741824;
        int i12 = v() > 0 ? this.G[this.F] : 0;
        if (z4) {
            t1();
        }
        boolean z5 = f0Var.f1651e == 1;
        int i13 = this.F;
        if (!z5) {
            i13 = p1(f0Var.d, g1Var, m1Var) + q1(f0Var.d, g1Var, m1Var);
        }
        int i14 = 0;
        while (i14 < this.F && (i11 = f0Var.d) >= 0 && i11 < m1Var.b() && i13 > 0) {
            int i15 = f0Var.d;
            int q12 = q1(i15, g1Var, m1Var);
            if (q12 > this.F) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + q12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i13 -= q12;
            if (i13 < 0 || (b2 = f0Var.b(g1Var)) == null) {
                break;
            }
            this.H[i14] = b2;
            i14++;
        }
        if (z5) {
            i5 = 1;
            i4 = i14;
            i = 0;
        } else {
            i = i14 - 1;
            i4 = -1;
            i5 = -1;
        }
        int i16 = 0;
        while (i != i4) {
            View view = this.H[i];
            b0 b0Var = (b0) view.getLayoutParams();
            int q13 = q1(a1.G(view), g1Var, m1Var);
            b0Var.f1616f = q13;
            b0Var.f1615e = i16;
            i16 += q13;
            i += i5;
        }
        float f5 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.H[i18];
            if (f0Var.f1655k != null) {
                r12 = 0;
                r12 = 0;
                if (z5) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z5) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f1598b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.N(view2));
            }
            r1(view2, j2, r12);
            int c5 = this.f752r.c(view2);
            if (c5 > i17) {
                i17 = c5;
            }
            float d = (this.f752r.d(view2) * 1.0f) / ((b0) view2.getLayoutParams()).f1616f;
            if (d > f5) {
                f5 = d;
            }
        }
        if (z4) {
            h1(Math.max(Math.round(f5 * this.F), i12));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.H[i19];
                r1(view3, 1073741824, true);
                int c6 = this.f752r.c(view3);
                if (c6 > i17) {
                    i17 = c6;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.H[i20];
            if (this.f752r.c(view4) != i17) {
                b0 b0Var2 = (b0) view4.getLayoutParams();
                Rect rect2 = b0Var2.f1618b;
                int i21 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) b0Var2).topMargin + ((ViewGroup.MarginLayoutParams) b0Var2).bottomMargin;
                int i22 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) b0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) b0Var2).rightMargin;
                int n1 = n1(b0Var2.f1615e, b0Var2.f1616f);
                if (this.f750p == 1) {
                    i10 = a1.w(false, n1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) b0Var2).width);
                    w4 = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    w4 = a1.w(false, n1, 1073741824, i21, ((ViewGroup.MarginLayoutParams) b0Var2).height);
                    i10 = makeMeasureSpec;
                }
                if (z0(view4, i10, w4, (b1) view4.getLayoutParams())) {
                    view4.measure(i10, w4);
                }
            }
        }
        e0Var.f1640a = i17;
        if (this.f750p != 1) {
            if (f0Var.f1652f == -1) {
                int i23 = f0Var.f1649b;
                i8 = i23 - i17;
                i7 = 0;
                i6 = i23;
            } else {
                int i24 = f0Var.f1649b;
                i6 = i24 + i17;
                i7 = 0;
                i8 = i24;
            }
            i9 = i7;
        } else if (f0Var.f1652f == -1) {
            i9 = f0Var.f1649b;
            i7 = i9 - i17;
            i8 = 0;
            i6 = 0;
        } else {
            int i25 = f0Var.f1649b;
            i6 = 0;
            i7 = i25;
            i9 = i25 + i17;
            i8 = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.H[i26];
            b0 b0Var3 = (b0) view5.getLayoutParams();
            if (this.f750p != 1) {
                i7 = F() + this.G[b0Var3.f1615e];
                i9 = this.f752r.d(view5) + i7;
            } else if (V0()) {
                int D = D() + this.G[this.F - b0Var3.f1615e];
                i6 = D;
                i8 = D - this.f752r.d(view5);
            } else {
                i8 = D() + this.G[b0Var3.f1615e];
                i6 = this.f752r.d(view5) + i8;
            }
            a1.N(view5, i8, i7, i6, i9);
            if (b0Var3.f1617a.h() || b0Var3.f1617a.k()) {
                e0Var.f1642c = true;
            }
            e0Var.d = view5.hasFocusable() | e0Var.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // g1.a1
    public final void X(g1 g1Var, m1 m1Var, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b0)) {
            W(view, gVar);
            return;
        }
        b0 b0Var = (b0) layoutParams;
        int o12 = o1(b0Var.f1617a.b(), g1Var, m1Var);
        if (this.f750p == 0) {
            gVar.i(f.a(false, b0Var.f1615e, b0Var.f1616f, o12, 1));
        } else {
            gVar.i(f.a(false, o12, 1, b0Var.f1615e, b0Var.f1616f));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(g1 g1Var, m1 m1Var, d0 d0Var, int i) {
        t1();
        if (m1Var.b() > 0 && !m1Var.f1725g) {
            boolean z4 = i == 1;
            int p12 = p1(d0Var.f1631b, g1Var, m1Var);
            if (z4) {
                while (p12 > 0) {
                    int i4 = d0Var.f1631b;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    d0Var.f1631b = i5;
                    p12 = p1(i5, g1Var, m1Var);
                }
            } else {
                int b2 = m1Var.b() - 1;
                int i6 = d0Var.f1631b;
                while (i6 < b2) {
                    int i7 = i6 + 1;
                    int p13 = p1(i7, g1Var, m1Var);
                    if (p13 <= p12) {
                        break;
                    }
                    i6 = i7;
                    p12 = p13;
                }
                d0Var.f1631b = i6;
            }
        }
        i1();
    }

    @Override // g1.a1
    public final void Y(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.h).clear();
    }

    @Override // g1.a1
    public final void Z() {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.h).clear();
    }

    @Override // g1.a1
    public final void a0(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.h).clear();
    }

    @Override // g1.a1
    public final void b0(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.h).clear();
    }

    @Override // g1.a1
    public final void c0(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final void d0(g1 g1Var, m1 m1Var) {
        boolean z4 = m1Var.f1725g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z4) {
            int v4 = v();
            for (int i = 0; i < v4; i++) {
                b0 b0Var = (b0) u(i).getLayoutParams();
                int b2 = b0Var.f1617a.b();
                sparseIntArray2.put(b2, b0Var.f1616f);
                sparseIntArray.put(b2, b0Var.f1615e);
            }
        }
        super.d0(g1Var, m1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.d1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final void e0(m1 m1Var) {
        View q4;
        super.e0(m1Var);
        this.E = false;
        int i = this.M;
        if (i == -1 || (q4 = q(i)) == null) {
            return;
        }
        q4.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // g1.a1
    public final boolean f(b1 b1Var) {
        return b1Var instanceof b0;
    }

    public final void h1(int i) {
        int i4;
        int[] iArr = this.G;
        int i5 = this.F;
        if (iArr == null || iArr.length != i5 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i5 + 1];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i / i5;
        int i8 = i % i5;
        int i9 = 0;
        for (int i10 = 1; i10 <= i5; i10++) {
            i6 += i8;
            if (i6 <= 0 || i5 - i6 >= i8) {
                i4 = i7;
            } else {
                i4 = i7 + 1;
                i6 -= i5;
            }
            i9 += i4;
            iArr[i10] = i9;
        }
        this.G = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(int i, Bundle bundle) {
        View view;
        q1 L;
        int i4;
        int i5;
        if (i == c.f2876m.a() && i != -1) {
            int i6 = 0;
            while (true) {
                if (i6 >= v()) {
                    view = null;
                    break;
                }
                View u4 = u(i6);
                Objects.requireNonNull(u4);
                if (u4.isAccessibilityFocused()) {
                    view = u(i6);
                    break;
                }
                i6++;
            }
            if (view != null && bundle != null) {
                int i7 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i7)) && (L = this.f1598b.L(view)) != null) {
                    RecyclerView recyclerView = L.f1782r;
                    int J = recyclerView == null ? -1 : recyclerView.J(L);
                    int k12 = k1(J);
                    int j12 = j1(J);
                    if (k12 >= 0 && j12 >= 0) {
                        if (!l1(J).contains(Integer.valueOf(this.N)) || !m1(j1(J), J).contains(Integer.valueOf(this.O))) {
                            this.N = k12;
                            this.O = j12;
                        }
                        int i8 = this.N;
                        if (i8 == -1) {
                            i8 = k12;
                        }
                        int i9 = this.O;
                        if (i9 != -1) {
                            j12 = i9;
                        }
                        if (i7 == 17) {
                            i4 = J - 1;
                            while (i4 >= 0) {
                                int k13 = k1(i4);
                                int j13 = j1(i4);
                                if (k13 < 0 || j13 < 0) {
                                    break;
                                }
                                if (this.f750p != 1) {
                                    if (l1(i4).contains(Integer.valueOf(i8)) && j13 < j12) {
                                        this.O = j13;
                                        break;
                                    }
                                    i4--;
                                } else {
                                    if ((k13 == i8 && j13 < j12) || k13 < i8) {
                                        this.N = k13;
                                        this.O = j13;
                                        break;
                                    }
                                    i4--;
                                }
                            }
                            i4 = -1;
                            if (i4 == -1) {
                            }
                            if (i4 != -1) {
                            }
                        } else if (i7 == 33) {
                            i4 = J - 1;
                            while (i4 >= 0) {
                                int k14 = k1(i4);
                                int j14 = j1(i4);
                                if (k14 < 0 || j14 < 0) {
                                    break;
                                }
                                if (this.f750p == 1) {
                                    if (k14 < i8 && m1(j1(i4), i4).contains(Integer.valueOf(j12))) {
                                        this.N = k14;
                                        break;
                                    }
                                    i4--;
                                } else {
                                    if (k14 < i8 && j14 == j12) {
                                        this.N = ((Integer) Collections.max(l1(i4))).intValue();
                                        break;
                                    }
                                    i4--;
                                }
                            }
                            i4 = -1;
                            if (i4 == -1) {
                            }
                            if (i4 != -1) {
                            }
                        } else if (i7 == 66) {
                            i4 = J + 1;
                            while (i4 < B()) {
                                int k15 = k1(i4);
                                int j15 = j1(i4);
                                if (k15 < 0 || j15 < 0) {
                                    break;
                                }
                                if (this.f750p != 1) {
                                    if (j15 > j12 && l1(i4).contains(Integer.valueOf(i8))) {
                                        this.O = j15;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    if ((k15 == i8 && j15 > j12) || k15 > i8) {
                                        this.N = k15;
                                        this.O = j15;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            i4 = -1;
                            if (i4 == -1) {
                                if (i7 != 17) {
                                }
                            }
                            if (i4 != -1) {
                            }
                        } else if (i7 == 130) {
                            i4 = J + 1;
                            while (i4 < B()) {
                                int k16 = k1(i4);
                                int j16 = j1(i4);
                                if (k16 < 0 || j16 < 0) {
                                    break;
                                }
                                if (this.f750p == 1) {
                                    if (k16 > i8 && (j16 == j12 || m1(j1(i4), i4).contains(Integer.valueOf(j12)))) {
                                        this.N = k16;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    if (k16 > i8 && j16 == j12) {
                                        this.N = k1(i4);
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            i4 = -1;
                            if (i4 == -1 && (i5 = this.f750p) == 0) {
                                if (i7 != 17) {
                                    if (k12 >= 0 && i5 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i10 = 0;
                                        loop2: while (true) {
                                            if (i10 >= B()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int intValue = num.intValue();
                                                    if (intValue < k12) {
                                                        i4 = ((Integer) treeMap.get(num)).intValue();
                                                        this.N = intValue;
                                                        this.O = j1(i4);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it = l1(i10).iterator();
                                                while (it.hasNext()) {
                                                    Integer num2 = (Integer) it.next();
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i10));
                                                }
                                                i10++;
                                            }
                                        }
                                    }
                                    i4 = -1;
                                } else if (i7 == 66) {
                                    if (k12 >= 0 && i5 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i11 = 0;
                                        loop5: while (true) {
                                            if (i11 >= B()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int intValue2 = num3.intValue();
                                                    if (intValue2 > k12) {
                                                        i4 = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.N = intValue2;
                                                        this.O = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it2 = l1(i11).iterator();
                                                while (it2.hasNext()) {
                                                    Integer num4 = (Integer) it2.next();
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i11));
                                                    }
                                                }
                                                i11++;
                                            }
                                        }
                                    }
                                    i4 = -1;
                                }
                            }
                            if (i4 != -1) {
                                q0(i4);
                                this.M = i4;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.i0(i, bundle);
            }
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i13 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i12 != -1 && i13 != -1) {
                int a5 = this.f1598b.f786r.a();
                int i14 = 0;
                while (true) {
                    if (i14 >= a5) {
                        i14 = -1;
                        break;
                    }
                    RecyclerView recyclerView2 = this.f1598b;
                    int p12 = p1(i14, recyclerView2.h, recyclerView2.f775l0);
                    RecyclerView recyclerView3 = this.f1598b;
                    int o12 = o1(i14, recyclerView3.h, recyclerView3.f775l0);
                    if (this.f750p == 1) {
                        if (p12 == i13 && o12 == i12) {
                            break;
                        }
                        i14++;
                    } else {
                        if (p12 == i12 && o12 == i13) {
                            break;
                        }
                        i14++;
                    }
                }
                if (i14 > -1) {
                    this.f758x = i14;
                    this.f759y = 0;
                    g0 g0Var = this.f760z;
                    if (g0Var != null) {
                        g0Var.f1663f = -1;
                    }
                    o0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void i1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int j1(int i) {
        if (this.f750p == 0) {
            RecyclerView recyclerView = this.f1598b;
            return o1(i, recyclerView.h, recyclerView.f775l0);
        }
        RecyclerView recyclerView2 = this.f1598b;
        return p1(i, recyclerView2.h, recyclerView2.f775l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final int k(m1 m1Var) {
        return G0(m1Var);
    }

    public final int k1(int i) {
        if (this.f750p == 1) {
            RecyclerView recyclerView = this.f1598b;
            return o1(i, recyclerView.h, recyclerView.f775l0);
        }
        RecyclerView recyclerView2 = this.f1598b;
        return p1(i, recyclerView2.h, recyclerView2.f775l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final int l(m1 m1Var) {
        return H0(m1Var);
    }

    public final HashSet l1(int i) {
        return m1(k1(i), i);
    }

    public final HashSet m1(int i, int i4) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f1598b;
        int q12 = q1(i4, recyclerView.h, recyclerView.f775l0);
        for (int i5 = i; i5 < i + q12; i5++) {
            hashSet.add(Integer.valueOf(i5));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final int n(m1 m1Var) {
        return G0(m1Var);
    }

    public final int n1(int i, int i4) {
        if (this.f750p != 1 || !V0()) {
            int[] iArr = this.G;
            return iArr[i4 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i5 = this.F;
        return iArr2[i5 - i] - iArr2[(i5 - i) - i4];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final int o(m1 m1Var) {
        return H0(m1Var);
    }

    public final int o1(int i, g1 g1Var, m1 m1Var) {
        boolean z4 = m1Var.f1725g;
        q qVar = this.K;
        if (!z4) {
            int i4 = this.F;
            qVar.getClass();
            return q.v(i, i4);
        }
        int b2 = g1Var.b(i);
        if (b2 != -1) {
            int i5 = this.F;
            qVar.getClass();
            return q.v(b2, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final int p0(int i, g1 g1Var, m1 m1Var) {
        t1();
        i1();
        return super.p0(i, g1Var, m1Var);
    }

    public final int p1(int i, g1 g1Var, m1 m1Var) {
        boolean z4 = m1Var.f1725g;
        q qVar = this.K;
        if (!z4) {
            int i4 = this.F;
            qVar.getClass();
            return i % i4;
        }
        int i5 = this.J.get(i, -1);
        if (i5 != -1) {
            return i5;
        }
        int b2 = g1Var.b(i);
        if (b2 != -1) {
            int i6 = this.F;
            qVar.getClass();
            return b2 % i6;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int q1(int i, g1 g1Var, m1 m1Var) {
        boolean z4 = m1Var.f1725g;
        q qVar = this.K;
        if (!z4) {
            qVar.getClass();
            return 1;
        }
        int i4 = this.I.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        if (g1Var.b(i) != -1) {
            qVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final b1 r() {
        return this.f750p == 0 ? new b0(-2, -1) : new b0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final int r0(int i, g1 g1Var, m1 m1Var) {
        t1();
        i1();
        return super.r0(i, g1Var, m1Var);
    }

    public final void r1(View view, int i, boolean z4) {
        int i4;
        int i5;
        b0 b0Var = (b0) view.getLayoutParams();
        Rect rect = b0Var.f1618b;
        int i6 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) b0Var).topMargin + ((ViewGroup.MarginLayoutParams) b0Var).bottomMargin;
        int i7 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) b0Var).leftMargin + ((ViewGroup.MarginLayoutParams) b0Var).rightMargin;
        int n1 = n1(b0Var.f1615e, b0Var.f1616f);
        if (this.f750p == 1) {
            i5 = a1.w(false, n1, i, i7, ((ViewGroup.MarginLayoutParams) b0Var).width);
            i4 = a1.w(true, this.f752r.l(), this.f1606m, i6, ((ViewGroup.MarginLayoutParams) b0Var).height);
        } else {
            int w4 = a1.w(false, n1, i, i6, ((ViewGroup.MarginLayoutParams) b0Var).height);
            int w5 = a1.w(true, this.f752r.l(), this.f1605l, i7, ((ViewGroup.MarginLayoutParams) b0Var).width);
            i4 = w4;
            i5 = w5;
        }
        b1 b1Var = (b1) view.getLayoutParams();
        if (z4 ? z0(view, i5, i4, b1Var) : x0(view, i5, i4, b1Var)) {
            view.measure(i5, i4);
        }
    }

    @Override // g1.a1
    public final b1 s(Context context, AttributeSet attributeSet) {
        b0 b0Var = new b0(context, attributeSet);
        b0Var.f1615e = -1;
        b0Var.f1616f = 0;
        return b0Var;
    }

    public final void s1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(b.f("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.K.w();
        o0();
    }

    @Override // g1.a1
    public final b1 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b0 b0Var = new b0((ViewGroup.MarginLayoutParams) layoutParams);
            b0Var.f1615e = -1;
            b0Var.f1616f = 0;
            return b0Var;
        }
        b0 b0Var2 = new b0(layoutParams);
        b0Var2.f1615e = -1;
        b0Var2.f1616f = 0;
        return b0Var2;
    }

    public final void t1() {
        int C;
        int F;
        if (this.f750p == 1) {
            C = this.f1607n - E();
            F = D();
        } else {
            C = this.f1608o - C();
            F = F();
        }
        h1(C - F);
    }

    @Override // g1.a1
    public final void u0(Rect rect, int i, int i4) {
        int g3;
        int g5;
        if (this.G == null) {
            super.u0(rect, i, i4);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f750p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f1598b;
            WeakHashMap weakHashMap = p0.f2816a;
            g5 = a1.g(i4, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g3 = a1.g(i, iArr[iArr.length - 1] + E, this.f1598b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f1598b;
            WeakHashMap weakHashMap2 = p0.f2816a;
            g3 = a1.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g5 = a1.g(i4, iArr2[iArr2.length - 1] + C, this.f1598b.getMinimumHeight());
        }
        this.f1598b.setMeasuredDimension(g3, g5);
    }

    @Override // g1.a1
    public final int x(g1 g1Var, m1 m1Var) {
        if (this.f750p == 1) {
            return Math.min(this.F, B());
        }
        if (m1Var.b() < 1) {
            return 0;
        }
        return o1(m1Var.b() - 1, g1Var, m1Var) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q(7);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(i);
    }
}
