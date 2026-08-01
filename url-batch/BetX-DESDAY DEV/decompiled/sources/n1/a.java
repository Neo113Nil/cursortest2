package n1;

import T.v;
import i1.A;
import i1.C0167a;
import i1.C0168b;
import i1.n;
import i1.p;
import i1.q;
import i1.r;
import i1.u;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
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
import m1.m;
import m1.o;
import p1.C0313a;
import v1.l;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3658a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3659b;

    public a(C0168b c0168b) {
        X0.f.e(c0168b, "cookieJar");
        this.f3659b = c0168b;
    }

    public static int d(y yVar, int i) {
        String g2 = y.g(yVar, "Retry-After");
        if (g2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        X0.f.d(compile, "compile(...)");
        if (!compile.matcher(g2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(g2);
        X0.f.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i1.q
    public final y a(f fVar) {
        z zVar;
        O0.q qVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        u1.c cVar;
        i1.f fVar2;
        switch (this.f3658a) {
            case 0:
                w wVar = fVar.f3665e;
                v a2 = wVar.a();
                boolean z2 = false;
                n nVar = wVar.f2782c;
                String a3 = nVar.a("Host");
                p pVar = wVar.f2780a;
                if (a3 == null) {
                    a2.p("Host", j1.b.u(pVar, false));
                }
                if (nVar.a("Connection") == null) {
                    a2.p("Connection", "Keep-Alive");
                }
                if (nVar.a("Accept-Encoding") == null && nVar.a("Range") == null) {
                    a2.p("Accept-Encoding", "gzip");
                    z2 = true;
                }
                C0168b c0168b = (C0168b) this.f3659b;
                c0168b.getClass();
                X0.f.e(pVar, "url");
                if (nVar.a("User-Agent") == null) {
                    a2.p("User-Agent", "okhttp/4.12.0");
                }
                y b2 = fVar.b(a2.f());
                n nVar2 = b2.f2801f;
                e.b(c0168b, pVar, nVar2);
                x h = b2.h();
                h.f2785a = wVar;
                if (z2 && "gzip".equalsIgnoreCase(y.g(b2, "Content-Encoding")) && e.a(b2) && (zVar = b2.f2802g) != null) {
                    l lVar = new l(zVar.h());
                    B0.d c2 = nVar2.c();
                    c2.E("Content-Encoding");
                    c2.E("Content-Length");
                    h.f2790f = c2.y().c();
                    h.f2791g = new z(y.g(b2, "Content-Type"), -1L, new v1.q(lVar), 1);
                }
                return h.a();
            default:
                w wVar2 = fVar.f3665e;
                j jVar = fVar.f3661a;
                O0.q qVar2 = O0.q.f695a;
                y yVar = null;
                int i2 = 0;
                w wVar3 = wVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar.getClass();
                        if (jVar.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar) {
                            try {
                                if (jVar.f3581k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3580j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            m1.n nVar3 = jVar.f3575c;
                            p pVar2 = wVar3.f2780a;
                            boolean z4 = pVar2.i;
                            u uVar = jVar.f3573a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = uVar.f2762o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                u1.c cVar2 = uVar.f2766s;
                                fVar2 = uVar.f2767t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                fVar2 = null;
                            }
                            qVar = qVar2;
                            i = i2;
                            jVar.f3579g = new m1.f(nVar3, new C0167a(pVar2.f2719d, pVar2.f2720e, uVar.f2758k, uVar.f2761n, sSLSocketFactory, cVar, fVar2, uVar.f2760m, uVar.f2765r, uVar.f2764q, uVar.f2759l), jVar);
                        } else {
                            qVar = qVar2;
                            i = i2;
                        }
                        try {
                            if (jVar.f3583m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                y b3 = fVar.b(wVar3);
                                if (yVar != null) {
                                    x h2 = b3.h();
                                    x h3 = yVar.h();
                                    h3.f2791g = null;
                                    y a4 = h3.a();
                                    if (a4.f2802g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    h2.f2792j = a4;
                                    b3 = h2.a();
                                }
                                yVar = b3;
                                wVar3 = b(yVar, jVar.i);
                                if (wVar3 == null) {
                                    jVar.e(false);
                                    return yVar;
                                }
                                z zVar2 = yVar.f2802g;
                                if (zVar2 != null) {
                                    j1.b.b(zVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                qVar2 = qVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, wVar3, !(e2 instanceof C0313a))) {
                                    Iterator it = qVar.iterator();
                                    while (it.hasNext()) {
                                        q1.l.b(e2, (Exception) it.next());
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
                                O0.q qVar3 = qVar;
                                if (!c(e3.f3609b, jVar, wVar3, false)) {
                                    IOException iOException = e3.f3608a;
                                    X0.f.e(iOException, "<this>");
                                    Iterator it2 = qVar3.iterator();
                                    while (it2.hasNext()) {
                                        q1.l.b(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3608a;
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

    public w b(y yVar, m1.e eVar) {
        String g2;
        i1.o oVar;
        m mVar;
        A a2 = (eVar == null || (mVar = eVar.f3560e) == null) ? null : mVar.f3590b;
        int i = yVar.f2799d;
        String str = yVar.f2796a.f2781b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((u) this.f3659b).f2756g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || X0.f.a(eVar.f3557b.f3562b.h.f2719d, eVar.f3560e.f3590b.f2627a.h.f2719d)) {
                    return null;
                }
                m mVar2 = eVar.f3560e;
                synchronized (mVar2) {
                    mVar2.f3597k = true;
                }
                return yVar.f2796a;
            }
            if (i == 503) {
                y yVar2 = yVar.f2803j;
                if ((yVar2 == null || yVar2.f2799d != 503) && d(yVar, Integer.MAX_VALUE) == 0) {
                    return yVar.f2796a;
                }
                return null;
            }
            if (i == 407) {
                X0.f.b(a2);
                if (a2.f2628b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((u) this.f3659b).f2760m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((u) this.f3659b).f2755f) {
                    return null;
                }
                y yVar3 = yVar.f2803j;
                if ((yVar3 == null || yVar3.f2799d != 408) && d(yVar, 0) <= 0) {
                    return yVar.f2796a;
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
        u uVar = (u) this.f3659b;
        if (!uVar.h || (g2 = y.g(yVar, "Location")) == null) {
            return null;
        }
        w wVar = yVar.f2796a;
        p pVar = wVar.f2780a;
        pVar.getClass();
        try {
            oVar = new i1.o();
            oVar.c(pVar, g2);
        } catch (IllegalArgumentException unused) {
            oVar = null;
        }
        p a3 = oVar != null ? oVar.a() : null;
        if (a3 == null) {
            return null;
        }
        if (!X0.f.a(a3.f2716a, wVar.f2780a.f2716a) && !uVar.i) {
            return null;
        }
        v a4 = wVar.a();
        if (r.n(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = yVar.f2799d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                a4.s(str, null);
            } else {
                a4.s("GET", null);
            }
            if (!z2) {
                ((B0.d) a4.f826c).E("Transfer-Encoding");
                ((B0.d) a4.f826c).E("Content-Length");
                ((B0.d) a4.f826c).E("Content-Type");
            }
        }
        if (!j1.b.a(wVar.f2780a, a3)) {
            ((B0.d) a4.f826c).E("Authorization");
        }
        a4.f824a = a3;
        return a4.f();
    }

    public boolean c(IOException iOException, j jVar, w wVar, boolean z2) {
        m1.p pVar;
        boolean i;
        m mVar;
        if (!((u) this.f3659b).f2755f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        m1.f fVar = jVar.f3579g;
        X0.f.b(fVar);
        int i2 = fVar.f3566f;
        if (i2 == 0 && fVar.f3567g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                A a2 = null;
                if (i2 <= 1 && fVar.f3567g <= 1 && fVar.h <= 0 && (mVar = fVar.f3563c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3598l == 0) {
                            if (j1.b.a(mVar.f3590b.f2627a.h, fVar.f3562b.h)) {
                                a2 = mVar.f3590b;
                            }
                        }
                    }
                }
                if (a2 != null) {
                    fVar.i = a2;
                } else {
                    H.j jVar2 = fVar.f3564d;
                    if ((jVar2 == null || !jVar2.d()) && (pVar = fVar.f3565e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(u uVar) {
        this.f3659b = uVar;
    }
}
