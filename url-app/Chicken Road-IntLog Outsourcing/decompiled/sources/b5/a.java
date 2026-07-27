package b5;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4859a;

    /* renamed from: b, reason: collision with root package name */
    public long f4860b;

    /* renamed from: c, reason: collision with root package name */
    public long f4861c;

    public a(int i2) {
        this.f4859a = i2;
    }

    public static void b(a aVar, long j2, long j6, int i2) {
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            j6 = 0;
        }
        synchronized (aVar) {
            try {
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j6 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j7 = aVar.f4860b + j2;
                aVar.f4860b = j7;
                long j8 = aVar.f4861c + j6;
                aVar.f4861c = j8;
                if (j8 > j7) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.f4860b - this.f4861c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f4859a + ", total=" + this.f4860b + ", acknowledged=" + this.f4861c + ", unacknowledged=" + a() + ')';
    }
}
