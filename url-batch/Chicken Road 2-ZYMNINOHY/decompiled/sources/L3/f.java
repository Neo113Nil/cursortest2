package L3;

import G3.C0051b;
import G3.n;
import G3.p;
import G3.y;
import O3.l;
import T3.j;
import a2.i;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import d3.q;
import i2.AbstractC0457a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import w3.AbstractC1510g;
import w3.C1509f;
import w3.o;

/* loaded from: classes.dex */
public abstract class f {
    static {
        j jVar = j.f2976d;
        i.n("\"\\");
        i.n("\t ,=");
    }

    public static final boolean a(y yVar) {
        if (kotlin.jvm.internal.i.a(yVar.f1033a.f1013b, "HEAD")) {
            return false;
        }
        int i4 = yVar.f1036d;
        return (((i4 >= 100 && i4 < 200) || i4 == 204 || i4 == 304) && H3.b.i(yVar) == -1 && !"chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01eb, code lost:
    
        if (r3.f15950a.matcher(r0).matches() == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0051b c0051b, p url, n headers) {
        List list;
        int i4;
        G3.j jVar;
        long j4;
        kotlin.jvm.internal.i.e(c0051b, "<this>");
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(headers, "headers");
        if (c0051b == C0051b.f867b) {
            return;
        }
        Pattern pattern = G3.j.f917j;
        int size = headers.size();
        int i5 = 0;
        int i6 = 0;
        ArrayList arrayList = null;
        while (i6 < size) {
            int i7 = i6 + 1;
            if ("Set-Cookie".equalsIgnoreCase(headers.c(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.e(i6));
            }
            i6 = i7;
        }
        List list2 = q.f8333a;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.i.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i8 = 0;
        ArrayList arrayList2 = null;
        while (i8 < size2) {
            int i9 = i8 + 1;
            String setCookie = (String) list.get(i8);
            kotlin.jvm.internal.i.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = H3.b.f1103a;
            char c4 = ';';
            int f4 = H3.b.f(setCookie, ';', i5, setCookie.length());
            char c5 = '=';
            int f5 = H3.b.f(setCookie, '=', i5, f4);
            if (f5 != f4) {
                String w4 = H3.b.w(i5, f5, setCookie);
                if (w4.length() != 0 && H3.b.k(w4) == -1) {
                    String w5 = H3.b.w(f5 + 1, f4, setCookie);
                    if (H3.b.k(w5) == -1) {
                        int i10 = f4 + 1;
                        int length = setCookie.length();
                        int i11 = i5;
                        int i12 = i11;
                        int i13 = i12;
                        long j5 = -1;
                        long j6 = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z = true;
                        while (true) {
                            if (i10 < length) {
                                int f6 = H3.b.f(setCookie, c4, i10, length);
                                int f7 = H3.b.f(setCookie, c5, i10, f6);
                                String w6 = H3.b.w(i10, f7, setCookie);
                                String w7 = f7 < f6 ? H3.b.w(f7 + 1, f6, setCookie) : "";
                                if (w6.equalsIgnoreCase("expires")) {
                                    try {
                                        j6 = AbstractC0457a.x(w7.length(), w7);
                                        i12 = 1;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i10 = f6 + 1;
                                    c4 = ';';
                                    c5 = '=';
                                } else if (w6.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(w7);
                                        j5 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e4) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        kotlin.jvm.internal.i.d(compile, "compile(...)");
                                        if (!compile.matcher(w7).matches()) {
                                            throw e4;
                                        }
                                        j5 = o.a0(w7, TokenBuilder.TOKEN_DELIMITER, false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i12 = 1;
                                    i10 = f6 + 1;
                                    c4 = ';';
                                    c5 = '=';
                                } else {
                                    if (w6.equalsIgnoreCase("domain")) {
                                        if (o.V(w7, ".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String x4 = l.x(AbstractC1510g.m0(w7, "."));
                                        if (x4 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str2 = x4;
                                        z = false;
                                    } else if (w6.equalsIgnoreCase("path")) {
                                        str = w7;
                                    } else if (w6.equalsIgnoreCase("secure")) {
                                        i13 = 1;
                                    } else if (w6.equalsIgnoreCase("httponly")) {
                                        i11 = 1;
                                    }
                                    i10 = f6 + 1;
                                    c4 = ';';
                                    c5 = '=';
                                }
                            } else {
                                if (j5 == Long.MIN_VALUE) {
                                    j4 = Long.MIN_VALUE;
                                } else if (j5 != -1) {
                                    long j7 = currentTimeMillis + (j5 <= 9223372036854775L ? j5 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : Long.MAX_VALUE);
                                    j4 = (j7 < currentTimeMillis || j7 > 253402300799999L) ? 253402300799999L : j7;
                                } else {
                                    j4 = j6;
                                }
                                String str3 = url.f950d;
                                if (str2 == null) {
                                    str2 = str3;
                                } else if (!kotlin.jvm.internal.i.a(str3, str2)) {
                                    if (o.V(str3, str2) && str3.charAt((str3.length() - str2.length()) - 1) == '.') {
                                        C1509f c1509f = H3.b.f1107e;
                                        c1509f.getClass();
                                    }
                                    i4 = 0;
                                }
                                if (str3.length() == str2.length() || PublicSuffixDatabase.f14628g.a(str2) != null) {
                                    String str4 = "/";
                                    i4 = 0;
                                    if (str == null || !o.a0(str, "/", false)) {
                                        String b4 = url.b();
                                        int k02 = AbstractC1510g.k0(b4, IOUtils.DIR_SEPARATOR_UNIX, 0, 6);
                                        if (k02 != 0) {
                                            str4 = b4.substring(0, k02);
                                            kotlin.jvm.internal.i.d(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str4;
                                    }
                                    jVar = new G3.j(w4, w5, j4, str2, str, i13, i11, i12, z);
                                }
                                i4 = 0;
                            }
                        }
                    }
                }
            }
            i4 = i5;
            jVar = null;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i8 = i9;
            i5 = i4;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            kotlin.jvm.internal.i.d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
