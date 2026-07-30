package e8;

import com.google.android.gms.internal.ads.C3112dq;
import g1.C4523c;
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

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: C, reason: collision with root package name */
    public static final List f37469C = f8.d.k(new t[]{t.f37505y, t.f37503w});

    /* renamed from: D, reason: collision with root package name */
    public static final List f37470D = f8.d.k(new i[]{i.f37403e, i.f37404f});

    /* renamed from: A, reason: collision with root package name */
    public final h8.e f37471A;

    /* renamed from: B, reason: collision with root package name */
    public final h4.c f37472B;

    /* renamed from: a, reason: collision with root package name */
    public final C3112dq f37473a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37474b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37475c;

    /* renamed from: d, reason: collision with root package name */
    public final com.anythink.core.common.n.b.A f37476d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37477e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37478f;

    /* renamed from: g, reason: collision with root package name */
    public final C4484b f37479g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37480h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C4484b f37481j;

    /* renamed from: k, reason: collision with root package name */
    public final C4484b f37482k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f37483l;

    /* renamed from: m, reason: collision with root package name */
    public final C4484b f37484m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f37485n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f37486o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f37487p;

    /* renamed from: q, reason: collision with root package name */
    public final List f37488q;

    /* renamed from: r, reason: collision with root package name */
    public final List f37489r;

    /* renamed from: s, reason: collision with root package name */
    public final s8.c f37490s;

    /* renamed from: t, reason: collision with root package name */
    public final d f37491t;

    /* renamed from: u, reason: collision with root package name */
    public final com.bumptech.glide.d f37492u;

    /* renamed from: v, reason: collision with root package name */
    public final int f37493v;

    /* renamed from: w, reason: collision with root package name */
    public final int f37494w;

    /* renamed from: x, reason: collision with root package name */
    public final int f37495x;

    /* renamed from: y, reason: collision with root package name */
    public final int f37496y;

    /* renamed from: z, reason: collision with root package name */
    public final C4523c f37497z;

    /* JADX WARN: Removed duplicated region for block: B:14:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(r rVar) {
        List list;
        this.f37473a = rVar.f37448a;
        this.f37474b = f8.d.j(rVar.f37450c);
        this.f37475c = f8.d.j(rVar.f37451d);
        this.f37476d = rVar.f37452e;
        boolean z8 = rVar.f37453f;
        this.f37477e = z8;
        boolean z9 = rVar.f37454g;
        this.f37478f = z9;
        this.f37479g = rVar.f37455h;
        this.f37480h = rVar.i;
        this.i = rVar.f37456j;
        this.f37481j = rVar.f37457k;
        this.f37482k = rVar.f37458l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f37483l = proxySelector == null ? q8.a.f40186a : proxySelector;
        this.f37484m = rVar.f37459m;
        this.f37485n = rVar.f37460n;
        List list2 = rVar.f37461o;
        this.f37488q = list2;
        this.f37489r = rVar.f37462p;
        this.f37490s = rVar.f37463q;
        this.f37493v = rVar.f37465s;
        int i = rVar.f37466t;
        this.f37494w = i;
        int i4 = rVar.f37467u;
        this.f37495x = i4;
        int i9 = rVar.f37468v;
        this.f37496y = i9;
        C4523c c4523c = new C4523c();
        this.f37497z = c4523c;
        this.f37471A = h8.e.f38263l;
        h4.c cVar = rVar.f37449b;
        if (cVar == null) {
            cVar = new h4.c(i4, i9, i, i4, z8, z9, c4523c);
            rVar.f37449b = cVar;
        }
        this.f37472B = cVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f37405a) {
                    o8.f fVar = o8.f.f39739a;
                    o8.f.f39739a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    kotlin.jvm.internal.h.b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            kotlin.jvm.internal.h.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f37487p = x509TrustManager;
                            o8.f fVar2 = o8.f.f39739a;
                            fVar2.getClass();
                            try {
                                SSLContext l9 = fVar2.l();
                                l9.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = l9.getSocketFactory();
                                kotlin.jvm.internal.h.d(socketFactory, "getSocketFactory(...)");
                                this.f37486o = socketFactory;
                                com.bumptech.glide.d c4 = o8.f.f39739a.c(x509TrustManager);
                                this.f37492u = c4;
                                d dVar = rVar.f37464r;
                                dVar.getClass();
                                this.f37491t = kotlin.jvm.internal.h.a(dVar.f37371b, c4) ? dVar : new d(dVar.f37370a, c4);
                                list = this.f37474b;
                                kotlin.jvm.internal.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (!list.contains(null)) {
                                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                                }
                                List list3 = this.f37475c;
                                kotlin.jvm.internal.h.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (list3.contains(null)) {
                                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                                }
                                X509TrustManager x509TrustManager2 = this.f37487p;
                                com.bumptech.glide.d dVar2 = this.f37492u;
                                SSLSocketFactory sSLSocketFactory = this.f37486o;
                                List list4 = this.f37488q;
                                if (list4 == null || !list4.isEmpty()) {
                                    Iterator it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        if (((i) it2.next()).f37405a) {
                                            if (sSLSocketFactory == null) {
                                                throw new IllegalStateException("sslSocketFactory == null");
                                            }
                                            if (dVar2 == null) {
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
                                if (dVar2 != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (x509TrustManager2 != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (!kotlin.jvm.internal.h.a(this.f37491t, d.f37369c)) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                return;
                            } catch (GeneralSecurityException e6) {
                                throw new AssertionError("No System TLS: " + e6, e6);
                            }
                        }
                    }
                    String arrays = Arrays.toString(trustManagers);
                    kotlin.jvm.internal.h.d(arrays, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
                }
            }
        }
        this.f37486o = null;
        this.f37492u = null;
        this.f37487p = null;
        this.f37491t = d.f37369c;
        list = this.f37474b;
        kotlin.jvm.internal.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }
}
