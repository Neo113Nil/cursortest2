package E2;

import A2.A;
import A2.C0002a;
import A2.q;
import A2.u;
import A2.v;
import A2.w;
import A2.y;
import H2.AbstractC0080b;
import H2.C;
import H2.p;
import M1.B;
import N2.C0150f;
import N2.C0153i;
import N2.H;
import N2.x;
import N2.z;
import a.AbstractC0157a;
import h2.AbstractC0448j;
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

/* loaded from: classes.dex */
public final class k extends H2.j {

    /* renamed from: b, reason: collision with root package name */
    public final A f821b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f822c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f823d;

    /* renamed from: e, reason: collision with root package name */
    public A2.m f824e;

    /* renamed from: f, reason: collision with root package name */
    public v f825f;

    /* renamed from: g, reason: collision with root package name */
    public p f826g;

    /* renamed from: h, reason: collision with root package name */
    public z f827h;

    /* renamed from: i, reason: collision with root package name */
    public x f828i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f829j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f830k;

    /* renamed from: l, reason: collision with root package name */
    public int f831l;

    /* renamed from: m, reason: collision with root package name */
    public int f832m;

    /* renamed from: n, reason: collision with root package name */
    public int f833n;

    /* renamed from: o, reason: collision with root package name */
    public int f834o;
    public final ArrayList p;

    /* renamed from: q, reason: collision with root package name */
    public long f835q;

    public k(l lVar, A a3) {
        Z1.i.f(lVar, "connectionPool");
        Z1.i.f(a3, "route");
        this.f821b = a3;
        this.f834o = 1;
        this.p = new ArrayList();
        this.f835q = Long.MAX_VALUE;
    }

    public static void d(u uVar, A a3, IOException iOException) {
        Z1.i.f(uVar, "client");
        Z1.i.f(a3, "failedRoute");
        Z1.i.f(iOException, "failure");
        if (a3.f24b.type() != Proxy.Type.DIRECT) {
            C0002a c0002a = a3.f23a;
            c0002a.f39g.connectFailed(c0002a.f40h.g(), a3.f24b.address(), iOException);
        }
        A2.g gVar = uVar.B;
        synchronized (gVar) {
            ((LinkedHashSet) gVar.f83b).add(a3);
        }
    }

    @Override // H2.j
    public final synchronized void a(p pVar, C c3) {
        Z1.i.f(pVar, "connection");
        Z1.i.f(c3, "settings");
        this.f834o = (c3.f1925a & 16) != 0 ? c3.f1926b[4] : Integer.MAX_VALUE;
    }

    @Override // H2.j
    public final void b(H2.x xVar) {
        xVar.c(8, null);
    }

