package t4;

import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class e {
    private final boolean value;

    private /* synthetic */ e(boolean z7) {
        this.value = z7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ e m1497boximpl(boolean z7) {
        return new e(z7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static boolean m1498constructorimpl(boolean z7) {
        return z7;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ boolean m1499constructorimpl$default(boolean z7, int i8, o oVar) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        return m1498constructorimpl(z7);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1500equalsimpl(boolean z7, Object obj) {
        return (obj instanceof e) && z7 == ((e) obj).m1504unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1501equalsimpl0(boolean z7, boolean z8) {
        return z7 == z8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1502hashCodeimpl(boolean z7) {
        if (z7) {
            return 1;
        }
        return z7 ? 1 : 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1503toStringimpl(boolean z7) {
        return "DownloadFileMD5Verify(value=" + z7 + ')';
    }

    public boolean equals(Object obj) {
        return m1500equalsimpl(this.value, obj);
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1502hashCodeimpl(this.value);
    }

    public String toString() {
        return m1503toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ boolean m1504unboximpl() {
        return this.value;
    }
}
