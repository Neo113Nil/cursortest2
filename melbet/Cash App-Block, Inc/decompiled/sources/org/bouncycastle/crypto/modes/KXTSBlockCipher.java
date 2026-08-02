package org.bouncycastle.crypto.modes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class KXTSBlockCipher extends DefaultBufferedBlockCipher {
    private static final long RED_POLY_128 = 135;
    private static final long RED_POLY_256 = 1061;
    private static final long RED_POLY_512 = 293;
    private final int blockSize;
    private int counter;
    private final long reductionPolynomial;
    private final long[] tw_current;
    private final long[] tw_init;

    public KXTSBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.reductionPolynomial = getReductionPolynomial(blockSize);
        this.tw_init = new long[blockSize >>> 3];
        this.tw_current = new long[blockSize >>> 3];
        this.counter = -1;
    }

    private static void GF_double(long j, long[] jArr) {
        long j2 = 0;
        int i = 0;
        while (i < jArr.length) {
            long j3 = jArr[i];
            jArr[i] = j2 ^ (j3 << 1);
            i++;
            j2 = j3 >>> 63;
        }
        jArr[0] = (j & (-j2)) ^ jArr[0];
    }

    public static long getReductionPolynomial(int i) {
        if (i == 16) {
            return RED_POLY_128;
        }
        if (i == 32) {
            return RED_POLY_256;
        }
        if (i == 64) {
            return RED_POLY_512;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Only 128, 256, and 512 -bit block sizes supported");
        return 0L;
    }

    private void processBlocks(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.counter;
        if (i3 == -1) {
            a$$ExternalSyntheticBUOutline0.m$1("Attempt to process too many blocks");
            return;
        }
        this.counter = i3 + 1;
        GF_double(this.reductionPolynomial, this.tw_current);
        byte[] bArr3 = new byte[this.blockSize];
        Pack.longToLittleEndian(this.tw_current, bArr3, 0);
        int i4 = this.blockSize;
        byte[] bArr4 = new byte[i4];
        System.arraycopy(bArr3, 0, bArr4, 0, i4);
        for (int i5 = 0; i5 < this.blockSize; i5++) {
            bArr4[i5] = (byte) (bArr4[i5] ^ bArr[i + i5]);
        }
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr4, 0, bArr4, 0);
        for (int i6 = 0; i6 < this.blockSize; i6++) {
            bArr2[i2 + i6] = (byte) (bArr4[i6] ^ bArr3[i6]);
        }
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        reset();
        return 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid parameters passed");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        int i = this.blockSize;
        if (length != i) {
            a$$ExternalSyntheticBUOutline0.m$3("Currently only support IVs of exactly one block");
            return;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(iv, 0, bArr, 0, i);
        ((DefaultBufferedBlockCipher) this).cipher.init(true, parameters);
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, 0, bArr, 0);
        ((DefaultBufferedBlockCipher) this).cipher.init(z, parameters);
        Pack.littleEndianToLong(bArr, 0, this.tw_init);
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) {
        throw new IllegalStateException("unsupported operation");
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        if (bArr.length - i < i2) {
            f$$ExternalSyntheticLambda0.m$4("Input buffer too short");
            return 0;
        }
        if (bArr2.length - i < i2) {
            f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
            return 0;
        }
        if (i2 % this.blockSize != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Partial blocks not supported");
            return 0;
        }
        while (i4 < i2) {
            processBlocks(bArr, i + i4, bArr2, i3 + i4);
            i4 += this.blockSize;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        ((DefaultBufferedBlockCipher) this).cipher.reset();
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }
}
