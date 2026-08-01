package t1;

import B1.k;
import S0.p;
import U.u;
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
import l.Z;
import m.C0260a;
import o1.j;
import o1.l;
import o1.m;
import o1.r;
import o1.s;
import o1.t;
import s1.n;
import s1.o;
import v1.C0308a;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3803a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3804b;

    public a(o1.b bVar) {
        d1.d.e(bVar, "cookieJar");
        this.f3804b = bVar;
    }

    public static int d(s sVar, int i) {
        String g2 = s.g("Retry-After", sVar);
        if (g2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        d1.d.d(compile, "compile(...)");
        if (!compile.matcher(g2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(g2);
        d1.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o1.m
    public final s a(f fVar) {
        t tVar;
        p pVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        A1.c cVar;
        o1.d dVar;
        switch (this.f3803a) {
            case 0:
                H.e eVar = fVar.f3809e;
                u a2 = eVar.a();
                boolean z2 = false;
                j jVar = (j) eVar.d;
                String a3 = jVar.a("Host");
                l lVar = (l) eVar.f261c;
                if (a3 == null) {
                    a2.k("Host", p1.b.u(lVar, false));
                }
                if (jVar.a("Connection") == null) {
                    a2.k("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    a2.k("Accept-Encoding", "gzip");
                    z2 = true;
                }
                o1.b bVar = (o1.b) this.f3804b;
                bVar.getClass();
                d1.d.e(lVar, "url");
                if (jVar.a("User-Agent") == null) {
                    a2.k("User-Agent", "okhttp/4.12.0");
                }
                s b2 = fVar.b(a2.b());
                j jVar2 = b2.f3387f;
                e.b(bVar, lVar, jVar2);
                r h = b2.h();
                h.f3373a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(s.g("Content-Encoding", b2)) && e.a(b2) && (tVar = b2.f3388g) != null) {
                    k kVar = new k(tVar.h());
                    Z c2 = jVar2.c();
                    c2.h("Content-Encoding");
                    c2.h("Content-Length");
                    h.f3377f = c2.g().c();
                    h.f3378g = new t(s.g("Content-Type", b2), -1L, new B1.p(kVar), 1);
                }
                return h.a();
            default:
                H.e eVar2 = fVar.f3809e;
                s1.j jVar3 = fVar.f3806a;
                p pVar2 = p.f795a;
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
                                if (jVar3.f3727k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar3.f3726j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            n nVar = jVar3.f3722c;
                            l lVar2 = (l) eVar3.f261c;
                            boolean z4 = lVar2.i;
                            o1.p pVar3 = jVar3.f3720a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = pVar3.f3356o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                A1.c cVar2 = pVar3.f3360s;
                                dVar = pVar3.f3361t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            pVar = pVar2;
                            i = i2;
                            jVar3.f3725g = new s1.f(nVar, new o1.a(lVar2.d, lVar2.f3320e, pVar3.f3352k, pVar3.f3355n, sSLSocketFactory, cVar, dVar, pVar3.f3354m, pVar3.f3359r, pVar3.f3358q, pVar3.f3353l), jVar3);
                        } else {
                            pVar = pVar2;
                            i = i2;
                        }
                        try {
                            if (jVar3.f3729m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                s b3 = fVar.b(eVar3);
                                if (sVar != null) {
                                    r h2 = b3.h();
                                    r h3 = sVar.h();
                                    h3.f3378g = null;
                                    s a4 = h3.a();
                                    if (a4.f3388g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    h2.f3379j = a4;
                                    b3 = h2.a();
                                }
                                sVar = b3;
                                eVar3 = b(sVar, jVar3.i);
                                if (eVar3 == null) {
                                    jVar3.e(false);
                                    return sVar;
                                }
                                t tVar2 = sVar.f3388g;
                                if (tVar2 != null) {
                                    p1.b.b(tVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar3.e(true);
                                pVar2 = pVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar3, eVar3, !(e2 instanceof C0308a))) {
                                    Iterator it = pVar.iterator();
                                    while (it.hasNext()) {
                                        w1.d.d(e2, (Exception) it.next());
                                    }
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(pVar.size() + 1);
                                arrayList.addAll(pVar);
                                arrayList.add(e2);
                                jVar3.e(true);
                                pVar2 = arrayList;
                                i2 = i;
                                z3 = false;
                            } catch (o e3) {
                                p pVar4 = pVar;
                                if (!c(e3.f3752b, jVar3, eVar3, false)) {
                                    IOException iOException = e3.f3751a;
                                    d1.d.e(iOException, "<this>");
                                    Iterator it2 = pVar4.iterator();
                                    while (it2.hasNext()) {
                                        w1.d.d(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3751a;
                                ArrayList arrayList2 = new ArrayList(pVar4.size() + 1);
                                arrayList2.addAll(pVar4);
                                arrayList2.add(iOException2);
                                jVar3.e(true);
                                pVar2 = arrayList2;
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

    public H.e b(s sVar, s1.e eVar) {
        String g2;
        o1.k kVar;
        s1.m mVar;
        o1.u uVar = (eVar == null || (mVar = eVar.f3708e) == null) ? null : mVar.f3735b;
        int i = sVar.d;
        String str = (String) sVar.f3383a.f260b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((o1.p) this.f3804b).f3350g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || d1.d.a(eVar.f3706b.f3710b.h.d, eVar.f3708e.f3735b.f3396a.h.d)) {
                    return null;
                }
                s1.m mVar2 = eVar.f3708e;
                synchronized (mVar2) {
                    mVar2.f3741k = true;
                }
                return sVar.f3383a;
            }
            if (i == 503) {
                s sVar2 = sVar.f3389j;
                if ((sVar2 == null || sVar2.d != 503) && d(sVar, Integer.MAX_VALUE) == 0) {
                    return sVar.f3383a;
                }
                return null;
            }
            if (i == 407) {
                d1.d.b(uVar);
                if (uVar.f3397b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((o1.p) this.f3804b).f3354m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((o1.p) this.f3804b).f3349f) {
                    return null;
                }
                s sVar3 = sVar.f3389j;
                if ((sVar3 == null || sVar3.d != 408) && d(sVar, 0) <= 0) {
                    return sVar.f3383a;
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
        o1.p pVar = (o1.p) this.f3804b;
        if (!pVar.h || (g2 = s.g("Location", sVar)) == null) {
            return null;
        }
        H.e eVar2 = sVar.f3383a;
        l lVar = (l) eVar2.f261c;
        lVar.getClass();
        try {
            kVar = new o1.k();
            kVar.c(lVar, g2);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        l a2 = kVar != null ? kVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!d1.d.a(a2.f3317a, ((l) eVar2.f261c).f3317a) && !pVar.i) {
            return null;
        }
        u a3 = eVar2.a();
        if (C0260a.q(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = sVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                a3.o(str, null);
            } else {
                a3.o("GET", null);
            }
            if (!z2) {
                ((Z) a3.f876c).h("Transfer-Encoding");
                ((Z) a3.f876c).h("Content-Length");
                ((Z) a3.f876c).h("Content-Type");
            }
        }
        if (!p1.b.a((l) eVar2.f261c, a2)) {
            ((Z) a3.f876c).h("Authorization");
        }
        a3.f874a = a2;
        return a3.b();
    }

    public boolean c(IOException iOException, s1.j jVar, H.e eVar, boolean z2) {
        s1.p pVar;
        boolean i;
        s1.m mVar;
        if (!((o1.p) this.f3804b).f3349f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        s1.f fVar = jVar.f3725g;
        d1.d.b(fVar);
        int i2 = fVar.f3713f;
        if (i2 == 0 && fVar.f3714g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                o1.u uVar = null;
                if (i2 <= 1 && fVar.f3714g <= 1 && fVar.h <= 0 && (mVar = fVar.f3711c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3742l == 0) {
                            if (p1.b.a(mVar.f3735b.f3396a.h, fVar.f3710b.h)) {
                                uVar = mVar.f3735b;
                            }
                        }
                    }
                }
                if (uVar != null) {
                    fVar.i = uVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.d()) && (pVar = fVar.f3712e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(o1.p pVar) {
        this.f3804b = pVar;
    }
}
