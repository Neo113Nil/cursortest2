package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class y80 extends a0 {
    public final z80 d;
    public final WeakHashMap e = new WeakHashMap();

    public y80(z80 z80Var) {
        this.d = z80Var;
    }

    @Override // defpackage.a0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        a0 a0Var = (a0) this.e.get(view);
        return a0Var != null ? a0Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.a0
    public final o0 b(View view) {
        a0 a0Var = (a0) this.e.get(view);
        return a0Var != null ? a0Var.b(view) : super.b(view);
    }

    @Override // defpackage.a0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a0 a0Var = (a0) this.e.get(view);
        if (a0Var != null) {
            a0Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.a0
    public final void d(View view, m0 m0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m0Var.a;
        z80 z80Var = this.d;
        RecyclerView recyclerView = z80Var.d;
        RecyclerView recyclerView2 = z80Var.d;
        boolean L = recyclerView.L();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (L || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, m0Var);
        a0 a0Var = (a0) this.e.get(view);
        if (a0Var != null) {
            a0Var.d(view, m0Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.a0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        a0 a0Var = (a0) this.e.get(view);
        if (a0Var != null) {
            a0Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.a0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a0 a0Var = (a0) this.e.get(viewGroup);
        return a0Var != null ? a0Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.a0
    public final boolean g(View view, int i, Bundle bundle) {
        z80 z80Var = this.d;
        RecyclerView recyclerView = z80Var.d;
        RecyclerView recyclerView2 = z80Var.d;
        if (recyclerView.L() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        a0 a0Var = (a0) this.e.get(view);
        if (a0Var != null) {
            if (a0Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        o80 o80Var = recyclerView2.getLayoutManager().b.g;
        return false;
    }

    @Override // defpackage.a0
    public final void h(View view, int i) {
        a0 a0Var = (a0) this.e.get(view);
        if (a0Var != null) {
            a0Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.a0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        a0 a0Var = (a0) this.e.get(view);
        if (a0Var != null) {
            a0Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
