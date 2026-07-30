package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fu1 implements Cloneable {
    public static final List L = n33.i(s52.HTTP_2, s52.HTTP_1_1);
    public static final List M = n33.i(f10.e, f10.f);
    public final SSLSocketFactory A;
    public final X509TrustManager B;
    public final List C;
    public final List D;
    public final eu1 E;
    public final dt F;
    public final yj1 G;
    public final int H;
    public final int I;
    public final int J;
    public final at0 K;
    public final js0 m;
    public final ar0 n;
    public final List o;
    public final List p;
    public final ch2 q;
    public final boolean r;
    public final qb2 s;
    public final boolean t;
    public final boolean u;
    public final qb2 v;
    public final qb2 w;
    public final ProxySelector x;
    public final qb2 y;
    public final SocketFactory z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fu1() {
        List list;
        js0 js0Var = new js0(4);
        ar0 ar0Var = new ar0(15);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ch2 ch2Var = new ch2(13);
        qb2 qb2Var = qb2.E;
        qb2 qb2Var2 = qb2.L;
        qb2 qb2Var3 = qb2.O;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        List list2 = M;
        List list3 = L;
        eu1 eu1Var = eu1.a;
        dt dtVar = dt.c;
        this.m = js0Var;
        this.n = ar0Var;
        this.o = n33.t(arrayList);
        this.p = n33.t(arrayList2);
        this.q = ch2Var;
        this.r = true;
        this.s = qb2Var;
        this.t = true;
        this.u = true;
        this.v = qb2Var2;
        this.w = qb2Var3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.x = proxySelector == null ? ht1.a : proxySelector;
        this.y = qb2Var;
        this.z = socketFactory;
        this.C = list2;
        this.D = list3;
        this.E = eu1Var;
        this.H = 10000;
        this.I = 10000;
        this.J = 10000;
        this.K = new at0(19);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((f10) it.next()).a) {
                    r12 r12Var = r12.a;
                    X509TrustManager m = r12.a.m();
                    this.B = m;
                    this.A = r12.a.l(m);
                    yj1 b = r12.a.b(m);
                    this.G = b;
                    this.F = Intrinsics.b(dtVar.b, b) ? dtVar : new dt(dtVar.a, b);
                    X509TrustManager x509TrustManager = this.B;
                    yj1 yj1Var = this.G;
                    SSLSocketFactory sSLSocketFactory = this.A;
                    List list4 = this.p;
                    list = this.o;
                    list.getClass();
                    if (!list.contains(null)) {
                        b71.u(list, "Null interceptor: ");
                        throw null;
                    }
                    list4.getClass();
                    if (list4.contains(null)) {
                        b71.u(list4, "Null network interceptor: ");
                        throw null;
                    }
                    List list5 = this.C;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((f10) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    lh.g("sslSocketFactory == null");
                                    throw null;
                                }
                                if (yj1Var == null) {
                                    lh.g("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager != null) {
                                    return;
                                }
                                lh.g("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        lh.g("Check failed.");
                        throw null;
                    }
                    if (yj1Var != null) {
                        lh.g("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        lh.g("Check failed.");
                        throw null;
                    }
                    if (Intrinsics.b(this.F, dt.c)) {
                        return;
                    }
                    lh.g("Check failed.");
                    throw null;
                }
            }
        }
        this.A = null;
        this.G = null;
        this.B = null;
        this.F = dt.c;
        X509TrustManager x509TrustManager2 = this.B;
        yj1 yj1Var2 = this.G;
        SSLSocketFactory sSLSocketFactory2 = this.A;
        List list42 = this.p;
        list = this.o;
        list.getClass();
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
