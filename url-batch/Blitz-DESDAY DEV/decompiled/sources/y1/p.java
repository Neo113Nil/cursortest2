package y1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.C0176a0;
import m.C0227a;

/* loaded from: classes.dex */
public final class p implements w1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4260g = s1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = s1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final v1.m f4261a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.f f4262b;

    /* renamed from: c, reason: collision with root package name */
    public final o f4263c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final r1.p f4264e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4265f;

    public p(r1.o oVar, v1.m mVar, w1.f fVar, o oVar2) {
        g1.d.e(mVar, "connection");
        g1.d.e(oVar2, "http2Connection");
        this.f4261a = mVar;
        this.f4262b = fVar;
        this.f4263c = oVar2;
        r1.p pVar = r1.p.H2_PRIOR_KNOWLEDGE;
        this.f4264e = oVar.f3521r.contains(pVar) ? pVar : r1.p.HTTP_2;
    }

    @Override // w1.d
    public final void a() {
        w wVar = this.d;
        g1.d.b(wVar);
        wVar.f().close();
    }

    @Override // w1.d
    public final void b(J.d dVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        dVar.getClass();
        r1.j jVar = (r1.j) dVar.d;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new b(b.f4197f, (String) dVar.f358b));
        E1.i iVar = b.f4198g;
        r1.l lVar = (r1.l) dVar.f359c;
        g1.d.e(lVar, "url");
        String b2 = lVar.b();
        String d = lVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new b(iVar, b2));
        String a2 = ((r1.j) dVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new b(b.i, a2));
        }
        arrayList.add(new b(b.h, lVar.f3496a));
        int size = jVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = jVar.b(i2);
            Locale locale = Locale.US;
            g1.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            g1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f4260g.contains(lowerCase) || (lowerCase.equals("te") && g1.d.a(jVar.d(i2), "trailers"))) {
                arrayList.add(new b(lowerCase, jVar.d(i2)));
            }
        }
        o oVar = this.f4263c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f4257w) {
            synchronized (oVar) {
                try {
                    if (oVar.f4241e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f4242f) {
                        throw new C0317a();
                    }
                    i = oVar.f4241e;
                    oVar.f4241e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f4239b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f4257w.k(z2, i, arrayList);
        }
        oVar.f4257w.flush();
        this.d = wVar;
        if (this.f4265f) {
            w wVar2 = this.d;
            g1.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        g1.d.b(wVar3);
        v vVar = wVar3.f4290k;
        long j2 = this.f4262b.f3947g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        g1.d.b(wVar4);
        wVar4.f4291l.g(this.f4262b.h, timeUnit);
    }

    @Override // w1.d
    public final E1.v c(r1.r rVar) {
        w wVar = this.d;
        g1.d.b(wVar);
        return wVar.i;
    }

    @Override // w1.d
    public final void cancel() {
        this.f4265f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // w1.d
    public final void d() {
        this.f4263c.flush();
    }

    @Override // w1.d
    public final E1.t e(J.d dVar, long j2) {
        w wVar = this.d;
        g1.d.b(wVar);
        return wVar.f();
    }

    @Override // w1.d
    public final r1.q f(boolean z2) {
        r1.j jVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f4290k.h();
            while (wVar.f4288g.isEmpty() && wVar.f4292m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f4290k.k();
                    throw th;
                }
            }
            wVar.f4290k.k();
            if (wVar.f4288g.isEmpty()) {
                IOException iOException = wVar.f4293n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f4292m;
                X0.a.g(i);
                throw new A(i);
            }
            Object removeFirst = wVar.f4288g.removeFirst();
            g1.d.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (r1.j) removeFirst;
        }
        r1.p pVar = this.f4264e;
        g1.d.e(pVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        D.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = jVar.b(i2);
            String d = jVar.d(i2);
            if (g1.d.a(b2, ":status")) {
                dVar = C0227a.n("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                g1.d.e(b2, "name");
                g1.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(n1.d.R(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        r1.q qVar = new r1.q();
        qVar.f3536b = pVar;
        qVar.f3537c = dVar.f121b;
        qVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0176a0 c0176a0 = new C0176a0(2);
        ArrayList arrayList2 = (ArrayList) c0176a0.f2962a;
        g1.d.e(arrayList2, "<this>");
        g1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        g1.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        qVar.f3539f = c0176a0;
        if (z2 && qVar.f3537c == 100) {
            return null;
        }
        return qVar;
    }

    @Override // w1.d
    public final long g(r1.r rVar) {
        if (w1.e.a(rVar)) {
            return s1.b.i(rVar);
        }
        return 0L;
    }

    @Override // w1.d
    public final v1.m h() {
        return this.f4261a;
    }
}
