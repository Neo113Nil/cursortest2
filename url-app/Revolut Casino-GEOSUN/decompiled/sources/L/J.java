package L;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import w.C0256b;
import x.C0284h;

/* loaded from: classes.dex */
public final class J extends C0256b {

    /* renamed from: d, reason: collision with root package name */
    public final K f486d;

    public J(K k2) {
        this.f486d = k2;
    }

    @Override // w.C0256b
    public final void b(View view, C0284h c0284h) {
        this.f3051a.onInitializeAccessibilityNodeInfo(view, c0284h.f3093a);
        K k2 = this.f486d;
        if (k2.f487d.l()) {
            return;
        }
        RecyclerView recyclerView = k2.f487d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // w.C0256b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        K k2 = this.f486d;
        if (!k2.f487d.l()) {
            RecyclerView recyclerView = k2.f487d;
            if (recyclerView.getLayoutManager() != null) {
                D d2 = recyclerView.getLayoutManager().f597b.f1594e;
            }
        }
        return false;
    }
}
