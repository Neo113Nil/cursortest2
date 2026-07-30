package t4;

import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class h {
    private final boolean value;

    private /* synthetic */ h(boolean z7) {
        this.value = z7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ h m1520boximpl(boolean z7) {
        return new h(z7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static boolean m1521constructorimpl(boolean z7) {
        return z7;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ boolean m1522constructorimpl$default(boolean z7, int i8, o oVar) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        return m1521constructorimpl(z7);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1523equalsimpl(boolean z7, Object obj) {
        return (obj instanceof h) && z7 == ((h) obj).m1527unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1524equalsimpl0(boolean z7, boolean z8) {
        return z7 == z8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1525hashCodeimpl(boolean z7) {
        if (z7) {
            return 1;
        }
        return z7 ? 1 : 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1526toStringimpl(boolean z7) {
        return "DownloadTempFile(value=" + z7 + ')';
    }

    public boolean equals(Object obj) {
        return m1523equalsimpl(this.value, obj);
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1525hashCodeimpl(this.value);
    }

    public String toString() {
        return m1526toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ boolean m1527unboximpl() {
        return this.value;
    }
}
