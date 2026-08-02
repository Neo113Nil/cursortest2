package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class kgw extends jzo {
    private final jzo a;

    public kgw(jzo jzoVar) {
        this.a = jzoVar;
    }

    @Override // defpackage.jwx
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.jwx
    public final iws b(kae kaeVar, jww jwwVar) {
        return this.a.b(kaeVar, jwwVar);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", this.a);
        return T.toString();
    }
}
