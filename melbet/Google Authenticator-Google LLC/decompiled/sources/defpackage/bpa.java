package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum bpa {
    SHA1("HmacSHA1", "SHA1", 2),
    SHA256("HmacSHA256", "SHA256", 3),
    SHA512("HmacSHA512", "SHA512", 4);

    public final String d;
    public final int e;
    private final String g;

    bpa(String str, String str2, int i) {
        this.d = str;
        this.g = str2;
        this.e = i;
    }

    public static bpa a(String str) {
        for (bpa bpaVar : values()) {
            if (str.equals(bpaVar.g) || str.equals(bpaVar.d)) {
                return bpaVar;
            }
        }
        throw new boz("Could not parse algorithm");
    }
}
