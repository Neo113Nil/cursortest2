package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dld implements dkh {
    private final dke a;

    public dld(dke dkeVar) {
        this.a = dkeVar;
    }

    @Override // defpackage.dkh
    public final hvi a(dkl dklVar) {
        if (dklVar instanceof dlv) {
            dlv dlvVar = (dlv) dklVar;
            dkx a = dlvVar.a();
            iwq iwqVar = dlf.a;
            a.g(iwqVar);
            jkf jkfVar = a.l;
            jko jkoVar = (jko) iwqVar.c;
            if (jkfVar.l(jkoVar)) {
                dkx a2 = dlvVar.a();
                a2.g(iwqVar);
                Object j = a2.l.j(jkoVar);
                if (j == null) {
                    j = iwqVar.b;
                } else {
                    iwqVar.c(j);
                }
                dle dleVar = (dle) j;
                int A = a.A(dleVar.d);
                if (A == 0) {
                    A = 1;
                }
                int i = A - 1;
                if (i == 1) {
                    if ((dleVar.b & 1) != 0) {
                        return hnu.aJ(dke.a(dleVar.c));
                    }
                    throw new IllegalArgumentException("GAIA type must have a name");
                }
                if (i == 2) {
                    return hnu.aJ(new dke(3, null));
                }
                if (i == 3) {
                    return hnu.aJ(new dke(2, null));
                }
                if (i == 4) {
                    return hnu.aJ(this.a);
                }
                throw new IllegalArgumentException("Unknown type");
            }
        }
        return hnu.aJ(null);
    }
}
