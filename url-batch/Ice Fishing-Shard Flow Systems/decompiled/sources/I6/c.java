package I6;

import D6.A;
import D6.B;
import D6.C;
import D6.E;
import D6.t;
import D6.z;
import H6.q;
import H6.r;
import K6.C0130a;
import P0.s;
import R5.C0164d;
import T6.p;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1293a = new c();

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019a A[Catch: IOException -> 0x0162, TryCatch #12 {IOException -> 0x0162, blocks: (B:21:0x0153, B:23:0x015c, B:31:0x0165, B:35:0x0191, B:37:0x019a, B:39:0x019d, B:46:0x01bf, B:50:0x01d3, B:55:0x01e1, B:56:0x01e8, B:59:0x01eb, B:65:0x0200, B:67:0x021d, B:68:0x0276, B:70:0x0282, B:77:0x029b, B:79:0x02a8, B:80:0x02cc, B:81:0x028c, B:82:0x0249, B:83:0x0250, B:85:0x0253, B:86:0x0259), top: B:20:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d3 A[Catch: IOException -> 0x0162, TryCatch #12 {IOException -> 0x0162, blocks: (B:21:0x0153, B:23:0x015c, B:31:0x0165, B:35:0x0191, B:37:0x019a, B:39:0x019d, B:46:0x01bf, B:50:0x01d3, B:55:0x01e1, B:56:0x01e8, B:59:0x01eb, B:65:0x0200, B:67:0x021d, B:68:0x0276, B:70:0x0282, B:77:0x029b, B:79:0x02a8, B:80:0x02cc, B:81:0x028c, B:82:0x0249, B:83:0x0250, B:85:0x0253, B:86:0x0259), top: B:20:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01eb A[Catch: IOException -> 0x0162, TRY_LEAVE, TryCatch #12 {IOException -> 0x0162, blocks: (B:21:0x0153, B:23:0x015c, B:31:0x0165, B:35:0x0191, B:37:0x019a, B:39:0x019d, B:46:0x01bf, B:50:0x01d3, B:55:0x01e1, B:56:0x01e8, B:59:0x01eb, B:65:0x0200, B:67:0x021d, B:68:0x0276, B:70:0x0282, B:77:0x029b, B:79:0x02a8, B:80:0x02cc, B:81:0x028c, B:82:0x0249, B:83:0x0250, B:85:0x0253, B:86:0x0259), top: B:20:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0282 A[Catch: IOException -> 0x0162, TryCatch #12 {IOException -> 0x0162, blocks: (B:21:0x0153, B:23:0x015c, B:31:0x0165, B:35:0x0191, B:37:0x019a, B:39:0x019d, B:46:0x01bf, B:50:0x01d3, B:55:0x01e1, B:56:0x01e8, B:59:0x01eb, B:65:0x0200, B:67:0x021d, B:68:0x0276, B:70:0x0282, B:77:0x029b, B:79:0x02a8, B:80:0x02cc, B:81:0x028c, B:82:0x0249, B:83:0x0250, B:85:0x0253, B:86:0x0259), top: B:20:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253 A[Catch: IOException -> 0x0162, TryCatch #12 {IOException -> 0x0162, blocks: (B:21:0x0153, B:23:0x015c, B:31:0x0165, B:35:0x0191, B:37:0x019a, B:39:0x019d, B:46:0x01bf, B:50:0x01d3, B:55:0x01e1, B:56:0x01e8, B:59:0x01eb, B:65:0x0200, B:67:0x021d, B:68:0x0276, B:70:0x0282, B:77:0x029b, B:79:0x02a8, B:80:0x02cc, B:81:0x028c, B:82:0x0249, B:83:0x0250, B:85:0x0253, B:86:0x0259), top: B:20:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    @Override // D6.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C a(i chain) {
        B b7;
        g gVar;
        String str;
        boolean z7;
        IOException iOException;
        C response;
        int i2;
        E e7;
        boolean z8;
        boolean z9;
        C a7;
        boolean z10;
        B b8;
        A a8;
        long a9;
        Intrinsics.checkNotNullParameter(chain, "chain");
        H6.h hVar = chain.f1299d;
        Intrinsics.b(hVar);
        g gVar2 = (g) hVar.f1054e;
        q call = (q) hVar.f1052c;
        z request = chain.f1300e;
        A a10 = (A) request.f642e;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z11 = V6.b.I((String) request.f639b) && a10 != null;
        boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(request.m("Connection"));
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            try {
                try {
                    Intrinsics.checkNotNullParameter(call, "call");
                    gVar2.f(request);
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(request, "request");
                } catch (IOException e8) {
                    e = e8;
                    b7 = null;
                    z7 = true;
                    if (!(e instanceof C0130a)) {
                        throw e;
                    }
                    if (!hVar.f1051b) {
                        throw e;
                    }
                    iOException = e;
                    if (b7 == null) {
                    }
                    Intrinsics.checkNotNullParameter(request, "request");
                    b7.f412a = request;
                    b7.f416e = hVar.b().f1091g;
                    b7.f422l = currentTimeMillis;
                    b7.f423m = System.currentTimeMillis();
                    response = b7.a();
                    i2 = response.f429l;
                    while (true) {
                        e7 = response.f432o;
                        if (i2 != 100) {
                        }
                        B d7 = hVar.d(false);
                        Intrinsics.b(d7);
                        if (z7) {
                        }
                        Intrinsics.checkNotNullParameter(request, "request");
                        d7.f412a = request;
                        d7.f416e = hVar.b().f1091g;
                        d7.f422l = currentTimeMillis;
                        d7.f423m = System.currentTimeMillis();
                        response = d7.a();
                        i2 = response.f429l;
                        request = request;
                        currentTimeMillis = currentTimeMillis;
                    }
                    Intrinsics.checkNotNullParameter(response, "response");
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (i2 == 101) {
                    }
                    if (z8) {
                    }
                    if (z8) {
                    }
                    z9 = false;
                    if (equalsIgnoreCase) {
                    }
                    if (equalsIgnoreCase) {
                    }
                    j body = hVar.c(response);
                    B d8 = response.d();
                    Intrinsics.checkNotNullParameter(body, "body");
                    d8.f418g = body;
                    b trailersSource = new b();
                    Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
                    d8.f425o = trailersSource;
                    a7 = d8.a();
                    if (!"close".equalsIgnoreCase(a7.f426d.m("Connection"))) {
                    }
                    gVar.e().h();
                    if (i2 == 204) {
                    }
                    throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f432o.a());
                }
            } catch (IOException ioe) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
                hVar.e(ioe);
                throw ioe;
            }
        } catch (IOException e9) {
            e = e9;
        }
        try {
            if (equalsIgnoreCase) {
                gVar = gVar2;
                str = "upgrade";
            } else {
                if (z11) {
                    try {
                        if ("100-continue".equalsIgnoreCase(request.m("Expect"))) {
                            try {
                                gVar2.c();
                                b7 = hVar.d(true);
                                try {
                                    Intrinsics.checkNotNullParameter(call, "call");
                                    z10 = false;
                                } catch (IOException e10) {
                                    e = e10;
                                    gVar = gVar2;
                                    str = "upgrade";
                                    z7 = true;
                                    if (!(e instanceof C0130a)) {
                                    }
                                }
                            } catch (IOException ioe2) {
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(ioe2, "ioe");
                                hVar.e(ioe2);
                                throw ioe2;
                            }
                        } else {
                            z10 = true;
                            b7 = null;
                        }
                        try {
                            if (b7 == null) {
                                try {
                                    a10.getClass();
                                    try {
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        z7 = z10;
                                    } catch (IOException e11) {
                                        e = e11;
                                        gVar = gVar2;
                                        z7 = z10;
                                    }
                                    try {
                                        a8 = (A) request.f642e;
                                        Intrinsics.b(a8);
                                        str = "upgrade";
                                    } catch (IOException e12) {
                                        e = e12;
                                        gVar = gVar2;
                                        str = "upgrade";
                                        b8 = b7;
                                        b7 = b8;
                                        if (!(e instanceof C0130a)) {
                                        }
                                    }
                                    try {
                                        a9 = a8.a();
                                        Intrinsics.checkNotNullParameter(call, "call");
                                        b8 = b7;
                                    } catch (IOException e13) {
                                        e = e13;
                                        gVar = gVar2;
                                        b8 = b7;
                                        b7 = b8;
                                        if (!(e instanceof C0130a)) {
                                        }
                                    }
                                    try {
                                        gVar = gVar2;
                                        H6.f fVar = new H6.f(hVar, gVar2.g(request, a9), a9);
                                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                                        p pVar = new p(fVar);
                                        a10.c(pVar);
                                        pVar.close();
                                    } catch (IOException e14) {
                                        e = e14;
                                        gVar = gVar2;
                                        b7 = b8;
                                        if (!(e instanceof C0130a)) {
                                        }
                                    }
                                } catch (IOException e15) {
                                    e = e15;
                                    gVar = gVar2;
                                    z7 = z10;
                                    str = "upgrade";
                                    if (!(e instanceof C0130a)) {
                                    }
                                }
                            } else {
                                gVar = gVar2;
                                z7 = z10;
                                str = "upgrade";
                                b8 = b7;
                                call.f(hVar, true, false, null);
                                if (!(hVar.b().j != null)) {
                                    gVar.e().h();
                                }
                            }
                            b7 = b8;
                            gVar.a();
                            iOException = null;
                        } catch (IOException e16) {
                            e = e16;
                        }
                    } catch (IOException e17) {
                        e = e17;
                        gVar = gVar2;
                        str = "upgrade";
                        b7 = null;
                        z7 = true;
                        if (!(e instanceof C0130a)) {
                        }
                    }
                    if (b7 == null) {
                        try {
                            b7 = hVar.d(false);
                            Intrinsics.b(b7);
                            if (z7) {
                                Intrinsics.checkNotNullParameter(call, "call");
                                z7 = false;
                            }
                        } catch (IOException e18) {
                            if (iOException == null) {
                                throw e18;
                            }
                            C0164d.a(iOException, e18);
                            throw iOException;
                        }
                    }
                    Intrinsics.checkNotNullParameter(request, "request");
                    b7.f412a = request;
                    b7.f416e = hVar.b().f1091g;
                    b7.f422l = currentTimeMillis;
                    b7.f423m = System.currentTimeMillis();
                    response = b7.a();
                    i2 = response.f429l;
                    while (true) {
                        e7 = response.f432o;
                        if (i2 != 100 && (102 > i2 || i2 >= 200)) {
                            break;
                        }
                        B d72 = hVar.d(false);
                        Intrinsics.b(d72);
                        if (z7) {
                            Intrinsics.checkNotNullParameter(call, "call");
                        }
                        Intrinsics.checkNotNullParameter(request, "request");
                        d72.f412a = request;
                        d72.f416e = hVar.b().f1091g;
                        d72.f422l = currentTimeMillis;
                        d72.f423m = System.currentTimeMillis();
                        response = d72.a();
                        i2 = response.f429l;
                        request = request;
                        currentTimeMillis = currentTimeMillis;
                    }
                    Intrinsics.checkNotNullParameter(response, "response");
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    z8 = i2 == 101;
                    if (z8) {
                        if (hVar.b().j != null) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (z8) {
                        if (str.equalsIgnoreCase(C.a(response, "Connection"))) {
                            z9 = true;
                            if (equalsIgnoreCase || !z9) {
                                if (equalsIgnoreCase) {
                                    call.f(hVar, true, false, null);
                                }
                                j body2 = hVar.c(response);
                                B d82 = response.d();
                                Intrinsics.checkNotNullParameter(body2, "body");
                                d82.f418g = body2;
                                b trailersSource2 = new b();
                                Intrinsics.checkNotNullParameter(trailersSource2, "trailersSource");
                                d82.f425o = trailersSource2;
                                a7 = d82.a();
                            } else {
                                B d9 = response.d();
                                E6.a body3 = new E6.a(e7.d(), e7.a());
                                Intrinsics.checkNotNullParameter(body3, "body");
                                d9.f418g = body3;
                                hVar.f1050a = true;
                                if (call.f1078q) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                call.f1078q = true;
                                call.f1073l.i();
                                f e19 = gVar.e();
                                Intrinsics.c(e19, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
                                r rVar = (r) e19;
                                rVar.f1090f.setSoTimeout(0);
                                rVar.h();
                                s socket = new s(hVar);
                                Intrinsics.checkNotNullParameter(socket, "socket");
                                d9.f419h = socket;
                                a7 = d9.a();
                            }
                            if (!"close".equalsIgnoreCase(a7.f426d.m("Connection")) || "close".equalsIgnoreCase(C.a(a7, "Connection"))) {
                                gVar.e().h();
                            }
                            if ((i2 == 204 && i2 != 205) || a7.f432o.a() <= 0) {
                                return a7;
                            }
                            throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f432o.a());
                        }
                    }
                    z9 = false;
                    if (equalsIgnoreCase) {
                    }
                    if (equalsIgnoreCase) {
                    }
                    j body22 = hVar.c(response);
                    B d822 = response.d();
                    Intrinsics.checkNotNullParameter(body22, "body");
                    d822.f418g = body22;
                    b trailersSource22 = new b();
                    Intrinsics.checkNotNullParameter(trailersSource22, "trailersSource");
                    d822.f425o = trailersSource22;
                    a7 = d822.a();
                    if (!"close".equalsIgnoreCase(a7.f426d.m("Connection"))) {
                    }
                    gVar.e().h();
                    if (i2 == 204) {
                    }
                    throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f432o.a());
                }
                gVar = gVar2;
                str = "upgrade";
                call.f(hVar, true, false, null);
            }
            gVar.a();
            iOException = null;
            if (b7 == null) {
            }
            Intrinsics.checkNotNullParameter(request, "request");
            b7.f412a = request;
            b7.f416e = hVar.b().f1091g;
            b7.f422l = currentTimeMillis;
            b7.f423m = System.currentTimeMillis();
            response = b7.a();
            i2 = response.f429l;
            while (true) {
                e7 = response.f432o;
                if (i2 != 100) {
                    break;
                }
                B d722 = hVar.d(false);
                Intrinsics.b(d722);
                if (z7) {
                }
                Intrinsics.checkNotNullParameter(request, "request");
                d722.f412a = request;
                d722.f416e = hVar.b().f1091g;
                d722.f422l = currentTimeMillis;
                d722.f423m = System.currentTimeMillis();
                response = d722.a();
                i2 = response.f429l;
                request = request;
                currentTimeMillis = currentTimeMillis;
            }
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (i2 == 101) {
            }
            if (z8) {
            }
            if (z8) {
            }
            z9 = false;
            if (equalsIgnoreCase) {
            }
            if (equalsIgnoreCase) {
            }
            j body222 = hVar.c(response);
            B d8222 = response.d();
            Intrinsics.checkNotNullParameter(body222, "body");
            d8222.f418g = body222;
            b trailersSource222 = new b();
            Intrinsics.checkNotNullParameter(trailersSource222, "trailersSource");
            d8222.f425o = trailersSource222;
            a7 = d8222.a();
            if (!"close".equalsIgnoreCase(a7.f426d.m("Connection"))) {
            }
            gVar.e().h();
            if (i2 == 204) {
            }
            throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f432o.a());
        } catch (IOException ioe3) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe3, "ioe");
                hVar.e(ioe3);
                throw ioe3;
            } catch (IOException e20) {
                e = e20;
                if (!(e instanceof C0130a)) {
                }
            }
        }
        b7 = null;
        z7 = true;
    }
}
