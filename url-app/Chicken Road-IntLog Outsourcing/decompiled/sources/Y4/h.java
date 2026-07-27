package Y4;

import B4.k;
import B4.r;
import T4.C0152b;
import T4.o;
import T4.q;
import T4.z;
import a.AbstractC0169a;
import g4.C0471p;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class h {
    static {
        j5.i iVar = j5.i.f10496d;
        l1.j.h("\"\\");
        l1.j.h("\t ,=");
    }

    public static final boolean a(z zVar) {
        if (kotlin.jvm.internal.i.a((String) zVar.f3015a.f1784d, "HEAD")) {
            return false;
        }
        int i2 = zVar.f3018d;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && U4.e.f(zVar) == -1) {
            String c2 = zVar.f3020f.c("Transfer-Encoding");
            if (c2 == null) {
                c2 = null;
            }
            if (!"chunked".equalsIgnoreCase(c2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x020c, code lost:
    
        if (r3.f314a.matcher(r0).matches() == false) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025c  */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0152b c0152b, q url, o headers) {
        List list;
        List list2;
        T4.j jVar;
        String str;
        int i2;
        int i3 = 1;
        kotlin.jvm.internal.i.e(c0152b, "<this>");
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(headers, "headers");
        if (c0152b == C0152b.f2828c) {
            return;
        }
        Pattern pattern = T4.j.f2886k;
        int size = headers.size();
        int i6 = 0;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.d(i7))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.f(i7));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.i.d(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        List list3 = C0471p.f5750a;
        List list4 = list == null ? list3 : list;
        int size2 = list4.size();
        ArrayList arrayList2 = null;
        for (int i8 = 0; i8 < size2; i8++) {
            String setCookie = (String) list4.get(i8);
            kotlin.jvm.internal.i.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = U4.c.f3176a;
            char c2 = ';';
            int c6 = U4.c.c(setCookie, ';', i6, setCookie.length());
            int c7 = U4.c.c(setCookie, '=', i6, c6);
            if (c7 != c6) {
                String n6 = U4.c.n(setCookie, i6, c7);
                if (n6.length() != 0 && U4.c.f(n6) == -1) {
                    String n7 = U4.c.n(setCookie, c7 + i3, c6);
                    if (U4.c.f(n7) == -1) {
                        int i9 = c6 + i3;
                        int length = setCookie.length();
                        long j2 = 253402300799999L;
                        boolean z = i3;
                        long j6 = 253402300799999L;
                        String str2 = null;
                        long j7 = -1;
                        boolean z5 = false;
                        boolean z6 = false;
                        boolean z7 = false;
                        String str3 = null;
                        String str4 = null;
                        while (true) {
                            if (i9 < length) {
                                int c8 = U4.c.c(setCookie, c2, i9, length);
                                int c9 = U4.c.c(setCookie, '=', i9, c8);
                                String n8 = U4.c.n(setCookie, i9, c9);
                                String n9 = c9 < c8 ? U4.c.n(setCookie, c9 + 1, c8) : "";
                                if (n8.equalsIgnoreCase("expires")) {
                                    try {
                                        j6 = AbstractC0169a.D(n9.length(), n9);
                                        i2 = length;
                                        z7 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        i2 = length;
                                    }
                                    i9 = c8 + 1;
                                    length = i2;
                                    c2 = ';';
                                    z = z;
                                } else {
                                    if (n8.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(n9);
                                            i2 = length;
                                            j7 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                        } catch (NumberFormatException e3) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            i2 = length;
                                            try {
                                                kotlin.jvm.internal.i.d(compile, "compile(...)");
                                                if (!compile.matcher(n9).matches()) {
                                                    throw e3;
                                                }
                                                j7 = r.O(n9, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z7 = true;
                                        i9 = c8 + 1;
                                        length = i2;
                                        c2 = ';';
                                        z = z;
                                    } else {
                                        i2 = length;
                                        if (n8.equalsIgnoreCase("domain")) {
                                            if (r.H(n9, ".")) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String b6 = U4.b.b(k.e0(n9, "."));
                                            if (b6 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str2 = b6;
                                            z = 0;
                                        } else if (n8.equalsIgnoreCase("path")) {
                                            str4 = n9;
                                        } else if (n8.equalsIgnoreCase("secure")) {
                                            z5 = true;
                                        } else if (n8.equalsIgnoreCase("httponly")) {
                                            z6 = true;
                                        } else if (n8.equalsIgnoreCase("samesite")) {
                                            str3 = n9;
                                        }
                                        i9 = c8 + 1;
                                        length = i2;
                                        c2 = ';';
                                        z = z;
                                    }
                                    i9 = c8 + 1;
                                    length = i2;
                                    c2 = ';';
                                    z = z;
                                }
                            } else {
                                if (j7 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j7 != -1) {
                                    long j8 = currentTimeMillis + (j7 <= 9223372036854775L ? j7 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : Long.MAX_VALUE);
                                    if (j8 >= currentTimeMillis && j8 <= 253402300799999L) {
                                        j2 = j8;
                                    }
                                } else {
                                    j2 = j6;
                                }
                                String str5 = url.f2926d;
                                if (str2 == null) {
                                    str2 = str5;
                                } else if (!kotlin.jvm.internal.i.a(str5, str2)) {
                                    if (r.H(str5, str2) && str5.charAt((str5.length() - str2.length()) - 1) == '.') {
                                        B4.j jVar2 = U4.b.f3175a;
                                        B4.j jVar3 = U4.b.f3175a;
                                        jVar3.getClass();
                                    }
                                    i6 = 0;
                                }
                                if (str5.length() == str2.length() || g5.a.f5757d.a(str2) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i6 = 0;
                                    if (str7 == null || !r.O(str7, "/", false)) {
                                        String b7 = url.b();
                                        int b02 = k.b0(b7, '/', 0, 6);
                                        if (b02 != 0) {
                                            str6 = b7.substring(0, b02);
                                            kotlin.jvm.internal.i.d(str6, "substring(...)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    jVar = new T4.j(n6, n7, j2, str2, str, z5, z6, z7, z, str3);
                                }
                            }
                        }
                    }
                }
                jVar = null;
                i6 = 0;
                if (jVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                }
                i3 = 1;
            }
            jVar = null;
            if (jVar != null) {
            }
            i3 = 1;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            kotlin.jvm.internal.i.d(list2, "unmodifiableList(...)");
        } else {
            list2 = null;
        }
        if (list2 != null) {
            list3 = list2;
        }
        list3.isEmpty();
    }
}
