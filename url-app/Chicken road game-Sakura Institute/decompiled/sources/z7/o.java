package z7;

import f8.g0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements x7.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f10202g = t7.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f10203h = t7.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final w7.i f10204a;

    /* renamed from: b, reason: collision with root package name */
    public final x7.f f10205b;

    /* renamed from: c, reason: collision with root package name */
    public final n f10206c;

    /* renamed from: d, reason: collision with root package name */
    public volatile v f10207d;

    /* renamed from: e, reason: collision with root package name */
    public final s7.q f10208e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10209f;

    public o(s7.p pVar, w7.i iVar, x7.f fVar, n nVar) {
        r6.k.f(pVar, "client");
        r6.k.f(nVar, "http2Connection");
        this.f10204a = iVar;
        this.f10205b = fVar;
        this.f10206c = nVar;
        List list = pVar.f8658w;
        s7.q qVar = s7.q.f8666k;
        this.f10208e = list.contains(qVar) ? qVar : s7.q.f8665j;
    }

    @Override // x7.d
    public final long a(s7.s sVar) {
        if (x7.e.a(sVar)) {
            return t7.b.i(sVar);
        }
        return 0L;
    }

    @Override // x7.d
    public final void b(a2.q qVar) {
        int i7;
        v vVar;
        if (this.f10207d != null) {
            return;
        }
        qVar.getClass();
        s7.k kVar = (s7.k) qVar.f438e;
        ArrayList arrayList = new ArrayList(kVar.size() + 4);
        arrayList.add(new b(b.f10135f, (String) qVar.f437d));
        f8.i iVar = b.f10136g;
        s7.l lVar = (s7.l) qVar.f436c;
        r6.k.f(lVar, "url");
        String b9 = lVar.b();
        String d8 = lVar.d();
        if (d8 != null) {
            b9 = b9 + '?' + d8;
        }
        arrayList.add(new b(iVar, b9));
        String a3 = ((s7.k) qVar.f438e).a("Host");
        if (a3 != null) {
            arrayList.add(new b(b.f10138i, a3));
        }
        arrayList.add(new b(b.f10137h, lVar.f8608a));
        int size = kVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            String g9 = kVar.g(i8);
            Locale locale = Locale.US;
            r6.k.e(locale, "US");
            String lowerCase = g9.toLowerCase(locale);
            r6.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f10202g.contains(lowerCase) || (lowerCase.equals("te") && r6.k.a(kVar.w(i8), "trailers"))) {
                arrayList.add(new b(lowerCase, kVar.w(i8)));
            }
        }
        n nVar = this.f10206c;
        nVar.getClass();
        boolean z8 = !false;
        synchronized (nVar.B) {
            synchronized (nVar) {
                try {
                    if (nVar.f10185j > 1073741823) {
                        nVar.n(8);
                    }
                    if (nVar.f10186k) {
                        throw new a();
                    }
                    i7 = nVar.f10185j;
                    nVar.f10185j = i7 + 2;
                    vVar = new v(i7, nVar, z8, false, null);
                    if (vVar.g()) {
                        nVar.f10182g.put(Integer.valueOf(i7), vVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            nVar.B.t(z8, i7, arrayList);
        }
        nVar.B.flush();
        this.f10207d = vVar;
        if (this.f10209f) {
            v vVar2 = this.f10207d;
            r6.k.c(vVar2);
            vVar2.e(9);
            throw new IOException("Canceled");
        }
        v vVar3 = this.f10207d;
        r6.k.c(vVar3);
        u uVar = vVar3.f10241k;
        long j8 = this.f10205b.f9694g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.g(j8);
        v vVar4 = this.f10207d;
        r6.k.c(vVar4);
        vVar4.f10242l.g(this.f10205b.f9695h);
    }

    @Override // x7.d
    public final void c() {
        v vVar = this.f10207d;
        r6.k.c(vVar);
        synchronized (vVar) {
            if (!vVar.f10238h && !vVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        vVar.f10240j.close();
    }

    @Override // x7.d
    public final void cancel() {
        this.f10209f = true;
        v vVar = this.f10207d;
        if (vVar != null) {
            vVar.e(9);
        }
    }

    @Override // x7.d
    public final void d() {
        this.f10206c.flush();
    }

    @Override // x7.d
    public final g0 e(s7.s sVar) {
        v vVar = this.f10207d;
        r6.k.c(vVar);
        return vVar.f10239i;
    }

    @Override // x7.d
    public final s7.r f(boolean z8) {
        s7.k kVar;
        v vVar = this.f10207d;
        if (vVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (vVar) {
            vVar.f10241k.h();
            while (vVar.f10237g.isEmpty() && vVar.f10243m == 0) {
                try {
                    try {
                        vVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    vVar.f10241k.k();
                    throw th;
                }
            }
            vVar.f10241k.k();
            if (vVar.f10237g.isEmpty()) {
                IOException iOException = vVar.f10244n;
                if (iOException != null) {
                    throw iOException;
                }
                int i7 = vVar.f10243m;
                r6.i.c(i7);
                throw new a0(i7);
            }
            Object removeFirst = vVar.f10237g.removeFirst();
            r6.k.e(removeFirst, "headersQueue.removeFirst()");
            kVar = (s7.k) removeFirst;
        }
        s7.q qVar = this.f10208e;
        r6.k.f(qVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = kVar.size();
        a0.l lVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            String g9 = kVar.g(i8);
            String w4 = kVar.w(i8);
            if (r6.k.a(g9, ":status")) {
                lVar = u3.r.l("HTTP/1.1 " + w4);
            } else if (!f10203h.contains(g9)) {
                r6.k.f(g9, "name");
                r6.k.f(w4, "value");
                arrayList.add(g9);
                arrayList.add(z6.h.W(w4).toString());
            }
        }
        if (lVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        s7.r rVar = new s7.r();
        rVar.f8671b = qVar;
        rVar.f8672c = lVar.f100g;
        rVar.f8673d = (String) lVar.f102i;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        f1.g gVar = new f1.g(6);
        ArrayList arrayList2 = gVar.f3153f;
        r6.k.f(arrayList2, "<this>");
        r6.k.f(strArr, "elements");
        arrayList2.addAll(e6.k.T(strArr));
        rVar.f8675f = gVar;
        if (z8 && rVar.f8672c == 100) {
            return null;
        }
        return rVar;
    }

    @Override // x7.d
    public final w7.i g() {
        return this.f10204a;
    }
}
