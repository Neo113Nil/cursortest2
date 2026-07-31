package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* compiled from: LazyGridSpan.kt */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getCurrentLineSpan-impl", "getCurrentLineSpan$annotations", "()V", "currentLineSpan", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GridItemSpan {
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m431boximpl(long j) {
        return new GridItemSpan(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m432constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m433equalsimpl(long j, Object obj) {
        return (obj instanceof GridItemSpan) && j == ((GridItemSpan) obj).getPackedValue();
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m434getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m435hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m436toStringimpl(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m433equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m435hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m436toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ GridItemSpan(long j) {
        this.packedValue = j;
    }
}
