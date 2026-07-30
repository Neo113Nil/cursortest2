package androidx.collection;

/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m5boximpl(long j8) {
        return new FloatFloatPair(j8);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m6component1impl(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m7component2impl(long j8) {
        return Float.intBitsToFloat((int) (j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10equalsimpl(long j8, Object obj) {
        return (obj instanceof FloatFloatPair) && j8 == ((FloatFloatPair) obj).m16unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m12getFirstimpl(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m13getSecondimpl(long j8) {
        return Float.intBitsToFloat((int) (j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m14hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m15toStringimpl(long j8) {
        return '(' + Float.intBitsToFloat((int) (j8 >> 32)) + ", " + Float.intBitsToFloat((int) (j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)) + ')';
    }

    public boolean equals(Object obj) {
        return m10equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m14hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m15toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m16unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8constructorimpl(float f8, float f9) {
        return m9constructorimpl((Float.floatToRawIntBits(f9) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (Float.floatToRawIntBits(f8) << 32));
    }
}
