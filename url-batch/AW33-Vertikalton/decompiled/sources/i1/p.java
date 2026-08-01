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

    /* renamed from: a, reason: collision with root package name */
    public final T.t f2475a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2476b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2477c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2478e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2479f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2480g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2481j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2482k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2483l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2484m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2485n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2486o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2487p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2488q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2489r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2490s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2491t;

    /* renamed from: u, reason: collision with root package name */
    public final q f2492u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2493v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2494w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2495x;

    /* renamed from: y, reason: collision with root package name */
    public final C0242k f2496y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2474z = j1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2473A = j1.b.j(h.f2424e, h.f2425f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f2475a = oVar.f2456a;
        this.f2476b = oVar.f2457b;
        this.f2477c = j1.b.u(oVar.f2458c);
        this.d = j1.b.u(oVar.d);
        this.f2478e = oVar.f2459e;
        this.f2479f = oVar.f2460f;
        this.f2480g = oVar.f2461g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f2481j = oVar.f2462j;
        this.f2482k = oVar.f2463k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2483l = proxySelector == null ? s1.a.f3753a : proxySelector;
        this.f2484m = oVar.f2464l;
        this.f2485n = oVar.f2465m;
        List list2 = oVar.f2466n;
        this.f2488q = list2;
        this.f2489r = oVar.f2467o;
        this.f2490s = oVar.f2468p;
        this.f2493v = oVar.f2470r;
        this.f2494w = oVar.f2471s;
        this.f2495x = oVar.f2472t;
        this.f2496y = new C0242k();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2426a) {
                    q1.n nVar = q1.n.f3567a;
                    X509TrustManager m2 = q1.n.f3567a.m();
                    this.f2487p = m2;
                    this.f2486o = q1.n.f3567a.l(m2);
                    q b2 = q1.n.f3567a.b(m2);
                    this.f2492u = b2;
                    d dVar = oVar.f2469q;
                    this.f2491t = X0.e.a(dVar.f2403b, b2) ? dVar : new d(dVar.f2402a, b2);
                    list = this.f2477c;
                    X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    X0.e.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2487p;
                    q qVar = this.f2492u;
                    SSLSocketFactory sSLSocketFactory = this.f2486o;
                    List list4 = this.f2488q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2426a) {
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
                    if (!X0.e.a(this.f2491t, d.f2401c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2486o = null;
        this.f2492u = null;
        this.f2487p = null;
        this.f2491t = d.f2401c;
        list = this.f2477c;
        X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
