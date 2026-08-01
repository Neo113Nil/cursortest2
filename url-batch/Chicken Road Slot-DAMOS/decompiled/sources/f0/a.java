package f0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f3999a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4000b = 0;

    public static long a(float f3, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static String b(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
