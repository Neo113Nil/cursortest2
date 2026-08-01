package D1;

import G1.AbstractC0001b;
import G1.D;
import G1.y;
import G1.z;
import M1.x;
import c1.AbstractC0091d;
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
import k.C0191o;
import z1.q;
import z1.r;
import z1.s;
import z1.t;

/* loaded from: classes.dex */
public final class m extends G1.j {

    /* renamed from: b, reason: collision with root package name */
    public final t f193b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f194c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public z1.i f195e;

    /* renamed from: f, reason: collision with root package name */
    public q f196f;

    /* renamed from: g, reason: collision with root package name */
    public G1.q f197g;
    public M1.p h;
    public M1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f198j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f199k;

    /* renamed from: l, reason: collision with root package name */
    public int f200l;

    /* renamed from: m, reason: collision with root package name */
    public int f201m;

    /* renamed from: n, reason: collision with root package name */
    public int f202n;

    /* renamed from: o, reason: collision with root package name */
    public int f203o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f204p;

    /* renamed from: q, reason: collision with root package name */
    public long f205q;

    public m(n nVar, t tVar) {
        k1.e.e(nVar, "connectionPool");
        k1.e.e(tVar, "route");
        this.f193b = tVar;
        this.f203o = 1;
        this.f204p = new ArrayList();
        this.f205q = Long.MAX_VALUE;
    }

