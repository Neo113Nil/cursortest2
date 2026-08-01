package g1;

import X.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean A0(String str) {
        Z0.d.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int B0(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = v0(str);
        }
        Z0.d.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean C0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z2) {
        Z0.d.e(charSequence, "<this>");
        Z0.d.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!s1.l.x(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String D0(String str, String str2) {
        if (!l.s0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        Z0.d.d(substring, "substring(...)");
        return substring;
    }

    public static final void E0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(V.d("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List F0(String str, char[] cArr) {
        Z0.d.e(str, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            E0(0);
            int w02 = w0(str, valueOf, 0, false);
            if (w02 == -1) {
                return s1.l.K(str.toString());
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
        E0(0);
        f1.f fVar = new f1.f(new c(str, 0, 0, new m(cArr, false, 0)));
        ArrayList arrayList2 = new ArrayList(R0.j.m0(fVar));
        Iterator it = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            d1.c cVar = (d1.c) bVar.next();
            Z0.d.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f1982a, cVar.f1983b + 1).toString());
        }
    }

    public static String G0(String str) {
        Z0.d.e(str, "<this>");
        Z0.d.e(str, "missingDelimiterValue");
        int B02 = B0(str, '.', 0, 6);
        if (B02 == -1) {
            return str;
        }
        String substring = str.substring(B02 + 1, str.length());
        Z0.d.d(substring, "substring(...)");
        return substring;
    }

    public static String H0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        Z0.d.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence I0(String str) {
        Z0.d.e(str, "<this>");
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

    public static boolean t0(CharSequence charSequence, char c2) {
        Z0.d.e(charSequence, "<this>");
        return x0(charSequence, c2, 0, false, 2) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean u0(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        Z0.d.e(charSequence, "<this>");
        boolean z2 = charSequence2 instanceof String;
        if (!z2) {
            int length = charSequence.length();
            int length2 = charSequence.length();
            if (length > length2) {
                length = length2;
            }
            d1.c cVar = new d1.c(0, length, 1);
            boolean z3 = charSequence instanceof String;
            int i2 = cVar.f1984c;
            int i3 = cVar.f1983b;
            if (z3 && z2) {
                if ((i2 > 0 && i3 >= 0) || (i2 < 0 && i3 <= 0)) {
                    i = 0;
                    while (!l.p0(0, i, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, false)) {
                        if (i != i3) {
                            i += i2;
                        }
                    }
                    if (i >= 0) {
                    }
                }
                i = -1;
                if (i >= 0) {
                }
            } else {
                if ((i2 > 0 && i3 >= 0) || (i2 < 0 && i3 <= 0)) {
                    i = 0;
                    while (!C0(charSequence2, 0, charSequence, i, charSequence2.length(), false)) {
                        if (i != i3) {
                            i += i2;
                        }
                    }
                    if (i >= 0) {
                        return true;
                    }
                }
                i = -1;
                if (i >= 0) {
                }
            }
        } else if (y0(charSequence, (String) charSequence2, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final int v0(CharSequence charSequence) {
        Z0.d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int w0(CharSequence charSequence, String str, int i, boolean z2) {
        Z0.d.e(charSequence, "<this>");
        Z0.d.e(str, "string");
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
        d1.c cVar = new d1.c(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = cVar.f1984c;
        int i3 = cVar.f1983b;
        if (!z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                while (!C0(str, 0, charSequence, i, str.length(), z2)) {
                    if (i != i3) {
                        i += i2;
                    }
                }
                return i;
            }
            return -1;
        }
        if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
            while (!l.p0(0, r4, str.length(), str, (String) charSequence, z2)) {
                if (i != i3) {
                    i += i2;
                }
            }
            return i;
        }
        return -1;
    }

    public static int x0(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        Z0.d.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? z0(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int y0(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return w0(charSequence, str, i, z2);
    }

    public static final int z0(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        Z0.d.e(charSequence, "<this>");
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
                if (s1.l.x(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == v02) {
                return -1;
            }
            i++;
        }
    }
}
