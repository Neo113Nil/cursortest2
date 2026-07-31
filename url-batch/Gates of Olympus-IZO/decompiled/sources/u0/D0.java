package u0;

/* loaded from: classes.dex */
public interface D0 {
    float a();

    default float b() {
        return Float.MAX_VALUE;
    }

    default long c() {
        float f3 = 48;
        return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }
}
