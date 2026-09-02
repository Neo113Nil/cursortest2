package r0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3116a;

    /* renamed from: b, reason: collision with root package name */
    public int f3117b;

    /* renamed from: c, reason: collision with root package name */
    public float f3118c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f3119e;

    /* renamed from: f, reason: collision with root package name */
    public long f3120f;

    /* renamed from: g, reason: collision with root package name */
    public long f3121g;

    /* renamed from: h, reason: collision with root package name */
    public float f3122h;
    public int i;

    public final float a(long j4) {
        if (j4 < this.f3119e) {
            return 0.0f;
        }
        long j5 = this.f3121g;
        if (j5 < 0 || j4 < j5) {
            return d.b((j4 - r0) / this.f3116a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f3122h;
        return (d.b((j4 - j5) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
