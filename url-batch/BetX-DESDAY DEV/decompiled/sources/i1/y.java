package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final w f2796a;

    /* renamed from: b, reason: collision with root package name */
    public final v f2797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2799d;

    /* renamed from: e, reason: collision with root package name */
    public final l f2800e;

    /* renamed from: f, reason: collision with root package name */
    public final n f2801f;

    /* renamed from: g, reason: collision with root package name */
    public final z f2802g;
    public final y h;
    public final y i;

    /* renamed from: j, reason: collision with root package name */
    public final y f2803j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2804k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2805l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2806m;

    public y(w wVar, v vVar, String str, int i, l lVar, n nVar, z zVar, y yVar, y yVar2, y yVar3, long j2, long j3, m1.e eVar) {
        X0.f.e(wVar, "request");
        X0.f.e(vVar, "protocol");
        X0.f.e(str, "message");
        this.f2796a = wVar;
        this.f2797b = vVar;
        this.f2798c = str;
        this.f2799d = i;
        this.f2800e = lVar;
        this.f2801f = nVar;
        this.f2802g = zVar;
        this.h = yVar;
        this.i = yVar2;
        this.f2803j = yVar3;
        this.f2804k = j2;
        this.f2805l = j3;
        this.f2806m = eVar;
    }

    public static String g(y yVar, String str) {
        yVar.getClass();
        String a2 = yVar.f2801f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f2802g;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final x h() {
        x xVar = new x();
        xVar.f2785a = this.f2796a;
        xVar.f2786b = this.f2797b;
        xVar.f2787c = this.f2799d;
        xVar.f2788d = this.f2798c;
        xVar.f2789e = this.f2800e;
        xVar.f2790f = this.f2801f.c();
        xVar.f2791g = this.f2802g;
        xVar.h = this.h;
        xVar.i = this.i;
        xVar.f2792j = this.f2803j;
        xVar.f2793k = this.f2804k;
        xVar.f2794l = this.f2805l;
        xVar.f2795m = this.f2806m;
        return xVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2797b + ", code=" + this.f2799d + ", message=" + this.f2798c + ", url=" + this.f2796a.f2780a + '}';
    }
}
