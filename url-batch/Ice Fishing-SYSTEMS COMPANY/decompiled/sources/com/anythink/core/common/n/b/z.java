package com.anythink.core.common.n.b;

import android.os.Build;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.aj;
import com.anythink.core.common.n.b.e;
import com.anythink.core.common.n.b.l;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.u;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class z implements aj.a, e.a, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final List<ab> f15933a = com.anythink.core.common.n.b.a.c.a(ab.HTTP_2, ab.HTTP_1_1);

    /* renamed from: b, reason: collision with root package name */
    static final List<l> f15934b = com.anythink.core.common.n.b.a.c.a(l.f15825b, l.f15827d);

    /* renamed from: A, reason: collision with root package name */
    final int f15935A;

    /* renamed from: B, reason: collision with root package name */
    final int f15936B;

    /* renamed from: C, reason: collision with root package name */
    final int f15937C;

    /* renamed from: D, reason: collision with root package name */
    final int f15938D;

    /* renamed from: c, reason: collision with root package name */
    final p f15939c;

    /* renamed from: d, reason: collision with root package name */
    final Proxy f15940d;

    /* renamed from: e, reason: collision with root package name */
    final List<ab> f15941e;

    /* renamed from: f, reason: collision with root package name */
    final List<l> f15942f;

    /* renamed from: g, reason: collision with root package name */
    final List<w> f15943g;

    /* renamed from: h, reason: collision with root package name */
    final List<w> f15944h;
    final r.a i;

    /* renamed from: j, reason: collision with root package name */
    final ProxySelector f15945j;

    /* renamed from: k, reason: collision with root package name */
    final n f15946k;

    /* renamed from: l, reason: collision with root package name */
    final c f15947l;

    /* renamed from: m, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.f f15948m;

    /* renamed from: n, reason: collision with root package name */
    final SocketFactory f15949n;

    /* renamed from: o, reason: collision with root package name */
    final SSLSocketFactory f15950o;

    /* renamed from: p, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.j.c f15951p;

    /* renamed from: q, reason: collision with root package name */
    final HostnameVerifier f15952q;

    /* renamed from: r, reason: collision with root package name */
    final g f15953r;

    /* renamed from: s, reason: collision with root package name */
    final b f15954s;

    /* renamed from: t, reason: collision with root package name */
    final b f15955t;

    /* renamed from: u, reason: collision with root package name */
    final k f15956u;

    /* renamed from: v, reason: collision with root package name */
    final q f15957v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f15958w;

    /* renamed from: x, reason: collision with root package name */
    final boolean f15959x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f15960y;

    /* renamed from: z, reason: collision with root package name */
    final int f15961z;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        int f15962A;

        /* renamed from: B, reason: collision with root package name */
        int f15963B;

        /* renamed from: a, reason: collision with root package name */
        p f15964a;

        /* renamed from: b, reason: collision with root package name */
        Proxy f15965b;

        /* renamed from: c, reason: collision with root package name */
        List<ab> f15966c;

        /* renamed from: d, reason: collision with root package name */
        List<l> f15967d;

        /* renamed from: e, reason: collision with root package name */
        final List<w> f15968e;

        /* renamed from: f, reason: collision with root package name */
        final List<w> f15969f;

        /* renamed from: g, reason: collision with root package name */
        r.a f15970g;

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f15971h;
        n i;

        /* renamed from: j, reason: collision with root package name */
        c f15972j;

        /* renamed from: k, reason: collision with root package name */
        com.anythink.core.common.n.b.a.a.f f15973k;

        /* renamed from: l, reason: collision with root package name */
        SocketFactory f15974l;

        /* renamed from: m, reason: collision with root package name */
        SSLSocketFactory f15975m;

        /* renamed from: n, reason: collision with root package name */
        com.anythink.core.common.n.b.a.j.c f15976n;

        /* renamed from: o, reason: collision with root package name */
        HostnameVerifier f15977o;

        /* renamed from: p, reason: collision with root package name */
        g f15978p;

        /* renamed from: q, reason: collision with root package name */
        b f15979q;

        /* renamed from: r, reason: collision with root package name */
        b f15980r;

        /* renamed from: s, reason: collision with root package name */
        k f15981s;

        /* renamed from: t, reason: collision with root package name */
        q f15982t;

        /* renamed from: u, reason: collision with root package name */
        boolean f15983u;

        /* renamed from: v, reason: collision with root package name */
        boolean f15984v;

        /* renamed from: w, reason: collision with root package name */
        boolean f15985w;

        /* renamed from: x, reason: collision with root package name */
        int f15986x;

        /* renamed from: y, reason: collision with root package name */
        int f15987y;

        /* renamed from: z, reason: collision with root package name */
        int f15988z;

        public a() {
            this.f15968e = new ArrayList();
            this.f15969f = new ArrayList();
            this.f15964a = new p();
            this.f15966c = z.f15933a;
            this.f15967d = z.f15934b;
            this.f15970g = r.a(r.f15867a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f15971h = proxySelector;
            if (proxySelector == null) {
                this.f15971h = new com.anythink.core.common.n.b.a.h.a();
            }
            this.i = n.f15857a;
            this.f15974l = SocketFactory.getDefault();
            this.f15977o = com.anythink.core.common.n.b.a.j.e.f15533a;
            this.f15978p = g.f15763a;
            b bVar = b.f15700a;
            this.f15979q = bVar;
            this.f15980r = bVar;
            this.f15981s = new k();
            this.f15982t = q.f15866a;
            this.f15983u = true;
            this.f15984v = true;
            this.f15985w = true;
            this.f15986x = 0;
            this.f15987y = 10000;
            this.f15988z = 10000;
            this.f15962A = 10000;
            this.f15963B = 0;
        }

        private a a(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15986x = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a b(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15987y = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a c(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15988z = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a d(long j9, TimeUnit timeUnit) {
            this.f15986x = com.anythink.core.common.n.b.a.c.a("timeout", j9, timeUnit);
            return this;
        }

        private a e(long j9, TimeUnit timeUnit) {
            this.f15963B = com.anythink.core.common.n.b.a.c.a("interval", j9, timeUnit);
            return this;
        }

        private a d(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15962A = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a e(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15963B = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        public final a a(long j9, TimeUnit timeUnit) {
            this.f15987y = com.anythink.core.common.n.b.a.c.a("timeout", j9, timeUnit);
            return this;
        }

        public final a b(long j9, TimeUnit timeUnit) {
            this.f15988z = com.anythink.core.common.n.b.a.c.a("timeout", j9, timeUnit);
            return this;
        }

        public final a c(long j9, TimeUnit timeUnit) {
            this.f15962A = com.anythink.core.common.n.b.a.c.a("timeout", j9, timeUnit);
            return this;
        }

        private a a(Proxy proxy) {
            this.f15965b = proxy;
            return this;
        }

        private a b(b bVar) {
            if (bVar != null) {
                this.f15979q = bVar;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        private a c(boolean z8) {
            this.f15985w = z8;
            return this;
        }

        private a a(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.f15971h = proxySelector;
                return this;
            }
            throw new NullPointerException("proxySelector == null");
        }

        private List<w> c() {
            return this.f15969f;
        }

        private a b(boolean z8) {
            this.f15984v = z8;
            return this;
        }

        private a a(n nVar) {
            if (nVar != null) {
                this.i = nVar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        private a b(List<l> list) {
            this.f15967d = com.anythink.core.common.n.b.a.c.a(list);
            return this;
        }

        private List<w> b() {
            return this.f15968e;
        }

        private a a(c cVar) {
            this.f15972j = cVar;
            this.f15973k = null;
            return this;
        }

        private a b(w wVar) {
            if (wVar != null) {
                this.f15969f.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final a a(q qVar) {
            this.f15982t = qVar;
            return this;
        }

        private a a(SocketFactory socketFactory) {
            if (socketFactory != null) {
                if (!(socketFactory instanceof SSLSocketFactory)) {
                    this.f15974l = socketFactory;
                    return this;
                }
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            throw new NullPointerException("socketFactory == null");
        }

        private a a(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.f15975m = sSLSocketFactory;
                this.f15976n = com.anythink.core.common.n.b.a.g.c.e().b(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        private a a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager != null) {
                this.f15975m = sSLSocketFactory;
                this.f15976n = com.anythink.core.common.n.b.a.g.c.e().a(x509TrustManager);
                return this;
            }
            throw new NullPointerException("trustManager == null");
        }

        private a a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f15977o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public a(z zVar) {
            ArrayList arrayList = new ArrayList();
            this.f15968e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f15969f = arrayList2;
            this.f15964a = zVar.f15939c;
            this.f15965b = zVar.f15940d;
            this.f15966c = zVar.f15941e;
            this.f15967d = zVar.f15942f;
            arrayList.addAll(zVar.f15943g);
            arrayList2.addAll(zVar.f15944h);
            this.f15970g = zVar.i;
            this.f15971h = zVar.f15945j;
            this.i = zVar.f15946k;
            this.f15973k = zVar.f15948m;
            this.f15972j = zVar.f15947l;
            this.f15974l = zVar.f15949n;
            this.f15975m = zVar.f15950o;
            this.f15976n = zVar.f15951p;
            this.f15977o = zVar.f15952q;
            this.f15978p = zVar.f15953r;
            this.f15979q = zVar.f15954s;
            this.f15980r = zVar.f15955t;
            this.f15981s = zVar.f15956u;
            this.f15982t = zVar.f15957v;
            this.f15983u = zVar.f15958w;
            this.f15984v = zVar.f15959x;
            this.f15985w = zVar.f15960y;
            this.f15986x = zVar.f15961z;
            this.f15987y = zVar.f15935A;
            this.f15988z = zVar.f15936B;
            this.f15962A = zVar.f15937C;
            this.f15963B = zVar.f15938D;
        }

        private a a(g gVar) {
            if (gVar != null) {
                this.f15978p = gVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        private a a(b bVar) {
            if (bVar != null) {
                this.f15980r = bVar;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public final a a(k kVar) {
            if (kVar != null) {
                this.f15981s = kVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        private a a(boolean z8) {
            this.f15983u = z8;
            return this;
        }

        public final a a(p pVar) {
            this.f15964a = pVar;
            return this;
        }

        public final a a(List<ab> list) {
            ArrayList arrayList = new ArrayList(list);
            ab abVar = ab.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(abVar) && !arrayList.contains(ab.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(String.valueOf(arrayList)));
            }
            if (arrayList.contains(abVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: ".concat(String.valueOf(arrayList)));
            }
            if (!arrayList.contains(ab.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(ab.SPDY_3);
                    this.f15966c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(arrayList)));
        }

        private a a(w wVar) {
            if (wVar != null) {
                this.f15968e.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final a a(r rVar) {
            if (rVar != null) {
                this.f15970g = r.a(rVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        private a a(r.a aVar) {
            if (aVar != null) {
                this.f15970g = aVar;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        public final z a() {
            return new z(this);
        }
    }

    static {
        com.anythink.core.common.n.b.a.a.f15027a = new com.anythink.core.common.n.b.a.a() { // from class: com.anythink.core.common.n.b.z.1
            @Override // com.anythink.core.common.n.b.a.a
            public final void a(u.a aVar, String str) {
                aVar.a(str);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(u.a aVar, String str, String str2) {
                aVar.c(str, str2);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final com.anythink.core.common.n.b.a.b.f a(k kVar) {
                return kVar.f15823a;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final boolean a(C0545a c0545a, C0545a c0545a2) {
                return c0545a.a(c0545a2);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final int a(af.a aVar) {
                return aVar.f15672c;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final e a(z zVar, ad adVar) {
                return ac.a(zVar, adVar, true);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final com.anythink.core.common.n.b.a.b.c a(af afVar) {
                return afVar.f15668m;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(l lVar, SSLSocket sSLSocket, boolean z8) {
                String[] enabledCipherSuites;
                String[] enabledProtocols;
                if (lVar.f15831g != null) {
                    enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(i.f15798a, sSLSocket.getEnabledCipherSuites(), lVar.f15831g);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (lVar.f15832h != null) {
                    enabledProtocols = com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15200g, sSLSocket.getEnabledProtocols(), lVar.f15832h);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a9 = com.anythink.core.common.n.b.a.c.a(i.f15798a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z8 && a9 != -1) {
                    enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(enabledCipherSuites, supportedCipherSuites[a9]);
                }
                l b9 = new l.a(lVar).a(enabledCipherSuites).b(enabledProtocols).b();
                String[] strArr = b9.f15832h;
                if (strArr != null) {
                    sSLSocket.setEnabledProtocols(strArr);
                }
                String[] strArr2 = b9.f15831g;
                if (strArr2 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr2);
                }
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(af.a aVar, com.anythink.core.common.n.b.a.b.c cVar) {
                aVar.f15681m = cVar;
            }
        };
    }

    public z() {
        this(new a());
    }

    private List<w> A() {
        return this.f15943g;
    }

    private List<w> B() {
        return this.f15944h;
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext c4 = com.anythink.core.common.n.b.a.g.c.e().c();
            c4.init(null, new TrustManager[]{x509TrustManager}, null);
            return c4.getSocketFactory();
        } catch (GeneralSecurityException e6) {
            throw new AssertionError("No System TLS", e6);
        }
    }

    private int u() {
        return this.f15935A;
    }

    private int v() {
        return this.f15936B;
    }

    private int w() {
        return this.f15937C;
    }

    private c x() {
        return this.f15947l;
    }

    private com.anythink.core.common.n.b.a.a.f y() {
        c cVar = this.f15947l;
        return cVar != null ? cVar.f15705a : this.f15948m;
    }

    private p z() {
        return this.f15939c;
    }

    public final int b() {
        return this.f15938D;
    }

    public final Proxy c() {
        return this.f15940d;
    }

    public final ProxySelector d() {
        return this.f15945j;
    }

    public final n e() {
        return this.f15946k;
    }

    public final q f() {
        return this.f15957v;
    }

    public final SocketFactory g() {
        return this.f15949n;
    }

    public final SSLSocketFactory h() {
        return this.f15950o;
    }

    public final HostnameVerifier i() {
        return this.f15952q;
    }

    public final g j() {
        return this.f15953r;
    }

    public final b k() {
        return this.f15955t;
    }

    public final b l() {
        return this.f15954s;
    }

    public final k m() {
        return this.f15956u;
    }

    public final boolean n() {
        return this.f15958w;
    }

    public final boolean o() {
        return this.f15959x;
    }

    public final boolean p() {
        return this.f15960y;
    }

    public final List<ab> q() {
        return this.f15941e;
    }

    public final List<l> r() {
        return this.f15942f;
    }

    public final r.a s() {
        return this.i;
    }

    public final a t() {
        return new a(this);
    }

    public z(a aVar) {
        boolean z8;
        this.f15939c = aVar.f15964a;
        this.f15940d = aVar.f15965b;
        this.f15941e = aVar.f15966c;
        List<l> list = aVar.f15967d;
        this.f15942f = list;
        this.f15943g = com.anythink.core.common.n.b.a.c.a(aVar.f15968e);
        this.f15944h = com.anythink.core.common.n.b.a.c.a(aVar.f15969f);
        this.i = aVar.f15970g;
        this.f15945j = aVar.f15971h;
        this.f15946k = aVar.i;
        this.f15947l = aVar.f15972j;
        this.f15948m = aVar.f15973k;
        this.f15949n = aVar.f15974l;
        Iterator<l> it = list.iterator();
        loop0: while (true) {
            z8 = false;
            while (it.hasNext()) {
                z8 = (z8 || it.next().f15829e) ? true : z8;
            }
        }
        SSLSocketFactory sSLSocketFactory = aVar.f15975m;
        if (sSLSocketFactory == null && z8) {
            X509TrustManager a9 = com.anythink.core.common.n.b.a.c.a();
            this.f15950o = a(a9);
            this.f15951p = com.anythink.core.common.n.b.a.g.c.e().a(a9);
        } else {
            this.f15950o = sSLSocketFactory;
            this.f15951p = aVar.f15976n;
        }
        if (this.f15950o != null) {
            com.anythink.core.common.n.b.a.g.c.e();
        }
        this.f15952q = aVar.f15977o;
        this.f15953r = aVar.f15978p.a(this.f15951p);
        this.f15954s = aVar.f15979q;
        this.f15955t = aVar.f15980r;
        this.f15956u = aVar.f15981s;
        this.f15957v = aVar.f15982t;
        this.f15958w = aVar.f15983u;
        this.f15959x = aVar.f15984v;
        this.f15960y = aVar.f15985w;
        this.f15961z = aVar.f15986x;
        this.f15935A = aVar.f15987y;
        this.f15936B = aVar.f15988z;
        this.f15937C = aVar.f15962A;
        this.f15938D = aVar.f15963B;
        if (this.f15943g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f15943g);
        }
        if (this.f15944h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f15944h);
        }
    }

    public final int a() {
        return this.f15961z;
    }

    @Override // com.anythink.core.common.n.b.e.a
    public final e a(ad adVar) {
        return ac.a(this, adVar, false);
    }

    @Override // com.anythink.core.common.n.b.aj.a
    public final aj a(ad adVar, ak akVar) {
        com.anythink.core.common.n.b.a.k.a aVar = new com.anythink.core.common.n.b.a.k.a(adVar, akVar, new Random(), this.f15938D);
        aVar.a(this);
        return aVar;
    }
}
