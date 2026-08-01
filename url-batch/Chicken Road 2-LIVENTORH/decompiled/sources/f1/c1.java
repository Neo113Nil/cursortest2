package f1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c1 extends n0.b {
    public final d1 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f1329e = new WeakHashMap();

    public c1(d1 d1Var) {
        this.d = d1Var;
    }

    @Override // n0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1329e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f2714a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // n0.b
    public final a0.a b(View view) {
        n0.b bVar = (n0.b) this.f1329e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1329e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // n0.b
    public final void d(View view, o0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
        d1 d1Var = this.d;
        RecyclerView recyclerView = d1Var.d;
        RecyclerView recyclerView2 = d1Var.d;
        boolean K = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f2714a;
        if (K || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().V(view, eVar);
        n0.b bVar = (n0.b) this.f1329e.get(view);
        if (bVar != null) {
            bVar.d(view, eVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // n0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1329e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // n0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1329e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f2714a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // n0.b
    public final boolean g(View view, int i, Bundle bundle) {
        d1 d1Var = this.d;
        RecyclerView recyclerView = d1Var.d;
        RecyclerView recyclerView2 = d1Var.d;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        n0.b bVar = (n0.b) this.f1329e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        s0 s0Var = recyclerView2.getLayoutManager().f1445b.f665g;
        return false;
    }

    @Override // n0.b
    public final void h(View view, int i) {
        n0.b bVar = (n0.b) this.f1329e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // n0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1329e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
