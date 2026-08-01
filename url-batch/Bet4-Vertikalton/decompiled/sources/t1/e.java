package t1;

import B1.i;
import S0.p;
import d1.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import m.C0260a;
import o1.h;
import o1.j;
import o1.l;
import o1.s;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.d;
        J0.e.h("\"\\");
        J0.e.h("\t ,=");
    }

    public static final boolean a(s sVar) {
        if (d1.d.a((String) sVar.f3383a.f260b, "HEAD")) {
            return false;
        }
        int i = sVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && p1.b.i(sVar) == -1 && !"chunked".equalsIgnoreCase(s.g("Transfer-Encoding", sVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0205, code lost:
    
        if (((java.util.regex.Pattern) r2.f2019b).matcher(r0).matches() == false) goto L112;
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
    public static final void b(o1.b bVar, l lVar, j jVar) {
        p pVar;
        List list;
        p pVar2;
        h hVar;
        int i;
        String str;
        p pVar3;
        boolean z2;
        int i2 = 1;
        d1.d.e(bVar, "<this>");
        d1.d.e(lVar, "url");
        d1.d.e(jVar, "headers");
        if (bVar == o1.b.f3258b) {
            return;
        }
        Pattern pattern = h.f3296j;
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
        p pVar4 = p.f795a;
        if (arrayList != null) {
            ?? unmodifiableList = Collections.unmodifiableList(arrayList);
            d1.d.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            pVar = unmodifiableList;
        } else {
            pVar = pVar4;
        }
        int size2 = pVar.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str2 = (String) pVar.get(i5);
            d1.d.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = p1.b.f3455a;
            char c2 = ';';
            int d = p1.b.d(str2, ';', i3, str2.length());
            int d2 = p1.b.d(str2, '=', i3, d);
            if (d2 == d) {
                pVar2 = pVar4;
                i = i3;
            } else {
                String x2 = p1.b.x(str2, i3, d2);
                if (x2.length() != 0 && p1.b.k(x2) == -1) {
                    String x3 = p1.b.x(str2, d2 + i2, d);
                    if (p1.b.k(x3) == -1) {
                        int i6 = d + i2;
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
                                int d3 = p1.b.d(str2, c2, i6, length);
                                int d4 = p1.b.d(str2, '=', i6, d3);
                                String x4 = p1.b.x(str2, i6, d4);
                                String x5 = d4 < d3 ? p1.b.x(str2, d4 + 1, d3) : "";
                                if (x4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = C0260a.p(x5, x5.length());
                                        pVar3 = pVar4;
                                        z2 = true;
                                        z5 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        pVar3 = pVar4;
                                    }
                                    i6 = d3 + 1;
                                    pVar4 = pVar3;
                                    c2 = ';';
                                    r26 = r26;
                                } else {
                                    if (x4.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(x5);
                                            pVar3 = pVar4;
                                            j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                        } catch (NumberFormatException e2) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            pVar3 = pVar4;
                                            try {
                                                d1.d.d(compile, "compile(...)");
                                                if (!compile.matcher(x5).matches()) {
                                                    throw e2;
                                                }
                                                j4 = k1.l.y(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z2 = true;
                                        z5 = true;
                                        i6 = d3 + 1;
                                        pVar4 = pVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    } else {
                                        pVar3 = pVar4;
                                        if (x4.equalsIgnoreCase("domain")) {
                                            if (x5.endsWith(".")) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String t2 = C0260a.t(k1.d.J(x5, "."));
                                            if (t2 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str3 = t2;
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
                                        i6 = d3 + 1;
                                        pVar4 = pVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    }
                                    z2 = true;
                                    i6 = d3 + 1;
                                    pVar4 = pVar3;
                                    c2 = ';';
                                    r26 = r26;
                                }
                            } else {
                                pVar2 = pVar4;
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
                                } else if (!d1.d.a(str5, str3)) {
                                    d1.d.e(str5, "<this>");
                                    if (str5.endsWith(str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        g gVar = p1.b.f3459f;
                                        gVar.getClass();
                                    }
                                    i = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3407g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i = 0;
                                    if (str7 == null || !k1.l.y(str7, "/", false)) {
                                        String b2 = lVar.b();
                                        int H2 = k1.d.H(b2, '/', 0, 6);
                                        if (H2 != 0) {
                                            str6 = b2.substring(0, H2);
                                            d1.d.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
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
                pVar2 = pVar4;
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
                pVar4 = pVar2;
            }
            hVar = null;
            if (hVar != null) {
            }
            i5++;
            i3 = i;
            i2 = 1;
            pVar4 = pVar2;
        }
        p pVar5 = pVar4;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
            d1.d.d(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = pVar5;
        }
        list.isEmpty();
    }
}
