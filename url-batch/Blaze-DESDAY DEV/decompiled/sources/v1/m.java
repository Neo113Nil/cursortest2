package v1;

import E1.x;
import U.u;
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
import k0.AbstractC0180a;
import l.C0237t;
import r1.q;
import r1.r;
import r1.s;
import r1.t;
import r1.v;
import y1.w;

/* loaded from: classes.dex */
public final class m extends y1.h {

    /* renamed from: b, reason: collision with root package name */
    public final v f4061b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f4062c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public r1.j f4063e;

    /* renamed from: f, reason: collision with root package name */
    public r f4064f;

    /* renamed from: g, reason: collision with root package name */
    public y1.o f4065g;
    public E1.p h;
    public E1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4066j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4067k;

    /* renamed from: l, reason: collision with root package name */
    public int f4068l;

    /* renamed from: m, reason: collision with root package name */
    public int f4069m;

    /* renamed from: n, reason: collision with root package name */
    public int f4070n;

    /* renamed from: o, reason: collision with root package name */
    public int f4071o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f4072p;

    /* renamed from: q, reason: collision with root package name */
    public long f4073q;

    public m(n nVar, v vVar) {
        g1.d.e(nVar, "connectionPool");
        g1.d.e(vVar, "route");
        this.f4061b = vVar;
        this.f4071o = 1;
        this.f4072p = new ArrayList();
        this.f4073q = Long.MAX_VALUE;
    }

    public static void d(q qVar, v vVar, IOException iOException) {
        g1.d.e(vVar, "failedRoute");
        g1.d.e(iOException, "failure");
        if (vVar.f3543b.type() != Proxy.Type.DIRECT) {
            r1.a aVar = vVar.f3542a;
            aVar.f3400g.connectFailed(aVar.h.g(), vVar.f3543b.address(), iOException);
        }
        r1.g gVar = qVar.f3512y;
        synchronized (gVar) {
            ((LinkedHashSet) gVar.f3436a).add(vVar);
        }
    }

    @Override // y1.h
    public final synchronized void a(y1.o oVar, H.j jVar) {
        g1.d.e(oVar, "connection");
        g1.d.e(jVar, "settings");
        this.f4071o = (jVar.f292a & 16) != 0 ? ((int[]) jVar.f293b)[4] : Integer.MAX_VALUE;
    }

