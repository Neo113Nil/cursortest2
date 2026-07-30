package H;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f356a;

    /* renamed from: b, reason: collision with root package name */
    public final long f357b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f356a = 0L;
            this.f357b = 1L;
        } else {
            this.f356a = j2;
            this.f357b = j3;
        }
    }

    public final String toString() {
        return this.f356a + "/" + this.f357b;
    }
}
