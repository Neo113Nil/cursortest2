package C;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f148a;

    /* renamed from: b, reason: collision with root package name */
    public int f149b;

    /* renamed from: c, reason: collision with root package name */
    public float f150c;

    /* renamed from: d, reason: collision with root package name */
    public float f151d;

    /* renamed from: e, reason: collision with root package name */
    public long f152e;

    /* renamed from: f, reason: collision with root package name */
    public long f153f;

    /* renamed from: g, reason: collision with root package name */
    public long f154g;

    /* renamed from: h, reason: collision with root package name */
    public float f155h;

    /* renamed from: i, reason: collision with root package name */
    public int f156i;

    public final float a(long j2) {
        if (j2 < this.f152e) {
            return 0.0f;
        }
        long j3 = this.f154g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f148a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f155h;
        return (g.b((j2 - j3) / this.f156i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
