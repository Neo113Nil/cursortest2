package o1;

import B.j;
import H.e;
import i1.d;
import i1.l;
import java.util.ArrayList;
import m1.c;
import m1.m;
import m1.q;
import m1.r;
import m1.s;
import m1.t;
import r1.f;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ce, code lost:
    
        if (i1.l.o0(r7, "1", false) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // m1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(f fVar) {
        j jVar;
        j jVar2;
        m1.j jVar3;
        String str;
        int i;
        j jVar4;
        m1.j jVar5;
        int i2;
        String str2;
        int i3;
        System.currentTimeMillis();
        e eVar = fVar.f3522e;
        j jVar6 = new j(eVar, 16, (Object) null);
        c cVar = (c) eVar.f208f;
        if (cVar == null) {
            int i4 = c.f3126n;
            m1.j jVar7 = (m1.j) eVar.d;
            int size = jVar7.size();
            String str3 = null;
            int i5 = 0;
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            int i6 = -1;
            int i7 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i8 = -1;
            int i9 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i5 < size) {
                String b2 = jVar7.b(i5);
                String d = jVar7.d(i5);
                if (l.k0(b2, "Cache-Control")) {
                    if (str3 == null) {
                        str3 = d;
                        i = 0;
                        while (i < d.length()) {
                            int length = d.length();
                            int i10 = i;
                            while (true) {
                                if (i10 >= length) {
                                    jVar4 = jVar6;
                                    i10 = d.length();
                                    break;
                                }
                                jVar4 = jVar6;
                                if (d.p0("=,;", d.charAt(i10))) {
                                    break;
                                }
                                i10++;
                                jVar6 = jVar4;
                            }
                            String substring = d.substring(i, i10);
                            b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = d.E0(substring).toString();
                            if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                                jVar5 = jVar7;
                                i2 = i10 + 1;
                                str2 = null;
                            } else {
                                int i11 = i10 + 1;
                                byte[] bArr = n1.b.f3286a;
                                int length2 = d.length();
                                while (true) {
                                    if (i11 >= length2) {
                                        i3 = 1;
                                        i11 = d.length();
                                        break;
                                    }
                                    char charAt = d.charAt(i11);
                                    int i12 = length2;
                                    if (charAt != ' ' && charAt != '\t') {
                                        i3 = 1;
                                        break;
                                    }
                                    i11++;
                                    length2 = i12;
                                }
                                if (i11 < d.length()) {
                                    jVar5 = jVar7;
                                    if (d.charAt(i11) == '\"') {
                                        int i13 = i11 + i3;
                                        int t02 = d.t0(d, '\"', i13, false, 4);
                                        str2 = d.substring(i13, t02);
                                        b1.d.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i2 = t02 + 1;
                                    }
                                } else {
                                    jVar5 = jVar7;
                                }
                                int length3 = d.length();
                                i2 = i11;
                                while (true) {
                                    if (i2 >= length3) {
                                        i2 = d.length();
                                        break;
                                    }
                                    int i14 = length3;
                                    if (d.p0(",;", d.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                    length3 = i14;
                                }
                                String substring2 = d.substring(i11, i2);
                                b1.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str2 = d.E0(substring2).toString();
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar6 = jVar4;
                                jVar7 = jVar5;
                                z3 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar6 = jVar4;
                                jVar7 = jVar5;
                                z4 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i6 = n1.b.w(str2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i7 = n1.b.w(str2, -1);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar6 = jVar4;
                                    jVar7 = jVar5;
                                    z5 = true;
                                } else if ("public".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar6 = jVar4;
                                    jVar7 = jVar5;
                                    z6 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar6 = jVar4;
                                    jVar7 = jVar5;
                                    z7 = true;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i8 = n1.b.w(str2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i9 = n1.b.w(str2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar6 = jVar4;
                                    jVar7 = jVar5;
                                    z8 = true;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar6 = jVar4;
                                    jVar7 = jVar5;
                                    z9 = true;
                                } else {
                                    boolean equalsIgnoreCase = "immutable".equalsIgnoreCase(obj);
                                    i = i2;
                                    jVar6 = jVar4;
                                    jVar7 = jVar5;
                                    if (equalsIgnoreCase) {
                                        z10 = true;
                                    }
                                }
                                i = i2;
                                jVar6 = jVar4;
                                jVar7 = jVar5;
                            }
                        }
                        i5++;
                        jVar6 = jVar6;
                        jVar7 = jVar7;
                    }
                } else if (!l.k0(b2, "Pragma")) {
                    i5++;
                    jVar6 = jVar6;
                    jVar7 = jVar7;
                }
                z2 = false;
                i = 0;
                while (i < d.length()) {
                }
                i5++;
                jVar6 = jVar6;
                jVar7 = jVar7;
            }
            jVar = jVar6;
            cVar = new c(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str3);
            eVar.f208f = cVar;
        } else {
            jVar = jVar6;
        }
        if (cVar.f3133j) {
            Object obj2 = null;
            jVar2 = new j(obj2, 16, obj2);
        } else {
            jVar2 = jVar;
        }
        q1.j jVar8 = fVar.f3519a;
        e eVar2 = (e) jVar2.f27b;
        s sVar = (s) jVar2.f28c;
        if (eVar2 == null && sVar == null) {
            s sVar2 = new s(eVar, q.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new m1.j((String[]) new ArrayList(20).toArray(new String[0])), n1.b.f3288c, null, null, null, -1L, System.currentTimeMillis(), null);
            b1.d.e(jVar8, "call");
            return sVar2;
        }
        if (eVar2 == null) {
            b1.d.b(sVar);
            r h = sVar.h();
            s a2 = a.a(sVar);
            r.b("cacheResponse", a2);
            h.i = a2;
            s a3 = h.a();
            b1.d.e(jVar8, "call");
            return a3;
        }
        if (sVar != null) {
            b1.d.e(jVar8, "call");
        }
        s b3 = fVar.b(eVar2);
        String str4 = "networkResponse";
        if (sVar != null) {
            if (b3.d == 304) {
                r h2 = sVar.h();
                ArrayList arrayList = new ArrayList(20);
                m1.j jVar9 = sVar.f3253f;
                int size2 = jVar9.size();
                int i15 = 0;
                while (true) {
                    jVar3 = b3.f3253f;
                    if (i15 >= size2) {
                        break;
                    }
                    String b4 = jVar9.b(i15);
                    int i16 = size2;
                    String d2 = jVar9.d(i15);
                    m1.j jVar10 = jVar9;
                    if ("Warning".equalsIgnoreCase(b4)) {
                        str = str4;
                    } else {
                        str = str4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !a.b(b4) || jVar3.a(b4) == null) {
                        b1.d.e(b4, "name");
                        b1.d.e(d2, "value");
                        arrayList.add(b4);
                        arrayList.add(d.E0(d2).toString());
                    }
                    i15++;
                    size2 = i16;
                    jVar9 = jVar10;
                    str4 = str;
                }
                String str5 = str4;
                int size3 = jVar3.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    String b5 = jVar3.b(i17);
                    if (!"Content-Length".equalsIgnoreCase(b5) && !"Content-Encoding".equalsIgnoreCase(b5) && !"Content-Type".equalsIgnoreCase(b5) && a.b(b5)) {
                        String d3 = jVar3.d(i17);
                        b1.d.e(b5, "name");
                        b1.d.e(d3, "value");
                        arrayList.add(b5);
                        arrayList.add(d.E0(d3).toString());
                    }
                }
                h2.f3243f = new m1.j((String[]) arrayList.toArray(new String[0])).c();
                h2.f3246k = b3.f3256k;
                h2.f3247l = b3.f3257l;
                s a4 = a.a(sVar);
                r.b("cacheResponse", a4);
                h2.i = a4;
                s a5 = a.a(b3);
                r.b(str5, a5);
                h2.h = a5;
                h2.a();
                t tVar = b3.f3254g;
                b1.d.b(tVar);
                tVar.close();
                b1.d.b(null);
                throw null;
            }
            t tVar2 = sVar.f3254g;
            if (tVar2 != null) {
                n1.b.b(tVar2);
            }
        }
        r h3 = b3.h();
        s a6 = a.a(sVar);
        r.b("cacheResponse", a6);
        h3.i = a6;
        s a7 = a.a(b3);
        r.b("networkResponse", a7);
        h3.h = a7;
        return h3.a();
    }
}
