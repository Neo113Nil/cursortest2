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
    public final T.t f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2458b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2459c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2460e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2461f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2462g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2463j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2464k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2465l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2466m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2467n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2468o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2469p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2470q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2471r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2472s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2473t;

    /* renamed from: u, reason: collision with root package name */
    public final p f2474u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2475v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2476w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2477x;

    /* renamed from: y, reason: collision with root package name */
    public final C0242k f2478y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2456z = j1.b.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2455A = j1.b.j(h.f2423e, h.f2424f);

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
        b bVar = b.f2386a;
        b bVar2 = b.f2387b;
        b bVar3 = b.f2388c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        X0.e.d(socketFactory, "getDefault()");
        List list2 = f2455A;
        List list3 = f2456z;
        u1.c cVar = u1.c.f3813a;
        d dVar2 = d.f2400c;
        this.f2457a = tVar;
        this.f2458b = dVar;
        this.f2459c = j1.b.u(arrayList);
        this.d = j1.b.u(arrayList2);
        this.f2460e = c0007g;
        this.f2461f = true;
        this.f2462g = bVar;
        this.h = true;
        this.i = true;
        this.f2463j = bVar2;
        this.f2464k = bVar3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2465l = proxySelector == null ? s1.a.f3735a : proxySelector;
        this.f2466m = bVar;
        this.f2467n = socketFactory;
        this.f2470q = list2;
        this.f2471r = list3;
        this.f2472s = cVar;
        this.f2475v = 10000;
        this.f2476w = 10000;
        this.f2477x = 10000;
        this.f2478y = new C0242k();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2425a) {
                    q1.n nVar = q1.n.f3549a;
                    X509TrustManager m2 = q1.n.f3549a.m();
                    this.f2469p = m2;
                    this.f2468o = q1.n.f3549a.l(m2);
                    p b2 = q1.n.f3549a.b(m2);
                    this.f2474u = b2;
                    this.f2473t = X0.e.a(dVar2.f2402b, b2) ? dVar2 : new d(dVar2.f2401a, b2);
                    list = this.f2459c;
                    X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list4 = this.d;
                    X0.e.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list4.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list4).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2469p;
                    p pVar = this.f2474u;
                    SSLSocketFactory sSLSocketFactory = this.f2468o;
                    List list5 = this.f2470q;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2425a) {
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
                    if (!X0.e.a(this.f2473t, d.f2400c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2468o = null;
        this.f2474u = null;
        this.f2469p = null;
        this.f2473t = d.f2400c;
        list = this.f2459c;
        X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
