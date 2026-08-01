package t1;

import X.V;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements r1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f3897g = n1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = n1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final q1.m f3898a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.f f3899b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3900c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final m1.r f3901e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3902f;

    public p(m1.q qVar, q1.m mVar, r1.f fVar, o oVar) {
        b1.d.e(mVar, "connection");
        b1.d.e(oVar, "http2Connection");
        this.f3898a = mVar;
        this.f3899b = fVar;
        this.f3900c = oVar;
        m1.r rVar = m1.r.H2_PRIOR_KNOWLEDGE;
        this.f3901e = qVar.f3258r.contains(rVar) ? rVar : m1.r.HTTP_2;
    }

    @Override // r1.d
    public final void a() {
        w wVar = this.d;
        b1.d.b(wVar);
        wVar.f().close();
    }

    @Override // r1.d
    public final void b() {
        this.f3900c.flush();
    }

    @Override // r1.d
    public final z1.t c(H.e eVar, long j2) {
        w wVar = this.d;
        b1.d.b(wVar);
        return wVar.f();
    }

    @Override // r1.d
    public final void cancel() {
        this.f3902f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // r1.d
    public final void d(H.e eVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        m1.k kVar = (m1.k) eVar.d;
        ArrayList arrayList = new ArrayList(kVar.size() + 4);
        arrayList.add(new C0303b(C0303b.f3834f, (String) eVar.f274b));
        z1.i iVar = C0303b.f3835g;
        m1.m mVar = (m1.m) eVar.f275c;
        b1.d.e(mVar, "url");
        String b2 = mVar.b();
        String d = mVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new C0303b(iVar, b2));
        String a2 = ((m1.k) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0303b(C0303b.i, a2));
        }
        arrayList.add(new C0303b(C0303b.h, mVar.f3216a));
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = kVar.b(i2);
            Locale locale = Locale.US;
            b1.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            b1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f3897g.contains(lowerCase) || (lowerCase.equals("te") && b1.d.a(kVar.d(i2), "trailers"))) {
                arrayList.add(new C0303b(lowerCase, kVar.d(i2)));
            }
        }
        o oVar = this.f3900c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f3894w) {
            synchronized (oVar) {
                try {
                    if (oVar.f3878e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f3879f) {
                        throw new C0302a();
                    }
                    i = oVar.f3878e;
                    oVar.f3878e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f3876b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f3894w.k(z2, i, arrayList);
        }
        oVar.f3894w.flush();
        this.d = wVar;
        if (this.f3902f) {
            w wVar2 = this.d;
            b1.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        b1.d.b(wVar3);
        v vVar = wVar3.f3927k;
        long j2 = this.f3899b.f3578g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        b1.d.b(wVar4);
        wVar4.f3928l.g(this.f3899b.h, timeUnit);
    }

    @Override // r1.d
    public final m1.s e(boolean z2) {
        m1.k kVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f3927k.h();
            while (wVar.f3925g.isEmpty() && wVar.f3929m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f3927k.k();
                    throw th;
                }
            }
            wVar.f3927k.k();
            if (wVar.f3925g.isEmpty()) {
                IOException iOException = wVar.f3930n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f3929m;
                V.f(i);
                throw new B(i);
            }
            Object removeFirst = wVar.f3925g.removeFirst();
            b1.d.d(removeFirst, "headersQueue.removeFirst()");
            kVar = (m1.k) removeFirst;
        }
        m1.r rVar = this.f3901e;
        b1.d.e(rVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = kVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = kVar.b(i2);
            String d = kVar.d(i2);
            if (b1.d.a(b2, ":status")) {
                dVar = k0.w.n("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                b1.d.e(b2, "name");
                b1.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(i1.d.M0(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        m1.s sVar = new m1.s();
        sVar.f3273b = rVar;
        sVar.f3274c = dVar.f41b;
        sVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m1.g gVar = new m1.g(1);
        ArrayList arrayList2 = (ArrayList) gVar.f3189a;
        b1.d.e(arrayList2, "<this>");
        b1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        b1.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        sVar.f3276f = gVar;
        if (z2 && sVar.f3274c == 100) {
            return null;
        }
        return sVar;
    }

    @Override // r1.d
    public final z1.v f(m1.t tVar) {
        w wVar = this.d;
        b1.d.b(wVar);
        return wVar.i;
    }

    @Override // r1.d
    public final q1.m g() {
        return this.f3898a;
    }

    @Override // r1.d
    public final long h(m1.t tVar) {
        if (r1.e.a(tVar)) {
            return n1.b.i(tVar);
        }
        return 0L;
    }
}
