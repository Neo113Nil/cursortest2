package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntRange extends IntProgression implements ClosedRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final IntRange EMPTY = new IntRange(1, 0, 1);

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final boolean contains(int i) {
        return this.first <= i && i <= this.last;
    }

    @Override // kotlin.ranges.IntProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.first == intRange.first && this.last == intRange.last;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.last);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return Integer.valueOf(this.first);
    }

    @Override // kotlin.ranges.IntProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.first * 31) + this.last;
    }

    @Override // kotlin.ranges.IntProgression
    public final boolean isEmpty() {
        return this.first > this.last;
    }

    @Override // kotlin.ranges.IntProgression
    public final String toString() {
        return this.first + ".." + this.last;
    }
}
