package i1;

import X.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    /* JADX WARN: Incorrect condition in loop: B:20:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int A0(CharSequence charSequence, String str, int i, boolean z2) {
        b1.d.e(charSequence, "<this>");
        b1.d.e(str, "string");
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
        f1.c cVar = new f1.c(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = cVar.f2298c;
        int i3 = cVar.f2297b;
        if (!z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                while (!G0(str, 0, charSequence, i, str.length(), z2)) {
                    if (i != i3) {
                        i += i2;
                    }
                }
                return i;
            }
            return -1;
        }
        if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
            while (!l.t0(0, r4, str.length(), str, (String) charSequence, z2)) {
                if (i != i3) {
                    i += i2;
                }
            }
            return i;
        }
        return -1;
    }

    public static int B0(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        b1.d.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? D0(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int C0(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return A0(charSequence, str, i, z2);
    }

    public static final int D0(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        b1.d.e(charSequence, "<this>");
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
        int z02 = z0(charSequence);
        if (i > z02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (u1.d.z(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == z02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean E0(String str) {
        b1.d.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int F0(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = z0(str);
        }
        b1.d.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean G0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z2) {
        b1.d.e(charSequence, "<this>");
        b1.d.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!u1.d.z(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String H0(String str, String str2) {
        if (!l.w0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        b1.d.d(substring, "substring(...)");
        return substring;
    }

    public static final void I0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(V.d("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List J0(String str, char[] cArr) {
        b1.d.e(str, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            I0(0);
            int A02 = A0(str, valueOf, 0, false);
            if (A02 == -1) {
                return u1.d.P(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, A02).toString());
                i = valueOf.length() + A02;
                A02 = A0(str, valueOf, i, false);
            } while (A02 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        I0(0);
        h1.f fVar = new h1.f(new c(str, 0, 0, new m(cArr, false, 0)));
        ArrayList arrayList2 = new ArrayList(T0.j.l0(fVar));
        Iterator it = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            f1.c cVar = (f1.c) bVar.next();
            b1.d.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f2296a, cVar.f2297b + 1).toString());
        }
    }

    public static String K0(String str) {
        b1.d.e(str, "<this>");
        b1.d.e(str, "missingDelimiterValue");
        int F02 = F0(str, '.', 0, 6);
        if (F02 == -1) {
            return str;
        }
        String substring = str.substring(F02 + 1, str.length());
        b1.d.d(substring, "substring(...)");
        return substring;
    }

    public static String L0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        b1.d.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence M0(String str) {
        b1.d.e(str, "<this>");
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

    public static boolean x0(CharSequence charSequence, char c2) {
        b1.d.e(charSequence, "<this>");
        return B0(charSequence, c2, 0, false, 2) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y0(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        b1.d.e(charSequence, "<this>");
        boolean z2 = charSequence2 instanceof String;
        if (!z2) {
            int length = charSequence.length();
            int length2 = charSequence.length();
            if (length > length2) {
                length = length2;
            }
            f1.c cVar = new f1.c(0, length, 1);
            boolean z3 = charSequence instanceof String;
            int i2 = cVar.f2298c;
            int i3 = cVar.f2297b;
            if (z3 && z2) {
                if ((i2 > 0 && i3 >= 0) || (i2 < 0 && i3 <= 0)) {
                    i = 0;
                    while (!l.t0(0, i, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, false)) {
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
                    while (!G0(charSequence2, 0, charSequence, i, charSequence2.length(), false)) {
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
        } else if (C0(charSequence, (String) charSequence2, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final int z0(CharSequence charSequence) {
        b1.d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }
}
