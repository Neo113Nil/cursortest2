package F2;

import A2.A;
import A2.C0002a;
import A2.C0003b;
import A2.k;
import A2.n;
import A2.o;
import A2.p;
import A2.q;
import A2.r;
import A2.w;
import A2.x;
import A2.y;
import A2.z;
import E.G;
import E2.l;
import E2.m;
import H2.C0079a;
import M1.B;
import M1.u;
import Z1.i;
import a.AbstractC0157a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1488a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1489b;

    public a(C0003b c0003b) {
        i.f(c0003b, "cookieJar");
        this.f1489b = c0003b;
    }

    public static int d(y yVar, int i3) {
        String a3 = y.a(yVar, "Retry-After");
        if (a3 == null) {
            return i3;
        }
        Pattern compile = Pattern.compile("\\d+");
        i.e(compile, "compile(...)");
        if (!compile.matcher(a3).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a3);
        i.e(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // A2.r
    public final y a(g gVar) {
        z zVar;
        List list;
        int i3;
        SSLSocketFactory sSLSocketFactory;
        M2.c cVar;
        A2.d dVar;
        switch (this.f1488a) {
            case 0:
                w wVar = gVar.f1496e;
                k f3 = wVar.f();
                boolean z3 = false;
                o oVar = (o) wVar.f195d;
                String b2 = oVar.b("Host");
                q qVar = (q) wVar.f193b;
                if (b2 == null) {
                    f3.j("Host", B2.c.v(qVar, false));
                }
                if (oVar.b("Connection") == null) {
                    f3.j("Connection", "Keep-Alive");
                }
                if (oVar.b("Accept-Encoding") == null && oVar.b("Range") == null) {
                    f3.j("Accept-Encoding", "gzip");
                    z3 = true;
                }
                C0003b c0003b = (C0003b) this.f1489b;
                c0003b.getClass();
                i.f(qVar, "url");
                if (oVar.b("User-Agent") == null) {
                    f3.j("User-Agent", "okhttp/4.12.0");
                }
                y b3 = gVar.b(f3.f());
                o oVar2 = b3.f216i;
                f.b(c0003b, qVar, oVar2);
                x b4 = b3.b();
                b4.f198a = wVar;
                if (z3 && "gzip".equalsIgnoreCase(y.a(b3, "Content-Encoding")) && f.a(b3) && (zVar = b3.f217j) != null) {
                    N2.o oVar3 = new N2.o(zVar.b());
                    n d3 = oVar2.d();
                    d3.k("Content-Encoding");
                    d3.k("Content-Length");
                    b4.f203f = d3.b().d();
                    b4.f204g = new z(y.a(b3, "Content-Type"), -1L, AbstractC0157a.j(oVar3), 1);
                }
                return b4.a();
            default:
                w wVar2 = gVar.f1496e;
                E2.h hVar = gVar.f1492a;
                List list2 = u.f2803d;
                y yVar = null;
                int i4 = 0;
                w wVar3 = wVar2;
                while (true) {
                    boolean z4 = true;
                    while (true) {
                        hVar.getClass();
                        if (hVar.f810l != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (hVar) {
                            try {
                                if (hVar.f812n) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (hVar.f811m) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z4) {
                            l lVar = hVar.f804f;
                            q qVar2 = (q) wVar3.f193b;
                            boolean z5 = qVar2.f137i;
                            A2.u uVar = hVar.f802d;
                            if (z5) {
                                SSLSocketFactory sSLSocketFactory2 = uVar.f175r;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                M2.c cVar2 = uVar.f179v;
                                dVar = uVar.f180w;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            list = list2;
                            i3 = i4;
                            hVar.f808j = new E2.e(lVar, new C0002a(qVar2.f132d, qVar2.f133e, uVar.f172n, uVar.f174q, sSLSocketFactory, cVar, dVar, uVar.p, uVar.f178u, uVar.f177t, uVar.f173o), hVar);
                        } else {
                            list = list2;
                            i3 = i4;
                        }
                        try {
                            if (hVar.p) {
                                throw new IOException("Canceled");
                            }
                            try {
                                y b5 = gVar.b(wVar3);
                                if (yVar != null) {
                                    x b6 = b5.b();
                                    x b7 = yVar.b();
                                    b7.f204g = null;
                                    y a3 = b7.a();
                                    if (a3.f217j != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    b6.f207j = a3;
                                    b5 = b6.a();
                                }
                                yVar = b5;
                                wVar3 = b(yVar, hVar.f810l);
                                if (wVar3 == null) {
                                    hVar.d(false);
                                    return yVar;
                                }
                                z zVar2 = yVar.f217j;
                                if (zVar2 != null) {
                                    B2.c.c(zVar2);
                                }
                                i4 = i3 + 1;
                                if (i4 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i4);
                                }
                                hVar.d(true);
                                list2 = list;
                            } catch (m e3) {
                                List list3 = list;
                                if (!c(e3.f841e, hVar, wVar3, false)) {
                                    IOException iOException = e3.f840d;
                                    i.f(iOException, "<this>");
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        B.o(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                list2 = M1.l.v0(list3, e3.f840d);
                                hVar.d(true);
                                z4 = false;
                                i4 = i3;
                            } catch (IOException e4) {
                                if (!c(e4, hVar, wVar3, !(e4 instanceof C0079a))) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        B.o(e4, (Exception) it2.next());
                                    }
                                    throw e4;
                                }
                                list2 = M1.l.v0(list, e4);
                                hVar.d(true);
                                i4 = i3;
                                z4 = false;
                            }
                        } catch (Throwable th2) {
                            hVar.d(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public w b(y yVar, G g3) {
        String a3;
        p pVar;
        E2.k kVar;
        A a4 = (g3 == null || (kVar = (E2.k) g3.f625e) == null) ? null : kVar.f821b;
        int i3 = yVar.f214g;
        String str = (String) yVar.f211d.f194c;
        if (i3 != 307 && i3 != 308) {
            if (i3 == 401) {
                ((A2.u) this.f1489b).f168j.getClass();
                return null;
            }
            if (i3 == 421) {
                if (g3 == null || i.a(((E2.e) g3.f623c).f792b.f40h.f132d, ((E2.k) g3.f625e).f821b.f23a.f40h.f132d)) {
                    return null;
                }
                E2.k kVar2 = (E2.k) g3.f625e;
                synchronized (kVar2) {
                    kVar2.f830k = true;
                }
                return yVar.f211d;
            }
            if (i3 == 503) {
                y yVar2 = yVar.f220m;
                if ((yVar2 == null || yVar2.f214g != 503) && d(yVar, Integer.MAX_VALUE) == 0) {
                    return yVar.f211d;
                }
                return null;
            }
            if (i3 == 407) {
                i.c(a4);
                if (a4.f24b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((A2.u) this.f1489b).p.getClass();
                return null;
            }
            if (i3 == 408) {
                if (!((A2.u) this.f1489b).f167i) {
                    return null;
                }
                y yVar3 = yVar.f220m;
                if ((yVar3 == null || yVar3.f214g != 408) && d(yVar, 0) <= 0) {
                    return yVar.f211d;
                }
                return null;
            }
            switch (i3) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        A2.u uVar = (A2.u) this.f1489b;
        if (!uVar.f169k || (a3 = y.a(yVar, "Location")) == null) {
            return null;
        }
        w wVar = yVar.f211d;
        q qVar = (q) wVar.f193b;
        qVar.getClass();
        try {
            pVar = new p();
            pVar.c(qVar, a3);
        } catch (IllegalArgumentException unused) {
            pVar = null;
        }
        q a5 = pVar != null ? pVar.a() : null;
        if (a5 == null) {
            return null;
        }
        if (!i.a(a5.f129a, ((q) wVar.f193b).f129a) && !uVar.f170l) {
            return null;
        }
        k f3 = wVar.f();
        if (I2.l.K(str)) {
            boolean equals = str.equals("PROPFIND");
            int i4 = yVar.f214g;
            boolean z3 = equals || i4 == 308 || i4 == 307;
            if (str.equals("PROPFIND") || i4 == 308 || i4 == 307) {
                f3.k(str, null);
            } else {
                f3.k("GET", null);
            }
            if (!z3) {
                ((n) f3.f110d).k("Transfer-Encoding");
                ((n) f3.f110d).k("Content-Length");
                ((n) f3.f110d).k("Content-Type");
            }
        }
        if (!B2.c.a((q) wVar.f193b, a5)) {
            ((n) f3.f110d).k("Authorization");
        }
        f3.f108b = a5;
        return f3.f();
    }

    public boolean c(IOException iOException, E2.h hVar, w wVar, boolean z3) {
        E2.o oVar;
        boolean i3;
        E2.k kVar;
        if (!((A2.u) this.f1489b).f167i) {
            return false;
        }
        if ((z3 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z3)) {
            return false;
        }
        E2.e eVar = hVar.f808j;
        i.c(eVar);
        int i4 = eVar.f796f;
        if (i4 == 0 && eVar.f797g == 0 && eVar.f798h == 0) {
            i3 = false;
        } else {
            if (eVar.f799i == null) {
                A a3 = null;
                if (i4 <= 1 && eVar.f797g <= 1 && eVar.f798h <= 0 && (kVar = eVar.f793c.f809k) != null) {
                    synchronized (kVar) {
                        if (kVar.f831l == 0) {
                            if (B2.c.a(kVar.f821b.f23a.f40h, eVar.f792b.f40h)) {
                                a3 = kVar.f821b;
                            }
                        }
                    }
                }
                if (a3 != null) {
                    eVar.f799i = a3;
                } else {
                    E2.n nVar = eVar.f794d;
                    if ((nVar == null || !nVar.d()) && (oVar = eVar.f795e) != null) {
                        i3 = oVar.i();
                    }
                }
            }
            i3 = true;
        }
        return i3;
    }

    public a(A2.u uVar) {
        i.f(uVar, "client");
        this.f1489b = uVar;
    }
}
