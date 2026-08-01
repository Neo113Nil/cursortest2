package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2522a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2523b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2524c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2525e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2526f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2527g;
    public final u h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2528j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2529k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2530l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2531m;

    public u(H.e eVar, r rVar, String str, int i, j jVar, k kVar, v vVar, u uVar, u uVar2, u uVar3, long j2, long j3, m1.e eVar2) {
        X0.d.e(eVar, "request");
        X0.d.e(rVar, "protocol");
        X0.d.e(str, "message");
        this.f2522a = eVar;
        this.f2523b = rVar;
        this.f2524c = str;
        this.d = i;
        this.f2525e = jVar;
        this.f2526f = kVar;
        this.f2527g = vVar;
        this.h = uVar;
        this.i = uVar2;
        this.f2528j = uVar3;
        this.f2529k = j2;
        this.f2530l = j3;
        this.f2531m = eVar2;
    }

    public static String e(u uVar, String str) {
        uVar.getClass();
        String a2 = uVar.f2526f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2527g;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final t f() {
        t tVar = new t();
        tVar.f2512a = this.f2522a;
        tVar.f2513b = this.f2523b;
        tVar.f2514c = this.d;
        tVar.d = this.f2524c;
        tVar.f2515e = this.f2525e;
        tVar.f2516f = this.f2526f.c();
        tVar.f2517g = this.f2527g;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.f2518j = this.f2528j;
        tVar.f2519k = this.f2529k;
        tVar.f2520l = this.f2530l;
        tVar.f2521m = this.f2531m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2523b + ", code=" + this.d + ", message=" + this.f2524c + ", url=" + ((m) this.f2522a.f213c) + '}';
    }
}
