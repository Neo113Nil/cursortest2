package q3;

import A.C0016l;
import A0.q;
import f1.C0607a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m3.C0862a;
import m3.m;
import m3.o;
import m3.r;
import m3.t;
import m3.v;
import m3.w;
import o.S0;
import z2.C1405I;
import z3.D;
import z3.F;
import z3.G;
import z3.H;
import z3.n;
import z3.x;
import z3.z;

/* loaded from: classes.dex */
public final class l implements r3.d {

    /* renamed from: a, reason: collision with root package name */
    public int f9426a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9427b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9428c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9429d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9430e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9431f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f9432g;

    public l(C0862a address, C0607a routeDatabase, g call) {
        List proxies;
        m3.j eventListener = m3.j.f8386d;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f9427b = address;
        this.f9428c = routeDatabase;
        this.f9429d = call;
        C1405I c1405i = C1405I.f11931d;
        this.f9430e = c1405i;
        this.f9431f = c1405i;
        this.f9432g = new ArrayList();
        Intrinsics.checkNotNullParameter(call, "call");
        m url = address.f8320h;
        Intrinsics.checkNotNullParameter(url, "url");
        URI g4 = url.g();
        if (g4.getHost() == null) {
            proxies = n3.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = address.f8319g.select(g4);
            if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                proxies = n3.b.k(Proxy.NO_PROXY);
            } else {
                Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                proxies = n3.b.w(proxiesOrNull);
            }
        }
        this.f9430e = proxies;
        this.f9426a = 0;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public static final void i(l lVar, n nVar) {
        lVar.getClass();
        H h4 = nVar.f12018e;
        G delegate = H.f11975d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        nVar.f12018e = delegate;
        h4.a();
        h4.b();
    }

    @Override // r3.d
    public void a(q request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = ((i) this.f9428c).f9404b.f8491b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append((String) request.f363d);
        sb.append(' ');
        m url = (m) request.f362c;
        if (url.f8401i || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String b4 = url.b();
            String d4 = url.d();
            if (d4 != null) {
                b4 = b4 + '?' + d4;
            }
            sb.append(b4);
        } else {
            sb.append(url);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        l((m3.l) request.f364e, sb2);
    }

    @Override // r3.d
    public F b(w response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!r3.e.a(response)) {
            return k(0L);
        }
        if ("chunked".equalsIgnoreCase(w.a("Transfer-Encoding", response))) {
            m mVar = (m) response.f8473d.f362c;
            if (this.f9426a == 4) {
                this.f9426a = 5;
                return new s3.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f9426a).toString());
        }
        long j4 = n3.b.j(response);
        if (j4 != -1) {
            return k(j4);
        }
        if (this.f9426a == 4) {
            this.f9426a = 5;
            ((i) this.f9428c).k();
            return new s3.f(this);
        }
        throw new IllegalStateException(("state: " + this.f9426a).toString());
    }

    @Override // r3.d
    public D c(q request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.getClass();
        if ("chunked".equalsIgnoreCase(request.i("Transfer-Encoding"))) {
            if (this.f9426a == 1) {
                this.f9426a = 2;
                return new s3.b(this);
            }
            throw new IllegalStateException(("state: " + this.f9426a).toString());
        }
        if (j4 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f9426a == 1) {
            this.f9426a = 2;
            return new s3.e(this);
        }
        throw new IllegalStateException(("state: " + this.f9426a).toString());
    }

    @Override // r3.d
    public void cancel() {
        Socket socket = ((i) this.f9428c).f9405c;
        if (socket != null) {
            n3.b.d(socket);
        }
    }

    @Override // r3.d
    public void d() {
        ((x) this.f9430e).flush();
    }

    @Override // r3.d
    public long e(w response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!r3.e.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(w.a("Transfer-Encoding", response))) {
            return -1L;
        }
        return n3.b.j(response);
    }

    @Override // r3.d
    public void f() {
        ((x) this.f9430e).flush();
    }

    @Override // r3.d
    public v g(boolean z4) {
        S0 s02 = (S0) this.f9431f;
        int i2 = this.f9426a;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException(("state: " + this.f9426a).toString());
        }
        m1.k kVar = null;
        try {
            String r2 = ((z) s02.f8712b).r(s02.f8711a);
            s02.f8711a -= r2.length();
            C0016l s4 = o.s(r2);
            int i4 = s4.f163b;
            v vVar = new v();
            t protocol = (t) s4.f164c;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            vVar.f8461b = protocol;
            vVar.f8462c = i4;
            String message = (String) s4.f165d;
            Intrinsics.checkNotNullParameter(message, "message");
            vVar.f8463d = message;
            m3.l headers = s02.a();
            Intrinsics.checkNotNullParameter(headers, "headers");
            vVar.f8465f = headers.s();
            if (z4 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.f9426a = 3;
            } else if (102 > i4 || i4 >= 200) {
                this.f9426a = 4;
            } else {
                this.f9426a = 3;
            }
            return vVar;
        } catch (EOFException e4) {
            m mVar = ((i) this.f9428c).f9404b.f8490a.f8320h;
            mVar.getClass();
            Intrinsics.checkNotNullParameter("/...", "link");
            try {
                m1.k kVar2 = new m1.k(1);
                kVar2.o(mVar, "/...");
                kVar = kVar2;
            } catch (IllegalArgumentException unused) {
            }
            Intrinsics.c(kVar);
            Intrinsics.checkNotNullParameter("", "username");
            kVar.f8284f = m3.j.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            Intrinsics.checkNotNullParameter("", "password");
            kVar.f8285g = m3.j.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException("unexpected end of stream on " + kVar.b().f8400h, e4);
        }
    }

    @Override // r3.d
    public i h() {
        return (i) this.f9428c;
    }

    public boolean j() {
        return this.f9426a < ((List) this.f9430e).size() || !((ArrayList) this.f9432g).isEmpty();
    }

    public s3.d k(long j4) {
        if (this.f9426a == 4) {
            this.f9426a = 5;
            return new s3.d(this, j4);
        }
        throw new IllegalStateException(("state: " + this.f9426a).toString());
    }

    public void l(m3.l headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f9426a != 0) {
            throw new IllegalStateException(("state: " + this.f9426a).toString());
        }
        x xVar = (x) this.f9430e;
        xVar.m(requestLine);
        xVar.m("\r\n");
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            xVar.m(headers.h(i2));
            xVar.m(": ");
            xVar.m(headers.w(i2));
            xVar.m("\r\n");
        }
        xVar.m("\r\n");
        this.f9426a = 1;
    }

    public l(r rVar, i connection, z source, x sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f9427b = rVar;
        this.f9428c = connection;
        this.f9429d = source;
        this.f9430e = sink;
        this.f9431f = new S0(source);
    }
}
