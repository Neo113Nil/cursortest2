package m1;

import i1.A;
import i1.C0166a;
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
import l.C0274n;
import l.C0290v;
import p1.w;
import v1.q;
import v1.y;

/* loaded from: classes.dex */
public final class m extends p1.h {

    /* renamed from: b, reason: collision with root package name */
    public final A f3586b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3587c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f3588d;

    /* renamed from: e, reason: collision with root package name */
    public i1.l f3589e;

    /* renamed from: f, reason: collision with root package name */
    public v f3590f;

    /* renamed from: g, reason: collision with root package name */
    public p1.o f3591g;
    public q h;
    public v1.p i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3592j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3593k;

    /* renamed from: l, reason: collision with root package name */
    public int f3594l;

    /* renamed from: m, reason: collision with root package name */
    public int f3595m;

    /* renamed from: n, reason: collision with root package name */
    public int f3596n;

    /* renamed from: o, reason: collision with root package name */
    public int f3597o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3598p;

    /* renamed from: q, reason: collision with root package name */
    public long f3599q;

    public m(n nVar, A a2) {
        X0.f.e(nVar, "connectionPool");
        X0.f.e(a2, "route");
        this.f3586b = a2;
        this.f3597o = 1;
        this.f3598p = new ArrayList();
        this.f3599q = Long.MAX_VALUE;
    }

    public static void d(u uVar, A a2, IOException iOException) {
        X0.f.e(a2, "failedRoute");
        X0.f.e(iOException, "failure");
        if (a2.f2624b.type() != Proxy.Type.DIRECT) {
            C0166a c0166a = a2.f2623a;
            c0166a.f2639g.connectFailed(c0166a.h.g(), a2.f2624b.address(), iOException);
        }
        C0274n c0274n = uVar.f2768y;
        synchronized (c0274n) {
            ((LinkedHashSet) c0274n.f3416a).add(a2);
        }
    }

    @Override // p1.h
    public final synchronized void a(p1.o oVar, H.j jVar) {
        X0.f.e(oVar, "connection");
        X0.f.e(jVar, "settings");
        this.f3597o = (jVar.f241a & 16) != 0 ? ((int[]) jVar.f242b)[4] : Integer.MAX_VALUE;
    }

