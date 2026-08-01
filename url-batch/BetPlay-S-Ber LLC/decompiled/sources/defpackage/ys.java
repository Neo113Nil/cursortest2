package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ys extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ ct F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(ct ctVar, int i, int i2) {
        super(i);
        this.F = ctVar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(zz zzVar, int[] iArr) {
        ct ctVar = this.F;
        RecyclerView recyclerView = ctVar.m;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = ctVar.m.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = ctVar.m.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void y0(RecyclerView recyclerView, int i) {
        f9 f9Var = new f9(recyclerView.getContext());
        f9Var.a = i;
        z0(f9Var);
    }
}
