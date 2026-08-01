package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class w4 extends gk {
    public final /* synthetic */ d5 o;
    public final /* synthetic */ g5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(g5 g5Var, g5 g5Var2, d5 d5Var) {
        super(g5Var2);
        this.p = g5Var;
        this.o = d5Var;
    }

    @Override // defpackage.gk
    public final q20 b() {
        return this.o;
    }

    @Override // defpackage.gk
    public final boolean c() {
        g5 g5Var = this.p;
        if (g5Var.getInternalPopup().b()) {
            return true;
        }
        g5Var.k.n(g5Var.getTextDirection(), g5Var.getTextAlignment());
        return true;
    }
}
