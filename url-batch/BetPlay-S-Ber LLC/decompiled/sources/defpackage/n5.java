package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n5 extends bk {
    public final /* synthetic */ u5 o;
    public final /* synthetic */ x5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(x5 x5Var, x5 x5Var2, u5 u5Var) {
        super(x5Var2);
        this.p = x5Var;
        this.o = u5Var;
    }

    @Override // defpackage.bk
    public final b30 b() {
        return this.o;
    }

    @Override // defpackage.bk
    public final boolean c() {
        x5 x5Var = this.p;
        if (x5Var.getInternalPopup().b()) {
            return true;
        }
        x5Var.k.n(x5Var.getTextDirection(), x5Var.getTextAlignment());
        return true;
    }
}
