package D1;

import G1.AbstractC0001b;
import G1.D;
import G1.r;
import G1.y;
import G1.z;
import M1.x;
import V.v;
import a.AbstractC0058a;
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
import n.C0288n;
import z1.s;
import z1.t;
import z1.u;
import z1.w;

/* loaded from: classes.dex */
public final class m extends G1.j {

    /* renamed from: b, reason: collision with root package name */
    public final w f251b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f252c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f253d;
    public z1.l e;

    /* renamed from: f, reason: collision with root package name */
    public t f254f;

    /* renamed from: g, reason: collision with root package name */
    public G1.q f255g;

    /* renamed from: h, reason: collision with root package name */
    public M1.p f256h;
    public M1.o i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f257k;

    /* renamed from: l, reason: collision with root package name */
    public int f258l;

    /* renamed from: m, reason: collision with root package name */
    public int f259m;

    /* renamed from: n, reason: collision with root package name */
    public int f260n;

    /* renamed from: o, reason: collision with root package name */
    public int f261o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f262p;

    /* renamed from: q, reason: collision with root package name */
    public long f263q;

    public m(n nVar, w wVar) {
        j1.h.e(nVar, "connectionPool");
        j1.h.e(wVar, "route");
        this.f251b = wVar;
        this.f261o = 1;
        this.f262p = new ArrayList();
        this.f263q = Long.MAX_VALUE;
    }

