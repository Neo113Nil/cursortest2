package t3;

import java.io.Closeable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final q f3520f;

    /* renamed from: g, reason: collision with root package name */
    public final p f3521g;
    public final String h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final i f3522j;

    /* renamed from: k, reason: collision with root package name */
    public final j f3523k;

    /* renamed from: l, reason: collision with root package name */
    public final u f3524l;

    /* renamed from: m, reason: collision with root package name */
    public final s f3525m;

    /* renamed from: n, reason: collision with root package name */
    public final s f3526n;

    /* renamed from: o, reason: collision with root package name */
    public final s f3527o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3528p;

    /* renamed from: q, reason: collision with root package name */
    public final long f3529q;

    /* renamed from: r, reason: collision with root package name */
    public final x3.d f3530r;

    public s(q qVar, p pVar, String str, int i, i iVar, j jVar, u uVar, s sVar, s sVar2, s sVar3, long j2, long j4, x3.d dVar) {
        i3.d.e(qVar, "request");
        i3.d.e(pVar, "protocol");
        i3.d.e(str, "message");
        this.f3520f = qVar;
        this.f3521g = pVar;
        this.h = str;
        this.i = i;
        this.f3522j = iVar;
        this.f3523k = jVar;
        this.f3524l = uVar;
        this.f3525m = sVar;
        this.f3526n = sVar2;
        this.f3527o = sVar3;
        this.f3528p = j2;
        this.f3529q = j4;
        this.f3530r = dVar;
    }

    public static String m(String str, s sVar) {
        sVar.getClass();
        String a5 = sVar.f3523k.a(str);
        if (a5 == null) {
            return null;
        }
        return a5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f3524l;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final r n() {
        r rVar = new r();
        rVar.f3510a = this.f3520f;
        rVar.f3511b = this.f3521g;
        rVar.f3512c = this.i;
        rVar.d = this.h;
        rVar.f3513e = this.f3522j;
        rVar.f3514f = this.f3523k.c();
        rVar.f3515g = this.f3524l;
        rVar.h = this.f3525m;
        rVar.i = this.f3526n;
        rVar.f3516j = this.f3527o;
        rVar.f3517k = this.f3528p;
        rVar.f3518l = this.f3529q;
        rVar.f3519m = this.f3530r;
        return rVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3521g + ", code=" + this.i + ", message=" + this.h + ", url=" + this.f3520f.f3506a + '}';
    }
}