    @Override // p1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, i1.d dVar) {
        A a2;
        X0.f.e(dVar, "call");
        if (this.f3590f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3586b.f2623a.f2640j;
        b bVar = new b(list);
        C0166a c0166a = this.f3586b.f2623a;
        if (c0166a.f2635c == null) {
            if (!list.contains(i1.j.f2682f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3586b.f2623a.h.f2715d;
            q1.n nVar = q1.n.f3960a;
            if (!q1.n.f3960a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (c0166a.i.contains(v.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                A a3 = this.f3586b;
                if (a3.f2623a.f2635c != null && a3.f2624b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, dVar);
                    if (this.f3587c == null) {
                        a2 = this.f3586b;
                        if (a2.f2623a.f2635c == null && a2.f2624b.type() == Proxy.Type.HTTP && this.f3587c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3599q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, dVar);
                }
                g(bVar, dVar);
                X0.f.e(this.f3586b.f2625c, "inetSocketAddress");
                a2 = this.f3586b;
                if (a2.f2623a.f2635c == null) {
                }
                this.f3599q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.f3588d;
                if (socket != null) {
                    j1.b.c(socket);
                }
                Socket socket2 = this.f3587c;
                if (socket2 != null) {
                    j1.b.c(socket2);
                }
                this.f3588d = null;
                this.f3587c = null;
                this.h = null;
                this.i = null;
                this.f3589e = null;
                this.f3590f = null;
                this.f3591g = null;
                this.f3597o = 1;
                X0.f.e(this.f3586b.f2625c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    q1.l.b(oVar.f3604a, e2);
                    oVar.f3605b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.f3538d = true;
                if (!bVar.f3537c) {
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
        A a2 = this.f3586b;
        Proxy proxy = a2.f2624b;
        C0166a c0166a = a2.f2623a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3582a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = c0166a.f2634b.createSocket();
            X0.f.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3587c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3586b.f2625c;
        X0.f.e(dVar, "call");
        X0.f.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            q1.n nVar = q1.n.f3960a;
            q1.n.f3960a.e(createSocket, this.f3586b.f2625c, i);
            try {
                this.h = new q(r.t(createSocket));
                this.i = new v1.p(r.s(createSocket));
            } catch (NullPointerException e2) {
                if (X0.f.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3586b.f2625c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, i1.d dVar) {
        T.v vVar = new T.v(4);
        A a2 = this.f3586b;
        i1.p pVar = a2.f2623a.h;
        X0.f.e(pVar, "url");
        vVar.f823a = pVar;
        vVar.s("CONNECT", null);
        C0166a c0166a = a2.f2623a;
        vVar.p("Host", j1.b.u(c0166a.h, true));
        vVar.p("Proxy-Connection", "Keep-Alive");
        vVar.p("User-Agent", "okhttp/4.12.0");
        i1.w f2 = vVar.f();
        B0.d dVar2 = new B0.d(26);
        i1.m.d("Proxy-Authenticate");
        i1.m.e("OkHttp-Preemptive", "Proxy-Authenticate");
        dVar2.z("Proxy-Authenticate");
        dVar2.s("Proxy-Authenticate", "OkHttp-Preemptive");
        dVar2.t();
        c0166a.f2638f.getClass();
        e(i, i2, dVar);
        String str = "CONNECT " + j1.b.u(f2.f2776a, true) + " HTTP/1.1";
        q qVar = this.h;
        X0.f.b(qVar);
        v1.p pVar2 = this.i;
        X0.f.b(pVar2);
        p pVar3 = new p(null, this, qVar, pVar2);
        y a3 = qVar.f4505a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a3.g(j2, timeUnit);
        pVar2.f4502a.a().g(i3, timeUnit);
        pVar3.k(f2.f2778c, str);
        pVar3.b();
        x e2 = pVar3.e(false);
        X0.f.b(e2);
        e2.f2781a = f2;
        i1.y a4 = e2.a();
        long i4 = j1.b.i(a4);
        if (i4 != -1) {
            o1.d j3 = pVar3.j(i4);
            j1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a4.f2795d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(X0.e.d("Unexpected response code for CONNECT: ", i5));
            }
            c0166a.f2638f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!qVar.f4506b.g() || !pVar2.f4503b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i1.d dVar) {
        C0166a c0166a = this.f3586b.f2623a;
        SSLSocketFactory sSLSocketFactory = c0166a.f2635c;
        v vVar = v.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0166a.i;
            v vVar2 = v.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(vVar2)) {
                this.f3588d = this.f3587c;
                this.f3590f = vVar;
                return;
            } else {
                this.f3588d = this.f3587c;
                this.f3590f = vVar2;
                l();
                return;
            }
        }
        X0.f.e(dVar, "call");
        C0166a c0166a2 = this.f3586b.f2623a;
        SSLSocketFactory sSLSocketFactory2 = c0166a2.f2635c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            X0.f.b(sSLSocketFactory2);
            Socket socket = this.f3587c;
            i1.p pVar = c0166a2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, pVar.f2715d, pVar.f2716e, true);
            X0.f.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                i1.j a2 = bVar.a(sSLSocket2);
                if (a2.f2684b) {
                    q1.n nVar = q1.n.f3960a;
                    q1.n.f3960a.d(sSLSocket2, c0166a2.h.f2715d, c0166a2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                X0.f.d(session, "sslSocketSession");
                i1.l u2 = q1.l.u(session);
                HostnameVerifier hostnameVerifier = c0166a2.f2636d;
                X0.f.b(hostnameVerifier);
                if (hostnameVerifier.verify(c0166a2.h.f2715d, session)) {
                    i1.f fVar = c0166a2.f2637e;
                    X0.f.b(fVar);
                    this.f3589e = new i1.l(u2.f2698a, u2.f2699b, u2.f2700c, new l(fVar, u2, c0166a2));
                    X0.f.e(c0166a2.h.f2715d, "hostname");
                    Iterator it = fVar.f2657a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f2684b) {
                        q1.n nVar2 = q1.n.f3960a;
                        str = q1.n.f3960a.f(sSLSocket2);
                    }
                    this.f3588d = sSLSocket2;
                    this.h = new q(r.t(sSLSocket2));
                    this.i = new v1.p(r.s(sSLSocket2));
                    if (str != null) {
                        vVar = i1.m.k(str);
                    }
                    this.f3590f = vVar;
                    q1.n nVar3 = q1.n.f3960a;
                    q1.n.f3960a.a(sSLSocket2);
                    if (this.f3590f == v.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = u2.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0166a2.h.f2715d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                X0.f.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0166a2.h.f2715d);
                sb.append(" not verified:\n              |    certificate: ");
                i1.f fVar2 = i1.f.f2656c;
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
                    q1.n nVar4 = q1.n.f3960a;
                    q1.n.f3960a.a(sSLSocket);
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
    public final boolean h(C0166a c0166a, ArrayList arrayList) {
        i1.l lVar;
        byte[] bArr = j1.b.f2967a;
        if (this.f3598p.size() < this.f3597o && !this.f3592j) {
            A a2 = this.f3586b;
            if (!a2.f2623a.a(c0166a)) {
                return false;
            }
            i1.p pVar = c0166a.h;
            String str = pVar.f2715d;
            C0166a c0166a2 = a2.f2623a;
            if (X0.f.a(str, c0166a2.h.f2715d)) {
                return true;
            }
            if (this.f3591g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    A a3 = (A) it.next();
                    Proxy.Type type = a3.f2624b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && a2.f2624b.type() == type2) {
                        if (X0.f.a(a2.f2625c, a3.f2625c)) {
                            if (c0166a.f2636d != u1.c.f4235a) {
                                return false;
                            }
                            byte[] bArr2 = j1.b.f2967a;
                            i1.p pVar2 = c0166a2.h;
                            if (pVar.f2716e == pVar2.f2716e) {
                                String str2 = pVar2.f2715d;
                                String str3 = pVar.f2715d;
                                if (!X0.f.a(str3, str2)) {
                                    if (!this.f3593k && (lVar = this.f3589e) != null) {
                                        List a4 = lVar.a();
                                        if (!a4.isEmpty()) {
                                            Object obj = a4.get(0);
                                            X0.f.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    i1.f fVar = c0166a.f2637e;
                                    X0.f.b(fVar);
                                    i1.l lVar2 = this.f3589e;
                                    X0.f.b(lVar2);
                                    List a5 = lVar2.a();
                                    X0.f.e(str3, "hostname");
                                    X0.f.e(a5, "peerCertificates");
                                    Iterator it2 = fVar.f2657a.iterator();
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
        byte[] bArr = j1.b.f2967a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3587c;
        X0.f.b(socket);
        Socket socket2 = this.f3588d;
        X0.f.b(socket2);
        q qVar = this.h;
        X0.f.b(qVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p1.o oVar = this.f3591g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f3819f) {
                    return false;
                }
                if (oVar.f3825n < oVar.f3824m) {
                    if (nanoTime >= oVar.f3826o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3599q;
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
        Socket socket = this.f3588d;
        X0.f.b(socket);
        q qVar = this.h;
        X0.f.b(qVar);
        v1.p pVar = this.i;
        X0.f.b(pVar);
        p1.o oVar = this.f3591g;
        if (oVar != null) {
            return new p1.p(uVar, this, fVar, oVar);
        }
        int i = fVar.f3663g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.f4505a.a().g(i, timeUnit);
        pVar.f4502a.a().g(fVar.h, timeUnit);
        return new p(uVar, this, qVar, pVar);
    }

    public final synchronized void k() {
        this.f3592j = true;
    }

    public final void l() {
        Socket socket = this.f3588d;
        X0.f.b(socket);
        q qVar = this.h;
        X0.f.b(qVar);
        v1.p pVar = this.i;
        X0.f.b(pVar);
        socket.setSoTimeout(0);
        l1.d dVar = l1.d.h;
        C0290v c0290v = new C0290v(dVar);
        String str = this.f3586b.f2623a.h.f2715d;
        X0.f.e(str, "peerName");
        c0290v.f3464b = socket;
        String str2 = j1.b.f2973g + ' ' + str;
        X0.f.e(str2, "<set-?>");
        c0290v.f3465c = str2;
        c0290v.f3466d = qVar;
        c0290v.f3467e = pVar;
        c0290v.f3468f = this;
        p1.o oVar = new p1.o(c0290v);
        this.f3591g = oVar;
        H.j jVar = p1.o.f3813z;
        int i = 4;
        this.f3597o = (jVar.f241a & 16) != 0 ? ((int[]) jVar.f242b)[4] : Integer.MAX_VALUE;
        p1.x xVar = oVar.f3834w;
        synchronized (xVar) {
            try {
                if (xVar.f3881d) {
                    throw new IOException("closed");
                }
                Logger logger = p1.x.f3877f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(j1.b.g(">> CONNECTION " + p1.f.f3791a.b(), new Object[0]));
                }
                v1.p pVar2 = xVar.f3878a;
                v1.j jVar2 = p1.f.f3791a;
                pVar2.getClass();
                X0.f.e(jVar2, "byteString");
                if (pVar2.f4504c) {
                    throw new IllegalStateException("closed");
                }
                pVar2.f4503b.s(jVar2);
                pVar2.g();
                xVar.f3878a.flush();
            } finally {
            }
        }
        p1.x xVar2 = oVar.f3834w;
        H.j jVar3 = oVar.f3827p;
        synchronized (xVar2) {
            try {
                X0.f.e(jVar3, "settings");
                if (xVar2.f3881d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar3.f241a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar3.f241a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        v1.p pVar3 = xVar2.f3878a;
                        if (pVar3.f4504c) {
                            throw new IllegalStateException("closed");
                        }
                        v1.f fVar = pVar3.f4503b;
                        v1.r q2 = fVar.q(2);
                        int i4 = q2.f4510c;
                        byte[] bArr = q2.f4508a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f4510c = i4 + 2;
                        fVar.f4484b += 2;
                        pVar3.g();
                        xVar2.f3878a.i(((int[]) jVar3.f242b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3878a.flush();
            } finally {
            }
        }
        if (oVar.f3827p.c() != 65535) {
            oVar.f3834w.n(0, r2 - 65535);
        }
        dVar.e().c(new l1.b(oVar.f3816c, oVar.f3835x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        A a2 = this.f3586b;
        sb.append(a2.f2623a.h.f2715d);
        sb.append(':');
        sb.append(a2.f2623a.h.f2716e);
        sb.append(", proxy=");
        sb.append(a2.f2624b);
        sb.append(" hostAddress=");
        sb.append(a2.f2625c);
        sb.append(" cipherSuite=");
        i1.l lVar = this.f3589e;
        if (lVar == null || (obj = lVar.f2699b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3590f);
        sb.append('}');
        return sb.toString();
    }
}
