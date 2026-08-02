package androidx.recyclerview.widget;

import E1.AbstractC0033i;
import U.A;
import U.C0076l;
import U.D;
import U.u;
import U.v;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import b0.C0178i;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f2434p;

    /* renamed from: q, reason: collision with root package name */
    public final C0178i f2435q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f2434p = -1;
        new SparseIntArray();
        new SparseIntArray();
        C0178i c0178i = new C0178i(24);
        this.f2435q = c0178i;
        new Rect();
        int i5 = u.w(context, attributeSet, i3, i4).f1440c;
        if (i5 == this.f2434p) {
            return;
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0033i.h(i5, "Span count should be at least 1. Provided "));
        }
        this.f2434p = i5;
        ((SparseIntArray) c0178i.f2532b).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(A a3, D d3, int i3) {
        boolean z = d3.f1354c;
        C0178i c0178i = this.f2435q;
        if (!z) {
            int i4 = this.f2434p;
            c0178i.getClass();
            return C0178i.t(i3, i4);
        }
        RecyclerView recyclerView = (RecyclerView) a3.f;
        D d4 = recyclerView.f2466U;
        if (i3 < 0 || i3 >= d4.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + d4.a() + recyclerView.h());
        }
        int A3 = !d4.f1354c ? i3 : recyclerView.f2473c.A(i3, 0);
        if (A3 != -1) {
            int i5 = this.f2434p;
            c0178i.getClass();
            return C0178i.t(A3, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // U.u
    public final boolean d(v vVar) {
        return vVar instanceof C0076l;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, U.u
    public final v l() {
        return this.f2436h == 0 ? new C0076l(-2, -1) : new C0076l(-1, -2);
    }

    @Override // U.u
    public final v m(Context context, AttributeSet attributeSet) {
        return new C0076l(context, attributeSet);
    }

    @Override // U.u
    public final v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0076l((ViewGroup.MarginLayoutParams) layoutParams) : new C0076l(layoutParams);
    }

    @Override // U.u
    public final int q(A a3, D d3) {
        if (this.f2436h == 1) {
            return this.f2434p;
        }
        if (d3.a() < 1) {
            return 0;
        }
        return R(a3, d3, d3.a() - 1) + 1;
    }

    @Override // U.u
    public final int x(A a3, D d3) {
        if (this.f2436h == 0) {
            return this.f2434p;
        }
        if (d3.a() < 1) {
            return 0;
        }
        return R(a3, d3, d3.a() - 1) + 1;
    }
}
