package s7;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l1.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p implements Cloneable {
    public static final List E = t7.b.j(q.f8665j, q.f8663h);
    public static final List F = t7.b.j(h.f8583e, h.f8584f);
    public final int A;
    public final int B;
    public final int C;
    public final x D;

    /* renamed from: f, reason: collision with root package name */
    public final g3.k f8641f;

    /* renamed from: g, reason: collision with root package name */
    public final x f8642g;

    /* renamed from: h, reason: collision with root package name */
    public final List f8643h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8644i;

    /* renamed from: j, reason: collision with root package name */
    public final a0.s f8645j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8646k;

    /* renamed from: l, reason: collision with root package name */
    public final b f8647l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8648m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f8649n;

    /* renamed from: o, reason: collision with root package name */
    public final b f8650o;

    /* renamed from: p, reason: collision with root package name */
    public final b f8651p;

    /* renamed from: q, reason: collision with root package name */
    public final ProxySelector f8652q;

    /* renamed from: r, reason: collision with root package name */
    public final b f8653r;

    /* renamed from: s, reason: collision with root package name */
    public final SocketFactory f8654s;

    /* renamed from: t, reason: collision with root package name */
    public final SSLSocketFactory f8655t;

    /* renamed from: u, reason: collision with root package name */
    public final X509TrustManager f8656u;

    /* renamed from: v, reason: collision with root package name */
    public final List f8657v;

    /* renamed from: w, reason: collision with root package name */
    public final List f8658w;

    /* renamed from: x, reason: collision with root package name */
    public final e8.c f8659x;

    /* renamed from: y, reason: collision with root package name */
    public final d f8660y;

    /* renamed from: z, reason: collision with root package name */
    public final t6.a f8661z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f8641f = oVar.f8621a;
        this.f8642g = oVar.f8622b;
        this.f8643h = t7.b.v(oVar.f8623c);
        this.f8644i = t7.b.v(oVar.f8624d);
        this.f8645j = oVar.f8625e;
        this.f8646k = oVar.f8626f;
        this.f8647l = oVar.f8627g;
        this.f8648m = oVar.f8628h;
        this.f8649n = oVar.f8629i;
        this.f8650o = oVar.f8630j;
        this.f8651p = oVar.f8631k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f8652q = proxySelector == null ? c8.a.f1763a : proxySelector;
        this.f8653r = oVar.f8632l;
        this.f8654s = oVar.f8633m;
        List list2 = oVar.f8634n;
        this.f8657v = list2;
        this.f8658w = oVar.f8635o;
        this.f8659x = oVar.f8636p;
        this.A = oVar.f8638r;
        this.B = oVar.f8639s;
        this.C = oVar.f8640t;
        this.D = new x(19);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f8585a) {
                    a8.o oVar2 = a8.o.f570a;
                    X509TrustManager m8 = a8.o.f570a.m();
                    this.f8656u = m8;
                    this.f8655t = a8.o.f570a.l(m8);
                    t6.a b9 = a8.o.f570a.b(m8);
                    this.f8661z = b9;
                    d dVar = oVar.f8637q;
                    this.f8660y = r6.k.a(dVar.f8558b, b9) ? dVar : new d(dVar.f8557a, b9);
                    X509TrustManager x509TrustManager = this.f8656u;
                    t6.a aVar = this.f8661z;
                    SSLSocketFactory sSLSocketFactory = this.f8655t;
                    List list3 = this.f8644i;
                    list = this.f8643h;
                    r6.k.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    r6.k.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List list4 = this.f8657v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f8585a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (aVar == null) {
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
                    if (aVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!r6.k.a(this.f8660y, d.f8556c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f8655t = null;
        this.f8661z = null;
        this.f8656u = null;
        this.f8660y = d.f8556c;
        X509TrustManager x509TrustManager2 = this.f8656u;
        t6.a aVar2 = this.f8661z;
        SSLSocketFactory sSLSocketFactory2 = this.f8655t;
        List list32 = this.f8644i;
        list = this.f8643h;
        r6.k.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
