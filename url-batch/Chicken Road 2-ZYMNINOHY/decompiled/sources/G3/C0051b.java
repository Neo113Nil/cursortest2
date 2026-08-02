package G3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import w3.AbstractC1504a;
import w3.AbstractC1510g;

/* renamed from: G3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0051b f866a = new C0051b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0051b f867b = new C0051b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0051b f868c = new C0051b();

    public static final g a(C0051b c0051b, String str) {
        g gVar = new g(str);
        g.f891d.put(str, gVar);
        return gVar;
    }

    public static String b(String str, int i4, String str2, int i5, int i6) {
        int i7 = (i6 & 1) != 0 ? 0 : i4;
        int length = (i6 & 2) != 0 ? str.length() : i5;
        boolean z = (i6 & 8) == 0;
        boolean z4 = (i6 & 16) == 0;
        boolean z5 = (i6 & 32) == 0;
        boolean z6 = (i6 & 64) == 0;
        kotlin.jvm.internal.i.e(str, "<this>");
        int i8 = i7;
        while (i8 < length) {
            int codePointAt = str.codePointAt(i8);
            int i9 = 128;
            int i10 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z6) || AbstractC1510g.b0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z4 && !e(i8, length, str)))) || (codePointAt == 43 && z5)))) {
                T3.g gVar = new T3.g();
                gVar.B(i7, i8, str);
                T3.g gVar2 = null;
                while (i8 < length) {
                    int codePointAt2 = str.codePointAt(i8);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z5) {
                            gVar.C(z ? "+" : "%2B");
                        } else if (codePointAt2 < i10 || codePointAt2 == 127 || ((codePointAt2 >= i9 && !z6) || AbstractC1510g.b0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z4 && !e(i8, length, str)))))) {
                            if (gVar2 == null) {
                                gVar2 = new T3.g();
                            }
                            gVar2.D(codePointAt2);
                            while (!gVar2.b()) {
                                byte readByte = gVar2.readByte();
                                gVar.x(37);
                                char[] cArr = p.f946j;
                                gVar.x(cArr[((readByte & 255) >> 4) & 15]);
                                gVar.x(cArr[readByte & 15]);
                            }
                        } else {
                            gVar.D(codePointAt2);
                        }
                    }
                    i8 += Character.charCount(codePointAt2);
                    i9 = 128;
                    i10 = 32;
                }
                return gVar.n(gVar.f2975b, AbstractC1504a.f15936a);
            }
            i8 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i7, length);
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static w c(byte[] bArr) {
        int length = bArr.length;
        kotlin.jvm.internal.i.e(bArr, "<this>");
        long length2 = bArr.length;
        long j4 = 0;
        long j5 = length;
        byte[] bArr2 = H3.b.f1103a;
        if ((j4 | j5) < 0 || j4 > length2 || length2 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new w(length, bArr);
    }

    public static boolean e(int i4, int i5, String str) {
        int i6 = i4 + 2;
        return i6 < i5 && str.charAt(i4) == '%' && H3.b.p(str.charAt(i4 + 1)) != -1 && H3.b.p(str.charAt(i6)) != -1;
    }

    public static String f(String str, int i4, int i5, int i6) {
        int i7;
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        boolean z = (i6 & 4) == 0;
        kotlin.jvm.internal.i.e(str, "<this>");
        int i8 = i4;
        while (i8 < i5) {
            int i9 = i8 + 1;
            char charAt = str.charAt(i8);
            if (charAt == '%' || (charAt == '+' && z)) {
                T3.g gVar = new T3.g();
                gVar.B(i4, i8, str);
                while (i8 < i5) {
                    int codePointAt = str.codePointAt(i8);
                    if (codePointAt != 37 || (i7 = i8 + 2) >= i5) {
                        if (codePointAt == 43 && z) {
                            gVar.x(32);
                            i8++;
                        }
                        gVar.D(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    } else {
                        int p2 = H3.b.p(str.charAt(i8 + 1));
                        int p4 = H3.b.p(str.charAt(i7));
                        if (p2 != -1 && p4 != -1) {
                            gVar.x((p2 << 4) + p4);
                            i8 = Character.charCount(codePointAt) + i7;
                        }
                        gVar.D(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    }
                }
                return gVar.n(gVar.f2975b, AbstractC1504a.f15936a);
            }
            i8 = i9;
        }
        String substring = str.substring(i4, i5);
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 <= str.length()) {
            int g02 = AbstractC1510g.g0(str, '&', i4, 4);
            if (g02 == -1) {
                g02 = str.length();
            }
            int g03 = AbstractC1510g.g0(str, '=', i4, 4);
            if (g03 == -1 || g03 > g02) {
                String substring = str.substring(i4, g02);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i4, g03);
                kotlin.jvm.internal.i.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(g03 + 1, g02);
                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i4 = g02 + 1;
        }
        return arrayList;
    }

    public synchronized g d(String javaName) {
        g gVar;
        String str;
        try {
            kotlin.jvm.internal.i.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = g.f891d;
            gVar = (g) linkedHashMap.get(javaName);
            if (gVar == null) {
                if (w3.o.a0(javaName, "TLS_", false)) {
                    String substring = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.i.h(substring, "SSL_");
                } else if (w3.o.a0(javaName, "SSL_", false)) {
                    String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.i.h(substring2, "TLS_");
                } else {
                    str = javaName;
                }
                gVar = (g) linkedHashMap.get(str);
                if (gVar == null) {
                    gVar = new g(javaName);
                }
                linkedHashMap.put(javaName, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}
