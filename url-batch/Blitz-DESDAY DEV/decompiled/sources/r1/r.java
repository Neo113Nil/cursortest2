package r1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final J.d f3545a;

    /* renamed from: b, reason: collision with root package name */
    public final p f3546b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3547c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3548e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3549f;

    /* renamed from: g, reason: collision with root package name */
    public final s f3550g;
    public final r h;
    public final r i;

    /* renamed from: j, reason: collision with root package name */
    public final r f3551j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3552k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3553l;

    /* renamed from: m, reason: collision with root package name */
    public final v1.e f3554m;

    public r(J.d dVar, p pVar, String str, int i, i iVar, j jVar, s sVar, r rVar, r rVar2, r rVar3, long j2, long j3, v1.e eVar) {
        g1.d.e(dVar, "request");
        g1.d.e(pVar, "protocol");
        g1.d.e(str, "message");
        this.f3545a = dVar;
        this.f3546b = pVar;
        this.f3547c = str;
        this.d = i;
        this.f3548e = iVar;
        this.f3549f = jVar;
        this.f3550g = sVar;
        this.h = rVar;
        this.i = rVar2;
        this.f3551j = rVar3;
        this.f3552k = j2;
        this.f3553l = j3;
        this.f3554m = eVar;
    }

    public static String g(String str, r rVar) {
        rVar.getClass();
        String a2 = rVar.f3549f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.f3550g;
        if (sVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        sVar.close();
    }

    public final q h() {
        q qVar = new q();
        qVar.f3535a = this.f3545a;
        qVar.f3536b = this.f3546b;
        qVar.f3537c = this.d;
        qVar.d = this.f3547c;
        qVar.f3538e = this.f3548e;
        qVar.f3539f = this.f3549f.c();
        qVar.f3540g = this.f3550g;
        qVar.h = this.h;
        qVar.i = this.i;
        qVar.f3541j = this.f3551j;
        qVar.f3542k = this.f3552k;
        qVar.f3543l = this.f3553l;
        qVar.f3544m = this.f3554m;
        return qVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3546b + ", code=" + this.d + ", message=" + this.f3547c + ", url=" + ((l) this.f3545a.f359c) + '}';
    }
}
