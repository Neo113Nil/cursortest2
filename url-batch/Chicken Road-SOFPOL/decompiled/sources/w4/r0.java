package w4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r0 extends q3.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f8026d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f8027e;

    public r0(RecyclerView recyclerView) {
        this.f8026d = recyclerView;
        q0 q0Var = this.f8027e;
        if (q0Var != null) {
            this.f8027e = q0Var;
        } else {
            this.f8027e = new q0(this);
        }
    }

    @Override // q3.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f8026d.u()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().M(accessibilityEvent);
        }
    }

    @Override // q3.b
    public final void d(View view, r3.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        this.f6076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f8026d;
        if (recyclerView.u() || recyclerView.getLayoutManager() == null) {
            return;
        }
        d0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7900b;
        j0 j0Var = recyclerView2.f911d;
        m0 m0Var = recyclerView2.f910c0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f7900b.canScrollHorizontally(-1)) {
            fVar.a(8192);
            fVar.j(true);
        }
        if (layoutManager.f7900b.canScrollVertically(1) || layoutManager.f7900b.canScrollHorizontally(1)) {
            fVar.a(4096);
            fVar.j(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.C(j0Var, m0Var), layoutManager.s(j0Var, m0Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // q3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(View view, int i, Bundle bundle) {
        int z3;
        int x7;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f8026d;
        if (!recyclerView.u() && recyclerView.getLayoutManager() != null) {
            d0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f7900b;
            j0 j0Var = recyclerView2.f911d;
            if (i == 4096) {
                z3 = recyclerView2.canScrollVertically(1) ? (layoutManager.f7907j - layoutManager.z()) - layoutManager.w() : 0;
                if (layoutManager.f7900b.canScrollHorizontally(1)) {
                    x7 = (layoutManager.i - layoutManager.x()) - layoutManager.y();
                    if (z3 == 0) {
                    }
                    layoutManager.f7900b.E(x7, z3, true);
                    return true;
                }
                x7 = 0;
                if (z3 == 0) {
                }
                layoutManager.f7900b.E(x7, z3, true);
                return true;
            }
            if (i != 8192) {
                x7 = 0;
                z3 = 0;
            } else {
                z3 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f7907j - layoutManager.z()) - layoutManager.w()) : 0;
                if (layoutManager.f7900b.canScrollHorizontally(-1)) {
                    x7 = -((layoutManager.i - layoutManager.x()) - layoutManager.y());
                }
                x7 = 0;
            }
            if (z3 == 0 || x7 != 0) {
                layoutManager.f7900b.E(x7, z3, true);
                return true;
            }
        }
        return false;
    }
}
