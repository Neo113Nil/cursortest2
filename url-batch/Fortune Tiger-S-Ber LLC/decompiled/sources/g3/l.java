package g3;

import androidx.emoji2.text.w;
import androidx.fragment.app.w0;
import c3.q;
import c3.r;
import c3.s;
import c3.t;
import c3.u;
import c3.x;
import j3.p;
import j3.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
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
import p3.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l extends j3.i {

    /* renamed from: b, reason: collision with root package name */
    public final x f1958b;
    public Socket c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f1959d;

    /* renamed from: e, reason: collision with root package name */
    public c3.j f1960e;

    /* renamed from: f, reason: collision with root package name */
    public r f1961f;
    public p g;
    public p3.p h;

    /* renamed from: i, reason: collision with root package name */
    public o f1962i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1963j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1964k;

    /* renamed from: l, reason: collision with root package name */
    public int f1965l;

    /* renamed from: m, reason: collision with root package name */
    public int f1966m;

    /* renamed from: n, reason: collision with root package name */
    public int f1967n;

    /* renamed from: o, reason: collision with root package name */
    public int f1968o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1969p;

    /* renamed from: q, reason: collision with root package name */
    public long f1970q;

    public l(m mVar, x xVar) {
        u2.c.e(mVar, "connectionPool");
        u2.c.e(xVar, "route");
        this.f1958b = xVar;
        this.f1968o = 1;
        this.f1969p = new ArrayList();
        this.f1970q = Long.MAX_VALUE;
    }

    public static void d(q qVar, x xVar, IOException iOException) {
        u2.c.e(xVar, "failedRoute");
        u2.c.e(iOException, "failure");
        if (xVar.f1154b.type() != Proxy.Type.DIRECT) {
            c3.a aVar = xVar.f1153a;
            aVar.g.connectFailed(aVar.h.g(), xVar.f1154b.address(), iOException);
        }
        a2.e eVar = qVar.D;
        synchronized (eVar) {
            ((LinkedHashSet) eVar.g).add(xVar);
        }
    }

    @Override // j3.i
    public final synchronized void a(p pVar, f.f fVar) {
        u2.c.e(fVar, "settings");
        this.f1968o = (fVar.f1596f & 16) != 0 ? ((int[]) fVar.g)[4] : Integer.MAX_VALUE;
    }

    @Override // j3.i
    public final void b(j3.x xVar) {
        xVar.c(8, null);
    }

    public final void c(int i4, int i5, int i6, boolean z3, i iVar) {
        x xVar;
        if (this.f1961f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f1958b.f1153a.f1014j;
        b bVar = new b(list);
        c3.a aVar = this.f1958b.f1153a;
        if (aVar.c == null) {
            if (!list.contains(c3.h.f1051f)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f1958b.f1153a.h.f1078d;
            k3.o oVar = k3.o.f2841a;
            if (!k3.o.f2841a.h(str)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.f1013i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        n nVar = null;
        do {
            try {
                x xVar2 = this.f1958b;
                if (xVar2.f1153a.c != null && xVar2.f1154b.type() == Proxy.Type.HTTP) {
                    f(i4, i5, i6, iVar);
                    if (this.c == null) {
                        xVar = this.f1958b;
                        if (xVar.f1153a.c == null && xVar.f1154b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new n(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f1970q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i4, i5, iVar);
                }
                g(bVar, iVar);
                u2.c.e(this.f1958b.c, "inetSocketAddress");
                xVar = this.f1958b;
                if (xVar.f1153a.c == null) {
                }
                this.f1970q = System.nanoTime();
                return;
            } catch (IOException e4) {
                Socket socket = this.f1959d;
                if (socket != null) {
                    d3.c.c(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    d3.c.c(socket2);
                }
                this.f1959d = null;
                this.c = null;
                this.h = null;
                this.f1962i = null;
                this.f1960e = null;
                this.f1961f = null;
                this.g = null;
                this.f1968o = 1;
                u2.c.e(this.f1958b.c, "inetSocketAddress");
                if (nVar == null) {
                    nVar = new n(e4);
                } else {
                    l0.g.a(nVar.f1974f, e4);
                    nVar.g = e4;
                }
                if (!z3) {
                    throw nVar;
                }
                bVar.f1924d = true;
                if (!bVar.c) {
                    throw nVar;
                }
                if (e4 instanceof ProtocolException) {
                    throw nVar;
                }
                if (e4 instanceof InterruptedIOException) {
                    throw nVar;
                }
                if ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) {
                    throw nVar;
                }
                if (e4 instanceof SSLPeerUnverifiedException) {
                    throw nVar;
                }
            }
        } while (e4 instanceof SSLException);
        throw nVar;
    }

    public final void e(int i4, int i5, i iVar) {
        Socket createSocket;
        x xVar = this.f1958b;
        Proxy proxy = xVar.f1154b;
        c3.a aVar = xVar.f1153a;
        Proxy.Type type = proxy.type();
        int i6 = type == null ? -1 : j.f1956a[type.ordinal()];
        if (i6 == 1 || i6 == 2) {
            createSocket = aVar.f1009b.createSocket();
            u2.c.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        u2.c.e(this.f1958b.c, "inetSocketAddress");
        createSocket.setSoTimeout(i5);
        try {
            k3.o oVar = k3.o.f2841a;
            k3.o.f2841a.e(createSocket, this.f1958b.c, i4);
            try {
                this.h = new p3.p(m0.a.C(createSocket));
                this.f1962i = new o(m0.a.B(createSocket));
            } catch (NullPointerException e4) {
                if (u2.c.a(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f1958b.c);
            connectException.initCause(e5);
            throw connectException;
        }
    }

    public final void f(int i4, int i5, int i6, i iVar) {
        w wVar = new w(4);
        x xVar = this.f1958b;
        c3.m mVar = xVar.f1153a.h;
        u2.c.e(mVar, "url");
        wVar.f368f = mVar;
        wVar.n("CONNECT", null);
        c3.a aVar = xVar.f1153a;
        wVar.k("Host", d3.c.t(aVar.h, true));
        wVar.k("Proxy-Connection", "Keep-Alive");
        wVar.k("User-Agent", "okhttp/4.12.0");
        s b2 = wVar.b();
        a2.e eVar = new a2.e(10);
        k3.d.g("Proxy-Authenticate");
        k3.d.j("OkHttp-Preemptive", "Proxy-Authenticate");
        eVar.A("Proxy-Authenticate");
        eVar.t("Proxy-Authenticate", "OkHttp-Preemptive");
        eVar.u();
        aVar.f1012f.getClass();
        c3.m mVar2 = b2.f1127a;
        e(i4, i5, iVar);
        String str = "CONNECT " + d3.c.t(mVar2, true) + " HTTP/1.1";
        p3.p pVar = this.h;
        u2.c.b(pVar);
        o oVar = this.f1962i;
        u2.c.b(oVar);
        i3.e eVar2 = new i3.e(null, this, pVar, oVar);
        p3.x a4 = pVar.f3040f.a();
        long j4 = i5;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a4.g(j4);
        oVar.f3039f.a().g(i6);
        eVar2.i(b2.c, str);
        eVar2.a();
        t f4 = eVar2.f(false);
        u2.c.b(f4);
        f4.f1131a = b2;
        u a5 = f4.a();
        int i7 = a5.f1142i;
        long h = d3.c.h(a5);
        if (h != -1) {
            i3.c h4 = eVar2.h(h);
            d3.c.r(h4, Integer.MAX_VALUE);
            h4.close();
        }
        if (i7 != 200) {
            if (i7 != 407) {
                throw new IOException(w0.e("Unexpected response code for CONNECT: ", i7));
            }
            aVar.f1012f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.g.n() || !oVar.g.n()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i iVar) {
        SSLSocket sSLSocket;
        r rVar = r.HTTP_1_1;
        c3.a aVar = this.f1958b.f1153a;
        SSLSocketFactory sSLSocketFactory = aVar.c;
        if (sSLSocketFactory == null) {
            List list = aVar.f1013i;
            r rVar2 = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar2)) {
                this.f1959d = this.c;
                this.f1961f = rVar;
                return;
            } else {
                this.f1959d = this.c;
                this.f1961f = rVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            u2.c.b(sSLSocketFactory);
            Socket socket = this.c;
            c3.m mVar = aVar.h;
            Socket createSocket = sSLSocketFactory.createSocket(socket, mVar.f1078d, mVar.f1079e, true);
            u2.c.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c3.h a4 = bVar.a(sSLSocket);
            if (a4.f1053b) {
                k3.o oVar = k3.o.f2841a;
                k3.o.f2841a.d(sSLSocket, aVar.h.f1078d, aVar.f1013i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            u2.c.d(session, "sslSocketSession");
            c3.j s2 = k3.m.s(session);
            HostnameVerifier hostnameVerifier = aVar.f1010d;
            u2.c.b(hostnameVerifier);
            if (hostnameVerifier.verify(aVar.h.f1078d, session)) {
                c3.d dVar = aVar.f1011e;
                u2.c.b(dVar);
                this.f1960e = new c3.j(s2.f1065a, s2.f1066b, s2.c, new k(dVar, s2, aVar));
                u2.c.e(aVar.h.f1078d, "hostname");
                Iterator it = dVar.f1028a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (a4.f1053b) {
                    k3.o oVar2 = k3.o.f2841a;
                    str = k3.o.f2841a.f(sSLSocket);
                }
                this.f1959d = sSLSocket;
                this.h = new p3.p(m0.a.C(sSLSocket));
                this.f1962i = new o(m0.a.B(sSLSocket));
                if (str != null) {
                    rVar = k3.d.C(str);
                }
                this.f1961f = rVar;
                k3.o oVar3 = k3.o.f2841a;
                k3.o.f2841a.a(sSLSocket);
                if (this.f1961f == r.HTTP_2) {
                    l();
                    return;
                }
                return;
            }
            List a5 = s2.a();
            if (a5.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar.h.f1078d + " not verified (no certificates)");
            }
            Object obj = a5.get(0);
            u2.c.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n              |Hostname ");
            sb.append(aVar.h.f1078d);
            sb.append(" not verified:\n              |    certificate: ");
            c3.d dVar2 = c3.d.c;
            sb.append(k3.m.O(x509Certificate));
            sb.append("\n              |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n              |    subjectAltNames: ");
            List a6 = o3.c.a(x509Certificate, 7);
            List a7 = o3.c.a(x509Certificate, 2);
            ArrayList arrayList = new ArrayList(a7.size() + a6.size());
            arrayList.addAll(a6);
            arrayList.addAll(a7);
            sb.append(arrayList);
            sb.append("\n              ");
            throw new SSLPeerUnverifiedException(b3.f.W(sb.toString()));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                k3.o oVar4 = k3.o.f2841a;
                k3.o.f2841a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                d3.c.c(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (o3.c.c(r6, (java.security.cert.X509Certificate) r12) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(c3.a aVar, List list) {
        c3.j jVar;
        c3.m mVar = aVar.h;
        byte[] bArr = d3.c.f1490a;
        if (this.f1969p.size() < this.f1968o && !this.f1963j) {
            x xVar = this.f1958b;
            c3.a aVar2 = xVar.f1153a;
            c3.a aVar3 = xVar.f1153a;
            if (aVar2.a(aVar)) {
                String str = mVar.f1078d;
                String str2 = mVar.f1078d;
                if (u2.c.a(str, aVar3.h.f1078d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        x xVar2 = (x) it.next();
                        Proxy.Type type = xVar2.f1154b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && xVar.f1154b.type() == type2 && u2.c.a(xVar.c, xVar2.c)) {
                            if (aVar.f1010d == o3.c.f2995a) {
                                byte[] bArr2 = d3.c.f1490a;
                                c3.m mVar2 = aVar3.h;
                                if (mVar.f1079e == mVar2.f1079e) {
                                    if (!u2.c.a(str2, mVar2.f1078d)) {
                                        if (!this.f1964k && (jVar = this.f1960e) != null) {
                                            List a4 = jVar.a();
                                            if (!a4.isEmpty()) {
                                                Object obj = a4.get(0);
                                                u2.c.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        c3.d dVar = aVar.f1011e;
                                        u2.c.b(dVar);
                                        c3.j jVar2 = this.f1960e;
                                        u2.c.b(jVar2);
                                        List a5 = jVar2.a();
                                        u2.c.e(str2, "hostname");
                                        u2.c.e(a5, "peerCertificates");
                                        Iterator it2 = dVar.f1028a.iterator();
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
        }
        return false;
    }

    public final boolean i(boolean z3) {
        long j4;
        byte[] bArr = d3.c.f1490a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        u2.c.b(socket);
        Socket socket2 = this.f1959d;
        u2.c.b(socket2);
        u2.c.b(this.h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p pVar = this.g;
        if (pVar != null) {
            synchronized (pVar) {
                if (pVar.f2445k) {
                    return false;
                }
                if (pVar.f2453s < pVar.f2452r) {
                    if (nanoTime >= pVar.f2454t) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j4 = nanoTime - this.f1970q;
        }
        if (j4 < 10000000000L || !z3) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.m();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final h3.e j(q qVar, h3.g gVar) {
        int i4 = gVar.g;
        Socket socket = this.f1959d;
        u2.c.b(socket);
        p3.p pVar = this.h;
        u2.c.b(pVar);
        o oVar = this.f1962i;
        u2.c.b(oVar);
        p pVar2 = this.g;
        if (pVar2 != null) {
            return new j3.q(qVar, this, gVar, pVar2);
        }
        socket.setSoTimeout(i4);
        p3.x a4 = pVar.f3040f.a();
        long j4 = i4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a4.g(j4);
        oVar.f3039f.a().g(gVar.h);
        return new i3.e(qVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f1963j = true;
    }

    public final void l() {
        Socket socket = this.f1959d;
        u2.c.b(socket);
        p3.p pVar = this.h;
        u2.c.b(pVar);
        o oVar = this.f1962i;
        u2.c.b(oVar);
        socket.setSoTimeout(0);
        f3.d dVar = f3.d.h;
        j3.g gVar = new j3.g(dVar);
        String str = this.f1958b.f1153a.h.f1078d;
        u2.c.e(str, "peerName");
        gVar.f2426b = socket;
        String str2 = d3.c.g + ' ' + str;
        u2.c.e(str2, "<set-?>");
        gVar.c = str2;
        gVar.f2427d = pVar;
        gVar.f2428e = oVar;
        gVar.f2429f = this;
        p pVar2 = new p(gVar);
        this.g = pVar2;
        f.f fVar = p.E;
        this.f1968o = (fVar.f1596f & 16) != 0 ? ((int[]) fVar.g)[4] : Integer.MAX_VALUE;
        y yVar = pVar2.B;
        synchronized (yVar) {
            try {
                if (yVar.f2492i) {
                    throw new IOException("closed");
                }
                Logger logger = y.f2490k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(d3.c.f(">> CONNECTION " + j3.f.f2422a.b(), new Object[0]));
                }
                yVar.f2491f.f(j3.f.f2422a);
                yVar.f2491f.flush();
            } finally {
            }
        }
        y yVar2 = pVar2.B;
        f.f fVar2 = pVar2.f2455u;
        synchronized (yVar2) {
            try {
                u2.c.e(fVar2, "settings");
                if (yVar2.f2492i) {
                    throw new IOException("closed");
                }
                yVar2.o(0, Integer.bitCount(fVar2.f1596f) * 6, 4, 0);
                int i4 = 0;
                while (i4 < 10) {
                    boolean z3 = true;
                    if (((1 << i4) & fVar2.f1596f) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        yVar2.f2491f.writeShort(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                        yVar2.f2491f.writeInt(((int[]) fVar2.g)[i4]);
                    }
                    i4++;
                }
                yVar2.f2491f.flush();
            } finally {
            }
        }
        if (pVar2.f2455u.b() != 65535) {
            pVar2.B.t(0, r1 - 65535);
        }
        dVar.e().c(new f3.b(pVar2.h, pVar2.C, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        x xVar = this.f1958b;
        sb.append(xVar.f1153a.h.f1078d);
        sb.append(':');
        sb.append(xVar.f1153a.h.f1079e);
        sb.append(", proxy=");
        sb.append(xVar.f1154b);
        sb.append(" hostAddress=");
        sb.append(xVar.c);
        sb.append(" cipherSuite=");
        c3.j jVar = this.f1960e;
        if (jVar == null || (obj = jVar.f1066b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f1961f);
        sb.append('}');
        return sb.toString();
    }
}
