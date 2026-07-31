package L2;

import C0.q;
import E.F;
import G2.k;
import G2.l;
import G2.m;
import G2.n;
import G2.o;
import G2.r;
import G2.t;
import G2.u;
import G2.v;
import G2.w;
import N2.C0203a;
import f2.j;
import h2.AbstractC0508a;
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
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3408a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3409b;

    public a(G2.b bVar) {
        j.f(bVar, "cookieJar");
        this.f3409b = bVar;
    }

    public static int d(u uVar, int i3) {
        String a3 = u.a(uVar, "Retry-After");
        if (a3 == null) {
            return i3;
        }
        Pattern compile = Pattern.compile("\\d+");
        j.e(compile, "compile(...)");
        if (!compile.matcher(a3).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a3);
        j.e(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // G2.o
    public final u a(g gVar) {
        v vVar;
        List list;
        int i3;
        SSLSocketFactory sSLSocketFactory;
        S2.c cVar;
        G2.d dVar;
        switch (this.f3408a) {
            case 0:
                q qVar = gVar.f3416e;
                G1.g j3 = qVar.j();
                boolean z3 = false;
                l lVar = (l) qVar.f632e;
                String b3 = lVar.b("Host");
                n nVar = (n) qVar.f630c;
                if (b3 == null) {
                    j3.j("Host", H2.b.v(nVar, false));
                }
                if (lVar.b("Connection") == null) {
                    j3.j("Connection", "Keep-Alive");
                }
                if (lVar.b("Accept-Encoding") == null && lVar.b("Range") == null) {
                    j3.j("Accept-Encoding", "gzip");
                    z3 = true;
                }
                G2.b bVar = (G2.b) this.f3409b;
                bVar.getClass();
                j.f(nVar, "url");
                if (lVar.b("User-Agent") == null) {
                    j3.j("User-Agent", "okhttp/4.12.0");
                }
                u b4 = gVar.b(j3.b());
                l lVar2 = b4.f2299i;
                f.b(bVar, nVar, lVar2);
                t b5 = b4.b();
                b5.f2281a = qVar;
                if (z3 && "gzip".equalsIgnoreCase(u.a(b4, "Content-Encoding")) && f.a(b4) && (vVar = b4.f2300j) != null) {
                    T2.o oVar = new T2.o(vVar.b());
                    k d3 = lVar2.d();
                    d3.j("Content-Encoding");
                    d3.j("Content-Length");
                    b5.f2286f = d3.b().d();
                    b5.f2287g = new v(u.a(b4, "Content-Type"), -1L, AbstractC0508a.p(oVar), 1);
                }
                return b5.a();
            default:
                q qVar2 = gVar.f3416e;
                K2.g gVar2 = gVar.f3412a;
                List list2 = S1.u.f4320d;
                u uVar = null;
                int i4 = 0;
                q qVar3 = qVar2;
                while (true) {
                    boolean z4 = true;
                    while (true) {
                        gVar2.getClass();
                        if (gVar2.f3295l != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (gVar2) {
                            try {
                                if (gVar2.f3297n) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (gVar2.f3296m) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z4) {
                            K2.k kVar = gVar2.f3289f;
                            n nVar2 = (n) qVar3.f630c;
                            boolean z5 = nVar2.f2223i;
                            r rVar = gVar2.f3287d;
                            if (z5) {
                                SSLSocketFactory sSLSocketFactory2 = rVar.f2264r;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                S2.c cVar2 = rVar.f2268v;
                                dVar = rVar.f2269w;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            list = list2;
                            i3 = i4;
                            gVar2.f3293j = new K2.d(kVar, new G2.a(nVar2.f2218d, nVar2.f2219e, rVar.f2260n, rVar.f2263q, sSLSocketFactory, cVar, dVar, rVar.f2262p, rVar.f2267u, rVar.f2266t, rVar.f2261o), gVar2);
                        } else {
                            list = list2;
                            i3 = i4;
                        }
                        try {
                            if (gVar2.f3299p) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b6 = gVar.b(qVar3);
                                if (uVar != null) {
                                    t b7 = b6.b();
                                    t b8 = uVar.b();
                                    b8.f2287g = null;
                                    u a3 = b8.a();
                                    if (a3.f2300j != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    b7.f2290j = a3;
                                    b6 = b7.a();
                                }
                                uVar = b6;
                                qVar3 = b(uVar, gVar2.f3295l);
                                if (qVar3 == null) {
                                    gVar2.d(false);
                                    return uVar;
                                }
                                v vVar2 = uVar.f2300j;
                                if (vVar2 != null) {
                                    H2.b.c(vVar2);
                                }
                                i4 = i3 + 1;
                                if (i4 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i4);
                                }
                                gVar2.d(true);
                                list2 = list;
                            } catch (K2.l e3) {
                                List list3 = list;
                                if (!c(e3.f3328e, gVar2, qVar3, false)) {
                                    IOException iOException = e3.f3327d;
                                    j.f(iOException, "<this>");
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        R1.a.a(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                list2 = S1.l.T0(list3, e3.f3327d);
                                gVar2.d(true);
                                z4 = false;
                                i4 = i3;
                            } catch (IOException e4) {
                                if (!c(e4, gVar2, qVar3, !(e4 instanceof C0203a))) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        R1.a.a(e4, (Exception) it2.next());
                                    }
                                    throw e4;
                                }
                                list2 = S1.l.T0(list, e4);
                                gVar2.d(true);
                                i4 = i3;
                                z4 = false;
                            }
                        } catch (Throwable th2) {
                            gVar2.d(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public q b(u uVar, F f3) {
        String a3;
        m mVar;
        K2.j jVar;
        w wVar = (f3 == null || (jVar = (K2.j) f3.f926e) == null) ? null : jVar.f3307b;
        int i3 = uVar.f2297g;
        String str = (String) uVar.f2294d.f631d;
        if (i3 != 307 && i3 != 308) {
            if (i3 == 401) {
                ((r) this.f3409b).f2256j.getClass();
                return null;
            }
            if (i3 == 421) {
                if (f3 == null || j.a(((K2.d) f3.f924c).f3277b.f2133h.f2218d, ((K2.j) f3.f926e).f3307b.f2311a.f2133h.f2218d)) {
                    return null;
                }
                K2.j jVar2 = (K2.j) f3.f926e;
                synchronized (jVar2) {
                    jVar2.f3316k = true;
                }
                return uVar.f2294d;
            }
            if (i3 == 503) {
                u uVar2 = uVar.f2303m;
                if ((uVar2 == null || uVar2.f2297g != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                    return uVar.f2294d;
                }
                return null;
            }
            if (i3 == 407) {
                j.c(wVar);
                if (wVar.f2312b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((r) this.f3409b).f2262p.getClass();
                return null;
            }
            if (i3 == 408) {
                if (!((r) this.f3409b).f2255i) {
                    return null;
                }
                u uVar3 = uVar.f2303m;
                if ((uVar3 == null || uVar3.f2297g != 408) && d(uVar, 0) <= 0) {
                    return uVar.f2294d;
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
        r rVar = (r) this.f3409b;
        if (!rVar.f2257k || (a3 = u.a(uVar, "Location")) == null) {
            return null;
        }
        q qVar = uVar.f2294d;
        n nVar = (n) qVar.f630c;
        nVar.getClass();
        try {
            mVar = new m();
            mVar.c(nVar, a3);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        n a4 = mVar != null ? mVar.a() : null;
        if (a4 == null) {
            return null;
        }
        if (!j.a(a4.f2215a, ((n) qVar.f630c).f2215a) && !rVar.f2258l) {
            return null;
        }
        G1.g j3 = qVar.j();
        if (l0.c.J(str)) {
            boolean equals = str.equals("PROPFIND");
            int i4 = uVar.f2297g;
            boolean z3 = equals || i4 == 308 || i4 == 307;
            if (str.equals("PROPFIND") || i4 == 308 || i4 == 307) {
                j3.k(str, null);
            } else {
                j3.k("GET", null);
            }
            if (!z3) {
                ((k) j3.f2095g).j("Transfer-Encoding");
                ((k) j3.f2095g).j("Content-Length");
                ((k) j3.f2095g).j("Content-Type");
            }
        }
        if (!H2.b.a((n) qVar.f630c, a4)) {
            ((k) j3.f2095g).j("Authorization");
        }
        j3.f2093e = a4;
        return j3.b();
    }

    public boolean c(IOException iOException, K2.g gVar, q qVar, boolean z3) {
        K2.n nVar;
        boolean i3;
        K2.j jVar;
        if (!((r) this.f3409b).f2255i) {
            return false;
        }
        if ((z3 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z3)) {
            return false;
        }
        K2.d dVar = gVar.f3293j;
        j.c(dVar);
        int i4 = dVar.f3281f;
        if (i4 == 0 && dVar.f3282g == 0 && dVar.f3283h == 0) {
            i3 = false;
        } else {
            if (dVar.f3284i == null) {
                w wVar = null;
                if (i4 <= 1 && dVar.f3282g <= 1 && dVar.f3283h <= 0 && (jVar = dVar.f3278c.f3294k) != null) {
                    synchronized (jVar) {
                        if (jVar.f3317l == 0) {
                            if (H2.b.a(jVar.f3307b.f2311a.f2133h, dVar.f3277b.f2133h)) {
                                wVar = jVar.f3307b;
                            }
                        }
                    }
                }
                if (wVar != null) {
                    dVar.f3284i = wVar;
                } else {
                    K2.m mVar = dVar.f3279d;
                    if ((mVar == null || !mVar.d()) && (nVar = dVar.f3280e) != null) {
                        i3 = nVar.i();
                    }
                }
            }
            i3 = true;
        }
        return i3;
    }

    public a(r rVar) {
        j.f(rVar, "client");
        this.f3409b = rVar;
    }
}
