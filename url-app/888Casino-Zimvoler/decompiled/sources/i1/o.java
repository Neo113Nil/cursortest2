package i1;

import K.C0007g;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0242k;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.t f2458a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2459b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2460c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2461e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2462f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2463g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2464j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2465k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2466l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2467m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2468n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2469o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2470p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2471q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2472r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2473s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2474t;

    /* renamed from: u, reason: collision with root package name */
    public final p f2475u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2476v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2477w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2478x;

    /* renamed from: y, reason: collision with root package name */
    public final C0242k f2479y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2457z = j1.b.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2456A = j1.b.j(h.f2424e, h.f2425f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o() {
        List list;
        T.t tVar = new T.t(3);
        B0.d dVar = new B0.d(26);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0007g c0007g = new C0007g(3);
        b bVar = b.f2387a;
        b bVar2 = b.f2388b;
        b bVar3 = b.f2389c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        X0.e.d(socketFactory, "getDefault()");
        List list2 = f2456A;
        List list3 = f2457z;
        u1.c cVar = u1.c.f3814a;
        d dVar2 = d.f2401c;
        this.f2458a = tVar;
        this.f2459b = dVar;
        this.f2460c = j1.b.u(arrayList);
        this.d = j1.b.u(arrayList2);
        this.f2461e = c0007g;
        this.f2462f = true;
        this.f2463g = bVar;
        this.h = true;
        this.i = true;
        this.f2464j = bVar2;
        this.f2465k = bVar3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2466l = proxySelector == null ? s1.a.f3736a : proxySelector;
        this.f2467m = bVar;
        this.f2468n = socketFactory;
        this.f2471q = list2;
        this.f2472r = list3;
        this.f2473s = cVar;
        this.f2476v = 10000;
        this.f2477w = 10000;
        this.f2478x = 10000;
        this.f2479y = new C0242k();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2426a) {
                    q1.n nVar = q1.n.f3550a;
                    X509TrustManager m2 = q1.n.f3550a.m();
                    this.f2470p = m2;
                    this.f2469o = q1.n.f3550a.l(m2);
                    p b2 = q1.n.f3550a.b(m2);
                    this.f2475u = b2;
                    this.f2474t = X0.e.a(dVar2.f2403b, b2) ? dVar2 : new d(dVar2.f2402a, b2);
                    list = this.f2460c;
                    X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list4 = this.d;
                    X0.e.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list4.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list4).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2470p;
                    p pVar = this.f2475u;
                    SSLSocketFactory sSLSocketFactory = this.f2469o;
                    List list5 = this.f2471q;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2426a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (pVar == null) {
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
                    if (pVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!X0.e.a(this.f2474t, d.f2401c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2469o = null;
        this.f2475u = null;
        this.f2470p = null;
        this.f2474t = d.f2401c;
        list = this.f2460c;
        X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
