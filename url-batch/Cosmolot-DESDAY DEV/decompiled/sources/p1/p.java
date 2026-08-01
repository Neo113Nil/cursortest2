package p1;

import X.V;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements n1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f3445g = j1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = j1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final m1.m f3446a;

    /* renamed from: b, reason: collision with root package name */
    public final n1.f f3447b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3448c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final i1.q f3449e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3450f;

    public p(i1.o oVar, m1.m mVar, n1.f fVar, o oVar2) {
        X0.e.e(mVar, "connection");
        X0.e.e(oVar2, "http2Connection");
        this.f3446a = mVar;
        this.f3447b = fVar;
        this.f3448c = oVar2;
        i1.q qVar = i1.q.H2_PRIOR_KNOWLEDGE;
        this.f3449e = oVar.f2472r.contains(qVar) ? qVar : i1.q.HTTP_2;
    }

    @Override // n1.d
    public final void a() {
        w wVar = this.d;
        X0.e.b(wVar);
        wVar.f().close();
    }

    @Override // n1.d
    public final void b() {
        this.f3448c.flush();
    }

    @Override // n1.d
    public final v1.s c(H.e eVar, long j2) {
        w wVar = this.d;
        X0.e.b(wVar);
        return wVar.f();
    }

    @Override // n1.d
    public final void cancel() {
        this.f3450f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // n1.d
    public final void d(H.e eVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        eVar.getClass();
        i1.k kVar = (i1.k) eVar.d;
        ArrayList arrayList = new ArrayList(kVar.size() + 4);
        arrayList.add(new C0285b(C0285b.f3382f, (String) eVar.f212b));
        v1.i iVar = C0285b.f3383g;
        i1.m mVar = (i1.m) eVar.f213c;
        X0.e.e(mVar, "url");
        String b2 = mVar.b();
        String d = mVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new C0285b(iVar, b2));
        String a2 = ((i1.k) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0285b(C0285b.i, a2));
        }
        arrayList.add(new C0285b(C0285b.h, mVar.f2450a));
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = kVar.b(i2);
            Locale locale = Locale.US;
            X0.e.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            X0.e.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f3445g.contains(lowerCase) || (lowerCase.equals("te") && X0.e.a(kVar.d(i2), "trailers"))) {
                arrayList.add(new C0285b(lowerCase, kVar.d(i2)));
            }
        }
        o oVar = this.f3448c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f3442w) {
            synchronized (oVar) {
                try {
                    if (oVar.f3426e > 1073741823) {
                        oVar.h(8);
                    }
                    if (oVar.f3427f) {
                        throw new C0284a();
                    }
                    i = oVar.f3426e;
                    oVar.f3426e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f3424b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f3442w.i(z2, i, arrayList);
        }
        oVar.f3442w.flush();
        this.d = wVar;
        if (this.f3450f) {
            w wVar2 = this.d;
            X0.e.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        X0.e.b(wVar3);
        v vVar = wVar3.f3475k;
        long j2 = this.f3447b.f3292g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        X0.e.b(wVar4);
        wVar4.f3476l.g(this.f3447b.h, timeUnit);
    }

    @Override // n1.d
    public final i1.s e(boolean z2) {
        i1.k kVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f3475k.h();
            while (wVar.f3473g.isEmpty() && wVar.f3477m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f3475k.k();
                    throw th;
                }
            }
            wVar.f3475k.k();
            if (wVar.f3473g.isEmpty()) {
                IOException iOException = wVar.f3478n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f3477m;
                V.f(i);
                throw new B(i);
            }
            Object removeFirst = wVar.f3473g.removeFirst();
            X0.e.d(removeFirst, "headersQueue.removeFirst()");
            kVar = (i1.k) removeFirst;
        }
        i1.q qVar = this.f3449e;
        X0.e.e(qVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = kVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = kVar.b(i2);
            String d = kVar.d(i2);
            if (X0.e.a(b2, ":status")) {
                dVar = i1.p.i("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                X0.e.e(b2, "name");
                X0.e.e(d, "value");
                arrayList.add(b2);
                arrayList.add(e1.d.y0(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i1.s sVar = new i1.s();
        sVar.f2492b = qVar;
        sVar.f2493c = dVar.f18b;
        sVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        B0.d dVar2 = new B0.d(27);
        ArrayList arrayList2 = (ArrayList) dVar2.f59b;
        X0.e.e(arrayList2, "<this>");
        X0.e.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        X0.e.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        sVar.f2495f = dVar2;
        if (z2 && sVar.f2493c == 100) {
            return null;
        }
        return sVar;
    }

    @Override // n1.d
    public final v1.u f(i1.t tVar) {
        w wVar = this.d;
        X0.e.b(wVar);
        return wVar.i;
    }

    @Override // n1.d
    public final m1.m g() {
        return this.f3446a;
    }

    @Override // n1.d
    public final long h(i1.t tVar) {
        if (n1.e.a(tVar)) {
            return j1.b.i(tVar);
        }
        return 0L;
    }
}
