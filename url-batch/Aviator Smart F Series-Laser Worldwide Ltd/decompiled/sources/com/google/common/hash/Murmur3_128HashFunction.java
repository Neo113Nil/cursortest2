package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);

    private static final class Murmur3_128Hasher extends AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;

        /* renamed from: h1, reason: collision with root package name */
        private long f15017h1;

        /* renamed from: h2, reason: collision with root package name */
        private long f15018h2;
        private int length;

        Murmur3_128Hasher(int i8) {
            super(16);
            long j8 = i8;
            this.f15017h1 = j8;
            this.f15018h2 = j8;
            this.length = 0;
        }

        private void bmix64(long j8, long j9) {
            long mixK1 = mixK1(j8) ^ this.f15017h1;
            this.f15017h1 = mixK1;
            long rotateLeft = Long.rotateLeft(mixK1, 27);
            long j10 = this.f15018h2;
            this.f15017h1 = ((rotateLeft + j10) * 5) + 1390208809;
            long mixK2 = mixK2(j9) ^ j10;
            this.f15018h2 = mixK2;
            this.f15018h2 = ((Long.rotateLeft(mixK2, 31) + this.f15017h1) * 5) + 944331445;
        }

        private static long fmix64(long j8) {
            long j9 = (j8 ^ (j8 >>> 33)) * (-49064778989728563L);
            long j10 = (j9 ^ (j9 >>> 33)) * (-4265267296055464877L);
            return j10 ^ (j10 >>> 33);
        }

        private static long mixK1(long j8) {
            return Long.rotateLeft(j8 * C1, 31) * C2;
        }

        private static long mixK2(long j8) {
            return Long.rotateLeft(j8 * C2, 33) * C1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode makeHash() {
            long j8 = this.f15017h1;
            int i8 = this.length;
            long j9 = j8 ^ i8;
            long j10 = this.f15018h2 ^ i8;
            long j11 = j9 + j10;
            this.f15017h1 = j11;
            this.f15018h2 = j10 + j11;
            this.f15017h1 = fmix64(j11);
            long fmix64 = fmix64(this.f15018h2);
            long j12 = this.f15017h1 + fmix64;
            this.f15017h1 = j12;
            this.f15018h2 = fmix64 + j12;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f15017h1).putLong(this.f15018h2).array());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(ByteBuffer byteBuffer) {
            bmix64(byteBuffer.getLong(), byteBuffer.getLong());
            this.length += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(ByteBuffer byteBuffer) {
            long j8;
            long j9;
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            this.length += byteBuffer.remaining();
            long j15 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j8 = 0;
                    j14 = j8 ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 2:
                    j9 = 0;
                    j8 = j9 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j14 = j8 ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 3:
                    j10 = 0;
                    j9 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j10;
                    j8 = j9 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j14 = j8 ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 4:
                    j11 = 0;
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j9 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j10;
                    j8 = j9 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j14 = j8 ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 5:
                    j12 = 0;
                    j11 = j12 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j9 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j10;
                    j8 = j9 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j14 = j8 ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 6:
                    j13 = 0;
                    j12 = (UnsignedBytes.toInt(byteBuffer.get(5)) << 40) ^ j13;
                    j11 = j12 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j9 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j10;
                    j8 = j9 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j14 = j8 ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 7:
                    j13 = UnsignedBytes.toInt(byteBuffer.get(6)) << 48;
                    j12 = (UnsignedBytes.toInt(byteBuffer.get(5)) << 40) ^ j13;
                    j11 = j12 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j9 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j10;
                    j8 = j9 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j14 = j8 ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 8:
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 9:
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 10:
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 11:
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 12:
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 13:
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(12)) << 32;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 14:
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(13)) << 40;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(12)) << 32;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                case 15:
                    j15 = UnsignedBytes.toInt(byteBuffer.get(14)) << 48;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(13)) << 40;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(12)) << 32;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j15 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j14 = byteBuffer.getLong();
                    this.f15017h1 = mixK1(j14) ^ this.f15017h1;
                    this.f15018h2 ^= mixK2(j15);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    Murmur3_128HashFunction(int i8) {
        this.seed = i8;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj).seed;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public String toString() {
        int i8 = this.seed;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }
}
