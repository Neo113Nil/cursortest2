package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class uf0 extends tf0 {
    public static boolean o(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static String p(String str, String str2, String str3) {
        str.getClass();
        int u = mf0.u(str, str2, 0, false);
        if (u < 0) {
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
            sb.append((CharSequence) str, i2, u);
            sb.append(str3);
            i2 = u + length;
            if (u >= str.length()) {
                break;
            }
            u = mf0.u(str, str2, u + i, false);
        } while (u > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean q(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        int length = str2.length();
        return !z ? str.regionMatches(i, str2, 0, length) : str.regionMatches(z, i, str2, 0, length);
    }

    public static boolean r(String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }
}
