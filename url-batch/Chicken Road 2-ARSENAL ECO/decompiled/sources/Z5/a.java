package Z5;

import F5.j;
import F5.q;
import X5.B;
import X5.c;
import X5.n;
import X5.p;
import X5.t;
import X5.v;
import X5.w;
import X5.y;
import a1.AbstractC0223a;
import c6.h;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import m1.AbstractC0521b;
import u0.C0675e;

/* loaded from: classes.dex */
public final class a implements p {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    @Override // X5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(h hVar) {
        C0675e c0675e;
        C0675e c0675e2;
        w wVar;
        int i7;
        C0675e c0675e3;
        n nVar;
        String str;
        System.currentTimeMillis();
        D0.h hVar2 = hVar.f3830e;
        C0675e c0675e4 = new C0675e(hVar2, 9, null);
        c cVar = (c) hVar2.f335g;
        if (cVar == null) {
            int i8 = c.f2891n;
            n headers = (n) hVar2.f332d;
            i.e(headers, "headers");
            int size = headers.size();
            String str2 = null;
            int i9 = 0;
            boolean z5 = true;
            boolean z6 = false;
            boolean z7 = false;
            int i10 = -1;
            int i11 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (i9 < size) {
                String b7 = headers.b(i9);
                String d7 = headers.d(i9);
                if (b7.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null) {
                        str2 = d7;
                        i7 = 0;
                        while (i7 < d7.length()) {
                            int length = d7.length();
                            int i14 = i7;
                            while (true) {
                                if (i14 >= length) {
                                    c0675e3 = c0675e4;
                                    i14 = d7.length();
                                    break;
                                }
                                c0675e3 = c0675e4;
                                if (j.M("=,;", d7.charAt(i14))) {
                                    break;
                                }
                                i14++;
                                c0675e4 = c0675e3;
                            }
                            String substring = d7.substring(i7, i14);
                            i.d(substring, "substring(...)");
                            String obj = j.h0(substring).toString();
                            if (i14 == d7.length() || d7.charAt(i14) == ',' || d7.charAt(i14) == ';') {
                                nVar = headers;
                                i7 = i14 + 1;
                                str = null;
                            } else {
                                int i15 = i14 + 1;
                                byte[] bArr = Y5.c.f3099a;
                                int length2 = d7.length();
                                while (true) {
                                    if (i15 >= length2) {
                                        i15 = d7.length();
                                        break;
                                    }
                                    char charAt = d7.charAt(i15);
                                    int i16 = length2;
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i15++;
                                    length2 = i16;
                                }
                                if (i15 >= d7.length() || d7.charAt(i15) != '\"') {
                                    int length3 = d7.length();
                                    int i17 = i15;
                                    while (true) {
                                        if (i17 >= length3) {
                                            nVar = headers;
                                            i17 = d7.length();
                                            break;
                                        }
                                        int i18 = length3;
                                        nVar = headers;
                                        if (j.M(",;", d7.charAt(i17))) {
                                            break;
                                        }
                                        i17++;
                                        length3 = i18;
                                        headers = nVar;
                                    }
                                    String substring2 = d7.substring(i15, i17);
                                    i.d(substring2, "substring(...)");
                                    str = j.h0(substring2).toString();
                                    i7 = i17;
                                } else {
                                    int i19 = i15 + 1;
                                    int Q6 = j.Q(d7, '\"', i19, 4);
                                    String substring3 = d7.substring(i19, Q6);
                                    i.d(substring3, "substring(...)");
                                    i7 = Q6 + 1;
                                    nVar = headers;
                                    str = substring3;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                z6 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                z7 = true;
                            } else if ("max-age".equalsIgnoreCase(obj)) {
                                i10 = Y5.c.l(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i11 = Y5.c.l(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                z8 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                z9 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                z10 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i12 = Y5.c.l(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i13 = Y5.c.l(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                z11 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                z12 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                z13 = true;
                            }
                            c0675e4 = c0675e3;
                            headers = nVar;
                        }
                        i9++;
                        c0675e4 = c0675e4;
                        headers = headers;
                    }
                } else if (!b7.equalsIgnoreCase("Pragma")) {
                    i9++;
                    c0675e4 = c0675e4;
                    headers = headers;
                }
                z5 = false;
                i7 = 0;
                while (i7 < d7.length()) {
                }
                i9++;
                c0675e4 = c0675e4;
                headers = headers;
            }
            c0675e = c0675e4;
            c cVar2 = new c(z6, z7, i10, i11, z8, z9, z10, i12, i13, z11, z12, z13, !z5 ? null : str2);
            hVar2.f335g = cVar2;
            cVar = cVar2;
        } else {
            c0675e = c0675e4;
        }
        if (cVar.f2901j) {
            Object obj2 = null;
            c0675e2 = new C0675e(obj2, 9, obj2);
        } else {
            c0675e2 = c0675e;
        }
        D0.h hVar3 = (D0.h) c0675e2.f5975b;
        w wVar2 = (w) c0675e2.f5976c;
        if (hVar3 == null && wVar2 == null) {
            return new w(hVar2, t.f3038i, "Unsatisfiable Request (only-if-cached)", 504, null, new n((String[]) new ArrayList(20).toArray(new String[0])), y.f3078f, null, null, null, null, -1L, System.currentTimeMillis(), null, B.f2877a);
        }
        if (hVar3 == null) {
            i.b(wVar2);
            v a7 = wVar2.a();
            w G6 = AbstractC0223a.G(wVar2);
            v.b("cacheResponse", G6);
            a7.f3055j = G6;
            return a7.a();
        }
        w b8 = hVar.b(hVar3);
        if (wVar2 == null) {
            wVar = null;
        } else {
            if (b8.f3064i == 304) {
                v a8 = wVar2.a();
                n nVar2 = wVar2.f3066k;
                n nVar3 = b8.f3066k;
                ArrayList arrayList = new ArrayList(20);
                int size2 = nVar2.size();
                for (int i20 = 0; i20 < size2; i20++) {
                    String b9 = nVar2.b(i20);
                    String d8 = nVar2.d(i20);
                    if ((!"Warning".equalsIgnoreCase(b9) || !q.I(d8, "1")) && ("Content-Length".equalsIgnoreCase(b9) || "Content-Encoding".equalsIgnoreCase(b9) || "Content-Type".equalsIgnoreCase(b9) || !AbstractC0521b.t(b9) || nVar3.a(b9) == null)) {
                        arrayList.add(b9);
                        arrayList.add(j.h0(d8).toString());
                    }
                }
                int size3 = nVar3.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    String b10 = nVar3.b(i21);
                    if (!"Content-Length".equalsIgnoreCase(b10) && !"Content-Encoding".equalsIgnoreCase(b10) && !"Content-Type".equalsIgnoreCase(b10) && AbstractC0521b.t(b10)) {
                        String d9 = nVar3.d(i21);
                        arrayList.add(b10);
                        arrayList.add(j.h0(d9).toString());
                    }
                }
                a8.f3051f = new n((String[]) arrayList.toArray(new String[0])).c();
                a8.f3057l = b8.f3072q;
                a8.f3058m = b8.f3073r;
                w G7 = AbstractC0223a.G(wVar2);
                v.b("cacheResponse", G7);
                a8.f3055j = G7;
                w G8 = AbstractC0223a.G(b8);
                v.b("networkResponse", G8);
                a8.f3054i = G8;
                a8.a();
                b8.f3067l.close();
                i.b(null);
                throw null;
            }
            wVar = null;
            Y5.c.a(wVar2.f3067l);
        }
        v a9 = b8.a();
        w G9 = wVar2 != null ? AbstractC0223a.G(wVar2) : wVar;
        v.b("cacheResponse", G9);
        a9.f3055j = G9;
        w G10 = AbstractC0223a.G(b8);
        v.b("networkResponse", G10);
        a9.f3054i = G10;
        return a9.a();
    }
}
