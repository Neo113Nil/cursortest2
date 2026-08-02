package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzp {
    private final String a;
    private final String b;
    private final String c;

    public bzp(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzp)) {
            return false;
        }
        bzp bzpVar = (bzp) obj;
        return ksp.b(this.a, bzpVar.a) && ksp.b(this.b, bzpVar.b) && ksp.b(this.c, bzpVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "OtpIdentity(secret=" + this.a + ", issuer=" + this.b + ", name=" + this.c + ")";
    }
}
