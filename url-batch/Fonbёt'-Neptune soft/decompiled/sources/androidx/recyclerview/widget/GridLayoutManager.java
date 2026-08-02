package androidx.recyclerview.widget;

import B.m;
import P.B;
import P.C0102l;
import P.E;
import P.v;
import P.w;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f1811p;

    /* renamed from: q, reason: collision with root package name */
    public final m f1812q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1811p = -1;
        new SparseIntArray();
        new SparseIntArray();
        m mVar = new m(10);
        this.f1812q = mVar;
        new Rect();
        int i4 = v.w(context, attributeSet, i2, i3).f934c;
        if (i4 == this.f1811p) {
            return;
        }
        if (i4 < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
        this.f1811p = i4;
        ((SparseIntArray) mVar.f78f).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(B b2, E e2, int i2) {
        boolean z2 = e2.f836c;
        m mVar = this.f1812q;
        if (!z2) {
            int i3 = this.f1811p;
            mVar.getClass();
            return m.n(i2, i3);
        }
        RecyclerView recyclerView = (RecyclerView) b2.f832f;
        if (i2 < 0 || i2 >= recyclerView.f1849b0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f1849b0.a() + recyclerView.h());
        }
        int y2 = !recyclerView.f1849b0.f836c ? i2 : recyclerView.f1855g.y(i2, 0);
        if (y2 != -1) {
            int i4 = this.f1811p;
            mVar.getClass();
            return m.n(y2, i4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // P.v
    public final boolean d(w wVar) {
        return wVar instanceof C0102l;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, P.v
    public final w l() {
        return this.f1813h == 0 ? new C0102l(-2, -1) : new C0102l(-1, -2);
    }

    @Override // P.v
    public final w m(Context context, AttributeSet attributeSet) {
        return new C0102l(context, attributeSet);
    }

    @Override // P.v
    public final w n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0102l((ViewGroup.MarginLayoutParams) layoutParams) : new C0102l(layoutParams);
    }

    @Override // P.v
    public final int q(B b2, E e2) {
        if (this.f1813h == 1) {
            return this.f1811p;
        }
        if (e2.a() < 1) {
            return 0;
        }
        return R(b2, e2, e2.a() - 1) + 1;
    }

    @Override // P.v
    public final int x(B b2, E e2) {
        if (this.f1813h == 0) {
            return this.f1811p;
        }
        if (e2.a() < 1) {
            return 0;
        }
        return R(b2, e2, e2.a() - 1) + 1;
    }
}
