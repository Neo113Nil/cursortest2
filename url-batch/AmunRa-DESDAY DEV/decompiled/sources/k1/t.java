package k1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2887a;

    /* renamed from: b, reason: collision with root package name */
    public s f2888b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public k f2890e;

    /* renamed from: g, reason: collision with root package name */
    public v f2892g;
    public u h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public u f2893j;

    /* renamed from: k, reason: collision with root package name */
    public long f2894k;

    /* renamed from: l, reason: collision with root package name */
    public long f2895l;

    /* renamed from: m, reason: collision with root package name */
    public o1.e f2896m;

    /* renamed from: c, reason: collision with root package name */
    public int f2889c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C.g f2891f = new C.g(28);

    public static void b(String str, u uVar) {
        if (uVar != null) {
            if (uVar.f2902g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2903j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i = this.f2889c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2889c).toString());
        }
        H.e eVar = this.f2887a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        s sVar = this.f2888b;
        if (sVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new u(eVar, sVar, str, i, this.f2890e, this.f2891f.t(), this.f2892g, this.h, this.i, this.f2893j, this.f2894k, this.f2895l, this.f2896m);
        }
        throw new IllegalStateException("message == null");
    }
}
