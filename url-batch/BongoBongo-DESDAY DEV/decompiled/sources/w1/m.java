package w1;

import F1.x;
import Z.V;
import h.AbstractC0112a;
import h0.d0;
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
import m.C0202a0;
import m.C0239t;
import s1.q;
import s1.r;
import s1.t;
import z1.w;

/* loaded from: classes.dex */
public final class m extends z1.h {

    /* renamed from: b, reason: collision with root package name */
    public final t f4253b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f4254c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public s1.i f4255e;

    /* renamed from: f, reason: collision with root package name */
    public s1.p f4256f;

    /* renamed from: g, reason: collision with root package name */
    public z1.o f4257g;

    /* renamed from: h, reason: collision with root package name */
    public F1.p f4258h;
    public F1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4259j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4260k;

    /* renamed from: l, reason: collision with root package name */
    public int f4261l;

    /* renamed from: m, reason: collision with root package name */
    public int f4262m;

    /* renamed from: n, reason: collision with root package name */
    public int f4263n;

    /* renamed from: o, reason: collision with root package name */
    public int f4264o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f4265p;

    /* renamed from: q, reason: collision with root package name */
    public long f4266q;

    public m(n nVar, t tVar) {
        h1.d.e(nVar, "connectionPool");
        h1.d.e(tVar, "route");
        this.f4253b = tVar;
        this.f4264o = 1;
        this.f4265p = new ArrayList();
        this.f4266q = Long.MAX_VALUE;
    }

    public static void d(s1.o oVar, t tVar, IOException iOException) {
        h1.d.e(tVar, "failedRoute");
        h1.d.e(iOException, "failure");
        if (tVar.f3717b.type() != Proxy.Type.DIRECT) {
            s1.a aVar = tVar.f3716a;
            aVar.f3582g.connectFailed(aVar.f3583h.g(), tVar.f3717b.address(), iOException);
        }
        C0202a0 c0202a0 = oVar.f3683y;
        synchronized (c0202a0) {
            ((LinkedHashSet) c0202a0.f3068a).add(tVar);
        }
    }

    @Override // z1.h
    public final synchronized void a(z1.o oVar, I.i iVar) {
        h1.d.e(oVar, "connection");
        h1.d.e(iVar, "settings");
        this.f4264o = (iVar.f335a & 16) != 0 ? ((int[]) iVar.f336b)[4] : Integer.MAX_VALUE;
    }

