package O2;

import I2.m;

/* loaded from: classes3.dex */
public class f extends I2.e {

    /* renamed from: b, reason: collision with root package name */
    private final I2.g f8941b;

    /* renamed from: c, reason: collision with root package name */
    private S2.c f8942c;

    /* renamed from: d, reason: collision with root package name */
    private S2.f f8943d;

    public f(S2.c cVar, byte[] bArr) {
        this.f8942c = cVar;
        this.f8941b = new m(Z2.a.c(bArr));
    }

    @Override // I2.e, I2.b
    public I2.j b() {
        return this.f8941b;
    }

    public synchronized S2.f d() {
        try {
            if (this.f8943d == null) {
                this.f8943d = this.f8942c.g(this.f8941b.h()).s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8943d;
    }
}
