package b.a.b;

import b.a.e.g;
import b.aa;
import b.ac;
import b.ae;
import b.i;
import b.j;
import b.k;
import b.r;
import b.t;
import b.x;
import b.y;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* compiled from: RealConnection.java */
/* loaded from: classes.dex */
public final class c extends g.b implements i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1837a;

    /* renamed from: b, reason: collision with root package name */
    public int f1838b;

    /* renamed from: c, reason: collision with root package name */
    public int f1839c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final List<Reference<g>> f1840d = new ArrayList();
    public long e = Long.MAX_VALUE;
    private final j g;
    private final ae h;
    private Socket i;
    private Socket j;
    private r k;
    private y l;
    private b.a.e.g m;
    private c.e n;
    private c.d o;

    public c(j jVar, ae aeVar) {
        this.g = jVar;
        this.h = aeVar;
    }

    public void a(int i, int i2, int i3, boolean z) {
        if (this.l != null) {
            throw new IllegalStateException("already connected");
        }
        List<k> f = this.h.a().f();
        b bVar = new b(f);
        if (this.h.a().i() == null) {
            if (!f.contains(k.f2101c)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String f2 = this.h.a().a().f();
            if (!b.a.g.e.b().b(f2)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication to " + f2 + " not permitted by network security policy"));
            }
        }
        e eVar = null;
        do {
            try {
                if (this.h.d()) {
                    a(i, i2, i3);
                } else {
                    a(i, i2);
                }
                a(bVar);
                if (this.m != null) {
                    synchronized (this.g) {
                        this.f1839c = this.m.a();
                    }
                    return;
                }
                return;
            } catch (IOException e) {
                b.a.c.a(this.j);
                b.a.c.a(this.i);
                this.j = null;
                this.i = null;
                this.n = null;
                this.o = null;
                this.k = null;
                this.l = null;
                this.m = null;
                if (eVar == null) {
                    eVar = new e(e);
                } else {
                    eVar.a(e);
                }
                if (!z) {
                    throw eVar;
                }
            }
        } while (bVar.a(e));
        throw eVar;
    }

    private void a(int i, int i2, int i3) throws IOException {
        aa f = f();
        t a2 = f.a();
        int i4 = 0;
        while (true) {
            i4++;
            if (i4 > 21) {
                throw new ProtocolException("Too many tunnel connections attempted: 21");
            }
            a(i, i2);
            f = a(i2, i3, f, a2);
            if (f == null) {
                return;
            }
            b.a.c.a(this.i);
            this.i = null;
            this.o = null;
            this.n = null;
        }
    }

    private void a(int i, int i2) throws IOException {
        Socket createSocket;
        Proxy b2 = this.h.b();
        b.a a2 = this.h.a();
        if (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) {
            createSocket = a2.c().createSocket();
        } else {
            createSocket = new Socket(b2);
        }
        this.i = createSocket;
        this.i.setSoTimeout(i2);
        try {
            b.a.g.e.b().a(this.i, this.h.c(), i);
            this.n = c.k.a(c.k.b(this.i));
            this.o = c.k.a(c.k.a(this.i));
        } catch (ConnectException e) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.h.c());
            connectException.initCause(e);
            throw connectException;
        }
    }

    private void a(b bVar) throws IOException {
        if (this.h.a().i() == null) {
            this.l = y.HTTP_1_1;
            this.j = this.i;
            return;
        }
        b(bVar);
        if (this.l == y.HTTP_2) {
            this.j.setSoTimeout(0);
            this.m = new g.a(true).a(this.j, this.h.a().a().f(), this.n, this.o).a(this).a();
            this.m.c();
        }
    }

    private void b(b bVar) throws IOException {
        SSLSocket sSLSocket;
        y yVar;
        b.a a2 = this.h.a();
        try {
            try {
                sSLSocket = (SSLSocket) a2.i().createSocket(this.i, a2.a().f(), a2.a().g(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            k a3 = bVar.a(sSLSocket);
            if (a3.d()) {
                b.a.g.e.b().a(sSLSocket, a2.a().f(), a2.e());
            }
            sSLSocket.startHandshake();
            r a4 = r.a(sSLSocket.getSession());
            if (!a2.j().verify(a2.a().f(), sSLSocket.getSession())) {
                X509Certificate x509Certificate = (X509Certificate) a4.b().get(0);
                throw new SSLPeerUnverifiedException("Hostname " + a2.a().f() + " not verified:\n    certificate: " + b.g.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + b.a.i.d.a(x509Certificate));
            }
            a2.k().a(a2.a().f(), a4.b());
            String a5 = a3.d() ? b.a.g.e.b().a(sSLSocket) : null;
            this.j = sSLSocket;
            this.n = c.k.a(c.k.b(this.j));
            this.o = c.k.a(c.k.a(this.j));
            this.k = a4;
            if (a5 != null) {
                yVar = y.a(a5);
            } else {
                yVar = y.HTTP_1_1;
            }
            this.l = yVar;
            if (sSLSocket != null) {
                b.a.g.e.b().b(sSLSocket);
            }
        } catch (AssertionError e2) {
            e = e2;
            if (!b.a.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                b.a.g.e.b().b(sSLSocket);
            }
            b.a.c.a((Socket) sSLSocket);
            throw th;
        }
    }

    private aa a(int i, int i2, aa aaVar, t tVar) throws IOException {
        String str = "CONNECT " + b.a.c.a(tVar, true) + " HTTP/1.1";
        while (true) {
            b.a.d.a aVar = new b.a.d.a(null, null, this.n, this.o);
            this.n.a().a(i, TimeUnit.MILLISECONDS);
            this.o.a().a(i2, TimeUnit.MILLISECONDS);
            aVar.a(aaVar.c(), str);
            aVar.b();
            ac a2 = aVar.a(false).a(aaVar).a();
            long a3 = b.a.c.e.a(a2);
            if (a3 == -1) {
                a3 = 0;
            }
            c.r b2 = aVar.b(a3);
            b.a.c.b(b2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            b2.close();
            int b3 = a2.b();
            if (b3 == 200) {
                if (this.n.c().f() && this.o.c().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (b3 == 407) {
                aa a4 = this.h.a().d().a(this.h, a2);
                if (a4 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(a2.a("Connection"))) {
                    return a4;
                }
                aaVar = a4;
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a2.b());
            }
        }
    }

    private aa f() {
        return new aa.a().a(this.h.a().a()).a("Host", b.a.c.a(this.h.a().a(), true)).a("Proxy-Connection", "Keep-Alive").a("User-Agent", b.a.d.a()).a();
    }

    public boolean a(b.a aVar, ae aeVar) {
        if (this.f1840d.size() >= this.f1839c || this.f1837a || !b.a.a.f1807a.a(this.h.a(), aVar)) {
            return false;
        }
        if (aVar.a().f().equals(a().a().a().f())) {
            return true;
        }
        if (this.m == null || aeVar == null || aeVar.b().type() != Proxy.Type.DIRECT || this.h.b().type() != Proxy.Type.DIRECT || !this.h.c().equals(aeVar.c()) || aeVar.a().j() != b.a.i.d.f2030a || !a(aVar.a())) {
            return false;
        }
        try {
            aVar.k().a(aVar.a().f(), d().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(t tVar) {
        if (tVar.g() != this.h.a().a().g()) {
            return false;
        }
        if (tVar.f().equals(this.h.a().a().f())) {
            return true;
        }
        return this.k != null && b.a.i.d.f2030a.a(tVar.f(), (X509Certificate) this.k.b().get(0));
    }

    public b.a.c.c a(x xVar, g gVar) throws SocketException {
        if (this.m != null) {
            return new b.a.e.f(xVar, gVar, this.m);
        }
        this.j.setSoTimeout(xVar.b());
        this.n.a().a(xVar.b(), TimeUnit.MILLISECONDS);
        this.o.a().a(xVar.c(), TimeUnit.MILLISECONDS);
        return new b.a.d.a(xVar, gVar, this.n, this.o);
    }

    @Override // b.i
    public ae a() {
        return this.h;
    }

    public void b() {
        b.a.c.a(this.i);
    }

    public Socket c() {
        return this.j;
    }

    public boolean a(boolean z) {
        if (this.j.isClosed() || this.j.isInputShutdown() || this.j.isOutputShutdown()) {
            return false;
        }
        if (this.m != null) {
            return !this.m.d();
        }
        if (z) {
            try {
                int soTimeout = this.j.getSoTimeout();
                try {
                    this.j.setSoTimeout(1);
                    return !this.n.f();
                } finally {
                    this.j.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // b.a.e.g.b
    public void a(b.a.e.i iVar) throws IOException {
        iVar.a(b.a.e.b.REFUSED_STREAM);
    }

    @Override // b.a.e.g.b
    public void a(b.a.e.g gVar) {
        synchronized (this.g) {
            this.f1839c = gVar.a();
        }
    }

    public r d() {
        return this.k;
    }

    public boolean e() {
        return this.m != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.h.a().a().f());
        sb.append(":");
        sb.append(this.h.a().a().g());
        sb.append(", proxy=");
        sb.append(this.h.b());
        sb.append(" hostAddress=");
        sb.append(this.h.c());
        sb.append(" cipherSuite=");
        sb.append(this.k != null ? this.k.a() : "none");
        sb.append(" protocol=");
        sb.append(this.l);
        sb.append('}');
        return sb.toString();
    }
}
