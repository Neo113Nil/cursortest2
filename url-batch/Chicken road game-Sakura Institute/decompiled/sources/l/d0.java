package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5436b;

    /* renamed from: c, reason: collision with root package name */
    public final y f5437c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5438d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5439e;

    public d0(int i7, int i8, y yVar) {
        this.f5435a = i7;
        this.f5436b = i8;
        this.f5437c = yVar;
        this.f5438d = i7 * 1000000;
        this.f5439e = i8 * 1000000;
    }

    @Override // l.b0
    public final float b(long j8, float f9, float f10, float f11) {
        float f12 = this.f5435a == 0 ? 1.0f : v1.g.f(j8 - this.f5439e, 0L, this.f5438d) / this.f5438d;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float c4 = this.f5437c.c(f12 <= 1.0f ? f12 : 1.0f);
        w1 w1Var = x1.f5722a;
        return (f10 * c4) + ((1 - c4) * f9);
    }

    @Override // l.b0
    public final float c(long j8, float f9, float f10, float f11) {
        long f12 = v1.g.f(j8 - this.f5439e, 0L, this.f5438d);
        if (f12 < 0) {
            return 0.0f;
        }
        if (f12 == 0) {
            return f11;
        }
        return (b(f12, f9, f10, f11) - b(f12 - 1000000, f9, f10, f11)) * 1000.0f;
    }

    @Override // l.b0
    public final long d(float f9, float f10, float f11) {
        return (this.f5436b + this.f5435a) * 1000000;
    }
}
