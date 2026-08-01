package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class oz extends w {
    public final pz d;
    public final WeakHashMap e = new WeakHashMap();

    public oz(pz pzVar) {
        this.d = pzVar;
    }

    @Override // defpackage.w
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.e.get(view);
        return wVar != null ? wVar.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.w
    public final k0 b(View view) {
        w wVar = (w) this.e.get(view);
        return wVar != null ? wVar.b(view) : super.b(view);
    }

    @Override // defpackage.w
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.e.get(view);
        if (wVar != null) {
            wVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.w
    public final void d(View view, i0 i0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        pz pzVar = this.d;
        RecyclerView recyclerView = pzVar.d;
        RecyclerView recyclerView2 = pzVar.d;
        boolean L = recyclerView.L();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (L || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, i0Var);
        w wVar = (w) this.e.get(view);
        if (wVar != null) {
            wVar.d(view, i0Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.w
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.e.get(view);
        if (wVar != null) {
            wVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.w
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.e.get(viewGroup);
        return wVar != null ? wVar.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.w
    public final boolean g(View view, int i, Bundle bundle) {
        pz pzVar = this.d;
        RecyclerView recyclerView = pzVar.d;
        RecyclerView recyclerView2 = pzVar.d;
        if (recyclerView.L() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        w wVar = (w) this.e.get(view);
        if (wVar != null) {
            if (wVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        ez ezVar = recyclerView2.getLayoutManager().b.g;
        return false;
    }

    @Override // defpackage.w
    public final void h(View view, int i) {
        w wVar = (w) this.e.get(view);
        if (wVar != null) {
            wVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.w
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.e.get(view);
        if (wVar != null) {
            wVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
