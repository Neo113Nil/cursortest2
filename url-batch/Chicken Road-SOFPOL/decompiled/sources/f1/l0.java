package f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2683b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2684c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2685a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final float b(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    public static final float c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static String d(long j7) {
        return "TransformOrigin(packedValue=" + j7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return this.f2685a == ((l0) obj).f2685a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2685a);
    }

    public final String toString() {
        return d(this.f2685a);
    }
}
