package a2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91a;

    public long a(long j, long j3) {
        switch (this.f91a) {
            case 0:
                float max = Math.max(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i3 = u0.f163a;
                return floatToRawIntBits;
            case 1:
                float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i10 = u0.f163a;
                return floatToRawIntBits2;
            case 2:
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                int i11 = u0.f163a;
                return floatToRawIntBits3;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                float c10 = q.c(j, j3);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(c10) << 32) | (Float.floatToRawIntBits(c10) & 4294967295L);
                int i12 = u0.f163a;
                return floatToRawIntBits4;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j3 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
                    long floatToRawIntBits5 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i13 = u0.f163a;
                    return floatToRawIntBits5;
                }
                float c11 = q.c(j, j3);
                long floatToRawIntBits6 = (Float.floatToRawIntBits(c11) << 32) | (Float.floatToRawIntBits(c11) & 4294967295L);
                int i14 = u0.f163a;
                return floatToRawIntBits6;
        }
    }

    public String toString() {
        switch (this.f91a) {
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
