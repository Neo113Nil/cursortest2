package i8;

import com.google.android.gms.internal.ads.CL;
import e8.C4483a;
import e8.C4484b;
import e8.z;
import g1.C4523c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import q2.C4903n;
import r7.AbstractC4979j;
import t7.C5083a;

/* loaded from: classes2.dex */
public final class e implements w, j8.e {

    /* renamed from: a, reason: collision with root package name */
    public final h8.e f38340a;

    /* renamed from: b, reason: collision with root package name */
    public final s f38341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38342c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38345f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38346g;

    /* renamed from: h, reason: collision with root package name */
    public final a f38347h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final z f38348j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f38349k;

    /* renamed from: l, reason: collision with root package name */
    public final C4903n f38350l;

    /* renamed from: m, reason: collision with root package name */
    public final int f38351m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f38352n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f38353o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f38354p;

    /* renamed from: q, reason: collision with root package name */
    public Socket f38355q;

    /* renamed from: r, reason: collision with root package name */
    public e8.l f38356r;

    /* renamed from: s, reason: collision with root package name */
    public e8.t f38357s;

    /* renamed from: t, reason: collision with root package name */
    public Y2.e f38358t;

    /* renamed from: u, reason: collision with root package name */
    public r f38359u;

    public e(h8.e taskRunner, s connectionPool, int i, int i4, int i9, int i10, boolean z8, a user, t routePlanner, z route, ArrayList arrayList, C4903n c4903n, int i11, boolean z9) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(user, "user");
        kotlin.jvm.internal.h.e(routePlanner, "routePlanner");
        kotlin.jvm.internal.h.e(route, "route");
        this.f38340a = taskRunner;
        this.f38341b = connectionPool;
        this.f38342c = i;
        this.f38343d = i4;
        this.f38344e = i9;
        this.f38345f = i10;
        this.f38346g = z8;
        this.f38347h = user;
        this.i = routePlanner;
        this.f38348j = route;
        this.f38349k = arrayList;
        this.f38350l = c4903n;
        this.f38351m = i11;
        this.f38352n = z9;
    }

    @Override // i8.w
    public final w a() {
        return new e(this.f38340a, this.f38341b, this.f38342c, this.f38343d, this.f38344e, this.f38345f, this.f38346g, this.f38347h, this.i, this.f38348j, this.f38349k, this.f38350l, this.f38351m, this.f38352n);
    }

    @Override // i8.w
    public final r b() {
        a aVar = this.f38347h;
        z route = this.f38348j;
        aVar.getClass();
        kotlin.jvm.internal.h.e(route, "route");
        C4523c c4523c = aVar.f38332a.f38399n.f37497z;
        synchronized (c4523c) {
            ((LinkedHashSet) c4523c.f37856u).remove(route);
        }
        r connection = this.f38359u;
        kotlin.jvm.internal.h.b(connection);
        a aVar2 = this.f38347h;
        z route2 = this.f38348j;
        aVar2.getClass();
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(route2, "route");
        aVar2.f38333b.getClass();
        q call = aVar2.f38332a;
        kotlin.jvm.internal.h.e(call, "call");
        u i = this.i.i(this, this.f38349k);
        if (i != null) {
            return i.f38444a;
        }
        synchronized (connection) {
            s sVar = this.f38341b;
            sVar.getClass();
            TimeZone timeZone = f8.d.f37815a;
            sVar.f38428f.add(connection);
            sVar.f38426d.d(sVar.f38427e, 0L);
            this.f38347h.a(connection);
        }
        this.f38347h.g(connection);
        this.f38347h.h(connection);
        return connection;
    }

    @Override // i8.w
    public final v c() {
        Socket socket;
        Socket socket2;
        z zVar = this.f38348j;
        if (this.f38354p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        a aVar = this.f38347h;
        aVar.b(this);
        boolean z8 = false;
        try {
            try {
                aVar.f(zVar);
                h();
                z8 = true;
                v vVar = new v(this, (Throwable) null, 6);
                aVar.n(this);
                return vVar;
            } catch (IOException e6) {
                zVar.f37540a.getClass();
                Proxy proxy = zVar.f37541b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    C4483a c4483a = zVar.f37540a;
                    c4483a.f37350g.connectFailed(c4483a.f37351h.g(), proxy.address(), e6);
                }
                aVar.e(zVar, e6);
                v vVar2 = new v(this, e6, 2);
                aVar.n(this);
                if (!z8 && (socket2 = this.f38354p) != null) {
                    f8.d.c(socket2);
                }
                return vVar2;
            }
        } catch (Throwable th) {
            aVar.n(this);
            if (!z8 && (socket = this.f38354p) != null) {
                f8.d.c(socket);
            }
            throw th;
        }
    }

    @Override // i8.w, j8.e
    public final void cancel() {
        this.f38353o = true;
        Socket socket = this.f38354p;
        if (socket != null) {
            f8.d.c(socket);
        }
    }

    @Override // j8.e
    public final void d(q call, IOException iOException) {
        kotlin.jvm.internal.h.e(call, "call");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    @Override // i8.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v f() {
        e eVar;
        e eVar2;
        Socket socket = this.f38354p;
        if (socket == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (isReady()) {
            throw new IllegalStateException("already connected");
        }
        z zVar = this.f38348j;
        C4483a c4483a = zVar.f37540a;
        C4483a c4483a2 = zVar.f37540a;
        List list = c4483a.f37352j;
        a aVar = this.f38347h;
        aVar.b(this);
        e eVar3 = null;
        boolean z8 = false;
        try {
            try {
                if (this.f38350l != null) {
                    v j9 = j();
                    if (j9.f38446b != null || j9.f38447c != null) {
                        aVar.n(this);
                        Socket socket2 = this.f38355q;
                        if (socket2 != null) {
                            f8.d.c(socket2);
                        }
                        f8.d.c(socket);
                        return j9;
                    }
                }
                if (c4483a2.f37346c != null) {
                    Y2.e eVar4 = this.f38358t;
                    if (eVar4 == null) {
                        kotlin.jvm.internal.h.k("socket");
                        throw null;
                    }
                    if (((u8.r) eVar4.f3964v).f41309u.j()) {
                        Y2.e eVar5 = this.f38358t;
                        if (eVar5 == null) {
                            kotlin.jvm.internal.h.k("socket");
                            throw null;
                        }
                        if (((u8.p) eVar5.f3965w).f41305u.j()) {
                            aVar.f38332a.getClass();
                            SSLSocketFactory sSLSocketFactory = c4483a2.f37346c;
                            e8.o oVar = c4483a2.f37351h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, oVar.f37440d, oVar.f37441e, true);
                            kotlin.jvm.internal.h.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            e l9 = l(list, sSLSocket);
                            e8.i iVar = (e8.i) list.get(l9.f38351m);
                            eVar = l9.k(list, sSLSocket);
                            try {
                                iVar.a(sSLSocket, l9.f38352n);
                                i(sSLSocket, iVar);
                                aVar.f38332a.getClass();
                                eVar2 = eVar;
                            } catch (IOException e6) {
                                e = e6;
                                aVar.e(zVar, e);
                                if (this.f38346g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    eVar3 = eVar;
                                }
                                v vVar = new v(this, eVar3, e);
                                aVar.n(this);
                                if (!z8) {
                                    Socket socket3 = this.f38355q;
                                    if (socket3 != null) {
                                        f8.d.c(socket3);
                                    }
                                    f8.d.c(socket);
                                }
                                return vVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f38355q = socket;
                List list2 = c4483a2.i;
                e8.t tVar = e8.t.f37506z;
                if (!list2.contains(tVar)) {
                    tVar = e8.t.f37503w;
                }
                this.f38357s = tVar;
                eVar2 = null;
                try {
                    h8.e eVar6 = this.f38340a;
                    s sVar = this.f38341b;
                    z zVar2 = this.f38348j;
                    Socket socket4 = this.f38355q;
                    kotlin.jvm.internal.h.b(socket4);
                    e8.l lVar = this.f38356r;
                    e8.t tVar2 = this.f38357s;
                    kotlin.jvm.internal.h.b(tVar2);
                    Y2.e eVar7 = this.f38358t;
                    if (eVar7 == null) {
                        kotlin.jvm.internal.h.k("socket");
                        throw null;
                    }
                    r rVar = new r(eVar6, sVar, zVar2, socket, socket4, lVar, tVar2, eVar7, this.f38341b.f38423a);
                    this.f38359u = rVar;
                    rVar.i();
                    aVar.c(zVar);
                    try {
                        v vVar2 = new v(this, (Throwable) null, 6);
                        aVar.n(this);
                        return vVar2;
                    } catch (IOException e9) {
                        e = e9;
                        eVar = eVar2;
                        z8 = true;
                        aVar.e(zVar, e);
                        if (this.f38346g) {
                            eVar3 = eVar;
                        }
                        v vVar3 = new v(this, eVar3, e);
                        aVar.n(this);
                        if (!z8) {
                        }
                        return vVar3;
                    } catch (Throwable th) {
                        th = th;
                        z8 = true;
                        aVar.n(this);
                        if (!z8) {
                            Socket socket5 = this.f38355q;
                            if (socket5 != null) {
                                f8.d.c(socket5);
                            }
                            f8.d.c(socket);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    eVar = eVar2;
                }
            } catch (IOException e11) {
                e = e11;
                eVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // j8.e
    public final z g() {
        return this.f38348j;
    }

    public final void h() {
        Socket createSocket;
        Proxy.Type type = this.f38348j.f37541b.type();
        int i = type == null ? -1 : d.f38339a[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.f38348j.f37540a.f37345b.createSocket();
            kotlin.jvm.internal.h.b(createSocket);
        } else {
            createSocket = new Socket(this.f38348j.f37541b);
        }
        this.f38354p = createSocket;
        if (this.f38353o) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f38345f);
        try {
            o8.f fVar = o8.f.f39739a;
            o8.f.f39739a.f(createSocket, this.f38348j.f37542c, this.f38344e);
            try {
                this.f38358t = new Y2.e(new S0.i(createSocket));
            } catch (NullPointerException e6) {
                if (kotlin.jvm.internal.h.a(e6.getMessage(), "throw with null exception")) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f38348j.f37542c);
            connectException.initCause(e9);
            throw connectException;
        }
    }

    public final void i(SSLSocket sSLSocket, e8.i iVar) {
        String str;
        e8.t tVar;
        final C4483a c4483a = this.f38348j.f37540a;
        try {
            if (iVar.f37406b) {
                o8.f fVar = o8.f.f39739a;
                o8.f.f39739a.e(sSLSocket, c4483a.f37351h.f37440d, c4483a.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            kotlin.jvm.internal.h.b(session);
            final e8.l n9 = com.bumptech.glide.d.n(session);
            s8.c cVar = c4483a.f37347d;
            kotlin.jvm.internal.h.b(cVar);
            if (!cVar.verify(c4483a.f37351h.f37440d, session)) {
                List a9 = n9.a();
                if (a9.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c4483a.f37351h.f37440d + " not verified (no certificates)");
                }
                Object obj = a9.get(0);
                kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c4483a.f37351h.f37440d);
                sb.append(" not verified:\n            |    certificate: ");
                e8.d dVar = e8.d.f37369c;
                sb.append(Z5.c.l(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC4979j.N(s8.c.a(x509Certificate, 7), s8.c.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(M7.k.z(sb.toString()));
            }
            final e8.d dVar2 = c4483a.f37348e;
            kotlin.jvm.internal.h.b(dVar2);
            this.f38356r = new e8.l(n9.f37423a, n9.f37424b, n9.f37425c, new E7.a() { // from class: i8.c
                @Override // E7.a
                public final Object invoke() {
                    com.bumptech.glide.d dVar3 = e8.d.this.f37371b;
                    kotlin.jvm.internal.h.b(dVar3);
                    return dVar3.d(c4483a.f37351h.f37440d, n9.a());
                }
            });
            String hostname = c4483a.f37351h.f37440d;
            kotlin.jvm.internal.h.e(hostname, "hostname");
            Iterator it = dVar2.f37370a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (iVar.f37406b) {
                o8.f fVar2 = o8.f.f39739a;
                str = o8.f.f39739a.g(sSLSocket);
            } else {
                str = null;
            }
            this.f38355q = sSLSocket;
            this.f38358t = new Y2.e(new S0.i(sSLSocket));
            if (str != null) {
                e8.t.f37501u.getClass();
                tVar = C4484b.d(str);
            } else {
                tVar = e8.t.f37503w;
            }
            this.f38357s = tVar;
            o8.f fVar3 = o8.f.f39739a;
            o8.f.f39739a.getClass();
        } catch (Throwable th) {
            o8.f fVar4 = o8.f.f39739a;
            o8.f.f39739a.getClass();
            f8.d.c(sSLSocket);
            throw th;
        }
    }

    @Override // i8.w
    public final boolean isReady() {
        return this.f38357s != null;
    }

    public final v j() {
        C4903n c4903n = this.f38350l;
        kotlin.jvm.internal.h.b(c4903n);
        z zVar = this.f38348j;
        String str = "CONNECT " + f8.d.i(zVar.f37540a.f37351h, true) + " HTTP/1.1";
        Y2.e eVar = this.f38358t;
        if (eVar == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        k8.g gVar = new k8.g(null, this, eVar);
        Y2.e eVar2 = this.f38358t;
        if (eVar2 == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        u8.z L8 = ((u8.r) eVar2.f3964v).f41308n.L();
        long j9 = this.f38342c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        L8.g(j9);
        Y2.e eVar3 = this.f38358t;
        if (eVar3 == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        ((u8.p) eVar3.f3965w).f41304n.L().g(this.f38343d);
        gVar.l((e8.m) c4903n.f40103w, str);
        gVar.a();
        e8.v c4 = gVar.c(false);
        kotlin.jvm.internal.h.b(c4);
        c4.f37508a = c4903n;
        e8.w a9 = c4.a();
        long f6 = f8.d.f(a9);
        if (f6 != -1) {
            k8.d k6 = gVar.k((e8.o) a9.f37530n.f40101u, f6);
            f8.d.g(k6, Integer.MAX_VALUE);
            k6.close();
        }
        int i = a9.f37533w;
        if (i == 200) {
            return new v(this, (Throwable) null, 6);
        }
        if (i != 407) {
            throw new IOException(CL.i(i, "Unexpected response code for CONNECT: "));
        }
        zVar.f37540a.f37349f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final e k(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        int i = this.f38351m;
        int size = connectionSpecs.size();
        for (int i4 = i + 1; i4 < size; i4++) {
            e8.i iVar = (e8.i) connectionSpecs.get(i4);
            iVar.getClass();
            if (iVar.f37405a) {
                String[] strArr = iVar.f37408d;
                if (strArr != null) {
                    if (!f8.c.d(C5083a.f40951u, strArr, sSLSocket.getEnabledProtocols())) {
                        continue;
                    }
                }
                String[] strArr2 = iVar.f37407c;
                if (strArr2 != null) {
                    if (!f8.c.d(e8.f.f37373c, strArr2, sSLSocket.getEnabledCipherSuites())) {
                    }
                }
                boolean z8 = i != -1;
                return new e(this.f38340a, this.f38341b, this.f38342c, this.f38343d, this.f38344e, this.f38345f, this.f38346g, this.f38347h, this.i, this.f38348j, this.f38349k, this.f38350l, i4, z8);
            }
        }
        return null;
    }

    public final e l(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        if (this.f38351m != -1) {
            return this;
        }
        e k6 = k(connectionSpecs, sSLSocket);
        if (k6 != null) {
            return k6;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f38352n);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        kotlin.jvm.internal.h.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.h.d(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // j8.e
    public final void e() {
    }
}
