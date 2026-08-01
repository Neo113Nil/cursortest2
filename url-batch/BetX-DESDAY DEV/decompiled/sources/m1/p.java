package m1;

import O0.q;
import e0.C0115b;
import i1.C0167a;
import i1.v;
import i1.w;
import i1.x;
import i1.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import v1.u;

/* loaded from: classes.dex */
public final class p implements n1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3610a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3611b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3612c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3613d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3614e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3615f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3616g;

    public p(C0167a c0167a, l1.d dVar, i1.d dVar2) {
        List j2;
        X0.f.e(dVar, "routeDatabase");
        X0.f.e(dVar2, "call");
        this.f3611b = c0167a;
        this.f3612c = dVar;
        this.f3613d = dVar2;
        q qVar = q.f695a;
        this.f3614e = qVar;
        this.f3615f = qVar;
        this.f3616g = new ArrayList();
        i1.p pVar = c0167a.h;
        X0.f.e(pVar, "url");
        URI g2 = pVar.g();
        if (g2.getHost() == null) {
            j2 = j1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c0167a.f2643g.select(g2);
            j2 = (select == null || select.isEmpty()) ? j1.b.j(Proxy.NO_PROXY) : j1.b.v(select);
        }
        this.f3614e = j2;
        this.f3610a = 0;
    }

    @Override // n1.d
    public u a(w wVar, long j2) {
        if ("chunked".equalsIgnoreCase(wVar.f2782c.a("Transfer-Encoding"))) {
            if (this.f3610a == 1) {
                this.f3610a = 2;
                return new o1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3610a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3610a == 1) {
            this.f3610a = 2;
            return new o1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3610a).toString());
    }

    @Override // n1.d
    public void b() {
        ((v1.p) this.f3614e).flush();
    }

    @Override // n1.d
    public void c() {
        ((v1.p) this.f3614e).flush();
    }

    @Override // n1.d
    public void cancel() {
        Socket socket = ((m) this.f3612c).f3591c;
        if (socket != null) {
            j1.b.c(socket);
        }
    }

    @Override // n1.d
    public void d(w wVar) {
        Proxy.Type type = ((m) this.f3612c).f3590b.f2628b.type();
        X0.f.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(wVar.f2781b);
        sb.append(' ');
        i1.p pVar = wVar.f2780a;
        if (pVar.i || type != Proxy.Type.HTTP) {
            String b2 = pVar.b();
            String d2 = pVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            sb.append(b2);
        } else {
            sb.append(pVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        X0.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k(wVar.f2782c, sb2);
    }

    @Override // n1.d
    public x e(boolean z2) {
        C0115b c0115b = (C0115b) this.f3615f;
        int i = this.f3610a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3610a).toString());
        }
        try {
            String o2 = ((v1.q) c0115b.f2199c).o(c0115b.f2198b);
            c0115b.f2198b -= o2.length();
            B.d n2 = i1.m.n(o2);
            int i2 = n2.f21b;
            x xVar = new x();
            xVar.f2786b = (v) n2.f22c;
            xVar.f2787c = i2;
            xVar.f2788d = (String) n2.f23d;
            xVar.f2790f = c0115b.f().c();
            if (z2 && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f3610a = 3;
                return xVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.f3610a = 4;
                return xVar;
            }
            this.f3610a = 3;
            return xVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3612c).f3590b.f2627a.h.f()), e2);
        }
    }

    @Override // n1.d
    public v1.w f(y yVar) {
        if (!n1.e.a(yVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(y.g(yVar, "Transfer-Encoding"))) {
            i1.p pVar = yVar.f2796a.f2780a;
            if (this.f3610a == 4) {
                this.f3610a = 5;
                return new o1.c(this, pVar);
            }
            throw new IllegalStateException(("state: " + this.f3610a).toString());
        }
        long i = j1.b.i(yVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3610a == 4) {
            this.f3610a = 5;
            ((m) this.f3612c).k();
            return new o1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3610a).toString());
    }

    @Override // n1.d
    public m g() {
        return (m) this.f3612c;
    }

    @Override // n1.d
    public long h(y yVar) {
        if (!n1.e.a(yVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(y.g(yVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return j1.b.i(yVar);
    }

    public boolean i() {
        return this.f3610a < ((List) this.f3614e).size() || !((ArrayList) this.f3616g).isEmpty();
    }

    public o1.d j(long j2) {
        if (this.f3610a == 4) {
            this.f3610a = 5;
            return new o1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3610a).toString());
    }

    public void k(i1.n nVar, String str) {
        X0.f.e(str, "requestLine");
        if (this.f3610a != 0) {
            throw new IllegalStateException(("state: " + this.f3610a).toString());
        }
        v1.p pVar = (v1.p) this.f3614e;
        pVar.e(str);
        pVar.e("\r\n");
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            pVar.e(nVar.b(i));
            pVar.e(": ");
            pVar.e(nVar.d(i));
            pVar.e("\r\n");
        }
        pVar.e("\r\n");
        this.f3610a = 1;
    }

    public p(i1.u uVar, m mVar, v1.q qVar, v1.p pVar) {
        X0.f.e(mVar, "connection");
        X0.f.e(qVar, "source");
        X0.f.e(pVar, "sink");
        this.f3611b = uVar;
        this.f3612c = mVar;
        this.f3613d = qVar;
        this.f3614e = pVar;
        this.f3615f = new C0115b(qVar);
    }
}
