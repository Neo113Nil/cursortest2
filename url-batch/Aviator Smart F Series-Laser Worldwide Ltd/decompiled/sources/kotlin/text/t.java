package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.collections.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class t extends s {
    private static final String String(byte[] bytes, int i8, int i9, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        return new String(bytes, i8, i9, charset);
    }

    public static final String capitalize(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(locale, "getDefault()");
        return capitalize(str, locale);
    }

    private static final int codePointAt(String str, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i8);
    }

    private static final int codePointBefore(String str, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i8);
    }

    private static final int codePointCount(String str, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i8, i9);
    }

    public static final int compareTo(String str, String other, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return z7 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return compareTo(str, str2, z7);
    }

    public static String concatToString(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = cArr.length;
        }
        return concatToString(cArr, i8, i9);
    }

    private static final boolean contentEquals(String str, CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    public static final String decapitalize(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        kotlin.jvm.internal.s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    public static String decodeToString(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, d.UTF_8);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = bArr.length;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return decodeToString(bArr, i8, i9, z7);
    }

    public static final byte[] encodeToByteArray(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(d.UTF_8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return encodeToByteArray(str, i8, i9, z7);
    }

    public static boolean endsWith(String str, String suffix, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        return !z7 ? str.endsWith(suffix) : regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return endsWith(str, str2, z7);
    }

    public static boolean equals(String str, String str2, boolean z7) {
        return str == null ? str2 == null : !z7 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return equals(str, str2, z7);
    }

    private static final String format(String str, Object... args) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(args, "args");
        String format = String.format(str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }

    public static Comparator<String> getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.w wVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    private static final String intern(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        String intern = str.intern();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(intern, "this as java.lang.String).intern()");
        return intern;
    }

    public static boolean isBlank(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable indices = StringsKt__StringsKt.getIndices(charSequence);
            if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
                Iterator it = indices.iterator();
                while (it.hasNext()) {
                    if (!b.isWhitespace(charSequence.charAt(((f0) it).nextInt()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static final String lowercase(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    private static final int nativeIndexOf(String str, char c8, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return str.indexOf(c8, i8);
    }

    private static final int nativeLastIndexOf(String str, char c8, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c8, i8);
    }

    private static final int offsetByCodePoints(String str, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i8, i9);
    }

    public static final boolean regionMatches(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? regionMatches((String) charSequence, i8, (String) other, i9, i10, z7) : StringsKt__StringsKt.regionMatchesImpl(charSequence, i8, other, i9, i10, z7);
    }

    public static String repeat(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i8 + '.').toString());
        }
        if (i8 == 0) {
            return "";
        }
        if (i8 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                cArr[i9] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i8);
        f0 it = new j6.m(1, i8).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(charSequence);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "{\n                    va…tring()\n                }");
        return sb2;
    }

    public static final String replace(String str, char c8, char c9, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (!z7) {
            String replace = str.replace(c8, c9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (c.equals(charAt, c8, z7)) {
                charAt = c9;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String replace$default(String str, char c8, char c9, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return replace(str, c8, c9, z7);
    }

    public static final String replaceFirst(String str, char c8, char c9, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        int indexOf$default = StringsKt__StringsKt.indexOf$default(str, c8, 0, z7, 2, (Object) null);
        return indexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, indexOf$default, indexOf$default + 1, (CharSequence) String.valueOf(c9)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c8, char c9, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return replaceFirst(str, c8, c9, z7);
    }

    public static final List<String> split(CharSequence charSequence, Pattern regex, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        StringsKt__StringsKt.requireNonNegativeLimit(i8);
        if (i8 == 0) {
            i8 = -1;
        }
        String[] split = regex.split(charSequence, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return kotlin.collections.k.asList(split);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return split(charSequence, pattern, i8);
    }

    public static boolean startsWith(String str, String prefix, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        return !z7 ? str.startsWith(prefix) : regionMatches(str, 0, prefix, 0, prefix.length(), z7);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return startsWith(str, str2, z7);
    }

    private static final String substring(String str, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        String substring = str.substring(i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    private static final byte[] toByteArray(String str, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = d.UTF_8;
        }
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final char[] toCharArray(String str, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.collections.b.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, str.length());
        char[] cArr = new char[i9 - i8];
        str.getChars(i8, i9, cArr, 0);
        return cArr;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return toCharArray(str, i8, i9);
    }

    private static final String toLowerCase(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    private static final Pattern toPattern(String str, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile(str, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(compile, "compile(this, flags)");
        return compile;
    }

    static /* synthetic */ Pattern toPattern$default(String str, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile(str, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(compile, "compile(this, flags)");
        return compile;
    }

    private static final String toUpperCase(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    private static final String uppercase(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    private static final String String(byte[] bytes, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        return new String(bytes, charset);
    }

    public static final String capitalize(String str, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            kotlin.jvm.internal.s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static String concatToString(char[] cArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.collections.b.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, cArr.length);
        return new String(cArr, i8, i9 - i8);
    }

    private static final boolean contentEquals(String str, StringBuffer stringBuilder) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    public static final String decapitalize(String str, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        kotlin.jvm.internal.s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    public static final String decodeToString(byte[] bArr, int i8, int i9, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.collections.b.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, bArr.length);
        if (!z7) {
            return new String(bArr, i8, i9 - i8, d.UTF_8);
        }
        CharsetDecoder newDecoder = d.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i8, i9 - i8)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    public static final byte[] encodeToByteArray(String str, int i8, int i9, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.collections.b.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, str.length());
        if (!z7) {
            String substring = str.substring(i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = d.UTF_8;
            kotlin.jvm.internal.s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        CharsetEncoder newEncoder = d.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i8, i9));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            kotlin.jvm.internal.s.checkNotNull(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    private static final String format(kotlin.jvm.internal.w wVar, String format, Object... args) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.s.checkNotNullParameter(args, "args");
        String format2 = String.format(format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(format2, "format(format, *args)");
        return format2;
    }

    private static final String lowercase(String str, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private static final int nativeIndexOf(String str, String str2, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i8);
    }

    private static final int nativeLastIndexOf(String str, String str2, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i8);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return replace(str, str2, str3, z7);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return replaceFirst(str, str2, str3, z7);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return startsWith(str, str2, i8, z7);
    }

    private static final String substring(String str, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        String substring = str.substring(i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    static /* synthetic */ char[] toCharArray$default(String str, char[] destination, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = str.length();
        }
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        str.getChars(i9, i10, destination, i8);
        return destination;
    }

    private static final String toLowerCase(String str, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private static final String toUpperCase(String str, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    private static final String uppercase(String str, Locale locale) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    private static final String String(byte[] bytes, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, i8, i9, d.UTF_8);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return StringsKt__StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    private static final String format(String str, Locale locale, Object... args) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(args, "args");
        String format = String.format(locale, str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(format, "format(locale, this, *args)");
        return format;
    }

    public static final String replaceFirst(String str, String oldValue, String newValue, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.s.checkNotNullParameter(newValue, "newValue");
        int indexOf$default = StringsKt__StringsKt.indexOf$default(str, oldValue, 0, z7, 2, (Object) null);
        return indexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, indexOf$default, oldValue.length() + indexOf$default, (CharSequence) newValue).toString();
    }

    public static boolean startsWith(String str, String prefix, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        if (z7) {
            return regionMatches(str, i8, prefix, 0, prefix.length(), z7);
        }
        return str.startsWith(prefix, i8);
    }

    private static final char[] toCharArray(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    private static final String String(byte[] bytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, d.UTF_8);
    }

    private static final String format(kotlin.jvm.internal.w wVar, Locale locale, String format, Object... args) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.s.checkNotNullParameter(args, "args");
        String format2 = String.format(locale, format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        return format2;
    }

    public static boolean regionMatches(String str, int i8, String other, int i9, int i10, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        if (!z7) {
            return str.regionMatches(i8, other, i9, i10);
        }
        return str.regionMatches(z7, i8, other, i9, i10);
    }

    private static final char[] toCharArray(String str, char[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        str.getChars(i9, i10, destination, i8);
        return destination;
    }

    private static final String String(char[] chars) {
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        return new String(chars);
    }

    private static final String String(char[] chars, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        return new String(chars, i8, i9);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        if (z7) {
            return StringsKt__StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    public static final String replace(String str, String oldValue, String newValue, boolean z7) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.s.checkNotNullParameter(newValue, "newValue");
        int i8 = 0;
        int indexOf = StringsKt__StringsKt.indexOf(str, oldValue, 0, z7);
        if (indexOf < 0) {
            return str;
        }
        int length = oldValue.length();
        coerceAtLeast = j6.v.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i8, indexOf);
                sb.append(newValue);
                i8 = indexOf + length;
                if (indexOf >= str.length()) {
                    break;
                }
                indexOf = StringsKt__StringsKt.indexOf(str, oldValue, indexOf + coerceAtLeast, z7);
            } while (indexOf > 0);
            sb.append((CharSequence) str, i8, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    private static final String String(int[] codePoints, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(codePoints, "codePoints");
        return new String(codePoints, i8, i9);
    }

    private static final String String(StringBuffer stringBuffer) {
        kotlin.jvm.internal.s.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    private static final String String(StringBuilder stringBuilder) {
        kotlin.jvm.internal.s.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }
}
