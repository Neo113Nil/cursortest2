package g;

/* renamed from: g.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123G {
    public static C0123G d;

    /* renamed from: a, reason: collision with root package name */
    public long f2324a;

    /* renamed from: b, reason: collision with root package name */
    public long f2325b;

    /* renamed from: c, reason: collision with root package name */
    public int f2326c;

    public final void a(long j2, double d2, double d3) {
        double d4 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.f2326c = 1;
            this.f2324a = -1L;
            this.f2325b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f2326c = 0;
                this.f2324a = -1L;
                this.f2325b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f2324a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f2325b = round;
            if (round >= j2 || this.f2324a <= j2) {
                this.f2326c = 1;
            } else {
                this.f2326c = 0;
            }
        }
    }
}
