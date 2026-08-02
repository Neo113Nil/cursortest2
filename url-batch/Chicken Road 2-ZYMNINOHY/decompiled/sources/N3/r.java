package N3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class r implements L3.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f1902g = H3.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f1903h = H3.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final K3.k f1904a;

    /* renamed from: b, reason: collision with root package name */
    public final L3.g f1905b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1906c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f1907d;

    /* renamed from: e, reason: collision with root package name */
    public final G3.t f1908e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1909f;

    public r(G3.s client, K3.k kVar, L3.g gVar, q http2Connection) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(http2Connection, "http2Connection");
        this.f1904a = kVar;
        this.f1905b = gVar;
        this.f1906c = http2Connection;
        List list = client.f992r;
        G3.t tVar = G3.t.H2_PRIOR_KNOWLEDGE;
        this.f1908e = list.contains(tVar) ? tVar : G3.t.HTTP_2;
    }

    @Override // L3.e
    public final void a() {
        y yVar = this.f1907d;
        kotlin.jvm.internal.i.b(yVar);
        yVar.g().close();
    }

    @Override // L3.e
    public final G3.x b(boolean z) {
        G3.n nVar;
        y yVar = this.f1907d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f1941k.h();
            while (yVar.f1937g.isEmpty() && yVar.f1943m == null) {
                try {
                    try {
                        yVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    yVar.f1941k.k();
                    throw th;
                }
            }
            yVar.f1941k.k();
            if (yVar.f1937g.isEmpty()) {
                IOException iOException = yVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0078b enumC0078b = yVar.f1943m;
                kotlin.jvm.internal.i.b(enumC0078b);
                throw new E(enumC0078b);
            }
            Object removeFirst = yVar.f1937g.removeFirst();
            kotlin.jvm.internal.i.d(removeFirst, "headersQueue.removeFirst()");
            nVar = (G3.n) removeFirst;
        }
        G3.t protocol = this.f1908e;
        kotlin.jvm.internal.i.e(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = nVar.size();
        L3.h hVar = null;
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            String name = nVar.c(i4);
            String value = nVar.e(i4);
            if (kotlin.jvm.internal.i.a(name, ":status")) {
                hVar = O3.d.s(kotlin.jvm.internal.i.h(value, "HTTP/1.1 "));
            } else if (!f1903h.contains(name)) {
                kotlin.jvm.internal.i.e(name, "name");
                kotlin.jvm.internal.i.e(value, "value");
                arrayList.add(name);
                arrayList.add(AbstractC1510g.r0(value).toString());
            }
            i4 = i5;
        }
        if (hVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        G3.x xVar = new G3.x();
        xVar.f1021b = protocol;
        xVar.f1022c = hVar.f1680b;
        xVar.f1023d = (String) hVar.f1681c;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        G3.m mVar = new G3.m(0);
        d3.o.a0(mVar.f936a, (String[]) array);
        xVar.f1025f = mVar;
        if (z && xVar.f1022c == 100) {
            return null;
        }
        return xVar;
    }

    @Override // L3.e
    public final K3.k c() {
        return this.f1904a;
    }

    @Override // L3.e
    public final void cancel() {
        this.f1909f = true;
        y yVar = this.f1907d;
        if (yVar == null) {
            return;
        }
        yVar.e(EnumC0078b.CANCEL);
    }

    @Override // L3.e
    public final T3.v d(G3.y yVar) {
        y yVar2 = this.f1907d;
        kotlin.jvm.internal.i.b(yVar2);
        return yVar2.f1939i;
    }

    @Override // L3.e
    public final T3.t e(G3.v vVar, long j4) {
        y yVar = this.f1907d;
        kotlin.jvm.internal.i.b(yVar);
        return yVar.g();
    }

    @Override // L3.e
    public final void f() {
        this.f1906c.flush();
    }

    @Override // L3.e
    public final long g(G3.y yVar) {
        if (L3.f.a(yVar)) {
            return H3.b.i(yVar);
        }
        return 0L;
    }

    @Override // L3.e
    public final void h(G3.v vVar) {
        int i4;
        y yVar;
        boolean z;
        if (this.f1907d != null) {
            return;
        }
        boolean z4 = vVar.f1015d != null;
        G3.n nVar = vVar.f1014c;
        ArrayList arrayList = new ArrayList(nVar.size() + 4);
        arrayList.add(new C0079c(C0079c.f1830f, vVar.f1013b));
        T3.j jVar = C0079c.f1831g;
        G3.p url = vVar.f1012a;
        kotlin.jvm.internal.i.e(url, "url");
        String b4 = url.b();
        String d4 = url.d();
        if (d4 != null) {
            b4 = b4 + '?' + ((Object) d4);
        }
        arrayList.add(new C0079c(jVar, b4));
        String b5 = vVar.f1014c.b("Host");
        if (b5 != null) {
            arrayList.add(new C0079c(C0079c.f1833i, b5));
        }
        arrayList.add(new C0079c(C0079c.f1832h, url.f947a));
        int size = nVar.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            String c4 = nVar.c(i5);
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = c4.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f1902g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.i.a(nVar.e(i5), "trailers"))) {
                arrayList.add(new C0079c(lowerCase, nVar.e(i5)));
            }
            i5 = i6;
        }
        q qVar = this.f1906c;
        qVar.getClass();
        boolean z5 = !z4;
        synchronized (qVar.f1899w) {
            synchronized (qVar) {
                try {
                    if (qVar.f1884e > 1073741823) {
                        qVar.k(EnumC0078b.REFUSED_STREAM);
                    }
                    if (qVar.f1885f) {
                        throw new C0077a();
                    }
                    i4 = qVar.f1884e;
                    qVar.f1884e = i4 + 2;
                    yVar = new y(i4, qVar, z5, false, null);
                    z = !z4 || qVar.f1897t >= qVar.f1898u || yVar.f1935e >= yVar.f1936f;
                    if (yVar.i()) {
                        qVar.f1881b.put(Integer.valueOf(i4), yVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qVar.f1899w.k(z5, i4, arrayList);
        }
        if (z) {
            qVar.f1899w.flush();
        }
        this.f1907d = yVar;
        if (this.f1909f) {
            y yVar2 = this.f1907d;
            kotlin.jvm.internal.i.b(yVar2);
            yVar2.e(EnumC0078b.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f1907d;
        kotlin.jvm.internal.i.b(yVar3);
        x xVar = yVar3.f1941k;
        long j4 = this.f1905b.f1676g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j4);
        y yVar4 = this.f1907d;
        kotlin.jvm.internal.i.b(yVar4);
        yVar4.f1942l.g(this.f1905b.f1677h);
    }
}
