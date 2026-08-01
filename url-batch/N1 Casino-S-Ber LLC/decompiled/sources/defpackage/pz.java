package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pz extends w {
    public final RecyclerView d;
    public final oz e;

    public pz(RecyclerView recyclerView) {
        this.d = recyclerView;
        oz ozVar = this.e;
        if (ozVar != null) {
            this.e = ozVar;
        } else {
            this.e = new oz(this);
        }
    }

    @Override // defpackage.w
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.L()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // defpackage.w
    public final void d(View view, i0 i0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.L() || recyclerView.getLayoutManager() == null) {
            return;
        }
        xy layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        ez ezVar = recyclerView2.g;
        kz kzVar = recyclerView2.l0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
            i0Var.a(8192);
            i0Var.h(true);
        }
        if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
            i0Var.a(4096);
            i0Var.h(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(ezVar, kzVar), layoutManager.x(ezVar, kzVar), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // defpackage.w
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
        if (!recyclerView.L() && recyclerView.getLayoutManager() != null) {
            xy layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            ez ezVar = recyclerView2.g;
            if (i == 4096) {
                G = recyclerView2.canScrollVertically(1) ? (layoutManager.o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    E = (layoutManager.n - layoutManager.E()) - layoutManager.F();
                    if (G == 0) {
                    }
                    layoutManager.b.c0(E, G, true);
                    return true;
                }
                E = 0;
                if (G == 0) {
                }
                layoutManager.b.c0(E, G, true);
                return true;
            }
            if (i != 8192) {
                G = 0;
                E = 0;
            } else {
                G = recyclerView2.canScrollVertically(-1) ? -((layoutManager.o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.b.canScrollHorizontally(-1)) {
                    E = -((layoutManager.n - layoutManager.E()) - layoutManager.F());
                }
                E = 0;
            }
            if (G == 0 || E != 0) {
                layoutManager.b.c0(E, G, true);
                return true;
            }
        }
        return false;
    }
}
