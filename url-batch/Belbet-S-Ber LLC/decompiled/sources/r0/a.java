package r0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3177a;

    /* renamed from: b, reason: collision with root package name */
    public int f3178b;

    /* renamed from: c, reason: collision with root package name */
    public float f3179c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f3180e;

    /* renamed from: f, reason: collision with root package name */
    public long f3181f;

    /* renamed from: g, reason: collision with root package name */
    public long f3182g;
    public float h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f3180e) {
            return 0.0f;
        }
        long j4 = this.f3182g;
        if (j4 < 0 || j2 < j4) {
            return c.b((j2 - r0) / this.f3177a, 0.0f, 1.0f) * 0.5f;
        }
        float f5 = this.h;
        return (c.b((j2 - j4) / this.i, 0.0f, 1.0f) * f5) + (1.0f - f5);
    }
}
