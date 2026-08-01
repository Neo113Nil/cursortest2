package p1;

import C.g;
import R0.q;
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
import k0.y;
import k1.l;
import k1.m;
import k1.n;
import k1.o;
import k1.r;
import k1.t;
import k1.u;
import k1.v;
import k1.w;
import o1.j;
import r1.C0290a;
import x1.k;
import x1.p;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3464a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3465b;

    public a(k1.b bVar) {
        Z0.d.e(bVar, "cookieJar");
        this.f3465b = bVar;
    }

    public static int d(u uVar, int i) {
        String f2 = u.f("Retry-After", uVar);
        if (f2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        Z0.d.d(compile, "compile(...)");
        if (!compile.matcher(f2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(f2);
        Z0.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k1.o
    public final u a(f fVar) {
        v vVar;
        q qVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        w1.c cVar;
        k1.e eVar;
        switch (this.f3464a) {
            case 0:
                H.e eVar2 = fVar.f3470e;
                T.u g2 = eVar2.g();
                boolean z2 = false;
                l lVar = (l) eVar2.d;
                String a2 = lVar.a("Host");
                n nVar = (n) eVar2.f199c;
                if (a2 == null) {
                    g2.l("Host", l1.b.u(nVar, false));
                }
                if (lVar.a("Connection") == null) {
                    g2.l("Connection", "Keep-Alive");
                }
                if (lVar.a("Accept-Encoding") == null && lVar.a("Range") == null) {
                    g2.l("Accept-Encoding", "gzip");
                    z2 = true;
                }
                k1.b bVar = (k1.b) this.f3465b;
                bVar.getClass();
                Z0.d.e(nVar, "url");
                if (lVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                u b2 = fVar.b(g2.b());
                l lVar2 = b2.f2901f;
                e.b(bVar, nVar, lVar2);
                t h = b2.h();
                h.f2887a = eVar2;
                if (z2 && "gzip".equalsIgnoreCase(u.f("Content-Encoding", b2)) && e.a(b2) && (vVar = b2.f2902g) != null) {
                    k kVar = new k(vVar.h());
                    g c2 = lVar2.c();
                    c2.A("Content-Encoding");
                    c2.A("Content-Length");
                    h.f2891f = c2.t().c();
                    h.f2892g = new v(u.f("Content-Type", b2), -1L, new p(kVar), 1);
                }
                return h.a();
            default:
                H.e eVar3 = fVar.f3470e;
                j jVar = fVar.f3467a;
                q qVar2 = q.f712a;
                u uVar = null;
                int i2 = 0;
                H.e eVar4 = eVar3;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar.getClass();
                        if (jVar.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar) {
                            try {
                                if (jVar.f3399k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3398j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            o1.n nVar2 = jVar.f3394c;
                            n nVar3 = (n) eVar4.f199c;
                            boolean z4 = nVar3.i;
                            r rVar = jVar.f3392a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = rVar.f2870o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                w1.c cVar2 = rVar.f2874s;
                                eVar = rVar.f2875t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                eVar = null;
                            }
                            qVar = qVar2;
                            i = i2;
                            jVar.f3397g = new o1.f(nVar2, new k1.a(nVar3.d, nVar3.f2834e, rVar.f2866k, rVar.f2869n, sSLSocketFactory, cVar, eVar, rVar.f2868m, rVar.f2873r, rVar.f2872q, rVar.f2867l), jVar);
                        } else {
                            qVar = qVar2;
                            i = i2;
                        }
                        try {
                            if (jVar.f3401m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b3 = fVar.b(eVar4);
                                if (uVar != null) {
                                    t h2 = b3.h();
                                    t h3 = uVar.h();
                                    h3.f2892g = null;
                                    u a3 = h3.a();
                                    if (a3.f2902g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    h2.f2893j = a3;
                                    b3 = h2.a();
                                }
                                uVar = b3;
                                eVar4 = b(uVar, jVar.i);
                                if (eVar4 == null) {
                                    jVar.e(false);
                                    return uVar;
                                }
                                v vVar2 = uVar.f2902g;
                                if (vVar2 != null) {
                                    l1.b.b(vVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                qVar2 = qVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, eVar4, !(e2 instanceof C0290a))) {
                                    Iterator it = qVar.iterator();
                                    while (it.hasNext()) {
                                        s1.d.d(e2, (Exception) it.next());
                                    }
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(qVar.size() + 1);
                                arrayList.addAll(qVar);
                                arrayList.add(e2);
                                jVar.e(true);
                                qVar2 = arrayList;
                                i2 = i;
                                z3 = false;
                            } catch (o1.o e3) {
                                q qVar3 = qVar;
                                if (!c(e3.f3424b, jVar, eVar4, false)) {
                                    IOException iOException = e3.f3423a;
                                    Z0.d.e(iOException, "<this>");
                                    Iterator it2 = qVar3.iterator();
                                    while (it2.hasNext()) {
                                        s1.d.d(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3423a;
                                ArrayList arrayList2 = new ArrayList(qVar3.size() + 1);
                                arrayList2.addAll(qVar3);
                                arrayList2.add(iOException2);
                                jVar.e(true);
                                qVar2 = arrayList2;
                                z3 = false;
                                i2 = i;
                            }
                        } catch (Throwable th2) {
                            jVar.e(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public H.e b(u uVar, o1.e eVar) {
        String f2;
        m mVar;
        o1.m mVar2;
        w wVar = (eVar == null || (mVar2 = eVar.f3380e) == null) ? null : mVar2.f3407b;
        int i = uVar.d;
        String str = (String) uVar.f2897a.f198b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((r) this.f3465b).f2864g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || Z0.d.a(eVar.f3378b.f3382b.h.d, eVar.f3380e.f3407b.f2910a.h.d)) {
                    return null;
                }
                o1.m mVar3 = eVar.f3380e;
                synchronized (mVar3) {
                    mVar3.f3413k = true;
                }
                return uVar.f2897a;
            }
            if (i == 503) {
                u uVar2 = uVar.f2903j;
                if ((uVar2 == null || uVar2.d != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                    return uVar.f2897a;
                }
                return null;
            }
            if (i == 407) {
                Z0.d.b(wVar);
                if (wVar.f2911b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((r) this.f3465b).f2868m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((r) this.f3465b).f2863f) {
                    return null;
                }
                u uVar3 = uVar.f2903j;
                if ((uVar3 == null || uVar3.d != 408) && d(uVar, 0) <= 0) {
                    return uVar.f2897a;
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
        r rVar = (r) this.f3465b;
        if (!rVar.h || (f2 = u.f("Location", uVar)) == null) {
            return null;
        }
        H.e eVar2 = uVar.f2897a;
        n nVar = (n) eVar2.f199c;
        nVar.getClass();
        try {
            mVar = new m();
            mVar.c(nVar, f2);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        n a2 = mVar != null ? mVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!Z0.d.a(a2.f2831a, ((n) eVar2.f199c).f2831a) && !rVar.i) {
            return null;
        }
        T.u g2 = eVar2.g();
        if (y.j(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = uVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g2.o(str, null);
            } else {
                g2.o("GET", null);
            }
            if (!z2) {
                ((g) g2.f793c).A("Transfer-Encoding");
                ((g) g2.f793c).A("Content-Length");
                ((g) g2.f793c).A("Content-Type");
            }
        }
        if (!l1.b.a((n) eVar2.f199c, a2)) {
            ((g) g2.f793c).A("Authorization");
        }
        g2.f791a = a2;
        return g2.b();
    }

    public boolean c(IOException iOException, j jVar, H.e eVar, boolean z2) {
        o1.p pVar;
        boolean i;
        o1.m mVar;
        if (!((r) this.f3465b).f2863f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        o1.f fVar = jVar.f3397g;
        Z0.d.b(fVar);
        int i2 = fVar.f3385f;
        if (i2 == 0 && fVar.f3386g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                w wVar = null;
                if (i2 <= 1 && fVar.f3386g <= 1 && fVar.h <= 0 && (mVar = fVar.f3383c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3414l == 0) {
                            if (l1.b.a(mVar.f3407b.f2910a.h, fVar.f3382b.h)) {
                                wVar = mVar.f3407b;
                            }
                        }
                    }
                }
                if (wVar != null) {
                    fVar.i = wVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.d()) && (pVar = fVar.f3384e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(r rVar) {
        this.f3465b = rVar;
    }
}
