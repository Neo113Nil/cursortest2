package g0;

import I.C0106b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413F extends C0106b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f4868d;

    public C0413F(RecyclerView recyclerView) {
        this.f4868d = recyclerView;
        new C0412E(this);
    }

    @Override // I.C0106b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f4868d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // I.C0106b
    public final void b(View view, J.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f1318a;
        this.f1173a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f4868d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0440t layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4963b;
        D6.n nVar = recyclerView2.f3980d;
        C0409B c0409b = recyclerView2.f3984f0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f4963b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f4963b.canScrollVertically(1) || layoutManager.f4963b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(nVar, c0409b), layoutManager.q(nVar, c0409b), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // I.C0106b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, int i2, Bundle bundle) {
        int u7;
        int s7;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f4868d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            AbstractC0440t layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f4963b;
            D6.n nVar = recyclerView2.f3980d;
            if (i2 == 4096) {
                u7 = recyclerView2.canScrollVertically(1) ? (layoutManager.f4968g - layoutManager.u()) - layoutManager.r() : 0;
                if (layoutManager.f4963b.canScrollHorizontally(1)) {
                    s7 = (layoutManager.f4967f - layoutManager.s()) - layoutManager.t();
                    if (u7 == 0) {
                    }
                    layoutManager.f4963b.r(s7, u7);
                    return true;
                }
                s7 = 0;
                if (u7 == 0) {
                }
                layoutManager.f4963b.r(s7, u7);
                return true;
            }
            if (i2 != 8192) {
                s7 = 0;
                u7 = 0;
            } else {
                u7 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f4968g - layoutManager.u()) - layoutManager.r()) : 0;
                if (layoutManager.f4963b.canScrollHorizontally(-1)) {
                    s7 = -((layoutManager.f4967f - layoutManager.s()) - layoutManager.t());
                }
                s7 = 0;
            }
            if (u7 == 0 || s7 != 0) {
                layoutManager.f4963b.r(s7, u7);
                return true;
            }
        }
        return false;
    }
}
