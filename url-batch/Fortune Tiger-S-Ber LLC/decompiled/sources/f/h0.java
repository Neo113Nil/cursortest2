package f;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static h0 f1602d;

    /* renamed from: a, reason: collision with root package name */
    public long f1603a;

    /* renamed from: b, reason: collision with root package name */
    public long f1604b;
    public int c;

    public final void a(double d4, double d5, long j4) {
        double d6 = (0.01720197f * ((j4 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d6) * 0.03341960161924362d) + d6 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d6) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d5) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d7 = 0.01745329238474369d * d4;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d7))) / (Math.cos(asin) * Math.cos(d7));
        if (sin3 >= 1.0d) {
            this.c = 1;
            this.f1603a = -1L;
            this.f1604b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.c = 0;
                this.f1603a = -1L;
                this.f1604b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f1603a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f1604b = round;
            if (round >= j4 || this.f1603a <= j4) {
                this.c = 1;
            } else {
                this.c = 0;
            }
        }
    }
}
