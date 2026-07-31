package G2;

import E.F;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final C0.q f2294d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2295e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2296f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2297g;

    /* renamed from: h, reason: collision with root package name */
    public final j f2298h;

    /* renamed from: i, reason: collision with root package name */
    public final l f2299i;

    /* renamed from: j, reason: collision with root package name */
    public final v f2300j;

    /* renamed from: k, reason: collision with root package name */
    public final u f2301k;

    /* renamed from: l, reason: collision with root package name */
    public final u f2302l;

    /* renamed from: m, reason: collision with root package name */
    public final u f2303m;

    /* renamed from: n, reason: collision with root package name */
    public final long f2304n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2305o;

    /* renamed from: p, reason: collision with root package name */
    public final F f2306p;

    public u(C0.q qVar, s sVar, String str, int i3, j jVar, l lVar, v vVar, u uVar, u uVar2, u uVar3, long j3, long j4, F f3) {
        f2.j.f(qVar, "request");
        f2.j.f(sVar, "protocol");
        f2.j.f(str, "message");
        this.f2294d = qVar;
        this.f2295e = sVar;
        this.f2296f = str;
        this.f2297g = i3;
        this.f2298h = jVar;
        this.f2299i = lVar;
        this.f2300j = vVar;
        this.f2301k = uVar;
        this.f2302l = uVar2;
        this.f2303m = uVar3;
        this.f2304n = j3;
        this.f2305o = j4;
        this.f2306p = f3;
    }

    public static String a(u uVar, String str) {
        uVar.getClass();
        String b3 = uVar.f2299i.b(str);
        if (b3 == null) {
            return null;
        }
        return b3;
    }

    public final t b() {
        t tVar = new t();
        tVar.f2281a = this.f2294d;
        tVar.f2282b = this.f2295e;
        tVar.f2283c = this.f2297g;
        tVar.f2284d = this.f2296f;
        tVar.f2285e = this.f2298h;
        tVar.f2286f = this.f2299i.d();
        tVar.f2287g = this.f2300j;
        tVar.f2288h = this.f2301k;
        tVar.f2289i = this.f2302l;
        tVar.f2290j = this.f2303m;
        tVar.f2291k = this.f2304n;
        tVar.f2292l = this.f2305o;
        tVar.f2293m = this.f2306p;
        return tVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2300j;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f2295e + ", code=" + this.f2297g + ", message=" + this.f2296f + ", url=" + ((n) this.f2294d.f630c) + '}';
    }
}
