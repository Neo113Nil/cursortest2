package w1;

import F1.t;
import F1.v;
import h.AbstractC0112a;
import h0.C0120b;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import m.C0202a0;
import s1.q;
import s1.r;

/* loaded from: classes.dex */
public final class p implements x1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f4272a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4273b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4274c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4275e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4276f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f4277g;

    public p(s1.a aVar, C0202a0 c0202a0, j jVar) {
        List j2;
        h1.d.e(c0202a0, "routeDatabase");
        h1.d.e(jVar, "call");
        this.f4273b = aVar;
        this.f4274c = c0202a0;
        this.d = jVar;
        W0.p pVar = W0.p.f959a;
        this.f4275e = pVar;
        this.f4276f = pVar;
        this.f4277g = new ArrayList();
        s1.l lVar = aVar.f3583h;
        h1.d.e(lVar, "url");
        URI g2 = lVar.g();
        if (g2.getHost() == null) {
            j2 = t1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3582g.select(g2);
            j2 = (select == null || select.isEmpty()) ? t1.b.j(Proxy.NO_PROXY) : t1.b.v(select);
        }
        this.f4275e = j2;
        this.f4272a = 0;
    }

    @Override // x1.d
    public void a() {
        ((F1.o) this.f4275e).flush();
    }

    @Override // x1.d
    public void b() {
        ((F1.o) this.f4275e).flush();
    }

    @Override // x1.d
    public t c(I.d dVar, long j2) {
        if ("chunked".equalsIgnoreCase(((s1.j) dVar.d).a("Transfer-Encoding"))) {
            if (this.f4272a == 1) {
                this.f4272a = 2;
                return new y1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f4272a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f4272a == 1) {
            this.f4272a = 2;
            return new y1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f4272a).toString());
    }

    @Override // x1.d
    public void cancel() {
        Socket socket = ((m) this.f4274c).f4254c;
        if (socket != null) {
            t1.b.c(socket);
        }
    }

    @Override // x1.d
    public long d(r rVar) {
        if (!x1.e.a(rVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(r.g("Transfer-Encoding", rVar))) {
            return -1L;
        }
        return t1.b.i(rVar);
    }

    @Override // x1.d
    public q e(boolean z2) {
        C0120b c0120b = (C0120b) this.f4276f;
        int i = this.f4272a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f4272a).toString());
        }
        try {
            String o2 = ((F1.p) c0120b.f2474c).o(c0120b.f2473b);
            c0120b.f2473b -= o2.length();
            C.d o3 = AbstractC0112a.o(o2);
            int i2 = o3.f74b;
            q qVar = new q();
            qVar.f3692b = (s1.p) o3.f75c;
            qVar.f3693c = i2;
            qVar.d = (String) o3.d;
            qVar.f3695f = c0120b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f4272a = 3;
                return qVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f4272a = 4;
                return qVar;
            }
            this.f4272a = 3;
            return qVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f4274c).f4253b.f3716a.f3583h.f()), e2);
        }
    }

    @Override // x1.d
    public v f(r rVar) {
        if (!x1.e.a(rVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(r.g("Transfer-Encoding", rVar))) {
            s1.l lVar = (s1.l) rVar.f3702a.f321c;
            if (this.f4272a == 4) {
                this.f4272a = 5;
                return new y1.c(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.f4272a).toString());
        }
        long i = t1.b.i(rVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f4272a == 4) {
            this.f4272a = 5;
            ((m) this.f4274c).k();
            return new y1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f4272a).toString());
    }

    @Override // x1.d
    public void g(I.d dVar) {
        Proxy.Type type = ((m) this.f4274c).f4253b.f3717b.type();
        h1.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) dVar.f320b);
        sb.append(' ');
        s1.l lVar = (s1.l) dVar.f321c;
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
        h1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((s1.j) dVar.d, sb2);
    }

    @Override // x1.d
    public m h() {
        return (m) this.f4274c;
    }

    public boolean i() {
        return this.f4272a < ((List) this.f4275e).size() || !((ArrayList) this.f4277g).isEmpty();
    }

    public y1.d j(long j2) {
        if (this.f4272a == 4) {
            this.f4272a = 5;
            return new y1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f4272a).toString());
    }

    public void k(s1.j jVar, String str) {
        h1.d.e(str, "requestLine");
        if (this.f4272a != 0) {
            throw new IllegalStateException(("state: " + this.f4272a).toString());
        }
        F1.o oVar = (F1.o) this.f4275e;
        oVar.e(str);
        oVar.e("\r\n");
        int size = jVar.size();
        for (int i = 0; i < size; i++) {
            oVar.e(jVar.b(i));
            oVar.e(": ");
            oVar.e(jVar.d(i));
            oVar.e("\r\n");
        }
        oVar.e("\r\n");
        this.f4272a = 1;
    }

    public p(s1.o oVar, m mVar, F1.p pVar, F1.o oVar2) {
        h1.d.e(mVar, "connection");
        h1.d.e(pVar, "source");
        h1.d.e(oVar2, "sink");
        this.f4273b = oVar;
        this.f4274c = mVar;
        this.d = pVar;
        this.f4275e = oVar2;
        this.f4276f = new C0120b(pVar);
    }
}
