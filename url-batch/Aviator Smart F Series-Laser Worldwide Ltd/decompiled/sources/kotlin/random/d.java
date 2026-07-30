package kotlin.random;

import j6.m;
import j6.p;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class d {
    public static final Random Random(int i8) {
        return new XorWowRandom(i8, i8 >> 31);
    }

    public static final String boundsErrorMessage(Object from, Object until) {
        s.checkNotNullParameter(from, "from");
        s.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void checkRangeBounds(int i8, int i9) {
        if (i9 <= i8) {
            throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(i8), Integer.valueOf(i9)).toString());
        }
    }

    public static final int fastLog2(int i8) {
        return 31 - Integer.numberOfLeadingZeros(i8);
    }

    public static final int nextInt(Random random, m range) {
        s.checkNotNullParameter(random, "<this>");
        s.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Integer.MAX_VALUE ? random.nextInt(range.getFirst(), range.getLast() + 1) : range.getFirst() > Integer.MIN_VALUE ? random.nextInt(range.getFirst() - 1, range.getLast()) + 1 : random.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final long nextLong(Random random, p range) {
        s.checkNotNullParameter(random, "<this>");
        s.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Long.MAX_VALUE ? random.nextLong(range.getFirst(), range.getLast() + 1) : range.getFirst() > Long.MIN_VALUE ? random.nextLong(range.getFirst() - 1, range.getLast()) + 1 : random.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int takeUpperBits(int i8, int i9) {
        return (i8 >>> (32 - i9)) & ((-i9) >> 31);
    }

    public static final Random Random(long j8) {
        return new XorWowRandom((int) j8, (int) (j8 >> 32));
    }

    public static final void checkRangeBounds(long j8, long j9) {
        if (j9 <= j8) {
            throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(j8), Long.valueOf(j9)).toString());
        }
    }

    public static final void checkRangeBounds(double d8, double d9) {
        if (d9 <= d8) {
            throw new IllegalArgumentException(boundsErrorMessage(Double.valueOf(d8), Double.valueOf(d9)).toString());
        }
    }
}
