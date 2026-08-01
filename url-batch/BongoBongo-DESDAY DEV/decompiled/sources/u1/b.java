package u1;

import C.j;
import I.d;
import java.util.ArrayList;
import o1.l;
import s1.c;
import s1.m;
import s1.p;
import s1.q;
import s1.r;
import s1.s;
import x1.f;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ce, code lost:
    
        if (o1.l.y(r7, "1", false) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // s1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(f fVar) {
        j jVar;
        j jVar2;
        s1.j jVar3;
        String str;
        int i;
        j jVar4;
        s1.j jVar5;
        int i2;
        String str2;
        int i3;
        System.currentTimeMillis();
        d dVar = fVar.f4294e;
        j jVar6 = new j(dVar, 16, (Object) null);
        c cVar = (c) dVar.f323f;
        if (cVar == null) {
            int i4 = c.f3588n;
            s1.j jVar7 = (s1.j) dVar.d;
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
                if (l.u(b2, "Cache-Control")) {
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
                                if (o1.d.z("=,;", d.charAt(i10))) {
                                    break;
                                }
                                i10++;
                                jVar6 = jVar4;
                            }
                            String substring = d.substring(i, i10);
                            h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = o1.d.S(substring).toString();
                            if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                                jVar5 = jVar7;
                                i2 = i10 + 1;
                                str2 = null;
                            } else {
                                int i11 = i10 + 1;
                                byte[] bArr = t1.b.f3898a;
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
                                        int D2 = o1.d.D(d, '\"', i13, false, 4);
                                        str2 = d.substring(i13, D2);
                                        h1.d.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i2 = D2 + 1;
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
                                    if (o1.d.z(",;", d.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                    length3 = i14;
                                }
                                String substring2 = d.substring(i11, i2);
                                h1.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str2 = o1.d.S(substring2).toString();
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
                                    i6 = t1.b.w(str2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i7 = t1.b.w(str2, -1);
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
                                    i8 = t1.b.w(str2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i9 = t1.b.w(str2, -1);
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
                } else if (!l.u(b2, "Pragma")) {
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
            dVar.f323f = cVar;
        } else {
            jVar = jVar6;
        }
        if (cVar.f3596j) {
            Object obj2 = null;
            jVar2 = new j(obj2, 16, obj2);
        } else {
            jVar2 = jVar;
        }
        w1.j jVar8 = fVar.f4291a;
        d dVar2 = (d) jVar2.f86b;
        r rVar = (r) jVar2.f87c;
        if (dVar2 == null && rVar == null) {
            r rVar2 = new r(dVar, p.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new s1.j((String[]) new ArrayList(20).toArray(new String[0])), t1.b.f3900c, null, null, null, -1L, System.currentTimeMillis(), null);
            h1.d.e(jVar8, "call");
            return rVar2;
        }
        if (dVar2 == null) {
            h1.d.b(rVar);
            q h2 = rVar.h();
            r a2 = a.a(rVar);
            q.b("cacheResponse", a2);
            h2.i = a2;
            r a3 = h2.a();
            h1.d.e(jVar8, "call");
            return a3;
        }
        if (rVar != null) {
            h1.d.e(jVar8, "call");
        }
        r b3 = fVar.b(dVar2);
        String str4 = "networkResponse";
        if (rVar != null) {
            if (b3.d == 304) {
                q h3 = rVar.h();
                ArrayList arrayList = new ArrayList(20);
                s1.j jVar9 = rVar.f3706f;
                int size2 = jVar9.size();
                int i15 = 0;
                while (true) {
                    jVar3 = b3.f3706f;
                    if (i15 >= size2) {
                        break;
                    }
                    String b4 = jVar9.b(i15);
                    int i16 = size2;
                    String d2 = jVar9.d(i15);
                    s1.j jVar10 = jVar9;
                    if ("Warning".equalsIgnoreCase(b4)) {
                        str = str4;
                    } else {
                        str = str4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !a.b(b4) || jVar3.a(b4) == null) {
                        h1.d.e(b4, "name");
                        h1.d.e(d2, "value");
                        arrayList.add(b4);
                        arrayList.add(o1.d.S(d2).toString());
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
                        h1.d.e(b5, "name");
                        h1.d.e(d3, "value");
                        arrayList.add(b5);
                        arrayList.add(o1.d.S(d3).toString());
                    }
                }
                h3.f3695f = new s1.j((String[]) arrayList.toArray(new String[0])).c();
                h3.f3699k = b3.f3710k;
                h3.f3700l = b3.f3711l;
                r a4 = a.a(rVar);
                q.b("cacheResponse", a4);
                h3.i = a4;
                r a5 = a.a(b3);
                q.b(str5, a5);
                h3.f3697h = a5;
                h3.a();
                s sVar = b3.f3707g;
                h1.d.b(sVar);
                sVar.close();
                h1.d.b(null);
                throw null;
            }
            s sVar2 = rVar.f3707g;
            if (sVar2 != null) {
                t1.b.b(sVar2);
            }
        }
        q h4 = b3.h();
        r a6 = a.a(rVar);
        q.b("cacheResponse", a6);
        h4.i = a6;
        r a7 = a.a(b3);
        q.b("networkResponse", a7);
        h4.f3697h = a7;
        return h4.a();
    }
}
