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
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l.C0242k;
import l.C0262u;
import v1.x;

/* loaded from: classes.dex */
public final class m extends p1.h {

    /* renamed from: b, reason: collision with root package name */
    public final w f3243b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3244c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public i1.j f3245e;

    /* renamed from: f, reason: collision with root package name */
    public r f3246f;

    /* renamed from: g, reason: collision with root package name */
    public p1.o f3247g;
    public v1.p h;
    public v1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3248j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3249k;

    /* renamed from: l, reason: collision with root package name */
    public int f3250l;

    /* renamed from: m, reason: collision with root package name */
    public int f3251m;

    /* renamed from: n, reason: collision with root package name */
    public int f3252n;

    /* renamed from: o, reason: collision with root package name */
    public int f3253o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3254p;

    /* renamed from: q, reason: collision with root package name */
    public long f3255q;

    public m(n nVar, w wVar) {
        X0.d.e(nVar, "connectionPool");
        X0.d.e(wVar, "route");
        this.f3243b = wVar;
        this.f3253o = 1;
        this.f3254p = new ArrayList();
        this.f3255q = Long.MAX_VALUE;
    }

    public static void d(i1.p pVar, w wVar, IOException iOException) {
        X0.d.e(wVar, "failedRoute");
        X0.d.e(iOException, "failure");
        if (wVar.f2536b.type() != Proxy.Type.DIRECT) {
            i1.a aVar = wVar.f2535a;
            aVar.f2387g.connectFailed(aVar.h.g(), wVar.f2536b.address(), iOException);
        }
        C0242k c0242k = pVar.f2500z;
        synchronized (c0242k) {
            ((LinkedHashSet) c0242k.f3007a).add(wVar);
        }
    }

    @Override // p1.h
    public final synchronized void a(p1.o oVar, H.j jVar) {
        X0.d.e(oVar, "connection");
        X0.d.e(jVar, "settings");
        this.f3253o = (jVar.f227a & 16) != 0 ? ((int[]) jVar.f228b)[4] : Integer.MAX_VALUE;
    }

