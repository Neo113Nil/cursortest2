package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khs implements kja {
    public final kfr a;
    public boolean b = false;
    public final /* synthetic */ khu c;

    public khs(khu khuVar, kfr kfrVar) {
        this.c = khuVar;
        this.a = kfrVar;
    }

    public static final String b(kbe kbeVar) {
        int ordinal;
        if (kbeVar == null || (ordinal = kbeVar.ordinal()) == 0) {
            return "none";
        }
        if (ordinal == 1) {
            return "integrity_only";
        }
        if (ordinal == 2) {
            return "privacy_and_integrity";
        }
        throw new IllegalArgumentException("Unknown SecurityLevel: ".concat(kbeVar.toString()));
    }

    public static final String c(jwt jwtVar, jws jwsVar) {
        String str = (String) jwtVar.a(jwsVar);
        return str == null ? "" : str;
    }

    public static final String d(jwt jwtVar) {
        String str = (String) jwtVar.a(jyn.b);
        if (str == null) {
            str = (String) jwtVar.a(kaq.a);
        }
        return str == null ? "" : str;
    }

    @Override // defpackage.kja
    public final void a(boolean z) {
        throw null;
    }
}
