package defpackage;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bw implements Cloneable {
    public static final List E = y70.i(dy.HTTP_2, dy.HTTP_1_1);
    public static final List F = y70.i(hc.e, hc.f);
    public final int A;
    public final int B;
    public final int C;
    public final tx D;
    public final h8 f;
    public final j1 g;
    public final List h;
    public final List i;
    public final w60 j;
    public final boolean k;
    public final vg l;
    public final boolean m;
    public final boolean n;
    public final vg o;
    public final vg p;
    public final ProxySelector q;
    public final vg r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final List v;
    public final List w;
    public final zv x;
    public final n9 y;
    public final l70 z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bw(aw awVar) {
        List list;
        this.f = awVar.a;
        this.g = awVar.b;
        this.h = y70.u(awVar.c);
        this.i = y70.u(awVar.d);
        this.j = awVar.e;
        this.k = awVar.f;
        this.l = awVar.g;
        this.m = awVar.h;
        this.n = awVar.i;
        this.o = awVar.j;
        this.p = awVar.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.q = proxySelector == null ? wv.a : proxySelector;
        this.r = awVar.l;
        this.s = awVar.m;
        List list2 = awVar.n;
        this.v = list2;
        this.w = awVar.o;
        this.x = awVar.p;
        this.A = awVar.r;
        this.B = awVar.s;
        this.C = awVar.t;
        tx txVar = new tx();
        txVar.f = new LinkedHashSet();
        this.D = txVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((hc) it.next()).a) {
                    jx jxVar = jx.a;
                    X509TrustManager m = jx.a.m();
                    this.u = m;
                    this.t = jx.a.l(m);
                    l70 b = jx.a.b(m);
                    this.z = b;
                    n9 n9Var = awVar.q;
                    this.y = op.d(n9Var.b, b) ? n9Var : new n9(n9Var.a, b);
                    X509TrustManager x509TrustManager = this.u;
                    l70 l70Var = this.z;
                    SSLSocketFactory sSLSocketFactory = this.t;
                    List list3 = this.i;
                    list = this.h;
                    list.getClass();
                    if (!list.contains(null)) {
                        o8.s(list, "Null interceptor: ");
                        throw null;
                    }
                    list3.getClass();
                    if (list3.contains(null)) {
                        o8.s(list3, "Null network interceptor: ");
                        throw null;
                    }
                    List list4 = this.v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((hc) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    o8.t("sslSocketFactory == null");
                                    throw null;
                                }
                                if (l70Var == null) {
                                    o8.t("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager != null) {
                                    return;
                                }
                                o8.t("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        o8.t("Check failed.");
                        throw null;
                    }
                    if (l70Var != null) {
                        o8.t("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        o8.t("Check failed.");
                        throw null;
                    }
                    if (op.d(this.y, n9.c)) {
                        return;
                    }
                    o8.t("Check failed.");
                    throw null;
                }
            }
        }
        this.t = null;
        this.z = null;
        this.u = null;
        this.y = n9.c;
        X509TrustManager x509TrustManager2 = this.u;
        l70 l70Var2 = this.z;
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
