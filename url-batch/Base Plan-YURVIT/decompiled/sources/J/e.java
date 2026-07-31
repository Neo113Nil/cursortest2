package J;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f550a;

    /* renamed from: b, reason: collision with root package name */
    public final long f551b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f550a = 0L;
            this.f551b = 1L;
        } else {
            this.f550a = j2;
            this.f551b = j3;
        }
    }

    public final String toString() {
        return this.f550a + "/" + this.f551b;
    }
}
