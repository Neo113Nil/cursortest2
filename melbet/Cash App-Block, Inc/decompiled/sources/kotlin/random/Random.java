package kotlin.random;

import java.io.Serializable;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class Random {
    public static final Default Default = new Default(null);
    public static final AbstractPlatformRandom defaultRandom;

    static {
        Integer num = JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion;
        defaultRandom = (num == null || num.intValue() >= 34) ? new PlatformThreadLocalRandom() : new FallbackThreadLocalRandom();
    }

    public abstract int nextBits(int i);

    public double nextDouble(double d, double d2) {
        double nextDouble;
        RandomKt.checkRangeBounds(d, d2);
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            nextDouble = d + (nextDouble() * d3);
        } else {
            double nextDouble2 = ((d2 / 2.0d) - (d / 2.0d)) * nextDouble();
            nextDouble = d + nextDouble2 + nextDouble2;
        }
        return nextDouble >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : nextDouble;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt(int i, int i2) {
        int nextInt;
        int i3;
        int i4;
        RandomKt.checkRangeBounds(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = nextBits(RandomKt.fastLog2(i5));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i3 = nextInt % i5;
                } while ((i5 - 1) + (nextInt - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (i <= nextInt2 && nextInt2 < i2) {
                return nextInt2;
            }
        }
    }

    public long nextLong(long j, long j2) {
        long nextLong;
        long j3;
        long j4;
        int nextInt;
        RandomKt.checkRangeBounds(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    nextInt = nextBits(RandomKt.fastLog2(i));
                } else if (i2 == 1) {
                    nextInt = nextInt();
                } else {
                    j4 = (nextBits(RandomKt.fastLog2(i2)) << 32) + (nextInt() & BodyPartID.bodyIdMax);
                }
                j4 = nextInt & BodyPartID.bodyIdMax;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j3 = nextLong % j5;
                } while ((j5 - 1) + (nextLong - j3) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (j <= nextLong2 && nextLong2 < j2) {
                return nextLong2;
            }
        }
    }

    public final class Default extends Random implements Serializable {
        public Default(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Override // kotlin.random.Random
        public final int nextBits(int i) {
            return Random.defaultRandom.nextBits(i);
        }

        @Override // kotlin.random.Random
        public final double nextDouble(double d, double d2) {
            return Random.defaultRandom.nextDouble(0.0d, d2);
        }

        @Override // kotlin.random.Random
        public final float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public final int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public final long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public final long nextLong(long j, long j2) {
            throw null;
        }

        @Override // kotlin.random.Random
        public final int nextInt(int i) {
            return Random.defaultRandom.nextInt(i);
        }

        @Override // kotlin.random.Random
        public final double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public final int nextInt(int i, int i2) {
            return Random.defaultRandom.nextInt(i, i2);
        }
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public int nextInt() {
        return nextBits(32);
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }
}
