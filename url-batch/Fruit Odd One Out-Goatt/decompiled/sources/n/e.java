package n;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f901a;

    /* renamed from: b, reason: collision with root package name */
    public final long f902b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f901a = 0L;
            this.f902b = 1L;
        } else {
            this.f901a = j2;
            this.f902b = j3;
        }
    }

    public final String toString() {
        return this.f901a + "/" + this.f902b;
    }
}
