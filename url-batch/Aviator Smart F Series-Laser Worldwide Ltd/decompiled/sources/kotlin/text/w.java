package kotlin.text;

import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class w {
    public static final String titlecaseImpl(char c8) {
        String valueOf = String.valueOf(c8);
        kotlin.jvm.internal.s.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c8));
        }
        if (c8 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        kotlin.jvm.internal.s.checkNotNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        kotlin.jvm.internal.s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }
}
