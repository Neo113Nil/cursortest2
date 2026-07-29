package android.support.v7.app;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
class l {

    /* renamed from: d, reason: collision with root package name */
    private static l f1664d;

    /* renamed from: a, reason: collision with root package name */
    public long f1665a;

    /* renamed from: b, reason: collision with root package name */
    public long f1666b;

    /* renamed from: c, reason: collision with root package name */
    public int f1667c;

    l() {
    }

    static l a() {
        if (f1664d == null) {
            f1664d = new l();
        }
        return f1664d;
    }

    public void a(long j, double d2, double d3) {
        float f = (j - 946728000000L) / 8.64E7f;
        double d4 = (0.01720197f * f) + 6.24006f;
        double sin = Math.sin(d4) * 0.03341960161924362d;
        Double.isNaN(d4);
        double sin2 = sin + d4 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        Double.isNaN(f - 9.0E-4f);
        double round = Math.round(r11 - r9) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = round + ((-d3) / 360.0d) + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d2;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f1667c = 1;
            this.f1665a = -1L;
            this.f1666b = -1L;
            return;
        }
        if (sin4 <= -1.0d) {
            this.f1667c = 0;
            this.f1665a = -1L;
            this.f1666b = -1L;
            return;
        }
        double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
        Double.isNaN(acos);
        this.f1665a = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
        Double.isNaN(acos);
        this.f1666b = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
        if (this.f1666b < j && this.f1665a > j) {
            this.f1667c = 0;
        } else {
            this.f1667c = 1;
        }
    }
}
