package x1;

import F1.k;
import I.i;
import S0.g;
import W0.p;
import h0.d0;
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
import m.C0202a0;
import s1.j;
import s1.l;
import s1.m;
import s1.o;
import s1.q;
import s1.r;
import s1.s;
import s1.t;
import w1.n;
import z1.C0322a;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4288a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4289b;

    public a(s1.b bVar) {
        h1.d.e(bVar, "cookieJar");
        this.f4289b = bVar;
    }

    public static int d(r rVar, int i) {
        String g2 = r.g("Retry-After", rVar);
        if (g2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        h1.d.d(compile, "compile(...)");
        if (!compile.matcher(g2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(g2);
        h1.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s1.m
    public final r a(f fVar) {
        s sVar;
        p pVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        E1.c cVar;
        s1.d dVar;
        switch (this.f4288a) {
            case 0:
                I.d dVar2 = fVar.f4294e;
                g g2 = dVar2.g();
                boolean z2 = false;
                j jVar = (j) dVar2.d;
                String a2 = jVar.a("Host");
                l lVar = (l) dVar2.f321c;
                if (a2 == null) {
                    g2.k("Host", t1.b.u(lVar, false));
                }
                if (jVar.a("Connection") == null) {
                    g2.k("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    g2.k("Accept-Encoding", "gzip");
                    z2 = true;
                }
                s1.b bVar = (s1.b) this.f4289b;
                bVar.getClass();
                h1.d.e(lVar, "url");
                if (jVar.a("User-Agent") == null) {
                    g2.k("User-Agent", "okhttp/4.12.0");
                }
                r b2 = fVar.b(g2.b());
                j jVar2 = b2.f3706f;
                e.b(bVar, lVar, jVar2);
                q h2 = b2.h();
                h2.f3691a = dVar2;
                if (z2 && "gzip".equalsIgnoreCase(r.g("Content-Encoding", b2)) && e.a(b2) && (sVar = b2.f3707g) != null) {
                    k kVar = new k(sVar.h());
                    C0202a0 c2 = jVar2.c();
                    c2.h("Content-Encoding");
                    c2.h("Content-Length");
                    h2.f3695f = c2.g().c();
                    h2.f3696g = new s(r.g("Content-Type", b2), -1L, new F1.p(kVar), 1);
                }
                return h2.a();
            default:
                I.d dVar3 = fVar.f4294e;
                w1.j jVar3 = fVar.f4291a;
                p pVar2 = p.f959a;
                r rVar = null;
                int i2 = 0;
                I.d dVar4 = dVar3;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar3.getClass();
                        if (jVar3.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar3) {
                            try {
                                if (jVar3.f4245k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar3.f4244j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            n nVar = jVar3.f4239c;
                            l lVar2 = (l) dVar4.f321c;
                            boolean z4 = lVar2.i;
                            o oVar = jVar3.f4237a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = oVar.f3673o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                E1.c cVar2 = oVar.f3677s;
                                dVar = oVar.f3678t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            pVar = pVar2;
                            i = i2;
                            jVar3.f4242g = new w1.f(nVar, new s1.a(lVar2.d, lVar2.f3652e, oVar.f3669k, oVar.f3672n, sSLSocketFactory, cVar, dVar, oVar.f3671m, oVar.f3676r, oVar.f3675q, oVar.f3670l), jVar3);
                        } else {
                            pVar = pVar2;
                            i = i2;
                        }
                        try {
                            if (jVar3.f4247m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                r b3 = fVar.b(dVar4);
                                if (rVar != null) {
                                    q h3 = b3.h();
                                    q h4 = rVar.h();
                                    h4.f3696g = null;
                                    r a3 = h4.a();
                                    if (a3.f3707g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    h3.f3698j = a3;
                                    b3 = h3.a();
                                }
                                rVar = b3;
                                dVar4 = b(rVar, jVar3.i);
                                if (dVar4 == null) {
                                    jVar3.e(false);
                                    return rVar;
                                }
                                s sVar2 = rVar.f3707g;
                                if (sVar2 != null) {
                                    t1.b.b(sVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar3.e(true);
                                pVar2 = pVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar3, dVar4, !(e2 instanceof C0322a))) {
                                    Iterator it = pVar.iterator();
                                    while (it.hasNext()) {
                                        A1.d.e(e2, (Exception) it.next());
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
                            } catch (w1.o e3) {
                                p pVar3 = pVar;
                                if (!c(e3.f4271b, jVar3, dVar4, false)) {
                                    IOException iOException = e3.f4270a;
                                    h1.d.e(iOException, "<this>");
                                    Iterator it2 = pVar3.iterator();
                                    while (it2.hasNext()) {
                                        A1.d.e(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f4270a;
                                ArrayList arrayList2 = new ArrayList(pVar3.size() + 1);
                                arrayList2.addAll(pVar3);
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

    public I.d b(r rVar, w1.e eVar) {
        String g2;
        s1.k kVar;
        w1.m mVar;
        t tVar = (eVar == null || (mVar = eVar.f4224e) == null) ? null : mVar.f4253b;
        int i = rVar.d;
        String str = (String) rVar.f3702a.f320b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((o) this.f4289b).f3666g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || h1.d.a(eVar.f4222b.f4226b.f3583h.d, eVar.f4224e.f4253b.f3716a.f3583h.d)) {
                    return null;
                }
                w1.m mVar2 = eVar.f4224e;
                synchronized (mVar2) {
                    mVar2.f4260k = true;
                }
                return rVar.f3702a;
            }
            if (i == 503) {
                r rVar2 = rVar.f3709j;
                if ((rVar2 == null || rVar2.d != 503) && d(rVar, Integer.MAX_VALUE) == 0) {
                    return rVar.f3702a;
                }
                return null;
            }
            if (i == 407) {
                h1.d.b(tVar);
                if (tVar.f3717b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((o) this.f4289b).f3671m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((o) this.f4289b).f3665f) {
                    return null;
                }
                r rVar3 = rVar.f3709j;
                if ((rVar3 == null || rVar3.d != 408) && d(rVar, 0) <= 0) {
                    return rVar.f3702a;
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
        o oVar = (o) this.f4289b;
        if (!oVar.f3667h || (g2 = r.g("Location", rVar)) == null) {
            return null;
        }
        I.d dVar = rVar.f3702a;
        l lVar = (l) dVar.f321c;
        lVar.getClass();
        try {
            kVar = new s1.k();
            kVar.c(lVar, g2);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        l a2 = kVar != null ? kVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!h1.d.a(a2.f3649a, ((l) dVar.f321c).f3649a) && !oVar.i) {
            return null;
        }
        g g3 = dVar.g();
        if (d0.m(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = rVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g3.o(str, null);
            } else {
                g3.o("GET", null);
            }
            if (!z2) {
                ((C0202a0) g3.f824c).h("Transfer-Encoding");
                ((C0202a0) g3.f824c).h("Content-Length");
                ((C0202a0) g3.f824c).h("Content-Type");
            }
        }
        if (!t1.b.a((l) dVar.f321c, a2)) {
            ((C0202a0) g3.f824c).h("Authorization");
        }
        g3.f822a = a2;
        return g3.b();
    }

    public boolean c(IOException iOException, w1.j jVar, I.d dVar, boolean z2) {
        w1.p pVar;
        boolean i;
        w1.m mVar;
        if (!((o) this.f4289b).f3665f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        w1.f fVar = jVar.f4242g;
        h1.d.b(fVar);
        int i2 = fVar.f4229f;
        if (i2 == 0 && fVar.f4230g == 0 && fVar.f4231h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                t tVar = null;
                if (i2 <= 1 && fVar.f4230g <= 1 && fVar.f4231h <= 0 && (mVar = fVar.f4227c.f4243h) != null) {
                    synchronized (mVar) {
                        if (mVar.f4261l == 0) {
                            if (t1.b.a(mVar.f4253b.f3716a.f3583h, fVar.f4226b.f3583h)) {
                                tVar = mVar.f4253b;
                            }
                        }
                    }
                }
                if (tVar != null) {
                    fVar.i = tVar;
                } else {
                    i iVar = fVar.d;
                    if ((iVar == null || !iVar.d()) && (pVar = fVar.f4228e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(o oVar) {
        this.f4289b = oVar;
    }
}
