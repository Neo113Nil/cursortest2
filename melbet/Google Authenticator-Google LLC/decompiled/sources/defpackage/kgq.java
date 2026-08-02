package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kgq implements kfj {
    final kbq a;
    private final kfh b;

    public kgq(kbq kbqVar, kfh kfhVar) {
        hoq.y(!kbqVar.g(), "error must not be OK");
        this.a = kbqVar;
        this.b = kfhVar;
    }

    @Override // defpackage.kfj
    public final kfg a(kae kaeVar, kaa kaaVar, jww jwwVar, jxb[] jxbVarArr) {
        return new kgp(this.a, this.b, jxbVarArr);
    }

    @Override // defpackage.jyv
    public final jyp c() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
