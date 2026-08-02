package l1;

import E.C0001b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248E extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final C1249F f14177d;

    public C1248E(C1249F c1249f) {
        this.f14177d = c1249f;
    }

    @Override // E.C0001b
    public final void b(View view, F.f fVar) {
        this.f404a.onInitializeAccessibilityNodeInfo(view, fVar.f742a);
        C1249F c1249f = this.f14177d;
        RecyclerView recyclerView = c1249f.f14178d;
        RecyclerView recyclerView2 = c1249f.f14178d;
        if (recyclerView.l() || recyclerView2.getLayoutManager() == null) {
            return;
        }
        recyclerView2.getLayoutManager().getClass();
        RecyclerView.j(view);
    }

    @Override // E.C0001b
    public final boolean c(View view, int i4, Bundle bundle) {
        if (super.c(view, i4, bundle)) {
            return true;
        }
        C1249F c1249f = this.f14177d;
        RecyclerView recyclerView = c1249f.f14178d;
        RecyclerView recyclerView2 = c1249f.f14178d;
        if (!recyclerView.l() && recyclerView2.getLayoutManager() != null) {
            c0.F f4 = recyclerView2.getLayoutManager().f14256b.f5159a;
        }
        return false;
    }
}
