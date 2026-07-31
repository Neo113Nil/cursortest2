package m;

import e2.AbstractC0381e;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578C implements InterfaceC0576A {

    /* renamed from: a, reason: collision with root package name */
    public final int f5555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5556b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0613x f5557c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5558d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5559e;

    public C0578C(int i3, int i4, InterfaceC0613x interfaceC0613x) {
        this.f5555a = i3;
        this.f5556b = i4;
        this.f5557c = interfaceC0613x;
        this.f5558d = i3 * 1000000;
        this.f5559e = i4 * 1000000;
    }

    @Override // m.InterfaceC0576A
    public final float b(long j3, float f3, float f4, float f5) {
        float s3 = this.f5555a == 0 ? 1.0f : AbstractC0381e.s(j3 - this.f5559e, 0L, this.f5558d) / this.f5558d;
        if (s3 < 0.0f) {
            s3 = 0.0f;
        }
        float a3 = this.f5557c.a(s3 <= 1.0f ? s3 : 1.0f);
        y0 y0Var = z0.f5885a;
        return (f4 * a3) + ((1 - a3) * f3);
    }

    @Override // m.InterfaceC0576A
    public final float c(long j3, float f3, float f4, float f5) {
        long s3 = AbstractC0381e.s(j3 - this.f5559e, 0L, this.f5558d);
        if (s3 < 0) {
            return 0.0f;
        }
        if (s3 == 0) {
            return f5;
        }
        return (b(s3, f3, f4, f5) - b(s3 - 1000000, f3, f4, f5)) * 1000.0f;
    }

    @Override // m.InterfaceC0576A
    public final long d(float f3, float f4, float f5) {
        return (this.f5556b + this.f5555a) * 1000000;
    }
}
