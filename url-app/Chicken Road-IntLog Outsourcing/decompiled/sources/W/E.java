package W;

import E.C0027b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class E extends C0027b {

    /* renamed from: d, reason: collision with root package name */
    public final F f3270d;

    public E(F f3) {
        this.f3270d = f3;
    }

    @Override // E.C0027b
    public final void b(View view, F.i iVar) {
        this.f599a.onInitializeAccessibilityNodeInfo(view, iVar.f671a);
        F f3 = this.f3270d;
        if (f3.f3271d.l()) {
            return;
        }
        RecyclerView recyclerView = f3.f3271d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // E.C0027b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        F f3 = this.f3270d;
        if (!f3.f3271d.l()) {
            RecyclerView recyclerView = f3.f3271d;
            if (recyclerView.getLayoutManager() != null) {
                T4.l lVar = recyclerView.getLayoutManager().f3368b.f4646a;
            }
        }
        return false;
    }
}
