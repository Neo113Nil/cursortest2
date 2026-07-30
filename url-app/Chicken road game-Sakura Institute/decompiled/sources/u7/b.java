package u7;

import a2.q;
import java.util.ArrayList;
import q5.g;
import s7.c;
import s7.k;
import s7.m;
import s7.r;
import s7.s;
import s7.u;
import x7.f;
import z6.h;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    @Override // s7.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(f fVar) {
        g gVar;
        g gVar2;
        int i7;
        g gVar3;
        k kVar;
        String str;
        System.currentTimeMillis();
        q qVar = fVar.f9692e;
        g gVar4 = new g(qVar, 12, null);
        c cVar = (c) qVar.f435b;
        if (cVar == null) {
            int i8 = c.f8542n;
            k kVar2 = (k) qVar.f438e;
            int size = kVar2.size();
            boolean z8 = true;
            String str2 = null;
            boolean z9 = true;
            int i9 = 0;
            boolean z10 = false;
            boolean z11 = false;
            int i10 = -1;
            int i11 = -1;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int i12 = -1;
            int i13 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            while (i9 < size) {
                String g9 = kVar2.g(i9);
                String w4 = kVar2.w(i9);
                if (o.p(z8, g9, "Cache-Control")) {
                    if (str2 == null) {
                        str2 = w4;
                        i7 = 0;
                        while (i7 < w4.length()) {
                            int length = w4.length();
                            boolean z18 = z8;
                            int i14 = i7;
                            while (true) {
                                if (i14 >= length) {
                                    gVar3 = gVar4;
                                    i14 = w4.length();
                                    break;
                                }
                                gVar3 = gVar4;
                                if (h.x("=,;", w4.charAt(i14))) {
                                    break;
                                }
                                i14++;
                                gVar4 = gVar3;
                            }
                            String substring = w4.substring(i7, i14);
                            r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = h.W(substring).toString();
                            if (i14 == w4.length() || w4.charAt(i14) == ',' || w4.charAt(i14) == ';') {
                                kVar = kVar2;
                                i7 = i14 + 1;
                                str = null;
                            } else {
                                int i15 = i14 + 1;
                                byte[] bArr = t7.b.f8932a;
                                int length2 = w4.length();
                                while (true) {
                                    if (i15 >= length2) {
                                        kVar = kVar2;
                                        i15 = w4.length();
                                        break;
                                    }
                                    char charAt = w4.charAt(i15);
                                    kVar = kVar2;
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i15++;
                                    kVar2 = kVar;
                                }
                                if (i15 >= w4.length() || w4.charAt(i15) != '\"') {
                                    int length3 = w4.length();
                                    int i16 = i15;
                                    while (true) {
                                        if (i16 >= length3) {
                                            i16 = w4.length();
                                            break;
                                        }
                                        int i17 = length3;
                                        if (h.x(",;", w4.charAt(i16))) {
                                            break;
                                        }
                                        i16++;
                                        length3 = i17;
                                    }
                                    String substring2 = w4.substring(i15, i16);
                                    r6.k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    int i18 = i16;
                                    str = h.W(substring2).toString();
                                    i7 = i18;
                                } else {
                                    int i19 = i15 + 1;
                                    int D = h.D(w4, '\"', i19, 4);
                                    str = w4.substring(i19, D);
                                    r6.k.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i7 = D + 1;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                z8 = z18;
                                z10 = z8;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                z8 = z18;
                                z11 = z8;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i10 = t7.b.w(str, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i11 = t7.b.w(str, -1);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    z8 = z18;
                                    z12 = z8;
                                } else if ("public".equalsIgnoreCase(obj)) {
                                    z8 = z18;
                                    z13 = z8;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    z8 = z18;
                                    z14 = z8;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i12 = t7.b.w(str, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i13 = t7.b.w(str, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    z8 = z18;
                                    z15 = z8;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    z8 = z18;
                                    z16 = z8;
                                } else {
                                    z8 = z18;
                                    if ("immutable".equalsIgnoreCase(obj)) {
                                        z17 = z8;
                                    }
                                }
                                z8 = z18;
                            }
                            gVar4 = gVar3;
                            kVar2 = kVar;
                        }
                        i9++;
                        z8 = z8;
                        gVar4 = gVar4;
                        kVar2 = kVar2;
                    }
                } else if (!o.p(z8, g9, "Pragma")) {
                    i9++;
                    z8 = z8;
                    gVar4 = gVar4;
                    kVar2 = kVar2;
                }
                z9 = false;
                i7 = 0;
                while (i7 < w4.length()) {
                }
                i9++;
                z8 = z8;
                gVar4 = gVar4;
                kVar2 = kVar2;
            }
            gVar = gVar4;
            c cVar2 = new c(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, !z9 ? null : str2);
            qVar.f435b = cVar2;
            cVar = cVar2;
        } else {
            gVar = gVar4;
        }
        if (cVar.f8552j) {
            Object obj2 = null;
            gVar2 = new g(obj2, 12, obj2);
        } else {
            gVar2 = gVar;
        }
        q qVar2 = (q) gVar2.f7527g;
        s sVar = (s) gVar2.f7528h;
        if (qVar2 == null && sVar == null) {
            return new s(qVar, s7.q.f8663h, "Unsatisfiable Request (only-if-cached)", 504, null, new k((String[]) new ArrayList(20).toArray(new String[0])), t7.b.f8934c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (qVar2 == null) {
            r6.k.c(sVar);
            r c4 = sVar.c();
            s a3 = a.a(sVar);
            r.b("cacheResponse", a3);
            c4.f8678i = a3;
            return c4.a();
        }
        s b9 = fVar.b(qVar2);
        if (sVar != null) {
            if (b9.f8686i == 304) {
                r c6 = sVar.c();
                k kVar3 = sVar.f8688k;
                k kVar4 = b9.f8688k;
                ArrayList arrayList = new ArrayList(20);
                int size2 = kVar3.size();
                int i20 = 0;
                while (i20 < size2) {
                    String g10 = kVar3.g(i20);
                    int i21 = size2;
                    String w5 = kVar3.w(i20);
                    k kVar5 = kVar3;
                    if ((!"Warning".equalsIgnoreCase(g10) || !o.v(w5, "1")) && ("Content-Length".equalsIgnoreCase(g10) || "Content-Encoding".equalsIgnoreCase(g10) || "Content-Type".equalsIgnoreCase(g10) || !a.b(g10) || kVar4.a(g10) == null)) {
                        r6.k.f(g10, "name");
                        r6.k.f(w5, "value");
                        arrayList.add(g10);
                        arrayList.add(h.W(w5).toString());
                    }
                    i20++;
                    size2 = i21;
                    kVar3 = kVar5;
                }
                int size3 = kVar4.size();
                for (int i22 = 0; i22 < size3; i22++) {
                    String g11 = kVar4.g(i22);
                    if (!"Content-Length".equalsIgnoreCase(g11) && !"Content-Encoding".equalsIgnoreCase(g11) && !"Content-Type".equalsIgnoreCase(g11) && a.b(g11)) {
                        String w8 = kVar4.w(i22);
                        r6.k.f(g11, "name");
                        r6.k.f(w8, "value");
                        arrayList.add(g11);
                        arrayList.add(h.W(w8).toString());
                    }
                }
                c6.f8675f = new k((String[]) arrayList.toArray(new String[0])).m();
                c6.f8680k = b9.f8693p;
                c6.f8681l = b9.f8694q;
                s a9 = a.a(sVar);
                r.b("cacheResponse", a9);
                c6.f8678i = a9;
                s a10 = a.a(b9);
                r.b("networkResponse", a10);
                c6.f8677h = a10;
                c6.a();
                u uVar = b9.f8689l;
                r6.k.c(uVar);
                uVar.close();
                r6.k.c(null);
                throw null;
            }
            u uVar2 = sVar.f8689l;
            if (uVar2 != null) {
                t7.b.c(uVar2);
            }
        }
        r c9 = b9.c();
        s a11 = a.a(sVar);
        r.b("cacheResponse", a11);
        c9.f8678i = a11;
        s a12 = a.a(b9);
        r.b("networkResponse", a12);
        c9.f8677h = a12;
        return c9.a();
    }
}
