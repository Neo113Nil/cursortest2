package defpackage;

import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class b11 extends a11 {
    public static double a(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float b(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
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

    public static Comparable e(bt btVar, bt btVar2, bt btVar3) {
        if (btVar2.compareTo(btVar3) <= 0) {
            return btVar.compareTo(btVar2) < 0 ? btVar2 : btVar.compareTo(btVar3) > 0 ? btVar3 : btVar;
        }
        af.g("Cannot coerce value to an empty range: maximum ", btVar3, " is less than minimum ", btVar2, 46);
        return null;
    }

    public static a f(IntRange intRange) {
        intRange.getClass();
        u90 u90Var = a.h;
        int i = intRange.d;
        int i2 = intRange.e;
        int i3 = intRange.g > 0 ? 2 : -2;
        u90Var.getClass();
        return new a(i, i2, i3);
    }

    public static IntRange g(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.i.getClass();
        return IntRange.j;
    }
}
