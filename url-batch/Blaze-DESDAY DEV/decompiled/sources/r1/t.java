package r1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f3529a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3530b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3531c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3532e;

    /* renamed from: f, reason: collision with root package name */
    public final k f3533f;

    /* renamed from: g, reason: collision with root package name */
    public final u f3534g;
    public final t h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3535j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3536k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3537l;

    /* renamed from: m, reason: collision with root package name */
    public final v1.e f3538m;

    public t(H.e eVar, r rVar, String str, int i, j jVar, k kVar, u uVar, t tVar, t tVar2, t tVar3, long j2, long j3, v1.e eVar2) {
        g1.d.e(eVar, "request");
        g1.d.e(rVar, "protocol");
        g1.d.e(str, "message");
        this.f3529a = eVar;
        this.f3530b = rVar;
        this.f3531c = str;
        this.d = i;
        this.f3532e = jVar;
        this.f3533f = kVar;
        this.f3534g = uVar;
        this.h = tVar;
        this.i = tVar2;
        this.f3535j = tVar3;
        this.f3536k = j2;
        this.f3537l = j3;
        this.f3538m = eVar2;
    }

    public static String g(String str, t tVar) {
        tVar.getClass();
        String a2 = tVar.f3533f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f3534g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final s h() {
        s sVar = new s();
        sVar.f3519a = this.f3529a;
        sVar.f3520b = this.f3530b;
        sVar.f3521c = this.d;
        sVar.d = this.f3531c;
        sVar.f3522e = this.f3532e;
        sVar.f3523f = this.f3533f.c();
        sVar.f3524g = this.f3534g;
        sVar.h = this.h;
        sVar.i = this.i;
        sVar.f3525j = this.f3535j;
        sVar.f3526k = this.f3536k;
        sVar.f3527l = this.f3537l;
        sVar.f3528m = this.f3538m;
        return sVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3530b + ", code=" + this.d + ", message=" + this.f3531c + ", url=" + ((m) this.f3529a.f278c) + '}';
    }
}
