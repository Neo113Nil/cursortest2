package p3;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class l extends k {
    public static boolean m0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean n0(int i, int i4, int i5, String str, String str2, boolean z4) {
        i3.d.e(str, "<this>");
        i3.d.e(str2, "other");
        return !z4 ? str.regionMatches(i, str2, i4, i5) : str.regionMatches(z4, i, str2, i4, i5);
    }

    public static String o0(String str, String str2, String str3) {
        i3.d.e(str, "<this>");
        int u02 = d.u0(str, str2, 0, false);
        if (u02 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, u02);
            sb.append(str3);
            i4 = u02 + length;
            if (u02 >= str.length()) {
                break;
            }
            u02 = d.u0(str, str2, u02 + i, false);
        } while (u02 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        i3.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean p0(String str, String str2, int i, boolean z4) {
        i3.d.e(str, "<this>");
        return !z4 ? str.startsWith(str2, i) : n0(i, 0, str2.length(), str, str2, z4);
    }

    public static boolean q0(String str, String str2, boolean z4) {
        i3.d.e(str, "<this>");
        i3.d.e(str2, "prefix");
        return !z4 ? str.startsWith(str2) : n0(0, 0, str2.length(), str, str2, z4);
    }
}