    @Override // z1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        t tVar;
        h1.d.e(jVar, "call");
        if (this.f4256f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f4253b.f3716a.f3584j;
        b bVar = new b(list);
        s1.a aVar = this.f4253b.f3716a;
        if (aVar.f3579c == null) {
            if (!list.contains(s1.g.f3622f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f4253b.f3716a.f3583h.d;
            A1.o oVar = A1.o.f39a;
            if (!A1.o.f39a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(s1.p.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar2 = null;
        do {
            try {
                t tVar2 = this.f4253b;
                if (tVar2.f3716a.f3579c != null && tVar2.f3717b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f4254c == null) {
                        tVar = this.f4253b;
                        if (tVar.f3716a.f3579c == null && tVar.f3717b.type() == Proxy.Type.HTTP && this.f4254c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f4266q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                h1.d.e(this.f4253b.f3718c, "inetSocketAddress");
                tVar = this.f4253b;
                if (tVar.f3716a.f3579c == null) {
                }
                this.f4266q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    t1.b.c(socket);
                }
                Socket socket2 = this.f4254c;
                if (socket2 != null) {
                    t1.b.c(socket2);
                }
                this.d = null;
                this.f4254c = null;
                this.f4258h = null;
                this.i = null;
                this.f4255e = null;
                this.f4256f = null;
                this.f4257g = null;
                this.f4264o = 1;
                h1.d.e(this.f4253b.f3718c, "inetSocketAddress");
                if (oVar2 == null) {
                    oVar2 = new o(e2);
                } else {
                    A1.d.e(oVar2.f4270a, e2);
                    oVar2.f4271b = e2;
                }
                if (!z2) {
                    throw oVar2;
                }
                bVar.d = true;
                if (!bVar.f4209c) {
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
        t tVar = this.f4253b;
        Proxy proxy = tVar.f3717b;
        s1.a aVar = tVar.f3716a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f4250a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f3578b.createSocket();
            h1.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f4254c = createSocket;
        InetSocketAddress inetSocketAddress = this.f4253b.f3718c;
        h1.d.e(jVar, "call");
        h1.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            A1.o oVar = A1.o.f39a;
            A1.o.f39a.e(createSocket, this.f4253b.f3718c, i);
            try {
                this.f4258h = new F1.p(A1.d.k0(createSocket));
                this.i = new F1.o(A1.d.j0(createSocket));
            } catch (NullPointerException e2) {
                if (h1.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4253b.f3718c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        S0.g gVar = new S0.g(7);
        t tVar = this.f4253b;
        s1.l lVar = tVar.f3716a.f3583h;
        h1.d.e(lVar, "url");
        gVar.f822a = lVar;
        gVar.o("CONNECT", null);
        s1.a aVar = tVar.f3716a;
        gVar.k("Host", t1.b.u(aVar.f3583h, true));
        gVar.k("Proxy-Connection", "Keep-Alive");
        gVar.k("User-Agent", "okhttp/4.12.0");
        I.d b2 = gVar.b();
        C0202a0 c0202a0 = new C0202a0(2);
        AbstractC0112a.b("Proxy-Authenticate");
        AbstractC0112a.d("OkHttp-Preemptive", "Proxy-Authenticate");
        c0202a0.h("Proxy-Authenticate");
        c0202a0.f("Proxy-Authenticate", "OkHttp-Preemptive");
        c0202a0.g();
        aVar.f3581f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + t1.b.u((s1.l) b2.f321c, true) + " HTTP/1.1";
        F1.p pVar = this.f4258h;
        h1.d.b(pVar);
        F1.o oVar = this.i;
        h1.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f265a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f262a.a().g(i3, timeUnit);
        pVar2.k((s1.j) b2.d, str);
        pVar2.a();
        q e2 = pVar2.e(false);
        h1.d.b(e2);
        e2.f3691a = b2;
        r a3 = e2.a();
        long i4 = t1.b.i(a3);
        if (i4 != -1) {
            y1.d j3 = pVar2.j(i4);
            t1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.e("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f3581f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f266b.g() || !oVar.f263b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        s1.a aVar = this.f4253b.f3716a;
        SSLSocketFactory sSLSocketFactory = aVar.f3579c;
        s1.p pVar = s1.p.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            s1.p pVar2 = s1.p.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(pVar2)) {
                this.d = this.f4254c;
                this.f4256f = pVar;
                return;
            } else {
                this.d = this.f4254c;
                this.f4256f = pVar2;
                l();
                return;
            }
        }
        h1.d.e(jVar, "call");
        s1.a aVar2 = this.f4253b.f3716a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f3579c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            h1.d.b(sSLSocketFactory2);
            Socket socket = this.f4254c;
            s1.l lVar = aVar2.f3583h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, lVar.d, lVar.f3652e, true);
            h1.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                s1.g a2 = bVar.a(sSLSocket2);
                if (a2.f3624b) {
                    A1.o oVar = A1.o.f39a;
                    A1.o.f39a.d(sSLSocket2, aVar2.f3583h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                h1.d.d(session, "sslSocketSession");
                s1.i i = d0.i(session);
                E1.c cVar = aVar2.d;
                h1.d.b(cVar);
                if (cVar.verify(aVar2.f3583h.d, session)) {
                    s1.d dVar = aVar2.f3580e;
                    h1.d.b(dVar);
                    this.f4255e = new s1.i(i.f3637a, i.f3638b, i.f3639c, new l(dVar, i, aVar2));
                    h1.d.e(aVar2.f3583h.d, "hostname");
                    Iterator it = dVar.f3601a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f3624b) {
                        A1.o oVar2 = A1.o.f39a;
                        str = A1.o.f39a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.f4258h = new F1.p(A1.d.k0(sSLSocket2));
                    this.i = new F1.o(A1.d.j0(sSLSocket2));
                    if (str != null) {
                        pVar = AbstractC0112a.k(str);
                    }
                    this.f4256f = pVar;
                    A1.o oVar3 = A1.o.f39a;
                    A1.o.f39a.a(sSLSocket2);
                    if (this.f4256f == s1.p.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = i.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f3583h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                h1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.f3583h.d);
                sb.append(" not verified:\n              |    certificate: ");
                s1.d dVar2 = s1.d.f3600c;
                sb.append(d0.n(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = E1.c.a(x509Certificate, 7);
                List a5 = E1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(o1.e.s(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    A1.o oVar4 = A1.o.f39a;
                    A1.o.f39a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    t1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (E1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(s1.a aVar, ArrayList arrayList) {
        s1.i iVar;
        byte[] bArr = t1.b.f3898a;
        if (this.f4265p.size() < this.f4264o && !this.f4259j) {
            t tVar = this.f4253b;
            if (!tVar.f3716a.a(aVar)) {
                return false;
            }
            s1.l lVar = aVar.f3583h;
            String str = lVar.d;
            s1.a aVar2 = tVar.f3716a;
            if (h1.d.a(str, aVar2.f3583h.d)) {
                return true;
            }
            if (this.f4257g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t tVar2 = (t) it.next();
                    Proxy.Type type = tVar2.f3717b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && tVar.f3717b.type() == type2) {
                        if (h1.d.a(tVar.f3718c, tVar2.f3718c)) {
                            if (aVar.d != E1.c.f231a) {
                                return false;
                            }
                            byte[] bArr2 = t1.b.f3898a;
                            s1.l lVar2 = aVar2.f3583h;
                            if (lVar.f3652e == lVar2.f3652e) {
                                String str2 = lVar2.d;
                                String str3 = lVar.d;
                                if (!h1.d.a(str3, str2)) {
                                    if (!this.f4260k && (iVar = this.f4255e) != null) {
                                        List a2 = iVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            h1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    s1.d dVar = aVar.f3580e;
                                    h1.d.b(dVar);
                                    s1.i iVar2 = this.f4255e;
                                    h1.d.b(iVar2);
                                    List a3 = iVar2.a();
                                    h1.d.e(str3, "hostname");
                                    h1.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f3601a.iterator();
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
        byte[] bArr = t1.b.f3898a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f4254c;
        h1.d.b(socket);
        Socket socket2 = this.d;
        h1.d.b(socket2);
        F1.p pVar = this.f4258h;
        h1.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        z1.o oVar = this.f4257g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f4470f) {
                    return false;
                }
                if (oVar.f4477n < oVar.f4476m) {
                    if (nanoTime >= oVar.f4478o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f4266q;
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

    public final x1.d j(s1.o oVar, x1.f fVar) {
        Socket socket = this.d;
        h1.d.b(socket);
        F1.p pVar = this.f4258h;
        h1.d.b(pVar);
        F1.o oVar2 = this.i;
        h1.d.b(oVar2);
        z1.o oVar3 = this.f4257g;
        if (oVar3 != null) {
            return new z1.p(oVar, this, fVar, oVar3);
        }
        int i = fVar.f4296g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f265a.a().g(i, timeUnit);
        oVar2.f262a.a().g(fVar.f4297h, timeUnit);
        return new p(oVar, this, pVar, oVar2);
    }

    public final synchronized void k() {
        this.f4259j = true;
    }

    public final void l() {
        Socket socket = this.d;
        h1.d.b(socket);
        F1.p pVar = this.f4258h;
        h1.d.b(pVar);
        F1.o oVar = this.i;
        h1.d.b(oVar);
        socket.setSoTimeout(0);
        v1.d dVar = v1.d.f3967h;
        C0239t c0239t = new C0239t(dVar);
        String str = this.f4253b.f3716a.f3583h.d;
        h1.d.e(str, "peerName");
        c0239t.f3182b = socket;
        String str2 = t1.b.f3903g + ' ' + str;
        h1.d.e(str2, "<set-?>");
        c0239t.f3183c = str2;
        c0239t.d = pVar;
        c0239t.f3184e = oVar;
        c0239t.f3185f = this;
        z1.o oVar2 = new z1.o(c0239t);
        this.f4257g = oVar2;
        I.i iVar = z1.o.f4465z;
        int i = 4;
        this.f4264o = (iVar.f335a & 16) != 0 ? ((int[]) iVar.f336b)[4] : Integer.MAX_VALUE;
        z1.x xVar = oVar2.f4486w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = z1.x.f4525f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(t1.b.g(">> CONNECTION " + z1.f.f4442a.b(), new Object[0]));
                }
                F1.o oVar3 = xVar.f4526a;
                F1.i iVar2 = z1.f.f4442a;
                oVar3.getClass();
                h1.d.e(iVar2, "byteString");
                if (oVar3.f264c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f263b.s(iVar2);
                oVar3.g();
                xVar.f4526a.flush();
            } finally {
            }
        }
        z1.x xVar2 = oVar2.f4486w;
        I.i iVar3 = oVar2.f4479p;
        synchronized (xVar2) {
            try {
                h1.d.e(iVar3, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(iVar3.f335a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & iVar3.f335a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        F1.o oVar4 = xVar2.f4526a;
                        if (oVar4.f264c) {
                            throw new IllegalStateException("closed");
                        }
                        F1.f fVar = oVar4.f263b;
                        F1.q q2 = fVar.q(2);
                        int i4 = q2.f270c;
                        byte[] bArr = q2.f268a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f270c = i4 + 2;
                        fVar.f247b += 2;
                        oVar4.g();
                        xVar2.f4526a.i(((int[]) iVar3.f336b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f4526a.flush();
            } finally {
            }
        }
        if (oVar2.f4479p.c() != 65535) {
            oVar2.f4486w.n(0, r2 - 65535);
        }
        dVar.e().c(new v1.b(oVar2.f4468c, oVar2.f4487x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        t tVar = this.f4253b;
        sb.append(tVar.f3716a.f3583h.d);
        sb.append(':');
        sb.append(tVar.f3716a.f3583h.f3652e);
        sb.append(", proxy=");
        sb.append(tVar.f3717b);
        sb.append(" hostAddress=");
        sb.append(tVar.f3718c);
        sb.append(" cipherSuite=");
        s1.i iVar = this.f4255e;
        if (iVar == null || (obj = iVar.f3638b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f4256f);
        sb.append('}');
        return sb.toString();
    }
}
