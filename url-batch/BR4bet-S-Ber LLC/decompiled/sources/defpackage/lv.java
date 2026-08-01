package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lv extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ pv F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(pv pvVar, int i, int i2) {
        super(i);
        this.F = pvVar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(n20 n20Var, int[] iArr) {
        pv pvVar = this.F;
        RecyclerView recyclerView = pvVar.f0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = pvVar.f0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = pvVar.f0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.b20
    public final void y0(RecyclerView recyclerView, int i) {
        x9 x9Var = new x9(recyclerView.getContext());
        x9Var.a = i;
        z0(x9Var);
    }
}
