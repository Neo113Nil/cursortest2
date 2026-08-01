package r1;

import l.C0176a0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public J.d f3535a;

    /* renamed from: b, reason: collision with root package name */
    public p f3536b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public i f3538e;

    /* renamed from: g, reason: collision with root package name */
    public s f3540g;
    public r h;
    public r i;

    /* renamed from: j, reason: collision with root package name */
    public r f3541j;

    /* renamed from: k, reason: collision with root package name */
    public long f3542k;

    /* renamed from: l, reason: collision with root package name */
    public long f3543l;

    /* renamed from: m, reason: collision with root package name */
    public v1.e f3544m;

    /* renamed from: c, reason: collision with root package name */
    public int f3537c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0176a0 f3539f = new C0176a0(2);

    public static void b(String str, r rVar) {
        if (rVar != null) {
            if (rVar.f3550g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (rVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (rVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (rVar.f3551j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final r a() {
        int i = this.f3537c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3537c).toString());
        }
        J.d dVar = this.f3535a;
        if (dVar == null) {
            throw new IllegalStateException("request == null");
        }
        p pVar = this.f3536b;
        if (pVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new r(dVar, pVar, str, i, this.f3538e, this.f3539f.g(), this.f3540g, this.h, this.i, this.f3541j, this.f3542k, this.f3543l, this.f3544m);
        }
        throw new IllegalStateException("message == null");
    }
}
