package l;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758C implements InterfaceC0756A {

    /* renamed from: a, reason: collision with root package name */
    public final int f7558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7559b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0797x f7560c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7561d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7562e;

    public C0758C(int i2, int i4, InterfaceC0797x interfaceC0797x) {
        this.f7558a = i2;
        this.f7559b = i4;
        this.f7560c = interfaceC0797x;
        this.f7561d = i2 * 1000000;
        this.f7562e = i4 * 1000000;
    }

    @Override // l.InterfaceC0756A
    public final float b(long j4, float f4, float f5, float f6) {
        float f7 = this.f7558a == 0 ? 1.0f : kotlin.ranges.b.f(j4 - this.f7562e, 0L, this.f7561d) / this.f7561d;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        float a4 = this.f7560c.a(f7 <= 1.0f ? f7 : 1.0f);
        v0 v0Var = w0.f7856a;
        return (f5 * a4) + ((1 - a4) * f4);
    }

    @Override // l.InterfaceC0756A
    public final float c(long j4, float f4, float f5, float f6) {
        long f7 = kotlin.ranges.b.f(j4 - this.f7562e, 0L, this.f7561d);
        if (f7 < 0) {
            return 0.0f;
        }
        if (f7 == 0) {
            return f6;
        }
        return (b(f7, f4, f5, f6) - b(f7 - 1000000, f4, f5, f6)) * 1000.0f;
    }

    @Override // l.InterfaceC0756A
    public final long d(float f4, float f5, float f6) {
        return (this.f7559b + this.f7558a) * 1000000;
    }
}
