package s1;

import m.C0202a0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public I.d f3691a;

    /* renamed from: b, reason: collision with root package name */
    public p f3692b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public i f3694e;

    /* renamed from: g, reason: collision with root package name */
    public s f3696g;

    /* renamed from: h, reason: collision with root package name */
    public r f3697h;
    public r i;

    /* renamed from: j, reason: collision with root package name */
    public r f3698j;

    /* renamed from: k, reason: collision with root package name */
    public long f3699k;

    /* renamed from: l, reason: collision with root package name */
    public long f3700l;

    /* renamed from: m, reason: collision with root package name */
    public w1.e f3701m;

    /* renamed from: c, reason: collision with root package name */
    public int f3693c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0202a0 f3695f = new C0202a0(2);

    public static void b(String str, r rVar) {
        if (rVar != null) {
            if (rVar.f3707g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (rVar.f3708h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (rVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (rVar.f3709j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final r a() {
        int i = this.f3693c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3693c).toString());
        }
        I.d dVar = this.f3691a;
        if (dVar == null) {
            throw new IllegalStateException("request == null");
        }
        p pVar = this.f3692b;
        if (pVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new r(dVar, pVar, str, i, this.f3694e, this.f3695f.g(), this.f3696g, this.f3697h, this.i, this.f3698j, this.f3699k, this.f3700l, this.f3701m);
        }
        throw new IllegalStateException("message == null");
    }
}
