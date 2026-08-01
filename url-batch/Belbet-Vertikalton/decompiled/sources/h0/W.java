package h0;

import M.C0006b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class W extends C0006b {

    /* renamed from: d, reason: collision with root package name */
    public final X f2973d;
    public final WeakHashMap e = new WeakHashMap();

    public W(X x2) {
        this.f2973d = x2;
    }

    @Override // M.C0006b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.e.get(view);
        return c0006b != null ? c0006b.a(view, accessibilityEvent) : this.f728a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // M.C0006b
    public final C1.d b(View view) {
        C0006b c0006b = (C0006b) this.e.get(view);
        return c0006b != null ? c0006b.b(view) : super.b(view);
    }

    @Override // M.C0006b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.e.get(view);
        if (c0006b != null) {
            c0006b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // M.C0006b
    public final void d(View view, N.i iVar) {
        X x2 = this.f2973d;
        boolean K2 = x2.f2974d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f728a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
        if (!K2) {
            RecyclerView recyclerView = x2.f2974d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, iVar);
                C0006b c0006b = (C0006b) this.e.get(view);
                if (c0006b != null) {
                    c0006b.d(view, iVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // M.C0006b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.e.get(view);
        if (c0006b != null) {
            c0006b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // M.C0006b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.e.get(viewGroup);
        return c0006b != null ? c0006b.f(viewGroup, view, accessibilityEvent) : this.f728a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // M.C0006b
    public final boolean g(View view, int i, Bundle bundle) {
        X x2 = this.f2973d;
        if (!x2.f2974d.K()) {
            RecyclerView recyclerView = x2.f2974d;
            if (recyclerView.getLayoutManager() != null) {
                C0006b c0006b = (C0006b) this.e.get(view);
                if (c0006b != null) {
                    if (c0006b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                C0147M c0147m = recyclerView.getLayoutManager().f2905b.f2014b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // M.C0006b
    public final void h(View view, int i) {
        C0006b c0006b = (C0006b) this.e.get(view);
        if (c0006b != null) {
            c0006b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // M.C0006b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.e.get(view);
        if (c0006b != null) {
            c0006b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
