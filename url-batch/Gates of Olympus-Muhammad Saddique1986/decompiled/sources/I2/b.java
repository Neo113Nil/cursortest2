package I2;

import C0.q;
import G2.c;
import G2.l;
import G2.o;
import G2.s;
import G2.t;
import G2.u;
import G2.v;
import L2.g;
import f2.j;
import java.util.ArrayList;
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import z.C1256t;

/* loaded from: classes.dex */
public final class b implements o {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // G2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(g gVar) {
        C1256t c1256t;
        C1256t c1256t2;
        int i3;
        C1256t c1256t3;
        l lVar;
        int i4;
        String str;
        int i5;
        boolean z3 = true;
        System.currentTimeMillis();
        q qVar = gVar.f3416e;
        C1256t c1256t4 = new C1256t(qVar, 5, null);
        c cVar = (c) qVar.f629b;
        if (cVar == null) {
            int i6 = c.f2139n;
            l lVar2 = (l) qVar.f632e;
            int size = lVar2.size();
            String str2 = null;
            boolean z4 = true;
            int i7 = 0;
            boolean z5 = false;
            boolean z6 = false;
            int i8 = -1;
            int i9 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i10 = -1;
            int i11 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (i7 < size) {
                String c2 = lVar2.c(i7);
                String i12 = lVar2.i(i7);
                if (AbstractC0737q.s(c2, "Cache-Control", z3)) {
                    if (str2 == null) {
                        str2 = i12;
                        i3 = 0;
                        while (i3 < i12.length()) {
                            int length = i12.length();
                            int i13 = i3;
                            while (true) {
                                if (i13 >= length) {
                                    c1256t3 = c1256t4;
                                    i13 = i12.length();
                                    break;
                                }
                                c1256t3 = c1256t4;
                                if (AbstractC0730j.B("=,;", i12.charAt(i13))) {
                                    break;
                                }
                                i13++;
                                c1256t4 = c1256t3;
                            }
                            String substring = i12.substring(i3, i13);
                            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = AbstractC0730j.Y(substring).toString();
                            if (i13 == i12.length() || i12.charAt(i13) == ',' || i12.charAt(i13) == ';') {
                                lVar = lVar2;
                                i4 = i13 + 1;
                                str = null;
                            } else {
                                int i14 = i13 + 1;
                                byte[] bArr = H2.b.f2632a;
                                int length2 = i12.length();
                                while (true) {
                                    if (i14 >= length2) {
                                        i5 = 1;
                                        i14 = i12.length();
                                        break;
                                    }
                                    char charAt = i12.charAt(i14);
                                    int i15 = length2;
                                    if (charAt != ' ' && charAt != '\t') {
                                        i5 = 1;
                                        break;
                                    }
                                    i14++;
                                    length2 = i15;
                                }
                                if (i14 < i12.length()) {
                                    lVar = lVar2;
                                    if (i12.charAt(i14) == '\"') {
                                        int i16 = i14 + i5;
                                        int H3 = AbstractC0730j.H(i12, '\"', i16, false, 4);
                                        str = i12.substring(i16, H3);
                                        j.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i4 = H3 + 1;
                                    }
                                } else {
                                    lVar = lVar2;
                                }
                                int length3 = i12.length();
                                i4 = i14;
                                while (true) {
                                    if (i4 >= length3) {
                                        i4 = i12.length();
                                        break;
                                    }
                                    int i17 = length3;
                                    if (AbstractC0730j.B(",;", i12.charAt(i4))) {
                                        break;
                                    }
                                    i4++;
                                    length3 = i17;
                                }
                                String substring2 = i12.substring(i14, i4);
                                j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str = AbstractC0730j.Y(substring2).toString();
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                c1256t4 = c1256t3;
                                lVar2 = lVar;
                                z5 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                c1256t4 = c1256t3;
                                lVar2 = lVar;
                                z6 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i8 = H2.b.x(str, -1);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i9 = H2.b.x(str, -1);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    i3 = i4;
                                    c1256t4 = c1256t3;
                                    lVar2 = lVar;
                                    z7 = true;
                                } else if ("public".equalsIgnoreCase(obj)) {
                                    i3 = i4;
                                    c1256t4 = c1256t3;
                                    lVar2 = lVar;
                                    z8 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    i3 = i4;
                                    c1256t4 = c1256t3;
                                    lVar2 = lVar;
                                    z9 = true;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i10 = H2.b.x(str, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i11 = H2.b.x(str, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    i3 = i4;
                                    c1256t4 = c1256t3;
                                    lVar2 = lVar;
                                    z10 = true;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    i3 = i4;
                                    c1256t4 = c1256t3;
                                    lVar2 = lVar;
                                    z11 = true;
                                } else {
                                    boolean equalsIgnoreCase = "immutable".equalsIgnoreCase(obj);
                                    i3 = i4;
                                    c1256t4 = c1256t3;
                                    lVar2 = lVar;
                                    if (equalsIgnoreCase) {
                                        z12 = true;
                                    }
                                }
                                i3 = i4;
                                c1256t4 = c1256t3;
                                lVar2 = lVar;
                            }
                        }
                        i7++;
                        z3 = true;
                        c1256t4 = c1256t4;
                        lVar2 = lVar2;
                    }
                } else if (!AbstractC0737q.s(c2, "Pragma", z3)) {
                    i7++;
                    z3 = true;
                    c1256t4 = c1256t4;
                    lVar2 = lVar2;
                }
                z4 = false;
                i3 = 0;
                while (i3 < i12.length()) {
                }
                i7++;
                z3 = true;
                c1256t4 = c1256t4;
                lVar2 = lVar2;
            }
            c1256t = c1256t4;
            cVar = new c(z5, z6, i8, i9, z7, z8, z9, i10, i11, z10, z11, z12, !z4 ? null : str2);
            qVar.f629b = cVar;
        } else {
            c1256t = c1256t4;
        }
        if (cVar.f2149j) {
            Object obj2 = null;
            c1256t2 = new C1256t(obj2, 5, obj2);
        } else {
            c1256t2 = c1256t;
        }
        K2.g gVar2 = gVar.f3412a;
        q qVar2 = (q) c1256t2.f10466e;
        u uVar = (u) c1256t2.f10467f;
        if (qVar2 == null && uVar == null) {
            u uVar2 = new u(qVar, s.f2274f, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) new ArrayList(20).toArray(new String[0])), H2.b.f2634c, null, null, null, -1L, System.currentTimeMillis(), null);
            j.f(gVar2, "call");
            return uVar2;
        }
        if (qVar2 == null) {
            j.c(uVar);
            t b3 = uVar.b();
            u a3 = a.a(uVar);
            t.b(a3, "cacheResponse");
            b3.f2289i = a3;
            u a4 = b3.a();
            j.f(gVar2, "call");
            return a4;
        }
        if (uVar != null) {
            j.f(gVar2, "call");
        }
        u b4 = gVar.b(qVar2);
        if (uVar != null) {
            if (b4.f2297g == 304) {
                t b5 = uVar.b();
                l lVar3 = b4.f2299i;
                ArrayList arrayList = new ArrayList(20);
                l lVar4 = uVar.f2299i;
                int size2 = lVar4.size();
                int i18 = 0;
                while (i18 < size2) {
                    String c3 = lVar4.c(i18);
                    int i19 = size2;
                    String i20 = lVar4.i(i18);
                    l lVar5 = lVar4;
                    if ((!"Warning".equalsIgnoreCase(c3) || !AbstractC0737q.z(i20, "1")) && ("Content-Length".equalsIgnoreCase(c3) || "Content-Encoding".equalsIgnoreCase(c3) || "Content-Type".equalsIgnoreCase(c3) || !a.b(c3) || lVar3.b(c3) == null)) {
                        j.f(c3, "name");
                        j.f(i20, "value");
                        arrayList.add(c3);
                        arrayList.add(AbstractC0730j.Y(i20).toString());
                    }
                    i18++;
                    size2 = i19;
                    lVar4 = lVar5;
                }
                int size3 = lVar3.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    String c4 = lVar3.c(i21);
                    if (!"Content-Length".equalsIgnoreCase(c4) && !"Content-Encoding".equalsIgnoreCase(c4) && !"Content-Type".equalsIgnoreCase(c4) && a.b(c4)) {
                        String i22 = lVar3.i(i21);
                        j.f(c4, "name");
                        j.f(i22, "value");
                        arrayList.add(c4);
                        arrayList.add(AbstractC0730j.Y(i22).toString());
                    }
                }
                b5.f2286f = new l((String[]) arrayList.toArray(new String[0])).d();
                b5.f2291k = b4.f2304n;
                b5.f2292l = b4.f2305o;
                u a5 = a.a(uVar);
                t.b(a5, "cacheResponse");
                b5.f2289i = a5;
                u a6 = a.a(b4);
                t.b(a6, "networkResponse");
                b5.f2288h = a6;
                b5.a();
                v vVar = b4.f2300j;
                j.c(vVar);
                vVar.close();
                j.c(null);
                throw null;
            }
            v vVar2 = uVar.f2300j;
            if (vVar2 != null) {
                H2.b.c(vVar2);
            }
        }
        t b6 = b4.b();
        u a7 = a.a(uVar);
        t.b(a7, "cacheResponse");
        b6.f2289i = a7;
        u a8 = a.a(b4);
        t.b(a8, "networkResponse");
        b6.f2288h = a8;
        return b6.a();
    }
}
