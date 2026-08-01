package o1;

import K.C0009g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.Z;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final U.u f3345a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f3346b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3347c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0009g f3348e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3349f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3350g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3351j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3352k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3353l;

    /* renamed from: m, reason: collision with root package name */
    public final b f3354m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3355n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3356o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3357p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3358q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3359r;

    /* renamed from: s, reason: collision with root package name */
    public final A1.c f3360s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3361t;

    /* renamed from: u, reason: collision with root package name */
    public final w1.d f3362u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3363v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3364w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3365x;

    /* renamed from: y, reason: collision with root package name */
    public final Z f3366y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f3344z = p1.b.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f3343A = p1.b.j(g.f3291e, g.f3292f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f3345a = oVar.f3326a;
        this.f3346b = oVar.f3327b;
        this.f3347c = p1.b.v(oVar.f3328c);
        this.d = p1.b.v(oVar.d);
        this.f3348e = oVar.f3329e;
        this.f3349f = oVar.f3330f;
        this.f3350g = oVar.f3331g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f3351j = oVar.f3332j;
        this.f3352k = oVar.f3333k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3353l = proxySelector == null ? y1.a.f4312a : proxySelector;
        this.f3354m = oVar.f3334l;
        this.f3355n = oVar.f3335m;
        List list2 = oVar.f3336n;
        this.f3358q = list2;
        this.f3359r = oVar.f3337o;
        this.f3360s = oVar.f3338p;
        this.f3363v = oVar.f3340r;
        this.f3364w = oVar.f3341s;
        this.f3365x = oVar.f3342t;
        this.f3366y = new Z(5);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f3293a) {
                    w1.n nVar = w1.n.f4190a;
                    X509TrustManager m2 = w1.n.f4190a.m();
                    this.f3357p = m2;
                    this.f3356o = w1.n.f4190a.l(m2);
                    w1.d b2 = w1.n.f4190a.b(m2);
                    this.f3362u = b2;
                    d dVar = oVar.f3339q;
                    this.f3361t = d1.d.a(dVar.f3273b, b2) ? dVar : new d(dVar.f3272a, b2);
                    list = this.f3347c;
                    d1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    d1.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f3357p;
                    w1.d dVar2 = this.f3362u;
                    SSLSocketFactory sSLSocketFactory = this.f3356o;
                    List list4 = this.f3358q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f3293a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (dVar2 == null) {
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
                    if (dVar2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!d1.d.a(this.f3361t, d.f3271c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3356o = null;
        this.f3362u = null;
        this.f3357p = null;
        this.f3361t = d.f3271c;
        list = this.f3347c;
        d1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
