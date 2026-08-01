package x3;

import a4.a0;
import a4.e0;
import a4.r;
import a4.z;
import g4.o;
import g4.x;
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
import t3.p;
import t3.q;
import t3.s;
import t3.v;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l extends a4.j {

    /* renamed from: b, reason: collision with root package name */
    public final v f3929b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3930c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public t3.i f3931e;

    /* renamed from: f, reason: collision with root package name */
    public p f3932f;

    /* renamed from: g, reason: collision with root package name */
    public r f3933g;
    public g4.p h;
    public o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3934j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3935k;

    /* renamed from: l, reason: collision with root package name */
    public int f3936l;

    /* renamed from: m, reason: collision with root package name */
    public int f3937m;

    /* renamed from: n, reason: collision with root package name */
    public int f3938n;

    /* renamed from: o, reason: collision with root package name */
    public int f3939o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3940p;

    /* renamed from: q, reason: collision with root package name */
    public long f3941q;

    public l(m mVar, v vVar) {
        i3.d.e(mVar, "connectionPool");
        i3.d.e(vVar, "route");
        this.f3929b = vVar;
        this.f3939o = 1;
        this.f3940p = new ArrayList();
        this.f3941q = Long.MAX_VALUE;
    }

    public static void d(t3.o oVar, v vVar, IOException iOException) {
        i3.d.e(vVar, "failedRoute");
        i3.d.e(iOException, "failure");
        if (vVar.f3534b.type() != Proxy.Type.DIRECT) {
            t3.a aVar = vVar.f3533a;
            aVar.f3399g.connectFailed(aVar.h.g(), vVar.f3534b.address(), iOException);
        }
        q3.a aVar2 = oVar.D;
        synchronized (aVar2) {
            ((LinkedHashSet) aVar2.f3172a).add(vVar);
        }
    }

    @Override // a4.j
    public final synchronized void a(r rVar, e0 e0Var) {
        i3.d.e(e0Var, "settings");
        this.f3939o = (e0Var.f167a & 16) != 0 ? ((int[]) e0Var.f168b)[4] : Integer.MAX_VALUE;
    }

    @Override // a4.j
    public final void b(z zVar) {
        zVar.c(8, null);
    }

    public final void c(int i, int i4, int i5, boolean z4, i iVar) {
        v vVar;
        if (this.f3932f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3929b.f3533a.f3400j;
        b bVar = new b(list);
        t3.a aVar = this.f3929b.f3533a;
        if (aVar.f3396c == null) {
            if (!list.contains(t3.g.f3436f)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3929b.f3533a.h.d;
            b4.n nVar = b4.n.f853a;
            if (!b4.n.f853a.h(str)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(p.H2_PRIOR_KNOWLEDGE)) {
            throw new n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        n nVar2 = null;
        do {
            try {
                v vVar2 = this.f3929b;
                if (vVar2.f3533a.f3396c != null && vVar2.f3534b.type() == Proxy.Type.HTTP) {
                    f(i, i4, i5, iVar);
                    if (this.f3930c == null) {
                        vVar = this.f3929b;
                        if (vVar.f3533a.f3396c == null && vVar.f3534b.type() == Proxy.Type.HTTP && this.f3930c == null) {
                            throw new n(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3941q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i4, iVar);
                }
                g(bVar, iVar);
                i3.d.e(this.f3929b.f3535c, "inetSocketAddress");
                vVar = this.f3929b;
                if (vVar.f3533a.f3396c == null) {
                }
                this.f3941q = System.nanoTime();
                return;
            } catch (IOException e4) {
                Socket socket = this.d;
                if (socket != null) {
                    u3.b.c(socket);
                }
                Socket socket2 = this.f3930c;
                if (socket2 != null) {
                    u3.b.c(socket2);
                }
                this.d = null;
                this.f3930c = null;
                this.h = null;
                this.i = null;
                this.f3931e = null;
                this.f3932f = null;
                this.f3933g = null;
                this.f3939o = 1;
                i3.d.e(this.f3929b.f3535c, "inetSocketAddress");
                if (nVar2 == null) {
                    nVar2 = new n(e4);
                } else {
                    s.a.c(nVar2.f3945f, e4);
                    nVar2.f3946g = e4;
                }
                if (!z4) {
                    throw nVar2;
                }
                bVar.d = true;
                if (!bVar.f3893c) {
                    throw nVar2;
                }
                if (e4 instanceof ProtocolException) {
                    throw nVar2;
                }
                if (e4 instanceof InterruptedIOException) {
                    throw nVar2;
                }
                if ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) {
                    throw nVar2;
                }
                if (e4 instanceof SSLPeerUnverifiedException) {
                    throw nVar2;
                }
            }
        } while (e4 instanceof SSLException);
        throw nVar2;
    }

    public final void e(int i, int i4, i iVar) {
        Socket createSocket;
        v vVar = this.f3929b;
        Proxy proxy = vVar.f3534b;
        t3.a aVar = vVar.f3533a;
        Proxy.Type type = proxy.type();
        int i5 = type == null ? -1 : j.f3926a[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            createSocket = aVar.f3395b.createSocket();
            i3.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3930c = createSocket;
        i3.d.e(this.f3929b.f3535c, "inetSocketAddress");
        createSocket.setSoTimeout(i4);
        try {
            b4.n nVar = b4.n.f853a;
            b4.n.f853a.e(createSocket, this.f3929b.f3535c, i);
            try {
                this.h = new g4.p(b4.d.W(createSocket));
                this.i = new o(b4.d.V(createSocket));
            } catch (NullPointerException e4) {
                if (i3.d.a(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3929b.f3535c);
            connectException.initCause(e5);
            throw connectException;
        }
    }

    public final void f(int i, int i4, int i5, i iVar) {
        a0.k kVar = new a0.k(8);
        v vVar = this.f3929b;
        t3.k kVar2 = vVar.f3533a.h;
        i3.d.e(kVar2, "url");
        kVar.f97f = kVar2;
        kVar.q("CONNECT", null);
        t3.a aVar = vVar.f3533a;
        kVar.n("Host", u3.b.t(aVar.h, true));
        kVar.n("Proxy-Connection", "Keep-Alive");
        kVar.n("User-Agent", "okhttp/4.12.0");
        q d = kVar.d();
        q3.a aVar2 = new q3.a(5);
        r1.b.c("Proxy-Authenticate");
        r1.b.d("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar2.g("Proxy-Authenticate");
        aVar2.e("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.f();
        aVar.f3398f.getClass();
        t3.k kVar3 = d.f3506a;
        e(i, i4, iVar);
        String str = "CONNECT " + u3.b.t(kVar3, true) + " HTTP/1.1";
        g4.p pVar = this.h;
        i3.d.b(pVar);
        o oVar = this.i;
        i3.d.b(oVar);
        z3.e eVar = new z3.e(null, this, pVar, oVar);
        x a5 = pVar.f1949f.a();
        long j2 = i4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a5.g(j2);
        oVar.f1947f.a().g(i5);
        eVar.i(d.f3508c, str);
        eVar.a();
        t3.r e4 = eVar.e(false);
        i3.d.b(e4);
        e4.f3510a = d;
        s a6 = e4.a();
        int i6 = a6.i;
        long h = u3.b.h(a6);
        if (h != -1) {
            z3.c h5 = eVar.h(h);
            u3.b.r(h5, Integer.MAX_VALUE);
            h5.close();
        }
        if (i6 != 200) {
            if (i6 != 407) {
                throw new IOException(a4.b.f("Unexpected response code for CONNECT: ", i6));
            }
            aVar.f3398f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f1950g.n() || !oVar.f1948g.n()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i iVar) {
        SSLSocket sSLSocket;
        p pVar = p.HTTP_1_1;
        t3.a aVar = this.f3929b.f3533a;
        SSLSocketFactory sSLSocketFactory = aVar.f3396c;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            p pVar2 = p.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(pVar2)) {
                this.d = this.f3930c;
                this.f3932f = pVar;
                return;
            } else {
                this.d = this.f3930c;
                this.f3932f = pVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            i3.d.b(sSLSocketFactory);
            Socket socket = this.f3930c;
            t3.k kVar = aVar.h;
            Socket createSocket = sSLSocketFactory.createSocket(socket, kVar.d, kVar.f3458e, true);
            i3.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            t3.g a5 = bVar.a(sSLSocket);
            if (a5.f3438b) {
                b4.n nVar = b4.n.f853a;
                b4.n.f853a.d(sSLSocket, aVar.h.d, aVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            i3.d.d(session, "sslSocketSession");
            t3.i l4 = s.a.l(session);
            HostnameVerifier hostnameVerifier = aVar.d;
            i3.d.b(hostnameVerifier);
            if (hostnameVerifier.verify(aVar.h.d, session)) {
                t3.d dVar = aVar.f3397e;
                i3.d.b(dVar);
                this.f3931e = new t3.i(l4.f3450a, l4.f3451b, l4.f3452c, new k(dVar, l4, aVar));
                i3.d.e(aVar.h.d, "hostname");
                Iterator it = dVar.f3416a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (a5.f3438b) {
                    b4.n nVar2 = b4.n.f853a;
                    str = b4.n.f853a.f(sSLSocket);
                }
                this.d = sSLSocket;
                this.h = new g4.p(b4.d.W(sSLSocket));
                this.i = new o(b4.d.V(sSLSocket));
                if (str != null) {
                    pVar = r1.b.k(str);
                }
                this.f3932f = pVar;
                b4.n nVar3 = b4.n.f853a;
                b4.n.f853a.a(sSLSocket);
                if (this.f3932f == p.HTTP_2) {
                    l();
                    return;
                }
                return;
            }
            List a6 = l4.a();
            if (a6.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar.h.d + " not verified (no certificates)");
            }
            Object obj = a6.get(0);
            i3.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n              |Hostname ");
            sb.append(aVar.h.d);
            sb.append(" not verified:\n              |    certificate: ");
            t3.d dVar2 = t3.d.f3415c;
            sb.append(s.a.w(x509Certificate));
            sb.append("\n              |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n              |    subjectAltNames: ");
            List a7 = f4.c.a(x509Certificate, 7);
            List a8 = f4.c.a(x509Certificate, 2);
            ArrayList arrayList = new ArrayList(a8.size() + a7.size());
            arrayList.addAll(a7);
            arrayList.addAll(a8);
            sb.append(arrayList);
            sb.append("\n              ");
            throw new SSLPeerUnverifiedException(p3.e.l0(sb.toString()));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                b4.n nVar4 = b4.n.f853a;
                b4.n.f853a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                u3.b.c(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (f4.c.c(r6, (java.security.cert.X509Certificate) r12) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(t3.a aVar, List list) {
        t3.i iVar;
        t3.k kVar = aVar.h;
        byte[] bArr = u3.b.f3581a;
        if (this.f3940p.size() < this.f3939o && !this.f3934j) {
            v vVar = this.f3929b;
            t3.a aVar2 = vVar.f3533a;
            t3.a aVar3 = vVar.f3533a;
            if (aVar2.a(aVar)) {
                String str = kVar.d;
                String str2 = kVar.d;
                if (i3.d.a(str, aVar3.h.d)) {
                    return true;
                }
                if (this.f3933g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        v vVar2 = (v) it.next();
                        Proxy.Type type = vVar2.f3534b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && vVar.f3534b.type() == type2 && i3.d.a(vVar.f3535c, vVar2.f3535c)) {
                            if (aVar.d == f4.c.f1441a) {
                                byte[] bArr2 = u3.b.f3581a;
                                t3.k kVar2 = aVar3.h;
                                if (kVar.f3458e == kVar2.f3458e) {
                                    if (!i3.d.a(str2, kVar2.d)) {
                                        if (!this.f3935k && (iVar = this.f3931e) != null) {
                                            List a5 = iVar.a();
                                            if (!a5.isEmpty()) {
                                                Object obj = a5.get(0);
                                                i3.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        t3.d dVar = aVar.f3397e;
                                        i3.d.b(dVar);
                                        t3.i iVar2 = this.f3931e;
                                        i3.d.b(iVar2);
                                        List a6 = iVar2.a();
                                        i3.d.e(str2, "hostname");
                                        i3.d.e(a6, "peerCertificates");
                                        Iterator it2 = dVar.f3416a.iterator();
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

    public final boolean i(boolean z4) {
        long j2;
        byte[] bArr = u3.b.f3581a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3930c;
        i3.d.b(socket);
        Socket socket2 = this.d;
        i3.d.b(socket2);
        i3.d.b(this.h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        r rVar = this.f3933g;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f203k) {
                    return false;
                }
                if (rVar.f211s < rVar.f210r) {
                    if (nanoTime >= rVar.f212t) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3941q;
        }
        if (j2 < 10000000000L || !z4) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.m();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final y3.d j(t3.o oVar, y3.f fVar) {
        int i = fVar.f4119g;
        Socket socket = this.d;
        i3.d.b(socket);
        g4.p pVar = this.h;
        i3.d.b(pVar);
        o oVar2 = this.i;
        i3.d.b(oVar2);
        r rVar = this.f3933g;
        if (rVar != null) {
            return new a4.s(oVar, this, fVar, rVar);
        }
        socket.setSoTimeout(i);
        x a5 = pVar.f1949f.a();
        long j2 = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a5.g(j2);
        oVar2.f1947f.a().g(fVar.h);
        return new z3.e(oVar, this, pVar, oVar2);
    }

    public final synchronized void k() {
        this.f3934j = true;
    }

    public final void l() {
        Socket socket = this.d;
        i3.d.b(socket);
        g4.p pVar = this.h;
        i3.d.b(pVar);
        o oVar = this.i;
        i3.d.b(oVar);
        socket.setSoTimeout(0);
        w3.c cVar = w3.c.h;
        a4.h hVar = new a4.h(cVar);
        String str = this.f3929b.f3533a.h.d;
        i3.d.e(str, "peerName");
        hVar.f176b = socket;
        String str2 = u3.b.f3586g + ' ' + str;
        i3.d.e(str2, "<set-?>");
        hVar.f177c = str2;
        hVar.d = pVar;
        hVar.f178e = oVar;
        hVar.f179f = this;
        r rVar = new r(hVar);
        this.f3933g = rVar;
        e0 e0Var = r.E;
        this.f3939o = (e0Var.f167a & 16) != 0 ? ((int[]) e0Var.f168b)[4] : Integer.MAX_VALUE;
        a0 a0Var = rVar.B;
        synchronized (a0Var) {
            try {
                if (a0Var.i) {
                    throw new IOException("closed");
                }
                Logger logger = a0.f138k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(u3.b.f(">> CONNECTION " + a4.g.f172a.b(), new Object[0]));
                }
                a0Var.f139f.d(a4.g.f172a);
                a0Var.f139f.flush();
            } finally {
            }
        }
        a0 a0Var2 = rVar.B;
        e0 e0Var2 = rVar.f213u;
        synchronized (a0Var2) {
            try {
                i3.d.e(e0Var2, "settings");
                if (a0Var2.i) {
                    throw new IOException("closed");
                }
                a0Var2.o(0, Integer.bitCount(e0Var2.f167a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z4 = true;
                    if (((1 << i) & e0Var2.f167a) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        a0Var2.f139f.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        a0Var2.f139f.writeInt(((int[]) e0Var2.f168b)[i]);
                    }
                    i++;
                }
                a0Var2.f139f.flush();
            } finally {
            }
        }
        if (rVar.f213u.c() != 65535) {
            rVar.B.t(0, r1 - 65535);
        }
        cVar.e().c(new a4.p(rVar.h, rVar.C, 1), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        v vVar = this.f3929b;
        sb.append(vVar.f3533a.h.d);
        sb.append(':');
        sb.append(vVar.f3533a.h.f3458e);
        sb.append(", proxy=");
        sb.append(vVar.f3534b);
        sb.append(" hostAddress=");
        sb.append(vVar.f3535c);
        sb.append(" cipherSuite=");
        t3.i iVar = this.f3931e;
        if (iVar == null || (obj = iVar.f3451b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3932f);
        sb.append('}');
        return sb.toString();
    }
}
