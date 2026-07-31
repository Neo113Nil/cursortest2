package z;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1065a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8865a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8866b = 0;

    public static long a(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }
}
