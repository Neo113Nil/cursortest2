package z1;

import n.C0288n;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public J.d f4934a;

    /* renamed from: b, reason: collision with root package name */
    public t f4935b;

    /* renamed from: d, reason: collision with root package name */
    public String f4937d;
    public l e;

    /* renamed from: g, reason: collision with root package name */
    public E1.h f4939g;

    /* renamed from: h, reason: collision with root package name */
    public v f4940h;
    public v i;
    public v j;

    /* renamed from: k, reason: collision with root package name */
    public long f4941k;

    /* renamed from: l, reason: collision with root package name */
    public long f4942l;

    /* renamed from: m, reason: collision with root package name */
    public D1.e f4943m;

    /* renamed from: c, reason: collision with root package name */
    public int f4936c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0288n f4938f = new C0288n(8);

    public static void b(String str, v vVar) {
        if (vVar != null) {
            if (vVar.f4949g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (vVar.f4950h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (vVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (vVar.j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final v a() {
        int i = this.f4936c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f4936c).toString());
        }
        J.d dVar = this.f4934a;
        if (dVar == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f4935b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f4937d;
        if (str != null) {
            return new v(dVar, tVar, str, i, this.e, this.f4938f.i(), this.f4939g, this.f4940h, this.i, this.j, this.f4941k, this.f4942l, this.f4943m);
        }
        throw new IllegalStateException("message == null");
    }
}
