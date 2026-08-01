package m1;

import Q0.q;
import f0.C0085b;
import i1.r;
import i1.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l.C0242k;
import v1.t;
import v1.v;

/* loaded from: classes.dex */
public final class p implements n1.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3261a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3262b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3263c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3264e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3265f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f3266g;

    public p(i1.a aVar, C0242k c0242k, j jVar) {
        List j2;
        X0.d.e(c0242k, "routeDatabase");
        X0.d.e(jVar, "call");
        this.f3262b = aVar;
        this.f3263c = c0242k;
        this.d = jVar;
        q qVar = q.f671a;
        this.f3264e = qVar;
        this.f3265f = qVar;
        this.f3266g = new ArrayList();
        i1.m mVar = aVar.h;
        X0.d.e(mVar, "url");
        URI g2 = mVar.g();
        if (g2.getHost() == null) {
            j2 = j1.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f2389g.select(g2);
            j2 = (select == null || select.isEmpty()) ? j1.b.j(Proxy.NO_PROXY) : j1.b.u(select);
        }
        this.f3264e = j2;
        this.f3261a = 0;
    }

    @Override // n1.d
    public void a() {
        ((v1.o) this.f3264e).flush();
    }

    @Override // n1.d
    public void b() {
        ((v1.o) this.f3264e).flush();
    }

    @Override // n1.d
    public t c(H.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((i1.k) eVar.d).a("Transfer-Encoding"))) {
            if (this.f3261a == 1) {
                this.f3261a = 2;
                return new o1.b(this);
            }
            throw new IllegalStateException(("state: " + this.f3261a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3261a == 1) {
            this.f3261a = 2;
            return new o1.e(this);
        }
        throw new IllegalStateException(("state: " + this.f3261a).toString());
    }

    @Override // n1.d
    public void cancel() {
        Socket socket = ((m) this.f3263c).f3244c;
        if (socket != null) {
            j1.b.c(socket);
        }
    }

    @Override // n1.d
    public void d(H.e eVar) {
        Proxy.Type type = ((m) this.f3263c).f3243b.f2536b.type();
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
    public i1.t e(boolean z2) {
        C0085b c0085b = (C0085b) this.f3265f;
        int i = this.f3261a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f3261a).toString());
        }
        try {
            String m2 = ((v1.p) c0085b.f2035c).m(c0085b.f2034b);
            c0085b.f2034b -= m2.length();
            B.d i2 = i1.q.i(m2);
            int i3 = i2.f18b;
            i1.t tVar = new i1.t();
            tVar.f2513b = (r) i2.f19c;
            tVar.f2514c = i3;
            tVar.d = (String) i2.d;
            tVar.f2516f = c0085b.f().c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f3261a = 3;
                return tVar;
            }
            if (102 > i3 || i3 >= 200) {
                this.f3261a = 4;
                return tVar;
            }
            this.f3261a = 3;
            return tVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((m) this.f3263c).f3243b.f2535a.h.f()), e2);
        }
    }

    @Override // n1.d
    public v f(u uVar) {
        if (!n1.e.a(uVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(u.e(uVar, "Transfer-Encoding"))) {
            i1.m mVar = (i1.m) uVar.f2522a.f213c;
            if (this.f3261a == 4) {
                this.f3261a = 5;
                return new o1.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f3261a).toString());
        }
        long i = j1.b.i(uVar);
        if (i != -1) {
            return j(i);
        }
        if (this.f3261a == 4) {
            this.f3261a = 5;
            ((m) this.f3263c).k();
            return new o1.f(this);
        }
        throw new IllegalStateException(("state: " + this.f3261a).toString());
    }

    @Override // n1.d
    public m g() {
        return (m) this.f3263c;
    }

    @Override // n1.d
    public long h(u uVar) {
        if (!n1.e.a(uVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(u.e(uVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return j1.b.i(uVar);
    }

    public boolean i() {
        return this.f3261a < ((List) this.f3264e).size() || !((ArrayList) this.f3266g).isEmpty();
    }

    public o1.d j(long j2) {
        if (this.f3261a == 4) {
            this.f3261a = 5;
            return new o1.d(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f3261a).toString());
    }

    public void k(i1.k kVar, String str) {
        X0.d.e(str, "requestLine");
        if (this.f3261a != 0) {
            throw new IllegalStateException(("state: " + this.f3261a).toString());
        }
        v1.o oVar = (v1.o) this.f3264e;
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
        this.f3261a = 1;
    }

    public p(i1.p pVar, m mVar, v1.p pVar2, v1.o oVar) {
        X0.d.e(mVar, "connection");
        X0.d.e(pVar2, "source");
        X0.d.e(oVar, "sink");
        this.f3262b = pVar;
        this.f3263c = mVar;
        this.d = pVar2;
        this.f3264e = oVar;
        this.f3265f = new C0085b(pVar2);
    }
}
