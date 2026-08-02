package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpa {
    public final Object a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final dox g;

    public dpa(Object obj, String str, String str2, String str3, String str4, String str5, dox doxVar) {
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = doxVar;
    }

    public static dpa a(Object obj, dov dovVar) {
        if (obj != null) {
            return new dpa(obj, dovVar.d(obj), dovVar.f(obj), dovVar.h(obj), dovVar.g(obj), dovVar.e(obj), dovVar.b(obj));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        dox doxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dpa) {
            dpa dpaVar = (dpa) obj;
            if (this.a.equals(dpaVar.a) && ((str = this.b) != null ? str.equals(dpaVar.b) : dpaVar.b == null) && ((str2 = this.c) != null ? str2.equals(dpaVar.c) : dpaVar.c == null) && ((str3 = this.d) != null ? str3.equals(dpaVar.d) : dpaVar.d == null) && ((str4 = this.e) != null ? str4.equals(dpaVar.e) : dpaVar.e == null) && ((str5 = this.f) != null ? str5.equals(dpaVar.f) : dpaVar.f == null) && ((doxVar = this.g) != null ? doxVar.equals(dpaVar.g) : dpaVar.g == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (((hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ 1231) * 1000003;
        dox doxVar = this.g;
        return hashCode6 ^ (doxVar != null ? doxVar.hashCode() : 0);
    }

    public final String toString() {
        dox doxVar = this.g;
        return "AccountSnapshot{account=" + this.a.toString() + ", accountName=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", avatarUrl=" + this.f + ", isMetadataAvailable=true, gaiaAccountData=" + String.valueOf(doxVar) + "}";
    }

    public dpa() {
        throw null;
    }
}
