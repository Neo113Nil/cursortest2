package Z4;

import B4.i;
import B4.k;
import T4.o;
import T4.u;
import T4.y;
import T4.z;
import W.C0157b;
import Y4.h;
import j5.p;
import j5.q;
import j5.v;
import j5.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements Y4.g {

    /* renamed from: f, reason: collision with root package name */
    public static final o f3808f;

    /* renamed from: a, reason: collision with root package name */
    public final u f3809a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4.f f3810b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3811c;

    /* renamed from: d, reason: collision with root package name */
    public int f3812d;

    /* renamed from: e, reason: collision with root package name */
    public final C0157b f3813e;

    static {
        o oVar = o.f2913b;
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        kotlin.jvm.internal.i.e(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr[i3] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i3] = k.n0(inputNamesAndValues[i3]).toString();
        }
        int w3 = B0.f.w(0, strArr.length - 1, 2);
        if (w3 >= 0) {
            while (true) {
                String str = strArr[i2];
                String str2 = strArr[i2 + 1];
                B0.f.z(str);
                B0.f.A(str2, str);
                if (i2 == w3) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        f3808f = new o(strArr);
    }

    public g(u uVar, Y4.f fVar, i socket) {
        kotlin.jvm.internal.i.e(socket, "socket");
        this.f3809a = uVar;
        this.f3810b = fVar;
        this.f3811c = socket;
        this.f3813e = new C0157b((q) socket.f312c);
    }

    @Override // Y4.g
    public final void a(M0.e eVar) {
        Proxy.Type type = this.f3810b.f().f2806b.type();
        kotlin.jvm.internal.i.d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) eVar.f1784d);
        sb.append(' ');
        T4.q qVar = (T4.q) eVar.f1783c;
        if (kotlin.jvm.internal.i.a(qVar.f2923a, "https") || type != Proxy.Type.HTTP) {
            String b6 = qVar.b();
            String d6 = qVar.d();
            if (d6 != null) {
                b6 = b6 + '?' + d6;
            }
            sb.append(b6);
        } else {
            sb.append(qVar);
        }
        sb.append(" HTTP/1.1");
        l((o) eVar.f1785e, sb.toString());
    }

    @Override // Y4.g
    public final void b() {
        ((p) this.f3811c.f313d).flush();
    }

    @Override // Y4.g
    public final boolean c() {
        return this.f3812d == 6;
    }

    @Override // Y4.g
    public final void cancel() {
        this.f3810b.cancel();
    }

    @Override // Y4.g
    public final void d() {
        ((p) this.f3811c.f313d).flush();
    }

    @Override // Y4.g
    public final v e() {
        return this.f3811c;
    }

    @Override // Y4.g
    public final long f(z zVar) {
        if (!h.a(zVar)) {
            return 0L;
        }
        String c2 = zVar.f3020f.c("Transfer-Encoding");
        if (c2 == null) {
            c2 = null;
        }
        if ("chunked".equalsIgnoreCase(c2)) {
            return -1L;
        }
        return U4.e.f(zVar);
    }

    @Override // Y4.g
    public final Y4.f g() {
        return this.f3810b;
    }

    @Override // Y4.g
    public final w h(z zVar) {
        w fVar;
        boolean a6 = h.a(zVar);
        M0.e eVar = zVar.f3015a;
        if (!a6) {
            return k((T4.q) eVar.f1783c, 0L);
        }
        String c2 = zVar.f3020f.c("Transfer-Encoding");
        if (c2 == null) {
            c2 = null;
        }
        if ("chunked".equalsIgnoreCase(c2)) {
            T4.q qVar = (T4.q) eVar.f1783c;
            if (this.f3812d != 4) {
                throw new IllegalStateException(("state: " + this.f3812d).toString());
            }
            this.f3812d = 5;
            fVar = new c(this, qVar);
        } else {
            long f3 = U4.e.f(zVar);
            if (f3 != -1) {
                return k((T4.q) eVar.f1783c, f3);
            }
            T4.q url = (T4.q) eVar.f1783c;
            if (this.f3812d != 4) {
                throw new IllegalStateException(("state: " + this.f3812d).toString());
            }
            this.f3812d = 5;
            this.f3810b.h();
            kotlin.jvm.internal.i.e(url, "url");
            fVar = new f(this, url);
        }
        return fVar;
    }

    @Override // Y4.g
    public final j5.u i(M0.e eVar, long j2) {
        if ("chunked".equalsIgnoreCase(((o) eVar.f1785e).c("Transfer-Encoding"))) {
            if (this.f3812d == 1) {
                this.f3812d = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f3812d).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3812d == 1) {
            this.f3812d = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.f3812d).toString());
    }

    @Override // Y4.g
    public final y j(boolean z) {
        C0157b c0157b = this.f3813e;
        int i2 = this.f3812d;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException(("state: " + this.f3812d).toString());
        }
        try {
            String q5 = ((q) c0157b.f3299c).q(c0157b.f3298b);
            c0157b.f3298b -= q5.length();
            B3.d H5 = B0.f.H(q5);
            int i3 = H5.f276b;
            y yVar = new y();
            yVar.f3001b = (T4.v) H5.f277c;
            yVar.f3002c = i3;
            yVar.f3003d = (String) H5.f278d;
            yVar.f3005f = c0157b.c().e();
            if (z && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f3812d = 3;
                return yVar;
            }
            if (102 > i3 || i3 >= 200) {
                this.f3812d = 4;
                return yVar;
            }
            this.f3812d = 3;
            return yVar;
        } catch (EOFException e3) {
            throw new IOException(B0.o.i("unexpected end of stream on ", this.f3810b.f().f2805a.f2824h.f()), e3);
        }
    }

    public final d k(T4.q qVar, long j2) {
        if (this.f3812d == 4) {
            this.f3812d = 5;
            return new d(this, qVar, j2);
        }
        throw new IllegalStateException(("state: " + this.f3812d).toString());
    }

    public final void l(o headers, String requestLine) {
        kotlin.jvm.internal.i.e(headers, "headers");
        kotlin.jvm.internal.i.e(requestLine, "requestLine");
        if (this.f3812d != 0) {
            throw new IllegalStateException(("state: " + this.f3812d).toString());
        }
        i iVar = this.f3811c;
        p pVar = (p) iVar.f313d;
        pVar.x(requestLine);
        pVar.x("\r\n");
        int size = headers.size();
        int i2 = 0;
        while (true) {
            p pVar2 = (p) iVar.f313d;
            if (i2 >= size) {
                pVar2.x("\r\n");
                this.f3812d = 1;
                return;
            } else {
                pVar2.x(headers.d(i2));
                pVar2.x(": ");
                pVar2.x(headers.f(i2));
                pVar2.x("\r\n");
                i2++;
            }
        }
    }
}
