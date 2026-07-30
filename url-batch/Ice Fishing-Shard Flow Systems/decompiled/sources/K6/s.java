package K6;

import a.AbstractC0169a;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements I6.g {

    /* renamed from: g, reason: collision with root package name */
    public static final List f1580g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f1581h;

    /* renamed from: a, reason: collision with root package name */
    public final H6.r f1582a;

    /* renamed from: b, reason: collision with root package name */
    public final I6.i f1583b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1584c;

    /* renamed from: d, reason: collision with root package name */
    public volatile z f1585d;

    /* renamed from: e, reason: collision with root package name */
    public final D6.x f1586e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1587f;

    static {
        String[] elements = {"connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"};
        TimeZone timeZone = E6.e.f712a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        f1580g = E6.e.j(elements);
        String[] elements2 = {"connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f1581h = E6.e.j(elements2);
    }

    public s(D6.w client, H6.r carrier, I6.i chain, r http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f1582a = carrier;
        this.f1583b = chain;
        this.f1584c = http2Connection;
        List list = client.f614r;
        D6.x xVar = D6.x.f628o;
        this.f1586e = list.contains(xVar) ? xVar : D6.x.f627n;
    }

    @Override // I6.g
    public final void a() {
        z zVar = this.f1585d;
        Intrinsics.b(zVar);
        zVar.f1617q.close();
    }

    @Override // I6.g
    public final boolean b() {
        boolean z7;
        z zVar = this.f1585d;
        if (zVar == null) {
            return false;
        }
        synchronized (zVar) {
            x xVar = zVar.f1616p;
            if (xVar.f1603e) {
                if (xVar.f1605l.d()) {
                    z7 = true;
                }
            }
            z7 = false;
        }
        return z7;
    }

    @Override // I6.g
    public final void c() {
        this.f1584c.flush();
    }

    @Override // I6.g
    public final void cancel() {
        this.f1587f = true;
        z zVar = this.f1585d;
        if (zVar != null) {
            zVar.f(EnumC0131b.f1496p);
        }
    }

    @Override // I6.g
    public final T6.v d() {
        z zVar = this.f1585d;
        Intrinsics.b(zVar);
        return zVar;
    }

    @Override // I6.g
    public final I6.f e() {
        return this.f1582a;
    }

    @Override // I6.g
    public final void f(D6.z request) {
        int i2;
        z zVar;
        boolean z7;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f1585d != null) {
            return;
        }
        boolean z8 = ((D6.A) request.f642e) != null;
        Intrinsics.checkNotNullParameter(request, "request");
        D6.q qVar = (D6.q) request.f641d;
        ArrayList requestHeaders = new ArrayList(qVar.size() + 4);
        requestHeaders.add(new C0133d(C0133d.f1502f, (String) request.f639b));
        T6.i iVar = C0133d.f1503g;
        D6.s url = (D6.s) request.f640c;
        Intrinsics.checkNotNullParameter(url, "url");
        String b7 = url.b();
        String d7 = url.d();
        if (d7 != null) {
            b7 = b7 + '?' + d7;
        }
        requestHeaders.add(new C0133d(iVar, b7));
        String m2 = request.m("Host");
        if (m2 != null) {
            requestHeaders.add(new C0133d(C0133d.f1505i, m2));
        }
        requestHeaders.add(new C0133d(C0133d.f1504h, url.f562a));
        int size = qVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            String b8 = qVar.b(i5);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = b8.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!f1580g.contains(lowerCase) || (Intrinsics.a(lowerCase, "te") && qVar.d(i5).equals("trailers"))) {
                requestHeaders.add(new C0133d(lowerCase, qVar.d(i5)));
            }
        }
        r rVar = this.f1584c;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z9 = !z8;
        synchronized (rVar.f1559E) {
            synchronized (rVar) {
                try {
                    if (rVar.f1566m > 1073741823) {
                        rVar.h(EnumC0131b.f1495o);
                    }
                    if (rVar.f1567n) {
                        throw new C0130a();
                    }
                    i2 = rVar.f1566m;
                    rVar.f1566m = i2 + 2;
                    zVar = new z(i2, rVar, z9, false, null);
                    z7 = !z8 || rVar.f1556B >= rVar.f1557C || zVar.f1612l >= zVar.f1613m;
                    if (zVar.i()) {
                        rVar.f1563e.put(Integer.valueOf(i2), zVar);
                    }
                    Unit unit = Unit.f6114a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.f1559E.j(z9, i2, requestHeaders);
        }
        if (z7) {
            rVar.f1559E.flush();
        }
        this.f1585d = zVar;
        if (this.f1587f) {
            z zVar2 = this.f1585d;
            Intrinsics.b(zVar2);
            zVar2.f(EnumC0131b.f1496p);
            throw new IOException("Canceled");
        }
        z zVar3 = this.f1585d;
        Intrinsics.b(zVar3);
        y yVar = zVar3.f1618r;
        long j = this.f1583b.f1302g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j);
        z zVar4 = this.f1585d;
        Intrinsics.b(zVar4);
        zVar4.f1619s.g(this.f1583b.f1303h);
    }

    @Override // I6.g
    public final T6.u g(D6.z request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        z zVar = this.f1585d;
        Intrinsics.b(zVar);
        return zVar.f1617q;
    }

    @Override // I6.g
    public final T6.w h(D6.C response) {
        Intrinsics.checkNotNullParameter(response, "response");
        z zVar = this.f1585d;
        Intrinsics.b(zVar);
        return zVar.f1616p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // I6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D6.B i(boolean z7) {
        int i2;
        D6.q headerBlock;
        boolean z8;
        z zVar = this.f1585d;
        if (zVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (zVar) {
            while (true) {
                i2 = 0;
                if (!zVar.f1614n.isEmpty() || zVar.g() != null) {
                    break;
                }
                if (!z7) {
                    zVar.f1610e.getClass();
                    w wVar = zVar.f1617q;
                    if (!wVar.f1600i && !wVar.f1598d) {
                        z8 = false;
                    }
                    z8 = true;
                }
                i2 = 1;
                if (i2 != 0) {
                    zVar.f1618r.h();
                }
                try {
                    try {
                        zVar.wait();
                        if (i2 != 0) {
                            zVar.f1618r.l();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (i2 != 0) {
                        zVar.f1618r.l();
                    }
                    throw th;
                }
            }
            if (zVar.f1614n.isEmpty()) {
                IOException iOException = zVar.f1621u;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0131b g7 = zVar.g();
                Intrinsics.b(g7);
                throw new F(g7);
            }
            Object removeFirst = zVar.f1614n.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "removeFirst(...)");
            headerBlock = (D6.q) removeFirst;
        }
        D6.x protocol = this.f1586e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        C4.d dVar = new C4.d(2);
        int size = headerBlock.size();
        B6.o oVar = null;
        while (i2 < size) {
            String b7 = headerBlock.b(i2);
            String d7 = headerBlock.d(i2);
            if (b7.equals(":status")) {
                oVar = AbstractC0169a.t("HTTP/1.1 ".concat(d7));
            } else if (!f1581h.contains(b7)) {
                dVar.a(b7, d7);
            }
            i2++;
        }
        if (oVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        D6.B b8 = new D6.B();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        b8.f413b = protocol;
        b8.f414c = oVar.f229b;
        String message = (String) oVar.f231d;
        Intrinsics.checkNotNullParameter(message, "message");
        b8.f415d = message;
        D6.q headers = dVar.d();
        Intrinsics.checkNotNullParameter(headers, "headers");
        b8.f417f = headers.c();
        if (z7 && b8.f414c == 100) {
            return null;
        }
        return b8;
    }

    @Override // I6.g
    public final long j(D6.C response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (I6.h.a(response)) {
            return E6.e.e(response);
        }
        return 0L;
    }
}
