package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eet {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    private final String e;

    public eet(String str, String str2, String str3, String str4, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null accountIdentifier");
        }
        this.e = str;
        if (str2 == null) {
            throw new NullPointerException("Null accountName");
        }
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = z;
    }

    public static eet a(Object obj, dov dovVar) {
        return new eet(dovVar.c(obj), dovVar.d(obj), dovVar.f(obj), dovVar.e(obj), dovVar.i(obj));
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eet) {
            eet eetVar = (eet) obj;
            if (this.e.equals(eetVar.e) && this.a.equals(eetVar.a) && ((str = this.b) != null ? str.equals(eetVar.b) : eetVar.b == null) && ((str2 = this.c) != null ? str2.equals(eetVar.c) : eetVar.c == null) && this.d == eetVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return (((true != this.d ? 1237 : 1231) ^ ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003)) * 1000003) ^ 1231;
    }

    public final String toString() {
        return "OneGoogleAvatarImageLoaderKey{accountIdentifier=" + this.e + ", accountName=" + this.a + ", displayName=" + this.b + ", avatarUrl=" + this.c + ", isGaiaAccount=" + this.d + ", isMetadataAvailable=true}";
    }

    public eet() {
        throw null;
    }
}
