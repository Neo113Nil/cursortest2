package m1;

import i1.A;
import i1.C0167a;
import i1.r;
import i1.u;
import i1.v;
import i1.x;
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
import l.C0290u;
import p1.w;
import v1.q;
import v1.y;

/* loaded from: classes.dex */
public final class m extends p1.h {

    /* renamed from: b, reason: collision with root package name */
    public final A f3590b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3591c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f3592d;

    /* renamed from: e, reason: collision with root package name */
    public i1.l f3593e;

    /* renamed from: f, reason: collision with root package name */
    public v f3594f;

    /* renamed from: g, reason: collision with root package name */
    public p1.o f3595g;
    public q h;
    public v1.p i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3596j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3597k;

    /* renamed from: l, reason: collision with root package name */
    public int f3598l;

    /* renamed from: m, reason: collision with root package name */
    public int f3599m;

    /* renamed from: n, reason: collision with root package name */
    public int f3600n;

    /* renamed from: o, reason: collision with root package name */
    public int f3601o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3602p;

    /* renamed from: q, reason: collision with root package name */
    public long f3603q;

    public m(n nVar, A a2) {
        X0.f.e(nVar, "connectionPool");
        X0.f.e(a2, "route");
        this.f3590b = a2;
        this.f3601o = 1;
        this.f3602p = new ArrayList();
        this.f3603q = Long.MAX_VALUE;
    }

