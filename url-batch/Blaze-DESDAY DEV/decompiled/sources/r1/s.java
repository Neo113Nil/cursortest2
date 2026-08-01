package r1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public H.e f3519a;

    /* renamed from: b, reason: collision with root package name */
    public r f3520b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f3522e;

    /* renamed from: g, reason: collision with root package name */
    public u f3524g;
    public t h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public t f3525j;

    /* renamed from: k, reason: collision with root package name */
    public long f3526k;

    /* renamed from: l, reason: collision with root package name */
    public long f3527l;

    /* renamed from: m, reason: collision with root package name */
    public v1.e f3528m;

    /* renamed from: c, reason: collision with root package name */
    public int f3521c = -1;

    /* renamed from: f, reason: collision with root package name */
    public g f3523f = new g(1);

    public static void b(String str, t tVar) {
        if (tVar != null) {
            if (tVar.f3534g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (tVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (tVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (tVar.f3535j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final t a() {
        int i = this.f3521c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3521c).toString());
        }
        H.e eVar = this.f3519a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f3520b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new t(eVar, rVar, str, i, this.f3522e, this.f3523f.d(), this.f3524g, this.h, this.i, this.f3525j, this.f3526k, this.f3527l, this.f3528m);
        }
        throw new IllegalStateException("message == null");
    }
}
