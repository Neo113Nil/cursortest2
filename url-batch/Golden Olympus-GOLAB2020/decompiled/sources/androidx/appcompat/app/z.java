package androidx.appcompat.app;

/* loaded from: classes.dex */
class z {

    /* renamed from: d, reason: collision with root package name */
    private static z f10225d;

    /* renamed from: a, reason: collision with root package name */
    public long f10226a;

    /* renamed from: b, reason: collision with root package name */
    public long f10227b;

    /* renamed from: c, reason: collision with root package name */
    public int f10228c;

    z() {
    }

    static z b() {
        if (f10225d == null) {
            f10225d = new z();
        }
        return f10225d;
    }

    public void a(long j4, double d4, double d5) {
        double d6 = (0.01720197f * ((j4 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d6) * 0.03341960161924362d) + d6 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d5) / 360.0d) + (Math.sin(d6) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d4;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(asin))) / (Math.cos(d7) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f10228c = 1;
            this.f10226a = -1L;
            this.f10227b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f10228c = 0;
                this.f10226a = -1L;
                this.f10227b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f10226a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f10227b = round2;
            if (round2 >= j4 || this.f10226a <= j4) {
                this.f10228c = 1;
            } else {
                this.f10228c = 0;
            }
        }
    }
}
