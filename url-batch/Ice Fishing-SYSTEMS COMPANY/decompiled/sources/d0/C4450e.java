package d0;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4450e {

    /* renamed from: a, reason: collision with root package name */
    public final long f37144a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37145b;

    public C4450e(long j9, long j10) {
        if (j10 == 0) {
            this.f37144a = 0L;
            this.f37145b = 1L;
        } else {
            this.f37144a = j9;
            this.f37145b = j10;
        }
    }

    public final String toString() {
        return this.f37144a + "/" + this.f37145b;
    }
}
