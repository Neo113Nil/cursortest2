package w1;

import j0.AbstractC0142a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements u1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4145g = q1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = q1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final t1.m f4146a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.f f4147b;

    /* renamed from: c, reason: collision with root package name */
    public final o f4148c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final p1.r f4149e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4150f;

    public p(p1.q qVar, t1.m mVar, u1.f fVar, o oVar) {
        e1.d.e(mVar, "connection");
        e1.d.e(oVar, "http2Connection");
        this.f4146a = mVar;
        this.f4147b = fVar;
        this.f4148c = oVar;
        p1.r rVar = p1.r.H2_PRIOR_KNOWLEDGE;
        this.f4149e = qVar.f3405r.contains(rVar) ? rVar : p1.r.HTTP_2;
    }

    @Override // u1.d
    public final void a() {
        w wVar = this.d;
        e1.d.b(wVar);
        wVar.f().close();
    }

    @Override // u1.d
    public final void b() {
        this.f4148c.flush();
    }

    @Override // u1.d
    public final C1.t c(H.e eVar, long j2) {
        w wVar = this.d;
        e1.d.b(wVar);
        return wVar.f();
    }

    @Override // u1.d
    public final void cancel() {
        this.f4150f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // u1.d
    public final void d(H.e eVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        p1.k kVar = (p1.k) eVar.d;
        ArrayList arrayList = new ArrayList(kVar.size() + 4);
        arrayList.add(new b(b.f4082f, (String) eVar.f258b));
        C1.i iVar = b.f4083g;
        p1.m mVar = (p1.m) eVar.f259c;
        e1.d.e(mVar, "url");
        String b2 = mVar.b();
        String d = mVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new b(iVar, b2));
        String a2 = ((p1.k) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new b(b.i, a2));
        }
        arrayList.add(new b(b.h, mVar.f3363a));
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = kVar.b(i2);
            Locale locale = Locale.US;
            e1.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            e1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f4145g.contains(lowerCase) || (lowerCase.equals("te") && e1.d.a(kVar.d(i2), "trailers"))) {
                arrayList.add(new b(lowerCase, kVar.d(i2)));
            }
        }
        o oVar = this.f4148c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f4142w) {
            synchronized (oVar) {
                try {
                    if (oVar.f4126e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f4127f) {
                        throw new C0333a();
                    }
                    i = oVar.f4126e;
                    oVar.f4126e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f4124b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f4142w.k(z2, i, arrayList);
        }
        oVar.f4142w.flush();
        this.d = wVar;
        if (this.f4150f) {
            w wVar2 = this.d;
            e1.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        e1.d.b(wVar3);
        v vVar = wVar3.f4175k;
        long j2 = this.f4147b.f3830g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        e1.d.b(wVar4);
        wVar4.f4176l.g(this.f4147b.h, timeUnit);
    }

    @Override // u1.d
    public final p1.s e(boolean z2) {
        p1.k kVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f4175k.h();
            while (wVar.f4173g.isEmpty() && wVar.f4177m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f4175k.k();
                    throw th;
                }
            }
            wVar.f4175k.k();
            if (wVar.f4173g.isEmpty()) {
                IOException iOException = wVar.f4178n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f4177m;
                T0.c.f(i);
                throw new A(i);
            }
            Object removeFirst = wVar.f4173g.removeFirst();
            e1.d.d(removeFirst, "headersQueue.removeFirst()");
            kVar = (p1.k) removeFirst;
        }
        p1.r rVar = this.f4149e;
        e1.d.e(rVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = kVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = kVar.b(i2);
            String d = kVar.d(i2);
            if (e1.d.a(b2, ":status")) {
                dVar = AbstractC0142a.m("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                e1.d.e(b2, "name");
                e1.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(l1.d.K(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        p1.s sVar = new p1.s();
        sVar.f3420b = rVar;
        sVar.f3421c = dVar.f13b;
        sVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        p1.g gVar = new p1.g(1);
        ArrayList arrayList2 = (ArrayList) gVar.f3336a;
        e1.d.e(arrayList2, "<this>");
        e1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        e1.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        sVar.f3423f = gVar;
        if (z2 && sVar.f3421c == 100) {
            return null;
        }
        return sVar;
    }

    @Override // u1.d
    public final long f(p1.t tVar) {
        if (u1.e.a(tVar)) {
            return q1.b.i(tVar);
        }
        return 0L;
    }

    @Override // u1.d
    public final C1.v g(p1.t tVar) {
        w wVar = this.d;
        e1.d.b(wVar);
        return wVar.i;
    }

    @Override // u1.d
    public final t1.m h() {
        return this.f4146a;
    }
}
