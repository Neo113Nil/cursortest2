package kotlin.comparisons;

import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
class h extends g {
    public static <T extends Comparable<? super T>> T maxOf(T a8, T b8) {
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(b8, "b");
        return a8.compareTo(b8) >= 0 ? a8 : b8;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a8, T b8) {
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(b8, "b");
        return a8.compareTo(b8) <= 0 ? a8 : b8;
    }

    private static final byte maxOf(byte b8, byte b9) {
        return (byte) Math.max((int) b8, (int) b9);
    }

    private static final byte minOf(byte b8, byte b9) {
        return (byte) Math.min((int) b8, (int) b9);
    }

    private static final short maxOf(short s7, short s8) {
        return (short) Math.max((int) s7, (int) s8);
    }

    private static final short minOf(short s7, short s8) {
        return (short) Math.min((int) s7, (int) s8);
    }

    private static final int maxOf(int i8, int i9) {
        return Math.max(i8, i9);
    }

    private static final int minOf(int i8, int i9) {
        return Math.min(i8, i9);
    }

    private static final long maxOf(long j8, long j9) {
        return Math.max(j8, j9);
    }

    private static final long minOf(long j8, long j9) {
        return Math.min(j8, j9);
    }

    private static final float maxOf(float f8, float f9) {
        return Math.max(f8, f9);
    }

    private static final float minOf(float f8, float f9) {
        return Math.min(f8, f9);
    }

    private static final double maxOf(double d8, double d9) {
        return Math.max(d8, d9);
    }

    private static final double minOf(double d8, double d9) {
        return Math.min(d8, d9);
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a8, T b8, T c8) {
        Comparable maxOf;
        Comparable maxOf2;
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(b8, "b");
        s.checkNotNullParameter(c8, "c");
        maxOf = maxOf(b8, c8);
        maxOf2 = maxOf(a8, maxOf);
        return (T) maxOf2;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a8, T b8, T c8) {
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(b8, "b");
        s.checkNotNullParameter(c8, "c");
        return (T) minOf(a8, minOf(b8, c8));
    }

    private static final byte maxOf(byte b8, byte b9, byte b10) {
        return (byte) Math.max((int) b8, Math.max((int) b9, (int) b10));
    }

    private static final byte minOf(byte b8, byte b9, byte b10) {
        return (byte) Math.min((int) b8, Math.min((int) b9, (int) b10));
    }

    private static final short maxOf(short s7, short s8, short s9) {
        return (short) Math.max((int) s7, Math.max((int) s8, (int) s9));
    }

    private static final short minOf(short s7, short s8, short s9) {
        return (short) Math.min((int) s7, Math.min((int) s8, (int) s9));
    }

    private static final int maxOf(int i8, int i9, int i10) {
        return Math.max(i8, Math.max(i9, i10));
    }

    private static final int minOf(int i8, int i9, int i10) {
        return Math.min(i8, Math.min(i9, i10));
    }

    private static final long maxOf(long j8, long j9, long j10) {
        return Math.max(j8, Math.max(j9, j10));
    }

    private static final long minOf(long j8, long j9, long j10) {
        return Math.min(j8, Math.min(j9, j10));
    }

    private static final float maxOf(float f8, float f9, float f10) {
        return Math.max(f8, Math.max(f9, f10));
    }

    private static final float minOf(float f8, float f9, float f10) {
        return Math.min(f8, Math.min(f9, f10));
    }

    private static final double maxOf(double d8, double d9, double d10) {
        return Math.max(d8, Math.max(d9, d10));
    }

    private static final double minOf(double d8, double d9, double d10) {
        return Math.min(d8, Math.min(d9, d10));
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a8, T... other) {
        Comparable maxOf;
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(other, "other");
        for (T t7 : other) {
            maxOf = maxOf(a8, t7);
            a8 = (T) maxOf;
        }
        return a8;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a8, T... other) {
        s.checkNotNullParameter(a8, "a");
        s.checkNotNullParameter(other, "other");
        for (T t7 : other) {
            a8 = (T) minOf(a8, t7);
        }
        return a8;
    }

    public static final byte maxOf(byte b8, byte... other) {
        s.checkNotNullParameter(other, "other");
        for (byte b9 : other) {
            b8 = (byte) Math.max((int) b8, (int) b9);
        }
        return b8;
    }

    public static final byte minOf(byte b8, byte... other) {
        s.checkNotNullParameter(other, "other");
        for (byte b9 : other) {
            b8 = (byte) Math.min((int) b8, (int) b9);
        }
        return b8;
    }

    public static final short maxOf(short s7, short... other) {
        s.checkNotNullParameter(other, "other");
        for (short s8 : other) {
            s7 = (short) Math.max((int) s7, (int) s8);
        }
        return s7;
    }

    public static final short minOf(short s7, short... other) {
        s.checkNotNullParameter(other, "other");
        for (short s8 : other) {
            s7 = (short) Math.min((int) s7, (int) s8);
        }
        return s7;
    }

    public static final int maxOf(int i8, int... other) {
        s.checkNotNullParameter(other, "other");
        for (int i9 : other) {
            i8 = Math.max(i8, i9);
        }
        return i8;
    }

    public static final int minOf(int i8, int... other) {
        s.checkNotNullParameter(other, "other");
        for (int i9 : other) {
            i8 = Math.min(i8, i9);
        }
        return i8;
    }

    public static final long maxOf(long j8, long... other) {
        s.checkNotNullParameter(other, "other");
        for (long j9 : other) {
            j8 = Math.max(j8, j9);
        }
        return j8;
    }

    public static final long minOf(long j8, long... other) {
        s.checkNotNullParameter(other, "other");
        for (long j9 : other) {
            j8 = Math.min(j8, j9);
        }
        return j8;
    }

    public static final float maxOf(float f8, float... other) {
        s.checkNotNullParameter(other, "other");
        for (float f9 : other) {
            f8 = Math.max(f8, f9);
        }
        return f8;
    }

    public static final float minOf(float f8, float... other) {
        s.checkNotNullParameter(other, "other");
        for (float f9 : other) {
            f8 = Math.min(f8, f9);
        }
        return f8;
    }

    public static final double maxOf(double d8, double... other) {
        s.checkNotNullParameter(other, "other");
        for (double d9 : other) {
            d8 = Math.max(d8, d9);
        }
        return d8;
    }

    public static final double minOf(double d8, double... other) {
        s.checkNotNullParameter(other, "other");
        for (double d9 : other) {
            d8 = Math.min(d8, d9);
        }
        return d8;
    }
}
