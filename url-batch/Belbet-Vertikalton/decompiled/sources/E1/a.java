package E1;

import D1.j;
import D1.n;
import D1.q;
import G1.C0000a;
import M1.k;
import X0.t;
import a.AbstractC0058a;
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
import n.C0288n;
import z1.m;
import z1.o;
import z1.p;
import z1.s;
import z1.u;
import z1.v;
import z1.w;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f302b;

    public a(z1.b bVar) {
        j1.h.e(bVar, "cookieJar");
        this.f302b = bVar;
    }

    public static int d(v vVar, int i) {
        String a2 = v.a("Retry-After", vVar);
        if (a2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        j1.h.d(compile, "compile(...)");
        if (!compile.matcher(a2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a2);
        j1.h.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z1.p
    public final v a(g gVar) {
        h hVar;
        t tVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        L1.c cVar;
        z1.f fVar;
        switch (this.f301a) {
            case 0:
                J.d dVar = gVar.e;
                V.v g2 = dVar.g();
                boolean z2 = false;
                m mVar = (m) dVar.f627d;
                String a2 = mVar.a("Host");
                o oVar = (o) dVar.f626c;
                if (a2 == null) {
                    g2.l("Host", A1.c.u(oVar, false));
                }
                if (mVar.a("Connection") == null) {
                    g2.l("Connection", "Keep-Alive");
                }
                if (mVar.a("Accept-Encoding") == null && mVar.a("Range") == null) {
                    g2.l("Accept-Encoding", "gzip");
                    z2 = true;
                }
                z1.b bVar = (z1.b) this.f302b;
                bVar.getClass();
                j1.h.e(oVar, "url");
                if (mVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                v b2 = gVar.b(g2.b());
                m mVar2 = b2.f4948f;
                f.b(bVar, oVar, mVar2);
                u d2 = b2.d();
                d2.f4934a = dVar;
                if (z2 && "gzip".equalsIgnoreCase(v.a("Content-Encoding", b2)) && f.a(b2) && (hVar = b2.f4949g) != null) {
                    k kVar = new k(hVar.d());
                    C0288n c2 = mVar2.c();
                    c2.j("Content-Encoding");
                    c2.j("Content-Length");
                    d2.f4938f = c2.i().c();
                    d2.f4939g = new h(v.a("Content-Type", b2), -1L, new M1.p(kVar), 0);
                }
                return d2.a();
            default:
                J.d dVar2 = gVar.e;
                j jVar = gVar.f305a;
                t tVar2 = t.f1385a;
                v vVar = null;
                int i2 = 0;
                J.d dVar3 = dVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar.getClass();
                        if (jVar.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar) {
                            try {
                                if (jVar.f242k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            n nVar = jVar.f237c;
                            o oVar2 = (o) dVar3.f626c;
                            boolean z4 = oVar2.i;
                            s sVar = jVar.f235a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = sVar.f4916o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                L1.c cVar2 = sVar.f4920s;
                                fVar = sVar.f4921t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                fVar = null;
                            }
                            tVar = tVar2;
                            i = i2;
                            jVar.f240g = new D1.f(nVar, new z1.a(oVar2.f4878d, oVar2.e, sVar.f4912k, sVar.f4915n, sSLSocketFactory, cVar, fVar, sVar.f4914m, sVar.f4919r, sVar.f4918q, sVar.f4913l), jVar);
                        } else {
                            tVar = tVar2;
                            i = i2;
                        }
                        try {
                            if (jVar.f244m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                v b3 = gVar.b(dVar3);
                                if (vVar != null) {
                                    u d3 = b3.d();
                                    u d4 = vVar.d();
                                    d4.f4939g = null;
                                    v a3 = d4.a();
                                    if (a3.f4949g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    d3.j = a3;
                                    b3 = d3.a();
                                }
                                vVar = b3;
                                dVar3 = b(vVar, jVar.i);
                                if (dVar3 == null) {
                                    jVar.e(false);
                                    return vVar;
                                }
                                h hVar2 = vVar.f4949g;
                                if (hVar2 != null) {
                                    A1.c.b(hVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                tVar2 = tVar;
                            } catch (D1.o e) {
                                t tVar3 = tVar;
                                if (!c(e.f269b, jVar, dVar3, false)) {
                                    IOException iOException = e.f268a;
                                    j1.h.e(iOException, "<this>");
                                    Iterator it = tVar3.iterator();
                                    while (it.hasNext()) {
                                        AbstractC0058a.a(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e.f268a;
                                ArrayList arrayList = new ArrayList(tVar3.size() + 1);
                                arrayList.addAll(tVar3);
                                arrayList.add(iOException2);
                                jVar.e(true);
                                tVar2 = arrayList;
                                z3 = false;
                                i2 = i;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, dVar3, !(e2 instanceof C0000a))) {
                                    Iterator it2 = tVar.iterator();
                                    while (it2.hasNext()) {
                                        AbstractC0058a.a(e2, (Exception) it2.next());
                                    }
                                    throw e2;
                                }
                                ArrayList arrayList2 = new ArrayList(tVar.size() + 1);
                                arrayList2.addAll(tVar);
                                arrayList2.add(e2);
                                jVar.e(true);
                                tVar2 = arrayList2;
                                i2 = i;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            jVar.e(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public J.d b(v vVar, D1.e eVar) {
        String a2;
        z1.n nVar;
        D1.m mVar;
        w wVar = (eVar == null || (mVar = eVar.e) == null) ? null : mVar.f251b;
        int i = vVar.f4947d;
        String str = (String) vVar.f4944a.f625b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((s) this.f302b).f4910g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || j1.h.a(eVar.f220b.f224b.f4813h.f4878d, eVar.e.f251b.f4954a.f4813h.f4878d)) {
                    return null;
                }
                D1.m mVar2 = eVar.e;
                synchronized (mVar2) {
                    mVar2.f257k = true;
                }
                return vVar.f4944a;
            }
            if (i == 503) {
                v vVar2 = vVar.j;
                if ((vVar2 == null || vVar2.f4947d != 503) && d(vVar, Integer.MAX_VALUE) == 0) {
                    return vVar.f4944a;
                }
                return null;
            }
            if (i == 407) {
                j1.h.b(wVar);
                if (wVar.f4955b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((s) this.f302b).f4914m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((s) this.f302b).f4909f) {
                    return null;
                }
                v vVar3 = vVar.j;
                if ((vVar3 == null || vVar3.f4947d != 408) && d(vVar, 0) <= 0) {
                    return vVar.f4944a;
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
        s sVar = (s) this.f302b;
        if (!sVar.f4911h || (a2 = v.a("Location", vVar)) == null) {
            return null;
        }
        J.d dVar = vVar.f4944a;
        o oVar = (o) dVar.f626c;
        oVar.getClass();
        try {
            nVar = new z1.n();
            nVar.c(oVar, a2);
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        o a3 = nVar != null ? nVar.a() : null;
        if (a3 == null) {
            return null;
        }
        if (!j1.h.a(a3.f4875a, ((o) dVar.f626c).f4875a) && !sVar.i) {
            return null;
        }
        V.v g2 = dVar.g();
        if (AbstractC0058a.Q(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = vVar.f4947d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g2.o(str, null);
            } else {
                g2.o("GET", null);
            }
            if (!z2) {
                ((C0288n) g2.f1307c).j("Transfer-Encoding");
                ((C0288n) g2.f1307c).j("Content-Length");
                ((C0288n) g2.f1307c).j("Content-Type");
            }
        }
        if (!A1.c.a((o) dVar.f626c, a3)) {
            ((C0288n) g2.f1307c).j("Authorization");
        }
        g2.f1305a = a3;
        return g2.b();
    }

    public boolean c(IOException iOException, j jVar, J.d dVar, boolean z2) {
        q qVar;
        boolean i;
        D1.m mVar;
        if (!((s) this.f302b).f4909f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        D1.f fVar = jVar.f240g;
        j1.h.b(fVar);
        int i2 = fVar.f227f;
        if (i2 == 0 && fVar.f228g == 0 && fVar.f229h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                w wVar = null;
                if (i2 <= 1 && fVar.f228g <= 1 && fVar.f229h <= 0 && (mVar = fVar.f225c.f241h) != null) {
                    synchronized (mVar) {
                        if (mVar.f258l == 0) {
                            if (A1.c.a(mVar.f251b.f4954a.f4813h, fVar.f224b.f4813h)) {
                                wVar = mVar.f251b;
                            }
                        }
                    }
                }
                if (wVar != null) {
                    fVar.i = wVar;
                } else {
                    D1.p pVar = fVar.f226d;
                    if ((pVar == null || !pVar.c()) && (qVar = fVar.e) != null) {
                        i = qVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(s sVar) {
        this.f302b = sVar;
    }
}
