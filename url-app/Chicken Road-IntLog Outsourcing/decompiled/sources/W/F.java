package W;

import E.C0027b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes.dex */
public final class F extends C0027b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f3271d;

    public F(RecyclerView recyclerView) {
        this.f3271d = recyclerView;
        new E(this);
    }

    @Override // E.C0027b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f3271d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // E.C0027b
    public final void b(View view, F.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f599a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f671a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f3271d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        t layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3368b;
        T4.l lVar = recyclerView2.f4646a;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3368b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3368b.canScrollVertically(1) || layoutManager.f3368b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(Base64Utils.IO_BUFFER_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        B b6 = recyclerView2.f4655e0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(lVar, b6), layoutManager.q(lVar, b6), false, 0));
    }

    @Override // E.C0027b
    public final boolean c(View view, int i2, Bundle bundle) {
        int u5;
        int s2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3271d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        t layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3368b;
        T4.l lVar = recyclerView2.f4646a;
        if (i2 == 4096) {
            u5 = recyclerView2.canScrollVertically(1) ? (layoutManager.f3373g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f3368b.canScrollHorizontally(1)) {
                s2 = (layoutManager.f3372f - layoutManager.s()) - layoutManager.t();
            }
            s2 = 0;
        } else if (i2 != 8192) {
            s2 = 0;
            u5 = 0;
        } else {
            u5 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f3373g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f3368b.canScrollHorizontally(-1)) {
                s2 = -((layoutManager.f3372f - layoutManager.s()) - layoutManager.t());
            }
            s2 = 0;
        }
        if (u5 == 0 && s2 == 0) {
            return false;
        }
        layoutManager.f3368b.r(s2, u5);
        return true;
    }
}
