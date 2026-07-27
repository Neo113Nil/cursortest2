package t3;

import A.C0016l;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z3.C1451i;
import z3.D;
import z3.F;

/* loaded from: classes.dex */
public final class q implements r3.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f10834g = n3.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f10835h = n3.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final q3.i f10836a;

    /* renamed from: b, reason: collision with root package name */
    public final r3.f f10837b;

    /* renamed from: c, reason: collision with root package name */
    public final p f10838c;

    /* renamed from: d, reason: collision with root package name */
    public volatile x f10839d;

    /* renamed from: e, reason: collision with root package name */
    public final m3.t f10840e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10841f;

    public q(m3.r client, q3.i connection, r3.f chain, p http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f10836a = connection;
        this.f10837b = chain;
        this.f10838c = http2Connection;
        List list = client.f8449x;
        m3.t tVar = m3.t.H2_PRIOR_KNOWLEDGE;
        this.f10840e = list.contains(tVar) ? tVar : m3.t.HTTP_2;
    }

    @Override // r3.d
    public final void a(A0.q request) {
        int i2;
        x xVar;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f10839d != null) {
            return;
        }
        request.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        m3.l lVar = (m3.l) request.f364e;
        ArrayList requestHeaders = new ArrayList(lVar.size() + 4);
        requestHeaders.add(new C1212c(C1212c.f10758f, (String) request.f363d));
        C1451i c1451i = C1212c.f10759g;
        m3.m url = (m3.m) request.f362c;
        Intrinsics.checkNotNullParameter(url, "url");
        String b4 = url.b();
        String d4 = url.d();
        if (d4 != null) {
            b4 = b4 + '?' + d4;
        }
        requestHeaders.add(new C1212c(c1451i, b4));
        String i4 = request.i("Host");
        if (i4 != null) {
            requestHeaders.add(new C1212c(C1212c.f10761i, i4));
        }
        requestHeaders.add(new C1212c(C1212c.f10760h, url.f8393a));
        int size = lVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            String h4 = lVar.h(i5);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = h4.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f10834g.contains(lowerCase) || (Intrinsics.a(lowerCase, "te") && Intrinsics.a(lVar.w(i5), "trailers"))) {
                requestHeaders.add(new C1212c(lowerCase, lVar.w(i5)));
            }
        }
        p pVar = this.f10838c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z4 = !false;
        synchronized (pVar.f10811C) {
            synchronized (pVar) {
                try {
                    if (pVar.f10818k > 1073741823) {
                        pVar.g(EnumC1211b.REFUSED_STREAM);
                    }
                    if (pVar.f10819l) {
                        throw new C1210a();
                    }
                    i2 = pVar.f10818k;
                    pVar.f10818k = i2 + 2;
                    xVar = new x(i2, pVar, z4, false, null);
                    if (xVar.h()) {
                        pVar.f10815e.put(Integer.valueOf(i2), xVar);
                    }
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.f10811C.g(z4, i2, requestHeaders);
        }
        pVar.f10811C.flush();
        this.f10839d = xVar;
        if (this.f10841f) {
            x xVar2 = this.f10839d;
            Intrinsics.c(xVar2);
            xVar2.e(EnumC1211b.CANCEL);
            throw new IOException("Canceled");
        }
        x xVar3 = this.f10839d;
        Intrinsics.c(xVar3);
        w wVar = xVar3.f10873k;
        long j4 = this.f10837b.f9871g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.g(j4, timeUnit);
        x xVar4 = this.f10839d;
        Intrinsics.c(xVar4);
        xVar4.f10874l.g(this.f10837b.f9872h, timeUnit);
    }

    @Override // r3.d
    public final F b(m3.w response) {
        Intrinsics.checkNotNullParameter(response, "response");
        x xVar = this.f10839d;
        Intrinsics.c(xVar);
        return xVar.f10871i;
    }

    @Override // r3.d
    public final D c(A0.q request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        x xVar = this.f10839d;
        Intrinsics.c(xVar);
        return xVar.f();
    }

    @Override // r3.d
    public final void cancel() {
        this.f10841f = true;
        x xVar = this.f10839d;
        if (xVar != null) {
            xVar.e(EnumC1211b.CANCEL);
        }
    }

    @Override // r3.d
    public final void d() {
        x xVar = this.f10839d;
        Intrinsics.c(xVar);
        xVar.f().close();
    }

    @Override // r3.d
    public final long e(m3.w response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (r3.e.a(response)) {
            return n3.b.j(response);
        }
        return 0L;
    }

    @Override // r3.d
    public final void f() {
        this.f10838c.flush();
    }

    @Override // r3.d
    public final m3.v g(boolean z4) {
        m3.l headerBlock;
        x xVar = this.f10839d;
        if (xVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (xVar) {
            xVar.f10873k.h();
            while (xVar.f10869g.isEmpty() && xVar.f10875m == null) {
                try {
                    xVar.k();
                } catch (Throwable th) {
                    xVar.f10873k.k();
                    throw th;
                }
            }
            xVar.f10873k.k();
            if (xVar.f10869g.isEmpty()) {
                IOException iOException = xVar.f10876n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC1211b enumC1211b = xVar.f10875m;
                Intrinsics.c(enumC1211b);
                throw new C(enumC1211b);
            }
            Object removeFirst = xVar.f10869g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
            headerBlock = (m3.l) removeFirst;
        }
        m3.t protocol = this.f10840e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = headerBlock.size();
        C0016l c0016l = null;
        for (int i2 = 0; i2 < size; i2++) {
            String name = headerBlock.h(i2);
            String value = headerBlock.w(i2);
            if (Intrinsics.a(name, ":status")) {
                c0016l = m3.o.s("HTTP/1.1 " + value);
            } else if (!f10835h.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(kotlin.text.y.M(value).toString());
            }
        }
        if (c0016l == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        m3.v vVar = new m3.v();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        vVar.f8461b = protocol;
        vVar.f8462c = c0016l.f163b;
        String message = (String) c0016l.f165d;
        Intrinsics.checkNotNullParameter(message, "message");
        vVar.f8463d = message;
        m3.l headers = new m3.l((String[]) arrayList.toArray(new String[0]));
        Intrinsics.checkNotNullParameter(headers, "headers");
        vVar.f8465f = headers.s();
        if (z4 && vVar.f8462c == 100) {
            return null;
        }
        return vVar;
    }

    @Override // r3.d
    public final q3.i h() {
        return this.f10836a;
    }
}
