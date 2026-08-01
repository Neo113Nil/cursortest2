package n1;

import X0.h;
import i1.k;
import i1.m;
import i1.p;
import i1.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import q1.l;
import v1.i;

/* loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.d;
        H0.e.i("\"\\");
        H0.e.i("\t ,=");
    }

    public static final boolean a(t tVar) {
        if (X0.e.a((String) tVar.f2501a.f212b, "HEAD")) {
            return false;
        }
        int i = tVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && j1.b.i(tVar) == -1 && !"chunked".equalsIgnoreCase(t.e(tVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0205, code lost:
    
        if (((java.util.regex.Pattern) r2.f1015b).matcher(r0).matches() == false) goto L112;
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
    public static final void b(i1.b bVar, m mVar, k kVar) {
        Q0.m mVar2;
        List list;
        Q0.m mVar3;
        i1.i iVar;
        int i;
        String str;
        Q0.m mVar4;
        boolean z2;
        int i2 = 1;
        X0.e.e(bVar, "<this>");
        X0.e.e(mVar, "url");
        X0.e.e(kVar, "headers");
        if (bVar == i1.b.f2388b) {
            return;
        }
        Pattern pattern = i1.i.f2429j;
        int size = kVar.size();
        int i3 = 0;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if ("Set-Cookie".equalsIgnoreCase(kVar.b(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(kVar.d(i4));
            }
        }
        Q0.m mVar5 = Q0.m.f665a;
        if (arrayList != null) {
            ?? unmodifiableList = Collections.unmodifiableList(arrayList);
            X0.e.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            mVar2 = unmodifiableList;
        } else {
            mVar2 = mVar5;
        }
        int size2 = mVar2.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str2 = (String) mVar2.get(i5);
            X0.e.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = j1.b.f2582a;
            char c2 = ';';
            int d = j1.b.d(str2, ';', i3, str2.length());
            int d2 = j1.b.d(str2, '=', i3, d);
            if (d2 == d) {
                mVar3 = mVar5;
                i = i3;
            } else {
                String w2 = j1.b.w(str2, i3, d2);
                if (w2.length() != 0 && j1.b.k(w2) == -1) {
                    String w3 = j1.b.w(str2, d2 + i2, d);
                    if (j1.b.k(w3) == -1) {
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
                                int d3 = j1.b.d(str2, c2, i6, length);
                                int d4 = j1.b.d(str2, '=', i6, d3);
                                String w4 = j1.b.w(str2, i6, d4);
                                String w5 = d4 < d3 ? j1.b.w(str2, d4 + 1, d3) : "";
                                if (w4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = l.M(w5, w5.length());
                                        mVar4 = mVar5;
                                        z2 = true;
                                        z5 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        mVar4 = mVar5;
                                    }
                                    i6 = d3 + 1;
                                    mVar5 = mVar4;
                                    c2 = ';';
                                    r26 = r26;
                                } else {
                                    if (w4.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(w5);
                                            mVar4 = mVar5;
                                            j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                        } catch (NumberFormatException e2) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            mVar4 = mVar5;
                                            try {
                                                X0.e.d(compile, "compile(...)");
                                                if (!compile.matcher(w5).matches()) {
                                                    throw e2;
                                                }
                                                j4 = e1.l.i0(w5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z2 = true;
                                        z5 = true;
                                        i6 = d3 + 1;
                                        mVar5 = mVar4;
                                        c2 = ';';
                                        r26 = r26;
                                    } else {
                                        mVar4 = mVar5;
                                        if (w4.equalsIgnoreCase("domain")) {
                                            if (w5.endsWith(".")) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String k2 = p.k(e1.d.t0(w5, "."));
                                            if (k2 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str3 = k2;
                                            z2 = true;
                                            r26 = 0;
                                        } else if (w4.equalsIgnoreCase("path")) {
                                            str4 = w5;
                                        } else if (w4.equalsIgnoreCase("secure")) {
                                            z2 = true;
                                            z3 = true;
                                        } else if (w4.equalsIgnoreCase("httponly")) {
                                            z2 = true;
                                            z4 = true;
                                        }
                                        i6 = d3 + 1;
                                        mVar5 = mVar4;
                                        c2 = ';';
                                        r26 = r26;
                                    }
                                    z2 = true;
                                    i6 = d3 + 1;
                                    mVar5 = mVar4;
                                    c2 = ';';
                                    r26 = r26;
                                }
                            } else {
                                mVar3 = mVar5;
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
                                String str5 = mVar.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!X0.e.a(str5, str3)) {
                                    X0.e.e(str5, "<this>");
                                    if (str5.endsWith(str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        h hVar = j1.b.f2585e;
                                        hVar.getClass();
                                    }
                                    i = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3357g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i = 0;
                                    if (str7 == null || !e1.l.i0(str7, "/", false)) {
                                        String b2 = mVar.b();
                                        int r02 = e1.d.r0(b2, '/', 0, 6);
                                        if (r02 != 0) {
                                            str6 = b2.substring(0, r02);
                                            X0.e.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    iVar = new i1.i(w2, w3, j2, str3, str, z3, z4, z5, r26);
                                }
                            }
                        }
                    }
                }
                mVar3 = mVar5;
                iVar = null;
                i = 0;
                if (iVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                }
                i5++;
                i3 = i;
                i2 = 1;
                mVar5 = mVar3;
            }
            iVar = null;
            if (iVar != null) {
            }
            i5++;
            i3 = i;
            i2 = 1;
            mVar5 = mVar3;
        }
        Q0.m mVar6 = mVar5;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
            X0.e.d(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = mVar6;
        }
        list.isEmpty();
    }
}
