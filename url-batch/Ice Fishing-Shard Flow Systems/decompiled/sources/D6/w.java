package D6;

import a.AbstractC0169a;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: C, reason: collision with root package name */
    public static final List f594C;

    /* renamed from: D, reason: collision with root package name */
    public static final List f595D;

    /* renamed from: A, reason: collision with root package name */
    public final G6.d f596A;

    /* renamed from: B, reason: collision with root package name */
    public final B.f f597B;

    /* renamed from: a, reason: collision with root package name */
    public final n f598a;

    /* renamed from: b, reason: collision with root package name */
    public final List f599b;

    /* renamed from: c, reason: collision with root package name */
    public final List f600c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.c f601d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f602e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f603f;

    /* renamed from: g, reason: collision with root package name */
    public final l f604g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f605h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f606i;
    public final l j;

    /* renamed from: k, reason: collision with root package name */
    public final l f607k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f608l;

    /* renamed from: m, reason: collision with root package name */
    public final l f609m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f610n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f611o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f612p;

    /* renamed from: q, reason: collision with root package name */
    public final List f613q;

    /* renamed from: r, reason: collision with root package name */
    public final List f614r;

    /* renamed from: s, reason: collision with root package name */
    public final R6.c f615s;

    /* renamed from: t, reason: collision with root package name */
    public final C0097e f616t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0169a f617u;

    /* renamed from: v, reason: collision with root package name */
    public final int f618v;

    /* renamed from: w, reason: collision with root package name */
    public final int f619w;

    /* renamed from: x, reason: collision with root package name */
    public final int f620x;

    /* renamed from: y, reason: collision with root package name */
    public final int f621y;

    /* renamed from: z, reason: collision with root package name */
    public final l2.c f622z;

    static {
        x[] elements = {x.f627n, x.f625l};
        TimeZone timeZone = E6.e.f712a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        f594C = E6.e.j(elements);
        j[] elements2 = {j.f517e, j.f518f};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f595D = E6.e.j(elements2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(v builder) {
        List list;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f598a = builder.f573a;
        this.f599b = E6.e.i(builder.f575c);
        this.f600c = E6.e.i(builder.f576d);
        this.f601d = builder.f577e;
        boolean z7 = builder.f578f;
        this.f602e = z7;
        boolean z8 = builder.f579g;
        this.f603f = z8;
        this.f604g = builder.f580h;
        this.f605h = builder.f581i;
        this.f606i = builder.j;
        this.j = builder.f582k;
        this.f607k = builder.f583l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f608l = proxySelector == null ? P6.a.f2290a : proxySelector;
        this.f609m = builder.f584m;
        this.f610n = builder.f585n;
        List list2 = builder.f586o;
        this.f613q = list2;
        this.f614r = builder.f587p;
        this.f615s = builder.f588q;
        this.f618v = builder.f590s;
        int i2 = builder.f591t;
        this.f619w = i2;
        int i5 = builder.f592u;
        this.f620x = i5;
        int i7 = builder.f593v;
        this.f621y = i7;
        l2.c cVar = new l2.c(6);
        this.f622z = cVar;
        this.f596A = G6.d.f859l;
        B.f fVar = builder.f574b;
        if (fVar == null) {
            fVar = new B.f(i5, i7, i2, i5, z7, z8, cVar);
            builder.f574b = fVar;
        }
        this.f597B = fVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).f519a) {
                    N6.e eVar = N6.e.f1879a;
                    N6.e.f1879a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    Intrinsics.b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            Intrinsics.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                            X509TrustManager trustManager2 = (X509TrustManager) trustManager;
                            this.f612p = trustManager2;
                            N6.e eVar2 = N6.e.f1879a;
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(trustManager2, "trustManager");
                            try {
                                SSLContext l7 = eVar2.l();
                                l7.init(null, new TrustManager[]{trustManager2}, null);
                                SSLSocketFactory socketFactory = l7.getSocketFactory();
                                Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
                                this.f611o = socketFactory;
                                Intrinsics.checkNotNullParameter(trustManager2, "trustManager");
                                AbstractC0169a certificateChainCleaner = N6.e.f1879a.c(trustManager2);
                                this.f617u = certificateChainCleaner;
                                C0097e c0097e = builder.f589r;
                                c0097e.getClass();
                                Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                                this.f616t = Intrinsics.a(c0097e.f485b, certificateChainCleaner) ? c0097e : new C0097e(c0097e.f484a, certificateChainCleaner);
                                X509TrustManager x509TrustManager = this.f612p;
                                AbstractC0169a abstractC0169a = this.f617u;
                                SSLSocketFactory sSLSocketFactory = this.f611o;
                                List list3 = this.f600c;
                                list = this.f599b;
                                Intrinsics.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (!list.contains(null)) {
                                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                                }
                                Intrinsics.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (list3.contains(null)) {
                                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                                }
                                List list4 = this.f613q;
                                if (list4 == null || !list4.isEmpty()) {
                                    Iterator it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        if (((j) it2.next()).f519a) {
                                            if (sSLSocketFactory == null) {
                                                throw new IllegalStateException("sslSocketFactory == null");
                                            }
                                            if (abstractC0169a == null) {
                                                throw new IllegalStateException("certificateChainCleaner == null");
                                            }
                                            if (x509TrustManager == null) {
                                                throw new IllegalStateException("x509TrustManager == null");
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (sSLSocketFactory != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (abstractC0169a != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (x509TrustManager != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (!Intrinsics.a(this.f616t, C0097e.f483c)) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                Unit unit = Unit.f6114a;
                                return;
                            } catch (GeneralSecurityException e7) {
                                throw new AssertionError("No System TLS: " + e7, e7);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
                    String arrays = Arrays.toString(trustManagers);
                    Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                    sb.append(arrays);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }
        this.f611o = null;
        this.f617u = null;
        this.f612p = null;
        this.f616t = C0097e.f483c;
        X509TrustManager x509TrustManager2 = this.f612p;
        AbstractC0169a abstractC0169a2 = this.f617u;
        SSLSocketFactory sSLSocketFactory2 = this.f611o;
        List list32 = this.f600c;
        list = this.f599b;
        Intrinsics.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }
}
