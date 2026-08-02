package kotlin.ranges;

import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.IntProgression;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    public static Comparable coerceAtLeast(Dp dp, Dp dp2) {
        return dp.compareTo(dp2) < 0 ? dp2 : dp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long coerceIn(long j, LongRange longRange) {
        if (longRange instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j), (ClosedFloatingPointRange) longRange)).longValue();
        }
        if (!longRange.isEmpty()) {
            return j < ((Number) longRange.getStart()).longValue() ? ((Number) longRange.getStart()).longValue() : j > ((Number) longRange.getEndInclusive()).longValue() ? ((Number) longRange.getEndInclusive()).longValue() : j;
        }
        Path$$ExternalSyntheticBUOutline0.m("Cannot coerce value to an empty range: ", 46, longRange);
        return 0L;
    }

    public static IntProgression downTo(int i, int i2) {
        IntProgression.Companion.getClass();
        return new IntProgression(i, i2, -1);
    }

    public static int random(IntRange intRange, Random.Default r1) {
        r1.getClass();
        try {
            return RandomKt.nextInt(r1, intRange);
        } catch (IllegalArgumentException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e.getMessage());
            return 0;
        }
    }

    public static IntProgression step(int i, IntRange intRange) {
        intRange.getClass();
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            Path$$ExternalSyntheticBUOutline0.m("Step must be positive, was: ", 46, valueOf);
            return null;
        }
        IntProgression.Companion companion = IntProgression.Companion;
        int i2 = intRange.first;
        int i3 = intRange.last;
        if (intRange.step <= 0) {
            i = -i;
        }
        companion.getClass();
        return new IntProgression(i2, i3, i);
    }

    public static IntRange until(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.INSTANCE.getClass();
        return IntRange.EMPTY;
    }

    public static int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boxes$$ExternalSyntheticOutline1.m1149m(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
        return 0L;
    }

    public static float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Cannot coerce value to an empty range: maximum ", " is less than minimum ", d3);
        m.append(d2);
        m.append('.');
        throw new IllegalArgumentException(m.toString());
    }

    public static Comparable coerceIn(Comparable comparable, ClosedFloatingPointRange closedFloatingPointRange) {
        closedFloatingPointRange.getClass();
        ClosedFloatRange closedFloatRange = (ClosedFloatRange) closedFloatingPointRange;
        if (!closedFloatRange.isEmpty()) {
            return (!closedFloatRange.lessThanOrEquals(comparable, closedFloatRange.getStart()) || closedFloatRange.lessThanOrEquals(closedFloatRange.getStart(), comparable)) ? (!closedFloatRange.lessThanOrEquals(closedFloatRange.getEndInclusive(), comparable) || closedFloatRange.lessThanOrEquals(comparable, closedFloatRange.getEndInclusive())) ? comparable : closedFloatRange.getEndInclusive() : closedFloatRange.getStart();
        }
        Path$$ExternalSyntheticBUOutline0.m("Cannot coerce value to an empty range: ", 46, closedFloatRange);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int coerceIn(int i, IntRange intRange) {
        int i2 = intRange.last;
        int i3 = intRange.first;
        if (intRange instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i), (ClosedFloatingPointRange) intRange)).intValue();
        }
        if (!intRange.isEmpty()) {
            if (i < Integer.valueOf(i3).intValue()) {
                return Integer.valueOf(i3).intValue();
            }
            return i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        Path$$ExternalSyntheticBUOutline0.m("Cannot coerce value to an empty range: ", 46, intRange);
        return 0;
    }

    public static Comparable coerceIn(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2 != null && comparable3 != null) {
            if (comparable2.compareTo(comparable3) <= 0) {
                if (comparable.compareTo(comparable2) < 0) {
                    return comparable2;
                }
                if (comparable.compareTo(comparable3) > 0) {
                    return comparable3;
                }
            } else {
                Drop$$ExternalSyntheticBUOutline0.m(46, comparable3, " is less than minimum ", comparable2, "Cannot coerce value to an empty range: maximum ");
                return null;
            }
        } else {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }
}
