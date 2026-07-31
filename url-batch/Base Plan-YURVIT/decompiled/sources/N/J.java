package N;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import y.C0258b;
import z.C0286h;

/* loaded from: classes.dex */
public final class J extends C0258b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f670d;

    public J(RecyclerView recyclerView) {
        this.f670d = recyclerView;
        new I(this);
    }

    @Override // y.C0258b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f670d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // y.C0258b
    public final void b(View view, C0286h c0286h) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0286h.f3177a;
        this.f3136a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f670d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        w layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f775b;
        C c2 = recyclerView2.f1683e;
        F f2 = recyclerView2.b0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f775b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f775b.canScrollVertically(1) || layoutManager.f775b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(c2, f2), layoutManager.q(c2, f2), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // y.C0258b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, int i2, Bundle bundle) {
        int u2;
        int s2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f670d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            w layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f775b;
            C c2 = recyclerView2.f1683e;
            if (i2 == 4096) {
                u2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f780g - layoutManager.u()) - layoutManager.r() : 0;
                if (layoutManager.f775b.canScrollHorizontally(1)) {
                    s2 = (layoutManager.f779f - layoutManager.s()) - layoutManager.t();
                    if (u2 == 0) {
                    }
                    layoutManager.f775b.r(s2, u2);
                    return true;
                }
                s2 = 0;
                if (u2 == 0) {
                }
                layoutManager.f775b.r(s2, u2);
                return true;
            }
            if (i2 != 8192) {
                s2 = 0;
                u2 = 0;
            } else {
                u2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f780g - layoutManager.u()) - layoutManager.r()) : 0;
                if (layoutManager.f775b.canScrollHorizontally(-1)) {
                    s2 = -((layoutManager.f779f - layoutManager.s()) - layoutManager.t());
                }
                s2 = 0;
            }
            if (u2 == 0 || s2 != 0) {
                layoutManager.f775b.r(s2, u2);
                return true;
            }
        }
        return false;
    }
}
