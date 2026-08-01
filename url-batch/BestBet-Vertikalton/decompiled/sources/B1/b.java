package B1;

import E1.g;
import E1.h;
import H.e;
import java.util.ArrayList;
import r1.d;
import r1.l;
import u0.C0385x;
import z1.c;
import z1.j;
import z1.m;
import z1.q;
import z1.r;
import z1.s;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02f4, code lost:
    
        if (r1.l.C(r7, "1", false) != false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143 A[SYNTHETIC] */
    @Override // z1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(g gVar) {
        C0385x c0385x;
        C0385x c0385x2;
        j jVar;
        String str;
        int i;
        C0385x c0385x3;
        j jVar2;
        int i2;
        int i3;
        String str2;
        int i4;
        System.currentTimeMillis();
        e eVar = gVar.f236e;
        C0385x c0385x4 = new C0385x(eVar, 1, null);
        c cVar = (c) eVar.f485f;
        if (cVar == null) {
            int i5 = c.f4636n;
            j jVar3 = (j) eVar.d;
            int size = jVar3.size();
            String str3 = null;
            boolean z2 = true;
            int i6 = 0;
            boolean z3 = false;
            boolean z4 = false;
            int i7 = -1;
            int i8 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i9 = -1;
            int i10 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i6 < size) {
                String b2 = jVar3.b(i6);
                String d = jVar3.d(i6);
                if (l.y(b2, "Cache-Control")) {
                    if (str3 == null) {
                        str3 = d;
                        i = 0;
                        while (i < d.length()) {
                            int length = d.length();
                            int i11 = i;
                            while (true) {
                                if (i11 >= length) {
                                    c0385x3 = c0385x4;
                                    i11 = d.length();
                                    break;
                                }
                                int i12 = length;
                                c0385x3 = c0385x4;
                                if (d.D("=,;", d.charAt(i11))) {
                                    break;
                                }
                                i11++;
                                length = i12;
                                c0385x4 = c0385x3;
                            }
                            String substring = d.substring(i, i11);
                            k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = d.T(substring).toString();
                            if (i11 != d.length()) {
                                jVar2 = jVar3;
                                if (d.charAt(i11) != ',' && d.charAt(i11) != ';') {
                                    int i13 = i11 + 1;
                                    byte[] bArr = A1.c.f13a;
                                    int length2 = d.length();
                                    while (true) {
                                        if (i13 >= length2) {
                                            i4 = 1;
                                            i13 = d.length();
                                            break;
                                        }
                                        char charAt = d.charAt(i13);
                                        int i14 = length2;
                                        if (charAt != ' ' && charAt != '\t') {
                                            i4 = 1;
                                            break;
                                        }
                                        i13++;
                                        length2 = i14;
                                    }
                                    if (i13 < d.length()) {
                                        i2 = size;
                                        if (d.charAt(i13) == '\"') {
                                            int i15 = i13 + i4;
                                            int I2 = d.I(d, '\"', i15, false, 4);
                                            String substring2 = d.substring(i15, I2);
                                            k1.e.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            i3 = I2 + 1;
                                            str2 = substring2;
                                            if ("no-cache".equalsIgnoreCase(obj)) {
                                                i = i3;
                                                jVar3 = jVar2;
                                                c0385x4 = c0385x3;
                                                size = i2;
                                                z3 = true;
                                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                                i = i3;
                                                jVar3 = jVar2;
                                                c0385x4 = c0385x3;
                                                size = i2;
                                                z4 = true;
                                            } else {
                                                if ("max-age".equalsIgnoreCase(obj)) {
                                                    i7 = A1.c.w(str2, -1);
                                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                                    i8 = A1.c.w(str2, -1);
                                                } else if ("private".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    jVar3 = jVar2;
                                                    c0385x4 = c0385x3;
                                                    size = i2;
                                                    z5 = true;
                                                } else if ("public".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    jVar3 = jVar2;
                                                    c0385x4 = c0385x3;
                                                    size = i2;
                                                    z6 = true;
                                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    jVar3 = jVar2;
                                                    c0385x4 = c0385x3;
                                                    size = i2;
                                                    z7 = true;
                                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                                    i9 = A1.c.w(str2, Integer.MAX_VALUE);
                                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                                    i10 = A1.c.w(str2, -1);
                                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    jVar3 = jVar2;
                                                    c0385x4 = c0385x3;
                                                    size = i2;
                                                    z8 = true;
                                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    jVar3 = jVar2;
                                                    c0385x4 = c0385x3;
                                                    size = i2;
                                                    z9 = true;
                                                } else if ("immutable".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    jVar3 = jVar2;
                                                    c0385x4 = c0385x3;
                                                    size = i2;
                                                    z10 = true;
                                                }
                                                i = i3;
                                                jVar3 = jVar2;
                                                c0385x4 = c0385x3;
                                                size = i2;
                                            }
                                        }
                                    } else {
                                        i2 = size;
                                    }
                                    int length3 = d.length();
                                    i3 = i13;
                                    while (true) {
                                        if (i3 >= length3) {
                                            i3 = d.length();
                                            break;
                                        }
                                        int i16 = length3;
                                        if (d.D(",;", d.charAt(i3))) {
                                            break;
                                        }
                                        i3++;
                                        length3 = i16;
                                    }
                                    String substring3 = d.substring(i13, i3);
                                    k1.e.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str2 = d.T(substring3).toString();
                                    if ("no-cache".equalsIgnoreCase(obj)) {
                                    }
                                }
                            } else {
                                jVar2 = jVar3;
                            }
                            i2 = size;
                            i3 = i11 + 1;
                            str2 = null;
                            if ("no-cache".equalsIgnoreCase(obj)) {
                            }
                        }
                        i6++;
                        jVar3 = jVar3;
                        c0385x4 = c0385x4;
                        size = size;
                    }
                } else if (!l.y(b2, "Pragma")) {
                    i6++;
                    jVar3 = jVar3;
                    c0385x4 = c0385x4;
                    size = size;
                }
                z2 = false;
                i = 0;
                while (i < d.length()) {
                }
                i6++;
                jVar3 = jVar3;
                c0385x4 = c0385x4;
                size = size;
            }
            c0385x = c0385x4;
            cVar = new c(z3, z4, i7, i8, z5, z6, z7, i9, i10, z8, z9, z10, !z2 ? null : str3);
            eVar.f485f = cVar;
        } else {
            c0385x = c0385x4;
        }
        if (cVar.f4643j) {
            Object obj2 = null;
            c0385x2 = new C0385x(obj2, 1, obj2);
        } else {
            c0385x2 = c0385x;
        }
        D1.j jVar4 = gVar.f233a;
        e eVar2 = (e) c0385x2.f4231b;
        s sVar = (s) c0385x2.f4232c;
        if (eVar2 == null && sVar == null) {
            s sVar2 = new s(eVar, q.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new j((String[]) new ArrayList(20).toArray(new String[0])), A1.c.f15c, null, null, null, -1L, System.currentTimeMillis(), null);
            k1.e.e(jVar4, "call");
            return sVar2;
        }
        if (eVar2 == null) {
            k1.e.b(sVar);
            r d2 = sVar.d();
            s a2 = a.a(sVar);
            r.b("cacheResponse", a2);
            d2.i = a2;
            s a3 = d2.a();
            k1.e.e(jVar4, "call");
            return a3;
        }
        if (sVar != null) {
            k1.e.e(jVar4, "call");
        }
        s b3 = gVar.b(eVar2);
        String str4 = "networkResponse";
        if (sVar != null) {
            if (b3.d == 304) {
                r d3 = sVar.d();
                ArrayList arrayList = new ArrayList(20);
                j jVar5 = sVar.f4763f;
                int size2 = jVar5.size();
                int i17 = 0;
                while (true) {
                    jVar = b3.f4763f;
                    if (i17 >= size2) {
                        break;
                    }
                    String b4 = jVar5.b(i17);
                    int i18 = size2;
                    String d4 = jVar5.d(i17);
                    j jVar6 = jVar5;
                    if ("Warning".equalsIgnoreCase(b4)) {
                        str = str4;
                    } else {
                        str = str4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !a.b(b4) || jVar.a(b4) == null) {
                        k1.e.e(b4, "name");
                        k1.e.e(d4, "value");
                        arrayList.add(b4);
                        arrayList.add(d.T(d4).toString());
                    }
                    i17++;
                    size2 = i18;
                    jVar5 = jVar6;
                    str4 = str;
                }
                String str5 = str4;
                int size3 = jVar.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    String b5 = jVar.b(i19);
                    if (!"Content-Length".equalsIgnoreCase(b5) && !"Content-Encoding".equalsIgnoreCase(b5) && !"Content-Type".equalsIgnoreCase(b5) && a.b(b5)) {
                        String d5 = jVar.d(i19);
                        k1.e.e(b5, "name");
                        k1.e.e(d5, "value");
                        arrayList.add(b5);
                        arrayList.add(d.T(d5).toString());
                    }
                }
                d3.f4753f = new j((String[]) arrayList.toArray(new String[0])).c();
                d3.f4756k = b3.f4766k;
                d3.f4757l = b3.f4767l;
                s a4 = a.a(sVar);
                r.b("cacheResponse", a4);
                d3.i = a4;
                s a5 = a.a(b3);
                r.b(str5, a5);
                d3.h = a5;
                d3.a();
                h hVar = b3.f4764g;
                k1.e.b(hVar);
                hVar.close();
                k1.e.b(null);
                throw null;
            }
            h hVar2 = sVar.f4764g;
            if (hVar2 != null) {
                A1.c.b(hVar2);
            }
        }
        r d6 = b3.d();
        s a6 = a.a(sVar);
        r.b("cacheResponse", a6);
        d6.i = a6;
        s a7 = a.a(b3);
        r.b("networkResponse", a7);
        d6.h = a7;
        return d6.a();
    }
}
