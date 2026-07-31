package b6;

import X5.C0217a;
import X5.C0218b;
import X5.z;
import a1.AbstractC0223a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
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
import l5.AbstractC0506j;
import u0.AbstractC0676f;
import u0.C0684n;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class e implements w, c6.e {

    /* renamed from: a, reason: collision with root package name */
    public final a6.e f3629a;

    /* renamed from: b, reason: collision with root package name */
    public final s f3630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3633e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3634f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3635g;

    /* renamed from: h, reason: collision with root package name */
    public final a f3636h;

    /* renamed from: i, reason: collision with root package name */
    public final t f3637i;

    /* renamed from: j, reason: collision with root package name */
    public final z f3638j;

    /* renamed from: k, reason: collision with root package name */
    public final List f3639k;

    /* renamed from: l, reason: collision with root package name */
    public final D0.h f3640l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3641m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3642n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f3643o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f3644p;

    /* renamed from: q, reason: collision with root package name */
    public Socket f3645q;

    /* renamed from: r, reason: collision with root package name */
    public X5.m f3646r;

    /* renamed from: s, reason: collision with root package name */
    public X5.t f3647s;

    /* renamed from: t, reason: collision with root package name */
    public B0.c f3648t;

    /* renamed from: u, reason: collision with root package name */
    public r f3649u;

    public e(a6.e taskRunner, s connectionPool, int i7, int i8, int i9, int i10, boolean z5, a user, t tVar, z route, List list, D0.h hVar, int i11, boolean z6) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(user, "user");
        kotlin.jvm.internal.i.e(route, "route");
        this.f3629a = taskRunner;
        this.f3630b = connectionPool;
        this.f3631c = i7;
        this.f3632d = i8;
        this.f3633e = i9;
        this.f3634f = i10;
        this.f3635g = z5;
        this.f3636h = user;
        this.f3637i = tVar;
        this.f3638j = route;
        this.f3639k = list;
        this.f3640l = hVar;
        this.f3641m = i11;
        this.f3642n = z6;
    }

    @Override // b6.w
    public final w a() {
        return new e(this.f3629a, this.f3630b, this.f3631c, this.f3632d, this.f3633e, this.f3634f, this.f3635g, this.f3636h, this.f3637i, this.f3638j, this.f3639k, this.f3640l, this.f3641m, this.f3642n);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    @Override // b6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v c() {
        e eVar;
        e eVar2;
        Socket socket = this.f3644p;
        if (socket == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (e()) {
            throw new IllegalStateException("already connected");
        }
        z route = this.f3638j;
        C0217a c0217a = route.f3079a;
        C0217a c0217a2 = route.f3079a;
        List list = c0217a.f2887j;
        a aVar = this.f3636h;
        aVar.b(this);
        boolean z5 = false;
        e eVar3 = null;
        try {
            try {
                if (this.f3640l != null) {
                    v k4 = k();
                    if (k4.f3737b != null || k4.f3738c != null) {
                        aVar.p(this);
                        Socket socket2 = this.f3645q;
                        if (socket2 != null) {
                            Y5.e.c(socket2);
                        }
                        Y5.e.c(socket);
                        return k4;
                    }
                }
                if (c0217a2.f2880c != null) {
                    B0.c cVar = this.f3648t;
                    if (cVar == null) {
                        kotlin.jvm.internal.i.l("socket");
                        throw null;
                    }
                    if (((n6.q) cVar.f73i).f5548g.d()) {
                        B0.c cVar2 = this.f3648t;
                        if (cVar2 == null) {
                            kotlin.jvm.internal.i.l("socket");
                            throw null;
                        }
                        if (((n6.p) cVar2.f71g).f5545g.d()) {
                            aVar.getClass();
                            SSLSocketFactory sSLSocketFactory = c0217a2.f2880c;
                            X5.o oVar = c0217a2.f2885h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, oVar.f2977d, oVar.f2978e, true);
                            kotlin.jvm.internal.i.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            e m4 = m(list, sSLSocket);
                            X5.i iVar = (X5.i) list.get(m4.f3641m);
                            eVar = m4.l(list, sSLSocket);
                            try {
                                iVar.a(sSLSocket, m4.f3642n);
                                j(sSLSocket, iVar);
                                aVar.getClass();
                                eVar2 = eVar;
                            } catch (IOException e4) {
                                e = e4;
                                aVar.d(route, e);
                                if (this.f3635g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    eVar3 = eVar;
                                }
                                v vVar = new v(this, eVar3, e);
                                aVar.p(this);
                                if (!z5) {
                                    Socket socket3 = this.f3645q;
                                    if (socket3 != null) {
                                        Y5.e.c(socket3);
                                    }
                                    Y5.e.c(socket);
                                }
                                return vVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f3645q = socket;
                List list2 = c0217a2.f2886i;
                X5.t tVar = X5.t.f3041l;
                if (!list2.contains(tVar)) {
                    tVar = X5.t.f3038i;
                }
                this.f3647s = tVar;
                eVar2 = null;
                try {
                    a6.e eVar4 = this.f3629a;
                    s sVar = this.f3630b;
                    z zVar = this.f3638j;
                    Socket socket4 = this.f3645q;
                    kotlin.jvm.internal.i.b(socket4);
                    X5.m mVar = this.f3646r;
                    X5.t tVar2 = this.f3647s;
                    kotlin.jvm.internal.i.b(tVar2);
                    B0.c cVar3 = this.f3648t;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.i.l("socket");
                        throw null;
                    }
                    r rVar = new r(eVar4, sVar, zVar, socket, socket4, mVar, tVar2, cVar3, this.f3630b.f3714a);
                    this.f3649u = rVar;
                    rVar.i();
                    aVar.getClass();
                    kotlin.jvm.internal.i.e(route, "route");
                    InetSocketAddress inetSocketAddress = route.f3081c;
                    kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
                    try {
                        v vVar2 = new v(this, (Throwable) null, 6);
                        aVar.p(this);
                        return vVar2;
                    } catch (IOException e7) {
                        e = e7;
                        eVar = eVar2;
                        z5 = true;
                        aVar.d(route, e);
                        if (this.f3635g) {
                            eVar3 = eVar;
                        }
                        v vVar3 = new v(this, eVar3, e);
                        aVar.p(this);
                        if (!z5) {
                        }
                        return vVar3;
                    } catch (Throwable th) {
                        th = th;
                        z5 = true;
                        aVar.p(this);
                        if (!z5) {
                            Socket socket5 = this.f3645q;
                            if (socket5 != null) {
                                Y5.e.c(socket5);
                            }
                            Y5.e.c(socket);
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                    eVar = eVar2;
                }
            } catch (IOException e9) {
                e = e9;
                eVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // b6.w, c6.e
    public final void cancel() {
        this.f3643o = true;
        Socket socket = this.f3644p;
        if (socket != null) {
            Y5.e.c(socket);
        }
    }

    @Override // b6.w
    public final r d() {
        a aVar = this.f3636h;
        z route = this.f3638j;
        aVar.getClass();
        kotlin.jvm.internal.i.e(route, "route");
        a6.d dVar = aVar.f3621a.f3680f.f3035z;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.f3172f).remove(route);
        }
        r connection = this.f3649u;
        kotlin.jvm.internal.i.b(connection);
        a aVar2 = this.f3636h;
        z route2 = this.f3638j;
        aVar2.getClass();
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(route2, "route");
        f fVar = aVar2.f3622b;
        q call = aVar2.f3621a;
        fVar.getClass();
        kotlin.jvm.internal.i.e(call, "call");
        u i7 = this.f3637i.i(this, this.f3639k);
        if (i7 != null) {
            return i7.f3735a;
        }
        synchronized (connection) {
            s sVar = this.f3630b;
            sVar.getClass();
            TimeZone timeZone = Y5.e.f3102a;
            sVar.f3719f.add(connection);
            sVar.f3717d.d(sVar.f3718e, 0L);
            this.f3636h.a(connection);
        }
        this.f3636h.e(connection);
        this.f3636h.f(connection);
        return connection;
    }

    @Override // b6.w
    public final boolean e() {
        return this.f3647s != null;
    }

    @Override // c6.e
    public final z f() {
        return this.f3638j;
    }

    @Override // b6.w
    public final v g() {
        Socket socket;
        Socket socket2;
        z route = this.f3638j;
        if (this.f3644p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        a aVar = this.f3636h;
        aVar.b(this);
        boolean z5 = false;
        try {
            try {
                aVar.getClass();
                kotlin.jvm.internal.i.e(route, "route");
                InetSocketAddress inetSocketAddress = route.f3081c;
                kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
                i();
                z5 = true;
                v vVar = new v(this, (Throwable) null, 6);
                aVar.p(this);
                return vVar;
            } catch (IOException e4) {
                route.f3079a.getClass();
                if (route.f3080b.type() != Proxy.Type.DIRECT) {
                    C0217a c0217a = route.f3079a;
                    c0217a.f2884g.connectFailed(c0217a.f2885h.g(), route.f3080b.address(), e4);
                }
                aVar.d(route, e4);
                v vVar2 = new v(this, e4, 2);
                aVar.p(this);
                if (!z5 && (socket = this.f3644p) != null) {
                    Y5.e.c(socket);
                }
                return vVar2;
            }
        } catch (Throwable th) {
            aVar.p(this);
            if (!z5 && (socket2 = this.f3644p) != null) {
                Y5.e.c(socket2);
            }
            throw th;
        }
    }

    public final void i() {
        Socket createSocket;
        Proxy.Type type = this.f3638j.f3080b.type();
        int i7 = type == null ? -1 : d.f3628a[type.ordinal()];
        if (i7 == 1 || i7 == 2) {
            createSocket = this.f3638j.f3079a.f2879b.createSocket();
            kotlin.jvm.internal.i.b(createSocket);
        } else {
            createSocket = new Socket(this.f3638j.f3080b);
        }
        this.f3644p = createSocket;
        if (this.f3643o) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f3634f);
        try {
            h6.e eVar = h6.e.f4355a;
            h6.e.f4355a.f(createSocket, this.f3638j.f3081c, this.f3633e);
            try {
                this.f3648t = new B0.c(new C0684n(createSocket));
            } catch (NullPointerException e4) {
                if (kotlin.jvm.internal.i.a(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3638j.f3081c);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, X5.i iVar) {
        String str;
        X5.t tVar;
        final C0217a c0217a = this.f3638j.f3079a;
        try {
            if (iVar.f2943b) {
                h6.e eVar = h6.e.f4355a;
                h6.e.f4355a.e(sSLSocket, c0217a.f2885h.f2977d, c0217a.f2886i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            kotlin.jvm.internal.i.b(session);
            final X5.m i7 = AbstractC0676f.i(session);
            HostnameVerifier hostnameVerifier = c0217a.f2881d;
            kotlin.jvm.internal.i.b(hostnameVerifier);
            if (!hostnameVerifier.verify(c0217a.f2885h.f2977d, session)) {
                List a7 = i7.a();
                if (a7.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0217a.f2885h.f2977d + " not verified (no certificates)");
                }
                Object obj = a7.get(0);
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c0217a.f2885h.f2977d);
                sb.append(" not verified:\n            |    certificate: ");
                X5.d dVar = X5.d.f2905c;
                sb.append(i6.g.s(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC0506j.K(l6.c.a(x509Certificate, 7), l6.c.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(F5.k.z(sb.toString()));
            }
            final X5.d dVar2 = c0217a.f2882e;
            kotlin.jvm.internal.i.b(dVar2);
            this.f3646r = new X5.m(i7.f2968a, i7.f2969b, i7.f2970c, new InterfaceC0732a() { // from class: b6.c
                @Override // x5.InterfaceC0732a
                public final Object invoke() {
                    AbstractC0223a abstractC0223a = X5.d.this.f2907b;
                    kotlin.jvm.internal.i.b(abstractC0223a);
                    return abstractC0223a.b(i7.a(), c0217a.f2885h.f2977d);
                }
            });
            String hostname = c0217a.f2885h.f2977d;
            kotlin.jvm.internal.i.e(hostname, "hostname");
            Iterator it = dVar2.f2906a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (iVar.f2943b) {
                h6.e eVar2 = h6.e.f4355a;
                str = h6.e.f4355a.g(sSLSocket);
            } else {
                str = null;
            }
            this.f3645q = sSLSocket;
            this.f3648t = new B0.c(new C0684n(sSLSocket));
            if (str != null) {
                X5.t.f3036g.getClass();
                tVar = C0218b.d(str);
            } else {
                tVar = X5.t.f3038i;
            }
            this.f3647s = tVar;
            h6.e eVar3 = h6.e.f4355a;
            h6.e.f4355a.getClass();
        } catch (Throwable th) {
            h6.e eVar4 = h6.e.f4355a;
            h6.e.f4355a.getClass();
            Y5.e.c(sSLSocket);
            throw th;
        }
    }

    public final v k() {
        D0.h hVar = this.f3640l;
        kotlin.jvm.internal.i.b(hVar);
        z zVar = this.f3638j;
        String str = "CONNECT " + Y5.e.h(zVar.f3079a.f2885h, true) + " HTTP/1.1";
        B0.c cVar = this.f3648t;
        if (cVar == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        d6.h hVar2 = new d6.h(null, this, cVar);
        B0.c cVar2 = this.f3648t;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        n6.y b7 = ((n6.q) cVar2.f73i).f5547f.b();
        long j4 = this.f3631c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b7.g(j4);
        B0.c cVar3 = this.f3648t;
        if (cVar3 == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        ((n6.p) cVar3.f71g).f5544f.b().g(this.f3632d);
        hVar2.l((X5.n) hVar.f332d, str);
        hVar2.c();
        X5.v j7 = hVar2.j(false);
        kotlin.jvm.internal.i.b(j7);
        j7.f3046a = hVar;
        X5.w a7 = j7.a();
        int i7 = a7.f3064i;
        long e4 = Y5.e.e(a7);
        if (e4 != -1) {
            d6.e k4 = hVar2.k((X5.o) a7.f3061f.f331c, e4);
            Y5.e.f(k4, Integer.MAX_VALUE);
            k4.close();
        }
        if (i7 == 200) {
            return new v(this, (Throwable) null, 6);
        }
        if (i7 != 407) {
            throw new IOException(W4.o.c("Unexpected response code for CONNECT: ", i7));
        }
        zVar.f3079a.f2883f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final e l(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        int i7 = this.f3641m;
        int size = connectionSpecs.size();
        for (int i8 = i7 + 1; i8 < size; i8++) {
            X5.i iVar = (X5.i) connectionSpecs.get(i8);
            iVar.getClass();
            if (iVar.f2942a && (((strArr = iVar.f2945d) == null || Y5.c.d(strArr, sSLSocket.getEnabledProtocols(), n5.a.f5505b)) && ((strArr2 = iVar.f2944c) == null || Y5.c.d(strArr2, sSLSocket.getEnabledCipherSuites(), X5.f.f2909c)))) {
                return new e(this.f3629a, this.f3630b, this.f3631c, this.f3632d, this.f3633e, this.f3634f, this.f3635g, this.f3636h, this.f3637i, this.f3638j, this.f3639k, this.f3640l, i8, i7 != -1);
            }
        }
        return null;
    }

    public final e m(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        if (this.f3641m != -1) {
            return this;
        }
        e l7 = l(connectionSpecs, sSLSocket);
        if (l7 != null) {
            return l7;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f3642n);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        kotlin.jvm.internal.i.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.i.d(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // c6.e
    public final void h() {
    }

    @Override // c6.e
    public final void b(q qVar, IOException iOException) {
    }
}
