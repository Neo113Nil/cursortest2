package o0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f2958a;

    /* renamed from: b, reason: collision with root package name */
    public int f2959b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f2960d;

    /* renamed from: e, reason: collision with root package name */
    public long f2961e;

    /* renamed from: f, reason: collision with root package name */
    public long f2962f;
    public long g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public int f2963i;

    public final float a(long j4) {
        if (j4 < this.f2961e) {
            return 0.0f;
        }
        long j5 = this.g;
        if (j5 < 0 || j4 < j5) {
            return d.b((j4 - r0) / this.f2958a, 0.0f, 1.0f) * 0.5f;
        }
        float f4 = this.h;
        return (d.b((j4 - j5) / this.f2963i, 0.0f, 1.0f) * f4) + (1.0f - f4);
    }
}
