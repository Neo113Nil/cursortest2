package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s20 extends y {
    public final RecyclerView d;
    public final r20 e;

    public s20(RecyclerView recyclerView) {
        this.d = recyclerView;
        r20 r20Var = this.e;
        if (r20Var != null) {
            this.e = r20Var;
        } else {
            this.e = new r20(this);
        }
    }

    @Override // defpackage.y
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

    @Override // defpackage.y
    public final void d(View view, k0 k0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        b20 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        h20 h20Var = recyclerView2.g;
        n20 n20Var = recyclerView2.k0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
            k0Var.a(8192);
            k0Var.h(true);
        }
        if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
            k0Var.a(4096);
            k0Var.h(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(h20Var, n20Var), layoutManager.x(h20Var, n20Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // defpackage.y
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
            b20 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            h20 h20Var = recyclerView2.g;
            if (i == 4096) {
                G = recyclerView2.canScrollVertically(1) ? (layoutManager.o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    E = (layoutManager.n - layoutManager.E()) - layoutManager.F();
                    if (G == 0) {
                    }
                    layoutManager.b.a0(E, G, true);
                    return true;
                }
                E = 0;
                if (G == 0) {
                }
                layoutManager.b.a0(E, G, true);
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
                layoutManager.b.a0(E, G, true);
                return true;
            }
        }
        return false;
    }
}
