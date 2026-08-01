package m1;

import Q0.q;
import f0.C0086b;
import i1.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l.C0249n;
import v1.t;
import v1.v;

/* loaded from: classes.dex */
public final class p implements n1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3245a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3246b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3247c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3248e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3249f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3250g;

    public p(i1.a aVar, C0249n c0249n, j jVar) {
        List j2;
        X0.d.e(c0249n, "routeDatabase");
        X0.d.e(jVar, "call");
        this.f3246b = aVar;
        this.f3247c = c0249n;
        this.d = jVar;
        q qVar = q.f670a;
        this.f3248e = qVar;
        this.f3249f = qVar;
        this.f3250g = new ArrayList();
        i1.m mVar = aVar.h;
        X0.d.e(mVar, "url");
        URI g2 = mVar.g();
        if (g2.getHost() == null) {
            j2 = j1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f2390g.select(g2);
            j2 = (select == null || select.isEmpty()) ? j1.b.j(Proxy.NO_PROXY) : j1.b.u(select);
        }
        this.f3248e = j2;
        this.f3245a = 0;
    }

    @Override // n1.d
    public void a() {
        ((v1.o) this.f3248e).flush();
    }

    @Override // n1.d
    public void b() {
        ((v1.o) this.f3248e).flush();
    }

    @Override // n1.d
    public t c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((i1.k) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3245a == 1) {
                this.f3245a = 2;
                return new o1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3245a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3245a == 1) {
            this.f3245a = 2;
            return new o1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3245a).toString());
    }

    @Override // n1.d
    public void cancel() {
        Socket socket = ((m) this.f3247c).f3228c;
        if (socket != null) {
            j1.b.c(socket);
        }
    }

    @Override // n1.d
    public void d(H.e eVar) {
        Proxy.Type type = ((m) this.f3247c).f3227b.f2520b.type();
        X0.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f212b);
        sb.append(' ');
        i1.m mVar = (i1.m) eVar.f213c;
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
        X0.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((i1.k) eVar.d, sb2);
    }

    @Override // n1.d
    public s e(boolean z2) {
        C0086b c0086b = (C0086b) this.f3249f;
        int i = this.f3245a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3245a).toString());
        }
        try {
            String m2 = ((v1.p) c0086b.f2036c).m(c0086b.f2035b);
            c0086b.f2035b -= m2.length();
            B.d i2 = i1.p.i(m2);
            int i3 = i2.f18b;
            s sVar = new s();
            sVar.f2497b = (i1.q) i2.f19c;
            sVar.f2498c = i3;
            sVar.d = (String) i2.d;
            sVar.f2500f = c0086b.f().c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f3245a = 3;
                return sVar;
            }
            if (102 > i3 || i3 >= 200) {
                this.f3245a = 4;
                return sVar;
            }
            this.f3245a = 3;
            return sVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3247c).f3227b.f2519a.h.f()), e2);
        }
    }

    @Override // n1.d
    public v f(i1.t tVar) {
        if (!n1.e.a(tVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(i1.t.e(tVar, "Transfer-Encoding"))) {
            i1.m mVar = (i1.m) tVar.f2506a.f213c;
            if (this.f3245a == 4) {
                this.f3245a = 5;
                return new o1.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f3245a).toString());
        }
        long i = j1.b.i(tVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3245a == 4) {
            this.f3245a = 5;
            ((m) this.f3247c).k();
            return new o1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3245a).toString());
    }

    @Override // n1.d
    public m g() {
        return (m) this.f3247c;
    }

    @Override // n1.d
    public long h(i1.t tVar) {
        if (!n1.e.a(tVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(i1.t.e(tVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return j1.b.i(tVar);
    }

    public boolean i() {
        return this.f3245a < ((List) this.f3248e).size() || !((ArrayList) this.f3250g).isEmpty();
    }

    public o1.d j(long j2) {
        if (this.f3245a == 4) {
            this.f3245a = 5;
            return new o1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3245a).toString());
    }

    public void k(i1.k kVar, String str) {
        X0.d.e(str, "requestLine");
        if (this.f3245a != 0) {
            throw new IllegalStateException(("state: " + this.f3245a).toString());
        }
        v1.o oVar = (v1.o) this.f3248e;
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
        this.f3245a = 1;
    }

    public p(i1.o oVar, m mVar, v1.p pVar, v1.o oVar2) {
        X0.d.e(mVar, "connection");
        X0.d.e(pVar, "source");
        X0.d.e(oVar2, "sink");
        this.f3246b = oVar;
        this.f3247c = mVar;
        this.d = pVar;
        this.f3248e = oVar2;
        this.f3249f = new C0086b(pVar);
    }
}
