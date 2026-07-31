package W1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes3.dex */
public abstract class C {
    public static final int a(int i4, int i5) {
        return Intrinsics.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j4, long j5) {
        return Intrinsics.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
    }

    public static final String c(long j4) {
        return d(j4, 10);
    }

    public static final String d(long j4, int i4) {
        if (j4 >= 0) {
            String l4 = Long.toString(j4, CharsKt.checkRadix(i4));
            Intrinsics.checkNotNullExpressionValue(l4, "toString(...)");
            return l4;
        }
        long j5 = i4;
        long j6 = ((j4 >>> 1) / j5) << 1;
        long j7 = j4 - (j6 * j5);
        if (j7 >= j5) {
            j7 -= j5;
            j6++;
        }
        StringBuilder sb = new StringBuilder();
        String l5 = Long.toString(j6, CharsKt.checkRadix(i4));
        Intrinsics.checkNotNullExpressionValue(l5, "toString(...)");
        sb.append(l5);
        String l6 = Long.toString(j7, CharsKt.checkRadix(i4));
        Intrinsics.checkNotNullExpressionValue(l6, "toString(...)");
        sb.append(l6);
        return sb.toString();
    }
}
