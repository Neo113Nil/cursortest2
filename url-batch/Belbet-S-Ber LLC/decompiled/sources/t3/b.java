package t3;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3401a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f3402b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f3403c = new b();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.d.put(str, fVar);
        return fVar;
    }

    public static String b(String str, int i, int i4, String str2, int i5) {
        int i6 = (i5 & 1) != 0 ? 0 : i;
        int length = (i5 & 2) != 0 ? str.length() : i4;
        boolean z4 = (i5 & 8) == 0;
        boolean z5 = (i5 & 16) == 0;
        boolean z6 = (i5 & 32) == 0;
        boolean z7 = (i5 & 64) == 0;
        i3.d.e(str, "<this>");
        int i7 = i6;
        while (i7 < length) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 128;
            int i9 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z7) || p3.d.r0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z4 || (z5 && !d(str, i7, length)))) || (codePointAt == 43 && z6)))) {
                g4.f fVar = new g4.f();
                fVar.C(str, i6, i7);
                g4.f fVar2 = null;
                while (i7 < length) {
                    int codePointAt2 = str.codePointAt(i7);
                    if (!z4 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z6) {
                            fVar.B(z4 ? "+" : "%2B");
                        } else if (codePointAt2 < i9 || codePointAt2 == 127 || ((codePointAt2 >= i8 && !z7) || p3.d.r0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z4 || (z5 && !d(str, i7, length)))))) {
                            if (fVar2 == null) {
                                fVar2 = new g4.f();
                            }
                            fVar2.D(codePointAt2);
                            while (!fVar2.n()) {
                                byte readByte = fVar2.readByte();
                                fVar.x(37);
                                char[] cArr = k.f3454j;
                                fVar.x(cArr[((readByte & 255) >> 4) & 15]);
                                fVar.x(cArr[readByte & 15]);
                            }
                        } else {
                            fVar.D(codePointAt2);
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 128;
                    i9 = 32;
                }
                return fVar.r(fVar.f1935g, p3.a.f3089a);
            }
            i7 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i6, length);
        i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i, int i4) {
        int i5 = i + 2;
        return i5 < i4 && str.charAt(i) == '%' && u3.b.o(str.charAt(i + 1)) != -1 && u3.b.o(str.charAt(i5)) != -1;
    }

    public static String e(String str, int i, int i4, int i5) {
        int i6;
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        boolean z4 = (i5 & 4) == 0;
        i3.d.e(str, "<this>");
        int i7 = i;
        while (i7 < i4) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z4)) {
                g4.f fVar = new g4.f();
                fVar.C(str, i, i7);
                while (i7 < i4) {
                    int codePointAt = str.codePointAt(i7);
                    if (codePointAt != 37 || (i6 = i7 + 2) >= i4) {
                        if (codePointAt == 43 && z4) {
                            fVar.x(32);
                            i7++;
                        }
                        fVar.D(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    } else {
                        int o4 = u3.b.o(str.charAt(i7 + 1));
                        int o5 = u3.b.o(str.charAt(i6));
                        if (o4 != -1 && o5 != -1) {
                            fVar.x((o4 << 4) + o5);
                            i7 = Character.charCount(codePointAt) + i6;
                        }
                        fVar.D(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    }
                }
                return fVar.r(fVar.f1935g, p3.a.f3089a);
            }
            i7++;
        }
        String substring = str.substring(i, i4);
        i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int w02 = p3.d.w0(str, '&', i, 4);
            if (w02 == -1) {
                w02 = str.length();
            }
            int w03 = p3.d.w0(str, '=', i, 4);
            if (w03 == -1 || w03 > w02) {
                String substring = str.substring(i, w02);
                i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, w03);
                i3.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(w03 + 1, w02);
                i3.d.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i = w02 + 1;
        }
        return arrayList;
    }

    public synchronized f c(String str) {
        f fVar;
        String str2;
        try {
            i3.d.e(str, "javaName");
            LinkedHashMap linkedHashMap = f.d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (p3.l.q0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    i3.d.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (p3.l.q0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    i3.d.d(substring2, "this as java.lang.String).substring(startIndex)");
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
