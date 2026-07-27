package a5;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements Y4.g {

    /* renamed from: g, reason: collision with root package name */
    public static final List f4013g = U4.e.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h, reason: collision with root package name */
    public static final List f4014h = U4.e.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final X4.s f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4.i f4016b;

    /* renamed from: c, reason: collision with root package name */
    public final t f4017c;

    /* renamed from: d, reason: collision with root package name */
    public volatile B f4018d;

    /* renamed from: e, reason: collision with root package name */
    public final T4.v f4019e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4020f;

    public u(T4.u client, X4.s sVar, Y4.i iVar, t http2Connection) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(http2Connection, "http2Connection");
        this.f4015a = sVar;
        this.f4016b = iVar;
        this.f4017c = http2Connection;
        T4.v vVar = T4.v.f2990g;
        this.f4019e = client.f2977r.contains(vVar) ? vVar : T4.v.f2989f;
    }

    @Override // Y4.g
    public final void a(M0.e eVar) {
        int i2;
        B b6;
        if (this.f4018d != null) {
            return;
        }
        boolean z = true;
        boolean z5 = ((T4.x) eVar.f1786f) != null;
        T4.o oVar = (T4.o) eVar.f1785e;
        ArrayList arrayList = new ArrayList(oVar.size() + 4);
        arrayList.add(new C0202d(C0202d.f3928f, (String) eVar.f1784d));
        j5.i iVar = C0202d.f3929g;
        T4.q url = (T4.q) eVar.f1783c;
        kotlin.jvm.internal.i.e(url, "url");
        String b7 = url.b();
        String d6 = url.d();
        if (d6 != null) {
            b7 = b7 + '?' + d6;
        }
        arrayList.add(new C0202d(iVar, b7));
        String c2 = ((T4.o) eVar.f1785e).c("Host");
        if (c2 != null) {
            arrayList.add(new C0202d(C0202d.f3931i, c2));
        }
        arrayList.add(new C0202d(C0202d.f3930h, url.f2923a));
        int size = oVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            String d7 = oVar.d(i3);
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = d7.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            if (!f4013g.contains(lowerCase) || (lowerCase.equals("te") && oVar.f(i3).equals("trailers"))) {
                arrayList.add(new C0202d(lowerCase, oVar.f(i3)));
            }
        }
        t tVar = this.f4017c;
        tVar.getClass();
        boolean z6 = !z5;
        synchronized (tVar.f4011x) {
            synchronized (tVar) {
                try {
                    if (tVar.f3992e > 1073741823) {
                        tVar.g(EnumC0200b.f3921g);
                    }
                    if (tVar.f3993f) {
                        throw new C0199a();
                    }
                    i2 = tVar.f3992e;
                    tVar.f3992e = i2 + 2;
                    b6 = new B(i2, tVar, z6, false, null);
                    if (z5 && tVar.f4008u < tVar.f4009v && b6.f3893d < b6.f3894e) {
                        z = false;
                    }
                    if (b6.h()) {
                        tVar.f3989b.put(Integer.valueOf(i2), b6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            tVar.f4011x.o(z6, i2, arrayList);
        }
        if (z) {
            tVar.f4011x.flush();
        }
        this.f4018d = b6;
        if (this.f4020f) {
            B b8 = this.f4018d;
            kotlin.jvm.internal.i.b(b8);
            b8.e(EnumC0200b.f3922h);
            throw new IOException("Canceled");
        }
        B b9 = this.f4018d;
        kotlin.jvm.internal.i.b(b9);
        A a6 = b9.f3899j;
        long j2 = this.f4016b.f3718g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a6.g(j2, timeUnit);
        B b10 = this.f4018d;
        kotlin.jvm.internal.i.b(b10);
        b10.f3900k.g(this.f4016b.f3719h, timeUnit);
    }

    @Override // Y4.g
    public final void b() {
        B b6 = this.f4018d;
        kotlin.jvm.internal.i.b(b6);
        b6.f3898i.close();
    }

    @Override // Y4.g
    public final boolean c() {
        boolean z;
        B b6 = this.f4018d;
        if (b6 == null) {
            return false;
        }
        synchronized (b6) {
            z zVar = b6.f3897h;
            if (zVar.f4036b) {
                if (zVar.f4038d.a()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // Y4.g
    public final void cancel() {
        this.f4020f = true;
        B b6 = this.f4018d;
        if (b6 != null) {
            b6.e(EnumC0200b.f3922h);
        }
    }

    @Override // Y4.g
    public final void d() {
        this.f4017c.flush();
    }

    @Override // Y4.g
    public final j5.v e() {
        B b6 = this.f4018d;
        kotlin.jvm.internal.i.b(b6);
        return b6;
    }

    @Override // Y4.g
    public final long f(T4.z zVar) {
        if (Y4.h.a(zVar)) {
            return U4.e.f(zVar);
        }
        return 0L;
    }

    @Override // Y4.g
    public final Y4.f g() {
        return this.f4015a;
    }

    @Override // Y4.g
    public final j5.w h(T4.z zVar) {
        B b6 = this.f4018d;
        kotlin.jvm.internal.i.b(b6);
        return b6.f3897h;
    }

    @Override // Y4.g
    public final j5.u i(M0.e eVar, long j2) {
        B b6 = this.f4018d;
        kotlin.jvm.internal.i.b(b6);
        return b6.f3898i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // Y4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T4.y j(boolean z) {
        int i2;
        T4.o oVar;
        boolean z5;
        B b6 = this.f4018d;
        if (b6 == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (b6) {
            while (true) {
                i2 = 0;
                if (!b6.f3895f.isEmpty() || b6.f() != null) {
                    break;
                }
                if (!z) {
                    b6.f3891b.getClass();
                    y yVar = b6.f3898i;
                    if (!yVar.f4033c && !yVar.f4031a) {
                        z5 = false;
                    }
                    z5 = true;
                }
                i2 = 1;
                if (i2 != 0) {
                    b6.f3899j.h();
                }
                try {
                    b6.j();
                    if (i2 != 0) {
                        b6.f3899j.l();
                    }
                } catch (Throwable th) {
                    if (i2 != 0) {
                        b6.f3899j.l();
                    }
                    throw th;
                }
            }
            if (b6.f3895f.isEmpty()) {
                IOException iOException = b6.f3902m;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0200b f3 = b6.f();
                kotlin.jvm.internal.i.b(f3);
                throw new G(f3);
            }
            Object removeFirst = b6.f3895f.removeFirst();
            kotlin.jvm.internal.i.d(removeFirst, "removeFirst(...)");
            oVar = (T4.o) removeFirst;
        }
        T4.v protocol = this.f4019e;
        kotlin.jvm.internal.i.e(protocol, "protocol");
        L3.j jVar = new L3.j(3);
        int size = oVar.size();
        B3.d dVar = null;
        while (i2 < size) {
            String d6 = oVar.d(i2);
            String f6 = oVar.f(i2);
            if (d6.equals(":status")) {
                dVar = B0.f.H("HTTP/1.1 ".concat(f6));
            } else if (!f4014h.contains(d6)) {
                B0.f.i(jVar, d6, f6);
            }
            i2++;
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        T4.y yVar2 = new T4.y();
        yVar2.f3001b = protocol;
        yVar2.f3002c = dVar.f276b;
        yVar2.f3003d = (String) dVar.f278d;
        yVar2.f3005f = jVar.d().e();
        if (z && yVar2.f3002c == 100) {
            return null;
        }
        return yVar2;
    }
}
