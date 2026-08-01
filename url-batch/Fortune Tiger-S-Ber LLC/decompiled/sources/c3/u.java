package c3;

import java.io.Closeable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final s f1141f;
    public final r g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1142i;

    /* renamed from: j, reason: collision with root package name */
    public final j f1143j;

    /* renamed from: k, reason: collision with root package name */
    public final k f1144k;

    /* renamed from: l, reason: collision with root package name */
    public final w f1145l;

    /* renamed from: m, reason: collision with root package name */
    public final u f1146m;

    /* renamed from: n, reason: collision with root package name */
    public final u f1147n;

    /* renamed from: o, reason: collision with root package name */
    public final u f1148o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1149p;

    /* renamed from: q, reason: collision with root package name */
    public final long f1150q;

    /* renamed from: r, reason: collision with root package name */
    public final g3.d f1151r;

    public u(s sVar, r rVar, String str, int i4, j jVar, k kVar, w wVar, u uVar, u uVar2, u uVar3, long j4, long j5, g3.d dVar) {
        u2.c.e(sVar, "request");
        u2.c.e(rVar, "protocol");
        u2.c.e(str, "message");
        this.f1141f = sVar;
        this.g = rVar;
        this.h = str;
        this.f1142i = i4;
        this.f1143j = jVar;
        this.f1144k = kVar;
        this.f1145l = wVar;
        this.f1146m = uVar;
        this.f1147n = uVar2;
        this.f1148o = uVar3;
        this.f1149p = j4;
        this.f1150q = j5;
        this.f1151r = dVar;
    }

    public static String m(u uVar, String str) {
        uVar.getClass();
        String a4 = uVar.f1144k.a(str);
        if (a4 == null) {
            return null;
        }
        return a4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f1145l;
        if (wVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        wVar.close();
    }

    public final t n() {
        t tVar = new t();
        tVar.f1131a = this.f1141f;
        tVar.f1132b = this.g;
        tVar.c = this.f1142i;
        tVar.f1133d = this.h;
        tVar.f1134e = this.f1143j;
        tVar.f1135f = this.f1144k.c();
        tVar.g = this.f1145l;
        tVar.h = this.f1146m;
        tVar.f1136i = this.f1147n;
        tVar.f1137j = this.f1148o;
        tVar.f1138k = this.f1149p;
        tVar.f1139l = this.f1150q;
        tVar.f1140m = this.f1151r;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.g + ", code=" + this.f1142i + ", message=" + this.h + ", url=" + this.f1141f.f1127a + '}';
    }
}
