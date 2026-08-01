package f1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d1 extends n0.b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f1336e;

    public d1(RecyclerView recyclerView) {
        this.d = recyclerView;
        c1 c1Var = this.f1336e;
        if (c1Var != null) {
            this.f1336e = c1Var;
        } else {
            this.f1336e = new c1(this);
        }
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // n0.b
    public final void d(View view, o0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
        this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        m0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1445b;
        s0 s0Var = recyclerView2.f665g;
        y0 y0Var = recyclerView2.f672k0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1445b.canScrollHorizontally(-1)) {
            eVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1445b.canScrollVertically(1) || layoutManager.f1445b.canScrollHorizontally(1)) {
            eVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(s0Var, y0Var), layoutManager.x(s0Var, y0Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // n0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(View view, int i, Bundle bundle) {
        int G;
        int E;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            m0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f1445b;
            s0 s0Var = recyclerView2.f665g;
            if (i == 4096) {
                G = recyclerView2.canScrollVertically(1) ? (layoutManager.f1456o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f1445b.canScrollHorizontally(1)) {
                    E = (layoutManager.f1455n - layoutManager.E()) - layoutManager.F();
                    if (G == 0) {
                    }
                    layoutManager.f1445b.a0(E, G, true);
                    return true;
                }
                E = 0;
                if (G == 0) {
                }
                layoutManager.f1445b.a0(E, G, true);
                return true;
            }
            if (i != 8192) {
                E = 0;
                G = 0;
            } else {
                G = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1456o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.f1445b.canScrollHorizontally(-1)) {
                    E = -((layoutManager.f1455n - layoutManager.E()) - layoutManager.F());
                }
                E = 0;
            }
            if (G == 0 || E != 0) {
                layoutManager.f1445b.a0(E, G, true);
                return true;
            }
        }
        return false;
    }
}
