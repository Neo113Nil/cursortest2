package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqj implements gew {
    final /* synthetic */ String a;
    final /* synthetic */ ldt b;

    public bqj(ldt ldtVar, String str) {
        this.a = str;
        this.b = ldtVar;
    }

    @Override // defpackage.gew
    public final gdp a() {
        hfm p = hfm.p(new gdo("accounts_with_consent"), new gdo("edit_recycler_view"));
        hoq.y(p.size() > 1, "A set key must have at least two members.");
        return new geg(p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gew
    public final hvi b() {
        ldt ldtVar = this.b;
        fug fugVar = (fug) ldtVar.d;
        hvi b = fugVar.b((frv) ldtVar.e);
        bqh bqhVar = new bqh(2);
        ?? r5 = ldtVar.c;
        hvi at = hoq.at(b, bqhVar, r5);
        hvi a = ((bss) ldtVar.b).a();
        hvi s = hoq.aX(at, a).s(new bsp(at, a, 1), r5);
        Object obj = ((car) ldtVar.a).d;
        bpr bprVar = (bpr) obj;
        cbe cbeVar = bprVar.d;
        hvi c = fugVar.c();
        hvi au = hoq.au(cbeVar.a(), new bpg(obj, this.a, 0), bprVar.b);
        return hoq.aX(s, c, au).s(new bqi(s, c, au, 0), r5);
    }
}
