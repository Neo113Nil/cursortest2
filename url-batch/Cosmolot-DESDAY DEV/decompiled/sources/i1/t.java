package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2501a;

    /* renamed from: b, reason: collision with root package name */
    public final q f2502b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2503c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2504e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2505f;

    /* renamed from: g, reason: collision with root package name */
    public final u f2506g;
    public final t h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final t f2507j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2508k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2509l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2510m;

    public t(H.e eVar, q qVar, String str, int i, j jVar, k kVar, u uVar, t tVar, t tVar2, t tVar3, long j2, long j3, m1.e eVar2) {
        X0.e.e(eVar, "request");
        X0.e.e(qVar, "protocol");
        X0.e.e(str, "message");
        this.f2501a = eVar;
        this.f2502b = qVar;
        this.f2503c = str;
        this.d = i;
        this.f2504e = jVar;
        this.f2505f = kVar;
        this.f2506g = uVar;
        this.h = tVar;
        this.i = tVar2;
        this.f2507j = tVar3;
        this.f2508k = j2;
        this.f2509l = j3;
        this.f2510m = eVar2;
    }

    public static String e(t tVar, String str) {
        tVar.getClass();
        String a2 = tVar.f2505f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f2506g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final s f() {
        s sVar = new s();
        sVar.f2491a = this.f2501a;
        sVar.f2492b = this.f2502b;
        sVar.f2493c = this.d;
        sVar.d = this.f2503c;
        sVar.f2494e = this.f2504e;
        sVar.f2495f = this.f2505f.c();
        sVar.f2496g = this.f2506g;
        sVar.h = this.h;
        sVar.i = this.i;
        sVar.f2497j = this.f2507j;
        sVar.f2498k = this.f2508k;
        sVar.f2499l = this.f2509l;
        sVar.f2500m = this.f2510m;
        return sVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2502b + ", code=" + this.d + ", message=" + this.f2503c + ", url=" + ((m) this.f2501a.f213c) + '}';
    }
}
