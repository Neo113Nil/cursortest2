package s7;

import java.io.Closeable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final a2.q f8683f;

    /* renamed from: g, reason: collision with root package name */
    public final q f8684g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8685h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8686i;

    /* renamed from: j, reason: collision with root package name */
    public final j f8687j;

    /* renamed from: k, reason: collision with root package name */
    public final k f8688k;

    /* renamed from: l, reason: collision with root package name */
    public final u f8689l;

    /* renamed from: m, reason: collision with root package name */
    public final s f8690m;

    /* renamed from: n, reason: collision with root package name */
    public final s f8691n;

    /* renamed from: o, reason: collision with root package name */
    public final s f8692o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8693p;

    /* renamed from: q, reason: collision with root package name */
    public final long f8694q;

    /* renamed from: r, reason: collision with root package name */
    public final c0.w f8695r;

    public s(a2.q qVar, q qVar2, String str, int i7, j jVar, k kVar, u uVar, s sVar, s sVar2, s sVar3, long j8, long j9, c0.w wVar) {
        r6.k.f(qVar, "request");
        r6.k.f(qVar2, "protocol");
        r6.k.f(str, "message");
        this.f8683f = qVar;
        this.f8684g = qVar2;
        this.f8685h = str;
        this.f8686i = i7;
        this.f8687j = jVar;
        this.f8688k = kVar;
        this.f8689l = uVar;
        this.f8690m = sVar;
        this.f8691n = sVar2;
        this.f8692o = sVar3;
        this.f8693p = j8;
        this.f8694q = j9;
        this.f8695r = wVar;
    }

    public static String b(String str, s sVar) {
        sVar.getClass();
        String a3 = sVar.f8688k.a(str);
        if (a3 == null) {
            return null;
        }
        return a3;
    }

    public final r c() {
        r rVar = new r();
        rVar.f8670a = this.f8683f;
        rVar.f8671b = this.f8684g;
        rVar.f8672c = this.f8686i;
        rVar.f8673d = this.f8685h;
        rVar.f8674e = this.f8687j;
        rVar.f8675f = this.f8688k.m();
        rVar.f8676g = this.f8689l;
        rVar.f8677h = this.f8690m;
        rVar.f8678i = this.f8691n;
        rVar.f8679j = this.f8692o;
        rVar.f8680k = this.f8693p;
        rVar.f8681l = this.f8694q;
        rVar.f8682m = this.f8695r;
        return rVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f8689l;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f8684g + ", code=" + this.f8686i + ", message=" + this.f8685h + ", url=" + ((l) this.f8683f.f436c) + '}';
    }
}
