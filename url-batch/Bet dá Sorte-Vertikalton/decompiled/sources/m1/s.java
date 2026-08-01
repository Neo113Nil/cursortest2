package m1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public H.e f3272a;

    /* renamed from: b, reason: collision with root package name */
    public r f3273b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f3275e;

    /* renamed from: g, reason: collision with root package name */
    public u f3277g;
    public t h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public t f3278j;

    /* renamed from: k, reason: collision with root package name */
    public long f3279k;

    /* renamed from: l, reason: collision with root package name */
    public long f3280l;

    /* renamed from: m, reason: collision with root package name */
    public q1.e f3281m;

    /* renamed from: c, reason: collision with root package name */
    public int f3274c = -1;

    /* renamed from: f, reason: collision with root package name */
    public g f3276f = new g(1);

    public static void b(String str, t tVar) {
        if (tVar != null) {
            if (tVar.f3287g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (tVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (tVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (tVar.f3288j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final t a() {
        int i = this.f3274c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3274c).toString());
        }
        H.e eVar = this.f3272a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f3273b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new t(eVar, rVar, str, i, this.f3275e, this.f3276f.d(), this.f3277g, this.h, this.i, this.f3278j, this.f3279k, this.f3280l, this.f3281m);
        }
        throw new IllegalStateException("message == null");
    }
}
