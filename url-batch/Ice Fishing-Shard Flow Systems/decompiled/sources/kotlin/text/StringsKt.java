package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.D;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
/* loaded from: classes.dex */
public final class StringsKt extends t {
    private StringsKt() {
    }

    public static int A(int i2, String str, String string) {
        int w4 = (i2 & 2) != 0 ? w(str) : 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return str == null ? StringsKt__StringsKt.n(str, string, w4, 0, false, true) : str.lastIndexOf(string, w4);
    }

    public static int B(String str, char c7, int i2, int i5) {
        if ((i5 & 2) != 0) {
            i2 = w(str);
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str != null) {
            return str.lastIndexOf(c7, i2);
        }
        char[] chars = {c7};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (str != null) {
            return str.lastIndexOf(kotlin.collections.p.p(chars), i2);
        }
        int w4 = w(str);
        if (i2 > w4) {
            i2 = w4;
        }
        while (-1 < i2) {
            if (a.b(chars[0], str.charAt(i2), false)) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static String C(int i2, String str) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.h(i2, "Desired length ", " is less than zero."));
        }
        if (i2 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            int length = i2 - str.length();
            int i5 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String D(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!p.l(str, prefix)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String E(String str) {
        String str2;
        boolean p7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("Client", "suffix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("Client", "suffix");
        if (str != null) {
            p7 = p.f(str, "Client");
            str2 = str;
        } else {
            str2 = str;
            p7 = StringsKt__StringsKt.p(str2, str.length() - 6, "Client", 0, 6, false);
        }
        if (!p7) {
            return str2;
        }
        String substring = str2.substring(0, str2.length() - 6);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static List G(String str, final char[] delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return StringsKt__StringsKt.r(0, str, String.valueOf(delimiters[0]), false);
        }
        StringsKt__StringsKt.q(0);
        c cVar = new c(str, 0, new Function2() { // from class: kotlin.text.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int o7 = StringsKt__StringsKt.o(DelimitedRangesSequence, delimiters, intValue, false);
                if (o7 < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(o7), 1);
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        D d7 = new D(cVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.s.g(d7, 10));
        Iterator it = d7.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) bVar.next();
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(str.subSequence(range.f6173d, range.f6174e + 1).toString());
        }
    }

    public static String H(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int y7 = y(missingDelimiterValue, delimiter, 0, false, 6);
        if (y7 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(delimiter.length() + y7, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static Long I(String str) {
        boolean z7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.d(charAt, 48) < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z7 = false;
                i2 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z7 = false;
        }
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 != -256204778801521550L) {
                    return null;
                }
                j8 = j / 10;
                if (j7 < j8) {
                    return null;
                }
            }
            long j9 = j7 * 10;
            long j10 = digit;
            if (j9 < j + j10) {
                return null;
            }
            j7 = j9 - j10;
            i2++;
        }
        return z7 ? Long.valueOf(j7) : Long.valueOf(-j7);
    }

    public static CharSequence J(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z7 = false;
        while (i2 <= length) {
            boolean a7 = CharsKt__CharJVMKt.a(str.charAt(!z7 ? i2 : length));
            if (z7) {
                if (!a7) {
                    break;
                }
                length--;
            } else if (a7) {
                i2++;
            } else {
                z7 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }

    public static boolean u(CharSequence charSequence, String other, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return y(charSequence, other, 0, z7, 2) >= 0;
    }

    public static boolean v(CharSequence charSequence, char c7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return x(charSequence, c7, 0, 2) >= 0;
    }

    public static int w(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int x(CharSequence charSequence, char c7, int i2, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.o(charSequence, new char[]{c7}, i2, false) : ((String) charSequence).indexOf(c7, i2);
    }

    public static /* synthetic */ int y(CharSequence charSequence, String str, int i2, boolean z7, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            z7 = false;
        }
        return StringsKt__StringsKt.m(i2, charSequence, str, z7);
    }

    public static boolean z(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!CharsKt__CharJVMKt.a(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }
}
