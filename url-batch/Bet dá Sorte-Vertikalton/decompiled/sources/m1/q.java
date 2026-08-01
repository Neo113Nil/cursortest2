package m1;

import K.C0006g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k0.z;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.u f3244a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3245b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3246c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0006g f3247e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3248f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3249g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3250j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3251k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3252l;

    /* renamed from: m, reason: collision with root package name */
    public final b f3253m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3254n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3255o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3256p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3257q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3258r;

    /* renamed from: s, reason: collision with root package name */
    public final y1.c f3259s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3260t;

    /* renamed from: u, reason: collision with root package name */
    public final z f3261u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3262v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3263w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3264x;

    /* renamed from: y, reason: collision with root package name */
    public final g f3265y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f3243z = n1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f3242A = n1.b.j(h.f3190e, h.f3191f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(p pVar) {
        List list;
        this.f3244a = pVar.f3225a;
        this.f3245b = pVar.f3226b;
        this.f3246c = n1.b.v(pVar.f3227c);
        this.d = n1.b.v(pVar.d);
        this.f3247e = pVar.f3228e;
        this.f3248f = pVar.f3229f;
        this.f3249g = pVar.f3230g;
        this.h = pVar.h;
        this.i = pVar.i;
        this.f3250j = pVar.f3231j;
        this.f3251k = pVar.f3232k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3252l = proxySelector == null ? w1.a.f4182a : proxySelector;
        this.f3253m = pVar.f3233l;
        this.f3254n = pVar.f3234m;
        List list2 = pVar.f3235n;
        this.f3257q = list2;
        this.f3258r = pVar.f3236o;
        this.f3259s = pVar.f3237p;
        this.f3262v = pVar.f3239r;
        this.f3263w = pVar.f3240s;
        this.f3264x = pVar.f3241t;
        this.f3265y = new g(3);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f3192a) {
                    u1.n nVar = u1.n.f3966a;
                    X509TrustManager m2 = u1.n.f3966a.m();
                    this.f3256p = m2;
                    this.f3255o = u1.n.f3966a.l(m2);
                    z b2 = u1.n.f3966a.b(m2);
                    this.f3261u = b2;
                    d dVar = pVar.f3238q;
                    this.f3260t = b1.d.a(dVar.f3171b, b2) ? dVar : new d(dVar.f3170a, b2);
                    list = this.f3246c;
                    b1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    b1.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f3256p;
                    z zVar = this.f3261u;
                    SSLSocketFactory sSLSocketFactory = this.f3255o;
                    List list4 = this.f3257q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f3192a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (zVar == null) {
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
                    if (zVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!b1.d.a(this.f3260t, d.f3169c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3255o = null;
        this.f3261u = null;
        this.f3256p = null;
        this.f3260t = d.f3169c;
        list = this.f3246c;
        b1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
