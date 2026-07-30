package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class jp0 {
    public static final ip0 Companion = new ip0();
    public static final long PxuCJdSBwIXG = PxuCJdSBwIXG(Float.NaN, Float.NaN);

    public static long PxuCJdSBwIXG(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String lS5Rgt96tfkO(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
