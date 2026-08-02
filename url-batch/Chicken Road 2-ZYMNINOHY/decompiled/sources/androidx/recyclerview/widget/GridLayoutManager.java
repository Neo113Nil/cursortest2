package androidx.recyclerview.widget;

import E.AbstractC0005f;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import c0.F;
import e0.t;
import l1.C1245B;
import l1.C1263j;
import l1.u;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f5125p;

    /* renamed from: q, reason: collision with root package name */
    public final t f5126q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5125p = -1;
        new SparseIntArray();
        new SparseIntArray();
        t tVar = new t(14);
        this.f5126q = tVar;
        new Rect();
        int i6 = l1.t.w(context, attributeSet, i4, i5).f14242c;
        if (i6 == this.f5125p) {
            return;
        }
        if (i6 < 1) {
            throw new IllegalArgumentException(AbstractC0005f.j(i6, "Span count should be at least 1. Provided "));
        }
        this.f5125p = i6;
        ((SparseIntArray) tVar.f8416a).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(F f4, C1245B c1245b, int i4) {
        boolean z = c1245b.f14167c;
        t tVar = this.f5126q;
        if (!z) {
            tVar.getClass();
            return t.E(i4, this.f5125p);
        }
        RecyclerView recyclerView = (RecyclerView) f4.f5442f;
        C1245B c1245b2 = recyclerView.f5156U;
        if (i4 < 0 || i4 >= c1245b2.a()) {
            StringBuilder r4 = AbstractC0005f.r(i4, "invalid position ", ". State item count is ");
            r4.append(c1245b2.a());
            r4.append(recyclerView.h());
            throw new IndexOutOfBoundsException(r4.toString());
        }
        int k4 = !c1245b2.f14167c ? i4 : recyclerView.f5163c.k(i4, 0);
        if (k4 != -1) {
            tVar.getClass();
            return t.E(k4, this.f5125p);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    @Override // l1.t
    public final boolean d(u uVar) {
        return uVar instanceof C1263j;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, l1.t
    public final u l() {
        return this.f5127h == 0 ? new C1263j(-2, -1) : new C1263j(-1, -2);
    }

    @Override // l1.t
    public final u m(Context context, AttributeSet attributeSet) {
        return new C1263j(context, attributeSet);
    }

    @Override // l1.t
    public final u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1263j((ViewGroup.MarginLayoutParams) layoutParams) : new C1263j(layoutParams);
    }

    @Override // l1.t
    public final int q(F f4, C1245B c1245b) {
        if (this.f5127h == 1) {
            return this.f5125p;
        }
        if (c1245b.a() < 1) {
            return 0;
        }
        return R(f4, c1245b, c1245b.a() - 1) + 1;
    }

    @Override // l1.t
    public final int x(F f4, C1245B c1245b) {
        if (this.f5127h == 0) {
            return this.f5125p;
        }
        if (c1245b.a() < 1) {
            return 0;
        }
        return R(f4, c1245b, c1245b.a() - 1) + 1;
    }
}
