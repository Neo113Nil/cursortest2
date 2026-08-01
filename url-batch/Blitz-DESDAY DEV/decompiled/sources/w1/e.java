package w1;

import E1.i;
import X0.s;
import g1.g;
import h0.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import m.C0227a;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import r1.h;
import r1.j;
import r1.l;
import r1.r;

/* loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.d;
        L0.e.e("\"\\");
        L0.e.e("\t ,=");
    }

    public static final boolean a(r rVar) {
        if (g1.d.a((String) rVar.f3545a.f358b, "HEAD")) {
            return false;
        }
        int i = rVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && s1.b.i(rVar) == -1 && !"chunked".equalsIgnoreCase(r.g("Transfer-Encoding", rVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0205, code lost:
    
        if (((java.util.regex.Pattern) r2.f2365b).matcher(r0).matches() == false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0255  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r1.b bVar, l lVar, j jVar) {
        s sVar;
        List list;
        s sVar2;
        h hVar;
        int i;
        String str;
        s sVar3;
        boolean z2;
        int i2 = 1;
        g1.d.e(bVar, "<this>");
        g1.d.e(lVar, "url");
        g1.d.e(jVar, "headers");
        if (bVar == r1.b.f3437b) {
            return;
        }
        Pattern pattern = h.f3475j;
        int size = jVar.size();
        int i3 = 0;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if ("Set-Cookie".equalsIgnoreCase(jVar.b(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(jVar.d(i4));
            }
        }
        s sVar4 = s.f992a;
        if (arrayList != null) {
            ?? unmodifiableList = Collections.unmodifiableList(arrayList);
            g1.d.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            sVar = unmodifiableList;
        } else {
            sVar = sVar4;
        }
        int size2 = sVar.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str2 = (String) sVar.get(i5);
            g1.d.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = s1.b.f3607a;
            char c2 = ';';
            int e2 = s1.b.e(str2, ';', i3, str2.length());
            int e3 = s1.b.e(str2, '=', i3, e2);
            if (e3 == e2) {
                sVar2 = sVar4;
                i = i3;
            } else {
                String x2 = s1.b.x(str2, i3, e3);
                if (x2.length() != 0 && s1.b.k(x2) == -1) {
                    String x3 = s1.b.x(str2, e3 + i2, e2);
                    if (s1.b.k(x3) == -1) {
                        int i6 = e2 + i2;
                        int length = str2.length();
                        long j2 = 253402300799999L;
                        ?? r26 = i2;
                        long j3 = 253402300799999L;
                        String str3 = null;
                        long j4 = -1;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = false;
                        String str4 = null;
                        while (true) {
                            if (i6 < length) {
                                int e4 = s1.b.e(str2, c2, i6, length);
                                int e5 = s1.b.e(str2, '=', i6, e4);
                                String x4 = s1.b.x(str2, i6, e5);
                                String x5 = e5 < e4 ? s1.b.x(str2, e5 + 1, e4) : "";
                                if (x4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = C0227a.o(x5, x5.length());
                                        sVar3 = sVar4;
                                        z2 = true;
                                        z5 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        sVar3 = sVar4;
                                    }
                                    i6 = e4 + 1;
                                    sVar4 = sVar3;
                                    c2 = ';';
                                    r26 = r26;
                                } else {
                                    if (x4.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(x5);
                                            sVar3 = sVar4;
                                            j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                        } catch (NumberFormatException e6) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            sVar3 = sVar4;
                                            try {
                                                g1.d.d(compile, "compile(...)");
                                                if (!compile.matcher(x5).matches()) {
                                                    throw e6;
                                                }
                                                j4 = n1.l.B(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z2 = true;
                                        z5 = true;
                                        i6 = e4 + 1;
                                        sVar4 = sVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    } else {
                                        sVar3 = sVar4;
                                        if (x4.equalsIgnoreCase("domain")) {
                                            if (x5.endsWith(".")) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String u2 = a0.u(n1.d.M(x5, "."));
                                            if (u2 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str3 = u2;
                                            z2 = true;
                                            r26 = 0;
                                        } else if (x4.equalsIgnoreCase("path")) {
                                            str4 = x5;
                                        } else if (x4.equalsIgnoreCase("secure")) {
                                            z2 = true;
                                            z3 = true;
                                        } else if (x4.equalsIgnoreCase("httponly")) {
                                            z2 = true;
                                            z4 = true;
                                        }
                                        i6 = e4 + 1;
                                        sVar4 = sVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    }
                                    z2 = true;
                                    i6 = e4 + 1;
                                    sVar4 = sVar3;
                                    c2 = ';';
                                    r26 = r26;
                                }
                            } else {
                                sVar2 = sVar4;
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
                                } else if (!g1.d.a(str5, str3)) {
                                    g1.d.e(str5, "<this>");
                                    if (str5.endsWith(str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        g gVar = s1.b.f3611f;
                                        gVar.getClass();
                                    }
                                    i = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3316g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i = 0;
                                    if (str7 == null || !n1.l.B(str7, "/", false)) {
                                        String b2 = lVar.b();
                                        int K2 = n1.d.K(b2, '/', 0, 6);
                                        if (K2 != 0) {
                                            str6 = b2.substring(0, K2);
                                            g1.d.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    hVar = new h(x2, x3, j2, str3, str, z3, z4, z5, r26);
                                }
                            }
                        }
                    }
                }
                sVar2 = sVar4;
                hVar = null;
                i = 0;
                if (hVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(hVar);
                }
                i5++;
                i3 = i;
                i2 = 1;
                sVar4 = sVar2;
            }
            hVar = null;
            if (hVar != null) {
            }
            i5++;
            i3 = i;
            i2 = 1;
            sVar4 = sVar2;
        }
        s sVar5 = sVar4;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
            g1.d.d(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = sVar5;
        }
        list.isEmpty();
    }
}
