package c6;

import F5.q;
import X5.C0218b;
import X5.j;
import X5.n;
import X5.o;
import X5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l5.C0512p;
import m1.AbstractC0521b;
import y1.C0760d;

/* loaded from: classes.dex */
public abstract class g {
    static {
        n6.i iVar = n6.i.f5525i;
        C0760d.d("\"\\");
        C0760d.d("\t ,=");
    }

    public static final boolean a(w wVar) {
        if (kotlin.jvm.internal.i.a((String) wVar.f3061f.f330b, "HEAD")) {
            return false;
        }
        int i7 = wVar.f3064i;
        if (((i7 < 100 || i7 >= 200) && i7 != 204 && i7 != 304) || Y5.e.e(wVar) != -1) {
            return true;
        }
        String a7 = wVar.f3066k.a("Transfer-Encoding");
        if (a7 == null) {
            a7 = null;
        }
        return "chunked".equalsIgnoreCase(a7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01fe, code lost:
    
        if (r3.f806f.matcher(r0).matches() == false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0218b c0218b, o url, n headers) {
        List list;
        List list2;
        C0512p c0512p;
        j jVar;
        int i7;
        j jVar2;
        kotlin.jvm.internal.i.e(c0218b, "<this>");
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(headers, "headers");
        if (c0218b == C0218b.f2889c) {
            return;
        }
        Pattern pattern = j.f2946k;
        int size = headers.size();
        int i8 = 0;
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.b(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.d(i9));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.i.d(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        C0512p c0512p2 = C0512p.f5303f;
        List list3 = list == null ? c0512p2 : list;
        int size2 = list3.size();
        int i10 = 0;
        ArrayList arrayList2 = null;
        while (i10 < size2) {
            String setCookie = (String) list3.get(i10);
            kotlin.jvm.internal.i.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = Y5.c.f3099a;
            char c7 = ';';
            int c8 = Y5.c.c(setCookie, ';', i8, setCookie.length());
            char c9 = '=';
            int c10 = Y5.c.c(setCookie, '=', i8, c8);
            if (c10 != c8) {
                String m4 = Y5.c.m(setCookie, i8, c10);
                if (m4.length() != 0 && Y5.c.e(m4) == -1) {
                    String m7 = Y5.c.m(setCookie, c10 + 1, c8);
                    if (Y5.c.e(m7) == -1) {
                        int i11 = c8 + 1;
                        int length = setCookie.length();
                        long j4 = 253402300799999L;
                        long j7 = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z5 = false;
                        long j8 = -1;
                        boolean z6 = false;
                        boolean z7 = true;
                        String str3 = null;
                        boolean z8 = false;
                        while (true) {
                            if (i11 < length) {
                                C0512p c0512p3 = c0512p2;
                                int c11 = Y5.c.c(setCookie, c7, i11, length);
                                int c12 = Y5.c.c(setCookie, c9, i11, c11);
                                String m8 = Y5.c.m(setCookie, i11, c12);
                                String m9 = c12 < c11 ? Y5.c.m(setCookie, c12 + 1, c11) : "";
                                if (m8.equalsIgnoreCase("expires")) {
                                    try {
                                        j7 = AbstractC0521b.y(m9, m9.length());
                                        z6 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i11 = c11 + 1;
                                    c0512p2 = c0512p3;
                                    c7 = ';';
                                    c9 = '=';
                                } else if (m8.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(m9);
                                        j8 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e4) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        kotlin.jvm.internal.i.d(compile, "compile(...)");
                                        if (!compile.matcher(m9).matches()) {
                                            throw e4;
                                        }
                                        j8 = q.I(m9, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z6 = true;
                                    i11 = c11 + 1;
                                    c0512p2 = c0512p3;
                                    c7 = ';';
                                    c9 = '=';
                                } else {
                                    if (m8.equalsIgnoreCase("domain")) {
                                        if (q.B(m9, ".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b7 = Y5.b.b(F5.j.Y(m9, "."));
                                        if (b7 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str = b7;
                                        z7 = false;
                                    } else if (m8.equalsIgnoreCase("path")) {
                                        str2 = m9;
                                    } else if (m8.equalsIgnoreCase("secure")) {
                                        z8 = true;
                                    } else if (m8.equalsIgnoreCase("httponly")) {
                                        z5 = true;
                                    } else if (m8.equalsIgnoreCase("samesite")) {
                                        str3 = m9;
                                    }
                                    i11 = c11 + 1;
                                    c0512p2 = c0512p3;
                                    c7 = ';';
                                    c9 = '=';
                                }
                            } else {
                                c0512p = c0512p2;
                                if (j8 == Long.MIN_VALUE) {
                                    j4 = Long.MIN_VALUE;
                                } else if (j8 != -1) {
                                    long j9 = currentTimeMillis + (j8 <= 9223372036854775L ? j8 * 1000 : Long.MAX_VALUE);
                                    if (j9 >= currentTimeMillis && j9 <= 253402300799999L) {
                                        j4 = j9;
                                    }
                                } else {
                                    j4 = j7;
                                }
                                String str4 = url.f2977d;
                                if (str == null) {
                                    str = str4;
                                } else if (!kotlin.jvm.internal.i.a(str4, str)) {
                                    if (q.B(str4, str) && str4.charAt((str4.length() - str.length()) - 1) == '.') {
                                        F5.i iVar = Y5.b.f3098a;
                                        F5.i iVar2 = Y5.b.f3098a;
                                        iVar2.getClass();
                                    }
                                    i7 = 0;
                                    jVar2 = null;
                                    jVar = jVar2;
                                }
                                if (str4.length() == str.length() || k6.a.f5224d.a(str) != null) {
                                    String str5 = "/";
                                    if (str2 == null || !q.I(str2, "/")) {
                                        String b8 = url.b();
                                        i7 = 0;
                                        int U6 = F5.j.U(b8, '/', 0, 6);
                                        if (U6 != 0) {
                                            str5 = b8.substring(0, U6);
                                            kotlin.jvm.internal.i.d(str5, "substring(...)");
                                        }
                                        str2 = str5;
                                    } else {
                                        i7 = 0;
                                    }
                                    jVar2 = new j(m4, m7, j4, str, str2, z8, z5, z6, z7, str3);
                                    jVar = jVar2;
                                }
                                i7 = 0;
                                jVar2 = null;
                                jVar = jVar2;
                            }
                        }
                    }
                }
            }
            c0512p = c0512p2;
            jVar = null;
            i7 = 0;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i10++;
            i8 = i7;
            c0512p2 = c0512p;
        }
        C0512p c0512p4 = c0512p2;
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            kotlin.jvm.internal.i.d(list2, "unmodifiableList(...)");
        } else {
            list2 = null;
        }
        (list2 == null ? c0512p4 : list2).isEmpty();
    }
}
