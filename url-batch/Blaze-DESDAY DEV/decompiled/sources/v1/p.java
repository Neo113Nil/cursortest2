package v1;

import E1.v;
import g0.C0118b;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import r1.q;
import r1.r;
import r1.s;
import r1.t;

/* loaded from: classes.dex */
public final class p implements w1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f4079a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4080b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4081c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4082e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4083f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f4084g;

    public p(r1.a aVar, r1.g gVar, j jVar) {
        List j2;
        g1.d.e(gVar, "routeDatabase");
        g1.d.e(jVar, "call");
        this.f4080b = aVar;
        this.f4081c = gVar;
        this.d = jVar;
        V0.p pVar = V0.p.f917a;
        this.f4082e = pVar;
        this.f4083f = pVar;
        this.f4084g = new ArrayList();
        r1.m mVar = aVar.h;
        g1.d.e(mVar, "url");
        URI g2 = mVar.g();
        if (g2.getHost() == null) {
            j2 = s1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3400g.select(g2);
            j2 = (select == null || select.isEmpty()) ? s1.b.j(Proxy.NO_PROXY) : s1.b.v(select);
        }
        this.f4082e = j2;
        this.f4079a = 0;
    }

    @Override // w1.d
    public void a() {
        ((E1.o) this.f4082e).flush();
    }

    @Override // w1.d
    public v b(t tVar) {
        if (!w1.e.a(tVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(t.g("Transfer-Encoding", tVar))) {
            r1.m mVar = (r1.m) tVar.f3529a.f278c;
            if (this.f4079a == 4) {
                this.f4079a = 5;
                return new x1.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f4079a).toString());
        }
        long i = s1.b.i(tVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f4079a == 4) {
            this.f4079a = 5;
            ((m) this.f4081c).k();
            return new x1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f4079a).toString());
    }

    @Override // w1.d
    public void c() {
        ((E1.o) this.f4082e).flush();
    }

    @Override // w1.d
    public void cancel() {
        Socket socket = ((m) this.f4081c).f4062c;
        if (socket != null) {
            s1.b.c(socket);
        }
    }

    @Override // w1.d
    public E1.t d(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((r1.k) eVar.d).a("Transfer-Encoding"))) {
            if (this.f4079a == 1) {
                this.f4079a = 2;
                return new x1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f4079a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f4079a == 1) {
            this.f4079a = 2;
            return new x1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f4079a).toString());
    }

    @Override // w1.d
    public void e(H.e eVar) {
        Proxy.Type type = ((m) this.f4081c).f4061b.f3543b.type();
        g1.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f277b);
        sb.append(' ');
        r1.m mVar = (r1.m) eVar.f278c;
        if (mVar.i || type != Proxy.Type.HTTP) {
            String b2 = mVar.b();
            String d = mVar.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(mVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        g1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((r1.k) eVar.d, sb2);
    }

    @Override // w1.d
    public s f(boolean z2) {
        C0118b c0118b = (C0118b) this.f4083f;
        int i = this.f4079a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f4079a).toString());
        }
        try {
            String o2 = ((E1.p) c0118b.f2384c).o(c0118b.f2383b);
            c0118b.f2383b -= o2.length();
            B.d n2 = i0.g.n(o2);
            int i2 = n2.f33b;
            s sVar = new s();
            sVar.f3520b = (r) n2.f34c;
            sVar.f3521c = i2;
            sVar.d = (String) n2.d;
            sVar.f3523f = c0118b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f4079a = 3;
                return sVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f4079a = 4;
                return sVar;
            }
            this.f4079a = 3;
            return sVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f4081c).f4061b.f3542a.h.f()), e2);
        }
    }

    @Override // w1.d
    public long g(t tVar) {
        if (!w1.e.a(tVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(t.g("Transfer-Encoding", tVar))) {
            return -1L;
        }
        return s1.b.i(tVar);
    }

    @Override // w1.d
    public m h() {
        return (m) this.f4081c;
    }

    public boolean i() {
        return this.f4079a < ((List) this.f4082e).size() || !((ArrayList) this.f4084g).isEmpty();
    }

    public x1.d j(long j2) {
        if (this.f4079a == 4) {
            this.f4079a = 5;
            return new x1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f4079a).toString());
    }

    public void k(r1.k kVar, String str) {
        g1.d.e(str, "requestLine");
        if (this.f4079a != 0) {
            throw new IllegalStateException(("state: " + this.f4079a).toString());
        }
        E1.o oVar = (E1.o) this.f4082e;
        oVar.c(str);
        oVar.c("\r\n");
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            oVar.c(kVar.b(i));
            oVar.c(": ");
            oVar.c(kVar.d(i));
            oVar.c("\r\n");
        }
        oVar.c("\r\n");
        this.f4079a = 1;
    }

    public p(q qVar, m mVar, E1.p pVar, E1.o oVar) {
        g1.d.e(mVar, "connection");
        g1.d.e(pVar, "source");
        g1.d.e(oVar, "sink");
        this.f4080b = qVar;
        this.f4081c = mVar;
        this.d = pVar;
        this.f4082e = oVar;
        this.f4083f = new C0118b(pVar);
    }
}
