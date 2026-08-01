package m1;

import K.C0006g;
import j0.AbstractC0143a;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0207a0;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.u f3211a;

    /* renamed from: b, reason: collision with root package name */
    public final C0207a0 f3212b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3213c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0006g f3214e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3215f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3216g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3217j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3218k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3219l;

    /* renamed from: m, reason: collision with root package name */
    public final b f3220m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3221n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3222o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3223p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3224q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3225r;

    /* renamed from: s, reason: collision with root package name */
    public final y1.c f3226s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3227t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0143a f3228u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3229v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3230w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3231x;

    /* renamed from: y, reason: collision with root package name */
    public final C0207a0 f3232y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f3210z = n1.b.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f3209A = n1.b.j(g.f3157e, g.f3158f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f3211a = oVar.f3192a;
        this.f3212b = oVar.f3193b;
        this.f3213c = n1.b.v(oVar.f3194c);
        this.d = n1.b.v(oVar.d);
        this.f3214e = oVar.f3195e;
        this.f3215f = oVar.f3196f;
        this.f3216g = oVar.f3197g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f3217j = oVar.f3198j;
        this.f3218k = oVar.f3199k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3219l = proxySelector == null ? w1.a.f4152a : proxySelector;
        this.f3220m = oVar.f3200l;
        this.f3221n = oVar.f3201m;
        List list2 = oVar.f3202n;
        this.f3224q = list2;
        this.f3225r = oVar.f3203o;
        this.f3226s = oVar.f3204p;
        this.f3229v = oVar.f3206r;
        this.f3230w = oVar.f3207s;
        this.f3231x = oVar.f3208t;
        this.f3232y = new C0207a0(4);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f3159a) {
                    u1.n nVar = u1.n.f3904a;
                    X509TrustManager m2 = u1.n.f3904a.m();
                    this.f3223p = m2;
                    this.f3222o = u1.n.f3904a.l(m2);
                    AbstractC0143a b2 = u1.n.f3904a.b(m2);
                    this.f3228u = b2;
                    d dVar = oVar.f3205q;
                    this.f3227t = b1.d.a(dVar.f3139b, b2) ? dVar : new d(dVar.f3138a, b2);
                    list = this.f3213c;
                    b1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    b1.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f3223p;
                    AbstractC0143a abstractC0143a = this.f3228u;
                    SSLSocketFactory sSLSocketFactory = this.f3222o;
                    List list4 = this.f3224q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f3159a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (abstractC0143a == null) {
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
                    if (abstractC0143a != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!b1.d.a(this.f3227t, d.f3137c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3222o = null;
        this.f3228u = null;
        this.f3223p = null;
        this.f3227t = d.f3137c;
        list = this.f3213c;
        b1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
