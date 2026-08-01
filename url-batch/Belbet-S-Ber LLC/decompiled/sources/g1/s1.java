package g1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s1 extends n0.b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final r1 f1791e;

    public s1(RecyclerView recyclerView) {
        this.d = recyclerView;
        r1 r1Var = this.f1791e;
        if (r1Var != null) {
            this.f1791e = r1Var;
        } else {
            this.f1791e = new r1(this);
        }
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // n0.b
    public final void d(View view, o0.g gVar) {
        this.f2757a.onInitializeAccessibilityNodeInfo(view, gVar.f2882a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        a1 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1598b;
        layoutManager.V(recyclerView2.h, recyclerView2.f775l0, gVar);
    }

    @Override // n0.b
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().i0(i, bundle);
    }
}
