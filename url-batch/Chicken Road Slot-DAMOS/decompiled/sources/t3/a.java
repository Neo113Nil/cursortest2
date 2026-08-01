package t3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f9253a;

    /* renamed from: b, reason: collision with root package name */
    public int f9254b;

    /* renamed from: c, reason: collision with root package name */
    public float f9255c;

    /* renamed from: d, reason: collision with root package name */
    public float f9256d;

    /* renamed from: e, reason: collision with root package name */
    public long f9257e;

    /* renamed from: f, reason: collision with root package name */
    public long f9258f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public float f9259h;

    /* renamed from: i, reason: collision with root package name */
    public int f9260i;

    public final float a(long j) {
        if (j < this.f9257e) {
            return 0.0f;
        }
        long j3 = this.g;
        if (j3 < 0 || j < j3) {
            return c.b((j - r0) / this.f9253a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f9259h;
        return (c.b((j - j3) / this.f9260i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
