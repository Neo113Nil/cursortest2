package r3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;
import kotlin.text.y;
import m3.i;
import m3.j;
import m3.l;
import m3.m;
import m3.w;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import z2.C1405I;
import z3.C1451i;

/* loaded from: classes.dex */
public abstract class e {
    static {
        C1451i c1451i = C1451i.f12000j;
        H1.f.n("\"\\");
        H1.f.n("\t ,=");
    }

    public static final boolean a(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (Intrinsics.a((String) wVar.f8473d.f363d, "HEAD")) {
            return false;
        }
        int i2 = wVar.f8476j;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && n3.b.j(wVar) == -1 && !"chunked".equalsIgnoreCase(w.a("Transfer-Encoding", wVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0214, code lost:
    
        if (n3.b.f8563f.b(r0) == false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0263  */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(j jVar, m url, l headers) {
        List list;
        List cookies;
        List list2;
        int i2;
        i iVar;
        int i4;
        long j4;
        String str;
        boolean z4;
        String str2;
        boolean z5;
        int i5 = 1;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (jVar == j.f8384b) {
            return;
        }
        Pattern pattern = i.f8371j;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        headers.getClass();
        Intrinsics.checkNotNullParameter("Set-Cookie", "name");
        int size = headers.size();
        int i6 = 0;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.h(i7))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.w(i7));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(list, "{\n      Collections.unmodifiableList(result)\n    }");
        } else {
            list = C1405I.f11931d;
        }
        List list3 = list;
        int size2 = list3.size();
        int i8 = 0;
        ArrayList arrayList2 = null;
        while (i8 < size2) {
            String setCookie = (String) list3.get(i8);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            byte[] bArr = n3.b.f8558a;
            int f4 = n3.b.f(setCookie, ';', i6, setCookie.length());
            int f5 = n3.b.f(setCookie, '=', i6, f4);
            if (f5 == f4) {
                list2 = list3;
                i2 = size2;
                i4 = i6;
            } else {
                String y4 = n3.b.y(setCookie, i6, f5);
                if (y4.length() != 0 && n3.b.l(y4) == -1) {
                    String y5 = n3.b.y(setCookie, f5 + i5, f4);
                    if (n3.b.l(y5) == -1) {
                        int i9 = f4 + i5;
                        int length = setCookie.length();
                        boolean z6 = i5;
                        long j5 = -1;
                        long j6 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        boolean z7 = false;
                        boolean z8 = false;
                        boolean z9 = false;
                        while (true) {
                            if (i9 < length) {
                                int f6 = n3.b.f(setCookie, ';', i9, length);
                                List list4 = list3;
                                int f7 = n3.b.f(setCookie, '=', i9, f6);
                                String y6 = n3.b.y(setCookie, i9, f7);
                                if (f7 < f6) {
                                    z4 = true;
                                    str2 = n3.b.y(setCookie, f7 + 1, f6);
                                } else {
                                    z4 = true;
                                    str2 = "";
                                }
                                int i10 = size2;
                                if (u.i(z4, y6, "expires")) {
                                    try {
                                        j6 = j0.c.F(str2.length(), str2);
                                        z5 = z4;
                                        z9 = z5;
                                    } catch (IllegalArgumentException unused) {
                                        z5 = z4;
                                    }
                                } else if (u.i(z4, y6, "max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(str2);
                                        j5 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e4) {
                                        try {
                                            if (!new Regex("-?\\d+").b(str2)) {
                                                throw e4;
                                            }
                                            j5 = u.n(str2, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                        } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            z5 = true;
                                        }
                                    }
                                    z5 = true;
                                    z9 = true;
                                } else if (!u.i(true, y6, "domain")) {
                                    z5 = true;
                                    if (u.i(true, y6, "path")) {
                                        str4 = str2;
                                    } else if (u.i(true, y6, "secure")) {
                                        z7 = true;
                                    } else if (u.i(true, y6, "httponly")) {
                                        z8 = true;
                                    }
                                } else {
                                    if (u.h(false, str2, ".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String j7 = m3.u.j(y.D(str2, "."));
                                    if (j7 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = j7;
                                    z5 = true;
                                    z6 = 0;
                                }
                                i9 = f6 + 1;
                                list3 = list4;
                                size2 = i10;
                                z6 = z6;
                            } else {
                                list2 = list3;
                                i2 = size2;
                                if (j5 == Long.MIN_VALUE) {
                                    j4 = Long.MIN_VALUE;
                                } else if (j5 != -1) {
                                    long j8 = currentTimeMillis + (j5 <= 9223372036854775L ? j5 * 1000 : Long.MAX_VALUE);
                                    j4 = (j8 < currentTimeMillis || j8 > 253402300799999L) ? 253402300799999L : j8;
                                } else {
                                    j4 = j6;
                                }
                                String str5 = url.f8396d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!Intrinsics.a(str5, str3)) {
                                    if (u.h(false, str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        Intrinsics.checkNotNullParameter(str5, "<this>");
                                    }
                                    i4 = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f8960g.a(str3) != null) {
                                    String str6 = "/";
                                    if (str4 == null || !u.n(str4, "/")) {
                                        String b4 = url.b();
                                        i4 = 0;
                                        int z10 = y.z(b4, '/', 0, 6);
                                        if (z10 != 0) {
                                            str6 = b4.substring(0, z10);
                                            Intrinsics.checkNotNullExpressionValue(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str4;
                                        i4 = 0;
                                    }
                                    iVar = new i(y4, y5, j4, str3, str, z7, z8, z9, z6);
                                }
                            }
                        }
                    }
                }
                list2 = list3;
                i2 = size2;
                iVar = null;
                i4 = 0;
                if (iVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                }
                i8++;
                i5 = 1;
                i6 = i4;
                list3 = list2;
                size2 = i2;
            }
            iVar = null;
            if (iVar != null) {
            }
            i8++;
            i5 = 1;
            i6 = i4;
            list3 = list2;
            size2 = i2;
        }
        if (arrayList2 != null) {
            cookies = Collections.unmodifiableList(arrayList2);
            Intrinsics.checkNotNullExpressionValue(cookies, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            cookies = C1405I.f11931d;
        }
        if (cookies.isEmpty()) {
            return;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
