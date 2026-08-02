package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

/* loaded from: classes9.dex */
public final class ComparableRange implements ClosedRange {
    public final Comparable endInclusive;
    public final Comparable start;

    public ComparableRange(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        this.start = comparable;
        this.endInclusive = comparable2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComparableRange)) {
            return false;
        }
        if (ClosedRange.DefaultImpls.isEmpty(this) && ClosedRange.DefaultImpls.isEmpty((ComparableRange) obj)) {
            return true;
        }
        ComparableRange comparableRange = (ComparableRange) obj;
        return Intrinsics.areEqual(this.start, comparableRange.start) && Intrinsics.areEqual(this.endInclusive, comparableRange.endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return this.endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return this.start;
    }

    public final int hashCode() {
        if (ClosedRange.DefaultImpls.isEmpty(this)) {
            return -1;
        }
        return this.endInclusive.hashCode() + (this.start.hashCode() * 31);
    }

    public final String toString() {
        return this.start + ".." + this.endInclusive;
    }
}
