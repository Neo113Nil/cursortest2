package z1;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.C0288n;

/* loaded from: classes.dex */
public final class s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final V.v f4905a;

    /* renamed from: b, reason: collision with root package name */
    public final C0288n f4906b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4907c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4908d;
    public final A1.a e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4909f;

    /* renamed from: g, reason: collision with root package name */
    public final b f4910g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4911h;
    public final boolean i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final b f4912k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f4913l;

    /* renamed from: m, reason: collision with root package name */
    public final b f4914m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f4915n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f4916o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f4917p;

    /* renamed from: q, reason: collision with root package name */
    public final List f4918q;

    /* renamed from: r, reason: collision with root package name */
    public final List f4919r;

    /* renamed from: s, reason: collision with root package name */
    public final L1.c f4920s;

    /* renamed from: t, reason: collision with root package name */
    public final f f4921t;

    /* renamed from: u, reason: collision with root package name */
    public final H1.l f4922u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4923v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4924w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4925x;

    /* renamed from: y, reason: collision with root package name */
    public final C1.d f4926y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f4904z = A1.c.j(t.HTTP_2, t.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f4903A = A1.c.j(i.e, i.f4848f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(r rVar) {
        List list;
        this.f4905a = rVar.f4886a;
        this.f4906b = rVar.f4887b;
        this.f4907c = A1.c.v(rVar.f4888c);
        this.f4908d = A1.c.v(rVar.f4889d);
        this.e = rVar.e;
        this.f4909f = rVar.f4890f;
        this.f4910g = rVar.f4891g;
        this.f4911h = rVar.f4892h;
        this.i = rVar.i;
        this.j = rVar.j;
        this.f4912k = rVar.f4893k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f4913l = proxySelector == null ? J1.a.f652a : proxySelector;
        this.f4914m = rVar.f4894l;
        this.f4915n = rVar.f4895m;
        List list2 = rVar.f4896n;
        this.f4918q = list2;
        this.f4919r = rVar.f4897o;
        this.f4920s = rVar.f4898p;
        this.f4923v = rVar.f4900r;
        this.f4924w = rVar.f4901s;
        this.f4925x = rVar.f4902t;
        this.f4926y = new C1.d(1);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f4849a) {
                    H1.n nVar = H1.n.f570a;
                    X509TrustManager m2 = H1.n.f570a.m();
                    this.f4917p = m2;
                    this.f4916o = H1.n.f570a.l(m2);
                    H1.l b2 = H1.n.f570a.b(m2);
                    this.f4922u = b2;
                    f fVar = rVar.f4899q;
                    this.f4921t = j1.h.a(fVar.f4830b, b2) ? fVar : new f(fVar.f4829a, b2);
                    list = this.f4907c;
                    j1.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f4908d;
                    j1.h.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f4917p;
                    H1.l lVar = this.f4922u;
                    SSLSocketFactory sSLSocketFactory = this.f4916o;
                    List list4 = this.f4918q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((i) it2.next()).f4849a) {
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
                    if (!j1.h.a(this.f4921t, f.f4828c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f4916o = null;
        this.f4922u = null;
        this.f4917p = null;
        this.f4921t = f.f4828c;
        list = this.f4907c;
        j1.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
