package g0;

import K.C0002b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 extends C0002b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f2390e;

    public c0(RecyclerView recyclerView) {
        this.d = recyclerView;
        b0 b0Var = this.f2390e;
        if (b0Var != null) {
            this.f2390e = b0Var;
        } else {
            this.f2390e = new b0(this);
        }
    }

    @Override // K.C0002b
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

    @Override // K.C0002b
    public final void d(View view, L.j jVar) {
        this.f456a.onInitializeAccessibilityNodeInfo(view, jVar.f561a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        J layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2311b;
        layoutManager.V(recyclerView2.f1592c, recyclerView2.f1596e0, jVar);
    }

    @Override // K.C0002b
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
        J layoutManager = recyclerView.getLayoutManager();
        P p2 = layoutManager.f2311b.f1592c;
        int i2 = layoutManager.f2321o;
        int i3 = layoutManager.f2320n;
        Rect rect = new Rect();
        if (layoutManager.f2311b.getMatrix().isIdentity() && layoutManager.f2311b.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            G2 = layoutManager.f2311b.canScrollVertically(1) ? (i2 - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f2311b.canScrollHorizontally(1)) {
                E2 = (i3 - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            G2 = 0;
            E2 = 0;
        } else {
            G2 = layoutManager.f2311b.canScrollVertically(-1) ? -((i2 - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f2311b.canScrollHorizontally(-1)) {
                E2 = -((i3 - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G2 == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f2311b.g0(E2, G2, true);
        return true;
    }
}
