package q1;

import T0.q;
import f0.C0093b;
import j0.AbstractC0143a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l.C0207a0;
import m1.r;
import m1.s;
import z1.t;
import z1.v;

/* loaded from: classes.dex */
public final class p implements r1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3506a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3507b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3508c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3509e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3510f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3511g;

    public p(m1.a aVar, C0207a0 c0207a0, j jVar) {
        List j2;
        b1.d.e(c0207a0, "routeDatabase");
        b1.d.e(jVar, "call");
        this.f3507b = aVar;
        this.f3508c = c0207a0;
        this.d = jVar;
        q qVar = q.f829a;
        this.f3509e = qVar;
        this.f3510f = qVar;
        this.f3511g = new ArrayList();
        m1.l lVar = aVar.h;
        b1.d.e(lVar, "url");
        URI g2 = lVar.g();
        if (g2.getHost() == null) {
            j2 = n1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3121g.select(g2);
            j2 = (select == null || select.isEmpty()) ? n1.b.j(Proxy.NO_PROXY) : n1.b.v(select);
        }
        this.f3509e = j2;
        this.f3506a = 0;
    }

    @Override // r1.d
    public void a() {
        ((z1.o) this.f3509e).flush();
    }

    @Override // r1.d
    public void b() {
        ((z1.o) this.f3509e).flush();
    }

    @Override // r1.d
    public t c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((m1.j) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3506a == 1) {
                this.f3506a = 2;
                return new s1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3506a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3506a == 1) {
            this.f3506a = 2;
            return new s1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3506a).toString());
    }

    @Override // r1.d
    public void cancel() {
        Socket socket = ((m) this.f3508c).f3489c;
        if (socket != null) {
            n1.b.c(socket);
        }
    }

    @Override // r1.d
    public void d(H.e eVar) {
        Proxy.Type type = ((m) this.f3508c).f3488b.f3263b.type();
        b1.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f205b);
        sb.append(' ');
        m1.l lVar = (m1.l) eVar.f206c;
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
        b1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((m1.j) eVar.d, sb2);
    }

    @Override // r1.d
    public r e(boolean z2) {
        C0093b c0093b = (C0093b) this.f3510f;
        int i = this.f3506a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3506a).toString());
        }
        try {
            String o2 = ((z1.p) c0093b.f2100c).o(c0093b.f2099b);
            c0093b.f2099b -= o2.length();
            B.d o3 = AbstractC0143a.o(o2);
            int i2 = o3.f15b;
            r rVar = new r();
            rVar.f3240b = (m1.q) o3.f16c;
            rVar.f3241c = i2;
            rVar.d = (String) o3.d;
            rVar.f3243f = c0093b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3506a = 3;
                return rVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3506a = 4;
                return rVar;
            }
            this.f3506a = 3;
            return rVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3508c).f3488b.f3262a.h.f()), e2);
        }
    }

    @Override // r1.d
    public v f(s sVar) {
        if (!r1.e.a(sVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(s.g("Transfer-Encoding", sVar))) {
            m1.l lVar = (m1.l) sVar.f3249a.f206c;
            if (this.f3506a == 4) {
                this.f3506a = 5;
                return new s1.c(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.f3506a).toString());
        }
        long i = n1.b.i(sVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3506a == 4) {
            this.f3506a = 5;
            ((m) this.f3508c).k();
            return new s1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3506a).toString());
    }

    @Override // r1.d
    public m g() {
        return (m) this.f3508c;
    }

    @Override // r1.d
    public long h(s sVar) {
        if (!r1.e.a(sVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(s.g("Transfer-Encoding", sVar))) {
            return -1L;
        }
        return n1.b.i(sVar);
    }

    public boolean i() {
        return this.f3506a < ((List) this.f3509e).size() || !((ArrayList) this.f3511g).isEmpty();
    }

    public s1.d j(long j2) {
        if (this.f3506a == 4) {
            this.f3506a = 5;
            return new s1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3506a).toString());
    }

    public void k(m1.j jVar, String str) {
        b1.d.e(str, "requestLine");
        if (this.f3506a != 0) {
            throw new IllegalStateException(("state: " + this.f3506a).toString());
        }
        z1.o oVar = (z1.o) this.f3509e;
        oVar.d(str);
        oVar.d("\r\n");
        int size = jVar.size();
        for (int i = 0; i < size; i++) {
            oVar.d(jVar.b(i));
            oVar.d(": ");
            oVar.d(jVar.d(i));
            oVar.d("\r\n");
        }
        oVar.d("\r\n");
        this.f3506a = 1;
    }

    public p(m1.p pVar, m mVar, z1.p pVar2, z1.o oVar) {
        b1.d.e(mVar, "connection");
        b1.d.e(pVar2, "source");
        b1.d.e(oVar, "sink");
        this.f3507b = pVar;
        this.f3508c = mVar;
        this.d = pVar2;
        this.f3509e = oVar;
        this.f3510f = new C0093b(pVar2);
    }
}
