package e1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean A0(CharSequence charSequence, char c2) {
        X0.f.e(charSequence, "<this>");
        return E0(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean B0(CharSequence charSequence, String str) {
        X0.f.e(charSequence, "<this>");
        X0.f.e(str, "other");
        return F0(charSequence, str, 0, false, 2) >= 0;
    }

    public static final int C0(CharSequence charSequence) {
        X0.f.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int D0(CharSequence charSequence, String str, int i, boolean z2) {
        X0.f.e(charSequence, "<this>");
        X0.f.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        b1.c cVar = new b1.c(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = cVar.f1640c;
        int i3 = cVar.f1639b;
        if (!z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                while (!J0(str, 0, charSequence, i, str.length(), z2)) {
                    if (i != i3) {
                        i += i2;
                    }
                }
                return i;
            }
            return -1;
        }
        if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
            while (!l.w0(0, r4, str.length(), str, (String) charSequence, z2)) {
                if (i != i3) {
                    i += i2;
                }
            }
            return i;
        }
        return -1;
    }

    public static int E0(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        X0.f.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? G0(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int F0(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return D0(charSequence, str, i, z2);
    }

    public static final int G0(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        X0.f.e(charSequence, "<this>");
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
        int C0 = C0(charSequence);
        if (i > C0) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (q1.d.v(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == C0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean H0(String str) {
        X0.f.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int I0(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = C0(str);
        }
        X0.f.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean J0(String str, int i, CharSequence charSequence, int i2, int i3, boolean z2) {
        X0.f.e(str, "<this>");
        X0.f.e(charSequence, "other");
        if (i2 < 0 || i < 0 || i > str.length() - i3 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!q1.d.v(str.charAt(i + i4), charSequence.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String K0(String str, String str2) {
        if (!l.z0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        X0.f.d(substring, "substring(...)");
        return substring;
    }

    public static final void L0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(X0.e.d("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List M0(String str, char[] cArr) {
        X0.f.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            L0(0);
            int D02 = D0(str, valueOf, 0, false);
            if (D02 == -1) {
                return q1.d.M(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, D02).toString());
                i = valueOf.length() + D02;
                D02 = D0(str, valueOf, i, false);
            } while (D02 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        L0(0);
        d1.f fVar = new d1.f(new c(str, 0, 0, new m(cArr, z2, 0)));
        ArrayList arrayList2 = new ArrayList(O0.j.c0(fVar));
        Iterator it = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            b1.c cVar = (b1.c) bVar.next();
            X0.f.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f1638a, cVar.f1639b + 1).toString());
        }
    }

    public static String N0(String str) {
        X0.f.e(str, "<this>");
        X0.f.e(str, "missingDelimiterValue");
        int I02 = I0(str, '.', 0, 6);
        if (I02 == -1) {
            return str;
        }
        String substring = str.substring(I02 + 1, str.length());
        X0.f.d(substring, "substring(...)");
        return substring;
    }

    public static String O0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        X0.f.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence P0(String str) {
        X0.f.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            char charAt = str.charAt(!z2 ? i : length);
            boolean z3 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
