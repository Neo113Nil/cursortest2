package t4;

import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class c {
    private final boolean value;

    private /* synthetic */ c(boolean z7) {
        this.value = z7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ c m1481boximpl(boolean z7) {
        return new c(z7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static boolean m1482constructorimpl(boolean z7) {
        return z7;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ boolean m1483constructorimpl$default(boolean z7, int i8, o oVar) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        return m1482constructorimpl(z7);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1484equalsimpl(boolean z7, Object obj) {
        return (obj instanceof c) && z7 == ((c) obj).m1488unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1485equalsimpl0(boolean z7, boolean z8) {
        return z7 == z8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1486hashCodeimpl(boolean z7) {
        if (z7) {
            return 1;
        }
        return z7 ? 1 : 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1487toStringimpl(boolean z7) {
        return "DownloadFileConflictRename(value=" + z7 + ')';
    }

    public boolean equals(Object obj) {
        return m1484equalsimpl(this.value, obj);
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1486hashCodeimpl(this.value);
    }

    public String toString() {
        return m1487toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ boolean m1488unboximpl() {
        return this.value;
    }
}
