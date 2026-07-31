package N;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import y.C0258b;
import z.C0286h;

/* loaded from: classes.dex */
public final class I extends C0258b {

    /* renamed from: d, reason: collision with root package name */
    public final J f669d;

    public I(J j2) {
        this.f669d = j2;
    }

    @Override // y.C0258b
    public final void b(View view, C0286h c0286h) {
        this.f3136a.onInitializeAccessibilityNodeInfo(view, c0286h.f3177a);
        J j2 = this.f669d;
        RecyclerView recyclerView = j2.f670d;
        RecyclerView recyclerView2 = j2.f670d;
        if (recyclerView.l() || recyclerView2.getLayoutManager() == null) {
            return;
        }
        recyclerView2.getLayoutManager().getClass();
        RecyclerView.j(view);
    }

    @Override // y.C0258b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        J j2 = this.f669d;
        RecyclerView recyclerView = j2.f670d;
        RecyclerView recyclerView2 = j2.f670d;
        if (!recyclerView.l() && recyclerView2.getLayoutManager() != null) {
            C c2 = recyclerView2.getLayoutManager().f775b.f1683e;
        }
        return false;
    }
}
