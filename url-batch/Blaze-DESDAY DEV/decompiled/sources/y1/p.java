package y1;

import Y.V;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements w1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4289g = s1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = s1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final v1.m f4290a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.f f4291b;

    /* renamed from: c, reason: collision with root package name */
    public final o f4292c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final r1.r f4293e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4294f;

    public p(r1.q qVar, v1.m mVar, w1.f fVar, o oVar) {
        g1.d.e(mVar, "connection");
        g1.d.e(oVar, "http2Connection");
        this.f4290a = mVar;
        this.f4291b = fVar;
        this.f4292c = oVar;
        r1.r rVar = r1.r.H2_PRIOR_KNOWLEDGE;
        this.f4293e = qVar.f3505r.contains(rVar) ? rVar : r1.r.HTTP_2;
    }

    @Override // w1.d
    public final void a() {
        w wVar = this.d;
        g1.d.b(wVar);
        wVar.f().close();
    }

    @Override // w1.d
    public final E1.v b(r1.t tVar) {
        w wVar = this.d;
        g1.d.b(wVar);
        return wVar.i;
    }

    @Override // w1.d
    public final void c() {
        this.f4292c.flush();
    }

    @Override // w1.d
    public final void cancel() {
        this.f4294f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // w1.d
    public final E1.t d(H.e eVar, long j2) {
        w wVar = this.d;
        g1.d.b(wVar);
        return wVar.f();
    }

    @Override // w1.d
    public final void e(H.e eVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        r1.k kVar = (r1.k) eVar.d;
        ArrayList arrayList = new ArrayList(kVar.size() + 4);
        arrayList.add(new b(b.f4226f, (String) eVar.f277b));
        E1.i iVar = b.f4227g;
        r1.m mVar = (r1.m) eVar.f278c;
        g1.d.e(mVar, "url");
        String b2 = mVar.b();
        String d = mVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new b(iVar, b2));
        String a2 = ((r1.k) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new b(b.i, a2));
        }
        arrayList.add(new b(b.h, mVar.f3463a));
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = kVar.b(i2);
            Locale locale = Locale.US;
            g1.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            g1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f4289g.contains(lowerCase) || (lowerCase.equals("te") && g1.d.a(kVar.d(i2), "trailers"))) {
                arrayList.add(new b(lowerCase, kVar.d(i2)));
            }
        }
        o oVar = this.f4292c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f4286w) {
            synchronized (oVar) {
                try {
                    if (oVar.f4270e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f4271f) {
                        throw new C0320a();
                    }
                    i = oVar.f4270e;
                    oVar.f4270e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f4268b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f4286w.k(z2, i, arrayList);
        }
        oVar.f4286w.flush();
        this.d = wVar;
        if (this.f4294f) {
            w wVar2 = this.d;
            g1.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        g1.d.b(wVar3);
        v vVar = wVar3.f4319k;
        long j2 = this.f4291b.f4103g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        g1.d.b(wVar4);
        wVar4.f4320l.g(this.f4291b.h, timeUnit);
    }

    @Override // w1.d
    public final r1.s f(boolean z2) {
        r1.k kVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f4319k.h();
            while (wVar.f4317g.isEmpty() && wVar.f4321m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f4319k.k();
                    throw th;
                }
            }
            wVar.f4319k.k();
            if (wVar.f4317g.isEmpty()) {
                IOException iOException = wVar.f4322n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f4321m;
                V.g(i);
                throw new A(i);
            }
            Object removeFirst = wVar.f4317g.removeFirst();
            g1.d.d(removeFirst, "headersQueue.removeFirst()");
            kVar = (r1.k) removeFirst;
        }
        r1.r rVar = this.f4293e;
        g1.d.e(rVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = kVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = kVar.b(i2);
            String d = kVar.d(i2);
            if (g1.d.a(b2, ":status")) {
                dVar = i0.g.n("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                g1.d.e(b2, "name");
                g1.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(n1.d.O(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        r1.s sVar = new r1.s();
        sVar.f3520b = rVar;
        sVar.f3521c = dVar.f33b;
        sVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        r1.g gVar = new r1.g(1);
        ArrayList arrayList2 = (ArrayList) gVar.f3436a;
        g1.d.e(arrayList2, "<this>");
        g1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        g1.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        sVar.f3523f = gVar;
        if (z2 && sVar.f3521c == 100) {
            return null;
        }
        return sVar;
    }

    @Override // w1.d
    public final long g(r1.t tVar) {
        if (w1.e.a(tVar)) {
            return s1.b.i(tVar);
        }
        return 0L;
    }

    @Override // w1.d
    public final v1.m h() {
        return this.f4290a;
    }
}
