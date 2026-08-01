package p1;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3302a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f3303b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f3304c = new b();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.d.put(str, fVar);
        return fVar;
    }

    public static String b(String str, int i, int i2, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z6 = (i3 & 8) != 0 ? false : z2;
        boolean z7 = (i3 & 16) != 0 ? false : z3;
        boolean z8 = (i3 & 32) != 0 ? false : z4;
        boolean z9 = (i3 & 64) == 0 ? z5 : false;
        e1.d.e(str, "<this>");
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 32;
            int i7 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || l1.d.v(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !d(str, i5, length)))) || (codePointAt == 43 && z8)))) {
                C1.f fVar = new C1.f();
                fVar.y(str, i4, i5);
                C1.f fVar2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z8) {
                            fVar.x(z6 ? "+" : "%2B");
                        } else if (codePointAt2 < i6 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z9) || l1.d.v(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z6 || (z7 && !d(str, i5, length)))))) {
                            if (fVar2 == null) {
                                fVar2 = new C1.f();
                            }
                            fVar2.z(codePointAt2);
                            while (!fVar2.g()) {
                                byte i8 = fVar2.i();
                                fVar.u(37);
                                char[] cArr = m.f3362j;
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
                return fVar.n(fVar.f182b, l1.a.f3159a);
            }
            i5 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i4, length);
        e1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && q1.b.p(str.charAt(i + 1)) != -1 && q1.b.p(str.charAt(i3)) != -1;
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
        e1.d.e(str, "<this>");
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z2)) {
                C1.f fVar = new C1.f();
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
                        int p2 = q1.b.p(str.charAt(i5 + 1));
                        int p3 = q1.b.p(str.charAt(i4));
                        if (p2 != -1 && p3 != -1) {
                            fVar.u((p2 << 4) + p3);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        fVar.z(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return fVar.n(fVar.f182b, l1.a.f3159a);
            }
            i5++;
        }
        String substring = str.substring(i, i2);
        e1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int z2 = l1.d.z(str, '&', i, false, 4);
            if (z2 == -1) {
                z2 = str.length();
            }
            int z3 = l1.d.z(str, '=', i, false, 4);
            if (z3 == -1 || z3 > z2) {
                String substring = str.substring(i, z2);
                e1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, z3);
                e1.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(z3 + 1, z2);
                e1.d.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i = z2 + 1;
        }
        return arrayList;
    }

    public synchronized f c(String str) {
        f fVar;
        String str2;
        try {
            e1.d.e(str, "javaName");
            LinkedHashMap linkedHashMap = f.d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (l1.l.u(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    e1.d.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (l1.l.u(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    e1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
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
