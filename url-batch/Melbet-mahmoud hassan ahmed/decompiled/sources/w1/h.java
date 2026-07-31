package w1;

import x1.i;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    private final w0.d f22996a;

    /* renamed from: b, reason: collision with root package name */
    private final long f22997b;

    public h(w0.d dVar, long j7) {
        this.f22996a = dVar;
        this.f22997b = j7;
    }

    @Override // w1.f
    public long a(long j7, long j8) {
        return this.f22996a.a(j7 + this.f22997b);
    }

    @Override // w1.f
    public long b(long j7, long j8) {
        return this.f22996a.f22884d[(int) j7];
    }

    @Override // w1.f
    public long c(long j7) {
        return this.f22996a.f22885e[(int) j7] - this.f22997b;
    }

    @Override // w1.f
    public long d(long j7, long j8) {
        return 0L;
    }

    @Override // w1.f
    public long e(long j7, long j8) {
        return -9223372036854775807L;
    }

    @Override // w1.f
    public i f(long j7) {
        return new i(null, this.f22996a.f22883c[(int) j7], r0.f22882b[r9]);
    }

    @Override // w1.f
    public boolean g() {
        return true;
    }

    @Override // w1.f
    public long h() {
        return 0L;
    }

    @Override // w1.f
    public long i(long j7) {
        return this.f22996a.f22881a;
    }

    @Override // w1.f
    public long j(long j7, long j8) {
        return this.f22996a.f22881a;
    }
}
