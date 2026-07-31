package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f6456a;

    /* renamed from: b, reason: collision with root package name */
    public final t f6457b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6458c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6459d;

    public y(int i, int i8, t tVar) {
        this.f6456a = i;
        this.f6457b = tVar;
        this.f6458c = i * 1000000;
        this.f6459d = i8 * 1000000;
    }

    @Override // r.w
    public final float b(long j7, float f6, float f8, float f9) {
        long j8 = j7 - this.f6459d;
        if (j8 < 0) {
            j8 = 0;
        }
        long j9 = this.f6458c;
        if (j8 > j9) {
            j8 = j9;
        }
        float a8 = this.f6457b.a(this.f6456a == 0 ? 1.0f : j8 / j9);
        return (f8 * a8) + ((1 - a8) * f6);
    }

    @Override // r.w
    public final float c(long j7, float f6, float f8, float f9) {
        long j8 = j7 - this.f6459d;
        if (j8 < 0) {
            j8 = 0;
        }
        long j9 = this.f6458c;
        long j10 = j8 > j9 ? j9 : j8;
        if (j10 == 0) {
            return f9;
        }
        return (b(j10, f6, f8, f9) - b(j10 - 1000000, f6, f8, f9)) * 1000.0f;
    }

    @Override // r.w
    public final long d(float f6, float f8, float f9) {
        return this.f6459d + this.f6458c;
    }
}
