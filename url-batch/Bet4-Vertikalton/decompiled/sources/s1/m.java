package s1;

import B1.x;
import Y.V;
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
import l.C0232s;
import l.Z;
import m.C0260a;
import o1.q;
import o1.r;
import o1.s;
import o1.u;
import v1.w;

/* loaded from: classes.dex */
public final class m extends v1.h {

    /* renamed from: b, reason: collision with root package name */
    public final u f3735b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3736c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public o1.i f3737e;

    /* renamed from: f, reason: collision with root package name */
    public q f3738f;

    /* renamed from: g, reason: collision with root package name */
    public v1.o f3739g;
    public B1.p h;
    public B1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3740j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3741k;

    /* renamed from: l, reason: collision with root package name */
    public int f3742l;

    /* renamed from: m, reason: collision with root package name */
    public int f3743m;

    /* renamed from: n, reason: collision with root package name */
    public int f3744n;

    /* renamed from: o, reason: collision with root package name */
    public int f3745o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3746p;

    /* renamed from: q, reason: collision with root package name */
    public long f3747q;

    public m(n nVar, u uVar) {
        d1.d.e(nVar, "connectionPool");
        d1.d.e(uVar, "route");
        this.f3735b = uVar;
        this.f3745o = 1;
        this.f3746p = new ArrayList();
        this.f3747q = Long.MAX_VALUE;
    }

    public static void d(o1.p pVar, u uVar, IOException iOException) {
        d1.d.e(uVar, "failedRoute");
        d1.d.e(iOException, "failure");
        if (uVar.f3397b.type() != Proxy.Type.DIRECT) {
            o1.a aVar = uVar.f3396a;
            aVar.f3255g.connectFailed(aVar.h.g(), uVar.f3397b.address(), iOException);
        }
        Z z2 = pVar.f3366y;
        synchronized (z2) {
            ((LinkedHashSet) z2.f2878a).add(uVar);
        }
    }

    @Override // v1.h
    public final synchronized void a(v1.o oVar, H.j jVar) {
        d1.d.e(oVar, "connection");
        d1.d.e(jVar, "settings");
        this.f3745o = (jVar.f275a & 16) != 0 ? ((int[]) jVar.f276b)[4] : Integer.MAX_VALUE;
    }

