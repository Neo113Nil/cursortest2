package t1;

import C1.x;
import T.u;
import j0.AbstractC0142a;
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
import l.C0243t;
import p1.q;
import p1.r;
import p1.s;
import p1.t;
import p1.v;
import w1.w;

/* loaded from: classes.dex */
public final class m extends w1.h {

    /* renamed from: b, reason: collision with root package name */
    public final v f3774b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3775c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public p1.j f3776e;

    /* renamed from: f, reason: collision with root package name */
    public r f3777f;

    /* renamed from: g, reason: collision with root package name */
    public w1.o f3778g;
    public C1.p h;
    public C1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3779j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3780k;

    /* renamed from: l, reason: collision with root package name */
    public int f3781l;

    /* renamed from: m, reason: collision with root package name */
    public int f3782m;

    /* renamed from: n, reason: collision with root package name */
    public int f3783n;

    /* renamed from: o, reason: collision with root package name */
    public int f3784o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3785p;

    /* renamed from: q, reason: collision with root package name */
    public long f3786q;

    public m(n nVar, v vVar) {
        e1.d.e(nVar, "connectionPool");
        e1.d.e(vVar, "route");
        this.f3774b = vVar;
        this.f3784o = 1;
        this.f3785p = new ArrayList();
        this.f3786q = Long.MAX_VALUE;
    }

    public static void d(q qVar, v vVar, IOException iOException) {
        e1.d.e(vVar, "failedRoute");
        e1.d.e(iOException, "failure");
        if (vVar.f3443b.type() != Proxy.Type.DIRECT) {
            p1.a aVar = vVar.f3442a;
            aVar.f3300g.connectFailed(aVar.h.g(), vVar.f3443b.address(), iOException);
        }
        p1.g gVar = qVar.f3412y;
        synchronized (gVar) {
            ((LinkedHashSet) gVar.f3336a).add(vVar);
        }
    }

    @Override // w1.h
    public final synchronized void a(w1.o oVar, H.j jVar) {
        e1.d.e(oVar, "connection");
        e1.d.e(jVar, "settings");
        this.f3784o = (jVar.f273a & 16) != 0 ? ((int[]) jVar.f274b)[4] : Integer.MAX_VALUE;
    }

