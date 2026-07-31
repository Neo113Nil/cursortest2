package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

@Metadata
/* loaded from: classes3.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* renamed from: F, reason: collision with root package name */
    public static final Companion f42449F = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    private static final List f42450G = Util.v(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: H, reason: collision with root package name */
    private static final List f42451H = Util.v(ConnectionSpec.f42329i, ConnectionSpec.f42331k);

    /* renamed from: A, reason: collision with root package name */
    private final int f42452A;

    /* renamed from: B, reason: collision with root package name */
    private final int f42453B;

    /* renamed from: C, reason: collision with root package name */
    private final int f42454C;

    /* renamed from: D, reason: collision with root package name */
    private final long f42455D;

    /* renamed from: E, reason: collision with root package name */
    private final RouteDatabase f42456E;

    /* renamed from: b, reason: collision with root package name */
    private final Dispatcher f42457b;

    /* renamed from: c, reason: collision with root package name */
    private final ConnectionPool f42458c;

    /* renamed from: d, reason: collision with root package name */
    private final List f42459d;

    /* renamed from: e, reason: collision with root package name */
    private final List f42460e;

    /* renamed from: f, reason: collision with root package name */
    private final EventListener.Factory f42461f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f42462g;

    /* renamed from: h, reason: collision with root package name */
    private final Authenticator f42463h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f42464i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f42465j;

    /* renamed from: k, reason: collision with root package name */
    private final CookieJar f42466k;

    /* renamed from: l, reason: collision with root package name */
    private final Cache f42467l;

    /* renamed from: m, reason: collision with root package name */
    private final Dns f42468m;

    /* renamed from: n, reason: collision with root package name */
    private final Proxy f42469n;

    /* renamed from: o, reason: collision with root package name */
    private final ProxySelector f42470o;

    /* renamed from: p, reason: collision with root package name */
    private final Authenticator f42471p;

    /* renamed from: q, reason: collision with root package name */
    private final SocketFactory f42472q;

    /* renamed from: r, reason: collision with root package name */
    private final SSLSocketFactory f42473r;

    /* renamed from: s, reason: collision with root package name */
    private final X509TrustManager f42474s;

    /* renamed from: t, reason: collision with root package name */
    private final List f42475t;

    /* renamed from: u, reason: collision with root package name */
    private final List f42476u;

    /* renamed from: v, reason: collision with root package name */
    private final HostnameVerifier f42477v;

    /* renamed from: w, reason: collision with root package name */
    private final CertificatePinner f42478w;

    /* renamed from: x, reason: collision with root package name */
    private final CertificateChainCleaner f42479x;

    /* renamed from: y, reason: collision with root package name */
    private final int f42480y;

    /* renamed from: z, reason: collision with root package name */
    private final int f42481z;

    @Metadata
    public static final class Builder {

        /* renamed from: A, reason: collision with root package name */
        private int f42482A;

        /* renamed from: B, reason: collision with root package name */
        private int f42483B;

        /* renamed from: C, reason: collision with root package name */
        private long f42484C;

        /* renamed from: D, reason: collision with root package name */
        private RouteDatabase f42485D;

        /* renamed from: a, reason: collision with root package name */
        private Dispatcher f42486a = new Dispatcher();

        /* renamed from: b, reason: collision with root package name */
        private ConnectionPool f42487b = new ConnectionPool();

        /* renamed from: c, reason: collision with root package name */
        private final List f42488c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private final List f42489d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private EventListener.Factory f42490e = Util.g(EventListener.f42371b);

        /* renamed from: f, reason: collision with root package name */
        private boolean f42491f = true;

        /* renamed from: g, reason: collision with root package name */
        private Authenticator f42492g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f42493h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f42494i;

        /* renamed from: j, reason: collision with root package name */
        private CookieJar f42495j;

        /* renamed from: k, reason: collision with root package name */
        private Cache f42496k;

        /* renamed from: l, reason: collision with root package name */
        private Dns f42497l;

        /* renamed from: m, reason: collision with root package name */
        private Proxy f42498m;

        /* renamed from: n, reason: collision with root package name */
        private ProxySelector f42499n;

        /* renamed from: o, reason: collision with root package name */
        private Authenticator f42500o;

        /* renamed from: p, reason: collision with root package name */
        private SocketFactory f42501p;

        /* renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f42502q;

        /* renamed from: r, reason: collision with root package name */
        private X509TrustManager f42503r;

        /* renamed from: s, reason: collision with root package name */
        private List f42504s;

        /* renamed from: t, reason: collision with root package name */
        private List f42505t;

        /* renamed from: u, reason: collision with root package name */
        private HostnameVerifier f42506u;

        /* renamed from: v, reason: collision with root package name */
        private CertificatePinner f42507v;

        /* renamed from: w, reason: collision with root package name */
        private CertificateChainCleaner f42508w;

        /* renamed from: x, reason: collision with root package name */
        private int f42509x;

        /* renamed from: y, reason: collision with root package name */
        private int f42510y;

        /* renamed from: z, reason: collision with root package name */
        private int f42511z;

        public Builder() {
            Authenticator authenticator = Authenticator.f42126b;
            this.f42492g = authenticator;
            this.f42493h = true;
            this.f42494i = true;
            this.f42495j = CookieJar.f42357b;
            this.f42497l = Dns.f42368b;
            this.f42500o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f42501p = socketFactory;
            Companion companion = OkHttpClient.f42449F;
            this.f42504s = companion.a();
            this.f42505t = companion.b();
            this.f42506u = OkHostnameVerifier.f43165a;
            this.f42507v = CertificatePinner.f42189d;
            this.f42510y = 10000;
            this.f42511z = 10000;
            this.f42482A = 10000;
            this.f42484C = 1024L;
        }

        public final boolean A() {
            return this.f42491f;
        }

        public final RouteDatabase B() {
            return this.f42485D;
        }

        public final SocketFactory C() {
            return this.f42501p;
        }

        public final SSLSocketFactory D() {
            return this.f42502q;
        }

        public final int E() {
            return this.f42482A;
        }

        public final X509TrustManager F() {
            return this.f42503r;
        }

        public final OkHttpClient a() {
            return new OkHttpClient(this);
        }

        public final Builder b(Cache cache) {
            this.f42496k = cache;
            return this;
        }

        public final Authenticator c() {
            return this.f42492g;
        }

        public final Cache d() {
            return this.f42496k;
        }

        public final int e() {
            return this.f42509x;
        }

        public final CertificateChainCleaner f() {
            return this.f42508w;
        }

        public final CertificatePinner g() {
            return this.f42507v;
        }

        public final int h() {
            return this.f42510y;
        }

        public final ConnectionPool i() {
            return this.f42487b;
        }

        public final List j() {
            return this.f42504s;
        }

        public final CookieJar k() {
            return this.f42495j;
        }

        public final Dispatcher l() {
            return this.f42486a;
        }

        public final Dns m() {
            return this.f42497l;
        }

        public final EventListener.Factory n() {
            return this.f42490e;
        }

        public final boolean o() {
            return this.f42493h;
        }

        public final boolean p() {
            return this.f42494i;
        }

        public final HostnameVerifier q() {
            return this.f42506u;
        }

        public final List r() {
            return this.f42488c;
        }

        public final long s() {
            return this.f42484C;
        }

        public final List t() {
            return this.f42489d;
        }

        public final int u() {
            return this.f42483B;
        }

        public final List v() {
            return this.f42505t;
        }

        public final Proxy w() {
            return this.f42498m;
        }

        public final Authenticator x() {
            return this.f42500o;
        }

        public final ProxySelector y() {
            return this.f42499n;
        }

        public final int z() {
            return this.f42511z;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return OkHttpClient.f42451H;
        }

        public final List b() {
            return OkHttpClient.f42450G;
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector y4;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f42457b = builder.l();
        this.f42458c = builder.i();
        this.f42459d = Util.U(builder.r());
        this.f42460e = Util.U(builder.t());
        this.f42461f = builder.n();
        this.f42462g = builder.A();
        this.f42463h = builder.c();
        this.f42464i = builder.o();
        this.f42465j = builder.p();
        this.f42466k = builder.k();
        this.f42467l = builder.d();
        this.f42468m = builder.m();
        this.f42469n = builder.w();
        if (builder.w() != null) {
            y4 = NullProxySelector.f43152a;
        } else {
            y4 = builder.y();
            y4 = y4 == null ? ProxySelector.getDefault() : y4;
            if (y4 == null) {
                y4 = NullProxySelector.f43152a;
            }
        }
        this.f42470o = y4;
        this.f42471p = builder.x();
        this.f42472q = builder.C();
        List j4 = builder.j();
        this.f42475t = j4;
        this.f42476u = builder.v();
        this.f42477v = builder.q();
        this.f42480y = builder.e();
        this.f42481z = builder.h();
        this.f42452A = builder.z();
        this.f42453B = builder.E();
        this.f42454C = builder.u();
        this.f42455D = builder.s();
        RouteDatabase B4 = builder.B();
        this.f42456E = B4 == null ? new RouteDatabase() : B4;
        List list = j4;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f()) {
                    if (builder.D() != null) {
                        this.f42473r = builder.D();
                        CertificateChainCleaner f4 = builder.f();
                        Intrinsics.checkNotNull(f4);
                        this.f42479x = f4;
                        X509TrustManager F4 = builder.F();
                        Intrinsics.checkNotNull(F4);
                        this.f42474s = F4;
                        CertificatePinner g4 = builder.g();
                        Intrinsics.checkNotNull(f4);
                        this.f42478w = g4.e(f4);
                    } else {
                        Platform.Companion companion = Platform.f43120a;
                        X509TrustManager p4 = companion.g().p();
                        this.f42474s = p4;
                        Platform g5 = companion.g();
                        Intrinsics.checkNotNull(p4);
                        this.f42473r = g5.o(p4);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.f43164a;
                        Intrinsics.checkNotNull(p4);
                        CertificateChainCleaner a4 = companion2.a(p4);
                        this.f42479x = a4;
                        CertificatePinner g6 = builder.g();
                        Intrinsics.checkNotNull(a4);
                        this.f42478w = g6.e(a4);
                    }
                    I();
                }
            }
        }
        this.f42473r = null;
        this.f42479x = null;
        this.f42474s = null;
        this.f42478w = CertificatePinner.f42189d;
        I();
    }

    private final void I() {
        List list = this.f42459d;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f42459d).toString());
        }
        List list2 = this.f42460e;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f42460e).toString());
        }
        List list3 = this.f42475t;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f()) {
                    if (this.f42473r == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f42479x == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f42474s == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f42473r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f42479x != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f42474s != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.f42478w, CertificatePinner.f42189d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final List A() {
        return this.f42476u;
    }

    public final Proxy B() {
        return this.f42469n;
    }

    public final Authenticator C() {
        return this.f42471p;
    }

    public final ProxySelector D() {
        return this.f42470o;
    }

    public final int E() {
        return this.f42452A;
    }

    public final boolean F() {
        return this.f42462g;
    }

    public final SocketFactory G() {
        return this.f42472q;
    }

    public final SSLSocketFactory H() {
        SSLSocketFactory sSLSocketFactory = this.f42473r;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int J() {
        return this.f42453B;
    }

    @Override // okhttp3.Call.Factory
    public Call a(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new RealCall(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final Authenticator i() {
        return this.f42463h;
    }

    public final Cache j() {
        return this.f42467l;
    }

    public final int k() {
        return this.f42480y;
    }

    public final CertificatePinner l() {
        return this.f42478w;
    }

    public final int m() {
        return this.f42481z;
    }

    public final ConnectionPool n() {
        return this.f42458c;
    }

    public final List o() {
        return this.f42475t;
    }

    public final CookieJar p() {
        return this.f42466k;
    }

    public final Dispatcher q() {
        return this.f42457b;
    }

    public final Dns r() {
        return this.f42468m;
    }

    public final EventListener.Factory s() {
        return this.f42461f;
    }

    public final boolean t() {
        return this.f42464i;
    }

    public final boolean u() {
        return this.f42465j;
    }

    public final RouteDatabase v() {
        return this.f42456E;
    }

    public final HostnameVerifier w() {
        return this.f42477v;
    }

    public final List x() {
        return this.f42459d;
    }

    public final List y() {
        return this.f42460e;
    }

    public final int z() {
        return this.f42454C;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
