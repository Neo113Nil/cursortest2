package H;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1049a;

    /* renamed from: b, reason: collision with root package name */
    public int f1050b;

    /* renamed from: c, reason: collision with root package name */
    public float f1051c;

    /* renamed from: d, reason: collision with root package name */
    public float f1052d;

    /* renamed from: e, reason: collision with root package name */
    public long f1053e;

    /* renamed from: f, reason: collision with root package name */
    public long f1054f;

    /* renamed from: g, reason: collision with root package name */
    public long f1055g;

    /* renamed from: h, reason: collision with root package name */
    public float f1056h;

    /* renamed from: i, reason: collision with root package name */
    public int f1057i;

    public final float a(long j4) {
        if (j4 < this.f1053e) {
            return 0.0f;
        }
        long j5 = this.f1055g;
        if (j5 < 0 || j4 < j5) {
            return e.b((j4 - r0) / this.f1049a, 0.0f, 1.0f) * 0.5f;
        }
        float f4 = this.f1056h;
        return (e.b((j4 - j5) / this.f1057i, 0.0f, 1.0f) * f4) + (1.0f - f4);
    }
}
