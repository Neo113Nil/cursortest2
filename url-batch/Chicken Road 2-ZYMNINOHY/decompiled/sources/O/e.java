package O;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f1965a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1966b;

    public e(long j4, long j5) {
        if (j5 == 0) {
            this.f1965a = 0L;
            this.f1966b = 1L;
        } else {
            this.f1965a = j4;
            this.f1966b = j5;
        }
    }

    public final String toString() {
        return this.f1965a + "/" + this.f1966b;
    }
}
