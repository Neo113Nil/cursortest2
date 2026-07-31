package kotlin.text;

import io.jsonwebtoken.JwtParser;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.AbstractC3213c;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class n extends StringsKt__StringNumberConversionsKt {
    public static boolean A(String str, int i4, String other, int i5, int i6, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z4 ? str.regionMatches(i4, other, i5, i6) : str.regionMatches(z4, i4, other, i5, i6);
    }

    public static /* synthetic */ boolean B(String str, int i4, String str2, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z4 = false;
        }
        return A(str, i4, str2, i5, i6, z4);
    }

    public static String C(CharSequence charSequence, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i4 + JwtParser.SEPARATOR_CHAR).toString());
        }
        if (i4 == 0) {
            return "";
        }
        if (i4 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                cArr[i5] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i4);
        E it = new IntRange(1, i4).iterator();
        while (it.hasNext()) {
            it.a();
            sb.append(charSequence);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNull(sb2);
        return sb2;
    }

    public static final String D(String str, char c4, char c5, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z4) {
            String replace = str.replace(c4, c5);
            Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (a.e(charAt, c4, z4)) {
                charAt = c5;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static String E(String str, String oldValue, String newValue, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i4 = 0;
        int Y3 = StringsKt__StringsKt.Y(str, oldValue, 0, z4);
        if (Y3 < 0) {
            return str;
        }
        int length = oldValue.length();
        int d4 = kotlin.ranges.g.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i4, Y3);
            sb.append(newValue);
            i4 = Y3 + length;
            if (Y3 >= str.length()) {
                break;
            }
            Y3 = StringsKt__StringsKt.Y(str, oldValue, Y3 + d4, z4);
        } while (Y3 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String F(String str, char c4, char c5, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return D(str, c4, c5, z4);
    }

    public static /* synthetic */ String G(String str, String str2, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return E(str, str2, str3, z4);
    }

    public static boolean H(String str, String prefix, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z4 ? str.startsWith(prefix, i4) : A(str, i4, prefix, 0, prefix.length(), z4);
    }

    public static boolean I(String str, String prefix, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z4 ? str.startsWith(prefix) : A(str, 0, prefix, 0, prefix.length(), z4);
    }

    public static /* synthetic */ boolean J(String str, String str2, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return H(str, str2, i4, z4);
    }

    public static /* synthetic */ boolean K(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return I(str, str2, z4);
    }

    public static String p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return q(str, locale);
    }

    public static final String q(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
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
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb.append(substring2);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static String r(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String s(char[] cArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractC3213c.Companion.a(i4, i5, cArr.length);
        return new String(cArr, i4, i5 - i4);
    }

    public static String t(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final boolean u(String str, String suffix, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z4 ? str.endsWith(suffix) : A(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean v(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return u(str, str2, z4);
    }

    public static boolean w(String str, String str2, boolean z4) {
        return str == null ? str2 == null : !z4 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean x(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return w(str, str2, z4);
    }

    public static Comparator y(L l4) {
        Intrinsics.checkNotNullParameter(l4, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean z(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable V3 = StringsKt__StringsKt.V(charSequence);
        if ((V3 instanceof Collection) && ((Collection) V3).isEmpty()) {
            return true;
        }
        Iterator it = V3.iterator();
        while (it.hasNext()) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(((E) it).a()))) {
                return false;
            }
        }
        return true;
    }
}
