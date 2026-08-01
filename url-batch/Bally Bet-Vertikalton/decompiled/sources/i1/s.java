package i1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2496a;

    /* renamed from: b, reason: collision with root package name */
    public q f2497b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2499e;

    /* renamed from: g, reason: collision with root package name */
    public u f2501g;
    public t h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public t f2502j;

    /* renamed from: k, reason: collision with root package name */
    public long f2503k;

    /* renamed from: l, reason: collision with root package name */
    public long f2504l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2505m;

    /* renamed from: c, reason: collision with root package name */
    public int f2498c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2500f = new B0.d(26);

    public static void b(t tVar, String str) {
        if (tVar != null) {
            if (tVar.f2511g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (tVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (tVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (tVar.f2512j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final t a() {
        int i = this.f2498c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2498c).toString());
        }
        H.e eVar = this.f2496a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f2497b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new t(eVar, qVar, str, i, this.f2499e, this.f2500f.t(), this.f2501g, this.h, this.i, this.f2502j, this.f2503k, this.f2504l, this.f2505m);
        }
        throw new IllegalStateException("message == null");
    }
}
