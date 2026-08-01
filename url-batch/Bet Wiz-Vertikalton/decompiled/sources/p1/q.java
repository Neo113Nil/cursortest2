package p1;

import K.C0006g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.u f3391a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3392b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3393c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0006g f3394e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3395f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3396g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3397j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3398k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3399l;

    /* renamed from: m, reason: collision with root package name */
    public final b f3400m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3401n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3402o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3403p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3404q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3405r;

    /* renamed from: s, reason: collision with root package name */
    public final B1.c f3406s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3407t;

    /* renamed from: u, reason: collision with root package name */
    public final x1.l f3408u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3409v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3410w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3411x;

    /* renamed from: y, reason: collision with root package name */
    public final g f3412y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f3390z = q1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f3389A = q1.b.j(h.f3337e, h.f3338f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(p pVar) {
        List list;
        this.f3391a = pVar.f3372a;
        this.f3392b = pVar.f3373b;
        this.f3393c = q1.b.v(pVar.f3374c);
        this.d = q1.b.v(pVar.d);
        this.f3394e = pVar.f3375e;
        this.f3395f = pVar.f3376f;
        this.f3396g = pVar.f3377g;
        this.h = pVar.h;
        this.i = pVar.i;
        this.f3397j = pVar.f3378j;
        this.f3398k = pVar.f3379k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3399l = proxySelector == null ? z1.a.f4323a : proxySelector;
        this.f3400m = pVar.f3380l;
        this.f3401n = pVar.f3381m;
        List list2 = pVar.f3382n;
        this.f3404q = list2;
        this.f3405r = pVar.f3383o;
        this.f3406s = pVar.f3384p;
        this.f3409v = pVar.f3386r;
        this.f3410w = pVar.f3387s;
        this.f3411x = pVar.f3388t;
        this.f3412y = new g(4);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f3339a) {
                    x1.n nVar = x1.n.f4286a;
                    X509TrustManager m2 = x1.n.f4286a.m();
                    this.f3403p = m2;
                    this.f3402o = x1.n.f4286a.l(m2);
                    x1.l b2 = x1.n.f4286a.b(m2);
                    this.f3408u = b2;
                    d dVar = pVar.f3385q;
                    this.f3407t = e1.d.a(dVar.f3318b, b2) ? dVar : new d(dVar.f3317a, b2);
                    list = this.f3393c;
                    e1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    e1.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f3403p;
                    x1.l lVar = this.f3408u;
                    SSLSocketFactory sSLSocketFactory = this.f3402o;
                    List list4 = this.f3404q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f3339a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (lVar == null) {
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
                    if (lVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!e1.d.a(this.f3407t, d.f3316c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3402o = null;
        this.f3408u = null;
        this.f3403p = null;
        this.f3407t = d.f3316c;
        list = this.f3393c;
        e1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
