package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class CharRange extends CharProgression implements ClosedRange {
    public static final Companion Companion = new Companion(null);

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new CharRange((char) 1, (char) 0);
    }

    public final boolean contains(char c) {
        return Intrinsics.compare((int) this.first, (int) c) <= 0 && Intrinsics.compare((int) c, (int) this.last) <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CharRange)) {
            return false;
        }
        if (isEmpty() && ((CharRange) obj).isEmpty()) {
            return true;
        }
        CharRange charRange = (CharRange) obj;
        return this.first == charRange.first && this.last == charRange.last;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Character.valueOf(this.last);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return Character.valueOf(this.first);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.first * 31) + this.last;
    }

    public final boolean isEmpty() {
        return Intrinsics.compare((int) this.first, (int) this.last) > 0;
    }

    public final String toString() {
        return this.first + ".." + this.last;
    }
}
