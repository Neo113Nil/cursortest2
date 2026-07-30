package L6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static a f1702e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1703a = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f1704b;

    /* renamed from: c, reason: collision with root package name */
    public long f1705c;

    /* renamed from: d, reason: collision with root package name */
    public int f1706d;

    public /* synthetic */ a() {
    }

    public static void c(a aVar, long j, long j7, int i2) {
        if ((i2 & 1) != 0) {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            j7 = 0;
        }
        synchronized (aVar) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j7 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j8 = aVar.f1704b + j;
                aVar.f1704b = j8;
                long j9 = aVar.f1705c + j7;
                aVar.f1705c = j9;
                if (j9 > j8) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j, double d7, double d8) {
        double d9 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d9) * 0.03341960161924362d) + d9 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d9) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d8) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d10 = 0.01745329238474369d * d7;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d10))) / (Math.cos(asin) * Math.cos(d10));
        if (sin3 >= 1.0d) {
            this.f1706d = 1;
            this.f1704b = -1L;
            this.f1705c = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f1706d = 0;
                this.f1704b = -1L;
                this.f1705c = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f1704b = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f1705c = round;
            if (round >= j || this.f1704b <= j) {
                this.f1706d = 1;
            } else {
                this.f1706d = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f1704b - this.f1705c;
    }

    public String toString() {
        switch (this.f1703a) {
            case 0:
                return "WindowCounter(streamId=" + this.f1706d + ", total=" + this.f1704b + ", acknowledged=" + this.f1705c + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public a(int i2) {
        this.f1706d = i2;
    }
}
