package r1;

import T.u;
import T0.q;
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
import l.C0207a0;
import m1.j;
import m1.l;
import m1.m;
import m1.r;
import m1.s;
import m1.t;
import q1.n;
import q1.o;
import t1.C0315a;
import z1.k;
import z1.p;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3516a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3517b;

    public a(m1.b bVar) {
        b1.d.e(bVar, "cookieJar");
        this.f3517b = bVar;
    }

    public static int d(s sVar, int i) {
        String g2 = s.g("Retry-After", sVar);
        if (g2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        b1.d.d(compile, "compile(...)");
        if (!compile.matcher(g2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(g2);
        b1.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m1.m
    public final s a(f fVar) {
        t tVar;
        q qVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        y1.c cVar;
        m1.d dVar;
        switch (this.f3516a) {
            case 0:
                H.e eVar = fVar.f3522e;
                u g2 = eVar.g();
                boolean z2 = false;
                j jVar = (j) eVar.d;
                String a2 = jVar.a("Host");
                l lVar = (l) eVar.f206c;
                if (a2 == null) {
                    g2.k("Host", n1.b.u(lVar, false));
                }
                if (jVar.a("Connection") == null) {
                    g2.k("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    g2.k("Accept-Encoding", "gzip");
                    z2 = true;
                }
                m1.b bVar = (m1.b) this.f3517b;
                bVar.getClass();
                b1.d.e(lVar, "url");
                if (jVar.a("User-Agent") == null) {
                    g2.k("User-Agent", "okhttp/4.12.0");
                }
                s b2 = fVar.b(g2.b());
                j jVar2 = b2.f3253f;
                e.b(bVar, lVar, jVar2);
                r h = b2.h();
                h.f3239a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(s.g("Content-Encoding", b2)) && e.a(b2) && (tVar = b2.f3254g) != null) {
                    k kVar = new k(tVar.h());
                    C0207a0 c2 = jVar2.c();
                    c2.h("Content-Encoding");
                    c2.h("Content-Length");
                    h.f3243f = c2.g().c();
                    h.f3244g = new t(s.g("Content-Type", b2), -1L, new p(kVar), 1);
                }
                return h.a();
            default:
                H.e eVar2 = fVar.f3522e;
                q1.j jVar3 = fVar.f3519a;
                q qVar2 = q.f829a;
                s sVar = null;
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
                                if (jVar3.f3480k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar3.f3479j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            n nVar = jVar3.f3475c;
                            l lVar2 = (l) eVar3.f206c;
                            boolean z4 = lVar2.i;
                            m1.p pVar = jVar3.f3473a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = pVar.f3222o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                y1.c cVar2 = pVar.f3226s;
                                dVar = pVar.f3227t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            qVar = qVar2;
                            i = i2;
                            jVar3.f3478g = new q1.f(nVar, new m1.a(lVar2.d, lVar2.f3186e, pVar.f3218k, pVar.f3221n, sSLSocketFactory, cVar, dVar, pVar.f3220m, pVar.f3225r, pVar.f3224q, pVar.f3219l), jVar3);
                        } else {
                            qVar = qVar2;
                            i = i2;
                        }
                        try {
                            if (jVar3.f3482m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                s b3 = fVar.b(eVar3);
                                if (sVar != null) {
                                    r h2 = b3.h();
                                    r h3 = sVar.h();
                                    h3.f3244g = null;
                                    s a3 = h3.a();
                                    if (a3.f3254g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    h2.f3245j = a3;
                                    b3 = h2.a();
                                }
                                sVar = b3;
                                eVar3 = b(sVar, jVar3.i);
                                if (eVar3 == null) {
                                    jVar3.e(false);
                                    return sVar;
                                }
                                t tVar2 = sVar.f3254g;
                                if (tVar2 != null) {
                                    n1.b.b(tVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar3.e(true);
                                qVar2 = qVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar3, eVar3, !(e2 instanceof C0315a))) {
                                    Iterator it = qVar.iterator();
                                    while (it.hasNext()) {
                                        u1.l.e(e2, (Exception) it.next());
                                    }
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(qVar.size() + 1);
                                arrayList.addAll(qVar);
                                arrayList.add(e2);
                                jVar3.e(true);
                                qVar2 = arrayList;
                                i2 = i;
                                z3 = false;
                            } catch (o e3) {
                                q qVar3 = qVar;
                                if (!c(e3.f3505b, jVar3, eVar3, false)) {
                                    IOException iOException = e3.f3504a;
                                    b1.d.e(iOException, "<this>");
                                    Iterator it2 = qVar3.iterator();
                                    while (it2.hasNext()) {
                                        u1.l.e(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3504a;
                                ArrayList arrayList2 = new ArrayList(qVar3.size() + 1);
                                arrayList2.addAll(qVar3);
                                arrayList2.add(iOException2);
                                jVar3.e(true);
                                qVar2 = arrayList2;
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

    public H.e b(s sVar, q1.e eVar) {
        String g2;
        m1.k kVar;
        q1.m mVar;
        m1.u uVar = (eVar == null || (mVar = eVar.f3461e) == null) ? null : mVar.f3488b;
        int i = sVar.d;
        String str = (String) sVar.f3249a.f205b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((m1.p) this.f3517b).f3216g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || b1.d.a(eVar.f3459b.f3463b.h.d, eVar.f3461e.f3488b.f3262a.h.d)) {
                    return null;
                }
                q1.m mVar2 = eVar.f3461e;
                synchronized (mVar2) {
                    mVar2.f3494k = true;
                }
                return sVar.f3249a;
            }
            if (i == 503) {
                s sVar2 = sVar.f3255j;
                if ((sVar2 == null || sVar2.d != 503) && d(sVar, Integer.MAX_VALUE) == 0) {
                    return sVar.f3249a;
                }
                return null;
            }
            if (i == 407) {
                b1.d.b(uVar);
                if (uVar.f3263b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((m1.p) this.f3517b).f3220m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((m1.p) this.f3517b).f3215f) {
                    return null;
                }
                s sVar3 = sVar.f3255j;
                if ((sVar3 == null || sVar3.d != 408) && d(sVar, 0) <= 0) {
                    return sVar.f3249a;
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
        m1.p pVar = (m1.p) this.f3517b;
        if (!pVar.h || (g2 = s.g("Location", sVar)) == null) {
            return null;
        }
        H.e eVar2 = sVar.f3249a;
        l lVar = (l) eVar2.f206c;
        lVar.getClass();
        try {
            kVar = new m1.k();
            kVar.c(lVar, g2);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        l a2 = kVar != null ? kVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!b1.d.a(a2.f3183a, ((l) eVar2.f206c).f3183a) && !pVar.i) {
            return null;
        }
        u g3 = eVar2.g();
        if (k0.k.o(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = sVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g3.o(str, null);
            } else {
                g3.o("GET", null);
            }
            if (!z2) {
                ((C0207a0) g3.f803c).h("Transfer-Encoding");
                ((C0207a0) g3.f803c).h("Content-Length");
                ((C0207a0) g3.f803c).h("Content-Type");
            }
        }
        if (!n1.b.a((l) eVar2.f206c, a2)) {
            ((C0207a0) g3.f803c).h("Authorization");
        }
        g3.f801a = a2;
        return g3.b();
    }

    public boolean c(IOException iOException, q1.j jVar, H.e eVar, boolean z2) {
        q1.p pVar;
        boolean i;
        q1.m mVar;
        if (!((m1.p) this.f3517b).f3215f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        q1.f fVar = jVar.f3478g;
        b1.d.b(fVar);
        int i2 = fVar.f3466f;
        if (i2 == 0 && fVar.f3467g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                m1.u uVar = null;
                if (i2 <= 1 && fVar.f3467g <= 1 && fVar.h <= 0 && (mVar = fVar.f3464c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3495l == 0) {
                            if (n1.b.a(mVar.f3488b.f3262a.h, fVar.f3463b.h)) {
                                uVar = mVar.f3488b;
                            }
                        }
                    }
                }
                if (uVar != null) {
                    fVar.i = uVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.d()) && (pVar = fVar.f3465e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(m1.p pVar) {
        this.f3517b = pVar;
    }
}
