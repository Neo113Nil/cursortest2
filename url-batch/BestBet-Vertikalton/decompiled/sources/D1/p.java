package D1;

import M1.t;
import M1.v;
import Y0.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import z1.q;
import z1.r;

/* loaded from: classes.dex */
public final class p implements E1.e {

    /* renamed from: a, reason: collision with root package name */
    public int f211a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f212b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f213c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f214e;

    /* renamed from: f, reason: collision with root package name */
    public Object f215f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f216g;

    public p(z1.a aVar, A0.c cVar, j jVar) {
        List j2;
        k1.e.e(cVar, "routeDatabase");
        k1.e.e(jVar, "call");
        this.f212b = aVar;
        this.f213c = cVar;
        this.d = jVar;
        s sVar = s.f1516a;
        this.f214e = sVar;
        this.f215f = sVar;
        this.f216g = new ArrayList();
        z1.l lVar = aVar.h;
        k1.e.e(lVar, "url");
        URI g2 = lVar.g();
        if (g2.getHost() == null) {
            j2 = A1.c.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f4631g.select(g2);
            j2 = (select == null || select.isEmpty()) ? A1.c.j(Proxy.NO_PROXY) : A1.c.v(select);
        }
        this.f214e = j2;
        this.f211a = 0;
    }

    @Override // E1.e
    public void a() {
        ((M1.o) this.f214e).flush();
    }

    @Override // E1.e
    public void b() {
        ((M1.o) this.f214e).flush();
    }

    @Override // E1.e
    public v c(z1.s sVar) {
        if (!E1.f.a(sVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(z1.s.a("Transfer-Encoding", sVar))) {
            z1.l lVar = (z1.l) sVar.f4759a.f483c;
            if (this.f211a == 4) {
                this.f211a = 5;
                return new F1.d(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.f211a).toString());
        }
        long i = A1.c.i(sVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f211a == 4) {
            this.f211a = 5;
            ((m) this.f213c).k();
            return new F1.g(this);
        }
        throw new IllegalStateException(("state: " + this.f211a).toString());
    }

    @Override // E1.e
    public void cancel() {
        Socket socket = ((m) this.f213c).f194c;
        if (socket != null) {
            A1.c.c(socket);
        }
    }

    @Override // E1.e
    public t d(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((z1.j) eVar.d).a("Transfer-Encoding"))) {
            if (this.f211a == 1) {
                this.f211a = 2;
                return new F1.c(this);
            }
            throw new IllegalStateException(("state: " + this.f211a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f211a == 1) {
            this.f211a = 2;
            return new F1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f211a).toString());
    }

    @Override // E1.e
    public long e(z1.s sVar) {
        if (!E1.f.a(sVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(z1.s.a("Transfer-Encoding", sVar))) {
            return -1L;
        }
        return A1.c.i(sVar);
    }

    @Override // E1.e
    public void f(H.e eVar) {
        Proxy.Type type = ((m) this.f213c).f193b.f4770b.type();
        k1.e.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f482b);
        sb.append(' ');
        z1.l lVar = (z1.l) eVar.f483c;
        if (lVar.i || type != Proxy.Type.HTTP) {
            String b2 = lVar.b();
            String d = lVar.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(lVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        k1.e.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((z1.j) eVar.d, sb2);
    }

    @Override // E1.e
    public r g(boolean z2) {
        F1.a aVar = (F1.a) this.f215f;
        int i = this.f211a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f211a).toString());
        }
        try {
            String u2 = ((M1.p) aVar.f270c).u(aVar.f269b);
            aVar.f269b -= u2.length();
            B.d Y2 = H1.l.Y(u2);
            int i2 = Y2.f32b;
            r rVar = new r();
            rVar.f4750b = (q) Y2.f33c;
            rVar.f4751c = i2;
            rVar.d = (String) Y2.d;
            rVar.f4753f = aVar.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f211a = 3;
                return rVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f211a = 4;
                return rVar;
            }
            this.f211a = 3;
            return rVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f213c).f193b.f4769a.h.f()), e2);
        }
    }

    @Override // E1.e
    public m h() {
        return (m) this.f213c;
    }

    public boolean i() {
        return this.f211a < ((List) this.f214e).size() || !((ArrayList) this.f216g).isEmpty();
    }

    public F1.e j(long j2) {
        if (this.f211a == 4) {
            this.f211a = 5;
            return new F1.e(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f211a).toString());
    }

    public void k(z1.j jVar, String str) {
        k1.e.e(str, "requestLine");
        if (this.f211a != 0) {
            throw new IllegalStateException(("state: " + this.f211a).toString());
        }
        M1.o oVar = (M1.o) this.f214e;
        oVar.l(str);
        oVar.l("\r\n");
        int size = jVar.size();
        for (int i = 0; i < size; i++) {
            oVar.l(jVar.b(i));
            oVar.l(": ");
            oVar.l(jVar.d(i));
            oVar.l("\r\n");
        }
        oVar.l("\r\n");
        this.f211a = 1;
    }

    public p(z1.p pVar, m mVar, M1.p pVar2, M1.o oVar) {
        k1.e.e(mVar, "connection");
        k1.e.e(pVar2, "source");
        k1.e.e(oVar, "sink");
        this.f212b = pVar;
        this.f213c = mVar;
        this.d = pVar2;
        this.f214e = oVar;
        this.f215f = new F1.a(pVar2);
    }
}
