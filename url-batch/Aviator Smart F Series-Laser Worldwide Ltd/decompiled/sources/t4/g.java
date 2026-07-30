package t4;

import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class g {
    private final boolean value;

    private /* synthetic */ g(boolean z7) {
        this.value = z7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ g m1512boximpl(boolean z7) {
        return new g(z7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static boolean m1513constructorimpl(boolean z7) {
        return z7;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ boolean m1514constructorimpl$default(boolean z7, int i8, o oVar) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        return m1513constructorimpl(z7);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1515equalsimpl(boolean z7, Object obj) {
        return (obj instanceof g) && z7 == ((g) obj).m1519unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1516equalsimpl0(boolean z7, boolean z8) {
        return z7 == z8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1517hashCodeimpl(boolean z7) {
        if (z7) {
            return 1;
        }
        return z7 ? 1 : 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1518toStringimpl(boolean z7) {
        return "DownloadFileNameDecode(value=" + z7 + ')';
    }

    public boolean equals(Object obj) {
        return m1515equalsimpl(this.value, obj);
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1517hashCodeimpl(this.value);
    }

    public String toString() {
        return m1518toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ boolean m1519unboximpl() {
        return this.value;
    }
}
