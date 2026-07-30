package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f10047b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10048c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f10049a;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static final float b(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float c(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static String d(long j8) {
        return "TransformOrigin(packedValue=" + j8 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return this.f10049a == ((s0) obj).f10049a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10049a);
    }

    public final String toString() {
        return d(this.f10049a);
    }
}
