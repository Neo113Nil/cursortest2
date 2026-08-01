package e0;

import K.C0002b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y extends C0002b {

    /* renamed from: d, reason: collision with root package name */
    public final Z f2188d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2189e = new WeakHashMap();

    public Y(Z z2) {
        this.f2188d = z2;
    }

    @Override // K.C0002b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2189e.get(view);
        return c0002b != null ? c0002b.a(view, accessibilityEvent) : this.f427a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0002b
    public final B0.d b(View view) {
        C0002b c0002b = (C0002b) this.f2189e.get(view);
        return c0002b != null ? c0002b.b(view) : super.b(view);
    }

    @Override // K.C0002b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2189e.get(view);
        if (c0002b != null) {
            c0002b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0002b
    public final void d(View view, L.j jVar) {
        Z z2 = this.f2188d;
        boolean K2 = z2.f2190d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f427a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f666a;
        if (!K2) {
            RecyclerView recyclerView = z2.f2190d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, jVar);
                C0002b c0002b = (C0002b) this.f2189e.get(view);
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
        C0002b c0002b = (C0002b) this.f2189e.get(view);
        if (c0002b != null) {
            c0002b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0002b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2189e.get(viewGroup);
        return c0002b != null ? c0002b.f(viewGroup, view, accessibilityEvent) : this.f427a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0002b
    public final boolean g(View view, int i, Bundle bundle) {
        Z z2 = this.f2188d;
        if (!z2.f2190d.K()) {
            RecyclerView recyclerView = z2.f2190d;
            if (recyclerView.getLayoutManager() != null) {
                C0002b c0002b = (C0002b) this.f2189e.get(view);
                if (c0002b != null) {
                    if (c0002b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                O o2 = recyclerView.getLayoutManager().f2115b.f1568b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // K.C0002b
    public final void h(View view, int i) {
        C0002b c0002b = (C0002b) this.f2189e.get(view);
        if (c0002b != null) {
            c0002b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // K.C0002b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0002b c0002b = (C0002b) this.f2189e.get(view);
        if (c0002b != null) {
            c0002b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
