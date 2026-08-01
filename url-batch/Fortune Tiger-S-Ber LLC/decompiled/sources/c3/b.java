package c3;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1015a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f1016b = new b();
    public static final b c = new b();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.f1031d.put(str, fVar);
        return fVar;
    }

    public static String b(String str, int i4, int i5, String str2, int i6) {
        int i7 = (i6 & 1) != 0 ? 0 : i4;
        int length = (i6 & 2) != 0 ? str.length() : i5;
        boolean z3 = (i6 & 8) == 0;
        boolean z4 = (i6 & 16) == 0;
        boolean z5 = (i6 & 32) == 0;
        boolean z6 = (i6 & 64) == 0;
        u2.c.e(str, "<this>");
        int i8 = i7;
        while (i8 < length) {
            int codePointAt = str.codePointAt(i8);
            int i9 = 128;
            int i10 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z6) || b3.e.c0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z3 || (z4 && !d(str, i8, length)))) || (codePointAt == 43 && z5)))) {
                p3.f fVar = new p3.f();
                fVar.C(str, i7, i8);
                p3.f fVar2 = null;
                while (i8 < length) {
                    int codePointAt2 = str.codePointAt(i8);
                    if (!z3 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z5) {
                            fVar.B(z3 ? "+" : "%2B");
                        } else if (codePointAt2 < i10 || codePointAt2 == 127 || ((codePointAt2 >= i9 && !z6) || b3.e.c0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z3 || (z4 && !d(str, i8, length)))))) {
                            if (fVar2 == null) {
                                fVar2 = new p3.f();
                            }
                            fVar2.D(codePointAt2);
                            while (!fVar2.n()) {
                                byte readByte = fVar2.readByte();
                                fVar.x(37);
                                char[] cArr = m.f1075j;
                                fVar.x(cArr[((readByte & 255) >> 4) & 15]);
                                fVar.x(cArr[readByte & 15]);
                            }
                        } else {
                            fVar.D(codePointAt2);
                        }
                    }
                    i8 += Character.charCount(codePointAt2);
                    i9 = 128;
                    i10 = 32;
                }
                return fVar.r(fVar.g, b3.a.f967a);
            }
            i8 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i7, length);
        u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i4, int i5) {
        int i6 = i4 + 2;
        return i6 < i5 && str.charAt(i4) == '%' && d3.c.o(str.charAt(i4 + 1)) != -1 && d3.c.o(str.charAt(i6)) != -1;
    }

    public static String e(String str, int i4, int i5, int i6) {
        int i7;
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        boolean z3 = (i6 & 4) == 0;
        u2.c.e(str, "<this>");
        int i8 = i4;
        while (i8 < i5) {
            char charAt = str.charAt(i8);
            if (charAt == '%' || (charAt == '+' && z3)) {
                p3.f fVar = new p3.f();
                fVar.C(str, i4, i8);
                while (i8 < i5) {
                    int codePointAt = str.codePointAt(i8);
                    if (codePointAt != 37 || (i7 = i8 + 2) >= i5) {
                        if (codePointAt == 43 && z3) {
                            fVar.x(32);
                            i8++;
                        }
                        fVar.D(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    } else {
                        int o4 = d3.c.o(str.charAt(i8 + 1));
                        int o5 = d3.c.o(str.charAt(i7));
                        if (o4 != -1 && o5 != -1) {
                            fVar.x((o4 << 4) + o5);
                            i8 = Character.charCount(codePointAt) + i7;
                        }
                        fVar.D(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    }
                }
                return fVar.r(fVar.g, b3.a.f967a);
            }
            i8++;
        }
        String substring = str.substring(i4, i5);
        u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 <= str.length()) {
            int g02 = b3.e.g0(str, '&', i4, 4);
            if (g02 == -1) {
                g02 = str.length();
            }
            int g03 = b3.e.g0(str, '=', i4, 4);
            if (g03 == -1 || g03 > g02) {
                String substring = str.substring(i4, g02);
                u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i4, g03);
                u2.c.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(g03 + 1, g02);
                u2.c.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i4 = g02 + 1;
        }
        return arrayList;
    }

    public synchronized f c(String str) {
        f fVar;
        String str2;
        try {
            u2.c.e(str, "javaName");
            LinkedHashMap linkedHashMap = f.f1031d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (b3.m.b0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    u2.c.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (b3.m.b0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    u2.c.d(substring2, "this as java.lang.String).substring(startIndex)");
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
