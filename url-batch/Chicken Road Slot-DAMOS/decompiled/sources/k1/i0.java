package k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f5326b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5327c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f5328a;

    public static final boolean a(long j, long j3) {
        return j == j3;
    }

    public static String b(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.f5328a == ((i0) obj).f5328a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5328a);
    }

    public final String toString() {
        return b(this.f5328a);
    }
}
