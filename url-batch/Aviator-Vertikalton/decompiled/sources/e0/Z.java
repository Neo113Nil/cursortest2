package e0;

import K.C0002b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Z extends C0002b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f2186d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f2187e;

    public Z(RecyclerView recyclerView) {
        this.f2186d = recyclerView;
        Y y2 = this.f2187e;
        if (y2 != null) {
            this.f2187e = y2;
        } else {
            this.f2187e = new Y(this);
        }
    }

    @Override // K.C0002b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2186d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // K.C0002b
    public final void d(View view, L.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f426a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f665a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f2186d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        I layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2111b;
        O o2 = recyclerView2.f1567b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f2111b.canScrollHorizontally(-1)) {
            jVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f2111b.canScrollVertically(1) || layoutManager.f2111b.canScrollHorizontally(1)) {
            jVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        U u2 = recyclerView2.f1570c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(o2, u2), layoutManager.x(o2, u2), false, 0));
    }

    @Override // K.C0002b
    public final boolean g(View view, int i, Bundle bundle) {
        int G2;
        int E2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2186d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        I layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2111b;
        O o2 = recyclerView2.f1567b;
        if (i == 4096) {
            G2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f2122o - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f2111b.canScrollHorizontally(1)) {
                E2 = (layoutManager.f2121n - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            E2 = 0;
            G2 = 0;
        } else {
            G2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f2122o - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f2111b.canScrollHorizontally(-1)) {
                E2 = -((layoutManager.f2121n - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G2 == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f2111b.Z(E2, G2, true);
        return true;
    }
}
