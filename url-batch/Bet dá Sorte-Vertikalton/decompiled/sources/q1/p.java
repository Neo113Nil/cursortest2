package q1;

import T0.q;
import f0.C0088b;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import k0.w;
import m1.r;
import m1.s;
import z1.t;
import z1.v;

/* loaded from: classes.dex */
public final class p implements r1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3560b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3561c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3562e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3563f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3564g;

    public p(m1.a aVar, m1.g gVar, j jVar) {
        List j2;
        b1.d.e(gVar, "routeDatabase");
        b1.d.e(jVar, "call");
        this.f3560b = aVar;
        this.f3561c = gVar;
        this.d = jVar;
        q qVar = q.f844a;
        this.f3562e = qVar;
        this.f3563f = qVar;
        this.f3564g = new ArrayList();
        m1.m mVar = aVar.h;
        b1.d.e(mVar, "url");
        URI g2 = mVar.g();
        if (g2.getHost() == null) {
            j2 = n1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3153g.select(g2);
            j2 = (select == null || select.isEmpty()) ? n1.b.j(Proxy.NO_PROXY) : n1.b.v(select);
        }
        this.f3562e = j2;
        this.f3559a = 0;
    }

    @Override // r1.d
    public void a() {
        ((z1.o) this.f3562e).flush();
    }

    @Override // r1.d
    public void b() {
        ((z1.o) this.f3562e).flush();
    }

    @Override // r1.d
    public t c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((m1.k) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3559a == 1) {
                this.f3559a = 2;
                return new s1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3559a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3559a == 1) {
            this.f3559a = 2;
            return new s1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3559a).toString());
    }

    @Override // r1.d
    public void cancel() {
        Socket socket = ((m) this.f3561c).f3542c;
        if (socket != null) {
            n1.b.c(socket);
        }
    }

    @Override // r1.d
    public void d(H.e eVar) {
        Proxy.Type type = ((m) this.f3561c).f3541b.f3296b.type();
        b1.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f274b);
        sb.append(' ');
        m1.m mVar = (m1.m) eVar.f275c;
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
        b1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((m1.k) eVar.d, sb2);
    }

    @Override // r1.d
    public s e(boolean z2) {
        C0088b c0088b = (C0088b) this.f3563f;
        int i = this.f3559a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3559a).toString());
        }
        try {
            String o2 = ((z1.p) c0088b.f2142c).o(c0088b.f2141b);
            c0088b.f2141b -= o2.length();
            B.d n2 = w.n(o2);
            int i2 = n2.f41b;
            s sVar = new s();
            sVar.f3273b = (r) n2.f42c;
            sVar.f3274c = i2;
            sVar.d = (String) n2.d;
            sVar.f3276f = c0088b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3559a = 3;
                return sVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3559a = 4;
                return sVar;
            }
            this.f3559a = 3;
            return sVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3561c).f3541b.f3295a.h.f()), e2);
        }
    }

    @Override // r1.d
    public v f(m1.t tVar) {
        if (!r1.e.a(tVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(m1.t.g("Transfer-Encoding", tVar))) {
            m1.m mVar = (m1.m) tVar.f3282a.f275c;
            if (this.f3559a == 4) {
                this.f3559a = 5;
                return new s1.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f3559a).toString());
        }
        long i = n1.b.i(tVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3559a == 4) {
            this.f3559a = 5;
            ((m) this.f3561c).k();
            return new s1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3559a).toString());
    }

    @Override // r1.d
    public m g() {
        return (m) this.f3561c;
    }

    @Override // r1.d
    public long h(m1.t tVar) {
        if (!r1.e.a(tVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(m1.t.g("Transfer-Encoding", tVar))) {
            return -1L;
        }
        return n1.b.i(tVar);
    }

    public boolean i() {
        return this.f3559a < ((List) this.f3562e).size() || !((ArrayList) this.f3564g).isEmpty();
    }

    public s1.d j(long j2) {
        if (this.f3559a == 4) {
            this.f3559a = 5;
            return new s1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3559a).toString());
    }

    public void k(m1.k kVar, String str) {
        b1.d.e(str, "requestLine");
        if (this.f3559a != 0) {
            throw new IllegalStateException(("state: " + this.f3559a).toString());
        }
        z1.o oVar = (z1.o) this.f3562e;
        oVar.d(str);
        oVar.d("\r\n");
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            oVar.d(kVar.b(i));
            oVar.d(": ");
            oVar.d(kVar.d(i));
            oVar.d("\r\n");
        }
        oVar.d("\r\n");
        this.f3559a = 1;
    }

    public p(m1.q qVar, m mVar, z1.p pVar, z1.o oVar) {
        b1.d.e(mVar, "connection");
        b1.d.e(pVar, "source");
        b1.d.e(oVar, "sink");
        this.f3560b = qVar;
        this.f3561c = mVar;
        this.d = pVar;
        this.f3562e = oVar;
        this.f3563f = new C0088b(pVar);
    }
}
