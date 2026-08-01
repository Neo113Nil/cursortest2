package p1;

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
    public static final List f3837g = j1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = j1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final m1.m f3838a;

    /* renamed from: b, reason: collision with root package name */
    public final n1.f f3839b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3840c;

    /* renamed from: d, reason: collision with root package name */
    public volatile w f3841d;

    /* renamed from: e, reason: collision with root package name */
    public final i1.v f3842e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3843f;

    public p(i1.u uVar, m1.m mVar, n1.f fVar, o oVar) {
        X0.f.e(mVar, "connection");
        X0.f.e(oVar, "http2Connection");
        this.f3838a = mVar;
        this.f3839b = fVar;
        this.f3840c = oVar;
        i1.v vVar = i1.v.H2_PRIOR_KNOWLEDGE;
        this.f3842e = uVar.f2761r.contains(vVar) ? vVar : i1.v.HTTP_2;
    }

    @Override // n1.d
    public final v1.u a(i1.w wVar, long j2) {
        w wVar2 = this.f3841d;
        X0.f.b(wVar2);
        return wVar2.f();
    }

    @Override // n1.d
    public final void b() {
        w wVar = this.f3841d;
        X0.f.b(wVar);
        wVar.f().close();
    }

    @Override // n1.d
    public final void c() {
        this.f3840c.flush();
    }

    @Override // n1.d
    public final void cancel() {
        this.f3843f = true;
        w wVar = this.f3841d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // n1.d
    public final void d(i1.w wVar) {
        int i;
        w wVar2;
        if (this.f3841d != null) {
            return;
        }
        wVar.getClass();
        i1.n nVar = wVar.f2778c;
        ArrayList arrayList = new ArrayList(nVar.size() + 4);
        arrayList.add(new C0312b(C0312b.f3770f, wVar.f2777b));
        v1.j jVar = C0312b.f3771g;
        i1.p pVar = wVar.f2776a;
        X0.f.e(pVar, "url");
        String b2 = pVar.b();
        String d2 = pVar.d();
        if (d2 != null) {
            b2 = b2 + '?' + d2;
        }
        arrayList.add(new C0312b(jVar, b2));
        String a2 = wVar.f2778c.a("Host");
        if (a2 != null) {
            arrayList.add(new C0312b(C0312b.i, a2));
        }
        arrayList.add(new C0312b(C0312b.h, pVar.f2712a));
        int size = nVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = nVar.b(i2);
            Locale locale = Locale.US;
            X0.f.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            X0.f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f3837g.contains(lowerCase) || (lowerCase.equals("te") && X0.f.a(nVar.d(i2), "trailers"))) {
                arrayList.add(new C0312b(lowerCase, nVar.d(i2)));
            }
        }
        o oVar = this.f3840c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f3834w) {
            synchronized (oVar) {
                try {
                    if (oVar.f3818e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f3819f) {
                        throw new C0311a();
                    }
                    i = oVar.f3818e;
                    oVar.f3818e = i + 2;
                    wVar2 = new w(i, oVar, z2, false, null);
                    if (wVar2.h()) {
                        oVar.f3815b.put(Integer.valueOf(i), wVar2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f3834w.k(z2, i, arrayList);
        }
        oVar.f3834w.flush();
        this.f3841d = wVar2;
        if (this.f3843f) {
            w wVar3 = this.f3841d;
            X0.f.b(wVar3);
            wVar3.e(9);
            throw new IOException("Canceled");
        }
        w wVar4 = this.f3841d;
        X0.f.b(wVar4);
        v vVar = wVar4.f3873k;
        long j2 = this.f3839b.f3663g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar5 = this.f3841d;
        X0.f.b(wVar5);
        wVar5.f3874l.g(this.f3839b.h, timeUnit);
    }

    @Override // n1.d
    public final i1.x e(boolean z2) {
        i1.n nVar;
        w wVar = this.f3841d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f3873k.h();
            while (wVar.f3871g.isEmpty() && wVar.f3875m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f3873k.k();
                    throw th;
                }
            }
            wVar.f3873k.k();
            if (wVar.f3871g.isEmpty()) {
                IOException iOException = wVar.f3876n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f3875m;
                X0.e.f(i);
                throw new B(i);
            }
            Object removeFirst = wVar.f3871g.removeFirst();
            X0.f.d(removeFirst, "headersQueue.removeFirst()");
            nVar = (i1.n) removeFirst;
        }
        i1.v vVar = this.f3842e;
        X0.f.e(vVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = nVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = nVar.b(i2);
            String d2 = nVar.d(i2);
            if (X0.f.a(b2, ":status")) {
                dVar = i1.m.n("HTTP/1.1 " + d2);
            } else if (!h.contains(b2)) {
                X0.f.e(b2, "name");
                X0.f.e(d2, "value");
                arrayList.add(b2);
                arrayList.add(e1.d.P0(d2).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i1.x xVar = new i1.x();
        xVar.f2782b = vVar;
        xVar.f2783c = dVar.f21b;
        xVar.f2784d = (String) dVar.f23d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        B0.d dVar2 = new B0.d(26);
        ArrayList arrayList2 = (ArrayList) dVar2.f67b;
        X0.f.e(arrayList2, "<this>");
        X0.f.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        X0.f.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        xVar.f2786f = dVar2;
        if (z2 && xVar.f2783c == 100) {
            return null;
        }
        return xVar;
    }

    @Override // n1.d
    public final v1.w f(i1.y yVar) {
        w wVar = this.f3841d;
        X0.f.b(wVar);
        return wVar.i;
    }

    @Override // n1.d
    public final m1.m g() {
        return this.f3838a;
    }

    @Override // n1.d
    public final long h(i1.y yVar) {
        if (n1.e.a(yVar)) {
            return j1.b.i(yVar);
        }
        return 0L;
    }
}
