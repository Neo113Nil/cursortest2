package i1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2508a;

    /* renamed from: b, reason: collision with root package name */
    public r f2509b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2511e;

    /* renamed from: g, reason: collision with root package name */
    public v f2513g;
    public u h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public u f2514j;

    /* renamed from: k, reason: collision with root package name */
    public long f2515k;

    /* renamed from: l, reason: collision with root package name */
    public long f2516l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2517m;

    /* renamed from: c, reason: collision with root package name */
    public int f2510c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2512f = new B0.d(27);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f2523g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2524j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i = this.f2510c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2510c).toString());
        }
        H.e eVar = this.f2508a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f2509b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new u(eVar, rVar, str, i, this.f2511e, this.f2512f.r(), this.f2513g, this.h, this.i, this.f2514j, this.f2515k, this.f2516l, this.f2517m);
        }
        throw new IllegalStateException("message == null");
    }
}
