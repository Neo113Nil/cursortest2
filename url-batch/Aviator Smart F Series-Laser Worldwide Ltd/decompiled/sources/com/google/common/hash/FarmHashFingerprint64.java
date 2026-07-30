package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    FarmHashFingerprint64() {
    }

    @VisibleForTesting
    static long fingerprint(byte[] bArr, int i8, int i9) {
        return i9 <= 32 ? i9 <= 16 ? hashLength0to16(bArr, i8, i9) : hashLength17to32(bArr, i8, i9) : i9 <= 64 ? hashLength33To64(bArr, i8, i9) : hashLength65Plus(bArr, i8, i9);
    }

    private static long hashLength0to16(byte[] bArr, int i8, int i9) {
        if (i9 >= 8) {
            long j8 = (i9 * 2) + K2;
            long load64 = LittleEndianByteArray.load64(bArr, i8) + K2;
            long load642 = LittleEndianByteArray.load64(bArr, (i8 + i9) - 8);
            return hashLength16((Long.rotateRight(load642, 37) * j8) + load64, (Long.rotateRight(load64, 25) + load642) * j8, j8);
        }
        if (i9 >= 4) {
            return hashLength16(i9 + ((LittleEndianByteArray.load32(bArr, i8) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) << 3), LittleEndianByteArray.load32(bArr, (i8 + i9) - 4) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32, (i9 * 2) + K2);
        }
        if (i9 <= 0) {
            return K2;
        }
        return shiftMix((((bArr[i8] & 255) + ((bArr[(i9 >> 1) + i8] & 255) << 8)) * K2) ^ ((i9 + ((bArr[i8 + (i9 - 1)] & 255) << 2)) * K0)) * K2;
    }

    private static long hashLength16(long j8, long j9, long j10) {
        long j11 = (j8 ^ j9) * j10;
        long j12 = ((j11 ^ (j11 >>> 47)) ^ j9) * j10;
        return (j12 ^ (j12 >>> 47)) * j10;
    }

    private static long hashLength17to32(byte[] bArr, int i8, int i9) {
        long j8 = (i9 * 2) + K2;
        long load64 = LittleEndianByteArray.load64(bArr, i8) * K1;
        long load642 = LittleEndianByteArray.load64(bArr, i8 + 8);
        int i10 = i8 + i9;
        long load643 = LittleEndianByteArray.load64(bArr, i10 - 8) * j8;
        return hashLength16((LittleEndianByteArray.load64(bArr, i10 - 16) * K2) + Long.rotateRight(load64 + load642, 43) + Long.rotateRight(load643, 30), load64 + Long.rotateRight(load642 + K2, 18) + load643, j8);
    }

    private static long hashLength33To64(byte[] bArr, int i8, int i9) {
        long j8 = (i9 * 2) + K2;
        long load64 = LittleEndianByteArray.load64(bArr, i8) * K2;
        long load642 = LittleEndianByteArray.load64(bArr, i8 + 8);
        int i10 = i8 + i9;
        long load643 = LittleEndianByteArray.load64(bArr, i10 - 8) * j8;
        long rotateRight = Long.rotateRight(load64 + load642, 43) + Long.rotateRight(load643, 30) + (LittleEndianByteArray.load64(bArr, i10 - 16) * K2);
        long hashLength16 = hashLength16(rotateRight, load643 + Long.rotateRight(load642 + K2, 18) + load64, j8);
        long load644 = LittleEndianByteArray.load64(bArr, i8 + 16) * j8;
        long load645 = LittleEndianByteArray.load64(bArr, i8 + 24);
        long load646 = (rotateRight + LittleEndianByteArray.load64(bArr, i10 - 32)) * j8;
        return hashLength16(((hashLength16 + LittleEndianByteArray.load64(bArr, i10 - 24)) * j8) + Long.rotateRight(load644 + load645, 43) + Long.rotateRight(load646, 30), load644 + Long.rotateRight(load645 + load64, 18) + load646, j8);
    }

    private static long hashLength65Plus(byte[] bArr, int i8, int i9) {
        long j8 = 81;
        long j9 = (j8 * K1) + 113;
        long shiftMix = shiftMix((j9 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long load64 = (j8 * K2) + LittleEndianByteArray.load64(bArr, i8);
        int i10 = i9 - 1;
        int i11 = i8 + ((i10 / 64) * 64);
        int i12 = i10 & 63;
        int i13 = i11 + i12;
        int i14 = i13 - 63;
        int i15 = i8;
        while (true) {
            long rotateRight = Long.rotateRight(load64 + j9 + jArr[0] + LittleEndianByteArray.load64(bArr, i15 + 8), 37) * K1;
            long rotateRight2 = Long.rotateRight(j9 + jArr[1] + LittleEndianByteArray.load64(bArr, i15 + 48), 42) * K1;
            long j10 = rotateRight ^ jArr2[1];
            long load642 = rotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr, i15 + 40);
            long rotateRight3 = Long.rotateRight(shiftMix + jArr2[0], 33) * K1;
            weakHashLength32WithSeeds(bArr, i15, jArr[1] * K1, j10 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bArr, i15 + 32, rotateRight3 + jArr2[1], load642 + LittleEndianByteArray.load64(bArr, i15 + 16), jArr2);
            int i16 = i15 + 64;
            if (i16 == i11) {
                long j11 = K1 + ((j10 & 255) << 1);
                long j12 = jArr2[0] + i12;
                jArr2[0] = j12;
                long j13 = jArr[0] + j12;
                jArr[0] = j13;
                jArr2[0] = jArr2[0] + j13;
                long rotateRight4 = Long.rotateRight(rotateRight3 + load642 + jArr[0] + LittleEndianByteArray.load64(bArr, i13 - 55), 37) * j11;
                long rotateRight5 = Long.rotateRight(load642 + jArr[1] + LittleEndianByteArray.load64(bArr, i13 - 15), 42) * j11;
                long j14 = rotateRight4 ^ (jArr2[1] * 9);
                long load643 = rotateRight5 + (jArr[0] * 9) + LittleEndianByteArray.load64(bArr, i13 - 23);
                long rotateRight6 = Long.rotateRight(j10 + jArr2[0], 33) * j11;
                weakHashLength32WithSeeds(bArr, i14, jArr[1] * j11, j14 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bArr, i13 - 31, rotateRight6 + jArr2[1], load643 + LittleEndianByteArray.load64(bArr, i13 - 47), jArr2);
                return hashLength16(hashLength16(jArr[0], jArr2[0], j11) + (shiftMix(load643) * K0) + j14, hashLength16(jArr[1], jArr2[1], j11) + rotateRight6, j11);
            }
            i15 = i16;
            shiftMix = j10;
            j9 = load642;
            load64 = rotateRight3;
        }
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
        long rotateRight = Long.rotateRight(j9 + j10 + load644, 21) + Long.rotateRight(j11, 44);
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
        return "Hashing.farmHashFingerprint64()";
    }
}
