package g0;

import K.C0006b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends C0006b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f2797e;

    public a0(RecyclerView recyclerView) {
        this.d = recyclerView;
        Z z2 = this.f2797e;
        if (z2 != null) {
            this.f2797e = z2;
        } else {
            this.f2797e = new Z(this);
        }
    }

    @Override // K.C0006b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.N()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // K.C0006b
    public final void d(View view, L.j jVar) {
        this.f594a.onInitializeAccessibilityNodeInfo(view, jVar.f696a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2725b;
        layoutManager.V(recyclerView2.f1972c, recyclerView2.f1976e0, jVar);
    }

    @Override // K.C0006b
    public final boolean g(View view, int i, Bundle bundle) {
        int G2;
        int E2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        H layoutManager = recyclerView.getLayoutManager();
        N n2 = layoutManager.f2725b.f1972c;
        int i2 = layoutManager.f2735o;
        int i3 = layoutManager.f2734n;
        Rect rect = new Rect();
        if (layoutManager.f2725b.getMatrix().isIdentity() && layoutManager.f2725b.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            G2 = layoutManager.f2725b.canScrollVertically(1) ? (i2 - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f2725b.canScrollHorizontally(1)) {
                E2 = (i3 - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            G2 = 0;
            E2 = 0;
        } else {
            G2 = layoutManager.f2725b.canScrollVertically(-1) ? -((i2 - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f2725b.canScrollHorizontally(-1)) {
                E2 = -((i3 - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G2 == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f2725b.g0(E2, G2, true);
        return true;
    }
}