    public static void d(u uVar, A a2, IOException iOException) {
        X0.f.e(a2, "failedRoute");
        X0.f.e(iOException, "failure");
        if (a2.f2628b.type() != Proxy.Type.DIRECT) {
            C0167a c0167a = a2.f2627a;
            c0167a.f2643g.connectFailed(c0167a.h.g(), a2.f2628b.address(), iOException);
        }
        l1.d dVar = uVar.f2772y;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.f3527a).add(a2);
        }
    }

    @Override // p1.h
    public final synchronized void a(p1.o oVar, H.j jVar) {
        X0.f.e(oVar, "connection");
        X0.f.e(jVar, "settings");
        this.f3601o = (jVar.f240a & 16) != 0 ? ((int[]) jVar.f241b)[4] : Integer.MAX_VALUE;
    }

    @Override // p1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, i1.d dVar) {
        A a2;
        X0.f.e(dVar, "call");
        if (this.f3594f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3590b.f2627a.f2644j;
        b bVar = new b(list);
        C0167a c0167a = this.f3590b.f2627a;
        if (c0167a.f2639c == null) {
            if (!list.contains(i1.j.f2686f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3590b.f2627a.h.f2719d;
            q1.n nVar = q1.n.f3964a;
            if (!q1.n.f3964a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (c0167a.i.contains(v.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                A a3 = this.f3590b;
                if (a3.f2627a.f2639c != null && a3.f2628b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, dVar);
                    if (this.f3591c == null) {
                        a2 = this.f3590b;
                        if (a2.f2627a.f2639c == null && a2.f2628b.type() == Proxy.Type.HTTP && this.f3591c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3603q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, dVar);
                }
                g(bVar, dVar);
                X0.f.e(this.f3590b.f2629c, "inetSocketAddress");
                a2 = this.f3590b;
                if (a2.f2627a.f2639c == null) {
                }
                this.f3603q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.f3592d;
                if (socket != null) {
                    j1.b.c(socket);
                }
                Socket socket2 = this.f3591c;
                if (socket2 != null) {
                    j1.b.c(socket2);
                }
                this.f3592d = null;
                this.f3591c = null;
                this.h = null;
                this.i = null;
                this.f3593e = null;
                this.f3594f = null;
                this.f3595g = null;
                this.f3601o = 1;
                X0.f.e(this.f3590b.f2629c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    q1.l.b(oVar.f3608a, e2);
                    oVar.f3609b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.f3542d = true;
                if (!bVar.f3541c) {
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

    public final void e(int i, int i2, i1.d dVar) {
        Socket createSocket;
        A a2 = this.f3590b;
        Proxy proxy = a2.f2628b;
        C0167a c0167a = a2.f2627a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3586a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = c0167a.f2638b.createSocket();
            X0.f.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3591c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3590b.f2629c;
        X0.f.e(dVar, "call");
        X0.f.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            q1.n nVar = q1.n.f3964a;
            q1.n.f3964a.e(createSocket, this.f3590b.f2629c, i);
            try {
                this.h = new q(r.t(createSocket));
                this.i = new v1.p(r.s(createSocket));
            } catch (NullPointerException e2) {
                if (X0.f.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3590b.f2629c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, i1.d dVar) {
        T.v vVar = new T.v(4);
        A a2 = this.f3590b;
        i1.p pVar = a2.f2627a.h;
        X0.f.e(pVar, "url");
        vVar.f824a = pVar;
        vVar.s("CONNECT", null);
        C0167a c0167a = a2.f2627a;
        vVar.p("Host", j1.b.u(c0167a.h, true));
        vVar.p("Proxy-Connection", "Keep-Alive");
        vVar.p("User-Agent", "okhttp/4.12.0");
        i1.w f2 = vVar.f();
        B0.d dVar2 = new B0.d(24);
        i1.m.d("Proxy-Authenticate");
        i1.m.e("OkHttp-Preemptive", "Proxy-Authenticate");
        dVar2.E("Proxy-Authenticate");
        dVar2.x("Proxy-Authenticate", "OkHttp-Preemptive");
        dVar2.y();
        c0167a.f2642f.getClass();
        e(i, i2, dVar);
        String str = "CONNECT " + j1.b.u(f2.f2780a, true) + " HTTP/1.1";
        q qVar = this.h;
        X0.f.b(qVar);
        v1.p pVar2 = this.i;
        X0.f.b(pVar2);
        p pVar3 = new p(null, this, qVar, pVar2);
        y a3 = qVar.f4509a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a3.g(j2, timeUnit);
        pVar2.f4506a.a().g(i3, timeUnit);
        pVar3.k(f2.f2782c, str);
        pVar3.b();
        x e2 = pVar3.e(false);
        X0.f.b(e2);
        e2.f2785a = f2;
        i1.y a4 = e2.a();
        long i4 = j1.b.i(a4);
        if (i4 != -1) {
            o1.d j3 = pVar3.j(i4);
            j1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a4.f2799d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(X0.e.d("Unexpected response code for CONNECT: ", i5));
            }
            c0167a.f2642f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!qVar.f4510b.g() || !pVar2.f4507b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i1.d dVar) {
        C0167a c0167a = this.f3590b.f2627a;
        SSLSocketFactory sSLSocketFactory = c0167a.f2639c;
        v vVar = v.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0167a.i;
            v vVar2 = v.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(vVar2)) {
                this.f3592d = this.f3591c;
                this.f3594f = vVar;
                return;
            } else {
                this.f3592d = this.f3591c;
                this.f3594f = vVar2;
                l();
                return;
            }
        }
        X0.f.e(dVar, "call");
        C0167a c0167a2 = this.f3590b.f2627a;
        SSLSocketFactory sSLSocketFactory2 = c0167a2.f2639c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            X0.f.b(sSLSocketFactory2);
            Socket socket = this.f3591c;
            i1.p pVar = c0167a2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, pVar.f2719d, pVar.f2720e, true);
            X0.f.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                i1.j a2 = bVar.a(sSLSocket2);
                if (a2.f2688b) {
                    q1.n nVar = q1.n.f3964a;
                    q1.n.f3964a.d(sSLSocket2, c0167a2.h.f2719d, c0167a2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                X0.f.d(session, "sslSocketSession");
                i1.l u2 = q1.l.u(session);
                HostnameVerifier hostnameVerifier = c0167a2.f2640d;
                X0.f.b(hostnameVerifier);
                if (hostnameVerifier.verify(c0167a2.h.f2719d, session)) {
                    i1.f fVar = c0167a2.f2641e;
                    X0.f.b(fVar);
                    this.f3593e = new i1.l(u2.f2702a, u2.f2703b, u2.f2704c, new l(fVar, u2, c0167a2));
                    X0.f.e(c0167a2.h.f2719d, "hostname");
                    Iterator it = fVar.f2661a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f2688b) {
                        q1.n nVar2 = q1.n.f3964a;
                        str = q1.n.f3964a.f(sSLSocket2);
                    }
                    this.f3592d = sSLSocket2;
                    this.h = new q(r.t(sSLSocket2));
                    this.i = new v1.p(r.s(sSLSocket2));
                    if (str != null) {
                        vVar = i1.m.k(str);
                    }
                    this.f3594f = vVar;
                    q1.n nVar3 = q1.n.f3964a;
                    q1.n.f3964a.a(sSLSocket2);
                    if (this.f3594f == v.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = u2.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0167a2.h.f2719d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                X0.f.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0167a2.h.f2719d);
                sb.append(" not verified:\n              |    certificate: ");
                i1.f fVar2 = i1.f.f2660c;
                sb.append(q1.l.a0(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = u1.c.a(x509Certificate, 7);
                List a5 = u1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(e1.e.u0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    q1.n nVar4 = q1.n.f3964a;
                    q1.n.f3964a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    j1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (u1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(C0167a c0167a, ArrayList arrayList) {
        i1.l lVar;
        byte[] bArr = j1.b.f2971a;
        if (this.f3602p.size() < this.f3601o && !this.f3596j) {
            A a2 = this.f3590b;
            if (!a2.f2627a.a(c0167a)) {
                return false;
            }
            i1.p pVar = c0167a.h;
            String str = pVar.f2719d;
            C0167a c0167a2 = a2.f2627a;
            if (X0.f.a(str, c0167a2.h.f2719d)) {
                return true;
            }
            if (this.f3595g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    A a3 = (A) it.next();
                    Proxy.Type type = a3.f2628b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && a2.f2628b.type() == type2) {
                        if (X0.f.a(a2.f2629c, a3.f2629c)) {
                            if (c0167a.f2640d != u1.c.f4239a) {
                                return false;
                            }
                            byte[] bArr2 = j1.b.f2971a;
                            i1.p pVar2 = c0167a2.h;
                            if (pVar.f2720e == pVar2.f2720e) {
                                String str2 = pVar2.f2719d;
                                String str3 = pVar.f2719d;
                                if (!X0.f.a(str3, str2)) {
                                    if (!this.f3597k && (lVar = this.f3593e) != null) {
                                        List a4 = lVar.a();
                                        if (!a4.isEmpty()) {
                                            Object obj = a4.get(0);
                                            X0.f.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    i1.f fVar = c0167a.f2641e;
                                    X0.f.b(fVar);
                                    i1.l lVar2 = this.f3593e;
                                    X0.f.b(lVar2);
                                    List a5 = lVar2.a();
                                    X0.f.e(str3, "hostname");
                                    X0.f.e(a5, "peerCertificates");
                                    Iterator it2 = fVar.f2661a.iterator();
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
        byte[] bArr = j1.b.f2971a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3591c;
        X0.f.b(socket);
        Socket socket2 = this.f3592d;
        X0.f.b(socket2);
        q qVar = this.h;
        X0.f.b(qVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p1.o oVar = this.f3595g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f3823f) {
                    return false;
                }
                if (oVar.f3829n < oVar.f3828m) {
                    if (nanoTime >= oVar.f3830o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3603q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !qVar.g();
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

    public final n1.d j(u uVar, n1.f fVar) {
        Socket socket = this.f3592d;
        X0.f.b(socket);
        q qVar = this.h;
        X0.f.b(qVar);
        v1.p pVar = this.i;
        X0.f.b(pVar);
        p1.o oVar = this.f3595g;
        if (oVar != null) {
            return new p1.p(uVar, this, fVar, oVar);
        }
        int i = fVar.f3667g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.f4509a.a().g(i, timeUnit);
        pVar.f4506a.a().g(fVar.h, timeUnit);
        return new p(uVar, this, qVar, pVar);
    }

    public final synchronized void k() {
        this.f3596j = true;
    }

    public final void l() {
        Socket socket = this.f3592d;
        X0.f.b(socket);
        q qVar = this.h;
        X0.f.b(qVar);
        v1.p pVar = this.i;
        X0.f.b(pVar);
        socket.setSoTimeout(0);
        l1.e eVar = l1.e.h;
        C0290u c0290u = new C0290u(eVar);
        String str = this.f3590b.f2627a.h.f2719d;
        X0.f.e(str, "peerName");
        c0290u.f3463b = socket;
        String str2 = j1.b.f2977g + ' ' + str;
        X0.f.e(str2, "<set-?>");
        c0290u.f3464c = str2;
        c0290u.f3465d = qVar;
        c0290u.f3466e = pVar;
        c0290u.f3467f = this;
        p1.o oVar = new p1.o(c0290u);
        this.f3595g = oVar;
        H.j jVar = p1.o.f3817z;
        int i = 4;
        this.f3601o = (jVar.f240a & 16) != 0 ? ((int[]) jVar.f241b)[4] : Integer.MAX_VALUE;
        p1.x xVar = oVar.f3838w;
        synchronized (xVar) {
            try {
                if (xVar.f3885d) {
                    throw new IOException("closed");
                }
                Logger logger = p1.x.f3881f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(j1.b.g(">> CONNECTION " + p1.f.f3795a.b(), new Object[0]));
                }
                v1.p pVar2 = xVar.f3882a;
                v1.j jVar2 = p1.f.f3795a;
                pVar2.getClass();
                X0.f.e(jVar2, "byteString");
                if (pVar2.f4508c) {
                    throw new IllegalStateException("closed");
                }
                pVar2.f4507b.s(jVar2);
                pVar2.g();
                xVar.f3882a.flush();
            } finally {
            }
        }
        p1.x xVar2 = oVar.f3838w;
        H.j jVar3 = oVar.f3831p;
        synchronized (xVar2) {
            try {
                X0.f.e(jVar3, "settings");
                if (xVar2.f3885d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar3.f240a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar3.f240a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        v1.p pVar3 = xVar2.f3882a;
                        if (pVar3.f4508c) {
                            throw new IllegalStateException("closed");
                        }
                        v1.f fVar = pVar3.f4507b;
                        v1.r q2 = fVar.q(2);
                        int i4 = q2.f4514c;
                        byte[] bArr = q2.f4512a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f4514c = i4 + 2;
                        fVar.f4488b += 2;
                        pVar3.g();
                        xVar2.f3882a.i(((int[]) jVar3.f241b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3882a.flush();
            } finally {
            }
        }
        if (oVar.f3831p.c() != 65535) {
            oVar.f3838w.n(0, r2 - 65535);
        }
        eVar.e().c(new l1.b(oVar.f3820c, oVar.f3839x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        A a2 = this.f3590b;
        sb.append(a2.f2627a.h.f2719d);
        sb.append(':');
        sb.append(a2.f2627a.h.f2720e);
        sb.append(", proxy=");
        sb.append(a2.f2628b);
        sb.append(" hostAddress=");
        sb.append(a2.f2629c);
        sb.append(" cipherSuite=");
        i1.l lVar = this.f3593e;
        if (lVar == null || (obj = lVar.f2703b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3594f);
        sb.append('}');
        return sb.toString();
    }
}
