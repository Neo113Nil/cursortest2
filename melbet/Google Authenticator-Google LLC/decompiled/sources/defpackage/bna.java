package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bna implements jpw, jqh, jql, jqz, jrp {
    private final bnl b;
    private final bna c = this;
    final jsb a = jrv.c(jqn.a);

    public bna(bnl bnlVar) {
        this.b = bnlVar;
    }

    @Override // defpackage.jql
    public final jqg a() {
        return (jqg) this.a.b();
    }

    @Override // defpackage.jqz
    public final bnz b() {
        return new bnz(this.b, this.c);
    }

    @Override // defpackage.jqh
    public final byo c() {
        return new byo(this.b, this.c);
    }
}
