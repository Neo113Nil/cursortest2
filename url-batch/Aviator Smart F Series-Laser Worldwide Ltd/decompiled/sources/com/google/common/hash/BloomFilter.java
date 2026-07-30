package com.google.common.hash;

import com.github.mikephil.charting.utils.i;
import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private final BloomFilterStrategies.LockFreeBitArray bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    private static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final Funnel<? super T> funnel;
        final int numHashFunctions;
        final Strategy strategy;

        SerialForm(BloomFilter<T> bloomFilter) {
            this.data = BloomFilterStrategies.LockFreeBitArray.toPlainArray(((BloomFilter) bloomFilter).bits.data);
            this.numHashFunctions = ((BloomFilter) bloomFilter).numHashFunctions;
            this.funnel = ((BloomFilter) bloomFilter).funnel;
            this.strategy = ((BloomFilter) bloomFilter).strategy;
        }

        Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    interface Strategy extends Serializable {
        <T> boolean mightContain(@ParametricNullness T t7, Funnel<? super T> funnel, int i8, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(@ParametricNullness T t7, Funnel<? super T> funnel, int i8, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i8, double d8) {
        return create(funnel, i8, d8);
    }

    @VisibleForTesting
    static long optimalNumOfBits(long j8, double d8) {
        if (d8 == i.DOUBLE_EPSILON) {
            d8 = Double.MIN_VALUE;
        }
        return (long) (((-j8) * Math.log(d8)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @VisibleForTesting
    static int optimalNumOfHashFunctions(long j8, long j9) {
        return Math.max(1, (int) Math.round((j9 / j8) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) {
        int i8;
        int i9;
        DataInputStream dataInputStream;
        byte readByte;
        Preconditions.checkNotNull(inputStream, "InputStream");
        Preconditions.checkNotNull(funnel, "Funnel");
        byte b8 = -1;
        try {
            dataInputStream = new DataInputStream(inputStream);
            readByte = dataInputStream.readByte();
            try {
                i9 = UnsignedBytes.toInt(dataInputStream.readByte());
            } catch (RuntimeException e8) {
                e = e8;
                i9 = -1;
            }
        } catch (RuntimeException e9) {
            e = e9;
            i8 = -1;
            i9 = -1;
        }
        try {
            int readInt = dataInputStream.readInt();
            try {
                BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[readByte];
                BloomFilterStrategies.LockFreeBitArray lockFreeBitArray = new BloomFilterStrategies.LockFreeBitArray(LongMath.checkedMultiply(readInt, 64L));
                for (int i10 = 0; i10 < readInt; i10++) {
                    lockFreeBitArray.putData(i10, dataInputStream.readLong());
                }
                return new BloomFilter<>(lockFreeBitArray, i9, funnel, bloomFilterStrategies);
            } catch (RuntimeException e10) {
                e = e10;
                b8 = readByte;
                i8 = readInt;
                StringBuilder sb = new StringBuilder(134);
                sb.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                sb.append((int) b8);
                sb.append(" numHashFunctions: ");
                sb.append(i9);
                sb.append(" dataLength: ");
                sb.append(i8);
                throw new IOException(sb.toString(), e);
            }
        } catch (RuntimeException e11) {
            e = e11;
            b8 = readByte;
            i8 = -1;
            StringBuilder sb2 = new StringBuilder(134);
            sb2.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
            sb2.append((int) b8);
            sb2.append(" numHashFunctions: ");
            sb2.append(i9);
            sb2.append(" dataLength: ");
            sb2.append(i8);
            throw new IOException(sb2.toString(), e);
        }
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(@ParametricNullness T t7) {
        return mightContain(t7);
    }

    public long approximateElementCount() {
        double bitSize = this.bits.bitSize();
        return DoubleMath.roundToLong(((-Math.log1p(-(this.bits.bitCount() / bitSize))) * bitSize) / this.numHashFunctions, RoundingMode.HALF_UP);
    }

    @VisibleForTesting
    long bitSize() {
        return this.bits.bitSize();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.copy(), this.numHashFunctions, this.funnel, this.strategy);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy);
    }

    public double expectedFpp() {
        return Math.pow(this.bits.bitCount() / bitSize(), this.numHashFunctions);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public boolean mightContain(@ParametricNullness T t7) {
        return this.strategy.mightContain(t7, this.funnel, this.numHashFunctions, this.bits);
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness T t7) {
        return this.strategy.put(t7, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        Preconditions.checkArgument(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i8 = this.numHashFunctions;
        int i9 = bloomFilter.numHashFunctions;
        Preconditions.checkArgument(i8 == i9, "BloomFilters must have the same number of hash functions (%s != %s)", i8, i9);
        Preconditions.checkArgument(bitSize() == bloomFilter.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), bloomFilter.bitSize());
        Preconditions.checkArgument(this.strategy.equals(bloomFilter.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, bloomFilter.strategy);
        Preconditions.checkArgument(this.funnel.equals(bloomFilter.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, bloomFilter.funnel);
        this.bits.putAll(bloomFilter.bits);
    }

    public void writeTo(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.checkedCast(this.strategy.ordinal()));
        dataOutputStream.writeByte(UnsignedBytes.checkedCast(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.data.length());
        for (int i8 = 0; i8 < this.bits.data.length(); i8++) {
            dataOutputStream.writeLong(this.bits.data.get(i8));
        }
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i8, Funnel<? super T> funnel, Strategy strategy) {
        Preconditions.checkArgument(i8 > 0, "numHashFunctions (%s) must be > 0", i8);
        Preconditions.checkArgument(i8 <= 255, "numHashFunctions (%s) must be <= 255", i8);
        this.bits = (BloomFilterStrategies.LockFreeBitArray) Preconditions.checkNotNull(lockFreeBitArray);
        this.numHashFunctions = i8;
        this.funnel = (Funnel) Preconditions.checkNotNull(funnel);
        this.strategy = (Strategy) Preconditions.checkNotNull(strategy);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j8, double d8) {
        return create(funnel, j8, d8, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    @VisibleForTesting
    static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j8, double d8, Strategy strategy) {
        Preconditions.checkNotNull(funnel);
        Preconditions.checkArgument(j8 >= 0, "Expected insertions (%s) must be >= 0", j8);
        Preconditions.checkArgument(d8 > i.DOUBLE_EPSILON, "False positive probability (%s) must be > 0.0", Double.valueOf(d8));
        Preconditions.checkArgument(d8 < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d8));
        Preconditions.checkNotNull(strategy);
        if (j8 == 0) {
            j8 = 1;
        }
        long optimalNumOfBits = optimalNumOfBits(j8, d8);
        try {
            return new BloomFilter<>(new BloomFilterStrategies.LockFreeBitArray(optimalNumOfBits), optimalNumOfHashFunctions(j8, optimalNumOfBits), funnel, strategy);
        } catch (IllegalArgumentException e8) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Could not create BloomFilter of ");
            sb.append(optimalNumOfBits);
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString(), e8);
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i8) {
        return create(funnel, i8);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j8) {
        return create(funnel, j8, 0.03d);
    }
}
