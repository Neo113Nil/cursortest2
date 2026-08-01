package m1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f3282a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3283b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3284c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3285e;

    /* renamed from: f, reason: collision with root package name */
    public final k f3286f;

    /* renamed from: g, reason: collision with root package name */
    public final u f3287g;
    public final t h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3288j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3289k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3290l;

    /* renamed from: m, reason: collision with root package name */
    public final q1.e f3291m;

    public t(H.e eVar, r rVar, String str, int i, j jVar, k kVar, u uVar, t tVar, t tVar2, t tVar3, long j2, long j3, q1.e eVar2) {
        b1.d.e(eVar, "request");
        b1.d.e(rVar, "protocol");
        b1.d.e(str, "message");
        this.f3282a = eVar;
        this.f3283b = rVar;
        this.f3284c = str;
        this.d = i;
        this.f3285e = jVar;
        this.f3286f = kVar;
        this.f3287g = uVar;
        this.h = tVar;
        this.i = tVar2;
        this.f3288j = tVar3;
        this.f3289k = j2;
        this.f3290l = j3;
        this.f3291m = eVar2;
    }

    public static String g(String str, t tVar) {
        tVar.getClass();
        String a2 = tVar.f3286f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f3287g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final s h() {
        s sVar = new s();
        sVar.f3272a = this.f3282a;
        sVar.f3273b = this.f3283b;
        sVar.f3274c = this.d;
        sVar.d = this.f3284c;
        sVar.f3275e = this.f3285e;
        sVar.f3276f = this.f3286f.c();
        sVar.f3277g = this.f3287g;
        sVar.h = this.h;
        sVar.i = this.i;
        sVar.f3278j = this.f3288j;
        sVar.f3279k = this.f3289k;
        sVar.f3280l = this.f3290l;
        sVar.f3281m = this.f3291m;
        return sVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3283b + ", code=" + this.d + ", message=" + this.f3284c + ", url=" + ((m) this.f3282a.f275c) + '}';
    }
}
