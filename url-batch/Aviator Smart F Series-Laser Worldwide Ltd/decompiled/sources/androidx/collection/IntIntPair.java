package androidx.collection;

/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m17boximpl(long j8) {
        return new IntIntPair(j8);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m18component1impl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m19component2impl(long j8) {
        return (int) (j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m21constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22equalsimpl(long j8, Object obj) {
        return (obj instanceof IntIntPair) && j8 == ((IntIntPair) obj).m28unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m24getFirstimpl(long j8) {
        return (int) (j8 >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m25getSecondimpl(long j8) {
        return (int) (j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27toStringimpl(long j8) {
        return '(' + m24getFirstimpl(j8) + ", " + m25getSecondimpl(j8) + ')';
    }

    public boolean equals(Object obj) {
        return m22equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m26hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m27toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m28unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20constructorimpl(int i8, int i9) {
        return m21constructorimpl((i9 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (i8 << 32));
    }
}
