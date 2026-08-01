package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2524b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2525c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2526e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2527f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2528g;
    public final u h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2529j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2530k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2531l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2532m;

    public u(H.e eVar, r rVar, String str, int i, j jVar, k kVar, v vVar, u uVar, u uVar2, u uVar3, long j2, long j3, m1.e eVar2) {
        X0.d.e(eVar, "request");
        X0.d.e(rVar, "protocol");
        X0.d.e(str, "message");
        this.f2523a = eVar;
        this.f2524b = rVar;
        this.f2525c = str;
        this.d = i;
        this.f2526e = jVar;
        this.f2527f = kVar;
        this.f2528g = vVar;
        this.h = uVar;
        this.i = uVar2;
        this.f2529j = uVar3;
        this.f2530k = j2;
        this.f2531l = j3;
        this.f2532m = eVar2;
    }

    public static String e(u uVar, String str) {
        uVar.getClass();
        String a2 = uVar.f2527f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2528g;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final t f() {
        t tVar = new t();
        tVar.f2513a = this.f2523a;
        tVar.f2514b = this.f2524b;
        tVar.f2515c = this.d;
        tVar.d = this.f2525c;
        tVar.f2516e = this.f2526e;
        tVar.f2517f = this.f2527f.c();
        tVar.f2518g = this.f2528g;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.f2519j = this.f2529j;
        tVar.f2520k = this.f2530k;
        tVar.f2521l = this.f2531l;
        tVar.f2522m = this.f2532m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2524b + ", code=" + this.d + ", message=" + this.f2525c + ", url=" + ((m) this.f2523a.f213c) + '}';
    }
}
