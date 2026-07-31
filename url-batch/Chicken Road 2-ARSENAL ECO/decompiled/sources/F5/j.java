package F5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l5.AbstractC0505i;
import l5.AbstractC0508l;
import m1.AbstractC0521b;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class j extends q {
    public static boolean L(CharSequence charSequence, String str, boolean z5) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return R(charSequence, str, 0, z5, 2) >= 0;
    }

    public static boolean M(CharSequence charSequence, char c7) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return Q(charSequence, c7, 0, 2) >= 0;
    }

    public static String N(String str, int i7) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(C1.c.g("Requested character count ", i7, " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String substring = str.substring(i7);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static final int O(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int P(CharSequence charSequence, String string, int i7, boolean z5) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z5 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i7);
        }
        int length = charSequence.length();
        if (i7 < 0) {
            i7 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C5.c cVar = new C5.c(i7, length, 1);
        boolean z6 = charSequence instanceof String;
        int i8 = cVar.f230h;
        int i9 = cVar.f229g;
        int i10 = cVar.f228f;
        if (!z6 || !(string instanceof String)) {
            boolean z7 = z5;
            if ((i8 <= 0 || i10 > i9) && (i8 >= 0 || i9 > i10)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z8 = z7;
                z7 = z8;
                if (X(string, 0, charSequence2, i10, string.length(), z8)) {
                    return i10;
                }
                if (i10 == i9) {
                    return -1;
                }
                i10 += i8;
                charSequence = charSequence2;
            }
        } else {
            if ((i8 <= 0 || i10 > i9) && (i8 >= 0 || i9 > i10)) {
                return -1;
            }
            int i11 = i10;
            while (true) {
                String str = string;
                boolean z9 = z5;
                if (q.E(0, i11, string.length(), str, (String) charSequence, z9)) {
                    return i11;
                }
                if (i11 == i9) {
                    return -1;
                }
                i11 += i8;
                string = str;
                z5 = z9;
            }
        }
    }

    public static int Q(CharSequence charSequence, char c7, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? S(charSequence, new char[]{c7}, i7, false) : ((String) charSequence).indexOf(c7, i7);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i7, boolean z5, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z5 = false;
        }
        return P(charSequence, str, i7, z5);
    }

    public static final int S(CharSequence charSequence, char[] cArr, int i7, boolean z5) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int O6 = O(charSequence);
        if (i7 > O6) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i7);
            for (char c7 : cArr) {
                if (AbstractC0521b.m(c7, charAt, z5)) {
                    return i7;
                }
            }
            if (i7 == O6) {
                return -1;
            }
            i7++;
        }
    }

    public static boolean T(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!AbstractC0521b.v(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static int U(String str, char c7, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = O(str);
        }
        return str.lastIndexOf(c7, i7);
    }

    public static int V(String str, int i7, String string) {
        int O6 = (i7 & 2) != 0 ? O(str) : 0;
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        return str.lastIndexOf(string, O6);
    }

    public static String W(String str, int i7) {
        CharSequence charSequence;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(C1.c.g("Desired length ", i7, " is less than zero."));
        }
        if (i7 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i7);
            int length = i7 - str.length();
            int i8 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean X(CharSequence charSequence, int i7, CharSequence other, int i8, int i9, boolean z5) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > other.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC0521b.m(charSequence.charAt(i7 + i10), other.charAt(i8 + i10), z5)) {
                return false;
            }
        }
        return true;
    }

    public static String Y(String str, String str2) {
        if (!q.I(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static final void Z(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(W4.o.c("Limit must be non-negative, but was ", i7).toString());
        }
    }

    public static final List a0(int i7, CharSequence charSequence, String str) {
        Z(i7);
        int P6 = P(charSequence, str, 0, false);
        if (P6 == -1 || i7 == 1) {
            return AbstractC0676f.n(charSequence.toString());
        }
        boolean z5 = i7 > 0;
        int i8 = 10;
        if (z5 && i7 <= 10) {
            i8 = i7;
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        do {
            arrayList.add(charSequence.subSequence(i9, P6).toString());
            i9 = str.length() + P6;
            if (z5 && arrayList.size() == i7 - 1) {
                break;
            }
            P6 = P(charSequence, str, i9, false);
        } while (P6 != -1);
        arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
        return arrayList;
    }

    public static List b0(CharSequence charSequence, String[] strArr, int i7) {
        int i8 = (i7 & 4) != 0 ? 0 : 2;
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return a0(i8, charSequence, str);
            }
        }
        Z(i8);
        E5.i iVar = new E5.i(0, new c(charSequence, i8, new r(0, AbstractC0505i.E(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC0508l.C(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            C5.c range = (C5.c) bVar.next();
            kotlin.jvm.internal.i.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f228f, range.f229g + 1).toString());
        }
    }

    public static List c0(String str, char[] cArr) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (cArr.length == 1) {
            return a0(0, str, String.valueOf(cArr[0]));
        }
        Z(0);
        E5.i iVar = new E5.i(0, new c(str, 0, new r(1, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC0508l.C(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            C5.c range = (C5.c) bVar.next();
            kotlin.jvm.internal.i.e(range, "range");
            arrayList.add(str.subSequence(range.f228f, range.f229g + 1).toString());
        }
    }

    public static boolean d0(String str, char c7) {
        return str.length() > 0 && AbstractC0521b.m(str.charAt(0), c7, false);
    }

    public static String e0(String str, String delimiter) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        int R6 = R(str, delimiter, 0, false, 6);
        if (R6 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + R6, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String f0(String str, int i7) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(C1.c.g("Requested character count ", i7, " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String substring = str.substring(0, i7);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String g0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length();
        String substring = str.substring(length - (8 > length ? length : 8));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence h0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean v5 = AbstractC0521b.v(str.charAt(!z5 ? i7 : length));
            if (z5) {
                if (!v5) {
                    break;
                }
                length--;
            } else if (v5) {
                i7++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i7, length + 1);
    }
}
