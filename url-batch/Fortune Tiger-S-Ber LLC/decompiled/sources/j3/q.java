package j3;

import androidx.fragment.app.w0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q implements h3.e {
    public static final List g = d3.c.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = d3.c.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final g3.l f2461a;

    /* renamed from: b, reason: collision with root package name */
    public final h3.g f2462b;
    public final p c;

    /* renamed from: d, reason: collision with root package name */
    public volatile x f2463d;

    /* renamed from: e, reason: collision with root package name */
    public final c3.r f2464e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2465f;

    public q(c3.q qVar, g3.l lVar, h3.g gVar, p pVar) {
        u2.c.e(pVar, "http2Connection");
        this.f2461a = lVar;
        this.f2462b = gVar;
        this.c = pVar;
        List list = qVar.f1117w;
        c3.r rVar = c3.r.H2_PRIOR_KNOWLEDGE;
        this.f2464e = list.contains(rVar) ? rVar : c3.r.HTTP_2;
    }

    @Override // h3.e
    public final void a() {
        x xVar = this.f2463d;
        u2.c.b(xVar);
        synchronized (xVar) {
            if (!xVar.h && !xVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        xVar.f2485j.close();
    }

    @Override // h3.e
    public final void b() {
        this.c.flush();
    }

    @Override // h3.e
    public final void c(c3.s sVar) {
        int i4;
        x xVar;
        if (this.f2463d != null) {
            return;
        }
        sVar.getClass();
        c3.k kVar = sVar.c;
        ArrayList arrayList = new ArrayList(kVar.size() + 4);
        arrayList.add(new b(b.f2404f, sVar.f1128b));
        p3.i iVar = b.g;
        c3.m mVar = sVar.f1127a;
        u2.c.e(mVar, "url");
        String b2 = mVar.b();
        String d4 = mVar.d();
        if (d4 != null) {
            b2 = b2 + '?' + d4;
        }
        arrayList.add(new b(iVar, b2));
        String a4 = sVar.c.a("Host");
        if (a4 != null) {
            arrayList.add(new b(b.f2405i, a4));
        }
        arrayList.add(new b(b.h, mVar.f1076a));
        int size = kVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            String b4 = kVar.b(i5);
            Locale locale = Locale.US;
            u2.c.d(locale, "US");
            String lowerCase = b4.toLowerCase(locale);
            u2.c.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && u2.c.a(kVar.d(i5), "trailers"))) {
                arrayList.add(new b(lowerCase, kVar.d(i5)));
            }
        }
        p pVar = this.c;
        pVar.getClass();
        boolean z3 = !false;
        synchronized (pVar.B) {
            synchronized (pVar) {
                try {
                    if (pVar.f2444j > 1073741823) {
                        pVar.p(8);
                    }
                    if (pVar.f2445k) {
                        throw new a();
                    }
                    i4 = pVar.f2444j;
                    pVar.f2444j = i4 + 2;
                    xVar = new x(i4, pVar, z3, false, null);
                    if (xVar.g()) {
                        pVar.g.put(Integer.valueOf(i4), xVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.B.q(z3, i4, arrayList);
        }
        pVar.B.flush();
        this.f2463d = xVar;
        if (this.f2465f) {
            x xVar2 = this.f2463d;
            u2.c.b(xVar2);
            xVar2.e(9);
            throw new IOException("Canceled");
        }
        x xVar3 = this.f2463d;
        u2.c.b(xVar3);
        w wVar = xVar3.f2486k;
        long j4 = this.f2462b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.g(j4);
        x xVar4 = this.f2463d;
        u2.c.b(xVar4);
        xVar4.f2487l.g(this.f2462b.h);
    }

    @Override // h3.e
    public final void cancel() {
        this.f2465f = true;
        x xVar = this.f2463d;
        if (xVar != null) {
            xVar.e(9);
        }
    }

    @Override // h3.e
    public final long d(c3.u uVar) {
        if (h3.f.a(uVar)) {
            return d3.c.h(uVar);
        }
        return 0L;
    }

    @Override // h3.e
    public final p3.v e(c3.u uVar) {
        x xVar = this.f2463d;
        u2.c.b(xVar);
        return xVar.f2484i;
    }

    @Override // h3.e
    public final c3.t f(boolean z3) {
        c3.k kVar;
        x xVar = this.f2463d;
        if (xVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (xVar) {
            xVar.f2486k.h();
            while (xVar.g.isEmpty() && xVar.f2488m == 0) {
                try {
                    try {
                        xVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    xVar.f2486k.k();
                    throw th;
                }
            }
            xVar.f2486k.k();
            if (xVar.g.isEmpty()) {
                IOException iOException = xVar.f2489n;
                if (iOException != null) {
                    throw iOException;
                }
                int i4 = xVar.f2488m;
                w0.g(i4);
                throw new c0(i4);
            }
            Object removeFirst = xVar.g.removeFirst();
            u2.c.d(removeFirst, "headersQueue.removeFirst()");
            kVar = (c3.k) removeFirst;
        }
        c3.r rVar = this.f2464e;
        u2.c.e(rVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = kVar.size();
        b0.d dVar = null;
        for (int i5 = 0; i5 < size; i5++) {
            String b2 = kVar.b(i5);
            String d4 = kVar.d(i5);
            if (u2.c.a(b2, ":status")) {
                dVar = k3.d.T("HTTP/1.1 " + d4);
            } else if (!h.contains(b2)) {
                u2.c.e(b2, "name");
                u2.c.e(d4, "value");
                arrayList.add(b2);
                arrayList.add(b3.e.q0(d4).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        c3.t tVar = new c3.t();
        tVar.f1132b = rVar;
        tVar.c = dVar.f699b;
        tVar.f1133d = (String) dVar.f700d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        a2.e eVar = new a2.e(10);
        ArrayList arrayList2 = (ArrayList) eVar.g;
        u2.c.e(arrayList2, "<this>");
        u2.c.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        u2.c.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        tVar.f1135f = eVar;
        if (z3 && tVar.c == 100) {
            return null;
        }
        return tVar;
    }

    @Override // h3.e
    public final g3.l g() {
        return this.f2461a;
    }
}
