package w4;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q0 extends q3.b {

    /* renamed from: d, reason: collision with root package name */
    public final r0 f8021d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f8022e = new WeakHashMap();

    public q0(r0 r0Var) {
        this.f8021d = r0Var;
    }

    @Override // q3.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        q3.b bVar = (q3.b) this.f8022e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f6076a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // q3.b
    public final q3.k b(View view) {
        q3.b bVar = (q3.b) this.f8022e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // q3.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        q3.b bVar = (q3.b) this.f8022e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // q3.b
    public final void d(View view, r3.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        r0 r0Var = this.f8021d;
        RecyclerView recyclerView = r0Var.f8026d;
        RecyclerView recyclerView2 = r0Var.f8026d;
        boolean u7 = recyclerView.u();
        View.AccessibilityDelegate accessibilityDelegate = this.f6076a;
        if (u7 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().N(view, fVar);
        q3.b bVar = (q3.b) this.f8022e.get(view);
        if (bVar != null) {
            bVar.d(view, fVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // q3.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        q3.b bVar = (q3.b) this.f8022e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // q3.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        q3.b bVar = (q3.b) this.f8022e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f6076a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // q3.b
    public final boolean g(View view, int i, Bundle bundle) {
        r0 r0Var = this.f8021d;
        RecyclerView recyclerView = r0Var.f8026d;
        RecyclerView recyclerView2 = r0Var.f8026d;
        if (recyclerView.u() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        q3.b bVar = (q3.b) this.f8022e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        j0 j0Var = recyclerView2.getLayoutManager().f7900b.f911d;
        return false;
    }

    @Override // q3.b
    public final void h(View view, int i) {
        q3.b bVar = (q3.b) this.f8022e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // q3.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        q3.b bVar = (q3.b) this.f8022e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
