package i1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public w f2781a;

    /* renamed from: b, reason: collision with root package name */
    public v f2782b;

    /* renamed from: d, reason: collision with root package name */
    public String f2784d;

    /* renamed from: e, reason: collision with root package name */
    public l f2785e;

    /* renamed from: g, reason: collision with root package name */
    public z f2787g;
    public y h;
    public y i;

    /* renamed from: j, reason: collision with root package name */
    public y f2788j;

    /* renamed from: k, reason: collision with root package name */
    public long f2789k;

    /* renamed from: l, reason: collision with root package name */
    public long f2790l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2791m;

    /* renamed from: c, reason: collision with root package name */
    public int f2783c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2786f = new B0.d(26);

    public static void b(y yVar, String str) {
        if (yVar != null) {
            if (yVar.f2798g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (yVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (yVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (yVar.f2799j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final y a() {
        int i = this.f2783c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2783c).toString());
        }
        w wVar = this.f2781a;
        if (wVar == null) {
            throw new IllegalStateException("request == null");
        }
        v vVar = this.f2782b;
        if (vVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f2784d;
        if (str != null) {
            return new y(wVar, vVar, str, i, this.f2785e, this.f2786f.t(), this.f2787g, this.h, this.i, this.f2788j, this.f2789k, this.f2790l, this.f2791m);
        }
        throw new IllegalStateException("message == null");
    }
}
