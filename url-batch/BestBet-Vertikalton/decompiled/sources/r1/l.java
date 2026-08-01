package r1;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static String A(String str, String str2, String str3) {
        k1.e.e(str, "<this>");
        int G2 = d.G(str, str2, 0, false);
        if (G2 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, G2);
            sb.append(str3);
            i2 = G2 + length;
            if (G2 >= str.length()) {
                break;
            }
            G2 = d.G(str, str2, G2 + i, false);
        } while (G2 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        k1.e.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean B(String str, String str2, int i, boolean z2) {
        k1.e.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i) : z(i, 0, str2.length(), str, str2, z2);
    }

    public static boolean C(String str, String str2, boolean z2) {
        k1.e.e(str, "<this>");
        k1.e.e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : z(0, 0, str2.length(), str, str2, z2);
    }

    public static boolean x(String str, String str2) {
        k1.e.e(str, "<this>");
        k1.e.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean y(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean z(int i, int i2, int i3, String str, String str2, boolean z2) {
        k1.e.e(str, "<this>");
        k1.e.e(str2, "other");
        return !z2 ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z2, i, str2, i2, i3);
    }
}
