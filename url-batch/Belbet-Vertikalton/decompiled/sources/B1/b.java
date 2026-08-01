package B1;

import D1.j;
import E1.g;
import J.d;
import j1.h;
import java.util.ArrayList;
import q1.e;
import z1.m;
import z1.p;
import z1.t;
import z1.u;
import z1.v;

/* loaded from: classes.dex */
public final class b implements p {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02eb, code lost:
    
        if (q1.m.s0(r7, "1", false) != false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142 A[SYNTHETIC] */
    @Override // z1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v a(g gVar) {
        c cVar;
        c cVar2;
        m mVar;
        String str;
        int i;
        c cVar3;
        m mVar2;
        int i2;
        int i3;
        String str2;
        int i4;
        System.currentTimeMillis();
        d dVar = gVar.e;
        c cVar4 = new c(dVar, 0, (Object) null);
        z1.d dVar2 = (z1.d) dVar.f628f;
        if (dVar2 == null) {
            int i5 = z1.d.f4817n;
            m mVar3 = (m) dVar.f627d;
            int size = mVar3.size();
            String str3 = null;
            int i6 = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = true;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            while (i6 < size) {
                String b2 = mVar3.b(i6);
                String d2 = mVar3.d(i6);
                if (q1.m.o0(b2, "Cache-Control")) {
                    if (str3 == null) {
                        str3 = d2;
                        i = 0;
                        while (i < d2.length()) {
                            int length = d2.length();
                            int i11 = i;
                            while (true) {
                                if (i11 >= length) {
                                    cVar3 = cVar4;
                                    i11 = d2.length();
                                    break;
                                }
                                int i12 = length;
                                cVar3 = cVar4;
                                if (e.t0("=,;", d2.charAt(i11))) {
                                    break;
                                }
                                i11++;
                                length = i12;
                                cVar4 = cVar3;
                            }
                            String substring = d2.substring(i, i11);
                            h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = e.L0(substring).toString();
                            if (i11 != d2.length()) {
                                mVar2 = mVar3;
                                if (d2.charAt(i11) != ',' && d2.charAt(i11) != ';') {
                                    int i13 = i11 + 1;
                                    byte[] bArr = A1.c.f19a;
                                    int length2 = d2.length();
                                    while (true) {
                                        if (i13 >= length2) {
                                            i4 = 1;
                                            i13 = d2.length();
                                            break;
                                        }
                                        char charAt = d2.charAt(i13);
                                        int i14 = length2;
                                        if (charAt != ' ' && charAt != '\t') {
                                            i4 = 1;
                                            break;
                                        }
                                        i13++;
                                        length2 = i14;
                                    }
                                    if (i13 < d2.length()) {
                                        i2 = size;
                                        if (d2.charAt(i13) == '\"') {
                                            int i15 = i13 + i4;
                                            int y02 = e.y0(d2, '\"', i15, false, 4);
                                            String substring2 = d2.substring(i15, y02);
                                            h.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            i3 = y02 + 1;
                                            str2 = substring2;
                                            if ("no-cache".equalsIgnoreCase(obj)) {
                                                i = i3;
                                                mVar3 = mVar2;
                                                cVar4 = cVar3;
                                                size = i2;
                                                z2 = true;
                                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                                i = i3;
                                                mVar3 = mVar2;
                                                cVar4 = cVar3;
                                                size = i2;
                                                z3 = true;
                                            } else {
                                                if ("max-age".equalsIgnoreCase(obj)) {
                                                    i7 = A1.c.w(str2, -1);
                                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                                    i8 = A1.c.w(str2, -1);
                                                } else if ("private".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    mVar3 = mVar2;
                                                    cVar4 = cVar3;
                                                    size = i2;
                                                    z4 = true;
                                                } else if ("public".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    mVar3 = mVar2;
                                                    cVar4 = cVar3;
                                                    size = i2;
                                                    z5 = true;
                                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    mVar3 = mVar2;
                                                    cVar4 = cVar3;
                                                    size = i2;
                                                    z6 = true;
                                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                                    i9 = A1.c.w(str2, Integer.MAX_VALUE);
                                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                                    i10 = A1.c.w(str2, -1);
                                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    mVar3 = mVar2;
                                                    cVar4 = cVar3;
                                                    size = i2;
                                                    z7 = true;
                                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    mVar3 = mVar2;
                                                    cVar4 = cVar3;
                                                    size = i2;
                                                    z8 = true;
                                                } else if ("immutable".equalsIgnoreCase(obj)) {
                                                    i = i3;
                                                    mVar3 = mVar2;
                                                    cVar4 = cVar3;
                                                    size = i2;
                                                    z9 = true;
                                                }
                                                i = i3;
                                                mVar3 = mVar2;
                                                cVar4 = cVar3;
                                                size = i2;
                                            }
                                        }
                                    } else {
                                        i2 = size;
                                    }
                                    int length3 = d2.length();
                                    i3 = i13;
                                    while (true) {
                                        if (i3 >= length3) {
                                            i3 = d2.length();
                                            break;
                                        }
                                        int i16 = length3;
                                        if (e.t0(",;", d2.charAt(i3))) {
                                            break;
                                        }
                                        i3++;
                                        length3 = i16;
                                    }
                                    String substring3 = d2.substring(i13, i3);
                                    h.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str2 = e.L0(substring3).toString();
                                    if ("no-cache".equalsIgnoreCase(obj)) {
                                    }
                                }
                            } else {
                                mVar2 = mVar3;
                            }
                            i2 = size;
                            i3 = i11 + 1;
                            str2 = null;
                            if ("no-cache".equalsIgnoreCase(obj)) {
                            }
                        }
                        i6++;
                        mVar3 = mVar3;
                        cVar4 = cVar4;
                        size = size;
                    }
                } else if (!q1.m.o0(b2, "Pragma")) {
                    i6++;
                    mVar3 = mVar3;
                    cVar4 = cVar4;
                    size = size;
                }
                z10 = false;
                i = 0;
                while (i < d2.length()) {
                }
                i6++;
                mVar3 = mVar3;
                cVar4 = cVar4;
                size = size;
            }
            cVar = cVar4;
            dVar2 = new z1.d(z2, z3, i7, i8, z4, z5, z6, i9, i10, z7, z8, z9, !z10 ? null : str3);
            dVar.f628f = dVar2;
        } else {
            cVar = cVar4;
        }
        if (dVar2.j) {
            Object obj2 = null;
            cVar2 = new c(obj2, 0, obj2);
        } else {
            cVar2 = cVar;
        }
        j jVar = gVar.f305a;
        d dVar3 = (d) cVar2.f68b;
        v vVar = (v) cVar2.f69c;
        if (dVar3 == null && vVar == null) {
            v vVar2 = new v(dVar, t.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new m((String[]) new ArrayList(20).toArray(new String[0])), A1.c.f21c, null, null, null, -1L, System.currentTimeMillis(), null);
            h.e(jVar, "call");
            return vVar2;
        }
        if (dVar3 == null) {
            h.b(vVar);
            u d3 = vVar.d();
            v a2 = a.a(vVar);
            u.b("cacheResponse", a2);
            d3.i = a2;
            v a3 = d3.a();
            h.e(jVar, "call");
            return a3;
        }
        if (vVar != null) {
            h.e(jVar, "call");
        }
        v b3 = gVar.b(dVar3);
        String str4 = "networkResponse";
        if (vVar != null) {
            if (b3.f4947d == 304) {
                u d4 = vVar.d();
                ArrayList arrayList = new ArrayList(20);
                m mVar4 = vVar.f4948f;
                int size2 = mVar4.size();
                int i17 = 0;
                while (true) {
                    mVar = b3.f4948f;
                    if (i17 >= size2) {
                        break;
                    }
                    String b4 = mVar4.b(i17);
                    int i18 = size2;
                    String d5 = mVar4.d(i17);
                    m mVar5 = mVar4;
                    if ("Warning".equalsIgnoreCase(b4)) {
                        str = str4;
                    } else {
                        str = str4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !a.b(b4) || mVar.a(b4) == null) {
                        h.e(b4, "name");
                        h.e(d5, "value");
                        arrayList.add(b4);
                        arrayList.add(e.L0(d5).toString());
                    }
                    i17++;
                    size2 = i18;
                    mVar4 = mVar5;
                    str4 = str;
                }
                String str5 = str4;
                int size3 = mVar.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    String b5 = mVar.b(i19);
                    if (!"Content-Length".equalsIgnoreCase(b5) && !"Content-Encoding".equalsIgnoreCase(b5) && !"Content-Type".equalsIgnoreCase(b5) && a.b(b5)) {
                        String d6 = mVar.d(i19);
                        h.e(b5, "name");
                        h.e(d6, "value");
                        arrayList.add(b5);
                        arrayList.add(e.L0(d6).toString());
                    }
                }
                d4.f4938f = new m((String[]) arrayList.toArray(new String[0])).c();
                d4.f4941k = b3.f4951k;
                d4.f4942l = b3.f4952l;
                v a4 = a.a(vVar);
                u.b("cacheResponse", a4);
                d4.i = a4;
                v a5 = a.a(b3);
                u.b(str5, a5);
                d4.f4940h = a5;
                d4.a();
                E1.h hVar = b3.f4949g;
                h.b(hVar);
                hVar.close();
                h.b(null);
                throw null;
            }
            E1.h hVar2 = vVar.f4949g;
            if (hVar2 != null) {
                A1.c.b(hVar2);
            }
        }
        u d7 = b3.d();
        v a6 = a.a(vVar);
        u.b("cacheResponse", a6);
        d7.i = a6;
        v a7 = a.a(b3);
        u.b("networkResponse", a7);
        d7.f4940h = a7;
        return d7.a();
    }
}
