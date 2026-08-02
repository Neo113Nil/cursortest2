package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksp {
    private ksp() {
    }

    public static void a(String str) {
        kov kovVar = new kov(a.Z(str, "lateinit property ", " has not been initialized"));
        d(kovVar, ksp.class.getName());
        throw kovVar;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(int i) {
        if (i < 32) {
            return -1;
        }
        return i != 32 ? 1 : 0;
    }

    static void d(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void e(Appendable appendable, Object obj, krt krtVar) {
        if (krtVar != null) {
            appendable.append((CharSequence) krtVar.a(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static String f(String str) {
        int i;
        Comparable comparable;
        List l = l(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (!n((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ixc.w(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!x(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        l.size();
        krt y = y();
        int size = l.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : l) {
            int i2 = i + 1;
            if (i < 0) {
                ixc.d();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == size) && n(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (intValue < 0) {
                    throw new IllegalArgumentException(a.ai(intValue, "Requested character count ", " is less than zero."));
                }
                String substring = str3.substring(ksl.g(intValue, str3.length()));
                substring.getClass();
                String str4 = (String) y.a(substring);
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        ixc.x(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static boolean g(String str, String str2, boolean z) {
        if (str == null) {
            return false;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static int h(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int i(CharSequence charSequence, String str, int i, boolean z) {
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        kth kthVar = new kth(ksl.f(i, 0), ksl.g(charSequence.length(), charSequence.length()));
        if (charSequence instanceof String) {
            int i2 = kthVar.a;
            int i3 = kthVar.b;
            if (i2 > i3) {
                return -1;
            }
            while (!w(str, (String) charSequence, i2, str.length(), z)) {
                if (i2 == i3) {
                    return -1;
                }
                i2++;
            }
            return i2;
        }
        int i4 = kthVar.a;
        int i5 = kthVar.b;
        if (i4 > i5) {
            return -1;
        }
        while (!p(str, charSequence, i4, str.length(), z)) {
            if (i4 == i5) {
                return -1;
            }
            i4++;
        }
        return i4;
    }

    public static CharSequence j(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean x = x(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!x) {
                    break;
                }
                length--;
            } else if (x) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String k(String str, String str2, String str3) {
        int i = i(str, str2, 0, false);
        if (i == -1) {
            return str3;
        }
        String substring = str.substring(i + str2.length(), str.length());
        substring.getClass();
        return substring;
    }

    public static List l(CharSequence charSequence) {
        return ksl.e(new yt(charSequence, 4));
    }

    public static boolean m(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        return i(charSequence, (String) charSequence2, 0, z) >= 0;
    }

    public static boolean n(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!x(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String o(String str) {
        int i = 0;
        ktz ktzVar = new ktz((ktu) new yt(str, 4), (krt) new koy(2), 0);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        kty ktyVar = new kty(ktzVar);
        while (ktyVar.hasNext()) {
            Object next = ktyVar.next();
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            e(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static boolean p(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        charSequence.getClass();
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            char charAt = charSequence.charAt(i3);
            char charAt2 = charSequence2.charAt(i + i3);
            if (charAt != charAt2 && (!z || ((upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String q(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static String r(String str, String str2, String str3) {
        int i = i(str, str2, 0, false);
        if (i < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, i);
            sb.append(str3);
            i2 = i + length;
            if (i >= str.length()) {
                break;
            }
            i = i(str, str2, i2, false);
        } while (i > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean s(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static String t(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(47, h(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static String u(String str) {
        str.getClass();
        String substring = str.substring(0, ksl.g(127, str.length()));
        substring.getClass();
        return substring;
    }

    public static String v(String str) {
        String str2;
        if (n("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List l = l(str);
        l.size();
        krt y = y();
        int size = l.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                ixc.d();
            }
            String str3 = (String) obj;
            String str4 = null;
            if ((i == 0 || i == size) && n(str3)) {
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!x(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    str3.getClass();
                    if (str3.startsWith("|", i3)) {
                        str3.getClass();
                        str4 = str3.substring(i3 + 1);
                        str4.getClass();
                    }
                }
                if (str4 != null && (str2 = (String) y.a(str4)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(str.length());
        ixc.x(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static boolean w(String str, String str2, int i, int i2, boolean z) {
        str.getClass();
        return !z ? str.regionMatches(0, str2, i, i2) : str.regionMatches(true, 0, str2, i, i2);
    }

    public static final boolean x(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    private static krt y() {
        return "".length() == 0 ? new ghz(12) : new koy(3, (byte[]) null);
    }
}
