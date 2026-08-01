package z3;

import g4.g;
import g4.h;
import g4.p;
import g4.v;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import t3.j;
import t3.k;
import t3.o;
import t3.q;
import t3.r;
import t3.s;
import x3.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e implements y3.d {

    /* renamed from: a, reason: collision with root package name */
    public final o f4156a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4157b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4158c;
    public final g d;

    /* renamed from: e, reason: collision with root package name */
    public int f4159e;

    /* renamed from: f, reason: collision with root package name */
    public final g1.g f4160f;

    /* renamed from: g, reason: collision with root package name */
    public j f4161g;

    public e(o oVar, l lVar, p pVar, g4.o oVar2) {
        i3.d.e(pVar, "source");
        i3.d.e(oVar2, "sink");
        this.f4156a = oVar;
        this.f4157b = lVar;
        this.f4158c = pVar;
        this.d = oVar2;
        this.f4160f = new g1.g(pVar);
    }

    @Override // y3.d
    public final void a() {
        this.d.flush();
    }

    @Override // y3.d
    public final void b() {
        this.d.flush();
    }

    @Override // y3.d
    public final v c(s sVar) {
        if (!y3.e.a(sVar)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(s.m("Transfer-Encoding", sVar))) {
            k kVar = sVar.f3520f.f3506a;
            if (this.f4159e == 4) {
                this.f4159e = 5;
                return new b(this, kVar);
            }
            throw new IllegalStateException(("state: " + this.f4159e).toString());
        }
        long h = u3.b.h(sVar);
        if (h != -1) {
            return h(h);
        }
        if (this.f4159e == 4) {
            this.f4159e = 5;
            this.f4157b.k();
            return new d(this);
        }
        throw new IllegalStateException(("state: " + this.f4159e).toString());
    }

    @Override // y3.d
    public final void cancel() {
        Socket socket = this.f4157b.f3930c;
        if (socket != null) {
            u3.b.c(socket);
        }
    }

    @Override // y3.d
    public final long d(s sVar) {
        if (!y3.e.a(sVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(s.m("Transfer-Encoding", sVar))) {
            return -1L;
        }
        return u3.b.h(sVar);
    }

    @Override // y3.d
    public final r e(boolean z4) {
        g1.g gVar = this.f4160f;
        int i = this.f4159e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f4159e).toString());
        }
        try {
            String g3 = ((h) gVar.f1662c).g(gVar.f1661b);
            gVar.f1661b -= g3.length();
            e0.d v4 = s.a.v(g3);
            int i4 = v4.f1321b;
            r rVar = new r();
            rVar.f3511b = (t3.p) v4.f1322c;
            rVar.f3512c = i4;
            rVar.d = (String) v4.d;
            rVar.f3514f = gVar.f().c();
            if (z4 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.f4159e = 3;
                return rVar;
            }
            if (102 > i4 || i4 >= 200) {
                this.f4159e = 4;
                return rVar;
            }
            this.f4159e = 3;
            return rVar;
        } catch (EOFException e4) {
            throw new IOException("unexpected end of stream on ".concat(this.f4157b.f3929b.f3533a.h.f()), e4);
        }
    }

    @Override // y3.d
    public final void f(q qVar) {
        Proxy.Type type = this.f4157b.f3929b.f3534b.type();
        i3.d.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.f3507b);
        sb.append(' ');
        k kVar = qVar.f3506a;
        if (kVar.i || type != Proxy.Type.HTTP) {
            String b2 = kVar.b();
            String d = kVar.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(kVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        i3.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        i(qVar.f3508c, sb2);
    }

    @Override // y3.d
    public final l g() {
        return this.f4157b;
    }

    public final c h(long j2) {
        if (this.f4159e == 4) {
            this.f4159e = 5;
            return new c(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f4159e).toString());
    }

    public final void i(j jVar, String str) {
        i3.d.e(str, "requestLine");
        if (this.f4159e != 0) {
            throw new IllegalStateException(("state: " + this.f4159e).toString());
        }
        g gVar = this.d;
        gVar.j(str).j("\r\n");
        int size = jVar.size();
        for (int i = 0; i < size; i++) {
            gVar.j(jVar.b(i)).j(": ").j(jVar.d(i)).j("\r\n");
        }
        gVar.j("\r\n");
        this.f4159e = 1;
    }
}
