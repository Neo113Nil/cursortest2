package f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2579a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2580b = 0;

    public static long a(float f6, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static String b(long j7) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j7 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j7 & 4294967295L)) + ')';
    }
}
