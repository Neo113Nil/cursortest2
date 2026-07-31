package K2;

import B.Y;
import C0.q;
import G2.r;
import G2.s;
import G2.t;
import G2.u;
import G2.w;
import N2.C;
import N2.p;
import N2.y;
import T2.A;
import T2.C0231f;
import T2.C0234i;
import T2.H;
import T2.x;
import T2.z;
import h2.AbstractC0508a;
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
import n2.AbstractC0731k;

/* loaded from: classes.dex */
public final class j extends N2.i {

    /* renamed from: b, reason: collision with root package name */
    public final w f3307b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3308c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f3309d;

    /* renamed from: e, reason: collision with root package name */
    public G2.j f3310e;

    /* renamed from: f, reason: collision with root package name */
    public s f3311f;

    /* renamed from: g, reason: collision with root package name */
    public p f3312g;

    /* renamed from: h, reason: collision with root package name */
    public z f3313h;

    /* renamed from: i, reason: collision with root package name */
    public x f3314i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3315j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3316k;

    /* renamed from: l, reason: collision with root package name */
    public int f3317l;

    /* renamed from: m, reason: collision with root package name */
    public int f3318m;

    /* renamed from: n, reason: collision with root package name */
    public int f3319n;

    /* renamed from: o, reason: collision with root package name */
    public int f3320o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3321p;

    /* renamed from: q, reason: collision with root package name */
    public long f3322q;

    public j(k kVar, w wVar) {
        f2.j.f(kVar, "connectionPool");
        f2.j.f(wVar, "route");
        this.f3307b = wVar;
        this.f3320o = 1;
        this.f3321p = new ArrayList();
        this.f3322q = Long.MAX_VALUE;
    }

    public static void d(r rVar, w wVar, IOException iOException) {
        f2.j.f(rVar, "client");
        f2.j.f(wVar, "failedRoute");
        f2.j.f(iOException, "failure");
        if (wVar.f2312b.type() != Proxy.Type.DIRECT) {
            G2.a aVar = wVar.f2311a;
            aVar.f2132g.connectFailed(aVar.f2133h.g(), wVar.f2312b.address(), iOException);
        }
        Y y3 = rVar.f2249B;
        synchronized (y3) {
            ((LinkedHashSet) y3.f334d).add(wVar);
        }
    }

    @Override // N2.i
    public final synchronized void a(p pVar, C c2) {
        f2.j.f(pVar, "connection");
        f2.j.f(c2, "settings");
        this.f3320o = (c2.f3577a & 16) != 0 ? c2.f3578b[4] : Integer.MAX_VALUE;
    }

    @Override // N2.i
    public final void b(N2.x xVar) {
        xVar.c(8, null);
    }

