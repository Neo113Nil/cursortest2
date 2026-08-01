package E1;

import D1.n;
import D1.o;
import G1.C0000a;
import M1.k;
import M1.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k.C0191o;
import z1.j;
import z1.l;
import z1.m;
import z1.r;
import z1.s;
import z1.t;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f230b;

    public a(z1.b bVar) {
        k1.e.e(bVar, "cookieJar");
        this.f230b = bVar;
    }

    public static int d(s sVar, int i) {
        String a2 = s.a("Retry-After", sVar);
        if (a2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        k1.e.d(compile, "compile(...)");
        if (!compile.matcher(a2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a2);
        k1.e.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z1.m
    public final s a(g gVar) {
        h hVar;
        Y0.s sVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        L1.c cVar;
        z1.d dVar;
        switch (this.f229a) {
            case 0:
                H.e eVar = gVar.f236e;
                T0.m g2 = eVar.g();
                boolean z2 = false;
                j jVar = (j) eVar.d;
                String a2 = jVar.a("Host");
                l lVar = (l) eVar.f483c;
                if (a2 == null) {
                    g2.n("Host", A1.c.u(lVar, false));
                }
                if (jVar.a("Connection") == null) {
                    g2.n("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    g2.n("Accept-Encoding", "gzip");
                    z2 = true;
                }
                z1.b bVar = (z1.b) this.f230b;
                bVar.getClass();
                k1.e.e(lVar, "url");
                if (jVar.a("User-Agent") == null) {
                    g2.n("User-Agent", "okhttp/4.12.0");
                }
                s b2 = gVar.b(g2.b());
                j jVar2 = b2.f4763f;
                f.b(bVar, lVar, jVar2);
                r d = b2.d();
                d.f4749a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(s.a("Content-Encoding", b2)) && f.a(b2) && (hVar = b2.f4764g) != null) {
                    k kVar = new k(hVar.d());
                    C0191o c2 = jVar2.c();
                    c2.l("Content-Encoding");
                    c2.l("Content-Length");
                    d.f4753f = c2.j().c();
                    d.f4754g = new h(s.a("Content-Type", b2), -1L, new p(kVar), 0);
                }
                return d.a();
            default:
                H.e eVar2 = gVar.f236e;
                D1.j jVar3 = gVar.f233a;
                Y0.s sVar2 = Y0.s.f1516a;
                s sVar3 = null;
                int i2 = 0;
                H.e eVar3 = eVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar3.getClass();
                        if (jVar3.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar3) {
                            try {
                                if (jVar3.f185k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar3.f184j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            n nVar = jVar3.f180c;
                            l lVar2 = (l) eVar3.f483c;
                            boolean z4 = lVar2.i;
                            z1.p pVar = jVar3.f178a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = pVar.f4732o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                L1.c cVar2 = pVar.f4736s;
                                dVar = pVar.f4737t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            sVar = sVar2;
                            i = i2;
                            jVar3.f183g = new D1.f(nVar, new z1.a(lVar2.d, lVar2.f4696e, pVar.f4728k, pVar.f4731n, sSLSocketFactory, cVar, dVar, pVar.f4730m, pVar.f4735r, pVar.f4734q, pVar.f4729l), jVar3);
                        } else {
                            sVar = sVar2;
                            i = i2;
                        }
                        try {
                            if (jVar3.f187m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                s b3 = gVar.b(eVar3);
                                if (sVar3 != null) {
                                    r d2 = b3.d();
                                    r d3 = sVar3.d();
                                    d3.f4754g = null;
                                    s a3 = d3.a();
                                    if (a3.f4764g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    d2.f4755j = a3;
                                    b3 = d2.a();
                                }
                                sVar3 = b3;
                                eVar3 = b(sVar3, jVar3.i);
                                if (eVar3 == null) {
                                    jVar3.e(false);
                                    return sVar3;
                                }
                                h hVar2 = sVar3.f4764g;
                                if (hVar2 != null) {
                                    A1.c.b(hVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar3.e(true);
                                sVar2 = sVar;
                            } catch (o e2) {
                                Y0.s sVar4 = sVar;
                                if (!c(e2.f210b, jVar3, eVar3, false)) {
                                    IOException iOException = e2.f209a;
                                    k1.e.e(iOException, "<this>");
                                    Iterator it = sVar4.iterator();
                                    while (it.hasNext()) {
                                        H1.d.b(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e2.f209a;
                                ArrayList arrayList = new ArrayList(sVar4.size() + 1);
                                arrayList.addAll(sVar4);
                                arrayList.add(iOException2);
                                jVar3.e(true);
                                sVar2 = arrayList;
                                z3 = false;
                                i2 = i;
                            } catch (IOException e3) {
                                if (!c(e3, jVar3, eVar3, !(e3 instanceof C0000a))) {
                                    Iterator it2 = sVar.iterator();
                                    while (it2.hasNext()) {
                                        H1.d.b(e3, (Exception) it2.next());
                                    }
                                    throw e3;
                                }
                                ArrayList arrayList2 = new ArrayList(sVar.size() + 1);
                                arrayList2.addAll(sVar);
                                arrayList2.add(e3);
                                jVar3.e(true);
                                sVar2 = arrayList2;
                                i2 = i;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            jVar3.e(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public H.e b(s sVar, D1.e eVar) {
        String a2;
        z1.k kVar;
        D1.m mVar;
        t tVar = (eVar == null || (mVar = eVar.f166e) == null) ? null : mVar.f193b;
        int i = sVar.d;
        String str = (String) sVar.f4759a.f482b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((z1.p) this.f230b).f4726g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || k1.e.a(eVar.f164b.f168b.h.d, eVar.f166e.f193b.f4769a.h.d)) {
                    return null;
                }
                D1.m mVar2 = eVar.f166e;
                synchronized (mVar2) {
                    mVar2.f199k = true;
                }
                return sVar.f4759a;
            }
            if (i == 503) {
                s sVar2 = sVar.f4765j;
                if ((sVar2 == null || sVar2.d != 503) && d(sVar, Integer.MAX_VALUE) == 0) {
                    return sVar.f4759a;
                }
                return null;
            }
            if (i == 407) {
                k1.e.b(tVar);
                if (tVar.f4770b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((z1.p) this.f230b).f4730m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((z1.p) this.f230b).f4725f) {
                    return null;
                }
                s sVar3 = sVar.f4765j;
                if ((sVar3 == null || sVar3.d != 408) && d(sVar, 0) <= 0) {
                    return sVar.f4759a;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        z1.p pVar = (z1.p) this.f230b;
        if (!pVar.h || (a2 = s.a("Location", sVar)) == null) {
            return null;
        }
        H.e eVar2 = sVar.f4759a;
        l lVar = (l) eVar2.f483c;
        lVar.getClass();
        try {
            kVar = new z1.k();
            kVar.c(lVar, a2);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        l a3 = kVar != null ? kVar.a() : null;
        if (a3 == null) {
            return null;
        }
        if (!k1.e.a(a3.f4693a, ((l) eVar2.f483c).f4693a) && !pVar.i) {
            return null;
        }
        T0.m g2 = eVar2.g();
        if (H1.d.a0(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = sVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g2.r(str, null);
            } else {
                g2.r("GET", null);
            }
            if (!z2) {
                ((C0191o) g2.f1075c).l("Transfer-Encoding");
                ((C0191o) g2.f1075c).l("Content-Length");
                ((C0191o) g2.f1075c).l("Content-Type");
            }
        }
        if (!A1.c.a((l) eVar2.f483c, a3)) {
            ((C0191o) g2.f1075c).l("Authorization");
        }
        g2.f1073a = a3;
        return g2.b();
    }

    public boolean c(IOException iOException, D1.j jVar, H.e eVar, boolean z2) {
        D1.p pVar;
        boolean i;
        D1.m mVar;
        if (!((z1.p) this.f230b).f4725f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        D1.f fVar = jVar.f183g;
        k1.e.b(fVar);
        int i2 = fVar.f171f;
        if (i2 == 0 && fVar.f172g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                t tVar = null;
                if (i2 <= 1 && fVar.f172g <= 1 && fVar.h <= 0 && (mVar = fVar.f169c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f200l == 0) {
                            if (A1.c.a(mVar.f193b.f4769a.h, fVar.f168b.h)) {
                                tVar = mVar.f193b;
                            }
                        }
                    }
                }
                if (tVar != null) {
                    fVar.i = tVar;
                } else {
                    C0.f fVar2 = fVar.d;
                    if ((fVar2 == null || !fVar2.b()) && (pVar = fVar.f170e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(z1.p pVar) {
        this.f230b = pVar;
    }
}
