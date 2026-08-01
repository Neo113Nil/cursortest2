package t3;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public q f3510a;

    /* renamed from: b, reason: collision with root package name */
    public p f3511b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public i f3513e;

    /* renamed from: g, reason: collision with root package name */
    public u f3515g;
    public s h;
    public s i;

    /* renamed from: j, reason: collision with root package name */
    public s f3516j;

    /* renamed from: k, reason: collision with root package name */
    public long f3517k;

    /* renamed from: l, reason: collision with root package name */
    public long f3518l;

    /* renamed from: m, reason: collision with root package name */
    public x3.d f3519m;

    /* renamed from: c, reason: collision with root package name */
    public int f3512c = -1;

    /* renamed from: f, reason: collision with root package name */
    public q3.a f3514f = new q3.a(5);

    public static void b(String str, s sVar) {
        if (sVar != null) {
            if (sVar.f3524l != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (sVar.f3525m != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (sVar.f3526n != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (sVar.f3527o != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final s a() {
        int i = this.f3512c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3512c).toString());
        }
        q qVar = this.f3510a;
        if (qVar == null) {
            throw new IllegalStateException("request == null");
        }
        p pVar = this.f3511b;
        if (pVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new s(qVar, pVar, str, i, this.f3513e, this.f3514f.f(), this.f3515g, this.h, this.i, this.f3516j, this.f3517k, this.f3518l, this.f3519m);
        }
        throw new IllegalStateException("message == null");
    }
}
