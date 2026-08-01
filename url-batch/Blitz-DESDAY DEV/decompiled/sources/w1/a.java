package w1;

import E1.k;
import E1.p;
import J.i;
import T0.g;
import h0.a0;
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
import l.C0176a0;
import r1.j;
import r1.l;
import r1.m;
import r1.o;
import r1.q;
import r1.r;
import r1.s;
import r1.t;
import v1.n;
import y1.C0317a;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3939a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3940b;

    public a(r1.b bVar) {
        g1.d.e(bVar, "cookieJar");
        this.f3940b = bVar;
    }

    public static int d(r rVar, int i) {
        String g2 = r.g("Retry-After", rVar);
        if (g2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        g1.d.d(compile, "compile(...)");
        if (!compile.matcher(g2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(g2);
        g1.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r1.m
    public final r a(f fVar) {
        s sVar;
        X0.s sVar2;
        int i;
        SSLSocketFactory sSLSocketFactory;
        D1.c cVar;
        r1.d dVar;
        switch (this.f3939a) {
            case 0:
                J.d dVar2 = fVar.f3945e;
                g g2 = dVar2.g();
                boolean z2 = false;
                j jVar = (j) dVar2.d;
                String a2 = jVar.a("Host");
                l lVar = (l) dVar2.f359c;
                if (a2 == null) {
                    g2.k("Host", s1.b.u(lVar, false));
                }
                if (jVar.a("Connection") == null) {
                    g2.k("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    g2.k("Accept-Encoding", "gzip");
                    z2 = true;
                }
                r1.b bVar = (r1.b) this.f3940b;
                bVar.getClass();
                g1.d.e(lVar, "url");
                if (jVar.a("User-Agent") == null) {
                    g2.k("User-Agent", "okhttp/4.12.0");
                }
                r b2 = fVar.b(g2.b());
                j jVar2 = b2.f3549f;
                e.b(bVar, lVar, jVar2);
                q h = b2.h();
                h.f3535a = dVar2;
                if (z2 && "gzip".equalsIgnoreCase(r.g("Content-Encoding", b2)) && e.a(b2) && (sVar = b2.f3550g) != null) {
                    k kVar = new k(sVar.h());
                    C0176a0 c2 = jVar2.c();
                    c2.h("Content-Encoding");
                    c2.h("Content-Length");
                    h.f3539f = c2.g().c();
                    h.f3540g = new s(r.g("Content-Type", b2), -1L, new p(kVar), 1);
                }
                return h.a();
            default:
                J.d dVar3 = fVar.f3945e;
                v1.j jVar3 = fVar.f3942a;
                X0.s sVar3 = X0.s.f992a;
                r rVar = null;
                int i2 = 0;
                J.d dVar4 = dVar3;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar3.getClass();
                        if (jVar3.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar3) {
                            try {
                                if (jVar3.f3883k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar3.f3882j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            n nVar = jVar3.f3878c;
                            l lVar2 = (l) dVar4.f359c;
                            boolean z4 = lVar2.i;
                            o oVar = jVar3.f3876a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = oVar.f3518o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                D1.c cVar2 = oVar.f3522s;
                                dVar = oVar.f3523t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            sVar2 = sVar3;
                            i = i2;
                            jVar3.f3881g = new v1.f(nVar, new r1.a(lVar2.d, lVar2.f3499e, oVar.f3514k, oVar.f3517n, sSLSocketFactory, cVar, dVar, oVar.f3516m, oVar.f3521r, oVar.f3520q, oVar.f3515l), jVar3);
                        } else {
                            sVar2 = sVar3;
                            i = i2;
                        }
                        try {
                            if (jVar3.f3885m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                r b3 = fVar.b(dVar4);
                                if (rVar != null) {
                                    q h2 = b3.h();
                                    q h3 = rVar.h();
                                    h3.f3540g = null;
                                    r a3 = h3.a();
                                    if (a3.f3550g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    h2.f3541j = a3;
                                    b3 = h2.a();
                                }
                                rVar = b3;
                                dVar4 = b(rVar, jVar3.i);
                                if (dVar4 == null) {
                                    jVar3.e(false);
                                    return rVar;
                                }
                                s sVar4 = rVar.f3550g;
                                if (sVar4 != null) {
                                    s1.b.b(sVar4);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar3.e(true);
                                sVar3 = sVar2;
                            } catch (IOException e2) {
                                if (!c(e2, jVar3, dVar4, !(e2 instanceof C0317a))) {
                                    Iterator it = sVar2.iterator();
                                    while (it.hasNext()) {
                                        z1.l.j(e2, (Exception) it.next());
                                    }
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(sVar2.size() + 1);
                                arrayList.addAll(sVar2);
                                arrayList.add(e2);
                                jVar3.e(true);
                                sVar3 = arrayList;
                                i2 = i;
                                z3 = false;
                            } catch (v1.o e3) {
                                X0.s sVar5 = sVar2;
                                if (!c(e3.f3908b, jVar3, dVar4, false)) {
                                    IOException iOException = e3.f3907a;
                                    g1.d.e(iOException, "<this>");
                                    Iterator it2 = sVar5.iterator();
                                    while (it2.hasNext()) {
                                        z1.l.j(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3907a;
                                ArrayList arrayList2 = new ArrayList(sVar5.size() + 1);
                                arrayList2.addAll(sVar5);
                                arrayList2.add(iOException2);
                                jVar3.e(true);
                                sVar3 = arrayList2;
                                z3 = false;
                                i2 = i;
                            }
                        } catch (Throwable th2) {
                            jVar3.e(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public J.d b(r rVar, v1.e eVar) {
        String g2;
        r1.k kVar;
        v1.m mVar;
        t tVar = (eVar == null || (mVar = eVar.f3864e) == null) ? null : mVar.f3891b;
        int i = rVar.d;
        String str = (String) rVar.f3545a.f358b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((o) this.f3940b).f3512g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || g1.d.a(eVar.f3862b.f3866b.h.d, eVar.f3864e.f3891b.f3558a.h.d)) {
                    return null;
                }
                v1.m mVar2 = eVar.f3864e;
                synchronized (mVar2) {
                    mVar2.f3897k = true;
                }
                return rVar.f3545a;
            }
            if (i == 503) {
                r rVar2 = rVar.f3551j;
                if ((rVar2 == null || rVar2.d != 503) && d(rVar, Integer.MAX_VALUE) == 0) {
                    return rVar.f3545a;
                }
                return null;
            }
            if (i == 407) {
                g1.d.b(tVar);
                if (tVar.f3559b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((o) this.f3940b).f3516m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((o) this.f3940b).f3511f) {
                    return null;
                }
                r rVar3 = rVar.f3551j;
                if ((rVar3 == null || rVar3.d != 408) && d(rVar, 0) <= 0) {
                    return rVar.f3545a;
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
        o oVar = (o) this.f3940b;
        if (!oVar.h || (g2 = r.g("Location", rVar)) == null) {
            return null;
        }
        J.d dVar = rVar.f3545a;
        l lVar = (l) dVar.f359c;
        lVar.getClass();
        try {
            kVar = new r1.k();
            kVar.c(lVar, g2);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        l a2 = kVar != null ? kVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!g1.d.a(a2.f3496a, ((l) dVar.f359c).f3496a) && !oVar.i) {
            return null;
        }
        g g3 = dVar.g();
        if (a0.n(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = rVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g3.o(str, null);
            } else {
                g3.o("GET", null);
            }
            if (!z2) {
                ((C0176a0) g3.f826c).h("Transfer-Encoding");
                ((C0176a0) g3.f826c).h("Content-Length");
                ((C0176a0) g3.f826c).h("Content-Type");
            }
        }
        if (!s1.b.a((l) dVar.f359c, a2)) {
            ((C0176a0) g3.f826c).h("Authorization");
        }
        g3.f824a = a2;
        return g3.b();
    }

    public boolean c(IOException iOException, v1.j jVar, J.d dVar, boolean z2) {
        v1.p pVar;
        boolean i;
        v1.m mVar;
        if (!((o) this.f3940b).f3511f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        v1.f fVar = jVar.f3881g;
        g1.d.b(fVar);
        int i2 = fVar.f3869f;
        if (i2 == 0 && fVar.f3870g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                t tVar = null;
                if (i2 <= 1 && fVar.f3870g <= 1 && fVar.h <= 0 && (mVar = fVar.f3867c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3898l == 0) {
                            if (s1.b.a(mVar.f3891b.f3558a.h, fVar.f3866b.h)) {
                                tVar = mVar.f3891b;
                            }
                        }
                    }
                }
                if (tVar != null) {
                    fVar.i = tVar;
                } else {
                    i iVar = fVar.d;
                    if ((iVar == null || !iVar.g()) && (pVar = fVar.f3868e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(o oVar) {
        this.f3940b = oVar;
    }
}
