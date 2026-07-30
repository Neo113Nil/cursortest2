package F6;

import C4.d;
import D6.B;
import D6.C;
import D6.C0095c;
import D6.D;
import D6.E;
import D6.H;
import D6.l;
import D6.t;
import D6.x;
import D6.z;
import E6.c;
import H6.q;
import I6.i;
import O6.g;
import P0.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.p;

/* loaded from: classes.dex */
public final class a implements t {
    /* JADX WARN: Removed duplicated region for block: B:133:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    @Override // D6.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C a(i chain) {
        s sVar;
        s sVar2;
        z zVar;
        C c7;
        int i2;
        s sVar3;
        int i5;
        String str;
        int length;
        Intrinsics.checkNotNullParameter(chain, "chain");
        q call = chain.f1296a;
        System.currentTimeMillis();
        z request = chain.f1300e;
        Intrinsics.checkNotNullParameter(request, "request");
        s sVar4 = new s(request, null);
        if (request != null) {
            C0095c c0095c = (C0095c) request.f644g;
            if (c0095c == null) {
                l lVar = C0095c.f466n;
                D6.q headers = (D6.q) request.f641d;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                Intrinsics.checkNotNullParameter(headers, "headers");
                int size = headers.size();
                String str2 = null;
                int i7 = 0;
                boolean z7 = true;
                boolean z8 = false;
                boolean z9 = false;
                int i8 = -1;
                int i9 = -1;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                int i10 = -1;
                int i11 = -1;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (i7 < size) {
                    String b7 = headers.b(i7);
                    String d7 = headers.d(i7);
                    if (b7.equalsIgnoreCase("Cache-Control")) {
                        if (str2 == null) {
                            str2 = d7;
                            i2 = 0;
                            while (i2 < d7.length()) {
                                int length2 = d7.length();
                                int i12 = i2;
                                while (true) {
                                    if (i12 >= length2) {
                                        sVar3 = sVar4;
                                        i12 = d7.length();
                                        break;
                                    }
                                    sVar3 = sVar4;
                                    int i13 = length2;
                                    if (StringsKt.v("=,;", d7.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    sVar4 = sVar3;
                                    length2 = i13;
                                }
                                String substring = d7.substring(i2, i12);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                String obj = StringsKt.J(substring).toString();
                                if (i12 != d7.length()) {
                                    i5 = size;
                                    if (d7.charAt(i12) != ',' && d7.charAt(i12) != ';') {
                                        int i14 = i12 + 1;
                                        byte[] bArr = c.f709a;
                                        Intrinsics.checkNotNullParameter(d7, "<this>");
                                        int length3 = d7.length();
                                        while (true) {
                                            if (i14 >= length3) {
                                                i14 = d7.length();
                                                break;
                                            }
                                            char charAt = d7.charAt(i14);
                                            int i15 = length3;
                                            if (charAt != ' ' && charAt != '\t') {
                                                break;
                                            }
                                            i14++;
                                            length3 = i15;
                                        }
                                        if (i14 >= d7.length() || d7.charAt(i14) != '\"') {
                                            int length4 = d7.length();
                                            int i16 = i14;
                                            while (true) {
                                                if (i16 >= length4) {
                                                    length = d7.length();
                                                    break;
                                                }
                                                int i17 = length4;
                                                int i18 = i16;
                                                if (StringsKt.v(",;", d7.charAt(i16))) {
                                                    length = i18;
                                                    break;
                                                }
                                                i16 = i18 + 1;
                                                length4 = i17;
                                            }
                                            String substring2 = d7.substring(i14, length);
                                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                            int i19 = length;
                                            str = StringsKt.J(substring2).toString();
                                            i2 = i19;
                                        } else {
                                            int i20 = i14 + 1;
                                            int x7 = StringsKt.x(d7, '\"', i20, 4);
                                            str = d7.substring(i20, x7);
                                            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                                            i2 = x7 + 1;
                                        }
                                        if (!"no-cache".equalsIgnoreCase(obj)) {
                                            z8 = true;
                                        } else if ("no-store".equalsIgnoreCase(obj)) {
                                            z9 = true;
                                        } else if ("max-age".equalsIgnoreCase(obj)) {
                                            i8 = c.l(-1, str);
                                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                            i9 = c.l(-1, str);
                                        } else if ("private".equalsIgnoreCase(obj)) {
                                            z10 = true;
                                        } else if ("public".equalsIgnoreCase(obj)) {
                                            z11 = true;
                                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                            z12 = true;
                                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                                            i10 = c.l(Integer.MAX_VALUE, str);
                                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                            i11 = c.l(-1, str);
                                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                            z13 = true;
                                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                                            z14 = true;
                                        } else if ("immutable".equalsIgnoreCase(obj)) {
                                            z15 = true;
                                        }
                                        sVar4 = sVar3;
                                        size = i5;
                                    }
                                } else {
                                    i5 = size;
                                }
                                i2 = i12 + 1;
                                str = null;
                                if (!"no-cache".equalsIgnoreCase(obj)) {
                                }
                                sVar4 = sVar3;
                                size = i5;
                            }
                            i7++;
                            sVar4 = sVar4;
                            size = size;
                        }
                    } else if (!b7.equalsIgnoreCase("Pragma")) {
                        i7++;
                        sVar4 = sVar4;
                        size = size;
                    }
                    z7 = false;
                    i2 = 0;
                    while (i2 < d7.length()) {
                    }
                    i7++;
                    sVar4 = sVar4;
                    size = size;
                }
                sVar = sVar4;
                C0095c c0095c2 = new C0095c(z8, z9, i8, i9, z10, z11, z12, i10, i11, z13, z14, z15, !z7 ? null : str2);
                request.f644g = c0095c2;
                c0095c = c0095c2;
            } else {
                sVar = sVar4;
            }
            if (c0095c.j) {
                Object obj2 = null;
                sVar2 = new s(obj2, obj2);
                zVar = (z) sVar2.f2251d;
                C cachedResponse = (C) sVar2.f2252e;
                if (zVar != null && cachedResponse == null) {
                    D d8 = E.f443d;
                    d dVar = new d(2);
                    Intrinsics.checkNotNullParameter(request, "request");
                    x protocol = x.f625l;
                    Intrinsics.checkNotNullParameter(protocol, "protocol");
                    Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", "message");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (request == null) {
                        throw new IllegalStateException("request == null");
                    }
                    C response = new C(request, protocol, "Unsatisfiable Request (only-if-cached)", 504, null, dVar.d(), d8, null, null, null, null, -1L, currentTimeMillis, null, H.f455b);
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    return response;
                }
                if (zVar != null) {
                    Intrinsics.b(cachedResponse);
                    B d9 = cachedResponse.d();
                    C Z6 = g.Z(cachedResponse);
                    B.b(Z6, "cacheResponse");
                    d9.j = Z6;
                    C response2 = d9.a();
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response2, "response");
                    return response2;
                }
                if (cachedResponse != null) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
                }
                C b8 = chain.b(zVar);
                if (cachedResponse == null) {
                    c7 = null;
                } else {
                    if (b8.f429l == 304) {
                        B d10 = cachedResponse.d();
                        D6.q qVar = cachedResponse.f431n;
                        D6.q qVar2 = b8.f431n;
                        d dVar2 = new d(2);
                        int size2 = qVar.size();
                        int i21 = 0;
                        while (i21 < size2) {
                            String b9 = qVar.b(i21);
                            String d11 = qVar.d(i21);
                            D6.q qVar3 = qVar;
                            if ((!"Warning".equalsIgnoreCase(b9) || !p.l(d11, "1")) && ("Content-Length".equalsIgnoreCase(b9) || "Content-Encoding".equalsIgnoreCase(b9) || "Content-Type".equalsIgnoreCase(b9) || !d4.c.v(b9) || qVar2.a(b9) == null)) {
                                dVar2.a(b9, d11);
                            }
                            i21++;
                            qVar = qVar3;
                        }
                        int size3 = qVar2.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            String b10 = qVar2.b(i22);
                            if (!"Content-Length".equalsIgnoreCase(b10) && !"Content-Encoding".equalsIgnoreCase(b10) && !"Content-Type".equalsIgnoreCase(b10) && d4.c.v(b10)) {
                                dVar2.a(b10, qVar2.d(i22));
                            }
                        }
                        D6.q headers2 = dVar2.d();
                        Intrinsics.checkNotNullParameter(headers2, "headers");
                        d10.f417f = headers2.c();
                        d10.f422l = b8.f437t;
                        d10.f423m = b8.f438u;
                        C Z7 = g.Z(cachedResponse);
                        B.b(Z7, "cacheResponse");
                        d10.j = Z7;
                        C Z8 = g.Z(b8);
                        B.b(Z8, "networkResponse");
                        d10.f420i = Z8;
                        d10.a();
                        b8.f432o.close();
                        Intrinsics.b(null);
                        throw null;
                    }
                    c7 = null;
                    c.a(cachedResponse.f432o);
                }
                B d12 = b8.d();
                C Z9 = cachedResponse != null ? g.Z(cachedResponse) : c7;
                B.b(Z9, "cacheResponse");
                d12.j = Z9;
                C Z10 = g.Z(b8);
                B.b(Z10, "networkResponse");
                d12.f420i = Z10;
                return d12.a();
            }
        } else {
            sVar = sVar4;
        }
        sVar2 = sVar;
        zVar = (z) sVar2.f2251d;
        C cachedResponse2 = (C) sVar2.f2252e;
        if (zVar != null) {
        }
        if (zVar != null) {
        }
    }
}
