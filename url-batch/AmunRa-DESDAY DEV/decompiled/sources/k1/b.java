package k1;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2768a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f2769b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f2770c = new b();

    public static final g a(b bVar, String str) {
        g gVar = new g(str);
        g.d.put(str, gVar);
        return gVar;
    }

    public static String b(String str, int i, int i2, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z6 = (i3 & 8) != 0 ? false : z2;
        boolean z7 = (i3 & 16) != 0 ? false : z3;
        boolean z8 = (i3 & 32) != 0 ? false : z4;
        boolean z9 = (i3 & 64) == 0 ? z5 : false;
        Z0.d.e(str, "<this>");
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 32;
            int i7 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || g1.d.t0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !d(str, i5, length)))) || (codePointAt == 43 && z8)))) {
                x1.f fVar = new x1.f();
                fVar.y(str, i4, i5);
                x1.f fVar2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z8) {
                            fVar.x(z6 ? "+" : "%2B");
                        } else if (codePointAt2 < i6 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z9) || g1.d.t0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z6 || (z7 && !d(str, i5, length)))))) {
                            if (fVar2 == null) {
                                fVar2 = new x1.f();
                            }
                            fVar2.z(codePointAt2);
                            while (!fVar2.f()) {
                                byte i8 = fVar2.i();
                                fVar.u(37);
                                char[] cArr = n.f2830j;
                                fVar.u(cArr[((i8 & 255) >> 4) & 15]);
                                fVar.u(cArr[i8 & 15]);
                            }
                        } else {
                            fVar.z(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 32;
                    i7 = 128;
                }
                return fVar.n(fVar.f4236b, g1.a.f2438a);
            }
            i5 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i4, length);
        Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && l1.b.p(str.charAt(i + 1)) != -1 && l1.b.p(str.charAt(i3)) != -1;
    }

    public static String e(String str, int i, int i2, boolean z2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        Z0.d.e(str, "<this>");
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z2)) {
                x1.f fVar = new x1.f();
                fVar.y(str, i, i5);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z2) {
                            fVar.u(32);
                            i5++;
                        }
                        fVar.z(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int p2 = l1.b.p(str.charAt(i5 + 1));
                        int p3 = l1.b.p(str.charAt(i4));
                        if (p2 != -1 && p3 != -1) {
                            fVar.u((p2 << 4) + p3);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        fVar.z(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return fVar.n(fVar.f4236b, g1.a.f2438a);
            }
            i5++;
        }
        String substring = str.substring(i, i2);
        Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int x02 = g1.d.x0(str, '&', i, false, 4);
            if (x02 == -1) {
                x02 = str.length();
            }
            int x03 = g1.d.x0(str, '=', i, false, 4);
            if (x03 == -1 || x03 > x02) {
                String substring = str.substring(i, x02);
                Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, x03);
                Z0.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(x03 + 1, x02);
                Z0.d.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i = x02 + 1;
        }
        return arrayList;
    }

    public synchronized g c(String str) {
        g gVar;
        String str2;
        try {
            Z0.d.e(str, "javaName");
            LinkedHashMap linkedHashMap = g.d;
            gVar = (g) linkedHashMap.get(str);
            if (gVar == null) {
                if (g1.l.s0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    Z0.d.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (g1.l.s0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    Z0.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                gVar = (g) linkedHashMap.get(str2);
                if (gVar == null) {
                    gVar = new g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}
