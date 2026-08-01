package G1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.C0191o;

/* loaded from: classes.dex */
public final class r implements E1.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f435g = A1.c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = A1.c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final D1.m f436a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.g f437b;

    /* renamed from: c, reason: collision with root package name */
    public final q f438c;
    public volatile y d;

    /* renamed from: e, reason: collision with root package name */
    public final z1.q f439e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f440f;

    public r(z1.p pVar, D1.m mVar, E1.g gVar, q qVar) {
        k1.e.e(mVar, "connection");
        k1.e.e(qVar, "http2Connection");
        this.f436a = mVar;
        this.f437b = gVar;
        this.f438c = qVar;
        z1.q qVar2 = z1.q.H2_PRIOR_KNOWLEDGE;
        this.f439e = pVar.f4735r.contains(qVar2) ? qVar2 : z1.q.HTTP_2;
    }

    @Override // E1.e
    public final void a() {
        y yVar = this.d;
        k1.e.b(yVar);
        yVar.f().close();
    }

    @Override // E1.e
    public final void b() {
        this.f438c.flush();
    }

    @Override // E1.e
    public final M1.v c(z1.s sVar) {
        y yVar = this.d;
        k1.e.b(yVar);
        return yVar.i;
    }

    @Override // E1.e
    public final void cancel() {
        this.f440f = true;
        y yVar = this.d;
        if (yVar != null) {
            yVar.e(9);
        }
    }

    @Override // E1.e
    public final M1.t d(H.e eVar, long j2) {
        y yVar = this.d;
        k1.e.b(yVar);
        return yVar.f();
    }

    @Override // E1.e
    public final long e(z1.s sVar) {
        if (E1.f.a(sVar)) {
            return A1.c.i(sVar);
        }
        return 0L;
    }

    @Override // E1.e
    public final void f(H.e eVar) {
        int i;
        y yVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        z1.j jVar = (z1.j) eVar.d;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new C0002c(C0002c.f367f, (String) eVar.f482b));
        M1.i iVar = C0002c.f368g;
        z1.l lVar = (z1.l) eVar.f483c;
        k1.e.e(lVar, "url");
        String b2 = lVar.b();
        String d = lVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new C0002c(iVar, b2));
        String a2 = ((z1.j) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0002c(C0002c.i, a2));
        }
        arrayList.add(new C0002c(C0002c.h, lVar.f4693a));
        int size = jVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = jVar.b(i2);
            Locale locale = Locale.US;
            k1.e.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            k1.e.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f435g.contains(lowerCase) || (lowerCase.equals("te") && k1.e.a(jVar.d(i2), "trailers"))) {
                arrayList.add(new C0002c(lowerCase, jVar.d(i2)));
            }
        }
        q qVar = this.f438c;
        qVar.getClass();
        boolean z2 = !false;
        synchronized (qVar.f432w) {
            synchronized (qVar) {
                try {
                    if (qVar.f416e > 1073741823) {
                        qVar.k(8);
                    }
                    if (qVar.f417f) {
                        throw new C0000a();
                    }
                    i = qVar.f416e;
                    qVar.f416e = i + 2;
                    yVar = new y(i, qVar, z2, false, null);
                    if (yVar.h()) {
                        qVar.f414b.put(Integer.valueOf(i), yVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qVar.f432w.p(z2, i, arrayList);
        }
        qVar.f432w.flush();
        this.d = yVar;
        if (this.f440f) {
            y yVar2 = this.d;
            k1.e.b(yVar2);
            yVar2.e(9);
            throw new IOException("Canceled");
        }
        y yVar3 = this.d;
        k1.e.b(yVar3);
        x xVar = yVar3.f465k;
        long j2 = this.f437b.f238g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j2, timeUnit);
        y yVar4 = this.d;
        k1.e.b(yVar4);
        yVar4.f466l.g(this.f437b.h, timeUnit);
    }

    @Override // E1.e
    public final z1.r g(boolean z2) {
        z1.j jVar;
        y yVar = this.d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f465k.h();
            while (yVar.f463g.isEmpty() && yVar.f467m == 0) {
                try {
                    yVar.k();
                } catch (Throwable th) {
                    yVar.f465k.k();
                    throw th;
                }
            }
            yVar.f465k.k();
            if (yVar.f463g.isEmpty()) {
                IOException iOException = yVar.f468n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = yVar.f467m;
                AbstractC0001b.h(i);
                throw new E(i);
            }
            Object removeFirst = yVar.f463g.removeFirst();
            k1.e.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (z1.j) removeFirst;
        }
        z1.q qVar = this.f439e;
        k1.e.e(qVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = jVar.b(i2);
            String d = jVar.d(i2);
            if (k1.e.a(b2, ":status")) {
                dVar = H1.l.Y("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                k1.e.e(b2, "name");
                k1.e.e(d, "value");
                arrayList.add(b2);
                arrayList.add(r1.d.T(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        z1.r rVar = new z1.r();
        rVar.f4750b = qVar;
        rVar.f4751c = dVar.f32b;
        rVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0191o c0191o = new C0191o(7);
        ArrayList arrayList2 = (ArrayList) c0191o.f3187a;
        k1.e.e(arrayList2, "<this>");
        k1.e.e(strArr, "elements");
        arrayList2.addAll(Y0.i.i0(strArr));
        rVar.f4753f = c0191o;
        if (z2 && rVar.f4751c == 100) {
            return null;
        }
        return rVar;
    }

    @Override // E1.e
    public final D1.m h() {
        return this.f436a;
    }
}
