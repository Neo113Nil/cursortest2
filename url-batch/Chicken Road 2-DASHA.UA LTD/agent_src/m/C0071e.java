package m;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071e {

    /* renamed from: a, reason: collision with root package name */
    public final long f947a;

    /* renamed from: b, reason: collision with root package name */
    public final long f948b;

    public C0071e(long j2, long j3) {
        if (j3 == 0) {
            this.f947a = 0L;
            this.f948b = 1L;
        } else {
            this.f947a = j2;
            this.f948b = j3;
        }
    }

    public final String toString() {
        return this.f947a + "/" + this.f948b;
    }
}
