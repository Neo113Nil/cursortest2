package G1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import n.C0288n;

/* loaded from: classes.dex */
public final class r implements E1.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f417g = A1.c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f418h = A1.c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final D1.m f419a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.g f420b;

    /* renamed from: c, reason: collision with root package name */
    public final q f421c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f422d;
    public final z1.t e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f423f;

    public r(z1.s sVar, D1.m mVar, E1.g gVar, q qVar) {
        j1.h.e(mVar, "connection");
        j1.h.e(qVar, "http2Connection");
        this.f419a = mVar;
        this.f420b = gVar;
        this.f421c = qVar;
        z1.t tVar = z1.t.H2_PRIOR_KNOWLEDGE;
        this.e = sVar.f4919r.contains(tVar) ? tVar : z1.t.HTTP_2;
    }

    @Override // E1.e
    public final void a() {
        y yVar = this.f422d;
        j1.h.b(yVar);
        yVar.f().close();
    }

    @Override // E1.e
    public final void b(J.d dVar) {
        int i;
        y yVar;
        if (this.f422d != null) {
            return;
        }
        dVar.getClass();
        z1.m mVar = (z1.m) dVar.f627d;
        ArrayList arrayList = new ArrayList(mVar.size() + 4);
        arrayList.add(new C0002c(C0002c.f349f, (String) dVar.f625b));
        M1.i iVar = C0002c.f350g;
        z1.o oVar = (z1.o) dVar.f626c;
        j1.h.e(oVar, "url");
        String b2 = oVar.b();
        String d2 = oVar.d();
        if (d2 != null) {
            b2 = b2 + '?' + d2;
        }
        arrayList.add(new C0002c(iVar, b2));
        String a2 = ((z1.m) dVar.f627d).a("Host");
        if (a2 != null) {
            arrayList.add(new C0002c(C0002c.i, a2));
        }
        arrayList.add(new C0002c(C0002c.f351h, oVar.f4875a));
        int size = mVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b3 = mVar.b(i2);
            Locale locale = Locale.US;
            j1.h.d(locale, "US");
            String lowerCase = b3.toLowerCase(locale);
            j1.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f417g.contains(lowerCase) || (lowerCase.equals("te") && j1.h.a(mVar.d(i2), "trailers"))) {
                arrayList.add(new C0002c(lowerCase, mVar.d(i2)));
            }
        }
        q qVar = this.f421c;
        qVar.getClass();
        boolean z2 = !false;
        synchronized (qVar.f414w) {
            synchronized (qVar) {
                try {
                    if (qVar.e > 1073741823) {
                        qVar.z(8);
                    }
                    if (qVar.f399f) {
                        throw new C0000a();
                    }
                    i = qVar.e;
                    qVar.e = i + 2;
                    yVar = new y(i, qVar, z2, false, null);
                    if (yVar.h()) {
                        qVar.f396b.put(Integer.valueOf(i), yVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qVar.f414w.B(z2, i, arrayList);
        }
        qVar.f414w.flush();
        this.f422d = yVar;
        if (this.f423f) {
            y yVar2 = this.f422d;
            j1.h.b(yVar2);
            yVar2.e(9);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f422d;
        j1.h.b(yVar3);
        x xVar = yVar3.f450k;
        long j = this.f420b.f310g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j, timeUnit);
        y yVar4 = this.f422d;
        j1.h.b(yVar4);
        yVar4.f451l.g(this.f420b.f311h, timeUnit);
    }

    @Override // E1.e
    public final void c() {
        this.f421c.flush();
    }

    @Override // E1.e
    public final void cancel() {
        this.f423f = true;
        y yVar = this.f422d;
        if (yVar != null) {
            yVar.e(9);
        }
    }

    @Override // E1.e
    public final M1.t d(J.d dVar, long j) {
        y yVar = this.f422d;
        j1.h.b(yVar);
        return yVar.f();
    }

    @Override // E1.e
    public final M1.v e(z1.v vVar) {
        y yVar = this.f422d;
        j1.h.b(yVar);
        return yVar.i;
    }

    @Override // E1.e
    public final long f(z1.v vVar) {
        if (E1.f.a(vVar)) {
            return A1.c.i(vVar);
        }
        return 0L;
    }

    @Override // E1.e
    public final z1.u g(boolean z2) {
        z1.m mVar;
        y yVar = this.f422d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f450k.h();
            while (yVar.f448g.isEmpty() && yVar.f452m == 0) {
                try {
                    yVar.k();
                } catch (Throwable th) {
                    yVar.f450k.k();
                    throw th;
                }
            }
            yVar.f450k.k();
            if (yVar.f448g.isEmpty()) {
                IOException iOException = yVar.f453n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = yVar.f452m;
                AbstractC0001b.h(i);
                throw new E(i);
            }
            Object removeFirst = yVar.f448g.removeFirst();
            j1.h.d(removeFirst, "headersQueue.removeFirst()");
            mVar = (z1.m) removeFirst;
        }
        z1.t tVar = this.e;
        j1.h.e(tVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = mVar.size();
        D.d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = mVar.b(i2);
            String d2 = mVar.d(i2);
            if (j1.h.a(b2, ":status")) {
                dVar = H1.d.Z("HTTP/1.1 " + d2);
            } else if (!f418h.contains(b2)) {
                j1.h.e(b2, "name");
                j1.h.e(d2, "value");
                arrayList.add(b2);
                arrayList.add(q1.e.L0(d2).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        z1.u uVar = new z1.u();
        uVar.f4935b = tVar;
        uVar.f4936c = dVar.f168b;
        uVar.f4937d = (String) dVar.f170d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0288n c0288n = new C0288n(8);
        ArrayList arrayList2 = (ArrayList) c0288n.f3677b;
        j1.h.e(arrayList2, "<this>");
        j1.h.e(strArr, "elements");
        arrayList2.addAll(X0.j.l0(strArr));
        uVar.f4938f = c0288n;
        if (z2 && uVar.f4936c == 100) {
            return null;
        }
        return uVar;
    }

    @Override // E1.e
    public final D1.m h() {
        return this.f419a;
    }
}
