package r1;

import B.j;
import H.e;
import java.util.ArrayList;
import l1.d;
import l1.l;
import p1.c;
import p1.k;
import p1.n;
import p1.r;
import p1.s;
import p1.t;
import p1.u;
import u1.f;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ce, code lost:
    
        if (l1.l.u(r7, "1", false) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // p1.n
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
        e eVar = fVar.f3828e;
        j jVar4 = new j(eVar, 17, (Object) null);
        c cVar = (c) eVar.f261f;
        if (cVar == null) {
            int i4 = c.f3305n;
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
                if (l.q(b2, "Cache-Control")) {
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
                                if (d.v("=,;", d.charAt(i10))) {
                                    break;
                                }
                                i10++;
                                jVar4 = jVar3;
                            }
                            String substring = d.substring(i, i10);
                            e1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = d.K(substring).toString();
                            if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                                kVar2 = kVar3;
                                i2 = i10 + 1;
                                str2 = null;
                            } else {
                                int i11 = i10 + 1;
                                byte[] bArr = q1.b.f3491a;
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
                                        int z11 = d.z(d, '\"', i13, false, 4);
                                        str2 = d.substring(i13, z11);
                                        e1.d.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i2 = z11 + 1;
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
                                    if (d.v(",;", d.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                    length3 = i14;
                                }
                                String substring2 = d.substring(i11, i2);
                                e1.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str2 = d.K(substring2).toString();
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
                                    i6 = q1.b.w(str2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i7 = q1.b.w(str2, -1);
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
                                    i8 = q1.b.w(str2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i9 = q1.b.w(str2, -1);
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
                } else if (!l.q(b2, "Pragma")) {
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
            eVar.f261f = cVar;
        } else {
            jVar = jVar4;
        }
        if (cVar.f3312j) {
            Object obj2 = null;
            jVar2 = new j(obj2, 17, obj2);
        } else {
            jVar2 = jVar;
        }
        t1.j jVar5 = fVar.f3825a;
        e eVar2 = (e) jVar2.f25b;
        t tVar = (t) jVar2.f26c;
        if (eVar2 == null && tVar == null) {
            t tVar2 = new t(eVar, r.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new k((String[]) new ArrayList(20).toArray(new String[0])), q1.b.f3493c, null, null, null, -1L, System.currentTimeMillis(), null);
            e1.d.e(jVar5, "call");
            return tVar2;
        }
        if (eVar2 == null) {
            e1.d.b(tVar);
            s h = tVar.h();
            t a2 = a.a(tVar);
            s.b("cacheResponse", a2);
            h.i = a2;
            t a3 = h.a();
            e1.d.e(jVar5, "call");
            return a3;
        }
        if (tVar != null) {
            e1.d.e(jVar5, "call");
        }
        t b3 = fVar.b(eVar2);
        String str4 = "networkResponse";
        if (tVar != null) {
            if (b3.d == 304) {
                s h2 = tVar.h();
                ArrayList arrayList = new ArrayList(20);
                k kVar4 = tVar.f3433f;
                int size2 = kVar4.size();
                int i15 = 0;
                while (true) {
                    kVar = b3.f3433f;
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
                        e1.d.e(b4, "name");
                        e1.d.e(d2, "value");
                        arrayList.add(b4);
                        arrayList.add(d.K(d2).toString());
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
                        e1.d.e(b5, "name");
                        e1.d.e(d3, "value");
                        arrayList.add(b5);
                        arrayList.add(d.K(d3).toString());
                    }
                }
                h2.f3423f = new k((String[]) arrayList.toArray(new String[0])).c();
                h2.f3426k = b3.f3436k;
                h2.f3427l = b3.f3437l;
                t a4 = a.a(tVar);
                s.b("cacheResponse", a4);
                h2.i = a4;
                t a5 = a.a(b3);
                s.b(str5, a5);
                h2.h = a5;
                h2.a();
                u uVar = b3.f3434g;
                e1.d.b(uVar);
                uVar.close();
                e1.d.b(null);
                throw null;
            }
            u uVar2 = tVar.f3434g;
            if (uVar2 != null) {
                q1.b.b(uVar2);
            }
        }
        s h3 = b3.h();
        t a6 = a.a(tVar);
        s.b("cacheResponse", a6);
        h3.i = a6;
        t a7 = a.a(b3);
        s.b("networkResponse", a7);
        h3.h = a7;
        return h3.a();
    }
}
