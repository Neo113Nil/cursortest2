package a4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s implements y3.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f219g = u3.b.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = u3.b.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final x3.l f220a;

    /* renamed from: b, reason: collision with root package name */
    public final y3.f f221b;

    /* renamed from: c, reason: collision with root package name */
    public final r f222c;
    public volatile z d;

    /* renamed from: e, reason: collision with root package name */
    public final t3.p f223e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f224f;

    public s(t3.o oVar, x3.l lVar, y3.f fVar, r rVar) {
        i3.d.e(rVar, "http2Connection");
        this.f220a = lVar;
        this.f221b = fVar;
        this.f222c = rVar;
        List list = oVar.f3496w;
        t3.p pVar = t3.p.H2_PRIOR_KNOWLEDGE;
        this.f223e = list.contains(pVar) ? pVar : t3.p.HTTP_2;
    }

    @Override // y3.d
    public final void a() {
        z zVar = this.d;
        i3.d.b(zVar);
        synchronized (zVar) {
            if (!zVar.h && !zVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        zVar.f244j.close();
    }

    @Override // y3.d
    public final void b() {
        this.f222c.flush();
    }

    @Override // y3.d
    public final g4.v c(t3.s sVar) {
        z zVar = this.d;
        i3.d.b(zVar);
        return zVar.i;
    }

    @Override // y3.d
    public final void cancel() {
        this.f224f = true;
        z zVar = this.d;
        if (zVar != null) {
            zVar.e(9);
        }
    }

    @Override // y3.d
    public final long d(t3.s sVar) {
        if (y3.e.a(sVar)) {
            return u3.b.h(sVar);
        }
        return 0L;
    }

    @Override // y3.d
    public final t3.r e(boolean z4) {
        t3.j jVar;
        z zVar = this.d;
        if (zVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (zVar) {
            zVar.f245k.h();
            while (zVar.f243g.isEmpty() && zVar.f247m == 0) {
                try {
                    try {
                        zVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    zVar.f245k.k();
                    throw th;
                }
            }
            zVar.f245k.k();
            if (zVar.f243g.isEmpty()) {
                IOException iOException = zVar.f248n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = zVar.f247m;
                b.h(i);
                throw new f0(i);
            }
            Object removeFirst = zVar.f243g.removeFirst();
            i3.d.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (t3.j) removeFirst;
        }
        t3.p pVar = this.f223e;
        i3.d.e(pVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        e0.d dVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            String b2 = jVar.b(i4);
            String d = jVar.d(i4);
            if (i3.d.a(b2, ":status")) {
                dVar = s.a.v("HTTP/1.1 " + d);
            } else if (!h.contains(b2)) {
                i3.d.e(b2, "name");
                i3.d.e(d, "value");
                arrayList.add(b2);
                arrayList.add(p3.d.E0(d).toString());
            }
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        t3.r rVar = new t3.r();
        rVar.f3511b = pVar;
        rVar.f3512c = dVar.f1321b;
        rVar.d = (String) dVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        q3.a aVar = new q3.a(5);
        ArrayList arrayList2 = (ArrayList) aVar.f3172a;
        i3.d.e(arrayList2, "<this>");
        i3.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        i3.d.d(asList, "asList(...)");
        arrayList2.addAll(asList);
        rVar.f3514f = aVar;
        if (z4 && rVar.f3512c == 100) {
            return null;
        }
        return rVar;
    }

    @Override // y3.d
    public final void f(t3.q qVar) {
        int i;
        z zVar;
        if (this.d != null) {
            return;
        }
        qVar.getClass();
        t3.j jVar = qVar.f3508c;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new c(c.f146f, qVar.f3507b));
        g4.i iVar = c.f147g;
        t3.k kVar = qVar.f3506a;
        i3.d.e(kVar, "url");
        String b2 = kVar.b();
        String d = kVar.d();
        if (d != null) {
            b2 = b2 + '?' + d;
        }
        arrayList.add(new c(iVar, b2));
        String a5 = qVar.f3508c.a("Host");
        if (a5 != null) {
            arrayList.add(new c(c.i, a5));
        }
        arrayList.add(new c(c.h, kVar.f3455a));
        int size = jVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            String b5 = jVar.b(i4);
            Locale locale = Locale.US;
            i3.d.d(locale, "US");
            String lowerCase = b5.toLowerCase(locale);
            i3.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f219g.contains(lowerCase) || (lowerCase.equals("te") && i3.d.a(jVar.d(i4), "trailers"))) {
                arrayList.add(new c(lowerCase, jVar.d(i4)));
            }
        }
        r rVar = this.f222c;
        rVar.getClass();
        boolean z4 = !false;
        synchronized (rVar.B) {
            synchronized (rVar) {
                try {
                    if (rVar.f202j > 1073741823) {
                        rVar.p(8);
                    }
                    if (rVar.f203k) {
                        throw new a();
                    }
                    i = rVar.f202j;
                    rVar.f202j = i + 2;
                    zVar = new z(i, rVar, z4, false, null);
                    if (zVar.g()) {
                        rVar.f201g.put(Integer.valueOf(i), zVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.B.q(z4, i, arrayList);
        }
        rVar.B.flush();
        this.d = zVar;
        if (this.f224f) {
            z zVar2 = this.d;
            i3.d.b(zVar2);
            zVar2.e(9);
            throw new IOException("Canceled");
        }
        z zVar3 = this.d;
        i3.d.b(zVar3);
        y yVar = zVar3.f245k;
        long j2 = this.f221b.f4119g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j2);
        z zVar4 = this.d;
        i3.d.b(zVar4);
        zVar4.f246l.g(this.f221b.h);
    }

    @Override // y3.d
    public final x3.l g() {
        return this.f220a;
    }
}
