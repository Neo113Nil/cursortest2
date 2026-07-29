package i1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2491a;

    /* renamed from: b, reason: collision with root package name */
    public q f2492b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2494e;

    /* renamed from: g, reason: collision with root package name */
    public u f2496g;
    public t h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public t f2497j;

    /* renamed from: k, reason: collision with root package name */
    public long f2498k;

    /* renamed from: l, reason: collision with root package name */
    public long f2499l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2500m;

    /* renamed from: c, reason: collision with root package name */
    public int f2493c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2495f = new B0.d(27);

    public static void b(t tVar, String str) {
        if (tVar != null) {
            if (tVar.f2506g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (tVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (tVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (tVar.f2507j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final t a() {
        int i = this.f2493c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2493c).toString());
        }
        H.e eVar = this.f2491a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f2492b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new t(eVar, qVar, str, i, this.f2494e, this.f2495f.r(), this.f2496g, this.h, this.i, this.f2497j, this.f2498k, this.f2499l, this.f2500m);
        }
        throw new IllegalStateException("message == null");
    }
}
