package F2;

import A2.C0003b;
import A2.j;
import A2.o;
import A2.q;
import A2.y;
import M1.u;
import N2.C0153i;
import Z1.i;
import a.AbstractC0157a;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import h2.C0446h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public abstract class f {
    static {
        C0153i c0153i = C0153i.f2930g;
        F0.a.k("\"\\");
        F0.a.k("\t ,=");
    }

    public static final boolean a(y yVar) {
        if (i.a((String) yVar.f211d.f194c, "HEAD")) {
            return false;
        }
        int i3 = yVar.f214g;
        return (((i3 >= 100 && i3 < 200) || i3 == 204 || i3 == 304) && B2.c.j(yVar) == -1 && !"chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01eb, code lost:
    
        if (r3.f5078d.matcher(r0).matches() == false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023c  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0003b c0003b, q qVar, o oVar) {
        List list;
        j jVar;
        int i3;
        String str;
        int i4 = 1;
        i.f(c0003b, "<this>");
        i.f(qVar, "url");
        i.f(oVar, "headers");
        if (c0003b == C0003b.f44b) {
            return;
        }
        Pattern pattern = j.f94j;
        int size = oVar.size();
        int i5 = 0;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if ("Set-Cookie".equalsIgnoreCase(oVar.c(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(oVar.i(i6));
            }
        }
        List list2 = u.f2803d;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            i.e(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i7 = 0;
        ArrayList arrayList2 = null;
        while (i7 < size2) {
            String str2 = (String) list.get(i7);
            i.f(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = B2.c.f415a;
            char c3 = ';';
            int f3 = B2.c.f(str2, ';', i5, str2.length());
            char c4 = '=';
            int f4 = B2.c.f(str2, '=', i5, f3);
            if (f4 == f3) {
                i3 = i5;
            } else {
                String y3 = B2.c.y(i5, f4, str2);
                if (y3.length() != 0 && B2.c.l(y3) == -1) {
                    String y4 = B2.c.y(f4 + i4, f3, str2);
                    if (B2.c.l(y4) == -1) {
                        int i8 = f3 + i4;
                        int length = str2.length();
                        long j3 = 253402300799999L;
                        boolean z3 = i4;
                        long j4 = 253402300799999L;
                        String str3 = null;
                        long j5 = -1;
                        boolean z4 = false;
                        boolean z5 = false;
                        boolean z6 = 0;
                        String str4 = null;
                        while (true) {
                            if (i8 < length) {
                                int f5 = B2.c.f(str2, c3, i8, length);
                                int f6 = B2.c.f(str2, c4, i8, f5);
                                String y5 = B2.c.y(i8, f6, str2);
                                String y6 = f6 < f5 ? B2.c.y(f6 + i4, f5, str2) : "";
                                if (y5.equalsIgnoreCase("expires")) {
                                    try {
                                        j4 = AbstractC0157a.P(y6, y6.length());
                                        z6 = i4;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (y5.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(y6);
                                        j5 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e3) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        i.e(compile, "compile(...)");
                                        if (!compile.matcher(y6).matches()) {
                                            throw e3;
                                        }
                                        j5 = AbstractC0454p.i0(y6, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i4 = 1;
                                    z6 = 1;
                                } else if (!y5.equalsIgnoreCase("domain")) {
                                    if (y5.equalsIgnoreCase("path")) {
                                        str4 = y6;
                                    } else if (y5.equalsIgnoreCase("secure")) {
                                        i4 = 1;
                                        z4 = true;
                                    } else if (y5.equalsIgnoreCase("httponly")) {
                                        i4 = 1;
                                        z5 = true;
                                    }
                                    i4 = 1;
                                } else {
                                    if (AbstractC0454p.c0(y6, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String X2 = AbstractC0157a.X(AbstractC0447i.z0(y6, "."));
                                    if (X2 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = X2;
                                    i4 = 1;
                                    z3 = 0;
                                }
                                i8 = f5 + 1;
                                c3 = ';';
                                c4 = '=';
                                z6 = z6;
                                z3 = z3;
                            } else {
                                if (j5 == Long.MIN_VALUE) {
                                    j3 = Long.MIN_VALUE;
                                } else if (j5 != -1) {
                                    long j6 = currentTimeMillis + (j5 <= 9223372036854775L ? j5 * 1000 : Long.MAX_VALUE);
                                    if (j6 >= currentTimeMillis && j6 <= 253402300799999L) {
                                        j3 = j6;
                                    }
                                } else {
                                    j3 = j4;
                                }
                                String str5 = qVar.f132d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!i.a(str5, str3)) {
                                    if (AbstractC0454p.c0(str5, str3, false) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        C0446h c0446h = B2.c.f420f;
                                        c0446h.getClass();
                                    }
                                    i3 = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f6748g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    if (str7 == null || !AbstractC0454p.i0(str7, "/")) {
                                        String b2 = qVar.b();
                                        i3 = 0;
                                        int v0 = AbstractC0447i.v0(b2, '/', 0, 6);
                                        if (v0 != 0) {
                                            str6 = b2.substring(0, v0);
                                            i.e(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                        i3 = 0;
                                    }
                                    jVar = new j(y3, y4, j3, str3, str, z4, z5, z6, z3);
                                }
                            }
                        }
                    }
                }
                jVar = null;
                i3 = 0;
                if (jVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                }
                i4 = 1;
                i7++;
                i5 = i3;
            }
            jVar = null;
            if (jVar != null) {
            }
            i4 = 1;
            i7++;
            i5 = i3;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            i.e(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
