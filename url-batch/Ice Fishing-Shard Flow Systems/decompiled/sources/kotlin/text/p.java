package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class p extends StringsKt__StringNumberConversionsKt {
    public static boolean f(String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean g(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static boolean h(int i2, int i5, int i7, String str, String other, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z7 ? str.regionMatches(i2, other, i5, i7) : str.regionMatches(z7, i2, other, i5, i7);
    }

    public static String i(String str, char c7, char c8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String replace = str.replace(c7, c8);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return replace;
    }

    public static String j(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int m2 = StringsKt__StringsKt.m(0, str, oldValue, false);
        if (m2 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, m2);
            sb.append(newValue);
            i5 = m2 + length;
            if (m2 >= str.length()) {
                break;
            }
            m2 = StringsKt__StringsKt.m(m2 + i2, str, oldValue, false);
        } while (m2 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static boolean k(String str, int i2, String prefix, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z7 ? str.startsWith(prefix, i2) : h(i2, 0, prefix.length(), str, prefix, z7);
    }

    public static boolean l(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return str.startsWith(prefix);
    }
}
