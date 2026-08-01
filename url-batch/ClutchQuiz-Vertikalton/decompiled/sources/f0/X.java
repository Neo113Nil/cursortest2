package f0;

import K.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X extends C0001b {
    public final Y d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2208e = new WeakHashMap();

    public X(Y y2) {
        this.d = y2;
    }

    @Override // K.C0001b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2208e.get(view);
        return c0001b != null ? c0001b.a(view, accessibilityEvent) : this.f377a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0001b
    public final A0.h b(View view) {
        C0001b c0001b = (C0001b) this.f2208e.get(view);
        return c0001b != null ? c0001b.b(view) : super.b(view);
    }

    @Override // K.C0001b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2208e.get(view);
        if (c0001b != null) {
            c0001b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0001b
    public final void d(View view, L.k kVar) {
        Y y2 = this.d;
        boolean K2 = y2.d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f377a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f477a;
        if (!K2) {
            RecyclerView recyclerView = y2.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, kVar);
                C0001b c0001b = (C0001b) this.f2208e.get(view);
                if (c0001b != null) {
                    c0001b.d(view, kVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // K.C0001b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2208e.get(view);
        if (c0001b != null) {
            c0001b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0001b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2208e.get(viewGroup);
        return c0001b != null ? c0001b.f(viewGroup, view, accessibilityEvent) : this.f377a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0001b
    public final boolean g(View view, int i, Bundle bundle) {
        Y y2 = this.d;
        if (!y2.d.K()) {
            RecyclerView recyclerView = y2.d;
            if (recyclerView.getLayoutManager() != null) {
                C0001b c0001b = (C0001b) this.f2208e.get(view);
                if (c0001b != null) {
                    if (c0001b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                N n2 = recyclerView.getLayoutManager().f2143b.f1583b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // K.C0001b
    public final void h(View view, int i) {
        C0001b c0001b = (C0001b) this.f2208e.get(view);
        if (c0001b != null) {
            c0001b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // K.C0001b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f2208e.get(view);
        if (c0001b != null) {
            c0001b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
