package m1;

import T.t;
import X.V;
import i1.q;
import i1.r;
import i1.s;
import i1.u;
import i1.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l.C0242k;
import l.C0262u;
import p1.x;

/* loaded from: classes.dex */
public final class m extends p1.h {

    /* renamed from: b, reason: collision with root package name */
    public final w f3239b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3240c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public i1.j f3241e;

    /* renamed from: f, reason: collision with root package name */
    public r f3242f;

    /* renamed from: g, reason: collision with root package name */
    public p1.o f3243g;
    public v1.o h;
    public v1.n i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3244j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3245k;

    /* renamed from: l, reason: collision with root package name */
    public int f3246l;

    /* renamed from: m, reason: collision with root package name */
    public int f3247m;

    /* renamed from: n, reason: collision with root package name */
    public int f3248n;

    /* renamed from: o, reason: collision with root package name */
    public int f3249o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3250p;

    /* renamed from: q, reason: collision with root package name */
    public long f3251q;

    public m(n nVar, w wVar) {
        X0.e.e(nVar, "connectionPool");
        X0.e.e(wVar, "route");
        this.f3239b = wVar;
        this.f3249o = 1;
        this.f3250p = new ArrayList();
        this.f3251q = Long.MAX_VALUE;
    }

    public static void d(i1.p pVar, w wVar, IOException iOException) {
        X0.e.e(wVar, "failedRoute");
        X0.e.e(iOException, "failure");
        if (wVar.f2532b.type() != Proxy.Type.DIRECT) {
            i1.a aVar = wVar.f2531a;
            aVar.f2385g.connectFailed(aVar.h.g(), wVar.f2532b.address(), iOException);
        }
        C0242k c0242k = pVar.f2496y;
        synchronized (c0242k) {
            ((LinkedHashSet) c0242k.f3003a).add(wVar);
        }
    }

    @Override // p1.h
    public final synchronized void a(p1.o oVar, H.j jVar) {
        X0.e.e(oVar, "connection");
        X0.e.e(jVar, "settings");
        this.f3249o = (jVar.f227a & 16) != 0 ? ((int[]) jVar.f228b)[4] : Integer.MAX_VALUE;
    }

