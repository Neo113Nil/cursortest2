package p1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f3429a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3431c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3432e;

    /* renamed from: f, reason: collision with root package name */
    public final k f3433f;

    /* renamed from: g, reason: collision with root package name */
    public final u f3434g;
    public final t h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3435j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3436k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3437l;

    /* renamed from: m, reason: collision with root package name */
    public final t1.e f3438m;

    public t(H.e eVar, r rVar, String str, int i, j jVar, k kVar, u uVar, t tVar, t tVar2, t tVar3, long j2, long j3, t1.e eVar2) {
        e1.d.e(eVar, "request");
        e1.d.e(rVar, "protocol");
        e1.d.e(str, "message");
        this.f3429a = eVar;
        this.f3430b = rVar;
        this.f3431c = str;
        this.d = i;
        this.f3432e = jVar;
        this.f3433f = kVar;
        this.f3434g = uVar;
        this.h = tVar;
        this.i = tVar2;
        this.f3435j = tVar3;
        this.f3436k = j2;
        this.f3437l = j3;
        this.f3438m = eVar2;
    }

    public static String g(String str, t tVar) {
        tVar.getClass();
        String a2 = tVar.f3433f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f3434g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final s h() {
        s sVar = new s();
        sVar.f3419a = this.f3429a;
        sVar.f3420b = this.f3430b;
        sVar.f3421c = this.d;
        sVar.d = this.f3431c;
        sVar.f3422e = this.f3432e;
        sVar.f3423f = this.f3433f.c();
        sVar.f3424g = this.f3434g;
        sVar.h = this.h;
        sVar.i = this.i;
        sVar.f3425j = this.f3435j;
        sVar.f3426k = this.f3436k;
        sVar.f3427l = this.f3437l;
        sVar.f3428m = this.f3438m;
        return sVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3430b + ", code=" + this.d + ", message=" + this.f3431c + ", url=" + ((m) this.f3429a.f259c) + '}';
    }
}
