package g1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r1 extends n0.b {
    public final s1 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f1787e = new WeakHashMap();

    public r1(s1 s1Var) {
        this.d = s1Var;
    }

    @Override // n0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1787e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f2757a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // n0.b
    public final a0.a b(View view) {
        n0.b bVar = (n0.b) this.f1787e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1787e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // n0.b
    public final void d(View view, o0.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
        s1 s1Var = this.d;
        RecyclerView recyclerView = s1Var.d;
        RecyclerView recyclerView2 = s1Var.d;
        boolean O = recyclerView.O();
        View.AccessibilityDelegate accessibilityDelegate = this.f2757a;
        if (O || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, gVar);
        n0.b bVar = (n0.b) this.f1787e.get(view);
        if (bVar != null) {
            bVar.d(view, gVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // n0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1787e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // n0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1787e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f2757a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // n0.b
    public final boolean g(View view, int i, Bundle bundle) {
        s1 s1Var = this.d;
        RecyclerView recyclerView = s1Var.d;
        RecyclerView recyclerView2 = s1Var.d;
        if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        n0.b bVar = (n0.b) this.f1787e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        g1 g1Var = recyclerView2.getLayoutManager().f1598b.h;
        return false;
    }

    @Override // n0.b
    public final void h(View view, int i) {
        n0.b bVar = (n0.b) this.f1787e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // n0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f1787e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
