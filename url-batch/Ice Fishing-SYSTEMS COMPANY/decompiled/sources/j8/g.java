package j8;

import M7.q;
import a.AbstractC0415a;
import e8.C4484b;
import e8.j;
import e8.m;
import e8.o;
import e8.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import r7.C4985p;

/* loaded from: classes2.dex */
public abstract class g {
    static {
        u8.h hVar = u8.h.f41278w;
        L2.i.n("\"\\");
        L2.i.n("\t ,=");
    }

    public static final boolean a(w wVar) {
        if (kotlin.jvm.internal.h.a((String) wVar.f37530n.f40102v, "HEAD")) {
            return false;
        }
        int i = wVar.f37533w;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || f8.d.f(wVar) != -1) {
            return true;
        }
        String a9 = wVar.f37535y.a("Transfer-Encoding");
        if (a9 == null) {
            a9 = null;
        }
        return "chunked".equalsIgnoreCase(a9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ff, code lost:
    
        if (r3.f1937n.matcher(r0).matches() == false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C4484b c4484b, o url, m headers) {
        List list;
        List list2;
        C4985p c4985p;
        j jVar;
        int i;
        j jVar2;
        boolean z8 = true;
        kotlin.jvm.internal.h.e(c4484b, "<this>");
        kotlin.jvm.internal.h.e(url, "url");
        kotlin.jvm.internal.h.e(headers, "headers");
        if (c4484b == C4484b.f37354c) {
            return;
        }
        Pattern pattern = j.f37409k;
        int size = headers.size();
        int i4 = 0;
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.c(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.e(i9));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.h.d(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        C4985p c4985p2 = C4985p.f40358n;
        List list3 = list == null ? c4985p2 : list;
        int size2 = list3.size();
        int i10 = 0;
        ArrayList arrayList2 = null;
        while (i10 < size2) {
            String setCookie = (String) list3.get(i10);
            kotlin.jvm.internal.h.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = f8.c.f37814a;
            char c4 = ';';
            int c9 = f8.c.c(setCookie, i4, setCookie.length(), ';');
            char c10 = '=';
            boolean z9 = z8;
            int c11 = f8.c.c(setCookie, i4, c9, '=');
            if (c11 != c9) {
                String m8 = f8.c.m(i4, c11, setCookie);
                if (m8.length() != 0 && f8.c.e(m8) == -1) {
                    String m9 = f8.c.m(c11 + 1, c9, setCookie);
                    if (f8.c.e(m9) == -1) {
                        int i11 = c9 + 1;
                        int length = setCookie.length();
                        long j9 = com.anythink.core.common.n.b.a.c.d.f15208a;
                        boolean z10 = z9;
                        long j10 = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z11 = false;
                        long j11 = -1;
                        boolean z12 = false;
                        String str3 = null;
                        boolean z13 = false;
                        while (true) {
                            if (i11 < length) {
                                C4985p c4985p3 = c4985p2;
                                int c12 = f8.c.c(setCookie, i11, length, c4);
                                int c13 = f8.c.c(setCookie, i11, c12, c10);
                                String m10 = f8.c.m(i11, c13, setCookie);
                                String m11 = c13 < c12 ? f8.c.m(c13 + 1, c12, setCookie) : "";
                                if (m10.equalsIgnoreCase("expires")) {
                                    try {
                                        j10 = AbstractC0415a.w(m11.length(), m11);
                                        z12 = z9;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i11 = c12 + 1;
                                    c4985p2 = c4985p3;
                                    c4 = ';';
                                    c10 = '=';
                                } else if (m10.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(m11);
                                        j11 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e6) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        kotlin.jvm.internal.h.d(compile, "compile(...)");
                                        if (!compile.matcher(m11).matches()) {
                                            throw e6;
                                        }
                                        j11 = q.I(m11, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z12 = z9;
                                    i11 = c12 + 1;
                                    c4985p2 = c4985p3;
                                    c4 = ';';
                                    c10 = '=';
                                } else {
                                    if (m10.equalsIgnoreCase("domain")) {
                                        if (q.B(m11, com.anythink.core.common.d.j.f12535z)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b9 = f8.b.b(M7.j.Y(m11, com.anythink.core.common.d.j.f12535z));
                                        if (b9 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str = b9;
                                        z10 = false;
                                    } else if (m10.equalsIgnoreCase(com.anythink.expressad.a.f17761K)) {
                                        str2 = m11;
                                    } else if (m10.equalsIgnoreCase("secure")) {
                                        z13 = z9;
                                    } else if (m10.equalsIgnoreCase("httponly")) {
                                        z11 = z9;
                                    } else if (m10.equalsIgnoreCase("samesite")) {
                                        str3 = m11;
                                    }
                                    i11 = c12 + 1;
                                    c4985p2 = c4985p3;
                                    c4 = ';';
                                    c10 = '=';
                                }
                            } else {
                                c4985p = c4985p2;
                                if (j11 == Long.MIN_VALUE) {
                                    j9 = Long.MIN_VALUE;
                                } else if (j11 != -1) {
                                    long j12 = currentTimeMillis + (j11 <= 9223372036854775L ? j11 * 1000 : Long.MAX_VALUE);
                                    if (j12 >= currentTimeMillis && j12 <= com.anythink.core.common.n.b.a.c.d.f15208a) {
                                        j9 = j12;
                                    }
                                } else {
                                    j9 = j10;
                                }
                                String str4 = url.f37440d;
                                if (str == null) {
                                    str = str4;
                                } else if (!kotlin.jvm.internal.h.a(str4, str)) {
                                    if (q.B(str4, str) && str4.charAt((str4.length() - str.length()) - 1) == '.') {
                                        M7.i iVar = f8.b.f37813a;
                                        M7.i iVar2 = f8.b.f37813a;
                                        iVar2.getClass();
                                    }
                                    i = 0;
                                    jVar2 = null;
                                    jVar = jVar2;
                                }
                                if (str4.length() == str.length() || r8.a.f40365d.a(str) != null) {
                                    String str5 = "/";
                                    if (str2 == null || !q.I(str2, "/")) {
                                        String b10 = url.b();
                                        i = 0;
                                        int V8 = M7.j.V(b10, 0, 6, '/');
                                        if (V8 != 0) {
                                            str5 = b10.substring(0, V8);
                                            kotlin.jvm.internal.h.d(str5, "substring(...)");
                                        }
                                        str2 = str5;
                                    } else {
                                        i = 0;
                                    }
                                    jVar2 = new j(m8, m9, j9, str, str2, z13, z11, z12, z10, str3);
                                    jVar = jVar2;
                                }
                                i = 0;
                                jVar2 = null;
                                jVar = jVar2;
                            }
                        }
                    }
                }
            }
            c4985p = c4985p2;
            jVar = null;
            i = 0;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i10++;
            c4985p2 = c4985p;
            i4 = i;
            z8 = z9;
        }
        C4985p c4985p4 = c4985p2;
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            kotlin.jvm.internal.h.d(list2, "unmodifiableList(...)");
        } else {
            list2 = null;
        }
        (list2 == null ? c4985p4 : list2).isEmpty();
    }
}
