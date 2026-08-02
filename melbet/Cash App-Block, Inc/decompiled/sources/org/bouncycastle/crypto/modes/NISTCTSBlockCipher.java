package org.bouncycastle.crypto.modes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;

/* loaded from: classes9.dex */
public class NISTCTSBlockCipher extends DefaultBufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;

    /* renamed from: type, reason: collision with root package name */
    private final int f1580type;

    public NISTCTSBlockCipher(int i, BlockCipher blockCipher) {
        this.f1580type = i;
        ((DefaultBufferedBlockCipher) this).cipher = CBCBlockCipher.newInstance(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockSize * 2];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        if (((DefaultBufferedBlockCipher) this).bufOff + i > bArr.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer to small in doFinal");
            return 0;
        }
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        int i2 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i3 = i2 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            if (i2 < blockSize) {
                f$$ExternalSyntheticLambda0.m$4("need at least one block of input for NISTCTS");
                return 0;
            }
            if (i2 > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i4 = this.f1580type;
                if (i4 == 2 || i4 == 3) {
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr3, 0, i3);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.f1580type == 2 && i3 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i + blockSize, i3);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i + blockSize, i3);
                    }
                } else {
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, i3);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - i3, bArr3, 0, i3);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i + i3, blockSize);
                }
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        } else {
            if (i2 < blockSize) {
                f$$ExternalSyntheticLambda0.m$4("need at least one block of input for CTS");
                return 0;
            }
            byte[] bArr4 = new byte[blockSize];
            if (i2 > blockSize) {
                int i5 = this.f1580type;
                if (i5 == 3 || (i5 == 2 && (((DefaultBufferedBlockCipher) this).buf.length - i2) % blockSize != 0)) {
                    BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
                    if (blockCipher instanceof CBCModeCipher) {
                        ((CBCModeCipher) blockCipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    } else {
                        blockCipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    }
                    for (int i6 = blockSize; i6 != ((DefaultBufferedBlockCipher) this).bufOff; i6++) {
                        int i7 = i6 - blockSize;
                        bArr4[i7] = (byte) (bArr2[i7] ^ ((DefaultBufferedBlockCipher) this).buf[i6]);
                    }
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr2, 0, i3);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
                } else {
                    ((CBCModeCipher) ((DefaultBufferedBlockCipher) this).cipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - blockSize, bArr4, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    if (i3 != blockSize) {
                        System.arraycopy(bArr4, i3, bArr2, i3, blockSize - i3);
                    }
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, blockSize);
                    for (int i8 = 0; i8 != i3; i8++) {
                        bArr4[i8] = (byte) (bArr4[i8] ^ ((DefaultBufferedBlockCipher) this).buf[i8]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i + blockSize, i3);
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        }
        int i9 = ((DefaultBufferedBlockCipher) this).bufOff;
        reset();
        return i9;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i + ((DefaultBufferedBlockCipher) this).bufOff;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) {
        int i2 = ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int processBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
            int i4 = this.blockSize;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            ((DefaultBufferedBlockCipher) this).bufOff = this.blockSize;
            i3 = processBlock;
        }
        byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
        int i5 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i5 + 1;
        bArr4[i5] = b;
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
            byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            ((DefaultBufferedBlockCipher) this).bufOff = blockSize;
            i2 -= i5;
            i += i5;
            while (i2 > blockSize) {
                System.arraycopy(bArr, i, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, blockSize);
                processBlock += ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i3 + processBlock);
                byte[] bArr5 = ((DefaultBufferedBlockCipher) this).buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i6 = processBlock;
        }
        System.arraycopy(bArr, i, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i2);
        ((DefaultBufferedBlockCipher) this).bufOff += i2;
        return i6;
    }
}
