package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ieu implements jwz {
    private static final hkh a = hkh.l("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor");

    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        idy idyVar = (idy) jwwVar.e(idy.a);
        if (idyVar != null) {
            ((hkf) ((hkf) a.b()).i("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 29, "CredentialStrategyInterceptor.java")).u("Using CredentialStrategy: %s", idyVar.getClass());
            return iwu.b(jwxVar, ikg.r(new eqn(idyVar, 12))).b(kaeVar, jwwVar);
        }
        ((hkf) ((hkf) a.b()).i("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 37, "CredentialStrategyInterceptor.java")).s("Did not set CredentialStrategy");
        return jwxVar.b(kaeVar, jwwVar);
    }
}
