package X5;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public D0.h f3046a;

    /* renamed from: b, reason: collision with root package name */
    public t f3047b;

    /* renamed from: d, reason: collision with root package name */
    public String f3049d;

    /* renamed from: e, reason: collision with root package name */
    public m f3050e;

    /* renamed from: h, reason: collision with root package name */
    public n6.v f3053h;

    /* renamed from: i, reason: collision with root package name */
    public w f3054i;

    /* renamed from: j, reason: collision with root package name */
    public w f3055j;

    /* renamed from: k, reason: collision with root package name */
    public w f3056k;

    /* renamed from: l, reason: collision with root package name */
    public long f3057l;

    /* renamed from: m, reason: collision with root package name */
    public long f3058m;

    /* renamed from: n, reason: collision with root package name */
    public U.a f3059n;

    /* renamed from: c, reason: collision with root package name */
    public int f3048c = -1;

    /* renamed from: g, reason: collision with root package name */
    public y f3052g = y.f3078f;

    /* renamed from: o, reason: collision with root package name */
    public B f3060o = B.f2877a;

    /* renamed from: f, reason: collision with root package name */
    public Q4.j f3051f = new Q4.j(2);

    public static void b(String str, w wVar) {
        if (wVar != null) {
            if (wVar.f3069n != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (wVar.f3070o != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (wVar.f3071p != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final w a() {
        int i7 = this.f3048c;
        if (i7 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3048c).toString());
        }
        D0.h hVar = this.f3046a;
        if (hVar == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f3047b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f3049d;
        if (str != null) {
            return new w(hVar, tVar, str, i7, this.f3050e, this.f3051f.c(), this.f3052g, this.f3053h, this.f3054i, this.f3055j, this.f3056k, this.f3057l, this.f3058m, this.f3059n, this.f3060o);
        }
        throw new IllegalStateException("message == null");
    }
}
