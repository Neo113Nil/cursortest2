package kotlin.text;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {
    public static int checkRadix(int i8) {
        if (new j6.m(2, 36).contains(i8)) {
            return i8;
        }
        throw new IllegalArgumentException("radix " + i8 + " was not in valid range " + new j6.m(2, 36));
    }

    public static final int digitOf(char c8, int i8) {
        return Character.digit((int) c8, i8);
    }

    public static final CharCategory getCategory(char c8) {
        return CharCategory.Companion.valueOf(Character.getType(c8));
    }

    public static final CharDirectionality getDirectionality(char c8) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality(c8));
    }

    private static final boolean isDefined(char c8) {
        return Character.isDefined(c8);
    }

    private static final boolean isDigit(char c8) {
        return Character.isDigit(c8);
    }

    private static final boolean isHighSurrogate(char c8) {
        return Character.isHighSurrogate(c8);
    }

    private static final boolean isISOControl(char c8) {
        return Character.isISOControl(c8);
    }

    private static final boolean isIdentifierIgnorable(char c8) {
        return Character.isIdentifierIgnorable(c8);
    }

    private static final boolean isJavaIdentifierPart(char c8) {
        return Character.isJavaIdentifierPart(c8);
    }

    private static final boolean isJavaIdentifierStart(char c8) {
        return Character.isJavaIdentifierStart(c8);
    }

    private static final boolean isLetter(char c8) {
        return Character.isLetter(c8);
    }

    private static final boolean isLetterOrDigit(char c8) {
        return Character.isLetterOrDigit(c8);
    }

    private static final boolean isLowSurrogate(char c8) {
        return Character.isLowSurrogate(c8);
    }

    private static final boolean isLowerCase(char c8) {
        return Character.isLowerCase(c8);
    }

    private static final boolean isTitleCase(char c8) {
        return Character.isTitleCase(c8);
    }

    private static final boolean isUpperCase(char c8) {
        return Character.isUpperCase(c8);
    }

    public static final boolean isWhitespace(char c8) {
        return Character.isWhitespace(c8) || Character.isSpaceChar(c8);
    }

    private static final String lowercase(char c8) {
        String valueOf = String.valueOf(c8);
        kotlin.jvm.internal.s.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    private static final char lowercaseChar(char c8) {
        return Character.toLowerCase(c8);
    }

    public static final String titlecase(char c8, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        String uppercase = uppercase(c8, locale);
        if (uppercase.length() <= 1) {
            String valueOf = String.valueOf(c8);
            kotlin.jvm.internal.s.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !kotlin.jvm.internal.s.areEqual(uppercase, upperCase) ? uppercase : String.valueOf(Character.toTitleCase(c8));
        }
        if (c8 == 329) {
            return uppercase;
        }
        char charAt = uppercase.charAt(0);
        kotlin.jvm.internal.s.checkNotNull(uppercase, "null cannot be cast to non-null type java.lang.String");
        String substring = uppercase.substring(1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        kotlin.jvm.internal.s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }

    private static final char titlecaseChar(char c8) {
        return Character.toTitleCase(c8);
    }

    private static final char toLowerCase(char c8) {
        return Character.toLowerCase(c8);
    }

    private static final char toTitleCase(char c8) {
        return Character.toTitleCase(c8);
    }

    private static final char toUpperCase(char c8) {
        return Character.toUpperCase(c8);
    }

    private static final String uppercase(char c8) {
        String valueOf = String.valueOf(c8);
        kotlin.jvm.internal.s.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    private static final char uppercaseChar(char c8) {
        return Character.toUpperCase(c8);
    }

    public static final String lowercase(char c8, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c8);
        kotlin.jvm.internal.s.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final String uppercase(char c8, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c8);
        kotlin.jvm.internal.s.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
