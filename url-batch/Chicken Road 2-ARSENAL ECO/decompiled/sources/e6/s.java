package e6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class s implements c6.f {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4124g = Y5.e.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h, reason: collision with root package name */
    public static final List f4125h = Y5.e.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final b6.r f4126a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.h f4127b;

    /* renamed from: c, reason: collision with root package name */
    public final r f4128c;

    /* renamed from: d, reason: collision with root package name */
    public volatile z f4129d;

    /* renamed from: e, reason: collision with root package name */
    public final X5.t f4130e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4131f;

    public s(X5.s client, b6.r rVar, c6.h hVar, r http2Connection) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(http2Connection, "http2Connection");
        this.f4126a = rVar;
        this.f4127b = hVar;
        this.f4128c = http2Connection;
        List list = client.f3028r;
        X5.t tVar = X5.t.f3041l;
        this.f4130e = list.contains(tVar) ? tVar : X5.t.f3040k;
    }

    @Override // c6.f
    public final n6.u a(D0.h hVar, long j4) {
        z zVar = this.f4129d;
        kotlin.jvm.internal.i.b(zVar);
        return zVar.f4161n;
    }

    @Override // c6.f
    public final void b(D0.h hVar) {
        int i7;
        z zVar;
        boolean z5;
        if (this.f4129d != null) {
            return;
        }
        boolean z6 = ((X5.u) hVar.f333e) != null;
        X5.n nVar = (X5.n) hVar.f332d;
        ArrayList arrayList = new ArrayList(nVar.size() + 4);
        arrayList.add(new C0358d(C0358d.f4049f, (String) hVar.f330b));
        n6.i iVar = C0358d.f4050g;
        X5.o url = (X5.o) hVar.f331c;
        kotlin.jvm.internal.i.e(url, "url");
        String b7 = url.b();
        String d7 = url.d();
        if (d7 != null) {
            b7 = b7 + '?' + d7;
        }
        arrayList.add(new C0358d(iVar, b7));
        String a7 = ((X5.n) hVar.f332d).a("Host");
        if (a7 != null) {
            arrayList.add(new C0358d(C0358d.f4052i, a7));
        }
        arrayList.add(new C0358d(C0358d.f4051h, url.f2974a));
        int size = nVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            String b8 = nVar.b(i8);
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = b8.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            if (!f4124g.contains(lowerCase) || (lowerCase.equals("te") && nVar.d(i8).equals("trailers"))) {
                arrayList.add(new C0358d(lowerCase, nVar.d(i8)));
            }
        }
        r rVar = this.f4128c;
        rVar.getClass();
        boolean z7 = !z6;
        synchronized (rVar.f4101B) {
            synchronized (rVar) {
                try {
                    if (rVar.f4108j > 1073741823) {
                        rVar.g(EnumC0356b.f4042l);
                    }
                    if (rVar.f4109k) {
                        throw new C0355a();
                    }
                    i7 = rVar.f4108j;
                    rVar.f4108j = i7 + 2;
                    zVar = new z(i7, rVar, z7, false, null);
                    z5 = !z6 || rVar.y >= rVar.f4123z || zVar.f4156i >= zVar.f4157j;
                    if (zVar.j()) {
                        rVar.f4105g.put(Integer.valueOf(i7), zVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.f4101B.h(z7, i7, arrayList);
        }
        if (z5) {
            rVar.f4101B.flush();
        }
        this.f4129d = zVar;
        if (this.f4131f) {
            z zVar2 = this.f4129d;
            kotlin.jvm.internal.i.b(zVar2);
            zVar2.g(EnumC0356b.f4043m);
            throw new IOException("Canceled");
        }
        z zVar3 = this.f4129d;
        kotlin.jvm.internal.i.b(zVar3);
        y yVar = zVar3.f4162o;
        long j4 = this.f4127b.f3832g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j4);
        z zVar4 = this.f4129d;
        kotlin.jvm.internal.i.b(zVar4);
        zVar4.f4163p.g(this.f4127b.f3833h);
    }

    @Override // c6.f
    public final void c() {
        z zVar = this.f4129d;
        kotlin.jvm.internal.i.b(zVar);
        zVar.f4161n.close();
    }

    @Override // c6.f
    public final void cancel() {
        this.f4131f = true;
        z zVar = this.f4129d;
        if (zVar != null) {
            zVar.g(EnumC0356b.f4043m);
        }
    }

    @Override // c6.f
    public final boolean d() {
        boolean z5;
        z zVar = this.f4129d;
        if (zVar == null) {
            return false;
        }
        synchronized (zVar) {
            x xVar = zVar.f4160m;
            if (xVar.f4147g) {
                if (xVar.f4149i.d()) {
                    z5 = true;
                }
            }
            z5 = false;
        }
        return z5;
    }

    @Override // c6.f
    public final void e() {
        this.f4128c.flush();
    }

    @Override // c6.f
    public final n6.v f() {
        z zVar = this.f4129d;
        kotlin.jvm.internal.i.b(zVar);
        return zVar;
    }

    @Override // c6.f
    public final c6.e g() {
        return this.f4126a;
    }

    @Override // c6.f
    public final long h(X5.w wVar) {
        if (c6.g.a(wVar)) {
            return Y5.e.e(wVar);
        }
        return 0L;
    }

    @Override // c6.f
    public final n6.w i(X5.w wVar) {
        z zVar = this.f4129d;
        kotlin.jvm.internal.i.b(zVar);
        return zVar.f4160m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // c6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final X5.v j(boolean z5) {
        X5.n nVar;
        z zVar = this.f4129d;
        if (zVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (zVar) {
            while (true) {
                boolean z6 = false;
                if (!zVar.f4158k.isEmpty() || zVar.h() != null) {
                    break;
                }
                if (!z5) {
                    zVar.f4154g.getClass();
                    w wVar = zVar.f4161n;
                }
                z6 = true;
                if (z6) {
                    zVar.f4162o.h();
                }
                try {
                    try {
                        zVar.wait();
                        if (z6) {
                            zVar.f4162o.l();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z6) {
                        zVar.f4162o.l();
                    }
                    throw th;
                }
            }
            if (zVar.f4158k.isEmpty()) {
                IOException iOException = zVar.f4165r;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0356b h7 = zVar.h();
                kotlin.jvm.internal.i.b(h7);
                throw new E(h7);
            }
            Object removeFirst = zVar.f4158k.removeFirst();
            kotlin.jvm.internal.i.d(removeFirst, "removeFirst(...)");
            nVar = (X5.n) removeFirst;
        }
        X5.t protocol = this.f4130e;
        kotlin.jvm.internal.i.e(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = nVar.size();
        D1.b bVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            String b7 = nVar.b(i7);
            String d7 = nVar.d(i7);
            if (b7.equals(":status")) {
                bVar = AbstractC0676f.p("HTTP/1.1 ".concat(d7));
            } else if (!f4125h.contains(b7)) {
                arrayList.add(b7);
                arrayList.add(F5.j.h0(d7).toString());
            }
        }
        if (bVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        X5.v vVar = new X5.v();
        vVar.f3047b = protocol;
        vVar.f3048c = bVar.f368b;
        vVar.f3049d = (String) bVar.f369c;
        vVar.f3051f = new X5.n((String[]) arrayList.toArray(new String[0])).c();
        if (z5 && vVar.f3048c == 100) {
            return null;
        }
        return vVar;
    }
}
