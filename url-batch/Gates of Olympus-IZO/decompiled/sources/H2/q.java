package H2;

import N2.C0153i;
import N2.F;
import a.AbstractC0157a;
import h2.AbstractC0447i;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements F2.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f2006g = B2.c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f2007h = B2.c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final E2.k f2008a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.g f2009b;

    /* renamed from: c, reason: collision with root package name */
    public final p f2010c;

    /* renamed from: d, reason: collision with root package name */
    public volatile x f2011d;

    /* renamed from: e, reason: collision with root package name */
    public final A2.v f2012e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2013f;

    public q(A2.u uVar, E2.k kVar, F2.g gVar, p pVar) {
        Z1.i.f(uVar, "client");
        Z1.i.f(kVar, "connection");
        Z1.i.f(pVar, "http2Connection");
        this.f2008a = kVar;
        this.f2009b = gVar;
        this.f2010c = pVar;
        A2.v vVar = A2.v.H2_PRIOR_KNOWLEDGE;
        this.f2012e = uVar.f178u.contains(vVar) ? vVar : A2.v.HTTP_2;
    }

    @Override // F2.e
    public final long a(A2.y yVar) {
        if (F2.f.a(yVar)) {
            return B2.c.j(yVar);
        }
        return 0L;
    }

    @Override // F2.e
    public final void b() {
        x xVar = this.f2011d;
        Z1.i.c(xVar);
        xVar.f().close();
    }

    @Override // F2.e
    public final F c(A2.y yVar) {
        x xVar = this.f2011d;
        Z1.i.c(xVar);
        return xVar.f2043i;
    }

    @Override // F2.e
    public final void cancel() {
        this.f2013f = true;
        x xVar = this.f2011d;
        if (xVar != null) {
            xVar.e(9);
        }
    }

    @Override // F2.e
    public final void d() {
        this.f2010c.flush();
    }

    @Override // F2.e
    public final N2.D e(A2.w wVar, long j3) {
        x xVar = this.f2011d;
        Z1.i.c(xVar);
        return xVar.f();
    }

    @Override // F2.e
    public final A2.x f(boolean z3) {
        A2.o oVar;
        x xVar = this.f2011d;
        if (xVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (xVar) {
            xVar.f2045k.h();
            while (xVar.f2041g.isEmpty() && xVar.f2047m == 0) {
                try {
                    xVar.k();
                } catch (Throwable th) {
                    xVar.f2045k.k();
                    throw th;
                }
            }
            xVar.f2045k.k();
            if (xVar.f2041g.isEmpty()) {
                IOException iOException = xVar.f2048n;
                if (iOException != null) {
                    throw iOException;
                }
                int i3 = xVar.f2047m;
                AbstractC0080b.n(i3);
                throw new D(i3);
            }
            Object removeFirst = xVar.f2041g.removeFirst();
            Z1.i.e(removeFirst, "headersQueue.removeFirst()");
            oVar = (A2.o) removeFirst;
        }
        A2.v vVar = this.f2012e;
        Z1.i.f(vVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = oVar.size();
        F2.h hVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            String c3 = oVar.c(i4);
            String i5 = oVar.i(i4);
            if (Z1.i.a(c3, ":status")) {
                hVar = AbstractC0157a.O("HTTP/1.1 " + i5);
            } else if (!f2007h.contains(c3)) {
                Z1.i.f(c3, "name");
                Z1.i.f(i5, "value");
                arrayList.add(c3);
                arrayList.add(AbstractC0447i.H0(i5).toString());
            }
        }
        if (hVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        A2.x xVar2 = new A2.x();
        xVar2.f199b = vVar;
        xVar2.f200c = hVar.f1502e;
        xVar2.f201d = (String) hVar.f1504g;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        A2.n nVar = new A2.n(0);
        ArrayList arrayList2 = nVar.f118a;
        Z1.i.f(arrayList2, "<this>");
        Z1.i.f(strArr, "elements");
        arrayList2.addAll(M1.k.T(strArr));
        xVar2.f203f = nVar;
        if (z3 && xVar2.f200c == 100) {
            return null;
        }
        return xVar2;
    }

    @Override // F2.e
    public final void g(A2.w wVar) {
        int i3;
        x xVar;
        if (this.f2011d != null) {
            return;
        }
        wVar.getClass();
        A2.o oVar = (A2.o) wVar.f195d;
        ArrayList arrayList = new ArrayList(oVar.size() + 4);
        arrayList.add(new C0081c(C0081c.f1930f, (String) wVar.f194c));
        C0153i c0153i = C0081c.f1931g;
        A2.q qVar = (A2.q) wVar.f193b;
        Z1.i.f(qVar, "url");
        String b2 = qVar.b();
        String d3 = qVar.d();
        if (d3 != null) {
            b2 = b2 + '?' + d3;
        }
        arrayList.add(new C0081c(c0153i, b2));
        String b3 = ((A2.o) wVar.f195d).b("Host");
        if (b3 != null) {
            arrayList.add(new C0081c(C0081c.f1933i, b3));
        }
        arrayList.add(new C0081c(C0081c.f1932h, qVar.f129a));
        int size = oVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            String c3 = oVar.c(i4);
            Locale locale = Locale.US;
            Z1.i.e(locale, "US");
            String lowerCase = c3.toLowerCase(locale);
            Z1.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f2006g.contains(lowerCase) || (lowerCase.equals("te") && Z1.i.a(oVar.i(i4), "trailers"))) {
                arrayList.add(new C0081c(lowerCase, oVar.i(i4)));
            }
        }
        p pVar = this.f2010c;
        pVar.getClass();
        boolean z3 = !false;
        synchronized (pVar.f2005z) {
            synchronized (pVar) {
                try {
                    if (pVar.f1988h > 1073741823) {
                        pVar.h(8);
                    }
                    if (pVar.f1989i) {
                        throw new C0079a();
                    }
                    i3 = pVar.f1988h;
                    pVar.f1988h = i3 + 2;
                    xVar = new x(i3, pVar, z3, false, null);
                    if (xVar.h()) {
                        pVar.f1985e.put(Integer.valueOf(i3), xVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.f2005z.i(z3, i3, arrayList);
        }
        pVar.f2005z.flush();
        this.f2011d = xVar;
        if (this.f2013f) {
            x xVar2 = this.f2011d;
            Z1.i.c(xVar2);
            xVar2.e(9);
            throw new IOException("Canceled");
        }
        x xVar3 = this.f2011d;
        Z1.i.c(xVar3);
        w wVar2 = xVar3.f2045k;
        long j3 = this.f2009b.f1498g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar2.g(j3, timeUnit);
        x xVar4 = this.f2011d;
        Z1.i.c(xVar4);
        xVar4.f2046l.g(this.f2009b.f1499h, timeUnit);
    }

    @Override // F2.e
    public final E2.k h() {
        return this.f2008a;
    }
}