    @Override // y1.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        v vVar;
        g1.d.e(jVar, "call");
        if (this.f4064f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f4061b.f3542a.f3401j;
        b bVar = new b(list);
        r1.a aVar = this.f4061b.f3542a;
        if (aVar.f3397c == null) {
            if (!list.contains(r1.h.f3438f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f4061b.f3542a.h.d;
            z1.n nVar = z1.n.f4366a;
            if (!z1.n.f4366a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                v vVar2 = this.f4061b;
                if (vVar2.f3542a.f3397c != null && vVar2.f3543b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f4062c == null) {
                        vVar = this.f4061b;
                        if (vVar.f3542a.f3397c == null && vVar.f3543b.type() == Proxy.Type.HTTP && this.f4062c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f4073q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                g1.d.e(this.f4061b.f3544c, "inetSocketAddress");
                vVar = this.f4061b;
                if (vVar.f3542a.f3397c == null) {
                }
                this.f4073q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    s1.b.c(socket);
                }
                Socket socket2 = this.f4062c;
                if (socket2 != null) {
                    s1.b.c(socket2);
                }
                this.d = null;
                this.f4062c = null;
                this.h = null;
                this.i = null;
                this.f4063e = null;
                this.f4064f = null;
                this.f4065g = null;
                this.f4071o = 1;
                g1.d.e(this.f4061b.f3544c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    z1.d.h(oVar.f4077a, e2);
                    oVar.f4078b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f4019c) {
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
        v vVar = this.f4061b;
        Proxy proxy = vVar.f3543b;
        r1.a aVar = vVar.f3542a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f4058a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f3396b.createSocket();
            g1.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f4062c = createSocket;
        InetSocketAddress inetSocketAddress = this.f4061b.f3544c;
        g1.d.e(jVar, "call");
        g1.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            z1.n nVar = z1.n.f4366a;
            z1.n.f4366a.e(createSocket, this.f4061b.f3544c, i);
            try {
                this.h = new E1.p(z1.l.Z(createSocket));
                this.i = new E1.o(z1.l.Y(createSocket));
            } catch (NullPointerException e2) {
                if (g1.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4061b.f3544c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        u uVar = new u(6);
        v vVar = this.f4061b;
        r1.m mVar = vVar.f3542a.h;
        g1.d.e(mVar, "url");
        uVar.f883a = mVar;
        uVar.o("CONNECT", null);
        r1.a aVar = vVar.f3542a;
        uVar.k("Host", s1.b.u(aVar.h, true));
        uVar.k("Proxy-Connection", "Keep-Alive");
        uVar.k("User-Agent", "okhttp/4.12.0");
        H.e b2 = uVar.b();
        r1.g gVar = new r1.g(1);
        i0.g.b("Proxy-Authenticate");
        i0.g.d("OkHttp-Preemptive", "Proxy-Authenticate");
        gVar.e("Proxy-Authenticate");
        gVar.c("Proxy-Authenticate", "OkHttp-Preemptive");
        gVar.d();
        aVar.f3399f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + s1.b.u((r1.m) b2.f278c, true) + " HTTP/1.1";
        E1.p pVar = this.h;
        g1.d.b(pVar);
        E1.o oVar = this.i;
        g1.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f221a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f218a.a().g(i3, timeUnit);
        pVar2.k((r1.k) b2.d, str);
        pVar2.a();
        s f2 = pVar2.f(false);
        g1.d.b(f2);
        f2.f3519a = b2;
        t a3 = f2.a();
        long i4 = s1.b.i(a3);
        if (i4 != -1) {
            x1.d j3 = pVar2.j(i4);
            s1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.e("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f3399f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f222b.g() || !oVar.f219b.g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        r1.a aVar = this.f4061b.f3542a;
        SSLSocketFactory sSLSocketFactory = aVar.f3397c;
        r rVar = r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            r rVar2 = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar2)) {
                this.d = this.f4062c;
                this.f4064f = rVar;
                return;
            } else {
                this.d = this.f4062c;
                this.f4064f = rVar2;
                l();
                return;
            }
        }
        g1.d.e(jVar, "call");
        r1.a aVar2 = this.f4061b.f3542a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f3397c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            g1.d.b(sSLSocketFactory2);
            Socket socket = this.f4062c;
            r1.m mVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, mVar.d, mVar.f3466e, true);
            g1.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                r1.h a2 = bVar.a(sSLSocket2);
                if (a2.f3440b) {
                    z1.n nVar = z1.n.f4366a;
                    z1.n.f4366a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                g1.d.d(session, "sslSocketSession");
                r1.j f2 = AbstractC0180a.f(session);
                D1.c cVar = aVar2.d;
                g1.d.b(cVar);
                if (cVar.verify(aVar2.h.d, session)) {
                    r1.d dVar = aVar2.f3398e;
                    g1.d.b(dVar);
                    this.f4063e = new r1.j(f2.f3452a, f2.f3453b, f2.f3454c, new l(dVar, f2, aVar2));
                    g1.d.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f3417a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f3440b) {
                        z1.n nVar2 = z1.n.f4366a;
                        str = z1.n.f4366a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new E1.p(z1.l.Z(sSLSocket2));
                    this.i = new E1.o(z1.l.Y(sSLSocket2));
                    if (str != null) {
                        rVar = i0.g.k(str);
                    }
                    this.f4064f = rVar;
                    z1.n nVar3 = z1.n.f4366a;
                    z1.n.f4366a.a(sSLSocket2);
                    if (this.f4064f == r.HTTP_2) {
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
                g1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                r1.d dVar2 = r1.d.f3416c;
                sb.append(AbstractC0180a.o(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = D1.c.a(x509Certificate, 7);
                List a5 = D1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(n1.e.t(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    z1.n nVar4 = z1.n.f4366a;
                    z1.n.f4366a.a(sSLSocket);
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
        r1.j jVar;
        byte[] bArr = s1.b.f3721a;
        if (this.f4072p.size() < this.f4071o && !this.f4066j) {
            v vVar = this.f4061b;
            if (!vVar.f3542a.a(aVar)) {
                return false;
            }
            r1.m mVar = aVar.h;
            String str = mVar.d;
            r1.a aVar2 = vVar.f3542a;
            if (g1.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f4065g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    v vVar2 = (v) it.next();
                    Proxy.Type type = vVar2.f3543b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && vVar.f3543b.type() == type2) {
                        if (g1.d.a(vVar.f3544c, vVar2.f3544c)) {
                            if (aVar.d != D1.c.f188a) {
                                return false;
                            }
                            byte[] bArr2 = s1.b.f3721a;
                            r1.m mVar2 = aVar2.h;
                            if (mVar.f3466e == mVar2.f3466e) {
                                String str2 = mVar2.d;
                                String str3 = mVar.d;
                                if (!g1.d.a(str3, str2)) {
                                    if (!this.f4067k && (jVar = this.f4063e) != null) {
                                        List a2 = jVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            g1.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    r1.d dVar = aVar.f3398e;
                                    g1.d.b(dVar);
                                    r1.j jVar2 = this.f4063e;
                                    g1.d.b(jVar2);
                                    List a3 = jVar2.a();
                                    g1.d.e(str3, "hostname");
                                    g1.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f3417a.iterator();
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
        byte[] bArr = s1.b.f3721a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f4062c;
        g1.d.b(socket);
        Socket socket2 = this.d;
        g1.d.b(socket2);
        E1.p pVar = this.h;
        g1.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        y1.o oVar = this.f4065g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f4271f) {
                    return false;
                }
                if (oVar.f4277n < oVar.f4276m) {
                    if (nanoTime >= oVar.f4278o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f4073q;
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

    public final w1.d j(q qVar, w1.f fVar) {
        Socket socket = this.d;
        g1.d.b(socket);
        E1.p pVar = this.h;
        g1.d.b(pVar);
        E1.o oVar = this.i;
        g1.d.b(oVar);
        y1.o oVar2 = this.f4065g;
        if (oVar2 != null) {
            return new y1.p(qVar, this, fVar, oVar2);
        }
        int i = fVar.f4103g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f221a.a().g(i, timeUnit);
        oVar.f218a.a().g(fVar.h, timeUnit);
        return new p(qVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f4066j = true;
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
        C0237t c0237t = new C0237t(dVar);
        String str = this.f4061b.f3542a.h.d;
        g1.d.e(str, "peerName");
        c0237t.f3017b = socket;
        String str2 = s1.b.f3726g + ' ' + str;
        g1.d.e(str2, "<set-?>");
        c0237t.f3018c = str2;
        c0237t.d = pVar;
        c0237t.f3019e = oVar;
        c0237t.f3020f = this;
        y1.o oVar2 = new y1.o(c0237t);
        this.f4065g = oVar2;
        H.j jVar = y1.o.f4266z;
        int i = 4;
        this.f4071o = (jVar.f292a & 16) != 0 ? ((int[]) jVar.f293b)[4] : Integer.MAX_VALUE;
        y1.x xVar = oVar2.f4286w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = y1.x.f4323f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(s1.b.g(">> CONNECTION " + y1.f.f4245a.b(), new Object[0]));
                }
                E1.o oVar3 = xVar.f4324a;
                E1.i iVar = y1.f.f4245a;
                oVar3.getClass();
                g1.d.e(iVar, "byteString");
                if (oVar3.f220c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f219b.s(iVar);
                oVar3.g();
                xVar.f4324a.flush();
            } finally {
            }
        }
        y1.x xVar2 = oVar2.f4286w;
        H.j jVar2 = oVar2.f4279p;
        synchronized (xVar2) {
            try {
                g1.d.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.i(0, Integer.bitCount(jVar2.f292a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f292a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        E1.o oVar4 = xVar2.f4324a;
                        if (oVar4.f220c) {
                            throw new IllegalStateException("closed");
                        }
                        E1.f fVar = oVar4.f219b;
                        E1.q q2 = fVar.q(2);
                        int i4 = q2.f226c;
                        byte[] bArr = q2.f224a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        q2.f226c = i4 + 2;
                        fVar.f203b += 2;
                        oVar4.g();
                        xVar2.f4324a.i(((int[]) jVar2.f293b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f4324a.flush();
            } finally {
            }
        }
        if (oVar2.f4279p.c() != 65535) {
            oVar2.f4286w.n(0, r2 - 65535);
        }
        dVar.e().c(new u1.b(oVar2.f4269c, oVar2.f4287x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        v vVar = this.f4061b;
        sb.append(vVar.f3542a.h.d);
        sb.append(':');
        sb.append(vVar.f3542a.h.f3466e);
        sb.append(", proxy=");
        sb.append(vVar.f3543b);
        sb.append(" hostAddress=");
        sb.append(vVar.f3544c);
        sb.append(" cipherSuite=");
        r1.j jVar = this.f4063e;
        if (jVar == null || (obj = jVar.f3453b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f4064f);
        sb.append('}');
        return sb.toString();
    }
}
