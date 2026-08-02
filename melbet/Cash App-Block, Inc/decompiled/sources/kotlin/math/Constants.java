package kotlin.math;

/* loaded from: classes4.dex */
public final class Constants {
    public static final Constants INSTANCE = new Constants();
    public static final double LN2 = Math.log(2.0d);

    static {
        Math.sqrt(Math.sqrt(Math.ulp(1.0d)));
    }
}
