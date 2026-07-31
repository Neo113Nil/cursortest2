package A;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f0a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1b = 0;

    public static long a(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }
}