    public static void d(s sVar, w wVar, IOException iOException) {
        j1.h.e(wVar, "failedRoute");
        j1.h.e(iOException, "failure");
        if (wVar.f4955b.type() != Proxy.Type.DIRECT) {
            z1.a aVar = wVar.f4954a;
            aVar.f4812g.connectFailed(aVar.f4813h.g(), wVar.f4955b.address(), iOException);
        }
        C1.d dVar = sVar.f4926y;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.f145b).add(wVar);
        }
    }

    @Override // G1.j
    public final synchronized void a(G1.q qVar, D d2) {
        j1.h.e(qVar, "connection");
        j1.h.e(d2, "settings");
        this.f261o = (d2.f345a & 16) != 0 ? d2.f346b[4] : Integer.MAX_VALUE;
    }

    @Override // G1.j
    public final void b(y yVar) {
        yVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        w wVar;
        j1.h.e(jVar, "call");
        if (this.f254f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f251b.f4954a.j;
        b bVar = new b(list);
        z1.a aVar = this.f251b.f4954a;
        if (aVar.f4809c == null) {
            if (!list.contains(z1.i.f4848f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f251b.f4954a.f4813h.f4878d;
            H1.n nVar = H1.n.f570a;
            if (!H1.n.f570a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(t.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                w wVar2 = this.f251b;
                if (wVar2.f4954a.f4809c != null && wVar2.f4955b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f252c == null) {
                        wVar = this.f251b;
                        if (wVar.f4954a.f4809c == null && wVar.f4955b.type() == Proxy.Type.HTTP && this.f252c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f263q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                j1.h.e(this.f251b.f4956c, "inetSocketAddress");
                wVar = this.f251b;
                if (wVar.f4954a.f4809c == null) {
                }
                this.f263q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.f253d;
                if (socket != null) {
                    A1.c.c(socket);
                }
                Socket socket2 = this.f252c;
                if (socket2 != null) {
                    A1.c.c(socket2);
                }
                this.f253d = null;
                this.f252c = null;
                this.f256h = null;
                this.i = null;
                this.e = null;
                this.f254f = null;
                this.f255g = null;
                this.f261o = 1;
                j1.h.e(this.f251b.f4956c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e);
                } else {
                    AbstractC0058a.a(oVar.f268a, e);
                    oVar.f269b = e;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.f207d = true;
                if (!bVar.f206c) {
                    throw oVar;
                }
                if (e instanceof ProtocolException) {
                    throw oVar;
                }
                if (e instanceof InterruptedIOException) {
                    throw oVar;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw oVar;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw oVar;
                }
            }
        } while (e instanceof SSLException);
        throw oVar;
    }

    public final void e(int i, int i2, j jVar) {
        Socket createSocket;
        w wVar = this.f251b;
        Proxy proxy = wVar.f4955b;
        z1.a aVar = wVar.f4954a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f247a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f4808b.createSocket();
            j1.h.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f252c = createSocket;
        InetSocketAddress inetSocketAddress = this.f251b.f4956c;
        j1.h.e(jVar, "call");
        j1.h.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            H1.n nVar = H1.n.f570a;
            H1.n.f570a.e(createSocket, this.f251b.f4956c, i);
            try {
                this.f256h = new M1.p(H1.d.g0(createSocket));
                this.i = new M1.o(H1.d.f0(createSocket));
            } catch (NullPointerException e) {
                if (j1.h.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f251b.f4956c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        v vVar = new v(7);
        w wVar = this.f251b;
        z1.o oVar = wVar.f4954a.f4813h;
        j1.h.e(oVar, "url");
        vVar.f1305a = oVar;
        vVar.o("CONNECT", null);
        z1.a aVar = wVar.f4954a;
        vVar.l("Host", A1.c.u(aVar.f4813h, true));
        vVar.l("Proxy-Connection", "Keep-Alive");
        vVar.l("User-Agent", "okhttp/4.12.0");
        J.d b2 = vVar.b();
        C0288n c0288n = new C0288n(8);
        z1.e.a("Proxy-Authenticate");
        z1.e.b("OkHttp-Preemptive", "Proxy-Authenticate");
        c0288n.j("Proxy-Authenticate");
        c0288n.h("Proxy-Authenticate", "OkHttp-Preemptive");
        c0288n.i();
        aVar.f4811f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + A1.c.u((z1.o) b2.f626c, true) + " HTTP/1.1";
        M1.p pVar = this.f256h;
        j1.h.b(pVar);
        M1.o oVar2 = this.i;
        j1.h.b(oVar2);
        q qVar = new q(null, this, pVar, oVar2);
        x b3 = pVar.f846a.b();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b3.g(j, timeUnit);
        oVar2.f843a.b().g(i3, timeUnit);
        qVar.k((z1.m) b2.f627d, str);
        qVar.a();
        u g2 = qVar.g(false);
        j1.h.b(g2);
        g2.f4934a = b2;
        z1.v a2 = g2.a();
        long i4 = A1.c.i(a2);
        if (i4 != -1) {
            F1.e j2 = qVar.j(i4);
            A1.c.s(j2, Integer.MAX_VALUE, timeUnit);
            j2.close();
        }
        int i5 = a2.f4947d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(AbstractC0001b.e("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f4811f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f847b.a() || !oVar2.f844b.a()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        z1.a aVar = this.f251b.f4954a;
        SSLSocketFactory sSLSocketFactory = aVar.f4809c;
        t tVar = t.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            t tVar2 = t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar2)) {
                this.f253d = this.f252c;
                this.f254f = tVar;
                return;
            } else {
                this.f253d = this.f252c;
                this.f254f = tVar2;
                l();
                return;
            }
        }
        j1.h.e(jVar, "call");
        z1.a aVar2 = this.f251b.f4954a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f4809c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            j1.h.b(sSLSocketFactory2);
            Socket socket = this.f252c;
            z1.o oVar = aVar2.f4813h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, oVar.f4878d, oVar.e, true);
            j1.h.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                z1.i a2 = bVar.a(sSLSocket2);
                if (a2.f4850b) {
                    H1.n nVar = H1.n.f570a;
                    H1.n.f570a.d(sSLSocket2, aVar2.f4813h.f4878d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                j1.h.d(session, "sslSocketSession");
                z1.l a3 = z1.c.a(session);
                HostnameVerifier hostnameVerifier = aVar2.f4810d;
                j1.h.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.f4813h.f4878d, session)) {
                    z1.f fVar = aVar2.e;
                    j1.h.b(fVar);
                    this.e = new z1.l(a3.f4863a, a3.f4864b, a3.f4865c, new l(fVar, a3, aVar2));
                    j1.h.e(aVar2.f4813h.f4878d, "hostname");
                    Iterator it = fVar.f4829a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f4850b) {
                        H1.n nVar2 = H1.n.f570a;
                        str = H1.n.f570a.f(sSLSocket2);
                    }
                    this.f253d = sSLSocket2;
                    this.f256h = new M1.p(H1.d.g0(sSLSocket2));
                    this.i = new M1.o(H1.d.f0(sSLSocket2));
                    if (str != null) {
                        tVar = z1.c.b(str);
                    }
                    this.f254f = tVar;
                    H1.n nVar3 = H1.n.f570a;
                    H1.n.f570a.a(sSLSocket2);
                    if (this.f254f == t.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a4 = a3.a();
                if (a4.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f4813h.f4878d + " not verified (no certificates)");
                }
                Object obj = a4.get(0);
                j1.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.f4813h.f4878d);
                sb.append(" not verified:\n              |    certificate: ");
                z1.f fVar2 = z1.f.f4828c;
                sb.append(z1.e.d(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a5 = L1.c.a(x509Certificate, 7);
                List a6 = L1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a6.size() + a5.size());
                arrayList.addAll(a5);
                arrayList.addAll(a6);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(q1.f.k0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    H1.n nVar4 = H1.n.f570a;
                    H1.n.f570a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    A1.c.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (L1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(z1.a aVar, ArrayList arrayList) {
        z1.l lVar;
        byte[] bArr = A1.c.f19a;
        if (this.f262p.size() < this.f261o && !this.j) {
            w wVar = this.f251b;
            if (!wVar.f4954a.a(aVar)) {
                return false;
            }
            z1.o oVar = aVar.f4813h;
            String str = oVar.f4878d;
            z1.a aVar2 = wVar.f4954a;
            if (j1.h.a(str, aVar2.f4813h.f4878d)) {
                return true;
            }
            if (this.f255g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w wVar2 = (w) it.next();
                    Proxy.Type type = wVar2.f4955b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && wVar.f4955b.type() == type2) {
                        if (j1.h.a(wVar.f4956c, wVar2.f4956c)) {
                            if (aVar.f4810d != L1.c.f697a) {
                                return false;
                            }
                            byte[] bArr2 = A1.c.f19a;
                            z1.o oVar2 = aVar2.f4813h;
                            if (oVar.e == oVar2.e) {
                                String str2 = oVar2.f4878d;
                                String str3 = oVar.f4878d;
                                if (!j1.h.a(str3, str2)) {
                                    if (!this.f257k && (lVar = this.e) != null) {
                                        List a2 = lVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            j1.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    z1.f fVar = aVar.e;
                                    j1.h.b(fVar);
                                    z1.l lVar2 = this.e;
                                    j1.h.b(lVar2);
                                    List a3 = lVar2.a();
                                    j1.h.e(str3, "hostname");
                                    j1.h.e(a3, "peerCertificates");
                                    Iterator it2 = fVar.f4829a.iterator();
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
        long j;
        byte[] bArr = A1.c.f19a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f252c;
        j1.h.b(socket);
        Socket socket2 = this.f253d;
        j1.h.b(socket2);
        M1.p pVar = this.f256h;
        j1.h.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        G1.q qVar = this.f255g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f399f) {
                    return false;
                }
                if (qVar.f405n < qVar.f404m) {
                    if (nanoTime >= qVar.f406o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.f263q;
        }
        if (j < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !pVar.a();
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

    public final E1.e j(s sVar, E1.g gVar) {
        Socket socket = this.f253d;
        j1.h.b(socket);
        M1.p pVar = this.f256h;
        j1.h.b(pVar);
        M1.o oVar = this.i;
        j1.h.b(oVar);
        G1.q qVar = this.f255g;
        if (qVar != null) {
            return new r(sVar, this, gVar, qVar);
        }
        int i = gVar.f310g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f846a.b().g(i, timeUnit);
        oVar.f843a.b().g(gVar.f311h, timeUnit);
        return new q(sVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.f253d;
        j1.h.b(socket);
        M1.p pVar = this.f256h;
        j1.h.b(pVar);
        M1.o oVar = this.i;
        j1.h.b(oVar);
        socket.setSoTimeout(0);
        C1.f fVar = C1.f.f148h;
        G1.h hVar = new G1.h(fVar);
        String str = this.f251b.f4954a.f4813h.f4878d;
        j1.h.e(str, "peerName");
        hVar.f375b = socket;
        String str2 = A1.c.f24g + ' ' + str;
        j1.h.e(str2, "<set-?>");
        hVar.f376c = str2;
        hVar.f377d = pVar;
        hVar.e = oVar;
        hVar.f378f = this;
        G1.q qVar = new G1.q(hVar);
        this.f255g = qVar;
        D d2 = G1.q.f394z;
        int i = 4;
        this.f261o = (d2.f345a & 16) != 0 ? d2.f346b[4] : Integer.MAX_VALUE;
        z zVar = qVar.f414w;
        synchronized (zVar) {
            try {
                if (zVar.f458d) {
                    throw new IOException("closed");
                }
                Logger logger = z.f454f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(A1.c.g(">> CONNECTION " + G1.g.f370a.b(), new Object[0]));
                }
                M1.o oVar2 = zVar.f455a;
                M1.i iVar = G1.g.f370a;
                oVar2.getClass();
                j1.h.e(iVar, "byteString");
                if (oVar2.f845c) {
                    throw new IllegalStateException("closed");
                }
                oVar2.f844b.K(iVar);
                oVar2.a();
                zVar.f455a.flush();
            } finally {
            }
        }
        z zVar2 = qVar.f414w;
        D d3 = qVar.f407p;
        synchronized (zVar2) {
            try {
                j1.h.e(d3, "settings");
                if (zVar2.f458d) {
                    throw new IOException("closed");
                }
                zVar2.q(0, Integer.bitCount(d3.f345a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & d3.f345a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        M1.o oVar3 = zVar2.f455a;
                        if (oVar3.f845c) {
                            throw new IllegalStateException("closed");
                        }
                        M1.f fVar2 = oVar3.f844b;
                        M1.q I2 = fVar2.I(2);
                        int i4 = I2.f851c;
                        byte[] bArr = I2.f849a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        I2.f851c = i4 + 2;
                        fVar2.f827b += 2;
                        oVar3.a();
                        zVar2.f455a.q(d3.f346b[i2]);
                    }
                    i2++;
                    i = 4;
                }
                zVar2.f455a.flush();
            } finally {
            }
        }
        if (qVar.f407p.a() != 65535) {
            qVar.f414w.F(0, r2 - 65535);
        }
        fVar.e().c(new C1.b(qVar.f397c, qVar.f415x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        w wVar = this.f251b;
        sb.append(wVar.f4954a.f4813h.f4878d);
        sb.append(':');
        sb.append(wVar.f4954a.f4813h.e);
        sb.append(", proxy=");
        sb.append(wVar.f4955b);
        sb.append(" hostAddress=");
        sb.append(wVar.f4956c);
        sb.append(" cipherSuite=");
        z1.l lVar = this.e;
        if (lVar == null || (obj = lVar.f4864b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f254f);
        sb.append('}');
        return sb.toString();
    }
}
