package t4;

import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class f {
    private final String value;

    private /* synthetic */ f(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ f m1505boximpl(String str) {
        return new f(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m1506constructorimpl(String value) {
        s.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1507equalsimpl(String str, Object obj) {
        return (obj instanceof f) && s.areEqual(str, ((f) obj).m1511unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1508equalsimpl0(String str, String str2) {
        return s.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1509hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1510toStringimpl(String str) {
        return "DownloadFileName(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m1507equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1509hashCodeimpl(this.value);
    }

    public String toString() {
        return m1510toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1511unboximpl() {
        return this.value;
    }
}
