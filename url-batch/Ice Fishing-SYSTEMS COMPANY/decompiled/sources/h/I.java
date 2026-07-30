package h;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: e, reason: collision with root package name */
    public static I f38039e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38040a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f38041b;

    /* renamed from: c, reason: collision with root package name */
    public long f38042c;

    /* renamed from: d, reason: collision with root package name */
    public long f38043d;

    public /* synthetic */ I() {
    }

    public static void c(I i, long j9, long j10, int i4) {
        if ((i4 & 1) != 0) {
            j9 = 0;
        }
        if ((i4 & 2) != 0) {
            j10 = 0;
        }
        synchronized (i) {
            try {
                if (j9 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j10 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j11 = i.f38042c + j9;
                i.f38042c = j11;
                long j12 = i.f38043d + j10;
                i.f38043d = j12;
                if (j12 > j11) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j9, double d2, double d3) {
        double d9 = (0.01720197f * ((j9 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d9) * 0.03341960161924362d) + d9 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d9) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d10 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d10))) / (Math.cos(asin) * Math.cos(d10));
        if (sin3 >= 1.0d) {
            this.f38041b = 1;
            this.f38042c = -1L;
            this.f38043d = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f38041b = 0;
                this.f38042c = -1L;
                this.f38043d = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f38042c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f38043d = round;
            if (round >= j9 || this.f38042c <= j9) {
                this.f38041b = 1;
            } else {
                this.f38041b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f38042c - this.f38043d;
    }

    public String toString() {
        switch (this.f38040a) {
            case 1:
                return "WindowCounter(streamId=" + this.f38041b + ", total=" + this.f38042c + ", acknowledged=" + this.f38043d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public I(int i) {
        this.f38041b = i;
    }
}
