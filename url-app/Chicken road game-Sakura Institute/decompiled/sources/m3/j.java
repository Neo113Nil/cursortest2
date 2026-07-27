package m3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import z3.C1448f;

/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final j f8384b = new j();

    /* renamed from: c, reason: collision with root package name */
    public static final j f8385c = new j();

    /* renamed from: d, reason: collision with root package name */
    public static final j f8386d = new j();

    public static final f a(j jVar, String str) {
        f fVar = new f(str);
        f.f8343d.put(str, fVar);
        return fVar;
    }

    public static String b(String str, int i2, int i4, String encodeSet, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        int i6 = (i5 & 1) != 0 ? 0 : i2;
        int length = (i5 & 2) != 0 ? str.length() : i4;
        boolean z8 = (i5 & 8) != 0 ? false : z4;
        boolean z9 = (i5 & 16) != 0 ? false : z5;
        boolean z10 = (i5 & 32) != 0 ? false : z6;
        boolean z11 = (i5 & 64) == 0 ? z7 : false;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i7 = i6;
        while (i7 < length) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 32;
            int i9 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z11) || kotlin.text.y.o(encodeSet, (char) codePointAt) || ((codePointAt == 37 && (!z8 || (z9 && !d(str, i7, length)))) || (codePointAt == 43 && z10)))) {
                C1448f c1448f = new C1448f();
                c1448f.C(str, i6, i7);
                C1448f c1448f2 = null;
                while (i7 < length) {
                    int codePointAt2 = str.codePointAt(i7);
                    if (!z8 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z10) {
                            c1448f.B(z8 ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i9 && !z11) || kotlin.text.y.o(encodeSet, (char) codePointAt2) || (codePointAt2 == 37 && (!z8 || (z9 && !d(str, i7, length)))))) {
                            if (c1448f2 == null) {
                                c1448f2 = new C1448f();
                            }
                            c1448f2.D(codePointAt2);
                            while (!c1448f2.a()) {
                                byte h4 = c1448f2.h();
                                c1448f.y(37);
                                char[] cArr = m.f8392j;
                                c1448f.y(cArr[((h4 & 255) >> 4) & 15]);
                                c1448f.y(cArr[h4 & 15]);
                            }
                        } else {
                            c1448f.D(codePointAt2);
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 32;
                    i9 = 128;
                }
                return c1448f.r(c1448f.f11999e, Charsets.UTF_8);
            }
            i7 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i6, length);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i2, int i4) {
        int i5 = i2 + 2;
        return i5 < i4 && str.charAt(i2) == '%' && n3.b.q(str.charAt(i2 + 1)) != -1 && n3.b.q(str.charAt(i5)) != -1;
    }

    public static String e(String str, int i2, int i4, boolean z4, int i5) {
        int i6;
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i7 = i2;
        while (i7 < i4) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z4)) {
                C1448f c1448f = new C1448f();
                c1448f.C(str, i2, i7);
                while (i7 < i4) {
                    int codePointAt = str.codePointAt(i7);
                    if (codePointAt != 37 || (i6 = i7 + 2) >= i4) {
                        if (codePointAt == 43 && z4) {
                            c1448f.y(32);
                            i7++;
                        }
                        c1448f.D(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    } else {
                        int q2 = n3.b.q(str.charAt(i7 + 1));
                        int q4 = n3.b.q(str.charAt(i6));
                        if (q2 != -1 && q4 != -1) {
                            c1448f.y((q2 << 4) + q4);
                            i7 = Character.charCount(codePointAt) + i6;
                        }
                        c1448f.D(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    }
                }
                return c1448f.r(c1448f.f11999e, Charsets.UTF_8);
            }
            i7++;
        }
        String substring = str.substring(i2, i4);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String f(String str) {
        if (kotlin.text.u.n(str, "TLS_")) {
            StringBuilder sb = new StringBuilder("SSL_");
            String substring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        if (!kotlin.text.u.n(str, "SSL_")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("TLS_");
        String substring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2);
        return sb2.toString();
    }

    public static ArrayList g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int u4 = kotlin.text.y.u(str, '&', i2, false, 4);
            if (u4 == -1) {
                u4 = str.length();
            }
            int u5 = kotlin.text.y.u(str, '=', i2, false, 4);
            if (u5 == -1 || u5 > u4) {
                String substring = str.substring(i2, u4);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i2, u5);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(u5 + 1, u4);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i2 = u4 + 1;
        }
        return arrayList;
    }

    public synchronized f c(String javaName) {
        f fVar;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = f.f8343d;
            fVar = (f) linkedHashMap.get(javaName);
            if (fVar == null) {
                fVar = (f) linkedHashMap.get(f(javaName));
                if (fVar == null) {
                    fVar = new f(javaName);
                }
                linkedHashMap.put(javaName, fVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fVar;
    }
}
