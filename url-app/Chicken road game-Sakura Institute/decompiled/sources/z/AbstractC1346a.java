package z;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1346a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f11694a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11695b = 0;

    public static long a(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }
}