    public static void d(z1.p pVar, t tVar, IOException iOException) {
        k1.e.e(tVar, "failedRoute");
        k1.e.e(iOException, "failure");
        if (tVar.f4770b.type() != Proxy.Type.DIRECT) {
            z1.a aVar = tVar.f4769a;
            aVar.f4631g.connectFailed(aVar.h.g(), tVar.f4770b.address(), iOException);
        }
        A0.c cVar = pVar.f4742y;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.f6b).add(tVar);
        }
    }

    @Override // G1.j
    public final synchronized void a(G1.q qVar, D d) {
        k1.e.e(qVar, "connection");
        k1.e.e(d, "settings");
        this.f203o = (d.f363a & 16) != 0 ? d.f364b[4] : Integer.MAX_VALUE;
    }

    @Override // G1.j
    public final void b(y yVar) {
        yVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        t tVar;
        k1.e.e(jVar, "call");
        if (this.f196f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f193b.f4769a.f4632j;
        b bVar = new b(list);
        z1.a aVar = this.f193b.f4769a;
        if (aVar.f4628c == null) {
            if (!list.contains(z1.g.f4668f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f193b.f4769a.h.d;
            H1.n nVar = H1.n.f525a;
            if (!H1.n.f525a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(q.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                t tVar2 = this.f193b;
                if (tVar2.f4769a.f4628c != null && tVar2.f4770b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f194c == null) {
                        tVar = this.f193b;
                        if (tVar.f4769a.f4628c == null && tVar.f4770b.type() == Proxy.Type.HTTP && this.f194c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f205q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                k1.e.e(this.f193b.f4771c, "inetSocketAddress");
                tVar = this.f193b;
                if (tVar.f4769a.f4628c == null) {
                }
                this.f205q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    A1.c.c(socket);
                }
                Socket socket2 = this.f194c;
                if (socket2 != null) {
                    A1.c.c(socket2);
                }
                this.d = null;
                this.f194c = null;
                this.h = null;
                this.i = null;
                this.f195e = null;
                this.f196f = null;
                this.f197g = null;
                this.f203o = 1;
                k1.e.e(this.f193b.f4771c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    H1.d.b(oVar.f209a, e2);
                    oVar.f210b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f151c) {
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
        t tVar = this.f193b;
        Proxy proxy = tVar.f4770b;
        z1.a aVar = tVar.f4769a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f190a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f4627b.createSocket();
            k1.e.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f194c = createSocket;
        InetSocketAddress inetSocketAddress = this.f193b.f4771c;
        k1.e.e(jVar, "call");
        k1.e.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            H1.n nVar = H1.n.f525a;
            H1.n.f525a.e(createSocket, this.f193b.f4771c, i);
            try {
                this.h = new M1.p(H1.d.s0(createSocket));
                this.i = new M1.o(H1.d.r0(createSocket));
            } catch (NullPointerException e2) {
                if (k1.e.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f193b.f4771c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        T0.m mVar = new T0.m(8);
        t tVar = this.f193b;
        z1.l lVar = tVar.f4769a.h;
        k1.e.e(lVar, "url");
        mVar.f1073a = lVar;
        mVar.r("CONNECT", null);
        z1.a aVar = tVar.f4769a;
        mVar.n("Host", A1.c.u(aVar.h, true));
        mVar.n("Proxy-Connection", "Keep-Alive");
        mVar.n("User-Agent", "okhttp/4.12.0");
        H.e b2 = mVar.b();
        C0191o c0191o = new C0191o(7);
        b1.g.a("Proxy-Authenticate");
        b1.g.c("OkHttp-Preemptive", "Proxy-Authenticate");
        c0191o.l("Proxy-Authenticate");
        c0191o.i("Proxy-Authenticate", "OkHttp-Preemptive");
        c0191o.j();
        aVar.f4630f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + A1.c.u((z1.l) b2.f483c, true) + " HTTP/1.1";
        M1.p pVar = this.h;
        k1.e.b(pVar);
        M1.o oVar = this.i;
        k1.e.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x b3 = pVar.f817a.b();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b3.g(j2, timeUnit);
        oVar.f814a.b().g(i3, timeUnit);
        pVar2.k((z1.j) b2.d, str);
        pVar2.a();
        r g2 = pVar2.g(false);
        k1.e.b(g2);
        g2.f4749a = b2;
        s a2 = g2.a();
        long i4 = A1.c.i(a2);
        if (i4 != -1) {
            F1.e j3 = pVar2.j(i4);
            A1.c.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a2.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(AbstractC0001b.f("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f4630f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f818b.a() || !oVar.f815b.a()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        z1.a aVar = this.f193b.f4769a;
        SSLSocketFactory sSLSocketFactory = aVar.f4628c;
        q qVar = q.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            q qVar2 = q.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(qVar2)) {
                this.d = this.f194c;
                this.f196f = qVar;
                return;
            } else {
                this.d = this.f194c;
                this.f196f = qVar2;
                l();
                return;
            }
        }
        k1.e.e(jVar, "call");
        z1.a aVar2 = this.f193b.f4769a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f4628c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            k1.e.b(sSLSocketFactory2);
            Socket socket = this.f194c;
            z1.l lVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, lVar.d, lVar.f4696e, true);
            k1.e.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                z1.g a2 = bVar.a(sSLSocket2);
                if (a2.f4670b) {
                    H1.n nVar = H1.n.f525a;
                    H1.n.f525a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                k1.e.d(session, "sslSocketSession");
                z1.i g2 = AbstractC0091d.g(session);
                HostnameVerifier hostnameVerifier = aVar2.d;
                k1.e.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.h.d, session)) {
                    z1.d dVar = aVar2.f4629e;
                    k1.e.b(dVar);
                    this.f195e = new z1.i(g2.f4682a, g2.f4683b, g2.f4684c, new l(dVar, g2, aVar2));
                    k1.e.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f4648a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f4670b) {
                        H1.n nVar2 = H1.n.f525a;
                        str = H1.n.f525a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new M1.p(H1.d.s0(sSLSocket2));
                    this.i = new M1.o(H1.d.r0(sSLSocket2));
                    if (str != null) {
                        qVar = b1.g.o(str);
                    }
                    this.f196f = qVar;
                    H1.n nVar3 = H1.n.f525a;
                    H1.n.f525a.a(sSLSocket2);
                    if (this.f196f == q.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = g2.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                k1.e.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                z1.d dVar2 = z1.d.f4647c;
                sb.append(AbstractC0091d.o(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = L1.c.a(x509Certificate, 7);
                List a5 = L1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(r1.e.w(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    H1.n nVar4 = H1.n.f525a;
                    H1.n.f525a.a(sSLSocket);
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
        z1.i iVar;
        byte[] bArr = A1.c.f13a;
        if (this.f204p.size() < this.f203o && !this.f198j) {
            t tVar = this.f193b;
            if (!tVar.f4769a.a(aVar)) {
                return false;
            }
            z1.l lVar = aVar.h;
            String str = lVar.d;
            z1.a aVar2 = tVar.f4769a;
            if (k1.e.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f197g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t tVar2 = (t) it.next();
                    Proxy.Type type = tVar2.f4770b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && tVar.f4770b.type() == type2) {
                        if (k1.e.a(tVar.f4771c, tVar2.f4771c)) {
                            if (aVar.d != L1.c.f784a) {
                                return false;
                            }
                            byte[] bArr2 = A1.c.f13a;
                            z1.l lVar2 = aVar2.h;
                            if (lVar.f4696e == lVar2.f4696e) {
                                String str2 = lVar2.d;
                                String str3 = lVar.d;
                                if (!k1.e.a(str3, str2)) {
                                    if (!this.f199k && (iVar = this.f195e) != null) {
                                        List a2 = iVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            k1.e.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    z1.d dVar = aVar.f4629e;
                                    k1.e.b(dVar);
                                    z1.i iVar2 = this.f195e;
                                    k1.e.b(iVar2);
                                    List a3 = iVar2.a();
                                    k1.e.e(str3, "hostname");
                                    k1.e.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f4648a.iterator();
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
        byte[] bArr = A1.c.f13a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f194c;
        k1.e.b(socket);
        Socket socket2 = this.d;
        k1.e.b(socket2);
        M1.p pVar = this.h;
        k1.e.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        G1.q qVar = this.f197g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f417f) {
                    return false;
                }
                if (qVar.f423n < qVar.f422m) {
                    if (nanoTime >= qVar.f424o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f205q;
        }
        if (j2 < 10000000000L || !z2) {
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

    public final E1.e j(z1.p pVar, E1.g gVar) {
        Socket socket = this.d;
        k1.e.b(socket);
        M1.p pVar2 = this.h;
        k1.e.b(pVar2);
        M1.o oVar = this.i;
        k1.e.b(oVar);
        G1.q qVar = this.f197g;
        if (qVar != null) {
            return new G1.r(pVar, this, gVar, qVar);
        }
        int i = gVar.f238g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar2.f817a.b().g(i, timeUnit);
        oVar.f814a.b().g(gVar.h, timeUnit);
        return new p(pVar, this, pVar2, oVar);
    }

    public final synchronized void k() {
        this.f198j = true;
    }

    public final void l() {
        Socket socket = this.d;
        k1.e.b(socket);
        M1.p pVar = this.h;
        k1.e.b(pVar);
        M1.o oVar = this.i;
        k1.e.b(oVar);
        socket.setSoTimeout(0);
        C1.d dVar = C1.d.h;
        G1.h hVar = new G1.h(dVar);
        String str = this.f193b.f4769a.h.d;
        k1.e.e(str, "peerName");
        hVar.f390b = socket;
        String str2 = A1.c.f18g + ' ' + str;
        k1.e.e(str2, "<set-?>");
        hVar.f391c = str2;
        hVar.d = pVar;
        hVar.f392e = oVar;
        hVar.f393f = this;
        G1.q qVar = new G1.q(hVar);
        this.f197g = qVar;
        D d = G1.q.f412z;
        int i = 4;
        this.f203o = (d.f363a & 16) != 0 ? d.f364b[4] : Integer.MAX_VALUE;
        z zVar = qVar.f432w;
        synchronized (zVar) {
            try {
                if (zVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = z.f469f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(A1.c.g(">> CONNECTION " + G1.g.f386a.b(), new Object[0]));
                }
                M1.o oVar2 = zVar.f470a;
                M1.i iVar = G1.g.f386a;
                oVar2.getClass();
                k1.e.e(iVar, "byteString");
                if (oVar2.f816c) {
                    throw new IllegalStateException("closed");
                }
                oVar2.f815b.y(iVar);
                oVar2.a();
                zVar.f470a.flush();
            } finally {
            }
        }
        z zVar2 = qVar.f432w;
        D d2 = qVar.f425p;
        synchronized (zVar2) {
            try {
                k1.e.e(d2, "settings");
                if (zVar2.d) {
                    throw new IOException("closed");
                }
                zVar2.j(0, Integer.bitCount(d2.f363a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & d2.f363a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        M1.o oVar3 = zVar2.f470a;
                        if (oVar3.f816c) {
                            throw new IllegalStateException("closed");
                        }
                        M1.f fVar = oVar3.f815b;
                        M1.q w2 = fVar.w(2);
                        int i4 = w2.f822c;
                        byte[] bArr = w2.f820a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        w2.f822c = i4 + 2;
                        fVar.f799b += 2;
                        oVar3.a();
                        zVar2.f470a.j(d2.f364b[i2]);
                    }
                    i2++;
                    i = 4;
                }
                zVar2.f470a.flush();
            } finally {
            }
        }
        if (qVar.f425p.a() != 65535) {
            qVar.f432w.t(0, r2 - 65535);
        }
        dVar.e().c(new C1.b(qVar.f415c, qVar.f433x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        t tVar = this.f193b;
        sb.append(tVar.f4769a.h.d);
        sb.append(':');
        sb.append(tVar.f4769a.h.f4696e);
        sb.append(", proxy=");
        sb.append(tVar.f4770b);
        sb.append(" hostAddress=");
        sb.append(tVar.f4771c);
        sb.append(" cipherSuite=");
        z1.i iVar = this.f195e;
        if (iVar == null || (obj = iVar.f4683b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f196f);
        sb.append('}');
        return sb.toString();
    }
}
