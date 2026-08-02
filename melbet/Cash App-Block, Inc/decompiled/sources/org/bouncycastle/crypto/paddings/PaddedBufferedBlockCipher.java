package org.bouncycastle.crypto.paddings;

import bo.app.a$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes9.dex */
public class PaddedBufferedBlockCipher extends DefaultBufferedBlockCipher {
    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        this.padding = blockCipherPadding;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockCipher.getBlockSize()];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        int i2;
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        boolean z = ((DefaultBufferedBlockCipher) this).forEncryption;
        int i3 = ((DefaultBufferedBlockCipher) this).bufOff;
        if (z) {
            if (i3 != blockSize) {
                i2 = 0;
            } else {
                if ((blockSize * 2) + i > bArr.length) {
                    reset();
                    f$$ExternalSyntheticLambda0.m$3("output buffer too short");
                    return 0;
                }
                i2 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i);
                ((DefaultBufferedBlockCipher) this).bufOff = 0;
            }
            this.padding.addPadding(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff);
            return ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i + i2) + i2;
        }
        if (i3 != blockSize) {
            reset();
            f$$ExternalSyntheticLambda0.m$4("last block incomplete in decryption");
            return 0;
        }
        BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
        try {
            int padCount = processBlock - this.padding.padCount(((DefaultBufferedBlockCipher) this).buf);
            System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i, padCount);
            return padCount;
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!((DefaultBufferedBlockCipher) this).forEncryption) {
            return i2;
        }
        return i2 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i2 % bArr.length;
        return length == 0 ? Math.max(0, i2 - bArr.length) : i2 - length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        ((DefaultBufferedBlockCipher) this).forEncryption = z;
        reset();
        boolean z2 = cipherParameters instanceof ParametersWithRandom;
        BlockCipherPadding blockCipherPadding = this.padding;
        if (z2) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            blockCipherPadding.init(parametersWithRandom.getRandom());
            blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            blockCipherPadding.init(null);
            blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
        }
        blockCipher.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) {
        int i2 = ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int processBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i3 = processBlock;
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int i4 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i4 + 1;
        bArr3[i4] = b;
        return i3;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Can't have a negative input length!");
            return 0;
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too short");
            return 0;
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int length = bArr3.length;
        int i4 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int processBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i3);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i2 -= i5;
            i += i5;
            i6 = processBlock;
            while (i2 > ((DefaultBufferedBlockCipher) this).buf.length) {
                i6 += ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, i, bArr2, i3 + i6);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i2);
        ((DefaultBufferedBlockCipher) this).bufOff += i2;
        return i6;
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }
}
