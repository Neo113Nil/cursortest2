package v1;

import E1.t;
import E1.v;
import X0.s;
import h0.C0115b;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l.C0176a0;
import m.C0227a;
import r1.q;
import r1.r;

/* loaded from: classes.dex */
public final class p implements w1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3909a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3910b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3911c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3912e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3913f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3914g;

    public p(r1.a aVar, C0176a0 c0176a0, j jVar) {
        List j2;
        g1.d.e(c0176a0, "routeDatabase");
        g1.d.e(jVar, "call");
        this.f3910b = aVar;
        this.f3911c = c0176a0;
        this.d = jVar;
        s sVar = s.f992a;
        this.f3912e = sVar;
        this.f3913f = sVar;
        this.f3914g = new ArrayList();
        r1.l lVar = aVar.h;
        g1.d.e(lVar, "url");
        URI g2 = lVar.g();
        if (g2.getHost() == null) {
            j2 = s1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3434g.select(g2);
            j2 = (select == null || select.isEmpty()) ? s1.b.j(Proxy.NO_PROXY) : s1.b.v(select);
        }
        this.f3912e = j2;
        this.f3909a = 0;
    }

    @Override // w1.d
    public void a() {
        ((E1.o) this.f3912e).flush();
    }

    @Override // w1.d
    public void b(J.d dVar) {
        Proxy.Type type = ((m) this.f3911c).f3891b.f3559b.type();
        g1.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) dVar.f358b);
        sb.append(' ');
        r1.l lVar = (r1.l) dVar.f359c;
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
        g1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((r1.j) dVar.d, sb2);
    }

    @Override // w1.d
    public v c(r rVar) {
        if (!w1.e.a(rVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(r.g("Transfer-Encoding", rVar))) {
            r1.l lVar = (r1.l) rVar.f3545a.f359c;
            if (this.f3909a == 4) {
                this.f3909a = 5;
                return new x1.c(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.f3909a).toString());
        }
        long i = s1.b.i(rVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3909a == 4) {
            this.f3909a = 5;
            ((m) this.f3911c).k();
            return new x1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3909a).toString());
    }

    @Override // w1.d
    public void cancel() {
        Socket socket = ((m) this.f3911c).f3892c;
        if (socket != null) {
            s1.b.c(socket);
        }
    }

    @Override // w1.d
    public void d() {
        ((E1.o) this.f3912e).flush();
    }

    @Override // w1.d
    public t e(J.d dVar, long j2) {
        if ("chunked".equalsIgnoreCase(((r1.j) dVar.d).a("Transfer-Encoding"))) {
            if (this.f3909a == 1) {
                this.f3909a = 2;
                return new x1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3909a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3909a == 1) {
            this.f3909a = 2;
            return new x1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3909a).toString());
    }

    @Override // w1.d
    public q f(boolean z2) {
        C0115b c0115b = (C0115b) this.f3913f;
        int i = this.f3909a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3909a).toString());
        }
        try {
            String o2 = ((E1.p) c0115b.f2456c).o(c0115b.f2455b);
            c0115b.f2455b -= o2.length();
            D.d n2 = C0227a.n(o2);
            int i2 = n2.f121b;
            q qVar = new q();
            qVar.f3536b = (r1.p) n2.f122c;
            qVar.f3537c = i2;
            qVar.d = (String) n2.d;
            qVar.f3539f = c0115b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3909a = 3;
                return qVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3909a = 4;
                return qVar;
            }
            this.f3909a = 3;
            return qVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3911c).f3891b.f3558a.h.f()), e2);
        }
    }

    @Override // w1.d
    public long g(r rVar) {
        if (!w1.e.a(rVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(r.g("Transfer-Encoding", rVar))) {
            return -1L;
        }
        return s1.b.i(rVar);
    }

    @Override // w1.d
    public m h() {
        return (m) this.f3911c;
    }

    public boolean i() {
        return this.f3909a < ((List) this.f3912e).size() || !((ArrayList) this.f3914g).isEmpty();
    }

    public x1.d j(long j2) {
        if (this.f3909a == 4) {
            this.f3909a = 5;
            return new x1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3909a).toString());
    }

    public void k(r1.j jVar, String str) {
        g1.d.e(str, "requestLine");
        if (this.f3909a != 0) {
            throw new IllegalStateException(("state: " + this.f3909a).toString());
        }
        E1.o oVar = (E1.o) this.f3912e;
        oVar.c(str);
        oVar.c("\r\n");
        int size = jVar.size();
        for (int i = 0; i < size; i++) {
            oVar.c(jVar.b(i));
            oVar.c(": ");
            oVar.c(jVar.d(i));
            oVar.c("\r\n");
        }
        oVar.c("\r\n");
        this.f3909a = 1;
    }

    public p(r1.o oVar, m mVar, E1.p pVar, E1.o oVar2) {
        g1.d.e(mVar, "connection");
        g1.d.e(pVar, "source");
        g1.d.e(oVar2, "sink");
        this.f3910b = oVar;
        this.f3911c = mVar;
        this.d = pVar;
        this.f3912e = oVar2;
        this.f3913f = new C0115b(pVar);
    }
}
