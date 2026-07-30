package s7;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8539a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f8540b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f8541c = new b();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.f8561d.put(str, fVar);
        return fVar;
    }

    public static String b(String str, int i7, int i8, String str2, int i9) {
        int i10 = (i9 & 1) != 0 ? 0 : i7;
        int length = (i9 & 2) != 0 ? str.length() : i8;
        boolean z8 = (i9 & 8) == 0;
        boolean z9 = (i9 & 16) == 0;
        boolean z10 = (i9 & 32) == 0;
        boolean z11 = (i9 & 64) == 0;
        r6.k.f(str, "<this>");
        int i11 = i10;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            int i12 = 128;
            int i13 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z11) || z6.h.x(str2, (char) codePointAt) || ((codePointAt == 37 && (!z8 || (z9 && !d(i11, length, str)))) || (codePointAt == 43 && z10)))) {
                f8.f fVar = new f8.f();
                fVar.W(i10, i11, str);
                f8.f fVar2 = null;
                while (i11 < length) {
                    int codePointAt2 = str.codePointAt(i11);
                    if (!z8 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z10) {
                            fVar.X(z8 ? "+" : "%2B");
                        } else if (codePointAt2 < i13 || codePointAt2 == 127 || ((codePointAt2 >= i12 && !z11) || z6.h.x(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z8 || (z9 && !d(i11, length, str)))))) {
                            if (fVar2 == null) {
                                fVar2 = new f8.f();
                            }
                            fVar2.Y(codePointAt2);
                            while (!fVar2.c()) {
                                byte readByte = fVar2.readByte();
                                fVar.Q(37);
                                char[] cArr = l.f8607j;
                                fVar.Q(cArr[((readByte & 255) >> 4) & 15]);
                                fVar.Q(cArr[readByte & 15]);
                            }
                        } else {
                            fVar.Y(codePointAt2);
                        }
                    }
                    i11 += Character.charCount(codePointAt2);
                    i12 = 128;
                    i13 = 32;
                }
                return fVar.D(fVar.f3598g, z6.a.f10114a);
            }
            i11 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i10, length);
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i7, int i8, String str) {
        int i9 = i7 + 2;
        return i9 < i8 && str.charAt(i7) == '%' && t7.b.p(str.charAt(i7 + 1)) != -1 && t7.b.p(str.charAt(i9)) != -1;
    }

    public static String e(String str, int i7, int i8, int i9) {
        int i10;
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        boolean z8 = (i9 & 4) == 0;
        r6.k.f(str, "<this>");
        int i11 = i7;
        while (i11 < i8) {
            char charAt = str.charAt(i11);
            if (charAt == '%' || (charAt == '+' && z8)) {
                f8.f fVar = new f8.f();
                fVar.W(i7, i11, str);
                while (i11 < i8) {
                    int codePointAt = str.codePointAt(i11);
                    if (codePointAt != 37 || (i10 = i11 + 2) >= i8) {
                        if (codePointAt == 43 && z8) {
                            fVar.Q(32);
                            i11++;
                        }
                        fVar.Y(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    } else {
                        int p6 = t7.b.p(str.charAt(i11 + 1));
                        int p8 = t7.b.p(str.charAt(i10));
                        if (p6 != -1 && p8 != -1) {
                            fVar.Q((p6 << 4) + p8);
                            i11 = Character.charCount(codePointAt) + i10;
                        }
                        fVar.Y(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    }
                }
                return fVar.D(fVar.f3598g, z6.a.f10114a);
            }
            i11++;
        }
        String substring = str.substring(i7, i8);
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int D = z6.h.D(str, '&', i7, 4);
            if (D == -1) {
                D = str.length();
            }
            int D2 = z6.h.D(str, '=', i7, 4);
            if (D2 == -1 || D2 > D) {
                String substring = str.substring(i7, D);
                r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i7, D2);
                r6.k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(D2 + 1, D);
                r6.k.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i7 = D + 1;
        }
        return arrayList;
    }

    public synchronized f c(String str) {
        f fVar;
        String str2;
        try {
            r6.k.f(str, "javaName");
            LinkedHashMap linkedHashMap = f.f8561d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (z6.o.v(str, "TLS_")) {
                    String substring = str.substring(4);
                    r6.k.e(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (z6.o.v(str, "SSL_")) {
                    String substring2 = str.substring(4);
                    r6.k.e(substring2, "this as java.lang.String).substring(startIndex)");
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
