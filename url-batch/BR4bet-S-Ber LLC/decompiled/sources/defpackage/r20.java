package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r20 extends y {
    public final s20 d;
    public final WeakHashMap e = new WeakHashMap();

    public r20(s20 s20Var) {
        this.d = s20Var;
    }

    @Override // defpackage.y
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        y yVar = (y) this.e.get(view);
        return yVar != null ? yVar.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.y
    public final rc0 b(View view) {
        y yVar = (y) this.e.get(view);
        return yVar != null ? yVar.b(view) : super.b(view);
    }

    @Override // defpackage.y
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        y yVar = (y) this.e.get(view);
        if (yVar != null) {
            yVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.y
    public final void d(View view, k0 k0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        s20 s20Var = this.d;
        RecyclerView recyclerView = s20Var.d;
        RecyclerView recyclerView2 = s20Var.d;
        boolean K = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (K || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, k0Var);
        y yVar = (y) this.e.get(view);
        if (yVar != null) {
            yVar.d(view, k0Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.y
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        y yVar = (y) this.e.get(view);
        if (yVar != null) {
            yVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.y
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        y yVar = (y) this.e.get(viewGroup);
        return yVar != null ? yVar.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.y
    public final boolean g(View view, int i, Bundle bundle) {
        s20 s20Var = this.d;
        RecyclerView recyclerView = s20Var.d;
        RecyclerView recyclerView2 = s20Var.d;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        y yVar = (y) this.e.get(view);
        if (yVar != null) {
            if (yVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        h20 h20Var = recyclerView2.getLayoutManager().b.g;
        return false;
    }

    @Override // defpackage.y
    public final void h(View view, int i) {
        y yVar = (y) this.e.get(view);
        if (yVar != null) {
            yVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.y
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        y yVar = (y) this.e.get(view);
        if (yVar != null) {
            yVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
