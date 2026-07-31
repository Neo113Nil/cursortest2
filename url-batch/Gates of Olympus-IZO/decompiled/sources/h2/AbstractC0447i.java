package h2;

import F.Z;
import H2.AbstractC0080b;
import M1.y;
import a.AbstractC0157a;
import e2.AbstractC0381e;
import e2.C0380d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: h2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0447i extends AbstractC0454p {
    public static String A0(String str, String str2) {
        if (!n0(str, str2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - str2.length());
        Z1.i.e(substring, "substring(...)");
        return substring;
    }

    public static final void B0(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("Limit must be non-negative, but was ", i3).toString());
        }
    }

    public static List C0(String str, char[] cArr) {
        Z1.i.f(str, "<this>");
        boolean z3 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            B0(0);
            int p02 = p0(str, valueOf, 0, false);
            if (p02 == -1) {
                return AbstractC0157a.M(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            do {
                arrayList.add(str.subSequence(i3, p02).toString());
                i3 = valueOf.length() + p02;
                p02 = p0(str, valueOf, i3, false);
            } while (p02 != -1);
            arrayList.add(str.subSequence(i3, str.length()).toString());
            return arrayList;
        }
        B0(0);
        y yVar = new y(1, new C0441c(str, 0, 0, new C0455q(0, cArr, z3)));
        ArrayList arrayList2 = new ArrayList(M1.n.g0(yVar, 10));
        Iterator it = yVar.iterator();
        while (true) {
            C0440b c0440b = (C0440b) it;
            if (!c0440b.hasNext()) {
                return arrayList2;
            }
            C0380d c0380d = (C0380d) c0440b.next();
            Z1.i.f(c0380d, "range");
            arrayList2.add(str.subSequence(c0380d.f4768d, c0380d.f4769e + 1).toString());
        }
    }

    public static String D0(String str, char c3, String str2) {
        Z1.i.f(str2, "missingDelimiterValue");
        int q0 = q0(str, c3, 0, false, 6);
        if (q0 == -1) {
            return str2;
        }
        String substring = str.substring(q0 + 1, str.length());
        Z1.i.e(substring, "substring(...)");
        return substring;
    }

    public static String E0(String str, String str2) {
        Z1.i.f(str2, "delimiter");
        int r02 = r0(str, str2, 0, false, 6);
        if (r02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + r02, str.length());
        Z1.i.e(substring, "substring(...)");
        return substring;
    }

    public static String F0(String str, String str2) {
        Z1.i.f(str, "<this>");
        Z1.i.f(str2, "missingDelimiterValue");
        int v0 = v0(str, '.', 0, 6);
        if (v0 == -1) {
            return str2;
        }
        String substring = str.substring(v0 + 1, str.length());
        Z1.i.e(substring, "substring(...)");
        return substring;
    }

    public static String G0(String str, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.i("Requested character count ", i3, " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String substring = str.substring(0, i3);
        Z1.i.e(substring, "substring(...)");
        return substring;
    }

    public static CharSequence H0(String str) {
        Z1.i.f(str, "<this>");
        int length = str.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            boolean F3 = AbstractC0381e.F(str.charAt(!z3 ? i3 : length));
            if (z3) {
                if (!F3) {
                    break;
                }
                length--;
            } else if (F3) {
                i3++;
            } else {
                z3 = true;
            }
        }
        return str.subSequence(i3, length + 1);
    }

    public static boolean k0(CharSequence charSequence, char c3) {
        Z1.i.f(charSequence, "<this>");
        return q0(charSequence, c3, 0, false, 2) >= 0;
    }

    public static boolean l0(CharSequence charSequence, String str) {
        Z1.i.f(charSequence, "<this>");
        Z1.i.f(str, "other");
        return r0(charSequence, str, 0, false, 2) >= 0;
    }

    public static String m0(String str, int i3) {
        Z1.i.f(str, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.i("Requested character count ", i3, " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String substring = str.substring(i3);
        Z1.i.e(substring, "substring(...)");
        return substring;
    }

    public static boolean n0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? AbstractC0454p.c0((String) charSequence, str, false) : y0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int o0(CharSequence charSequence) {
        Z1.i.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int p0(CharSequence charSequence, String str, int i3, boolean z3) {
        Z1.i.f(charSequence, "<this>");
        Z1.i.f(str, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i3);
        }
        int length = charSequence.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C0380d c0380d = new C0380d(i3, length, 1);
        boolean z4 = charSequence instanceof String;
        int i4 = c0380d.f4770f;
        int i5 = c0380d.f4769e;
        int i6 = c0380d.f4768d;
        if (!z4 || str == null) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!y0(str, 0, charSequence, i6, str.length(), z3)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
            return -1;
        }
        if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!AbstractC0454p.f0(str, 0, (String) charSequence, i6, str.length(), z3)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static int q0(CharSequence charSequence, char c3, int i3, boolean z3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        Z1.i.f(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? s0(charSequence, new char[]{c3}, i3, z3) : ((String) charSequence).indexOf(c3, i3);
    }

    public static /* synthetic */ int r0(CharSequence charSequence, String str, int i3, boolean z3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return p0(charSequence, str, i3, z3);
    }

    public static final int s0(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        Z1.i.f(charSequence, "<this>");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int o02 = o0(charSequence);
        if (i3 > o02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i3);
            for (char c3 : cArr) {
                if (AbstractC0381e.z(c3, charAt, z3)) {
                    return i3;
                }
            }
            if (i3 == o02) {
                return -1;
            }
            i3++;
        }
    }

    public static boolean t0(CharSequence charSequence) {
        Z1.i.f(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (!AbstractC0381e.F(charSequence.charAt(i3))) {
                return false;
            }
        }
        return true;
    }

    public static char u0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(o0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int v0(String str, char c3, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = o0(str);
        }
        Z1.i.f(str, "<this>");
        return str.lastIndexOf(c3, i3);
    }

    public static int w0(String str, int i3, String str2) {
        int o02 = (i3 & 2) != 0 ? o0(str) : 0;
        Z1.i.f(str, "<this>");
        Z1.i.f(str2, "string");
        return str.lastIndexOf(str2, o02);
    }

    public static final List x0(String str) {
        Z1.i.f(str, "<this>");
        B0(0);
        return g2.h.e0(new g2.l(new C0441c(str, 0, 0, new C0455q(1, M1.k.T(new String[]{"\r\n", "\n", "\r"}), false)), new Z(str, 1), 1));
    }

    public static final boolean y0(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5, boolean z3) {
        Z1.i.f(charSequence, "<this>");
        Z1.i.f(charSequence2, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > charSequence2.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!AbstractC0381e.z(charSequence.charAt(i3 + i6), charSequence2.charAt(i4 + i6), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String z0(String str, String str2) {
        Z1.i.f(str, "<this>");
        if (!AbstractC0454p.i0(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        Z1.i.e(substring, "substring(...)");
        return substring;
    }
}
