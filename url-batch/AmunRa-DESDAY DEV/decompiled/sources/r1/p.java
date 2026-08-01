package r1;

import X.V;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements p1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f3594g = l1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = l1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final o1.m f3595a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.f f3596b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3597c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final k1.s f3598e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3599f;

    public p(k1.r rVar, o1.m mVar, p1.f fVar, o oVar) {
        Z0.d.e(mVar, "connection");
        Z0.d.e(oVar, "http2Connection");
        this.f3595a = mVar;
        this.f3596b = fVar;
        this.f3597c = oVar;
        k1.s sVar = k1.s.H2_PRIOR_KNOWLEDGE;
        this.f3598e = rVar.f2873r.contains(sVar) ? sVar : k1.s.HTTP_2;
    }

    @Override // p1.d
    public final void a() {
        w wVar = this.d;
        Z0.d.b(wVar);
        wVar.f().close();
    }

    @Override // p1.d
    public final void b() {
        this.f3597c.flush();
    }

    @Override // p1.d
    public final long c(k1.u uVar) {
        if (p1.e.a(uVar)) {
            return l1.b.i(uVar);
        }
        return 0L;
    }

    @Override // p1.d
    public final void cancel() {
        this.f3599f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // p1.d
    public final x1.t d(H.e eVar, long j2) {
        w wVar = this.d;
        Z0.d.b(wVar);
        return wVar.f();
    }

    @Override // p1.d
    public final void e(H.e eVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        k1.l lVar = (k1.l) eVar.d;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new C0291b(C0291b.f3531f, (String) eVar.f198b));
        x1.i iVar = C0291b.f3532g;
        k1.n nVar = (k1.n) eVar.f199c;
        Z0.d.e(nVar, "url");
        String b2 = nVar.b();
        String d = nVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new C0291b(iVar, b2));
        String a2 = ((k1.l) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0291b(C0291b.i, a2));
        }
        arrayList.add(new C0291b(C0291b.h, nVar.f2831a));
        int size = lVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = lVar.b(i2);
            Locale locale = Locale.US;
            Z0.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            Z0.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f3594g.contains(lowerCase) || (lowerCase.equals("te") && Z0.d.a(lVar.d(i2), "trailers"))) {
                arrayList.add(new C0291b(lowerCase, lVar.d(i2)));
            }
        }
        o oVar = this.f3597c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f3591w) {
            synchronized (oVar) {
                try {
                    if (oVar.f3575e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f3576f) {
                        throw new C0290a();
                    }
                    i = oVar.f3575e;
                    oVar.f3575e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f3573b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f3591w.k(z2, i, arrayList);
        }
        oVar.f3591w.flush();
        this.d = wVar;
        if (this.f3599f) {
            w wVar2 = this.d;
            Z0.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        Z0.d.b(wVar3);
        v vVar = wVar3.f3624k;
        long j2 = this.f3596b.f3472g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        Z0.d.b(wVar4);
        wVar4.f3625l.g(this.f3596b.h, timeUnit);
    }

    @Override // p1.d
    public final k1.t f(boolean z2) {
        k1.l lVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f3624k.h();
            while (wVar.f3622g.isEmpty() && wVar.f3626m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f3624k.k();
                    throw th;
                }
            }
            wVar.f3624k.k();
            if (wVar.f3622g.isEmpty()) {
                IOException iOException = wVar.f3627n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f3626m;
                V.f(i);
                throw new B(i);
            }
            Object removeFirst = wVar.f3622g.removeFirst();
            Z0.d.d(removeFirst, "headersQueue.removeFirst()");
            lVar = (k1.l) removeFirst;
        }
        k1.s sVar = this.f3598e;
        Z0.d.e(sVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = lVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = lVar.b(i2);
            String d = lVar.d(i2);
            if (Z0.d.a(b2, ":status")) {
                dVar = k1.c.s("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                Z0.d.e(b2, "name");
                Z0.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(g1.d.I0(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        k1.t tVar = new k1.t();
        tVar.f2888b = sVar;
        tVar.f2889c = dVar.f13b;
        tVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C.g gVar = new C.g(28);
        ArrayList arrayList2 = (ArrayList) gVar.f64b;
        Z0.d.e(arrayList2, "<this>");
        Z0.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        Z0.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        tVar.f2891f = gVar;
        if (z2 && tVar.f2889c == 100) {
            return null;
        }
        return tVar;
    }

    @Override // p1.d
    public final x1.v g(k1.u uVar) {
        w wVar = this.d;
        Z0.d.b(wVar);
        return wVar.i;
    }

    @Override // p1.d
    public final o1.m h() {
        return this.f3595a;
    }
}
