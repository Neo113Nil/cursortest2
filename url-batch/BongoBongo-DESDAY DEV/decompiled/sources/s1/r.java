package s1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final I.d f3702a;

    /* renamed from: b, reason: collision with root package name */
    public final p f3703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3704c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3705e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3706f;

    /* renamed from: g, reason: collision with root package name */
    public final s f3707g;

    /* renamed from: h, reason: collision with root package name */
    public final r f3708h;
    public final r i;

    /* renamed from: j, reason: collision with root package name */
    public final r f3709j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3710k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3711l;

    /* renamed from: m, reason: collision with root package name */
    public final w1.e f3712m;

    public r(I.d dVar, p pVar, String str, int i, i iVar, j jVar, s sVar, r rVar, r rVar2, r rVar3, long j2, long j3, w1.e eVar) {
        h1.d.e(dVar, "request");
        h1.d.e(pVar, "protocol");
        h1.d.e(str, "message");
        this.f3702a = dVar;
        this.f3703b = pVar;
        this.f3704c = str;
        this.d = i;
        this.f3705e = iVar;
        this.f3706f = jVar;
        this.f3707g = sVar;
        this.f3708h = rVar;
        this.i = rVar2;
        this.f3709j = rVar3;
        this.f3710k = j2;
        this.f3711l = j3;
        this.f3712m = eVar;
    }

    public static String g(String str, r rVar) {
        rVar.getClass();
        String a2 = rVar.f3706f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.f3707g;
        if (sVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        sVar.close();
    }

    public final q h() {
        q qVar = new q();
        qVar.f3691a = this.f3702a;
        qVar.f3692b = this.f3703b;
        qVar.f3693c = this.d;
        qVar.d = this.f3704c;
        qVar.f3694e = this.f3705e;
        qVar.f3695f = this.f3706f.c();
        qVar.f3696g = this.f3707g;
        qVar.f3697h = this.f3708h;
        qVar.i = this.i;
        qVar.f3698j = this.f3709j;
        qVar.f3699k = this.f3710k;
        qVar.f3700l = this.f3711l;
        qVar.f3701m = this.f3712m;
        return qVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3703b + ", code=" + this.d + ", message=" + this.f3704c + ", url=" + ((l) this.f3702a.f321c) + '}';
    }
}
