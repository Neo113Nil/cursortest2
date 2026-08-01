package E1;

import M1.i;
import X0.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import z1.j;
import z1.k;
import z1.m;
import z1.o;
import z1.v;

/* loaded from: classes.dex */
public abstract class f {
    static {
        i iVar = i.f828d;
        N0.e.h("\"\\");
        N0.e.h("\t ,=");
    }

    public static final boolean a(v vVar) {
        if (j1.h.a((String) vVar.f4944a.f625b, "HEAD")) {
            return false;
        }
        int i = vVar.f4947d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && A1.c.i(vVar) == -1 && !"chunked".equalsIgnoreCase(v.a("Transfer-Encoding", vVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01eb, code lost:
    
        if (((java.util.regex.Pattern) r3.f3185b).matcher(r0).matches() == false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023b  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(z1.b bVar, o oVar, m mVar) {
        List list;
        k kVar;
        String str;
        int i = 1;
        j1.h.e(bVar, "<this>");
        j1.h.e(oVar, "url");
        j1.h.e(mVar, "headers");
        if (bVar == z1.b.f4815b) {
            return;
        }
        Pattern pattern = k.j;
        int size = mVar.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(mVar.b(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mVar.d(i3));
            }
        }
        List list2 = t.f1385a;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            j1.h.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < size2; i4++) {
            String str2 = (String) list.get(i4);
            j1.h.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = A1.c.f19a;
            char c2 = ';';
            int e = A1.c.e(str2, ';', i2, str2.length());
            char c3 = '=';
            int e2 = A1.c.e(str2, '=', i2, e);
            if (e2 != e) {
                String x2 = A1.c.x(str2, i2, e2);
                if (x2.length() != 0 && A1.c.k(x2) == -1) {
                    String x3 = A1.c.x(str2, e2 + i, e);
                    if (A1.c.k(x3) == -1) {
                        int i5 = e + i;
                        int length = str2.length();
                        long j = 253402300799999L;
                        boolean z2 = i;
                        long j2 = 253402300799999L;
                        String str3 = null;
                        long j3 = -1;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = 0;
                        String str4 = null;
                        while (true) {
                            if (i5 < length) {
                                int e3 = A1.c.e(str2, c2, i5, length);
                                int e4 = A1.c.e(str2, c3, i5, e3);
                                String x4 = A1.c.x(str2, i5, e4);
                                String x5 = e4 < e3 ? A1.c.x(str2, e4 + i, e3) : "";
                                if (x4.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = j.d(x5, x5.length());
                                        z5 = i;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (x4.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(x5);
                                        j3 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e5) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        j1.h.d(compile, "compile(...)");
                                        if (!compile.matcher(x5).matches()) {
                                            throw e5;
                                        }
                                        j3 = q1.m.s0(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
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
                                    if (q1.m.n0(x5, ".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String j02 = H1.d.j0(q1.e.F0(x5, "."));
                                    if (j02 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = j02;
                                    i = 1;
                                    z2 = 0;
                                }
                                i5 = e3 + 1;
                                c2 = ';';
                                c3 = '=';
                                z5 = z5;
                                z2 = z2;
                            } else {
                                if (j3 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 >= currentTimeMillis && j4 <= 253402300799999L) {
                                        j = j4;
                                    }
                                } else {
                                    j = j2;
                                }
                                String str5 = oVar.f4878d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!j1.h.a(str5, str3)) {
                                    if (q1.m.n0(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        j1.k kVar2 = A1.c.f23f;
                                        kVar2.getClass();
                                    }
                                    i2 = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3770g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i2 = 0;
                                    if (str7 == null || !q1.m.s0(str7, "/", false)) {
                                        String b2 = oVar.b();
                                        int C02 = q1.e.C0(b2, '/', 0, 6);
                                        if (C02 != 0) {
                                            str6 = b2.substring(0, C02);
                                            j1.h.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    kVar = new k(x2, x3, j, str3, str, z3, z4, z5, z2);
                                }
                            }
                        }
                    }
                }
                kVar = null;
                i2 = 0;
                if (kVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(kVar);
                }
                i = 1;
            }
            kVar = null;
            if (kVar != null) {
            }
            i = 1;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            j1.h.d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
