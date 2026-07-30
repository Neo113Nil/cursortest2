package L;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import w.C0256b;
import x.C0284h;

/* loaded from: classes.dex */
public final class K extends C0256b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f487d;

    public K(RecyclerView recyclerView) {
        this.f487d = recyclerView;
        new J(this);
    }

    @Override // w.C0256b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f487d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // w.C0256b
    public final void b(View view, C0284h c0284h) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3051a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0284h.f3093a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f487d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        x layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f597b;
        D d2 = recyclerView2.f1594e;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f597b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f597b.canScrollVertically(1) || layoutManager.f597b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        G g2 = recyclerView2.f1591b0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(d2, g2), layoutManager.q(d2, g2), false, 0));
    }

    @Override // w.C0256b
    public final boolean c(View view, int i2, Bundle bundle) {
        int u2;
        int s2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f487d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        x layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f597b;
        D d2 = recyclerView2.f1594e;
        if (i2 == 4096) {
            u2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f602g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f597b.canScrollHorizontally(1)) {
                s2 = (layoutManager.f601f - layoutManager.s()) - layoutManager.t();
            }
            s2 = 0;
        } else if (i2 != 8192) {
            s2 = 0;
            u2 = 0;
        } else {
            u2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f602g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f597b.canScrollHorizontally(-1)) {
                s2 = -((layoutManager.f601f - layoutManager.s()) - layoutManager.t());
            }
            s2 = 0;
        }
        if (u2 == 0 && s2 == 0) {
            return false;
        }
        layoutManager.f597b.r(s2, u2);
        return true;
    }
}
