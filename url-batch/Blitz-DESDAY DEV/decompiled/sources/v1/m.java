package v1;

import E1.x;
import h0.a0;
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
import l.C0176a0;
import l.C0212t;
import m.C0227a;
import r1.q;
import r1.r;
import r1.t;
import y1.w;

/* loaded from: classes.dex */
public final class m extends y1.h {

    /* renamed from: b, reason: collision with root package name */
    public final t f3891b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3892c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public r1.i f3893e;

    /* renamed from: f, reason: collision with root package name */
    public r1.p f3894f;

    /* renamed from: g, reason: collision with root package name */
    public y1.o f3895g;
    public E1.p h;
    public E1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3896j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3897k;

    /* renamed from: l, reason: collision with root package name */
    public int f3898l;

    /* renamed from: m, reason: collision with root package name */
    public int f3899m;

    /* renamed from: n, reason: collision with root package name */
    public int f3900n;

    /* renamed from: o, reason: collision with root package name */
    public int f3901o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3902p;

    /* renamed from: q, reason: collision with root package name */
    public long f3903q;

    public m(n nVar, t tVar) {
        g1.d.e(nVar, "connectionPool");
        g1.d.e(tVar, "route");
        this.f3891b = tVar;
        this.f3901o = 1;
        this.f3902p = new ArrayList();
        this.f3903q = Long.MAX_VALUE;
    }

    public static void d(r1.o oVar, t tVar, IOException iOException) {
        g1.d.e(tVar, "failedRoute");
        g1.d.e(iOException, "failure");
        if (tVar.f3559b.type() != Proxy.Type.DIRECT) {
            r1.a aVar = tVar.f3558a;
            aVar.f3434g.connectFailed(aVar.h.g(), tVar.f3559b.address(), iOException);
        }
        C0176a0 c0176a0 = oVar.f3528y;
        synchronized (c0176a0) {
            ((LinkedHashSet) c0176a0.f2962a).add(tVar);
        }
    }

    @Override // y1.h
    public final synchronized void a(y1.o oVar, J.i iVar) {
        g1.d.e(oVar, "connection");
        g1.d.e(iVar, "settings");
        this.f3901o = (iVar.f373a & 16) != 0 ? ((int[]) iVar.f374b)[4] : Integer.MAX_VALUE;
    }

