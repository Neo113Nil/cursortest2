package u3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f7349a;

    /* renamed from: b, reason: collision with root package name */
    public int f7350b;

    /* renamed from: c, reason: collision with root package name */
    public float f7351c;

    /* renamed from: d, reason: collision with root package name */
    public float f7352d;

    /* renamed from: e, reason: collision with root package name */
    public long f7353e;

    /* renamed from: f, reason: collision with root package name */
    public long f7354f;

    /* renamed from: g, reason: collision with root package name */
    public long f7355g;

    /* renamed from: h, reason: collision with root package name */
    public float f7356h;
    public int i;

    public final float a(long j7) {
        if (j7 < this.f7353e) {
            return 0.0f;
        }
        long j8 = this.f7355g;
        if (j8 < 0 || j7 < j8) {
            return d.b((j7 - r0) / this.f7349a, 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.f7356h;
        return (d.b((j7 - j8) / this.i, 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
