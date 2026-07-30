package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class t extends s {
    public static String s(int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.h(i2, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(0, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String t(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        String substring = str.substring(length - (8 > length ? length : 8));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
