package P;

import A.C0001b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class H extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final I f846d;

    public H(I i2) {
        this.f846d = i2;
    }

    @Override // A.C0001b
    public final void b(View view, B.l lVar) {
        this.f30a.onInitializeAccessibilityNodeInfo(view, lVar.f76a);
        I i2 = this.f846d;
        if (i2.f847d.l()) {
            return;
        }
        RecyclerView recyclerView = i2.f847d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // A.C0001b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        I i3 = this.f846d;
        if (!i3.f847d.l()) {
            RecyclerView recyclerView = i3.f847d;
            if (recyclerView.getLayoutManager() != null) {
                B b2 = recyclerView.getLayoutManager().f949b.f1852e;
            }
        }
        return false;
    }
}
