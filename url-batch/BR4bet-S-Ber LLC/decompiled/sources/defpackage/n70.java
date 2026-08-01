package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class n70 extends m70 {
    public static boolean Q(String str, String str2) {
        str.getClass();
        return str.endsWith(str2);
    }

    public static boolean R(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static String S(String str, String str2, String str3) {
        str.getClass();
        int X = f70.X(str, str2, 0, false);
        if (X < 0) {
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
            sb.append((CharSequence) str, i2, X);
            sb.append(str3);
            i2 = X + length;
            if (X >= str.length()) {
                break;
            }
            X = f70.X(str, str2, X + i, false);
        } while (X > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean T(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        int length = str2.length();
        return !z ? str.regionMatches(i, str2, 0, length) : str.regionMatches(z, i, str2, 0, length);
    }

    public static boolean U(String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }
}
