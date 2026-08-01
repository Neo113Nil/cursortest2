package s1;

import L.C0009g;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import m.C0202a0;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final S0.g f3661a;

    /* renamed from: b, reason: collision with root package name */
    public final C0202a0 f3662b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3663c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0009g f3664e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3665f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3666g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3667h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3668j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3669k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f3670l;

    /* renamed from: m, reason: collision with root package name */
    public final b f3671m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f3672n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f3673o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f3674p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3675q;

    /* renamed from: r, reason: collision with root package name */
    public final List f3676r;

    /* renamed from: s, reason: collision with root package name */
    public final E1.c f3677s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3678t;

    /* renamed from: u, reason: collision with root package name */
    public final A1.d f3679u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3680v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3681w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3682x;

    /* renamed from: y, reason: collision with root package name */
    public final C0202a0 f3683y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f3660z = t1.b.j(p.HTTP_2, p.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f3659A = t1.b.j(g.f3621e, g.f3622f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o() {
        List list;
        S0.g gVar = new S0.g(6);
        C0202a0 c0202a0 = new C0202a0(1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0009g c0009g = new C0009g(8);
        b bVar = b.f3585a;
        b bVar2 = b.f3586b;
        b bVar3 = b.f3587c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        h1.d.d(socketFactory, "getDefault()");
        List list2 = f3659A;
        List list3 = f3660z;
        E1.c cVar = E1.c.f231a;
        d dVar = d.f3600c;
        this.f3661a = gVar;
        this.f3662b = c0202a0;
        this.f3663c = t1.b.v(arrayList);
        this.d = t1.b.v(arrayList2);
        this.f3664e = c0009g;
        this.f3665f = true;
        this.f3666g = bVar;
        this.f3667h = true;
        this.i = true;
        this.f3668j = bVar2;
        this.f3669k = bVar3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3670l = proxySelector == null ? C1.a.f111a : proxySelector;
        this.f3671m = bVar;
        this.f3672n = socketFactory;
        this.f3675q = list2;
        this.f3676r = list3;
        this.f3677s = cVar;
        this.f3680v = 10000;
        this.f3681w = 10000;
        this.f3682x = 10000;
        this.f3683y = new C0202a0(6);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f3623a) {
                    A1.o oVar = A1.o.f39a;
                    X509TrustManager m2 = A1.o.f39a.m();
                    this.f3674p = m2;
                    this.f3673o = A1.o.f39a.l(m2);
                    A1.d b2 = A1.o.f39a.b(m2);
                    this.f3679u = b2;
                    this.f3678t = h1.d.a(dVar.f3602b, b2) ? dVar : new d(dVar.f3601a, b2);
                    list = this.f3663c;
                    h1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list4 = this.d;
                    h1.d.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list4.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list4).toString());
                    }
                    X509TrustManager x509TrustManager = this.f3674p;
                    A1.d dVar2 = this.f3679u;
                    SSLSocketFactory sSLSocketFactory = this.f3673o;
                    List list5 = this.f3675q;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f3623a) {
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
                    if (!h1.d.a(this.f3678t, d.f3600c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3673o = null;
        this.f3679u = null;
        this.f3674p = null;
        this.f3678t = d.f3600c;
        list = this.f3663c;
        h1.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
