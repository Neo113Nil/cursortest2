package org.bouncycastle.crypto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public class DefaultBufferedBlockCipher extends BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected MultiBlockCipher mbCipher;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    public DefaultBufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        if (blockCipher instanceof MultiBlockCipher) {
            MultiBlockCipher multiBlockCipher = (MultiBlockCipher) blockCipher;
            this.mbCipher = multiBlockCipher;
            this.buf = new byte[multiBlockCipher.getMultiBlockSize()];
        } else {
            this.mbCipher = null;
            this.buf = new byte[blockCipher.getBlockSize()];
        }
        boolean z = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.pgpCFB = z2;
        if (z2 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z = true;
        }
        this.partialBlockOkay = z;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        try {
            int i2 = this.bufOff;
            if (i + i2 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i3 = 0;
            if (i2 != 0) {
                if (!this.partialBlockOkay) {
                    throw new DataLengthException("data not block size aligned");
                }
                BlockCipher blockCipher = this.cipher;
                byte[] bArr2 = this.buf;
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                int i4 = this.bufOff;
                this.bufOff = 0;
                System.arraycopy(this.buf, 0, bArr, i, i4);
                i3 = i4;
            }
            reset();
            return i3;
        } catch (Throwable th) {
            reset();
            throw th;
        }
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        if (!this.pgpCFB || !this.forEncryption) {
            return i + this.bufOff;
        }
        return this.cipher.getBlockSize() + 2 + i + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int length;
        int i2;
        int i3 = i + this.bufOff;
        if (this.pgpCFB) {
            boolean z = this.forEncryption;
            byte[] bArr = this.buf;
            if (z) {
                i2 = (i3 % bArr.length) - (this.cipher.getBlockSize() + 2);
                return i3 - i2;
            }
            length = bArr.length;
        } else {
            length = this.buf.length;
        }
        i2 = i3 % length;
        return i3 - i2;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        reset();
        this.cipher.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        int i3 = i2 + 1;
        this.bufOff = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i);
        this.bufOff = 0;
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
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
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i5 = this.bufOff;
        int i6 = length - i5;
        if (i2 > i6) {
            System.arraycopy(bArr, i, bArr3, i5, i6);
            i4 = this.cipher.processBlock(this.buf, 0, bArr2, i3);
            this.bufOff = 0;
            i2 -= i6;
            int i7 = i6 + i;
            MultiBlockCipher multiBlockCipher = this.mbCipher;
            if (multiBlockCipher != null) {
                int multiBlockSize = i2 / multiBlockCipher.getMultiBlockSize();
                if (multiBlockSize > 0) {
                    i4 += this.mbCipher.processBlocks(bArr, i7, multiBlockSize, bArr2, i3 + i4);
                    int multiBlockSize2 = this.mbCipher.getMultiBlockSize() * multiBlockSize;
                    i2 -= multiBlockSize2;
                    i7 += multiBlockSize2;
                }
                i = i7;
            } else {
                i = i7;
                while (i2 > this.buf.length) {
                    i4 += this.cipher.processBlock(bArr, i, bArr2, i3 + i4);
                    i2 -= blockSize;
                    i += blockSize;
                }
            }
        } else {
            i4 = 0;
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        int i8 = this.bufOff + i2;
        this.bufOff = i8;
        byte[] bArr4 = this.buf;
        if (i8 != bArr4.length) {
            return i4;
        }
        int processBlock = this.cipher.processBlock(bArr4, 0, bArr2, i3 + i4) + i4;
        this.bufOff = 0;
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    public DefaultBufferedBlockCipher() {
    }
}
