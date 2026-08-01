package i1;

import K.C0011g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.v f2750a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2751b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2752c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2753d;

    /* renamed from: e, reason: collision with root package name */
    public final C0011g f2754e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2755f;

    /* renamed from: g, reason: collision with root package name */
    public final C0168b f2756g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C0168b f2757j;

    /* renamed from: k, reason: collision with root package name */
    public final C0168b f2758k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2759l;

    /* renamed from: m, reason: collision with root package name */
    public final C0168b f2760m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2761n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2762o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2763p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2764q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2765r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2766s;

    /* renamed from: t, reason: collision with root package name */
    public final f f2767t;

    /* renamed from: u, reason: collision with root package name */
    public final m f2768u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2769v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2770w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2771x;

    /* renamed from: y, reason: collision with root package name */
    public final l1.d f2772y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2749z = j1.b.j(v.HTTP_2, v.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2748A = j1.b.j(j.f2685e, j.f2686f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(t tVar) {
        List list;
        this.f2750a = tVar.f2730a;
        this.f2751b = tVar.f2731b;
        this.f2752c = j1.b.v(tVar.f2732c);
        this.f2753d = j1.b.v(tVar.f2733d);
        this.f2754e = tVar.f2734e;
        this.f2755f = tVar.f2735f;
        this.f2756g = tVar.f2736g;
        this.h = tVar.h;
        this.i = tVar.i;
        this.f2757j = tVar.f2737j;
        this.f2758k = tVar.f2738k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2759l = proxySelector == null ? s1.a.f4154a : proxySelector;
        this.f2760m = tVar.f2739l;
        this.f2761n = tVar.f2740m;
        List list2 = tVar.f2741n;
        this.f2764q = list2;
        this.f2765r = tVar.f2742o;
        this.f2766s = tVar.f2743p;
        this.f2769v = tVar.f2745r;
        this.f2770w = tVar.f2746s;
        this.f2771x = tVar.f2747t;
        this.f2772y = new l1.d();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).f2687a) {
                    q1.n nVar = q1.n.f3964a;
                    X509TrustManager m2 = q1.n.f3964a.m();
                    this.f2763p = m2;
                    this.f2762o = q1.n.f3964a.l(m2);
                    m b2 = q1.n.f3964a.b(m2);
                    this.f2768u = b2;
                    f fVar = tVar.f2744q;
                    this.f2767t = X0.f.a(fVar.f2662b, b2) ? fVar : new f(fVar.f2661a, b2);
                    list = this.f2752c;
                    X0.f.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f2753d;
                    X0.f.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2763p;
                    m mVar = this.f2768u;
                    SSLSocketFactory sSLSocketFactory = this.f2762o;
                    List list4 = this.f2764q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((j) it2.next()).f2687a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (mVar == null) {
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
                    if (mVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!X0.f.a(this.f2767t, f.f2660c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2762o = null;
        this.f2768u = null;
        this.f2763p = null;
        this.f2767t = f.f2660c;
        list = this.f2752c;
        X0.f.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
