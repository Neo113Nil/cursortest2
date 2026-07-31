package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* compiled from: StateObjectImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "", "mask", "constructor-impl", "(I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMask", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReaderKind {
    private final int mask;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1215constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1216equalsimpl(int i, Object obj) {
        return (obj instanceof ReaderKind) && i == ((ReaderKind) obj).getMask();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1217hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1218toStringimpl(int i) {
        return "ReaderKind(mask=" + i + ')';
    }

    public boolean equals(Object other) {
        return m1216equalsimpl(this.mask, other);
    }

    public int hashCode() {
        return m1217hashCodeimpl(this.mask);
    }

    public String toString() {
        return m1218toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getMask() {
        return this.mask;
    }
}
