package i1;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0167b f2641a = new C0167b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0167b f2642b = new C0167b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0167b f2643c = new C0167b();

    public static final h a(C0167b c0167b, String str) {
        h hVar = new h(str);
        h.f2661d.put(str, hVar);
        return hVar;
    }

    public static String b(String str, int i, int i2, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z6 = (i3 & 8) != 0 ? false : z2;
        boolean z7 = (i3 & 16) != 0 ? false : z3;
        boolean z8 = (i3 & 32) != 0 ? false : z4;
        boolean z9 = (i3 & 64) == 0 ? z5 : false;
        X0.f.e(str, "<this>");
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 32;
            int i7 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || e1.d.A0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !d(str, i5, length)))) || (codePointAt == 43 && z8)))) {
                v1.f fVar = new v1.f();
                fVar.y(str, i4, i5);
                v1.f fVar2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z8) {
                            fVar.x(z6 ? "+" : "%2B");
                        } else if (codePointAt2 < i6 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z9) || e1.d.A0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z6 || (z7 && !d(str, i5, length)))))) {
                            if (fVar2 == null) {
                                fVar2 = new v1.f();
                            }
                            fVar2.z(codePointAt2);
                            while (!fVar2.g()) {
                                byte i8 = fVar2.i();
                                fVar.u(37);
                                char[] cArr = p.f2711j;
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
                return fVar.n(fVar.f4484b, e1.a.f2371a);
            }
            i5 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i4, length);
        X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && j1.b.p(str.charAt(i + 1)) != -1 && j1.b.p(str.charAt(i3)) != -1;
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
        X0.f.e(str, "<this>");
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z2)) {
                v1.f fVar = new v1.f();
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
                        int p2 = j1.b.p(str.charAt(i5 + 1));
                        int p3 = j1.b.p(str.charAt(i4));
                        if (p2 != -1 && p3 != -1) {
                            fVar.u((p2 << 4) + p3);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        fVar.z(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return fVar.n(fVar.f4484b, e1.a.f2371a);
            }
            i5++;
        }
        String substring = str.substring(i, i2);
        X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int E02 = e1.d.E0(str, '&', i, false, 4);
            if (E02 == -1) {
                E02 = str.length();
            }
            int E03 = e1.d.E0(str, '=', i, false, 4);
            if (E03 == -1 || E03 > E02) {
                String substring = str.substring(i, E02);
                X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, E03);
                X0.f.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(E03 + 1, E02);
                X0.f.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i = E02 + 1;
        }
        return arrayList;
    }

    public synchronized h c(String str) {
        h hVar;
        String str2;
        try {
            X0.f.e(str, "javaName");
            LinkedHashMap linkedHashMap = h.f2661d;
            hVar = (h) linkedHashMap.get(str);
            if (hVar == null) {
                if (e1.l.z0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    X0.f.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (e1.l.z0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    X0.f.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                hVar = (h) linkedHashMap.get(str2);
                if (hVar == null) {
                    hVar = new h(str);
                }
                linkedHashMap.put(str, hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }
}
