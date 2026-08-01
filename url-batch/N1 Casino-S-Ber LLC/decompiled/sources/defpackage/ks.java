package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ks extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ os F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(os osVar, int i, int i2) {
        super(i);
        this.F = osVar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(kz kzVar, int[] iArr) {
        os osVar = this.F;
        RecyclerView recyclerView = osVar.f0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = osVar.f0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = osVar.f0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.xy
    public final void y0(RecyclerView recyclerView, int i) {
        k9 k9Var = new k9(recyclerView.getContext());
        k9Var.a = i;
        z0(k9Var);
    }
}
