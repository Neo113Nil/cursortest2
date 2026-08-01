package androidx.recyclerview.widget;

import a2.s;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.w0;
import b1.n0;
import b1.o;
import b1.o0;
import b1.r;
import b1.t;
import b1.t0;
import b1.u;
import b1.v;
import b1.z0;
import java.util.Arrays;
import java.util.WeakHashMap;
import k0.j0;
import l0.e;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final s K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new s(7);
        this.L = new Rect();
        m1(n0.I(context, attributeSet, i4, i5).f846b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final boolean A0() {
        return this.f627z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(z0 z0Var, v vVar, o oVar) {
        int i4;
        int i5 = this.F;
        for (int i6 = 0; i6 < this.F && (i4 = vVar.f927d) >= 0 && i4 < z0Var.b() && i5 > 0; i6++) {
            oVar.a(vVar.f927d, Math.max(0, vVar.g));
            this.K.getClass();
            i5--;
            vVar.f927d += vVar.f928e;
        }
    }

    @Override // b1.n0
    public final int J(t0 t0Var, z0 z0Var) {
        if (this.f617p == 0) {
            return this.F;
        }
        if (z0Var.b() < 1) {
            return 0;
        }
        return i1(z0Var.b() - 1, t0Var, z0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(t0 t0Var, z0 z0Var, boolean z3, boolean z4) {
        int i4;
        int i5;
        int v3 = v();
        int i6 = 1;
        if (z4) {
            i5 = v() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = v3;
            i5 = 0;
        }
        int b2 = z0Var.b();
        H0();
        int k4 = this.f619r.k();
        int g = this.f619r.g();
        View view = null;
        View view2 = null;
        while (i5 != i4) {
            View u3 = u(i5);
            int H = n0.H(u3);
            if (H >= 0 && H < b2 && j1(H, t0Var, z0Var) == 0) {
                if (((o0) u3.getLayoutParams()).f889a.h()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f619r.e(u3) < g && this.f619r.b(u3) >= k4) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i5 += i6;
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
    
        if (((java.util.ArrayList) r22.f874a.f358d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i4, t0 t0Var, z0 z0Var) {
        View A;
        int v3;
        int i5;
        int i6;
        View view2;
        View view3;
        int i7;
        int i8;
        t0 t0Var2 = t0Var;
        z0 z0Var2 = z0Var;
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            A = recyclerView.A(view);
            if (A != null) {
            }
        }
        A = null;
        if (A != null) {
            r rVar = (r) A.getLayoutParams();
            int i9 = rVar.f900e;
            int i10 = rVar.f901f + i9;
            if (super.T(view, i4, t0Var, z0Var) != null) {
                if ((G0(i4) == 1) != this.f622u) {
                    i6 = v() - 1;
                    v3 = -1;
                    i5 = -1;
                } else {
                    v3 = v();
                    i5 = 1;
                    i6 = 0;
                }
                boolean z3 = this.f617p == 1 && T0();
                int i1 = i1(i6, t0Var2, z0Var2);
                View view4 = null;
                int i11 = -1;
                int i12 = -1;
                int i13 = 0;
                int i14 = i6;
                int i15 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i14 == v3) {
                        break;
                    }
                    int i16 = i1(i14, t0Var2, z0Var2);
                    View u3 = u(i14);
                    if (u3 == A) {
                        break;
                    }
                    if (!u3.hasFocusable() || i16 == i1) {
                        r rVar2 = (r) u3.getLayoutParams();
                        int i17 = rVar2.f900e;
                        view3 = A;
                        int i18 = rVar2.f901f + i17;
                        if (u3.hasFocusable() && i17 == i9 && i18 == i10) {
                            return u3;
                        }
                        if (!(u3.hasFocusable() && view4 == null) && (u3.hasFocusable() || view2 != null)) {
                            i7 = v3;
                            int min = Math.min(i18, i10) - Math.max(i17, i9);
                            if (u3.hasFocusable()) {
                                if (min <= i13) {
                                    if (min == i13) {
                                    }
                                    i8 = i13;
                                }
                                i8 = i13;
                            } else {
                                if (view4 == null) {
                                    i8 = i13;
                                    if (!this.c.x(u3) || !this.f876d.x(u3)) {
                                        if (min <= i15) {
                                            if (min == i15) {
                                            }
                                        }
                                    }
                                }
                                i8 = i13;
                            }
                        } else {
                            i8 = i13;
                            i7 = v3;
                        }
                        if (u3.hasFocusable()) {
                            int i19 = rVar2.f900e;
                            i13 = Math.min(i18, i10) - Math.max(i17, i9);
                            view4 = u3;
                            i12 = i19;
                            view5 = view2;
                        } else {
                            int i20 = rVar2.f900e;
                            view5 = u3;
                            i11 = i20;
                            i13 = i8;
                            i15 = Math.min(i18, i10) - Math.max(i17, i9);
                        }
                        i14 += i5;
                        t0Var2 = t0Var;
                        z0Var2 = z0Var;
                        A = view3;
                        v3 = i7;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = A;
                        i8 = i13;
                        i7 = v3;
                    }
                    view5 = view2;
                    i13 = i8;
                    i14 += i5;
                    t0Var2 = t0Var;
                    z0Var2 = z0Var;
                    A = view3;
                    v3 = i7;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f923b = true;
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
    public final void U0(t0 t0Var, z0 z0Var, v vVar, u uVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int w3;
        int i11;
        ?? r12;
        int i12;
        View b2;
        int j4 = this.f619r.j();
        boolean z3 = j4 != 1073741824;
        int i13 = v() > 0 ? this.G[this.F] : 0;
        if (z3) {
            n1();
        }
        boolean z4 = vVar.f928e == 1;
        int i14 = this.F;
        if (!z4) {
            i14 = j1(vVar.f927d, t0Var, z0Var) + k1(vVar.f927d, t0Var, z0Var);
        }
        int i15 = 0;
        while (i15 < this.F && (i12 = vVar.f927d) >= 0 && i12 < z0Var.b() && i14 > 0) {
            int i16 = vVar.f927d;
            int k12 = k1(i16, t0Var, z0Var);
            if (k12 > this.F) {
                throw new IllegalArgumentException("Item at position " + i16 + " requires " + k12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i14 -= k12;
            if (i14 < 0 || (b2 = vVar.b(t0Var)) == null) {
                break;
            }
            this.H[i15] = b2;
            i15++;
        }
        if (z4) {
            i6 = 1;
            i5 = i15;
            i4 = 0;
        } else {
            i4 = i15 - 1;
            i5 = -1;
            i6 = -1;
        }
        int i17 = 0;
        while (i4 != i5) {
            View view = this.H[i4];
            r rVar = (r) view.getLayoutParams();
            int k13 = k1(n0.H(view), t0Var, z0Var);
            rVar.f901f = k13;
            rVar.f900e = i17;
            i17 += k13;
            i4 += i6;
        }
        float f4 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.H[i19];
            if (vVar.f932k != null) {
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
            RecyclerView recyclerView = this.f875b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.J(view2));
            }
            l1(view2, j4, r12);
            int c = this.f619r.c(view2);
            if (c > i18) {
                i18 = c;
            }
            float d4 = (this.f619r.d(view2) * 1.0f) / ((r) view2.getLayoutParams()).f901f;
            if (d4 > f4) {
                f4 = d4;
            }
        }
        if (z3) {
            f1(Math.max(Math.round(f4 * this.F), i13));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.H[i20];
                l1(view3, 1073741824, true);
                int c4 = this.f619r.c(view3);
                if (c4 > i18) {
                    i18 = c4;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.H[i21];
            if (this.f619r.c(view4) != i18) {
                r rVar2 = (r) view4.getLayoutParams();
                Rect rect2 = rVar2.f890b;
                int i22 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar2).topMargin + ((ViewGroup.MarginLayoutParams) rVar2).bottomMargin;
                int i23 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar2).leftMargin + ((ViewGroup.MarginLayoutParams) rVar2).rightMargin;
                int h12 = h1(rVar2.f900e, rVar2.f901f);
                if (this.f617p == 1) {
                    i11 = n0.w(false, h12, 1073741824, i23, ((ViewGroup.MarginLayoutParams) rVar2).width);
                    w3 = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    w3 = n0.w(false, h12, 1073741824, i22, ((ViewGroup.MarginLayoutParams) rVar2).height);
                    i11 = makeMeasureSpec;
                }
                if (x0(view4, i11, w3, (o0) view4.getLayoutParams())) {
                    view4.measure(i11, w3);
                }
            }
        }
        uVar.f922a = i18;
        if (this.f617p != 1) {
            if (vVar.f929f == -1) {
                int i24 = vVar.f926b;
                i9 = i24 - i18;
                i8 = 0;
                i7 = i24;
            } else {
                int i25 = vVar.f926b;
                i7 = i25 + i18;
                i8 = 0;
                i9 = i25;
            }
            i10 = i8;
        } else if (vVar.f929f == -1) {
            i10 = vVar.f926b;
            i8 = i10 - i18;
            i9 = 0;
            i7 = 0;
        } else {
            int i26 = vVar.f926b;
            i7 = 0;
            i8 = i26;
            i10 = i26 + i18;
            i9 = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.H[i27];
            r rVar3 = (r) view5.getLayoutParams();
            if (this.f617p != 1) {
                i8 = G() + this.G[rVar3.f900e];
                i10 = this.f619r.d(view5) + i8;
            } else if (T0()) {
                int E = E() + this.G[this.F - rVar3.f900e];
                i7 = E;
                i9 = E - this.f619r.d(view5);
            } else {
                i9 = E() + this.G[rVar3.f900e];
                i7 = this.f619r.d(view5) + i9;
            }
            n0.N(view5, i9, i8, i7, i10);
            if (rVar3.f889a.h() || rVar3.f889a.k()) {
                uVar.c = true;
            }
            uVar.f924d = view5.hasFocusable() | uVar.f924d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(t0 t0Var, z0 z0Var, t tVar, int i4) {
        n1();
        if (z0Var.b() > 0 && !z0Var.g) {
            boolean z3 = i4 == 1;
            int j12 = j1(tVar.f914b, t0Var, z0Var);
            if (z3) {
                while (j12 > 0) {
                    int i5 = tVar.f914b;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = i5 - 1;
                    tVar.f914b = i6;
                    j12 = j1(i6, t0Var, z0Var);
                }
            } else {
                int b2 = z0Var.b() - 1;
                int i7 = tVar.f914b;
                while (i7 < b2) {
                    int i8 = i7 + 1;
                    int j13 = j1(i8, t0Var, z0Var);
                    if (j13 <= j12) {
                        break;
                    }
                    i7 = i8;
                    j12 = j13;
                }
                tVar.f914b = i7;
            }
        }
        g1();
    }

    @Override // b1.n0
    public final void W(t0 t0Var, z0 z0Var, View view, e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            V(view, eVar);
            return;
        }
        r rVar = (r) layoutParams;
        int i1 = i1(rVar.f889a.b(), t0Var, z0Var);
        if (this.f617p == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(rVar.f900e, rVar.f901f, i1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, 1, rVar.f900e, rVar.f901f, false, false));
        }
    }

    @Override // b1.n0
    public final void X(int i4, int i5) {
        s sVar = this.K;
        sVar.w();
        ((SparseIntArray) sVar.h).clear();
    }

    @Override // b1.n0
    public final void Y() {
        s sVar = this.K;
        sVar.w();
        ((SparseIntArray) sVar.h).clear();
    }

    @Override // b1.n0
    public final void Z(int i4, int i5) {
        s sVar = this.K;
        sVar.w();
        ((SparseIntArray) sVar.h).clear();
    }

    @Override // b1.n0
    public final void a0(int i4, int i5) {
        s sVar = this.K;
        sVar.w();
        ((SparseIntArray) sVar.h).clear();
    }

    @Override // b1.n0
    public final void b0(int i4, int i5) {
        s sVar = this.K;
        sVar.w();
        ((SparseIntArray) sVar.h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.b1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final void c0(t0 t0Var, z0 z0Var) {
        boolean z3 = z0Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z3) {
            int v3 = v();
            for (int i4 = 0; i4 < v3; i4++) {
                r rVar = (r) u(i4).getLayoutParams();
                int b2 = rVar.f889a.b();
                sparseIntArray2.put(b2, rVar.f901f);
                sparseIntArray.put(b2, rVar.f900e);
            }
        }
        super.c0(t0Var, z0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final void d0(z0 z0Var) {
        super.d0(z0Var);
        this.E = false;
    }

    @Override // b1.n0
    public final boolean f(o0 o0Var) {
        return o0Var instanceof r;
    }

    public final void f1(int i4) {
        int i5;
        int[] iArr = this.G;
        int i6 = this.F;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i6 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i4 / i6;
        int i9 = i4 % i6;
        int i10 = 0;
        for (int i11 = 1; i11 <= i6; i11++) {
            i7 += i9;
            if (i7 <= 0 || i6 - i7 >= i9) {
                i5 = i8;
            } else {
                i5 = i8 + 1;
                i7 -= i6;
            }
            i10 += i5;
            iArr[i11] = i10;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i4, int i5) {
        if (this.f617p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.G;
        int i6 = this.F;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    public final int i1(int i4, t0 t0Var, z0 z0Var) {
        boolean z3 = z0Var.g;
        s sVar = this.K;
        if (!z3) {
            int i5 = this.F;
            sVar.getClass();
            return s.v(i4, i5);
        }
        int b2 = t0Var.b(i4);
        if (b2 != -1) {
            int i6 = this.F;
            sVar.getClass();
            return s.v(b2, i6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    public final int j1(int i4, t0 t0Var, z0 z0Var) {
        boolean z3 = z0Var.g;
        s sVar = this.K;
        if (!z3) {
            int i5 = this.F;
            sVar.getClass();
            return i4 % i5;
        }
        int i6 = this.J.get(i4, -1);
        if (i6 != -1) {
            return i6;
        }
        int b2 = t0Var.b(i4);
        if (b2 != -1) {
            int i7 = this.F;
            sVar.getClass();
            return b2 % i7;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int k(z0 z0Var) {
        return E0(z0Var);
    }

    public final int k1(int i4, t0 t0Var, z0 z0Var) {
        boolean z3 = z0Var.g;
        s sVar = this.K;
        if (!z3) {
            sVar.getClass();
            return 1;
        }
        int i5 = this.I.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        if (t0Var.b(i4) != -1) {
            sVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int l(z0 z0Var) {
        return F0(z0Var);
    }

    public final void l1(View view, int i4, boolean z3) {
        int i5;
        int i6;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f890b;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int h12 = h1(rVar.f900e, rVar.f901f);
        if (this.f617p == 1) {
            i6 = n0.w(false, h12, i4, i8, ((ViewGroup.MarginLayoutParams) rVar).width);
            i5 = n0.w(true, this.f619r.l(), this.f883m, i7, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int w3 = n0.w(false, h12, i4, i7, ((ViewGroup.MarginLayoutParams) rVar).height);
            int w4 = n0.w(true, this.f619r.l(), this.f882l, i8, ((ViewGroup.MarginLayoutParams) rVar).width);
            i5 = w3;
            i6 = w4;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        if (z3 ? x0(view, i6, i5, o0Var) : v0(view, i6, i5, o0Var)) {
            view.measure(i6, i5);
        }
    }

    public final void m1(int i4) {
        if (i4 == this.F) {
            return;
        }
        this.E = true;
        if (i4 < 1) {
            throw new IllegalArgumentException(w0.e("Span count should be at least 1. Provided ", i4));
        }
        this.F = i4;
        this.K.w();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int n(z0 z0Var) {
        return E0(z0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int n0(int i4, t0 t0Var, z0 z0Var) {
        n1();
        g1();
        return super.n0(i4, t0Var, z0Var);
    }

    public final void n1() {
        int D;
        int G;
        if (this.f617p == 1) {
            D = this.f884n - F();
            G = E();
        } else {
            D = this.f885o - D();
            G = G();
        }
        f1(D - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int o(z0 z0Var) {
        return F0(z0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final int p0(int i4, t0 t0Var, z0 z0Var) {
        n1();
        g1();
        return super.p0(i4, t0Var, z0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final o0 r() {
        return this.f617p == 0 ? new r(-2, -1) : new r(-1, -2);
    }

    @Override // b1.n0
    public final o0 s(Context context, AttributeSet attributeSet) {
        r rVar = new r(context, attributeSet);
        rVar.f900e = -1;
        rVar.f901f = 0;
        return rVar;
    }

    @Override // b1.n0
    public final void s0(Rect rect, int i4, int i5) {
        int g;
        int g4;
        if (this.G == null) {
            super.s0(rect, i4, i5);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.f617p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f875b;
            WeakHashMap weakHashMap = j0.f2752a;
            g4 = n0.g(i5, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g = n0.g(i4, iArr[iArr.length - 1] + F, this.f875b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f875b;
            WeakHashMap weakHashMap2 = j0.f2752a;
            g = n0.g(i4, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g4 = n0.g(i5, iArr2[iArr2.length - 1] + D, this.f875b.getMinimumHeight());
        }
        this.f875b.setMeasuredDimension(g, g4);
    }

    @Override // b1.n0
    public final o0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r rVar = new r((ViewGroup.MarginLayoutParams) layoutParams);
            rVar.f900e = -1;
            rVar.f901f = 0;
            return rVar;
        }
        r rVar2 = new r(layoutParams);
        rVar2.f900e = -1;
        rVar2.f901f = 0;
        return rVar2;
    }

    @Override // b1.n0
    public final int x(t0 t0Var, z0 z0Var) {
        if (this.f617p == 1) {
            return this.F;
        }
        if (z0Var.b() < 1) {
            return 0;
        }
        return i1(z0Var.b() - 1, t0Var, z0Var) + 1;
    }

    public GridLayoutManager(int i4) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new s(7);
        this.L = new Rect();
        m1(i4);
    }
}
