package kotlin.random;

import com.github.mikephil.charting.utils.i;
import j6.m;
import java.io.Serializable;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class Random {
    public static final Default Default = new Default(null);
    private static final Random defaultRandom = b6.b.IMPLEMENTATIONS.defaultPlatformRandom();

    public static final class Default extends Random implements Serializable {

        private static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        public /* synthetic */ Default(o oVar) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i8) {
            return Random.defaultRandom.nextBits(i8);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array) {
            s.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        private Default() {
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int i8) {
            return Random.defaultRandom.nextBytes(i8);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d8) {
            return Random.defaultRandom.nextDouble(d8);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i8) {
            return Random.defaultRandom.nextInt(i8);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j8) {
            return Random.defaultRandom.nextLong(j8);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array, int i8, int i9) {
            s.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array, i8, i9);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d8, double d9) {
            return Random.defaultRandom.nextDouble(d8, d9);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i8, int i9) {
            return Random.defaultRandom.nextInt(i8, i9);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j8, long j9) {
            return Random.defaultRandom.nextLong(j8, j9);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return random.nextBytes(bArr, i8, i9);
    }

    public abstract int nextBits(int i8);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(byte[] array, int i8, int i9) {
        s.checkNotNullParameter(array, "array");
        if (!new m(0, array.length).contains(i8) || !new m(0, array.length).contains(i9)) {
            throw new IllegalArgumentException(("fromIndex (" + i8 + ") or toIndex (" + i9 + ") are out of range: 0.." + array.length + '.').toString());
        }
        if (i8 > i9) {
            throw new IllegalArgumentException(("fromIndex (" + i8 + ") must be not greater than toIndex (" + i9 + ").").toString());
        }
        int i10 = (i9 - i8) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            int nextInt = nextInt();
            array[i8] = (byte) nextInt;
            array[i8 + 1] = (byte) (nextInt >>> 8);
            array[i8 + 2] = (byte) (nextInt >>> 16);
            array[i8 + 3] = (byte) (nextInt >>> 24);
            i8 += 4;
        }
        int i12 = i9 - i8;
        int nextBits = nextBits(i12 * 8);
        for (int i13 = 0; i13 < i12; i13++) {
            array[i8 + i13] = (byte) (nextBits >>> (i13 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return c.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double d8) {
        return nextDouble(i.DOUBLE_EPSILON, d8);
    }

    public int nextInt(int i8) {
        return nextInt(0, i8);
    }

    public long nextLong(long j8) {
        return nextLong(0L, j8);
    }

    public double nextDouble(double d8, double d9) {
        double nextDouble;
        d.checkRangeBounds(d8, d9);
        double d10 = d9 - d8;
        if (Double.isInfinite(d10) && !Double.isInfinite(d8) && !Double.isNaN(d8) && !Double.isInfinite(d9) && !Double.isNaN(d9)) {
            double d11 = 2;
            double nextDouble2 = nextDouble() * ((d9 / d11) - (d8 / d11));
            nextDouble = d8 + nextDouble2 + nextDouble2;
        } else {
            nextDouble = d8 + (nextDouble() * d10);
        }
        return nextDouble >= d9 ? Math.nextAfter(d9, Double.NEGATIVE_INFINITY) : nextDouble;
    }

    public int nextInt(int i8, int i9) {
        int nextInt;
        int i10;
        int i11;
        d.checkRangeBounds(i8, i9);
        int i12 = i9 - i8;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                i11 = nextBits(d.fastLog2(i12));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i10 = nextInt % i12;
                } while ((nextInt - i10) + (i12 - 1) < 0);
                i11 = i10;
            }
            return i8 + i11;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (i8 <= nextInt2 && nextInt2 < i9) {
                return nextInt2;
            }
        }
    }

    public long nextLong(long j8, long j9) {
        long nextLong;
        long j10;
        long j11;
        int nextInt;
        d.checkRangeBounds(j8, j9);
        long j12 = j9 - j8;
        if (j12 > 0) {
            if (((-j12) & j12) == j12) {
                int i8 = (int) j12;
                int i9 = (int) (j12 >>> 32);
                if (i8 != 0) {
                    nextInt = nextBits(d.fastLog2(i8));
                } else if (i9 == 1) {
                    nextInt = nextInt();
                } else {
                    j11 = (nextBits(d.fastLog2(i9)) << 32) + (nextInt() & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32);
                }
                j11 = nextInt & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j10 = nextLong % j12;
                } while ((nextLong - j10) + (j12 - 1) < 0);
                j11 = j10;
            }
            return j8 + j11;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (j8 <= nextLong2 && nextLong2 < j9) {
                return nextLong2;
            }
        }
    }

    public byte[] nextBytes(byte[] array) {
        s.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int i8) {
        return nextBytes(new byte[i8]);
    }
}
