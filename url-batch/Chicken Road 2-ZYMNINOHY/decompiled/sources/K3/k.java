package K3;

import G3.A;
import G3.C0050a;
import G3.s;
import G3.t;
import G3.u;
import G3.v;
import N3.D;
import N3.EnumC0078b;
import N3.q;
import N3.r;
import N3.y;
import N3.z;
import T3.o;
import T3.p;
import T3.x;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import i2.AbstractC0457a;
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
import w3.AbstractC1511h;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class k extends N3.i {

    /* renamed from: b, reason: collision with root package name */
    public final A f1575b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f1576c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f1577d;

    /* renamed from: e, reason: collision with root package name */
    public G3.l f1578e;

    /* renamed from: f, reason: collision with root package name */
    public t f1579f;

    /* renamed from: g, reason: collision with root package name */
    public q f1580g;

    /* renamed from: h, reason: collision with root package name */
    public p f1581h;

    /* renamed from: i, reason: collision with root package name */
    public o f1582i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1583j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1584k;

    /* renamed from: l, reason: collision with root package name */
    public int f1585l;

    /* renamed from: m, reason: collision with root package name */
    public int f1586m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1587p;

    /* renamed from: q, reason: collision with root package name */
    public long f1588q;

    public k(l connectionPool, A route) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(route, "route");
        this.f1575b = route;
        this.o = 1;
        this.f1587p = new ArrayList();
        this.f1588q = Long.MAX_VALUE;
    }

    public static void d(s client, A failedRoute, IOException failure) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.i.e(failure, "failure");
        if (failedRoute.f847b.type() != Proxy.Type.DIRECT) {
            C0050a c0050a = failedRoute.f846a;
            c0050a.f862g.connectFailed(c0050a.f863h.f(), failedRoute.f847b.address(), failure);
        }
        t1.h hVar = client.f998y;
        synchronized (hVar) {
            ((LinkedHashSet) hVar.f15398b).add(failedRoute);
        }
    }

    @Override // N3.i
    public final synchronized void a(q qVar, D settings) {
        kotlin.jvm.internal.i.e(settings, "settings");
        this.o = (settings.f1817a & 16) != 0 ? settings.f1818b[4] : Integer.MAX_VALUE;
    }

    @Override // N3.i
    public final void b(y yVar) {
        yVar.c(EnumC0078b.REFUSED_STREAM, null);
    }

    public final void c(int i4, int i5, int i6, boolean z, i iVar) {
        A a3;
        if (this.f1579f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f1575b.f846a.f865j;
        b bVar = new b(list);
        C0050a c0050a = this.f1575b.f846a;
        if (c0050a.f858c == null) {
            if (!list.contains(G3.i.f912f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f1575b.f846a.f863h.f950d;
            O3.n nVar = O3.n.f2081a;
            if (!O3.n.f2081a.h(str)) {
                throw new m(new UnknownServiceException(AbstractC1514c.a("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0050a.f864i.contains(t.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                A a4 = this.f1575b;
                if (a4.f846a.f858c != null && a4.f847b.type() == Proxy.Type.HTTP) {
                    f(i4, i5, i6, iVar);
                    if (this.f1576c == null) {
                        a3 = this.f1575b;
                        if (a3.f846a.f858c == null && a3.f847b.type() == Proxy.Type.HTTP && this.f1576c == null) {
                            throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f1588q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i4, i5, iVar);
                }
                g(bVar, iVar);
                InetSocketAddress inetSocketAddress = this.f1575b.f848c;
                kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
                a3 = this.f1575b;
                if (a3.f846a.f858c == null) {
                }
                this.f1588q = System.nanoTime();
                return;
            } catch (IOException e4) {
                Socket socket = this.f1577d;
                if (socket != null) {
                    H3.b.d(socket);
                }
                Socket socket2 = this.f1576c;
                if (socket2 != null) {
                    H3.b.d(socket2);
                }
                this.f1577d = null;
                this.f1576c = null;
                this.f1581h = null;
                this.f1582i = null;
                this.f1578e = null;
                this.f1579f = null;
                this.f1580g = null;
                this.o = 1;
                InetSocketAddress inetSocketAddress2 = this.f1575b.f848c;
                kotlin.jvm.internal.i.e(inetSocketAddress2, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new m(e4);
                } else {
                    O3.d.c(mVar.f1593a, e4);
                    mVar.f1594b = e4;
                }
                if (!z) {
                    throw mVar;
                }
                bVar.f1531d = true;
                if (!bVar.f1530c) {
                    throw mVar;
                }
                if (e4 instanceof ProtocolException) {
                    throw mVar;
                }
                if (e4 instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e4 instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e4 instanceof SSLException);
        throw mVar;
    }

    public final void e(int i4, int i5, i iVar) {
        Socket createSocket;
        A a3 = this.f1575b;
        Proxy proxy = a3.f847b;
        C0050a c0050a = a3.f846a;
        Proxy.Type type = proxy.type();
        int i6 = type == null ? -1 : j.f1574a[type.ordinal()];
        if (i6 == 1 || i6 == 2) {
            createSocket = c0050a.f857b.createSocket();
            kotlin.jvm.internal.i.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f1576c = createSocket;
        InetSocketAddress inetSocketAddress = this.f1575b.f848c;
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i5);
        try {
            O3.n nVar = O3.n.f2081a;
            O3.n.f2081a.e(createSocket, this.f1575b.f848c, i4);
            try {
                this.f1581h = new p(AbstractC0457a.D(createSocket));
                this.f1582i = new o(AbstractC0457a.C(createSocket));
            } catch (NullPointerException e4) {
                if (kotlin.jvm.internal.i.a(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException(kotlin.jvm.internal.i.h(this.f1575b.f848c, "Failed to connect to "));
            connectException.initCause(e5);
            throw connectException;
        }
    }

    public final void f(int i4, int i5, int i6, i iVar) {
        u uVar = new u();
        A a3 = this.f1575b;
        G3.p url = a3.f846a.f863h;
        kotlin.jvm.internal.i.e(url, "url");
        uVar.f1007a = url;
        uVar.g("CONNECT", null);
        C0050a c0050a = a3.f846a;
        uVar.d("Host", H3.b.t(c0050a.f863h, true));
        uVar.d("Proxy-Connection", "Keep-Alive");
        uVar.d("User-Agent", "okhttp/4.11.0");
        v a4 = uVar.a();
        G3.m mVar = new G3.m(0);
        O3.l.c("Proxy-Authenticate");
        O3.l.d("OkHttp-Preemptive", "Proxy-Authenticate");
        mVar.i("Proxy-Authenticate");
        mVar.f("Proxy-Authenticate", "OkHttp-Preemptive");
        mVar.g();
        c0050a.f861f.getClass();
        G3.p pVar = a4.f1012a;
        e(i4, i5, iVar);
        String str = "CONNECT " + H3.b.t(pVar, true) + " HTTP/1.1";
        p pVar2 = this.f1581h;
        kotlin.jvm.internal.i.b(pVar2);
        o oVar = this.f1582i;
        kotlin.jvm.internal.i.b(oVar);
        M3.g gVar = new M3.g(null, this, pVar2, oVar);
        x d4 = pVar2.f2994a.d();
        long j4 = i5;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d4.g(j4);
        oVar.f2991a.d().g(i6);
        gVar.j(a4.f1014c, str);
        gVar.a();
        G3.x b4 = gVar.b(false);
        kotlin.jvm.internal.i.b(b4);
        b4.f1020a = a4;
        G3.y a5 = b4.a();
        int i7 = a5.f1036d;
        long i8 = H3.b.i(a5);
        if (i8 != -1) {
            M3.d i9 = gVar.i(i8);
            H3.b.r(i9, Integer.MAX_VALUE);
            i9.close();
        }
        if (i7 != 200) {
            if (i7 != 407) {
                throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(i7), "Unexpected response code for CONNECT: "));
            }
            c0050a.f861f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar2.f2995b.b() || !oVar.f2992b.b()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i iVar) {
        t tVar = t.HTTP_1_1;
        C0050a c0050a = this.f1575b.f846a;
        SSLSocketFactory sSLSocketFactory = c0050a.f858c;
        if (sSLSocketFactory == null) {
            List list = c0050a.f864i;
            t tVar2 = t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar2)) {
                this.f1577d = this.f1576c;
                this.f1579f = tVar;
                return;
            } else {
                this.f1577d = this.f1576c;
                this.f1579f = tVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            kotlin.jvm.internal.i.b(sSLSocketFactory);
            Socket socket = this.f1576c;
            G3.p pVar = c0050a.f863h;
            int i4 = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket, pVar.f950d, pVar.f951e, true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                G3.i a3 = bVar.a(sSLSocket2);
                if (a3.f914b) {
                    O3.n nVar = O3.n.f2081a;
                    O3.n.f2081a.d(sSLSocket2, c0050a.f863h.f950d, c0050a.f864i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.i.d(sslSocketSession, "sslSocketSession");
                G3.l o = O3.d.o(sslSocketSession);
                HostnameVerifier hostnameVerifier = c0050a.f859d;
                kotlin.jvm.internal.i.b(hostnameVerifier);
                if (!hostnameVerifier.verify(c0050a.f863h.f950d, sslSocketSession)) {
                    List a4 = o.a();
                    if (a4.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c0050a.f863h.f950d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) a4.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(c0050a.f863h.f950d);
                    sb.append(" not verified:\n              |    certificate: ");
                    G3.e eVar = G3.e.f886c;
                    sb.append(AbstractC0347t0.o(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append((Object) x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(d3.i.j0(S3.c.a(x509Certificate, 7), S3.c.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(AbstractC1511h.T(sb.toString()));
                }
                G3.e eVar2 = c0050a.f860e;
                kotlin.jvm.internal.i.b(eVar2);
                this.f1578e = new G3.l(o.f932a, o.f933b, o.f934c, new G3.d(eVar2, o, c0050a, i4));
                eVar2.a(c0050a.f863h.f950d, new G3.k(3, this));
                if (a3.f914b) {
                    O3.n nVar2 = O3.n.f2081a;
                    str = O3.n.f2081a.f(sSLSocket2);
                }
                this.f1577d = sSLSocket2;
                this.f1581h = new p(AbstractC0457a.D(sSLSocket2));
                this.f1582i = new o(AbstractC0457a.C(sSLSocket2));
                if (str != null) {
                    tVar = U.i.i(str);
                }
                this.f1579f = tVar;
                O3.n nVar3 = O3.n.f2081a;
                O3.n.f2081a.a(sSLSocket2);
                if (this.f1579f == t.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    O3.n nVar4 = O3.n.f2081a;
                    O3.n.f2081a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    H3.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (S3.c.c(r5, (java.security.cert.X509Certificate) r11.get(0)) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(C0050a c0050a, List list) {
        G3.l lVar;
        G3.p pVar = c0050a.f863h;
        byte[] bArr = H3.b.f1103a;
        int i4 = 0;
        if (this.f1587p.size() < this.o && !this.f1583j) {
            A a3 = this.f1575b;
            C0050a c0050a2 = a3.f846a;
            C0050a c0050a3 = a3.f846a;
            if (c0050a2.a(c0050a)) {
                String str = pVar.f950d;
                String hostname = pVar.f950d;
                if (kotlin.jvm.internal.i.a(str, c0050a3.f863h.f950d)) {
                    return true;
                }
                if (this.f1580g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        A a4 = (A) it.next();
                        Proxy.Type type = a4.f847b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && a3.f847b.type() == type2 && kotlin.jvm.internal.i.a(a3.f848c, a4.f848c)) {
                            if (c0050a.f859d == S3.c.f2606a) {
                                byte[] bArr2 = H3.b.f1103a;
                                G3.p pVar2 = c0050a3.f863h;
                                if (pVar.f951e == pVar2.f951e) {
                                    if (!kotlin.jvm.internal.i.a(hostname, pVar2.f950d)) {
                                        if (!this.f1584k && (lVar = this.f1578e) != null) {
                                            List a5 = lVar.a();
                                            if (!a5.isEmpty()) {
                                            }
                                        }
                                    }
                                    try {
                                        G3.e eVar = c0050a.f860e;
                                        kotlin.jvm.internal.i.b(eVar);
                                        G3.l lVar2 = this.f1578e;
                                        kotlin.jvm.internal.i.b(lVar2);
                                        List peerCertificates = lVar2.a();
                                        kotlin.jvm.internal.i.e(hostname, "hostname");
                                        kotlin.jvm.internal.i.e(peerCertificates, "peerCertificates");
                                        eVar.a(hostname, new G3.d(eVar, peerCertificates, hostname, i4));
                                        return true;
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j4;
        byte[] bArr = H3.b.f1103a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f1576c;
        kotlin.jvm.internal.i.b(socket);
        Socket socket2 = this.f1577d;
        kotlin.jvm.internal.i.b(socket2);
        kotlin.jvm.internal.i.b(this.f1581h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        q qVar = this.f1580g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f1885f) {
                    return false;
                }
                if (qVar.n < qVar.f1892m) {
                    if (nanoTime >= qVar.o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j4 = nanoTime - this.f1588q;
        }
        if (j4 < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final L3.e j(s client, L3.g gVar) {
        kotlin.jvm.internal.i.e(client, "client");
        int i4 = gVar.f1676g;
        Socket socket = this.f1577d;
        kotlin.jvm.internal.i.b(socket);
        p pVar = this.f1581h;
        kotlin.jvm.internal.i.b(pVar);
        o oVar = this.f1582i;
        kotlin.jvm.internal.i.b(oVar);
        q qVar = this.f1580g;
        if (qVar != null) {
            return new r(client, this, gVar, qVar);
        }
        socket.setSoTimeout(i4);
        x d4 = pVar.f2994a.d();
        long j4 = i4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d4.g(j4);
        oVar.f2991a.d().g(gVar.f1677h);
        return new M3.g(client, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f1583j = true;
    }

    public final void l() {
        Socket socket = this.f1577d;
        kotlin.jvm.internal.i.b(socket);
        p pVar = this.f1581h;
        kotlin.jvm.internal.i.b(pVar);
        o oVar = this.f1582i;
        kotlin.jvm.internal.i.b(oVar);
        socket.setSoTimeout(0);
        J3.d taskRunner = J3.d.f1209i;
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        L1.h hVar = new L1.h();
        hVar.f1634b = taskRunner;
        hVar.f1638f = N3.i.f1858a;
        String peerName = this.f1575b.f846a.f863h.f950d;
        kotlin.jvm.internal.i.e(peerName, "peerName");
        hVar.f1635c = socket;
        String str = H3.b.f1108f + ' ' + peerName;
        kotlin.jvm.internal.i.e(str, "<set-?>");
        hVar.f1633a = str;
        hVar.f1636d = pVar;
        hVar.f1637e = oVar;
        hVar.f1638f = this;
        q qVar = new q(hVar);
        this.f1580g = qVar;
        D d4 = q.z;
        this.o = (d4.f1817a & 16) != 0 ? d4.f1818b[4] : Integer.MAX_VALUE;
        z zVar = qVar.f1899w;
        synchronized (zVar) {
            try {
                if (zVar.f1948d) {
                    throw new IOException("closed");
                }
                Logger logger = z.f1944f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(H3.b.g(kotlin.jvm.internal.i.h(N3.g.f1854a.b(), ">> CONNECTION "), new Object[0]));
                }
                zVar.f1945a.l(N3.g.f1854a);
                zVar.f1945a.flush();
            } finally {
            }
        }
        z zVar2 = qVar.f1899w;
        D settings = qVar.f1893p;
        synchronized (zVar2) {
            try {
                kotlin.jvm.internal.i.e(settings, "settings");
                if (zVar2.f1948d) {
                    throw new IOException("closed");
                }
                zVar2.e(0, Integer.bitCount(settings.f1817a) * 6, 4, 0);
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i4 + 1;
                    boolean z = true;
                    if (((1 << i4) & settings.f1817a) == 0) {
                        z = false;
                    }
                    if (z) {
                        zVar2.f1945a.writeShort(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                        zVar2.f1945a.writeInt(settings.f1818b[i4]);
                    }
                    i4 = i5;
                }
                zVar2.f1945a.flush();
            } finally {
            }
        }
        if (qVar.f1893p.a() != 65535) {
            qVar.f1899w.t(0, r1 - 65535);
        }
        taskRunner.e().c(new J3.b(qVar.f1882c, qVar.f1900x, 0), 0L);
    }

    public final String toString() {
        G3.g gVar;
        StringBuilder sb = new StringBuilder("Connection{");
        A a3 = this.f1575b;
        sb.append(a3.f846a.f863h.f950d);
        sb.append(':');
        sb.append(a3.f846a.f863h.f951e);
        sb.append(", proxy=");
        sb.append(a3.f847b);
        sb.append(" hostAddress=");
        sb.append(a3.f848c);
        sb.append(" cipherSuite=");
        G3.l lVar = this.f1578e;
        Object obj = "none";
        if (lVar != null && (gVar = lVar.f933b) != null) {
            obj = gVar;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f1579f);
        sb.append('}');
        return sb.toString();
    }
}
