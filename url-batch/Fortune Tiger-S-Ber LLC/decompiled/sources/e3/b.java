package e3;

import a2.s;
import b3.e;
import b3.m;
import c3.c;
import c3.k;
import c3.n;
import c3.r;
import c3.t;
import c3.u;
import c3.w;
import h3.g;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    @Override // c3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(g gVar) {
        s sVar;
        s sVar2;
        int i4;
        int i5;
        s sVar3;
        k kVar;
        int i6;
        String str;
        int length;
        System.currentTimeMillis();
        c3.s sVar4 = gVar.f2024e;
        s sVar5 = new s(sVar4, (Object) null, 11);
        c cVar = sVar4.f1130e;
        if (cVar == null) {
            int i7 = c.f1017n;
            k kVar2 = sVar4.c;
            int size = kVar2.size();
            String str2 = null;
            int i8 = 0;
            boolean z3 = true;
            boolean z4 = false;
            boolean z5 = false;
            int i9 = -1;
            int i10 = -1;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i11 = -1;
            int i12 = -1;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (i8 < size) {
                String b2 = kVar2.b(i8);
                String d4 = kVar2.d(i8);
                if (m.X(b2, "Cache-Control")) {
                    if (str2 == null) {
                        str2 = d4;
                        i5 = 0;
                        while (i5 < d4.length()) {
                            int length2 = d4.length();
                            int i13 = i5;
                            while (true) {
                                if (i13 >= length2) {
                                    sVar3 = sVar5;
                                    i13 = d4.length();
                                    break;
                                }
                                sVar3 = sVar5;
                                if (e.c0("=,;", d4.charAt(i13))) {
                                    break;
                                }
                                i13++;
                                sVar5 = sVar3;
                            }
                            String substring = d4.substring(i5, i13);
                            u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = e.q0(substring).toString();
                            if (i13 == d4.length() || d4.charAt(i13) == ',' || d4.charAt(i13) == ';') {
                                kVar = kVar2;
                                i6 = size;
                                i5 = i13 + 1;
                                str = null;
                            } else {
                                int i14 = i13 + 1;
                                byte[] bArr = d3.c.f1490a;
                                int length3 = d4.length();
                                while (true) {
                                    if (i14 >= length3) {
                                        length = d4.length();
                                        break;
                                    }
                                    char charAt = d4.charAt(i14);
                                    int i15 = i14;
                                    if (charAt != ' ' && charAt != '\t') {
                                        length = i15;
                                        break;
                                    }
                                    i14 = i15 + 1;
                                }
                                if (length >= d4.length() || d4.charAt(length) != '\"') {
                                    int length4 = d4.length();
                                    int i16 = length;
                                    while (true) {
                                        if (i16 >= length4) {
                                            kVar = kVar2;
                                            i6 = size;
                                            i16 = d4.length();
                                            break;
                                        }
                                        kVar = kVar2;
                                        i6 = size;
                                        if (e.c0(",;", d4.charAt(i16))) {
                                            break;
                                        }
                                        i16++;
                                        kVar2 = kVar;
                                        size = i6;
                                    }
                                    String substring2 = d4.substring(length, i16);
                                    u2.c.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str = e.q0(substring2).toString();
                                    i5 = i16;
                                } else {
                                    int i17 = length + 1;
                                    int g02 = e.g0(d4, '\"', i17, 4);
                                    str = d4.substring(i17, g02);
                                    u2.c.d(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                    kVar = kVar2;
                                    i6 = size;
                                    i5 = g02 + 1;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                z4 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                z5 = true;
                            } else if ("max-age".equalsIgnoreCase(obj)) {
                                i9 = d3.c.v(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i10 = d3.c.v(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                z6 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                z7 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                z8 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i11 = d3.c.v(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i12 = d3.c.v(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                z9 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                z10 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                z11 = true;
                            }
                            sVar5 = sVar3;
                            kVar2 = kVar;
                            size = i6;
                        }
                        i8++;
                        sVar5 = sVar5;
                        kVar2 = kVar2;
                        size = size;
                    }
                } else if (!m.X(b2, "Pragma")) {
                    i8++;
                    sVar5 = sVar5;
                    kVar2 = kVar2;
                    size = size;
                }
                z3 = false;
                i5 = 0;
                while (i5 < d4.length()) {
                }
                i8++;
                sVar5 = sVar5;
                kVar2 = kVar2;
                size = size;
            }
            sVar = sVar5;
            c cVar2 = new c(z4, z5, i9, i10, z6, z7, z8, i11, i12, z9, z10, z11, !z3 ? null : str2);
            sVar4.f1130e = cVar2;
            cVar = cVar2;
        } else {
            sVar = sVar5;
        }
        if (cVar.f1024j) {
            Object obj2 = null;
            sVar2 = new s(obj2, obj2, 11);
        } else {
            sVar2 = sVar;
        }
        c3.s sVar6 = (c3.s) sVar2.g;
        u uVar = (u) sVar2.h;
        if (sVar6 == null && uVar == null) {
            return new u(sVar4, r.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new k((String[]) new ArrayList(20).toArray(new String[0])), d3.c.c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (sVar6 == null) {
            u2.c.b(uVar);
            t n3 = uVar.n();
            u a4 = a.a(uVar);
            t.b(a4, "cacheResponse");
            n3.f1136i = a4;
            return n3.a();
        }
        u b4 = gVar.b(sVar6);
        if (uVar != null) {
            if (b4.f1142i == 304) {
                t n4 = uVar.n();
                k kVar3 = uVar.f1144k;
                k kVar4 = b4.f1144k;
                ArrayList arrayList = new ArrayList(20);
                int size2 = kVar3.size();
                int i18 = 0;
                while (i18 < size2) {
                    String b5 = kVar3.b(i18);
                    int i19 = size2;
                    String d5 = kVar3.d(i18);
                    k kVar5 = kVar3;
                    if ("Warning".equalsIgnoreCase(b5)) {
                        i4 = i18;
                        if (m.b0(d5, "1", false)) {
                            i18 = i4 + 1;
                            size2 = i19;
                            kVar3 = kVar5;
                        }
                    } else {
                        i4 = i18;
                    }
                    if ("Content-Length".equalsIgnoreCase(b5) || "Content-Encoding".equalsIgnoreCase(b5) || "Content-Type".equalsIgnoreCase(b5) || !a.b(b5) || kVar4.a(b5) == null) {
                        u2.c.e(b5, "name");
                        u2.c.e(d5, "value");
                        arrayList.add(b5);
                        arrayList.add(e.q0(d5).toString());
                    }
                    i18 = i4 + 1;
                    size2 = i19;
                    kVar3 = kVar5;
                }
                int size3 = kVar4.size();
                for (int i20 = 0; i20 < size3; i20++) {
                    String b6 = kVar4.b(i20);
                    if (!"Content-Length".equalsIgnoreCase(b6) && !"Content-Encoding".equalsIgnoreCase(b6) && !"Content-Type".equalsIgnoreCase(b6) && a.b(b6)) {
                        String d6 = kVar4.d(i20);
                        u2.c.e(b6, "name");
                        u2.c.e(d6, "value");
                        arrayList.add(b6);
                        arrayList.add(e.q0(d6).toString());
                    }
                }
                n4.f1135f = new k((String[]) arrayList.toArray(new String[0])).c();
                n4.f1138k = b4.f1149p;
                n4.f1139l = b4.f1150q;
                u a5 = a.a(uVar);
                t.b(a5, "cacheResponse");
                n4.f1136i = a5;
                u a6 = a.a(b4);
                t.b(a6, "networkResponse");
                n4.h = a6;
                n4.a();
                w wVar = b4.f1145l;
                u2.c.b(wVar);
                wVar.close();
                u2.c.b(null);
                throw null;
            }
            w wVar2 = uVar.f1145l;
            if (wVar2 != null) {
                d3.c.b(wVar2);
            }
        }
        t n5 = b4.n();
        u a7 = a.a(uVar);
        t.b(a7, "cacheResponse");
        n5.f1136i = a7;
        u a8 = a.a(b4);
        t.b(a8, "networkResponse");
        n5.h = a8;
        return n5.a();
    }
}
