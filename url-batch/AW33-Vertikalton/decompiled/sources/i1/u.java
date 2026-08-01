package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2518a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2519b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2520c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2521e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2522f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2523g;
    public final u h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2524j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2525k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2526l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2527m;

    public u(H.e eVar, r rVar, String str, int i, j jVar, k kVar, v vVar, u uVar, u uVar2, u uVar3, long j2, long j3, m1.e eVar2) {
        X0.e.e(eVar, "request");
        X0.e.e(rVar, "protocol");
        X0.e.e(str, "message");
        this.f2518a = eVar;
        this.f2519b = rVar;
        this.f2520c = str;
        this.d = i;
        this.f2521e = jVar;
        this.f2522f = kVar;
        this.f2523g = vVar;
        this.h = uVar;
        this.i = uVar2;
        this.f2524j = uVar3;
        this.f2525k = j2;
        this.f2526l = j3;
        this.f2527m = eVar2;
    }

    public static String e(u uVar, String str) {
        uVar.getClass();
        String a2 = uVar.f2522f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2523g;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final t f() {
        t tVar = new t();
        tVar.f2508a = this.f2518a;
        tVar.f2509b = this.f2519b;
        tVar.f2510c = this.d;
        tVar.d = this.f2520c;
        tVar.f2511e = this.f2521e;
        tVar.f2512f = this.f2522f.c();
        tVar.f2513g = this.f2523g;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.f2514j = this.f2524j;
        tVar.f2515k = this.f2525k;
        tVar.f2516l = this.f2526l;
        tVar.f2517m = this.f2527m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2519b + ", code=" + this.d + ", message=" + this.f2520c + ", url=" + ((m) this.f2518a.f213c) + '}';
    }
}
