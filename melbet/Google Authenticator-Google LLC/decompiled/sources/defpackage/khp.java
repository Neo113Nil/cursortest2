package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class khp extends kgv {
    public final kev a;
    private final kfr b;

    public khp(kfr kfrVar, kev kevVar) {
        this.b = kfrVar;
        this.a = kevVar;
    }

    @Override // defpackage.kgv, defpackage.kfj
    public final kfg a(kae kaeVar, kaa kaaVar, jww jwwVar, jxb[] jxbVarArr) {
        return new kho(this, this.b.a(kaeVar, kaaVar, jwwVar, jxbVarArr));
    }

    @Override // defpackage.kgv
    protected final kfr d() {
        return this.b;
    }
}
