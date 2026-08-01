package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class e00 extends w {
    public final RecyclerView a;
    public final d00 b;

    public e00(RecyclerView recyclerView) {
        this.a = recyclerView;
        d00 d00Var = this.b;
        if (d00Var != null) {
            this.b = d00Var;
        } else {
            this.b = new d00(this);
        }
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.a.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        super.onInitializeAccessibilityNodeInfo(view, i0Var);
        RecyclerView recyclerView = this.a;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        nz layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        tz tzVar = recyclerView2.g;
        zz zzVar = recyclerView2.k0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
            i0Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
            i0Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(tzVar, zzVar), layoutManager.x(tzVar, zzVar), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // defpackage.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int G;
        int E;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.a;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            nz layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            tz tzVar = recyclerView2.g;
            if (i == 4096) {
                G = recyclerView2.canScrollVertically(1) ? (layoutManager.o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    E = (layoutManager.n - layoutManager.E()) - layoutManager.F();
                    if (G == 0) {
                    }
                    layoutManager.b.a0(E, true, G);
                    return true;
                }
                E = 0;
                if (G == 0) {
                }
                layoutManager.b.a0(E, true, G);
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
                layoutManager.b.a0(E, true, G);
                return true;
            }
        }
        return false;
    }
}