    @Override // p1.h
    public final void b(p1.w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        w wVar;
        X0.d.e(jVar, "call");
        if (this.f3246f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3243b.f2535a.f2388j;
        b bVar = new b(list);
        i1.a aVar = this.f3243b.f2535a;
        if (aVar.f2384c == null) {
            if (!list.contains(i1.h.f2427f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3243b.f2535a.h.d;
            q1.n nVar = q1.n.f3571a;
            if (!q1.n.f3571a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                w wVar2 = this.f3243b;
                if (wVar2.f2535a.f2384c != null && wVar2.f2536b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3244c == null) {
                        wVar = this.f3243b;
                        if (wVar.f2535a.f2384c == null && wVar.f2536b.type() == Proxy.Type.HTTP && this.f3244c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3255q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                X0.d.e(this.f3243b.f2537c, "inetSocketAddress");
                wVar = this.f3243b;
                if (wVar.f2535a.f2384c == null) {
                }
                this.f3255q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    j1.b.c(socket);
                }
                Socket socket2 = this.f3244c;
                if (socket2 != null) {
                    j1.b.c(socket2);
                }
                this.d = null;
                this.f3244c = null;
                this.h = null;
                this.i = null;
                this.f3245e = null;
                this.f3246f = null;
                this.f3247g = null;
                this.f3253o = 1;
                X0.d.e(this.f3243b.f2537c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    q1.l.d(oVar.f3259a, e2);
                    oVar.f3260b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3201c) {
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
        w wVar = this.f3243b;
        Proxy proxy = wVar.f2536b;
        i1.a aVar = wVar.f2535a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3240a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f2383b.createSocket();
            X0.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3244c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3243b.f2537c;
        X0.d.e(jVar, "call");
        X0.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            q1.n nVar = q1.n.f3571a;
            q1.n.f3571a.e(createSocket, this.f3243b.f2537c, i);
            try {
                this.h = new v1.p(s.u(createSocket));
                this.i = new v1.o(s.t(createSocket));
            } catch (NullPointerException e2) {
                if (X0.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3243b.f2537c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        t tVar = new t(4);
        w wVar = this.f3243b;
        i1.m mVar = wVar.f2535a.h;
        X0.d.e(mVar, "url");
        tVar.f747a = mVar;
        tVar.o("CONNECT", null);
        i1.a aVar = wVar.f2535a;
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
        aVar.f2386f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + j1.b.t((i1.m) b2.f213c, true) + " HTTP/1.1";
        v1.p pVar = this.h;
        X0.d.b(pVar);
        v1.o oVar = this.i;
        X0.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f4090a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f4087a.a().g(i3, timeUnit);
        pVar2.k((i1.k) b2.d, str);
        pVar2.a();
        i1.t e2 = pVar2.e(false);
        X0.d.b(e2);
        e2.f2512a = b2;
        u a3 = e2.a();
        long i4 = j1.b.i(a3);
        if (i4 != -1) {
            o1.d j3 = pVar2.j(i4);
            j1.b.r(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.d("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f2386f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f4091b.e() || !oVar.f4088b.e()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        i1.a aVar = this.f3243b.f2535a;
        SSLSocketFactory sSLSocketFactory = aVar.f2384c;
        r rVar = r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            r rVar2 = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar2)) {
                this.d = this.f3244c;
                this.f3246f = rVar;
                return;
            } else {
                this.d = this.f3244c;
                this.f3246f = rVar2;
                l();
                return;
            }
        }
        X0.d.e(jVar, "call");
        i1.a aVar2 = this.f3243b.f2535a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f2384c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            X0.d.b(sSLSocketFactory2);
            Socket socket = this.f3244c;
            i1.m mVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, mVar.d, mVar.f2455e, true);
            X0.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                i1.h a2 = bVar.a(sSLSocket2);
                if (a2.f2429b) {
                    q1.n nVar = q1.n.f3571a;
                    q1.n.f3571a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                X0.d.d(session, "sslSocketSession");
                i1.j y2 = q1.d.y(session);
                HostnameVerifier hostnameVerifier = aVar2.d;
                X0.d.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.h.d, session)) {
                    i1.d dVar = aVar2.f2385e;
                    X0.d.b(dVar);
                    this.f3245e = new i1.j(y2.f2441a, y2.f2442b, y2.f2443c, new l(dVar, y2, aVar2));
                    X0.d.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f2404a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f2429b) {
                        q1.n nVar2 = q1.n.f3571a;
                        str = q1.n.f3571a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new v1.p(s.u(sSLSocket2));
                    this.i = new v1.o(s.t(sSLSocket2));
                    if (str != null) {
                        rVar = q.f(str);
                    }
                    this.f3246f = rVar;
                    q1.n nVar3 = q1.n.f3571a;
                    q1.n.f3571a.a(sSLSocket2);
                    if (this.f3246f == r.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = y2.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                X0.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                i1.d dVar2 = i1.d.f2403c;
                sb.append(q1.d.h0(x509Certificate));
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
                    q1.n nVar4 = q1.n.f3571a;
                    q1.n.f3571a.a(sSLSocket);
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
        byte[] bArr = j1.b.f2603a;
        if (this.f3254p.size() < this.f3253o && !this.f3248j) {
            w wVar = this.f3243b;
            if (!wVar.f2535a.a(aVar)) {
                return false;
            }
            i1.m mVar = aVar.h;
            String str = mVar.d;
            i1.a aVar2 = wVar.f2535a;
            if (X0.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3247g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w wVar2 = (w) it.next();
                    Proxy.Type type = wVar2.f2536b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && wVar.f2536b.type() == type2) {
                        if (X0.d.a(wVar.f2537c, wVar2.f2537c)) {
                            if (aVar.d != u1.c.f3835a) {
                                return false;
                            }
                            byte[] bArr2 = j1.b.f2603a;
                            i1.m mVar2 = aVar2.h;
                            if (mVar.f2455e == mVar2.f2455e) {
                                String str2 = mVar2.d;
                                String str3 = mVar.d;
                                if (!X0.d.a(str3, str2)) {
                                    if (!this.f3249k && (jVar = this.f3245e) != null) {
                                        List a2 = jVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            X0.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    i1.d dVar = aVar.f2385e;
                                    X0.d.b(dVar);
                                    i1.j jVar2 = this.f3245e;
                                    X0.d.b(jVar2);
                                    List a3 = jVar2.a();
                                    X0.d.e(str3, "hostname");
                                    X0.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f2404a.iterator();
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
        byte[] bArr = j1.b.f2603a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3244c;
        X0.d.b(socket);
        Socket socket2 = this.d;
        X0.d.b(socket2);
        v1.p pVar = this.h;
        X0.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p1.o oVar = this.f3247g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f3448f) {
                    return false;
                }
                if (oVar.f3454n < oVar.f3453m) {
                    if (nanoTime >= oVar.f3455o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3255q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !pVar.e();
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
        X0.d.b(socket);
        v1.p pVar2 = this.h;
        X0.d.b(pVar2);
        v1.o oVar = this.i;
        X0.d.b(oVar);
        p1.o oVar2 = this.f3247g;
        if (oVar2 != null) {
            return new p1.p(pVar, this, fVar, oVar2);
        }
        int i = fVar.f3313g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar2.f4090a.a().g(i, timeUnit);
        oVar.f4087a.a().g(fVar.h, timeUnit);
        return new p(pVar, this, pVar2, oVar);
    }

    public final synchronized void k() {
        this.f3248j = true;
    }

    public final void l() {
        Socket socket = this.d;
        X0.d.b(socket);
        v1.p pVar = this.h;
        X0.d.b(pVar);
        v1.o oVar = this.i;
        X0.d.b(oVar);
        socket.setSoTimeout(0);
        l1.d dVar = l1.d.h;
        C0262u c0262u = new C0262u(dVar);
        String str = this.f3243b.f2535a.h.d;
        X0.d.e(str, "peerName");
        c0262u.f3068b = socket;
        String str2 = j1.b.f2607f + ' ' + str;
        X0.d.e(str2, "<set-?>");
        c0262u.f3069c = str2;
        c0262u.d = pVar;
        c0262u.f3070e = oVar;
        c0262u.f3071f = this;
        p1.o oVar2 = new p1.o(c0262u);
        this.f3247g = oVar2;
        H.j jVar = p1.o.f3443z;
        int i = 4;
        this.f3253o = (jVar.f227a & 16) != 0 ? ((int[]) jVar.f228b)[4] : Integer.MAX_VALUE;
        p1.x xVar = oVar2.f3463w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = p1.x.f3500f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(j1.b.g(">> CONNECTION " + p1.f.f3422a.b(), new Object[0]));
                }
                v1.o oVar3 = xVar.f3501a;
                v1.i iVar = p1.f.f3422a;
                oVar3.getClass();
                X0.d.e(iVar, "byteString");
                if (oVar3.f4089c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f4088b.q(iVar);
                oVar3.e();
                xVar.f3501a.flush();
            } finally {
            }
        }
        p1.x xVar2 = oVar2.f3463w;
        H.j jVar2 = oVar2.f3456p;
        synchronized (xVar2) {
            try {
                X0.d.e(jVar2, "settings");
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
                        v1.o oVar4 = xVar2.f3501a;
                        if (oVar4.f4089c) {
                            throw new IllegalStateException("closed");
                        }
                        v1.f fVar = oVar4.f4088b;
                        v1.q o2 = fVar.o(2);
                        int i4 = o2.f4095c;
                        byte[] bArr = o2.f4093a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        o2.f4095c = i4 + 2;
                        fVar.f4073b += 2;
                        oVar4.e();
                        xVar2.f3501a.g(((int[]) jVar2.f228b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3501a.flush();
            } finally {
            }
        }
        if (oVar2.f3456p.b() != 65535) {
            oVar2.f3463w.l(0, r2 - 65535);
        }
        dVar.e().c(new l1.b(oVar2.f3446c, oVar2.f3464x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        w wVar = this.f3243b;
        sb.append(wVar.f2535a.h.d);
        sb.append(':');
        sb.append(wVar.f2535a.h.f2455e);
        sb.append(", proxy=");
        sb.append(wVar.f2536b);
        sb.append(" hostAddress=");
        sb.append(wVar.f2537c);
        sb.append(" cipherSuite=");
        i1.j jVar = this.f3245e;
        if (jVar == null || (obj = jVar.f2442b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3246f);
        sb.append('}');
        return sb.toString();
    }
}
