package G3;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final G1.c f977a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.h f978b;

    /* renamed from: c, reason: collision with root package name */
    public final List f979c;

    /* renamed from: d, reason: collision with root package name */
    public final List f980d;

    /* renamed from: e, reason: collision with root package name */
    public final D0.d f981e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f982f;

    /* renamed from: g, reason: collision with root package name */
    public final C0051b f983g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f984h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f985i;

    /* renamed from: j, reason: collision with root package name */
    public final C0051b f986j;

    /* renamed from: k, reason: collision with root package name */
    public final C0051b f987k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f988l;

    /* renamed from: m, reason: collision with root package name */
    public final C0051b f989m;
    public final SocketFactory n;
    public final SSLSocketFactory o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f990p;

    /* renamed from: q, reason: collision with root package name */
    public final List f991q;

    /* renamed from: r, reason: collision with root package name */
    public final List f992r;

    /* renamed from: s, reason: collision with root package name */
    public final S3.c f993s;

    /* renamed from: t, reason: collision with root package name */
    public final e f994t;

    /* renamed from: u, reason: collision with root package name */
    public final O3.l f995u;
    public final int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f996w;

    /* renamed from: x, reason: collision with root package name */
    public final int f997x;

    /* renamed from: y, reason: collision with root package name */
    public final t1.h f998y;
    public static final List z = H3.b.j(t.HTTP_2, t.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f976A = H3.b.j(i.f911e, i.f912f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(r rVar) {
        List list;
        this.f977a = rVar.f956a;
        this.f978b = rVar.f957b;
        this.f979c = H3.b.u(rVar.f958c);
        this.f980d = H3.b.u(rVar.f959d);
        this.f981e = rVar.f960e;
        this.f982f = rVar.f961f;
        this.f983g = rVar.f962g;
        this.f984h = rVar.f963h;
        this.f985i = rVar.f964i;
        this.f986j = rVar.f965j;
        this.f987k = rVar.f966k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f988l = proxySelector == null ? Q3.a.f2270a : proxySelector;
        this.f989m = rVar.f967l;
        this.n = rVar.f968m;
        List list2 = rVar.f969p;
        this.f991q = list2;
        this.f992r = rVar.f970q;
        this.f993s = rVar.f971r;
        this.v = rVar.f974u;
        this.f996w = rVar.v;
        this.f997x = rVar.f975w;
        this.f998y = new t1.h(11);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f913a) {
                    SSLSocketFactory sSLSocketFactory = rVar.n;
                    if (sSLSocketFactory != null) {
                        this.o = sSLSocketFactory;
                        O3.l lVar = rVar.f973t;
                        kotlin.jvm.internal.i.b(lVar);
                        this.f995u = lVar;
                        X509TrustManager x509TrustManager = rVar.o;
                        kotlin.jvm.internal.i.b(x509TrustManager);
                        this.f990p = x509TrustManager;
                        e eVar = rVar.f972s;
                        eVar.getClass();
                        this.f994t = kotlin.jvm.internal.i.a(eVar.f888b, lVar) ? eVar : new e(eVar.f887a, lVar);
                    } else {
                        O3.n nVar = O3.n.f2081a;
                        X509TrustManager m4 = O3.n.f2081a.m();
                        this.f990p = m4;
                        this.o = O3.n.f2081a.l(m4);
                        O3.l b4 = O3.n.f2081a.b(m4);
                        this.f995u = b4;
                        e eVar2 = rVar.f972s;
                        eVar2.getClass();
                        this.f994t = kotlin.jvm.internal.i.a(eVar2.f888b, b4) ? eVar2 : new e(eVar2.f887a, b4);
                    }
                    X509TrustManager x509TrustManager2 = this.f990p;
                    O3.l lVar2 = this.f995u;
                    SSLSocketFactory sSLSocketFactory2 = this.o;
                    List list3 = this.f980d;
                    list = this.f979c;
                    if (!list.contains(null)) {
                        throw new IllegalStateException(kotlin.jvm.internal.i.h(list, "Null interceptor: ").toString());
                    }
                    if (list3.contains(null)) {
                        throw new IllegalStateException(kotlin.jvm.internal.i.h(list3, "Null network interceptor: ").toString());
                    }
                    List list4 = this.f991q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((i) it2.next()).f913a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (lVar2 == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager2 == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (lVar2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!kotlin.jvm.internal.i.a(this.f994t, e.f886c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.o = null;
        this.f995u = null;
        this.f990p = null;
        this.f994t = e.f886c;
        X509TrustManager x509TrustManager22 = this.f990p;
        O3.l lVar22 = this.f995u;
        SSLSocketFactory sSLSocketFactory22 = this.o;
        List list32 = this.f980d;
        list = this.f979c;
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
