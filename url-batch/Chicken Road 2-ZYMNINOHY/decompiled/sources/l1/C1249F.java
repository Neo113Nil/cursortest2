package l1;

import E.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249F extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f14178d;

    public C1249F(RecyclerView recyclerView) {
        this.f14178d = recyclerView;
        new C1248E(this);
    }

    @Override // E.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f14178d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // E.C0001b
    public final void b(View view, F.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f742a;
        this.f404a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f14178d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        t layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f14256b;
        c0.F f4 = recyclerView2.f5159a;
        C1245B c1245b = recyclerView2.f5156U;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f14256b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f14256b.canScrollVertically(1) || layoutManager.f14256b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(f4, c1245b), layoutManager.q(f4, c1245b), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // E.C0001b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, int i4, Bundle bundle) {
        int u4;
        int s4;
        if (super.c(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f14178d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            t layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f14256b;
            c0.F f4 = recyclerView2.f5159a;
            if (i4 == 4096) {
                u4 = recyclerView2.canScrollVertically(1) ? (layoutManager.f14261g - layoutManager.u()) - layoutManager.r() : 0;
                if (layoutManager.f14256b.canScrollHorizontally(1)) {
                    s4 = (layoutManager.f14260f - layoutManager.s()) - layoutManager.t();
                    if (u4 == 0) {
                    }
                    layoutManager.f14256b.r(s4, u4);
                    return true;
                }
                s4 = 0;
                if (u4 == 0) {
                }
                layoutManager.f14256b.r(s4, u4);
                return true;
            }
            if (i4 != 8192) {
                s4 = 0;
                u4 = 0;
            } else {
                u4 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f14261g - layoutManager.u()) - layoutManager.r()) : 0;
                if (layoutManager.f14256b.canScrollHorizontally(-1)) {
                    s4 = -((layoutManager.f14260f - layoutManager.s()) - layoutManager.t());
                }
                s4 = 0;
            }
            if (u4 == 0 || s4 != 0) {
                layoutManager.f14256b.r(s4, u4);
                return true;
            }
        }
        return false;
    }
}
