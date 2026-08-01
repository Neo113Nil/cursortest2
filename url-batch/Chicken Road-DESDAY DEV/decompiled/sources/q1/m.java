package q1;

import X.V;
import j0.AbstractC0143a;
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
import l.C0207a0;
import l.C0244t;
import m1.q;
import m1.r;
import m1.s;
import m1.u;
import t1.w;
import z1.x;

/* loaded from: classes.dex */
public final class m extends t1.h {

    /* renamed from: b, reason: collision with root package name */
    public final u f3488b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3489c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public m1.i f3490e;

    /* renamed from: f, reason: collision with root package name */
    public q f3491f;

    /* renamed from: g, reason: collision with root package name */
    public t1.o f3492g;
    public z1.p h;
    public z1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3493j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3494k;

    /* renamed from: l, reason: collision with root package name */
    public int f3495l;

    /* renamed from: m, reason: collision with root package name */
    public int f3496m;

    /* renamed from: n, reason: collision with root package name */
    public int f3497n;

    /* renamed from: o, reason: collision with root package name */
    public int f3498o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3499p;

    /* renamed from: q, reason: collision with root package name */
    public long f3500q;

    public m(n nVar, u uVar) {
        b1.d.e(nVar, "connectionPool");
        b1.d.e(uVar, "route");
        this.f3488b = uVar;
        this.f3498o = 1;
        this.f3499p = new ArrayList();
        this.f3500q = Long.MAX_VALUE;
    }

    public static void d(m1.p pVar, u uVar, IOException iOException) {
        b1.d.e(uVar, "failedRoute");
        b1.d.e(iOException, "failure");
        if (uVar.f3263b.type() != Proxy.Type.DIRECT) {
            m1.a aVar = uVar.f3262a;
            aVar.f3121g.connectFailed(aVar.h.g(), uVar.f3263b.address(), iOException);
        }
        C0207a0 c0207a0 = pVar.f3232y;
        synchronized (c0207a0) {
            ((LinkedHashSet) c0207a0.f2889a).add(uVar);
        }
    }

    @Override // t1.h
    public final synchronized void a(t1.o oVar, H.j jVar) {
        b1.d.e(oVar, "connection");
        b1.d.e(jVar, "settings");
        this.f3498o = (jVar.f220a & 16) != 0 ? ((int[]) jVar.f221b)[4] : Integer.MAX_VALUE;
    }

