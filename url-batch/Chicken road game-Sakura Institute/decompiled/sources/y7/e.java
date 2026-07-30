package y7;

import a2.q;
import f8.a0;
import f8.g;
import f8.g0;
import f8.h;
import f8.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import o.q1;
import s7.k;
import s7.l;
import s7.p;
import s7.r;
import s7.s;
import w7.i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements x7.d {

    /* renamed from: a, reason: collision with root package name */
    public final p f9931a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9932b;

    /* renamed from: c, reason: collision with root package name */
    public final h f9933c;

    /* renamed from: d, reason: collision with root package name */
    public final g f9934d;

    /* renamed from: e, reason: collision with root package name */
    public int f9935e;

    /* renamed from: f, reason: collision with root package name */
    public final q1 f9936f;

    /* renamed from: g, reason: collision with root package name */
    public k f9937g;

    public e(p pVar, i iVar, a0 a0Var, y yVar) {
        r6.k.f(a0Var, "source");
        r6.k.f(yVar, "sink");
        this.f9931a = pVar;
        this.f9932b = iVar;
        this.f9933c = a0Var;
        this.f9934d = yVar;
        this.f9936f = new q1(a0Var);
    }

    @Override // x7.d
    public final long a(s sVar) {
        if (!x7.e.a(sVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(s.b("Transfer-Encoding", sVar))) {
            return -1L;
        }
        return t7.b.i(sVar);
    }

    @Override // x7.d
    public final void b(q qVar) {
        Proxy.Type type = this.f9932b.f9567b.f8699b.type();
        r6.k.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) qVar.f437d);
        sb.append(' ');
        l lVar = (l) qVar.f436c;
        if (lVar.f8616i || type != Proxy.Type.HTTP) {
            String b9 = lVar.b();
            String d8 = lVar.d();
            if (d8 != null) {
                b9 = b9 + '?' + d8;
            }
            sb.append(b9);
        } else {
            sb.append(lVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        i((k) qVar.f438e, sb2);
    }

    @Override // x7.d
    public final void c() {
        this.f9934d.flush();
    }

    @Override // x7.d
    public final void cancel() {
        Socket socket = this.f9932b.f9568c;
        if (socket != null) {
            t7.b.d(socket);
        }
    }

    @Override // x7.d
    public final void d() {
        this.f9934d.flush();
    }

    @Override // x7.d
    public final g0 e(s sVar) {
        if (!x7.e.a(sVar)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(s.b("Transfer-Encoding", sVar))) {
            l lVar = (l) sVar.f8683f.f436c;
            if (this.f9935e == 4) {
                this.f9935e = 5;
                return new b(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.f9935e).toString());
        }
        long i7 = t7.b.i(sVar);
        if (i7 != -1) {
            return h(i7);
        }
        if (this.f9935e == 4) {
            this.f9935e = 5;
            this.f9932b.k();
            return new d(this);
        }
        throw new IllegalStateException(("state: " + this.f9935e).toString());
    }

    @Override // x7.d
    public final r f(boolean z8) {
        q1 q1Var = this.f9936f;
        int i7 = this.f9935e;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f9935e).toString());
        }
        n3.k kVar = null;
        try {
            String y4 = ((h) q1Var.f6719b).y(q1Var.f6718a);
            q1Var.f6718a -= y4.length();
            a0.l l8 = u3.r.l(y4);
            int i8 = l8.f100g;
            r rVar = new r();
            rVar.f8671b = (s7.q) l8.f101h;
            rVar.f8672c = i8;
            rVar.f8673d = (String) l8.f102i;
            rVar.f8675f = q1Var.a().m();
            if (z8 && i8 == 100) {
                return null;
            }
            if (i8 == 100) {
                this.f9935e = 3;
                return rVar;
            }
            if (102 > i8 || i8 >= 200) {
                this.f9935e = 4;
                return rVar;
            }
            this.f9935e = 3;
            return rVar;
        } catch (EOFException e9) {
            l lVar = this.f9932b.f9567b.f8698a.f8536h;
            lVar.getClass();
            try {
                n3.k kVar2 = new n3.k(1);
                kVar2.o(lVar, "/...");
                kVar = kVar2;
            } catch (IllegalArgumentException unused) {
            }
            r6.k.c(kVar);
            kVar.f6540f = s7.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
            kVar.f6541g = s7.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
            throw new IOException("unexpected end of stream on ".concat(kVar.b().f8615h), e9);
        }
    }

    @Override // x7.d
    public final i g() {
        return this.f9932b;
    }

    public final c h(long j8) {
        if (this.f9935e == 4) {
            this.f9935e = 5;
            return new c(this, j8);
        }
        throw new IllegalStateException(("state: " + this.f9935e).toString());
    }

    public final void i(k kVar, String str) {
        r6.k.f(str, "requestLine");
        if (this.f9935e != 0) {
            throw new IllegalStateException(("state: " + this.f9935e).toString());
        }
        g gVar = this.f9934d;
        gVar.K(str).K("\r\n");
        int size = kVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            gVar.K(kVar.g(i7)).K(": ").K(kVar.w(i7)).K("\r\n");
        }
        gVar.K("\r\n");
        this.f9935e = 1;
    }
}
