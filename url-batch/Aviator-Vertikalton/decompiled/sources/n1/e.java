package n1;

import O0.q;
import e1.l;
import i1.C0167b;
import i1.k;
import i1.m;
import i1.n;
import i1.p;
import i1.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import v1.i;
import v1.j;

/* loaded from: classes.dex */
public abstract class e {
    static {
        j jVar = j.f4485d;
        i.c("\"\\");
        i.c("\t ,=");
    }

    public static final boolean a(y yVar) {
        if (X0.f.a(yVar.f2792a.f2777b, "HEAD")) {
            return false;
        }
        int i = yVar.f2795d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && j1.b.i(yVar) == -1 && !"chunked".equalsIgnoreCase(y.g(yVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0205, code lost:
    
        if (((java.util.regex.Pattern) r2.f874b).matcher(r0).matches() == false) goto L112;
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
    public static final void b(C0167b c0167b, p pVar, n nVar) {
        q qVar;
        List list;
        q qVar2;
        k kVar;
        int i;
        String str;
        q qVar3;
        boolean z2;
        int i2 = 1;
        X0.f.e(c0167b, "<this>");
        X0.f.e(pVar, "url");
        X0.f.e(nVar, "headers");
        if (c0167b == C0167b.f2642b) {
            return;
        }
        Pattern pattern = k.f2687j;
        int size = nVar.size();
        int i3 = 0;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if ("Set-Cookie".equalsIgnoreCase(nVar.b(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(nVar.d(i4));
            }
        }
        q qVar4 = q.f694a;
        if (arrayList != null) {
            ?? unmodifiableList = Collections.unmodifiableList(arrayList);
            X0.f.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            qVar = unmodifiableList;
        } else {
            qVar = qVar4;
        }
        int size2 = qVar.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str2 = (String) qVar.get(i5);
            X0.f.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = j1.b.f2967a;
            char c2 = ';';
            int d2 = j1.b.d(str2, ';', i3, str2.length());
            int d3 = j1.b.d(str2, '=', i3, d2);
            if (d3 == d2) {
                qVar2 = qVar4;
                i = i3;
            } else {
                String x2 = j1.b.x(str2, i3, d3);
                if (x2.length() != 0 && j1.b.k(x2) == -1) {
                    String x3 = j1.b.x(str2, d3 + i2, d2);
                    if (j1.b.k(x3) == -1) {
                        int i6 = d2 + i2;
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
                                int d4 = j1.b.d(str2, c2, i6, length);
                                int d5 = j1.b.d(str2, '=', i6, d4);
                                String x4 = j1.b.x(str2, i6, d5);
                                String x5 = d5 < d4 ? j1.b.x(str2, d5 + 1, d4) : "";
                                if (x4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = q1.d.R(x5, x5.length());
                                        qVar3 = qVar4;
                                        z2 = true;
                                        z5 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        qVar3 = qVar4;
                                    }
                                    i6 = d4 + 1;
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
                                                X0.f.d(compile, "compile(...)");
                                                if (!compile.matcher(x5).matches()) {
                                                    throw e2;
                                                }
                                                j4 = l.z0(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z2 = true;
                                        z5 = true;
                                        i6 = d4 + 1;
                                        qVar4 = qVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    } else {
                                        qVar3 = qVar4;
                                        if (x4.equalsIgnoreCase("domain")) {
                                            if (x5.endsWith(".")) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String p2 = m.p(e1.d.K0(x5, "."));
                                            if (p2 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str3 = p2;
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
                                        i6 = d4 + 1;
                                        qVar4 = qVar3;
                                        c2 = ';';
                                        r26 = r26;
                                    }
                                    z2 = true;
                                    i6 = d4 + 1;
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
                                String str5 = pVar.f2715d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!X0.f.a(str5, str3)) {
                                    X0.f.e(str5, "<this>");
                                    if (str5.endsWith(str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        X0.i iVar = j1.b.f2972f;
                                        iVar.getClass();
                                    }
                                    i = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3741g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i = 0;
                                    if (str7 == null || !l.z0(str7, "/", false)) {
                                        String b2 = pVar.b();
                                        int I02 = e1.d.I0(b2, '/', 0, 6);
                                        if (I02 != 0) {
                                            str6 = b2.substring(0, I02);
                                            X0.f.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    kVar = new k(x2, x3, j2, str3, str, z3, z4, z5, r26);
                                }
                            }
                        }
                    }
                }
                qVar2 = qVar4;
                kVar = null;
                i = 0;
                if (kVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(kVar);
                }
                i5++;
                i3 = i;
                i2 = 1;
                qVar4 = qVar2;
            }
            kVar = null;
            if (kVar != null) {
            }
            i5++;
            i3 = i;
            i2 = 1;
            qVar4 = qVar2;
        }
        q qVar5 = qVar4;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
            X0.f.d(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = qVar5;
        }
        list.isEmpty();
    }
}
