package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class du {
    public static final cu Companion = new cu();

    public static final boolean PxuCJdSBwIXG(long j, long j2) {
        return j == j2;
    }

    public static String lS5Rgt96tfkO(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + ng0.EpkonXwzFgDB(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + ng0.EpkonXwzFgDB(Float.intBitsToFloat(i)) + ", " + ng0.EpkonXwzFgDB(Float.intBitsToFloat(i2)) + ')';
    }
}
