package C2;

import A2.o;
import A2.r;
import A2.v;
import A2.w;
import A2.x;
import A2.y;
import A2.z;
import E2.h;
import F2.g;
import Z1.i;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements r {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144 A[SYNTHETIC] */
    @Override // A2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(g gVar) {
        c cVar;
        c cVar2;
        int i3;
        c cVar3;
        o oVar;
        int i4;
        int i5;
        String str;
        int i6;
        boolean z3 = true;
        System.currentTimeMillis();
        w wVar = gVar.f1496e;
        c cVar4 = new c(wVar, 0, null);
        A2.c cVar5 = (A2.c) wVar.f197f;
        if (cVar5 == null) {
            int i7 = A2.c.f46n;
            o oVar2 = (o) wVar.f195d;
            int size = oVar2.size();
            String str2 = null;
            int i8 = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = true;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            while (i8 < size) {
                String c3 = oVar2.c(i8);
                String i13 = oVar2.i(i8);
                if (AbstractC0454p.d0(c3, "Cache-Control", z3)) {
                    if (str2 == null) {
                        str2 = i13;
                        i3 = 0;
                        while (i3 < i13.length()) {
                            int length = i13.length();
                            int i14 = i3;
                            while (true) {
                                if (i14 >= length) {
                                    cVar3 = cVar4;
                                    i14 = i13.length();
                                    break;
                                }
                                int i15 = length;
                                cVar3 = cVar4;
                                if (AbstractC0447i.k0("=,;", i13.charAt(i14))) {
                                    break;
                                }
                                i14++;
                                length = i15;
                                cVar4 = cVar3;
                            }
                            String substring = i13.substring(i3, i14);
                            i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = AbstractC0447i.H0(substring).toString();
                            if (i14 != i13.length()) {
                                oVar = oVar2;
                                if (i13.charAt(i14) != ',' && i13.charAt(i14) != ';') {
                                    int i16 = i14 + 1;
                                    byte[] bArr = B2.c.f415a;
                                    int length2 = i13.length();
                                    while (true) {
                                        if (i16 >= length2) {
                                            i6 = 1;
                                            i16 = i13.length();
                                            break;
                                        }
                                        char charAt = i13.charAt(i16);
                                        int i17 = length2;
                                        if (charAt != ' ' && charAt != '\t') {
                                            i6 = 1;
                                            break;
                                        }
                                        i16++;
                                        length2 = i17;
                                    }
                                    if (i16 < i13.length()) {
                                        i4 = size;
                                        if (i13.charAt(i16) == '\"') {
                                            int i18 = i16 + i6;
                                            int q0 = AbstractC0447i.q0(i13, '\"', i18, false, 4);
                                            String substring2 = i13.substring(i18, q0);
                                            i.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            i5 = q0 + 1;
                                            str = substring2;
                                            if ("no-cache".equalsIgnoreCase(obj)) {
                                                i3 = i5;
                                                oVar2 = oVar;
                                                cVar4 = cVar3;
                                                size = i4;
                                                z4 = true;
                                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                                i3 = i5;
                                                oVar2 = oVar;
                                                cVar4 = cVar3;
                                                size = i4;
                                                z5 = true;
                                            } else {
                                                if ("max-age".equalsIgnoreCase(obj)) {
                                                    i9 = B2.c.x(str, -1);
                                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                                    i10 = B2.c.x(str, -1);
                                                } else if ("private".equalsIgnoreCase(obj)) {
                                                    i3 = i5;
                                                    oVar2 = oVar;
                                                    cVar4 = cVar3;
                                                    size = i4;
                                                    z6 = true;
                                                } else if ("public".equalsIgnoreCase(obj)) {
                                                    i3 = i5;
                                                    oVar2 = oVar;
                                                    cVar4 = cVar3;
                                                    size = i4;
                                                    z7 = true;
                                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                                    i3 = i5;
                                                    oVar2 = oVar;
                                                    cVar4 = cVar3;
                                                    size = i4;
                                                    z8 = true;
                                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                                    i11 = B2.c.x(str, Integer.MAX_VALUE);
                                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                                    i12 = B2.c.x(str, -1);
                                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                                    i3 = i5;
                                                    oVar2 = oVar;
                                                    cVar4 = cVar3;
                                                    size = i4;
                                                    z9 = true;
                                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                                    i3 = i5;
                                                    oVar2 = oVar;
                                                    cVar4 = cVar3;
                                                    size = i4;
                                                    z10 = true;
                                                } else if ("immutable".equalsIgnoreCase(obj)) {
                                                    i3 = i5;
                                                    oVar2 = oVar;
                                                    cVar4 = cVar3;
                                                    size = i4;
                                                    z11 = true;
                                                }
                                                i3 = i5;
                                                oVar2 = oVar;
                                                cVar4 = cVar3;
                                                size = i4;
                                            }
                                        }
                                    } else {
                                        i4 = size;
                                    }
                                    int length3 = i13.length();
                                    i5 = i16;
                                    while (true) {
                                        if (i5 >= length3) {
                                            i5 = i13.length();
                                            break;
                                        }
                                        int i19 = length3;
                                        if (AbstractC0447i.k0(",;", i13.charAt(i5))) {
                                            break;
                                        }
                                        i5++;
                                        length3 = i19;
                                    }
                                    String substring3 = i13.substring(i16, i5);
                                    i.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str = AbstractC0447i.H0(substring3).toString();
                                    if ("no-cache".equalsIgnoreCase(obj)) {
                                    }
                                }
                            } else {
                                oVar = oVar2;
                            }
                            i4 = size;
                            i5 = i14 + 1;
                            str = null;
                            if ("no-cache".equalsIgnoreCase(obj)) {
                            }
                        }
                        i8++;
                        z3 = true;
                        oVar2 = oVar2;
                        cVar4 = cVar4;
                        size = size;
                    }
                } else if (!AbstractC0454p.d0(c3, "Pragma", z3)) {
                    i8++;
                    z3 = true;
                    oVar2 = oVar2;
                    cVar4 = cVar4;
                    size = size;
                }
                z12 = false;
                i3 = 0;
                while (i3 < i13.length()) {
                }
                i8++;
                z3 = true;
                oVar2 = oVar2;
                cVar4 = cVar4;
                size = size;
            }
            cVar = cVar4;
            cVar5 = new A2.c(z4, z5, i9, i10, z6, z7, z8, i11, i12, z9, z10, z11, !z12 ? null : str2);
            wVar.f197f = cVar5;
        } else {
            cVar = cVar4;
        }
        if (cVar5.f56j) {
            Object obj2 = null;
            cVar2 = new c(obj2, 0, obj2);
        } else {
            cVar2 = cVar;
        }
        h hVar = gVar.f1492a;
        w wVar2 = (w) cVar2.f484e;
        y yVar = (y) cVar2.f485f;
        if (wVar2 == null && yVar == null) {
            y yVar2 = new y(wVar, v.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new o((String[]) new ArrayList(20).toArray(new String[0])), B2.c.f417c, null, null, null, -1L, System.currentTimeMillis(), null);
            i.f(hVar, "call");
            return yVar2;
        }
        if (wVar2 == null) {
            i.c(yVar);
            x b2 = yVar.b();
            y a3 = a.a(yVar);
            x.b(a3, "cacheResponse");
            b2.f206i = a3;
            y a4 = b2.a();
            i.f(hVar, "call");
            return a4;
        }
        if (yVar != null) {
            i.f(hVar, "call");
        }
        y b3 = gVar.b(wVar2);
        if (yVar != null) {
            if (b3.f214g == 304) {
                x b4 = yVar.b();
                o oVar3 = b3.f216i;
                ArrayList arrayList = new ArrayList(20);
                o oVar4 = yVar.f216i;
                int size2 = oVar4.size();
                int i20 = 0;
                while (i20 < size2) {
                    String c4 = oVar4.c(i20);
                    int i21 = size2;
                    String i22 = oVar4.i(i20);
                    o oVar5 = oVar4;
                    if ((!"Warning".equalsIgnoreCase(c4) || !AbstractC0454p.i0(i22, "1")) && ("Content-Length".equalsIgnoreCase(c4) || "Content-Encoding".equalsIgnoreCase(c4) || "Content-Type".equalsIgnoreCase(c4) || !a.b(c4) || oVar3.b(c4) == null)) {
                        i.f(c4, "name");
                        i.f(i22, "value");
                        arrayList.add(c4);
                        arrayList.add(AbstractC0447i.H0(i22).toString());
                    }
                    i20++;
                    size2 = i21;
                    oVar4 = oVar5;
                }
                int size3 = oVar3.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    String c5 = oVar3.c(i23);
                    if (!"Content-Length".equalsIgnoreCase(c5) && !"Content-Encoding".equalsIgnoreCase(c5) && !"Content-Type".equalsIgnoreCase(c5) && a.b(c5)) {
                        String i24 = oVar3.i(i23);
                        i.f(c5, "name");
                        i.f(i24, "value");
                        arrayList.add(c5);
                        arrayList.add(AbstractC0447i.H0(i24).toString());
                    }
                }
                b4.f203f = new o((String[]) arrayList.toArray(new String[0])).d();
                b4.f208k = b3.f221n;
                b4.f209l = b3.f222o;
                y a5 = a.a(yVar);
                x.b(a5, "cacheResponse");
                b4.f206i = a5;
                y a6 = a.a(b3);
                x.b(a6, "networkResponse");
                b4.f205h = a6;
                b4.a();
                z zVar = b3.f217j;
                i.c(zVar);
                zVar.close();
                i.c(null);
                throw null;
            }
            z zVar2 = yVar.f217j;
            if (zVar2 != null) {
                B2.c.c(zVar2);
            }
        }
        x b5 = b3.b();
        y a7 = a.a(yVar);
        x.b(a7, "cacheResponse");
        b5.f206i = a7;
        y a8 = a.a(b3);
        x.b(a8, "networkResponse");
        b5.f205h = a8;
        return b5.a();
    }
}
