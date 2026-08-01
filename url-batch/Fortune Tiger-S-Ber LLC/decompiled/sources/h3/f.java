package h3;

import c3.k;
import c3.m;
import c3.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import n2.o;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p3.i;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class f {
    static {
        i iVar = i.f3029i;
        g2.f.k("\"\\");
        g2.f.k("\t ,=");
    }

    public static final boolean a(u uVar) {
        if (u2.c.a(uVar.f1141f.f1128b, "HEAD")) {
            return false;
        }
        int i4 = uVar.f1142i;
        return (((i4 >= 100 && i4 < 200) || i4 == 204 || i4 == 304) && d3.c.h(uVar) == -1 && !"chunked".equalsIgnoreCase(u.m(uVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f1, code lost:
    
        if (((java.util.regex.Pattern) r2.g).matcher(r0).matches() == false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(c3.b bVar, m mVar, k kVar) {
        o oVar;
        List list;
        o oVar2;
        c3.i iVar;
        int i4;
        c3.i iVar2;
        u2.c.e(bVar, "<this>");
        u2.c.e(mVar, "url");
        u2.c.e(kVar, "headers");
        if (bVar == c3.b.f1016b) {
            return;
        }
        Pattern pattern = c3.i.f1055j;
        int size = kVar.size();
        int i5 = 0;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if ("Set-Cookie".equalsIgnoreCase(kVar.b(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(kVar.d(i6));
            }
        }
        o oVar3 = o.f2953f;
        if (arrayList != null) {
            ?? unmodifiableList = Collections.unmodifiableList(arrayList);
            u2.c.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            oVar = unmodifiableList;
        } else {
            oVar = oVar3;
        }
        int size2 = oVar.size();
        int i7 = 0;
        ArrayList arrayList2 = null;
        while (i7 < size2) {
            String str = (String) oVar.get(i7);
            u2.c.e(str, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = d3.c.f1490a;
            char c = ';';
            int d4 = d3.c.d(str, ';', i5, str.length());
            char c4 = '=';
            int d5 = d3.c.d(str, '=', i5, d4);
            if (d5 != d4) {
                String w3 = d3.c.w(str, i5, d5);
                if (w3.length() != 0 && d3.c.j(w3) == -1) {
                    String w4 = d3.c.w(str, d5 + 1, d4);
                    if (d3.c.j(w4) == -1) {
                        int i8 = d4 + 1;
                        int length = str.length();
                        long j4 = 253402300799999L;
                        long j5 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z3 = false;
                        long j6 = -1;
                        boolean z4 = false;
                        boolean z5 = true;
                        boolean z6 = false;
                        while (true) {
                            if (i8 < length) {
                                o oVar4 = oVar3;
                                int d6 = d3.c.d(str, c, i8, length);
                                int d7 = d3.c.d(str, c4, i8, d6);
                                String w5 = d3.c.w(str, i8, d7);
                                String w6 = d7 < d6 ? d3.c.w(str, d7 + 1, d6) : "";
                                if (w5.equalsIgnoreCase("expires")) {
                                    try {
                                        j5 = k3.d.U(w6, w6.length());
                                        z4 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i8 = d6 + 1;
                                    oVar3 = oVar4;
                                    c = ';';
                                    c4 = '=';
                                } else if (w5.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(w6);
                                        j6 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e4) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        u2.c.d(compile, "compile(...)");
                                        if (!compile.matcher(w6).matches()) {
                                            throw e4;
                                        }
                                        j6 = b3.m.b0(w6, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z4 = true;
                                    i8 = d6 + 1;
                                    oVar3 = oVar4;
                                    c = ';';
                                    c4 = '=';
                                } else {
                                    if (w5.equalsIgnoreCase("domain")) {
                                        if (w6.endsWith(".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String i02 = k3.d.i0(b3.e.m0(w6, "."));
                                        if (i02 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str2 = i02;
                                        z5 = false;
                                    } else if (w5.equalsIgnoreCase("path")) {
                                        str3 = w6;
                                    } else if (w5.equalsIgnoreCase("secure")) {
                                        z6 = true;
                                    } else if (w5.equalsIgnoreCase("httponly")) {
                                        z3 = true;
                                    }
                                    i8 = d6 + 1;
                                    oVar3 = oVar4;
                                    c = ';';
                                    c4 = '=';
                                }
                            } else {
                                oVar2 = oVar3;
                                if (j6 == Long.MIN_VALUE) {
                                    j4 = Long.MIN_VALUE;
                                } else if (j6 != -1) {
                                    long j7 = currentTimeMillis + (j6 <= 9223372036854775L ? j6 * 1000 : Long.MAX_VALUE);
                                    if (j7 >= currentTimeMillis && j7 <= 253402300799999L) {
                                        j4 = j7;
                                    }
                                } else {
                                    j4 = j5;
                                }
                                String str4 = mVar.f1078d;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!u2.c.a(str4, str2)) {
                                    u2.c.e(str4, "<this>");
                                    if (str4.endsWith(str2) && str4.charAt((str4.length() - str2.length()) - 1) == '.') {
                                        b3.d dVar = d3.c.f1494f;
                                        dVar.getClass();
                                    }
                                    i4 = 0;
                                    iVar2 = null;
                                    iVar = iVar2;
                                }
                                if (str4.length() == str2.length() || PublicSuffixDatabase.g.a(str2) != null) {
                                    String str5 = "/";
                                    i4 = 0;
                                    if (str3 == null || !b3.m.b0(str3, "/", false)) {
                                        String b2 = mVar.b();
                                        int k02 = b3.e.k0(b2, '/', 0, 6);
                                        if (k02 != 0) {
                                            str5 = b2.substring(0, k02);
                                            u2.c.d(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str3 = str5;
                                    }
                                    iVar2 = new c3.i(w3, w4, j4, str2, str3, z6, z3, z4, z5);
                                    iVar = iVar2;
                                }
                                i4 = 0;
                                iVar2 = null;
                                iVar = iVar2;
                            }
                        }
                    }
                }
            }
            oVar2 = oVar3;
            iVar = null;
            i4 = 0;
            if (iVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(iVar);
            }
            i7++;
            i5 = i4;
            oVar3 = oVar2;
        }
        o oVar5 = oVar3;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
            u2.c.d(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = oVar5;
        }
        list.isEmpty();
    }
}
