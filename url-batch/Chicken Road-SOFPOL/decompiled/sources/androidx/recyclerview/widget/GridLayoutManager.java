package androidx.recyclerview.widget;

import a0.q;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Arrays;
import q3.k;
import r3.f;
import w4.d0;
import w4.e0;
import w4.j0;
import w4.m;
import w4.m0;
import w4.p;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final k A;
    public final Rect B;

    /* renamed from: v, reason: collision with root package name */
    public final int f889v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f890w;

    /* renamed from: x, reason: collision with root package name */
    public View[] f891x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseIntArray f892y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseIntArray f893z;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        super(context, attributeSet, i, i8);
        this.f889v = -1;
        this.f892y = new SparseIntArray();
        this.f893z = new SparseIntArray();
        k kVar = new k(14);
        this.A = kVar;
        this.B = new Rect();
        int i9 = d0.B(context, attributeSet, i, i8).f7991c;
        if (i9 == this.f889v) {
            return;
        }
        if (i9 < 1) {
            throw new IllegalArgumentException(q.h("Span count should be at least 1. Provided ", i9));
        }
        this.f889v = i9;
        ((SparseIntArray) kVar.f6119e).clear();
        W();
    }

    @Override // w4.d0
    public final int C(j0 j0Var, m0 m0Var) {
        if (this.f894k == 0) {
            return this.f889v;
        }
        if (m0Var.a() < 1) {
            return 0;
        }
        return v0(m0Var.a() - 1, j0Var, m0Var) + 1;
    }

    @Override // w4.d0
    public final void O(j0 j0Var, m0 m0Var, View view, f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        if (view.getLayoutParams() instanceof m) {
            throw null;
        }
        N(view, fVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.d0
    public final int X(int i, j0 j0Var, m0 m0Var) {
        y0();
        t0();
        return super.X(i, j0Var, m0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.d0
    public final int Y(int i, j0 j0Var, m0 m0Var) {
        y0();
        t0();
        return super.Y(i, j0Var, m0Var);
    }

    @Override // w4.d0
    public final boolean e(e0 e0Var) {
        return e0Var instanceof m;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.d0
    public final int h(m0 m0Var) {
        return d0(m0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.d0
    public final int i(m0 m0Var) {
        return e0(m0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.d0
    public final int k(m0 m0Var) {
        return d0(m0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.d0
    public final int l(m0 m0Var) {
        return e0(m0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.d0
    public final e0 m() {
        return this.f894k == 0 ? new m(-2, -1) : new m(-1, -2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        r22.f8001b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(j0 j0Var, m0 m0Var, w4.q qVar, p pVar) {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int r7;
        int i15;
        ?? r13;
        int i16;
        View b8;
        int i17;
        int k3 = this.f896m.k();
        boolean z3 = k3 != 1073741824;
        int i18 = q() > 0 ? this.f890w[this.f889v] : 0;
        if (z3) {
            y0();
        }
        boolean z7 = qVar.f8015e == 1;
        if (z7) {
            i = this.f889v;
        } else {
            int i19 = qVar.f8014d;
            boolean z8 = m0Var.f7977e;
            k kVar = this.A;
            if (z8) {
                int i20 = this.f893z.get(i19, -1);
                if (i20 != -1) {
                    i17 = i20;
                } else {
                    int b9 = j0Var.b(i19);
                    if (b9 == -1) {
                        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i19);
                        i17 = 0;
                    } else {
                        kVar.getClass();
                        i17 = b9 % this.f889v;
                    }
                }
            } else {
                kVar.getClass();
                i17 = i19 % this.f889v;
            }
            i = w0(qVar.f8014d, j0Var, m0Var) + i17;
        }
        int i21 = 0;
        while (i21 < this.f889v && (i16 = qVar.f8014d) >= 0 && i16 < m0Var.a() && i > 0) {
            int i22 = qVar.f8014d;
            int w02 = w0(i22, j0Var, m0Var);
            if (w02 > this.f889v) {
                throw new IllegalArgumentException("Item at position " + i22 + " requires " + w02 + " spans but GridLayoutManager has only " + this.f889v + " spans.");
            }
            i -= w02;
            if (i < 0 || (b8 = qVar.b(j0Var)) == null) {
                break;
            }
            this.f891x[i21] = b8;
            i21++;
        }
        if (z7) {
            i10 = 1;
            i9 = i21;
            i8 = 0;
        } else {
            i8 = i21 - 1;
            i9 = -1;
            i10 = -1;
        }
        int i23 = 0;
        while (i8 != i9) {
            View view = this.f891x[i8];
            m mVar = (m) view.getLayoutParams();
            int w03 = w0(d0.A(view), j0Var, m0Var);
            mVar.f7972e = w03;
            mVar.f7971d = i23;
            i23 += w03;
            i8 += i10;
        }
        float f6 = 0.0f;
        int i24 = 0;
        for (int i25 = 0; i25 < i21; i25++) {
            View view2 = this.f891x[i25];
            if (qVar.f8019j != null) {
                r13 = 0;
                r13 = 0;
                if (z7) {
                    a(view2, -1, true);
                } else {
                    a(view2, 0, true);
                }
            } else if (z7) {
                r13 = 0;
                a(view2, -1, false);
            } else {
                r13 = 0;
                a(view2, 0, false);
            }
            RecyclerView recyclerView = this.f7900b;
            Rect rect = this.B;
            if (recyclerView == null) {
                rect.set(r13, r13, r13, r13);
            } else {
                rect.set(recyclerView.t(view2));
            }
            x0(view2, k3, r13);
            int d8 = this.f896m.d(view2);
            if (d8 > i24) {
                i24 = d8;
            }
            float e8 = (this.f896m.e(view2) * 1.0f) / ((m) view2.getLayoutParams()).f7972e;
            if (e8 > f6) {
                f6 = e8;
            }
        }
        if (z3) {
            s0(Math.max(Math.round(f6 * this.f889v), i18));
            int i26 = 0;
            for (int i27 = 0; i27 < i21; i27++) {
                View view3 = this.f891x[i27];
                x0(view3, 1073741824, true);
                int d9 = this.f896m.d(view3);
                if (d9 > i26) {
                    i26 = d9;
                }
            }
            i24 = i26;
        }
        for (int i28 = 0; i28 < i21; i28++) {
            View view4 = this.f891x[i28];
            if (this.f896m.d(view4) != i24) {
                m mVar2 = (m) view4.getLayoutParams();
                Rect rect2 = mVar2.f7908a;
                int i29 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar2).topMargin + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin;
                int i30 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) mVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mVar2).rightMargin;
                int u02 = u0(mVar2.f7971d, mVar2.f7972e);
                if (this.f894k == 1) {
                    i15 = d0.r(false, u02, 1073741824, i30, ((ViewGroup.MarginLayoutParams) mVar2).width);
                    r7 = View.MeasureSpec.makeMeasureSpec(i24 - i29, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24 - i30, 1073741824);
                    r7 = d0.r(false, u02, 1073741824, i29, ((ViewGroup.MarginLayoutParams) mVar2).height);
                    i15 = makeMeasureSpec;
                }
                if (b0(view4, i15, r7, (e0) view4.getLayoutParams())) {
                    view4.measure(i15, r7);
                }
            }
        }
        pVar.f8000a = i24;
        if (this.f894k != 1) {
            if (qVar.f8016f == -1) {
                int i31 = qVar.f8012b;
                i12 = i31 - i24;
                i11 = i31;
            } else {
                int i32 = qVar.f8012b;
                i11 = i32 + i24;
                i12 = i32;
            }
            i13 = 0;
            i14 = 0;
        } else if (qVar.f8016f == -1) {
            i14 = qVar.f8012b;
            i13 = i14 - i24;
            i12 = 0;
            i11 = 0;
        } else {
            int i33 = qVar.f8012b;
            i13 = i33;
            i11 = 0;
            i14 = i33 + i24;
            i12 = 0;
        }
        if (i21 <= 0) {
            Arrays.fill(this.f891x, (Object) null);
            return;
        }
        View view5 = this.f891x[0];
        m mVar3 = (m) view5.getLayoutParams();
        if (this.f894k != 1) {
            i13 = z() + this.f890w[mVar3.f7971d];
            i14 = this.f896m.e(view5) + i13;
        } else if (l0()) {
            i11 = this.f890w[this.f889v - mVar3.f7971d] + x();
            i12 = i11 - this.f896m.e(view5);
        } else {
            i12 = x() + this.f890w[mVar3.f7971d];
            i11 = this.f896m.e(view5) + i12;
        }
        d0.G(view5, i12, i13, i11, i14);
        mVar3.getClass();
        throw null;
    }

    @Override // w4.d0
    public final e0 n(Context context, AttributeSet attributeSet) {
        m mVar = new m(context, attributeSet);
        mVar.f7971d = -1;
        mVar.f7972e = 0;
        return mVar;
    }

    @Override // w4.d0
    public final e0 o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            m mVar = new m((ViewGroup.MarginLayoutParams) layoutParams);
            mVar.f7971d = -1;
            mVar.f7972e = 0;
            return mVar;
        }
        m mVar2 = new m(layoutParams);
        mVar2.f7971d = -1;
        mVar2.f7972e = 0;
        return mVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r0(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.r0(false);
    }

    @Override // w4.d0
    public final int s(j0 j0Var, m0 m0Var) {
        if (this.f894k == 1) {
            return this.f889v;
        }
        if (m0Var.a() < 1) {
            return 0;
        }
        return v0(m0Var.a() - 1, j0Var, m0Var) + 1;
    }

    public final void s0(int i) {
        int i8;
        int[] iArr = this.f890w;
        int i9 = this.f889v;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i9 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i / i9;
        int i12 = i % i9;
        int i13 = 0;
        for (int i14 = 1; i14 <= i9; i14++) {
            i10 += i12;
            if (i10 <= 0 || i9 - i10 >= i12) {
                i8 = i11;
            } else {
                i8 = i11 + 1;
                i10 -= i9;
            }
            i13 += i8;
            iArr[i14] = i13;
        }
        this.f890w = iArr;
    }

    public final void t0() {
        View[] viewArr = this.f891x;
        if (viewArr == null || viewArr.length != this.f889v) {
            this.f891x = new View[this.f889v];
        }
    }

    public final int u0(int i, int i8) {
        if (this.f894k != 1 || !l0()) {
            int[] iArr = this.f890w;
            return iArr[i8 + i] - iArr[i];
        }
        int[] iArr2 = this.f890w;
        int i9 = this.f889v;
        return iArr2[i9 - i] - iArr2[(i9 - i) - i8];
    }

    public final int v0(int i, j0 j0Var, m0 m0Var) {
        boolean z3 = m0Var.f7977e;
        k kVar = this.A;
        if (!z3) {
            kVar.getClass();
            return k.j(i, this.f889v);
        }
        int b8 = j0Var.b(i);
        if (b8 != -1) {
            kVar.getClass();
            return k.j(b8, this.f889v);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int w0(int i, j0 j0Var, m0 m0Var) {
        boolean z3 = m0Var.f7977e;
        k kVar = this.A;
        if (!z3) {
            kVar.getClass();
            return 1;
        }
        int i8 = this.f892y.get(i, -1);
        if (i8 != -1) {
            return i8;
        }
        if (j0Var.b(i) != -1) {
            kVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void x0(View view, int i, boolean z3) {
        int i8;
        int i9;
        m mVar = (m) view.getLayoutParams();
        Rect rect = mVar.f7908a;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
        int u02 = u0(mVar.f7971d, mVar.f7972e);
        if (this.f894k == 1) {
            i9 = d0.r(false, u02, i, i11, ((ViewGroup.MarginLayoutParams) mVar).width);
            i8 = d0.r(true, this.f896m.o(), this.f7906h, i10, ((ViewGroup.MarginLayoutParams) mVar).height);
        } else {
            int r7 = d0.r(false, u02, i, i10, ((ViewGroup.MarginLayoutParams) mVar).height);
            int r8 = d0.r(true, this.f896m.o(), this.f7905g, i11, ((ViewGroup.MarginLayoutParams) mVar).width);
            i8 = r7;
            i9 = r8;
        }
        e0 e0Var = (e0) view.getLayoutParams();
        if (z3 ? b0(view, i9, i8, e0Var) : a0(view, i9, i8, e0Var)) {
            view.measure(i9, i8);
        }
    }

    public final void y0() {
        int w7;
        int z3;
        if (this.f894k == 1) {
            w7 = this.i - y();
            z3 = x();
        } else {
            w7 = this.f7907j - w();
            z3 = z();
        }
        s0(w7 - z3);
    }
}
