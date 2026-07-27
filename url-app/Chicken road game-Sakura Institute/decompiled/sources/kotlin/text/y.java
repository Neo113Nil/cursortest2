package kotlin.text;

import A.AbstractC0017m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import z2.C1436t;
import z2.C1439w;
import z2.C1440x;
import z2.C1442z;

/* loaded from: classes.dex */
public class y extends u {
    public static final List A(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        String[] delimiters = {"\r\n", "\n", "\r"};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return T2.r.k(T2.r.i(B(str, delimiters, false, 0), new x(str)));
    }

    public static c B(String str, String[] strArr, boolean z4, int i2) {
        F(i2);
        return new c(str, 0, i2, new w(C1436t.b(strArr), z4));
    }

    public static final boolean C(CharSequence charSequence, int i2, CharSequence other, int i4, int i5, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i4 < 0 || i2 < 0 || i2 > charSequence.length() - i5 || i4 > other.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!C0754a.a(charSequence.charAt(i2 + i6), other.charAt(i4 + i6), z4)) {
                return false;
            }
        }
        return true;
    }

    public static String D(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!(str != null ? u.n(str, prefix) : C(str, 0, prefix, 0, prefix.length(), false))) {
            return str;
        }
        String substring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String E(String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!q(str, suffix)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final void F(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List G(int i2, String str, String str2, boolean z4) {
        F(i2);
        int i4 = 0;
        int s4 = s(str, str2, 0, z4);
        if (s4 == -1 || i2 == 1) {
            return C1440x.a(str.toString());
        }
        boolean z5 = i2 > 0;
        int i5 = 10;
        if (z5 && i2 <= 10) {
            i5 = i2;
        }
        ArrayList arrayList = new ArrayList(i5);
        do {
            arrayList.add(str.subSequence(i4, s4).toString());
            i4 = str2.length() + s4;
            if (z5 && arrayList.size() == i2 - 1) {
                break;
            }
            s4 = s(str, str2, i4, z4);
        } while (s4 != -1);
        arrayList.add(str.subSequence(i4, str.length()).toString());
        return arrayList;
    }

    public static List H(String str, char[] delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return G(0, str, String.valueOf(delimiters[0]), false);
        }
        F(0);
        c cVar = new c(str, 0, 0, new v(delimiters, false));
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        T2.p pVar = new T2.p(cVar);
        ArrayList arrayList = new ArrayList(C1442z.h(pVar, 10));
        Iterator it = pVar.iterator();
        while (true) {
            C0755b c0755b = (C0755b) it;
            if (!c0755b.hasNext()) {
                return arrayList;
            }
            arrayList.add(I(str, (IntRange) c0755b.next()));
        }
    }

    public static final String I(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return str.subSequence(range.f7505d, range.f7506e + 1).toString();
    }

    public static String J(String str, char c4, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int u4 = u(str, c4, 0, false, 6);
        if (u4 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(u4 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String K(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int v4 = v(missingDelimiterValue, delimiter, 0, false, 6);
        if (v4 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(delimiter.length() + v4, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String L(String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int z4 = z(str, '.', 0, 6);
        if (z4 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(z4 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static CharSequence M(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z4 = false;
        while (i2 <= length) {
            boolean b4 = CharsKt.b(str.charAt(!z4 ? i2 : length));
            if (z4) {
                if (!b4) {
                    break;
                }
                length--;
            } else if (b4) {
                i2++;
            } else {
                z4 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }

    public static boolean o(CharSequence charSequence, char c4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return u(charSequence, c4, 0, false, 2) >= 0;
    }

    public static boolean p(CharSequence charSequence, String other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return v(charSequence, other, 0, false, 2) >= 0;
    }

    public static boolean q(CharSequence charSequence, String suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return charSequence instanceof String ? u.h(false, (String) charSequence, suffix) : C(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static int r(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int s(CharSequence charSequence, String string, int i2, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z4 || !(charSequence instanceof String)) ? t(charSequence, string, i2, charSequence.length(), z4, false) : ((String) charSequence).indexOf(string, i2);
    }

    public static final int t(CharSequence charSequence, String str, int i2, int i4, boolean z4, boolean z5) {
        kotlin.ranges.a aVar;
        if (z5) {
            int r2 = r(charSequence);
            if (i2 > r2) {
                i2 = r2;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            kotlin.ranges.a.f7504j.getClass();
            aVar = new kotlin.ranges.a(i2, i4, -1);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            aVar = new IntRange(i2, i4, 1);
        }
        boolean z6 = charSequence instanceof String;
        int i5 = aVar.f7507i;
        int i6 = aVar.f7506e;
        int i7 = aVar.f7505d;
        if (!z6 || str == null) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                while (!C(str, 0, charSequence, i7, str.length(), z4)) {
                    if (i7 != i6) {
                        i7 += i5;
                    }
                }
                return i7;
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            while (!u.j(str, 0, (String) charSequence, i7, str.length(), z4)) {
                if (i7 != i6) {
                    i7 += i5;
                }
            }
            return i7;
        }
        return -1;
    }

    public static int u(CharSequence charSequence, char c4, int i2, boolean z4, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z4 || !(charSequence instanceof String)) ? w(charSequence, new char[]{c4}, i2, z4) : ((String) charSequence).indexOf(c4, i2);
    }

    public static /* synthetic */ int v(CharSequence charSequence, String str, int i2, boolean z4, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return s(charSequence, str, i2, z4);
    }

    public static final int w(CharSequence charSequence, char[] chars, int i2, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z4 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C1439w.y(chars), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int r2 = r(charSequence);
        if (i2 > r2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i2);
            for (char c4 : chars) {
                if (C0754a.a(c4, charAt, z4)) {
                    return i2;
                }
            }
            if (i2 == r2) {
                return -1;
            }
            i2++;
        }
    }

    public static boolean x(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!CharsKt.b(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int y(int i2, String str, String string) {
        int r2 = (i2 & 2) != 0 ? r(str) : 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return str == null ? t(str, string, r2, 0, false, true) : str.lastIndexOf(string, r2);
    }

    public static int z(String str, char c4, int i2, int i4) {
        if ((i4 & 2) != 0) {
            i2 = r(str);
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str != null) {
            return str.lastIndexOf(c4, i2);
        }
        char[] chars = {c4};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (str != null) {
            return str.lastIndexOf(C1439w.y(chars), i2);
        }
        int r2 = r(str);
        if (i2 > r2) {
            i2 = r2;
        }
        while (-1 < i2) {
            if (C0754a.a(chars[0], str.charAt(i2), false)) {
                return i2;
            }
            i2--;
        }
        return -1;
    }
}
