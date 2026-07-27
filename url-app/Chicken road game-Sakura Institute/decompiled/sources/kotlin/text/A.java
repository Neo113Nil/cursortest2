package kotlin.text;

import A.AbstractC0017m;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class A extends z {
    public static String N(int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(i2, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static char O(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(y.r(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String P(int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(i2, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(0, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
