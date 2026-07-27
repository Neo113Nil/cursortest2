package m3;

import A.C0022s;
import f1.C0607a;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements Cloneable {

    /* renamed from: F, reason: collision with root package name */
    public static final List f8426F = n3.b.k(t.HTTP_2, t.HTTP_1_1);

    /* renamed from: G, reason: collision with root package name */
    public static final List f8427G = n3.b.k(h.f8365e, h.f8366f);

    /* renamed from: A, reason: collision with root package name */
    public final s f8428A;
    public final int B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8429C;

    /* renamed from: D, reason: collision with root package name */
    public final int f8430D;

    /* renamed from: E, reason: collision with root package name */
    public final C0607a f8431E;

    /* renamed from: d, reason: collision with root package name */
    public final Y0.b f8432d;

    /* renamed from: e, reason: collision with root package name */
    public final C0607a f8433e;

    /* renamed from: i, reason: collision with root package name */
    public final List f8434i;

    /* renamed from: j, reason: collision with root package name */
    public final List f8435j;

    /* renamed from: k, reason: collision with root package name */
    public final C0022s f8436k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8437l;

    /* renamed from: m, reason: collision with root package name */
    public final j f8438m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f8439n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8440o;

    /* renamed from: p, reason: collision with root package name */
    public final j f8441p;

    /* renamed from: q, reason: collision with root package name */
    public final j f8442q;

    /* renamed from: r, reason: collision with root package name */
    public final ProxySelector f8443r;

    /* renamed from: s, reason: collision with root package name */
    public final j f8444s;

    /* renamed from: t, reason: collision with root package name */
    public final SocketFactory f8445t;

    /* renamed from: u, reason: collision with root package name */
    public final SSLSocketFactory f8446u;

    /* renamed from: v, reason: collision with root package name */
    public final X509TrustManager f8447v;

    /* renamed from: w, reason: collision with root package name */
    public final List f8448w;

    /* renamed from: x, reason: collision with root package name */
    public final List f8449x;

    /* renamed from: y, reason: collision with root package name */
    public final y3.c f8450y;

    /* renamed from: z, reason: collision with root package name */
    public final d f8451z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(q builder) {
        List list;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f8432d = builder.f8406a;
        this.f8433e = builder.f8407b;
        this.f8434i = n3.b.w(builder.f8408c);
        this.f8435j = n3.b.w(builder.f8409d);
        this.f8436k = builder.f8410e;
        this.f8437l = builder.f8411f;
        this.f8438m = builder.f8412g;
        this.f8439n = builder.f8413h;
        this.f8440o = builder.f8414i;
        this.f8441p = builder.f8415j;
        this.f8442q = builder.f8416k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f8443r = proxySelector == null ? w3.a.f11389a : proxySelector;
        this.f8444s = builder.f8417l;
        this.f8445t = builder.f8418m;
        List list2 = builder.f8419n;
        this.f8448w = list2;
        this.f8449x = builder.f8420o;
        this.f8450y = builder.f8421p;
        this.B = builder.f8423r;
        this.f8429C = builder.f8424s;
        this.f8430D = builder.f8425t;
        this.f8431E = new C0607a(15);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f8367a) {
                    u3.n nVar = u3.n.f10964a;
                    X509TrustManager trustManager = u3.n.f10964a.m();
                    this.f8447v = trustManager;
                    this.f8446u = u3.n.f10964a.l(trustManager);
                    Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                    s certificateChainCleaner = u3.n.f10964a.b(trustManager);
                    this.f8428A = certificateChainCleaner;
                    d dVar = builder.f8422q;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                    this.f8451z = Intrinsics.a(dVar.f8340b, certificateChainCleaner) ? dVar : new d(dVar.f8339a, certificateChainCleaner);
                    list = this.f8434i;
                    Intrinsics.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f8435j;
                    Intrinsics.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f8447v;
                    s sVar = this.f8428A;
                    SSLSocketFactory sSLSocketFactory = this.f8446u;
                    List list4 = this.f8448w;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f8367a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (sVar == null) {
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
                    if (sVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Intrinsics.a(this.f8451z, d.f8338c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f8446u = null;
        this.f8428A = null;
        this.f8447v = null;
        this.f8451z = d.f8338c;
        list = this.f8434i;
        Intrinsics.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
