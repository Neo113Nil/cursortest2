package o1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f3383a;

    /* renamed from: b, reason: collision with root package name */
    public final q f3384b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3385c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3386e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3387f;

    /* renamed from: g, reason: collision with root package name */
    public final t f3388g;
    public final s h;
    public final s i;

    /* renamed from: j, reason: collision with root package name */
    public final s f3389j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3390k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3391l;

    /* renamed from: m, reason: collision with root package name */
    public final s1.e f3392m;

    public s(H.e eVar, q qVar, String str, int i, i iVar, j jVar, t tVar, s sVar, s sVar2, s sVar3, long j2, long j3, s1.e eVar2) {
        d1.d.e(eVar, "request");
        d1.d.e(qVar, "protocol");
        d1.d.e(str, "message");
        this.f3383a = eVar;
        this.f3384b = qVar;
        this.f3385c = str;
        this.d = i;
        this.f3386e = iVar;
        this.f3387f = jVar;
        this.f3388g = tVar;
        this.h = sVar;
        this.i = sVar2;
        this.f3389j = sVar3;
        this.f3390k = j2;
        this.f3391l = j3;
        this.f3392m = eVar2;
    }

    public static String g(String str, s sVar) {
        sVar.getClass();
        String a2 = sVar.f3387f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f3388g;
        if (tVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        tVar.close();
    }

    public final r h() {
        r rVar = new r();
        rVar.f3373a = this.f3383a;
        rVar.f3374b = this.f3384b;
        rVar.f3375c = this.d;
        rVar.d = this.f3385c;
        rVar.f3376e = this.f3386e;
        rVar.f3377f = this.f3387f.c();
        rVar.f3378g = this.f3388g;
        rVar.h = this.h;
        rVar.i = this.i;
        rVar.f3379j = this.f3389j;
        rVar.f3380k = this.f3390k;
        rVar.f3381l = this.f3391l;
        rVar.f3382m = this.f3392m;
        return rVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3384b + ", code=" + this.d + ", message=" + this.f3385c + ", url=" + ((l) this.f3383a.f261c) + '}';
    }
}
