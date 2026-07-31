package x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface u1 {
    default float a() {
        return Float.MAX_VALUE;
    }

    float b();

    default long c() {
        float f6 = 48;
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
    }
}
