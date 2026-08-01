package b1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e1 extends k0.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f773d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f774e;

    public e1(RecyclerView recyclerView) {
        this.f773d = recyclerView;
        d1 d1Var = this.f774e;
        if (d1Var != null) {
            this.f774e = d1Var;
        } else {
            this.f774e = new d1(this);
        }
    }

    @Override // k0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f773d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // k0.b
    public final void d(View view, l0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
        this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f773d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        n0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f875b;
        t0 t0Var = recyclerView2.g;
        z0 z0Var = recyclerView2.f640k0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f875b.canScrollHorizontally(-1)) {
            eVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f875b.canScrollVertically(1) || layoutManager.f875b.canScrollHorizontally(1)) {
            eVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(t0Var, z0Var), layoutManager.x(t0Var, z0Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // k0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(View view, int i4, Bundle bundle) {
        int G;
        int E;
        if (super.g(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f773d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f875b;
            t0 t0Var = recyclerView2.g;
            if (i4 == 4096) {
                G = recyclerView2.canScrollVertically(1) ? (layoutManager.f885o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f875b.canScrollHorizontally(1)) {
                    E = (layoutManager.f884n - layoutManager.E()) - layoutManager.F();
                    if (G == 0) {
                    }
                    layoutManager.f875b.a0(E, G, true);
                    return true;
                }
                E = 0;
                if (G == 0) {
                }
                layoutManager.f875b.a0(E, G, true);
                return true;
            }
            if (i4 != 8192) {
                E = 0;
                G = 0;
            } else {
                G = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f885o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.f875b.canScrollHorizontally(-1)) {
                    E = -((layoutManager.f884n - layoutManager.E()) - layoutManager.F());
                }
                E = 0;
            }
            if (G == 0 || E != 0) {
                layoutManager.f875b.a0(E, G, true);
                return true;
            }
        }
        return false;
    }
}
