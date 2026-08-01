package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class g5 extends km {
    public final /* synthetic */ n5 o;
    public final /* synthetic */ q5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(q5 q5Var, q5 q5Var2, n5 n5Var) {
        super(q5Var2);
        this.p = q5Var;
        this.o = n5Var;
    }

    @Override // defpackage.km
    public final s50 b() {
        return this.o;
    }

    @Override // defpackage.km
    public final boolean c() {
        q5 q5Var = this.p;
        if (q5Var.getInternalPopup().b()) {
            return true;
        }
        q5Var.k.n(q5Var.getTextDirection(), q5Var.getTextAlignment());
        return true;
    }
}
