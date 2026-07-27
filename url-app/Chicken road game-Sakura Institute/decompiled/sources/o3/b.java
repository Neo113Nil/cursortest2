package o3;

import A0.q;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlin.text.y;
import l2.g;
import m3.c;
import m3.l;
import m3.n;
import m3.t;
import m3.v;
import m3.w;
import m3.x;
import r3.f;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0158 A[SYNTHETIC] */
    @Override // m3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(f chain) {
        g gVar;
        g gVar2;
        q qVar;
        String str;
        int i2;
        g gVar3;
        l lVar;
        int i4;
        String str2;
        int i5;
        boolean z4 = true;
        Intrinsics.checkNotNullParameter(chain, "chain");
        System.currentTimeMillis();
        q request = chain.f9869e;
        Intrinsics.checkNotNullParameter(request, "request");
        g gVar4 = new g(request, 4, (Object) null);
        if (request != null) {
            c cVar = (c) request.f361b;
            if (cVar == null) {
                int i6 = c.f8324n;
                l headers = (l) request.f364e;
                Intrinsics.checkNotNullParameter(headers, "headers");
                int size = headers.size();
                String str3 = null;
                boolean z5 = true;
                int i7 = 0;
                boolean z6 = false;
                boolean z7 = false;
                int i8 = -1;
                int i9 = -1;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                int i10 = -1;
                int i11 = -1;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (i7 < size) {
                    String h4 = headers.h(i7);
                    String w4 = headers.w(i7);
                    if (u.i(z4, h4, "Cache-Control")) {
                        if (str3 == null) {
                            str3 = w4;
                            i2 = 0;
                            while (i2 < w4.length()) {
                                int length = w4.length();
                                int i12 = i2;
                                while (true) {
                                    if (i12 >= length) {
                                        i12 = w4.length();
                                        break;
                                    }
                                    int i13 = length;
                                    if (y.o("=,;", w4.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length = i13;
                                }
                                String substring = w4.substring(i2, i12);
                                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                String obj = y.M(substring).toString();
                                if (i12 != w4.length()) {
                                    gVar3 = gVar4;
                                    if (w4.charAt(i12) != ',' && w4.charAt(i12) != ';') {
                                        int i14 = i12 + 1;
                                        byte[] bArr = n3.b.f8558a;
                                        Intrinsics.checkNotNullParameter(w4, "<this>");
                                        int length2 = w4.length();
                                        while (true) {
                                            if (i14 >= length2) {
                                                i5 = 1;
                                                i14 = w4.length();
                                                break;
                                            }
                                            char charAt = w4.charAt(i14);
                                            int i15 = length2;
                                            if (charAt != ' ' && charAt != '\t') {
                                                i5 = 1;
                                                break;
                                            }
                                            i14++;
                                            length2 = i15;
                                        }
                                        if (i14 < w4.length()) {
                                            lVar = headers;
                                            if (w4.charAt(i14) == '\"') {
                                                int i16 = i14 + i5;
                                                int u4 = y.u(w4, '\"', i16, false, 4);
                                                String substring2 = w4.substring(i16, u4);
                                                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                                str2 = substring2;
                                                i4 = u4 + 1;
                                                if ("no-cache".equalsIgnoreCase(obj)) {
                                                    i2 = i4;
                                                    gVar4 = gVar3;
                                                    headers = lVar;
                                                    z6 = true;
                                                } else if ("no-store".equalsIgnoreCase(obj)) {
                                                    i2 = i4;
                                                    gVar4 = gVar3;
                                                    headers = lVar;
                                                    z7 = true;
                                                } else {
                                                    if ("max-age".equalsIgnoreCase(obj)) {
                                                        i8 = n3.b.x(-1, str2);
                                                    } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                                        i9 = n3.b.x(-1, str2);
                                                    } else if ("private".equalsIgnoreCase(obj)) {
                                                        i2 = i4;
                                                        gVar4 = gVar3;
                                                        headers = lVar;
                                                        z8 = true;
                                                    } else if ("public".equalsIgnoreCase(obj)) {
                                                        i2 = i4;
                                                        gVar4 = gVar3;
                                                        headers = lVar;
                                                        z9 = true;
                                                    } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                                        i2 = i4;
                                                        gVar4 = gVar3;
                                                        headers = lVar;
                                                        z10 = true;
                                                    } else if ("max-stale".equalsIgnoreCase(obj)) {
                                                        i10 = n3.b.x(Integer.MAX_VALUE, str2);
                                                    } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                                        i11 = n3.b.x(-1, str2);
                                                    } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                                        i2 = i4;
                                                        gVar4 = gVar3;
                                                        headers = lVar;
                                                        z11 = true;
                                                    } else if ("no-transform".equalsIgnoreCase(obj)) {
                                                        i2 = i4;
                                                        gVar4 = gVar3;
                                                        headers = lVar;
                                                        z12 = true;
                                                    } else if ("immutable".equalsIgnoreCase(obj)) {
                                                        i2 = i4;
                                                        gVar4 = gVar3;
                                                        headers = lVar;
                                                        z13 = true;
                                                    }
                                                    i2 = i4;
                                                    gVar4 = gVar3;
                                                    headers = lVar;
                                                }
                                            }
                                        } else {
                                            lVar = headers;
                                        }
                                        int length3 = w4.length();
                                        int i17 = i14;
                                        while (true) {
                                            if (i17 >= length3) {
                                                i17 = w4.length();
                                                break;
                                            }
                                            int i18 = length3;
                                            if (y.o(",;", w4.charAt(i17))) {
                                                break;
                                            }
                                            i17++;
                                            length3 = i18;
                                        }
                                        String substring3 = w4.substring(i14, i17);
                                        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                        str2 = y.M(substring3).toString();
                                        i4 = i17;
                                        if ("no-cache".equalsIgnoreCase(obj)) {
                                        }
                                    }
                                } else {
                                    gVar3 = gVar4;
                                }
                                lVar = headers;
                                i4 = i12 + 1;
                                str2 = null;
                                if ("no-cache".equalsIgnoreCase(obj)) {
                                }
                            }
                            i7++;
                            z4 = true;
                            gVar4 = gVar4;
                            headers = headers;
                        }
                    } else if (!u.i(z4, h4, "Pragma")) {
                        i7++;
                        z4 = true;
                        gVar4 = gVar4;
                        headers = headers;
                    }
                    z5 = false;
                    i2 = 0;
                    while (i2 < w4.length()) {
                    }
                    i7++;
                    z4 = true;
                    gVar4 = gVar4;
                    headers = headers;
                }
                gVar = gVar4;
                cVar = new c(z6, z7, i8, i9, z8, z9, z10, i10, i11, z11, z12, z13, !z5 ? null : str3);
                request.f361b = cVar;
            } else {
                gVar = gVar4;
            }
            if (cVar.f8334j) {
                Object obj2 = null;
                gVar2 = new g(obj2, 4, obj2);
                q3.g call = chain.f9865a;
                qVar = (q) gVar2.f7976b;
                w cachedResponse = (w) gVar2.f7977c;
                if (qVar != null && cachedResponse == null) {
                    ArrayList arrayList = new ArrayList(20);
                    Intrinsics.checkNotNullParameter(request, "request");
                    t protocol = t.HTTP_1_1;
                    Intrinsics.checkNotNullParameter(protocol, "protocol");
                    Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", "message");
                    x xVar = n3.b.f8560c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (request == null) {
                        throw new IllegalStateException("request == null");
                    }
                    w response = new w(request, protocol, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) arrayList.toArray(new String[0])), xVar, null, null, null, -1L, currentTimeMillis, null);
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    return response;
                }
                if (qVar != null) {
                    Intrinsics.c(cachedResponse);
                    v b4 = cachedResponse.b();
                    w a4 = a.a(cachedResponse);
                    v.b("cacheResponse", a4);
                    b4.f8468i = a4;
                    w response2 = b4.a();
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response2, "response");
                    return response2;
                }
                if (cachedResponse != null) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
                }
                w b5 = chain.b(qVar);
                String str4 = "networkResponse";
                if (cachedResponse == null) {
                    str = "networkResponse";
                } else {
                    if (b5.f8476j == 304) {
                        v b6 = cachedResponse.b();
                        l lVar2 = b5.f8478l;
                        ArrayList arrayList2 = new ArrayList(20);
                        l lVar3 = cachedResponse.f8478l;
                        int size2 = lVar3.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            int i20 = size2;
                            String name = lVar3.h(i19);
                            String str5 = str4;
                            String value = lVar3.w(i19);
                            l lVar4 = lVar3;
                            if ((!"Warning".equalsIgnoreCase(name) || !u.n(value, "1")) && ("Content-Length".equalsIgnoreCase(name) || "Content-Encoding".equalsIgnoreCase(name) || "Content-Type".equalsIgnoreCase(name) || !a.b(name) || lVar2.e(name) == null)) {
                                Intrinsics.checkNotNullParameter(name, "name");
                                Intrinsics.checkNotNullParameter(value, "value");
                                arrayList2.add(name);
                                arrayList2.add(y.M(value).toString());
                            }
                            i19++;
                            size2 = i20;
                            str4 = str5;
                            lVar3 = lVar4;
                        }
                        String str6 = str4;
                        int size3 = lVar2.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            String name2 = lVar2.h(i21);
                            if (!"Content-Length".equalsIgnoreCase(name2) && !"Content-Encoding".equalsIgnoreCase(name2) && !"Content-Type".equalsIgnoreCase(name2) && a.b(name2)) {
                                String value2 = lVar2.w(i21);
                                Intrinsics.checkNotNullParameter(name2, "name");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                arrayList2.add(name2);
                                arrayList2.add(y.M(value2).toString());
                            }
                        }
                        l headers2 = new l((String[]) arrayList2.toArray(new String[0]));
                        Intrinsics.checkNotNullParameter(headers2, "headers");
                        b6.f8465f = headers2.s();
                        b6.f8470k = b5.f8483q;
                        b6.f8471l = b5.f8484r;
                        w a5 = a.a(cachedResponse);
                        v.b("cacheResponse", a5);
                        b6.f8468i = a5;
                        w a6 = a.a(b5);
                        v.b(str6, a6);
                        b6.f8467h = a6;
                        b6.a();
                        x xVar2 = b5.f8479m;
                        Intrinsics.c(xVar2);
                        xVar2.close();
                        Intrinsics.c(null);
                        throw null;
                    }
                    str = "networkResponse";
                    x xVar3 = cachedResponse.f8479m;
                    if (xVar3 != null) {
                        n3.b.c(xVar3);
                    }
                }
                v b7 = b5.b();
                w a7 = a.a(cachedResponse);
                v.b("cacheResponse", a7);
                b7.f8468i = a7;
                w a8 = a.a(b5);
                v.b(str, a8);
                b7.f8467h = a8;
                return b7.a();
            }
        } else {
            gVar = gVar4;
        }
        gVar2 = gVar;
        q3.g call2 = chain.f9865a;
        qVar = (q) gVar2.f7976b;
        w cachedResponse2 = (w) gVar2.f7977c;
        if (qVar != null) {
        }
        if (qVar != null) {
        }
    }
}
