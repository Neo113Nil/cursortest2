package q1;

import T.u;
import X.V;
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
import k0.z;
import l.C0235s;
import m1.q;
import m1.r;
import m1.s;
import m1.t;
import m1.v;
import t1.w;
import z1.x;

/* loaded from: classes.dex */
public final class m extends t1.h {

    /* renamed from: b, reason: collision with root package name */
    public final v f3541b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3542c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public m1.j f3543e;

    /* renamed from: f, reason: collision with root package name */
    public r f3544f;

    /* renamed from: g, reason: collision with root package name */
    public t1.o f3545g;
    public z1.p h;
    public z1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3546j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3547k;

    /* renamed from: l, reason: collision with root package name */
    public int f3548l;

    /* renamed from: m, reason: collision with root package name */
    public int f3549m;

    /* renamed from: n, reason: collision with root package name */
    public int f3550n;

    /* renamed from: o, reason: collision with root package name */
    public int f3551o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3552p;

    /* renamed from: q, reason: collision with root package name */
    public long f3553q;

    public m(n nVar, v vVar) {
        b1.d.e(nVar, "connectionPool");
        b1.d.e(vVar, "route");
        this.f3541b = vVar;
        this.f3551o = 1;
        this.f3552p = new ArrayList();
        this.f3553q = Long.MAX_VALUE;
    }

    public static void d(q qVar, v vVar, IOException iOException) {
        b1.d.e(vVar, "failedRoute");
        b1.d.e(iOException, "failure");
        if (vVar.f3296b.type() != Proxy.Type.DIRECT) {
            m1.a aVar = vVar.f3295a;
            aVar.f3153g.connectFailed(aVar.h.g(), vVar.f3296b.address(), iOException);
        }
        m1.g gVar = qVar.f3265y;
        synchronized (gVar) {
            ((LinkedHashSet) gVar.f3189a).add(vVar);
        }
    }

    @Override // t1.h
    public final synchronized void a(t1.o oVar, H.j jVar) {
        b1.d.e(oVar, "connection");
        b1.d.e(jVar, "settings");
        this.f3551o = (jVar.f289a & 16) != 0 ? ((int[]) jVar.f290b)[4] : Integer.MAX_VALUE;
    }

