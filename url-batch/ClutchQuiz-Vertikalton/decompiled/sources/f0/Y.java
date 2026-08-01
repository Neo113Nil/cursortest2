package f0;

import K.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Y extends C0001b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final X f2209e;

    public Y(RecyclerView recyclerView) {
        this.d = recyclerView;
        X x2 = this.f2209e;
        if (x2 != null) {
            this.f2209e = x2;
        } else {
            this.f2209e = new X(this);
        }
    }

    @Override // K.C0001b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // K.C0001b
    public final void d(View view, L.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f377a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f477a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2143b;
        N n2 = recyclerView2.f1583b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f2143b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f2143b.canScrollVertically(1) || layoutManager.f2143b.canScrollHorizontally(1)) {
            kVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        T t2 = recyclerView2.f1586c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(n2, t2), layoutManager.x(n2, t2), false, 0));
    }

    @Override // K.C0001b
    public final boolean g(View view, int i, Bundle bundle) {
        int G2;
        int E2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2143b;
        N n2 = recyclerView2.f1583b;
        if (i == 4096) {
            G2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f2153o - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f2143b.canScrollHorizontally(1)) {
                E2 = (layoutManager.f2152n - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            E2 = 0;
            G2 = 0;
        } else {
            G2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f2153o - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f2143b.canScrollHorizontally(-1)) {
                E2 = -((layoutManager.f2152n - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G2 == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f2143b.Z(E2, G2, true);
        return true;
    }
}
