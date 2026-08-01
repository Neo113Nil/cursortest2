package t1;

import X.V;
import j0.AbstractC0143a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.C0207a0;

/* loaded from: classes.dex */
public final class p implements r1.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f3815g = n1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = n1.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final q1.m f3816a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.f f3817b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3818c;
    public volatile w d;

    /* renamed from: e, reason: collision with root package name */
    public final m1.q f3819e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3820f;

    public p(m1.p pVar, q1.m mVar, r1.f fVar, o oVar) {
        b1.d.e(mVar, "connection");
        b1.d.e(oVar, "http2Connection");
        this.f3816a = mVar;
        this.f3817b = fVar;
        this.f3818c = oVar;
        m1.q qVar = m1.q.H2_PRIOR_KNOWLEDGE;
        this.f3819e = pVar.f3225r.contains(qVar) ? qVar : m1.q.HTTP_2;
    }

    @Override // r1.d
    public final void a() {
        w wVar = this.d;
        b1.d.b(wVar);
        wVar.f().close();
    }

    @Override // r1.d
    public final void b() {
        this.f3818c.flush();
    }

    @Override // r1.d
    public final z1.t c(H.e eVar, long j2) {
        w wVar = this.d;
        b1.d.b(wVar);
        return wVar.f();
    }

    @Override // r1.d
    public final void cancel() {
        this.f3820f = true;
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
        m1.j jVar = (m1.j) eVar.d;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new C0316b(C0316b.f3752f, (String) eVar.f205b));
        z1.i iVar = C0316b.f3753g;
        m1.l lVar = (m1.l) eVar.f206c;
        b1.d.e(lVar, "url");
        String b2 = lVar.b();
        String d = lVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new C0316b(iVar, b2));
        String a2 = ((m1.j) eVar.d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0316b(C0316b.i, a2));
        }
        arrayList.add(new C0316b(C0316b.h, lVar.f3183a));
        int size = jVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = jVar.b(i2);
            Locale locale = Locale.US;
            b1.d.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            b1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f3815g.contains(lowerCase) || (lowerCase.equals("te") && b1.d.a(jVar.d(i2), "trailers"))) {
                arrayList.add(new C0316b(lowerCase, jVar.d(i2)));
            }
        }
        o oVar = this.f3818c;
        oVar.getClass();
        boolean z2 = !false;
        synchronized (oVar.f3812w) {
            synchronized (oVar) {
                try {
                    if (oVar.f3796e > 1073741823) {
                        oVar.j(8);
                    }
                    if (oVar.f3797f) {
                        throw new C0315a();
                    }
                    i = oVar.f3796e;
                    oVar.f3796e = i + 2;
                    wVar = new w(i, oVar, z2, false, null);
                    if (wVar.h()) {
                        oVar.f3794b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f3812w.k(z2, i, arrayList);
        }
        oVar.f3812w.flush();
        this.d = wVar;
        if (this.f3820f) {
            w wVar2 = this.d;
            b1.d.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        b1.d.b(wVar3);
        v vVar = wVar3.f3845k;
        long j2 = this.f3817b.f3524g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j2, timeUnit);
        w wVar4 = this.d;
        b1.d.b(wVar4);
        wVar4.f3846l.g(this.f3817b.h, timeUnit);
    }

    @Override // r1.d
    public final m1.r e(boolean z2) {
        m1.j jVar;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f3845k.h();
            while (wVar.f3843g.isEmpty() && wVar.f3847m == 0) {
                try {
                    wVar.k();
                } catch (Throwable th) {
                    wVar.f3845k.k();
                    throw th;
                }
            }
            wVar.f3845k.k();
            if (wVar.f3843g.isEmpty()) {
                IOException iOException = wVar.f3848n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f3847m;
                V.f(i);
                throw new B(i);
            }
            Object removeFirst = wVar.f3843g.removeFirst();
            b1.d.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (m1.j) removeFirst;
        }
        m1.q qVar = this.f3819e;
        b1.d.e(qVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        B.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = jVar.b(i2);
            String d = jVar.d(i2);
            if (b1.d.a(b2, ":status")) {
                dVar = AbstractC0143a.o("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                b1.d.e(b2, "name");
                b1.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(i1.d.E0(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        m1.r rVar = new m1.r();
        rVar.f3240b = qVar;
        rVar.f3241c = dVar.f15b;
        rVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0207a0 c0207a0 = new C0207a0(2);
        ArrayList arrayList2 = (ArrayList) c0207a0.f2889a;
        b1.d.e(arrayList2, "<this>");
        b1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        b1.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        rVar.f3243f = c0207a0;
        if (z2 && rVar.f3241c == 100) {
            return null;
        }
        return rVar;
    }

    @Override // r1.d
    public final z1.v f(m1.s sVar) {
        w wVar = this.d;
        b1.d.b(wVar);
        return wVar.i;
    }

    @Override // r1.d
    public final q1.m g() {
        return this.f3816a;
    }

    @Override // r1.d
    public final long h(m1.s sVar) {
        if (r1.e.a(sVar)) {
            return n1.b.i(sVar);
        }
        return 0L;
    }
}
