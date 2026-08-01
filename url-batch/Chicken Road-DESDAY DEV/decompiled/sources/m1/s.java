package m1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f3249a;

    /* renamed from: b, reason: collision with root package name */
    public final q f3250b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3251c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3252e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3253f;

    /* renamed from: g, reason: collision with root package name */
    public final t f3254g;
    public final s h;
    public final s i;

    /* renamed from: j, reason: collision with root package name */
    public final s f3255j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3256k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3257l;

    /* renamed from: m, reason: collision with root package name */
    public final q1.e f3258m;

    public s(H.e eVar, q qVar, String str, int i, i iVar, j jVar, t tVar, s sVar, s sVar2, s sVar3, long j2, long j3, q1.e eVar2) {
        b1.d.e(eVar, "request");
        b1.d.e(qVar, "protocol");
        b1.d.e(str, "message");
        this.f3249a = eVar;
        this.f3250b = qVar;
        this.f3251c = str;
        this.d = i;
        this.f3252e = iVar;
        this.f3253f = jVar;
        this.f3254g = tVar;
        this.h = sVar;
        this.i = sVar2;
        this.f3255j = sVar3;
        this.f3256k = j2;
        this.f3257l = j3;
        this.f3258m = eVar2;
    }

    public static String g(String str, s sVar) {
        sVar.getClass();
        String a2 = sVar.f3253f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f3254g;
        if (tVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        tVar.close();
    }

    public final r h() {
        r rVar = new r();
        rVar.f3239a = this.f3249a;
        rVar.f3240b = this.f3250b;
        rVar.f3241c = this.d;
        rVar.d = this.f3251c;
        rVar.f3242e = this.f3252e;
        rVar.f3243f = this.f3253f.c();
        rVar.f3244g = this.f3254g;
        rVar.h = this.h;
        rVar.i = this.i;
        rVar.f3245j = this.f3255j;
        rVar.f3246k = this.f3256k;
        rVar.f3247l = this.f3257l;
        rVar.f3248m = this.f3258m;
        return rVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3250b + ", code=" + this.d + ", message=" + this.f3251c + ", url=" + ((l) this.f3249a.f206c) + '}';
    }
}
