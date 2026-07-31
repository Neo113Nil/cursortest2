package L2;

import A1.i;
import G2.l;
import G2.n;
import G2.u;
import T2.C0234i;
import a.AbstractC0235a;
import f2.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import n2.C0728h;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public abstract class f {
    static {
        C0234i c0234i = C0234i.f4410g;
        i.k("\"\\");
        i.k("\t ,=");
    }

    public static final boolean a(u uVar) {
        if (j.a((String) uVar.f2294d.f631d, "HEAD")) {
            return false;
        }
        int i3 = uVar.f2297g;
        return (((i3 >= 100 && i3 < 200) || i3 == 204 || i3 == 304) && H2.b.j(uVar) == -1 && !"chunked".equalsIgnoreCase(u.a(uVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01eb, code lost:
    
        if (r3.f7369d.matcher(r0).matches() == false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023c  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(G2.b bVar, n nVar, l lVar) {
        List list;
        G2.i iVar;
        int i3;
        String str;
        int i4 = 1;
        j.f(bVar, "<this>");
        j.f(nVar, "url");
        j.f(lVar, "headers");
        if (bVar == G2.b.f2137b) {
            return;
        }
        Pattern pattern = G2.i.f2186j;
        int size = lVar.size();
        int i5 = 0;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if ("Set-Cookie".equalsIgnoreCase(lVar.c(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(lVar.i(i6));
            }
        }
        List list2 = S1.u.f4320d;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            j.e(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i7 = 0;
        ArrayList arrayList2 = null;
        while (i7 < size2) {
            String str2 = (String) list.get(i7);
            j.f(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = H2.b.f2632a;
            char c2 = ';';
            int f3 = H2.b.f(str2, ';', i5, str2.length());
            char c3 = '=';
            int f4 = H2.b.f(str2, '=', i5, f3);
            if (f4 == f3) {
                i3 = i5;
            } else {
                String y3 = H2.b.y(i5, f4, str2);
                if (y3.length() != 0 && H2.b.l(y3) == -1) {
                    String y4 = H2.b.y(f4 + i4, f3, str2);
                    if (H2.b.l(y4) == -1) {
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
                                int f5 = H2.b.f(str2, c2, i8, length);
                                int f6 = H2.b.f(str2, c3, i8, f5);
                                String y5 = H2.b.y(i8, f6, str2);
                                String y6 = f6 < f5 ? H2.b.y(f6 + i4, f5, str2) : "";
                                if (y5.equalsIgnoreCase("expires")) {
                                    try {
                                        j4 = AbstractC0235a.F(y6, y6.length());
                                        z6 = i4;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (y5.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(y6);
                                        j5 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e3) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        j.e(compile, "compile(...)");
                                        if (!compile.matcher(y6).matches()) {
                                            throw e3;
                                        }
                                        j5 = AbstractC0737q.z(y6, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
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
                                    if (AbstractC0737q.r(y6, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String w02 = O2.l.w0(AbstractC0730j.Q(y6, "."));
                                    if (w02 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = w02;
                                    i4 = 1;
                                    z3 = 0;
                                }
                                i8 = f5 + 1;
                                c2 = ';';
                                c3 = '=';
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
                                String str5 = nVar.f2218d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!j.a(str5, str3)) {
                                    if (AbstractC0737q.r(str5, str3, false) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        C0728h c0728h = H2.b.f2637f;
                                        c0728h.getClass();
                                    }
                                    i3 = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f7455g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    if (str7 == null || !AbstractC0737q.z(str7, "/")) {
                                        String b3 = nVar.b();
                                        i3 = 0;
                                        int N3 = AbstractC0730j.N(b3, '/', 0, 6);
                                        if (N3 != 0) {
                                            str6 = b3.substring(0, N3);
                                            j.e(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                        i3 = 0;
                                    }
                                    iVar = new G2.i(y3, y4, j3, str3, str, z4, z5, z6, z3);
                                }
                            }
                        }
                    }
                }
                iVar = null;
                i3 = 0;
                if (iVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                }
                i4 = 1;
                i7++;
                i5 = i3;
            }
            iVar = null;
            if (iVar != null) {
            }
            i4 = 1;
            i7++;
            i5 = i3;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            j.e(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
