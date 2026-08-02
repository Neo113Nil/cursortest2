package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iet implements jwz {
    private final /* synthetic */ int a;

    public iet(int i) {
        this.a = i;
    }

    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        int i = this.a;
        if (i == 0) {
            return jwwVar.e(idf.a) == null ? jwxVar.b(kaeVar, jwwVar) : new ier(jwxVar, kaeVar, jwwVar);
        }
        if (i == 1) {
            return new gos(jwxVar.b(kaeVar, jwwVar), "gRPC:".concat(kaeVar.b), gvz.b());
        }
        hoq.I(jwwVar.e(idf.a) == null, "AuthContext was set, but no AuthContextManager was bound");
        return jwxVar.b(kaeVar, jwwVar);
    }
}
