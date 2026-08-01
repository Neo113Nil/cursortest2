package g0;

import K.C0006b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Z extends C0006b {
    public final a0 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2793e = new WeakHashMap();

    public Z(a0 a0Var) {
        this.d = a0Var;
    }

    @Override // K.C0006b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f2793e.get(view);
        return c0006b != null ? c0006b.a(view, accessibilityEvent) : this.f594a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0006b
    public final A0.c b(View view) {
        C0006b c0006b = (C0006b) this.f2793e.get(view);
        return c0006b != null ? c0006b.b(view) : super.b(view);
    }

    @Override // K.C0006b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f2793e.get(view);
        if (c0006b != null) {
            c0006b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0006b
    public final void d(View view, L.j jVar) {
        a0 a0Var = this.d;
        boolean N2 = a0Var.d.N();
        View.AccessibilityDelegate accessibilityDelegate = this.f594a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
        if (!N2) {
            RecyclerView recyclerView = a0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().W(view, jVar);
                C0006b c0006b = (C0006b) this.f2793e.get(view);
                if (c0006b != null) {
                    c0006b.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // K.C0006b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f2793e.get(view);
        if (c0006b != null) {
            c0006b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0006b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f2793e.get(viewGroup);
        return c0006b != null ? c0006b.f(viewGroup, view, accessibilityEvent) : this.f594a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0006b
    public final boolean g(View view, int i, Bundle bundle) {
        a0 a0Var = this.d;
        if (!a0Var.d.N()) {
            RecyclerView recyclerView = a0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                C0006b c0006b = (C0006b) this.f2793e.get(view);
                if (c0006b != null) {
                    if (c0006b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                N n2 = recyclerView.getLayoutManager().f2725b.f1972c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // K.C0006b
    public final void h(View view, int i) {
        C0006b c0006b = (C0006b) this.f2793e.get(view);
        if (c0006b != null) {
            c0006b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // K.C0006b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f2793e.get(view);
        if (c0006b != null) {
            c0006b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
