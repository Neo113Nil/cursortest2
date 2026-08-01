package k1;

import B.j;
import H.e;
import e1.d;
import e1.l;
import i1.c;
import i1.k;
import i1.n;
import i1.q;
import i1.s;
import i1.t;
import i1.u;
import java.util.ArrayList;
import n1.f;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ce, code lost:
    
        if (e1.l.i0(r7, "1", false) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // i1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t a(f fVar) {
        j jVar;
        j jVar2;
        k kVar;
        String str;
        int i;
        j jVar3;
        k kVar2;
        int i2;
        String str2;
        int i3;
        System.currentTimeMillis();
        e eVar = fVar.f3295e;
        j jVar4 = new j(eVar, 16, (Object) null);
        c cVar = (c) eVar.f215f;
        if (cVar == null) {
            int i4 = c.f2395n;
            k kVar3 = (k) eVar.d;
            int size = kVar3.size();
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
                String b2 = kVar3.b(i5);
                String d = kVar3.d(i5);
                if (l.e0(b2, "Cache-Control")) {
                    if (str3 == null) {
                        str3 = d;
                        i = 0;
                        while (i < d.length()) {
                            int length = d.length();
                            int i10 = i;
                            while (true) {
                                if (i10 >= length) {
                                    jVar3 = jVar4;
                                    i10 = d.length();
                                    break;
                                }
                                jVar3 = jVar4;
                                if (d.j0("=,;", d.charAt(i10))) {
                                    break;
                                }
                                i10++;
                                jVar4 = jVar3;
                            }
                            String substring = d.substring(i, i10);
                            X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = d.y0(substring).toString();
                            if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                                kVar2 = kVar3;
                                i2 = i10 + 1;
                                str2 = null;
                            } else {
                                int i11 = i10 + 1;
                                byte[] bArr = j1.b.f2587a;
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
                                    kVar2 = kVar3;
                                    if (d.charAt(i11) == '\"') {
                                        int i13 = i11 + i3;
                                        int n02 = d.n0(d, '\"', i13, false, 4);
                                        str2 = d.substring(i13, n02);
                                        X0.d.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i2 = n02 + 1;
                                    }
                                } else {
                                    kVar2 = kVar3;
                                }
                                int length3 = d.length();
                                i2 = i11;
                                while (true) {
                                    if (i2 >= length3) {
                                        i2 = d.length();
                                        break;
                                    }
                                    int i14 = length3;
                                    if (d.j0(",;", d.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                    length3 = i14;
                                }
                                String substring2 = d.substring(i11, i2);
                                X0.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str2 = d.y0(substring2).toString();
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar4 = jVar3;
                                kVar3 = kVar2;
                                z3 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar4 = jVar3;
                                kVar3 = kVar2;
                                z4 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i6 = j1.b.v(str2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i7 = j1.b.v(str2, -1);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    kVar3 = kVar2;
                                    z5 = true;
                                } else if ("public".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    kVar3 = kVar2;
                                    z6 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    kVar3 = kVar2;
                                    z7 = true;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i8 = j1.b.v(str2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i9 = j1.b.v(str2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    kVar3 = kVar2;
                                    z8 = true;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    kVar3 = kVar2;
                                    z9 = true;
                                } else {
                                    boolean equalsIgnoreCase = "immutable".equalsIgnoreCase(obj);
                                    i = i2;
                                    jVar4 = jVar3;
                                    kVar3 = kVar2;
                                    if (equalsIgnoreCase) {
                                        z10 = true;
                                    }
                                }
                                i = i2;
                                jVar4 = jVar3;
                                kVar3 = kVar2;
                            }
                        }
                        i5++;
                        jVar4 = jVar4;
                        kVar3 = kVar3;
                    }
                } else if (!l.e0(b2, "Pragma")) {
                    i5++;
                    jVar4 = jVar4;
                    kVar3 = kVar3;
                }
                z2 = false;
                i = 0;
                while (i < d.length()) {
                }
                i5++;
                jVar4 = jVar4;
                kVar3 = kVar3;
            }
            jVar = jVar4;
            cVar = new c(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str3);
            eVar.f215f = cVar;
        } else {
            jVar = jVar4;
        }
        if (cVar.f2402j) {
            Object obj2 = null;
            jVar2 = new j(obj2, 16, obj2);
        } else {
            jVar2 = jVar;
        }
        m1.j jVar5 = fVar.f3292a;
        e eVar2 = (e) jVar2.f30b;
        t tVar = (t) jVar2.f31c;
        if (eVar2 == null && tVar == null) {
            t tVar2 = new t(eVar, q.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new k((String[]) new ArrayList(20).toArray(new String[0])), j1.b.f2589c, null, null, null, -1L, System.currentTimeMillis(), null);
            X0.d.e(jVar5, "call");
            return tVar2;
        }
        if (eVar2 == null) {
            X0.d.b(tVar);
            s f2 = tVar.f();
            t a2 = a.a(tVar);
            s.b(a2, "cacheResponse");
            f2.i = a2;
            t a3 = f2.a();
            X0.d.e(jVar5, "call");
            return a3;
        }
        if (tVar != null) {
            X0.d.e(jVar5, "call");
        }
        t b3 = fVar.b(eVar2);
        String str4 = "networkResponse";
        if (tVar != null) {
            if (b3.d == 304) {
                s f3 = tVar.f();
                ArrayList arrayList = new ArrayList(20);
                k kVar4 = tVar.f2510f;
                int size2 = kVar4.size();
                int i15 = 0;
                while (true) {
                    kVar = b3.f2510f;
                    if (i15 >= size2) {
                        break;
                    }
                    String b4 = kVar4.b(i15);
                    int i16 = size2;
                    String d2 = kVar4.d(i15);
                    k kVar5 = kVar4;
                    if ("Warning".equalsIgnoreCase(b4)) {
                        str = str4;
                    } else {
                        str = str4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !a.b(b4) || kVar.a(b4) == null) {
                        X0.d.e(b4, "name");
                        X0.d.e(d2, "value");
                        arrayList.add(b4);
                        arrayList.add(d.y0(d2).toString());
                    }
                    i15++;
                    size2 = i16;
                    kVar4 = kVar5;
                    str4 = str;
                }
                String str5 = str4;
                int size3 = kVar.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    String b5 = kVar.b(i17);
                    if (!"Content-Length".equalsIgnoreCase(b5) && !"Content-Encoding".equalsIgnoreCase(b5) && !"Content-Type".equalsIgnoreCase(b5) && a.b(b5)) {
                        String d3 = kVar.d(i17);
                        X0.d.e(b5, "name");
                        X0.d.e(d3, "value");
                        arrayList.add(b5);
                        arrayList.add(d.y0(d3).toString());
                    }
                }
                f3.f2500f = new k((String[]) arrayList.toArray(new String[0])).c();
                f3.f2503k = b3.f2513k;
                f3.f2504l = b3.f2514l;
                t a4 = a.a(tVar);
                s.b(a4, "cacheResponse");
                f3.i = a4;
                t a5 = a.a(b3);
                s.b(a5, str5);
                f3.h = a5;
                f3.a();
                u uVar = b3.f2511g;
                X0.d.b(uVar);
                uVar.close();
                X0.d.b(null);
                throw null;
            }
            u uVar2 = tVar.f2511g;
            if (uVar2 != null) {
                j1.b.b(uVar2);
            }
        }
        s f4 = b3.f();
        t a6 = a.a(tVar);
        s.b(a6, "cacheResponse");
        f4.i = a6;
        t a7 = a.a(b3);
        s.b(a7, "networkResponse");
        f4.h = a7;
        return f4.a();
    }
}
