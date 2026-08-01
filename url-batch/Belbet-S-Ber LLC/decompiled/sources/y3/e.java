package y3;

import g4.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p3.l;
import t3.h;
import t3.j;
import t3.k;
import t3.s;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.i;
        o2.f.g("\"\\");
        o2.f.g("\t ,=");
    }

    public static final boolean a(s sVar) {
        if (i3.d.a(sVar.f3520f.f3507b, "HEAD")) {
            return false;
        }
        int i = sVar.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && u3.b.h(sVar) == -1 && !"chunked".equalsIgnoreCase(s.m("Transfer-Encoding", sVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f1, code lost:
    
        if (((java.util.regex.Pattern) r2.f2074g).matcher(r0).matches() == false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(t3.b bVar, k kVar, j jVar) {
        q qVar;
        List list;
        q qVar2;
        h hVar;
        int i;
        h hVar2;
        i3.d.e(bVar, "<this>");
        i3.d.e(kVar, "url");
        i3.d.e(jVar, "headers");
        if (bVar == t3.b.f3402b) {
            return;
        }
        Pattern pattern = h.f3440j;
        int size = jVar.size();
        int i4 = 0;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            if ("Set-Cookie".equalsIgnoreCase(jVar.b(i5))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(jVar.d(i5));
            }
        }
        q qVar3 = q.f3887f;
        if (arrayList != null) {
            ?? unmodifiableList = Collections.unmodifiableList(arrayList);
            i3.d.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            qVar = unmodifiableList;
        } else {
            qVar = qVar3;
        }
        int size2 = qVar.size();
        int i6 = 0;
        ArrayList arrayList2 = null;
        while (i6 < size2) {
            String str = (String) qVar.get(i6);
            i3.d.e(str, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = u3.b.f3581a;
            char c5 = ';';
            int e4 = u3.b.e(str, ';', i4, str.length());
            char c6 = '=';
            int e5 = u3.b.e(str, '=', i4, e4);
            if (e5 != e4) {
                String w4 = u3.b.w(str, i4, e5);
                if (w4.length() != 0 && u3.b.j(w4) == -1) {
                    String w5 = u3.b.w(str, e5 + 1, e4);
                    if (u3.b.j(w5) == -1) {
                        int i7 = e4 + 1;
                        int length = str.length();
                        long j2 = 253402300799999L;
                        long j4 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z4 = false;
                        long j5 = -1;
                        boolean z5 = false;
                        boolean z6 = true;
                        boolean z7 = false;
                        while (true) {
                            if (i7 < length) {
                                q qVar4 = qVar3;
                                int e6 = u3.b.e(str, c5, i7, length);
                                int e7 = u3.b.e(str, c6, i7, e6);
                                String w6 = u3.b.w(str, i7, e7);
                                String w7 = e7 < e6 ? u3.b.w(str, e7 + 1, e6) : "";
                                if (w6.equalsIgnoreCase("expires")) {
                                    try {
                                        j4 = r1.b.u(w7, w7.length());
                                        z5 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i7 = e6 + 1;
                                    qVar3 = qVar4;
                                    c5 = ';';
                                    c6 = '=';
                                } else if (w6.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(w7);
                                        j5 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e8) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        i3.d.d(compile, "compile(...)");
                                        if (!compile.matcher(w7).matches()) {
                                            throw e8;
                                        }
                                        j5 = l.q0(w7, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z5 = true;
                                    i7 = e6 + 1;
                                    qVar3 = qVar4;
                                    c5 = ';';
                                    c6 = '=';
                                } else {
                                    if (w6.equalsIgnoreCase("domain")) {
                                        if (w7.endsWith(".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String z8 = s.a.z(p3.d.A0(w7, "."));
                                        if (z8 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str2 = z8;
                                        z6 = false;
                                    } else if (w6.equalsIgnoreCase("path")) {
                                        str3 = w7;
                                    } else if (w6.equalsIgnoreCase("secure")) {
                                        z7 = true;
                                    } else if (w6.equalsIgnoreCase("httponly")) {
                                        z4 = true;
                                    }
                                    i7 = e6 + 1;
                                    qVar3 = qVar4;
                                    c5 = ';';
                                    c6 = '=';
                                }
                            } else {
                                qVar2 = qVar3;
                                if (j5 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j5 != -1) {
                                    long j6 = currentTimeMillis + (j5 <= 9223372036854775L ? j5 * 1000 : Long.MAX_VALUE);
                                    if (j6 >= currentTimeMillis && j6 <= 253402300799999L) {
                                        j2 = j6;
                                    }
                                } else {
                                    j2 = j4;
                                }
                                String str4 = kVar.d;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!i3.d.a(str4, str2)) {
                                    i3.d.e(str4, "<this>");
                                    if (str4.endsWith(str2) && str4.charAt((str4.length() - str2.length()) - 1) == '.') {
                                        i3.f fVar = u3.b.f3585f;
                                        fVar.getClass();
                                    }
                                    i = 0;
                                    hVar2 = null;
                                    hVar = hVar2;
                                }
                                if (str4.length() == str2.length() || PublicSuffixDatabase.f3036g.a(str2) != null) {
                                    String str5 = "/";
                                    i = 0;
                                    if (str3 == null || !l.q0(str3, "/", false)) {
                                        String b2 = kVar.b();
                                        int z02 = p3.d.z0(b2, '/', 0, 6);
                                        if (z02 != 0) {
                                            str5 = b2.substring(0, z02);
                                            i3.d.d(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str3 = str5;
                                    }
                                    hVar2 = new h(w4, w5, j2, str2, str3, z7, z4, z5, z6);
                                    hVar = hVar2;
                                }
                                i = 0;
                                hVar2 = null;
                                hVar = hVar2;
                            }
                        }
                    }
                }
            }
            qVar2 = qVar3;
            hVar = null;
            i = 0;
            if (hVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(hVar);
            }
            i6++;
            i4 = i;
            qVar3 = qVar2;
        }
        q qVar5 = qVar3;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
            i3.d.d(list, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            list = qVar5;
        }
        list.isEmpty();
    }
}
