package i3;

import c3.k;
import c3.m;
import c3.q;
import c3.r;
import c3.s;
import c3.t;
import c3.u;
import g3.l;
import h3.f;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import p3.g;
import p3.h;
import p3.o;
import p3.p;
import p3.v;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements h3.e {

    /* renamed from: a, reason: collision with root package name */
    public final q f2114a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2115b;
    public final h c;

    /* renamed from: d, reason: collision with root package name */
    public final g f2116d;

    /* renamed from: e, reason: collision with root package name */
    public int f2117e;

    /* renamed from: f, reason: collision with root package name */
    public final b1.c f2118f;
    public k g;

    public e(q qVar, l lVar, p pVar, o oVar) {
        u2.c.e(pVar, "source");
        u2.c.e(oVar, "sink");
        this.f2114a = qVar;
        this.f2115b = lVar;
        this.c = pVar;
        this.f2116d = oVar;
        this.f2118f = new b1.c(pVar);
    }

    @Override // h3.e
    public final void a() {
        this.f2116d.flush();
    }

    @Override // h3.e
    public final void b() {
        this.f2116d.flush();
    }

    @Override // h3.e
    public final void c(s sVar) {
        Proxy.Type type = this.f2115b.f1958b.f1154b.type();
        u2.c.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(sVar.f1128b);
        sb.append(' ');
        m mVar = sVar.f1127a;
        if (mVar.f1081i || type != Proxy.Type.HTTP) {
            String b2 = mVar.b();
            String d4 = mVar.d();
            if (d4 != null) {
                b2 = b2 + '?' + d4;
            }
            sb.append(b2);
        } else {
            sb.append(mVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        u2.c.d(sb2, "StringBuilder().apply(builderAction).toString()");
        i(sVar.c, sb2);
    }

    @Override // h3.e
    public final void cancel() {
        Socket socket = this.f2115b.c;
        if (socket != null) {
            d3.c.c(socket);
        }
    }

    @Override // h3.e
    public final long d(u uVar) {
        if (!f.a(uVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(u.m(uVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return d3.c.h(uVar);
    }

    @Override // h3.e
    public final v e(u uVar) {
        if (!f.a(uVar)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(u.m(uVar, "Transfer-Encoding"))) {
            m mVar = uVar.f1141f.f1127a;
            if (this.f2117e == 4) {
                this.f2117e = 5;
                return new b(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f2117e).toString());
        }
        long h = d3.c.h(uVar);
        if (h != -1) {
            return h(h);
        }
        if (this.f2117e == 4) {
            this.f2117e = 5;
            this.f2115b.k();
            return new d(this);
        }
        throw new IllegalStateException(("state: " + this.f2117e).toString());
    }

    @Override // h3.e
    public final t f(boolean z3) {
        b1.c cVar = this.f2118f;
        int i4 = this.f2117e;
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            throw new IllegalStateException(("state: " + this.f2117e).toString());
        }
        try {
            String h = ((h) cVar.c).h(cVar.f744b);
            cVar.f744b -= h.length();
            b0.d T = k3.d.T(h);
            int i5 = T.f699b;
            t tVar = new t();
            tVar.f1132b = (r) T.c;
            tVar.c = i5;
            tVar.f1133d = (String) T.f700d;
            tVar.f1135f = cVar.f().c();
            if (z3 && i5 == 100) {
                return null;
            }
            if (i5 == 100) {
                this.f2117e = 3;
                return tVar;
            }
            if (102 > i5 || i5 >= 200) {
                this.f2117e = 4;
                return tVar;
            }
            this.f2117e = 3;
            return tVar;
        } catch (EOFException e4) {
            throw new IOException("unexpected end of stream on ".concat(this.f2115b.f1958b.f1153a.h.f()), e4);
        }
    }

    @Override // h3.e
    public final l g() {
        return this.f2115b;
    }

    public final c h(long j4) {
        if (this.f2117e == 4) {
            this.f2117e = 5;
            return new c(this, j4);
        }
        throw new IllegalStateException(("state: " + this.f2117e).toString());
    }

    public final void i(k kVar, String str) {
        u2.c.e(str, "requestLine");
        if (this.f2117e != 0) {
            throw new IllegalStateException(("state: " + this.f2117e).toString());
        }
        g gVar = this.f2116d;
        gVar.j(str).j("\r\n");
        int size = kVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            gVar.j(kVar.b(i4)).j(": ").j(kVar.d(i4)).j("\r\n");
        }
        gVar.j("\r\n");
        this.f2117e = 1;
    }
}
