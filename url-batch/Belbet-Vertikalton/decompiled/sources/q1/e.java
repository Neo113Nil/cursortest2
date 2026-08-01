package q1;

import G1.AbstractC0001b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import n1.C0316a;

/* loaded from: classes.dex */
public abstract class e extends m {
    public static final int A0(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        j1.h.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int v02 = v0(charSequence);
        if (i > v02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (H1.d.x(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == v02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean B0(String str) {
        j1.h.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!H1.d.R(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int C0(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = v0(str);
        }
        j1.h.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final List D0(String str) {
        j1.h.e(str, "<this>");
        G0(0);
        return p1.e.h0(new p1.j(new c(str, 0, 0, new n(X0.j.l0(new String[]{"\r\n", "\n", "\r"}), false, 1)), new X0.a(1, str)));
    }

    public static final boolean E0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z2) {
        j1.h.e(charSequence, "<this>");
        j1.h.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!H1.d.x(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String F0(String str, String str2) {
        if (!m.s0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        j1.h.d(substring, "substring(...)");
        return substring;
    }

    public static final void G0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0001b.e("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List H0(String str, char[] cArr) {
        j1.h.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            G0(0);
            int w02 = w0(str, valueOf, 0, false);
            if (w02 == -1) {
                return H1.l.I(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, w02).toString());
                i = valueOf.length() + w02;
                w02 = w0(str, valueOf, i, false);
            } while (w02 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        G0(0);
        p1.h hVar = new p1.h(new c(str, 0, 0, new n(cArr, z2, 0)));
        ArrayList arrayList2 = new ArrayList(X0.m.m0(hVar));
        Iterator it = hVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            n1.c cVar = (n1.c) bVar.next();
            j1.h.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f3755a, cVar.f3756b + 1).toString());
        }
    }

    public static String I0(String str, String str2) {
        j1.h.e(str2, "delimiter");
        int z02 = z0(str, str2, 0, false, 6);
        if (z02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + z02, str.length());
        j1.h.d(substring, "substring(...)");
        return substring;
    }

    public static String J0(String str) {
        j1.h.e(str, "<this>");
        j1.h.e(str, "missingDelimiterValue");
        int C02 = C0(str, '.', 0, 6);
        if (C02 == -1) {
            return str;
        }
        String substring = str.substring(C02 + 1, str.length());
        j1.h.d(substring, "substring(...)");
        return substring;
    }

    public static String K0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        j1.h.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence L0(String str) {
        j1.h.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            boolean R2 = H1.d.R(str.charAt(!z2 ? i : length));
            if (z2) {
                if (!R2) {
                    break;
                }
                length--;
            } else if (R2) {
                i++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean t0(CharSequence charSequence, char c2) {
        j1.h.e(charSequence, "<this>");
        return y0(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean u0(CharSequence charSequence, CharSequence charSequence2) {
        j1.h.e(charSequence, "<this>");
        if (charSequence2 instanceof String) {
            if (z0(charSequence, (String) charSequence2, 0, false, 2) < 0) {
                return false;
            }
        } else if (x0(charSequence, charSequence2, 0, charSequence.length(), false, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int v0(CharSequence charSequence) {
        j1.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int w0(CharSequence charSequence, String str, int i, boolean z2) {
        j1.h.e(charSequence, "<this>");
        j1.h.e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? x0(charSequence, str, i, charSequence.length(), z2, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int x0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z2, boolean z3) {
        C0316a c0316a;
        if (z3) {
            int v02 = v0(charSequence);
            if (i > v02) {
                i = v02;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c0316a = new C0316a(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c0316a = new n1.c(i, i2, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i3 = c0316a.f3757c;
        int i4 = c0316a.f3756b;
        int i5 = c0316a.f3755a;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!m.p0(0, i5, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z2)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!E0(charSequence2, 0, charSequence, i5, charSequence2.length(), z2)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int y0(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        j1.h.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? A0(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int z0(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return w0(charSequence, str, i, z2);
    }
}
