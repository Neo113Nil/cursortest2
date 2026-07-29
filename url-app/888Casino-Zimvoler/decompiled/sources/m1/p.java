package m1;

import f0.C0085b;
import i1.q;
import i1.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l.C0242k;
import v1.s;
import v1.u;

/* loaded from: classes.dex */
public final class p implements n1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3240a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3241b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3242c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3243e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3244f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3245g;

    public p(i1.a aVar, C0242k c0242k, j jVar) {
        List j2;
        X0.e.e(c0242k, "routeDatabase");
        X0.e.e(jVar, "call");
        this.f3241b = aVar;
        this.f3242c = c0242k;
        this.d = jVar;
        Q0.m mVar = Q0.m.f665a;
        this.f3243e = mVar;
        this.f3244f = mVar;
        this.f3245g = new ArrayList();
        i1.m mVar2 = aVar.h;
        X0.e.e(mVar2, "url");
        URI g2 = mVar2.g();
        if (g2.getHost() == null) {
            j2 = j1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f2385g.select(g2);
            j2 = (select == null || select.isEmpty()) ? j1.b.j(Proxy.NO_PROXY) : j1.b.u(select);
        }
        this.f3243e = j2;
        this.f3240a = 0;
    }

    @Override // n1.d
    public void a() {
        ((v1.n) this.f3243e).flush();
    }

    @Override // n1.d
    public void b() {
        ((v1.n) this.f3243e).flush();
    }

    @Override // n1.d
    public s c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((i1.k) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3240a == 1) {
                this.f3240a = 2;
                return new o1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3240a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3240a == 1) {
            this.f3240a = 2;
            return new o1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3240a).toString());
    }

    @Override // n1.d
    public void cancel() {
        Socket socket = ((m) this.f3242c).f3223c;
        if (socket != null) {
            j1.b.c(socket);
        }
    }

    @Override // n1.d
    public void d(H.e eVar) {
        Proxy.Type type = ((m) this.f3242c).f3222b.f2515b.type();
        X0.e.d(type, "connection.route().proxy.type()");
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
        X0.e.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k((i1.k) eVar.d, sb2);
    }

    @Override // n1.d
    public i1.s e(boolean z2) {
        C0085b c0085b = (C0085b) this.f3244f;
        int i = this.f3240a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3240a).toString());
        }
        try {
            String m2 = ((v1.o) c0085b.f2031c).m(c0085b.f2030b);
            c0085b.f2030b -= m2.length();
            B.d i2 = i1.p.i(m2);
            int i3 = i2.f18b;
            i1.s sVar = new i1.s();
            sVar.f2492b = (q) i2.f19c;
            sVar.f2493c = i3;
            sVar.d = (String) i2.d;
            sVar.f2495f = c0085b.f().c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f3240a = 3;
                return sVar;
            }
            if (102 > i3 || i3 >= 200) {
                this.f3240a = 4;
                return sVar;
            }
            this.f3240a = 3;
            return sVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3242c).f3222b.f2514a.h.f()), e2);
        }
    }

    @Override // n1.d
    public u f(t tVar) {
        if (!n1.e.a(tVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(t.e(tVar, "Transfer-Encoding"))) {
            i1.m mVar = (i1.m) tVar.f2501a.f213c;
            if (this.f3240a == 4) {
                this.f3240a = 5;
                return new o1.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f3240a).toString());
        }
        long i = j1.b.i(tVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3240a == 4) {
            this.f3240a = 5;
            ((m) this.f3242c).k();
            return new o1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3240a).toString());
    }

    @Override // n1.d
    public m g() {
        return (m) this.f3242c;
    }

    @Override // n1.d
    public long h(t tVar) {
        if (!n1.e.a(tVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(t.e(tVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return j1.b.i(tVar);
    }

    public boolean i() {
        return this.f3240a < ((List) this.f3243e).size() || !((ArrayList) this.f3245g).isEmpty();
    }

    public o1.d j(long j2) {
        if (this.f3240a == 4) {
            this.f3240a = 5;
            return new o1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3240a).toString());
    }

    public void k(i1.k kVar, String str) {
        X0.e.e(str, "requestLine");
        if (this.f3240a != 0) {
            throw new IllegalStateException(("state: " + this.f3240a).toString());
        }
        v1.n nVar = (v1.n) this.f3243e;
        nVar.d(str);
        nVar.d("\r\n");
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            nVar.d(kVar.b(i));
            nVar.d(": ");
            nVar.d(kVar.d(i));
            nVar.d("\r\n");
        }
        nVar.d("\r\n");
        this.f3240a = 1;
    }

    public p(i1.o oVar, m mVar, v1.o oVar2, v1.n nVar) {
        X0.e.e(mVar, "connection");
        X0.e.e(oVar2, "source");
        X0.e.e(nVar, "sink");
        this.f3241b = oVar;
        this.f3242c = mVar;
        this.d = oVar2;
        this.f3243e = nVar;
        this.f3244f = new C0085b(oVar2);
    }
}
