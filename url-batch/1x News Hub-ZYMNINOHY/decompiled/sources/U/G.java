package U;

import E.C0001b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class G extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final H f1363d;

    public G(H h3) {
        this.f1363d = h3;
    }

    @Override // E.C0001b
    public final void b(View view, F.e eVar) {
        this.f275a.onInitializeAccessibilityNodeInfo(view, eVar.f482a);
        H h3 = this.f1363d;
        if (h3.f1364d.l()) {
            return;
        }
        RecyclerView recyclerView = h3.f1364d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // E.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        H h3 = this.f1363d;
        if (!h3.f1364d.l()) {
            RecyclerView recyclerView = h3.f1364d;
            if (recyclerView.getLayoutManager() != null) {
                A a3 = recyclerView.getLayoutManager().f1452b.f2469a;
            }
        }
        return false;
    }
}
