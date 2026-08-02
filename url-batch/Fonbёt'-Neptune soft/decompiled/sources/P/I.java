package P;

import A.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class I extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f847d;

    public I(RecyclerView recyclerView) {
        this.f847d = recyclerView;
        new H(this);
    }

    @Override // A.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f847d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // A.C0001b
    public final void b(View view, B.l lVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f30a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f76a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f847d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        v layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f949b;
        B b2 = recyclerView2.f1852e;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f949b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f949b.canScrollVertically(1) || layoutManager.f949b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        E e2 = recyclerView2.f1849b0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(b2, e2), layoutManager.q(b2, e2), false, 0));
    }

    @Override // A.C0001b
    public final boolean c(View view, int i2, Bundle bundle) {
        int u2;
        int s2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f847d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        v layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f949b;
        B b2 = recyclerView2.f1852e;
        if (i2 == 4096) {
            u2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f954g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f949b.canScrollHorizontally(1)) {
                s2 = (layoutManager.f953f - layoutManager.s()) - layoutManager.t();
            }
            s2 = 0;
        } else if (i2 != 8192) {
            s2 = 0;
            u2 = 0;
        } else {
            u2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f954g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f949b.canScrollHorizontally(-1)) {
                s2 = -((layoutManager.f953f - layoutManager.s()) - layoutManager.t());
            }
            s2 = 0;
        }
        if (u2 == 0 && s2 == 0) {
            return false;
        }
        layoutManager.f949b.r(s2, u2);
        return true;
    }
}
