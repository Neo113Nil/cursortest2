package org.bouncycastle.pqc.crypto.falcon;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class FalconNIST {
    int CRYPTO_BYTES;
    private int CRYPTO_PUBLICKEYBYTES;
    private int CRYPTO_SECRETKEYBYTES;
    int LOGN;
    private int N;
    int NONCELEN;
    private FalconCodec codec = new FalconCodec();
    private SecureRandom rand;

    FalconNIST(int i, int i2, SecureRandom secureRandom) {
        this.rand = secureRandom;
        this.LOGN = i;
        this.NONCELEN = i2;
        int i3 = 1 << i;
        this.N = i3;
        this.CRYPTO_PUBLICKEYBYTES = ((i3 * 14) / 8) + 1;
        if (i == 10) {
            this.CRYPTO_SECRETKEYBYTES = 2305;
            this.CRYPTO_BYTES = 1330;
            return;
        }
        if (i == 9 || i == 8) {
            this.CRYPTO_SECRETKEYBYTES = ((i3 * 12) / 8) + 1 + i3;
            this.CRYPTO_BYTES = 690;
        } else if (i == 7 || i == 6) {
            this.CRYPTO_SECRETKEYBYTES = ((i3 * 14) / 8) + 1 + i3;
            this.CRYPTO_BYTES = 690;
        } else {
            this.CRYPTO_SECRETKEYBYTES = (i3 * 2) + 1 + i3;
            this.CRYPTO_BYTES = 690;
        }
    }

    byte[] crypto_sign(boolean z, byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, int i3) {
        int comp_encode;
        byte[] bArr4;
        int i4 = this.N;
        byte[] bArr5 = new byte[i4];
        byte[] bArr6 = new byte[i4];
        byte[] bArr7 = new byte[i4];
        byte[] bArr8 = new byte[i4];
        short[] sArr = new short[i4];
        short[] sArr2 = new short[i4];
        byte[] bArr9 = new byte[48];
        byte[] bArr10 = new byte[this.NONCELEN];
        SHAKE256 shake256 = new SHAKE256();
        FalconSign falconSign = new FalconSign();
        FalconVrfy falconVrfy = new FalconVrfy();
        FalconCommon falconCommon = new FalconCommon();
        FalconCodec falconCodec = this.codec;
        int trim_i8_decode = falconCodec.trim_i8_decode(bArr5, 0, this.LOGN, falconCodec.max_fg_bits[this.LOGN], bArr3, i3, this.CRYPTO_SECRETKEYBYTES);
        if (trim_i8_decode == 0) {
            throw new IllegalStateException("f decode failed");
        }
        FalconCodec falconCodec2 = this.codec;
        int trim_i8_decode2 = falconCodec2.trim_i8_decode(bArr6, 0, this.LOGN, falconCodec2.max_fg_bits[this.LOGN], bArr3, i3 + trim_i8_decode, this.CRYPTO_SECRETKEYBYTES - trim_i8_decode);
        if (trim_i8_decode2 == 0) {
            throw new IllegalStateException("g decode failed");
        }
        int i5 = trim_i8_decode + trim_i8_decode2;
        FalconCodec falconCodec3 = this.codec;
        int trim_i8_decode3 = falconCodec3.trim_i8_decode(bArr7, 0, this.LOGN, falconCodec3.max_FG_bits[this.LOGN], bArr3, i3 + i5, this.CRYPTO_SECRETKEYBYTES - i5);
        if (trim_i8_decode3 == 0) {
            throw new IllegalArgumentException("F decode failed");
        }
        if (i5 + trim_i8_decode3 != this.CRYPTO_SECRETKEYBYTES - 1) {
            throw new IllegalStateException("full key not used");
        }
        if (!falconVrfy.complete_private(bArr8, 0, bArr5, 0, bArr6, 0, bArr7, 0, this.LOGN, new short[this.N * 2], 0)) {
            throw new IllegalStateException("complete_private failed");
        }
        this.rand.nextBytes(bArr10);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr10, 0, this.NONCELEN);
        shake256.inner_shake256_inject(bArr2, i, i2);
        shake256.i_shake256_flip();
        falconCommon.hash_to_point_vartime(shake256, sArr2, 0, this.LOGN);
        this.rand.nextBytes(bArr9);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr9, 0, 48);
        shake256.i_shake256_flip();
        falconSign.sign_dyn(sArr, 0, shake256, bArr5, 0, bArr6, 0, bArr7, 0, bArr8, 0, sArr2, 0, this.LOGN, new FalconFPR[this.N * 10], 0);
        int i6 = (this.CRYPTO_BYTES - 2) - this.NONCELEN;
        byte[] bArr11 = new byte[i6];
        if (z) {
            int i7 = this.LOGN;
            bArr11[0] = (byte) (i7 + 32);
            int comp_encode2 = this.codec.comp_encode(bArr11, 1, i6 - 1, sArr, 0, i7);
            if (comp_encode2 == 0) {
                throw new IllegalStateException("signature failed to generate");
            }
            comp_encode = comp_encode2 + 1;
            bArr4 = bArr11;
        } else {
            comp_encode = this.codec.comp_encode(bArr11, 0, i6, sArr, 0, this.LOGN);
            bArr4 = bArr11;
            if (comp_encode == 0) {
                throw new IllegalStateException("signature failed to generate");
            }
        }
        bArr[0] = (byte) (this.LOGN + 48);
        System.arraycopy(bArr10, 0, bArr, 1, this.NONCELEN);
        System.arraycopy(bArr4, 0, bArr, this.NONCELEN + 1, comp_encode);
        return Arrays.copyOfRange(bArr, 0, this.NONCELEN + 1 + comp_encode);
    }

    byte[][] crypto_sign_keypair(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.N;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i3];
        byte[] bArr5 = new byte[i3];
        short[] sArr = new short[i3];
        byte[] bArr6 = new byte[48];
        SHAKE256 shake256 = new SHAKE256();
        FalconKeyGen falconKeyGen = new FalconKeyGen();
        this.rand.nextBytes(bArr6);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr6, 0, 48);
        shake256.i_shake256_flip();
        falconKeyGen.keygen(shake256, bArr3, 0, bArr4, 0, bArr5, 0, null, 0, sArr, 0, this.LOGN);
        int i4 = this.LOGN;
        bArr2[i2] = (byte) (i4 + 80);
        FalconCodec falconCodec = this.codec;
        int i5 = i2 + 1;
        int trim_i8_encode = falconCodec.trim_i8_encode(bArr2, i5, this.CRYPTO_SECRETKEYBYTES - 1, bArr3, 0, i4, falconCodec.max_fg_bits[this.LOGN]);
        if (trim_i8_encode == 0) {
            throw new IllegalStateException("f encode failed");
        }
        int i6 = trim_i8_encode + 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i5, i6);
        FalconCodec falconCodec2 = this.codec;
        int i7 = i2 + i6;
        int trim_i8_encode2 = falconCodec2.trim_i8_encode(bArr2, i7, this.CRYPTO_SECRETKEYBYTES - i6, bArr4, 0, this.LOGN, falconCodec2.max_fg_bits[this.LOGN]);
        if (trim_i8_encode2 == 0) {
            throw new IllegalStateException("g encode failed");
        }
        int i8 = i6 + trim_i8_encode2;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, i7, i8);
        FalconCodec falconCodec3 = this.codec;
        int i9 = i2 + i8;
        int trim_i8_encode3 = falconCodec3.trim_i8_encode(bArr2, i9, this.CRYPTO_SECRETKEYBYTES - i8, bArr5, 0, this.LOGN, falconCodec3.max_FG_bits[this.LOGN]);
        if (trim_i8_encode3 == 0) {
            throw new IllegalStateException("F encode failed");
        }
        int i10 = i8 + trim_i8_encode3;
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr2, i9, i10);
        if (i10 != this.CRYPTO_SECRETKEYBYTES) {
            throw new IllegalStateException("secret key encoding failed");
        }
        int i11 = this.LOGN;
        bArr[i] = (byte) i11;
        if (this.codec.modq_encode(bArr, i + 1, this.CRYPTO_PUBLICKEYBYTES - 1, sArr, 0, i11) == this.CRYPTO_PUBLICKEYBYTES - 1) {
            return new byte[][]{Arrays.copyOfRange(bArr, 1, bArr.length), copyOfRange, copyOfRange2, copyOfRange3};
        }
        throw new IllegalStateException("public key encoding failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r17.codec.comp_decode(r2, 0, r17.LOGN, r19, 0, r9) != r9) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int crypto_sign_open(boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        SHAKE256 shake256;
        FalconVrfy falconVrfy;
        int i2;
        short[] sArr;
        short[] sArr2;
        FalconCommon falconCommon;
        int i3 = this.N;
        short[] sArr3 = new short[i3];
        short[] sArr4 = new short[i3];
        short[] sArr5 = new short[i3];
        SHAKE256 shake2562 = new SHAKE256();
        FalconVrfy falconVrfy2 = new FalconVrfy();
        FalconCommon falconCommon2 = new FalconCommon();
        if (this.codec.modq_decode(sArr3, 0, this.LOGN, bArr4, i, this.CRYPTO_PUBLICKEYBYTES - 1) != this.CRYPTO_PUBLICKEYBYTES - 1) {
            return -1;
        }
        falconVrfy2.to_ntt_monty(sArr3, 0, this.LOGN);
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!z) {
            shake256 = shake2562;
            falconVrfy = falconVrfy2;
            i2 = -1;
            sArr = sArr4;
            sArr2 = sArr5;
            if (length >= 1) {
                falconCommon = falconCommon2;
            }
            return -1;
        }
        if (length < 1) {
            return -1;
        }
        byte b = bArr[0];
        falconVrfy = falconVrfy2;
        int i4 = this.LOGN;
        i2 = -1;
        if (b != ((byte) (i4 + 32))) {
            return -1;
        }
        sArr = sArr4;
        sArr2 = sArr5;
        int i5 = length - 1;
        shake256 = shake2562;
        falconCommon = falconCommon2;
        if (this.codec.comp_decode(sArr2, 0, i4, bArr, 1, i5) != i5) {
            return -1;
        }
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr2, 0, this.NONCELEN);
        shake256.inner_shake256_inject(bArr3, 0, length2);
        shake256.i_shake256_flip();
        falconCommon.hash_to_point_vartime(shake256, sArr, 0, this.LOGN);
        if (falconVrfy.verify_raw(sArr, 0, sArr2, 0, sArr3, 0, this.LOGN, new short[this.N], 0) == 0) {
            return i2;
        }
        return 0;
    }
}
