package t4;

import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class i {
    private final Object value;

    private /* synthetic */ i(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ i m1528boximpl(Object obj) {
        return new i(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m1529constructorimpl(Object value) {
        s.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1530equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof i) && s.areEqual(obj, ((i) obj2).m1534unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1531equalsimpl0(Object obj, Object obj2) {
        return s.areEqual(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1532hashCodeimpl(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1533toStringimpl(Object obj) {
        return "RequestGroup(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m1530equalsimpl(this.value, obj);
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1532hashCodeimpl(this.value);
    }

    public String toString() {
        return m1533toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m1534unboximpl() {
        return this.value;
    }
}
