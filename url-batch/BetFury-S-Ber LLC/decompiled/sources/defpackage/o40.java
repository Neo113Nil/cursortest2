package defpackage;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o40 implements Cloneable {
    public static final List E = zk0.i(u60.HTTP_2, u60.HTTP_1_1);
    public static final List F = zk0.i(ne.e, ne.f);
    public final int A;
    public final int B;
    public final int C;
    public final kz D;
    public final wi f;
    public final o0 g;
    public final List h;
    public final List i;
    public final ij0 j;
    public final boolean k;
    public final sl l;
    public final boolean m;
    public final boolean n;
    public final sl o;
    public final sl p;
    public final ProxySelector q;
    public final sl r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final List v;
    public final List w;
    public final m40 x;
    public final xa y;
    public final n9 z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o40(n40 n40Var) {
        List list;
        this.f = n40Var.a;
        this.g = n40Var.b;
        this.h = zk0.u(n40Var.c);
        this.i = zk0.u(n40Var.d);
        this.j = n40Var.e;
        this.k = n40Var.f;
        this.l = n40Var.g;
        this.m = n40Var.h;
        this.n = n40Var.i;
        this.o = n40Var.j;
        this.p = n40Var.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.q = proxySelector == null ? g40.a : proxySelector;
        this.r = n40Var.l;
        this.s = n40Var.m;
        List list2 = n40Var.n;
        this.v = list2;
        this.w = n40Var.o;
        this.x = n40Var.p;
        this.A = n40Var.r;
        this.B = n40Var.s;
        this.C = n40Var.t;
        kz kzVar = new kz();
        kzVar.f = new LinkedHashSet();
        this.D = kzVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ne) it.next()).a) {
                    q50 q50Var = q50.a;
                    X509TrustManager m = q50.a.m();
                    this.u = m;
                    this.t = q50.a.l(m);
                    n9 b = q50.a.b(m);
                    this.z = b;
                    xa xaVar = n40Var.q;
                    this.y = mv.c(xaVar.b, b) ? xaVar : new xa(xaVar.a, b);
                    X509TrustManager x509TrustManager = this.u;
                    n9 n9Var = this.z;
                    SSLSocketFactory sSLSocketFactory = this.t;
                    List list3 = this.i;
                    list = this.h;
                    list.getClass();
                    if (!list.contains(null)) {
                        s9.t(list, "Null interceptor: ");
                        throw null;
                    }
                    list3.getClass();
                    if (list3.contains(null)) {
                        s9.t(list3, "Null network interceptor: ");
                        throw null;
                    }
                    List list4 = this.v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((ne) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    s9.u("sslSocketFactory == null");
                                    throw null;
                                }
                                if (n9Var == null) {
                                    s9.u("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager != null) {
                                    return;
                                }
                                s9.u("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        s9.u("Check failed.");
                        throw null;
                    }
                    if (n9Var != null) {
                        s9.u("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        s9.u("Check failed.");
                        throw null;
                    }
                    if (mv.c(this.y, xa.c)) {
                        return;
                    }
                    s9.u("Check failed.");
                    throw null;
                }
            }
        }
        this.t = null;
        this.z = null;
        this.u = null;
        this.y = xa.c;
        X509TrustManager x509TrustManager2 = this.u;
        n9 n9Var2 = this.z;
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
