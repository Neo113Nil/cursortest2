package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes3.dex */
public class CharsKt__CharJVMKt {
    public static final int a(char c4, int i4) {
        return Character.digit((int) c4, i4);
    }

    public static boolean b(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }

    public static String c(char c4, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String d4 = d(c4, locale);
        if (d4.length() <= 1) {
            String valueOf = String.valueOf(c4);
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.areEqual(d4, upperCase)) {
                return String.valueOf(Character.toTitleCase(c4));
            }
        } else if (c4 != 329) {
            char charAt = d4.charAt(0);
            Intrinsics.checkNotNull(d4, "null cannot be cast to non-null type java.lang.String");
            String substring = d4.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return charAt + lowerCase;
        }
        return d4;
    }

    public static int checkRadix(int i4) {
        if (new IntRange(2, 36).h(i4)) {
            return i4;
        }
        throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new IntRange(2, 36));
    }

    public static final String d(char c4, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c4);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