    @Override // v1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        u uVar;
        d1.d.e(jVar, "call");
        if (this.f3738f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3735b.f3396a.f3256j;
        b bVar = new b(list);
        o1.a aVar = this.f3735b.f3396a;
        if (aVar.f3252c == null) {
            if (!list.contains(o1.g.f3292f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3735b.f3396a.h.d;
            w1.n nVar = w1.n.f4190a;
            if (!w1.n.f4190a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(q.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                u uVar2 = this.f3735b;
                if (uVar2.f3396a.f3252c != null && uVar2.f3397b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3736c == null) {
                        uVar = this.f3735b;
                        if (uVar.f3396a.f3252c == null && uVar.f3397b.type() == Proxy.Type.HTTP && this.f3736c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3747q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                d1.d.e(this.f3735b.f3398c, "inetSocketAddress");
                uVar = this.f3735b;
                if (uVar.f3396a.f3252c == null) {
                }
                this.f3747q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    p1.b.c(socket);
                }
                Socket socket2 = this.f3736c;
                if (socket2 != null) {
                    p1.b.c(socket2);
                }
                this.d = null;
                this.f3736c = null;
                this.h = null;
                this.i = null;
                this.f3737e = null;
                this.f3738f = null;
                this.f3739g = null;
                this.f3745o = 1;
                d1.d.e(this.f3735b.f3398c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    w1.d.d(oVar.f3751a, e2);
                    oVar.f3752b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3693c) {
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
        u uVar = this.f3735b;
        Proxy proxy = uVar.f3397b;
        o1.a aVar = uVar.f3396a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3732a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f3251b.createSocket();
            d1.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3736c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3735b.f3398c;
        d1.d.e(jVar, "call");
        d1.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            w1.n nVar = w1.n.f4190a;
            w1.n.f4190a.e(createSocket, this.f3735b.f3398c, i);
            try {
                this.h = new B1.p(w1.d.t0(createSocket));
                this.i = new B1.o(w1.d.s0(createSocket));
            } catch (NullPointerException e2) {
                if (d1.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3735b.f3398c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        U.u uVar = new U.u(6);
        u uVar2 = this.f3735b;
        o1.l lVar = uVar2.f3396a.h;
        d1.d.e(lVar, "url");
        uVar.f874a = lVar;
        uVar.o("CONNECT", null);
        o1.a aVar = uVar2.f3396a;
        uVar.k("Host", p1.b.u(aVar.h, true));
        uVar.k("Proxy-Connection", "Keep-Alive");
        uVar.k("User-Agent", "okhttp/4.12.0");
        H.e b2 = uVar.b();
        Z z2 = new Z(2);
        C0260a.a("Proxy-Authenticate");
        C0260a.c("OkHttp-Preemptive", "Proxy-Authenticate");
        z2.h("Proxy-Authenticate");
        z2.f("Proxy-Authenticate", "OkHttp-Preemptive");
        z2.g();
        aVar.f3254f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + p1.b.u((o1.l) b2.f261c, true) + " HTTP/1.1";
        B1.p pVar = this.h;
        d1.d.b(pVar);
        B1.o oVar = this.i;
        d1.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f87a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f84a.a().g(i3, timeUnit);
        pVar2.k((o1.j) b2.d, str);
        pVar2.a();
        r f2 = pVar2.f(false);
        d1.d.b(f2);
        f2.f3373a = b2;
        s a3 = f2.a();
        long i4 = p1.b.i(a3);
        if (i4 != -1) {
            u1.d j3 = pVar2.j(i4);
            p1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.e("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f3254f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f88b.g() || !oVar.f85b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        o1.a aVar = this.f3735b.f3396a;
        SSLSocketFactory sSLSocketFactory = aVar.f3252c;
        q qVar = q.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            q qVar2 = q.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(qVar2)) {
                this.d = this.f3736c;
                this.f3738f = qVar;
                return;
            } else {
                this.d = this.f3736c;
                this.f3738f = qVar2;
                l();
                return;
            }
        }
        d1.d.e(jVar, "call");
        o1.a aVar2 = this.f3735b.f3396a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f3252c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            d1.d.b(sSLSocketFactory2);
            Socket socket = this.f3736c;
            o1.l lVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, lVar.d, lVar.f3320e, true);
            d1.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                o1.g a2 = bVar.a(sSLSocket2);
                if (a2.f3294b) {
                    w1.n nVar = w1.n.f4190a;
                    w1.n.f4190a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                d1.d.d(session, "sslSocketSession");
                o1.i h = h1.d.h(session);
                A1.c cVar = aVar2.d;
                d1.d.b(cVar);
                if (!cVar.verify(aVar2.h.d, session)) {
                    List a3 = h.a();
                    if (a3.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                    }
                    Object obj = a3.get(0);
                    d1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(aVar2.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    o1.d dVar = o1.d.f3271c;
                    sb.append(h1.d.m(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(S0.g.C0(A1.c.a(x509Certificate, 7), A1.c.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(k1.e.t(sb.toString()));
                }
                o1.d dVar2 = aVar2.f3253e;
                d1.d.b(dVar2);
                this.f3737e = new o1.i(h.f3306a, h.f3307b, h.f3308c, new l(dVar2, h, aVar2));
                d1.d.e(aVar2.h.d, "hostname");
                Iterator it = dVar2.f3272a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (a2.f3294b) {
                    w1.n nVar2 = w1.n.f4190a;
                    str = w1.n.f4190a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                this.h = new B1.p(w1.d.t0(sSLSocket2));
                this.i = new B1.o(w1.d.s0(sSLSocket2));
                if (str != null) {
                    qVar = C0260a.h(str);
                }
                this.f3738f = qVar;
                w1.n nVar3 = w1.n.f4190a;
                w1.n.f4190a.a(sSLSocket2);
                if (this.f3738f == q.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    w1.n nVar4 = w1.n.f4190a;
                    w1.n.f4190a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    p1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (A1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(o1.a aVar, ArrayList arrayList) {
        o1.i iVar;
        byte[] bArr = p1.b.f3455a;
        if (this.f3746p.size() < this.f3745o && !this.f3740j) {
            u uVar = this.f3735b;
            if (!uVar.f3396a.a(aVar)) {
                return false;
            }
            o1.l lVar = aVar.h;
            String str = lVar.d;
            o1.a aVar2 = uVar.f3396a;
            if (d1.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3739g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u uVar2 = (u) it.next();
                    Proxy.Type type = uVar2.f3397b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && uVar.f3397b.type() == type2) {
                        if (d1.d.a(uVar.f3398c, uVar2.f3398c)) {
                            if (aVar.d != A1.c.f5a) {
                                return false;
                            }
                            byte[] bArr2 = p1.b.f3455a;
                            o1.l lVar2 = aVar2.h;
                            if (lVar.f3320e == lVar2.f3320e) {
                                String str2 = lVar2.d;
                                String str3 = lVar.d;
                                if (!d1.d.a(str3, str2)) {
                                    if (!this.f3741k && (iVar = this.f3737e) != null) {
                                        List a2 = iVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            d1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    o1.d dVar = aVar.f3253e;
                                    d1.d.b(dVar);
                                    o1.i iVar2 = this.f3737e;
                                    d1.d.b(iVar2);
                                    List a3 = iVar2.a();
                                    d1.d.e(str3, "hostname");
                                    d1.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f3272a.iterator();
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
        byte[] bArr = p1.b.f3455a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3736c;
        d1.d.b(socket);
        Socket socket2 = this.d;
        d1.d.b(socket2);
        B1.p pVar = this.h;
        d1.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        v1.o oVar = this.f3739g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f4099f) {
                    return false;
                }
                if (oVar.f4105n < oVar.f4104m) {
                    if (nanoTime >= oVar.f4106o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3747q;
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

    public final t1.d j(o1.p pVar, t1.f fVar) {
        Socket socket = this.d;
        d1.d.b(socket);
        B1.p pVar2 = this.h;
        d1.d.b(pVar2);
        B1.o oVar = this.i;
        d1.d.b(oVar);
        v1.o oVar2 = this.f3739g;
        if (oVar2 != null) {
            return new v1.p(pVar, this, fVar, oVar2);
        }
        int i = fVar.f3811g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar2.f87a.a().g(i, timeUnit);
        oVar.f84a.a().g(fVar.h, timeUnit);
        return new p(pVar, this, pVar2, oVar);
    }

    public final synchronized void k() {
        this.f3740j = true;
    }

    public final void l() {
        Socket socket = this.d;
        d1.d.b(socket);
        B1.p pVar = this.h;
        d1.d.b(pVar);
        B1.o oVar = this.i;
        d1.d.b(oVar);
        socket.setSoTimeout(0);
        r1.d dVar = r1.d.h;
        C0232s c0232s = new C0232s(dVar);
        String str = this.f3735b.f3396a.h.d;
        d1.d.e(str, "peerName");
        c0232s.f2978b = socket;
        String str2 = p1.b.f3460g + ' ' + str;
        d1.d.e(str2, "<set-?>");
        c0232s.f2979c = str2;
        c0232s.d = pVar;
        c0232s.f2980e = oVar;
        c0232s.f2981f = this;
        v1.o oVar2 = new v1.o(c0232s);
        this.f3739g = oVar2;
        H.j jVar = v1.o.f4094z;
        int i = 4;
        this.f3745o = (jVar.f275a & 16) != 0 ? ((int[]) jVar.f276b)[4] : Integer.MAX_VALUE;
        v1.x xVar = oVar2.f4114w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = v1.x.f4151f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(p1.b.g(">> CONNECTION " + v1.f.f4073a.b(), new Object[0]));
                }
                B1.o oVar3 = xVar.f4152a;
                B1.i iVar = v1.f.f4073a;
                oVar3.getClass();
                d1.d.e(iVar, "byteString");
                if (oVar3.f86c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f85b.s(iVar);
                oVar3.g();
                xVar.f4152a.flush();
            } finally {
            }
        }
        v1.x xVar2 = oVar2.f4114w;
        H.j jVar2 = oVar2.f4107p;
        synchronized (xVar2) {
            try {
                d1.d.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar2.f275a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f275a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        B1.o oVar4 = xVar2.f4152a;
                        if (oVar4.f86c) {
                            throw new IllegalStateException("closed");
                        }
                        B1.f fVar = oVar4.f85b;
                        B1.q q2 = fVar.q(2);
                        int i4 = q2.f92c;
                        byte[] bArr = q2.f90a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f92c = i4 + 2;
                        fVar.f69b += 2;
                        oVar4.g();
                        xVar2.f4152a.i(((int[]) jVar2.f276b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f4152a.flush();
            } finally {
            }
        }
        if (oVar2.f4107p.c() != 65535) {
            oVar2.f4114w.n(0, r2 - 65535);
        }
        dVar.e().c(new r1.b(oVar2.f4097c, oVar2.f4115x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        u uVar = this.f3735b;
        sb.append(uVar.f3396a.h.d);
        sb.append(':');
        sb.append(uVar.f3396a.h.f3320e);
        sb.append(", proxy=");
        sb.append(uVar.f3397b);
        sb.append(" hostAddress=");
        sb.append(uVar.f3398c);
        sb.append(" cipherSuite=");
        o1.i iVar = this.f3737e;
        if (iVar == null || (obj = iVar.f3307b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3738f);
        sb.append('}');
        return sb.toString();
    }
}
