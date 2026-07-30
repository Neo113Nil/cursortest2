package androidx.recyclerview.widget;

import B.f;
import C4.p;
import D6.n;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import g0.AbstractC0440t;
import g0.C0409B;
import g0.C0431k;
import g0.C0441u;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f3943p;

    /* renamed from: q, reason: collision with root package name */
    public final f f3944q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i5) {
        super(context, attributeSet, i2, i5);
        this.f3943p = -1;
        new SparseIntArray();
        new SparseIntArray();
        f fVar = new f(23);
        this.f3944q = fVar;
        new Rect();
        int i7 = AbstractC0440t.w(context, attributeSet, i2, i5).f4950c;
        if (i7 == this.f3943p) {
            return;
        }
        if (i7 < 1) {
            throw new IllegalArgumentException(p.g(i7, "Span count should be at least 1. Provided "));
        }
        this.f3943p = i7;
        ((SparseIntArray) fVar.f152e).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(n nVar, C0409B c0409b, int i2) {
        boolean z7 = c0409b.f4857c;
        f fVar = this.f3944q;
        if (!z7) {
            fVar.getClass();
            return f.l(i2, this.f3943p);
        }
        RecyclerView recyclerView = (RecyclerView) nVar.f545n;
        C0409B c0409b2 = recyclerView.f3984f0;
        if (i2 < 0 || i2 >= c0409b2.a()) {
            StringBuilder k7 = p.k(i2, "invalid position ", ". State item count is ");
            k7.append(c0409b2.a());
            k7.append(recyclerView.h());
            throw new IndexOutOfBoundsException(k7.toString());
        }
        int F4 = !c0409b2.f4857c ? i2 : recyclerView.f3987i.F(i2, 0);
        if (F4 != -1) {
            fVar.getClass();
            return f.l(F4, this.f3943p);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // g0.AbstractC0440t
    public final boolean d(C0441u c0441u) {
        return c0441u instanceof C0431k;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0440t
    public final C0441u l() {
        return this.f3945h == 0 ? new C0431k(-2, -1) : new C0431k(-1, -2);
    }

    @Override // g0.AbstractC0440t
    public final C0441u m(Context context, AttributeSet attributeSet) {
        return new C0431k(context, attributeSet);
    }

    @Override // g0.AbstractC0440t
    public final C0441u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0431k((ViewGroup.MarginLayoutParams) layoutParams) : new C0431k(layoutParams);
    }

    @Override // g0.AbstractC0440t
    public final int q(n nVar, C0409B c0409b) {
        if (this.f3945h == 1) {
            return this.f3943p;
        }
        if (c0409b.a() < 1) {
            return 0;
        }
        return R(nVar, c0409b, c0409b.a() - 1) + 1;
    }

    @Override // g0.AbstractC0440t
    public final int x(n nVar, C0409B c0409b) {
        if (this.f3945h == 0) {
            return this.f3943p;
        }
        if (c0409b.a() < 1) {
            return 0;
        }
        return R(nVar, c0409b, c0409b.a() - 1) + 1;
    }
}
