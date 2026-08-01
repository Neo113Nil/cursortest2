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
    public static final List f2476A = j1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: B, reason: collision with root package name */
    public static final List f2477B = j1.b.j(h.f2426e, h.f2427f);

    /* renamed from: a, reason: collision with root package name */
    public final T.t f2478a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2479b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2480c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2481e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2482f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2483g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2484j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2485k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2486l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2487m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2488n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2489o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2490p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2491q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2492r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2493s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2494t;

    /* renamed from: u, reason: collision with root package name */
    public final q f2495u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2496v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2497w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2498x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2499y;

    /* renamed from: z, reason: collision with root package name */
    public final C0242k f2500z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f2478a = oVar.f2458a;
        this.f2479b = oVar.f2459b;
        this.f2480c = j1.b.u(oVar.f2460c);
        this.d = j1.b.u(oVar.d);
        this.f2481e = oVar.f2461e;
        this.f2482f = oVar.f2462f;
        this.f2483g = oVar.f2463g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f2484j = oVar.f2464j;
        this.f2485k = oVar.f2465k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2486l = proxySelector == null ? s1.a.f3757a : proxySelector;
        this.f2487m = oVar.f2466l;
        this.f2488n = oVar.f2467m;
        List list2 = oVar.f2468n;
        this.f2491q = list2;
        this.f2492r = oVar.f2469o;
        this.f2493s = oVar.f2470p;
        this.f2496v = oVar.f2472r;
        this.f2497w = oVar.f2473s;
        this.f2498x = oVar.f2474t;
        this.f2499y = oVar.f2475u;
        this.f2500z = new C0242k();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2428a) {
                    q1.n nVar = q1.n.f3571a;
                    X509TrustManager m2 = q1.n.f3571a.m();
                    this.f2490p = m2;
                    this.f2489o = q1.n.f3571a.l(m2);
                    q b2 = q1.n.f3571a.b(m2);
                    this.f2495u = b2;
                    d dVar = oVar.f2471q;
                    this.f2494t = X0.d.a(dVar.f2405b, b2) ? dVar : new d(dVar.f2404a, b2);
                    list = this.f2480c;
                    X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    X0.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2490p;
                    q qVar = this.f2495u;
                    SSLSocketFactory sSLSocketFactory = this.f2489o;
                    List list4 = this.f2491q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2428a) {
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
                    if (!X0.d.a(this.f2494t, d.f2403c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2489o = null;
        this.f2495u = null;
        this.f2490p = null;
        this.f2494t = d.f2403c;
        list = this.f2480c;
        X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
