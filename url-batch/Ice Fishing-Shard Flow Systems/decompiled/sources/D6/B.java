package D6;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public z f412a;

    /* renamed from: b, reason: collision with root package name */
    public x f413b;

    /* renamed from: d, reason: collision with root package name */
    public String f415d;

    /* renamed from: e, reason: collision with root package name */
    public p f416e;

    /* renamed from: h, reason: collision with root package name */
    public T6.v f419h;

    /* renamed from: i, reason: collision with root package name */
    public C f420i;
    public C j;

    /* renamed from: k, reason: collision with root package name */
    public C f421k;

    /* renamed from: l, reason: collision with root package name */
    public long f422l;

    /* renamed from: m, reason: collision with root package name */
    public long f423m;

    /* renamed from: n, reason: collision with root package name */
    public H6.h f424n;

    /* renamed from: c, reason: collision with root package name */
    public int f414c = -1;

    /* renamed from: g, reason: collision with root package name */
    public E f418g = E.f443d;

    /* renamed from: o, reason: collision with root package name */
    public H f425o = H.f455b;

    /* renamed from: f, reason: collision with root package name */
    public C4.d f417f = new C4.d(2);

    public static void b(C c7, String str) {
        if (c7 != null) {
            if (c7.f434q != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c7.f435r != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c7.f436s != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final C a() {
        int i2 = this.f414c;
        if (i2 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f414c).toString());
        }
        z zVar = this.f412a;
        if (zVar == null) {
            throw new IllegalStateException("request == null");
        }
        x xVar = this.f413b;
        if (xVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f415d;
        if (str != null) {
            return new C(zVar, xVar, str, i2, this.f416e, this.f417f.d(), this.f418g, this.f419h, this.f420i, this.j, this.f421k, this.f422l, this.f423m, this.f424n, this.f425o);
        }
        throw new IllegalStateException("message == null");
    }
}
