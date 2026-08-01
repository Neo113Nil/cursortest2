package o1;

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
import k0.y;
import k1.r;
import k1.s;
import k1.t;
import k1.w;
import l.C0229n;
import l.C0243u;
import x1.q;
import x1.x;

/* loaded from: classes.dex */
public final class m extends r1.h {

    /* renamed from: b, reason: collision with root package name */
    public final w f3407b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3408c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public k1.k f3409e;

    /* renamed from: f, reason: collision with root package name */
    public s f3410f;

    /* renamed from: g, reason: collision with root package name */
    public r1.o f3411g;
    public x1.p h;
    public x1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3412j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3413k;

    /* renamed from: l, reason: collision with root package name */
    public int f3414l;

    /* renamed from: m, reason: collision with root package name */
    public int f3415m;

    /* renamed from: n, reason: collision with root package name */
    public int f3416n;

    /* renamed from: o, reason: collision with root package name */
    public int f3417o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3418p;

    /* renamed from: q, reason: collision with root package name */
    public long f3419q;

    public m(n nVar, w wVar) {
        Z0.d.e(nVar, "connectionPool");
        Z0.d.e(wVar, "route");
        this.f3407b = wVar;
        this.f3417o = 1;
        this.f3418p = new ArrayList();
        this.f3419q = Long.MAX_VALUE;
    }

    public static void d(r rVar, w wVar, IOException iOException) {
        Z0.d.e(wVar, "failedRoute");
        Z0.d.e(iOException, "failure");
        if (wVar.f2911b.type() != Proxy.Type.DIRECT) {
            k1.a aVar = wVar.f2910a;
            aVar.f2766g.connectFailed(aVar.h.g(), wVar.f2911b.address(), iOException);
        }
        C0229n c0229n = rVar.f2880y;
        synchronized (c0229n) {
            ((LinkedHashSet) c0229n.f3111a).add(wVar);
        }
    }

    @Override // r1.h
    public final synchronized void a(r1.o oVar, H.j jVar) {
        Z0.d.e(oVar, "connection");
        Z0.d.e(jVar, "settings");
        this.f3417o = (jVar.f213a & 16) != 0 ? ((int[]) jVar.f214b)[4] : Integer.MAX_VALUE;
    }

