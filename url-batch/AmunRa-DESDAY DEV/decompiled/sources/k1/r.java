package k1;

import K.C0006g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k0.y;
import l.C0229n;

/* loaded from: classes.dex */
public final class r implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.u f2859a;

    /* renamed from: b, reason: collision with root package name */
    public final C.g f2860b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2861c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0006g f2862e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2863f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2864g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2865j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2866k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2867l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2868m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2869n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2870o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2871p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2872q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2873r;

    /* renamed from: s, reason: collision with root package name */
    public final w1.c f2874s;

    /* renamed from: t, reason: collision with root package name */
    public final e f2875t;

    /* renamed from: u, reason: collision with root package name */
    public final y f2876u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2877v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2878w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2879x;

    /* renamed from: y, reason: collision with root package name */
    public final C0229n f2880y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2858z = l1.b.j(s.HTTP_2, s.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2857A = l1.b.j(i.f2805e, i.f2806f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(q qVar) {
        List list;
        this.f2859a = qVar.f2840a;
        this.f2860b = qVar.f2841b;
        this.f2861c = l1.b.v(qVar.f2842c);
        this.d = l1.b.v(qVar.d);
        this.f2862e = qVar.f2843e;
        this.f2863f = qVar.f2844f;
        this.f2864g = qVar.f2845g;
        this.h = qVar.h;
        this.i = qVar.i;
        this.f2865j = qVar.f2846j;
        this.f2866k = qVar.f2847k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2867l = proxySelector == null ? u1.a.f3911a : proxySelector;
        this.f2868m = qVar.f2848l;
        this.f2869n = qVar.f2849m;
        List list2 = qVar.f2850n;
        this.f2872q = list2;
        this.f2873r = qVar.f2851o;
        this.f2874s = qVar.f2852p;
        this.f2877v = qVar.f2854r;
        this.f2878w = qVar.f2855s;
        this.f2879x = qVar.f2856t;
        this.f2880y = new C0229n();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f2807a) {
                    s1.n nVar = s1.n.f3825a;
                    X509TrustManager m2 = s1.n.f3825a.m();
                    this.f2871p = m2;
                    this.f2870o = s1.n.f3825a.l(m2);
                    y b2 = s1.n.f3825a.b(m2);
                    this.f2876u = b2;
                    e eVar = qVar.f2853q;
                    this.f2875t = Z0.d.a(eVar.f2784b, b2) ? eVar : new e(eVar.f2783a, b2);
                    list = this.f2861c;
                    Z0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    Z0.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2871p;
                    y yVar = this.f2876u;
                    SSLSocketFactory sSLSocketFactory = this.f2870o;
                    List list4 = this.f2872q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((i) it2.next()).f2807a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (yVar == null) {
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
                    if (yVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Z0.d.a(this.f2875t, e.f2782c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2870o = null;
        this.f2876u = null;
        this.f2871p = null;
        this.f2875t = e.f2782c;
        list = this.f2861c;
        Z0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
