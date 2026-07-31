package b0;

/* renamed from: b0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266Q {

    /* renamed from: b, reason: collision with root package name */
    public static final long f4258b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4259c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f4260a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        return "TransformOrigin(packedValue=" + j3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0266Q) {
            return this.f4260a == ((C0266Q) obj).f4260a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4260a);
    }

    public final String toString() {
        return d(this.f4260a);
    }
}
