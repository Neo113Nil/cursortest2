package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnf implements gmg, jrp {
    final jsb a;
    final jsb b;
    private final bnl c;
    private final bnk d;
    private final bmy e;
    private final bmx f;
    private final bnf g = this;

    public bnf(bnl bnlVar, bnk bnkVar, bmy bmyVar, bmx bmxVar, gld gldVar) {
        this.c = bnlVar;
        this.d = bnkVar;
        this.e = bmyVar;
        this.f = bmxVar;
        jrw a = jrx.a(gldVar);
        this.a = a;
        this.b = new emo(a, 15);
    }

    @Override // defpackage.gmg
    public final bns a() {
        return new bns(this.c, this.d, this.e, this.f, this.g);
    }
}
