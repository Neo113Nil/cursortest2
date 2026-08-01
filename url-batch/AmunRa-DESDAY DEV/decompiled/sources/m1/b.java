package m1;

import B.j;
import H.e;
import java.util.ArrayList;
import k1.d;
import k1.l;
import k1.o;
import k1.s;
import k1.t;
import k1.u;
import k1.v;
import p1.f;

/* loaded from: classes.dex */
public final class b implements o {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ce, code lost:
    
        if (g1.l.s0(r7, "1", false) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // k1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(f fVar) {
        j jVar;
        j jVar2;
        l lVar;
        String str;
        int i;
        j jVar3;
        l lVar2;
        int i2;
        String str2;
        int i3;
        System.currentTimeMillis();
        e eVar = fVar.f3470e;
        j jVar4 = new j(eVar, 16, (Object) null);
        d dVar = (d) eVar.f201f;
        if (dVar == null) {
            int i4 = d.f2771n;
            l lVar3 = (l) eVar.d;
            int size = lVar3.size();
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
                String b2 = lVar3.b(i5);
                String d = lVar3.d(i5);
                if (g1.l.o0(b2, "Cache-Control")) {
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
                                if (g1.d.t0("=,;", d.charAt(i10))) {
                                    break;
                                }
                                i10++;
                                jVar4 = jVar3;
                            }
                            String substring = d.substring(i, i10);
                            Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = g1.d.I0(substring).toString();
                            if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                                lVar2 = lVar3;
                                i2 = i10 + 1;
                                str2 = null;
                            } else {
                                int i11 = i10 + 1;
                                byte[] bArr = l1.b.f3252a;
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
                                    lVar2 = lVar3;
                                    if (d.charAt(i11) == '\"') {
                                        int i13 = i11 + i3;
                                        int x02 = g1.d.x0(d, '\"', i13, false, 4);
                                        str2 = d.substring(i13, x02);
                                        Z0.d.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i2 = x02 + 1;
                                    }
                                } else {
                                    lVar2 = lVar3;
                                }
                                int length3 = d.length();
                                i2 = i11;
                                while (true) {
                                    if (i2 >= length3) {
                                        i2 = d.length();
                                        break;
                                    }
                                    int i14 = length3;
                                    if (g1.d.t0(",;", d.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                    length3 = i14;
                                }
                                String substring2 = d.substring(i11, i2);
                                Z0.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str2 = g1.d.I0(substring2).toString();
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar4 = jVar3;
                                lVar3 = lVar2;
                                z3 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar4 = jVar3;
                                lVar3 = lVar2;
                                z4 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i6 = l1.b.w(str2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i7 = l1.b.w(str2, -1);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    lVar3 = lVar2;
                                    z5 = true;
                                } else if ("public".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    lVar3 = lVar2;
                                    z6 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    lVar3 = lVar2;
                                    z7 = true;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i8 = l1.b.w(str2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i9 = l1.b.w(str2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    lVar3 = lVar2;
                                    z8 = true;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    lVar3 = lVar2;
                                    z9 = true;
                                } else {
                                    boolean equalsIgnoreCase = "immutable".equalsIgnoreCase(obj);
                                    i = i2;
                                    jVar4 = jVar3;
                                    lVar3 = lVar2;
                                    if (equalsIgnoreCase) {
                                        z10 = true;
                                    }
                                }
                                i = i2;
                                jVar4 = jVar3;
                                lVar3 = lVar2;
                            }
                        }
                        i5++;
                        jVar4 = jVar4;
                        lVar3 = lVar3;
                    }
                } else if (!g1.l.o0(b2, "Pragma")) {
                    i5++;
                    jVar4 = jVar4;
                    lVar3 = lVar3;
                }
                z2 = false;
                i = 0;
                while (i < d.length()) {
                }
                i5++;
                jVar4 = jVar4;
                lVar3 = lVar3;
            }
            jVar = jVar4;
            dVar = new d(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str3);
            eVar.f201f = dVar;
        } else {
            jVar = jVar4;
        }
        if (dVar.f2778j) {
            Object obj2 = null;
            jVar2 = new j(obj2, 16, obj2);
        } else {
            jVar2 = jVar;
        }
        o1.j jVar5 = fVar.f3467a;
        e eVar2 = (e) jVar2.f25b;
        u uVar = (u) jVar2.f26c;
        if (eVar2 == null && uVar == null) {
            u uVar2 = new u(eVar, s.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) new ArrayList(20).toArray(new String[0])), l1.b.f3254c, null, null, null, -1L, System.currentTimeMillis(), null);
            Z0.d.e(jVar5, "call");
            return uVar2;
        }
        if (eVar2 == null) {
            Z0.d.b(uVar);
            t h = uVar.h();
            u a2 = a.a(uVar);
            t.b("cacheResponse", a2);
            h.i = a2;
            u a3 = h.a();
            Z0.d.e(jVar5, "call");
            return a3;
        }
        if (uVar != null) {
            Z0.d.e(jVar5, "call");
        }
        u b3 = fVar.b(eVar2);
        String str4 = "networkResponse";
        if (uVar != null) {
            if (b3.d == 304) {
                t h2 = uVar.h();
                ArrayList arrayList = new ArrayList(20);
                l lVar4 = uVar.f2901f;
                int size2 = lVar4.size();
                int i15 = 0;
                while (true) {
                    lVar = b3.f2901f;
                    if (i15 >= size2) {
                        break;
                    }
                    String b4 = lVar4.b(i15);
                    int i16 = size2;
                    String d2 = lVar4.d(i15);
                    l lVar5 = lVar4;
                    if ("Warning".equalsIgnoreCase(b4)) {
                        str = str4;
                    } else {
                        str = str4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !a.b(b4) || lVar.a(b4) == null) {
                        Z0.d.e(b4, "name");
                        Z0.d.e(d2, "value");
                        arrayList.add(b4);
                        arrayList.add(g1.d.I0(d2).toString());
                    }
                    i15++;
                    size2 = i16;
                    lVar4 = lVar5;
                    str4 = str;
                }
                String str5 = str4;
                int size3 = lVar.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    String b5 = lVar.b(i17);
                    if (!"Content-Length".equalsIgnoreCase(b5) && !"Content-Encoding".equalsIgnoreCase(b5) && !"Content-Type".equalsIgnoreCase(b5) && a.b(b5)) {
                        String d3 = lVar.d(i17);
                        Z0.d.e(b5, "name");
                        Z0.d.e(d3, "value");
                        arrayList.add(b5);
                        arrayList.add(g1.d.I0(d3).toString());
                    }
                }
                h2.f2891f = new l((String[]) arrayList.toArray(new String[0])).c();
                h2.f2894k = b3.f2904k;
                h2.f2895l = b3.f2905l;
                u a4 = a.a(uVar);
                t.b("cacheResponse", a4);
                h2.i = a4;
                u a5 = a.a(b3);
                t.b(str5, a5);
                h2.h = a5;
                h2.a();
                v vVar = b3.f2902g;
                Z0.d.b(vVar);
                vVar.close();
                Z0.d.b(null);
                throw null;
            }
            v vVar2 = uVar.f2902g;
            if (vVar2 != null) {
                l1.b.b(vVar2);
            }
        }
        t h3 = b3.h();
        u a6 = a.a(uVar);
        t.b("cacheResponse", a6);
        h3.i = a6;
        u a7 = a.a(b3);
        t.b("networkResponse", a7);
        h3.h = a7;
        return h3.a();
    }
}
