package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class egf implements egj {
    private final /* synthetic */ int a;

    public /* synthetic */ egf(int i) {
        this.a = i;
    }

    @Override // defpackage.egj
    public final hvi a(dok dokVar, dog dogVar, int i) {
        int i2 = 13;
        if (this.a != 0) {
            gwu g = gwu.g(dokVar.c());
            doi doiVar = new doi(dokVar, i, 0);
            huf hufVar = huf.a;
            return egh.g(g.i(doiVar, hufVar).e(Exception.class, new bwu(11), hufVar).h(new cvr(i2), hufVar));
        }
        gwu g2 = gwu.g(dokVar.c());
        fch fchVar = new fch(dokVar, dogVar, i, 1);
        huf hufVar2 = huf.a;
        return g2.i(fchVar, hufVar2).e(Exception.class, new bwu(i2), hufVar2).h(new cvr(17), hufVar2);
    }
}
