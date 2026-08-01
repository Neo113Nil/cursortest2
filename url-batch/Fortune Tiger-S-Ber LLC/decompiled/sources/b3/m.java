package b3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class m extends l {
    public static boolean X(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean Y(int i4, int i5, int i6, String str, String str2, boolean z3) {
        u2.c.e(str, "<this>");
        u2.c.e(str2, "other");
        return !z3 ? str.regionMatches(i4, str2, i5, i6) : str.regionMatches(z3, i4, str2, i5, i6);
    }

    public static String Z(String str, String str2, String str3) {
        u2.c.e(str, "<this>");
        int f0 = e.f0(str, str2, 0, false);
        if (f0 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, f0);
            sb.append(str3);
            i5 = f0 + length;
            if (f0 >= str.length()) {
                break;
            }
            f0 = e.f0(str, str2, f0 + i4, false);
        } while (f0 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String sb2 = sb.toString();
        u2.c.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean a0(String str, String str2, int i4, boolean z3) {
        u2.c.e(str, "<this>");
        return !z3 ? str.startsWith(str2, i4) : Y(i4, 0, str2.length(), str, str2, z3);
    }

    public static boolean b0(String str, String str2, boolean z3) {
        u2.c.e(str, "<this>");
        u2.c.e(str2, "prefix");
        return !z3 ? str.startsWith(str2) : Y(0, 0, str2.length(), str, str2, z3);
    }
}
