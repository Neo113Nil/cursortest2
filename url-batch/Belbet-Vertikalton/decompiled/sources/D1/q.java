package D1;

import M1.v;
import X0.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import z1.s;
import z1.u;

/* loaded from: classes.dex */
public final class q implements E1.e {

    /* renamed from: a, reason: collision with root package name */
    public int f272a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f273b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f274c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f275d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f276f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f277g;

    public q(z1.a aVar, C1.d dVar, j jVar) {
        List j;
        j1.h.e(dVar, "routeDatabase");
        j1.h.e(jVar, "call");
        this.f273b = aVar;
        this.f274c = dVar;
        this.f275d = jVar;
        t tVar = t.f1385a;
        this.e = tVar;
        this.f276f = tVar;
        this.f277g = new ArrayList();
        z1.o oVar = aVar.f4813h;
        j1.h.e(oVar, "url");
        URI g2 = oVar.g();
        if (g2.getHost() == null) {
            j = A1.c.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f4812g.select(g2);
            j = (select == null || select.isEmpty()) ? A1.c.j(Proxy.NO_PROXY) : A1.c.v(select);
        }
        this.e = j;
        this.f272a = 0;
    }

    @Override // E1.e
    public void a() {
        ((M1.o) this.e).flush();
    }

    @Override // E1.e
    public void b(J.d dVar) {
        Proxy.Type type = ((m) this.f274c).f251b.f4955b.type();
        j1.h.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) dVar.f625b);
        sb.append(' ');
        z1.o oVar = (z1.o) dVar.f626c;
        if (oVar.i || type != Proxy.Type.HTTP) {
            String b2 = oVar.b();
            String d2 = oVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            sb.append(b2);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        j1.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((z1.m) dVar.f627d, sb2);
    }

    @Override // E1.e
    public void c() {
        ((M1.o) this.e).flush();
    }

    @Override // E1.e
    public void cancel() {
        Socket socket = ((m) this.f274c).f252c;
        if (socket != null) {
            A1.c.c(socket);
        }
    }

    @Override // E1.e
    public M1.t d(J.d dVar, long j) {
        if ("chunked".equalsIgnoreCase(((z1.m) dVar.f627d).a("Transfer-Encoding"))) {
            if (this.f272a == 1) {
                this.f272a = 2;
                return new F1.c(this);
            }
            throw new IllegalStateException(("state: " + this.f272a).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f272a == 1) {
            this.f272a = 2;
            return new F1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f272a).toString());
    }

    @Override // E1.e
    public v e(z1.v vVar) {
        if (!E1.f.a(vVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(z1.v.a("Transfer-Encoding", vVar))) {
            z1.o oVar = (z1.o) vVar.f4944a.f626c;
            if (this.f272a == 4) {
                this.f272a = 5;
                return new F1.d(this, oVar);
            }
            throw new IllegalStateException(("state: " + this.f272a).toString());
        }
        long i = A1.c.i(vVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f272a == 4) {
            this.f272a = 5;
            ((m) this.f274c).k();
            return new F1.g(this);
        }
        throw new IllegalStateException(("state: " + this.f272a).toString());
    }

    @Override // E1.e
    public long f(z1.v vVar) {
        if (!E1.f.a(vVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(z1.v.a("Transfer-Encoding", vVar))) {
            return -1L;
        }
        return A1.c.i(vVar);
    }

    @Override // E1.e
    public u g(boolean z2) {
        F1.a aVar = (F1.a) this.f276f;
        int i = this.f272a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f272a).toString());
        }
        try {
            String G2 = ((M1.p) aVar.f318c).G(aVar.f317b);
            aVar.f317b -= G2.length();
            D.d Z2 = H1.d.Z(G2);
            int i2 = Z2.f168b;
            u uVar = new u();
            uVar.f4935b = (z1.t) Z2.f169c;
            uVar.f4936c = i2;
            uVar.f4937d = (String) Z2.f170d;
            uVar.f4938f = aVar.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f272a = 3;
                return uVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f272a = 4;
                return uVar;
            }
            this.f272a = 3;
            return uVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f274c).f251b.f4954a.f4813h.f()), e);
        }
    }

    @Override // E1.e
    public m h() {
        return (m) this.f274c;
    }

    public boolean i() {
        return this.f272a < ((List) this.e).size() || !((ArrayList) this.f277g).isEmpty();
    }

    public F1.e j(long j) {
        if (this.f272a == 4) {
            this.f272a = 5;
            return new F1.e(this, j);
        }
        throw new IllegalStateException(("state: " + this.f272a).toString());
    }

    public void k(z1.m mVar, String str) {
        j1.h.e(str, "requestLine");
        if (this.f272a != 0) {
            throw new IllegalStateException(("state: " + this.f272a).toString());
        }
        M1.o oVar = (M1.o) this.e;
        oVar.p(str);
        oVar.p("\r\n");
        int size = mVar.size();
        for (int i = 0; i < size; i++) {
            oVar.p(mVar.b(i));
            oVar.p(": ");
            oVar.p(mVar.d(i));
            oVar.p("\r\n");
        }
        oVar.p("\r\n");
        this.f272a = 1;
    }

    public q(s sVar, m mVar, M1.p pVar, M1.o oVar) {
        j1.h.e(mVar, "connection");
        j1.h.e(pVar, "source");
        j1.h.e(oVar, "sink");
        this.f273b = sVar;
        this.f274c = mVar;
        this.f275d = pVar;
        this.e = oVar;
        this.f276f = new F1.a(pVar);
    }
}
