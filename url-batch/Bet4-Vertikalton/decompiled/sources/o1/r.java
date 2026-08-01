package o1;

import l.Z;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public H.e f3373a;

    /* renamed from: b, reason: collision with root package name */
    public q f3374b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public i f3376e;

    /* renamed from: g, reason: collision with root package name */
    public t f3378g;
    public s h;
    public s i;

    /* renamed from: j, reason: collision with root package name */
    public s f3379j;

    /* renamed from: k, reason: collision with root package name */
    public long f3380k;

    /* renamed from: l, reason: collision with root package name */
    public long f3381l;

    /* renamed from: m, reason: collision with root package name */
    public s1.e f3382m;

    /* renamed from: c, reason: collision with root package name */
    public int f3375c = -1;

    /* renamed from: f, reason: collision with root package name */
    public Z f3377f = new Z(2);

    public static void b(String str, s sVar) {
        if (sVar != null) {
            if (sVar.f3388g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (sVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (sVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (sVar.f3389j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final s a() {
        int i = this.f3375c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3375c).toString());
        }
        H.e eVar = this.f3373a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f3374b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new s(eVar, qVar, str, i, this.f3376e, this.f3377f.g(), this.f3378g, this.h, this.i, this.f3379j, this.f3380k, this.f3381l, this.f3382m);
        }
        throw new IllegalStateException("message == null");
    }
}
