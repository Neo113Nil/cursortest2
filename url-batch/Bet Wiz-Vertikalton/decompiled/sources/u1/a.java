package u1;

import C1.p;
import W0.q;
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
import p1.g;
import p1.k;
import p1.l;
import p1.m;
import p1.n;
import p1.s;
import p1.t;
import p1.u;
import p1.v;
import t1.j;
import t1.o;
import w1.C0333a;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3822a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3823b;

    public a(p1.b bVar) {
        e1.d.e(bVar, "cookieJar");
        this.f3823b = bVar;
    }

    public static int d(t tVar, int i) {
        String g2 = t.g("Retry-After", tVar);
        if (g2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        e1.d.d(compile, "compile(...)");
        if (!compile.matcher(g2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(g2);
        e1.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1.n
    public final t a(f fVar) {
        u uVar;
        q qVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        B1.c cVar;
        p1.d dVar;
        switch (this.f3822a) {
            case 0:
                H.e eVar = fVar.f3828e;
                T.u g2 = eVar.g();
                boolean z2 = false;
                k kVar = (k) eVar.d;
                String a2 = kVar.a("Host");
                m mVar = (m) eVar.f259c;
                if (a2 == null) {
                    g2.k("Host", q1.b.u(mVar, false));
                }
                if (kVar.a("Connection") == null) {
                    g2.k("Connection", "Keep-Alive");
                }
                if (kVar.a("Accept-Encoding") == null && kVar.a("Range") == null) {
                    g2.k("Accept-Encoding", "gzip");
                    z2 = true;
                }
                p1.b bVar = (p1.b) this.f3823b;
                bVar.getClass();
                e1.d.e(mVar, "url");
                if (kVar.a("User-Agent") == null) {
                    g2.k("User-Agent", "okhttp/4.12.0");
                }
                t b2 = fVar.b(g2.b());
                k kVar2 = b2.f3433f;
                e.b(bVar, mVar, kVar2);
                s h = b2.h();
                h.f3419a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(t.g("Content-Encoding", b2)) && e.a(b2) && (uVar = b2.f3434g) != null) {
                    C1.k kVar3 = new C1.k(uVar.h());
                    g c2 = kVar2.c();
                    c2.e("Content-Encoding");
                    c2.e("Content-Length");
                    h.f3423f = c2.d().c();
                    h.f3424g = new u(t.g("Content-Type", b2), -1L, new p(kVar3), 1);
                }
                return h.a();
            default:
                H.e eVar2 = fVar.f3828e;
                j jVar = fVar.f3825a;
                q qVar2 = q.f896a;
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
                                if (jVar.f3766k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3765j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            t1.n nVar = jVar.f3761c;
                            m mVar2 = (m) eVar3.f259c;
                            boolean z4 = mVar2.i;
                            p1.q qVar3 = jVar.f3759a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = qVar3.f3402o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                B1.c cVar2 = qVar3.f3406s;
                                dVar = qVar3.f3407t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            qVar = qVar2;
                            i = i2;
                            jVar.f3764g = new t1.f(nVar, new p1.a(mVar2.d, mVar2.f3366e, qVar3.f3398k, qVar3.f3401n, sSLSocketFactory, cVar, dVar, qVar3.f3400m, qVar3.f3405r, qVar3.f3404q, qVar3.f3399l), jVar);
                        } else {
                            qVar = qVar2;
                            i = i2;
                        }
                        try {
                            if (jVar.f3768m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                t b3 = fVar.b(eVar3);
                                if (tVar != null) {
                                    s h2 = b3.h();
                                    s h3 = tVar.h();
                                    h3.f3424g = null;
                                    t a3 = h3.a();
                                    if (a3.f3434g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    h2.f3425j = a3;
                                    b3 = h2.a();
                                }
                                tVar = b3;
                                eVar3 = b(tVar, jVar.i);
                                if (eVar3 == null) {
                                    jVar.e(false);
                                    return tVar;
                                }
                                u uVar2 = tVar.f3434g;
                                if (uVar2 != null) {
                                    q1.b.b(uVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                qVar2 = qVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, eVar3, !(e2 instanceof C0333a))) {
                                    Iterator it = qVar.iterator();
                                    while (it.hasNext()) {
                                        x1.d.e(e2, (Exception) it.next());
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
                                q qVar4 = qVar;
                                if (!c(e3.f3791b, jVar, eVar3, false)) {
                                    IOException iOException = e3.f3790a;
                                    e1.d.e(iOException, "<this>");
                                    Iterator it2 = qVar4.iterator();
                                    while (it2.hasNext()) {
                                        x1.d.e(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3790a;
                                ArrayList arrayList2 = new ArrayList(qVar4.size() + 1);
                                arrayList2.addAll(qVar4);
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

    public H.e b(t tVar, t1.e eVar) {
        String g2;
        l lVar;
        t1.m mVar;
        v vVar = (eVar == null || (mVar = eVar.f3747e) == null) ? null : mVar.f3774b;
        int i = tVar.d;
        String str = (String) tVar.f3429a.f258b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((p1.q) this.f3823b).f3396g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || e1.d.a(eVar.f3745b.f3749b.h.d, eVar.f3747e.f3774b.f3442a.h.d)) {
                    return null;
                }
                t1.m mVar2 = eVar.f3747e;
                synchronized (mVar2) {
                    mVar2.f3780k = true;
                }
                return tVar.f3429a;
            }
            if (i == 503) {
                t tVar2 = tVar.f3435j;
                if ((tVar2 == null || tVar2.d != 503) && d(tVar, Integer.MAX_VALUE) == 0) {
                    return tVar.f3429a;
                }
                return null;
            }
            if (i == 407) {
                e1.d.b(vVar);
                if (vVar.f3443b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((p1.q) this.f3823b).f3400m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((p1.q) this.f3823b).f3395f) {
                    return null;
                }
                t tVar3 = tVar.f3435j;
                if ((tVar3 == null || tVar3.d != 408) && d(tVar, 0) <= 0) {
                    return tVar.f3429a;
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
        p1.q qVar = (p1.q) this.f3823b;
        if (!qVar.h || (g2 = t.g("Location", tVar)) == null) {
            return null;
        }
        H.e eVar2 = tVar.f3429a;
        m mVar3 = (m) eVar2.f259c;
        mVar3.getClass();
        try {
            lVar = new l();
            lVar.c(mVar3, g2);
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        m a2 = lVar != null ? lVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!e1.d.a(a2.f3363a, ((m) eVar2.f259c).f3363a) && !qVar.i) {
            return null;
        }
        T.u g3 = eVar2.g();
        if (k0.k.n(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = tVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g3.o(str, null);
            } else {
                g3.o("GET", null);
            }
            if (!z2) {
                ((g) g3.f830c).e("Transfer-Encoding");
                ((g) g3.f830c).e("Content-Length");
                ((g) g3.f830c).e("Content-Type");
            }
        }
        if (!q1.b.a((m) eVar2.f259c, a2)) {
            ((g) g3.f830c).e("Authorization");
        }
        g3.f828a = a2;
        return g3.b();
    }

    public boolean c(IOException iOException, j jVar, H.e eVar, boolean z2) {
        t1.p pVar;
        boolean i;
        t1.m mVar;
        if (!((p1.q) this.f3823b).f3395f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        t1.f fVar = jVar.f3764g;
        e1.d.b(fVar);
        int i2 = fVar.f3752f;
        if (i2 == 0 && fVar.f3753g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                v vVar = null;
                if (i2 <= 1 && fVar.f3753g <= 1 && fVar.h <= 0 && (mVar = fVar.f3750c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3781l == 0) {
                            if (q1.b.a(mVar.f3774b.f3442a.h, fVar.f3749b.h)) {
                                vVar = mVar.f3774b;
                            }
                        }
                    }
                }
                if (vVar != null) {
                    fVar.i = vVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.d()) && (pVar = fVar.f3751e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(p1.q qVar) {
        this.f3823b = qVar;
    }
}
