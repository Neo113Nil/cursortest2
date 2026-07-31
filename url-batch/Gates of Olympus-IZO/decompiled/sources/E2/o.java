package E2;

import A2.C0002a;
import A2.C0003b;
import A2.p;
import A2.q;
import A2.v;
import A2.w;
import A2.y;
import M1.u;
import N2.D;
import N2.F;
import N2.x;
import N2.z;
import a.AbstractC0157a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements F2.e {

    /* renamed from: a, reason: collision with root package name */
    public int f845a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f846b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f847c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f848d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f849e;

    /* renamed from: f, reason: collision with root package name */
    public Object f850f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f851g;

    public o(C0002a c0002a, A2.g gVar, h hVar) {
        List k3;
        Z1.i.f(gVar, "routeDatabase");
        Z1.i.f(hVar, "call");
        this.f846b = c0002a;
        this.f847c = gVar;
        this.f848d = hVar;
        u uVar = u.f2803d;
        this.f849e = uVar;
        this.f850f = uVar;
        this.f851g = new ArrayList();
        q qVar = c0002a.f40h;
        Z1.i.f(qVar, "url");
        URI g3 = qVar.g();
        if (g3.getHost() == null) {
            k3 = B2.c.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c0002a.f39g.select(g3);
            k3 = (select == null || select.isEmpty()) ? B2.c.k(Proxy.NO_PROXY) : B2.c.w(select);
        }
        this.f849e = k3;
        this.f845a = 0;
    }

    @Override // F2.e
    public long a(y yVar) {
        if (!F2.f.a(yVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return B2.c.j(yVar);
    }

    @Override // F2.e
    public void b() {
        ((x) this.f849e).flush();
    }

    @Override // F2.e
    public F c(y yVar) {
        if (!F2.f.a(yVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) {
            q qVar = (q) yVar.f211d.f193b;
            if (this.f845a == 4) {
                this.f845a = 5;
                return new G2.d(this, qVar);
            }
            throw new IllegalStateException(("state: " + this.f845a).toString());
        }
        long j3 = B2.c.j(yVar);
        if (j3 != -1) {
            return j(j3);
        }
        if (this.f845a == 4) {
            this.f845a = 5;
            ((k) this.f847c).k();
            return new G2.g(this);
        }
        throw new IllegalStateException(("state: " + this.f845a).toString());
    }

    @Override // F2.e
    public void cancel() {
        Socket socket = ((k) this.f847c).f822c;
        if (socket != null) {
            B2.c.d(socket);
        }
    }

    @Override // F2.e
    public void d() {
        ((x) this.f849e).flush();
    }

    @Override // F2.e
    public D e(w wVar, long j3) {
        if ("chunked".equalsIgnoreCase(((A2.o) wVar.f195d).b("Transfer-Encoding"))) {
            if (this.f845a == 1) {
                this.f845a = 2;
                return new G2.c(this);
            }
            throw new IllegalStateException(("state: " + this.f845a).toString());
        }
        if (j3 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f845a == 1) {
            this.f845a = 2;
            return new G2.f(this);
        }
        throw new IllegalStateException(("state: " + this.f845a).toString());
    }

    @Override // F2.e
    public A2.x f(boolean z3) {
        G2.a aVar = (G2.a) this.f850f;
        int i3 = this.f845a;
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            throw new IllegalStateException(("state: " + this.f845a).toString());
        }
        p pVar = null;
        try {
            String u3 = ((z) aVar.f1581b).u(aVar.f1580a);
            aVar.f1580a -= u3.length();
            F2.h O3 = AbstractC0157a.O(u3);
            int i4 = O3.f1502e;
            A2.x xVar = new A2.x();
            xVar.f199b = (v) O3.f1503f;
            xVar.f200c = i4;
            xVar.f201d = (String) O3.f1504g;
            xVar.f203f = aVar.a().d();
            if (z3 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.f845a = 3;
            } else if (102 > i4 || i4 >= 200) {
                this.f845a = 4;
            } else {
                this.f845a = 3;
            }
            return xVar;
        } catch (EOFException e3) {
            q qVar = ((k) this.f847c).f821b.f23a.f40h;
            qVar.getClass();
            try {
                p pVar2 = new p();
                pVar2.c(qVar, "/...");
                pVar = pVar2;
            } catch (IllegalArgumentException unused) {
            }
            Z1.i.c(pVar);
            pVar.f121b = C0003b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            pVar.f122c = C0003b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException("unexpected end of stream on ".concat(pVar.a().f136h), e3);
        }
    }

    @Override // F2.e
    public void g(w wVar) {
        Proxy.Type type = ((k) this.f847c).f821b.f24b.type();
        Z1.i.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) wVar.f194c);
        sb.append(' ');
        q qVar = (q) wVar.f193b;
        if (qVar.f137i || type != Proxy.Type.HTTP) {
            String b2 = qVar.b();
            String d3 = qVar.d();
            if (d3 != null) {
                b2 = b2 + '?' + d3;
            }
            sb.append(b2);
        } else {
            sb.append(qVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        k((A2.o) wVar.f195d, sb2);
    }

    @Override // F2.e
    public k h() {
        return (k) this.f847c;
    }

    public boolean i() {
        return this.f845a < ((List) this.f849e).size() || !((ArrayList) this.f851g).isEmpty();
    }

    public G2.e j(long j3) {
        if (this.f845a == 4) {
            this.f845a = 5;
            return new G2.e(this, j3);
        }
        throw new IllegalStateException(("state: " + this.f845a).toString());
    }

    public void k(A2.o oVar, String str) {
        Z1.i.f(str, "requestLine");
        if (this.f845a != 0) {
            throw new IllegalStateException(("state: " + this.f845a).toString());
        }
        x xVar = (x) this.f849e;
        xVar.F(str);
        xVar.F("\r\n");
        int size = oVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            xVar.F(oVar.c(i3));
            xVar.F(": ");
            xVar.F(oVar.i(i3));
            xVar.F("\r\n");
        }
        xVar.F("\r\n");
        this.f845a = 1;
    }

    public o(A2.u uVar, k kVar, z zVar, x xVar) {
        Z1.i.f(kVar, "connection");
        Z1.i.f(zVar, "source");
        Z1.i.f(xVar, "sink");
        this.f846b = uVar;
        this.f847c = kVar;
        this.f848d = zVar;
        this.f849e = xVar;
        this.f850f = new G2.a(zVar);
    }
}