    @Override // t1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        v vVar;
        b1.d.e(jVar, "call");
        if (this.f3544f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3541b.f3295a.f3154j;
        b bVar = new b(list);
        m1.a aVar = this.f3541b.f3295a;
        if (aVar.f3150c == null) {
            if (!list.contains(m1.h.f3191f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3541b.f3295a.h.d;
            u1.n nVar = u1.n.f3966a;
            if (!u1.n.f3966a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                v vVar2 = this.f3541b;
                if (vVar2.f3295a.f3150c != null && vVar2.f3296b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3542c == null) {
                        vVar = this.f3541b;
                        if (vVar.f3295a.f3150c == null && vVar.f3296b.type() == Proxy.Type.HTTP && this.f3542c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3553q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                b1.d.e(this.f3541b.f3297c, "inetSocketAddress");
                vVar = this.f3541b;
                if (vVar.f3295a.f3150c == null) {
                }
                this.f3553q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    n1.b.c(socket);
                }
                Socket socket2 = this.f3542c;
                if (socket2 != null) {
                    n1.b.c(socket2);
                }
                this.d = null;
                this.f3542c = null;
                this.h = null;
                this.i = null;
                this.f3543e = null;
                this.f3544f = null;
                this.f3545g = null;
                this.f3551o = 1;
                b1.d.e(this.f3541b.f3297c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    u1.l.e(oVar.f3557a, e2);
                    oVar.f3558b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3499c) {
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
        v vVar = this.f3541b;
        Proxy proxy = vVar.f3296b;
        m1.a aVar = vVar.f3295a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3538a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f3149b.createSocket();
            b1.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3542c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3541b.f3297c;
        b1.d.e(jVar, "call");
        b1.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            u1.n nVar = u1.n.f3966a;
            u1.n.f3966a.e(createSocket, this.f3541b.f3297c, i);
            try {
                this.h = new z1.p(k0.w.q(createSocket));
                this.i = new z1.o(k0.w.p(createSocket));
            } catch (NullPointerException e2) {
                if (b1.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3541b.f3297c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        u uVar = new u(6);
        v vVar = this.f3541b;
        m1.m mVar = vVar.f3295a.h;
        b1.d.e(mVar, "url");
        uVar.f816a = mVar;
        uVar.o("CONNECT", null);
        m1.a aVar = vVar.f3295a;
        uVar.k("Host", n1.b.u(aVar.h, true));
        uVar.k("Proxy-Connection", "Keep-Alive");
        uVar.k("User-Agent", "okhttp/4.12.0");
        H.e b2 = uVar.b();
        m1.g gVar = new m1.g(1);
        k0.w.c("Proxy-Authenticate");
        k0.w.e("OkHttp-Preemptive", "Proxy-Authenticate");
        gVar.e("Proxy-Authenticate");
        gVar.c("Proxy-Authenticate", "OkHttp-Preemptive");
        gVar.d();
        aVar.f3152f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + n1.b.u((m1.m) b2.f275c, true) + " HTTP/1.1";
        z1.p pVar = this.h;
        b1.d.b(pVar);
        z1.o oVar = this.i;
        b1.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f4287a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f4284a.a().g(i3, timeUnit);
        pVar2.k((m1.k) b2.d, str);
        pVar2.a();
        s e2 = pVar2.e(false);
        b1.d.b(e2);
        e2.f3272a = b2;
        t a3 = e2.a();
        long i4 = n1.b.i(a3);
        if (i4 != -1) {
            s1.d j3 = pVar2.j(i4);
            n1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.d("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f3152f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f4288b.g() || !oVar.f4285b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        m1.a aVar = this.f3541b.f3295a;
        SSLSocketFactory sSLSocketFactory = aVar.f3150c;
        r rVar = r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            r rVar2 = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar2)) {
                this.d = this.f3542c;
                this.f3544f = rVar;
                return;
            } else {
                this.d = this.f3542c;
                this.f3544f = rVar2;
                l();
                return;
            }
        }
        b1.d.e(jVar, "call");
        m1.a aVar2 = this.f3541b.f3295a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f3150c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            b1.d.b(sSLSocketFactory2);
            Socket socket = this.f3542c;
            m1.m mVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, mVar.d, mVar.f3219e, true);
            b1.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                m1.h a2 = bVar.a(sSLSocket2);
                if (a2.f3193b) {
                    u1.n nVar = u1.n.f3966a;
                    u1.n.f3966a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                b1.d.d(session, "sslSocketSession");
                m1.j h = z.h(session);
                HostnameVerifier hostnameVerifier = aVar2.d;
                b1.d.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.h.d, session)) {
                    m1.d dVar = aVar2.f3151e;
                    b1.d.b(dVar);
                    this.f3543e = new m1.j(h.f3205a, h.f3206b, h.f3207c, new l(dVar, h, aVar2));
                    b1.d.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f3170a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f3193b) {
                        u1.n nVar2 = u1.n.f3966a;
                        str = u1.n.f3966a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new z1.p(k0.w.q(sSLSocket2));
                    this.i = new z1.o(k0.w.p(sSLSocket2));
                    if (str != null) {
                        rVar = k0.w.j(str);
                    }
                    this.f3544f = rVar;
                    u1.n nVar3 = u1.n.f3966a;
                    u1.n.f3966a.a(sSLSocket2);
                    if (this.f3544f == r.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = h.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                b1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                m1.d dVar2 = m1.d.f3169c;
                sb.append(z.l(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = y1.c.a(x509Certificate, 7);
                List a5 = y1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(i1.e.r0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    u1.n nVar4 = u1.n.f3966a;
                    u1.n.f3966a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    n1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (y1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(m1.a aVar, ArrayList arrayList) {
        m1.j jVar;
        byte[] bArr = n1.b.f3319a;
        if (this.f3552p.size() < this.f3551o && !this.f3546j) {
            v vVar = this.f3541b;
            if (!vVar.f3295a.a(aVar)) {
                return false;
            }
            m1.m mVar = aVar.h;
            String str = mVar.d;
            m1.a aVar2 = vVar.f3295a;
            if (b1.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3545g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    v vVar2 = (v) it.next();
                    Proxy.Type type = vVar2.f3296b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && vVar.f3296b.type() == type2) {
                        if (b1.d.a(vVar.f3297c, vVar2.f3297c)) {
                            if (aVar.d != y1.c.f4232a) {
                                return false;
                            }
                            byte[] bArr2 = n1.b.f3319a;
                            m1.m mVar2 = aVar2.h;
                            if (mVar.f3219e == mVar2.f3219e) {
                                String str2 = mVar2.d;
                                String str3 = mVar.d;
                                if (!b1.d.a(str3, str2)) {
                                    if (!this.f3547k && (jVar = this.f3543e) != null) {
                                        List a2 = jVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            b1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    m1.d dVar = aVar.f3151e;
                                    b1.d.b(dVar);
                                    m1.j jVar2 = this.f3543e;
                                    b1.d.b(jVar2);
                                    List a3 = jVar2.a();
                                    b1.d.e(str3, "hostname");
                                    b1.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f3170a.iterator();
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
        byte[] bArr = n1.b.f3319a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3542c;
        b1.d.b(socket);
        Socket socket2 = this.d;
        b1.d.b(socket2);
        z1.p pVar = this.h;
        b1.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        t1.o oVar = this.f3545g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f3879f) {
                    return false;
                }
                if (oVar.f3885n < oVar.f3884m) {
                    if (nanoTime >= oVar.f3886o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3553q;
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

    public final r1.d j(q qVar, r1.f fVar) {
        Socket socket = this.d;
        b1.d.b(socket);
        z1.p pVar = this.h;
        b1.d.b(pVar);
        z1.o oVar = this.i;
        b1.d.b(oVar);
        t1.o oVar2 = this.f3545g;
        if (oVar2 != null) {
            return new t1.p(qVar, this, fVar, oVar2);
        }
        int i = fVar.f3578g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f4287a.a().g(i, timeUnit);
        oVar.f4284a.a().g(fVar.h, timeUnit);
        return new p(qVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f3546j = true;
    }

    public final void l() {
        Socket socket = this.d;
        b1.d.b(socket);
        z1.p pVar = this.h;
        b1.d.b(pVar);
        z1.o oVar = this.i;
        b1.d.b(oVar);
        socket.setSoTimeout(0);
        p1.d dVar = p1.d.h;
        C0235s c0235s = new C0235s(dVar);
        String str = this.f3541b.f3295a.h.d;
        b1.d.e(str, "peerName");
        c0235s.f3029b = socket;
        String str2 = n1.b.f3324g + ' ' + str;
        b1.d.e(str2, "<set-?>");
        c0235s.f3030c = str2;
        c0235s.d = pVar;
        c0235s.f3031e = oVar;
        c0235s.f3032f = this;
        t1.o oVar2 = new t1.o(c0235s);
        this.f3545g = oVar2;
        H.j jVar = t1.o.f3874z;
        int i = 4;
        this.f3551o = (jVar.f289a & 16) != 0 ? ((int[]) jVar.f290b)[4] : Integer.MAX_VALUE;
        t1.x xVar = oVar2.f3894w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = t1.x.f3931f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(n1.b.g(">> CONNECTION " + t1.f.f3853a.b(), new Object[0]));
                }
                z1.o oVar3 = xVar.f3932a;
                z1.i iVar = t1.f.f3853a;
                oVar3.getClass();
                b1.d.e(iVar, "byteString");
                if (oVar3.f4286c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f4285b.s(iVar);
                oVar3.g();
                xVar.f3932a.flush();
            } finally {
            }
        }
        t1.x xVar2 = oVar2.f3894w;
        H.j jVar2 = oVar2.f3887p;
        synchronized (xVar2) {
            try {
                b1.d.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar2.f289a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f289a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        z1.o oVar4 = xVar2.f3932a;
                        if (oVar4.f4286c) {
                            throw new IllegalStateException("closed");
                        }
                        z1.f fVar = oVar4.f4285b;
                        z1.q q2 = fVar.q(2);
                        int i4 = q2.f4292c;
                        byte[] bArr = q2.f4290a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f4292c = i4 + 2;
                        fVar.f4269b += 2;
                        oVar4.g();
                        xVar2.f3932a.i(((int[]) jVar2.f290b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3932a.flush();
            } finally {
            }
        }
        if (oVar2.f3887p.c() != 65535) {
            oVar2.f3894w.n(0, r2 - 65535);
        }
        dVar.e().c(new p1.b(oVar2.f3877c, oVar2.f3895x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        v vVar = this.f3541b;
        sb.append(vVar.f3295a.h.d);
        sb.append(':');
        sb.append(vVar.f3295a.h.f3219e);
        sb.append(", proxy=");
        sb.append(vVar.f3296b);
        sb.append(" hostAddress=");
        sb.append(vVar.f3297c);
        sb.append(" cipherSuite=");
        m1.j jVar = this.f3543e;
        if (jVar == null || (obj = jVar.f3206b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3544f);
        sb.append('}');
        return sb.toString();
    }
}
