package p1;

import R0.q;
import Z0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k1.j;
import k1.l;
import k1.n;
import k1.u;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import x1.i;

/* loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.d;
        I0.e.h("\"\\");
        I0.e.h("\t ,=");
    }

    public static final boolean a(u uVar) {
        if (Z0.d.a((String) uVar.f2897a.f198b, "HEAD")) {
            return false;
        }
        int i = uVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && l1.b.i(uVar) == -1 && !"chunked".equalsIgnoreCase(u.f("Transfer-Encoding", uVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0205, code lost:
    
        if (((java.util.regex.Pattern) r2.f1067b).matcher(r0).matches() == false) goto L112;
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
    public static final void b(k1.b bVar, n nVar, l lVar) {
        q qVar;
        List list;
        q qVar2;
        j jVar;
        int i;
        String str;
        q qVar3;
        boolean z2;
        int i2 = 1;
        Z0.d.e(bVar, "<this>");
        Z0.d.e(nVar, "url");
        Z0.d.e(lVar, "headers");
        if (bVar == k1.b.f2769b) {
            return;
        }
        Pattern pattern = j.f2810j;
        int size = lVar.size();
        int i3 = 0;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if ("Set-Cookie".equalsIgnoreCase(lVar.b(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(lVar.d(i4));
            }
        }
        q qVar4 = q.f712a;
        if (arrayList != null) {
            ?? unmodifiableList = Collections.unmodifiableList(arrayList);
            Z0.d.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            qVar = unmodifiableList;
        } else {
            qVar = qVar4;
        }
        int size2 = qVar.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str2 = (String) qVar.get(i5);
            Z0.d.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = l1.b.f3252a;
            char c2 = ';';
            int d = l1.b.d(str2, ';', i3, str2.length());
            int d2 = l1.b.d(str2, '=', i3, d);
            if (d2 == d) {
                qVar2 = qVar4;
                i = i3;
            } else {
                String x2 = l1.b.x(str2, i3, d2);
                if (x2.length() != 0 && l1.b.k(x2) == -1) {
                    String x3 = l1.b.x(str2, d2 + i2, d);
                    if (l1.b.k(x3) == -1) {
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
                                int d3 = l1.b.d(str2, c2, i6, length);
                                int d4 = l1.b.d(str2, '=', i6, d3);
                                String x4 = l1.b.x(str2, i6, d4);
                                String x5 = d4 < d3 ? l1.b.x(str2, d4 + 1, d3) : "";
                                if (x4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = k1.c.t(x5, x5.length());
                                        qVar3 = qVar4;
                                        z2 = true;
                                        z5 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        qVar3 = qVar4;
                                    }
                                    i6 = d3 + 1;
                                    qVar4 = qVar3;
                                    c2 = ';';
                                    r26 = r26;
                                } else {
                                    if (x4.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(x5);
                                            qVar3 = qVar4;
                                            j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                        } catch (NumberFormatException e2) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            qVar3 = qVar4;
                                            try {
                                                Z0.d.d(compile, "compile(...)");
                                                if (!compile.matcher(x5).matches()) {
                                                    throw e2;
                                                }
                                                j4 = g1.l.s0(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z2 = true;
                                        z5 = true;
                                        i6 = d3 + 1;
                                        qVar4 = qVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    } else {
                                        qVar3 = qVar4;
                                        if (x4.equalsIgnoreCase("domain")) {
                                            if (x5.endsWith(".")) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String y2 = k1.c.y(g1.d.D0(x5, "."));
                                            if (y2 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str3 = y2;
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
                                        qVar4 = qVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    }
                                    z2 = true;
                                    i6 = d3 + 1;
                                    qVar4 = qVar3;
                                    c2 = ';';
                                    r26 = r26;
                                }
                            } else {
                                qVar2 = qVar4;
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
                                String str5 = nVar.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!Z0.d.a(str5, str3)) {
                                    Z0.d.e(str5, "<this>");
                                    if (str5.endsWith(str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        g gVar = l1.b.f3256f;
                                        gVar.getClass();
                                    }
                                    i = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3433g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i = 0;
                                    if (str7 == null || !g1.l.s0(str7, "/", false)) {
                                        String b2 = nVar.b();
                                        int B02 = g1.d.B0(b2, '/', 0, 6);
                                        if (B02 != 0) {
                                            str6 = b2.substring(0, B02);
                                            Z0.d.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    jVar = new j(x2, x3, j2, str3, str, z3, z4, z5, r26);
                                }
                            }
                        }
                    }
                }
                qVar2 = qVar4;
                jVar = null;
                i = 0;
                if (jVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                }
                i5++;
                i3 = i;
                i2 = 1;
                qVar4 = qVar2;
            }
            jVar = null;
            if (jVar != null) {
            }
            i5++;
            i3 = i;
            i2 = 1;
            qVar4 = qVar2;
        }
        q qVar5 = qVar4;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
            Z0.d.d(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = qVar5;
        }
        list.isEmpty();
    }
}
