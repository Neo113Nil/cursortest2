package o1;

import R0.q;
import f0.C0091b;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import k1.r;
import k1.s;
import k1.u;
import l.C0229n;
import x1.t;
import x1.v;

/* loaded from: classes.dex */
public final class p implements p1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3425a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3426b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3427c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3428e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3429f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3430g;

    public p(k1.a aVar, C0229n c0229n, j jVar) {
        List j2;
        Z0.d.e(c0229n, "routeDatabase");
        Z0.d.e(jVar, "call");
        this.f3426b = aVar;
        this.f3427c = c0229n;
        this.d = jVar;
        q qVar = q.f712a;
        this.f3428e = qVar;
        this.f3429f = qVar;
        this.f3430g = new ArrayList();
        k1.n nVar = aVar.h;
        Z0.d.e(nVar, "url");
        URI g2 = nVar.g();
        if (g2.getHost() == null) {
            j2 = l1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f2766g.select(g2);
            j2 = (select == null || select.isEmpty()) ? l1.b.j(Proxy.NO_PROXY) : l1.b.v(select);
        }
        this.f3428e = j2;
        this.f3425a = 0;
    }

    @Override // p1.d
    public void a() {
        ((x1.o) this.f3428e).flush();
    }

    @Override // p1.d
    public void b() {
        ((x1.o) this.f3428e).flush();
    }

    @Override // p1.d
    public long c(u uVar) {
        if (!p1.e.a(uVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(u.f("Transfer-Encoding", uVar))) {
            return -1L;
        }
        return l1.b.i(uVar);
    }

    @Override // p1.d
    public void cancel() {
        Socket socket = ((m) this.f3427c).f3408c;
        if (socket != null) {
            l1.b.c(socket);
        }
    }

    @Override // p1.d
    public t d(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((k1.l) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3425a == 1) {
                this.f3425a = 2;
                return new q1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3425a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3425a == 1) {
            this.f3425a = 2;
            return new q1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3425a).toString());
    }

    @Override // p1.d
    public void e(H.e eVar) {
        Proxy.Type type = ((m) this.f3427c).f3407b.f2911b.type();
        Z0.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f198b);
        sb.append(' ');
        k1.n nVar = (k1.n) eVar.f199c;
        if (nVar.i || type != Proxy.Type.HTTP) {
            String b2 = nVar.b();
            String d = nVar.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Z0.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((k1.l) eVar.d, sb2);
    }

    @Override // p1.d
    public k1.t f(boolean z2) {
        C0091b c0091b = (C0091b) this.f3429f;
        int i = this.f3425a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3425a).toString());
        }
        try {
            String o2 = ((x1.p) c0091b.f2099c).o(c0091b.f2098b);
            c0091b.f2098b -= o2.length();
            B.d s2 = k1.c.s(o2);
            int i2 = s2.f13b;
            k1.t tVar = new k1.t();
            tVar.f2888b = (s) s2.f14c;
            tVar.f2889c = i2;
            tVar.d = (String) s2.d;
            tVar.f2891f = c0091b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3425a = 3;
                return tVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3425a = 4;
                return tVar;
            }
            this.f3425a = 3;
            return tVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3427c).f3407b.f2910a.h.f()), e2);
        }
    }

    @Override // p1.d
    public v g(u uVar) {
        if (!p1.e.a(uVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(u.f("Transfer-Encoding", uVar))) {
            k1.n nVar = (k1.n) uVar.f2897a.f199c;
            if (this.f3425a == 4) {
                this.f3425a = 5;
                return new q1.c(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f3425a).toString());
        }
        long i = l1.b.i(uVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3425a == 4) {
            this.f3425a = 5;
            ((m) this.f3427c).k();
            return new q1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3425a).toString());
    }

    @Override // p1.d
    public m h() {
        return (m) this.f3427c;
    }

    public boolean i() {
        return this.f3425a < ((List) this.f3428e).size() || !((ArrayList) this.f3430g).isEmpty();
    }

    public q1.d j(long j2) {
        if (this.f3425a == 4) {
            this.f3425a = 5;
            return new q1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3425a).toString());
    }

    public void k(k1.l lVar, String str) {
        Z0.d.e(str, "requestLine");
        if (this.f3425a != 0) {
            throw new IllegalStateException(("state: " + this.f3425a).toString());
        }
        x1.o oVar = (x1.o) this.f3428e;
        oVar.c(str);
        oVar.c("\r\n");
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            oVar.c(lVar.b(i));
            oVar.c(": ");
            oVar.c(lVar.d(i));
            oVar.c("\r\n");
        }
        oVar.c("\r\n");
        this.f3425a = 1;
    }

    public p(r rVar, m mVar, x1.p pVar, x1.o oVar) {
        Z0.d.e(mVar, "connection");
        Z0.d.e(pVar, "source");
        Z0.d.e(oVar, "sink");
        this.f3426b = rVar;
        this.f3427c = mVar;
        this.d = pVar;
        this.f3428e = oVar;
        this.f3429f = new C0091b(pVar);
    }
}
