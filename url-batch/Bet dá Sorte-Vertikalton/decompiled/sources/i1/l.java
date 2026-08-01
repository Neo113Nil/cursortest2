package i1;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static boolean s0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean t0(int i, int i2, int i3, String str, String str2, boolean z2) {
        b1.d.e(str, "<this>");
        b1.d.e(str2, "other");
        return !z2 ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z2, i, str2, i2, i3);
    }

    public static String u0(String str, String str2, String str3) {
        b1.d.e(str, "<this>");
        int A02 = d.A0(str, str2, 0, false);
        if (A02 < 0) {
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
            sb.append((CharSequence) str, i2, A02);
            sb.append(str3);
            i2 = A02 + length;
            if (A02 >= str.length()) {
                break;
            }
            A02 = d.A0(str, str2, A02 + i, false);
        } while (A02 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        b1.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean v0(String str, String str2, int i, boolean z2) {
        b1.d.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i) : t0(i, 0, str2.length(), str, str2, z2);
    }

    public static boolean w0(String str, String str2, boolean z2) {
        b1.d.e(str, "<this>");
        b1.d.e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : t0(0, 0, str2.length(), str, str2, z2);
    }
}
