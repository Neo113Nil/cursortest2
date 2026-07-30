package t4;

import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a {
    private final String value;

    private /* synthetic */ a(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a m1467boximpl(String str) {
        return new a(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m1468constructorimpl(String value) {
        s.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1469equalsimpl(String str, Object obj) {
        return (obj instanceof a) && s.areEqual(str, ((a) obj).m1473unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1470equalsimpl0(String str, String str2) {
        return s.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1471hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1472toStringimpl(String str) {
        return "CacheKey(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m1469equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1471hashCodeimpl(this.value);
    }

    public String toString() {
        return m1472toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1473unboximpl() {
        return this.value;
    }
}
