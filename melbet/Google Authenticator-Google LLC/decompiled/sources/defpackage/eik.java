package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eik {
    public final String a;

    public eik(String str) {
        this.a = str;
    }

    public static eik a(eik eikVar, eik eikVar2) {
        return new eik(String.valueOf(eikVar.a).concat(String.valueOf(eikVar2.a)));
    }

    public static String b(eik eikVar) {
        if (eikVar == null) {
            return null;
        }
        return eikVar.a;
    }

    public static eik c(Class cls) {
        return !hoq.S(null) ? new eik("null".concat(String.valueOf(cls.getSimpleName()))) : new eik(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eik) {
            return this.a.equals(((eik) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
