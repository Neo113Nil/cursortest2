package k1;

import B.j;
import e1.d;
import e1.l;
import i1.c;
import i1.n;
import i1.q;
import i1.v;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
import java.util.ArrayList;
import n1.f;

/* loaded from: classes.dex */
public final class b implements q {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ca, code lost:
    
        if (e1.l.z0(r7, "1", false) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    @Override // i1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(f fVar) {
        j jVar;
        j jVar2;
        n nVar;
        String str;
        int i;
        j jVar3;
        n nVar2;
        int i2;
        String str2;
        int i3;
        System.currentTimeMillis();
        w wVar = fVar.f3661e;
        j jVar4 = new j(wVar, 14, (Object) null);
        c cVar = wVar.f2780e;
        if (cVar == null) {
            int i4 = c.f2644n;
            n nVar3 = wVar.f2778c;
            int size = nVar3.size();
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
                String b2 = nVar3.b(i5);
                String d2 = nVar3.d(i5);
                if (l.v0(b2, "Cache-Control")) {
                    if (str3 == null) {
                        str3 = d2;
                        i = 0;
                        while (i < d2.length()) {
                            int length = d2.length();
                            int i10 = i;
                            while (true) {
                                if (i10 >= length) {
                                    jVar3 = jVar4;
                                    i10 = d2.length();
                                    break;
                                }
                                jVar3 = jVar4;
                                if (d.A0("=,;", d2.charAt(i10))) {
                                    break;
                                }
                                i10++;
                                jVar4 = jVar3;
                            }
                            String substring = d2.substring(i, i10);
                            X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = d.P0(substring).toString();
                            if (i10 == d2.length() || d2.charAt(i10) == ',' || d2.charAt(i10) == ';') {
                                nVar2 = nVar3;
                                i2 = i10 + 1;
                                str2 = null;
                            } else {
                                int i11 = i10 + 1;
                                byte[] bArr = j1.b.f2967a;
                                int length2 = d2.length();
                                while (true) {
                                    if (i11 >= length2) {
                                        i3 = 1;
                                        i11 = d2.length();
                                        break;
                                    }
                                    char charAt = d2.charAt(i11);
                                    int i12 = length2;
                                    if (charAt != ' ' && charAt != '\t') {
                                        i3 = 1;
                                        break;
                                    }
                                    i11++;
                                    length2 = i12;
                                }
                                if (i11 < d2.length()) {
                                    nVar2 = nVar3;
                                    if (d2.charAt(i11) == '\"') {
                                        int i13 = i11 + i3;
                                        int E02 = d.E0(d2, '\"', i13, false, 4);
                                        str2 = d2.substring(i13, E02);
                                        X0.f.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i2 = E02 + 1;
                                    }
                                } else {
                                    nVar2 = nVar3;
                                }
                                int length3 = d2.length();
                                i2 = i11;
                                while (true) {
                                    if (i2 >= length3) {
                                        i2 = d2.length();
                                        break;
                                    }
                                    int i14 = length3;
                                    if (d.A0(",;", d2.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                    length3 = i14;
                                }
                                String substring2 = d2.substring(i11, i2);
                                X0.f.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str2 = d.P0(substring2).toString();
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar4 = jVar3;
                                nVar3 = nVar2;
                                z3 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                i = i2;
                                jVar4 = jVar3;
                                nVar3 = nVar2;
                                z4 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i6 = j1.b.w(str2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i7 = j1.b.w(str2, -1);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    nVar3 = nVar2;
                                    z5 = true;
                                } else if ("public".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    nVar3 = nVar2;
                                    z6 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    nVar3 = nVar2;
                                    z7 = true;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i8 = j1.b.w(str2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i9 = j1.b.w(str2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    nVar3 = nVar2;
                                    z8 = true;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    i = i2;
                                    jVar4 = jVar3;
                                    nVar3 = nVar2;
                                    z9 = true;
                                } else {
                                    boolean equalsIgnoreCase = "immutable".equalsIgnoreCase(obj);
                                    i = i2;
                                    jVar4 = jVar3;
                                    nVar3 = nVar2;
                                    if (equalsIgnoreCase) {
                                        z10 = true;
                                    }
                                }
                                i = i2;
                                jVar4 = jVar3;
                                nVar3 = nVar2;
                            }
                        }
                        i5++;
                        jVar4 = jVar4;
                        nVar3 = nVar3;
                    }
                } else if (!l.v0(b2, "Pragma")) {
                    i5++;
                    jVar4 = jVar4;
                    nVar3 = nVar3;
                }
                z2 = false;
                i = 0;
                while (i < d2.length()) {
                }
                i5++;
                jVar4 = jVar4;
                nVar3 = nVar3;
            }
            jVar = jVar4;
            cVar = new c(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str3);
            wVar.f2780e = cVar;
        } else {
            jVar = jVar4;
        }
        if (cVar.f2652j) {
            Object obj2 = null;
            jVar2 = new j(obj2, 14, obj2);
        } else {
            jVar2 = jVar;
        }
        m1.j jVar5 = fVar.f3657a;
        w wVar2 = (w) jVar2.f36b;
        y yVar = (y) jVar2.f37c;
        if (wVar2 == null && yVar == null) {
            y yVar2 = new y(wVar, v.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new n((String[]) new ArrayList(20).toArray(new String[0])), j1.b.f2969c, null, null, null, -1L, System.currentTimeMillis(), null);
            X0.f.e(jVar5, "call");
            return yVar2;
        }
        if (wVar2 == null) {
            X0.f.b(yVar);
            x h = yVar.h();
            y a2 = a.a(yVar);
            x.b(a2, "cacheResponse");
            h.i = a2;
            y a3 = h.a();
            X0.f.e(jVar5, "call");
            return a3;
        }
        if (yVar != null) {
            X0.f.e(jVar5, "call");
        }
        y b3 = fVar.b(wVar2);
        String str4 = "networkResponse";
        if (yVar != null) {
            if (b3.f2795d == 304) {
                x h2 = yVar.h();
                ArrayList arrayList = new ArrayList(20);
                n nVar4 = yVar.f2797f;
                int size2 = nVar4.size();
                int i15 = 0;
                while (true) {
                    nVar = b3.f2797f;
                    if (i15 >= size2) {
                        break;
                    }
                    String b4 = nVar4.b(i15);
                    int i16 = size2;
                    String d3 = nVar4.d(i15);
                    n nVar5 = nVar4;
                    if ("Warning".equalsIgnoreCase(b4)) {
                        str = str4;
                    } else {
                        str = str4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !a.b(b4) || nVar.a(b4) == null) {
                        X0.f.e(b4, "name");
                        X0.f.e(d3, "value");
                        arrayList.add(b4);
                        arrayList.add(d.P0(d3).toString());
                    }
                    i15++;
                    size2 = i16;
                    nVar4 = nVar5;
                    str4 = str;
                }
                String str5 = str4;
                int size3 = nVar.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    String b5 = nVar.b(i17);
                    if (!"Content-Length".equalsIgnoreCase(b5) && !"Content-Encoding".equalsIgnoreCase(b5) && !"Content-Type".equalsIgnoreCase(b5) && a.b(b5)) {
                        String d4 = nVar.d(i17);
                        X0.f.e(b5, "name");
                        X0.f.e(d4, "value");
                        arrayList.add(b5);
                        arrayList.add(d.P0(d4).toString());
                    }
                }
                h2.f2786f = new n((String[]) arrayList.toArray(new String[0])).c();
                h2.f2789k = b3.f2800k;
                h2.f2790l = b3.f2801l;
                y a4 = a.a(yVar);
                x.b(a4, "cacheResponse");
                h2.i = a4;
                y a5 = a.a(b3);
                x.b(a5, str5);
                h2.h = a5;
                h2.a();
                z zVar = b3.f2798g;
                X0.f.b(zVar);
                zVar.close();
                X0.f.b(null);
                throw null;
            }
            z zVar2 = yVar.f2798g;
            if (zVar2 != null) {
                j1.b.b(zVar2);
            }
        }
        x h3 = b3.h();
        y a6 = a.a(yVar);
        x.b(a6, "cacheResponse");
        h3.i = a6;
        y a7 = a.a(b3);
        x.b(a7, "networkResponse");
        h3.h = a7;
        return h3.a();
    }
}
