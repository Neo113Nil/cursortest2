package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final q f2507b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2508c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2509e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2510f;

    /* renamed from: g, reason: collision with root package name */
    public final u f2511g;
    public final t h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final t f2512j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2513k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2514l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2515m;

    public t(H.e eVar, q qVar, String str, int i, j jVar, k kVar, u uVar, t tVar, t tVar2, t tVar3, long j2, long j3, m1.e eVar2) {
        X0.d.e(eVar, "request");
        X0.d.e(qVar, "protocol");
        X0.d.e(str, "message");
        this.f2506a = eVar;
        this.f2507b = qVar;
        this.f2508c = str;
        this.d = i;
        this.f2509e = jVar;
        this.f2510f = kVar;
        this.f2511g = uVar;
        this.h = tVar;
        this.i = tVar2;
        this.f2512j = tVar3;
        this.f2513k = j2;
        this.f2514l = j3;
        this.f2515m = eVar2;
    }

    public static String e(t tVar, String str) {
        tVar.getClass();
        String a2 = tVar.f2510f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f2511g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final s f() {
        s sVar = new s();
        sVar.f2496a = this.f2506a;
        sVar.f2497b = this.f2507b;
        sVar.f2498c = this.d;
        sVar.d = this.f2508c;
        sVar.f2499e = this.f2509e;
        sVar.f2500f = this.f2510f.c();
        sVar.f2501g = this.f2511g;
        sVar.h = this.h;
        sVar.i = this.i;
        sVar.f2502j = this.f2512j;
        sVar.f2503k = this.f2513k;
        sVar.f2504l = this.f2514l;
        sVar.f2505m = this.f2515m;
        return sVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2507b + ", code=" + this.d + ", message=" + this.f2508c + ", url=" + ((m) this.f2506a.f213c) + '}';
    }
}
