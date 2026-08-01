package i1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2512a;

    /* renamed from: b, reason: collision with root package name */
    public r f2513b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2515e;

    /* renamed from: g, reason: collision with root package name */
    public v f2517g;
    public u h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public u f2518j;

    /* renamed from: k, reason: collision with root package name */
    public long f2519k;

    /* renamed from: l, reason: collision with root package name */
    public long f2520l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2521m;

    /* renamed from: c, reason: collision with root package name */
    public int f2514c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2516f = new B0.d(27);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f2527g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2528j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i = this.f2514c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2514c).toString());
        }
        H.e eVar = this.f2512a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f2513b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new u(eVar, rVar, str, i, this.f2515e, this.f2516f.r(), this.f2517g, this.h, this.i, this.f2518j, this.f2519k, this.f2520l, this.f2521m);
        }
        throw new IllegalStateException("message == null");
    }
}
