package c3;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q implements Cloneable {
    public static final List E = d3.c.i(r.HTTP_2, r.HTTP_1_1);
    public static final List F = d3.c.i(h.f1050e, h.f1051f);
    public final int A;
    public final int B;
    public final int C;
    public final a2.e D;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.emoji2.text.w f1102f;
    public final a2.e g;
    public final List h;

    /* renamed from: i, reason: collision with root package name */
    public final List f1103i;

    /* renamed from: j, reason: collision with root package name */
    public final d3.a f1104j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1105k;

    /* renamed from: l, reason: collision with root package name */
    public final b f1106l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1107m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1108n;

    /* renamed from: o, reason: collision with root package name */
    public final b f1109o;

    /* renamed from: p, reason: collision with root package name */
    public final b f1110p;

    /* renamed from: q, reason: collision with root package name */
    public final ProxySelector f1111q;

    /* renamed from: r, reason: collision with root package name */
    public final b f1112r;

    /* renamed from: s, reason: collision with root package name */
    public final SocketFactory f1113s;

    /* renamed from: t, reason: collision with root package name */
    public final SSLSocketFactory f1114t;

    /* renamed from: u, reason: collision with root package name */
    public final X509TrustManager f1115u;

    /* renamed from: v, reason: collision with root package name */
    public final List f1116v;

    /* renamed from: w, reason: collision with root package name */
    public final List f1117w;

    /* renamed from: x, reason: collision with root package name */
    public final o3.c f1118x;

    /* renamed from: y, reason: collision with root package name */
    public final d f1119y;

    /* renamed from: z, reason: collision with root package name */
    public final l0.g f1120z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(p pVar) {
        List list;
        this.f1102f = pVar.f1085a;
        this.g = pVar.f1086b;
        this.h = d3.c.u(pVar.c);
        this.f1103i = d3.c.u(pVar.f1087d);
        this.f1104j = pVar.f1088e;
        this.f1105k = pVar.f1089f;
        this.f1106l = pVar.g;
        this.f1107m = pVar.h;
        this.f1108n = pVar.f1090i;
        this.f1109o = pVar.f1091j;
        this.f1110p = pVar.f1092k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f1111q = proxySelector == null ? m3.a.f2918a : proxySelector;
        this.f1112r = pVar.f1093l;
        this.f1113s = pVar.f1094m;
        List list2 = pVar.f1095n;
        this.f1116v = list2;
        this.f1117w = pVar.f1096o;
        this.f1118x = pVar.f1097p;
        this.A = pVar.f1099r;
        this.B = pVar.f1100s;
        this.C = pVar.f1101t;
        this.D = new a2.e(15);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f1052a) {
                    k3.o oVar = k3.o.f2841a;
                    X509TrustManager m4 = k3.o.f2841a.m();
                    this.f1115u = m4;
                    this.f1114t = k3.o.f2841a.l(m4);
                    l0.g b2 = k3.o.f2841a.b(m4);
                    this.f1120z = b2;
                    d dVar = pVar.f1098q;
                    this.f1119y = u2.c.a(dVar.f1029b, b2) ? dVar : new d(dVar.f1028a, b2);
                    X509TrustManager x509TrustManager = this.f1115u;
                    l0.g gVar = this.f1120z;
                    SSLSocketFactory sSLSocketFactory = this.f1114t;
                    List list3 = this.f1103i;
                    list = this.h;
                    u2.c.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    u2.c.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List list4 = this.f1116v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f1052a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (gVar == null) {
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
                    if (gVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!u2.c.a(this.f1119y, d.c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f1114t = null;
        this.f1120z = null;
        this.f1115u = null;
        this.f1119y = d.c;
        X509TrustManager x509TrustManager2 = this.f1115u;
        l0.g gVar2 = this.f1120z;
        SSLSocketFactory sSLSocketFactory2 = this.f1114t;
        List list32 = this.f1103i;
        list = this.h;
        u2.c.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
