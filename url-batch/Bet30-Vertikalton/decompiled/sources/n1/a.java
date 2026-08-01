package n1;

import Q0.q;
import T.t;
import i1.k;
import i1.m;
import i1.n;
import i1.s;
import i1.u;
import i1.v;
import i1.w;
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
import m1.o;
import p1.C0284a;
import q1.l;
import v1.p;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3305a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3306b;

    public a(i1.b bVar) {
        X0.d.e(bVar, "cookieJar");
        this.f3306b = bVar;
    }

    public static int d(u uVar, int i) {
        String e2 = u.e(uVar, "Retry-After");
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
    public final u a(f fVar) {
        v vVar;
        q qVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        u1.c cVar;
        i1.d dVar;
        switch (this.f3305a) {
            case 0:
                H.e eVar = fVar.f3311e;
                t g2 = eVar.g();
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
                i1.b bVar = (i1.b) this.f3306b;
                bVar.getClass();
                X0.d.e(mVar, "url");
                if (kVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                u b2 = fVar.b(g2.b());
                k kVar2 = b2.f2526f;
                e.b(bVar, mVar, kVar2);
                i1.t f2 = b2.f();
                f2.f2512a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(u.e(b2, "Content-Encoding")) && e.a(b2) && (vVar = b2.f2527g) != null) {
                    v1.k kVar3 = new v1.k(vVar.f());
                    B0.d c2 = kVar2.c();
                    c2.A("Content-Encoding");
                    c2.A("Content-Length");
                    f2.f2516f = c2.r().c();
                    u.e(b2, "Content-Type");
                    f2.f2517g = new v(-1L, new p(kVar3), 1);
                }
                return f2.a();
            default:
                H.e eVar2 = fVar.f3311e;
                j jVar = fVar.f3308a;
                q qVar2 = q.f671a;
                u uVar = null;
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
                                if (jVar.f3235k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3234j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            m1.n nVar = jVar.f3230c;
                            m mVar2 = (m) eVar3.f213c;
                            boolean z4 = mVar2.i;
                            i1.p pVar = jVar.f3228a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = pVar.f2490o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                u1.c cVar2 = pVar.f2494s;
                                dVar = pVar.f2495t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            qVar = qVar2;
                            i = i2;
                            jVar.f3233g = new m1.f(nVar, new i1.a(mVar2.d, mVar2.f2457e, pVar.f2486k, pVar.f2489n, sSLSocketFactory, cVar, dVar, pVar.f2488m, pVar.f2493r, pVar.f2492q, pVar.f2487l), jVar);
                        } else {
                            qVar = qVar2;
                            i = i2;
                        }
                        try {
                            if (jVar.f3237m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b3 = fVar.b(eVar3);
                                if (uVar != null) {
                                    i1.t f3 = b3.f();
                                    i1.t f4 = uVar.f();
                                    f4.f2517g = null;
                                    u a3 = f4.a();
                                    if (a3.f2527g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f3.f2518j = a3;
                                    b3 = f3.a();
                                }
                                uVar = b3;
                                eVar3 = b(uVar, jVar.i);
                                if (eVar3 == null) {
                                    jVar.e(false);
                                    return uVar;
                                }
                                v vVar2 = uVar.f2527g;
                                if (vVar2 != null) {
                                    j1.b.b(vVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                qVar2 = qVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, eVar3, !(e2 instanceof C0284a))) {
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
                            } catch (o e3) {
                                q qVar3 = qVar;
                                if (!c(e3.f3260b, jVar, eVar3, false)) {
                                    IOException iOException = e3.f3259a;
                                    X0.d.e(iOException, "<this>");
                                    Iterator it2 = qVar3.iterator();
                                    while (it2.hasNext()) {
                                        l.d(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3259a;
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

    public H.e b(u uVar, m1.e eVar) {
        String e2;
        i1.l lVar;
        m1.m mVar;
        w wVar = (eVar == null || (mVar = eVar.f3216e) == null) ? null : mVar.f3243b;
        int i = uVar.d;
        String str = (String) uVar.f2522a.f212b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((i1.p) this.f3306b).f2484g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || X0.d.a(eVar.f3214b.f3218b.h.d, eVar.f3216e.f3243b.f2535a.h.d)) {
                    return null;
                }
                m1.m mVar2 = eVar.f3216e;
                synchronized (mVar2) {
                    mVar2.f3249k = true;
                }
                return uVar.f2522a;
            }
            if (i == 503) {
                u uVar2 = uVar.f2528j;
                if ((uVar2 == null || uVar2.d != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                    return uVar.f2522a;
                }
                return null;
            }
            if (i == 407) {
                X0.d.b(wVar);
                if (wVar.f2536b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((i1.p) this.f3306b).f2488m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((i1.p) this.f3306b).f2483f) {
                    return null;
                }
                u uVar3 = uVar.f2528j;
                if ((uVar3 == null || uVar3.d != 408) && d(uVar, 0) <= 0) {
                    return uVar.f2522a;
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
        i1.p pVar = (i1.p) this.f3306b;
        if (!pVar.h || (e2 = u.e(uVar, "Location")) == null) {
            return null;
        }
        H.e eVar2 = uVar.f2522a;
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
        if (!X0.d.a(a2.f2454a, ((m) eVar2.f213c).f2454a) && !pVar.i) {
            return null;
        }
        t g2 = eVar2.g();
        if (s.o(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = uVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g2.o(str, null);
            } else {
                g2.o("GET", null);
            }
            if (!z2) {
                ((B0.d) g2.f750c).A("Transfer-Encoding");
                ((B0.d) g2.f750c).A("Content-Length");
                ((B0.d) g2.f750c).A("Content-Type");
            }
        }
        if (!j1.b.a((m) eVar2.f213c, a2)) {
            ((B0.d) g2.f750c).A("Authorization");
        }
        g2.f748a = a2;
        return g2.b();
    }

    public boolean c(IOException iOException, j jVar, H.e eVar, boolean z2) {
        m1.p pVar;
        boolean i;
        m1.m mVar;
        if (!((i1.p) this.f3306b).f2483f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        m1.f fVar = jVar.f3233g;
        X0.d.b(fVar);
        int i2 = fVar.f3221f;
        if (i2 == 0 && fVar.f3222g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                w wVar = null;
                if (i2 <= 1 && fVar.f3222g <= 1 && fVar.h <= 0 && (mVar = fVar.f3219c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3250l == 0) {
                            if (j1.b.a(mVar.f3243b.f2535a.h, fVar.f3218b.h)) {
                                wVar = mVar.f3243b;
                            }
                        }
                    }
                }
                if (wVar != null) {
                    fVar.i = wVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.c()) && (pVar = fVar.f3220e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(i1.p pVar) {
        this.f3306b = pVar;
    }
}
