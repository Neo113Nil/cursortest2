package w3;

import E.AbstractC0005f;
import a.AbstractC0124a;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import t3.C1443c;

/* renamed from: w3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1510g extends o {
    public static boolean b0(CharSequence charSequence, char c4) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return g0(charSequence, c4, 0, 2) >= 0;
    }

    public static boolean c0(CharSequence charSequence, String str) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return h0(charSequence, str, 0, 2) >= 0;
    }

    public static Character d0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static final int e0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int f0(CharSequence charSequence, String string, int i4, boolean z) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i4);
        }
        int length = charSequence.length();
        if (i4 < 0) {
            i4 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C1443c c1443c = new C1443c(i4, length, 1);
        boolean z4 = charSequence instanceof String;
        int i5 = c1443c.f15426c;
        int i6 = c1443c.f15425b;
        int i7 = c1443c.f15424a;
        if (!z4 || !(string instanceof String)) {
            boolean z5 = z;
            if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z6 = z5;
                z5 = z6;
                if (l0(string, 0, charSequence2, i7, string.length(), z6)) {
                    return i7;
                }
                if (i7 == i6) {
                    return -1;
                }
                i7 += i5;
                charSequence = charSequence2;
            }
        } else {
            if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
                return -1;
            }
            int i8 = i7;
            while (true) {
                String str = string;
                boolean z7 = z;
                if (o.X(0, i8, string.length(), str, (String) charSequence, z7)) {
                    return i8;
                }
                if (i8 == i6) {
                    return -1;
                }
                i8 += i5;
                string = str;
                z = z7;
            }
        }
    }

    public static int g0(CharSequence charSequence, char c4, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? i0(charSequence, new char[]{c4}, i4, false) : ((String) charSequence).indexOf(c4, i4);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return f0(charSequence, str, i4, false);
    }

    public static final int i0(CharSequence charSequence, char[] cArr, int i4, boolean z) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i4);
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int e02 = e0(charSequence);
        if (i4 > e02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i4);
            for (char c4 : cArr) {
                if (AbstractC0457a.p(c4, charAt, z)) {
                    return i4;
                }
            }
            if (i4 == e02) {
                return -1;
            }
            i4++;
        }
    }

    public static boolean j0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!AbstractC0457a.w(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static int k0(String str, char c4, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = e0(str);
        }
        kotlin.jvm.internal.i.e(str, "<this>");
        return str.lastIndexOf(c4, i4);
    }

    public static final boolean l0(CharSequence charSequence, int i4, CharSequence other, int i5, int i6, boolean z) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > other.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!AbstractC0457a.p(charSequence.charAt(i4 + i7), other.charAt(i5 + i7), z)) {
                return false;
            }
        }
        return true;
    }

    public static String m0(String str, String str2) {
        if (!o.a0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static final List n0(CharSequence charSequence, String str) {
        int f02 = f0(charSequence, str, 0, false);
        if (f02 == -1) {
            return AbstractC0124a.H(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, f02).toString());
            i4 = str.length() + f02;
            f02 = f0(charSequence, str, i4, false);
        } while (f02 != -1);
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public static List o0(String str, char[] cArr) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (cArr.length == 1) {
            return n0(str, String.valueOf(cArr[0]));
        }
        v3.m mVar = new v3.m(new C1506c(str, new p(0, cArr)));
        ArrayList arrayList = new ArrayList(d3.k.Y(mVar));
        Iterator it = mVar.iterator();
        while (true) {
            C1505b c1505b = (C1505b) it;
            if (!c1505b.hasNext()) {
                return arrayList;
            }
            C1443c range = (C1443c) c1505b.next();
            kotlin.jvm.internal.i.e(range, "range");
            arrayList.add(str.subSequence(range.f15424a, range.f15425b + 1).toString());
        }
    }

    public static String p0(String str, String delimiter) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        int h02 = h0(str, delimiter, 0, 6);
        if (h02 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + h02, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String q0(int i4, String str) {
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.k(i4, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i4 > length) {
            i4 = length;
        }
        String substring = str.substring(0, i4);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence r0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length() - 1;
        int i4 = 0;
        boolean z = false;
        while (i4 <= length) {
            boolean w4 = AbstractC0457a.w(str.charAt(!z ? i4 : length));
            if (z) {
                if (!w4) {
                    break;
                }
                length--;
            } else if (w4) {
                i4++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i4, length + 1);
    }
}