    @Override // w1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        v vVar;
        e1.d.e(jVar, "call");
        if (this.f3777f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3774b.f3442a.f3301j;
        b bVar = new b(list);
        p1.a aVar = this.f3774b.f3442a;
        if (aVar.f3297c == null) {
            if (!list.contains(p1.h.f3338f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3774b.f3442a.h.d;
            x1.n nVar = x1.n.f4286a;
            if (!x1.n.f4286a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                v vVar2 = this.f3774b;
                if (vVar2.f3442a.f3297c != null && vVar2.f3443b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3775c == null) {
                        vVar = this.f3774b;
                        if (vVar.f3442a.f3297c == null && vVar.f3443b.type() == Proxy.Type.HTTP && this.f3775c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3786q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                e1.d.e(this.f3774b.f3444c, "inetSocketAddress");
                vVar = this.f3774b;
                if (vVar.f3442a.f3297c == null) {
                }
                this.f3786q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    q1.b.c(socket);
                }
                Socket socket2 = this.f3775c;
                if (socket2 != null) {
                    q1.b.c(socket2);
                }
                this.d = null;
                this.f3775c = null;
                this.h = null;
                this.i = null;
                this.f3776e = null;
                this.f3777f = null;
                this.f3778g = null;
                this.f3784o = 1;
                e1.d.e(this.f3774b.f3444c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    x1.d.e(oVar.f3790a, e2);
                    oVar.f3791b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3732c) {
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
        v vVar = this.f3774b;
        Proxy proxy = vVar.f3443b;
        p1.a aVar = vVar.f3442a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3771a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f3296b.createSocket();
            e1.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3775c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3774b.f3444c;
        e1.d.e(jVar, "call");
        e1.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            x1.n nVar = x1.n.f4286a;
            x1.n.f4286a.e(createSocket, this.f3774b.f3444c, i);
            try {
                this.h = new C1.p(x1.l.g0(createSocket));
                this.i = new C1.o(x1.l.f0(createSocket));
            } catch (NullPointerException e2) {
                if (e1.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3774b.f3444c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        u uVar = new u(6);
        v vVar = this.f3774b;
        p1.m mVar = vVar.f3442a.h;
        e1.d.e(mVar, "url");
        uVar.f828a = mVar;
        uVar.o("CONNECT", null);
        p1.a aVar = vVar.f3442a;
        uVar.k("Host", q1.b.u(aVar.h, true));
        uVar.k("Proxy-Connection", "Keep-Alive");
        uVar.k("User-Agent", "okhttp/4.12.0");
        H.e b2 = uVar.b();
        p1.g gVar = new p1.g(1);
        AbstractC0142a.c("Proxy-Authenticate");
        AbstractC0142a.d("OkHttp-Preemptive", "Proxy-Authenticate");
        gVar.e("Proxy-Authenticate");
        gVar.c("Proxy-Authenticate", "OkHttp-Preemptive");
        gVar.d();
        aVar.f3299f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + q1.b.u((p1.m) b2.f259c, true) + " HTTP/1.1";
        C1.p pVar = this.h;
        e1.d.b(pVar);
        C1.o oVar = this.i;
        e1.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f200a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f197a.a().g(i3, timeUnit);
        pVar2.k((p1.k) b2.d, str);
        pVar2.a();
        s e2 = pVar2.e(false);
        e1.d.b(e2);
        e2.f3419a = b2;
        t a3 = e2.a();
        long i4 = q1.b.i(a3);
        if (i4 != -1) {
            v1.d j3 = pVar2.j(i4);
            q1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(T0.c.d("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f3299f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f201b.g() || !oVar.f198b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        p1.a aVar = this.f3774b.f3442a;
        SSLSocketFactory sSLSocketFactory = aVar.f3297c;
        r rVar = r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            r rVar2 = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar2)) {
                this.d = this.f3775c;
                this.f3777f = rVar;
                return;
            } else {
                this.d = this.f3775c;
                this.f3777f = rVar2;
                l();
                return;
            }
        }
        e1.d.e(jVar, "call");
        p1.a aVar2 = this.f3774b.f3442a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f3297c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            e1.d.b(sSLSocketFactory2);
            Socket socket = this.f3775c;
            p1.m mVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, mVar.d, mVar.f3366e, true);
            e1.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                p1.h a2 = bVar.a(sSLSocket2);
                if (a2.f3340b) {
                    x1.n nVar = x1.n.f4286a;
                    x1.n.f4286a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                e1.d.d(session, "sslSocketSession");
                p1.j g2 = k0.k.g(session);
                B1.c cVar = aVar2.d;
                e1.d.b(cVar);
                if (cVar.verify(aVar2.h.d, session)) {
                    p1.d dVar = aVar2.f3298e;
                    e1.d.b(dVar);
                    this.f3776e = new p1.j(g2.f3352a, g2.f3353b, g2.f3354c, new l(dVar, g2, aVar2));
                    e1.d.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f3317a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f3340b) {
                        x1.n nVar2 = x1.n.f4286a;
                        str = x1.n.f4286a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new C1.p(x1.l.g0(sSLSocket2));
                    this.i = new C1.o(x1.l.f0(sSLSocket2));
                    if (str != null) {
                        rVar = AbstractC0142a.i(str);
                    }
                    this.f3777f = rVar;
                    x1.n nVar3 = x1.n.f4286a;
                    x1.n.f4286a.a(sSLSocket2);
                    if (this.f3777f == r.HTTP_2) {
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
                e1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                p1.d dVar2 = p1.d.f3316c;
                sb.append(k0.k.o(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = B1.c.a(x509Certificate, 7);
                List a5 = B1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(l1.e.p(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    x1.n nVar4 = x1.n.f4286a;
                    x1.n.f4286a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    q1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (B1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(p1.a aVar, ArrayList arrayList) {
        p1.j jVar;
        byte[] bArr = q1.b.f3491a;
        if (this.f3785p.size() < this.f3784o && !this.f3779j) {
            v vVar = this.f3774b;
            if (!vVar.f3442a.a(aVar)) {
                return false;
            }
            p1.m mVar = aVar.h;
            String str = mVar.d;
            p1.a aVar2 = vVar.f3442a;
            if (e1.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3778g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    v vVar2 = (v) it.next();
                    Proxy.Type type = vVar2.f3443b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && vVar.f3443b.type() == type2) {
                        if (e1.d.a(vVar.f3444c, vVar2.f3444c)) {
                            if (aVar.d != B1.c.f56a) {
                                return false;
                            }
                            byte[] bArr2 = q1.b.f3491a;
                            p1.m mVar2 = aVar2.h;
                            if (mVar.f3366e == mVar2.f3366e) {
                                String str2 = mVar2.d;
                                String str3 = mVar.d;
                                if (!e1.d.a(str3, str2)) {
                                    if (!this.f3780k && (jVar = this.f3776e) != null) {
                                        List a2 = jVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            e1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    p1.d dVar = aVar.f3298e;
                                    e1.d.b(dVar);
                                    p1.j jVar2 = this.f3776e;
                                    e1.d.b(jVar2);
                                    List a3 = jVar2.a();
                                    e1.d.e(str3, "hostname");
                                    e1.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f3317a.iterator();
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
        byte[] bArr = q1.b.f3491a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3775c;
        e1.d.b(socket);
        Socket socket2 = this.d;
        e1.d.b(socket2);
        C1.p pVar = this.h;
        e1.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        w1.o oVar = this.f3778g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f4127f) {
                    return false;
                }
                if (oVar.f4133n < oVar.f4132m) {
                    if (nanoTime >= oVar.f4134o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3786q;
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

    public final u1.d j(q qVar, u1.f fVar) {
        Socket socket = this.d;
        e1.d.b(socket);
        C1.p pVar = this.h;
        e1.d.b(pVar);
        C1.o oVar = this.i;
        e1.d.b(oVar);
        w1.o oVar2 = this.f3778g;
        if (oVar2 != null) {
            return new w1.p(qVar, this, fVar, oVar2);
        }
        int i = fVar.f3830g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f200a.a().g(i, timeUnit);
        oVar.f197a.a().g(fVar.h, timeUnit);
        return new p(qVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f3779j = true;
    }

    public final void l() {
        Socket socket = this.d;
        e1.d.b(socket);
        C1.p pVar = this.h;
        e1.d.b(pVar);
        C1.o oVar = this.i;
        e1.d.b(oVar);
        socket.setSoTimeout(0);
        s1.d dVar = s1.d.h;
        C0243t c0243t = new C0243t(dVar);
        String str = this.f3774b.f3442a.h.d;
        e1.d.e(str, "peerName");
        c0243t.f3053b = socket;
        String str2 = q1.b.f3496g + ' ' + str;
        e1.d.e(str2, "<set-?>");
        c0243t.f3054c = str2;
        c0243t.d = pVar;
        c0243t.f3055e = oVar;
        c0243t.f3056f = this;
        w1.o oVar2 = new w1.o(c0243t);
        this.f3778g = oVar2;
        H.j jVar = w1.o.f4122z;
        int i = 4;
        this.f3784o = (jVar.f273a & 16) != 0 ? ((int[]) jVar.f274b)[4] : Integer.MAX_VALUE;
        w1.x xVar = oVar2.f4142w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = w1.x.f4179f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(q1.b.g(">> CONNECTION " + w1.f.f4101a.b(), new Object[0]));
                }
                C1.o oVar3 = xVar.f4180a;
                C1.i iVar = w1.f.f4101a;
                oVar3.getClass();
                e1.d.e(iVar, "byteString");
                if (oVar3.f199c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f198b.s(iVar);
                oVar3.g();
                xVar.f4180a.flush();
            } finally {
            }
        }
        w1.x xVar2 = oVar2.f4142w;
        H.j jVar2 = oVar2.f4135p;
        synchronized (xVar2) {
            try {
                e1.d.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar2.f273a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f273a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        C1.o oVar4 = xVar2.f4180a;
                        if (oVar4.f199c) {
                            throw new IllegalStateException("closed");
                        }
                        C1.f fVar = oVar4.f198b;
                        C1.q q2 = fVar.q(2);
                        int i4 = q2.f205c;
                        byte[] bArr = q2.f203a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f205c = i4 + 2;
                        fVar.f182b += 2;
                        oVar4.g();
                        xVar2.f4180a.i(((int[]) jVar2.f274b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f4180a.flush();
            } finally {
            }
        }
        if (oVar2.f4135p.c() != 65535) {
            oVar2.f4142w.n(0, r2 - 65535);
        }
        dVar.e().c(new s1.b(oVar2.f4125c, oVar2.f4143x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        v vVar = this.f3774b;
        sb.append(vVar.f3442a.h.d);
        sb.append(':');
        sb.append(vVar.f3442a.h.f3366e);
        sb.append(", proxy=");
        sb.append(vVar.f3443b);
        sb.append(" hostAddress=");
        sb.append(vVar.f3444c);
        sb.append(" cipherSuite=");
        p1.j jVar = this.f3776e;
        if (jVar == null || (obj = jVar.f3353b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3777f);
        sb.append('}');
        return sb.toString();
    }
}
