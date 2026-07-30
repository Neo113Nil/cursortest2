package h6;

/* loaded from: classes4.dex */
final class a {
    public static final a INSTANCE = new a();
    public static final double LN2 = Math.log(2.0d);
    public static final double epsilon;
    public static final double taylor_2_bound;
    public static final double taylor_n_bound;
    public static final double upper_taylor_2_bound;
    public static final double upper_taylor_n_bound;

    static {
        double ulp = Math.ulp(1.0d);
        epsilon = ulp;
        double sqrt = Math.sqrt(ulp);
        taylor_2_bound = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        taylor_n_bound = sqrt2;
        double d8 = 1;
        upper_taylor_2_bound = d8 / sqrt;
        upper_taylor_n_bound = d8 / sqrt2;
    }

    private a() {
    }
}
