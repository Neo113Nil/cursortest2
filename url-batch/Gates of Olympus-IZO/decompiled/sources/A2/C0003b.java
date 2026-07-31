package A2;

import N2.C0150f;
import h2.AbstractC0439a;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: A2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0003b f43a = new C0003b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0003b f44b = new C0003b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0003b f45c = new C0003b();

    public static final f a(C0003b c0003b, String str) {
        f fVar = new f(str);
        f.f65d.put(str, fVar);
        return fVar;
    }

    public static String b(String str, int i3, int i4, String str2, boolean z3, boolean z4, boolean z5, boolean z6, int i5) {
        int i6 = (i5 & 1) != 0 ? 0 : i3;
        int length = (i5 & 2) != 0 ? str.length() : i4;
        boolean z7 = (i5 & 8) != 0 ? false : z3;
        boolean z8 = (i5 & 16) != 0 ? false : z4;
        boolean z9 = (i5 & 32) != 0 ? false : z5;
        boolean z10 = (i5 & 64) == 0 ? z6 : false;
        Z1.i.f(str, "<this>");
        int i7 = i6;
        while (i7 < length) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 32;
            int i9 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z10) || AbstractC0447i.k0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z7 || (z8 && !d(i7, length, str)))) || (codePointAt == 43 && z9)))) {
                C0150f c0150f = new C0150f();
                c0150f.T(i6, i7, str);
                C0150f c0150f2 = null;
                while (i7 < length) {
                    int codePointAt2 = str.codePointAt(i7);
                    if (!z7 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z9) {
                            c0150f.U(z7 ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i9 && !z10) || AbstractC0447i.k0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z7 || (z8 && !d(i7, length, str)))))) {
                            if (c0150f2 == null) {
                                c0150f2 = new C0150f();
                            }
                            c0150f2.V(codePointAt2);
                            while (!c0150f2.a()) {
                                byte j3 = c0150f2.j();
                                c0150f.Q(37);
                                char[] cArr = q.f128j;
                                c0150f.Q(cArr[((j3 & 255) >> 4) & 15]);
                                c0150f.Q(cArr[j3 & 15]);
                            }
                        } else {
                            c0150f.V(codePointAt2);
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 32;
                    i9 = 128;
                }
                return c0150f.u(c0150f.f2929e, AbstractC0439a.f5056a);
            }
            i7 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i6, length);
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i3, int i4, String str) {
        int i5 = i3 + 2;
        return i5 < i4 && str.charAt(i3) == '%' && B2.c.q(str.charAt(i3 + 1)) != -1 && B2.c.q(str.charAt(i5)) != -1;
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
        Z1.i.f(str, "<this>");
        int i7 = i3;
        while (i7 < i4) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z3)) {
                C0150f c0150f = new C0150f();
                c0150f.T(i3, i7, str);
                while (i7 < i4) {
                    int codePointAt = str.codePointAt(i7);
                    if (codePointAt != 37 || (i6 = i7 + 2) >= i4) {
                        if (codePointAt == 43 && z3) {
                            c0150f.Q(32);
                            i7++;
                        }
                        c0150f.V(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    } else {
                        int q2 = B2.c.q(str.charAt(i7 + 1));
                        int q3 = B2.c.q(str.charAt(i6));
                        if (q2 != -1 && q3 != -1) {
                            c0150f.Q((q2 << 4) + q3);
                            i7 = Character.charCount(codePointAt) + i6;
                        }
                        c0150f.V(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    }
                }
                return c0150f.u(c0150f.f2929e, AbstractC0439a.f5056a);
            }
            i7++;
        }
        String substring = str.substring(i3, i4);
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 <= str.length()) {
            int q0 = AbstractC0447i.q0(str, '&', i3, false, 4);
            if (q0 == -1) {
                q0 = str.length();
            }
            int q02 = AbstractC0447i.q0(str, '=', i3, false, 4);
            if (q02 == -1 || q02 > q0) {
                String substring = str.substring(i3, q0);
                Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i3, q02);
                Z1.i.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(q02 + 1, q0);
                Z1.i.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i3 = q0 + 1;
        }
        return arrayList;
    }

    public synchronized f c(String str) {
        f fVar;
        String str2;
        try {
            Z1.i.f(str, "javaName");
            LinkedHashMap linkedHashMap = f.f65d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (AbstractC0454p.i0(str, "TLS_")) {
                    String substring = str.substring(4);
                    Z1.i.e(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (AbstractC0454p.i0(str, "SSL_")) {
                    String substring2 = str.substring(4);
                    Z1.i.e(substring2, "this as java.lang.String).substring(startIndex)");
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
