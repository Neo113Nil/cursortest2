package H;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f565a;

    /* renamed from: b, reason: collision with root package name */
    public int f566b;

    /* renamed from: c, reason: collision with root package name */
    public float f567c;

    /* renamed from: d, reason: collision with root package name */
    public float f568d;

    /* renamed from: e, reason: collision with root package name */
    public long f569e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f570g;

    /* renamed from: h, reason: collision with root package name */
    public float f571h;

    /* renamed from: i, reason: collision with root package name */
    public int f572i;

    public final float a(long j3) {
        if (j3 < this.f569e) {
            return 0.0f;
        }
        long j4 = this.f570g;
        if (j4 < 0 || j3 < j4) {
            return e.b((j3 - r0) / this.f565a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f571h;
        return (e.b((j3 - j4) / this.f572i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
