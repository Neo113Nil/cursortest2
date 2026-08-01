package u1;

import cf.c;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f9600a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9601b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9602c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9603d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9604e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9605f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9606h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9607i;

    public b(long j, long j3, long j10, boolean z10, float f3, long j11, long j12, boolean z11) {
        this.f9600a = j;
        this.f9601b = j3;
        this.f9602c = j10;
        this.f9603d = z10;
        this.f9604e = f3;
        this.f9605f = j11;
        this.g = j12;
        this.f9606h = z11;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) c.N(this.f9600a)) + ", uptimeMillis=" + this.f9601b + ", position=" + ((Object) j1.b.e(this.f9602c)) + ", pressed=" + this.f9603d + ", pressure=" + this.f9604e + ", previousUptimeMillis=" + this.f9605f + ", previousPosition=" + ((Object) j1.b.e(this.g)) + ", previousPressed=" + this.f9606h + ", isConsumed=" + this.f9607i + ')';
    }
}
