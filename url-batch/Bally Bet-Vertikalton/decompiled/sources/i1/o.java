package i1;

import K.C0007g;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0249n;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.u f2463a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2464b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2465c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2466e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2467f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2468g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2469j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2470k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2471l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2472m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2473n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2474o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2475p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2476q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2477r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2478s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2479t;

    /* renamed from: u, reason: collision with root package name */
    public final p f2480u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2481v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2482w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2483x;

    /* renamed from: y, reason: collision with root package name */
    public final C0249n f2484y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2462z = j1.b.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2461A = j1.b.j(h.f2429e, h.f2430f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o() {
        List list;
        T.u uVar = new T.u(3);
        B0.d dVar = new B0.d(25);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0007g c0007g = new C0007g(3);
        b bVar = b.f2392a;
        b bVar2 = b.f2393b;
        b bVar3 = b.f2394c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        X0.d.d(socketFactory, "getDefault()");
        List list2 = f2461A;
        List list3 = f2462z;
        u1.c cVar = u1.c.f3819a;
        d dVar2 = d.f2406c;
        this.f2463a = uVar;
        this.f2464b = dVar;
        this.f2465c = j1.b.u(arrayList);
        this.d = j1.b.u(arrayList2);
        this.f2466e = c0007g;
        this.f2467f = true;
        this.f2468g = bVar;
        this.h = true;
        this.i = true;
        this.f2469j = bVar2;
        this.f2470k = bVar3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2471l = proxySelector == null ? s1.a.f3741a : proxySelector;
        this.f2472m = bVar;
        this.f2473n = socketFactory;
        this.f2476q = list2;
        this.f2477r = list3;
        this.f2478s = cVar;
        this.f2481v = 10000;
        this.f2482w = 10000;
        this.f2483x = 10000;
        this.f2484y = new C0249n();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2431a) {
                    q1.n nVar = q1.n.f3555a;
                    X509TrustManager m2 = q1.n.f3555a.m();
                    this.f2475p = m2;
                    this.f2474o = q1.n.f3555a.l(m2);
                    p b2 = q1.n.f3555a.b(m2);
                    this.f2480u = b2;
                    this.f2479t = X0.d.a(dVar2.f2408b, b2) ? dVar2 : new d(dVar2.f2407a, b2);
                    list = this.f2465c;
                    X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list4 = this.d;
                    X0.d.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list4.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list4).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2475p;
                    p pVar = this.f2480u;
                    SSLSocketFactory sSLSocketFactory = this.f2474o;
                    List list5 = this.f2476q;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2431a) {
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
                    if (!X0.d.a(this.f2479t, d.f2406c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2474o = null;
        this.f2480u = null;
        this.f2475p = null;
        this.f2479t = d.f2406c;
        list = this.f2465c;
        X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
