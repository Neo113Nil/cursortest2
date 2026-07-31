package androidx.recyclerview.widget;

import B0.E;
import L.d;
import N.C;
import N.C0055l;
import N.F;
import N.w;
import N.x;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f1645p;

    /* renamed from: q, reason: collision with root package name */
    public final E f1646q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1645p = -1;
        new SparseIntArray();
        new SparseIntArray();
        E e2 = new E(8);
        this.f1646q = e2;
        new Rect();
        int i4 = w.w(context, attributeSet, i2, i3).f760c;
        if (i4 == this.f1645p) {
            return;
        }
        if (i4 < 1) {
            throw new IllegalArgumentException(d.e("Span count should be at least 1. Provided ", i4));
        }
        this.f1645p = i4;
        ((SparseIntArray) e2.f20f).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(C c2, F f2, int i2) {
        boolean z2 = f2.f659c;
        E e2 = this.f1646q;
        if (!z2) {
            e2.getClass();
            return E.A(i2, this.f1645p);
        }
        RecyclerView recyclerView = c2.f655f;
        F f3 = recyclerView.b0;
        if (i2 < 0 || i2 >= f3.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + f3.a() + recyclerView.h());
        }
        int t = !f3.f659c ? i2 : recyclerView.f1687g.t(i2, 0);
        if (t != -1) {
            e2.getClass();
            return E.A(t, this.f1645p);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // N.w
    public final boolean d(x xVar) {
        return xVar instanceof C0055l;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, N.w
    public final x l() {
        return this.f1647h == 0 ? new C0055l(-2, -1) : new C0055l(-1, -2);
    }

    @Override // N.w
    public final x m(Context context, AttributeSet attributeSet) {
        return new C0055l(context, attributeSet);
    }

    @Override // N.w
    public final x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0055l((ViewGroup.MarginLayoutParams) layoutParams) : new C0055l(layoutParams);
    }

    @Override // N.w
    public final int q(C c2, F f2) {
        if (this.f1647h == 1) {
            return this.f1645p;
        }
        if (f2.a() < 1) {
            return 0;
        }
        return R(c2, f2, f2.a() - 1) + 1;
    }

    @Override // N.w
    public final int x(C c2, F f2) {
        if (this.f1647h == 0) {
            return this.f1645p;
        }
        if (f2.a() < 1) {
            return 0;
        }
        return R(c2, f2, f2.a() - 1) + 1;
    }
}
