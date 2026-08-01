package v3;

import androidx.emoji2.text.q;
import java.util.ArrayList;
import p3.d;
import t3.c;
import t3.j;
import t3.l;
import t3.p;
import t3.r;
import t3.s;
import t3.u;
import y3.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements l {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    @Override // t3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(f fVar) {
        q qVar;
        q qVar2;
        int i;
        int i4;
        q qVar3;
        j jVar;
        int i5;
        String str;
        int length;
        System.currentTimeMillis();
        t3.q qVar4 = fVar.f4117e;
        q qVar5 = new q(qVar4, (Object) null, 21);
        c cVar = qVar4.f3509e;
        if (cVar == null) {
            int i6 = c.f3404n;
            j jVar2 = qVar4.f3508c;
            int size = jVar2.size();
            String str2 = null;
            int i7 = 0;
            boolean z4 = true;
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
                String b2 = jVar2.b(i7);
                String d = jVar2.d(i7);
                if (p3.l.m0(b2, "Cache-Control")) {
                    if (str2 == null) {
                        str2 = d;
                        i4 = 0;
                        while (i4 < d.length()) {
                            int length2 = d.length();
                            int i12 = i4;
                            while (true) {
                                if (i12 >= length2) {
                                    qVar3 = qVar5;
                                    i12 = d.length();
                                    break;
                                }
                                qVar3 = qVar5;
                                if (d.r0("=,;", d.charAt(i12))) {
                                    break;
                                }
                                i12++;
                                qVar5 = qVar3;
                            }
                            String substring = d.substring(i4, i12);
                            i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = d.E0(substring).toString();
                            if (i12 == d.length() || d.charAt(i12) == ',' || d.charAt(i12) == ';') {
                                jVar = jVar2;
                                i5 = size;
                                i4 = i12 + 1;
                                str = null;
                            } else {
                                int i13 = i12 + 1;
                                byte[] bArr = u3.b.f3581a;
                                int length3 = d.length();
                                while (true) {
                                    if (i13 >= length3) {
                                        length = d.length();
                                        break;
                                    }
                                    char charAt = d.charAt(i13);
                                    int i14 = i13;
                                    if (charAt != ' ' && charAt != '\t') {
                                        length = i14;
                                        break;
                                    }
                                    i13 = i14 + 1;
                                }
                                if (length >= d.length() || d.charAt(length) != '\"') {
                                    int length4 = d.length();
                                    int i15 = length;
                                    while (true) {
                                        if (i15 >= length4) {
                                            jVar = jVar2;
                                            i5 = size;
                                            i15 = d.length();
                                            break;
                                        }
                                        jVar = jVar2;
                                        i5 = size;
                                        if (d.r0(",;", d.charAt(i15))) {
                                            break;
                                        }
                                        i15++;
                                        jVar2 = jVar;
                                        size = i5;
                                    }
                                    String substring2 = d.substring(length, i15);
                                    i3.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str = d.E0(substring2).toString();
                                    i4 = i15;
                                } else {
                                    int i16 = length + 1;
                                    int w02 = d.w0(d, '\"', i16, 4);
                                    str = d.substring(i16, w02);
                                    i3.d.d(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                    jVar = jVar2;
                                    i5 = size;
                                    i4 = w02 + 1;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                z5 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                z6 = true;
                            } else if ("max-age".equalsIgnoreCase(obj)) {
                                i8 = u3.b.v(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i9 = u3.b.v(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                z7 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                z8 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                z9 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i10 = u3.b.v(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i11 = u3.b.v(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                z10 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                z11 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                z12 = true;
                            }
                            qVar5 = qVar3;
                            jVar2 = jVar;
                            size = i5;
                        }
                        i7++;
                        qVar5 = qVar5;
                        jVar2 = jVar2;
                        size = size;
                    }
                } else if (!p3.l.m0(b2, "Pragma")) {
                    i7++;
                    qVar5 = qVar5;
                    jVar2 = jVar2;
                    size = size;
                }
                z4 = false;
                i4 = 0;
                while (i4 < d.length()) {
                }
                i7++;
                qVar5 = qVar5;
                jVar2 = jVar2;
                size = size;
            }
            qVar = qVar5;
            c cVar2 = new c(z5, z6, i8, i9, z7, z8, z9, i10, i11, z10, z11, z12, !z4 ? null : str2);
            qVar4.f3509e = cVar2;
            cVar = cVar2;
        } else {
            qVar = qVar5;
        }
        if (cVar.f3411j) {
            Object obj2 = null;
            qVar2 = new q(obj2, obj2, 21);
        } else {
            qVar2 = qVar;
        }
        t3.q qVar6 = (t3.q) qVar2.f466g;
        s sVar = (s) qVar2.h;
        if (qVar6 == null && sVar == null) {
            return new s(qVar4, p.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new j((String[]) new ArrayList(20).toArray(new String[0])), u3.b.f3583c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (qVar6 == null) {
            i3.d.b(sVar);
            r n4 = sVar.n();
            s a5 = a.a(sVar);
            r.b("cacheResponse", a5);
            n4.i = a5;
            return n4.a();
        }
        s b5 = fVar.b(qVar6);
        if (sVar != null) {
            if (b5.i == 304) {
                r n5 = sVar.n();
                j jVar3 = sVar.f3523k;
                j jVar4 = b5.f3523k;
                ArrayList arrayList = new ArrayList(20);
                int size2 = jVar3.size();
                int i17 = 0;
                while (i17 < size2) {
                    String b6 = jVar3.b(i17);
                    int i18 = size2;
                    String d5 = jVar3.d(i17);
                    j jVar5 = jVar3;
                    if ("Warning".equalsIgnoreCase(b6)) {
                        i = i17;
                        if (p3.l.q0(d5, "1", false)) {
                            i17 = i + 1;
                            size2 = i18;
                            jVar3 = jVar5;
                        }
                    } else {
                        i = i17;
                    }
                    if ("Content-Length".equalsIgnoreCase(b6) || "Content-Encoding".equalsIgnoreCase(b6) || "Content-Type".equalsIgnoreCase(b6) || !a.b(b6) || jVar4.a(b6) == null) {
                        i3.d.e(b6, "name");
                        i3.d.e(d5, "value");
                        arrayList.add(b6);
                        arrayList.add(d.E0(d5).toString());
                    }
                    i17 = i + 1;
                    size2 = i18;
                    jVar3 = jVar5;
                }
                int size3 = jVar4.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    String b7 = jVar4.b(i19);
                    if (!"Content-Length".equalsIgnoreCase(b7) && !"Content-Encoding".equalsIgnoreCase(b7) && !"Content-Type".equalsIgnoreCase(b7) && a.b(b7)) {
                        String d6 = jVar4.d(i19);
                        i3.d.e(b7, "name");
                        i3.d.e(d6, "value");
                        arrayList.add(b7);
                        arrayList.add(d.E0(d6).toString());
                    }
                }
                n5.f3514f = new j((String[]) arrayList.toArray(new String[0])).c();
                n5.f3517k = b5.f3528p;
                n5.f3518l = b5.f3529q;
                s a6 = a.a(sVar);
                r.b("cacheResponse", a6);
                n5.i = a6;
                s a7 = a.a(b5);
                r.b("networkResponse", a7);
                n5.h = a7;
                n5.a();
                u uVar = b5.f3524l;
                i3.d.b(uVar);
                uVar.close();
                i3.d.b(null);
                throw null;
            }
            u uVar2 = sVar.f3524l;
            if (uVar2 != null) {
                u3.b.b(uVar2);
            }
        }
        r n6 = b5.n();
        s a8 = a.a(sVar);
        r.b("cacheResponse", a8);
        n6.i = a8;
        s a9 = a.a(b5);
        r.b("networkResponse", a9);
        n6.h = a9;
        return n6.a();
    }
}
