package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class t40 extends s40 {
    public static boolean a0(String str, String str2) {
        str.getClass();
        return str.endsWith(str2);
    }

    public static boolean b0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static String c0(String str, String str2, String str3) {
        str.getClass();
        int h0 = l40.h0(str, str2, 0, false);
        if (h0 < 0) {
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
            sb.append((CharSequence) str, i2, h0);
            sb.append(str3);
            i2 = h0 + length;
            if (h0 >= str.length()) {
                break;
            }
            h0 = l40.h0(str, str2, h0 + i, false);
        } while (h0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean d0(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        int length = str2.length();
        return !z ? str.regionMatches(i, str2, 0, length) : str.regionMatches(z, i, str2, 0, length);
    }

    public static boolean e0(String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }
}
