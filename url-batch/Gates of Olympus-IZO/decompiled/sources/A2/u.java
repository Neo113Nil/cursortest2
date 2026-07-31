package A2;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class u implements Cloneable {
    public static final List C = B2.c.k(v.HTTP_2, v.HTTP_1_1);
    public static final List D = B2.c.k(i.f88e, i.f89f);

    /* renamed from: A, reason: collision with root package name */
    public final int f161A;
    public final g B;

    /* renamed from: d, reason: collision with root package name */
    public final k f162d;

    /* renamed from: e, reason: collision with root package name */
    public final g f163e;

    /* renamed from: f, reason: collision with root package name */
    public final List f164f;

    /* renamed from: g, reason: collision with root package name */
    public final List f165g;

    /* renamed from: h, reason: collision with root package name */
    public final B2.a f166h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f167i;

    /* renamed from: j, reason: collision with root package name */
    public final C0003b f168j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f169k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f170l;

    /* renamed from: m, reason: collision with root package name */
    public final C0003b f171m;

    /* renamed from: n, reason: collision with root package name */
    public final C0003b f172n;

    /* renamed from: o, reason: collision with root package name */
    public final ProxySelector f173o;
    public final C0003b p;

    /* renamed from: q, reason: collision with root package name */
    public final SocketFactory f174q;

    /* renamed from: r, reason: collision with root package name */
    public final SSLSocketFactory f175r;

    /* renamed from: s, reason: collision with root package name */
    public final X509TrustManager f176s;

    /* renamed from: t, reason: collision with root package name */
    public final List f177t;

    /* renamed from: u, reason: collision with root package name */
    public final List f178u;

    /* renamed from: v, reason: collision with root package name */
    public final M2.c f179v;

    /* renamed from: w, reason: collision with root package name */
    public final d f180w;

    /* renamed from: x, reason: collision with root package name */
    public final I2.l f181x;

    /* renamed from: y, reason: collision with root package name */
    public final int f182y;

    /* renamed from: z, reason: collision with root package name */
    public final int f183z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(t tVar) {
        List list;
        this.f162d = tVar.f142a;
        this.f163e = tVar.f143b;
        this.f164f = B2.c.w(tVar.f144c);
        this.f165g = B2.c.w(tVar.f145d);
        this.f166h = tVar.f146e;
        this.f167i = tVar.f147f;
        this.f168j = tVar.f148g;
        this.f169k = tVar.f149h;
        this.f170l = tVar.f150i;
        this.f171m = tVar.f151j;
        this.f172n = tVar.f152k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f173o = proxySelector == null ? K2.a.f2667a : proxySelector;
        this.p = tVar.f153l;
        this.f174q = tVar.f154m;
        List list2 = tVar.f155n;
        this.f177t = list2;
        this.f178u = tVar.f156o;
        this.f179v = tVar.p;
        this.f182y = tVar.f158r;
        this.f183z = tVar.f159s;
        this.f161A = tVar.f160t;
        this.B = new g(4);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f90a) {
                    I2.n nVar = I2.n.f2519a;
                    X509TrustManager m3 = I2.n.f2519a.m();
                    this.f176s = m3;
                    this.f175r = I2.n.f2519a.l(m3);
                    I2.l b2 = I2.n.f2519a.b(m3);
                    this.f181x = b2;
                    d dVar = tVar.f157q;
                    this.f180w = Z1.i.a(dVar.f62b, b2) ? dVar : new d(dVar.f61a, b2);
                    list = this.f164f;
                    Z1.i.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f165g;
                    Z1.i.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f176s;
                    I2.l lVar = this.f181x;
                    SSLSocketFactory sSLSocketFactory = this.f175r;
                    List list4 = this.f177t;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((i) it2.next()).f90a) {
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
                    if (!Z1.i.a(this.f180w, d.f60c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f175r = null;
        this.f181x = null;
        this.f176s = null;
        this.f180w = d.f60c;
        list = this.f164f;
        Z1.i.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
