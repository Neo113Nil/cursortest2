package f6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4251a;

    /* renamed from: b, reason: collision with root package name */
    public long f4252b;

    /* renamed from: c, reason: collision with root package name */
    public long f4253c;

    public a(int i7) {
        this.f4251a = i7;
    }

    public static void b(a aVar, long j4, long j7, int i7) {
        if ((i7 & 1) != 0) {
            j4 = 0;
        }
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        synchronized (aVar) {
            try {
                if (j4 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j7 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j8 = aVar.f4252b + j4;
                aVar.f4252b = j8;
                long j9 = aVar.f4253c + j7;
                aVar.f4253c = j9;
                if (j9 > j8) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.f4252b - this.f4253c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f4251a + ", total=" + this.f4252b + ", acknowledged=" + this.f4253c + ", unacknowledged=" + a() + ')';
    }
}
