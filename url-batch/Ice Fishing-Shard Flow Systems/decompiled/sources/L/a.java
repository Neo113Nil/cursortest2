package L;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1622a;

    /* renamed from: b, reason: collision with root package name */
    public int f1623b;

    /* renamed from: c, reason: collision with root package name */
    public float f1624c;

    /* renamed from: d, reason: collision with root package name */
    public float f1625d;

    /* renamed from: e, reason: collision with root package name */
    public long f1626e;

    /* renamed from: f, reason: collision with root package name */
    public long f1627f;

    /* renamed from: g, reason: collision with root package name */
    public long f1628g;

    /* renamed from: h, reason: collision with root package name */
    public float f1629h;

    /* renamed from: i, reason: collision with root package name */
    public int f1630i;

    public final float a(long j) {
        if (j < this.f1626e) {
            return 0.0f;
        }
        long j7 = this.f1628g;
        if (j7 < 0 || j < j7) {
            return c.b((j - r0) / this.f1622a, 0.0f, 1.0f) * 0.5f;
        }
        float f7 = this.f1629h;
        return (c.b((j - j7) / this.f1630i, 0.0f, 1.0f) * f7) + (1.0f - f7);
    }
}
