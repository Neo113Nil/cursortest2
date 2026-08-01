package k1;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static boolean u(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean v(int i, int i2, int i3, String str, String str2, boolean z2) {
        d1.d.e(str, "<this>");
        d1.d.e(str2, "other");
        return !z2 ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z2, i, str2, i2, i3);
    }

    public static String w(String str, String str2, String str3) {
        d1.d.e(str, "<this>");
        int C2 = d.C(str, str2, 0, false);
        if (C2 < 0) {
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
            sb.append((CharSequence) str, i2, C2);
            sb.append(str3);
            i2 = C2 + length;
            if (C2 >= str.length()) {
                break;
            }
            C2 = d.C(str, str2, C2 + i, false);
        } while (C2 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        d1.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean x(String str, String str2, int i, boolean z2) {
        d1.d.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i) : v(i, 0, str2.length(), str, str2, z2);
    }

    public static boolean y(String str, String str2, boolean z2) {
        d1.d.e(str, "<this>");
        d1.d.e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : v(0, 0, str2.length(), str, str2, z2);
    }
}
