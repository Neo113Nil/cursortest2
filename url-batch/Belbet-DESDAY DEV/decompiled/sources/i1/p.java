package i1;

import K.C0007g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0242k;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public static final List f2477A = j1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: B, reason: collision with root package name */
    public static final List f2478B = j1.b.j(h.f2427e, h.f2428f);

    /* renamed from: a, reason: collision with root package name */
    public final T.t f2479a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2480b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2481c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2482e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2483f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2484g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2485j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2486k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2487l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2488m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2489n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2490o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2491p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2492q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2493r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2494s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2495t;

    /* renamed from: u, reason: collision with root package name */
    public final q f2496u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2497v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2498w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2499x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2500y;

    /* renamed from: z, reason: collision with root package name */
    public final C0242k f2501z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f2479a = oVar.f2459a;
        this.f2480b = oVar.f2460b;
        this.f2481c = j1.b.u(oVar.f2461c);
        this.d = j1.b.u(oVar.d);
        this.f2482e = oVar.f2462e;
        this.f2483f = oVar.f2463f;
        this.f2484g = oVar.f2464g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f2485j = oVar.f2465j;
        this.f2486k = oVar.f2466k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2487l = proxySelector == null ? s1.a.f3758a : proxySelector;
        this.f2488m = oVar.f2467l;
        this.f2489n = oVar.f2468m;
        List list2 = oVar.f2469n;
        this.f2492q = list2;
        this.f2493r = oVar.f2470o;
        this.f2494s = oVar.f2471p;
        this.f2497v = oVar.f2473r;
        this.f2498w = oVar.f2474s;
        this.f2499x = oVar.f2475t;
        this.f2500y = oVar.f2476u;
        this.f2501z = new C0242k();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2429a) {
                    q1.n nVar = q1.n.f3572a;
                    X509TrustManager m2 = q1.n.f3572a.m();
                    this.f2491p = m2;
                    this.f2490o = q1.n.f3572a.l(m2);
                    q b2 = q1.n.f3572a.b(m2);
                    this.f2496u = b2;
                    d dVar = oVar.f2472q;
                    this.f2495t = X0.d.a(dVar.f2406b, b2) ? dVar : new d(dVar.f2405a, b2);
                    list = this.f2481c;
                    X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    X0.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2491p;
                    q qVar = this.f2496u;
                    SSLSocketFactory sSLSocketFactory = this.f2490o;
                    List list4 = this.f2492q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2429a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (qVar == null) {
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
                    if (qVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!X0.d.a(this.f2495t, d.f2404c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2490o = null;
        this.f2496u = null;
        this.f2491p = null;
        this.f2495t = d.f2404c;
        list = this.f2481c;
        X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
