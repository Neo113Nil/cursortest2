package O;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1096b;

    public e(long j3, long j4) {
        if (j4 == 0) {
            this.f1095a = 0L;
            this.f1096b = 1L;
        } else {
            this.f1095a = j3;
            this.f1096b = j4;
        }
    }

    public final String toString() {
        return this.f1095a + "/" + this.f1096b;
    }
}
