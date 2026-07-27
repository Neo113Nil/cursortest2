package q3;

import A.AbstractC0017m;
import A0.q;
import G.W0;
import a.AbstractC0345a;
import f1.C0607a;
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
import kotlin.jvm.internal.Intrinsics;
import m.C0842o;
import m3.C0862a;
import m3.m;
import m3.r;
import m3.s;
import m3.t;
import m3.v;
import m3.w;
import m3.y;
import t3.B;
import t3.EnumC1211b;
import t3.p;
import u3.n;
import y2.C1331f;
import z2.C1403G;
import z3.A;
import z3.C1445c;
import z3.C1448f;
import z3.C1451i;
import z3.x;
import z3.z;

/* loaded from: classes.dex */
public final class i extends t3.i {

    /* renamed from: b, reason: collision with root package name */
    public final y f9404b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f9405c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f9406d;

    /* renamed from: e, reason: collision with root package name */
    public m3.k f9407e;

    /* renamed from: f, reason: collision with root package name */
    public t f9408f;

    /* renamed from: g, reason: collision with root package name */
    public p f9409g;

    /* renamed from: h, reason: collision with root package name */
    public z f9410h;

    /* renamed from: i, reason: collision with root package name */
    public x f9411i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9412j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9413k;

    /* renamed from: l, reason: collision with root package name */
    public int f9414l;

    /* renamed from: m, reason: collision with root package name */
    public int f9415m;

    /* renamed from: n, reason: collision with root package name */
    public int f9416n;

    /* renamed from: o, reason: collision with root package name */
    public int f9417o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f9418p;

    /* renamed from: q, reason: collision with root package name */
    public long f9419q;

    public i(j connectionPool, y route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f9404b = route;
        this.f9417o = 1;
        this.f9418p = new ArrayList();
        this.f9419q = Long.MAX_VALUE;
    }

