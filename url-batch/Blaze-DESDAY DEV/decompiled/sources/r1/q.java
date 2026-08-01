package r1;

import K.C0009g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final U.u f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3492b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3493c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0009g f3494e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3495f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3496g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3497j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3498k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3499l;

    /* renamed from: m, reason: collision with root package name */
    public final b f3500m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3501n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3502o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3503p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3504q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3505r;

    /* renamed from: s, reason: collision with root package name */
    public final D1.c f3506s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3507t;

    /* renamed from: u, reason: collision with root package name */
    public final z1.l f3508u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3509v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3510w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3511x;

    /* renamed from: y, reason: collision with root package name */
    public final g f3512y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f3490z = s1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f3489A = s1.b.j(h.f3437e, h.f3438f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(p pVar) {
        List list;
        this.f3491a = pVar.f3472a;
        this.f3492b = pVar.f3473b;
        this.f3493c = s1.b.v(pVar.f3474c);
        this.d = s1.b.v(pVar.d);
        this.f3494e = pVar.f3475e;
        this.f3495f = pVar.f3476f;
        this.f3496g = pVar.f3477g;
        this.h = pVar.h;
        this.i = pVar.i;
        this.f3497j = pVar.f3478j;
        this.f3498k = pVar.f3479k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3499l = proxySelector == null ? B1.a.f69a : proxySelector;
        this.f3500m = pVar.f3480l;
        this.f3501n = pVar.f3481m;
        List list2 = pVar.f3482n;
        this.f3504q = list2;
        this.f3505r = pVar.f3483o;
        this.f3506s = pVar.f3484p;
        this.f3509v = pVar.f3486r;
        this.f3510w = pVar.f3487s;
        this.f3511x = pVar.f3488t;
        this.f3512y = new g(5);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f3439a) {
                    z1.n nVar = z1.n.f4366a;
                    X509TrustManager m2 = z1.n.f4366a.m();
                    this.f3503p = m2;
                    this.f3502o = z1.n.f4366a.l(m2);
                    z1.l b2 = z1.n.f4366a.b(m2);
                    this.f3508u = b2;
                    d dVar = pVar.f3485q;
                    this.f3507t = g1.d.a(dVar.f3418b, b2) ? dVar : new d(dVar.f3417a, b2);
                    list = this.f3493c;
                    g1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    g1.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f3503p;
                    z1.l lVar = this.f3508u;
                    SSLSocketFactory sSLSocketFactory = this.f3502o;
                    List list4 = this.f3504q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f3439a) {
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
                    if (!g1.d.a(this.f3507t, d.f3416c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3502o = null;
        this.f3508u = null;
        this.f3503p = null;
        this.f3507t = d.f3416c;
        list = this.f3493c;
        g1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
