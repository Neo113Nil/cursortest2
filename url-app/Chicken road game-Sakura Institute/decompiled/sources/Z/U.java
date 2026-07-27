package Z;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: b, reason: collision with root package name */
    public static final long f4510b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4511c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f4512a;

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static final float b(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static String d(long j4) {
        return "TransformOrigin(packedValue=" + j4 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            return this.f4512a == ((U) obj).f4512a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4512a);
    }

    public final String toString() {
        return d(this.f4512a);
    }
}
