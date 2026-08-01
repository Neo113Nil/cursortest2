package m1;

import l.C0207a0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public H.e f3239a;

    /* renamed from: b, reason: collision with root package name */
    public q f3240b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public i f3242e;

    /* renamed from: g, reason: collision with root package name */
    public t f3244g;
    public s h;
    public s i;

    /* renamed from: j, reason: collision with root package name */
    public s f3245j;

    /* renamed from: k, reason: collision with root package name */
    public long f3246k;

    /* renamed from: l, reason: collision with root package name */
    public long f3247l;

    /* renamed from: m, reason: collision with root package name */
    public q1.e f3248m;

    /* renamed from: c, reason: collision with root package name */
    public int f3241c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0207a0 f3243f = new C0207a0(2);

    public static void b(String str, s sVar) {
        if (sVar != null) {
            if (sVar.f3254g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (sVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (sVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (sVar.f3255j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final s a() {
        int i = this.f3241c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3241c).toString());
        }
        H.e eVar = this.f3239a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f3240b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new s(eVar, qVar, str, i, this.f3242e, this.f3243f.g(), this.f3244g, this.h, this.i, this.f3245j, this.f3246k, this.f3247l, this.f3248m);
        }
        throw new IllegalStateException("message == null");
    }
}
