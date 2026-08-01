package g0;

import K.C0002b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 extends C0002b {
    public final c0 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2385e = new WeakHashMap();

    public b0(c0 c0Var) {
        this.d = c0Var;
    }

    @Override // K.C0002b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2385e.get(view);
        return c0002b != null ? c0002b.a(view, accessibilityEvent) : this.f456a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0002b
    public final C.g b(View view) {
        C0002b c0002b = (C0002b) this.f2385e.get(view);
        return c0002b != null ? c0002b.b(view) : super.b(view);
    }

    @Override // K.C0002b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2385e.get(view);
        if (c0002b != null) {
            c0002b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0002b
    public final void d(View view, L.j jVar) {
        c0 c0Var = this.d;
        boolean N2 = c0Var.d.N();
        View.AccessibilityDelegate accessibilityDelegate = this.f456a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f561a;
        if (!N2) {
            RecyclerView recyclerView = c0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().W(view, jVar);
                C0002b c0002b = (C0002b) this.f2385e.get(view);
                if (c0002b != null) {
                    c0002b.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // K.C0002b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2385e.get(view);
        if (c0002b != null) {
            c0002b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0002b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2385e.get(viewGroup);
        return c0002b != null ? c0002b.f(viewGroup, view, accessibilityEvent) : this.f456a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0002b
    public final boolean g(View view, int i, Bundle bundle) {
        c0 c0Var = this.d;
        if (!c0Var.d.N()) {
            RecyclerView recyclerView = c0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                C0002b c0002b = (C0002b) this.f2385e.get(view);
                if (c0002b != null) {
                    if (c0002b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                P p2 = recyclerView.getLayoutManager().f2311b.f1592c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // K.C0002b
    public final void h(View view, int i) {
        C0002b c0002b = (C0002b) this.f2385e.get(view);
        if (c0002b != null) {
            c0002b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // K.C0002b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2385e.get(view);
        if (c0002b != null) {
            c0002b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
