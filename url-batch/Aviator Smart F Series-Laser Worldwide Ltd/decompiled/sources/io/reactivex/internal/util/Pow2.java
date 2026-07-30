package io.reactivex.internal.util;

/* loaded from: classes3.dex */
public final class Pow2 {
    private Pow2() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i8) {
        return (i8 & (i8 + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i8) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i8 - 1));
    }
}
