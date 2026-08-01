package E1;

import M1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import z1.j;
import z1.l;
import z1.s;

/* loaded from: classes.dex */
public abstract class f {
    static {
        i iVar = i.d;
        R0.e.h("\"\\");
        R0.e.h("\t ,=");
    }

    public static final boolean a(s sVar) {
        if (k1.e.a((String) sVar.f4759a.f482b, "HEAD")) {
            return false;
        }
        int i = sVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && A1.c.i(sVar) == -1 && !"chunked".equalsIgnoreCase(s.a("Transfer-Encoding", sVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01eb, code lost:
    
        if (((java.util.regex.Pattern) r3.f3245b).matcher(r0).matches() == false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023b  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(z1.b bVar, l lVar, j jVar) {
        List list;
        z1.h hVar;
        String str;
        int i = 1;
        k1.e.e(bVar, "<this>");
        k1.e.e(lVar, "url");
        k1.e.e(jVar, "headers");
        if (bVar == z1.b.f4634b) {
            return;
        }
        Pattern pattern = z1.h.f4672j;
        int size = jVar.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(jVar.b(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(jVar.d(i3));
            }
        }
        List list2 = Y0.s.f1516a;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            k1.e.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < size2; i4++) {
            String str2 = (String) list.get(i4);
            k1.e.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = A1.c.f13a;
            char c2 = ';';
            int e2 = A1.c.e(str2, ';', i2, str2.length());
            char c3 = '=';
            int e3 = A1.c.e(str2, '=', i2, e2);
            if (e3 != e2) {
                String x2 = A1.c.x(str2, i2, e3);
                if (x2.length() != 0 && A1.c.k(x2) == -1) {
                    String x3 = A1.c.x(str2, e3 + i, e2);
                    if (A1.c.k(x3) == -1) {
                        int i5 = e2 + i;
                        int length = str2.length();
                        long j2 = 253402300799999L;
                        boolean z2 = i;
                        long j3 = 253402300799999L;
                        String str3 = null;
                        long j4 = -1;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = 0;
                        String str4 = null;
                        while (true) {
                            if (i5 < length) {
                                int e4 = A1.c.e(str2, c2, i5, length);
                                int e5 = A1.c.e(str2, c3, i5, e4);
                                String x4 = A1.c.x(str2, i5, e5);
                                String x5 = e5 < e4 ? A1.c.x(str2, e5 + i, e4) : "";
                                if (x4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = b1.g.v(x5, x5.length());
                                        z5 = i;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (x4.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(x5);
                                        j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e6) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        k1.e.d(compile, "compile(...)");
                                        if (!compile.matcher(x5).matches()) {
                                            throw e6;
                                        }
                                        j4 = r1.l.C(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i = 1;
                                    z5 = 1;
                                } else if (!x4.equalsIgnoreCase("domain")) {
                                    if (x4.equalsIgnoreCase("path")) {
                                        str4 = x5;
                                    } else if (x4.equalsIgnoreCase("secure")) {
                                        i = 1;
                                        z3 = true;
                                    } else if (x4.equalsIgnoreCase("httponly")) {
                                        i = 1;
                                        z4 = true;
                                    }
                                    i = 1;
                                } else {
                                    if (r1.l.x(x5, ".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String u02 = H1.d.u0(r1.d.O(x5, "."));
                                    if (u02 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = u02;
                                    i = 1;
                                    z2 = 0;
                                }
                                i5 = e4 + 1;
                                c2 = ';';
                                c3 = '=';
                                z5 = z5;
                                z2 = z2;
                            } else {
                                if (j4 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j4 != -1) {
                                    long j5 = currentTimeMillis + (j4 <= 9223372036854775L ? j4 * 1000 : Long.MAX_VALUE);
                                    if (j5 >= currentTimeMillis && j5 <= 253402300799999L) {
                                        j2 = j5;
                                    }
                                } else {
                                    j2 = j3;
                                }
                                String str5 = lVar.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!k1.e.a(str5, str3)) {
                                    if (r1.l.x(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        k1.h hVar2 = A1.c.f17f;
                                        hVar2.getClass();
                                    }
                                    i2 = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3603g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i2 = 0;
                                    if (str7 == null || !r1.l.C(str7, "/", false)) {
                                        String b2 = lVar.b();
                                        int M2 = r1.d.M(b2, '/', 0, 6);
                                        if (M2 != 0) {
                                            str6 = b2.substring(0, M2);
                                            k1.e.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    hVar = new z1.h(x2, x3, j2, str3, str, z3, z4, z5, z2);
                                }
                            }
                        }
                    }
                }
                hVar = null;
                i2 = 0;
                if (hVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(hVar);
                }
                i = 1;
            }
            hVar = null;
            if (hVar != null) {
            }
            i = 1;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            k1.e.d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
