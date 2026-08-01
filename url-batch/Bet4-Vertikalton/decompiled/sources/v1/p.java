package v1;

import Y.V;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.Z;

/* loaded from: classes.dex */
public final class p implements t1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4117g = p1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = p1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final s1.m f4118a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.f f4119b;

    /* renamed from: c, reason: collision with root package name */
    public final o f4120c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final o1.q f4121e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4122f;

    public p(o1.p pVar, s1.m mVar, t1.f fVar, o oVar) {
        d1.d.e(mVar, "connection");
        d1.d.e(oVar, "http2Connection");
        this.f4118a = mVar;
        this.f4119b = fVar;
        this.f4120c = oVar;
        o1.q qVar = o1.q.H2_PRIOR_KNOWLEDGE;
        this.f4121e = pVar.f3359r.contains(qVar) ? qVar : o1.q.HTTP_2;
    }

    @Override // t1.d
    public final void a() {
        w wVar = this.d;
        d1.d.b(wVar);
        wVar.f().close();
    }

    @Override // t1.d
    public final void b() {
        this.f4120c.flush();
    }

    @Override // t1.d
    public final long c(o1.s sVar) {
        if (t1.e.a(sVar)) {
            return p1.b.i(sVar);
        }
        return 0L;
    }

    @Override // t1.d
    public final void cancel() {
        this.f4122f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // t1.d
    public final B1.t d(H.e eVar, long j2) {
        w wVar = this.d;
        d1.d.b(wVar);
        return wVar.f();
    }

    @Override // t1.d
    public final void e(H.e eVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        o1.j jVar = (o1.j) eVar.d;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new b(b.f4054f, (String) eVar.f260b));
        B1.i iVar = b.f4055g;
        o1.l lVar = (o1.l) eVar.f261c;
        d1.d.e(lVar, "url");
        String b2 = lVar.b();
        String d = lVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new b(iVar, b2));
        String a2 = ((o1.j) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new b(b.i, a2));
        }
        arrayList.add(new b(b.h, lVar.f3317a));
        int size = jVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = jVar.b(i2);
            Locale locale = Locale.US;
            d1.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            d1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f4117g.contains(lowerCase) || (lowerCase.equals("te") && d1.d.a(jVar.d(i2), "trailers"))) {
                arrayList.add(new b(lowerCase, jVar.d(i2)));
            }
        }
        o oVar = this.f4120c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f4114w) {
            synchronized (oVar) {
                try {
                    if (oVar.f4098e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f4099f) {
                        throw new C0308a();
                    }
                    i = oVar.f4098e;
                    oVar.f4098e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f4096b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f4114w.k(z2, i, arrayList);
        }
        oVar.f4114w.flush();
        this.d = wVar;
        if (this.f4122f) {
            w wVar2 = this.d;
            d1.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        d1.d.b(wVar3);
        v vVar = wVar3.f4147k;
        long j2 = this.f4119b.f3811g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        d1.d.b(wVar4);
        wVar4.f4148l.g(this.f4119b.h, timeUnit);
    }

    @Override // t1.d
    public final o1.r f(boolean z2) {
        o1.j jVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f4147k.h();
            while (wVar.f4145g.isEmpty() && wVar.f4149m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f4147k.k();
                    throw th;
                }
            }
            wVar.f4147k.k();
            if (wVar.f4145g.isEmpty()) {
                IOException iOException = wVar.f4150n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f4149m;
                V.g(i);
                throw new A(i);
            }
            Object removeFirst = wVar.f4145g.removeFirst();
            d1.d.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (o1.j) removeFirst;
        }
        o1.q qVar = this.f4121e;
        d1.d.e(qVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = jVar.b(i2);
            String d = jVar.d(i2);
            if (d1.d.a(b2, ":status")) {
                dVar = h1.d.l("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                d1.d.e(b2, "name");
                d1.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(k1.d.O(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        o1.r rVar = new o1.r();
        rVar.f3374b = qVar;
        rVar.f3375c = dVar.f19b;
        rVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Z z3 = new Z(2);
        ArrayList arrayList2 = (ArrayList) z3.f2878a;
        d1.d.e(arrayList2, "<this>");
        d1.d.e(strArr, "elements");
        arrayList2.addAll(S0.f.b0(strArr));
        rVar.f3377f = z3;
        if (z2 && rVar.f3375c == 100) {
            return null;
        }
        return rVar;
    }

    @Override // t1.d
    public final B1.v g(o1.s sVar) {
        w wVar = this.d;
        d1.d.b(wVar);
        return wVar.i;
    }

    @Override // t1.d
    public final s1.m h() {
        return this.f4118a;
    }
}
