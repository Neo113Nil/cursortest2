package K2;

import B.C0011l;
import B.Y;
import C0.q;
import G2.r;
import G2.s;
import G2.t;
import S1.u;
import T2.D;
import T2.F;
import T2.x;
import T2.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements L2.e {

    /* renamed from: a, reason: collision with root package name */
    public int f3332a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3333b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3334c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3335d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3336e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3337f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3338g;

    public n(G2.a aVar, Y y3, g gVar) {
        List k3;
        f2.j.f(y3, "routeDatabase");
        f2.j.f(gVar, "call");
        this.f3333b = aVar;
        this.f3334c = y3;
        this.f3335d = gVar;
        u uVar = u.f4320d;
        this.f3336e = uVar;
        this.f3337f = uVar;
        this.f3338g = new ArrayList();
        G2.n nVar = aVar.f2133h;
        f2.j.f(nVar, "url");
        URI g3 = nVar.g();
        if (g3.getHost() == null) {
            k3 = H2.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f2132g.select(g3);
            k3 = (select == null || select.isEmpty()) ? H2.b.k(Proxy.NO_PROXY) : H2.b.w(select);
        }
        this.f3336e = k3;
        this.f3332a = 0;
    }

    @Override // L2.e
    public long a(G2.u uVar) {
        if (!L2.f.a(uVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(G2.u.a(uVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return H2.b.j(uVar);
    }

    @Override // L2.e
    public void b(q qVar) {
        Proxy.Type type = ((j) this.f3334c).f3307b.f2312b.type();
        f2.j.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) qVar.f631d);
        sb.append(' ');
        G2.n nVar = (G2.n) qVar.f630c;
        if (nVar.f2223i || type != Proxy.Type.HTTP) {
            String b3 = nVar.b();
            String d3 = nVar.d();
            if (d3 != null) {
                b3 = b3 + '?' + d3;
            }
            sb.append(b3);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        k((G2.l) qVar.f632e, sb2);
    }

    @Override // L2.e
    public D c(q qVar, long j3) {
        if ("chunked".equalsIgnoreCase(((G2.l) qVar.f632e).b("Transfer-Encoding"))) {
            if (this.f3332a == 1) {
                this.f3332a = 2;
                return new M2.c(this);
            }
            throw new IllegalStateException(("state: " + this.f3332a).toString());
        }
        if (j3 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3332a == 1) {
            this.f3332a = 2;
            return new M2.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3332a).toString());
    }

    @Override // L2.e
    public void cancel() {
        Socket socket = ((j) this.f3334c).f3308c;
        if (socket != null) {
            H2.b.d(socket);
        }
    }

    @Override // L2.e
    public void d() {
        ((x) this.f3336e).flush();
    }

    @Override // L2.e
    public void e() {
        ((x) this.f3336e).flush();
    }

    @Override // L2.e
    public t f(boolean z3) {
        M2.a aVar = (M2.a) this.f3337f;
        int i3 = this.f3332a;
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            throw new IllegalStateException(("state: " + this.f3332a).toString());
        }
        G2.m mVar = null;
        try {
            String u3 = ((z) aVar.f3481b).u(aVar.f3480a);
            aVar.f3480a -= u3.length();
            C0011l a02 = O2.d.a0(u3);
            int i4 = a02.f421e;
            t tVar = new t();
            tVar.f2282b = (s) a02.f422f;
            tVar.f2283c = i4;
            tVar.f2284d = (String) a02.f423g;
            tVar.f2286f = aVar.a().d();
            if (z3 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.f3332a = 3;
            } else if (102 > i4 || i4 >= 200) {
                this.f3332a = 4;
            } else {
                this.f3332a = 3;
            }
            return tVar;
        } catch (EOFException e3) {
            G2.n nVar = ((j) this.f3334c).f3307b.f2311a.f2133h;
            nVar.getClass();
            try {
                G2.m mVar2 = new G2.m();
                mVar2.c(nVar, "/...");
                mVar = mVar2;
            } catch (IllegalArgumentException unused) {
            }
            f2.j.c(mVar);
            mVar.f2210f = G2.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            mVar.f2211g = G2.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException("unexpected end of stream on ".concat(mVar.a().f2222h), e3);
        }
    }

    @Override // L2.e
    public F g(G2.u uVar) {
        if (!L2.f.a(uVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(G2.u.a(uVar, "Transfer-Encoding"))) {
            G2.n nVar = (G2.n) uVar.f2294d.f630c;
            if (this.f3332a == 4) {
                this.f3332a = 5;
                return new M2.d(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f3332a).toString());
        }
        long j3 = H2.b.j(uVar);
        if (j3 != -1) {
            return j(j3);
        }
        if (this.f3332a == 4) {
            this.f3332a = 5;
            ((j) this.f3334c).k();
            return new M2.g(this);
        }
        throw new IllegalStateException(("state: " + this.f3332a).toString());
    }

    @Override // L2.e
    public j h() {
        return (j) this.f3334c;
    }

    public boolean i() {
        return this.f3332a < ((List) this.f3336e).size() || !((ArrayList) this.f3338g).isEmpty();
    }

    public M2.e j(long j3) {
        if (this.f3332a == 4) {
            this.f3332a = 5;
            return new M2.e(this, j3);
        }
        throw new IllegalStateException(("state: " + this.f3332a).toString());
    }

    public void k(G2.l lVar, String str) {
        f2.j.f(str, "requestLine");
        if (this.f3332a != 0) {
            throw new IllegalStateException(("state: " + this.f3332a).toString());
        }
        x xVar = (x) this.f3336e;
        xVar.o(str);
        xVar.o("\r\n");
        int size = lVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            xVar.o(lVar.c(i3));
            xVar.o(": ");
            xVar.o(lVar.i(i3));
            xVar.o("\r\n");
        }
        xVar.o("\r\n");
        this.f3332a = 1;
    }

    public n(r rVar, j jVar, z zVar, x xVar) {
        f2.j.f(jVar, "connection");
        f2.j.f(zVar, "source");
        f2.j.f(xVar, "sink");
        this.f3333b = rVar;
        this.f3334c = jVar;
        this.f3335d = zVar;
        this.f3336e = xVar;
        this.f3337f = new M2.a(zVar);
    }
}
