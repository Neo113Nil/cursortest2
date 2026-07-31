package n2;

import k2.C0536h;

/* renamed from: n2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679D implements k2.G {

    /* renamed from: d, reason: collision with root package name */
    public final C0681F f6274d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6275e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6276f;

    /* renamed from: g, reason: collision with root package name */
    public final C0536h f6277g;

    public C0679D(C0681F c0681f, long j3, Object obj, C0536h c0536h) {
        this.f6274d = c0681f;
        this.f6275e = j3;
        this.f6276f = obj;
        this.f6277g = c0536h;
    }

    @Override // k2.G
    public final void a() {
        C0681F c0681f = this.f6274d;
        synchronized (c0681f) {
            if (this.f6275e < c0681f.o()) {
                return;
            }
            Object[] objArr = c0681f.f6288k;
            Z1.i.c(objArr);
            long j3 = this.f6275e;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC0682G.d(objArr, j3, AbstractC0682G.f6293a);
            c0681f.j();
        }
    }
}