    public final void c(int i3, int i4, int i5, boolean z3, h hVar) {
        A a3;
        Z1.i.f(hVar, "call");
        if (this.f825f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f821b.f23a.f42j;
        b bVar = new b(list);
        C0002a c0002a = this.f821b.f23a;
        if (c0002a.f35c == null) {
            if (!list.contains(A2.i.f89f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f821b.f23a.f40h.f132d;
            I2.n nVar = I2.n.f2519a;
            if (!I2.n.f2519a.h(str)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (c0002a.f41i.contains(v.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                A a4 = this.f821b;
                if (a4.f23a.f35c != null && a4.f24b.type() == Proxy.Type.HTTP) {
                    f(i3, i4, i5, hVar);
                    if (this.f822c == null) {
                        a3 = this.f821b;
                        if (a3.f23a.f35c == null && a3.f24b.type() == Proxy.Type.HTTP && this.f822c == null) {
                            throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f835q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i3, i4, hVar);
                }
                g(bVar, hVar);
                Z1.i.f(this.f821b.f25c, "inetSocketAddress");
                a3 = this.f821b;
                if (a3.f23a.f35c == null) {
                }
                this.f835q = System.nanoTime();
                return;
            } catch (IOException e3) {
                Socket socket = this.f823d;
                if (socket != null) {
                    B2.c.d(socket);
                }
                Socket socket2 = this.f822c;
                if (socket2 != null) {
                    B2.c.d(socket2);
                }
                this.f823d = null;
                this.f822c = null;
                this.f827h = null;
                this.f828i = null;
                this.f824e = null;
                this.f825f = null;
                this.f826g = null;
                this.f834o = 1;
                Z1.i.f(this.f821b.f25c, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new m(e3);
                } else {
                    B.o(mVar.f840d, e3);
                    mVar.f841e = e3;
                }
                if (!z3) {
                    throw mVar;
                }
                bVar.f775b = true;
                if (!bVar.f774a) {
                    throw mVar;
                }
                if (e3 instanceof ProtocolException) {
                    throw mVar;
                }
                if (e3 instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e3 instanceof SSLHandshakeException) && (e3.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e3 instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e3 instanceof SSLException);
        throw mVar;
    }

    public final void e(int i3, int i4, h hVar) {
        Socket createSocket;
        A a3 = this.f821b;
        Proxy proxy = a3.f24b;
        C0002a c0002a = a3.f23a;
        Proxy.Type type = proxy.type();
        int i5 = type == null ? -1 : i.f816a[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            createSocket = c0002a.f34b.createSocket();
            Z1.i.c(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f822c = createSocket;
        InetSocketAddress inetSocketAddress = this.f821b.f25c;
        Z1.i.f(hVar, "call");
        Z1.i.f(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i4);
        try {
            I2.n nVar = I2.n.f2519a;
            I2.n.f2519a.e(createSocket, this.f821b.f25c, i3);
            try {
                this.f827h = AbstractC0157a.j(AbstractC0157a.W(createSocket));
                this.f828i = new x(AbstractC0157a.V(createSocket));
            } catch (NullPointerException e3) {
                if (Z1.i.a(e3.getMessage(), "throw with null exception")) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e4) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f821b.f25c);
            connectException.initCause(e4);
            throw connectException;
        }
    }

    public final void f(int i3, int i4, int i5, h hVar) {
        A2.k kVar = new A2.k(1);
        A a3 = this.f821b;
        q qVar = a3.f23a.f40h;
        Z1.i.f(qVar, "url");
        kVar.f108b = qVar;
        kVar.k("CONNECT", null);
        C0002a c0002a = a3.f23a;
        kVar.j("Host", B2.c.v(c0002a.f40h, true));
        kVar.j("Proxy-Connection", "Keep-Alive");
        kVar.j("User-Agent", "okhttp/4.12.0");
        w f3 = kVar.f();
        A2.n nVar = new A2.n(0);
        I2.d.p("Proxy-Authenticate");
        I2.d.t("OkHttp-Preemptive", "Proxy-Authenticate");
        nVar.k("Proxy-Authenticate");
        nVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        nVar.b();
        c0002a.f38f.getClass();
        e(i3, i4, hVar);
        String str = "CONNECT " + B2.c.v((q) f3.f193b, true) + " HTTP/1.1";
        z zVar = this.f827h;
        Z1.i.c(zVar);
        x xVar = this.f828i;
        Z1.i.c(xVar);
        o oVar = new o(null, this, zVar, xVar);
        H c3 = zVar.f2973d.c();
        long j3 = i4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3.g(j3, timeUnit);
        xVar.f2969d.c().g(i5, timeUnit);
        oVar.k((A2.o) f3.f195d, str);
        oVar.b();
        A2.x f4 = oVar.f(false);
        Z1.i.c(f4);
        f4.f198a = f3;
        y a4 = f4.a();
        long j4 = B2.c.j(a4);
        if (j4 != -1) {
            G2.e j5 = oVar.j(j4);
            B2.c.t(j5, Integer.MAX_VALUE, timeUnit);
            j5.close();
        }
        int i6 = a4.f214g;
        if (i6 != 200) {
            if (i6 != 407) {
                throw new IOException(AbstractC0080b.h("Unexpected response code for CONNECT: ", i6));
            }
            c0002a.f38f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!zVar.f2974e.a() || !xVar.f2970e.a()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, h hVar) {
        SSLSocket sSLSocket;
        int i3 = 0;
        C0002a c0002a = this.f821b.f23a;
        SSLSocketFactory sSLSocketFactory = c0002a.f35c;
        v vVar = v.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0002a.f41i;
            v vVar2 = v.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(vVar2)) {
                this.f823d = this.f822c;
                this.f825f = vVar;
                return;
            } else {
                this.f823d = this.f822c;
                this.f825f = vVar2;
                l();
                return;
            }
        }
        Z1.i.f(hVar, "call");
        C0002a c0002a2 = this.f821b.f23a;
        SSLSocketFactory sSLSocketFactory2 = c0002a2.f35c;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            Z1.i.c(sSLSocketFactory2);
            Socket socket = this.f822c;
            q qVar = c0002a2.f40h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, qVar.f132d, qVar.f133e, true);
            Z1.i.d(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            A2.i b2 = bVar.b(sSLSocket);
            if (b2.f91b) {
                I2.n nVar = I2.n.f2519a;
                I2.n.f2519a.d(sSLSocket, c0002a2.f40h.f132d, c0002a2.f41i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Z1.i.e(session, "sslSocketSession");
            A2.m B = B.B(session);
            HostnameVerifier hostnameVerifier = c0002a2.f36d;
            Z1.i.c(hostnameVerifier);
            if (!hostnameVerifier.verify(c0002a2.f40h.f132d, session)) {
                List a3 = B.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0002a2.f40h.f132d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                Z1.i.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0002a2.f40h.f132d);
                sb.append(" not verified:\n              |    certificate: ");
                A2.d dVar = A2.d.f60c;
                sb.append(I2.l.L(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(M1.l.w0(M2.c.a(x509Certificate, 7), M2.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC0448j.b0(sb.toString()));
            }
            A2.d dVar2 = c0002a2.f37e;
            Z1.i.c(dVar2);
            this.f824e = new A2.m(B.f114a, B.f115b, B.f116c, new j(dVar2, B, c0002a2, i3));
            Z1.i.f(c0002a2.f40h.f132d, "hostname");
            Iterator it = dVar2.f61a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (b2.f91b) {
                I2.n nVar2 = I2.n.f2519a;
                str = I2.n.f2519a.f(sSLSocket);
            }
            this.f823d = sSLSocket;
            this.f827h = AbstractC0157a.j(AbstractC0157a.W(sSLSocket));
            this.f828i = new x(AbstractC0157a.V(sSLSocket));
            if (str != null) {
                vVar = AbstractC0157a.C(str);
            }
            this.f825f = vVar;
            I2.n nVar3 = I2.n.f2519a;
            I2.n.f2519a.a(sSLSocket);
            if (this.f825f == v.HTTP_2) {
                l();
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                I2.n nVar4 = I2.n.f2519a;
                I2.n.f2519a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                B2.c.d(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (M2.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(C0002a c0002a, ArrayList arrayList) {
        A2.m mVar;
        byte[] bArr = B2.c.f415a;
        if (this.p.size() < this.f834o && !this.f829j) {
            A a3 = this.f821b;
            if (!a3.f23a.a(c0002a)) {
                return false;
            }
            q qVar = c0002a.f40h;
            String str = qVar.f132d;
            C0002a c0002a2 = a3.f23a;
            if (Z1.i.a(str, c0002a2.f40h.f132d)) {
                return true;
            }
            if (this.f826g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    A a4 = (A) it.next();
                    Proxy.Type type = a4.f24b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && a3.f24b.type() == type2) {
                        if (Z1.i.a(a3.f25c, a4.f25c)) {
                            if (c0002a.f36d != M2.c.f2815a) {
                                return false;
                            }
                            byte[] bArr2 = B2.c.f415a;
                            q qVar2 = c0002a2.f40h;
                            if (qVar.f133e == qVar2.f133e) {
                                String str2 = qVar2.f132d;
                                String str3 = qVar.f132d;
                                if (!Z1.i.a(str3, str2)) {
                                    if (!this.f830k && (mVar = this.f824e) != null) {
                                        List a5 = mVar.a();
                                        if (!a5.isEmpty()) {
                                            Object obj = a5.get(0);
                                            Z1.i.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    A2.d dVar = c0002a.f37e;
                                    Z1.i.c(dVar);
                                    A2.m mVar2 = this.f824e;
                                    Z1.i.c(mVar2);
                                    List a6 = mVar2.a();
                                    Z1.i.f(str3, "hostname");
                                    Z1.i.f(a6, "peerCertificates");
                                    Iterator it2 = dVar.f61a.iterator();
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
        byte[] bArr = B2.c.f415a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f822c;
        Z1.i.c(socket);
        Socket socket2 = this.f823d;
        Z1.i.c(socket2);
        z zVar = this.f827h;
        Z1.i.c(zVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p pVar = this.f826g;
        if (pVar != null) {
            synchronized (pVar) {
                if (pVar.f1989i) {
                    return false;
                }
                if (pVar.f1996q < pVar.p) {
                    if (nanoTime >= pVar.f1997r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j3 = nanoTime - this.f835q;
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

    public final F2.e j(u uVar, F2.g gVar) {
        Z1.i.f(uVar, "client");
        Socket socket = this.f823d;
        Z1.i.c(socket);
        z zVar = this.f827h;
        Z1.i.c(zVar);
        x xVar = this.f828i;
        Z1.i.c(xVar);
        p pVar = this.f826g;
        if (pVar != null) {
            return new H2.q(uVar, this, gVar, pVar);
        }
        int i3 = gVar.f1498g;
        socket.setSoTimeout(i3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVar.f2973d.c().g(i3, timeUnit);
        xVar.f2969d.c().g(gVar.f1499h, timeUnit);
        return new o(uVar, this, zVar, xVar);
    }

    public final synchronized void k() {
        this.f829j = true;
    }

    public final void l() {
        Socket socket = this.f823d;
        Z1.i.c(socket);
        z zVar = this.f827h;
        Z1.i.c(zVar);
        x xVar = this.f828i;
        Z1.i.c(xVar);
        socket.setSoTimeout(0);
        D2.e eVar = D2.e.f600h;
        H2.h hVar = new H2.h(eVar);
        String str = this.f821b.f23a.f40h.f132d;
        Z1.i.f(str, "peerName");
        hVar.f1960b = socket;
        String str2 = B2.c.f421g + ' ' + str;
        Z1.i.f(str2, "<set-?>");
        hVar.f1961c = str2;
        hVar.f1962d = zVar;
        hVar.f1963e = xVar;
        hVar.f1964f = this;
        p pVar = new p(hVar);
        this.f826g = pVar;
        C c3 = p.C;
        int i3 = 4;
        this.f834o = (c3.f1925a & 16) != 0 ? c3.f1926b[4] : Integer.MAX_VALUE;
        H2.y yVar = pVar.f2005z;
        synchronized (yVar) {
            try {
                if (yVar.f2053g) {
                    throw new IOException("closed");
                }
                Logger logger = H2.y.f2049i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(B2.c.h(">> CONNECTION " + H2.g.f1955a.c(), new Object[0]));
                }
                x xVar2 = yVar.f2050d;
                C0153i c0153i = H2.g.f1955a;
                xVar2.getClass();
                Z1.i.f(c0153i, "byteString");
                if (xVar2.f2971f) {
                    throw new IllegalStateException("closed");
                }
                xVar2.f2970e.L(c0153i);
                xVar2.a();
                yVar.f2050d.flush();
            } finally {
            }
        }
        H2.y yVar2 = pVar.f2005z;
        C c4 = pVar.f1998s;
        synchronized (yVar2) {
            try {
                Z1.i.f(c4, "settings");
                if (yVar2.f2053g) {
                    throw new IOException("closed");
                }
                yVar2.e(0, Integer.bitCount(c4.f1925a) * 6, 4, 0);
                int i4 = 0;
                while (i4 < 10) {
                    boolean z3 = true;
                    if (((1 << i4) & c4.f1925a) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        int i5 = i4 != i3 ? i4 != 7 ? i4 : i3 : 3;
                        x xVar3 = yVar2.f2050d;
                        if (xVar3.f2971f) {
                            throw new IllegalStateException("closed");
                        }
                        C0150f c0150f = xVar3.f2970e;
                        N2.A D = c0150f.D(2);
                        int i6 = D.f2894c;
                        byte[] bArr = D.f2892a;
                        bArr[i6] = (byte) ((i5 >>> 8) & 255);
                        bArr[i6 + 1] = (byte) (i5 & 255);
                        D.f2894c = i6 + 2;
                        c0150f.f2929e += 2;
                        xVar3.a();
                        yVar2.f2050d.e(c4.f1926b[i4]);
                    }
                    i4++;
                    i3 = 4;
                }
                yVar2.f2050d.flush();
            } finally {
            }
        }
        if (pVar.f1998s.a() != 65535) {
            pVar.f2005z.m(r2 - 65535, 0);
        }
        eVar.e().c(new D2.b(pVar.f1986f, pVar.f1983A, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        A a3 = this.f821b;
        sb.append(a3.f23a.f40h.f132d);
        sb.append(':');
        sb.append(a3.f23a.f40h.f133e);
        sb.append(", proxy=");
        sb.append(a3.f24b);
        sb.append(" hostAddress=");
        sb.append(a3.f25c);
        sb.append(" cipherSuite=");
        A2.m mVar = this.f824e;
        if (mVar == null || (obj = mVar.f115b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f825f);
        sb.append('}');
        return sb.toString();
    }
}
