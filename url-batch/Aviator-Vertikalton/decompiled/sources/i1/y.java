package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final w f2792a;

    /* renamed from: b, reason: collision with root package name */
    public final v f2793b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2794c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2795d;

    /* renamed from: e, reason: collision with root package name */
    public final l f2796e;

    /* renamed from: f, reason: collision with root package name */
    public final n f2797f;

    /* renamed from: g, reason: collision with root package name */
    public final z f2798g;
    public final y h;
    public final y i;

    /* renamed from: j, reason: collision with root package name */
    public final y f2799j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2800k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2801l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2802m;

    public y(w wVar, v vVar, String str, int i, l lVar, n nVar, z zVar, y yVar, y yVar2, y yVar3, long j2, long j3, m1.e eVar) {
        X0.f.e(wVar, "request");
        X0.f.e(vVar, "protocol");
        X0.f.e(str, "message");
        this.f2792a = wVar;
        this.f2793b = vVar;
        this.f2794c = str;
        this.f2795d = i;
        this.f2796e = lVar;
        this.f2797f = nVar;
        this.f2798g = zVar;
        this.h = yVar;
        this.i = yVar2;
        this.f2799j = yVar3;
        this.f2800k = j2;
        this.f2801l = j3;
        this.f2802m = eVar;
    }

    public static String g(y yVar, String str) {
        yVar.getClass();
        String a2 = yVar.f2797f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f2798g;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final x h() {
        x xVar = new x();
        xVar.f2781a = this.f2792a;
        xVar.f2782b = this.f2793b;
        xVar.f2783c = this.f2795d;
        xVar.f2784d = this.f2794c;
        xVar.f2785e = this.f2796e;
        xVar.f2786f = this.f2797f.c();
        xVar.f2787g = this.f2798g;
        xVar.h = this.h;
        xVar.i = this.i;
        xVar.f2788j = this.f2799j;
        xVar.f2789k = this.f2800k;
        xVar.f2790l = this.f2801l;
        xVar.f2791m = this.f2802m;
        return xVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2793b + ", code=" + this.f2795d + ", message=" + this.f2794c + ", url=" + this.f2792a.f2776a + '}';
    }
}
