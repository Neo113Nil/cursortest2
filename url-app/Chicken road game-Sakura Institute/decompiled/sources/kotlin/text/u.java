package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class u extends t {
    public static boolean h(boolean z4, String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z4 ? str.endsWith(suffix) : j(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static boolean i(boolean z4, String str, String str2) {
        return str == null ? str2 == null : !z4 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean j(String str, int i2, String other, int i4, int i5, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z4 ? str.regionMatches(i2, other, i4, i5) : str.regionMatches(z4, i2, other, i4, i5);
    }

    public static String k(int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 == 0) {
            return "";
        }
        int i4 = 1;
        if (i2 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i2];
            for (int i5 = 0; i5 < i2; i5++) {
                cArr[i5] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i2);
        if (1 <= i2) {
            while (true) {
                sb.append((CharSequence) str);
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.c(sb2);
        return sb2;
    }

    public static String l(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int s4 = y.s(str, oldValue, 0, false);
        if (s4 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, s4);
            sb.append(newValue);
            i4 = s4 + length;
            if (s4 >= str.length()) {
                break;
            }
            s4 = y.s(str, oldValue, s4 + i2, false);
        } while (s4 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static boolean m(int i2, String str, String prefix, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z4 ? str.startsWith(prefix, i2) : j(str, i2, prefix, 0, prefix.length(), z4);
    }

    public static boolean n(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return str.startsWith(prefix);
    }
}