    @Override // r1.h
    public final void b(r1.w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        w wVar;
        Z0.d.e(jVar, "call");
        if (this.f3410f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3407b.f2910a.f2767j;
        b bVar = new b(list);
        k1.a aVar = this.f3407b.f2910a;
        if (aVar.f2763c == null) {
            if (!list.contains(k1.i.f2806f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3407b.f2910a.h.d;
            s1.n nVar = s1.n.f3825a;
            if (!s1.n.f3825a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(s.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                w wVar2 = this.f3407b;
                if (wVar2.f2910a.f2763c != null && wVar2.f2911b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3408c == null) {
                        wVar = this.f3407b;
                        if (wVar.f2910a.f2763c == null && wVar.f2911b.type() == Proxy.Type.HTTP && this.f3408c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3419q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                Z0.d.e(this.f3407b.f2912c, "inetSocketAddress");
                wVar = this.f3407b;
                if (wVar.f2910a.f2763c == null) {
                }
                this.f3419q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    l1.b.c(socket);
                }
                Socket socket2 = this.f3408c;
                if (socket2 != null) {
                    l1.b.c(socket2);
                }
                this.d = null;
                this.f3408c = null;
                this.h = null;
                this.i = null;
                this.f3409e = null;
                this.f3410f = null;
                this.f3411g = null;
                this.f3417o = 1;
                Z0.d.e(this.f3407b.f2912c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    s1.d.d(oVar.f3423a, e2);
                    oVar.f3424b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3365c) {
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
        w wVar = this.f3407b;
        Proxy proxy = wVar.f2911b;
        k1.a aVar = wVar.f2910a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3404a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f2762b.createSocket();
            Z0.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3408c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3407b.f2912c;
        Z0.d.e(jVar, "call");
        Z0.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            s1.n nVar = s1.n.f3825a;
            s1.n.f3825a.e(createSocket, this.f3407b.f2912c, i);
            try {
                this.h = new x1.p(k1.c.x(createSocket));
                this.i = new x1.o(k1.c.w(createSocket));
            } catch (NullPointerException e2) {
                if (Z0.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3407b.f2912c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        u uVar = new u(6);
        w wVar = this.f3407b;
        k1.n nVar = wVar.f2910a.h;
        Z0.d.e(nVar, "url");
        uVar.f791a = nVar;
        uVar.o("CONNECT", null);
        k1.a aVar = wVar.f2910a;
        uVar.l("Host", l1.b.u(aVar.h, true));
        uVar.l("Proxy-Connection", "Keep-Alive");
        uVar.l("User-Agent", "okhttp/4.12.0");
        H.e b2 = uVar.b();
        C.g gVar = new C.g(28);
        k1.c.e("Proxy-Authenticate");
        k1.c.g("OkHttp-Preemptive", "Proxy-Authenticate");
        gVar.A("Proxy-Authenticate");
        gVar.s("Proxy-Authenticate", "OkHttp-Preemptive");
        gVar.t();
        aVar.f2765f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + l1.b.u((k1.n) b2.f199c, true) + " HTTP/1.1";
        x1.p pVar = this.h;
        Z0.d.b(pVar);
        x1.o oVar = this.i;
        Z0.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f4254a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f4251a.a().g(i3, timeUnit);
        pVar2.k((k1.l) b2.d, str);
        pVar2.a();
        t f2 = pVar2.f(false);
        Z0.d.b(f2);
        f2.f2887a = b2;
        k1.u a3 = f2.a();
        long i4 = l1.b.i(a3);
        if (i4 != -1) {
            q1.d j3 = pVar2.j(i4);
            l1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.d("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f2765f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f4255b.f() || !oVar.f4252b.f()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        k1.a aVar = this.f3407b.f2910a;
        SSLSocketFactory sSLSocketFactory = aVar.f2763c;
        s sVar = s.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            s sVar2 = s.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(sVar2)) {
                this.d = this.f3408c;
                this.f3410f = sVar;
                return;
            } else {
                this.d = this.f3408c;
                this.f3410f = sVar2;
                l();
                return;
            }
        }
        Z0.d.e(jVar, "call");
        k1.a aVar2 = this.f3407b.f2910a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f2763c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Z0.d.b(sSLSocketFactory2);
            Socket socket = this.f3408c;
            k1.n nVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, nVar.d, nVar.f2834e, true);
            Z0.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                k1.i a2 = bVar.a(sSLSocket2);
                if (a2.f2808b) {
                    s1.n nVar2 = s1.n.f3825a;
                    s1.n.f3825a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Z0.d.d(session, "sslSocketSession");
                k1.k f2 = y.f(session);
                HostnameVerifier hostnameVerifier = aVar2.d;
                Z0.d.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.h.d, session)) {
                    k1.e eVar = aVar2.f2764e;
                    Z0.d.b(eVar);
                    this.f3409e = new k1.k(f2.f2820a, f2.f2821b, f2.f2822c, new l(eVar, f2, aVar2));
                    Z0.d.e(aVar2.h.d, "hostname");
                    Iterator it = eVar.f2783a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f2808b) {
                        s1.n nVar3 = s1.n.f3825a;
                        str = s1.n.f3825a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new x1.p(k1.c.x(sSLSocket2));
                    this.i = new x1.o(k1.c.w(sSLSocket2));
                    if (str != null) {
                        sVar = k1.c.l(str);
                    }
                    this.f3410f = sVar;
                    s1.n nVar4 = s1.n.f3825a;
                    s1.n.f3825a.a(sSLSocket2);
                    if (this.f3410f == s.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = f2.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                Z0.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                k1.e eVar2 = k1.e.f2782c;
                sb.append(y.k(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = w1.c.a(x509Certificate, 7);
                List a5 = w1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(g1.e.n0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    s1.n nVar5 = s1.n.f3825a;
                    s1.n.f3825a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    l1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (w1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(k1.a aVar, ArrayList arrayList) {
        k1.k kVar;
        byte[] bArr = l1.b.f3252a;
        if (this.f3418p.size() < this.f3417o && !this.f3412j) {
            w wVar = this.f3407b;
            if (!wVar.f2910a.a(aVar)) {
                return false;
            }
            k1.n nVar = aVar.h;
            String str = nVar.d;
            k1.a aVar2 = wVar.f2910a;
            if (Z0.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3411g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w wVar2 = (w) it.next();
                    Proxy.Type type = wVar2.f2911b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && wVar.f2911b.type() == type2) {
                        if (Z0.d.a(wVar.f2912c, wVar2.f2912c)) {
                            if (aVar.d != w1.c.f4144a) {
                                return false;
                            }
                            byte[] bArr2 = l1.b.f3252a;
                            k1.n nVar2 = aVar2.h;
                            if (nVar.f2834e == nVar2.f2834e) {
                                String str2 = nVar2.d;
                                String str3 = nVar.d;
                                if (!Z0.d.a(str3, str2)) {
                                    if (!this.f3413k && (kVar = this.f3409e) != null) {
                                        List a2 = kVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            Z0.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    k1.e eVar = aVar.f2764e;
                                    Z0.d.b(eVar);
                                    k1.k kVar2 = this.f3409e;
                                    Z0.d.b(kVar2);
                                    List a3 = kVar2.a();
                                    Z0.d.e(str3, "hostname");
                                    Z0.d.e(a3, "peerCertificates");
                                    Iterator it2 = eVar.f2783a.iterator();
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
        byte[] bArr = l1.b.f3252a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3408c;
        Z0.d.b(socket);
        Socket socket2 = this.d;
        Z0.d.b(socket2);
        x1.p pVar = this.h;
        Z0.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        r1.o oVar = this.f3411g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f3576f) {
                    return false;
                }
                if (oVar.f3582n < oVar.f3581m) {
                    if (nanoTime >= oVar.f3583o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3419q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !pVar.f();
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

    public final p1.d j(r rVar, p1.f fVar) {
        Socket socket = this.d;
        Z0.d.b(socket);
        x1.p pVar = this.h;
        Z0.d.b(pVar);
        x1.o oVar = this.i;
        Z0.d.b(oVar);
        r1.o oVar2 = this.f3411g;
        if (oVar2 != null) {
            return new r1.p(rVar, this, fVar, oVar2);
        }
        int i = fVar.f3472g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f4254a.a().g(i, timeUnit);
        oVar.f4251a.a().g(fVar.h, timeUnit);
        return new p(rVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f3412j = true;
    }

    public final void l() {
        Socket socket = this.d;
        Z0.d.b(socket);
        x1.p pVar = this.h;
        Z0.d.b(pVar);
        x1.o oVar = this.i;
        Z0.d.b(oVar);
        socket.setSoTimeout(0);
        n1.d dVar = n1.d.h;
        C0243u c0243u = new C0243u(dVar);
        String str = this.f3407b.f2910a.h.d;
        Z0.d.e(str, "peerName");
        c0243u.f3147b = socket;
        String str2 = l1.b.f3257g + ' ' + str;
        Z0.d.e(str2, "<set-?>");
        c0243u.f3148c = str2;
        c0243u.d = pVar;
        c0243u.f3149e = oVar;
        c0243u.f3150f = this;
        r1.o oVar2 = new r1.o(c0243u);
        this.f3411g = oVar2;
        H.j jVar = r1.o.f3571z;
        int i = 4;
        this.f3417o = (jVar.f213a & 16) != 0 ? ((int[]) jVar.f214b)[4] : Integer.MAX_VALUE;
        r1.x xVar = oVar2.f3591w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = r1.x.f3628f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(l1.b.g(">> CONNECTION " + r1.f.f3550a.b(), new Object[0]));
                }
                x1.o oVar3 = xVar.f3629a;
                x1.i iVar = r1.f.f3550a;
                oVar3.getClass();
                Z0.d.e(iVar, "byteString");
                if (oVar3.f4253c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f4252b.s(iVar);
                oVar3.f();
                xVar.f3629a.flush();
            } finally {
            }
        }
        r1.x xVar2 = oVar2.f3591w;
        H.j jVar2 = oVar2.f3584p;
        synchronized (xVar2) {
            try {
                Z0.d.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar2.f213a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f213a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        x1.o oVar4 = xVar2.f3629a;
                        if (oVar4.f4253c) {
                            throw new IllegalStateException("closed");
                        }
                        x1.f fVar = oVar4.f4252b;
                        q q2 = fVar.q(2);
                        int i4 = q2.f4259c;
                        byte[] bArr = q2.f4257a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f4259c = i4 + 2;
                        fVar.f4236b += 2;
                        oVar4.f();
                        xVar2.f3629a.i(((int[]) jVar2.f214b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3629a.flush();
            } finally {
            }
        }
        if (oVar2.f3584p.c() != 65535) {
            oVar2.f3591w.n(0, r2 - 65535);
        }
        dVar.e().c(new n1.b(oVar2.f3574c, oVar2.f3592x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        w wVar = this.f3407b;
        sb.append(wVar.f2910a.h.d);
        sb.append(':');
        sb.append(wVar.f2910a.h.f2834e);
        sb.append(", proxy=");
        sb.append(wVar.f2911b);
        sb.append(" hostAddress=");
        sb.append(wVar.f2912c);
        sb.append(" cipherSuite=");
        k1.k kVar = this.f3409e;
        if (kVar == null || (obj = kVar.f2821b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3410f);
        sb.append('}');
        return sb.toString();
    }
}
