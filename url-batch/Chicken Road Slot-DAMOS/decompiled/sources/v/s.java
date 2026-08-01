package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f9874a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9875b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9876c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9877d;

    public s(int i3, int i10, n nVar) {
        this.f9874a = i3;
        this.f9875b = nVar;
        this.f9876c = i3 * 1000000;
        this.f9877d = i10 * 1000000;
    }

    @Override // v.q
    public final float b(long j, float f3, float f10, float f11) {
        long j3 = j - this.f9877d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j10 = this.f9876c;
        if (j3 > j10) {
            j3 = j10;
        }
        float a9 = this.f9875b.a(this.f9874a == 0 ? 1.0f : j3 / j10);
        return (f10 * a9) + ((1 - a9) * f3);
    }

    @Override // v.q
    public final float c(long j, float f3, float f10, float f11) {
        long j3 = j - this.f9877d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j10 = this.f9876c;
        long j11 = j3 > j10 ? j10 : j3;
        if (j11 == 0) {
            return f11;
        }
        return (b(j11, f3, f10, f11) - b(j11 - 1000000, f3, f10, f11)) * 1000.0f;
    }

    @Override // v.q
    public final long d(float f3, float f10, float f11) {
        return this.f9877d + this.f9876c;
    }
}
