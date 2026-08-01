package r1;

import M.C0006g;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0176a0;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T0.g f3507a;

    /* renamed from: b, reason: collision with root package name */
    public final C0176a0 f3508b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3509c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0006g f3510e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3511f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3512g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3513j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3514k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3515l;

    /* renamed from: m, reason: collision with root package name */
    public final b f3516m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3517n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3518o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3519p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3520q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3521r;

    /* renamed from: s, reason: collision with root package name */
    public final D1.c f3522s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3523t;

    /* renamed from: u, reason: collision with root package name */
    public final z1.d f3524u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3525v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3526w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3527x;

    /* renamed from: y, reason: collision with root package name */
    public final C0176a0 f3528y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f3506z = s1.b.j(p.HTTP_2, p.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f3505A = s1.b.j(g.f3470e, g.f3471f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o() {
        List list;
        T0.g gVar = new T0.g(6);
        C0176a0 c0176a0 = new C0176a0(1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0006g c0006g = new C0006g(8);
        b bVar = b.f3436a;
        b bVar2 = b.f3437b;
        b bVar3 = b.f3438c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        g1.d.d(socketFactory, "getDefault()");
        List list2 = f3505A;
        List list3 = f3506z;
        D1.c cVar = D1.c.f159a;
        d dVar = d.f3450c;
        this.f3507a = gVar;
        this.f3508b = c0176a0;
        this.f3509c = s1.b.v(arrayList);
        this.d = s1.b.v(arrayList2);
        this.f3510e = c0006g;
        this.f3511f = true;
        this.f3512g = bVar;
        this.h = true;
        this.i = true;
        this.f3513j = bVar2;
        this.f3514k = bVar3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3515l = proxySelector == null ? B1.a.f104a : proxySelector;
        this.f3516m = bVar;
        this.f3517n = socketFactory;
        this.f3520q = list2;
        this.f3521r = list3;
        this.f3522s = cVar;
        this.f3525v = 10000;
        this.f3526w = 10000;
        this.f3527x = 10000;
        this.f3528y = new C0176a0(5);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f3472a) {
                    z1.o oVar = z1.o.f4365a;
                    X509TrustManager m2 = z1.o.f4365a.m();
                    this.f3519p = m2;
                    this.f3518o = z1.o.f4365a.l(m2);
                    z1.d b2 = z1.o.f4365a.b(m2);
                    this.f3524u = b2;
                    this.f3523t = g1.d.a(dVar.f3452b, b2) ? dVar : new d(dVar.f3451a, b2);
                    list = this.f3509c;
                    g1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list4 = this.d;
                    g1.d.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list4.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list4).toString());
                    }
                    X509TrustManager x509TrustManager = this.f3519p;
                    z1.d dVar2 = this.f3524u;
                    SSLSocketFactory sSLSocketFactory = this.f3518o;
                    List list5 = this.f3520q;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f3472a) {
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
                    if (!g1.d.a(this.f3523t, d.f3450c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3518o = null;
        this.f3524u = null;
        this.f3519p = null;
        this.f3523t = d.f3450c;
        list = this.f3509c;
        g1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
