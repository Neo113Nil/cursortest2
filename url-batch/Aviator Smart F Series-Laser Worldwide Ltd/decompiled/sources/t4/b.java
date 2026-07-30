package t4;

/* loaded from: classes3.dex */
public final class b {
    private final long value;

    private /* synthetic */ b(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b m1474boximpl(long j8) {
        return new b(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1475constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1476equalsimpl(long j8, Object obj) {
        return (obj instanceof b) && j8 == ((b) obj).m1480unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1477equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1478hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1479toStringimpl(long j8) {
        return "CacheValidTime(value=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m1476equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1478hashCodeimpl(this.value);
    }

    public String toString() {
        return m1479toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1480unboximpl() {
        return this.value;
    }
}
