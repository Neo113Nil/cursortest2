package F;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f423a;

    /* renamed from: b, reason: collision with root package name */
    public int f424b;

    /* renamed from: c, reason: collision with root package name */
    public float f425c;

    /* renamed from: d, reason: collision with root package name */
    public float f426d;

    /* renamed from: e, reason: collision with root package name */
    public long f427e;

    /* renamed from: f, reason: collision with root package name */
    public long f428f;

    /* renamed from: g, reason: collision with root package name */
    public long f429g;

    /* renamed from: h, reason: collision with root package name */
    public float f430h;

    /* renamed from: i, reason: collision with root package name */
    public int f431i;

    public final float a(long j2) {
        if (j2 < this.f427e) {
            return 0.0f;
        }
        long j3 = this.f429g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f423a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f430h;
        return (g.b((j2 - j3) / this.f431i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
