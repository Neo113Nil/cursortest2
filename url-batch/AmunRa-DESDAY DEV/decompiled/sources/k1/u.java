package k1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2897a;

    /* renamed from: b, reason: collision with root package name */
    public final s f2898b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2899c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final k f2900e;

    /* renamed from: f, reason: collision with root package name */
    public final l f2901f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2902g;
    public final u h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2903j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2904k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2905l;

    /* renamed from: m, reason: collision with root package name */
    public final o1.e f2906m;

    public u(H.e eVar, s sVar, String str, int i, k kVar, l lVar, v vVar, u uVar, u uVar2, u uVar3, long j2, long j3, o1.e eVar2) {
        Z0.d.e(eVar, "request");
        Z0.d.e(sVar, "protocol");
        Z0.d.e(str, "message");
        this.f2897a = eVar;
        this.f2898b = sVar;
        this.f2899c = str;
        this.d = i;
        this.f2900e = kVar;
        this.f2901f = lVar;
        this.f2902g = vVar;
        this.h = uVar;
        this.i = uVar2;
        this.f2903j = uVar3;
        this.f2904k = j2;
        this.f2905l = j3;
        this.f2906m = eVar2;
    }

    public static String f(String str, u uVar) {
        uVar.getClass();
        String a2 = uVar.f2901f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2902g;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final t h() {
        t tVar = new t();
        tVar.f2887a = this.f2897a;
        tVar.f2888b = this.f2898b;
        tVar.f2889c = this.d;
        tVar.d = this.f2899c;
        tVar.f2890e = this.f2900e;
        tVar.f2891f = this.f2901f.c();
        tVar.f2892g = this.f2902g;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.f2893j = this.f2903j;
        tVar.f2894k = this.f2904k;
        tVar.f2895l = this.f2905l;
        tVar.f2896m = this.f2906m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2898b + ", code=" + this.d + ", message=" + this.f2899c + ", url=" + ((n) this.f2897a.f199c) + '}';
    }
}
