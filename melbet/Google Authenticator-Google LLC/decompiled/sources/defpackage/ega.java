package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ega {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;
    public final int i;
    private final boolean j;
    private final String k;
    private final int l;

    public ega(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, int i, int i2, String str6, String str7, int i3) {
        this.a = str;
        this.j = z;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z2;
        this.h = i;
        this.i = i2;
        this.g = str6;
        this.k = str7;
        this.l = i3;
    }

    public static efz a() {
        efz efzVar = new efz();
        efzVar.d(false);
        efzVar.c(1);
        efzVar.e(true);
        efzVar.g = 1;
        efzVar.h = 1;
        return efzVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ega) {
            ega egaVar = (ega) obj;
            if (this.a.equals(egaVar.a) && this.j == egaVar.j && ((str = this.b) != null ? str.equals(egaVar.b) : egaVar.b == null) && ((str2 = this.c) != null ? str2.equals(egaVar.c) : egaVar.c == null) && ((str3 = this.d) != null ? str3.equals(egaVar.d) : egaVar.d == null) && ((str4 = this.e) != null ? str4.equals(egaVar.e) : egaVar.e == null) && this.f == egaVar.f) {
                int i = this.h;
                int i2 = egaVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.i;
                    int i4 = egaVar.i;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && ((str5 = this.g) != null ? str5.equals(egaVar.g) : egaVar.g == null) && ((str6 = this.k) != null ? str6.equals(egaVar.k) : egaVar.k == null)) {
                        int i5 = this.l;
                        int i6 = egaVar.l;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((((hashCode * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        int i = true == this.f ? 1231 : 1237;
        int i2 = this.h;
        a.D(i2);
        int i3 = (((hashCode5 ^ i) * 1000003) ^ i2) * 1000003;
        int i4 = this.i;
        a.D(i4);
        int i5 = (i3 ^ i4) * 1000003;
        String str5 = this.g;
        int hashCode6 = (i5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.k;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        int i6 = this.l;
        a.D(i6);
        return i6 ^ ((hashCode6 ^ hashCode7) * 1000003);
    }

    public final String toString() {
        int i = this.l;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TWENTY_ONE_OR_OLDER" : "EIGHTEEN_TO_TWENTY" : "LESS_THAN_EIGHTEEN" : "UNKNOWN";
        int i2 = this.h;
        int i3 = this.i;
        String str2 = this.k;
        String str3 = this.g;
        boolean z = this.f;
        String str4 = this.e;
        String str5 = this.d;
        String str6 = this.c;
        String str7 = this.b;
        boolean z2 = this.j;
        return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + z2 + ", displayName=" + str7 + ", givenName=" + str6 + ", familyName=" + str5 + ", obfuscatedGaiaId=" + str4 + ", isG1User=" + z + ", isDasherUser=" + a.w(i2) + ", isUnicornUser=" + a.w(i3) + ", avatarUrl=" + str3 + ", defaultAvatarUrl=" + str2 + ", ageRange=" + str + "}";
    }

    public ega() {
        throw null;
    }
}
