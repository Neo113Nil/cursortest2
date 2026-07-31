package c6;

import X5.n;
import X5.p;
import X5.u;
import X5.v;
import X5.w;
import X5.y;
import b6.q;
import b6.r;
import e6.C0355a;
import java.io.IOException;
import java.net.ProtocolException;
import m1.AbstractC0521b;
import u0.C0682l;

/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3824a = new c();

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0202, code lost:
    
        if ("close".equalsIgnoreCase(r15) != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0134 A[Catch: IOException -> 0x00dd, TryCatch #6 {IOException -> 0x00dd, blocks: (B:20:0x00d5, B:28:0x00e0, B:32:0x010b, B:42:0x0134, B:47:0x0142, B:48:0x0149, B:51:0x014c, B:54:0x0155, B:59:0x0164, B:61:0x017e, B:62:0x01e4, B:64:0x01f4, B:67:0x01fe, B:74:0x0213, B:76:0x0220, B:77:0x0244, B:79:0x0204, B:80:0x01a5, B:81:0x01ac, B:83:0x01af, B:89:0x01d3, B:92:0x0246, B:93:0x0249, B:85:0x01b4, B:88:0x01bd), top: B:19:0x00d5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c A[Catch: IOException -> 0x00dd, TryCatch #6 {IOException -> 0x00dd, blocks: (B:20:0x00d5, B:28:0x00e0, B:32:0x010b, B:42:0x0134, B:47:0x0142, B:48:0x0149, B:51:0x014c, B:54:0x0155, B:59:0x0164, B:61:0x017e, B:62:0x01e4, B:64:0x01f4, B:67:0x01fe, B:74:0x0213, B:76:0x0220, B:77:0x0244, B:79:0x0204, B:80:0x01a5, B:81:0x01ac, B:83:0x01af, B:89:0x01d3, B:92:0x0246, B:93:0x0249, B:85:0x01b4, B:88:0x01bd), top: B:19:0x00d5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f4 A[Catch: IOException -> 0x00dd, TryCatch #6 {IOException -> 0x00dd, blocks: (B:20:0x00d5, B:28:0x00e0, B:32:0x010b, B:42:0x0134, B:47:0x0142, B:48:0x0149, B:51:0x014c, B:54:0x0155, B:59:0x0164, B:61:0x017e, B:62:0x01e4, B:64:0x01f4, B:67:0x01fe, B:74:0x0213, B:76:0x0220, B:77:0x0244, B:79:0x0204, B:80:0x01a5, B:81:0x01ac, B:83:0x01af, B:89:0x01d3, B:92:0x0246, B:93:0x0249, B:85:0x01b4, B:88:0x01bd), top: B:19:0x00d5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01af A[Catch: IOException -> 0x00dd, TRY_LEAVE, TryCatch #6 {IOException -> 0x00dd, blocks: (B:20:0x00d5, B:28:0x00e0, B:32:0x010b, B:42:0x0134, B:47:0x0142, B:48:0x0149, B:51:0x014c, B:54:0x0155, B:59:0x0164, B:61:0x017e, B:62:0x01e4, B:64:0x01f4, B:67:0x01fe, B:74:0x0213, B:76:0x0220, B:77:0x0244, B:79:0x0204, B:80:0x01a5, B:81:0x01ac, B:83:0x01af, B:89:0x01d3, B:92:0x0246, B:93:0x0249, B:85:0x01b4, B:88:0x01bd), top: B:19:0x00d5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    @Override // X5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(h hVar) {
        String str;
        IOException iOException;
        w a7;
        int i7;
        n nVar;
        y yVar;
        boolean z5;
        String str2;
        boolean z6;
        String a8;
        w a9;
        U.a aVar = hVar.f3829d;
        kotlin.jvm.internal.i.b(aVar);
        f fVar = (f) aVar.f2485e;
        q qVar = (q) aVar.f2483c;
        D0.h hVar2 = hVar.f3830e;
        n nVar2 = (n) hVar2.f332d;
        u uVar = (u) hVar2.f333e;
        long currentTimeMillis = System.currentTimeMillis();
        v vVar = (!AbstractC0521b.z((String) hVar2.f330b) || uVar == null) ? null : 1;
        boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(nVar2.a("Connection"));
        String str3 = null;
        try {
            try {
                fVar.b(hVar2);
                try {
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (IOException e7) {
                aVar.d(e7);
                throw e7;
            }
        } catch (IOException e8) {
            e = e8;
        }
        try {
            try {
                if (equalsIgnoreCase) {
                    str = "Connection";
                } else {
                    if (vVar != null) {
                        try {
                            if ("100-continue".equalsIgnoreCase(nVar2.a("Expect"))) {
                                try {
                                    fVar.e();
                                    vVar = aVar.c(true);
                                } catch (IOException e9) {
                                    aVar.d(e9);
                                    throw e9;
                                }
                            } else {
                                vVar = null;
                            }
                            if (vVar == null) {
                                try {
                                    uVar.getClass();
                                    kotlin.jvm.internal.i.b(uVar);
                                    str = "Connection";
                                    long a10 = uVar.a();
                                    n6.p pVar = new n6.p(new b6.g(aVar, fVar.a(hVar2, a10), a10));
                                    uVar.c(pVar);
                                    pVar.close();
                                } catch (IOException e10) {
                                    e = e10;
                                    str = "Connection";
                                    if (!(e instanceof C0355a)) {
                                    }
                                }
                            } else {
                                str = "Connection";
                                qVar.f(aVar, true, false, null);
                                if (!(aVar.b().f3705k != null)) {
                                    fVar.g().h();
                                }
                            }
                            fVar.c();
                            iOException = null;
                        } catch (IOException e11) {
                            e = e11;
                            str = "Connection";
                            vVar = null;
                            if (!(e instanceof C0355a)) {
                                throw e;
                            }
                            if (!aVar.f2482b) {
                                throw e;
                            }
                            iOException = e;
                            if (vVar == null) {
                            }
                            vVar.f3046a = hVar2;
                            vVar.f3050e = aVar.b().f3701g;
                            vVar.f3057l = currentTimeMillis;
                            vVar.f3058m = System.currentTimeMillis();
                            a7 = vVar.a();
                            i7 = a7.f3064i;
                            while (true) {
                                nVar = a7.f3066k;
                                yVar = a7.f3067l;
                                if (i7 != 100) {
                                }
                                v c7 = aVar.c(false);
                                kotlin.jvm.internal.i.b(c7);
                                c7.f3046a = hVar2;
                                c7.f3050e = aVar.b().f3701g;
                                c7.f3057l = currentTimeMillis;
                                c7.f3058m = System.currentTimeMillis();
                                a7 = c7.a();
                                i7 = a7.f3064i;
                            }
                            if (i7 == 101) {
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
                            a8 = nVar.a("Content-Type");
                            if (a8 == null) {
                            }
                            long h7 = fVar.h(a7);
                            i iVar = new i(a8, h7, n6.b.b(new b6.h(aVar, fVar.i(a7), h7)));
                            v a11 = a7.a();
                            a11.f3052g = iVar;
                            a11.f3060o = new b();
                            a9 = a11.a();
                            if (!"close".equalsIgnoreCase(((n) a9.f3061f.f332d).a(str2))) {
                            }
                            fVar.g().h();
                            if (i7 == 204) {
                            }
                            throw new ProtocolException("HTTP " + i7 + " had non-zero Content-Length: " + a9.f3067l.a());
                        }
                        if (vVar == null) {
                            try {
                                vVar = aVar.c(false);
                                kotlin.jvm.internal.i.b(vVar);
                            } catch (IOException e12) {
                                if (iOException == null) {
                                    throw e12;
                                }
                                i6.g.a(iOException, e12);
                                throw iOException;
                            }
                        }
                        vVar.f3046a = hVar2;
                        vVar.f3050e = aVar.b().f3701g;
                        vVar.f3057l = currentTimeMillis;
                        vVar.f3058m = System.currentTimeMillis();
                        a7 = vVar.a();
                        i7 = a7.f3064i;
                        while (true) {
                            nVar = a7.f3066k;
                            yVar = a7.f3067l;
                            if (i7 != 100 && (102 > i7 || i7 >= 200)) {
                                break;
                            }
                            v c72 = aVar.c(false);
                            kotlin.jvm.internal.i.b(c72);
                            c72.f3046a = hVar2;
                            c72.f3050e = aVar.b().f3701g;
                            c72.f3057l = currentTimeMillis;
                            c72.f3058m = System.currentTimeMillis();
                            a7 = c72.a();
                            i7 = a7.f3064i;
                        }
                        z5 = i7 == 101;
                        if (z5) {
                            if (aVar.b().f3705k != null) {
                                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                            }
                        }
                        if (z5) {
                            str2 = str;
                            String a12 = nVar.a(str2);
                            if (a12 == null) {
                                a12 = null;
                            }
                            if ("upgrade".equalsIgnoreCase(a12)) {
                                z6 = true;
                                if (equalsIgnoreCase || !z6) {
                                    if (equalsIgnoreCase) {
                                        qVar.f(aVar, true, false, null);
                                    }
                                    a8 = nVar.a("Content-Type");
                                    if (a8 == null) {
                                        a8 = null;
                                    }
                                    long h72 = fVar.h(a7);
                                    i iVar2 = new i(a8, h72, n6.b.b(new b6.h(aVar, fVar.i(a7), h72)));
                                    v a112 = a7.a();
                                    a112.f3052g = iVar2;
                                    a112.f3060o = new b();
                                    a9 = a112.a();
                                } else {
                                    v a13 = a7.a();
                                    a13.f3052g = new Y5.a(yVar.d(), yVar.a());
                                    aVar.f2481a = true;
                                    if (qVar.f3688n) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    qVar.f3688n = true;
                                    qVar.f3683i.i();
                                    e g7 = fVar.g();
                                    kotlin.jvm.internal.i.c(g7, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
                                    r rVar = (r) g7;
                                    rVar.f3700f.setSoTimeout(0);
                                    rVar.h();
                                    a13.f3053h = new C0682l(aVar);
                                    a9 = a13.a();
                                }
                                if (!"close".equalsIgnoreCase(((n) a9.f3061f.f332d).a(str2))) {
                                    String a14 = a9.f3066k.a(str2);
                                    if (a14 != null) {
                                        str3 = a14;
                                    }
                                }
                                fVar.g().h();
                                if ((i7 == 204 && i7 != 205) || a9.f3067l.a() <= 0) {
                                    return a9;
                                }
                                throw new ProtocolException("HTTP " + i7 + " had non-zero Content-Length: " + a9.f3067l.a());
                            }
                        } else {
                            str2 = str;
                        }
                        z6 = false;
                        if (equalsIgnoreCase) {
                        }
                        if (equalsIgnoreCase) {
                        }
                        a8 = nVar.a("Content-Type");
                        if (a8 == null) {
                        }
                        long h722 = fVar.h(a7);
                        i iVar22 = new i(a8, h722, n6.b.b(new b6.h(aVar, fVar.i(a7), h722)));
                        v a1122 = a7.a();
                        a1122.f3052g = iVar22;
                        a1122.f3060o = new b();
                        a9 = a1122.a();
                        if (!"close".equalsIgnoreCase(((n) a9.f3061f.f332d).a(str2))) {
                        }
                        fVar.g().h();
                        if (i7 == 204) {
                        }
                        throw new ProtocolException("HTTP " + i7 + " had non-zero Content-Length: " + a9.f3067l.a());
                    }
                    str = "Connection";
                    qVar.f(aVar, true, false, null);
                }
                a8 = nVar.a("Content-Type");
                if (a8 == null) {
                }
                long h7222 = fVar.h(a7);
                i iVar222 = new i(a8, h7222, n6.b.b(new b6.h(aVar, fVar.i(a7), h7222)));
                v a11222 = a7.a();
                a11222.f3052g = iVar222;
                a11222.f3060o = new b();
                a9 = a11222.a();
                if (!"close".equalsIgnoreCase(((n) a9.f3061f.f332d).a(str2))) {
                }
                fVar.g().h();
                if (i7 == 204) {
                }
                throw new ProtocolException("HTTP " + i7 + " had non-zero Content-Length: " + a9.f3067l.a());
            } catch (IOException e13) {
                aVar.d(e13);
                throw e13;
            }
            fVar.c();
            iOException = null;
            if (vVar == null) {
            }
            vVar.f3046a = hVar2;
            vVar.f3050e = aVar.b().f3701g;
            vVar.f3057l = currentTimeMillis;
            vVar.f3058m = System.currentTimeMillis();
            a7 = vVar.a();
            i7 = a7.f3064i;
            while (true) {
                nVar = a7.f3066k;
                yVar = a7.f3067l;
                if (i7 != 100) {
                    break;
                }
                v c722 = aVar.c(false);
                kotlin.jvm.internal.i.b(c722);
                c722.f3046a = hVar2;
                c722.f3050e = aVar.b().f3701g;
                c722.f3057l = currentTimeMillis;
                c722.f3058m = System.currentTimeMillis();
                a7 = c722.a();
                i7 = a7.f3064i;
            }
            if (i7 == 101) {
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
        } catch (IOException e14) {
            aVar.d(e14);
            throw e14;
        }
        vVar = null;
    }
}
