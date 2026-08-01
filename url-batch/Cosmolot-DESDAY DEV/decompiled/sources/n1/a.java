package n1;

import Q0.m;
import i1.k;
import i1.n;
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
import m1.p;
import p1.C0284a;
import q1.l;
import v1.o;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3284a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3285b;

    public a(i1.b bVar) {
        X0.e.e(bVar, "cookieJar");
        this.f3285b = bVar;
    }

    public static int d(t tVar, int i) {
        String e2 = t.e(tVar, "Retry-After");
        if (e2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        X0.e.d(compile, "compile(...)");
        if (!compile.matcher(e2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(e2);
        X0.e.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i1.n
    public final t a(f fVar) {
        u uVar;
        m mVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        u1.c cVar;
        i1.d dVar;
        switch (this.f3284a) {
            case 0:
                H.e eVar = fVar.f3290e;
                T.t g2 = eVar.g();
                boolean z2 = false;
                k kVar = (k) eVar.d;
                String a2 = kVar.a("Host");
                i1.m mVar2 = (i1.m) eVar.f213c;
                if (a2 == null) {
                    g2.l("Host", j1.b.t(mVar2, false));
                }
                if (kVar.a("Connection") == null) {
                    g2.l("Connection", "Keep-Alive");
                }
                if (kVar.a("Accept-Encoding") == null && kVar.a("Range") == null) {
                    g2.l("Accept-Encoding", "gzip");
                    z2 = true;
                }
                i1.b bVar = (i1.b) this.f3285b;
                bVar.getClass();
                X0.e.e(mVar2, "url");
                if (kVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                t b2 = fVar.b(g2.b());
                k kVar2 = b2.f2505f;
                e.b(bVar, mVar2, kVar2);
                s f2 = b2.f();
                f2.f2491a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(t.e(b2, "Content-Encoding")) && e.a(b2) && (uVar = b2.f2506g) != null) {
                    v1.k kVar3 = new v1.k(uVar.f());
                    B0.d c2 = kVar2.c();
                    c2.A("Content-Encoding");
                    c2.A("Content-Length");
                    f2.f2495f = c2.r().c();
                    t.e(b2, "Content-Type");
                    f2.f2496g = new u(-1L, new o(kVar3), 1);
                }
                return f2.a();
            default:
                H.e eVar2 = fVar.f3290e;
                j jVar = fVar.f3287a;
                m mVar3 = m.f665a;
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
                                if (jVar.f3214k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3213j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            m1.n nVar = jVar.f3209c;
                            i1.m mVar4 = (i1.m) eVar3.f213c;
                            boolean z4 = mVar4.i;
                            i1.o oVar = jVar.f3207a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = oVar.f2469o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                u1.c cVar2 = oVar.f2473s;
                                dVar = oVar.f2474t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            mVar = mVar3;
                            i = i2;
                            jVar.f3212g = new m1.f(nVar, new i1.a(mVar4.d, mVar4.f2453e, oVar.f2465k, oVar.f2468n, sSLSocketFactory, cVar, dVar, oVar.f2467m, oVar.f2472r, oVar.f2471q, oVar.f2466l), jVar);
                        } else {
                            mVar = mVar3;
                            i = i2;
                        }
                        try {
                            if (jVar.f3216m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                t b3 = fVar.b(eVar3);
                                if (tVar != null) {
                                    s f3 = b3.f();
                                    s f4 = tVar.f();
                                    f4.f2496g = null;
                                    t a3 = f4.a();
                                    if (a3.f2506g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f3.f2497j = a3;
                                    b3 = f3.a();
                                }
                                tVar = b3;
                                eVar3 = b(tVar, jVar.i);
                                if (eVar3 == null) {
                                    jVar.e(false);
                                    return tVar;
                                }
                                u uVar2 = tVar.f2506g;
                                if (uVar2 != null) {
                                    j1.b.b(uVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                mVar3 = mVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, eVar3, !(e2 instanceof C0284a))) {
                                    Iterator it = mVar.iterator();
                                    while (it.hasNext()) {
                                        l.d(e2, (Exception) it.next());
                                    }
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(mVar.size() + 1);
                                arrayList.addAll(mVar);
                                arrayList.add(e2);
                                jVar.e(true);
                                mVar3 = arrayList;
                                i2 = i;
                                z3 = false;
                            } catch (m1.o e3) {
                                m mVar5 = mVar;
                                if (!c(e3.f3239b, jVar, eVar3, false)) {
                                    IOException iOException = e3.f3238a;
                                    X0.e.e(iOException, "<this>");
                                    Iterator it2 = mVar5.iterator();
                                    while (it2.hasNext()) {
                                        l.d(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3238a;
                                ArrayList arrayList2 = new ArrayList(mVar5.size() + 1);
                                arrayList2.addAll(mVar5);
                                arrayList2.add(iOException2);
                                jVar.e(true);
                                mVar3 = arrayList2;
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
        v vVar = (eVar == null || (mVar = eVar.f3195e) == null) ? null : mVar.f3222b;
        int i = tVar.d;
        String str = (String) tVar.f2501a.f212b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((i1.o) this.f3285b).f2463g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || X0.e.a(eVar.f3193b.f3197b.h.d, eVar.f3195e.f3222b.f2514a.h.d)) {
                    return null;
                }
                m1.m mVar2 = eVar.f3195e;
                synchronized (mVar2) {
                    mVar2.f3228k = true;
                }
                return tVar.f2501a;
            }
            if (i == 503) {
                t tVar2 = tVar.f2507j;
                if ((tVar2 == null || tVar2.d != 503) && d(tVar, Integer.MAX_VALUE) == 0) {
                    return tVar.f2501a;
                }
                return null;
            }
            if (i == 407) {
                X0.e.b(vVar);
                if (vVar.f2515b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((i1.o) this.f3285b).f2467m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((i1.o) this.f3285b).f2462f) {
                    return null;
                }
                t tVar3 = tVar.f2507j;
                if ((tVar3 == null || tVar3.d != 408) && d(tVar, 0) <= 0) {
                    return tVar.f2501a;
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
        i1.o oVar = (i1.o) this.f3285b;
        if (!oVar.h || (e2 = t.e(tVar, "Location")) == null) {
            return null;
        }
        H.e eVar2 = tVar.f2501a;
        i1.m mVar3 = (i1.m) eVar2.f213c;
        mVar3.getClass();
        try {
            lVar = new i1.l();
            lVar.c(mVar3, e2);
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        i1.m a2 = lVar != null ? lVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!X0.e.a(a2.f2450a, ((i1.m) eVar2.f213c).f2450a) && !oVar.i) {
            return null;
        }
        T.t g2 = eVar2.g();
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
                ((B0.d) g2.f744c).A("Transfer-Encoding");
                ((B0.d) g2.f744c).A("Content-Length");
                ((B0.d) g2.f744c).A("Content-Type");
            }
        }
        if (!j1.b.a((i1.m) eVar2.f213c, a2)) {
            ((B0.d) g2.f744c).A("Authorization");
        }
        g2.f742a = a2;
        return g2.b();
    }

    public boolean c(IOException iOException, j jVar, H.e eVar, boolean z2) {
        p pVar;
        boolean i;
        m1.m mVar;
        if (!((i1.o) this.f3285b).f2462f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        m1.f fVar = jVar.f3212g;
        X0.e.b(fVar);
        int i2 = fVar.f3200f;
        if (i2 == 0 && fVar.f3201g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                v vVar = null;
                if (i2 <= 1 && fVar.f3201g <= 1 && fVar.h <= 0 && (mVar = fVar.f3198c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3229l == 0) {
                            if (j1.b.a(mVar.f3222b.f2514a.h, fVar.f3197b.h)) {
                                vVar = mVar.f3222b;
                            }
                        }
                    }
                }
                if (vVar != null) {
                    fVar.i = vVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.c()) && (pVar = fVar.f3199e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(i1.o oVar) {
        this.f3285b = oVar;
    }
}
