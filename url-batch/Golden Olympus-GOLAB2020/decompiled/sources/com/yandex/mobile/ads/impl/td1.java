package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jh1;
import com.yandex.mobile.ads.impl.m50;
import com.yandex.mobile.ads.impl.nn;
import com.yandex.mobile.ads.impl.wm;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class td1 implements Cloneable, wm.a {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f32310B = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h10 f32312a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cr f32313b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<uo0> f32314c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<uo0> f32315d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final m50.b f32316e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f32317f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC2164ph f32318g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f32319h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f32320i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ds f32321j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final f30 f32322k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ProxySelector f32323l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC2164ph f32324m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final SocketFactory f32325n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f32326o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    private final X509TrustManager f32327p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final List<er> f32328q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final List<gm1> f32329r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final sd1 f32330s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final on f32331t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    private final nn f32332u;

    /* renamed from: v, reason: collision with root package name */
    private final int f32333v;

    /* renamed from: w, reason: collision with root package name */
    private final int f32334w;

    /* renamed from: x, reason: collision with root package name */
    private final int f32335x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final qs1 f32336y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final List<gm1> f32311z = v82.a(gm1.f26231g, gm1.f26229e);

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private static final List<er> f32309A = v82.a(er.f25391e, er.f25392f);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private h10 f32337a = new h10();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private cr f32338b = new cr();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f32339c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f32340d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private m50.b f32341e = v82.a(m50.f28890a);

        /* renamed from: f, reason: collision with root package name */
        private boolean f32342f = true;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private InterfaceC2164ph f32343g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f32344h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f32345i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private ds f32346j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private f30 f32347k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private InterfaceC2164ph f32348l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private SocketFactory f32349m;

        /* renamed from: n, reason: collision with root package name */
        @Nullable
        private SSLSocketFactory f32350n;

        /* renamed from: o, reason: collision with root package name */
        @Nullable
        private X509TrustManager f32351o;

        /* renamed from: p, reason: collision with root package name */
        @NotNull
        private List<er> f32352p;

        /* renamed from: q, reason: collision with root package name */
        @NotNull
        private List<? extends gm1> f32353q;

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private sd1 f32354r;

        /* renamed from: s, reason: collision with root package name */
        @NotNull
        private on f32355s;

        /* renamed from: t, reason: collision with root package name */
        @Nullable
        private nn f32356t;

        /* renamed from: u, reason: collision with root package name */
        private int f32357u;

        /* renamed from: v, reason: collision with root package name */
        private int f32358v;

        /* renamed from: w, reason: collision with root package name */
        private int f32359w;

        public a() {
            InterfaceC2164ph interfaceC2164ph = InterfaceC2164ph.f30442a;
            this.f32343g = interfaceC2164ph;
            this.f32344h = true;
            this.f32345i = true;
            this.f32346j = ds.f24742a;
            this.f32347k = f30.f25600a;
            this.f32348l = interfaceC2164ph;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
            this.f32349m = socketFactory;
            int i4 = td1.f32310B;
            this.f32352p = b.a();
            this.f32353q = b.b();
            this.f32354r = sd1.f31696a;
            this.f32355s = on.f30105c;
            this.f32357u = 10000;
            this.f32358v = 10000;
            this.f32359w = 10000;
        }

        @NotNull
        public final a a(long j4, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f32357u = v82.a(j4, unit);
            return this;
        }

        @NotNull
        public final InterfaceC2164ph b() {
            return this.f32343g;
        }

        @Nullable
        public final nn c() {
            return this.f32356t;
        }

        @NotNull
        public final on d() {
            return this.f32355s;
        }

        public final int e() {
            return this.f32357u;
        }

        @NotNull
        public final cr f() {
            return this.f32338b;
        }

        @NotNull
        public final List<er> g() {
            return this.f32352p;
        }

        @NotNull
        public final ds h() {
            return this.f32346j;
        }

        @NotNull
        public final h10 i() {
            return this.f32337a;
        }

        @NotNull
        public final f30 j() {
            return this.f32347k;
        }

        @NotNull
        public final m50.b k() {
            return this.f32341e;
        }

        public final boolean l() {
            return this.f32344h;
        }

        public final boolean m() {
            return this.f32345i;
        }

        @NotNull
        public final sd1 n() {
            return this.f32354r;
        }

        @NotNull
        public final ArrayList o() {
            return this.f32339c;
        }

        @NotNull
        public final ArrayList p() {
            return this.f32340d;
        }

        @NotNull
        public final List<gm1> q() {
            return this.f32353q;
        }

        @NotNull
        public final InterfaceC2164ph r() {
            return this.f32348l;
        }

        public final int s() {
            return this.f32358v;
        }

        public final boolean t() {
            return this.f32342f;
        }

        @NotNull
        public final SocketFactory u() {
            return this.f32349m;
        }

        @Nullable
        public final SSLSocketFactory v() {
            return this.f32350n;
        }

        public final int w() {
            return this.f32359w;
        }

        @Nullable
        public final X509TrustManager x() {
            return this.f32351o;
        }

        @NotNull
        public final a b(long j4, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f32358v = v82.a(j4, unit);
            return this;
        }

        @NotNull
        public final a a() {
            this.f32344h = true;
            return this;
        }

        @NotNull
        public final a a(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (Intrinsics.areEqual(sslSocketFactory, this.f32350n)) {
                Intrinsics.areEqual(trustManager, this.f32351o);
            }
            this.f32350n = sslSocketFactory;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            this.f32356t = jh1.f27655a.a(trustManager);
            this.f32351o = trustManager;
            return this;
        }
    }

    public static final class b {
        @NotNull
        public static List a() {
            return td1.f32309A;
        }

        @NotNull
        public static List b() {
            return td1.f32311z;
        }
    }

    public td1() {
        this(new a());
    }

    private final void y() {
        List<uo0> list = this.f32314c;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f32314c).toString());
        }
        List<uo0> list2 = this.f32315d;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f32315d).toString());
        }
        List<er> list3 = this.f32328q;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((er) it.next()).a()) {
                    if (this.f32326o == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f32332u == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f32327p == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f32326o != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f32332u != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f32327p != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.f32331t, on.f30105c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // com.yandex.mobile.ads.impl.wm.a
    @NotNull
    public final tn1 a(@NotNull pp1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new tn1(this, request, false);
    }

    @NotNull
    public final InterfaceC2164ph c() {
        return this.f32318g;
    }

    @NotNull
    public final Object clone() {
        return super.clone();
    }

    @NotNull
    public final on d() {
        return this.f32331t;
    }

    public final int e() {
        return this.f32333v;
    }

    @NotNull
    public final cr f() {
        return this.f32313b;
    }

    @NotNull
    public final List<er> g() {
        return this.f32328q;
    }

    @NotNull
    public final ds h() {
        return this.f32321j;
    }

    @NotNull
    public final h10 i() {
        return this.f32312a;
    }

    @NotNull
    public final f30 j() {
        return this.f32322k;
    }

    @NotNull
    public final m50.b k() {
        return this.f32316e;
    }

    public final boolean l() {
        return this.f32319h;
    }

    public final boolean m() {
        return this.f32320i;
    }

    @NotNull
    public final qs1 n() {
        return this.f32336y;
    }

    @NotNull
    public final sd1 o() {
        return this.f32330s;
    }

    @NotNull
    public final List<uo0> p() {
        return this.f32314c;
    }

    @NotNull
    public final List<uo0> q() {
        return this.f32315d;
    }

    @NotNull
    public final List<gm1> r() {
        return this.f32329r;
    }

    @NotNull
    public final InterfaceC2164ph s() {
        return this.f32324m;
    }

    @NotNull
    public final ProxySelector t() {
        return this.f32323l;
    }

    public final int u() {
        return this.f32334w;
    }

    public final boolean v() {
        return this.f32317f;
    }

    @NotNull
    public final SocketFactory w() {
        return this.f32325n;
    }

    @NotNull
    public final SSLSocketFactory x() {
        SSLSocketFactory sSLSocketFactory = this.f32326o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int z() {
        return this.f32335x;
    }

    public td1(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f32312a = builder.i();
        this.f32313b = builder.f();
        this.f32314c = v82.b(builder.o());
        this.f32315d = v82.b(builder.p());
        this.f32316e = builder.k();
        this.f32317f = builder.t();
        this.f32318g = builder.b();
        this.f32319h = builder.l();
        this.f32320i = builder.m();
        this.f32321j = builder.h();
        this.f32322k = builder.j();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f32323l = proxySelector == null ? jd1.f27636a : proxySelector;
        this.f32324m = builder.r();
        this.f32325n = builder.u();
        List<er> g4 = builder.g();
        this.f32328q = g4;
        this.f32329r = builder.q();
        this.f32330s = builder.n();
        this.f32333v = builder.e();
        this.f32334w = builder.s();
        this.f32335x = builder.w();
        this.f32336y = new qs1();
        if (!(g4 instanceof Collection) || !g4.isEmpty()) {
            Iterator<T> it = g4.iterator();
            while (it.hasNext()) {
                if (((er) it.next()).a()) {
                    if (builder.v() != null) {
                        this.f32326o = builder.v();
                        nn c4 = builder.c();
                        Intrinsics.checkNotNull(c4);
                        this.f32332u = c4;
                        X509TrustManager x4 = builder.x();
                        Intrinsics.checkNotNull(x4);
                        this.f32327p = x4;
                        on d4 = builder.d();
                        Intrinsics.checkNotNull(c4);
                        this.f32331t = d4.a(c4);
                    } else {
                        int i4 = jh1.f27657c;
                        jh1.a.a().getClass();
                        X509TrustManager c5 = jh1.c();
                        this.f32327p = c5;
                        jh1 a4 = jh1.a.a();
                        Intrinsics.checkNotNull(c5);
                        a4.getClass();
                        this.f32326o = jh1.c(c5);
                        Intrinsics.checkNotNull(c5);
                        nn a5 = nn.a.a(c5);
                        this.f32332u = a5;
                        on d5 = builder.d();
                        Intrinsics.checkNotNull(a5);
                        this.f32331t = d5.a(a5);
                    }
                    y();
                }
            }
        }
        this.f32326o = null;
        this.f32332u = null;
        this.f32327p = null;
        this.f32331t = on.f30105c;
        y();
    }
}
