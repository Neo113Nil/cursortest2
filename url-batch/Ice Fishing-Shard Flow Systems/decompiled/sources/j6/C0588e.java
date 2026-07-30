package j6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* renamed from: j6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0588e extends C0587d {
    public static long a(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static kotlin.ranges.a b(IntRange intRange, int i2) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        boolean z7 = i2 > 0;
        Integer step = Integer.valueOf(i2);
        Intrinsics.checkNotNullParameter(step, "step");
        if (!z7) {
            throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
        }
        C0584a c0584a = kotlin.ranges.a.f6172l;
        int i5 = intRange.f6173d;
        int i7 = intRange.f6174e;
        if (intRange.f6175i <= 0) {
            i2 = -i2;
        }
        c0584a.getClass();
        return new kotlin.ranges.a(i5, i7, i2);
    }

    public static IntRange c(int i2, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new IntRange(i2, i5 - 1, 1);
        }
        IntRange.f6170m.getClass();
        return IntRange.f6171n;
    }
}
