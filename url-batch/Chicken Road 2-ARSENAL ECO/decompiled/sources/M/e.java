package M;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f1540a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1541b;

    public e(long j4, long j7) {
        if (j7 == 0) {
            this.f1540a = 0L;
            this.f1541b = 1L;
        } else {
            this.f1540a = j4;
            this.f1541b = j7;
        }
    }

    public final String toString() {
        return this.f1540a + "/" + this.f1541b;
    }
}
