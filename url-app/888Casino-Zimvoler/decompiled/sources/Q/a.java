package Q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f629a;

    /* renamed from: b, reason: collision with root package name */
    public int f630b;

    /* renamed from: c, reason: collision with root package name */
    public float f631c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f632e;

    /* renamed from: f, reason: collision with root package name */
    public long f633f;

    /* renamed from: g, reason: collision with root package name */
    public long f634g;
    public float h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f632e) {
            return 0.0f;
        }
        long j3 = this.f634g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f629a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (g.b((j2 - j3) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
