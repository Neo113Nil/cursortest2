package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2500a;

    /* renamed from: b, reason: collision with root package name */
    public final q f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2502c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2503e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2504f;

    /* renamed from: g, reason: collision with root package name */
    public final u f2505g;
    public final t h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final t f2506j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2507k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2508l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2509m;

    public t(H.e eVar, q qVar, String str, int i, j jVar, k kVar, u uVar, t tVar, t tVar2, t tVar3, long j2, long j3, m1.e eVar2) {
        X0.e.e(eVar, "request");
        X0.e.e(qVar, "protocol");
        X0.e.e(str, "message");
        this.f2500a = eVar;
        this.f2501b = qVar;
        this.f2502c = str;
        this.d = i;
        this.f2503e = jVar;
        this.f2504f = kVar;
        this.f2505g = uVar;
        this.h = tVar;
        this.i = tVar2;
        this.f2506j = tVar3;
        this.f2507k = j2;
        this.f2508l = j3;
        this.f2509m = eVar2;
    }

    public static String e(t tVar, String str) {
        tVar.getClass();
        String a2 = tVar.f2504f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f2505g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final s f() {
        s sVar = new s();
        sVar.f2490a = this.f2500a;
        sVar.f2491b = this.f2501b;
        sVar.f2492c = this.d;
        sVar.d = this.f2502c;
        sVar.f2493e = this.f2503e;
        sVar.f2494f = this.f2504f.c();
        sVar.f2495g = this.f2505g;
        sVar.h = this.h;
        sVar.i = this.i;
        sVar.f2496j = this.f2506j;
        sVar.f2497k = this.f2507k;
        sVar.f2498l = this.f2508l;
        sVar.f2499m = this.f2509m;
        return sVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2501b + ", code=" + this.d + ", message=" + this.f2502c + ", url=" + ((m) this.f2500a.f213c) + '}';
    }
}
