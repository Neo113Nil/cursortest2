package G2;

import E.F;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public C0.q f2281a;

    /* renamed from: b, reason: collision with root package name */
    public s f2282b;

    /* renamed from: d, reason: collision with root package name */
    public String f2284d;

    /* renamed from: e, reason: collision with root package name */
    public j f2285e;

    /* renamed from: g, reason: collision with root package name */
    public v f2287g;

    /* renamed from: h, reason: collision with root package name */
    public u f2288h;

    /* renamed from: i, reason: collision with root package name */
    public u f2289i;

    /* renamed from: j, reason: collision with root package name */
    public u f2290j;

    /* renamed from: k, reason: collision with root package name */
    public long f2291k;

    /* renamed from: l, reason: collision with root package name */
    public long f2292l;

    /* renamed from: m, reason: collision with root package name */
    public F f2293m;

    /* renamed from: c, reason: collision with root package name */
    public int f2283c = -1;

    /* renamed from: f, reason: collision with root package name */
    public k f2286f = new k(0);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f2300j != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.f2301k != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.f2302l != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2303m != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i3 = this.f2283c;
        if (i3 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2283c).toString());
        }
        C0.q qVar = this.f2281a;
        if (qVar == null) {
            throw new IllegalStateException("request == null");
        }
        s sVar = this.f2282b;
        if (sVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f2284d;
        if (str != null) {
            return new u(qVar, sVar, str, i3, this.f2285e, this.f2286f.b(), this.f2287g, this.f2288h, this.f2289i, this.f2290j, this.f2291k, this.f2292l, this.f2293m);
        }
        throw new IllegalStateException("message == null");
    }
}
