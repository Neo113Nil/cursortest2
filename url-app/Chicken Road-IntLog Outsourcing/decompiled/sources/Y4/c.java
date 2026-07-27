package Y4;

import T4.B;
import T4.o;
import T4.r;
import T4.x;
import T4.y;
import T4.z;
import X4.s;
import a5.C0199a;
import j5.p;
import java.io.IOException;
import java.net.ProtocolException;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3709a = new c();

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0234, code lost:
    
        if (r3.equalsIgnoreCase(r2 == null ? r7 : r2) != false) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0154 A[Catch: IOException -> 0x011f, TryCatch #12 {IOException -> 0x011f, blocks: (B:19:0x0110, B:21:0x0119, B:29:0x0122, B:33:0x014b, B:35:0x0154, B:37:0x0157, B:44:0x0170, B:48:0x017c, B:53:0x018a, B:54:0x0191, B:57:0x0194, B:60:0x019d, B:65:0x01aa, B:67:0x01c4, B:68:0x0213, B:70:0x0225, B:73:0x0230, B:80:0x0245, B:82:0x0252, B:83:0x0276, B:85:0x0236, B:86:0x01ec, B:87:0x01f3, B:89:0x01f6, B:90:0x01fe), top: B:18:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c A[Catch: IOException -> 0x011f, TryCatch #12 {IOException -> 0x011f, blocks: (B:19:0x0110, B:21:0x0119, B:29:0x0122, B:33:0x014b, B:35:0x0154, B:37:0x0157, B:44:0x0170, B:48:0x017c, B:53:0x018a, B:54:0x0191, B:57:0x0194, B:60:0x019d, B:65:0x01aa, B:67:0x01c4, B:68:0x0213, B:70:0x0225, B:73:0x0230, B:80:0x0245, B:82:0x0252, B:83:0x0276, B:85:0x0236, B:86:0x01ec, B:87:0x01f3, B:89:0x01f6, B:90:0x01fe), top: B:18:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0194 A[Catch: IOException -> 0x011f, TryCatch #12 {IOException -> 0x011f, blocks: (B:19:0x0110, B:21:0x0119, B:29:0x0122, B:33:0x014b, B:35:0x0154, B:37:0x0157, B:44:0x0170, B:48:0x017c, B:53:0x018a, B:54:0x0191, B:57:0x0194, B:60:0x019d, B:65:0x01aa, B:67:0x01c4, B:68:0x0213, B:70:0x0225, B:73:0x0230, B:80:0x0245, B:82:0x0252, B:83:0x0276, B:85:0x0236, B:86:0x01ec, B:87:0x01f3, B:89:0x01f6, B:90:0x01fe), top: B:18:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0225 A[Catch: IOException -> 0x011f, TryCatch #12 {IOException -> 0x011f, blocks: (B:19:0x0110, B:21:0x0119, B:29:0x0122, B:33:0x014b, B:35:0x0154, B:37:0x0157, B:44:0x0170, B:48:0x017c, B:53:0x018a, B:54:0x0191, B:57:0x0194, B:60:0x019d, B:65:0x01aa, B:67:0x01c4, B:68:0x0213, B:70:0x0225, B:73:0x0230, B:80:0x0245, B:82:0x0252, B:83:0x0276, B:85:0x0236, B:86:0x01ec, B:87:0x01f3, B:89:0x01f6, B:90:0x01fe), top: B:18:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6 A[Catch: IOException -> 0x011f, TryCatch #12 {IOException -> 0x011f, blocks: (B:19:0x0110, B:21:0x0119, B:29:0x0122, B:33:0x014b, B:35:0x0154, B:37:0x0157, B:44:0x0170, B:48:0x017c, B:53:0x018a, B:54:0x0191, B:57:0x0194, B:60:0x019d, B:65:0x01aa, B:67:0x01c4, B:68:0x0213, B:70:0x0225, B:73:0x0230, B:80:0x0245, B:82:0x0252, B:83:0x0276, B:85:0x0236, B:86:0x01ec, B:87:0x01f3, B:89:0x01f6, B:90:0x01fe), top: B:18:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    @Override // T4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z a(i iVar) {
        y yVar;
        boolean z;
        String str;
        IOException iOException;
        z a6;
        int i2;
        B b6;
        boolean z5;
        boolean z6;
        String str2;
        z a7;
        String str3;
        y yVar2;
        boolean z7;
        X4.i iVar2 = iVar.f3715d;
        kotlin.jvm.internal.i.b(iVar2);
        X4.r call = (X4.r) iVar2.f3571c;
        g gVar = (g) iVar2.f3573e;
        M0.e eVar = iVar.f3716e;
        long currentTimeMillis = System.currentTimeMillis();
        boolean v4 = AbstractC1477a.v((String) eVar.f1784d);
        x xVar = (x) eVar.f1786f;
        boolean z8 = v4 && xVar != null;
        o oVar = (o) eVar.f1785e;
        boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(oVar.c("Connection"));
        try {
            try {
                kotlin.jvm.internal.i.e(call, "call");
                gVar.a(eVar);
            } catch (IOException e3) {
                kotlin.jvm.internal.i.e(call, "call");
                iVar2.e(e3);
                throw e3;
            }
        } catch (IOException e6) {
            e = e6;
        }
        try {
            if (equalsIgnoreCase) {
                str = "close";
            } else {
                if (z8) {
                    try {
                        if ("100-continue".equalsIgnoreCase(oVar.c("Expect"))) {
                            try {
                                try {
                                    gVar.d();
                                    yVar = iVar2.d(true);
                                } catch (IOException e7) {
                                    kotlin.jvm.internal.i.e(call, "call");
                                    iVar2.e(e7);
                                    throw e7;
                                }
                            } catch (IOException e8) {
                                e = e8;
                                str = "close";
                                z = true;
                                yVar = null;
                            }
                            try {
                                kotlin.jvm.internal.i.e(call, "call");
                                yVar2 = yVar;
                                z7 = false;
                            } catch (IOException e9) {
                                e = e9;
                                str = "close";
                                z = true;
                                if (!(e instanceof C0199a)) {
                                }
                            }
                        } else {
                            z7 = true;
                            yVar2 = null;
                        }
                        try {
                            if (yVar2 == null) {
                                try {
                                    xVar.getClass();
                                    try {
                                        kotlin.jvm.internal.i.b(xVar);
                                        str = "close";
                                    } catch (IOException e10) {
                                        e = e10;
                                        str = "close";
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    str = "close";
                                }
                                try {
                                    long a8 = xVar.a();
                                    kotlin.jvm.internal.i.e(call, "call");
                                    z = z7;
                                    p pVar = new p(new X4.g(iVar2, gVar.i(eVar, a8), a8));
                                    xVar.c(pVar);
                                    pVar.close();
                                } catch (IOException e12) {
                                    e = e12;
                                    z = z7;
                                    yVar = yVar2;
                                    if (!(e instanceof C0199a)) {
                                    }
                                }
                            } else {
                                str = "close";
                                z = z7;
                                call.g(iVar2, true, false, null);
                                if (!(iVar2.b().f3615l != null)) {
                                    gVar.g().h();
                                }
                            }
                            yVar = yVar2;
                            gVar.b();
                            iOException = null;
                        } catch (IOException e13) {
                            e = e13;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str = "close";
                        yVar = null;
                        z = true;
                        if (!(e instanceof C0199a)) {
                            throw e;
                        }
                        if (!iVar2.f3570b) {
                            throw e;
                        }
                        iOException = e;
                        if (yVar == null) {
                        }
                        yVar.f3000a = eVar;
                        yVar.f3004e = iVar2.b().f3610g;
                        yVar.f3011l = currentTimeMillis;
                        yVar.f3012m = System.currentTimeMillis();
                        a6 = yVar.a();
                        i2 = a6.f3018d;
                        while (true) {
                            b6 = a6.f3021g;
                            if (i2 != 100) {
                            }
                            y d6 = iVar2.d(false);
                            kotlin.jvm.internal.i.b(d6);
                            if (z) {
                            }
                            d6.f3000a = eVar;
                            d6.f3004e = iVar2.b().f3610g;
                            d6.f3011l = currentTimeMillis;
                            d6.f3012m = System.currentTimeMillis();
                            a6 = d6.a();
                            i2 = a6.f3018d;
                        }
                        kotlin.jvm.internal.i.e(call, "call");
                        if (i2 == 101) {
                        }
                        if (z5) {
                        }
                        if (z5) {
                        }
                        z6 = false;
                        if (equalsIgnoreCase) {
                        }
                        if (equalsIgnoreCase) {
                        }
                        j c2 = iVar2.c(a6);
                        y a9 = a6.a();
                        a9.f3006g = c2;
                        a9.f3014o = new b();
                        a7 = a9.a();
                        str3 = str;
                        if (!str3.equalsIgnoreCase(((o) a7.f3015a.f1785e).c("Connection"))) {
                        }
                        gVar.g().h();
                        if (i2 == 204) {
                        }
                        throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f3021g.b());
                    }
                    if (yVar == null) {
                        try {
                            yVar = iVar2.d(false);
                            kotlin.jvm.internal.i.b(yVar);
                            if (z) {
                                kotlin.jvm.internal.i.e(call, "call");
                                z = false;
                            }
                        } catch (IOException e15) {
                            if (iOException == null) {
                                throw e15;
                            }
                            K1.b.C(iOException, e15);
                            throw iOException;
                        }
                    }
                    yVar.f3000a = eVar;
                    yVar.f3004e = iVar2.b().f3610g;
                    yVar.f3011l = currentTimeMillis;
                    yVar.f3012m = System.currentTimeMillis();
                    a6 = yVar.a();
                    i2 = a6.f3018d;
                    while (true) {
                        b6 = a6.f3021g;
                        if (i2 != 100 && (102 > i2 || i2 >= 200)) {
                            break;
                        }
                        y d62 = iVar2.d(false);
                        kotlin.jvm.internal.i.b(d62);
                        if (z) {
                            kotlin.jvm.internal.i.e(call, "call");
                        }
                        d62.f3000a = eVar;
                        d62.f3004e = iVar2.b().f3610g;
                        d62.f3011l = currentTimeMillis;
                        d62.f3012m = System.currentTimeMillis();
                        a6 = d62.a();
                        i2 = a6.f3018d;
                    }
                    kotlin.jvm.internal.i.e(call, "call");
                    z5 = i2 == 101;
                    if (z5) {
                        if (iVar2.b().f3615l != null) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (z5) {
                        String c6 = a6.f3020f.c("Connection");
                        if (c6 == null) {
                            c6 = null;
                        }
                        if ("upgrade".equalsIgnoreCase(c6)) {
                            z6 = true;
                            if (equalsIgnoreCase || !z6) {
                                if (equalsIgnoreCase) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    call.g(iVar2, true, false, null);
                                }
                                j c22 = iVar2.c(a6);
                                y a92 = a6.a();
                                a92.f3006g = c22;
                                a92.f3014o = new b();
                                a7 = a92.a();
                            } else {
                                y a10 = a6.a();
                                a10.f3006g = new U4.a(b6.c(), b6.b());
                                iVar2.f3569a = true;
                                if (call.f3597i) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                call.f3597i = true;
                                call.f3592d.i();
                                f g6 = gVar.g();
                                kotlin.jvm.internal.i.c(g6, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
                                s sVar = (s) g6;
                                sVar.f3609f.setSoTimeout(0);
                                sVar.h();
                                a10.f3007h = new B0.e(iVar2);
                                a7 = a10.a();
                                str2 = null;
                            }
                            str3 = str;
                            if (!str3.equalsIgnoreCase(((o) a7.f3015a.f1785e).c("Connection"))) {
                                String c7 = a7.f3020f.c("Connection");
                            }
                            gVar.g().h();
                            if ((i2 == 204 && i2 != 205) || a7.f3021g.b() <= 0) {
                                return a7;
                            }
                            throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f3021g.b());
                        }
                    }
                    z6 = false;
                    if (equalsIgnoreCase) {
                    }
                    if (equalsIgnoreCase) {
                    }
                    j c222 = iVar2.c(a6);
                    y a922 = a6.a();
                    a922.f3006g = c222;
                    a922.f3014o = new b();
                    a7 = a922.a();
                    str3 = str;
                    if (!str3.equalsIgnoreCase(((o) a7.f3015a.f1785e).c("Connection"))) {
                    }
                    gVar.g().h();
                    if (i2 == 204) {
                    }
                    throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f3021g.b());
                }
                str = "close";
                call.g(iVar2, true, false, null);
            }
            gVar.b();
            iOException = null;
            if (yVar == null) {
            }
            yVar.f3000a = eVar;
            yVar.f3004e = iVar2.b().f3610g;
            yVar.f3011l = currentTimeMillis;
            yVar.f3012m = System.currentTimeMillis();
            a6 = yVar.a();
            i2 = a6.f3018d;
            while (true) {
                b6 = a6.f3021g;
                if (i2 != 100) {
                    break;
                }
                y d622 = iVar2.d(false);
                kotlin.jvm.internal.i.b(d622);
                if (z) {
                }
                d622.f3000a = eVar;
                d622.f3004e = iVar2.b().f3610g;
                d622.f3011l = currentTimeMillis;
                d622.f3012m = System.currentTimeMillis();
                a6 = d622.a();
                i2 = a6.f3018d;
            }
            kotlin.jvm.internal.i.e(call, "call");
            if (i2 == 101) {
            }
            if (z5) {
            }
            if (z5) {
            }
            z6 = false;
            if (equalsIgnoreCase) {
            }
            if (equalsIgnoreCase) {
            }
            j c2222 = iVar2.c(a6);
            y a9222 = a6.a();
            a9222.f3006g = c2222;
            a9222.f3014o = new b();
            a7 = a9222.a();
            str3 = str;
            if (!str3.equalsIgnoreCase(((o) a7.f3015a.f1785e).c("Connection"))) {
            }
            gVar.g().h();
            if (i2 == 204) {
            }
            throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a7.f3021g.b());
        } catch (IOException e16) {
            try {
                iVar2.e(e16);
                throw e16;
            } catch (IOException e17) {
                e = e17;
                if (!(e instanceof C0199a)) {
                }
            }
        }
        yVar = null;
        z = true;
    }
}
