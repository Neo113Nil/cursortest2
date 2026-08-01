package t1;

import C1.t;
import C1.v;
import W0.q;
import f0.C0092b;
import j0.AbstractC0142a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import p1.r;
import p1.s;

/* loaded from: classes.dex */
public final class p implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3792a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3793b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3794c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3795e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3796f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3797g;

    public p(p1.a aVar, p1.g gVar, j jVar) {
        List j2;
        e1.d.e(gVar, "routeDatabase");
        e1.d.e(jVar, "call");
        this.f3793b = aVar;
        this.f3794c = gVar;
        this.d = jVar;
        q qVar = q.f896a;
        this.f3795e = qVar;
        this.f3796f = qVar;
        this.f3797g = new ArrayList();
        p1.m mVar = aVar.h;
        e1.d.e(mVar, "url");
        URI g2 = mVar.g();
        if (g2.getHost() == null) {
            j2 = q1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3300g.select(g2);
            j2 = (select == null || select.isEmpty()) ? q1.b.j(Proxy.NO_PROXY) : q1.b.v(select);
        }
        this.f3795e = j2;
        this.f3792a = 0;
    }

    @Override // u1.d
    public void a() {
        ((C1.o) this.f3795e).flush();
    }

    @Override // u1.d
    public void b() {
        ((C1.o) this.f3795e).flush();
    }

    @Override // u1.d
    public t c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((p1.k) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3792a == 1) {
                this.f3792a = 2;
                return new v1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3792a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3792a == 1) {
            this.f3792a = 2;
            return new v1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3792a).toString());
    }

    @Override // u1.d
    public void cancel() {
        Socket socket = ((m) this.f3794c).f3775c;
        if (socket != null) {
            q1.b.c(socket);
        }
    }

    @Override // u1.d
    public void d(H.e eVar) {
        Proxy.Type type = ((m) this.f3794c).f3774b.f3443b.type();
        e1.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f258b);
        sb.append(' ');
        p1.m mVar = (p1.m) eVar.f259c;
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
        e1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((p1.k) eVar.d, sb2);
    }

    @Override // u1.d
    public s e(boolean z2) {
        C0092b c0092b = (C0092b) this.f3796f;
        int i = this.f3792a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3792a).toString());
        }
        try {
            String o2 = ((C1.p) c0092b.f2167c).o(c0092b.f2166b);
            c0092b.f2166b -= o2.length();
            B.d m2 = AbstractC0142a.m(o2);
            int i2 = m2.f13b;
            s sVar = new s();
            sVar.f3420b = (r) m2.f14c;
            sVar.f3421c = i2;
            sVar.d = (String) m2.d;
            sVar.f3423f = c0092b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3792a = 3;
                return sVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3792a = 4;
                return sVar;
            }
            this.f3792a = 3;
            return sVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3794c).f3774b.f3442a.h.f()), e2);
        }
    }

    @Override // u1.d
    public long f(p1.t tVar) {
        if (!u1.e.a(tVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(p1.t.g("Transfer-Encoding", tVar))) {
            return -1L;
        }
        return q1.b.i(tVar);
    }

    @Override // u1.d
    public v g(p1.t tVar) {
        if (!u1.e.a(tVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(p1.t.g("Transfer-Encoding", tVar))) {
            p1.m mVar = (p1.m) tVar.f3429a.f259c;
            if (this.f3792a == 4) {
                this.f3792a = 5;
                return new v1.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f3792a).toString());
        }
        long i = q1.b.i(tVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3792a == 4) {
            this.f3792a = 5;
            ((m) this.f3794c).k();
            return new v1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3792a).toString());
    }

    @Override // u1.d
    public m h() {
        return (m) this.f3794c;
    }

    public boolean i() {
        return this.f3792a < ((List) this.f3795e).size() || !((ArrayList) this.f3797g).isEmpty();
    }

    public v1.d j(long j2) {
        if (this.f3792a == 4) {
            this.f3792a = 5;
            return new v1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3792a).toString());
    }

    public void k(p1.k kVar, String str) {
        e1.d.e(str, "requestLine");
        if (this.f3792a != 0) {
            throw new IllegalStateException(("state: " + this.f3792a).toString());
        }
        C1.o oVar = (C1.o) this.f3795e;
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
        this.f3792a = 1;
    }

    public p(p1.q qVar, m mVar, C1.p pVar, C1.o oVar) {
        e1.d.e(mVar, "connection");
        e1.d.e(pVar, "source");
        e1.d.e(oVar, "sink");
        this.f3793b = qVar;
        this.f3794c = mVar;
        this.d = pVar;
        this.f3795e = oVar;
        this.f3796f = new C0092b(pVar);
    }
}
