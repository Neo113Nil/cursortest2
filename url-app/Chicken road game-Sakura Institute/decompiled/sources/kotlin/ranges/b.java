package kotlin.ranges;

import R2.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public class b extends c {
    public static float a(float f4, float f5) {
        return f4 < f5 ? f5 : f4;
    }

    public static float b(float f4, float f5) {
        return f4 > f5 ? f5 : f4;
    }

    public static double c(double d4, double d5, double d6) {
        if (d5 <= d6) {
            return d4 < d5 ? d5 : d4 > d6 ? d6 : d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d6 + " is less than minimum " + d5 + '.');
    }

    public static float d(float f4, float f5, float f6) {
        if (f5 <= f6) {
            return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f6 + " is less than minimum " + f5 + '.');
    }

    public static int e(int i2, int i4, int i5) {
        if (i4 <= i5) {
            return i2 < i4 ? i4 : i2 > i5 ? i5 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i5 + " is less than minimum " + i4 + '.');
    }

    public static long f(long j4, long j5, long j6) {
        if (j5 <= j6) {
            return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j6 + " is less than minimum " + j5 + '.');
    }

    public static a g(IntRange intRange, int i2) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        boolean z4 = i2 > 0;
        Integer step = Integer.valueOf(i2);
        Intrinsics.checkNotNullParameter(step, "step");
        if (!z4) {
            throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
        }
        a.C0003a c0003a = a.f7504j;
        int i4 = intRange.f7505d;
        if (intRange.f7507i <= 0) {
            i2 = -i2;
        }
        c0003a.getClass();
        return new a(i4, intRange.f7506e, i2);
    }

    public static IntRange h(int i2, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new IntRange(i2, i4 - 1, 1);
        }
        IntRange.f7502k.getClass();
        return IntRange.f7503l;
    }
}
