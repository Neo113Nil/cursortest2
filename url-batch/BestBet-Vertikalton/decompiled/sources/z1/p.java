package z1;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k.C0191o;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T0.m f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final C0191o f4722b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4723c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final A1.a f4724e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4725f;

    /* renamed from: g, reason: collision with root package name */
    public final b f4726g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f4727j;

    /* renamed from: k, reason: collision with root package name */
    public final b f4728k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f4729l;

    /* renamed from: m, reason: collision with root package name */
    public final b f4730m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f4731n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f4732o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f4733p;

    /* renamed from: q, reason: collision with root package name */
    public final List f4734q;

    /* renamed from: r, reason: collision with root package name */
    public final List f4735r;

    /* renamed from: s, reason: collision with root package name */
    public final L1.c f4736s;

    /* renamed from: t, reason: collision with root package name */
    public final d f4737t;

    /* renamed from: u, reason: collision with root package name */
    public final H1.d f4738u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4739v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4740w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4741x;

    /* renamed from: y, reason: collision with root package name */
    public final A0.c f4742y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f4720z = A1.c.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f4719A = A1.c.j(g.f4667e, g.f4668f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f4721a = oVar.f4702a;
        this.f4722b = oVar.f4703b;
        this.f4723c = A1.c.v(oVar.f4704c);
        this.d = A1.c.v(oVar.d);
        this.f4724e = oVar.f4705e;
        this.f4725f = oVar.f4706f;
        this.f4726g = oVar.f4707g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f4727j = oVar.f4708j;
        this.f4728k = oVar.f4709k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f4729l = proxySelector == null ? J1.a.f565a : proxySelector;
        this.f4730m = oVar.f4710l;
        this.f4731n = oVar.f4711m;
        List list2 = oVar.f4712n;
        this.f4734q = list2;
        this.f4735r = oVar.f4713o;
        this.f4736s = oVar.f4714p;
        this.f4739v = oVar.f4716r;
        this.f4740w = oVar.f4717s;
        this.f4741x = oVar.f4718t;
        this.f4742y = new A0.c(4);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f4669a) {
                    H1.n nVar = H1.n.f525a;
                    X509TrustManager m2 = H1.n.f525a.m();
                    this.f4733p = m2;
                    this.f4732o = H1.n.f525a.l(m2);
                    H1.d b2 = H1.n.f525a.b(m2);
                    this.f4738u = b2;
                    d dVar = oVar.f4715q;
                    this.f4737t = k1.e.a(dVar.f4649b, b2) ? dVar : new d(dVar.f4648a, b2);
                    list = this.f4723c;
                    k1.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    k1.e.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f4733p;
                    H1.d dVar2 = this.f4738u;
                    SSLSocketFactory sSLSocketFactory = this.f4732o;
                    List list4 = this.f4734q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f4669a) {
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
                    if (!k1.e.a(this.f4737t, d.f4647c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f4732o = null;
        this.f4738u = null;
        this.f4733p = null;
        this.f4737t = d.f4647c;
        list = this.f4723c;
        k1.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
