package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t7, Funnel<? super T> funnel, int i8, LockFreeBitArray lockFreeBitArray) {
            long bitSize = lockFreeBitArray.bitSize();
            long asLong = Hashing.murmur3_128().hashObject(t7, funnel).asLong();
            int i9 = (int) asLong;
            int i10 = (int) (asLong >>> 32);
            for (int i11 = 1; i11 <= i8; i11++) {
                int i12 = (i11 * i10) + i9;
                if (i12 < 0) {
                    i12 = ~i12;
                }
                if (!lockFreeBitArray.get(i12 % bitSize)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t7, Funnel<? super T> funnel, int i8, LockFreeBitArray lockFreeBitArray) {
            long bitSize = lockFreeBitArray.bitSize();
            long asLong = Hashing.murmur3_128().hashObject(t7, funnel).asLong();
            int i9 = (int) asLong;
            int i10 = (int) (asLong >>> 32);
            boolean z7 = false;
            for (int i11 = 1; i11 <= i8; i11++) {
                int i12 = (i11 * i10) + i9;
                if (i12 < 0) {
                    i12 = ~i12;
                }
                z7 |= lockFreeBitArray.set(i12 % bitSize);
            }
            return z7;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t7, Funnel<? super T> funnel, int i8, LockFreeBitArray lockFreeBitArray) {
            long bitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t7, funnel).getBytesInternal();
            long lowerEight = lowerEight(bytesInternal);
            long upperEight = upperEight(bytesInternal);
            for (int i9 = 0; i9 < i8; i9++) {
                if (!lockFreeBitArray.get((Long.MAX_VALUE & lowerEight) % bitSize)) {
                    return false;
                }
                lowerEight += upperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t7, Funnel<? super T> funnel, int i8, LockFreeBitArray lockFreeBitArray) {
            long bitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t7, funnel).getBytesInternal();
            long lowerEight = lowerEight(bytesInternal);
            long upperEight = upperEight(bytesInternal);
            boolean z7 = false;
            for (int i9 = 0; i9 < i8; i9++) {
                z7 |= lockFreeBitArray.set((Long.MAX_VALUE & lowerEight) % bitSize);
                lowerEight += upperEight;
            }
            return z7;
        }
    };

    static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final LongAddable bitCount;
        final AtomicLongArray data;

        LockFreeBitArray(long j8) {
            Preconditions.checkArgument(j8 > 0, "data length is zero!");
            this.data = new AtomicLongArray(Ints.checkedCast(LongMath.divide(j8, 64L, RoundingMode.CEILING)));
            this.bitCount = LongAddables.create();
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i8 = 0; i8 < length; i8++) {
                jArr[i8] = atomicLongArray.get(i8);
            }
            return jArr;
        }

        long bitCount() {
            return this.bitCount.sum();
        }

        long bitSize() {
            return this.data.length() * 64;
        }

        LockFreeBitArray copy() {
            return new LockFreeBitArray(toPlainArray(this.data));
        }

        int dataLength() {
            return this.data.length();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(toPlainArray(this.data), toPlainArray(((LockFreeBitArray) obj).data));
            }
            return false;
        }

        boolean get(long j8) {
            return ((1 << ((int) j8)) & this.data.get((int) (j8 >>> 6))) != 0;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.data));
        }

        void putAll(LockFreeBitArray lockFreeBitArray) {
            Preconditions.checkArgument(this.data.length() == lockFreeBitArray.data.length(), "BitArrays must be of equal length (%s != %s)", this.data.length(), lockFreeBitArray.data.length());
            for (int i8 = 0; i8 < this.data.length(); i8++) {
                putData(i8, lockFreeBitArray.data.get(i8));
            }
        }

        void putData(int i8, long j8) {
            long j9;
            long j10;
            do {
                j9 = this.data.get(i8);
                j10 = j9 | j8;
                if (j9 == j10) {
                    return;
                }
            } while (!this.data.compareAndSet(i8, j9, j10));
            this.bitCount.add(Long.bitCount(j10) - Long.bitCount(j9));
        }

        boolean set(long j8) {
            long j9;
            long j10;
            if (get(j8)) {
                return false;
            }
            int i8 = (int) (j8 >>> 6);
            long j11 = 1 << ((int) j8);
            do {
                j9 = this.data.get(i8);
                j10 = j9 | j11;
                if (j9 == j10) {
                    return false;
                }
            } while (!this.data.compareAndSet(i8, j9, j10));
            this.bitCount.increment();
            return true;
        }

        LockFreeBitArray(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.data = new AtomicLongArray(jArr);
            this.bitCount = LongAddables.create();
            long j8 = 0;
            for (long j9 : jArr) {
                j8 += Long.bitCount(j9);
            }
            this.bitCount.add(j8);
        }
    }
}
