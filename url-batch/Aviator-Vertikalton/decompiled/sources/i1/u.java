package i1;

import K.C0011g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0274n;

/* loaded from: classes.dex */
public final class u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.v f2746a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2747b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2748c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2749d;

    /* renamed from: e, reason: collision with root package name */
    public final C0011g f2750e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2751f;

    /* renamed from: g, reason: collision with root package name */
    public final C0167b f2752g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C0167b f2753j;

    /* renamed from: k, reason: collision with root package name */
    public final C0167b f2754k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2755l;

    /* renamed from: m, reason: collision with root package name */
    public final C0167b f2756m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2757n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2758o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2759p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2760q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2761r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2762s;

    /* renamed from: t, reason: collision with root package name */
    public final f f2763t;

    /* renamed from: u, reason: collision with root package name */
    public final m f2764u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2765v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2766w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2767x;

    /* renamed from: y, reason: collision with root package name */
    public final C0274n f2768y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2745z = j1.b.j(v.HTTP_2, v.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2744A = j1.b.j(j.f2681e, j.f2682f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(t tVar) {
        List list;
        this.f2746a = tVar.f2726a;
        this.f2747b = tVar.f2727b;
        this.f2748c = j1.b.v(tVar.f2728c);
        this.f2749d = j1.b.v(tVar.f2729d);
        this.f2750e = tVar.f2730e;
        this.f2751f = tVar.f2731f;
        this.f2752g = tVar.f2732g;
        this.h = tVar.h;
        this.i = tVar.i;
        this.f2753j = tVar.f2733j;
        this.f2754k = tVar.f2734k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2755l = proxySelector == null ? s1.a.f4150a : proxySelector;
        this.f2756m = tVar.f2735l;
        this.f2757n = tVar.f2736m;
        List list2 = tVar.f2737n;
        this.f2760q = list2;
        this.f2761r = tVar.f2738o;
        this.f2762s = tVar.f2739p;
        this.f2765v = tVar.f2741r;
        this.f2766w = tVar.f2742s;
        this.f2767x = tVar.f2743t;
        this.f2768y = new C0274n();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).f2683a) {
                    q1.n nVar = q1.n.f3960a;
                    X509TrustManager m2 = q1.n.f3960a.m();
                    this.f2759p = m2;
                    this.f2758o = q1.n.f3960a.l(m2);
                    m b2 = q1.n.f3960a.b(m2);
                    this.f2764u = b2;
                    f fVar = tVar.f2740q;
                    this.f2763t = X0.f.a(fVar.f2658b, b2) ? fVar : new f(fVar.f2657a, b2);
                    list = this.f2748c;
                    X0.f.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f2749d;
                    X0.f.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2759p;
                    m mVar = this.f2764u;
                    SSLSocketFactory sSLSocketFactory = this.f2758o;
                    List list4 = this.f2760q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((j) it2.next()).f2683a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (mVar == null) {
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
                    if (mVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!X0.f.a(this.f2763t, f.f2656c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2758o = null;
        this.f2764u = null;
        this.f2759p = null;
        this.f2763t = f.f2656c;
        list = this.f2748c;
        X0.f.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
