package p1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public H.e f3419a;

    /* renamed from: b, reason: collision with root package name */
    public r f3420b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f3422e;

    /* renamed from: g, reason: collision with root package name */
    public u f3424g;
    public t h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public t f3425j;

    /* renamed from: k, reason: collision with root package name */
    public long f3426k;

    /* renamed from: l, reason: collision with root package name */
    public long f3427l;

    /* renamed from: m, reason: collision with root package name */
    public t1.e f3428m;

    /* renamed from: c, reason: collision with root package name */
    public int f3421c = -1;

    /* renamed from: f, reason: collision with root package name */
    public g f3423f = new g(1);

    public static void b(String str, t tVar) {
        if (tVar != null) {
            if (tVar.f3434g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (tVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (tVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (tVar.f3435j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final t a() {
        int i = this.f3421c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3421c).toString());
        }
        H.e eVar = this.f3419a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f3420b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new t(eVar, rVar, str, i, this.f3422e, this.f3423f.d(), this.f3424g, this.h, this.i, this.f3425j, this.f3426k, this.f3427l, this.f3428m);
        }
        throw new IllegalStateException("message == null");
    }
}
