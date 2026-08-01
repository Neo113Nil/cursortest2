package n1;

import Q0.m;
import T.t;
import i1.k;
import i1.n;
import i1.p;
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
import p1.C0284a;
import q1.l;
import v1.o;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3301a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3302b;

    public a(i1.b bVar) {
        X0.e.e(bVar, "cookieJar");
        this.f3302b = bVar;
    }

    public static int d(u uVar, int i) {
        String e2 = u.e(uVar, "Retry-After");
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
    public final u a(f fVar) {
        v vVar;
        m mVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        u1.c cVar;
        i1.d dVar;
        switch (this.f3301a) {
            case 0:
                H.e eVar = fVar.f3307e;
                t g2 = eVar.g();
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
                i1.b bVar = (i1.b) this.f3302b;
                bVar.getClass();
                X0.e.e(mVar2, "url");
                if (kVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                u b2 = fVar.b(g2.b());
                k kVar2 = b2.f2522f;
                e.b(bVar, mVar2, kVar2);
                i1.t f2 = b2.f();
                f2.f2508a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(u.e(b2, "Content-Encoding")) && e.a(b2) && (vVar = b2.f2523g) != null) {
                    v1.k kVar3 = new v1.k(vVar.f());
                    B0.d c2 = kVar2.c();
                    c2.A("Content-Encoding");
                    c2.A("Content-Length");
                    f2.f2512f = c2.r().c();
                    u.e(b2, "Content-Type");
                    f2.f2513g = new v(-1L, new o(kVar3), 1);
                }
                return f2.a();
            default:
                H.e eVar2 = fVar.f3307e;
                j jVar = fVar.f3304a;
                m mVar3 = m.f664a;
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
                                if (jVar.f3231k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3230j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            m1.n nVar = jVar.f3226c;
                            i1.m mVar4 = (i1.m) eVar3.f213c;
                            boolean z4 = mVar4.i;
                            p pVar = jVar.f3224a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = pVar.f2486o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                u1.c cVar2 = pVar.f2490s;
                                dVar = pVar.f2491t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            mVar = mVar3;
                            i = i2;
                            jVar.f3229g = new m1.f(nVar, new i1.a(mVar4.d, mVar4.f2453e, pVar.f2482k, pVar.f2485n, sSLSocketFactory, cVar, dVar, pVar.f2484m, pVar.f2489r, pVar.f2488q, pVar.f2483l), jVar);
                        } else {
                            mVar = mVar3;
                            i = i2;
                        }
                        try {
                            if (jVar.f3233m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b3 = fVar.b(eVar3);
                                if (uVar != null) {
                                    i1.t f3 = b3.f();
                                    i1.t f4 = uVar.f();
                                    f4.f2513g = null;
                                    u a3 = f4.a();
                                    if (a3.f2523g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f3.f2514j = a3;
                                    b3 = f3.a();
                                }
                                uVar = b3;
                                eVar3 = b(uVar, jVar.i);
                                if (eVar3 == null) {
                                    jVar.e(false);
                                    return uVar;
                                }
                                v vVar2 = uVar.f2523g;
                                if (vVar2 != null) {
                                    j1.b.b(vVar2);
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
                                if (!c(e3.f3256b, jVar, eVar3, false)) {
                                    IOException iOException = e3.f3255a;
                                    X0.e.e(iOException, "<this>");
                                    Iterator it2 = mVar5.iterator();
                                    while (it2.hasNext()) {
                                        l.d(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3255a;
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

    public H.e b(u uVar, m1.e eVar) {
        String e2;
        i1.l lVar;
        m1.m mVar;
        w wVar = (eVar == null || (mVar = eVar.f3212e) == null) ? null : mVar.f3239b;
        int i = uVar.d;
        String str = (String) uVar.f2518a.f212b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((p) this.f3302b).f2480g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || X0.e.a(eVar.f3210b.f3214b.h.d, eVar.f3212e.f3239b.f2531a.h.d)) {
                    return null;
                }
                m1.m mVar2 = eVar.f3212e;
                synchronized (mVar2) {
                    mVar2.f3245k = true;
                }
                return uVar.f2518a;
            }
            if (i == 503) {
                u uVar2 = uVar.f2524j;
                if ((uVar2 == null || uVar2.d != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                    return uVar.f2518a;
                }
                return null;
            }
            if (i == 407) {
                X0.e.b(wVar);
                if (wVar.f2532b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((p) this.f3302b).f2484m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((p) this.f3302b).f2479f) {
                    return null;
                }
                u uVar3 = uVar.f2524j;
                if ((uVar3 == null || uVar3.d != 408) && d(uVar, 0) <= 0) {
                    return uVar.f2518a;
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
        p pVar = (p) this.f3302b;
        if (!pVar.h || (e2 = u.e(uVar, "Location")) == null) {
            return null;
        }
        H.e eVar2 = uVar.f2518a;
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
        if (!X0.e.a(a2.f2450a, ((i1.m) eVar2.f213c).f2450a) && !pVar.i) {
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
                ((B0.d) g2.f743c).A("Transfer-Encoding");
                ((B0.d) g2.f743c).A("Content-Length");
                ((B0.d) g2.f743c).A("Content-Type");
            }
        }
        if (!j1.b.a((i1.m) eVar2.f213c, a2)) {
            ((B0.d) g2.f743c).A("Authorization");
        }
        g2.f741a = a2;
        return g2.b();
    }

    public boolean c(IOException iOException, j jVar, H.e eVar, boolean z2) {
        m1.p pVar;
        boolean i;
        m1.m mVar;
        if (!((p) this.f3302b).f2479f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        m1.f fVar = jVar.f3229g;
        X0.e.b(fVar);
        int i2 = fVar.f3217f;
        if (i2 == 0 && fVar.f3218g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                w wVar = null;
                if (i2 <= 1 && fVar.f3218g <= 1 && fVar.h <= 0 && (mVar = fVar.f3215c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3246l == 0) {
                            if (j1.b.a(mVar.f3239b.f2531a.h, fVar.f3214b.h)) {
                                wVar = mVar.f3239b;
                            }
                        }
                    }
                }
                if (wVar != null) {
                    fVar.i = wVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.c()) && (pVar = fVar.f3216e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(p pVar) {
        this.f3302b = pVar;
    }
}
