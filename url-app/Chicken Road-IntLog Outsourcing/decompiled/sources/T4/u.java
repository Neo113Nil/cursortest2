package T4;

import E.C0028c;
import a.AbstractC0169a;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: C, reason: collision with root package name */
    public static final List f2956C = U4.e.k(new v[]{v.f2989f, v.f2987d});

    /* renamed from: D, reason: collision with root package name */
    public static final List f2957D = U4.e.k(new i[]{i.f2880e, i.f2881f});

    /* renamed from: A, reason: collision with root package name */
    public final W4.d f2958A;

    /* renamed from: B, reason: collision with root package name */
    public final B1.g f2959B;

    /* renamed from: a, reason: collision with root package name */
    public final l f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2961b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2962c;

    /* renamed from: d, reason: collision with root package name */
    public final C0028c f2963d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2964e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2965f;

    /* renamed from: g, reason: collision with root package name */
    public final C0152b f2966g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2967h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2968i;

    /* renamed from: j, reason: collision with root package name */
    public final C0152b f2969j;

    /* renamed from: k, reason: collision with root package name */
    public final C0152b f2970k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2971l;

    /* renamed from: m, reason: collision with root package name */
    public final C0152b f2972m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2973n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2974o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2975p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2976q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2977r;

    /* renamed from: s, reason: collision with root package name */
    public final h5.c f2978s;

    /* renamed from: t, reason: collision with root package name */
    public final C0154d f2979t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0169a f2980u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2981v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2982w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2983x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2984y;
    public final V0.j z;

    /* JADX WARN: Removed duplicated region for block: B:14:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(t tVar) {
        List list;
        this.f2960a = tVar.f2934a;
        this.f2961b = U4.e.j(tVar.f2936c);
        this.f2962c = U4.e.j(tVar.f2937d);
        this.f2963d = tVar.f2938e;
        boolean z = tVar.f2939f;
        this.f2964e = z;
        boolean z5 = tVar.f2940g;
        this.f2965f = z5;
        this.f2966g = tVar.f2941h;
        this.f2967h = tVar.f2942i;
        this.f2968i = tVar.f2943j;
        this.f2969j = tVar.f2944k;
        this.f2970k = tVar.f2945l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2971l = proxySelector == null ? f5.a.f5692a : proxySelector;
        this.f2972m = tVar.f2946m;
        this.f2973n = tVar.f2947n;
        List list2 = tVar.f2948o;
        this.f2976q = list2;
        this.f2977r = tVar.f2949p;
        this.f2978s = tVar.f2950q;
        this.f2981v = tVar.f2952s;
        int i2 = tVar.f2953t;
        this.f2982w = i2;
        int i3 = tVar.f2954u;
        this.f2983x = i3;
        int i6 = tVar.f2955v;
        this.f2984y = i6;
        V0.j jVar = new V0.j(5);
        this.z = jVar;
        this.f2958A = W4.d.f3433l;
        B1.g gVar = tVar.f2935b;
        if (gVar == null) {
            B1.g gVar2 = new B1.g(i3, i6, i2, i3, z, z5, jVar);
            tVar.f2935b = gVar2;
            gVar = gVar2;
        }
        this.f2959B = gVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f2882a) {
                    d5.e eVar = d5.e.f5492a;
                    d5.e.f5492a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    kotlin.jvm.internal.i.b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            kotlin.jvm.internal.i.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f2975p = x509TrustManager;
                            d5.e eVar2 = d5.e.f5492a;
                            eVar2.getClass();
                            try {
                                SSLContext l2 = eVar2.l();
                                l2.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = l2.getSocketFactory();
                                kotlin.jvm.internal.i.d(socketFactory, "getSocketFactory(...)");
                                this.f2974o = socketFactory;
                                AbstractC0169a c2 = d5.e.f5492a.c(x509TrustManager);
                                this.f2980u = c2;
                                C0154d c0154d = tVar.f2951r;
                                c0154d.getClass();
                                this.f2979t = kotlin.jvm.internal.i.a(c0154d.f2846b, c2) ? c0154d : new C0154d(c0154d.f2845a, c2);
                                list = this.f2961b;
                                kotlin.jvm.internal.i.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (!list.contains(null)) {
                                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                                }
                                List list3 = this.f2962c;
                                kotlin.jvm.internal.i.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (list3.contains(null)) {
                                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                                }
                                X509TrustManager x509TrustManager2 = this.f2975p;
                                AbstractC0169a abstractC0169a = this.f2980u;
                                SSLSocketFactory sSLSocketFactory = this.f2974o;
                                List list4 = this.f2976q;
                                if (list4 == null || !list4.isEmpty()) {
                                    Iterator it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        if (((i) it2.next()).f2882a) {
                                            if (sSLSocketFactory == null) {
                                                throw new IllegalStateException("sslSocketFactory == null");
                                            }
                                            if (abstractC0169a == null) {
                                                throw new IllegalStateException("certificateChainCleaner == null");
                                            }
                                            if (x509TrustManager2 == null) {
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
                                if (x509TrustManager2 != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (!kotlin.jvm.internal.i.a(this.f2979t, C0154d.f2844c)) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                return;
                            } catch (GeneralSecurityException e3) {
                                throw new AssertionError("No System TLS: " + e3, e3);
                            }
                        }
                    }
                    String arrays = Arrays.toString(trustManagers);
                    kotlin.jvm.internal.i.d(arrays, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
                }
            }
        }
        this.f2974o = null;
        this.f2980u = null;
        this.f2975p = null;
        this.f2979t = C0154d.f2844c;
        list = this.f2961b;
        kotlin.jvm.internal.i.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }
}
