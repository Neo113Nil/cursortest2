package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1124a;

    /* renamed from: b, reason: collision with root package name */
    public int f1125b;

    /* renamed from: c, reason: collision with root package name */
    public float f1126c;

    /* renamed from: d, reason: collision with root package name */
    public float f1127d;

    /* renamed from: e, reason: collision with root package name */
    public long f1128e;

    /* renamed from: f, reason: collision with root package name */
    public long f1129f;

    /* renamed from: g, reason: collision with root package name */
    public long f1130g;

    /* renamed from: h, reason: collision with root package name */
    public float f1131h;

    /* renamed from: i, reason: collision with root package name */
    public int f1132i;

    public final float a(long j4) {
        if (j4 < this.f1128e) {
            return 0.0f;
        }
        long j7 = this.f1130g;
        if (j7 < 0 || j4 < j7) {
            return f.b((j4 - r0) / this.f1124a, 0.0f, 1.0f) * 0.5f;
        }
        float f7 = this.f1131h;
        return (f.b((j4 - j7) / this.f1132i, 0.0f, 1.0f) * f7) + (1.0f - f7);
    }
}
