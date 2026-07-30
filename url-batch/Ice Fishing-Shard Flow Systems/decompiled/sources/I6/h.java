package I6;

import D6.C;
import D6.k;
import D6.l;
import D6.q;
import D6.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.p;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public abstract class h {
    static {
        T6.i iVar = T6.i.f2618l;
        q1.h.n("\"\\");
        q1.h.n("\t ,=");
    }

    public static final boolean a(C c7) {
        Intrinsics.checkNotNullParameter(c7, "<this>");
        if (Intrinsics.a((String) c7.f426d.f639b, "HEAD")) {
            return false;
        }
        int i2 = c7.f429l;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && E6.e.e(c7) == -1 && !"chunked".equalsIgnoreCase(C.a(c7, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x021a, code lost:
    
        if (E6.b.f708a.c(r0) == false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(l lVar, s url, q headers) {
        List list;
        List cookies;
        List list2;
        k kVar;
        int i2;
        long j;
        String str;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (lVar == l.f536c) {
            return;
        }
        Pattern pattern = k.f523k;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        headers.getClass();
        Intrinsics.checkNotNullParameter("Set-Cookie", "name");
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter("Set-Cookie", "name");
        int size = headers.size();
        int i5 = 0;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.b(i7))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.d(i7));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        if (list == null) {
            list = A.f6115d;
        }
        List list3 = list;
        int size2 = list3.size();
        int i8 = 0;
        ArrayList arrayList2 = null;
        while (i8 < size2) {
            String setCookie = (String) list3.get(i8);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            byte[] bArr = E6.c.f709a;
            int b7 = E6.c.b(setCookie, ';', i5, setCookie.length());
            int b8 = E6.c.b(setCookie, '=', i5, b7);
            if (b8 == b7) {
                list2 = list3;
                i2 = i5;
            } else {
                String m2 = E6.c.m(setCookie, i5, b8);
                if (m2.length() != 0 && E6.c.e(m2) == -1) {
                    String m7 = E6.c.m(setCookie, b8 + 1, b7);
                    if (E6.c.e(m7) == -1) {
                        int i9 = b7 + 1;
                        int length = setCookie.length();
                        long j7 = -1;
                        long j8 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z7 = false;
                        boolean z8 = true;
                        boolean z9 = false;
                        String str4 = null;
                        boolean z10 = false;
                        while (true) {
                            if (i9 < length) {
                                List list4 = list3;
                                int b9 = E6.c.b(setCookie, ';', i9, length);
                                int i10 = length;
                                int b10 = E6.c.b(setCookie, '=', i9, b9);
                                String m8 = E6.c.m(setCookie, i9, b10);
                                String m9 = b10 < b9 ? E6.c.m(setCookie, b10 + 1, b9) : "";
                                if (p.g(m8, "expires")) {
                                    try {
                                        j8 = AbstractC1053a.C(m9.length(), m9);
                                        z9 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i9 = b9 + 1;
                                    list3 = list4;
                                    length = i10;
                                } else if (p.g(m8, "max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(m9);
                                        j7 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e7) {
                                        if (!new Regex("-?\\d+").c(m9)) {
                                            throw e7;
                                        }
                                        j7 = p.l(m9, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z9 = true;
                                    i9 = b9 + 1;
                                    list3 = list4;
                                    length = i10;
                                } else {
                                    if (p.g(m8, "domain")) {
                                        if (p.f(m9, ".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b11 = E6.b.b(StringsKt.D(m9, "."));
                                        if (b11 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = b11;
                                        z8 = false;
                                    } else if (p.g(m8, "path")) {
                                        str2 = m9;
                                    } else if (p.g(m8, "secure")) {
                                        z10 = true;
                                    } else if (p.g(m8, "httponly")) {
                                        z7 = true;
                                    } else if (p.g(m8, "samesite")) {
                                        str4 = m9;
                                    }
                                    i9 = b9 + 1;
                                    list3 = list4;
                                    length = i10;
                                }
                            } else {
                                list2 = list3;
                                if (j7 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j7 != -1) {
                                    long j9 = currentTimeMillis + (j7 <= 9223372036854775L ? j7 * 1000 : Long.MAX_VALUE);
                                    j = (j9 < currentTimeMillis || j9 > 253402300799999L) ? 253402300799999L : j9;
                                } else {
                                    j = j8;
                                }
                                String str5 = url.f565d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!Intrinsics.a(str5, str3)) {
                                    if (p.f(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        Regex regex = E6.b.f708a;
                                        Intrinsics.checkNotNullParameter(str5, "<this>");
                                    }
                                    i2 = 0;
                                }
                                if (str5.length() == str3.length() || Q6.a.f2354d.a(str3) != null) {
                                    String str6 = "/";
                                    if (str2 == null || !p.l(str2, "/")) {
                                        String b12 = url.b();
                                        i2 = 0;
                                        int B7 = StringsKt.B(b12, '/', 0, 6);
                                        if (B7 != 0) {
                                            str6 = b12.substring(0, B7);
                                            Intrinsics.checkNotNullExpressionValue(str6, "substring(...)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str2;
                                        i2 = 0;
                                    }
                                    kVar = new k(m2, m7, j, str3, str, z10, z7, z9, z8, str4);
                                }
                            }
                        }
                    }
                }
                list2 = list3;
                kVar = null;
                i2 = 0;
                if (kVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(kVar);
                }
                i8++;
                list3 = list2;
                i5 = i2;
            }
            kVar = null;
            if (kVar != null) {
            }
            i8++;
            list3 = list2;
            i5 = i2;
        }
        if (arrayList2 != null) {
            cookies = Collections.unmodifiableList(arrayList2);
            Intrinsics.checkNotNullExpressionValue(cookies, "unmodifiableList(...)");
        } else {
            cookies = null;
        }
        if (cookies == null) {
            cookies = A.f6115d;
        }
        if (cookies.isEmpty()) {
            return;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
