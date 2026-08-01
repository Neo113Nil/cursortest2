package be;

import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f extends e {
    public static double a(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float b(float f3, float f10, float f11) {
        if (f10 <= f11) {
            return f3 < f10 ? f10 : f3 > f11 ? f11 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int c(int i3, int i10, int i11) {
        if (i10 <= i11) {
            return i3 < i10 ? i10 : i3 > i11 ? i11 : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long d(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static kotlin.ranges.a e(IntRange intRange) {
        intRange.getClass();
        b bVar = kotlin.ranges.a.f5598r;
        int i3 = intRange.f5599d;
        int i10 = intRange.f5600e;
        int i11 = intRange.f5601i > 0 ? 2 : -2;
        bVar.getClass();
        return new kotlin.ranges.a(i3, i10, i11);
    }

    public static IntRange f(int i3, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new IntRange(i3, i10 - 1, 1);
        }
        IntRange.f5596s.getClass();
        return IntRange.f5597t;
    }
}
