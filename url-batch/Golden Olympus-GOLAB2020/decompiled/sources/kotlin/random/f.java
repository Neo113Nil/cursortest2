package kotlin.random;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final String a(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(int i4, int i5) {
        if (i5 <= i4) {
            throw new IllegalArgumentException(a(Integer.valueOf(i4), Integer.valueOf(i5)).toString());
        }
    }

    public static final int c(int i4) {
        return 31 - Integer.numberOfLeadingZeros(i4);
    }

    public static final int d(int i4, int i5) {
        return (i4 >>> (32 - i5)) & ((-i5) >> 31);
    }
}
