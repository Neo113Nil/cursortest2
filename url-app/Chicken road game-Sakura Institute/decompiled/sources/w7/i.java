package w7;

import a0.m;
import a8.o;
import f8.a0;
import f8.i0;
import f8.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
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
import l1.x;
import s7.l;
import s7.p;
import s7.q;
import s7.r;
import s7.s;
import s7.v;
import z7.n;
import z7.w;
import z7.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends z7.h {

    /* renamed from: b, reason: collision with root package name */
    public final v f9567b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f9568c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f9569d;

    /* renamed from: e, reason: collision with root package name */
    public s7.j f9570e;

    /* renamed from: f, reason: collision with root package name */
    public q f9571f;

    /* renamed from: g, reason: collision with root package name */
    public n f9572g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f9573h;

    /* renamed from: i, reason: collision with root package name */
    public y f9574i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9575j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9576k;

    /* renamed from: l, reason: collision with root package name */
    public int f9577l;

    /* renamed from: m, reason: collision with root package name */
    public int f9578m;

    /* renamed from: n, reason: collision with root package name */
    public int f9579n;

    /* renamed from: o, reason: collision with root package name */
    public int f9580o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f9581p;

    /* renamed from: q, reason: collision with root package name */
    public long f9582q;

    public i(j jVar, v vVar) {
        r6.k.f(jVar, "connectionPool");
        r6.k.f(vVar, "route");
        this.f9567b = vVar;
        this.f9580o = 1;
        this.f9581p = new ArrayList();
        this.f9582q = Long.MAX_VALUE;
    }

    public static void d(p pVar, v vVar, IOException iOException) {
        r6.k.f(pVar, "client");
        r6.k.f(vVar, "failedRoute");
        r6.k.f(iOException, "failure");
        if (vVar.f8699b.type() != Proxy.Type.DIRECT) {
            s7.a aVar = vVar.f8698a;
            aVar.f8535g.connectFailed(aVar.f8536h.g(), vVar.f8699b.address(), iOException);
        }
        x xVar = pVar.D;
        synchronized (xVar) {
            ((LinkedHashSet) xVar.f5847g).add(vVar);
        }
    }

    @Override // z7.h
    public final synchronized void a(n nVar, z zVar) {
        r6.k.f(zVar, "settings");
        this.f9580o = (zVar.f10255a & 16) != 0 ? zVar.f10256b[4] : Integer.MAX_VALUE;
    }

    @Override // z7.h
    public final void b(z7.v vVar) {
        vVar.c(8, null);
    }

    public final void c(int i7, int i8, int i9, boolean z8, g gVar) {
        v vVar;
        if (this.f9571f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f9567b.f8698a.f8538j;
        b bVar = new b(list);
        s7.a aVar = this.f9567b.f8698a;
        if (aVar.f8531c == null) {
            if (!list.contains(s7.h.f8584f)) {
                throw new k(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f9567b.f8698a.f8536h.f8611d;
            o oVar = o.f570a;
            if (!o.f570a.h(str)) {
                throw new k(new UnknownServiceException(m.j("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f8537i.contains(q.f8666k)) {
            throw new k(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        k kVar = null;
        do {
            try {
                v vVar2 = this.f9567b;
                if (vVar2.f8698a.f8531c != null && vVar2.f8699b.type() == Proxy.Type.HTTP) {
                    f(i7, i8, i9, gVar);
                    if (this.f9568c == null) {
                        vVar = this.f9567b;
                        if (vVar.f8698a.f8531c == null && vVar.f8699b.type() == Proxy.Type.HTTP && this.f9568c == null) {
                            throw new k(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f9582q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i7, i8, gVar);
                }
                g(bVar, gVar);
                r6.k.f(this.f9567b.f8700c, "inetSocketAddress");
                vVar = this.f9567b;
                if (vVar.f8698a.f8531c == null) {
                }
                this.f9582q = System.nanoTime();
                return;
            } catch (IOException e9) {
                Socket socket = this.f9569d;
                if (socket != null) {
                    t7.b.d(socket);
                }
                Socket socket2 = this.f9568c;
                if (socket2 != null) {
                    t7.b.d(socket2);
                }
                this.f9569d = null;
                this.f9568c = null;
                this.f9573h = null;
                this.f9574i = null;
                this.f9570e = null;
                this.f9571f = null;
                this.f9572g = null;
                this.f9580o = 1;
                r6.k.f(this.f9567b.f8700c, "inetSocketAddress");
                if (kVar == null) {
                    kVar = new k(e9);
                } else {
                    d6.a.a(kVar.f9587f, e9);
                    kVar.f9588g = e9;
                }
                if (!z8) {
                    throw kVar;
                }
                bVar.f9533d = true;
                if (!bVar.f9532c) {
                    throw kVar;
                }
                if (e9 instanceof ProtocolException) {
                    throw kVar;
                }
                if (e9 instanceof InterruptedIOException) {
                    throw kVar;
                }
                if ((e9 instanceof SSLHandshakeException) && (e9.getCause() instanceof CertificateException)) {
                    throw kVar;
                }
                if (e9 instanceof SSLPeerUnverifiedException) {
                    throw kVar;
                }
            }
        } while (e9 instanceof SSLException);
        throw kVar;
    }

    public final void e(int i7, int i8, g gVar) {
        Socket createSocket;
        v vVar = this.f9567b;
        Proxy proxy = vVar.f8699b;
        s7.a aVar = vVar.f8698a;
        Proxy.Type type = proxy.type();
        int i9 = type == null ? -1 : h.f9566a[type.ordinal()];
        if (i9 == 1 || i9 == 2) {
            createSocket = aVar.f8530b.createSocket();
            r6.k.c(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f9568c = createSocket;
        r6.k.f(this.f9567b.f8700c, "inetSocketAddress");
        createSocket.setSoTimeout(i8);
        try {
            o oVar = o.f570a;
            o.f570a.e(createSocket, this.f9567b.f8700c, i7);
            try {
                this.f9573h = a8.d.n(a8.d.b0(createSocket));
                this.f9574i = new y(a8.d.Z(createSocket));
            } catch (NullPointerException e9) {
                if (r6.k.a(e9.getMessage(), "throw with null exception")) {
                    throw new IOException(e9);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f9567b.f8700c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void f(int i7, int i8, int i9, g gVar) {
        g3.k kVar = new g3.k(8);
        v vVar = this.f9567b;
        l lVar = vVar.f8698a.f8536h;
        r6.k.f(lVar, "url");
        kVar.f4160g = lVar;
        kVar.v("CONNECT", null);
        s7.a aVar = vVar.f8698a;
        kVar.t("Host", t7.b.u(aVar.f8536h, true));
        kVar.t("Proxy-Connection", "Keep-Alive");
        kVar.t("User-Agent", "okhttp/4.12.0");
        a2.q m8 = kVar.m();
        f1.g gVar2 = new f1.g(6);
        a8.d.t("Proxy-Authenticate");
        a8.d.u("OkHttp-Preemptive", "Proxy-Authenticate");
        gVar2.p("Proxy-Authenticate");
        gVar2.c("Proxy-Authenticate", "OkHttp-Preemptive");
        gVar2.d();
        aVar.f8534f.getClass();
        l lVar2 = (l) m8.f436c;
        e(i7, i8, gVar);
        String str = "CONNECT " + t7.b.u(lVar2, true) + " HTTP/1.1";
        a0 a0Var = this.f9573h;
        r6.k.c(a0Var);
        y yVar = this.f9574i;
        r6.k.c(yVar);
        y7.e eVar = new y7.e(null, this, a0Var, yVar);
        i0 a3 = a0Var.f3568f.a();
        long j8 = i8;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a3.g(j8);
        yVar.f3648f.a().g(i9);
        eVar.i((s7.k) m8.f438e, str);
        eVar.c();
        r f9 = eVar.f(false);
        r6.k.c(f9);
        f9.f8670a = m8;
        s a9 = f9.a();
        int i10 = a9.f8686i;
        long i11 = t7.b.i(a9);
        if (i11 != -1) {
            y7.c h3 = eVar.h(i11);
            t7.b.s(h3, Integer.MAX_VALUE);
            h3.close();
        }
        if (i10 != 200) {
            if (i10 != 407) {
                throw new IOException(m.i("Unexpected response code for CONNECT: ", i10));
            }
            aVar.f8534f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!a0Var.f3569g.c() || !yVar.f3649g.c()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, g gVar) {
        SSLSocket sSLSocket;
        q qVar = q.f8663h;
        s7.a aVar = this.f9567b.f8698a;
        SSLSocketFactory sSLSocketFactory = aVar.f8531c;
        if (sSLSocketFactory == null) {
            List list = aVar.f8537i;
            q qVar2 = q.f8666k;
            if (!list.contains(qVar2)) {
                this.f9569d = this.f9568c;
                this.f9571f = qVar;
                return;
            } else {
                this.f9569d = this.f9568c;
                this.f9571f = qVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            r6.k.c(sSLSocketFactory);
            Socket socket = this.f9568c;
            l lVar = aVar.f8536h;
            Socket createSocket = sSLSocketFactory.createSocket(socket, lVar.f8611d, lVar.f8612e, true);
            r6.k.d(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            s7.h a3 = bVar.a(sSLSocket);
            if (a3.f8586b) {
                o oVar = o.f570a;
                o.f570a.d(sSLSocket, aVar.f8536h.f8611d, aVar.f8537i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            r6.k.e(session, "sslSocketSession");
            s7.j u8 = a.a.u(session);
            HostnameVerifier hostnameVerifier = aVar.f8532d;
            r6.k.c(hostnameVerifier);
            boolean verify = hostnameVerifier.verify(aVar.f8536h.f8611d, session);
            int i7 = 7;
            if (!verify) {
                List a9 = u8.a();
                if (a9.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.f8536h.f8611d + " not verified (no certificates)");
                }
                Object obj = a9.get(0);
                r6.k.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar.f8536h.f8611d);
                sb.append(" not verified:\n              |    certificate: ");
                s7.d dVar = s7.d.f8556c;
                sb.append(r4.a.P(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(e6.l.r0(e8.c.a(x509Certificate, 7), e8.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(z6.i.n(sb.toString()));
            }
            s7.d dVar2 = aVar.f8533e;
            r6.k.c(dVar2);
            this.f9570e = new s7.j(u8.f8602a, u8.f8603b, u8.f8604c, new m.h(dVar2, u8, aVar, i7));
            r6.k.f(aVar.f8536h.f8611d, "hostname");
            Iterator it = dVar2.f8557a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (a3.f8586b) {
                o oVar2 = o.f570a;
                str = o.f570a.f(sSLSocket);
            }
            this.f9569d = sSLSocket;
            this.f9573h = a8.d.n(a8.d.b0(sSLSocket));
            this.f9574i = new y(a8.d.Z(sSLSocket));
            if (str != null) {
                qVar = j1.c.W(str);
            }
            this.f9571f = qVar;
            o oVar3 = o.f570a;
            o.f570a.a(sSLSocket);
            if (this.f9571f == q.f8665j) {
                l();
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                o oVar4 = o.f570a;
                o.f570a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                t7.b.d(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (e8.c.c(r6, (java.security.cert.X509Certificate) r12) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(s7.a aVar, List list) {
        s7.j jVar;
        l lVar = aVar.f8536h;
        byte[] bArr = t7.b.f8932a;
        if (this.f9581p.size() < this.f9580o && !this.f9575j) {
            v vVar = this.f9567b;
            s7.a aVar2 = vVar.f8698a;
            s7.a aVar3 = vVar.f8698a;
            if (aVar2.a(aVar)) {
                String str = lVar.f8611d;
                String str2 = lVar.f8611d;
                if (r6.k.a(str, aVar3.f8536h.f8611d)) {
                    return true;
                }
                if (this.f9572g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        v vVar2 = (v) it.next();
                        Proxy.Type type = vVar2.f8699b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && vVar.f8699b.type() == type2 && r6.k.a(vVar.f8700c, vVar2.f8700c)) {
                            if (aVar.f8532d == e8.c.f2891a) {
                                byte[] bArr2 = t7.b.f8932a;
                                l lVar2 = aVar3.f8536h;
                                if (lVar.f8612e == lVar2.f8612e) {
                                    if (!r6.k.a(str2, lVar2.f8611d)) {
                                        if (!this.f9576k && (jVar = this.f9570e) != null) {
                                            List a3 = jVar.a();
                                            if (!a3.isEmpty()) {
                                                Object obj = a3.get(0);
                                                r6.k.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        s7.d dVar = aVar.f8533e;
                                        r6.k.c(dVar);
                                        s7.j jVar2 = this.f9570e;
                                        r6.k.c(jVar2);
                                        List a9 = jVar2.a();
                                        r6.k.f(str2, "hostname");
                                        r6.k.f(a9, "peerCertificates");
                                        Iterator it2 = dVar.f8557a.iterator();
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
        }
        return false;
    }

    public final boolean i(boolean z8) {
        long j8;
        byte[] bArr = t7.b.f8932a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f9568c;
        r6.k.c(socket);
        Socket socket2 = this.f9569d;
        r6.k.c(socket2);
        r6.k.c(this.f9573h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        n nVar = this.f9572g;
        if (nVar != null) {
            synchronized (nVar) {
                if (nVar.f10186k) {
                    return false;
                }
                if (nVar.f10194s < nVar.f10193r) {
                    if (nanoTime >= nVar.f10195t) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j8 = nanoTime - this.f9582q;
        }
        if (j8 < 10000000000L || !z8) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final x7.d j(p pVar, x7.f fVar) {
        r6.k.f(pVar, "client");
        int i7 = fVar.f9694g;
        Socket socket = this.f9569d;
        r6.k.c(socket);
        a0 a0Var = this.f9573h;
        r6.k.c(a0Var);
        y yVar = this.f9574i;
        r6.k.c(yVar);
        n nVar = this.f9572g;
        if (nVar != null) {
            return new z7.o(pVar, this, fVar, nVar);
        }
        socket.setSoTimeout(i7);
        i0 a3 = a0Var.f3568f.a();
        long j8 = i7;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a3.g(j8);
        yVar.f3648f.a().g(fVar.f9695h);
        return new y7.e(pVar, this, a0Var, yVar);
    }

    public final synchronized void k() {
        this.f9575j = true;
    }

    public final void l() {
        Socket socket = this.f9569d;
        r6.k.c(socket);
        a0 a0Var = this.f9573h;
        r6.k.c(a0Var);
        y yVar = this.f9574i;
        r6.k.c(yVar);
        socket.setSoTimeout(0);
        v7.d dVar = v7.d.f9171h;
        e5.v vVar = new e5.v(dVar);
        String str = this.f9567b.f8698a.f8536h.f8611d;
        r6.k.f(str, "peerName");
        vVar.f2801b = socket;
        String str2 = t7.b.f8938g + ' ' + str;
        r6.k.f(str2, "<set-?>");
        vVar.f2802c = str2;
        vVar.f2803d = a0Var;
        vVar.f2804e = yVar;
        vVar.f2805f = this;
        n nVar = new n(vVar);
        this.f9572g = nVar;
        z zVar = n.E;
        this.f9580o = (zVar.f10255a & 16) != 0 ? zVar.f10256b[4] : Integer.MAX_VALUE;
        w wVar = nVar.B;
        synchronized (wVar) {
            try {
                if (wVar.f10249i) {
                    throw new IOException("closed");
                }
                Logger logger = w.f10245k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(t7.b.g(">> CONNECTION " + z7.f.f10159a.g(), new Object[0]));
                }
                wVar.f10246f.P(z7.f.f10159a);
                wVar.f10246f.flush();
            } finally {
            }
        }
        w wVar2 = nVar.B;
        z zVar2 = nVar.f10196u;
        synchronized (wVar2) {
            try {
                r6.k.f(zVar2, "settings");
                if (wVar2.f10249i) {
                    throw new IOException("closed");
                }
                wVar2.k(0, Integer.bitCount(zVar2.f10255a) * 6, 4, 0);
                int i7 = 0;
                while (i7 < 10) {
                    boolean z8 = true;
                    if (((1 << i7) & zVar2.f10255a) == 0) {
                        z8 = false;
                    }
                    if (z8) {
                        wVar2.f10246f.writeShort(i7 != 4 ? i7 != 7 ? i7 : 4 : 3);
                        wVar2.f10246f.writeInt(zVar2.f10256b[i7]);
                    }
                    i7++;
                }
                wVar2.f10246f.flush();
            } finally {
            }
        }
        if (nVar.f10196u.a() != 65535) {
            nVar.B.z(r1 - 65535, 0);
        }
        dVar.e().c(new v7.b(nVar.f10183h, nVar.C, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        v vVar = this.f9567b;
        sb.append(vVar.f8698a.f8536h.f8611d);
        sb.append(':');
        sb.append(vVar.f8698a.f8536h.f8612e);
        sb.append(", proxy=");
        sb.append(vVar.f8699b);
        sb.append(" hostAddress=");
        sb.append(vVar.f8700c);
        sb.append(" cipherSuite=");
        s7.j jVar = this.f9570e;
        if (jVar == null || (obj = jVar.f8603b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f9571f);
        sb.append('}');
        return sb.toString();
    }
}
