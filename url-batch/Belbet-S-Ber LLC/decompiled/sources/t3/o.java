package t3;

import a.k0;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o implements Cloneable {
    public static final List E = u3.b.i(p.HTTP_2, p.HTTP_1_1);
    public static final List F = u3.b.i(g.f3435e, g.f3436f);
    public final int A;
    public final int B;
    public final int C;
    public final q3.a D;

    /* renamed from: f, reason: collision with root package name */
    public final a0.k f3481f;

    /* renamed from: g, reason: collision with root package name */
    public final q3.a f3482g;
    public final List h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final k0 f3483j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3484k;

    /* renamed from: l, reason: collision with root package name */
    public final b f3485l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3486m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3487n;

    /* renamed from: o, reason: collision with root package name */
    public final b f3488o;

    /* renamed from: p, reason: collision with root package name */
    public final b f3489p;

    /* renamed from: q, reason: collision with root package name */
    public final ProxySelector f3490q;

    /* renamed from: r, reason: collision with root package name */
    public final b f3491r;

    /* renamed from: s, reason: collision with root package name */
    public final SocketFactory f3492s;

    /* renamed from: t, reason: collision with root package name */
    public final SSLSocketFactory f3493t;

    /* renamed from: u, reason: collision with root package name */
    public final X509TrustManager f3494u;

    /* renamed from: v, reason: collision with root package name */
    public final List f3495v;

    /* renamed from: w, reason: collision with root package name */
    public final List f3496w;

    /* renamed from: x, reason: collision with root package name */
    public final f4.c f3497x;

    /* renamed from: y, reason: collision with root package name */
    public final d f3498y;

    /* renamed from: z, reason: collision with root package name */
    public final b4.d f3499z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(n nVar) {
        List list;
        this.f3481f = nVar.f3464a;
        this.f3482g = nVar.f3465b;
        this.h = u3.b.u(nVar.f3466c);
        this.i = u3.b.u(nVar.d);
        this.f3483j = nVar.f3467e;
        this.f3484k = nVar.f3468f;
        this.f3485l = nVar.f3469g;
        this.f3486m = nVar.h;
        this.f3487n = nVar.i;
        this.f3488o = nVar.f3470j;
        this.f3489p = nVar.f3471k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3490q = proxySelector == null ? d4.a.f1307a : proxySelector;
        this.f3491r = nVar.f3472l;
        this.f3492s = nVar.f3473m;
        List list2 = nVar.f3474n;
        this.f3495v = list2;
        this.f3496w = nVar.f3475o;
        this.f3497x = nVar.f3476p;
        this.A = nVar.f3478r;
        this.B = nVar.f3479s;
        this.C = nVar.f3480t;
        this.D = new q3.a(11);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f3437a) {
                    b4.n nVar2 = b4.n.f853a;
                    X509TrustManager m4 = b4.n.f853a.m();
                    this.f3494u = m4;
                    this.f3493t = b4.n.f853a.l(m4);
                    b4.d b2 = b4.n.f853a.b(m4);
                    this.f3499z = b2;
                    d dVar = nVar.f3477q;
                    this.f3498y = i3.d.a(dVar.f3417b, b2) ? dVar : new d(dVar.f3416a, b2);
                    X509TrustManager x509TrustManager = this.f3494u;
                    b4.d dVar2 = this.f3499z;
                    SSLSocketFactory sSLSocketFactory = this.f3493t;
                    List list3 = this.i;
                    list = this.h;
                    i3.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    i3.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List list4 = this.f3495v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f3437a) {
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
                    if (!i3.d.a(this.f3498y, d.f3415c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f3493t = null;
        this.f3499z = null;
        this.f3494u = null;
        this.f3498y = d.f3415c;
        X509TrustManager x509TrustManager2 = this.f3494u;
        b4.d dVar22 = this.f3499z;
        SSLSocketFactory sSLSocketFactory2 = this.f3493t;
        List list32 = this.i;
        list = this.h;
        i3.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
