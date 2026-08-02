package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class las extends lar {
    protected final kzq d;

    public las(kzq kzqVar, kqn kqnVar, int i, int i2) {
        super(kqnVar, 0, 2);
        this.d = kzqVar;
    }

    @Override // defpackage.lar, defpackage.kzq
    public final Object a(kzr kzrVar, kqj kqjVar) {
        if (this.b == -3) {
            kqn bU = kqjVar.bU();
            kqn a = kvi.a(bU, this.a);
            if (ksp.b(a, bU)) {
                return f(kzrVar, kqjVar);
            }
            ale aleVar = kqk.b;
            if (ksp.b(a.get(aleVar), bU.get(aleVar))) {
                kqn bU2 = kqjVar.bU();
                if (!(kzrVar instanceof lbi) && !(kzrVar instanceof lbc)) {
                    kzrVar = new lbk(kzrVar, bU2);
                }
                return ixk.a(a, kzrVar, ldd.a(a), new ajy(this, (kqj) null, 3), kqjVar);
            }
        }
        return lar.g(this, kzrVar, kqjVar);
    }

    @Override // defpackage.lar
    public final Object b(kzd kzdVar, kqj kqjVar) {
        return f(new lbi(kzdVar), kqjVar);
    }

    @Override // defpackage.lar
    protected final lar c(kqn kqnVar, int i, int i2) {
        return new las(this.d, kqnVar, 0, 2);
    }

    public final Object f(kzr kzrVar, kqj kqjVar) {
        return this.d.a(kzrVar, kqjVar);
    }

    @Override // defpackage.lar
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
