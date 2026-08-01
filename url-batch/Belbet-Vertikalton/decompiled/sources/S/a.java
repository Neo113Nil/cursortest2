package S;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1116a;

    /* renamed from: b, reason: collision with root package name */
    public int f1117b;

    /* renamed from: c, reason: collision with root package name */
    public float f1118c;

    /* renamed from: d, reason: collision with root package name */
    public float f1119d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f1120f;

    /* renamed from: g, reason: collision with root package name */
    public long f1121g;

    /* renamed from: h, reason: collision with root package name */
    public float f1122h;
    public int i;

    public final float a(long j) {
        if (j < this.e) {
            return 0.0f;
        }
        long j2 = this.f1121g;
        if (j2 < 0 || j < j2) {
            return g.b((j - r0) / this.f1116a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f1122h;
        return (g.b((j - j2) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
