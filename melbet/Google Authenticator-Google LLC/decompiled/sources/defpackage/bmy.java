package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmy implements gkk, gkt, gkz, jrp {
    private final bnl b;
    private final bnk c;
    private final bmy d = this;
    final jsb a = jrv.c(gky.a);

    public bmy(bnl bnlVar, bnk bnkVar) {
        this.b = bnlVar;
        this.c = bnkVar;
        jrv.c(jsd.a);
    }

    @Override // defpackage.gkz
    public final bnq a() {
        return new bnq(this.b, this.c, this.d);
    }

    @Override // defpackage.gkk
    public final bnx b() {
        return new bnx(this.b, this.c, this.d);
    }

    @Override // defpackage.gkt
    public final jqg c() {
        return (jqg) this.a.b();
    }
}
