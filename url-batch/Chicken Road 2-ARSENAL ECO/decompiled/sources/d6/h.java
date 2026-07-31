package d6;

import F5.j;
import X5.n;
import X5.o;
import X5.s;
import X5.t;
import X5.w;
import a1.AbstractC0223a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import n6.p;
import n6.q;
import n6.u;
import n6.v;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class h implements c6.f {

    /* renamed from: f, reason: collision with root package name */
    public static final n f3988f;

    /* renamed from: a, reason: collision with root package name */
    public final s f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.e f3990b;

    /* renamed from: c, reason: collision with root package name */
    public final B0.c f3991c;

    /* renamed from: d, reason: collision with root package name */
    public int f3992d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3993e;

    static {
        n nVar = n.f2972g;
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        i.e(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (strArr[i8] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i8] = j.h0(inputNamesAndValues[i8]).toString();
        }
        int x6 = AbstractC0223a.x(0, strArr.length - 1, 2);
        if (x6 >= 0) {
            while (true) {
                String str = strArr[i7];
                String str2 = strArr[i7 + 1];
                i6.g.o(str);
                i6.g.p(str2, str);
                if (i7 == x6) {
                    break;
                } else {
                    i7 += 2;
                }
            }
        }
        f3988f = new n(strArr);
    }

    public h(s sVar, c6.e eVar, B0.c socket) {
        i.e(socket, "socket");
        this.f3989a = sVar;
        this.f3990b = eVar;
        this.f3991c = socket;
        this.f3993e = new a((q) socket.f73i);
    }

    @Override // c6.f
    public final u a(D0.h hVar, long j4) {
        if ("chunked".equalsIgnoreCase(((n) hVar.f332d).a("Transfer-Encoding"))) {
            if (this.f3992d == 1) {
                this.f3992d = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f3992d).toString());
        }
        if (j4 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3992d == 1) {
            this.f3992d = 2;
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f3992d).toString());
    }

    @Override // c6.f
    public final void b(D0.h hVar) {
        Proxy.Type type = this.f3990b.f().f3080b.type();
        i.d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) hVar.f330b);
        sb.append(' ');
        o oVar = (o) hVar.f331c;
        if (i.a(oVar.f2974a, "https") || type != Proxy.Type.HTTP) {
            String b7 = oVar.b();
            String d7 = oVar.d();
            if (d7 != null) {
                b7 = b7 + '?' + d7;
            }
            sb.append(b7);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        l((n) hVar.f332d, sb.toString());
    }

    @Override // c6.f
    public final void c() {
        ((p) this.f3991c.f71g).flush();
    }

    @Override // c6.f
    public final void cancel() {
        this.f3990b.cancel();
    }

    @Override // c6.f
    public final boolean d() {
        return this.f3992d == 6;
    }

    @Override // c6.f
    public final void e() {
        ((p) this.f3991c.f71g).flush();
    }

    @Override // c6.f
    public final v f() {
        return this.f3991c;
    }

    @Override // c6.f
    public final c6.e g() {
        return this.f3990b;
    }

    @Override // c6.f
    public final long h(w wVar) {
        if (!c6.g.a(wVar)) {
            return 0L;
        }
        String a7 = wVar.f3066k.a("Transfer-Encoding");
        if (a7 == null) {
            a7 = null;
        }
        if ("chunked".equalsIgnoreCase(a7)) {
            return -1L;
        }
        return Y5.e.e(wVar);
    }

    @Override // c6.f
    public final n6.w i(w wVar) {
        D0.h hVar = wVar.f3061f;
        if (!c6.g.a(wVar)) {
            return k((o) hVar.f331c, 0L);
        }
        String a7 = wVar.f3066k.a("Transfer-Encoding");
        if (a7 == null) {
            a7 = null;
        }
        if ("chunked".equalsIgnoreCase(a7)) {
            o oVar = (o) hVar.f331c;
            if (this.f3992d == 4) {
                this.f3992d = 5;
                return new d(this, oVar);
            }
            throw new IllegalStateException(("state: " + this.f3992d).toString());
        }
        long e4 = Y5.e.e(wVar);
        if (e4 != -1) {
            return k((o) hVar.f331c, e4);
        }
        o url = (o) hVar.f331c;
        if (this.f3992d != 4) {
            throw new IllegalStateException(("state: " + this.f3992d).toString());
        }
        this.f3992d = 5;
        this.f3990b.h();
        i.e(url, "url");
        return new g(this, url);
    }

    @Override // c6.f
    public final X5.v j(boolean z5) {
        a aVar = this.f3993e;
        int i7 = this.f3992d;
        if (i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f3992d).toString());
        }
        try {
            String w5 = aVar.f3970a.w(aVar.f3971b);
            aVar.f3971b -= w5.length();
            D1.b p4 = AbstractC0676f.p(w5);
            int i8 = p4.f368b;
            X5.v vVar = new X5.v();
            vVar.f3047b = (t) p4.f370d;
            vVar.f3048c = i8;
            vVar.f3049d = (String) p4.f369c;
            vVar.f3051f = aVar.a().c();
            if (z5 && i8 == 100) {
                return null;
            }
            if (i8 == 100) {
                this.f3992d = 3;
                return vVar;
            }
            if (102 > i8 || i8 >= 200) {
                this.f3992d = 4;
                return vVar;
            }
            this.f3992d = 3;
            return vVar;
        } catch (EOFException e4) {
            throw new IOException(C1.c.h("unexpected end of stream on ", this.f3990b.f().f3079a.f2885h.f()), e4);
        }
    }

    public final e k(o oVar, long j4) {
        if (this.f3992d == 4) {
            this.f3992d = 5;
            return new e(this, oVar, j4);
        }
        throw new IllegalStateException(("state: " + this.f3992d).toString());
    }

    public final void l(n headers, String requestLine) {
        i.e(headers, "headers");
        i.e(requestLine, "requestLine");
        if (this.f3992d != 0) {
            throw new IllegalStateException(("state: " + this.f3992d).toString());
        }
        B0.c cVar = this.f3991c;
        p pVar = (p) cVar.f71g;
        p pVar2 = (p) cVar.f71g;
        pVar.D(requestLine);
        pVar.D("\r\n");
        int size = headers.size();
        for (int i7 = 0; i7 < size; i7++) {
            pVar2.D(headers.b(i7));
            pVar2.D(": ");
            pVar2.D(headers.d(i7));
            pVar2.D("\r\n");
        }
        pVar2.D("\r\n");
        this.f3992d = 1;
    }
}