    @Override // p1.h
    public final void b(p1.w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        w wVar;
        X0.e.e(jVar, "call");
        if (this.f3242f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3239b.f2531a.f2386j;
        b bVar = new b(list);
        i1.a aVar = this.f3239b.f2531a;
        if (aVar.f2382c == null) {
            if (!list.contains(i1.h.f2425f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3239b.f2531a.h.d;
            q1.n nVar = q1.n.f3567a;
            if (!q1.n.f3567a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                w wVar2 = this.f3239b;
                if (wVar2.f2531a.f2382c != null && wVar2.f2532b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3240c == null) {
                        wVar = this.f3239b;
                        if (wVar.f2531a.f2382c == null && wVar.f2532b.type() == Proxy.Type.HTTP && this.f3240c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3251q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                X0.e.e(this.f3239b.f2533c, "inetSocketAddress");
                wVar = this.f3239b;
                if (wVar.f2531a.f2382c == null) {
                }
                this.f3251q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    j1.b.c(socket);
                }
                Socket socket2 = this.f3240c;
                if (socket2 != null) {
                    j1.b.c(socket2);
                }
                this.d = null;
                this.f3240c = null;
                this.h = null;
                this.i = null;
                this.f3241e = null;
                this.f3242f = null;
                this.f3243g = null;
                this.f3249o = 1;
                X0.e.e(this.f3239b.f2533c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    q1.l.d(oVar.f3255a, e2);
                    oVar.f3256b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3197c) {
                    throw oVar;
                }
                if (e2 instanceof ProtocolException) {
                    throw oVar;
                }
                if (e2 instanceof InterruptedIOException) {
                    throw oVar;
                }
                if ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) {
                    throw oVar;
                }
                if (e2 instanceof SSLPeerUnverifiedException) {
                    throw oVar;
                }
            }
        } while (e2 instanceof SSLException);
        throw oVar;
    }

    public final void e(int i, int i2, j jVar) {
        Socket createSocket;
        w wVar = this.f3239b;
        Proxy proxy = wVar.f2532b;
        i1.a aVar = wVar.f2531a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3236a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f2381b.createSocket();
            X0.e.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3240c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3239b.f2533c;
        X0.e.e(jVar, "call");
        X0.e.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            q1.n nVar = q1.n.f3567a;
            q1.n.f3567a.e(createSocket, this.f3239b.f2533c, i);
            try {
                this.h = new v1.o(s.u(createSocket));
                this.i = new v1.n(s.t(createSocket));
            } catch (NullPointerException e2) {
                if (X0.e.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3239b.f2533c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        t tVar = new t(4);
        w wVar = this.f3239b;
        i1.m mVar = wVar.f2531a.h;
        X0.e.e(mVar, "url");
        tVar.f741a = mVar;
        tVar.o("CONNECT", null);
        i1.a aVar = wVar.f2531a;
        tVar.l("Host", j1.b.t(aVar.h, true));
        tVar.l("Proxy-Connection", "Keep-Alive");
        tVar.l("User-Agent", "okhttp/4.12.0");
        H.e b2 = tVar.b();
        B0.d dVar = new B0.d(27);
        q1.l.h("Proxy-Authenticate");
        q1.l.k("OkHttp-Preemptive", "Proxy-Authenticate");
        dVar.A("Proxy-Authenticate");
        dVar.q("Proxy-Authenticate", "OkHttp-Preemptive");
        dVar.r();
        aVar.f2384f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + j1.b.t((i1.m) b2.f213c, true) + " HTTP/1.1";
        v1.o oVar = this.h;
        X0.e.b(oVar);
        v1.n nVar = this.i;
        X0.e.b(nVar);
        p pVar = new p(null, this, oVar, nVar);
        v1.w a2 = oVar.f4085a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        nVar.f4082a.a().g(i3, timeUnit);
        pVar.k((i1.k) b2.d, str);
        pVar.a();
        i1.t e2 = pVar.e(false);
        X0.e.b(e2);
        e2.f2508a = b2;
        u a3 = e2.a();
        long i4 = j1.b.i(a3);
        if (i4 != -1) {
            o1.d j3 = pVar.j(i4);
            j1.b.r(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.d("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f2384f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!oVar.f4086b.e() || !nVar.f4083b.e()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        i1.a aVar = this.f3239b.f2531a;
        SSLSocketFactory sSLSocketFactory = aVar.f2382c;
        r rVar = r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            r rVar2 = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar2)) {
                this.d = this.f3240c;
                this.f3242f = rVar;
                return;
            } else {
                this.d = this.f3240c;
                this.f3242f = rVar2;
                l();
                return;
            }
        }
        X0.e.e(jVar, "call");
        i1.a aVar2 = this.f3239b.f2531a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f2382c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            X0.e.b(sSLSocketFactory2);
            Socket socket = this.f3240c;
            i1.m mVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, mVar.d, mVar.f2453e, true);
            X0.e.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                i1.h a2 = bVar.a(sSLSocket2);
                if (a2.f2427b) {
                    q1.n nVar = q1.n.f3567a;
                    q1.n.f3567a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                X0.e.d(session, "sslSocketSession");
                i1.j x2 = q1.d.x(session);
                u1.c cVar = aVar2.d;
                X0.e.b(cVar);
                if (cVar.verify(aVar2.h.d, session)) {
                    i1.d dVar = aVar2.f2383e;
                    X0.e.b(dVar);
                    this.f3241e = new i1.j(x2.f2439a, x2.f2440b, x2.f2441c, new l(dVar, x2, aVar2));
                    X0.e.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f2402a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f2427b) {
                        q1.n nVar2 = q1.n.f3567a;
                        str = q1.n.f3567a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new v1.o(s.u(sSLSocket2));
                    this.i = new v1.n(s.t(sSLSocket2));
                    if (str != null) {
                        rVar = q.f(str);
                    }
                    this.f3242f = rVar;
                    q1.n nVar3 = q1.n.f3567a;
                    q1.n.f3567a.a(sSLSocket2);
                    if (this.f3242f == r.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = x2.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                X0.e.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                i1.d dVar2 = i1.d.f2401c;
                sb.append(q1.d.g0(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = u1.c.a(x509Certificate, 7);
                List a5 = u1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(e1.e.d0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    q1.n nVar4 = q1.n.f3567a;
                    q1.n.f3567a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    j1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (u1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(i1.a aVar, ArrayList arrayList) {
        i1.j jVar;
        byte[] bArr = j1.b.f2599a;
        if (this.f3250p.size() < this.f3249o && !this.f3244j) {
            w wVar = this.f3239b;
            if (!wVar.f2531a.a(aVar)) {
                return false;
            }
            i1.m mVar = aVar.h;
            String str = mVar.d;
            i1.a aVar2 = wVar.f2531a;
            if (X0.e.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3243g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w wVar2 = (w) it.next();
                    Proxy.Type type = wVar2.f2532b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && wVar.f2532b.type() == type2) {
                        if (X0.e.a(wVar.f2533c, wVar2.f2533c)) {
                            if (aVar.d != u1.c.f3831a) {
                                return false;
                            }
                            byte[] bArr2 = j1.b.f2599a;
                            i1.m mVar2 = aVar2.h;
                            if (mVar.f2453e == mVar2.f2453e) {
                                String str2 = mVar2.d;
                                String str3 = mVar.d;
                                if (!X0.e.a(str3, str2)) {
                                    if (!this.f3245k && (jVar = this.f3241e) != null) {
                                        List a2 = jVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            X0.e.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    i1.d dVar = aVar.f2383e;
                                    X0.e.b(dVar);
                                    i1.j jVar2 = this.f3241e;
                                    X0.e.b(jVar2);
                                    List a3 = jVar2.a();
                                    X0.e.e(str3, "hostname");
                                    X0.e.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f2402a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    it2.next().getClass();
                                    throw new ClassCastException();
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z2) {
        long j2;
        byte[] bArr = j1.b.f2599a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3240c;
        X0.e.b(socket);
        Socket socket2 = this.d;
        X0.e.b(socket2);
        v1.o oVar = this.h;
        X0.e.b(oVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p1.o oVar2 = this.f3243g;
        if (oVar2 != null) {
            synchronized (oVar2) {
                if (oVar2.f3444f) {
                    return false;
                }
                if (oVar2.f3450n < oVar2.f3449m) {
                    if (nanoTime >= oVar2.f3451o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3251q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !oVar.e();
                socket2.setSoTimeout(soTimeout);
                return z3;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final n1.d j(i1.p pVar, n1.f fVar) {
        Socket socket = this.d;
        X0.e.b(socket);
        v1.o oVar = this.h;
        X0.e.b(oVar);
        v1.n nVar = this.i;
        X0.e.b(nVar);
        p1.o oVar2 = this.f3243g;
        if (oVar2 != null) {
            return new p1.p(pVar, this, fVar, oVar2);
        }
        int i = fVar.f3309g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oVar.f4085a.a().g(i, timeUnit);
        nVar.f4082a.a().g(fVar.h, timeUnit);
        return new p(pVar, this, oVar, nVar);
    }

    public final synchronized void k() {
        this.f3244j = true;
    }

    public final void l() {
        Socket socket = this.d;
        X0.e.b(socket);
        v1.o oVar = this.h;
        X0.e.b(oVar);
        v1.n nVar = this.i;
        X0.e.b(nVar);
        socket.setSoTimeout(0);
        l1.d dVar = l1.d.h;
        C0262u c0262u = new C0262u(dVar);
        String str = this.f3239b.f2531a.h.d;
        X0.e.e(str, "peerName");
        c0262u.f3064b = socket;
        String str2 = j1.b.f2603f + ' ' + str;
        X0.e.e(str2, "<set-?>");
        c0262u.f3065c = str2;
        c0262u.d = oVar;
        c0262u.f3066e = nVar;
        c0262u.f3067f = this;
        p1.o oVar2 = new p1.o(c0262u);
        this.f3243g = oVar2;
        H.j jVar = p1.o.f3439z;
        int i = 4;
        this.f3249o = (jVar.f227a & 16) != 0 ? ((int[]) jVar.f228b)[4] : Integer.MAX_VALUE;
        x xVar = oVar2.f3459w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = x.f3496f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(j1.b.g(">> CONNECTION " + p1.f.f3418a.b(), new Object[0]));
                }
                v1.n nVar2 = xVar.f3497a;
                v1.i iVar = p1.f.f3418a;
                nVar2.getClass();
                X0.e.e(iVar, "byteString");
                if (nVar2.f4084c) {
                    throw new IllegalStateException("closed");
                }
                nVar2.f4083b.q(iVar);
                nVar2.e();
                xVar.f3497a.flush();
            } finally {
            }
        }
        x xVar2 = oVar2.f3459w;
        H.j jVar2 = oVar2.f3452p;
        synchronized (xVar2) {
            try {
                X0.e.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.g(0, Integer.bitCount(jVar2.f227a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f227a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        v1.n nVar3 = xVar2.f3497a;
                        if (nVar3.f4084c) {
                            throw new IllegalStateException("closed");
                        }
                        v1.f fVar = nVar3.f4083b;
                        v1.p o2 = fVar.o(2);
                        int i4 = o2.f4090c;
                        byte[] bArr = o2.f4088a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        o2.f4090c = i4 + 2;
                        fVar.f4069b += 2;
                        nVar3.e();
                        xVar2.f3497a.g(((int[]) jVar2.f228b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3497a.flush();
            } finally {
            }
        }
        if (oVar2.f3452p.b() != 65535) {
            oVar2.f3459w.l(0, r2 - 65535);
        }
        dVar.e().c(new l1.b(oVar2.f3442c, oVar2.f3460x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        w wVar = this.f3239b;
        sb.append(wVar.f2531a.h.d);
        sb.append(':');
        sb.append(wVar.f2531a.h.f2453e);
        sb.append(", proxy=");
        sb.append(wVar.f2532b);
        sb.append(" hostAddress=");
        sb.append(wVar.f2533c);
        sb.append(" cipherSuite=");
        i1.j jVar = this.f3241e;
        if (jVar == null || (obj = jVar.f2440b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3242f);
        sb.append('}');
        return sb.toString();
    }
}
