package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.q;
import androidx.fragment.app.w0;
import f1.m0;
import f1.n;
import f1.n0;
import f1.s;
import f1.s0;
import f1.t;
import f1.u;
import f1.y0;
import java.util.Arrays;
import java.util.WeakHashMap;
import n0.l0;
import o0.e;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final q K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q(7);
        this.L = new Rect();
        m1(m0.I(context, attributeSet, i, i4).f1415b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final boolean A0() {
        return this.f658z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(y0 y0Var, u uVar, n nVar) {
        int i;
        int i4 = this.F;
        for (int i5 = 0; i5 < this.F && (i = uVar.d) >= 0 && i < y0Var.b() && i4 > 0; i5++) {
            nVar.a(uVar.d, Math.max(0, uVar.f1505g));
            this.K.getClass();
            i4--;
            uVar.d += uVar.f1503e;
        }
    }

    @Override // f1.m0
    public final int J(s0 s0Var, y0 y0Var) {
        if (this.f648p == 0) {
            return this.F;
        }
        if (y0Var.b() < 1) {
            return 0;
        }
        return i1(y0Var.b() - 1, s0Var, y0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(s0 s0Var, y0 y0Var, boolean z3, boolean z4) {
        int i;
        int i4;
        int v3 = v();
        int i5 = 1;
        if (z4) {
            i4 = v() - 1;
            i = -1;
            i5 = -1;
        } else {
            i = v3;
            i4 = 0;
        }
        int b4 = y0Var.b();
        H0();
        int k4 = this.f650r.k();
        int g4 = this.f650r.g();
        View view = null;
        View view2 = null;
        while (i4 != i) {
            View u3 = u(i4);
            int H = m0.H(u3);
            if (H >= 0 && H < b4 && j1(H, s0Var, y0Var) == 0) {
                if (((n0) u3.getLayoutParams()).f1460a.h()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f650r.e(u3) < g4 && this.f650r.b(u3) >= k4) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i4 += i5;
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
    
        if (((java.util.ArrayList) r22.f1444a.d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, s0 s0Var, y0 y0Var) {
        View A;
        int v3;
        int i4;
        int i5;
        View view2;
        View view3;
        int i6;
        int i7;
        s0 s0Var2 = s0Var;
        y0 y0Var2 = y0Var;
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            A = recyclerView.A(view);
            if (A != null) {
            }
        }
        A = null;
        if (A != null) {
            f1.q qVar = (f1.q) A.getLayoutParams();
            int i8 = qVar.f1472e;
            int i9 = qVar.f1473f + i8;
            if (super.T(view, i, s0Var, y0Var) != null) {
                if ((G0(i) == 1) != this.f653u) {
                    i5 = v() - 1;
                    v3 = -1;
                    i4 = -1;
                } else {
                    v3 = v();
                    i4 = 1;
                    i5 = 0;
                }
                boolean z3 = this.f648p == 1 && T0();
                int i12 = i1(i5, s0Var2, y0Var2);
                View view4 = null;
                int i10 = -1;
                int i11 = -1;
                int i13 = 0;
                int i14 = i5;
                int i15 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i14 == v3) {
                        break;
                    }
                    int i16 = i1(i14, s0Var2, y0Var2);
                    View u3 = u(i14);
                    if (u3 == A) {
                        break;
                    }
                    if (!u3.hasFocusable() || i16 == i12) {
                        f1.q qVar2 = (f1.q) u3.getLayoutParams();
                        int i17 = qVar2.f1472e;
                        view3 = A;
                        int i18 = qVar2.f1473f + i17;
                        if (u3.hasFocusable() && i17 == i8 && i18 == i9) {
                            return u3;
                        }
                        if (!(u3.hasFocusable() && view4 == null) && (u3.hasFocusable() || view2 != null)) {
                            i6 = v3;
                            int min = Math.min(i18, i9) - Math.max(i17, i8);
                            if (u3.hasFocusable()) {
                                if (min <= i13) {
                                    if (min == i13) {
                                    }
                                    i7 = i13;
                                }
                                i7 = i13;
                            } else {
                                if (view4 == null) {
                                    i7 = i13;
                                    if (!this.f1446c.x(u3) || !this.d.x(u3)) {
                                        if (min <= i15) {
                                            if (min == i15) {
                                            }
                                        }
                                    }
                                }
                                i7 = i13;
                            }
                        } else {
                            i7 = i13;
                            i6 = v3;
                        }
                        if (u3.hasFocusable()) {
                            int i19 = qVar2.f1472e;
                            i13 = Math.min(i18, i9) - Math.max(i17, i8);
                            view4 = u3;
                            i11 = i19;
                            view5 = view2;
                        } else {
                            int i20 = qVar2.f1472e;
                            view5 = u3;
                            i10 = i20;
                            i13 = i7;
                            i15 = Math.min(i18, i9) - Math.max(i17, i8);
                        }
                        i14 += i4;
                        s0Var2 = s0Var;
                        y0Var2 = y0Var;
                        A = view3;
                        v3 = i6;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = A;
                        i7 = i13;
                        i6 = v3;
                    }
                    view5 = view2;
                    i13 = i7;
                    i14 += i4;
                    s0Var2 = s0Var;
                    y0Var2 = y0Var;
                    A = view3;
                    v3 = i6;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f1498b = true;
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
    public final void U0(s0 s0Var, y0 y0Var, u uVar, t tVar) {
        int i;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int w3;
        int i10;
        ?? r12;
        int i11;
        View b4;
        int j4 = this.f650r.j();
        boolean z3 = j4 != 1073741824;
        int i12 = v() > 0 ? this.G[this.F] : 0;
        if (z3) {
            n1();
        }
        boolean z4 = uVar.f1503e == 1;
        int i13 = this.F;
        if (!z4) {
            i13 = j1(uVar.d, s0Var, y0Var) + k1(uVar.d, s0Var, y0Var);
        }
        int i14 = 0;
        while (i14 < this.F && (i11 = uVar.d) >= 0 && i11 < y0Var.b() && i13 > 0) {
            int i15 = uVar.d;
            int k12 = k1(i15, s0Var, y0Var);
            if (k12 > this.F) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + k12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i13 -= k12;
            if (i13 < 0 || (b4 = uVar.b(s0Var)) == null) {
                break;
            }
            this.H[i14] = b4;
            i14++;
        }
        if (z4) {
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
            f1.q qVar = (f1.q) view.getLayoutParams();
            int k13 = k1(m0.H(view), s0Var, y0Var);
            qVar.f1473f = k13;
            qVar.f1472e = i16;
            i16 += k13;
            i += i5;
        }
        float f2 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.H[i18];
            if (uVar.f1508k != null) {
                r12 = 0;
                r12 = 0;
                if (z4) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z4) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f1445b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.J(view2));
            }
            l1(view2, j4, r12);
            int c4 = this.f650r.c(view2);
            if (c4 > i17) {
                i17 = c4;
            }
            float d = (this.f650r.d(view2) * 1.0f) / ((f1.q) view2.getLayoutParams()).f1473f;
            if (d > f2) {
                f2 = d;
            }
        }
        if (z3) {
            f1(Math.max(Math.round(f2 * this.F), i12));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.H[i19];
                l1(view3, 1073741824, true);
                int c5 = this.f650r.c(view3);
                if (c5 > i17) {
                    i17 = c5;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.H[i20];
            if (this.f650r.c(view4) != i17) {
                f1.q qVar2 = (f1.q) view4.getLayoutParams();
                Rect rect2 = qVar2.f1461b;
                int i21 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar2).topMargin + ((ViewGroup.MarginLayoutParams) qVar2).bottomMargin;
                int i22 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) qVar2).leftMargin + ((ViewGroup.MarginLayoutParams) qVar2).rightMargin;
                int h12 = h1(qVar2.f1472e, qVar2.f1473f);
                if (this.f648p == 1) {
                    i10 = m0.w(false, h12, 1073741824, i22, ((ViewGroup.MarginLayoutParams) qVar2).width);
                    w3 = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    w3 = m0.w(false, h12, 1073741824, i21, ((ViewGroup.MarginLayoutParams) qVar2).height);
                    i10 = makeMeasureSpec;
                }
                if (x0(view4, i10, w3, (n0) view4.getLayoutParams())) {
                    view4.measure(i10, w3);
                }
            }
        }
        tVar.f1497a = i17;
        if (this.f648p != 1) {
            if (uVar.f1504f == -1) {
                int i23 = uVar.f1501b;
                i8 = i23 - i17;
                i7 = 0;
                i6 = i23;
            } else {
                int i24 = uVar.f1501b;
                i6 = i24 + i17;
                i7 = 0;
                i8 = i24;
            }
            i9 = i7;
        } else if (uVar.f1504f == -1) {
            i9 = uVar.f1501b;
            i7 = i9 - i17;
            i8 = 0;
            i6 = 0;
        } else {
            int i25 = uVar.f1501b;
            i6 = 0;
            i7 = i25;
            i9 = i25 + i17;
            i8 = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.H[i26];
            f1.q qVar3 = (f1.q) view5.getLayoutParams();
            if (this.f648p != 1) {
                i7 = G() + this.G[qVar3.f1472e];
                i9 = this.f650r.d(view5) + i7;
            } else if (T0()) {
                int E = E() + this.G[this.F - qVar3.f1472e];
                i6 = E;
                i8 = E - this.f650r.d(view5);
            } else {
                i8 = E() + this.G[qVar3.f1472e];
                i6 = this.f650r.d(view5) + i8;
            }
            m0.N(view5, i8, i7, i6, i9);
            if (qVar3.f1460a.h() || qVar3.f1460a.k()) {
                tVar.f1499c = true;
            }
            tVar.d = view5.hasFocusable() | tVar.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(s0 s0Var, y0 y0Var, s sVar, int i) {
        n1();
        if (y0Var.b() > 0 && !y0Var.f1541g) {
            boolean z3 = i == 1;
            int j12 = j1(sVar.f1487b, s0Var, y0Var);
            if (z3) {
                while (j12 > 0) {
                    int i4 = sVar.f1487b;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    sVar.f1487b = i5;
                    j12 = j1(i5, s0Var, y0Var);
                }
            } else {
                int b4 = y0Var.b() - 1;
                int i6 = sVar.f1487b;
                while (i6 < b4) {
                    int i7 = i6 + 1;
                    int j13 = j1(i7, s0Var, y0Var);
                    if (j13 <= j12) {
                        break;
                    }
                    i6 = i7;
                    j12 = j13;
                }
                sVar.f1487b = i6;
            }
        }
        g1();
    }

    @Override // f1.m0
    public final void W(s0 s0Var, y0 y0Var, View view, e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof f1.q)) {
            V(view, eVar);
            return;
        }
        f1.q qVar = (f1.q) layoutParams;
        int i12 = i1(qVar.f1460a.b(), s0Var, y0Var);
        if (this.f648p == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(qVar.f1472e, qVar.f1473f, i12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i12, 1, qVar.f1472e, qVar.f1473f, false, false));
        }
    }

    @Override // f1.m0
    public final void X(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.f347h).clear();
    }

    @Override // f1.m0
    public final void Y() {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.f347h).clear();
    }

    @Override // f1.m0
    public final void Z(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.f347h).clear();
    }

    @Override // f1.m0
    public final void a0(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.f347h).clear();
    }

    @Override // f1.m0
    public final void b0(int i, int i4) {
        q qVar = this.K;
        qVar.w();
        ((SparseIntArray) qVar.f347h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.b1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final void c0(s0 s0Var, y0 y0Var) {
        boolean z3 = y0Var.f1541g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z3) {
            int v3 = v();
            for (int i = 0; i < v3; i++) {
                f1.q qVar = (f1.q) u(i).getLayoutParams();
                int b4 = qVar.f1460a.b();
                sparseIntArray2.put(b4, qVar.f1473f);
                sparseIntArray.put(b4, qVar.f1472e);
            }
        }
        super.c0(s0Var, y0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final void d0(y0 y0Var) {
        super.d0(y0Var);
        this.E = false;
    }

    @Override // f1.m0
    public final boolean f(n0 n0Var) {
        return n0Var instanceof f1.q;
    }

    public final void f1(int i) {
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

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i, int i4) {
        if (this.f648p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i4 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i5 = this.F;
        return iArr2[i5 - i] - iArr2[(i5 - i) - i4];
    }

    public final int i1(int i, s0 s0Var, y0 y0Var) {
        boolean z3 = y0Var.f1541g;
        q qVar = this.K;
        if (!z3) {
            int i4 = this.F;
            qVar.getClass();
            return q.v(i, i4);
        }
        int b4 = s0Var.b(i);
        if (b4 != -1) {
            int i5 = this.F;
            qVar.getClass();
            return q.v(b4, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int j1(int i, s0 s0Var, y0 y0Var) {
        boolean z3 = y0Var.f1541g;
        q qVar = this.K;
        if (!z3) {
            int i4 = this.F;
            qVar.getClass();
            return i % i4;
        }
        int i5 = this.J.get(i, -1);
        if (i5 != -1) {
            return i5;
        }
        int b4 = s0Var.b(i);
        if (b4 != -1) {
            int i6 = this.F;
            qVar.getClass();
            return b4 % i6;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final int k(y0 y0Var) {
        return E0(y0Var);
    }

    public final int k1(int i, s0 s0Var, y0 y0Var) {
        boolean z3 = y0Var.f1541g;
        q qVar = this.K;
        if (!z3) {
            qVar.getClass();
            return 1;
        }
        int i4 = this.I.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        if (s0Var.b(i) != -1) {
            qVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final int l(y0 y0Var) {
        return F0(y0Var);
    }

    public final void l1(View view, int i, boolean z3) {
        int i4;
        int i5;
        f1.q qVar = (f1.q) view.getLayoutParams();
        Rect rect = qVar.f1461b;
        int i6 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        int i7 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        int h12 = h1(qVar.f1472e, qVar.f1473f);
        if (this.f648p == 1) {
            i5 = m0.w(false, h12, i, i7, ((ViewGroup.MarginLayoutParams) qVar).width);
            i4 = m0.w(true, this.f650r.l(), this.f1454m, i6, ((ViewGroup.MarginLayoutParams) qVar).height);
        } else {
            int w3 = m0.w(false, h12, i, i6, ((ViewGroup.MarginLayoutParams) qVar).height);
            int w4 = m0.w(true, this.f650r.l(), this.f1453l, i7, ((ViewGroup.MarginLayoutParams) qVar).width);
            i4 = w3;
            i5 = w4;
        }
        n0 n0Var = (n0) view.getLayoutParams();
        if (z3 ? x0(view, i5, i4, n0Var) : v0(view, i5, i4, n0Var)) {
            view.measure(i5, i4);
        }
    }

    public final void m1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(w0.d("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.K.w();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final int n(y0 y0Var) {
        return E0(y0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final int n0(int i, s0 s0Var, y0 y0Var) {
        n1();
        g1();
        return super.n0(i, s0Var, y0Var);
    }

    public final void n1() {
        int D;
        int G;
        if (this.f648p == 1) {
            D = this.f1455n - F();
            G = E();
        } else {
            D = this.f1456o - D();
            G = G();
        }
        f1(D - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final int o(y0 y0Var) {
        return F0(y0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final int p0(int i, s0 s0Var, y0 y0Var) {
        n1();
        g1();
        return super.p0(i, s0Var, y0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final n0 r() {
        return this.f648p == 0 ? new f1.q(-2, -1) : new f1.q(-1, -2);
    }

    @Override // f1.m0
    public final n0 s(Context context, AttributeSet attributeSet) {
        f1.q qVar = new f1.q(context, attributeSet);
        qVar.f1472e = -1;
        qVar.f1473f = 0;
        return qVar;
    }

    @Override // f1.m0
    public final void s0(Rect rect, int i, int i4) {
        int g4;
        int g5;
        if (this.G == null) {
            super.s0(rect, i, i4);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.f648p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f1445b;
            WeakHashMap weakHashMap = l0.f2757a;
            g5 = m0.g(i4, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g4 = m0.g(i, iArr[iArr.length - 1] + F, this.f1445b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f1445b;
            WeakHashMap weakHashMap2 = l0.f2757a;
            g4 = m0.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g5 = m0.g(i4, iArr2[iArr2.length - 1] + D, this.f1445b.getMinimumHeight());
        }
        this.f1445b.setMeasuredDimension(g4, g5);
    }

    @Override // f1.m0
    public final n0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            f1.q qVar = new f1.q((ViewGroup.MarginLayoutParams) layoutParams);
            qVar.f1472e = -1;
            qVar.f1473f = 0;
            return qVar;
        }
        f1.q qVar2 = new f1.q(layoutParams);
        qVar2.f1472e = -1;
        qVar2.f1473f = 0;
        return qVar2;
    }

    @Override // f1.m0
    public final int x(s0 s0Var, y0 y0Var) {
        if (this.f648p == 1) {
            return this.F;
        }
        if (y0Var.b() < 1) {
            return 0;
        }
        return i1(y0Var.b() - 1, s0Var, y0Var) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q(7);
        this.L = new Rect();
        m1(i);
    }

    public GridLayoutManager() {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q(7);
        this.L = new Rect();
        m1(2);
    }
}
