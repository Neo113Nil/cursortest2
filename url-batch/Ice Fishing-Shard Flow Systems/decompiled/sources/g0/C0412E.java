package g0;

import I.C0106b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412E extends C0106b {

    /* renamed from: d, reason: collision with root package name */
    public final C0413F f4867d;

    public C0412E(C0413F c0413f) {
        this.f4867d = c0413f;
    }

    @Override // I.C0106b
    public final void b(View view, J.g gVar) {
        this.f1173a.onInitializeAccessibilityNodeInfo(view, gVar.f1318a);
        C0413F c0413f = this.f4867d;
        RecyclerView recyclerView = c0413f.f4868d;
        RecyclerView recyclerView2 = c0413f.f4868d;
        if (recyclerView.l() || recyclerView2.getLayoutManager() == null) {
            return;
        }
        recyclerView2.getLayoutManager().getClass();
        RecyclerView.j(view);
    }

    @Override // I.C0106b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        C0413F c0413f = this.f4867d;
        RecyclerView recyclerView = c0413f.f4868d;
        RecyclerView recyclerView2 = c0413f.f4868d;
        if (!recyclerView.l() && recyclerView2.getLayoutManager() != null) {
            D6.n nVar = recyclerView2.getLayoutManager().f4963b.f3980d;
        }
        return false;
    }
}
