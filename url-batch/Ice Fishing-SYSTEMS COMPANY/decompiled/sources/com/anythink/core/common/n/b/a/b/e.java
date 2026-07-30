package com.anythink.core.common.n.b.a.b;

import D.y;
import com.anythink.core.common.n.b.C0545a;
import com.anythink.core.common.n.b.a.e.f;
import com.anythink.core.common.n.b.a.k.a;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ah;
import com.anythink.core.common.n.b.l;
import com.anythink.core.common.n.b.t;
import com.anythink.core.common.n.b.v;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.n;
import com.anythink.core.common.n.c.x;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e extends f.c implements com.anythink.core.common.n.b.j {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f15136g = true;
    private static final String i = "throw with null exception";

    /* renamed from: j, reason: collision with root package name */
    private static final int f15137j = 21;

    /* renamed from: a, reason: collision with root package name */
    public final f f15138a;

    /* renamed from: b, reason: collision with root package name */
    boolean f15139b;

    /* renamed from: c, reason: collision with root package name */
    int f15140c;

    /* renamed from: d, reason: collision with root package name */
    int f15141d;

    /* renamed from: k, reason: collision with root package name */
    private final ah f15144k;

    /* renamed from: l, reason: collision with root package name */
    private Socket f15145l;

    /* renamed from: m, reason: collision with root package name */
    private Socket f15146m;

    /* renamed from: n, reason: collision with root package name */
    private t f15147n;

    /* renamed from: o, reason: collision with root package name */
    private ab f15148o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.e.f f15149p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.core.common.n.c.e f15150q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.core.common.n.c.d f15151r;

    /* renamed from: s, reason: collision with root package name */
    private int f15152s;

    /* renamed from: t, reason: collision with root package name */
    private int f15153t = 1;

    /* renamed from: e, reason: collision with root package name */
    final List<Reference<j>> f15142e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    long f15143f = Long.MAX_VALUE;

    public e(f fVar, ah ahVar) {
        this.f15138a = fVar;
        this.f15144k = ahVar;
    }

    private static e a(f fVar, ah ahVar, Socket socket, long j9) {
        e eVar = new e(fVar, ahVar);
        eVar.f15146m = socket;
        eVar.f15143f = j9;
        return eVar;
    }

    private ad h() {
        ad b9 = new ad.a().a(this.f15144k.a().a()).a("CONNECT", (ae) null).a("Host", com.anythink.core.common.n.b.a.c.a(this.f15144k.a().a(), true)).a("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f19498c).b();
        ad authenticate = this.f15144k.a().d().authenticate(this.f15144k, new af.a().a(b9).a(ab.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.anythink.core.common.n.b.a.c.f15197d).a(-1L).b(-1L).a("Proxy-Authenticate", aa.f15620a + "-Preemptive").a());
        return authenticate != null ? authenticate : b9;
    }

    @Override // com.anythink.core.common.n.b.j
    public final Socket b() {
        return this.f15146m;
    }

    @Override // com.anythink.core.common.n.b.j
    public final t c() {
        return this.f15147n;
    }

    @Override // com.anythink.core.common.n.b.j
    public final ab d() {
        return this.f15148o;
    }

    public final void e() {
        if (!f15136g && Thread.holdsLock(this.f15138a)) {
            throw new AssertionError();
        }
        synchronized (this.f15138a) {
            this.f15139b = true;
        }
    }

    public final void f() {
        com.anythink.core.common.n.b.a.c.a(this.f15145l);
    }

    public final boolean g() {
        return this.f15149p != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f15144k.a().a().f());
        sb.append(":");
        sb.append(this.f15144k.a().a().g());
        sb.append(", proxy=");
        sb.append(this.f15144k.b());
        sb.append(" hostAddress=");
        sb.append(this.f15144k.c());
        sb.append(" cipherSuite=");
        t tVar = this.f15147n;
        sb.append(tVar != null ? tVar.b() : "none");
        sb.append(" protocol=");
        sb.append(this.f15148o);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i4, int i9, int i10, int i11, boolean z8) {
        if (this.f15148o == null) {
            List<l> f6 = this.f15144k.a().f();
            b bVar = new b(f6);
            if (this.f15144k.a().i() == null) {
                if (f6.contains(l.f15827d)) {
                    String f9 = this.f15144k.a().a().f();
                    if (!com.anythink.core.common.n.b.a.g.c.e().b(f9)) {
                        throw new h(new UnknownServiceException(y.k("CLEARTEXT communication to ", f9, " not permitted by network security policy")));
                    }
                } else {
                    throw new h(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f15144k.a().e().contains(ab.H2_PRIOR_KNOWLEDGE)) {
                throw new h(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            h hVar = null;
            do {
                try {
                    if (this.f15144k.d()) {
                        a(i4, i9, i10);
                        if (this.f15145l == null) {
                            if (!this.f15144k.d() && this.f15145l == null) {
                                throw new h(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            if (this.f15149p == null) {
                                synchronized (this.f15138a) {
                                    this.f15153t = this.f15149p.a();
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        a(i4, i9);
                    }
                    if (this.f15144k.a().i() == null) {
                        List<ab> e6 = this.f15144k.a().e();
                        ab abVar = ab.H2_PRIOR_KNOWLEDGE;
                        if (e6.contains(abVar)) {
                            this.f15146m = this.f15145l;
                            this.f15148o = abVar;
                            a(i11);
                        } else {
                            this.f15146m = this.f15145l;
                            this.f15148o = ab.HTTP_1_1;
                        }
                    } else {
                        a(bVar);
                        if (this.f15148o == ab.HTTP_2) {
                            a(i11);
                        }
                    }
                    this.f15144k.c();
                    this.f15144k.b();
                    if (!this.f15144k.d()) {
                    }
                    if (this.f15149p == null) {
                    }
                } catch (IOException e9) {
                    com.anythink.core.common.n.b.a.c.a(this.f15146m);
                    com.anythink.core.common.n.b.a.c.a(this.f15145l);
                    this.f15146m = null;
                    this.f15145l = null;
                    this.f15150q = null;
                    this.f15151r = null;
                    this.f15147n = null;
                    this.f15148o = null;
                    this.f15149p = null;
                    this.f15144k.c();
                    this.f15144k.b();
                    if (hVar == null) {
                        hVar = new h(e9);
                    } else {
                        hVar.a(e9);
                    }
                    if (!z8) {
                        throw hVar;
                    }
                }
            } while (bVar.a(e9));
            throw hVar;
        }
        throw new IllegalStateException("already connected");
    }

    private void a(int i4, int i9) {
        Socket createSocket;
        Proxy b9 = this.f15144k.b();
        C0545a a9 = this.f15144k.a();
        if (b9.type() != Proxy.Type.DIRECT && b9.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(b9);
        } else {
            createSocket = a9.c().createSocket();
        }
        this.f15145l = createSocket;
        this.f15144k.c();
        this.f15145l.setSoTimeout(i9);
        try {
            com.anythink.core.common.n.b.a.g.c.e().a(this.f15145l, this.f15144k.c(), i4);
            try {
                this.f15150q = n.a(n.b(this.f15145l));
                this.f15151r = n.a(n.a(this.f15145l));
            } catch (NullPointerException e6) {
                if (i.equals(e6.getMessage())) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f15144k.c());
            connectException.initCause(e9);
            throw connectException;
        }
    }

    private void a(b bVar, int i4) {
        if (this.f15144k.a().i() == null) {
            List<ab> e6 = this.f15144k.a().e();
            ab abVar = ab.H2_PRIOR_KNOWLEDGE;
            if (e6.contains(abVar)) {
                this.f15146m = this.f15145l;
                this.f15148o = abVar;
                a(i4);
                return;
            } else {
                this.f15146m = this.f15145l;
                this.f15148o = ab.HTTP_1_1;
                return;
            }
        }
        a(bVar);
        if (this.f15148o == ab.HTTP_2) {
            a(i4);
        }
    }

    private void a(int i4) {
        this.f15146m.setSoTimeout(0);
        com.anythink.core.common.n.b.a.e.f a9 = new f.a().a(this.f15146m, this.f15144k.a().a().f(), this.f15150q, this.f15151r).a(this).a(i4).a();
        this.f15149p = a9;
        a9.b();
    }

    private void a(b bVar) {
        SSLSocket sSLSocket;
        ab abVar;
        C0545a a9 = this.f15144k.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) a9.i().createSocket(this.f15145l, a9.a().f(), a9.a().g(), true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (AssertionError e6) {
            e = e6;
        }
        try {
            l a10 = bVar.a(sSLSocket);
            if (a10.a()) {
                com.anythink.core.common.n.b.a.g.c.e().a(sSLSocket, a9.a().f(), a9.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            t a11 = t.a(session);
            if (!a9.j().verify(a9.a().f(), session)) {
                List<Certificate> c4 = a11.c();
                if (!c4.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) c4.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + a9.a().f() + " not verified:\n    certificate: " + com.anythink.core.common.n.b.g.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.anythink.core.common.n.b.a.j.e.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + a9.a().f() + " not verified (no certificates)");
            }
            a9.k().a(a9.a().f(), a11.c());
            String a12 = a10.a() ? com.anythink.core.common.n.b.a.g.c.e().a(sSLSocket) : null;
            this.f15146m = sSLSocket;
            this.f15150q = n.a(n.b(sSLSocket));
            this.f15151r = n.a(n.a(this.f15146m));
            this.f15147n = a11;
            if (a12 != null) {
                abVar = ab.a(a12);
            } else {
                abVar = ab.HTTP_1_1;
            }
            this.f15148o = abVar;
            com.anythink.core.common.n.b.a.g.c.e();
        } catch (AssertionError e9) {
            e = e9;
            if (!com.anythink.core.common.n.b.a.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                com.anythink.core.common.n.b.a.g.c.e();
            }
            com.anythink.core.common.n.b.a.c.a((Socket) sSLSocket2);
            throw th;
        }
    }

    private ad a(int i4, int i9, ad adVar, v vVar) {
        String str = "CONNECT " + com.anythink.core.common.n.b.a.c.a(vVar, true) + " HTTP/1.1";
        while (true) {
            com.anythink.core.common.n.b.a.d.a aVar = new com.anythink.core.common.n.b.a.d.a(null, null, this.f15150q, this.f15151r);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f15150q.a().a(i4, timeUnit);
            this.f15151r.a().a(i9, timeUnit);
            aVar.a(adVar.c(), str);
            aVar.c();
            af a9 = aVar.a(false).a(adVar).a();
            aVar.c(a9);
            int c4 = a9.c();
            if (c4 == 200) {
                if (this.f15150q.d().g() && this.f15151r.c().g()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (c4 == 407) {
                ad authenticate = this.f15144k.a().d().authenticate(this.f15144k, a9);
                if (authenticate != null) {
                    if (com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(a9.a("Connection"))) {
                        return authenticate;
                    }
                    adVar = authenticate;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a9.c());
            }
        }
    }

    public final boolean a(C0545a c0545a, List<ah> list) {
        if (this.f15142e.size() >= this.f15153t || this.f15139b || !com.anythink.core.common.n.b.a.a.f15027a.a(this.f15144k.a(), c0545a)) {
            return false;
        }
        if (c0545a.a().f().equals(this.f15144k.a().a().f())) {
            return true;
        }
        if (this.f15149p != null && list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ah ahVar = list.get(i4);
                Proxy.Type type = ahVar.b().type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                if (type == type2 && this.f15144k.b().type() == type2 && this.f15144k.c().equals(ahVar.c())) {
                    if (c0545a.j() != com.anythink.core.common.n.b.a.j.e.f15533a || !a(c0545a.a())) {
                        return false;
                    }
                    try {
                        c0545a.k().a(c0545a.a().f(), this.f15147n.c());
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private boolean a(List<ah> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ah ahVar = list.get(i4);
            Proxy.Type type = ahVar.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f15144k.b().type() == type2 && this.f15144k.c().equals(ahVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(v vVar) {
        if (vVar.g() != this.f15144k.a().a().g()) {
            return false;
        }
        if (vVar.f().equals(this.f15144k.a().a().f())) {
            return true;
        }
        if (this.f15147n != null) {
            com.anythink.core.common.n.b.a.j.e eVar = com.anythink.core.common.n.b.a.j.e.f15533a;
            if (com.anythink.core.common.n.b.a.j.e.a(vVar.f(), (X509Certificate) this.f15147n.c().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final com.anythink.core.common.n.b.a.c.c a(z zVar, w.a aVar) {
        if (this.f15149p != null) {
            return new com.anythink.core.common.n.b.a.e.g(zVar, this, aVar, this.f15149p);
        }
        this.f15146m.setSoTimeout(aVar.e());
        x a9 = this.f15150q.a();
        long e6 = aVar.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a9.a(e6, timeUnit);
        this.f15151r.a().a(aVar.f(), timeUnit);
        return new com.anythink.core.common.n.b.a.d.a(zVar, this, this.f15150q, this.f15151r);
    }

    public final a.e a(final c cVar) {
        this.f15146m.setSoTimeout(0);
        e();
        return new a.e(this.f15150q, this.f15151r) { // from class: com.anythink.core.common.n.b.a.b.e.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cVar.a(true, true, null);
            }
        };
    }

    @Override // com.anythink.core.common.n.b.j
    public final ah a() {
        return this.f15144k;
    }

    public final boolean a(boolean z8) {
        if (this.f15146m.isClosed() || this.f15146m.isInputShutdown() || this.f15146m.isOutputShutdown()) {
            return false;
        }
        com.anythink.core.common.n.b.a.e.f fVar = this.f15149p;
        if (fVar != null) {
            return fVar.b(System.nanoTime());
        }
        if (z8) {
            try {
                int soTimeout = this.f15146m.getSoTimeout();
                try {
                    this.f15146m.setSoTimeout(1);
                    return !this.f15150q.g();
                } finally {
                    this.f15146m.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.anythink.core.common.n.b.a.e.f.c
    public final void a(com.anythink.core.common.n.b.a.e.i iVar) {
        iVar.a(com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM, (IOException) null);
    }

    @Override // com.anythink.core.common.n.b.a.e.f.c
    public final void a(com.anythink.core.common.n.b.a.e.f fVar) {
        synchronized (this.f15138a) {
            this.f15153t = fVar.a();
        }
    }

    public final void a(IOException iOException) {
        if (!f15136g && Thread.holdsLock(this.f15138a)) {
            throw new AssertionError();
        }
        synchronized (this.f15138a) {
            try {
                if (iOException instanceof com.anythink.core.common.n.b.a.e.n) {
                    com.anythink.core.common.n.b.a.e.b bVar = ((com.anythink.core.common.n.b.a.e.n) iOException).f15494a;
                    if (bVar == com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM) {
                        int i4 = this.f15152s + 1;
                        this.f15152s = i4;
                        if (i4 > 1) {
                            this.f15139b = true;
                            this.f15140c++;
                        }
                    } else if (bVar != com.anythink.core.common.n.b.a.e.b.CANCEL) {
                        this.f15139b = true;
                        this.f15140c++;
                    }
                } else if (!g() || (iOException instanceof com.anythink.core.common.n.b.a.e.a)) {
                    this.f15139b = true;
                    if (this.f15141d == 0) {
                        if (iOException != null) {
                            f fVar = this.f15138a;
                            ah ahVar = this.f15144k;
                            if (ahVar.b().type() != Proxy.Type.DIRECT) {
                                C0545a a9 = ahVar.a();
                                a9.g().connectFailed(a9.a().a(), ahVar.b().address(), iOException);
                            }
                            fVar.f15158a.a(ahVar);
                        }
                        this.f15140c++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            throw th;
        }
    }

    private void a(int i4, int i9, int i10) {
        ad b9 = new ad.a().a(this.f15144k.a().a()).a("CONNECT", (ae) null).a("Host", com.anythink.core.common.n.b.a.c.a(this.f15144k.a().a(), true)).a("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f19498c).b();
        ad authenticate = this.f15144k.a().d().authenticate(this.f15144k, new af.a().a(b9).a(ab.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.anythink.core.common.n.b.a.c.f15197d).a(-1L).b(-1L).a("Proxy-Authenticate", aa.f15620a + "-Preemptive").a());
        if (authenticate != null) {
            b9 = authenticate;
        }
        v a9 = b9.a();
        for (int i11 = 0; i11 < 21; i11++) {
            a(i4, i9);
            b9 = a(i9, i10, b9, a9);
            if (b9 == null) {
                return;
            }
            com.anythink.core.common.n.b.a.c.a(this.f15145l);
            this.f15145l = null;
            this.f15151r = null;
            this.f15150q = null;
            this.f15144k.c();
            this.f15144k.b();
        }
    }
}
