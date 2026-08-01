package h0;

import M.C0006b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class X extends C0006b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f2974d;
    public final W e;

    public X(RecyclerView recyclerView) {
        this.f2974d = recyclerView;
        W w2 = this.e;
        if (w2 != null) {
            this.e = w2;
        } else {
            this.e = new W(this);
        }
    }

    @Override // M.C0006b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2974d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // M.C0006b
    public final void d(View view, N.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f728a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f2974d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0141G layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2905b;
        C0147M c0147m = recyclerView2.f2014b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f2905b.canScrollHorizontally(-1)) {
            iVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f2905b.canScrollVertically(1) || layoutManager.f2905b.canScrollHorizontally(1)) {
            iVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        S s2 = recyclerView2.f2017c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(c0147m, s2), layoutManager.x(c0147m, s2), false, 0));
    }

    @Override // M.C0006b
    public final boolean g(View view, int i, Bundle bundle) {
        int G2;
        int E2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2974d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0141G layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2905b;
        C0147M c0147m = recyclerView2.f2014b;
        if (i == 4096) {
            G2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f2915o - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f2905b.canScrollHorizontally(1)) {
                E2 = (layoutManager.f2914n - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            E2 = 0;
            G2 = 0;
        } else {
            G2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f2915o - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f2905b.canScrollHorizontally(-1)) {
                E2 = -((layoutManager.f2914n - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G2 == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f2905b.Z(E2, G2, true);
        return true;
    }
}
