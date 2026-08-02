package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ies implements jwz {
    private final /* synthetic */ int a;
    private final Object b;

    public ies(int i) {
        this.a = i;
        this.b = new iez(new gjo(2), new ghz(8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [iel, java.lang.Object] */
    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        int i = this.a;
        if (i == 0) {
            jwwVar.getClass();
            return jwwVar.e(idf.a) == null ? jwxVar.b(kaeVar, jwwVar) : ((iez) this.b).a(kaeVar, jwwVar, jwxVar);
        }
        if (i != 1) {
            jwwVar.getClass();
            return ((iez) this.b).a(kaeVar, jwwVar, jwxVar);
        }
        jwwVar.getClass();
        ?? r4 = this.b;
        long a = r4.a();
        jww d = jwwVar.d(iem.a, r4);
        if (a > 0) {
            d = d.d(kef.d, Integer.valueOf((int) a));
        }
        return jwxVar.b(kaeVar, d);
    }

    public ies(int i, byte[] bArr) {
        this.a = i;
        this.b = new iez(new gjo(3), new ghz(9));
    }

    public ies(iel ielVar, int i) {
        this.a = i;
        this.b = ielVar;
    }
}
