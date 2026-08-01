package defpackage;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xy implements Cloneable {
    public static final List E = cb0.i(q00.HTTP_2, q00.HTTP_1_1);
    public static final List F = cb0.i(dd.e, dd.f);
    public final int A;
    public final int B;
    public final int C;
    public final pw D;
    public final rg f;
    public final rc0 g;
    public final List h;
    public final List i;
    public final ab0 j;
    public final boolean k;
    public final ej l;
    public final boolean m;
    public final boolean n;
    public final ej o;
    public final ej p;
    public final ProxySelector q;
    public final ej r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final List v;
    public final List w;
    public final vy x;
    public final ea y;
    public final xf z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xy(wy wyVar) {
        List list;
        this.f = wyVar.a;
        this.g = wyVar.b;
        this.h = cb0.u(wyVar.c);
        this.i = cb0.u(wyVar.d);
        this.j = wyVar.e;
        this.k = wyVar.f;
        this.l = wyVar.g;
        this.m = wyVar.h;
        this.n = wyVar.i;
        this.o = wyVar.j;
        this.p = wyVar.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.q = proxySelector == null ? sy.a : proxySelector;
        this.r = wyVar.l;
        this.s = wyVar.m;
        List list2 = wyVar.n;
        this.v = list2;
        this.w = wyVar.o;
        this.x = wyVar.p;
        this.A = wyVar.r;
        this.B = wyVar.s;
        this.C = wyVar.t;
        pw pwVar = new pw();
        pwVar.f = new LinkedHashSet();
        this.D = pwVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((dd) it.next()).a) {
                    zz zzVar = zz.a;
                    X509TrustManager m = zz.a.m();
                    this.u = m;
                    this.t = zz.a.l(m);
                    xf b = zz.a.b(m);
                    this.z = b;
                    ea eaVar = wyVar.q;
                    this.y = kr.b(eaVar.b, b) ? eaVar : new ea(eaVar.a, b);
                    X509TrustManager x509TrustManager = this.u;
                    xf xfVar = this.z;
                    SSLSocketFactory sSLSocketFactory = this.t;
                    List list3 = this.i;
                    list = this.h;
                    list.getClass();
                    if (!list.contains(null)) {
                        g9.t(list, "Null interceptor: ");
                        throw null;
                    }
                    list3.getClass();
                    if (list3.contains(null)) {
                        g9.t(list3, "Null network interceptor: ");
                        throw null;
                    }
                    List list4 = this.v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((dd) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    g9.s("sslSocketFactory == null");
                                    throw null;
                                }
                                if (xfVar == null) {
                                    g9.s("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager != null) {
                                    return;
                                }
                                g9.s("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        g9.s("Check failed.");
                        throw null;
                    }
                    if (xfVar != null) {
                        g9.s("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        g9.s("Check failed.");
                        throw null;
                    }
                    if (kr.b(this.y, ea.c)) {
                        return;
                    }
                    g9.s("Check failed.");
                    throw null;
                }
            }
        }
        this.t = null;
        this.z = null;
        this.u = null;
        this.y = ea.c;
        X509TrustManager x509TrustManager2 = this.u;
        xf xfVar2 = this.z;
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
