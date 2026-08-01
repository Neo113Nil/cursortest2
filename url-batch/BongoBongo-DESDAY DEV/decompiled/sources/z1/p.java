package z1;

import Z.V;
import h.AbstractC0112a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m.C0202a0;

/* loaded from: classes.dex */
public final class p implements x1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4489g = t1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f4490h = t1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final w1.m f4491a;

    /* renamed from: b, reason: collision with root package name */
    public final x1.f f4492b;

    /* renamed from: c, reason: collision with root package name */
    public final o f4493c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.p f4494e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4495f;

    public p(s1.o oVar, w1.m mVar, x1.f fVar, o oVar2) {
        h1.d.e(mVar, "connection");
        h1.d.e(oVar2, "http2Connection");
        this.f4491a = mVar;
        this.f4492b = fVar;
        this.f4493c = oVar2;
        s1.p pVar = s1.p.H2_PRIOR_KNOWLEDGE;
        this.f4494e = oVar.f3676r.contains(pVar) ? pVar : s1.p.HTTP_2;
    }

    @Override // x1.d
    public final void a() {
        w wVar = this.d;
        h1.d.b(wVar);
        wVar.f().close();
    }

    @Override // x1.d
    public final void b() {
        this.f4493c.flush();
    }

    @Override // x1.d
    public final F1.t c(I.d dVar, long j2) {
        w wVar = this.d;
        h1.d.b(wVar);
        return wVar.f();
    }

    @Override // x1.d
    public final void cancel() {
        this.f4495f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // x1.d
    public final long d(s1.r rVar) {
        if (x1.e.a(rVar)) {
            return t1.b.i(rVar);
        }
        return 0L;
    }

    @Override // x1.d
    public final s1.q e(boolean z2) {
        s1.j jVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f4521k.h();
            while (wVar.f4518g.isEmpty() && wVar.f4523m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f4521k.k();
                    throw th;
                }
            }
            wVar.f4521k.k();
            if (wVar.f4518g.isEmpty()) {
                IOException iOException = wVar.f4524n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f4523m;
                V.g(i);
                throw new A(i);
            }
            Object removeFirst = wVar.f4518g.removeFirst();
            h1.d.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (s1.j) removeFirst;
        }
        s1.p pVar = this.f4494e;
        h1.d.e(pVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        C.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = jVar.b(i2);
            String d = jVar.d(i2);
            if (h1.d.a(b2, ":status")) {
                dVar = AbstractC0112a.o("HTTP/1.1 " + d);
            } else if (!f4490h.contains(b2)) {
                h1.d.e(b2, "name");
                h1.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(o1.d.S(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        s1.q qVar = new s1.q();
        qVar.f3692b = pVar;
        qVar.f3693c = dVar.f74b;
        qVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0202a0 c0202a0 = new C0202a0(2);
        ArrayList arrayList2 = (ArrayList) c0202a0.f3068a;
        h1.d.e(arrayList2, "<this>");
        h1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        h1.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        qVar.f3695f = c0202a0;
        if (z2 && qVar.f3693c == 100) {
            return null;
        }
        return qVar;
    }

    @Override // x1.d
    public final F1.v f(s1.r rVar) {
        w wVar = this.d;
        h1.d.b(wVar);
        return wVar.i;
    }

    @Override // x1.d
    public final void g(I.d dVar) {
        int i;
        w wVar;
        if (this.d != null) {
            return;
        }
        dVar.getClass();
        s1.j jVar = (s1.j) dVar.d;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new b(b.f4421f, (String) dVar.f320b));
        F1.i iVar = b.f4422g;
        s1.l lVar = (s1.l) dVar.f321c;
        h1.d.e(lVar, "url");
        String b2 = lVar.b();
        String d = lVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new b(iVar, b2));
        String a2 = ((s1.j) dVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new b(b.i, a2));
        }
        arrayList.add(new b(b.f4423h, lVar.f3649a));
        int size = jVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = jVar.b(i2);
            Locale locale = Locale.US;
            h1.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            h1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f4489g.contains(lowerCase) || (lowerCase.equals("te") && h1.d.a(jVar.d(i2), "trailers"))) {
                arrayList.add(new b(lowerCase, jVar.d(i2)));
            }
        }
        o oVar = this.f4493c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f4486w) {
            synchronized (oVar) {
                try {
                    if (oVar.f4469e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f4470f) {
                        throw new C0322a();
                    }
                    i = oVar.f4469e;
                    oVar.f4469e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f4467b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f4486w.k(z2, i, arrayList);
        }
        oVar.f4486w.flush();
        this.d = wVar;
        if (this.f4495f) {
            w wVar2 = this.d;
            h1.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        h1.d.b(wVar3);
        v vVar = wVar3.f4521k;
        long j2 = this.f4492b.f4296g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        h1.d.b(wVar4);
        wVar4.f4522l.g(this.f4492b.f4297h, timeUnit);
    }

    @Override // x1.d
    public final w1.m h() {
        return this.f4491a;
    }
}
