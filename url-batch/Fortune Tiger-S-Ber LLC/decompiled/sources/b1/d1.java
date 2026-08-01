package b1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d1 extends k0.b {

    /* renamed from: d, reason: collision with root package name */
    public final e1 f765d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f766e = new WeakHashMap();

    public d1(e1 e1Var) {
        this.f765d = e1Var;
    }

    @Override // k0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        k0.b bVar = (k0.b) this.f766e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f2714a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // k0.b
    public final a2.e b(View view) {
        k0.b bVar = (k0.b) this.f766e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // k0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        k0.b bVar = (k0.b) this.f766e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // k0.b
    public final void d(View view, l0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
        e1 e1Var = this.f765d;
        RecyclerView recyclerView = e1Var.f773d;
        RecyclerView recyclerView2 = e1Var.f773d;
        boolean K = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f2714a;
        if (K || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().V(view, eVar);
        k0.b bVar = (k0.b) this.f766e.get(view);
        if (bVar != null) {
            bVar.d(view, eVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // k0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        k0.b bVar = (k0.b) this.f766e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // k0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        k0.b bVar = (k0.b) this.f766e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f2714a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // k0.b
    public final boolean g(View view, int i4, Bundle bundle) {
        e1 e1Var = this.f765d;
        RecyclerView recyclerView = e1Var.f773d;
        RecyclerView recyclerView2 = e1Var.f773d;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i4, bundle);
        }
        k0.b bVar = (k0.b) this.f766e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i4, bundle)) {
                return true;
            }
        } else if (super.g(view, i4, bundle)) {
            return true;
        }
        t0 t0Var = recyclerView2.getLayoutManager().f875b.g;
        return false;
    }

    @Override // k0.b
    public final void h(View view, int i4) {
        k0.b bVar = (k0.b) this.f766e.get(view);
        if (bVar != null) {
            bVar.h(view, i4);
        } else {
            super.h(view, i4);
        }
    }

    @Override // k0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        k0.b bVar = (k0.b) this.f766e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