    @Override // t1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        u uVar;
        b1.d.e(jVar, "call");
        if (this.f3491f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3488b.f3262a.f3122j;
        b bVar = new b(list);
        m1.a aVar = this.f3488b.f3262a;
        if (aVar.f3118c == null) {
            if (!list.contains(m1.g.f3158f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3488b.f3262a.h.d;
            u1.n nVar = u1.n.f3904a;
            if (!u1.n.f3904a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(q.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                u uVar2 = this.f3488b;
                if (uVar2.f3262a.f3118c != null && uVar2.f3263b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3489c == null) {
                        uVar = this.f3488b;
                        if (uVar.f3262a.f3118c == null && uVar.f3263b.type() == Proxy.Type.HTTP && this.f3489c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3500q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                b1.d.e(this.f3488b.f3264c, "inetSocketAddress");
                uVar = this.f3488b;
                if (uVar.f3262a.f3118c == null) {
                }
                this.f3500q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    n1.b.c(socket);
                }
                Socket socket2 = this.f3489c;
                if (socket2 != null) {
                    n1.b.c(socket2);
                }
                this.d = null;
                this.f3489c = null;
                this.h = null;
                this.i = null;
                this.f3490e = null;
                this.f3491f = null;
                this.f3492g = null;
                this.f3498o = 1;
                b1.d.e(this.f3488b.f3264c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    u1.l.e(oVar.f3504a, e2);
                    oVar.f3505b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3446c) {
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
        u uVar = this.f3488b;
        Proxy proxy = uVar.f3263b;
        m1.a aVar = uVar.f3262a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3485a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f3117b.createSocket();
            b1.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3489c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3488b.f3264c;
        b1.d.e(jVar, "call");
        b1.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            u1.n nVar = u1.n.f3904a;
            u1.n.f3904a.e(createSocket, this.f3488b.f3264c, i);
            try {
                this.h = new z1.p(k0.k.v(createSocket));
                this.i = new z1.o(k0.k.u(createSocket));
            } catch (NullPointerException e2) {
                if (b1.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3488b.f3264c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        T.u uVar = new T.u(6);
        u uVar2 = this.f3488b;
        m1.l lVar = uVar2.f3262a.h;
        b1.d.e(lVar, "url");
        uVar.f801a = lVar;
        uVar.o("CONNECT", null);
        m1.a aVar = uVar2.f3262a;
        uVar.k("Host", n1.b.u(aVar.h, true));
        uVar.k("Proxy-Connection", "Keep-Alive");
        uVar.k("User-Agent", "okhttp/4.12.0");
        H.e b2 = uVar.b();
        C0207a0 c0207a0 = new C0207a0(2);
        AbstractC0143a.d("Proxy-Authenticate");
        AbstractC0143a.e("OkHttp-Preemptive", "Proxy-Authenticate");
        c0207a0.h("Proxy-Authenticate");
        c0207a0.f("Proxy-Authenticate", "OkHttp-Preemptive");
        c0207a0.g();
        aVar.f3120f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + n1.b.u((m1.l) b2.f206c, true) + " HTTP/1.1";
        z1.p pVar = this.h;
        b1.d.b(pVar);
        z1.o oVar = this.i;
        b1.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f4286a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f4283a.a().g(i3, timeUnit);
        pVar2.k((m1.j) b2.d, str);
        pVar2.a();
        r e2 = pVar2.e(false);
        b1.d.b(e2);
        e2.f3239a = b2;
        s a3 = e2.a();
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
            aVar.f3120f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f4287b.g() || !oVar.f4284b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        m1.a aVar = this.f3488b.f3262a;
        SSLSocketFactory sSLSocketFactory = aVar.f3118c;
        q qVar = q.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            q qVar2 = q.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(qVar2)) {
                this.d = this.f3489c;
                this.f3491f = qVar;
                return;
            } else {
                this.d = this.f3489c;
                this.f3491f = qVar2;
                l();
                return;
            }
        }
        b1.d.e(jVar, "call");
        m1.a aVar2 = this.f3488b.f3262a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f3118c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            b1.d.b(sSLSocketFactory2);
            Socket socket = this.f3489c;
            m1.l lVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, lVar.d, lVar.f3186e, true);
            b1.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                m1.g a2 = bVar.a(sSLSocket2);
                if (a2.f3160b) {
                    u1.n nVar = u1.n.f3904a;
                    u1.n.f3904a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                b1.d.d(session, "sslSocketSession");
                m1.i g2 = k0.k.g(session);
                HostnameVerifier hostnameVerifier = aVar2.d;
                b1.d.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.h.d, session)) {
                    m1.d dVar = aVar2.f3119e;
                    b1.d.b(dVar);
                    this.f3490e = new m1.i(g2.f3172a, g2.f3173b, g2.f3174c, new l(dVar, g2, aVar2));
                    b1.d.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f3138a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f3160b) {
                        u1.n nVar2 = u1.n.f3904a;
                        str = u1.n.f3904a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new z1.p(k0.k.v(sSLSocket2));
                    this.i = new z1.o(k0.k.u(sSLSocket2));
                    if (str != null) {
                        qVar = AbstractC0143a.k(str);
                    }
                    this.f3491f = qVar;
                    u1.n nVar3 = u1.n.f3904a;
                    u1.n.f3904a.a(sSLSocket2);
                    if (this.f3491f == q.HTTP_2) {
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
                b1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                m1.d dVar2 = m1.d.f3137c;
                sb.append(k0.k.p(x509Certificate));
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
                throw new SSLPeerUnverifiedException(i1.e.j0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    u1.n nVar4 = u1.n.f3904a;
                    u1.n.f3904a.a(sSLSocket);
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
        m1.i iVar;
        byte[] bArr = n1.b.f3286a;
        if (this.f3499p.size() < this.f3498o && !this.f3493j) {
            u uVar = this.f3488b;
            if (!uVar.f3262a.a(aVar)) {
                return false;
            }
            m1.l lVar = aVar.h;
            String str = lVar.d;
            m1.a aVar2 = uVar.f3262a;
            if (b1.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3492g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u uVar2 = (u) it.next();
                    Proxy.Type type = uVar2.f3263b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && uVar.f3263b.type() == type2) {
                        if (b1.d.a(uVar.f3264c, uVar2.f3264c)) {
                            if (aVar.d != y1.c.f4236a) {
                                return false;
                            }
                            byte[] bArr2 = n1.b.f3286a;
                            m1.l lVar2 = aVar2.h;
                            if (lVar.f3186e == lVar2.f3186e) {
                                String str2 = lVar2.d;
                                String str3 = lVar.d;
                                if (!b1.d.a(str3, str2)) {
                                    if (!this.f3494k && (iVar = this.f3490e) != null) {
                                        List a2 = iVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            b1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    m1.d dVar = aVar.f3119e;
                                    b1.d.b(dVar);
                                    m1.i iVar2 = this.f3490e;
                                    b1.d.b(iVar2);
                                    List a3 = iVar2.a();
                                    b1.d.e(str3, "hostname");
                                    b1.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f3138a.iterator();
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
        byte[] bArr = n1.b.f3286a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3489c;
        b1.d.b(socket);
        Socket socket2 = this.d;
        b1.d.b(socket2);
        z1.p pVar = this.h;
        b1.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        t1.o oVar = this.f3492g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f3797f) {
                    return false;
                }
                if (oVar.f3803n < oVar.f3802m) {
                    if (nanoTime >= oVar.f3804o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3500q;
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

    public final r1.d j(m1.p pVar, r1.f fVar) {
        Socket socket = this.d;
        b1.d.b(socket);
        z1.p pVar2 = this.h;
        b1.d.b(pVar2);
        z1.o oVar = this.i;
        b1.d.b(oVar);
        t1.o oVar2 = this.f3492g;
        if (oVar2 != null) {
            return new t1.p(pVar, this, fVar, oVar2);
        }
        int i = fVar.f3524g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar2.f4286a.a().g(i, timeUnit);
        oVar.f4283a.a().g(fVar.h, timeUnit);
        return new p(pVar, this, pVar2, oVar);
    }

    public final synchronized void k() {
        this.f3493j = true;
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
        C0244t c0244t = new C0244t(dVar);
        String str = this.f3488b.f3262a.h.d;
        b1.d.e(str, "peerName");
        c0244t.f2991b = socket;
        String str2 = n1.b.f3291g + ' ' + str;
        b1.d.e(str2, "<set-?>");
        c0244t.f2992c = str2;
        c0244t.d = pVar;
        c0244t.f2993e = oVar;
        c0244t.f2994f = this;
        t1.o oVar2 = new t1.o(c0244t);
        this.f3492g = oVar2;
        H.j jVar = t1.o.f3792z;
        int i = 4;
        this.f3498o = (jVar.f220a & 16) != 0 ? ((int[]) jVar.f221b)[4] : Integer.MAX_VALUE;
        t1.x xVar = oVar2.f3812w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = t1.x.f3849f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(n1.b.g(">> CONNECTION " + t1.f.f3771a.b(), new Object[0]));
                }
                z1.o oVar3 = xVar.f3850a;
                z1.i iVar = t1.f.f3771a;
                oVar3.getClass();
                b1.d.e(iVar, "byteString");
                if (oVar3.f4285c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f4284b.s(iVar);
                oVar3.g();
                xVar.f3850a.flush();
            } finally {
            }
        }
        t1.x xVar2 = oVar2.f3812w;
        H.j jVar2 = oVar2.f3805p;
        synchronized (xVar2) {
            try {
                b1.d.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar2.f220a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f220a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        z1.o oVar4 = xVar2.f3850a;
                        if (oVar4.f4285c) {
                            throw new IllegalStateException("closed");
                        }
                        z1.f fVar = oVar4.f4284b;
                        z1.q q2 = fVar.q(2);
                        int i4 = q2.f4291c;
                        byte[] bArr = q2.f4289a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f4291c = i4 + 2;
                        fVar.f4268b += 2;
                        oVar4.g();
                        xVar2.f3850a.i(((int[]) jVar2.f221b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3850a.flush();
            } finally {
            }
        }
        if (oVar2.f3805p.c() != 65535) {
            oVar2.f3812w.n(0, r2 - 65535);
        }
        dVar.e().c(new p1.b(oVar2.f3795c, oVar2.f3813x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        u uVar = this.f3488b;
        sb.append(uVar.f3262a.h.d);
        sb.append(':');
        sb.append(uVar.f3262a.h.f3186e);
        sb.append(", proxy=");
        sb.append(uVar.f3263b);
        sb.append(" hostAddress=");
        sb.append(uVar.f3264c);
        sb.append(" cipherSuite=");
        m1.i iVar = this.f3490e;
        if (iVar == null || (obj = iVar.f3173b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3491f);
        sb.append('}');
        return sb.toString();
    }
}
