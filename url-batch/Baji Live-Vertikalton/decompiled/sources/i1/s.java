package i1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2490a;

    /* renamed from: b, reason: collision with root package name */
    public q f2491b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2493e;

    /* renamed from: g, reason: collision with root package name */
    public u f2495g;
    public t h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public t f2496j;

    /* renamed from: k, reason: collision with root package name */
    public long f2497k;

    /* renamed from: l, reason: collision with root package name */
    public long f2498l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2499m;

    /* renamed from: c, reason: collision with root package name */
    public int f2492c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2494f = new B0.d(27);

    public static void b(t tVar, String str) {
        if (tVar != null) {
            if (tVar.f2505g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (tVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (tVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (tVar.f2506j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final t a() {
        int i = this.f2492c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2492c).toString());
        }
        H.e eVar = this.f2490a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f2491b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new t(eVar, qVar, str, i, this.f2493e, this.f2494f.r(), this.f2495g, this.h, this.i, this.f2496j, this.f2497k, this.f2498l, this.f2499m);
        }
        throw new IllegalStateException("message == null");
    }
}
