package i1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public w f2785a;

    /* renamed from: b, reason: collision with root package name */
    public v f2786b;

    /* renamed from: d, reason: collision with root package name */
    public String f2788d;

    /* renamed from: e, reason: collision with root package name */
    public l f2789e;

    /* renamed from: g, reason: collision with root package name */
    public z f2791g;
    public y h;
    public y i;

    /* renamed from: j, reason: collision with root package name */
    public y f2792j;

    /* renamed from: k, reason: collision with root package name */
    public long f2793k;

    /* renamed from: l, reason: collision with root package name */
    public long f2794l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2795m;

    /* renamed from: c, reason: collision with root package name */
    public int f2787c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2790f = new B0.d(24);

    public static void b(y yVar, String str) {
        if (yVar != null) {
            if (yVar.f2802g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (yVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (yVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (yVar.f2803j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final y a() {
        int i = this.f2787c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2787c).toString());
        }
        w wVar = this.f2785a;
        if (wVar == null) {
            throw new IllegalStateException("request == null");
        }
        v vVar = this.f2786b;
        if (vVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f2788d;
        if (str != null) {
            return new y(wVar, vVar, str, i, this.f2789e, this.f2790f.y(), this.f2791g, this.h, this.i, this.f2792j, this.f2793k, this.f2794l, this.f2795m);
        }
        throw new IllegalStateException("message == null");
    }
}
