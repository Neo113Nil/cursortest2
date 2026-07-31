package G2;

import B.Y;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class r implements Cloneable {
    public static final List C = H2.b.k(s.f2276h, s.f2274f);
    public static final List D = H2.b.k(h.f2180e, h.f2181f);

    /* renamed from: A, reason: collision with root package name */
    public final int f2248A;

    /* renamed from: B, reason: collision with root package name */
    public final Y f2249B;

    /* renamed from: d, reason: collision with root package name */
    public final G1.g f2250d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f2251e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2252f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2253g;

    /* renamed from: h, reason: collision with root package name */
    public final B.r f2254h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2255i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2256j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2257k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2258l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2259m;

    /* renamed from: n, reason: collision with root package name */
    public final b f2260n;

    /* renamed from: o, reason: collision with root package name */
    public final ProxySelector f2261o;

    /* renamed from: p, reason: collision with root package name */
    public final b f2262p;

    /* renamed from: q, reason: collision with root package name */
    public final SocketFactory f2263q;

    /* renamed from: r, reason: collision with root package name */
    public final SSLSocketFactory f2264r;

    /* renamed from: s, reason: collision with root package name */
    public final X509TrustManager f2265s;

    /* renamed from: t, reason: collision with root package name */
    public final List f2266t;

    /* renamed from: u, reason: collision with root package name */
    public final List f2267u;

    /* renamed from: v, reason: collision with root package name */
    public final S2.c f2268v;

    /* renamed from: w, reason: collision with root package name */
    public final d f2269w;

    /* renamed from: x, reason: collision with root package name */
    public final l0.c f2270x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2271y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2272z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(q qVar) {
        List list;
        this.f2250d = qVar.f2228a;
        this.f2251e = qVar.f2229b;
        this.f2252f = H2.b.w(qVar.f2230c);
        this.f2253g = H2.b.w(qVar.f2231d);
        this.f2254h = qVar.f2232e;
        this.f2255i = qVar.f2233f;
        this.f2256j = qVar.f2234g;
        this.f2257k = qVar.f2235h;
        this.f2258l = qVar.f2236i;
        this.f2259m = qVar.f2237j;
        this.f2260n = qVar.f2238k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2261o = proxySelector == null ? Q2.a.f3995a : proxySelector;
        this.f2262p = qVar.f2239l;
        this.f2263q = qVar.f2240m;
        List list2 = qVar.f2241n;
        this.f2266t = list2;
        this.f2267u = qVar.f2242o;
        this.f2268v = qVar.f2243p;
        this.f2271y = qVar.f2245r;
        this.f2272z = qVar.f2246s;
        this.f2248A = qVar.f2247t;
        this.f2249B = new Y(14);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2182a) {
                    O2.n nVar = O2.n.f3910a;
                    X509TrustManager m3 = O2.n.f3910a.m();
                    this.f2265s = m3;
                    this.f2264r = O2.n.f3910a.l(m3);
                    l0.c b3 = O2.n.f3910a.b(m3);
                    this.f2270x = b3;
                    d dVar = qVar.f2244q;
                    this.f2269w = f2.j.a(dVar.f2155b, b3) ? dVar : new d(dVar.f2154a, b3);
                    list = this.f2252f;
                    f2.j.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f2253g;
                    f2.j.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2265s;
                    l0.c cVar = this.f2270x;
                    SSLSocketFactory sSLSocketFactory = this.f2264r;
                    List list4 = this.f2266t;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2182a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (cVar == null) {
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
                    if (cVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!f2.j.a(this.f2269w, d.f2153c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2264r = null;
        this.f2270x = null;
        this.f2265s = null;
        this.f2269w = d.f2153c;
        list = this.f2252f;
        f2.j.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
