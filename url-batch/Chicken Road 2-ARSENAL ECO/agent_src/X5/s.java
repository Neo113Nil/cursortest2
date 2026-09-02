package X5;

import a1.AbstractC0223a;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: C, reason: collision with root package name */
    public static final List f3007C = Y5.e.j(new t[]{t.f3040k, t.f3038i});

    /* renamed from: D, reason: collision with root package name */
    public static final List f3008D = Y5.e.j(new i[]{i.f2940e, i.f2941f});

    /* renamed from: A, reason: collision with root package name */
    public final a6.e f3009A;

    /* renamed from: B, reason: collision with root package name */
    public final V5.g f3010B;

    /* renamed from: a, reason: collision with root package name */
    public final k f3011a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3012b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3013c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.g f3014d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3015e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3016f;

    /* renamed from: g, reason: collision with root package name */
    public final C0218b f3017g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3018h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3019i;

    /* renamed from: j, reason: collision with root package name */
    public final C0218b f3020j;

    /* renamed from: k, reason: collision with root package name */
    public final C0218b f3021k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3022l;

    /* renamed from: m, reason: collision with root package name */
    public final C0218b f3023m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3024n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3025o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3026p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3027q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3028r;

    /* renamed from: s, reason: collision with root package name */
    public final l6.c f3029s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3030t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0223a f3031u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3032v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3033w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3034x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final a6.d f3035z;

    /* JADX WARN: Removed duplicated region for block: B:14:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(r rVar) {
        List list;
        this.f3011a = rVar.f2985a;
        this.f3012b = Y5.e.i(rVar.f2987c);
        this.f3013c = Y5.e.i(rVar.f2988d);
        this.f3014d = rVar.f2989e;
        boolean z5 = rVar.f2990f;
        this.f3015e = z5;
        boolean z6 = rVar.f2991g;
        this.f3016f = z6;
        this.f3017g = rVar.f2992h;
        this.f3018h = rVar.f2993i;
        this.f3019i = rVar.f2994j;
        this.f3020j = rVar.f2995k;
        this.f3021k = rVar.f2996l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3022l = proxySelector == null ? j6.a.f4893a : proxySelector;
        this.f3023m = rVar.f2997m;
        this.f3024n = rVar.f2998n;
        List list2 = rVar.f2999o;
        this.f3027q = list2;
        this.f3028r = rVar.f3000p;
        this.f3029s = rVar.f3001q;
        this.f3032v = rVar.f3003s;
        int i7 = rVar.f3004t;
        this.f3033w = i7;
        int i8 = rVar.f3005u;
        this.f3034x = i8;
        int i9 = rVar.f3006v;
        this.y = i9;
        a6.d dVar = new a6.d();
        dVar.f3172f = new LinkedHashSet();
        this.f3035z = dVar;
        this.f3009A = a6.e.f3174l;
        V5.g gVar = rVar.f2986b;
        if (gVar == null) {
            gVar = new V5.g(i8, i9, i7, i8, z5, z6, dVar);
            rVar.f2986b = gVar;
        }
        this.f3010B = gVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f2942a) {
                    h6.e eVar = h6.e.f4355a;
                    h6.e.f4355a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    kotlin.jvm.internal.i.b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            kotlin.jvm.internal.i.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f3026p = x509TrustManager;
                            h6.e eVar2 = h6.e.f4355a;
                            eVar2.getClass();
                            try {
                                SSLContext l7 = eVar2.l();
                                l7.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = l7.getSocketFactory();
                                kotlin.jvm.internal.i.d(socketFactory, "getSocketFactory(...)");
                                this.f3025o = socketFactory;
                                AbstractC0223a c7 = h6.e.f4355a.c(x509TrustManager);
                                this.f3031u = c7;
                                d dVar2 = rVar.f3002r;
                                dVar2.getClass();
                                this.f3030t = kotlin.jvm.internal.i.a(dVar2.f2907b, c7) ? dVar2 : new d(dVar2.f2906a, c7);
                                X509TrustManager x509TrustManager2 = this.f3026p;
                                AbstractC0223a abstractC0223a = this.f3031u;
                                SSLSocketFactory sSLSocketFactory = this.f3025o;
                                List list3 = this.f3013c;
                                list = this.f3012b;
                                kotlin.jvm.internal.i.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (!list.contains(null)) {
                                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                                }
                                kotlin.jvm.internal.i.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (list3.contains(null)) {
                                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                                }
                                List list4 = this.f3027q;
                                if (list4 == null || !list4.isEmpty()) {
                                    Iterator it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        if (((i) it2.next()).f2942a) {
                                            if (sSLSocketFactory == null) {
                                                throw new IllegalStateException("sslSocketFactory == null");
                                            }
                                            if (abstractC0223a == null) {
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
                                if (abstractC0223a != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (x509TrustManager2 != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (!kotlin.jvm.internal.i.a(this.f3030t, d.f2905c)) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                return;
                            } catch (GeneralSecurityException e4) {
                                throw new AssertionError("No System TLS: " + e4, e4);
                            }
                        }
                    }
                    String arrays = Arrays.toString(trustManagers);
                    kotlin.jvm.internal.i.d(arrays, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
                }
            }
        }
        this.f3025o = null;
        this.f3031u = null;
        this.f3026p = null;
        this.f3030t = d.f2905c;
        X509TrustManager x509TrustManager22 = this.f3026p;
        AbstractC0223a abstractC0223a2 = this.f3031u;
        SSLSocketFactory sSLSocketFactory2 = this.f3025o;
        List list32 = this.f3013c;
        list = this.f3012b;
        kotlin.jvm.internal.i.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }
}
