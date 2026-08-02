package U;

import E.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class H extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1364d;

    public H(RecyclerView recyclerView) {
        this.f1364d = recyclerView;
        new G(this);
    }

    @Override // E.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f1364d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // E.C0001b
    public final void b(View view, F.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f275a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f482a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f1364d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        u layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1452b;
        A a3 = recyclerView2.f2469a;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1452b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1452b.canScrollVertically(1) || layoutManager.f1452b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        D d3 = recyclerView2.f2466U;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(a3, d3), layoutManager.q(a3, d3), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // E.C0001b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, int i3, Bundle bundle) {
        int u3;
        int s3;
        if (super.c(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1364d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            u layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f1452b;
            A a3 = recyclerView2.f2469a;
            if (i3 == 4096) {
                u3 = recyclerView2.canScrollVertically(1) ? (layoutManager.f1456g - layoutManager.u()) - layoutManager.r() : 0;
                if (layoutManager.f1452b.canScrollHorizontally(1)) {
                    s3 = (layoutManager.f - layoutManager.s()) - layoutManager.t();
                    if (u3 == 0) {
                    }
                    layoutManager.f1452b.r(s3, u3);
                    return true;
                }
                s3 = 0;
                if (u3 == 0) {
                }
                layoutManager.f1452b.r(s3, u3);
                return true;
            }
            if (i3 != 8192) {
                s3 = 0;
                u3 = 0;
            } else {
                u3 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1456g - layoutManager.u()) - layoutManager.r()) : 0;
                if (layoutManager.f1452b.canScrollHorizontally(-1)) {
                    s3 = -((layoutManager.f - layoutManager.s()) - layoutManager.t());
                }
                s3 = 0;
            }
            if (u3 == 0 || s3 != 0) {
                layoutManager.f1452b.r(s3, u3);
                return true;
            }
        }
        return false;
    }
}
