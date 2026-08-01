package i1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2513a;

    /* renamed from: b, reason: collision with root package name */
    public r f2514b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2516e;

    /* renamed from: g, reason: collision with root package name */
    public v f2518g;
    public u h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public u f2519j;

    /* renamed from: k, reason: collision with root package name */
    public long f2520k;

    /* renamed from: l, reason: collision with root package name */
    public long f2521l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2522m;

    /* renamed from: c, reason: collision with root package name */
    public int f2515c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2517f = new B0.d(27);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f2528g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2529j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i = this.f2515c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2515c).toString());
        }
        H.e eVar = this.f2513a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f2514b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new u(eVar, rVar, str, i, this.f2516e, this.f2517f.r(), this.f2518g, this.h, this.i, this.f2519j, this.f2520k, this.f2521l, this.f2522m);
        }
        throw new IllegalStateException("message == null");
    }
}
