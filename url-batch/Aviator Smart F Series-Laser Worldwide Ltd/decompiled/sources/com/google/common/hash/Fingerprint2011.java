package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011 = new Fingerprint2011();
    private static final long K0 = -6505348102511208375L;
    private static final long K1 = -8261664234251669945L;
    private static final long K2 = -4288712594273399085L;
    private static final long K3 = -4132994306676758123L;

    Fingerprint2011() {
    }

    @VisibleForTesting
    static long fingerprint(byte[] bArr, int i8, int i9) {
        long murmurHash64WithSeed = i9 <= 32 ? murmurHash64WithSeed(bArr, i8, i9, -1397348546323613475L) : i9 <= 64 ? hashLength33To64(bArr, i8, i9) : fullFingerprint(bArr, i8, i9);
        long j8 = K0;
        long load64 = i9 >= 8 ? LittleEndianByteArray.load64(bArr, i8) : -6505348102511208375L;
        if (i9 >= 9) {
            j8 = LittleEndianByteArray.load64(bArr, (i8 + i9) - 8);
        }
        long hash128to64 = hash128to64(murmurHash64WithSeed + j8, load64);
        return (hash128to64 == 0 || hash128to64 == 1) ? hash128to64 - 2 : hash128to64;
    }

    private static long fullFingerprint(byte[] bArr, int i8, int i9) {
        long load64 = LittleEndianByteArray.load64(bArr, i8);
        int i10 = i8 + i9;
        long load642 = LittleEndianByteArray.load64(bArr, i10 - 16) ^ K1;
        long load643 = LittleEndianByteArray.load64(bArr, i10 - 56) ^ K0;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j8 = i9;
        weakHashLength32WithSeeds(bArr, i10 - 64, j8, load642, jArr);
        weakHashLength32WithSeeds(bArr, i10 - 32, j8 * K1, K0, jArr2);
        long shiftMix = load643 + (shiftMix(jArr[1]) * K1);
        long rotateRight = Long.rotateRight(shiftMix + load64, 39) * K1;
        long rotateRight2 = Long.rotateRight(load642, 33) * K1;
        int i11 = i8;
        int i12 = (i9 - 1) & (-64);
        while (true) {
            long rotateRight3 = Long.rotateRight(rotateRight + rotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr, i11 + 16), 37) * K1;
            long rotateRight4 = Long.rotateRight(rotateRight2 + jArr[1] + LittleEndianByteArray.load64(bArr, i11 + 48), 42) * K1;
            long j9 = rotateRight3 ^ jArr2[1];
            long j10 = rotateRight4 ^ jArr[0];
            long rotateRight5 = Long.rotateRight(shiftMix ^ jArr2[0], 33);
            weakHashLength32WithSeeds(bArr, i11, jArr[1] * K1, j9 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bArr, i11 + 32, jArr2[1] + rotateRight5, j10, jArr2);
            i11 += 64;
            i12 -= 64;
            if (i12 == 0) {
                return hash128to64(hash128to64(jArr[0], jArr2[0]) + (shiftMix(j10) * K1) + j9, hash128to64(jArr[1], jArr2[1]) + rotateRight5);
            }
            rotateRight = rotateRight5;
            shiftMix = j9;
            rotateRight2 = j10;
        }
    }

    @VisibleForTesting
    static long hash128to64(long j8, long j9) {
        long j10 = (j9 ^ j8) * K3;
        long j11 = (j8 ^ (j10 ^ (j10 >>> 47))) * K3;
        return (j11 ^ (j11 >>> 47)) * K3;
    }

    private static long hashLength33To64(byte[] bArr, int i8, int i9) {
        long load64 = LittleEndianByteArray.load64(bArr, i8 + 24);
        int i10 = i8 + i9;
        int i11 = i10 - 16;
        long load642 = LittleEndianByteArray.load64(bArr, i8) + ((i9 + LittleEndianByteArray.load64(bArr, i11)) * K0);
        long rotateRight = Long.rotateRight(load642 + load64, 52);
        long rotateRight2 = Long.rotateRight(load642, 37);
        long load643 = load642 + LittleEndianByteArray.load64(bArr, i8 + 8);
        long rotateRight3 = rotateRight2 + Long.rotateRight(load643, 7);
        int i12 = i8 + 16;
        long load644 = load643 + LittleEndianByteArray.load64(bArr, i12);
        long j8 = load64 + load644;
        long rotateRight4 = rotateRight + Long.rotateRight(load644, 31) + rotateRight3;
        long load645 = LittleEndianByteArray.load64(bArr, i12) + LittleEndianByteArray.load64(bArr, i10 - 32);
        long load646 = LittleEndianByteArray.load64(bArr, i10 - 8);
        long rotateRight5 = Long.rotateRight(load645 + load646, 52);
        long rotateRight6 = Long.rotateRight(load645, 37);
        long load647 = load645 + LittleEndianByteArray.load64(bArr, i10 - 24);
        long rotateRight7 = rotateRight6 + Long.rotateRight(load647, 7);
        long load648 = load647 + LittleEndianByteArray.load64(bArr, i11);
        return shiftMix((shiftMix(((j8 + rotateRight5 + Long.rotateRight(load648, 31) + rotateRight7) * K2) + ((load646 + load648 + rotateRight4) * K0)) * K0) + rotateRight4) * K2;
    }

    @VisibleForTesting
    static long murmurHash64WithSeed(byte[] bArr, int i8, int i9, long j8) {
        int i10 = i9 & (-8);
        int i11 = i9 & 7;
        long j9 = j8 ^ (i9 * K3);
        for (int i12 = 0; i12 < i10; i12 += 8) {
            j9 = (j9 ^ (shiftMix(LittleEndianByteArray.load64(bArr, i8 + i12) * K3) * K3)) * K3;
        }
        if (i11 != 0) {
            j9 = (LittleEndianByteArray.load64Safely(bArr, i8 + i10, i11) ^ j9) * K3;
        }
        return shiftMix(shiftMix(j9) * K3);
    }

    private static long shiftMix(long j8) {
        return j8 ^ (j8 >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i8, long j8, long j9, long[] jArr) {
        long load64 = LittleEndianByteArray.load64(bArr, i8);
        long load642 = LittleEndianByteArray.load64(bArr, i8 + 8);
        long load643 = LittleEndianByteArray.load64(bArr, i8 + 16);
        long load644 = LittleEndianByteArray.load64(bArr, i8 + 24);
        long j10 = j8 + load64;
        long j11 = load642 + j10 + load643;
        long rotateRight = Long.rotateRight(j9 + j10 + load644, 51) + Long.rotateRight(j11, 23);
        jArr[0] = j11 + load644;
        jArr[1] = rotateRight + j10;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i8, int i9) {
        Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i8, i9));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
