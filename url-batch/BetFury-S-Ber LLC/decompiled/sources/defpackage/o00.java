package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o00 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ s00 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(s00 s00Var, int i, int i2) {
        super(i);
        this.F = s00Var;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(u80 u80Var, int[] iArr) {
        s00 s00Var = this.F;
        RecyclerView recyclerView = s00Var.f0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = s00Var.f0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = s00Var.f0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.h80
    public final void y0(RecyclerView recyclerView, int i) {
        qa qaVar = new qa(recyclerView.getContext());
        qaVar.a = i;
        z0(qaVar);
    }
}
