package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d00 extends w {
    public final e00 a;
    public final WeakHashMap b = new WeakHashMap();

    public d00(e00 e00Var) {
        this.a = e00Var;
    }

    @Override // defpackage.w
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.b.get(view);
        return wVar != null ? wVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.w
    public final k0 getAccessibilityNodeProvider(View view) {
        w wVar = (w) this.b.get(view);
        return wVar != null ? wVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.b.get(view);
        if (wVar != null) {
            wVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
        e00 e00Var = this.a;
        RecyclerView recyclerView = e00Var.a;
        RecyclerView recyclerView2 = e00Var.a;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, i0Var);
            return;
        }
        recyclerView2.getLayoutManager().W(view, i0Var);
        w wVar = (w) this.b.get(view);
        if (wVar != null) {
            wVar.onInitializeAccessibilityNodeInfo(view, i0Var);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, i0Var);
        }
    }

    @Override // defpackage.w
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.b.get(view);
        if (wVar != null) {
            wVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.w
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.b.get(viewGroup);
        return wVar != null ? wVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.w
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        e00 e00Var = this.a;
        RecyclerView recyclerView = e00Var.a;
        RecyclerView recyclerView2 = e00Var.a;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        w wVar = (w) this.b.get(view);
        if (wVar != null) {
            if (wVar.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        tz tzVar = recyclerView2.getLayoutManager().b.g;
        return false;
    }

    @Override // defpackage.w
    public final void sendAccessibilityEvent(View view, int i) {
        w wVar = (w) this.b.get(view);
        if (wVar != null) {
            wVar.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // defpackage.w
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        w wVar = (w) this.b.get(view);
        if (wVar != null) {
            wVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
