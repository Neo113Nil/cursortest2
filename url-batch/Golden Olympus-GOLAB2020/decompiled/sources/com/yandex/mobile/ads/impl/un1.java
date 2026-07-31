package com.yandex.mobile.ads.impl;

import com.ironsource.InterfaceC1490j3;
import com.yandex.mobile.ads.impl.gm1;
import com.yandex.mobile.ads.impl.jh1;
import com.yandex.mobile.ads.impl.ng0;
import com.yandex.mobile.ads.impl.on;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.pp1;
import com.yandex.mobile.ads.impl.xe0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class un1 extends ng0.b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ps1 f33192b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Socket f33193c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private Socket f33194d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private xe0 f33195e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private gm1 f33196f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private ng0 f33197g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private okio.g f33198h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private okio.f f33199i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33200j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33201k;

    /* renamed from: l, reason: collision with root package name */
    private int f33202l;

    /* renamed from: m, reason: collision with root package name */
    private int f33203m;

    /* renamed from: n, reason: collision with root package name */
    private int f33204n;

    /* renamed from: o, reason: collision with root package name */
    private int f33205o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final ArrayList f33206p;

    /* renamed from: q, reason: collision with root package name */
    private long f33207q;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33208a;

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
            f33208a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ on f33209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ xe0 f33210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2202ra f33211d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(on onVar, xe0 xe0Var, C2202ra c2202ra) {
            super(0);
            this.f33209b = onVar;
            this.f33210c = xe0Var;
            this.f33211d = c2202ra;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            nn a4 = this.f33209b.a();
            Intrinsics.checkNotNull(a4);
            return a4.a(this.f33211d.k().g(), this.f33210c.c());
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<List<? extends X509Certificate>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            xe0 xe0Var = un1.this.f33195e;
            Intrinsics.checkNotNull(xe0Var);
            List<Certificate> c4 = xe0Var.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c4, 10));
            for (Certificate certificate : c4) {
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public un1(@NotNull wn1 connectionPool, @NotNull ps1 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f33192b = route;
        this.f33205o = 1;
        this.f33206p = new ArrayList();
        this.f33207q = Long.MAX_VALUE;
    }

    private final void n() {
        ox1 ox1Var;
        Socket socket = this.f33194d;
        Intrinsics.checkNotNull(socket);
        okio.g gVar = this.f33198h;
        Intrinsics.checkNotNull(gVar);
        okio.f fVar = this.f33199i;
        Intrinsics.checkNotNull(fVar);
        socket.setSoTimeout(0);
        ng0 ng0Var = new ng0(new ng0.a(a42.f23152h).a(socket, this.f33192b.a().k().g(), gVar, fVar).a(this).j());
        this.f33197g = ng0Var;
        ox1Var = ng0.f29568C;
        this.f33205o = ox1Var.c();
        ng0.l(ng0Var);
    }

    @NotNull
    public final ArrayList b() {
        return this.f33206p;
    }

    public final long c() {
        return this.f33207q;
    }

    public final boolean d() {
        return this.f33200j;
    }

    public final int e() {
        return this.f33202l;
    }

    @Nullable
    public final xe0 f() {
        return this.f33195e;
    }

    public final synchronized void g() {
        this.f33203m++;
    }

    public final boolean h() {
        return this.f33197g != null;
    }

    public final synchronized void i() {
        this.f33201k = true;
    }

    public final synchronized void j() {
        this.f33200j = true;
    }

    @NotNull
    public final ps1 k() {
        return this.f33192b;
    }

    public final void l() {
        this.f33200j = true;
    }

    @NotNull
    public final Socket m() {
        Socket socket = this.f33194d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    @NotNull
    public final String toString() {
        Object obj;
        String g4 = this.f33192b.a().k().g();
        int i4 = this.f33192b.a().k().i();
        Proxy b4 = this.f33192b.b();
        InetSocketAddress d4 = this.f33192b.d();
        xe0 xe0Var = this.f33195e;
        if (xe0Var == null || (obj = xe0Var.a()) == null) {
            obj = "none";
        }
        return "Connection{" + g4 + StringUtils.PROCESS_POSTFIX_DELIMITER + i4 + ", proxy=" + b4 + " hostAddress=" + d4 + " cipherSuite=" + obj + " protocol=" + this.f33196f + "}";
    }

    public final void a() {
        Socket socket = this.f33193c;
        if (socket != null) {
            v82.a(socket);
        }
    }

    public final void a(int i4, int i5, int i6, boolean z4, @NotNull tn1 call, @NotNull m50 eventListener) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f33196f == null) {
            List<er> b4 = this.f33192b.a().b();
            fr frVar = new fr(b4);
            if (this.f33192b.a().j() == null) {
                if (b4.contains(er.f25392f)) {
                    String g4 = this.f33192b.a().k().g();
                    int i7 = jh1.f27657c;
                    if (!jh1.a.a().a(g4)) {
                        throw new rs1(new UnknownServiceException("CLEARTEXT communication to " + g4 + " not permitted by network security policy"));
                    }
                } else {
                    throw new rs1(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f33192b.a().e().contains(gm1.f26232h)) {
                throw new rs1(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            rs1 rs1Var = null;
            do {
                try {
                    if (this.f33192b.c()) {
                        a(i4, i5, i6, call, eventListener);
                        if (this.f33193c == null) {
                            if (!this.f33192b.c() && this.f33193c == null) {
                                throw new rs1(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f33207q = System.nanoTime();
                            return;
                        }
                    } else {
                        a(i4, i5, call, eventListener);
                    }
                    a(frVar, call, eventListener);
                    InetSocketAddress d4 = this.f33192b.d();
                    Proxy b5 = this.f33192b.b();
                    eventListener.getClass();
                    m50.a(call, d4, b5);
                    if (!this.f33192b.c()) {
                    }
                    this.f33207q = System.nanoTime();
                    return;
                } catch (IOException e4) {
                    Socket socket = this.f33194d;
                    if (socket != null) {
                        v82.a(socket);
                    }
                    Socket socket2 = this.f33193c;
                    if (socket2 != null) {
                        v82.a(socket2);
                    }
                    this.f33194d = null;
                    this.f33193c = null;
                    this.f33198h = null;
                    this.f33199i = null;
                    this.f33195e = null;
                    this.f33196f = null;
                    this.f33197g = null;
                    this.f33205o = 1;
                    InetSocketAddress d5 = this.f33192b.d();
                    Proxy b6 = this.f33192b.b();
                    eventListener.getClass();
                    m50.a(call, d5, b6, e4);
                    if (rs1Var == null) {
                        rs1Var = new rs1(e4);
                    } else {
                        rs1Var.a(e4);
                    }
                    if (!z4) {
                        throw rs1Var;
                    }
                }
            } while (frVar.a(e4));
            throw rs1Var;
        }
        throw new IllegalStateException("already connected");
    }

    private final void a(int i4, int i5, tn1 tn1Var, m50 m50Var) {
        Socket createSocket;
        Proxy b4 = this.f33192b.b();
        C2202ra a4 = this.f33192b.a();
        Proxy.Type type = b4.type();
        int i6 = type == null ? -1 : a.f33208a[type.ordinal()];
        if (i6 != 1 && i6 != 2) {
            createSocket = new Socket(b4);
        } else {
            createSocket = a4.i().createSocket();
            Intrinsics.checkNotNull(createSocket);
        }
        this.f33193c = createSocket;
        InetSocketAddress d4 = this.f33192b.d();
        m50Var.getClass();
        m50.b(tn1Var, d4, b4);
        createSocket.setSoTimeout(i5);
        try {
            int i7 = jh1.f27657c;
            jh1.a.a().a(createSocket, this.f33192b.d(), i4);
            try {
                this.f33198h = okio.p.d(okio.p.l(createSocket));
                this.f33199i = okio.p.c(okio.p.h(createSocket));
            } catch (NullPointerException e4) {
                if (Intrinsics.areEqual(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f33192b.d());
            connectException.initCause(e5);
            throw connectException;
        }
    }

    private final void a(fr frVar) {
        gm1 gm1Var;
        C2202ra a4 = this.f33192b.a();
        SSLSocketFactory j4 = a4.j();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.checkNotNull(j4);
            Socket createSocket = j4.createSocket(this.f33193c, a4.k().g(), a4.k().i(), true);
            Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                er a5 = frVar.a(sSLSocket2);
                if (a5.b()) {
                    int i4 = jh1.f27657c;
                    jh1.a.a().a(sSLSocket2, a4.k().g(), a4.e());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Intrinsics.checkNotNull(session);
                xe0 a6 = xe0.a.a(session);
                HostnameVerifier d4 = a4.d();
                Intrinsics.checkNotNull(d4);
                if (!d4.verify(a4.k().g(), session)) {
                    List<Certificate> c4 = a6.c();
                    if (!c4.isEmpty()) {
                        Certificate certificate = c4.get(0);
                        Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) certificate;
                        String g4 = a4.k().g();
                        on onVar = on.f30105c;
                        throw new SSLPeerUnverifiedException(StringsKt.h("\n              |Hostname " + g4 + " not verified:\n              |    certificate: " + on.b.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + sd1.a(x509Certificate) + "\n              ", null, 1, null));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + a4.k().g() + " not verified (no certificates)");
                }
                on a7 = a4.a();
                Intrinsics.checkNotNull(a7);
                this.f33195e = new xe0(a6.d(), a6.a(), a6.b(), new b(a7, a6, a4));
                a7.a(a4.k().g(), new c());
                if (a5.b()) {
                    int i5 = jh1.f27657c;
                    str = jh1.a.a().b(sSLSocket2);
                }
                this.f33194d = sSLSocket2;
                this.f33198h = okio.p.d(okio.p.l(sSLSocket2));
                this.f33199i = okio.p.c(okio.p.h(sSLSocket2));
                if (str != null) {
                    gm1.f26227c.getClass();
                    gm1Var = gm1.a.a(str);
                } else {
                    gm1Var = gm1.f26229e;
                }
                this.f33196f = gm1Var;
                int i6 = jh1.f27657c;
                jh1.a.a().a(sSLSocket2);
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    int i7 = jh1.f27657c;
                    jh1.a.a().a(sSLSocket);
                }
                if (sSLSocket != null) {
                    v82.a((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void a(int i4, int i5, int i6, tn1 call, m50 m50Var) {
        pp1 a4 = new pp1.a().a(this.f33192b.a().k()).a("CONNECT", (sp1) null).b("Host", v82.a(this.f33192b.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", "okhttp/4.9.3").a();
        pp1 a5 = this.f33192b.a().g().a(this.f33192b, new oq1.a().a(a4).a(gm1.f26229e).a(InterfaceC1490j3.a.b.f16792g).a("Preemptive Authenticate").a(v82.f33552c).b(-1L).a(-1L).c().a());
        if (a5 != null) {
            a4 = a5;
        }
        mh0 g4 = a4.g();
        for (int i7 = 0; i7 < 21; i7++) {
            a(i4, i5, call, m50Var);
            a4 = a(i5, i6, a4, g4);
            if (a4 == null) {
                return;
            }
            Socket socket = this.f33193c;
            if (socket != null) {
                v82.a(socket);
            }
            this.f33193c = null;
            this.f33199i = null;
            this.f33198h = null;
            InetSocketAddress inetSocketAddress = this.f33192b.d();
            Proxy proxy = this.f33192b.b();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
            Intrinsics.checkNotNullParameter(proxy, "proxy");
        }
    }

    private final pp1 a(int i4, int i5, pp1 pp1Var, mh0 mh0Var) {
        String str = "CONNECT " + v82.a(mh0Var, true) + " HTTP/1.1";
        while (true) {
            okio.g gVar = this.f33198h;
            Intrinsics.checkNotNull(gVar);
            okio.f fVar = this.f33199i;
            Intrinsics.checkNotNull(fVar);
            lg0 lg0Var = new lg0(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().timeout(i4, timeUnit);
            fVar.timeout().timeout(i5, timeUnit);
            lg0Var.a(pp1Var.d(), str);
            lg0Var.a();
            oq1.a a4 = lg0Var.a(false);
            Intrinsics.checkNotNull(a4);
            oq1 a5 = a4.a(pp1Var).a();
            lg0Var.c(a5);
            int d4 = a5.d();
            if (d4 == 200) {
                if (gVar.q().v() && fVar.q().v()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (d4 == 407) {
                pp1 a6 = this.f33192b.a().g().a(this.f33192b, a5);
                if (a6 != null) {
                    if (StringsKt.w("close", oq1.a(a5, "Connection"), true)) {
                        return a6;
                    }
                    pp1Var = a6;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a5.d());
            }
        }
    }

    private final void a(fr frVar, tn1 call, m50 m50Var) {
        if (this.f33192b.a().j() == null) {
            List<gm1> e4 = this.f33192b.a().e();
            gm1 gm1Var = gm1.f26232h;
            if (e4.contains(gm1Var)) {
                this.f33194d = this.f33193c;
                this.f33196f = gm1Var;
                n();
                return;
            } else {
                this.f33194d = this.f33193c;
                this.f33196f = gm1.f26229e;
                return;
            }
        }
        m50Var.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        a(frVar);
        Intrinsics.checkNotNullParameter(call, "call");
        if (this.f33196f == gm1.f26231g) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if (r6.d() == com.yandex.mobile.ads.impl.sd1.f31696a) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (a(r6.k()) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        r7 = r6.a();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7);
        r6 = r6.k().g();
        r0 = r5.f33195e;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r7.a(r6, r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@NotNull C2202ra address, @Nullable List<ps1> list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (v82.f33555f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f33206p.size() >= this.f33205o || this.f33200j || !this.f33192b.a().a(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.k().g(), this.f33192b.a().k().g())) {
            return true;
        }
        if (this.f33197g != null && list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ps1 ps1Var = (ps1) it.next();
                Proxy.Type type = ps1Var.b().type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                if (type == type2 && this.f33192b.b().type() == type2 && Intrinsics.areEqual(this.f33192b.d(), ps1Var.d())) {
                    break;
                }
            }
        }
        return false;
    }

    @NotNull
    public final s50 a(@NotNull td1 client, @NotNull xn1 chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f33194d;
        Intrinsics.checkNotNull(socket);
        okio.g gVar = this.f33198h;
        Intrinsics.checkNotNull(gVar);
        okio.f fVar = this.f33199i;
        Intrinsics.checkNotNull(fVar);
        ng0 ng0Var = this.f33197g;
        if (ng0Var != null) {
            return new sg0(client, this, chain, ng0Var);
        }
        socket.setSoTimeout(chain.h());
        okio.C timeout = gVar.timeout();
        long e4 = chain.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(e4, timeUnit);
        fVar.timeout().timeout(chain.g(), timeUnit);
        return new lg0(client, this, gVar, fVar);
    }

    @Override // com.yandex.mobile.ads.impl.ng0.b
    public final synchronized void a(@NotNull ng0 connection, @NotNull ox1 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f33205o = settings.c();
    }

    @Override // com.yandex.mobile.ads.impl.ng0.b
    public final void a(@NotNull ug0 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.a(i50.f27094h, (IOException) null);
    }

    public final void a(long j4) {
        this.f33207q = j4;
    }

    public final synchronized void a(@NotNull tn1 call, @Nullable IOException failure) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (failure instanceof o22) {
                i50 i50Var = ((o22) failure).f29876b;
                if (i50Var == i50.f27094h) {
                    int i4 = this.f33204n + 1;
                    this.f33204n = i4;
                    if (i4 > 1) {
                        this.f33200j = true;
                        this.f33202l++;
                    }
                } else if (i50Var != i50.f27095i || !call.j()) {
                    this.f33200j = true;
                    this.f33202l++;
                }
            } else if (!h() || (failure instanceof dr)) {
                this.f33200j = true;
                if (this.f33203m == 0) {
                    if (failure != null) {
                        td1 client = call.c();
                        ps1 failedRoute = this.f33192b;
                        Intrinsics.checkNotNullParameter(client, "client");
                        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
                        Intrinsics.checkNotNullParameter(failure, "failure");
                        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
                            C2202ra a4 = failedRoute.a();
                            a4.h().connectFailed(a4.k().l(), failedRoute.b().address(), failure);
                        }
                        client.n().b(failedRoute);
                    }
                    this.f33202l++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean a(mh0 mh0Var) {
        xe0 xe0Var;
        if (v82.f33555f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        mh0 k4 = this.f33192b.a().k();
        if (mh0Var.i() != k4.i()) {
            return false;
        }
        if (Intrinsics.areEqual(mh0Var.g(), k4.g())) {
            return true;
        }
        if (!this.f33201k && (xe0Var = this.f33195e) != null) {
            Intrinsics.checkNotNull(xe0Var);
            List<Certificate> c4 = xe0Var.c();
            if (!c4.isEmpty()) {
                String g4 = mh0Var.g();
                Certificate certificate = c4.get(0);
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                if (sd1.a(g4, (X509Certificate) certificate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(boolean z4) {
        long j4;
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f33193c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f33194d;
        Intrinsics.checkNotNull(socket2);
        okio.g gVar = this.f33198h;
        Intrinsics.checkNotNull(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ng0 ng0Var = this.f33197g;
        if (ng0Var != null) {
            return ng0Var.a(nanoTime);
        }
        synchronized (this) {
            j4 = nanoTime - this.f33207q;
        }
        if (j4 < 10000000000L || !z4) {
            return true;
        }
        return v82.a(socket2, gVar);
    }
}
