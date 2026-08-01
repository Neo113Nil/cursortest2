package s1;

import B1.t;
import B1.v;
import g0.C0117c;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l.Z;
import o1.q;
import o1.r;
import o1.s;

/* loaded from: classes.dex */
public final class p implements t1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3753a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3754b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3755c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3756e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3757f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3758g;

    public p(o1.a aVar, Z z2, j jVar) {
        List j2;
        d1.d.e(z2, "routeDatabase");
        d1.d.e(jVar, "call");
        this.f3754b = aVar;
        this.f3755c = z2;
        this.d = jVar;
        S0.p pVar = S0.p.f795a;
        this.f3756e = pVar;
        this.f3757f = pVar;
        this.f3758g = new ArrayList();
        o1.l lVar = aVar.h;
        d1.d.e(lVar, "url");
        URI g2 = lVar.g();
        if (g2.getHost() == null) {
            j2 = p1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3255g.select(g2);
            j2 = (select == null || select.isEmpty()) ? p1.b.j(Proxy.NO_PROXY) : p1.b.v(select);
        }
        this.f3756e = j2;
        this.f3753a = 0;
    }

    @Override // t1.d
    public void a() {
        ((B1.o) this.f3756e).flush();
    }

    @Override // t1.d
    public void b() {
        ((B1.o) this.f3756e).flush();
    }

    @Override // t1.d
    public long c(s sVar) {
        if (!t1.e.a(sVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(s.g("Transfer-Encoding", sVar))) {
            return -1L;
        }
        return p1.b.i(sVar);
    }

    @Override // t1.d
    public void cancel() {
        Socket socket = ((m) this.f3755c).f3736c;
        if (socket != null) {
            p1.b.c(socket);
        }
    }

    @Override // t1.d
    public t d(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((o1.j) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3753a == 1) {
                this.f3753a = 2;
                return new u1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3753a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3753a == 1) {
            this.f3753a = 2;
            return new u1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3753a).toString());
    }

    @Override // t1.d
    public void e(H.e eVar) {
        Proxy.Type type = ((m) this.f3755c).f3735b.f3397b.type();
        d1.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f260b);
        sb.append(' ');
        o1.l lVar = (o1.l) eVar.f261c;
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
        d1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((o1.j) eVar.d, sb2);
    }

    @Override // t1.d
    public r f(boolean z2) {
        C0117c c0117c = (C0117c) this.f3757f;
        int i = this.f3753a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3753a).toString());
        }
        try {
            String o2 = ((B1.p) c0117c.f2337c).o(c0117c.f2336b);
            c0117c.f2336b -= o2.length();
            B.d l2 = h1.d.l(o2);
            int i2 = l2.f19b;
            r rVar = new r();
            rVar.f3374b = (q) l2.f20c;
            rVar.f3375c = i2;
            rVar.d = (String) l2.d;
            rVar.f3377f = c0117c.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3753a = 3;
                return rVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3753a = 4;
                return rVar;
            }
            this.f3753a = 3;
            return rVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3755c).f3735b.f3396a.h.f()), e2);
        }
    }

    @Override // t1.d
    public v g(s sVar) {
        if (!t1.e.a(sVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(s.g("Transfer-Encoding", sVar))) {
            o1.l lVar = (o1.l) sVar.f3383a.f261c;
            if (this.f3753a == 4) {
                this.f3753a = 5;
                return new u1.c(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.f3753a).toString());
        }
        long i = p1.b.i(sVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3753a == 4) {
            this.f3753a = 5;
            ((m) this.f3755c).k();
            return new u1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3753a).toString());
    }

    @Override // t1.d
    public m h() {
        return (m) this.f3755c;
    }

    public boolean i() {
        return this.f3753a < ((List) this.f3756e).size() || !((ArrayList) this.f3758g).isEmpty();
    }

    public u1.d j(long j2) {
        if (this.f3753a == 4) {
            this.f3753a = 5;
            return new u1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3753a).toString());
    }

    public void k(o1.j jVar, String str) {
        d1.d.e(str, "requestLine");
        if (this.f3753a != 0) {
            throw new IllegalStateException(("state: " + this.f3753a).toString());
        }
        B1.o oVar = (B1.o) this.f3756e;
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
        this.f3753a = 1;
    }

    public p(o1.p pVar, m mVar, B1.p pVar2, B1.o oVar) {
        d1.d.e(mVar, "connection");
        d1.d.e(pVar2, "source");
        d1.d.e(oVar, "sink");
        this.f3754b = pVar;
        this.f3755c = mVar;
        this.d = pVar2;
        this.f3756e = oVar;
        this.f3757f = new C0117c(pVar2);
    }
}
