package z1;

import k.C0191o;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public H.e f4749a;

    /* renamed from: b, reason: collision with root package name */
    public q f4750b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public i f4752e;

    /* renamed from: g, reason: collision with root package name */
    public E1.h f4754g;
    public s h;
    public s i;

    /* renamed from: j, reason: collision with root package name */
    public s f4755j;

    /* renamed from: k, reason: collision with root package name */
    public long f4756k;

    /* renamed from: l, reason: collision with root package name */
    public long f4757l;

    /* renamed from: m, reason: collision with root package name */
    public D1.e f4758m;

    /* renamed from: c, reason: collision with root package name */
    public int f4751c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0191o f4753f = new C0191o(7);

    public static void b(String str, s sVar) {
        if (sVar != null) {
            if (sVar.f4764g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (sVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (sVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (sVar.f4765j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final s a() {
        int i = this.f4751c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f4751c).toString());
        }
        H.e eVar = this.f4749a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f4750b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new s(eVar, qVar, str, i, this.f4752e, this.f4753f.j(), this.f4754g, this.h, this.i, this.f4755j, this.f4756k, this.f4757l, this.f4758m);
        }
        throw new IllegalStateException("message == null");
    }
}
