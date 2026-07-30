package t4;

import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class j {
    private final Object value;

    private /* synthetic */ j(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ j m1535boximpl(Object obj) {
        return new j(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m1536constructorimpl(Object value) {
        s.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1537equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof j) && s.areEqual(obj, ((j) obj2).m1541unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1538equalsimpl0(Object obj, Object obj2) {
        return s.areEqual(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1539hashCodeimpl(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1540toStringimpl(Object obj) {
        return "RequestId(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m1537equalsimpl(this.value, obj);
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1539hashCodeimpl(this.value);
    }

    public String toString() {
        return m1540toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m1541unboximpl() {
        return this.value;
    }
}
