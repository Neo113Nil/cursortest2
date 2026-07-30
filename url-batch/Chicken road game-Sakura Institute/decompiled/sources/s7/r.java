package s7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public a2.q f8670a;

    /* renamed from: b, reason: collision with root package name */
    public q f8671b;

    /* renamed from: d, reason: collision with root package name */
    public String f8673d;

    /* renamed from: e, reason: collision with root package name */
    public j f8674e;

    /* renamed from: g, reason: collision with root package name */
    public u f8676g;

    /* renamed from: h, reason: collision with root package name */
    public s f8677h;

    /* renamed from: i, reason: collision with root package name */
    public s f8678i;

    /* renamed from: j, reason: collision with root package name */
    public s f8679j;

    /* renamed from: k, reason: collision with root package name */
    public long f8680k;

    /* renamed from: l, reason: collision with root package name */
    public long f8681l;

    /* renamed from: m, reason: collision with root package name */
    public c0.w f8682m;

    /* renamed from: c, reason: collision with root package name */
    public int f8672c = -1;

    /* renamed from: f, reason: collision with root package name */
    public f1.g f8675f = new f1.g(6);

    public static void b(String str, s sVar) {
        if (sVar != null) {
            if (sVar.f8689l != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (sVar.f8690m != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (sVar.f8691n != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (sVar.f8692o != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final s a() {
        int i7 = this.f8672c;
        if (i7 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f8672c).toString());
        }
        a2.q qVar = this.f8670a;
        if (qVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar2 = this.f8671b;
        if (qVar2 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f8673d;
        if (str != null) {
            return new s(qVar, qVar2, str, i7, this.f8674e, this.f8675f.d(), this.f8676g, this.f8677h, this.f8678i, this.f8679j, this.f8680k, this.f8681l, this.f8682m);
        }
        throw new IllegalStateException("message == null");
    }
}