    @Override // y1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        t tVar;
        g1.d.e(jVar, "call");
        if (this.f3894f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3891b.f3558a.f3435j;
        b bVar = new b(list);
        r1.a aVar = this.f3891b.f3558a;
        if (aVar.f3431c == null) {
            if (!list.contains(r1.g.f3471f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3891b.f3558a.h.d;
            z1.o oVar = z1.o.f4365a;
            if (!z1.o.f4365a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(r1.p.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar2 = null;
        do {
            try {
                t tVar2 = this.f3891b;
                if (tVar2.f3558a.f3431c != null && tVar2.f3559b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3892c == null) {
                        tVar = this.f3891b;
                        if (tVar.f3558a.f3431c == null && tVar.f3559b.type() == Proxy.Type.HTTP && this.f3892c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3903q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                g1.d.e(this.f3891b.f3560c, "inetSocketAddress");
                tVar = this.f3891b;
                if (tVar.f3558a.f3431c == null) {
                }
                this.f3903q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    s1.b.c(socket);
                }
                Socket socket2 = this.f3892c;
                if (socket2 != null) {
                    s1.b.c(socket2);
                }
                this.d = null;
                this.f3892c = null;
                this.h = null;
                this.i = null;
                this.f3893e = null;
                this.f3894f = null;
                this.f3895g = null;
                this.f3901o = 1;
                g1.d.e(this.f3891b.f3560c, "inetSocketAddress");
                if (oVar2 == null) {
                    oVar2 = new o(e2);
                } else {
                    z1.l.j(oVar2.f3907a, e2);
                    oVar2.f3908b = e2;
                }
                if (!z2) {
                    throw oVar2;
                }
                bVar.d = true;
                if (!bVar.f3849c) {
                    throw oVar2;
                }
                if (e2 instanceof ProtocolException) {
                    throw oVar2;
                }
                if (e2 instanceof InterruptedIOException) {
                    throw oVar2;
                }
                if ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) {
                    throw oVar2;
                }
                if (e2 instanceof SSLPeerUnverifiedException) {
                    throw oVar2;
                }
            }
        } while (e2 instanceof SSLException);
        throw oVar2;
    }

    public final void e(int i, int i2, j jVar) {
        Socket createSocket;
        t tVar = this.f3891b;
        Proxy proxy = tVar.f3559b;
        r1.a aVar = tVar.f3558a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3888a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f3430b.createSocket();
            g1.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3892c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3891b.f3560c;
        g1.d.e(jVar, "call");
        g1.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            z1.o oVar = z1.o.f4365a;
            z1.o.f4365a.e(createSocket, this.f3891b.f3560c, i);
            try {
                this.h = new E1.p(z1.d.e0(createSocket));
                this.i = new E1.o(z1.d.d0(createSocket));
            } catch (NullPointerException e2) {
                if (g1.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3891b.f3560c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        T0.g gVar = new T0.g(7);
        t tVar = this.f3891b;
        r1.l lVar = tVar.f3558a.h;
        g1.d.e(lVar, "url");
        gVar.f824a = lVar;
        gVar.o("CONNECT", null);
        r1.a aVar = tVar.f3558a;
        gVar.k("Host", s1.b.u(aVar.h, true));
        gVar.k("Proxy-Connection", "Keep-Alive");
        gVar.k("User-Agent", "okhttp/4.12.0");
        J.d b2 = gVar.b();
        C0176a0 c0176a0 = new C0176a0(2);
        C0227a.b("Proxy-Authenticate");
        C0227a.d("OkHttp-Preemptive", "Proxy-Authenticate");
        c0176a0.h("Proxy-Authenticate");
        c0176a0.f("Proxy-Authenticate", "OkHttp-Preemptive");
        c0176a0.g();
        aVar.f3433f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + s1.b.u((r1.l) b2.f359c, true) + " HTTP/1.1";
        E1.p pVar = this.h;
        g1.d.b(pVar);
        E1.o oVar = this.i;
        g1.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f220a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f217a.a().g(i3, timeUnit);
        pVar2.k((r1.j) b2.d, str);
        pVar2.a();
        q f2 = pVar2.f(false);
        g1.d.b(f2);
        f2.f3535a = b2;
        r a3 = f2.a();
        long i4 = s1.b.i(a3);
        if (i4 != -1) {
            x1.d j3 = pVar2.j(i4);
            s1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(X0.a.e("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f3433f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f221b.g() || !oVar.f218b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        r1.a aVar = this.f3891b.f3558a;
        SSLSocketFactory sSLSocketFactory = aVar.f3431c;
        r1.p pVar = r1.p.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            r1.p pVar2 = r1.p.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(pVar2)) {
                this.d = this.f3892c;
                this.f3894f = pVar;
                return;
            } else {
                this.d = this.f3892c;
                this.f3894f = pVar2;
                l();
                return;
            }
        }
        g1.d.e(jVar, "call");
        r1.a aVar2 = this.f3891b.f3558a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f3431c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            g1.d.b(sSLSocketFactory2);
            Socket socket = this.f3892c;
            r1.l lVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, lVar.d, lVar.f3499e, true);
            g1.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                r1.g a2 = bVar.a(sSLSocket2);
                if (a2.f3473b) {
                    z1.o oVar = z1.o.f4365a;
                    z1.o.f4365a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                g1.d.d(session, "sslSocketSession");
                r1.i j2 = a0.j(session);
                D1.c cVar = aVar2.d;
                g1.d.b(cVar);
                if (!cVar.verify(aVar2.h.d, session)) {
                    List a3 = j2.a();
                    if (a3.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                    }
                    Object obj = a3.get(0);
                    g1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(aVar2.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    r1.d dVar = r1.d.f3450c;
                    sb.append(a0.o(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(X0.j.D0(D1.c.a(x509Certificate, 7), D1.c.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(n1.e.w(sb.toString()));
                }
                r1.d dVar2 = aVar2.f3432e;
                g1.d.b(dVar2);
                this.f3893e = new r1.i(j2.f3485a, j2.f3486b, j2.f3487c, new l(dVar2, j2, aVar2));
                g1.d.e(aVar2.h.d, "hostname");
                Iterator it = dVar2.f3451a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (a2.f3473b) {
                    z1.o oVar2 = z1.o.f4365a;
                    str = z1.o.f4365a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                this.h = new E1.p(z1.d.e0(sSLSocket2));
                this.i = new E1.o(z1.d.d0(sSLSocket2));
                if (str != null) {
                    pVar = C0227a.j(str);
                }
                this.f3894f = pVar;
                z1.o oVar3 = z1.o.f4365a;
                z1.o.f4365a.a(sSLSocket2);
                if (this.f3894f == r1.p.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    z1.o oVar4 = z1.o.f4365a;
                    z1.o.f4365a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    s1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (D1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(r1.a aVar, ArrayList arrayList) {
        r1.i iVar;
        byte[] bArr = s1.b.f3607a;
        if (this.f3902p.size() < this.f3901o && !this.f3896j) {
            t tVar = this.f3891b;
            if (!tVar.f3558a.a(aVar)) {
                return false;
            }
            r1.l lVar = aVar.h;
            String str = lVar.d;
            r1.a aVar2 = tVar.f3558a;
            if (g1.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3895g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t tVar2 = (t) it.next();
                    Proxy.Type type = tVar2.f3559b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && tVar.f3559b.type() == type2) {
                        if (g1.d.a(tVar.f3560c, tVar2.f3560c)) {
                            if (aVar.d != D1.c.f159a) {
                                return false;
                            }
                            byte[] bArr2 = s1.b.f3607a;
                            r1.l lVar2 = aVar2.h;
                            if (lVar.f3499e == lVar2.f3499e) {
                                String str2 = lVar2.d;
                                String str3 = lVar.d;
                                if (!g1.d.a(str3, str2)) {
                                    if (!this.f3897k && (iVar = this.f3893e) != null) {
                                        List a2 = iVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            g1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    r1.d dVar = aVar.f3432e;
                                    g1.d.b(dVar);
                                    r1.i iVar2 = this.f3893e;
                                    g1.d.b(iVar2);
                                    List a3 = iVar2.a();
                                    g1.d.e(str3, "hostname");
                                    g1.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f3451a.iterator();
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
        byte[] bArr = s1.b.f3607a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3892c;
        g1.d.b(socket);
        Socket socket2 = this.d;
        g1.d.b(socket2);
        E1.p pVar = this.h;
        g1.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        y1.o oVar = this.f3895g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f4242f) {
                    return false;
                }
                if (oVar.f4248n < oVar.f4247m) {
                    if (nanoTime >= oVar.f4249o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3903q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !pVar.g();
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

    public final w1.d j(r1.o oVar, w1.f fVar) {
        Socket socket = this.d;
        g1.d.b(socket);
        E1.p pVar = this.h;
        g1.d.b(pVar);
        E1.o oVar2 = this.i;
        g1.d.b(oVar2);
        y1.o oVar3 = this.f3895g;
        if (oVar3 != null) {
            return new y1.p(oVar, this, fVar, oVar3);
        }
        int i = fVar.f3947g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f220a.a().g(i, timeUnit);
        oVar2.f217a.a().g(fVar.h, timeUnit);
        return new p(oVar, this, pVar, oVar2);
    }

    public final synchronized void k() {
        this.f3896j = true;
    }

    public final void l() {
        Socket socket = this.d;
        g1.d.b(socket);
        E1.p pVar = this.h;
        g1.d.b(pVar);
        E1.o oVar = this.i;
        g1.d.b(oVar);
        socket.setSoTimeout(0);
        u1.d dVar = u1.d.h;
        C0212t c0212t = new C0212t(dVar);
        String str = this.f3891b.f3558a.h.d;
        g1.d.e(str, "peerName");
        c0212t.f3064b = socket;
        String str2 = s1.b.f3612g + ' ' + str;
        g1.d.e(str2, "<set-?>");
        c0212t.f3065c = str2;
        c0212t.d = pVar;
        c0212t.f3066e = oVar;
        c0212t.f3067f = this;
        y1.o oVar2 = new y1.o(c0212t);
        this.f3895g = oVar2;
        J.i iVar = y1.o.f4237z;
        int i = 4;
        this.f3901o = (iVar.f373a & 16) != 0 ? ((int[]) iVar.f374b)[4] : Integer.MAX_VALUE;
        y1.x xVar = oVar2.f4257w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = y1.x.f4294f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(s1.b.g(">> CONNECTION " + y1.f.f4216a.b(), new Object[0]));
                }
                E1.o oVar3 = xVar.f4295a;
                E1.i iVar2 = y1.f.f4216a;
                oVar3.getClass();
                g1.d.e(iVar2, "byteString");
                if (oVar3.f219c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f218b.s(iVar2);
                oVar3.g();
                xVar.f4295a.flush();
            } finally {
            }
        }
        y1.x xVar2 = oVar2.f4257w;
        J.i iVar3 = oVar2.f4250p;
        synchronized (xVar2) {
            try {
                g1.d.e(iVar3, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(iVar3.f373a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & iVar3.f373a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        E1.o oVar4 = xVar2.f4295a;
                        if (oVar4.f219c) {
                            throw new IllegalStateException("closed");
                        }
                        E1.f fVar = oVar4.f218b;
                        E1.q q2 = fVar.q(2);
                        int i4 = q2.f225c;
                        byte[] bArr = q2.f223a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f225c = i4 + 2;
                        fVar.f202b += 2;
                        oVar4.g();
                        xVar2.f4295a.i(((int[]) iVar3.f374b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f4295a.flush();
            } finally {
            }
        }
        if (oVar2.f4250p.f() != 65535) {
            oVar2.f4257w.n(0, r2 - 65535);
        }
        dVar.e().c(new u1.b(oVar2.f4240c, oVar2.f4258x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        t tVar = this.f3891b;
        sb.append(tVar.f3558a.h.d);
        sb.append(':');
        sb.append(tVar.f3558a.h.f3499e);
        sb.append(", proxy=");
        sb.append(tVar.f3559b);
        sb.append(" hostAddress=");
        sb.append(tVar.f3560c);
        sb.append(" cipherSuite=");
        r1.i iVar = this.f3893e;
        if (iVar == null || (obj = iVar.f3486b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3894f);
        sb.append('}');
        return sb.toString();
    }
}
