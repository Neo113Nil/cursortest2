package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mf0 extends uf0 {
    public static List A(String str) {
        yx yxVar = new yx(str);
        if (!yxVar.hasNext()) {
            return wm.f;
        }
        Object next = yxVar.next();
        if (!yxVar.hasNext()) {
            return bi.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (yxVar.hasNext()) {
            arrayList.add(yxVar.next());
        }
        return arrayList;
    }

    public static String B(String str, String str2) {
        return uf0.r(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static List C(String str, char[] cArr) {
        int i = 0;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int u = u(str, valueOf, 0, false);
            if (u == -1) {
                return bi.K(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            do {
                arrayList.add(str.subSequence(i2, u).toString());
                i2 = valueOf.length() + u;
                u = u(str, valueOf, i2, false);
            } while (u != -1);
            arrayList.add(str.subSequence(i2, str.length()).toString());
            return arrayList;
        }
        zc0 zc0Var = new zc0(new ij(str, new vf0(cArr), i));
        ArrayList arrayList2 = new ArrayList(wc.g0(zc0Var));
        Iterator it = zc0Var.iterator();
        while (true) {
            hj hjVar = (hj) it;
            if (!hjVar.hasNext()) {
                return arrayList2;
            }
            jv jvVar = (jv) hjVar.next();
            jvVar.getClass();
            arrayList2.add(str.subSequence(jvVar.f, jvVar.g + 1).toString());
        }
    }

    public static String D(String str, int i) {
        if (i < 0) {
            s9.r(i, " is less than zero.", "Requested character count ");
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence E(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = str.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean s(CharSequence charSequence, char c) {
        charSequence.getClass();
        return w(charSequence, c, 0, 2) >= 0;
    }

    public static boolean t(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        if (charSequence2 instanceof String) {
            if (u(charSequence, (String) charSequence2, 0, false) >= 0) {
                return true;
            }
        } else if (v(charSequence, charSequence2, 0, charSequence.length(), false) >= 0) {
            return true;
        }
        return false;
    }

    public static final int u(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? v(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        boolean regionMatches;
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        if (i2 > length) {
            i2 = length;
        }
        jv jvVar = new jv(i, i2, 1);
        boolean z4 = charSequence instanceof String;
        int i3 = jvVar.h;
        int i4 = jvVar.g;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i3 <= 0 || i > i4) && (i3 >= 0 || i4 > i)) {
                return -1;
            }
            int i5 = i;
            while (true) {
                String str = (String) charSequence2;
                String str2 = (String) charSequence;
                int length2 = str.length();
                if (z) {
                    z3 = z;
                    regionMatches = str.regionMatches(z3, 0, str2, i5, length2);
                } else {
                    regionMatches = str.regionMatches(0, str2, i5, length2);
                    z3 = z;
                }
                if (regionMatches) {
                    return i5;
                }
                if (i5 == i4) {
                    return -1;
                }
                i5 += i3;
                z = z3;
            }
        } else {
            if ((i3 <= 0 || i > i4) && (i3 >= 0 || i4 > i)) {
                return -1;
            }
            while (true) {
                int length3 = charSequence2.length();
                charSequence2.getClass();
                charSequence.getClass();
                if (i >= 0 && charSequence2.length() - length3 >= 0 && i <= charSequence.length() - length3) {
                    for (int i6 = 0; i6 < length3; i6++) {
                        if (d50.o(charSequence2.charAt(0 + i6), charSequence.charAt(i + i6), z)) {
                        }
                    }
                    z2 = true;
                    if (!z2) {
                        return i;
                    }
                    if (i == i4) {
                        return -1;
                    }
                    i += i3;
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
    }

    public static int w(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? x(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static final int x(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(j7.c0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (d50.o(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean y(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int z(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = str.length() - 1;
        }
        return str.lastIndexOf(c, i);
    }
}
