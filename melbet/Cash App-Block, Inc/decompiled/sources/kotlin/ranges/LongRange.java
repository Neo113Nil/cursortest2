package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class LongRange extends LongProgression implements ClosedRange {
    public static final Companion Companion = new Companion(null);
    public static final LongRange EMPTY = new LongRange(1, 0);

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public LongRange(long j, long j2) {
        super(j, j2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LongRange)) {
            return false;
        }
        if (isEmpty() && ((LongRange) obj).isEmpty()) {
            return true;
        }
        LongRange longRange = (LongRange) obj;
        return this.first == longRange.first && this.last == longRange.last;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Long.valueOf(this.last);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return Long.valueOf(this.first);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.first;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.last;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.first > this.last;
    }

    public final String toString() {
        return this.first + ".." + this.last;
    }
}
