package N2;

import B.C0011l;
import T2.C0234i;
import T2.F;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class q implements L2.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f3663g = H2.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f3664h = H2.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final K2.j f3665a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.g f3666b;

    /* renamed from: c, reason: collision with root package name */
    public final p f3667c;

    /* renamed from: d, reason: collision with root package name */
    public volatile x f3668d;

    /* renamed from: e, reason: collision with root package name */
    public final G2.s f3669e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3670f;

    public q(G2.r rVar, K2.j jVar, L2.g gVar, p pVar) {
        f2.j.f(rVar, "client");
        f2.j.f(jVar, "connection");
        f2.j.f(pVar, "http2Connection");
        this.f3665a = jVar;
        this.f3666b = gVar;
        this.f3667c = pVar;
        G2.s sVar = G2.s.f2277i;
        this.f3669e = rVar.f2267u.contains(sVar) ? sVar : G2.s.f2276h;
    }

    @Override // L2.e
    public final long a(G2.u uVar) {
        if (L2.f.a(uVar)) {
            return H2.b.j(uVar);
        }
        return 0L;
    }

    @Override // L2.e
    public final void b(C0.q qVar) {
        int i3;
        x xVar;
        if (this.f3668d != null) {
            return;
        }
        qVar.getClass();
        G2.l lVar = (G2.l) qVar.f632e;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new C0204b(C0204b.f3582f, (String) qVar.f631d));
        C0234i c0234i = C0204b.f3583g;
        G2.n nVar = (G2.n) qVar.f630c;
        f2.j.f(nVar, "url");
        String b3 = nVar.b();
        String d3 = nVar.d();
        if (d3 != null) {
            b3 = b3 + '?' + d3;
        }
        arrayList.add(new C0204b(c0234i, b3));
        String b4 = ((G2.l) qVar.f632e).b("Host");
        if (b4 != null) {
            arrayList.add(new C0204b(C0204b.f3585i, b4));
        }
        arrayList.add(new C0204b(C0204b.f3584h, nVar.f2215a));
        int size = lVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            String c2 = lVar.c(i4);
            Locale locale = Locale.US;
            f2.j.e(locale, "US");
            String lowerCase = c2.toLowerCase(locale);
            f2.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f3663g.contains(lowerCase) || (lowerCase.equals("te") && f2.j.a(lVar.i(i4), "trailers"))) {
                arrayList.add(new C0204b(lowerCase, lVar.i(i4)));
            }
        }
        p pVar = this.f3667c;
        pVar.getClass();
        boolean z3 = !false;
        synchronized (pVar.f3662z) {
            synchronized (pVar) {
                try {
                    if (pVar.f3644h > 1073741823) {
                        pVar.e(8);
                    }
                    if (pVar.f3645i) {
                        throw new C0203a();
                    }
                    i3 = pVar.f3644h;
                    pVar.f3644h = i3 + 2;
                    xVar = new x(i3, pVar, z3, false, null);
                    if (xVar.h()) {
                        pVar.f3641e.put(Integer.valueOf(i3), xVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.f3662z.g(z3, i3, arrayList);
        }
        pVar.f3662z.flush();
        this.f3668d = xVar;
        if (this.f3670f) {
            x xVar2 = this.f3668d;
            f2.j.c(xVar2);
            xVar2.e(9);
            throw new IOException("Canceled");
        }
        x xVar3 = this.f3668d;
        f2.j.c(xVar3);
        w wVar = xVar3.f3702k;
        long j3 = this.f3666b.f3418g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.g(j3, timeUnit);
        x xVar4 = this.f3668d;
        f2.j.c(xVar4);
        xVar4.f3703l.g(this.f3666b.f3419h, timeUnit);
    }

    @Override // L2.e
    public final T2.D c(C0.q qVar, long j3) {
        x xVar = this.f3668d;
        f2.j.c(xVar);
        return xVar.f();
    }

    @Override // L2.e
    public final void cancel() {
        this.f3670f = true;
        x xVar = this.f3668d;
        if (xVar != null) {
            xVar.e(9);
        }
    }

    @Override // L2.e
    public final void d() {
        x xVar = this.f3668d;
        f2.j.c(xVar);
        xVar.f().close();
    }

    @Override // L2.e
    public final void e() {
        this.f3667c.flush();
    }

    @Override // L2.e
    public final G2.t f(boolean z3) {
        G2.l lVar;
        x xVar = this.f3668d;
        if (xVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (xVar) {
            xVar.f3702k.h();
            while (xVar.f3698g.isEmpty() && xVar.f3704m == 0) {
                try {
                    xVar.k();
                } catch (Throwable th) {
                    xVar.f3702k.k();
                    throw th;
                }
            }
            xVar.f3702k.k();
            if (xVar.f3698g.isEmpty()) {
                IOException iOException = xVar.f3705n;
                if (iOException != null) {
                    throw iOException;
                }
                int i3 = xVar.f3704m;
                A.k.m(i3);
                throw new D(i3);
            }
            Object removeFirst = xVar.f3698g.removeFirst();
            f2.j.e(removeFirst, "headersQueue.removeFirst()");
            lVar = (G2.l) removeFirst;
        }
        G2.s sVar = this.f3669e;
        f2.j.f(sVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = lVar.size();
        C0011l c0011l = null;
        for (int i4 = 0; i4 < size; i4++) {
            String c2 = lVar.c(i4);
            String i5 = lVar.i(i4);
            if (f2.j.a(c2, ":status")) {
                c0011l = O2.d.a0("HTTP/1.1 " + i5);
            } else if (!f3664h.contains(c2)) {
                f2.j.f(c2, "name");
                f2.j.f(i5, "value");
                arrayList.add(c2);
                arrayList.add(AbstractC0730j.Y(i5).toString());
            }
        }
        if (c0011l == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        G2.t tVar = new G2.t();
        tVar.f2282b = sVar;
        tVar.f2283c = c0011l.f421e;
        tVar.f2284d = (String) c0011l.f423g;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        G2.k kVar = new G2.k(0);
        ArrayList arrayList2 = kVar.f2203d;
        f2.j.f(arrayList2, "<this>");
        f2.j.f(strArr, "elements");
        arrayList2.addAll(S1.k.h0(strArr));
        tVar.f2286f = kVar;
        if (z3 && tVar.f2283c == 100) {
            return null;
        }
        return tVar;
    }

    @Override // L2.e
    public final F g(G2.u uVar) {
        x xVar = this.f3668d;
        f2.j.c(xVar);
        return xVar.f3700i;
    }

    @Override // L2.e
    public final K2.j h() {
        return this.f3665a;
    }
}
