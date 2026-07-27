package m3;

import C.F;
import G.W0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public A0.q f8460a;

    /* renamed from: b, reason: collision with root package name */
    public t f8461b;

    /* renamed from: d, reason: collision with root package name */
    public String f8463d;

    /* renamed from: e, reason: collision with root package name */
    public k f8464e;

    /* renamed from: g, reason: collision with root package name */
    public x f8466g;

    /* renamed from: h, reason: collision with root package name */
    public w f8467h;

    /* renamed from: i, reason: collision with root package name */
    public w f8468i;

    /* renamed from: j, reason: collision with root package name */
    public w f8469j;

    /* renamed from: k, reason: collision with root package name */
    public long f8470k;

    /* renamed from: l, reason: collision with root package name */
    public long f8471l;

    /* renamed from: m, reason: collision with root package name */
    public F f8472m;

    /* renamed from: c, reason: collision with root package name */
    public int f8462c = -1;

    /* renamed from: f, reason: collision with root package name */
    public W0 f8465f = new W0(4);

    public static void b(String str, w wVar) {
        if (wVar != null) {
            if (wVar.f8479m != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (wVar.f8480n != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (wVar.f8481o != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (wVar.f8482p != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final w a() {
        int i2 = this.f8462c;
        if (i2 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f8462c).toString());
        }
        A0.q qVar = this.f8460a;
        if (qVar == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f8461b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f8463d;
        if (str != null) {
            return new w(qVar, tVar, str, i2, this.f8464e, this.f8465f.b(), this.f8466g, this.f8467h, this.f8468i, this.f8469j, this.f8470k, this.f8471l, this.f8472m);
        }
        throw new IllegalStateException("message == null");
    }
}
