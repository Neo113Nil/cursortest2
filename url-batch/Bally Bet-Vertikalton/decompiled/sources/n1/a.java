package n1;

import Q0.q;
import i1.k;
import i1.m;
import i1.n;
import i1.o;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.v;
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
import m1.j;
import p1.C0285a;
import q1.l;
import v1.p;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3289a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3290b;

    public a(i1.b bVar) {
        X0.d.e(bVar, "cookieJar");
        this.f3290b = bVar;
    }

    public static int d(t tVar, int i) {
        String e2 = t.e(tVar, "Retry-After");
        if (e2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        X0.d.d(compile, "compile(...)");
        if (!compile.matcher(e2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(e2);
        X0.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i1.n
    public final t a(f fVar) {
        u uVar;
        q qVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        u1.c cVar;
        i1.d dVar;
        switch (this.f3289a) {
            case 0:
                H.e eVar = fVar.f3295e;
                T.u g2 = eVar.g();
                boolean z2 = false;
                k kVar = (k) eVar.d;
                String a2 = kVar.a("Host");
                m mVar = (m) eVar.f213c;
                if (a2 == null) {
                    g2.l("Host", j1.b.t(mVar, false));
                }
                if (kVar.a("Connection") == null) {
                    g2.l("Connection", "Keep-Alive");
                }
                if (kVar.a("Accept-Encoding") == null && kVar.a("Range") == null) {
                    g2.l("Accept-Encoding", "gzip");
                    z2 = true;
                }
                i1.b bVar = (i1.b) this.f3290b;
                bVar.getClass();
                X0.d.e(mVar, "url");
                if (kVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                t b2 = fVar.b(g2.b());
                k kVar2 = b2.f2510f;
                e.b(bVar, mVar, kVar2);
                s f2 = b2.f();
                f2.f2496a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(t.e(b2, "Content-Encoding")) && e.a(b2) && (uVar = b2.f2511g) != null) {
                    v1.k kVar3 = new v1.k(uVar.f());
                    B0.d c2 = kVar2.c();
                    c2.A("Content-Encoding");
                    c2.A("Content-Length");
                    f2.f2500f = c2.t().c();
                    t.e(b2, "Content-Type");
                    f2.f2501g = new u(-1L, new p(kVar3), 1);
                }
                return f2.a();
            default:
                H.e eVar2 = fVar.f3295e;
                j jVar = fVar.f3292a;
                q qVar2 = q.f670a;
                t tVar = null;
                int i2 = 0;
                H.e eVar3 = eVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar.getClass();
                        if (jVar.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar) {
                            try {
                                if (jVar.f3219k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3218j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            m1.n nVar = jVar.f3214c;
                            m mVar2 = (m) eVar3.f213c;
                            boolean z4 = mVar2.i;
                            o oVar = jVar.f3212a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = oVar.f2474o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                u1.c cVar2 = oVar.f2478s;
                                dVar = oVar.f2479t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            qVar = qVar2;
                            i = i2;
                            jVar.f3217g = new m1.f(nVar, new i1.a(mVar2.d, mVar2.f2458e, oVar.f2470k, oVar.f2473n, sSLSocketFactory, cVar, dVar, oVar.f2472m, oVar.f2477r, oVar.f2476q, oVar.f2471l), jVar);
                        } else {
                            qVar = qVar2;
                            i = i2;
                        }
                        try {
                            if (jVar.f3221m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                t b3 = fVar.b(eVar3);
                                if (tVar != null) {
                                    s f3 = b3.f();
                                    s f4 = tVar.f();
                                    f4.f2501g = null;
                                    t a3 = f4.a();
                                    if (a3.f2511g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f3.f2502j = a3;
                                    b3 = f3.a();
                                }
                                tVar = b3;
                                eVar3 = b(tVar, jVar.i);
                                if (eVar3 == null) {
                                    jVar.e(false);
                                    return tVar;
                                }
                                u uVar2 = tVar.f2511g;
                                if (uVar2 != null) {
                                    j1.b.b(uVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                qVar2 = qVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, eVar3, !(e2 instanceof C0285a))) {
                                    Iterator it = qVar.iterator();
                                    while (it.hasNext()) {
                                        l.d(e2, (Exception) it.next());
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
                            } catch (m1.o e3) {
                                q qVar3 = qVar;
                                if (!c(e3.f3244b, jVar, eVar3, false)) {
                                    IOException iOException = e3.f3243a;
                                    X0.d.e(iOException, "<this>");
                                    Iterator it2 = qVar3.iterator();
                                    while (it2.hasNext()) {
                                        l.d(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3243a;
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

    public H.e b(t tVar, m1.e eVar) {
        String e2;
        i1.l lVar;
        m1.m mVar;
        v vVar = (eVar == null || (mVar = eVar.f3200e) == null) ? null : mVar.f3227b;
        int i = tVar.d;
        String str = (String) tVar.f2506a.f212b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((o) this.f3290b).f2468g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || X0.d.a(eVar.f3198b.f3202b.h.d, eVar.f3200e.f3227b.f2519a.h.d)) {
                    return null;
                }
                m1.m mVar2 = eVar.f3200e;
                synchronized (mVar2) {
                    mVar2.f3233k = true;
                }
                return tVar.f2506a;
            }
            if (i == 503) {
                t tVar2 = tVar.f2512j;
                if ((tVar2 == null || tVar2.d != 503) && d(tVar, Integer.MAX_VALUE) == 0) {
                    return tVar.f2506a;
                }
                return null;
            }
            if (i == 407) {
                X0.d.b(vVar);
                if (vVar.f2520b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((o) this.f3290b).f2472m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((o) this.f3290b).f2467f) {
                    return null;
                }
                t tVar3 = tVar.f2512j;
                if ((tVar3 == null || tVar3.d != 408) && d(tVar, 0) <= 0) {
                    return tVar.f2506a;
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
        o oVar = (o) this.f3290b;
        if (!oVar.h || (e2 = t.e(tVar, "Location")) == null) {
            return null;
        }
        H.e eVar2 = tVar.f2506a;
        m mVar3 = (m) eVar2.f213c;
        mVar3.getClass();
        try {
            lVar = new i1.l();
            lVar.c(mVar3, e2);
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        m a2 = lVar != null ? lVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!X0.d.a(a2.f2455a, ((m) eVar2.f213c).f2455a) && !oVar.i) {
            return null;
        }
        T.u g2 = eVar2.g();
        if (r.o(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = tVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g2.o(str, null);
            } else {
                g2.o("GET", null);
            }
            if (!z2) {
                ((B0.d) g2.f754c).A("Transfer-Encoding");
                ((B0.d) g2.f754c).A("Content-Length");
                ((B0.d) g2.f754c).A("Content-Type");
            }
        }
        if (!j1.b.a((m) eVar2.f213c, a2)) {
            ((B0.d) g2.f754c).A("Authorization");
        }
        g2.f752a = a2;
        return g2.b();
    }

    public boolean c(IOException iOException, j jVar, H.e eVar, boolean z2) {
        m1.p pVar;
        boolean i;
        m1.m mVar;
        if (!((o) this.f3290b).f2467f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        m1.f fVar = jVar.f3217g;
        X0.d.b(fVar);
        int i2 = fVar.f3205f;
        if (i2 == 0 && fVar.f3206g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                v vVar = null;
                if (i2 <= 1 && fVar.f3206g <= 1 && fVar.h <= 0 && (mVar = fVar.f3203c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3234l == 0) {
                            if (j1.b.a(mVar.f3227b.f2519a.h, fVar.f3202b.h)) {
                                vVar = mVar.f3227b;
                            }
                        }
                    }
                }
                if (vVar != null) {
                    fVar.i = vVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.d()) && (pVar = fVar.f3204e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(o oVar) {
        this.f3290b = oVar;
    }
}
