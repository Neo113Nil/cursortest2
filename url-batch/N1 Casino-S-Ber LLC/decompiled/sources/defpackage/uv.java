package defpackage;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class uv implements Cloneable {
    public static final List E = r70.i(nx.HTTP_2, nx.HTTP_1_1);
    public static final List F = r70.i(dc.e, dc.f);
    public final int A;
    public final int B;
    public final int C;
    public final mr D;
    public final we f;
    public final k0 g;
    public final List h;
    public final List i;
    public final q60 j;
    public final boolean k;
    public final dh l;
    public final boolean m;
    public final boolean n;
    public final dh o;
    public final dh p;
    public final ProxySelector q;
    public final dh r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final List v;
    public final List w;
    public final sv x;
    public final r9 y;
    public final o8 z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uv(tv tvVar) {
        List list;
        this.f = tvVar.a;
        this.g = tvVar.b;
        this.h = r70.u(tvVar.c);
        this.i = r70.u(tvVar.d);
        this.j = tvVar.e;
        this.k = tvVar.f;
        this.l = tvVar.g;
        this.m = tvVar.h;
        this.n = tvVar.i;
        this.o = tvVar.j;
        this.p = tvVar.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.q = proxySelector == null ? qv.a : proxySelector;
        this.r = tvVar.l;
        this.s = tvVar.m;
        List list2 = tvVar.n;
        this.v = list2;
        this.w = tvVar.o;
        this.x = tvVar.p;
        this.A = tvVar.r;
        this.B = tvVar.s;
        this.C = tvVar.t;
        mr mrVar = new mr();
        mrVar.f = new LinkedHashSet();
        this.D = mrVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((dc) it.next()).a) {
                    ww wwVar = ww.a;
                    X509TrustManager m = ww.a.m();
                    this.u = m;
                    this.t = ww.a.l(m);
                    o8 b = ww.a.b(m);
                    this.z = b;
                    r9 r9Var = tvVar.q;
                    this.y = zo.b(r9Var.b, b) ? r9Var : new r9(r9Var.a, b);
                    X509TrustManager x509TrustManager = this.u;
                    o8 o8Var = this.z;
                    SSLSocketFactory sSLSocketFactory = this.t;
                    List list3 = this.i;
                    list = this.h;
                    list.getClass();
                    if (!list.contains(null)) {
                        t8.s(list, "Null interceptor: ");
                        throw null;
                    }
                    list3.getClass();
                    if (list3.contains(null)) {
                        t8.s(list3, "Null network interceptor: ");
                        throw null;
                    }
                    List list4 = this.v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((dc) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    t8.t("sslSocketFactory == null");
                                    throw null;
                                }
                                if (o8Var == null) {
                                    t8.t("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager != null) {
                                    return;
                                }
                                t8.t("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        t8.t("Check failed.");
                        throw null;
                    }
                    if (o8Var != null) {
                        t8.t("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        t8.t("Check failed.");
                        throw null;
                    }
                    if (zo.b(this.y, r9.c)) {
                        return;
                    }
                    t8.t("Check failed.");
                    throw null;
                }
            }
        }
        this.t = null;
        this.z = null;
        this.u = null;
        this.y = r9.c;
        X509TrustManager x509TrustManager2 = this.u;
        o8 o8Var2 = this.z;
        SSLSocketFactory sSLSocketFactory2 = this.t;
        List list32 = this.i;
        list = this.h;
        list.getClass();
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