    public static void d(r client, y failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f8491b.type() != Proxy.Type.DIRECT) {
            C0862a c0862a = failedRoute.f8490a;
            c0862a.f8319g.connectFailed(c0862a.f8320h.g(), failedRoute.f8491b.address(), failure);
        }
        C0607a c0607a = client.f8431E;
        synchronized (c0607a) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) c0607a.f6561e).add(failedRoute);
        }
    }

    @Override // t3.i
    public final synchronized void a(p connection, B settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f9417o = (settings.f10745a & 16) != 0 ? settings.f10746b[4] : Integer.MAX_VALUE;
    }

    @Override // t3.i
    public final void b(t3.x stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(EnumC1211b.REFUSED_STREAM, null);
    }

    public final void c(int i2, int i4, int i5, boolean z4, g call) {
        y yVar;
        m3.j eventListener = m3.j.f8386d;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f9408f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f9404b.f8490a.f8322j;
        k3.p pVar = new k3.p(list);
        C0862a c0862a = this.f9404b.f8490a;
        if (c0862a.f8315c == null) {
            if (!list.contains(m3.h.f8366f)) {
                throw new k(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f9404b.f8490a.f8320h.f8396d;
            n nVar = n.f10964a;
            if (!n.f10964a.h(str)) {
                throw new k(new UnknownServiceException(AbstractC0017m.j("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0862a.f8321i.contains(t.H2_PRIOR_KNOWLEDGE)) {
            throw new k(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        k kVar = null;
        do {
            try {
                y yVar2 = this.f9404b;
                if (yVar2.f8490a.f8315c != null && yVar2.f8491b.type() == Proxy.Type.HTTP) {
                    f(i2, i4, i5, call);
                    if (this.f9405c == null) {
                        yVar = this.f9404b;
                        if (yVar.f8490a.f8315c == null && yVar.f8491b.type() == Proxy.Type.HTTP && this.f9405c == null) {
                            throw new k(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f9419q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i2, i4, call);
                }
                g(pVar, call);
                y yVar3 = this.f9404b;
                InetSocketAddress inetSocketAddress = yVar3.f8492c;
                Proxy proxy = yVar3.f8491b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                yVar = this.f9404b;
                if (yVar.f8490a.f8315c == null) {
                }
                this.f9419q = System.nanoTime();
                return;
            } catch (IOException e4) {
                Socket socket = this.f9406d;
                if (socket != null) {
                    n3.b.d(socket);
                }
                Socket socket2 = this.f9405c;
                if (socket2 != null) {
                    n3.b.d(socket2);
                }
                this.f9406d = null;
                this.f9405c = null;
                this.f9410h = null;
                this.f9411i = null;
                this.f9407e = null;
                this.f9408f = null;
                this.f9409g = null;
                this.f9417o = 1;
                y yVar4 = this.f9404b;
                InetSocketAddress inetSocketAddress2 = yVar4.f8492c;
                Proxy proxy2 = yVar4.f8491b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress2, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy2, "proxy");
                Intrinsics.checkNotNullParameter(e4, "ioe");
                if (kVar == null) {
                    kVar = new k(e4);
                } else {
                    Intrinsics.checkNotNullParameter(e4, "e");
                    C1331f.a(kVar.f9424d, e4);
                    kVar.f9425e = e4;
                }
                if (!z4) {
                    throw kVar;
                }
                Intrinsics.checkNotNullParameter(e4, "e");
                pVar.f7466c = true;
                if (!pVar.f7465b) {
                    throw kVar;
                }
                if (e4 instanceof ProtocolException) {
                    throw kVar;
                }
                if (e4 instanceof InterruptedIOException) {
                    throw kVar;
                }
                if ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) {
                    throw kVar;
                }
                if (e4 instanceof SSLPeerUnverifiedException) {
                    throw kVar;
                }
            }
        } while (e4 instanceof SSLException);
        throw kVar;
    }

    public final void e(int i2, int i4, g call) {
        Socket createSocket;
        y yVar = this.f9404b;
        Proxy proxy = yVar.f8491b;
        C0862a c0862a = yVar.f8490a;
        Proxy.Type type = proxy.type();
        int i5 = type == null ? -1 : h.f9403a[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            createSocket = c0862a.f8314b.createSocket();
            Intrinsics.c(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f9405c = createSocket;
        InetSocketAddress inetSocketAddress = this.f9404b.f8492c;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        createSocket.setSoTimeout(i4);
        try {
            n nVar = n.f10964a;
            n.f10964a.e(createSocket, this.f9404b.f8492c, i2);
            try {
                this.f9410h = m3.z.h(m3.z.t(createSocket));
                C1445c s4 = m3.z.s(createSocket);
                Intrinsics.checkNotNullParameter(s4, "<this>");
                this.f9411i = new x(s4);
            } catch (NullPointerException e4) {
                if (Intrinsics.a(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f9404b.f8492c);
            connectException.initCause(e5);
            throw connectException;
        }
    }

    public final void f(int i2, int i4, int i5, g gVar) {
        Y0.b bVar = new Y0.b(9);
        y yVar = this.f9404b;
        m url = yVar.f8490a.f8320h;
        Intrinsics.checkNotNullParameter(url, "url");
        bVar.f4391j = url;
        bVar.v("CONNECT", null);
        C0862a c0862a = yVar.f8490a;
        bVar.t("Host", n3.b.v(c0862a.f8320h, true));
        bVar.t("Proxy-Connection", "Keep-Alive");
        bVar.t("User-Agent", "okhttp/4.12.0");
        q request = bVar.d();
        W0 w02 = new W0(4);
        Intrinsics.checkNotNullParameter(request, "request");
        t protocol = t.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
        m3.x xVar = n3.b.f8560c;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        u3.l.R("Proxy-Authenticate");
        u3.l.T("OkHttp-Preemptive", "Proxy-Authenticate");
        w02.m("Proxy-Authenticate");
        w02.a("Proxy-Authenticate", "OkHttp-Preemptive");
        w response = new w(request, protocol, "Preemptive Authenticate", 407, null, w02.b(), xVar, null, null, null, -1L, -1L, null);
        c0862a.f8318f.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        e(i2, i4, gVar);
        String str = "CONNECT " + n3.b.v((m) request.f362c, true) + " HTTP/1.1";
        z zVar = this.f9410h;
        Intrinsics.c(zVar);
        x xVar2 = this.f9411i;
        Intrinsics.c(xVar2);
        l lVar = new l(null, this, zVar, xVar2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVar.f12044d.c().g(i4, timeUnit);
        xVar2.f12040d.c().g(i5, timeUnit);
        lVar.l((m3.l) request.f364e, str);
        lVar.d();
        v g4 = lVar.g(false);
        Intrinsics.c(g4);
        Intrinsics.checkNotNullParameter(request, "request");
        g4.f8460a = request;
        w response2 = g4.a();
        Intrinsics.checkNotNullParameter(response2, "response");
        long j4 = n3.b.j(response2);
        if (j4 != -1) {
            s3.d k4 = lVar.k(j4);
            n3.b.t(k4, Integer.MAX_VALUE, timeUnit);
            k4.close();
        }
        int i6 = response2.f8476j;
        if (i6 == 200) {
            if (!zVar.f12045e.a() || !xVar2.f12041e.a()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i6 != 407) {
                throw new IOException(AbstractC0017m.g(i6, "Unexpected response code for CONNECT: "));
            }
            c0862a.f8318f.getClass();
            Intrinsics.checkNotNullParameter(response2, "response");
            throw new IOException("Failed to authenticate with proxy");
        }
    }

    public final void g(k3.p pVar, g call) {
        C0862a c0862a = this.f9404b.f8490a;
        SSLSocketFactory sSLSocketFactory = c0862a.f8315c;
        t tVar = t.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0862a.f8321i;
            t tVar2 = t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar2)) {
                this.f9406d = this.f9405c;
                this.f9408f = tVar;
                return;
            } else {
                this.f9406d = this.f9405c;
                this.f9408f = tVar2;
                l();
                return;
            }
        }
        Intrinsics.checkNotNullParameter(call, "call");
        C0862a c0862a2 = this.f9404b.f8490a;
        SSLSocketFactory sSLSocketFactory2 = c0862a2.f8315c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.c(sSLSocketFactory2);
            Socket socket = this.f9405c;
            m mVar = c0862a2.f8320h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, mVar.f8396d, mVar.f8397e, true);
            Intrinsics.d(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                m3.h b4 = pVar.b(sSLSocket2);
                if (b4.f8368b) {
                    n nVar = n.f10964a;
                    n.f10964a.d(sSLSocket2, c0862a2.f8320h.f8396d, c0862a2.f8321i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                m3.k C3 = u3.d.C(sslSocketSession);
                HostnameVerifier hostnameVerifier = c0862a2.f8316d;
                Intrinsics.c(hostnameVerifier);
                if (!hostnameVerifier.verify(c0862a2.f8320h.f8396d, sslSocketSession)) {
                    List a4 = C3.a();
                    if (a4.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c0862a2.f8320h.f8396d + " not verified (no certificates)");
                    }
                    Object obj = a4.get(0);
                    Intrinsics.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(c0862a2.f8320h.f8396d);
                    sb.append(" not verified:\n              |    certificate: ");
                    m3.d dVar = m3.d.f8338c;
                    sb.append(AbstractC0345a.C(certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    Intrinsics.checkNotNullParameter(certificate, "certificate");
                    sb.append(C1403G.B(y3.c.a(certificate, 7), y3.c.a(certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(kotlin.text.n.c(sb.toString()));
                }
                m3.d dVar2 = c0862a2.f8317e;
                Intrinsics.c(dVar2);
                this.f9407e = new m3.k(C3.f8387a, C3.f8388b, C3.f8389c, new C0842o(dVar2, C3, c0862a2, 3));
                dVar2.a(c0862a2.f8320h.f8396d, new A3.e(24, this));
                if (b4.f8368b) {
                    n nVar2 = n.f10964a;
                    str = n.f10964a.f(sSLSocket2);
                }
                this.f9406d = sSLSocket2;
                this.f9410h = m3.z.h(m3.z.t(sSLSocket2));
                C1445c s4 = m3.z.s(sSLSocket2);
                Intrinsics.checkNotNullParameter(s4, "<this>");
                this.f9411i = new x(s4);
                if (str != null) {
                    tVar = s.l(str);
                }
                this.f9408f = tVar;
                n nVar3 = n.f10964a;
                n.f10964a.a(sSLSocket2);
                Intrinsics.checkNotNullParameter(call, "call");
                if (this.f9408f == t.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    n nVar4 = n.f10964a;
                    n.f10964a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    n3.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (y3.c.c(r1, (java.security.cert.X509Certificate) r10) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(C0862a address, ArrayList arrayList) {
        m3.k kVar;
        int i2 = 1;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = n3.b.f8558a;
        if (this.f9418p.size() < this.f9417o && !this.f9412j) {
            y yVar = this.f9404b;
            if (!yVar.f8490a.a(address)) {
                return false;
            }
            m mVar = address.f8320h;
            String str = mVar.f8396d;
            C0862a c0862a = yVar.f8490a;
            if (Intrinsics.a(str, c0862a.f8320h.f8396d)) {
                return true;
            }
            if (this.f9409g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    y yVar2 = (y) it.next();
                    Proxy.Type type = yVar2.f8491b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && yVar.f8491b.type() == type2) {
                        if (Intrinsics.a(yVar.f8492c, yVar2.f8492c)) {
                            if (address.f8316d != y3.c.f11693a) {
                                return false;
                            }
                            byte[] bArr2 = n3.b.f8558a;
                            m mVar2 = c0862a.f8320h;
                            if (mVar.f8397e == mVar2.f8397e) {
                                String str2 = mVar2.f8396d;
                                String hostname = mVar.f8396d;
                                if (!Intrinsics.a(hostname, str2)) {
                                    if (!this.f9413k && (kVar = this.f9407e) != null) {
                                        List a4 = kVar.a();
                                        if (!a4.isEmpty()) {
                                            Object obj = a4.get(0);
                                            Intrinsics.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    m3.d dVar = address.f8317e;
                                    Intrinsics.c(dVar);
                                    m3.k kVar2 = this.f9407e;
                                    Intrinsics.c(kVar2);
                                    List peerCertificates = kVar2.a();
                                    Intrinsics.checkNotNullParameter(hostname, "hostname");
                                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                                    dVar.a(hostname, new C0842o(dVar, peerCertificates, hostname, i2));
                                    return true;
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

    public final boolean i(boolean z4) {
        long j4;
        byte[] bArr = n3.b.f8558a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f9405c;
        Intrinsics.c(socket);
        Socket socket2 = this.f9406d;
        Intrinsics.c(socket2);
        z source = this.f9410h;
        Intrinsics.c(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p pVar = this.f9409g;
        if (pVar != null) {
            synchronized (pVar) {
                if (pVar.f10819l) {
                    return false;
                }
                if (pVar.f10827t < pVar.f10826s) {
                    if (nanoTime >= pVar.f10828u) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j4 = nanoTime - this.f9419q;
        }
        if (j4 < 10000000000L || !z4) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z5 = !source.a();
                socket2.setSoTimeout(soTimeout);
                return z5;
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

    public final r3.d j(r client, r3.f chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f9406d;
        Intrinsics.c(socket);
        z zVar = this.f9410h;
        Intrinsics.c(zVar);
        x xVar = this.f9411i;
        Intrinsics.c(xVar);
        p pVar = this.f9409g;
        if (pVar != null) {
            return new t3.q(client, this, chain, pVar);
        }
        int i2 = chain.f9871g;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVar.f12044d.c().g(i2, timeUnit);
        xVar.f12040d.c().g(chain.f9872h, timeUnit);
        return new l(client, this, zVar, xVar);
    }

    public final synchronized void k() {
        this.f9412j = true;
    }

    public final void l() {
        Socket socket = this.f9406d;
        Intrinsics.c(socket);
        z source = this.f9410h;
        Intrinsics.c(source);
        x sink = this.f9411i;
        Intrinsics.c(sink);
        socket.setSoTimeout(0);
        p3.d taskRunner = p3.d.f9128h;
        Z1.v vVar = new Z1.v(taskRunner);
        String peerName = this.f9404b.f8490a.f8320h.f8396d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        vVar.f4605b = socket;
        String str = n3.b.f8564g + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        vVar.f4606c = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        vVar.f4607d = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        vVar.f4608e = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        vVar.f4609f = this;
        p pVar = new p(vVar);
        this.f9409g = pVar;
        B b4 = p.f10809F;
        int i2 = 4;
        this.f9417o = (b4.f10745a & 16) != 0 ? b4.f10746b[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        t3.y yVar = pVar.f10811C;
        synchronized (yVar) {
            try {
                if (yVar.f10881j) {
                    throw new IOException("closed");
                }
                Logger logger = t3.y.f10877l;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(n3.b.h(">> CONNECTION " + t3.g.f10783a.e(), new Object[0]));
                }
                x xVar = yVar.f10878d;
                C1451i byteString = t3.g.f10783a;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(byteString, "byteString");
                if (xVar.f12042i) {
                    throw new IllegalStateException("closed");
                }
                xVar.f12041e.v(byteString);
                xVar.a();
                yVar.f10878d.flush();
            } finally {
            }
        }
        t3.y yVar2 = pVar.f10811C;
        B settings = pVar.f10829v;
        synchronized (yVar2) {
            try {
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (yVar2.f10881j) {
                    throw new IOException("closed");
                }
                yVar2.d(0, Integer.bitCount(settings.f10745a) * 6, 4, 0);
                int i4 = 0;
                while (i4 < 10) {
                    boolean z4 = true;
                    if (((1 << i4) & settings.f10745a) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        int i5 = i4 != i2 ? i4 != 7 ? i4 : i2 : 3;
                        x xVar2 = yVar2.f10878d;
                        if (xVar2.f12042i) {
                            throw new IllegalStateException("closed");
                        }
                        C1448f c1448f = xVar2.f12041e;
                        A u4 = c1448f.u(2);
                        int i6 = u4.f11964c;
                        byte[] bArr = u4.f11962a;
                        bArr[i6] = (byte) ((i5 >>> 8) & 255);
                        bArr[i6 + 1] = (byte) (i5 & 255);
                        u4.f11964c = i6 + 2;
                        c1448f.f11999e += 2;
                        xVar2.a();
                        yVar2.f10878d.d(settings.f10746b[i4]);
                    }
                    i4++;
                    i2 = 4;
                }
                yVar2.f10878d.flush();
            } finally {
            }
        }
        if (pVar.f10829v.a() != 65535) {
            pVar.f10811C.j(r2 - 65535, 0);
        }
        taskRunner.e().c(new p3.b(pVar.f10816i, pVar.f10812D, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        y yVar = this.f9404b;
        sb.append(yVar.f8490a.f8320h.f8396d);
        sb.append(':');
        sb.append(yVar.f8490a.f8320h.f8397e);
        sb.append(", proxy=");
        sb.append(yVar.f8491b);
        sb.append(" hostAddress=");
        sb.append(yVar.f8492c);
        sb.append(" cipherSuite=");
        m3.k kVar = this.f9407e;
        if (kVar == null || (obj = kVar.f8388b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f9408f);
        sb.append('}');
        return sb.toString();
    }
}
