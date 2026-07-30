package H6;

import D6.B;
import D6.C;
import D6.C0093a;
import D6.C0096d;
import D6.C0097e;
import D6.C0099g;
import D6.F;
import D6.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements w, I6.f {

    /* renamed from: a, reason: collision with root package name */
    public final G6.d f1015a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1017c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1018d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1019e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1020f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1021g;

    /* renamed from: h, reason: collision with root package name */
    public final a f1022h;

    /* renamed from: i, reason: collision with root package name */
    public final t f1023i;
    public final F j;

    /* renamed from: k, reason: collision with root package name */
    public final List f1024k;

    /* renamed from: l, reason: collision with root package name */
    public final z f1025l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1026m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1027n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f1028o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f1029p;

    /* renamed from: q, reason: collision with root package name */
    public Socket f1030q;

    /* renamed from: r, reason: collision with root package name */
    public D6.p f1031r;

    /* renamed from: s, reason: collision with root package name */
    public D6.x f1032s;

    /* renamed from: t, reason: collision with root package name */
    public D0.j f1033t;

    /* renamed from: u, reason: collision with root package name */
    public r f1034u;

    public d(G6.d taskRunner, s connectionPool, int i2, int i5, int i7, int i8, boolean z7, a user, t routePlanner, F route, List list, z zVar, int i9, boolean z8) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f1015a = taskRunner;
        this.f1016b = connectionPool;
        this.f1017c = i2;
        this.f1018d = i5;
        this.f1019e = i7;
        this.f1020f = i8;
        this.f1021g = z7;
        this.f1022h = user;
        this.f1023i = routePlanner;
        this.j = route;
        this.f1024k = list;
        this.f1025l = zVar;
        this.f1026m = i9;
        this.f1027n = z8;
    }

    @Override // H6.w
    public final w a() {
        return new d(this.f1015a, this.f1016b, this.f1017c, this.f1018d, this.f1019e, this.f1020f, this.f1021g, this.f1022h, this.f1023i, this.j, this.f1024k, this.f1025l, this.f1026m, this.f1027n);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x002c, TryCatch #5 {all -> 0x002c, blocks: (B:7:0x001b, B:9:0x001f, B:11:0x0027, B:19:0x0041, B:22:0x0048, B:24:0x004c, B:26:0x0058, B:28:0x005c, B:30:0x0068, B:32:0x0092, B:35:0x00c9, B:37:0x00e2, B:46:0x010a, B:48:0x0111, B:51:0x011b, B:54:0x0120, B:56:0x0124, B:59:0x012d, B:62:0x0132, B:65:0x0137, B:82:0x0106, B:83:0x0109, B:87:0x00a6, B:88:0x00a9, B:89:0x00aa, B:90:0x00b1, B:91:0x00b2, B:92:0x00b5, B:93:0x00b6, B:96:0x00c5, B:98:0x00c3), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    @Override // H6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v b() {
        d dVar;
        d dVar2;
        Socket socket = this.f1029p;
        if (socket == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (e()) {
            throw new IllegalStateException("already connected");
        }
        F f7 = this.j;
        C0093a c0093a = f7.f444a;
        C0093a c0093a2 = f7.f444a;
        List list = c0093a.j;
        a aVar = this.f1022h;
        aVar.b(this);
        boolean z7 = false;
        d dVar3 = null;
        try {
            try {
                if (this.f1025l != null) {
                    v k7 = k();
                    if (k7.f1123b != null || k7.f1124c != null) {
                        aVar.l(this);
                        Socket socket2 = this.f1030q;
                        if (socket2 != null) {
                            E6.e.c(socket2);
                        }
                        E6.e.c(socket);
                        return k7;
                    }
                }
                if (c0093a2.f458c != null) {
                    D0.j jVar = this.f1033t;
                    if (jVar == null) {
                        Intrinsics.h("socket");
                        throw null;
                    }
                    if (((T6.q) jVar.f331i).f2641e.d()) {
                        D0.j jVar2 = this.f1033t;
                        if (jVar2 == null) {
                            Intrinsics.h("socket");
                            throw null;
                        }
                        if (((T6.p) jVar2.f332l).f2638e.d()) {
                            q call = aVar.f1011a;
                            Intrinsics.checkNotNullParameter(call, "call");
                            SSLSocketFactory sSLSocketFactory = c0093a2.f458c;
                            D6.s sVar = c0093a2.f463h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, sVar.f565d, sVar.f566e, true);
                            Intrinsics.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            d m2 = m(list, sSLSocket);
                            D6.j jVar3 = (D6.j) list.get(m2.f1026m);
                            dVar = m2.l(list, sSLSocket);
                            try {
                                jVar3.a(sSLSocket, m2.f1027n);
                                j(sSLSocket, jVar3);
                                q call2 = aVar.f1011a;
                                Intrinsics.checkNotNullParameter(call2, "call");
                                dVar2 = dVar;
                            } catch (IOException e7) {
                                e = e7;
                                aVar.e(f7, e);
                                if (this.f1021g) {
                                    Intrinsics.checkNotNullParameter(e, "e");
                                    if (!(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                        dVar3 = dVar;
                                    }
                                }
                                v vVar = new v(this, dVar3, e);
                                aVar.l(this);
                                if (!z7) {
                                    Socket socket3 = this.f1030q;
                                    if (socket3 != null) {
                                        E6.e.c(socket3);
                                    }
                                    E6.e.c(socket);
                                }
                                return vVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f1030q = socket;
                List list2 = c0093a2.f464i;
                D6.x xVar = D6.x.f628o;
                if (!list2.contains(xVar)) {
                    xVar = D6.x.f625l;
                }
                this.f1032s = xVar;
                dVar2 = null;
                try {
                    G6.d dVar4 = this.f1015a;
                    s sVar2 = this.f1016b;
                    F f8 = this.j;
                    Socket socket4 = this.f1030q;
                    Intrinsics.b(socket4);
                    D6.p pVar = this.f1031r;
                    D6.x xVar2 = this.f1032s;
                    Intrinsics.b(xVar2);
                    D0.j jVar4 = this.f1033t;
                    if (jVar4 == null) {
                        Intrinsics.h("socket");
                        throw null;
                    }
                    this.f1016b.getClass();
                    r rVar = new r(dVar4, sVar2, f8, socket, socket4, pVar, xVar2, jVar4);
                    this.f1034u = rVar;
                    rVar.i();
                    aVar.c(f7);
                    try {
                        v vVar2 = new v(this, (Throwable) null, 6);
                        aVar.l(this);
                        return vVar2;
                    } catch (IOException e8) {
                        e = e8;
                        z7 = true;
                        dVar = dVar2;
                        aVar.e(f7, e);
                        if (this.f1021g) {
                        }
                        v vVar3 = new v(this, dVar3, e);
                        aVar.l(this);
                        if (!z7) {
                        }
                        return vVar3;
                    } catch (Throwable th) {
                        th = th;
                        z7 = true;
                        aVar.l(this);
                        if (!z7) {
                            Socket socket5 = this.f1030q;
                            if (socket5 != null) {
                                E6.e.c(socket5);
                            }
                            E6.e.c(socket);
                        }
                        throw th;
                    }
                } catch (IOException e9) {
                    e = e9;
                }
            } catch (IOException e10) {
                e = e10;
                dVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // H6.w
    public final r c() {
        a aVar = this.f1022h;
        F route = this.j;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        l2.c cVar = aVar.f1011a.f1070d.f622z;
        synchronized (cVar) {
            Intrinsics.checkNotNullParameter(route, "route");
            ((LinkedHashSet) cVar.f6269d).remove(route);
        }
        r connection = this.f1034u;
        Intrinsics.b(connection);
        a aVar2 = this.f1022h;
        F route2 = this.j;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route2, "route");
        q call = aVar2.f1011a;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route2, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        u i2 = this.f1023i.i(this, this.f1024k);
        if (i2 != null) {
            return i2.f1121a;
        }
        synchronized (connection) {
            s sVar = this.f1016b;
            sVar.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            TimeZone timeZone = E6.e.f712a;
            sVar.f1106e.add(connection);
            sVar.f1104c.d(sVar.f1105d, 0L);
            this.f1022h.a(connection);
            Unit unit = Unit.f6114a;
        }
        this.f1022h.g(connection);
        this.f1022h.h(connection);
        return connection;
    }

    @Override // H6.w, I6.f
    public final void cancel() {
        this.f1028o = true;
        Socket socket = this.f1029p;
        if (socket != null) {
            E6.e.c(socket);
        }
    }

    @Override // I6.f
    public final void d(q call, IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    @Override // H6.w
    public final boolean e() {
        return this.f1032s != null;
    }

    @Override // I6.f
    public final F f() {
        return this.j;
    }

    @Override // H6.w
    public final v g() {
        Socket socket;
        Socket socket2;
        F f7 = this.j;
        if (this.f1029p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        a aVar = this.f1022h;
        aVar.b(this);
        boolean z7 = false;
        try {
            try {
                aVar.f(f7);
                i();
                z7 = true;
                v vVar = new v(this, (Throwable) null, 6);
                aVar.l(this);
                return vVar;
            } catch (IOException e7) {
                f7.f444a.getClass();
                if (f7.f445b.type() != Proxy.Type.DIRECT) {
                    C0093a c0093a = f7.f444a;
                    c0093a.f462g.connectFailed(c0093a.f463h.g(), f7.f445b.address(), e7);
                }
                aVar.e(f7, e7);
                v vVar2 = new v(this, e7, 2);
                aVar.l(this);
                if (!z7 && (socket2 = this.f1029p) != null) {
                    E6.e.c(socket2);
                }
                return vVar2;
            }
        } catch (Throwable th) {
            aVar.l(this);
            if (!z7 && (socket = this.f1029p) != null) {
                E6.e.c(socket);
            }
            throw th;
        }
    }

    public final void i() {
        Socket createSocket;
        Proxy.Type type = this.j.f445b.type();
        int i2 = type == null ? -1 : c.f1014a[type.ordinal()];
        if (i2 == 1 || i2 == 2) {
            createSocket = this.j.f444a.f457b.createSocket();
            Intrinsics.b(createSocket);
        } else {
            createSocket = new Socket(this.j.f445b);
        }
        this.f1029p = createSocket;
        if (this.f1028o) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f1020f);
        try {
            N6.e eVar = N6.e.f1879a;
            N6.e.f1879a.f(createSocket, this.j.f446c, this.f1019e);
            try {
                Intrinsics.checkNotNullParameter(createSocket, "<this>");
                Intrinsics.checkNotNullParameter(createSocket, "<this>");
                P0.n nVar = new P0.n(createSocket);
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                this.f1033t = new D0.j(nVar);
            } catch (NullPointerException e7) {
                if (Intrinsics.a(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.f446c);
            connectException.initCause(e8);
            throw connectException;
        }
    }

    public final void j(SSLSocket sslSocket, D6.j jVar) {
        String str;
        D6.x xVar;
        C0093a c0093a = this.j.f444a;
        try {
            if (jVar.f520b) {
                N6.e eVar = N6.e.f1879a;
                N6.e.f1879a.e(sslSocket, c0093a.f463h.f565d, c0093a.f464i);
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            Intrinsics.b(session);
            D6.p I7 = O6.g.I(session);
            HostnameVerifier hostnameVerifier = c0093a.f459d;
            Intrinsics.b(hostnameVerifier);
            if (!hostnameVerifier.verify(c0093a.f463h.f565d, session)) {
                List a7 = I7.a();
                if (a7.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0093a.f463h.f565d + " not verified (no certificates)");
                }
                Object obj = a7.get(0);
                Intrinsics.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c0093a.f463h.f565d);
                sb.append(" not verified:\n            |    certificate: ");
                C0097e c0097e = C0097e.f483c;
                sb.append(d4.c.B(certificate));
                sb.append("\n            |    DN: ");
                sb.append(certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                Intrinsics.checkNotNullParameter(certificate, "certificate");
                sb.append(CollectionsKt.u(R6.c.a(certificate, 7), R6.c.a(certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(kotlin.text.j.c(sb.toString()));
            }
            C0097e c0097e2 = c0093a.f460e;
            Intrinsics.b(c0097e2);
            D6.p pVar = new D6.p(I7.f548a, I7.f549b, I7.f550c, new C0096d(c0097e2, I7, c0093a, 1));
            this.f1031r = pVar;
            c0097e2.a(c0093a.f463h.f565d, new D6.o(2, pVar));
            if (jVar.f520b) {
                N6.e eVar2 = N6.e.f1879a;
                str = N6.e.f1879a.g(sslSocket);
            } else {
                str = null;
            }
            this.f1030q = sslSocket;
            Intrinsics.checkNotNullParameter(sslSocket, "<this>");
            Intrinsics.checkNotNullParameter(sslSocket, "<this>");
            P0.n nVar = new P0.n(sslSocket);
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            this.f1033t = new D0.j(nVar);
            if (str != null) {
                D6.x.f623e.getClass();
                xVar = D6.l.d(str);
            } else {
                xVar = D6.x.f625l;
            }
            this.f1032s = xVar;
            N6.e eVar3 = N6.e.f1879a;
            N6.e.f1879a.getClass();
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        } catch (Throwable th) {
            N6.e eVar4 = N6.e.f1879a;
            N6.e.f1879a.getClass();
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            E6.e.c(sslSocket);
            throw th;
        }
    }

    public final v k() {
        z request = this.f1025l;
        Intrinsics.b(request);
        F f7 = this.j;
        String str = "CONNECT " + E6.e.h(f7.f444a.f463h, true) + " HTTP/1.1";
        D0.j jVar = this.f1033t;
        if (jVar == null) {
            Intrinsics.h("socket");
            throw null;
        }
        J6.h hVar = new J6.h(null, this, jVar);
        D0.j jVar2 = this.f1033t;
        if (jVar2 == null) {
            Intrinsics.h("socket");
            throw null;
        }
        T6.y b7 = ((T6.q) jVar2.f331i).f2640d.b();
        long j = this.f1017c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b7.g(j);
        D0.j jVar3 = this.f1033t;
        if (jVar3 == null) {
            Intrinsics.h("socket");
            throw null;
        }
        ((T6.p) jVar3.f332l).f2637d.b().g(this.f1018d);
        hVar.m((D6.q) request.f641d, str);
        hVar.a();
        B i2 = hVar.i(false);
        Intrinsics.b(i2);
        Intrinsics.checkNotNullParameter(request, "request");
        i2.f412a = request;
        C response = i2.a();
        int i5 = response.f429l;
        Intrinsics.checkNotNullParameter(response, "response");
        long e7 = E6.e.e(response);
        if (e7 != -1) {
            J6.e l7 = hVar.l((D6.s) response.f426d.f640c, e7);
            E6.e.f(l7, Integer.MAX_VALUE);
            l7.close();
        }
        if (i5 == 200) {
            return new v(this, (Throwable) null, 6);
        }
        if (i5 != 407) {
            throw new IOException(C4.p.g(i5, "Unexpected response code for CONNECT: "));
        }
        ((D6.l) f7.f444a.f461f).getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        throw new IOException("Failed to authenticate with proxy");
    }

    public final d l(List connectionSpecs, SSLSocket socket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(socket, "sslSocket");
        int i2 = this.f1026m;
        int size = connectionSpecs.size();
        for (int i5 = i2 + 1; i5 < size; i5++) {
            D6.j jVar = (D6.j) connectionSpecs.get(i5);
            jVar.getClass();
            Intrinsics.checkNotNullParameter(socket, "socket");
            if (jVar.f519a) {
                String[] strArr = jVar.f522d;
                if (strArr != null) {
                    String[] enabledProtocols = socket.getEnabledProtocols();
                    T5.a aVar = T5.a.f2600a;
                    Intrinsics.c(aVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
                    if (!E6.c.d(strArr, enabledProtocols, aVar)) {
                        continue;
                    }
                }
                String[] strArr2 = jVar.f521c;
                if (strArr2 == null || E6.c.d(strArr2, socket.getEnabledCipherSuites(), C0099g.f487c)) {
                    return new d(this.f1015a, this.f1016b, this.f1017c, this.f1018d, this.f1019e, this.f1020f, this.f1021g, this.f1022h, this.f1023i, this.j, this.f1024k, this.f1025l, i5, i2 != -1);
                }
            }
        }
        return null;
    }

    public final d m(List connectionSpecs, SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f1026m != -1) {
            return this;
        }
        d l7 = l(connectionSpecs, sslSocket);
        if (l7 != null) {
            return l7;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f1027n);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // I6.f
    public final void h() {
    }
}
