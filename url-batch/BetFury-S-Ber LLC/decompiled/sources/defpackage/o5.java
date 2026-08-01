package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o5 extends rp {
    public final /* synthetic */ v5 o;
    public final /* synthetic */ y5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(y5 y5Var, y5 y5Var2, v5 v5Var) {
        super(y5Var2);
        this.p = y5Var;
        this.o = v5Var;
    }

    @Override // defpackage.rp
    public final vd0 b() {
        return this.o;
    }

    @Override // defpackage.rp
    public final boolean c() {
        y5 y5Var = this.p;
        if (y5Var.getInternalPopup().b()) {
            return true;
        }
        y5Var.k.n(y5Var.getTextDirection(), y5Var.getTextAlignment());
        return true;
    }
}
