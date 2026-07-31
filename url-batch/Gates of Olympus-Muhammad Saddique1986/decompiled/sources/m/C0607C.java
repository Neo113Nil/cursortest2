package m;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607C implements InterfaceC0605A {

    /* renamed from: a, reason: collision with root package name */
    public final int f6597a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6598b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0638x f6599c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6600d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6601e;

    public C0607C(int i3, int i4, InterfaceC0638x interfaceC0638x) {
        this.f6597a = i3;
        this.f6598b = i4;
        this.f6599c = interfaceC0638x;
        this.f6600d = i3 * 1000000;
        this.f6601e = i4 * 1000000;
    }

    @Override // m.InterfaceC0605A
    public final float b(long j3, float f3, float f4, float f5) {
        float z3 = this.f6597a == 0 ? 1.0f : O2.d.z(j3 - this.f6601e, 0L, this.f6600d) / this.f6600d;
        if (z3 < 0.0f) {
            z3 = 0.0f;
        }
        float a3 = this.f6599c.a(z3 <= 1.0f ? z3 : 1.0f);
        u0 u0Var = v0.f6899a;
        return (f4 * a3) + ((1 - a3) * f3);
    }

    @Override // m.InterfaceC0605A
    public final float c(long j3, float f3, float f4, float f5) {
        long z3 = O2.d.z(j3 - this.f6601e, 0L, this.f6600d);
        if (z3 < 0) {
            return 0.0f;
        }
        if (z3 == 0) {
            return f5;
        }
        return (b(z3, f3, f4, f5) - b(z3 - 1000000, f3, f4, f5)) * 1000.0f;
    }

    @Override // m.InterfaceC0605A
    public final long d(float f3, float f4, float f5) {
        return (this.f6598b + this.f6597a) * 1000000;
    }
}
