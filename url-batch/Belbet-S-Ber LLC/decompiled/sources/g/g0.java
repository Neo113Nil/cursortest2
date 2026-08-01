package g;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g0 {
    public static g0 d;

    /* renamed from: a, reason: collision with root package name */
    public long f1521a;

    /* renamed from: b, reason: collision with root package name */
    public long f1522b;

    /* renamed from: c, reason: collision with root package name */
    public int f1523c;

    public final void a(double d5, double d6, long j2) {
        double d7 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d7) * 0.03341960161924362d) + d7 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d7) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d6) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d8 = 0.01745329238474369d * d5;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d8))) / (Math.cos(asin) * Math.cos(d8));
        if (sin3 >= 1.0d) {
            this.f1523c = 1;
            this.f1521a = -1L;
            this.f1522b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f1523c = 0;
                this.f1521a = -1L;
                this.f1522b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f1521a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f1522b = round;
            if (round >= j2 || this.f1521a <= j2) {
                this.f1523c = 1;
            } else {
                this.f1523c = 0;
            }
        }
    }
}
