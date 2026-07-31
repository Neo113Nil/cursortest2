package b0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: b, reason: collision with root package name */
    public static final long f5400b = M.i(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5401c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f5402a;

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
        if (obj instanceof U) {
            return this.f5402a == ((U) obj).f5402a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5402a);
    }

    public final String toString() {
        return d(this.f5402a);
    }
}