    public final void c(int i3, int i4, int i5, boolean z3, g gVar) {
        w wVar;
        f2.j.f(gVar, "call");
        if (this.f3311f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3307b.f2311a.f2135j;
        E2.l lVar = new E2.l(list);
        G2.a aVar = this.f3307b.f2311a;
        if (aVar.f2128c == null) {
            if (!list.contains(G2.h.f2181f)) {
                throw new l(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3307b.f2311a.f2133h.f2218d;
            O2.n nVar = O2.n.f3910a;
            if (!O2.n.f3910a.h(str)) {
                throw new l(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.f2134i.contains(s.f2277i)) {
            throw new l(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        l lVar2 = null;
        do {
            try {
                w wVar2 = this.f3307b;
                if (wVar2.f2311a.f2128c != null && wVar2.f2312b.type() == Proxy.Type.HTTP) {
                    f(i3, i4, i5, gVar);
                    if (this.f3308c == null) {
                        wVar = this.f3307b;
                        if (wVar.f2311a.f2128c == null && wVar.f2312b.type() == Proxy.Type.HTTP && this.f3308c == null) {
                            throw new l(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3322q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i3, i4, gVar);
                }
                g(lVar, gVar);
                f2.j.f(this.f3307b.f2313c, "inetSocketAddress");
                wVar = this.f3307b;
                if (wVar.f2311a.f2128c == null) {
                }
                this.f3322q = System.nanoTime();
                return;
            } catch (IOException e3) {
                Socket socket = this.f3309d;
                if (socket != null) {
                    H2.b.d(socket);
                }
                Socket socket2 = this.f3308c;
                if (socket2 != null) {
                    H2.b.d(socket2);
                }
                this.f3309d = null;
                this.f3308c = null;
                this.f3313h = null;
                this.f3314i = null;
                this.f3310e = null;
                this.f3311f = null;
                this.f3312g = null;
                this.f3320o = 1;
                f2.j.f(this.f3307b.f2313c, "inetSocketAddress");
                if (lVar2 == null) {
                    lVar2 = new l(e3);
                } else {
                    R1.a.a(lVar2.f3327d, e3);
                    lVar2.f3328e = e3;
                }
                if (!z3) {
                    throw lVar2;
                }
                lVar.f1068c = true;
                if (!lVar.f1067b) {
                    throw lVar2;
                }
                if (e3 instanceof ProtocolException) {
                    throw lVar2;
                }
                if (e3 instanceof InterruptedIOException) {
                    throw lVar2;
                }
                if ((e3 instanceof SSLHandshakeException) && (e3.getCause() instanceof CertificateException)) {
                    throw lVar2;
                }
                if (e3 instanceof SSLPeerUnverifiedException) {
                    throw lVar2;
                }
            }
        } while (e3 instanceof SSLException);
        throw lVar2;
    }

    public final void e(int i3, int i4, g gVar) {
        Socket createSocket;
        w wVar = this.f3307b;
        Proxy proxy = wVar.f2312b;
        G2.a aVar = wVar.f2311a;
        Proxy.Type type = proxy.type();
        int i5 = type == null ? -1 : h.f3302a[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            createSocket = aVar.f2127b.createSocket();
            f2.j.c(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3308c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3307b.f2313c;
        f2.j.f(gVar, "call");
        f2.j.f(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i4);
        try {
            O2.n nVar = O2.n.f3910a;
            O2.n.f3910a.e(createSocket, this.f3307b.f2313c, i3);
            try {
                this.f3313h = AbstractC0508a.p(AbstractC0508a.W(createSocket));
                this.f3314i = new x(AbstractC0508a.V(createSocket));
            } catch (NullPointerException e3) {
                if (f2.j.a(e3.getMessage(), "throw with null exception")) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e4) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3307b.f2313c);
            connectException.initCause(e4);
            throw connectException;
        }
    }

    public final void f(int i3, int i4, int i5, g gVar) {
        G1.g gVar2 = new G1.g(2);
        w wVar = this.f3307b;
        G2.n nVar = wVar.f2311a.f2133h;
        f2.j.f(nVar, "url");
        gVar2.f2093e = nVar;
        gVar2.k("CONNECT", null);
        G2.a aVar = wVar.f2311a;
        gVar2.j("Host", H2.b.v(aVar.f2133h, true));
        gVar2.j("Proxy-Connection", "Keep-Alive");
        gVar2.j("User-Agent", "okhttp/4.12.0");
        q b3 = gVar2.b();
        G2.k kVar = new G2.k(0);
        l0.c.l("Proxy-Authenticate");
        l0.c.o("OkHttp-Preemptive", "Proxy-Authenticate");
        kVar.j("Proxy-Authenticate");
        kVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        kVar.b();
        aVar.f2131f.getClass();
        e(i3, i4, gVar);
        String str = "CONNECT " + H2.b.v((G2.n) b3.f630c, true) + " HTTP/1.1";
        z zVar = this.f3313h;
        f2.j.c(zVar);
        x xVar = this.f3314i;
        f2.j.c(xVar);
        n nVar2 = new n(null, this, zVar, xVar);
        H c2 = zVar.f4453d.c();
        long j3 = i4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2.g(j3, timeUnit);
        xVar.f4449d.c().g(i5, timeUnit);
        nVar2.k((G2.l) b3.f632e, str);
        nVar2.d();
        t f3 = nVar2.f(false);
        f2.j.c(f3);
        f3.f2281a = b3;
        u a3 = f3.a();
        long j4 = H2.b.j(a3);
        if (j4 != -1) {
            M2.e j5 = nVar2.j(j4);
            H2.b.t(j5, Integer.MAX_VALUE, timeUnit);
            j5.close();
        }
        int i6 = a3.f2297g;
        if (i6 != 200) {
            if (i6 != 407) {
                throw new IOException(A.k.h("Unexpected response code for CONNECT: ", i6));
            }
            aVar.f2131f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!zVar.f4454e.a() || !xVar.f4450e.a()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(E2.l lVar, g gVar) {
        SSLSocket sSLSocket;
        int i3 = 0;
        G2.a aVar = this.f3307b.f2311a;
        SSLSocketFactory sSLSocketFactory = aVar.f2128c;
        s sVar = s.f2274f;
        if (sSLSocketFactory == null) {
            List list = aVar.f2134i;
            s sVar2 = s.f2277i;
            if (!list.contains(sVar2)) {
                this.f3309d = this.f3308c;
                this.f3311f = sVar;
                return;
            } else {
                this.f3309d = this.f3308c;
                this.f3311f = sVar2;
                l();
                return;
            }
        }
        f2.j.f(gVar, "call");
        G2.a aVar2 = this.f3307b.f2311a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f2128c;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            f2.j.c(sSLSocketFactory2);
            Socket socket = this.f3308c;
            G2.n nVar = aVar2.f2133h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, nVar.f2218d, nVar.f2219e, true);
            f2.j.d(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            G2.h b3 = lVar.b(sSLSocket);
            if (b3.f2183b) {
                O2.n nVar2 = O2.n.f3910a;
                O2.n.f3910a.d(sSLSocket, aVar2.f2133h.f2218d, aVar2.f2134i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            f2.j.e(session, "sslSocketSession");
            G2.j B3 = AbstractC0508a.B(session);
            HostnameVerifier hostnameVerifier = aVar2.f2129d;
            f2.j.c(hostnameVerifier);
            if (!hostnameVerifier.verify(aVar2.f2133h.f2218d, session)) {
                List a3 = B3.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f2133h.f2218d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                f2.j.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.f2133h.f2218d);
                sb.append(" not verified:\n              |    certificate: ");
                G2.d dVar = G2.d.f2153c;
                sb.append(O2.l.r0(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(S1.l.U0(S2.c.a(x509Certificate, 7), S2.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC0731k.q(sb.toString()));
            }
            G2.d dVar2 = aVar2.f2130e;
            f2.j.c(dVar2);
            this.f3310e = new G2.j(B3.f2199a, B3.f2200b, B3.f2201c, new i(dVar2, B3, aVar2, i3));
            f2.j.f(aVar2.f2133h.f2218d, "hostname");
            Iterator it = dVar2.f2154a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (b3.f2183b) {
                O2.n nVar3 = O2.n.f3910a;
                str = O2.n.f3910a.f(sSLSocket);
            }
            this.f3309d = sSLSocket;
            this.f3313h = AbstractC0508a.p(AbstractC0508a.W(sSLSocket));
            this.f3314i = new x(AbstractC0508a.V(sSLSocket));
            if (str != null) {
                sVar = O2.l.d0(str);
            }
            this.f3311f = sVar;
            O2.n nVar4 = O2.n.f3910a;
            O2.n.f3910a.a(sSLSocket);
            if (this.f3311f == s.f2276h) {
                l();
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                O2.n nVar5 = O2.n.f3910a;
                O2.n.f3910a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                H2.b.d(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (S2.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(G2.a aVar, ArrayList arrayList) {
        G2.j jVar;
        byte[] bArr = H2.b.f2632a;
        if (this.f3321p.size() < this.f3320o && !this.f3315j) {
            w wVar = this.f3307b;
            if (!wVar.f2311a.a(aVar)) {
                return false;
            }
            G2.n nVar = aVar.f2133h;
            String str = nVar.f2218d;
            G2.a aVar2 = wVar.f2311a;
            if (f2.j.a(str, aVar2.f2133h.f2218d)) {
                return true;
            }
            if (this.f3312g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w wVar2 = (w) it.next();
                    Proxy.Type type = wVar2.f2312b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && wVar.f2312b.type() == type2) {
                        if (f2.j.a(wVar.f2313c, wVar2.f2313c)) {
                            if (aVar.f2129d != S2.c.f4332a) {
                                return false;
                            }
                            byte[] bArr2 = H2.b.f2632a;
                            G2.n nVar2 = aVar2.f2133h;
                            if (nVar.f2219e == nVar2.f2219e) {
                                String str2 = nVar2.f2218d;
                                String str3 = nVar.f2218d;
                                if (!f2.j.a(str3, str2)) {
                                    if (!this.f3316k && (jVar = this.f3310e) != null) {
                                        List a3 = jVar.a();
                                        if (!a3.isEmpty()) {
                                            Object obj = a3.get(0);
                                            f2.j.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    G2.d dVar = aVar.f2130e;
                                    f2.j.c(dVar);
                                    G2.j jVar2 = this.f3310e;
                                    f2.j.c(jVar2);
                                    List a4 = jVar2.a();
                                    f2.j.f(str3, "hostname");
                                    f2.j.f(a4, "peerCertificates");
                                    Iterator it2 = dVar.f2154a.iterator();
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

    public final boolean i(boolean z3) {
        long j3;
        byte[] bArr = H2.b.f2632a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3308c;
        f2.j.c(socket);
        Socket socket2 = this.f3309d;
        f2.j.c(socket2);
        z zVar = this.f3313h;
        f2.j.c(zVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p pVar = this.f3312g;
        if (pVar != null) {
            synchronized (pVar) {
                if (pVar.f3645i) {
                    return false;
                }
                if (pVar.f3653q < pVar.f3652p) {
                    if (nanoTime >= pVar.f3654r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j3 = nanoTime - this.f3322q;
        }
        if (j3 < 10000000000L || !z3) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z4 = !zVar.a();
                socket2.setSoTimeout(soTimeout);
                return z4;
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

    public final L2.e j(r rVar, L2.g gVar) {
        f2.j.f(rVar, "client");
        Socket socket = this.f3309d;
        f2.j.c(socket);
        z zVar = this.f3313h;
        f2.j.c(zVar);
        x xVar = this.f3314i;
        f2.j.c(xVar);
        p pVar = this.f3312g;
        if (pVar != null) {
            return new N2.q(rVar, this, gVar, pVar);
        }
        int i3 = gVar.f3418g;
        socket.setSoTimeout(i3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVar.f4453d.c().g(i3, timeUnit);
        xVar.f4449d.c().g(gVar.f3419h, timeUnit);
        return new n(rVar, this, zVar, xVar);
    }

    public final synchronized void k() {
        this.f3315j = true;
    }

    public final void l() {
        Socket socket = this.f3309d;
        f2.j.c(socket);
        z zVar = this.f3313h;
        f2.j.c(zVar);
        x xVar = this.f3314i;
        f2.j.c(xVar);
        socket.setSoTimeout(0);
        J2.e eVar = J2.e.f3199h;
        N2.g gVar = new N2.g(eVar);
        String str = this.f3307b.f2311a.f2133h.f2218d;
        f2.j.f(str, "peerName");
        gVar.f3612b = socket;
        String str2 = H2.b.f2638g + ' ' + str;
        f2.j.f(str2, "<set-?>");
        gVar.f3613c = str2;
        gVar.f3614d = zVar;
        gVar.f3615e = xVar;
        gVar.f3616f = this;
        p pVar = new p(gVar);
        this.f3312g = pVar;
        C c2 = p.C;
        int i3 = 4;
        this.f3320o = (c2.f3577a & 16) != 0 ? c2.f3578b[4] : Integer.MAX_VALUE;
        y yVar = pVar.f3662z;
        synchronized (yVar) {
            try {
                if (yVar.f3710g) {
                    throw new IOException("closed");
                }
                Logger logger = y.f3706i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(H2.b.h(">> CONNECTION " + N2.f.f3607a.c(), new Object[0]));
                }
                x xVar2 = yVar.f3707d;
                C0234i c0234i = N2.f.f3607a;
                xVar2.getClass();
                f2.j.f(c0234i, "byteString");
                if (xVar2.f4451f) {
                    throw new IllegalStateException("closed");
                }
                xVar2.f4450e.y(c0234i);
                xVar2.a();
                yVar.f3707d.flush();
            } finally {
            }
        }
        y yVar2 = pVar.f3662z;
        C c3 = pVar.f3655s;
        synchronized (yVar2) {
            try {
                f2.j.f(c3, "settings");
                if (yVar2.f3710g) {
                    throw new IOException("closed");
                }
                yVar2.d(0, Integer.bitCount(c3.f3577a) * 6, 4, 0);
                int i4 = 0;
                while (i4 < 10) {
                    boolean z3 = true;
                    if (((1 << i4) & c3.f3577a) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        int i5 = i4 != i3 ? i4 != 7 ? i4 : i3 : 3;
                        x xVar3 = yVar2.f3707d;
                        if (xVar3.f4451f) {
                            throw new IllegalStateException("closed");
                        }
                        C0231f c0231f = xVar3.f4450e;
                        A x3 = c0231f.x(2);
                        int i6 = x3.f4374c;
                        byte[] bArr = x3.f4372a;
                        bArr[i6] = (byte) ((i5 >>> 8) & 255);
                        bArr[i6 + 1] = (byte) (i5 & 255);
                        x3.f4374c = i6 + 2;
                        c0231f.f4409e += 2;
                        xVar3.a();
                        yVar2.f3707d.d(c3.f3578b[i4]);
                    }
                    i4++;
                    i3 = 4;
                }
                yVar2.f3707d.flush();
            } finally {
            }
        }
        if (pVar.f3655s.a() != 65535) {
            pVar.f3662z.n(r2 - 65535, 0);
        }
        eVar.e().c(new J2.b(pVar.f3642f, pVar.f3638A, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        w wVar = this.f3307b;
        sb.append(wVar.f2311a.f2133h.f2218d);
        sb.append(':');
        sb.append(wVar.f2311a.f2133h.f2219e);
        sb.append(", proxy=");
        sb.append(wVar.f2312b);
        sb.append(" hostAddress=");
        sb.append(wVar.f2313c);
        sb.append(" cipherSuite=");
        G2.j jVar = this.f3310e;
        if (jVar == null || (obj = jVar.f2200b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3311f);
        sb.append('}');
        return sb.toString();
    }
}
