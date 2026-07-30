package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public final class e0 {
    private final Object value;

    private /* synthetic */ e0(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ e0 m1273boximpl(Object obj) {
        return new e0(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S extends d0> Object m1274constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1275equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof e0) && kotlin.jvm.internal.s.areEqual(obj, ((e0) obj2).m1281unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1276equalsimpl0(Object obj, Object obj2) {
        return kotlin.jvm.internal.s.areEqual(obj, obj2);
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final d0 m1277getSegmentimpl(Object obj) {
        if (obj == e.CLOSED) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (d0) obj;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1278hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m1279isClosedimpl(Object obj) {
        return obj == e.CLOSED;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1280toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m1275equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1278hashCodeimpl(this.value);
    }

    public String toString() {
        return m1280toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m1281unboximpl() {
        return this.value;
    }
}
