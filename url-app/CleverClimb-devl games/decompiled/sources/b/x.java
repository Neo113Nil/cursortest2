package b;

import b.ac;
import b.e;
import b.p;
import b.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: OkHttpClient.java */
/* loaded from: classes.dex */
public class x implements e.a, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final List<y> f2155a = b.a.c.a(y.HTTP_2, y.HTTP_1_1);

    /* renamed from: b, reason: collision with root package name */
    static final List<k> f2156b = b.a.c.a(k.f2099a, k.f2101c);
    final int A;
    final int B;
    final int C;

    /* renamed from: c, reason: collision with root package name */
    final n f2157c;

    /* renamed from: d, reason: collision with root package name */
    final Proxy f2158d;
    final List<y> e;
    final List<k> f;
    final List<u> g;
    final List<u> h;
    final p.a i;
    final ProxySelector j;
    final m k;
    final c l;
    final b.a.a.e m;
    final SocketFactory n;
    final SSLSocketFactory o;
    final b.a.i.b p;
    final HostnameVerifier q;
    final g r;
    final b s;
    final b t;
    final j u;
    final o v;
    final boolean w;
    final boolean x;
    final boolean y;
    final int z;

    static {
        b.a.a.f1807a = new b.a.a() { // from class: b.x.1
            @Override // b.a.a
            public void a(s.a aVar, String str) {
                aVar.a(str);
            }

            @Override // b.a.a
            public void a(s.a aVar, String str, String str2) {
                aVar.b(str, str2);
            }

            @Override // b.a.a
            public boolean a(j jVar, b.a.b.c cVar) {
                return jVar.b(cVar);
            }

            @Override // b.a.a
            public b.a.b.c a(j jVar, b.a aVar, b.a.b.g gVar, ae aeVar) {
                return jVar.a(aVar, gVar, aeVar);
            }

            @Override // b.a.a
            public boolean a(b.a aVar, b.a aVar2) {
                return aVar.a(aVar2);
            }

            @Override // b.a.a
            public Socket a(j jVar, b.a aVar, b.a.b.g gVar) {
                return jVar.a(aVar, gVar);
            }

            @Override // b.a.a
            public void b(j jVar, b.a.b.c cVar) {
                jVar.a(cVar);
            }

            @Override // b.a.a
            public b.a.b.d a(j jVar) {
                return jVar.f2096a;
            }

            @Override // b.a.a
            public int a(ac.a aVar) {
                return aVar.f2054c;
            }

            @Override // b.a.a
            public void a(k kVar, SSLSocket sSLSocket, boolean z) {
                kVar.a(sSLSocket, z);
            }
        };
    }

    public x() {
        this(new a());
    }

    x(a aVar) {
        boolean z;
        this.f2157c = aVar.f2159a;
        this.f2158d = aVar.f2160b;
        this.e = aVar.f2161c;
        this.f = aVar.f2162d;
        this.g = b.a.c.a(aVar.e);
        this.h = b.a.c.a(aVar.f);
        this.i = aVar.g;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        Iterator<k> it = this.f.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().a();
            }
        }
        if (aVar.m != null || !z) {
            this.o = aVar.m;
            this.p = aVar.n;
        } else {
            X509TrustManager z2 = z();
            this.o = a(z2);
            this.p = b.a.i.b.a(z2);
        }
        this.q = aVar.o;
        this.r = aVar.p.a(this.p);
        this.s = aVar.q;
        this.t = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
    }

    private X509TrustManager z() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            return (X509TrustManager) trustManagers[0];
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance(org.apache.a.c.d.d.TLS);
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public int a() {
        return this.z;
    }

    public int b() {
        return this.A;
    }

    public int c() {
        return this.B;
    }

    public Proxy d() {
        return this.f2158d;
    }

    public ProxySelector e() {
        return this.j;
    }

    public m f() {
        return this.k;
    }

    b.a.a.e g() {
        return this.l != null ? this.l.f2072a : this.m;
    }

    public o h() {
        return this.v;
    }

    public SocketFactory i() {
        return this.n;
    }

    public SSLSocketFactory j() {
        return this.o;
    }

    public HostnameVerifier k() {
        return this.q;
    }

    public g l() {
        return this.r;
    }

    public b m() {
        return this.t;
    }

    public b n() {
        return this.s;
    }

    public j o() {
        return this.u;
    }

    public boolean p() {
        return this.w;
    }

    public boolean q() {
        return this.x;
    }

    public boolean r() {
        return this.y;
    }

    public n s() {
        return this.f2157c;
    }

    public List<y> t() {
        return this.e;
    }

    public List<k> u() {
        return this.f;
    }

    public List<u> v() {
        return this.g;
    }

    public List<u> w() {
        return this.h;
    }

    p.a x() {
        return this.i;
    }

    @Override // b.e.a
    public e a(aa aaVar) {
        return new z(this, aaVar, false);
    }

    public a y() {
        return new a(this);
    }

    /* compiled from: OkHttpClient.java */
    public static final class a {
        int A;

        /* renamed from: a, reason: collision with root package name */
        n f2159a;

        /* renamed from: b, reason: collision with root package name */
        Proxy f2160b;

        /* renamed from: c, reason: collision with root package name */
        List<y> f2161c;

        /* renamed from: d, reason: collision with root package name */
        List<k> f2162d;
        final List<u> e;
        final List<u> f;
        p.a g;
        ProxySelector h;
        m i;
        c j;
        b.a.a.e k;
        SocketFactory l;
        SSLSocketFactory m;
        b.a.i.b n;
        HostnameVerifier o;
        g p;
        b q;
        b r;
        j s;
        o t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public a() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.f2159a = new n();
            this.f2161c = x.f2155a;
            this.f2162d = x.f2156b;
            this.g = p.a(p.f2117a);
            this.h = ProxySelector.getDefault();
            this.i = m.f2111a;
            this.l = SocketFactory.getDefault();
            this.o = b.a.i.d.f2030a;
            this.p = g.f2082a;
            this.q = b.f2071a;
            this.r = b.f2071a;
            this.s = new j();
            this.t = o.f2116a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 10000;
            this.y = 10000;
            this.z = 10000;
            this.A = 0;
        }

        a(x xVar) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.f2159a = xVar.f2157c;
            this.f2160b = xVar.f2158d;
            this.f2161c = xVar.e;
            this.f2162d = xVar.f;
            this.e.addAll(xVar.g);
            this.f.addAll(xVar.h);
            this.g = xVar.i;
            this.h = xVar.j;
            this.i = xVar.k;
            this.k = xVar.m;
            this.j = xVar.l;
            this.l = xVar.n;
            this.m = xVar.o;
            this.n = xVar.p;
            this.o = xVar.q;
            this.p = xVar.r;
            this.q = xVar.s;
            this.r = xVar.t;
            this.s = xVar.u;
            this.t = xVar.v;
            this.u = xVar.w;
            this.v = xVar.x;
            this.w = xVar.y;
            this.x = xVar.z;
            this.y = xVar.A;
            this.z = xVar.B;
            this.A = xVar.C;
        }

        public a a(long j, TimeUnit timeUnit) {
            this.y = a("timeout", j, timeUnit);
            return this;
        }

        private static int a(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }

        public a a(u uVar) {
            this.e.add(uVar);
            return this;
        }

        public x a() {
            return new x(this);
        }
    }
}
