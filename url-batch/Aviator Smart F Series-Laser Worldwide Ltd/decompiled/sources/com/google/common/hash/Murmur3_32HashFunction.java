package com.google.common.hash;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import javax.annotation.CheckForNull;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final HashFunction MURMUR3_32 = new Murmur3_32HashFunction(0, false);
    static final HashFunction MURMUR3_32_FIXED = new Murmur3_32HashFunction(0, true);
    static final HashFunction GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(Hashing.GOOD_FAST_HASH_SEED, true);

    @CanIgnoreReturnValue
    private static final class Murmur3_32Hasher extends AbstractHasher {
        private long buffer;

        /* renamed from: h1, reason: collision with root package name */
        private int f15019h1;
        private int shift;
        private int length = 0;
        private boolean isDone = false;

        Murmur3_32Hasher(int i8) {
            this.f15019h1 = i8;
        }

        private void update(int i8, long j8) {
            long j9 = this.buffer;
            long j10 = j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
            int i9 = this.shift;
            long j11 = (j10 << i9) | j9;
            this.buffer = j11;
            int i10 = i9 + (i8 * 8);
            this.shift = i10;
            this.length += i8;
            if (i10 >= 32) {
                this.f15019h1 = Murmur3_32HashFunction.mixH1(this.f15019h1, Murmur3_32HashFunction.mixK1((int) j11));
                this.buffer >>>= 32;
                this.shift -= 32;
            }
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            Preconditions.checkState(!this.isDone);
            this.isDone = true;
            int mixK1 = this.f15019h1 ^ Murmur3_32HashFunction.mixK1((int) this.buffer);
            this.f15019h1 = mixK1;
            return Murmur3_32HashFunction.fmix(mixK1, this.length);
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b8) {
            update(1, b8 & 255);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c8) {
            update(2, c8);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putInt(int i8) {
            update(4, i8);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putLong(long j8) {
            update(4, (int) j8);
            update(4, j8 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putString(CharSequence charSequence, Charset charset) {
            if (!Charsets.UTF_8.equals(charset)) {
                return super.putString(charSequence, charset);
            }
            int length = charSequence.length();
            int i8 = 0;
            while (true) {
                int i9 = i8 + 4;
                if (i9 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i8);
                char charAt2 = charSequence.charAt(i8 + 1);
                char charAt3 = charSequence.charAt(i8 + 2);
                char charAt4 = charSequence.charAt(i8 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                update(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                i8 = i9;
            }
            while (i8 < length) {
                char charAt5 = charSequence.charAt(i8);
                if (charAt5 < 128) {
                    update(1, charAt5);
                } else if (charAt5 < 2048) {
                    update(2, Murmur3_32HashFunction.charToTwoUtf8Bytes(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    update(3, Murmur3_32HashFunction.charToThreeUtf8Bytes(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i8);
                    if (codePointAt == charAt5) {
                        putBytes(charSequence.subSequence(i8, length).toString().getBytes(charset));
                        return this;
                    }
                    i8++;
                    update(4, Murmur3_32HashFunction.codePointToFourUtf8Bytes(codePointAt));
                }
                i8++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
            int i10 = 0;
            while (true) {
                int i11 = i10 + 4;
                if (i11 > i9) {
                    break;
                }
                update(4, Murmur3_32HashFunction.getIntLittleEndian(bArr, i10 + i8));
                i10 = i11;
            }
            while (i10 < i9) {
                putByte(bArr[i8 + i10]);
                i10++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            ByteOrder order = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                putInt(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                putByte(byteBuffer.get());
            }
            byteBuffer.order(order);
            return this;
        }
    }

    Murmur3_32HashFunction(int i8, boolean z7) {
        this.seed = i8;
        this.supplementaryPlaneFix = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c8) {
        return (c8 >>> '\f') | 224 | ((((c8 >>> 6) & 63) | 128) << 8) | (((c8 & '?') | 128) << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c8) {
        return (c8 >>> 6) | 192 | (((c8 & '?') | 128) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int i8) {
        return (i8 >>> 18) | 240 | ((((i8 >>> 12) & 63) | 128) << 8) | ((((i8 >>> 6) & 63) | 128) << 16) | (((i8 & 63) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode fmix(int i8, int i9) {
        int i10 = i8 ^ i9;
        int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
        int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i12 ^ (i12 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] bArr, int i8) {
        return Ints.fromBytes(bArr[i8 + 3], bArr[i8 + 2], bArr[i8 + 1], bArr[i8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int i8, int i9) {
        return (Integer.rotateLeft(i8 ^ i9, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int i8) {
        return Integer.rotateLeft(i8 * (-862048943), 15) * C2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Murmur3_32HashFunction)) {
            return false;
        }
        Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
        return this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i8, int i9) {
        Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
        int i10 = this.seed;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 4;
            if (i13 > i9) {
                break;
            }
            i10 = mixH1(i10, mixK1(getIntLittleEndian(bArr, i12 + i8)));
            i12 = i13;
        }
        int i14 = i12;
        int i15 = 0;
        while (i14 < i9) {
            i11 ^= UnsignedBytes.toInt(bArr[i8 + i14]) << i15;
            i14++;
            i15 += 8;
        }
        return fmix(mixK1(i11) ^ i10, i9);
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i8) {
        return fmix(mixH1(this.seed, mixK1(i8)), 4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j8) {
        int i8 = (int) (j8 >>> 32);
        return fmix(mixH1(mixH1(this.seed, mixK1((int) j8)), mixK1(i8)), 8);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        if (!Charsets.UTF_8.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i8 = this.seed;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 4;
            if (i12 > length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence.charAt(i10 + 1);
            char charAt3 = charSequence.charAt(i10 + 2);
            char charAt4 = charSequence.charAt(i10 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i8 = mixH1(i8, mixK1((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i11 += 4;
            i10 = i12;
        }
        long j8 = 0;
        while (i10 < length) {
            char charAt5 = charSequence.charAt(i10);
            if (charAt5 < 128) {
                j8 |= charAt5 << i9;
                i9 += 8;
                i11++;
            } else if (charAt5 < 2048) {
                j8 |= charToTwoUtf8Bytes(charAt5) << i9;
                i9 += 16;
                i11 += 2;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j8 |= charToThreeUtf8Bytes(charAt5) << i9;
                i9 += 24;
                i11 += 3;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i10);
                if (codePointAt == charAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i10++;
                j8 |= codePointToFourUtf8Bytes(codePointAt) << i9;
                if (this.supplementaryPlaneFix) {
                    i9 += 32;
                }
                i11 += 4;
            }
            if (i9 >= 32) {
                i8 = mixH1(i8, mixK1((int) j8));
                j8 >>>= 32;
                i9 -= 32;
            }
            i10++;
        }
        return fmix(mixK1((int) j8) ^ i8, i11);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int i8 = this.seed;
        for (int i9 = 1; i9 < charSequence.length(); i9 += 2) {
            i8 = mixH1(i8, mixK1(charSequence.charAt(i9 - 1) | (charSequence.charAt(i9) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i8 ^= mixK1(charSequence.charAt(charSequence.length() - 1));
        }
        return fmix(i8, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_32Hasher(this.seed);
    }

    public String toString() {
        int i8 = this.seed;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }
}
