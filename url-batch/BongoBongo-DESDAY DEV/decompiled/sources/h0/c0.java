package h0;

import L.C0002b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 extends C0002b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f2480e;

    public c0(RecyclerView recyclerView) {
        this.d = recyclerView;
        b0 b0Var = this.f2480e;
        if (b0Var != null) {
            this.f2480e = b0Var;
        } else {
            this.f2480e = new b0(this);
        }
    }

    @Override // L.C0002b
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

    @Override // L.C0002b
    public final void d(View view, M.j jVar) {
        this.f506a.onInitializeAccessibilityNodeInfo(view, jVar.f615a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        J layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2397b;
        layoutManager.V(recyclerView2.f1655c, recyclerView2.f1659e0, jVar);
    }

    @Override // L.C0002b
    public final boolean g(View view, int i, Bundle bundle) {
        int G;
        int E2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        J layoutManager = recyclerView.getLayoutManager();
        P p2 = layoutManager.f2397b.f1655c;
        int i2 = layoutManager.f2408o;
        int i3 = layoutManager.f2407n;
        Rect rect = new Rect();
        if (layoutManager.f2397b.getMatrix().isIdentity() && layoutManager.f2397b.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            G = layoutManager.f2397b.canScrollVertically(1) ? (i2 - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f2397b.canScrollHorizontally(1)) {
                E2 = (i3 - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            G = 0;
            E2 = 0;
        } else {
            G = layoutManager.f2397b.canScrollVertically(-1) ? -((i2 - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f2397b.canScrollHorizontally(-1)) {
                E2 = -((i3 - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f2397b.g0(E2, G, true);
        return true;
    }
}
