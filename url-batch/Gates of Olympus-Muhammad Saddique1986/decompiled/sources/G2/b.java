package G2;

import T2.C0231f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import n2.AbstractC0721a;
import n2.AbstractC0730j;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2136a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f2137b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f2138c = new b();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.f2158d.put(str, fVar);
        return fVar;
    }

    public static String b(String str, int i3, int i4, String str2, boolean z3, boolean z4, boolean z5, boolean z6, int i5) {
        int i6 = (i5 & 1) != 0 ? 0 : i3;
        int length = (i5 & 2) != 0 ? str.length() : i4;
        boolean z7 = (i5 & 8) != 0 ? false : z3;
        boolean z8 = (i5 & 16) != 0 ? false : z4;
        boolean z9 = (i5 & 32) != 0 ? false : z5;
        boolean z10 = (i5 & 64) == 0 ? z6 : false;
        f2.j.f(str, "<this>");
        int i7 = i6;
        while (i7 < length) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 32;
            int i9 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z10) || AbstractC0730j.B(str2, (char) codePointAt) || ((codePointAt == 37 && (!z7 || (z8 && !d(i7, length, str)))) || (codePointAt == 43 && z9)))) {
                C0231f c0231f = new C0231f();
                c0231f.H(i6, i7, str);
                C0231f c0231f2 = null;
                while (i7 < length) {
                    int codePointAt2 = str.codePointAt(i7);
                    if (!z7 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z9) {
                            c0231f.I(z7 ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i9 && !z10) || AbstractC0730j.B(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z7 || (z8 && !d(i7, length, str)))))) {
                            if (c0231f2 == null) {
                                c0231f2 = new C0231f();
                            }
                            c0231f2.J(codePointAt2);
                            while (!c0231f2.a()) {
                                byte h3 = c0231f2.h();
                                c0231f.E(37);
                                char[] cArr = n.f2214j;
                                c0231f.E(cArr[((h3 & 255) >> 4) & 15]);
                                c0231f.E(cArr[h3 & 15]);
                            }
                        } else {
                            c0231f.J(codePointAt2);
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 32;
                    i9 = 128;
                }
                return c0231f.u(c0231f.f4409e, AbstractC0721a.f7347a);
            }
            i7 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i6, length);
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i3, int i4, String str) {
        int i5 = i3 + 2;
        return i5 < i4 && str.charAt(i3) == '%' && H2.b.q(str.charAt(i3 + 1)) != -1 && H2.b.q(str.charAt(i5)) != -1;
    }

    public static String e(String str, int i3, int i4, boolean z3, int i5) {
        int i6;
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        f2.j.f(str, "<this>");
        int i7 = i3;
        while (i7 < i4) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z3)) {
                C0231f c0231f = new C0231f();
                c0231f.H(i3, i7, str);
                while (i7 < i4) {
                    int codePointAt = str.codePointAt(i7);
                    if (codePointAt != 37 || (i6 = i7 + 2) >= i4) {
                        if (codePointAt == 43 && z3) {
                            c0231f.E(32);
                            i7++;
                        }
                        c0231f.J(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    } else {
                        int q3 = H2.b.q(str.charAt(i7 + 1));
                        int q4 = H2.b.q(str.charAt(i6));
                        if (q3 != -1 && q4 != -1) {
                            c0231f.E((q3 << 4) + q4);
                            i7 = Character.charCount(codePointAt) + i6;
                        }
                        c0231f.J(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    }
                }
                return c0231f.u(c0231f.f4409e, AbstractC0721a.f7347a);
            }
            i7++;
        }
        String substring = str.substring(i3, i4);
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 <= str.length()) {
            int H3 = AbstractC0730j.H(str, '&', i3, false, 4);
            if (H3 == -1) {
                H3 = str.length();
            }
            int H4 = AbstractC0730j.H(str, '=', i3, false, 4);
            if (H4 == -1 || H4 > H3) {
                String substring = str.substring(i3, H3);
                f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i3, H4);
                f2.j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(H4 + 1, H3);
                f2.j.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i3 = H3 + 1;
        }
        return arrayList;
    }

    public synchronized f c(String str) {
        f fVar;
        String str2;
        try {
            f2.j.f(str, "javaName");
            LinkedHashMap linkedHashMap = f.f2158d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (AbstractC0737q.z(str, "TLS_")) {
                    String substring = str.substring(4);
                    f2.j.e(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (AbstractC0737q.z(str, "SSL_")) {
                    String substring2 = str.substring(4);
                    f2.j.e(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                fVar = (f) linkedHashMap.get(str2);
                if (fVar == null) {
                    fVar = new f(str);
                }
                linkedHashMap.put(str, fVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fVar;
    }
}
