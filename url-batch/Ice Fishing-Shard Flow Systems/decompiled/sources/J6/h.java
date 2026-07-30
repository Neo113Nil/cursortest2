package J6;

import B6.o;
import D0.j;
import D6.B;
import D6.C;
import D6.q;
import D6.s;
import D6.w;
import D6.z;
import T6.p;
import T6.u;
import T6.v;
import T6.x;
import T6.y;
import a.AbstractC0169a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class h implements I6.g {

    /* renamed from: f, reason: collision with root package name */
    public static final q f1410f;

    /* renamed from: a, reason: collision with root package name */
    public final w f1411a;

    /* renamed from: b, reason: collision with root package name */
    public final I6.f f1412b;

    /* renamed from: c, reason: collision with root package name */
    public final j f1413c;

    /* renamed from: d, reason: collision with root package name */
    public int f1414d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1415e;

    static {
        q qVar = q.f552e;
        String[] namesAndValues = {"OkHttp-Response-Body", "Truncated"};
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(namesAndValues, 2);
        Intrinsics.checkNotNullParameter(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i2 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (strArr[i5] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i5] = StringsKt.J(inputNamesAndValues[i5]).toString();
        }
        int a7 = Z5.c.a(0, strArr.length - 1, 2);
        if (a7 >= 0) {
            while (true) {
                String str = strArr[i2];
                String str2 = strArr[i2 + 1];
                P0.f.v(str);
                P0.f.w(str2, str);
                if (i2 == a7) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        f1410f = new q(strArr);
    }

    public h(w wVar, I6.f carrier, j socket) {
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f1411a = wVar;
        this.f1412b = carrier;
        this.f1413c = socket;
        this.f1415e = new a((T6.q) socket.f331i);
    }

    public static final void k(h hVar, T6.j jVar) {
        y yVar = jVar.f2622e;
        x delegate = y.f2655d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        jVar.f2622e = delegate;
        yVar.a();
        yVar.b();
    }

    @Override // I6.g
    public final void a() {
        ((p) this.f1413c.f332l).flush();
    }

    @Override // I6.g
    public final boolean b() {
        return this.f1414d == 6;
    }

    @Override // I6.g
    public final void c() {
        ((p) this.f1413c.f332l).flush();
    }

    @Override // I6.g
    public final void cancel() {
        this.f1412b.cancel();
    }

    @Override // I6.g
    public final v d() {
        return this.f1413c;
    }

    @Override // I6.g
    public final I6.f e() {
        return this.f1412b;
    }

    @Override // I6.g
    public final void f(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f1412b.f().f445b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "type(...)");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append((String) request.f639b);
        sb.append(' ');
        s url = (s) request.f640c;
        if (Intrinsics.a(url.f562a, "https") || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String b7 = url.b();
            String d7 = url.d();
            if (d7 != null) {
                b7 = b7 + '?' + d7;
            }
            sb.append(b7);
        } else {
            sb.append(url);
        }
        sb.append(" HTTP/1.1");
        m((q) request.f641d, sb.toString());
    }

    @Override // I6.g
    public final u g(z request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        Object obj = request.f642e;
        if ("chunked".equalsIgnoreCase(request.m("Transfer-Encoding"))) {
            if (this.f1414d == 1) {
                this.f1414d = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f1414d).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f1414d == 1) {
            this.f1414d = 2;
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f1414d).toString());
    }

    @Override // I6.g
    public final T6.w h(C response) {
        Intrinsics.checkNotNullParameter(response, "response");
        boolean a7 = I6.h.a(response);
        z zVar = response.f426d;
        if (!a7) {
            return l((s) zVar.f640c, 0L);
        }
        if ("chunked".equalsIgnoreCase(C.a(response, "Transfer-Encoding"))) {
            s sVar = (s) zVar.f640c;
            if (this.f1414d == 4) {
                this.f1414d = 5;
                return new d(this, sVar);
            }
            throw new IllegalStateException(("state: " + this.f1414d).toString());
        }
        long e7 = E6.e.e(response);
        if (e7 != -1) {
            return l((s) zVar.f640c, e7);
        }
        s url = (s) zVar.f640c;
        if (this.f1414d != 4) {
            throw new IllegalStateException(("state: " + this.f1414d).toString());
        }
        this.f1414d = 5;
        this.f1412b.h();
        Intrinsics.checkNotNullParameter(url, "url");
        return new g(this, url);
    }

    @Override // I6.g
    public final B i(boolean z7) {
        a aVar = this.f1415e;
        int i2 = this.f1414d;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException(("state: " + this.f1414d).toString());
        }
        try {
            String u7 = ((T6.h) aVar.f1393c).u(aVar.f1392b);
            aVar.f1392b -= u7.length();
            o t6 = AbstractC0169a.t(u7);
            int i5 = t6.f229b;
            B b7 = new B();
            D6.x protocol = (D6.x) t6.f230c;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            b7.f413b = protocol;
            b7.f414c = i5;
            String message = (String) t6.f231d;
            Intrinsics.checkNotNullParameter(message, "message");
            b7.f415d = message;
            q headers = aVar.c();
            Intrinsics.checkNotNullParameter(headers, "headers");
            b7.f417f = headers.c();
            if (z7 && i5 == 100) {
                return null;
            }
            if (i5 == 100) {
                this.f1414d = 3;
                return b7;
            }
            if (102 > i5 || i5 >= 200) {
                this.f1414d = 4;
                return b7;
            }
            this.f1414d = 3;
            return b7;
        } catch (EOFException e7) {
            throw new IOException(r4.f.i("unexpected end of stream on ", this.f1412b.f().f444a.f463h.f()), e7);
        }
    }

    @Override // I6.g
    public final long j(C response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!I6.h.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C.a(response, "Transfer-Encoding"))) {
            return -1L;
        }
        return E6.e.e(response);
    }

    public final e l(s sVar, long j) {
        if (this.f1414d == 4) {
            this.f1414d = 5;
            return new e(this, sVar, j);
        }
        throw new IllegalStateException(("state: " + this.f1414d).toString());
    }

    public final void m(q headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f1414d != 0) {
            throw new IllegalStateException(("state: " + this.f1414d).toString());
        }
        j jVar = this.f1413c;
        p pVar = (p) jVar.f332l;
        p pVar2 = (p) jVar.f332l;
        pVar.A(requestLine);
        pVar.A("\r\n");
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar2.A(headers.b(i2));
            pVar2.A(": ");
            pVar2.A(headers.d(i2));
            pVar2.A("\r\n");
        }
        pVar2.A("\r\n");
        this.f1414d = 1;
    }
}
