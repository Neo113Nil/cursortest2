package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f10338a;

    public static final long a(long j, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long b(long j, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f10338a == ((p) obj).f10338a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10338a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j = this.f10338a;
        sb2.append(Float.intBitsToFloat((int) (j >> 32)));
        sb2.append(", ");
        sb2.append(Float.intBitsToFloat((int) (j & 4294967295L)));
        sb2.append(") px/sec");
        return sb2.toString();
    }
}
