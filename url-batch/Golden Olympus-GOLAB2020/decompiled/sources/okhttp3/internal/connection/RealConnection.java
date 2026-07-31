package okhttp3.internal.connection;

import com.ironsource.InterfaceC1490j3;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.C;
import okio.f;
import okio.g;
import okio.p;

@Metadata
/* loaded from: classes3.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: t, reason: collision with root package name */
    public static final Companion f42785t = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private final RealConnectionPool f42786c;

    /* renamed from: d, reason: collision with root package name */
    private final Route f42787d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f42788e;

    /* renamed from: f, reason: collision with root package name */
    private Socket f42789f;

    /* renamed from: g, reason: collision with root package name */
    private Handshake f42790g;

    /* renamed from: h, reason: collision with root package name */
    private Protocol f42791h;

    /* renamed from: i, reason: collision with root package name */
    private Http2Connection f42792i;

    /* renamed from: j, reason: collision with root package name */
    private g f42793j;

    /* renamed from: k, reason: collision with root package name */
    private f f42794k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42795l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f42796m;

    /* renamed from: n, reason: collision with root package name */
    private int f42797n;

    /* renamed from: o, reason: collision with root package name */
    private int f42798o;

    /* renamed from: p, reason: collision with root package name */
    private int f42799p;

    /* renamed from: q, reason: collision with root package name */
    private int f42800q;

    /* renamed from: r, reason: collision with root package name */
    private final List f42801r;

    /* renamed from: s, reason: collision with root package name */
    private long f42802s;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42803a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42803a = iArr;
        }
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f42786c = connectionPool;
        this.f42787d = route;
        this.f42800q = 1;
        this.f42801r = new ArrayList();
        this.f42802s = Long.MAX_VALUE;
    }

    private final boolean B(List list) {
        List<Route> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Route route : list2) {
            Proxy.Type type = route.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f42787d.b().type() == type2 && Intrinsics.areEqual(this.f42787d.d(), route.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i4) {
        Socket socket = this.f42789f;
        Intrinsics.checkNotNull(socket);
        g gVar = this.f42793j;
        Intrinsics.checkNotNull(gVar);
        f fVar = this.f42794k;
        Intrinsics.checkNotNull(fVar);
        socket.setSoTimeout(0);
        Http2Connection a4 = new Http2Connection.Builder(true, TaskRunner.f42718i).q(socket, this.f42787d.a().l().h(), gVar, fVar).k(this).l(i4).a();
        this.f42792i = a4;
        this.f42800q = Http2Connection.f42939D.a().d();
        Http2Connection.D0(a4, false, null, 3, null);
    }

    private final boolean G(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.f42596h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl l4 = this.f42787d.a().l();
        if (httpUrl.l() != l4.l()) {
            return false;
        }
        if (Intrinsics.areEqual(httpUrl.h(), l4.h())) {
            return true;
        }
        if (!this.f42796m && (handshake = this.f42790g) != null) {
            Intrinsics.checkNotNull(handshake);
            if (e(httpUrl, handshake)) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(HttpUrl httpUrl, Handshake handshake) {
        List d4 = handshake.d();
        if (!d4.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f43165a;
            String h4 = httpUrl.h();
            Object obj = d4.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (okHostnameVerifier.e(h4, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void h(int i4, int i5, Call call, EventListener eventListener) {
        Socket createSocket;
        Proxy b4 = this.f42787d.b();
        Address a4 = this.f42787d.a();
        Proxy.Type type = b4.type();
        int i6 = type == null ? -1 : WhenMappings.f42803a[type.ordinal()];
        if (i6 == 1 || i6 == 2) {
            createSocket = a4.j().createSocket();
            Intrinsics.checkNotNull(createSocket);
        } else {
            createSocket = new Socket(b4);
        }
        this.f42788e = createSocket;
        eventListener.j(call, this.f42787d.d(), b4);
        createSocket.setSoTimeout(i5);
        try {
            Platform.f43120a.g().f(createSocket, this.f42787d.d(), i4);
            try {
                this.f42793j = p.d(p.l(createSocket));
                this.f42794k = p.c(p.h(createSocket));
            } catch (NullPointerException e4) {
                if (Intrinsics.areEqual(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f42787d.d());
            connectException.initCause(e5);
            throw connectException;
        }
    }

    private final void i(ConnectionSpecSelector connectionSpecSelector) {
        SSLSocket sSLSocket;
        Address a4 = this.f42787d.a();
        SSLSocketFactory k4 = a4.k();
        SSLSocket sSLSocket2 = null;
        try {
            Intrinsics.checkNotNull(k4);
            Socket createSocket = k4.createSocket(this.f42788e, a4.l().h(), a4.l().l(), true);
            Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ConnectionSpec a5 = connectionSpecSelector.a(sSLSocket);
            if (a5.h()) {
                Platform.f43120a.g().e(sSLSocket, a4.l().h(), a4.f());
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.f42379e;
            Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
            Handshake a6 = companion.a(sslSocketSession);
            HostnameVerifier e4 = a4.e();
            Intrinsics.checkNotNull(e4);
            if (e4.verify(a4.l().h(), sslSocketSession)) {
                CertificatePinner a7 = a4.a();
                Intrinsics.checkNotNull(a7);
                this.f42790g = new Handshake(a6.e(), a6.a(), a6.c(), new RealConnection$connectTls$1(a7, a6, a4));
                a7.b(a4.l().h(), new RealConnection$connectTls$2(this));
                String h4 = a5.h() ? Platform.f43120a.g().h(sSLSocket) : null;
                this.f42789f = sSLSocket;
                this.f42793j = p.d(p.l(sSLSocket));
                this.f42794k = p.c(p.h(sSLSocket));
                this.f42791h = h4 != null ? Protocol.f42514c.a(h4) : Protocol.HTTP_1_1;
                Platform.f43120a.g().b(sSLSocket);
                return;
            }
            List d4 = a6.d();
            if (d4.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + a4.l().h() + " not verified (no certificates)");
            }
            Object obj = d4.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(StringsKt.h("\n              |Hostname " + a4.l().h() + " not verified:\n              |    certificate: " + CertificatePinner.f42188c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.f43165a.a(x509Certificate) + "\n              ", null, 1, null));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                Platform.f43120a.g().b(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                Util.m(sSLSocket2);
            }
            throw th;
        }
    }

    private final void j(int i4, int i5, int i6, Call call, EventListener eventListener) {
        Request l4 = l();
        HttpUrl j4 = l4.j();
        for (int i7 = 0; i7 < 21; i7++) {
            h(i4, i5, call, eventListener);
            l4 = k(i5, i6, l4, j4);
            if (l4 == null) {
                return;
            }
            Socket socket = this.f42788e;
            if (socket != null) {
                Util.m(socket);
            }
            this.f42788e = null;
            this.f42794k = null;
            this.f42793j = null;
            eventListener.h(call, this.f42787d.d(), this.f42787d.b(), null);
        }
    }

    private final Request k(int i4, int i5, Request request, HttpUrl httpUrl) {
        String str = "CONNECT " + Util.S(httpUrl, true) + " HTTP/1.1";
        while (true) {
            g gVar = this.f42793j;
            Intrinsics.checkNotNull(gVar);
            f fVar = this.f42794k;
            Intrinsics.checkNotNull(fVar);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().timeout(i4, timeUnit);
            fVar.timeout().timeout(i5, timeUnit);
            http1ExchangeCodec.A(request.f(), str);
            http1ExchangeCodec.a();
            Response.Builder d4 = http1ExchangeCodec.d(false);
            Intrinsics.checkNotNull(d4);
            Response c4 = d4.r(request).c();
            http1ExchangeCodec.z(c4);
            int J3 = c4.J();
            if (J3 == 200) {
                if (gVar.q().v() && fVar.q().v()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (J3 != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c4.J());
            }
            Request a4 = this.f42787d.a().h().a(this.f42787d, c4);
            if (a4 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.w("close", Response.V(c4, "Connection", null, 2, null), true)) {
                return a4;
            }
            request = a4;
        }
    }

    private final Request l() {
        Request a4 = new Request.Builder().j(this.f42787d.a().l()).f("CONNECT", null).d("Host", Util.S(this.f42787d.a().l(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", "okhttp/4.12.0").a();
        Request a5 = this.f42787d.a().h().a(this.f42787d, new Response.Builder().r(a4).p(Protocol.HTTP_1_1).g(InterfaceC1490j3.a.b.f16792g).m("Preemptive Authenticate").b(Util.f42591c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a5 == null ? a4 : a5;
    }

    private final void m(ConnectionSpecSelector connectionSpecSelector, int i4, Call call, EventListener eventListener) {
        if (this.f42787d.a().k() != null) {
            eventListener.C(call);
            i(connectionSpecSelector);
            eventListener.B(call, this.f42790g);
            if (this.f42791h == Protocol.HTTP_2) {
                F(i4);
                return;
            }
            return;
        }
        List f4 = this.f42787d.a().f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!f4.contains(protocol)) {
            this.f42789f = this.f42788e;
            this.f42791h = Protocol.HTTP_1_1;
        } else {
            this.f42789f = this.f42788e;
            this.f42791h = protocol;
            F(i4);
        }
    }

    public Route A() {
        return this.f42787d;
    }

    public final void C(long j4) {
        this.f42802s = j4;
    }

    public final void D(boolean z4) {
        this.f42795l = z4;
    }

    public Socket E() {
        Socket socket = this.f42789f;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    public final synchronized void H(RealCall call, IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).f43086b == ErrorCode.REFUSED_STREAM) {
                    int i4 = this.f42799p + 1;
                    this.f42799p = i4;
                    if (i4 > 1) {
                        this.f42795l = true;
                        this.f42797n++;
                    }
                } else if (((StreamResetException) iOException).f43086b != ErrorCode.CANCEL || !call.r()) {
                    this.f42795l = true;
                    this.f42797n++;
                }
            } else if (!v() || (iOException instanceof ConnectionShutdownException)) {
                this.f42795l = true;
                if (this.f42798o == 0) {
                    if (iOException != null) {
                        g(call.l(), this.f42787d, iOException);
                    }
                    this.f42797n++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void a(Http2Connection connection, Settings settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f42800q = settings.d();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void b(Http2Stream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.d(ErrorCode.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f42788e;
        if (socket != null) {
            Util.m(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i4, int i5, int i6, int i7, boolean z4, Call call, EventListener eventListener) {
        Socket socket;
        Socket socket2;
        Call call2 = call;
        EventListener eventListener2 = eventListener;
        Intrinsics.checkNotNullParameter(call2, "call");
        Intrinsics.checkNotNullParameter(eventListener2, "eventListener");
        if (this.f42791h != null) {
            throw new IllegalStateException("already connected");
        }
        List b4 = this.f42787d.a().b();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(b4);
        if (this.f42787d.a().k() == null) {
            if (!b4.contains(ConnectionSpec.f42331k)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String h4 = this.f42787d.a().l().h();
            if (!Platform.f43120a.g().j(h4)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + h4 + " not permitted by network security policy"));
            }
        } else if (this.f42787d.a().f().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.f42787d.c()) {
                    EventListener eventListener3 = eventListener2;
                    Call call3 = call2;
                    try {
                        j(i4, i5, i6, call3, eventListener3);
                        call2 = call3;
                        eventListener2 = eventListener3;
                    } catch (IOException e4) {
                        e = e4;
                        call2 = call3;
                        eventListener2 = eventListener3;
                    }
                    try {
                        if (this.f42788e == null) {
                            break;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        IOException iOException = e;
                        socket = this.f42789f;
                        if (socket != null) {
                        }
                        socket2 = this.f42788e;
                        if (socket2 != null) {
                        }
                        this.f42789f = null;
                        this.f42788e = null;
                        this.f42793j = null;
                        this.f42794k = null;
                        this.f42790g = null;
                        this.f42791h = null;
                        this.f42792i = null;
                        this.f42800q = 1;
                        eventListener2.i(call2, this.f42787d.d(), this.f42787d.b(), null, iOException);
                        if (routeException != null) {
                        }
                        if (z4) {
                        }
                    }
                } else {
                    h(i4, i5, call2, eventListener2);
                }
            } catch (IOException e6) {
                e = e6;
            }
            try {
                m(connectionSpecSelector, i7, call2, eventListener2);
                eventListener2.h(call2, this.f42787d.d(), this.f42787d.b(), this.f42791h);
                break;
            } catch (IOException e7) {
                e = e7;
                IOException iOException2 = e;
                socket = this.f42789f;
                if (socket != null) {
                    Util.m(socket);
                }
                socket2 = this.f42788e;
                if (socket2 != null) {
                    Util.m(socket2);
                }
                this.f42789f = null;
                this.f42788e = null;
                this.f42793j = null;
                this.f42794k = null;
                this.f42790g = null;
                this.f42791h = null;
                this.f42792i = null;
                this.f42800q = 1;
                eventListener2.i(call2, this.f42787d.d(), this.f42787d.b(), null, iOException2);
                if (routeException != null) {
                    routeException = new RouteException(iOException2);
                } else {
                    routeException.a(iOException2);
                }
                if (z4) {
                    throw routeException;
                }
                if (!connectionSpecSelector.b(iOException2)) {
                    throw routeException;
                }
                call2 = call;
                eventListener2 = eventListener;
            }
            call2 = call;
            eventListener2 = eventListener;
        }
        if (this.f42787d.c() && this.f42788e == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f42802s = System.nanoTime();
    }

    public final void g(OkHttpClient client, Route failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            Address a4 = failedRoute.a();
            a4.i().connectFailed(a4.l().q(), failedRoute.b().address(), failure);
        }
        client.v().b(failedRoute);
    }

    public final List n() {
        return this.f42801r;
    }

    public final long o() {
        return this.f42802s;
    }

    public final boolean p() {
        return this.f42795l;
    }

    public final int q() {
        return this.f42797n;
    }

    public Handshake r() {
        return this.f42790g;
    }

    public final synchronized void s() {
        this.f42798o++;
    }

    public final boolean t(Address address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (Util.f42596h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f42801r.size() >= this.f42800q || this.f42795l || !this.f42787d.a().d(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.f42792i == null || list == null || !B(list) || address.e() != OkHostnameVerifier.f43165a || !G(address.l())) {
            return false;
        }
        try {
            CertificatePinner a4 = address.a();
            Intrinsics.checkNotNull(a4);
            String h4 = address.l().h();
            Handshake r4 = r();
            Intrinsics.checkNotNull(r4);
            a4.a(h4, r4.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f42787d.a().l().h());
        sb.append(':');
        sb.append(this.f42787d.a().l().l());
        sb.append(", proxy=");
        sb.append(this.f42787d.b());
        sb.append(" hostAddress=");
        sb.append(this.f42787d.d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f42790g;
        if (handshake == null || (obj = handshake.a()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f42791h);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(boolean z4) {
        long j4;
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f42788e;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f42789f;
        Intrinsics.checkNotNull(socket2);
        g gVar = this.f42793j;
        Intrinsics.checkNotNull(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f42792i;
        if (http2Connection != null) {
            return http2Connection.p0(nanoTime);
        }
        synchronized (this) {
            j4 = nanoTime - this.f42802s;
        }
        if (j4 < 10000000000L || !z4) {
            return true;
        }
        return Util.F(socket2, gVar);
    }

    public final boolean v() {
        return this.f42792i != null;
    }

    public final ExchangeCodec w(OkHttpClient client, RealInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f42789f;
        Intrinsics.checkNotNull(socket);
        g gVar = this.f42793j;
        Intrinsics.checkNotNull(gVar);
        f fVar = this.f42794k;
        Intrinsics.checkNotNull(fVar);
        Http2Connection http2Connection = this.f42792i;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.k());
        C timeout = gVar.timeout();
        long h4 = chain.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(h4, timeUnit);
        fVar.timeout().timeout(chain.j(), timeUnit);
        return new Http1ExchangeCodec(client, this, gVar, fVar);
    }

    public final RealWebSocket.Streams x(final Exchange exchange) {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Socket socket = this.f42789f;
        Intrinsics.checkNotNull(socket);
        final g gVar = this.f42793j;
        Intrinsics.checkNotNull(gVar);
        final f fVar = this.f42794k;
        Intrinsics.checkNotNull(fVar);
        socket.setSoTimeout(0);
        z();
        return new RealWebSocket.Streams(gVar, fVar) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.a(-1L, true, true, null);
            }
        };
    }

    public final synchronized void y() {
        this.f42796m = true;
    }

    public final synchronized void z() {
        this.f42795l = true;
    }
}
