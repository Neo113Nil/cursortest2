package z1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final J.d f4944a;

    /* renamed from: b, reason: collision with root package name */
    public final t f4945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4946c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4947d;
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final m f4948f;

    /* renamed from: g, reason: collision with root package name */
    public final E1.h f4949g;

    /* renamed from: h, reason: collision with root package name */
    public final v f4950h;
    public final v i;
    public final v j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4951k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4952l;

    /* renamed from: m, reason: collision with root package name */
    public final D1.e f4953m;

    public v(J.d dVar, t tVar, String str, int i, l lVar, m mVar, E1.h hVar, v vVar, v vVar2, v vVar3, long j, long j2, D1.e eVar) {
        j1.h.e(dVar, "request");
        j1.h.e(tVar, "protocol");
        j1.h.e(str, "message");
        this.f4944a = dVar;
        this.f4945b = tVar;
        this.f4946c = str;
        this.f4947d = i;
        this.e = lVar;
        this.f4948f = mVar;
        this.f4949g = hVar;
        this.f4950h = vVar;
        this.i = vVar2;
        this.j = vVar3;
        this.f4951k = j;
        this.f4952l = j2;
        this.f4953m = eVar;
    }

    public static String a(String str, v vVar) {
        vVar.getClass();
        String a2 = vVar.f4948f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        E1.h hVar = this.f4949g;
        if (hVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        hVar.close();
    }

    public final u d() {
        u uVar = new u();
        uVar.f4934a = this.f4944a;
        uVar.f4935b = this.f4945b;
        uVar.f4936c = this.f4947d;
        uVar.f4937d = this.f4946c;
        uVar.e = this.e;
        uVar.f4938f = this.f4948f.c();
        uVar.f4939g = this.f4949g;
        uVar.f4940h = this.f4950h;
        uVar.i = this.i;
        uVar.j = this.j;
        uVar.f4941k = this.f4951k;
        uVar.f4942l = this.f4952l;
        uVar.f4943m = this.f4953m;
        return uVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f4945b + ", code=" + this.f4947d + ", message=" + this.f4946c + ", url=" + ((o) this.f4944a.f626c) + '}';
    }
}
