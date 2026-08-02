package s2;

import a.AbstractC0129a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends l {
    public static boolean R(String str, String str2) {
        kotlin.jvm.internal.j.e(str, "<this>");
        return T(str, str2, 0, false) >= 0;
    }

    public static final int S(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int T(String str, String string, int i3, boolean z) {
        String str2;
        String str3;
        boolean z2;
        boolean regionMatches;
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(string, "string");
        if (!z) {
            return str.indexOf(string, i3);
        }
        int length = str.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i4 = new p2.c(i3, length, 1).f10219b;
        if (i3 > i4) {
            return -1;
        }
        int i5 = i3;
        while (true) {
            int length3 = string.length();
            if (z) {
                str2 = str;
                str3 = string;
                z2 = z;
                regionMatches = str3.regionMatches(z2, 0, str2, i5, length3);
            } else {
                regionMatches = string.regionMatches(0, str, i5, length3);
                str2 = str;
                str3 = string;
                z2 = z;
            }
            if (regionMatches) {
                return i5;
            }
            if (i5 == i4) {
                return -1;
            }
            i5++;
            string = str3;
            z = z2;
            str = str2;
        }
    }

    public static boolean U(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char charAt = charSequence.charAt(i3);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String V(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e(str, "<this>");
        int T2 = T(str, str2, 0, false);
        if (T2 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, T2);
            sb.append(str3);
            i4 = T2 + length;
            if (T2 >= str.length()) {
                break;
            }
            T2 = T(str, str2, T2 + i3, false);
        } while (T2 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static List W(String str, char[] cArr) {
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int T2 = T(str, valueOf, 0, false);
            if (T2 == -1) {
                return AbstractC0129a.r(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            do {
                arrayList.add(str.subSequence(i3, T2).toString());
                i3 = valueOf.length() + T2;
                T2 = T(str, valueOf, i3, false);
            } while (T2 != -1);
            arrayList.add(str.subSequence(i3, str.length()).toString());
            return arrayList;
        }
        r2.i iVar = new r2.i(new c(str, new m(cArr)));
        ArrayList arrayList2 = new ArrayList(c2.g.N(iVar));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            p2.c range = (p2.c) bVar.next();
            kotlin.jvm.internal.j.e(range, "range");
            arrayList2.add(str.subSequence(range.f10218a, range.f10219b + 1).toString());
        }
    }

    public static boolean X(String str, String prefix) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String Y(String str, String delimiter) {
        kotlin.jvm.internal.j.e(delimiter, "delimiter");
        int T2 = T(str, delimiter, 0, false);
        if (T2 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + T2, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }

    public static String Z(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46, S(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }
}
