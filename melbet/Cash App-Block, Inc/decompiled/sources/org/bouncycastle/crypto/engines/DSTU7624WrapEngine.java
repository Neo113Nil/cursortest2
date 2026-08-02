package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class DSTU7624WrapEngine implements Wrapper {
    private static final int BYTES_IN_INTEGER = 4;
    private byte[] B;
    private ArrayList<byte[]> Btemp;
    private byte[] checkSumArray;
    private DSTU7624Engine engine;
    private boolean forWrapping;
    private byte[] intArray;
    private byte[] zeroArray;

    public DSTU7624WrapEngine(int i) {
        DSTU7624Engine dSTU7624Engine = new DSTU7624Engine(i);
        this.engine = dSTU7624Engine;
        this.B = new byte[dSTU7624Engine.getBlockSize() / 2];
        this.checkSumArray = new byte[this.engine.getBlockSize()];
        this.zeroArray = new byte[this.engine.getBlockSize()];
        this.Btemp = new ArrayList<>();
        this.intArray = new byte[4];
    }

    private void intToBytes(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.forWrapping = z;
        if (cipherParameters instanceof KeyParameter) {
            this.engine.init(z, cipherParameters);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("invalid parameters passed to DSTU7624WrapEngine");
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) {
        DSTU7624Engine dSTU7624Engine;
        if (this.forWrapping) {
            a$$ExternalSyntheticBUOutline0.m$1("not set for unwrapping");
            return null;
        }
        int blockSize = i2 % this.engine.getBlockSize();
        DSTU7624Engine dSTU7624Engine2 = this.engine;
        if (blockSize != 0) {
            throw new DataLengthException("unwrap data must be a multiple of " + dSTU7624Engine2.getBlockSize() + " bytes");
        }
        int blockSize2 = (i2 * 2) / dSTU7624Engine2.getBlockSize();
        int i3 = blockSize2 - 1;
        int i4 = i3 * 6;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        byte[] bArr3 = new byte[this.engine.getBlockSize() / 2];
        System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
        this.Btemp.clear();
        int blockSize3 = i2 - (this.engine.getBlockSize() / 2);
        int blockSize4 = this.engine.getBlockSize() / 2;
        while (blockSize3 != 0) {
            byte[] bArr4 = new byte[this.engine.getBlockSize() / 2];
            System.arraycopy(bArr2, blockSize4, bArr4, 0, this.engine.getBlockSize() / 2);
            this.Btemp.add(bArr4);
            blockSize3 -= this.engine.getBlockSize() / 2;
            blockSize4 += this.engine.getBlockSize() / 2;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            System.arraycopy(this.Btemp.get(blockSize2 - 2), 0, bArr2, 0, this.engine.getBlockSize() / 2);
            System.arraycopy(bArr3, 0, bArr2, this.engine.getBlockSize() / 2, this.engine.getBlockSize() / 2);
            intToBytes(i4 - i5, this.intArray, 0);
            int i6 = 0;
            while (true) {
                dSTU7624Engine = this.engine;
                if (i6 >= 4) {
                    break;
                }
                int blockSize5 = (dSTU7624Engine.getBlockSize() / 2) + i6;
                bArr2[blockSize5] = (byte) (bArr2[blockSize5] ^ this.intArray[i6]);
                i6++;
            }
            dSTU7624Engine.processBlock(bArr2, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
            for (int i7 = 2; i7 < blockSize2; i7++) {
                int i8 = blockSize2 - i7;
                System.arraycopy(this.Btemp.get(i8 - 1), 0, this.Btemp.get(i8), 0, this.engine.getBlockSize() / 2);
            }
            System.arraycopy(bArr2, this.engine.getBlockSize() / 2, this.Btemp.get(0), 0, this.engine.getBlockSize() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, this.engine.getBlockSize() / 2);
        int blockSize6 = this.engine.getBlockSize() / 2;
        for (int i9 = 0; i9 < i3; i9++) {
            System.arraycopy(this.Btemp.get(i9), 0, bArr2, blockSize6, this.engine.getBlockSize() / 2);
            blockSize6 += this.engine.getBlockSize() / 2;
        }
        System.arraycopy(bArr2, i2 - this.engine.getBlockSize(), this.checkSumArray, 0, this.engine.getBlockSize());
        byte[] bArr5 = new byte[i2 - this.engine.getBlockSize()];
        if (Arrays.areEqual(this.checkSumArray, this.zeroArray)) {
            System.arraycopy(bArr2, 0, bArr5, 0, i2 - this.engine.getBlockSize());
            return bArr5;
        }
        f$$ExternalSyntheticLambda0.m$2("checksum failed");
        return null;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        DSTU7624Engine dSTU7624Engine;
        ArrayList<byte[]> arrayList;
        if (!this.forWrapping) {
            a$$ExternalSyntheticBUOutline0.m$1("not set for wrapping");
            return null;
        }
        if (i2 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException("wrap data must be a multiple of " + this.engine.getBlockSize() + " bytes");
        }
        if (i + i2 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
            return null;
        }
        int blockSize = ((i2 / this.engine.getBlockSize()) + 1) * 2;
        int i3 = blockSize - 1;
        int i4 = i3 * 6;
        int blockSize2 = this.engine.getBlockSize() + i2;
        byte[] bArr3 = new byte[blockSize2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        System.arraycopy(bArr3, 0, this.B, 0, this.engine.getBlockSize() / 2);
        this.Btemp.clear();
        int blockSize3 = blockSize2 - (this.engine.getBlockSize() / 2);
        int blockSize4 = this.engine.getBlockSize() / 2;
        while (blockSize3 != 0) {
            byte[] bArr4 = new byte[this.engine.getBlockSize() / 2];
            System.arraycopy(bArr3, blockSize4, bArr4, 0, this.engine.getBlockSize() / 2);
            this.Btemp.add(bArr4);
            blockSize3 -= this.engine.getBlockSize() / 2;
            blockSize4 += this.engine.getBlockSize() / 2;
        }
        int i5 = 0;
        while (true) {
            bArr2 = this.B;
            if (i5 >= i4) {
                break;
            }
            System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
            System.arraycopy(this.Btemp.get(0), 0, bArr3, this.engine.getBlockSize() / 2, this.engine.getBlockSize() / 2);
            this.engine.processBlock(bArr3, 0, bArr3, 0);
            i5++;
            intToBytes(i5, this.intArray, 0);
            int i6 = 0;
            while (true) {
                dSTU7624Engine = this.engine;
                if (i6 >= 4) {
                    break;
                }
                int blockSize5 = (dSTU7624Engine.getBlockSize() / 2) + i6;
                bArr3[blockSize5] = (byte) (bArr3[blockSize5] ^ this.intArray[i6]);
                i6++;
            }
            System.arraycopy(bArr3, dSTU7624Engine.getBlockSize() / 2, this.B, 0, this.engine.getBlockSize() / 2);
            int i7 = 2;
            while (true) {
                arrayList = this.Btemp;
                if (i7 < blockSize) {
                    System.arraycopy(arrayList.get(i7 - 1), 0, this.Btemp.get(i7 - 2), 0, this.engine.getBlockSize() / 2);
                    i7++;
                }
            }
            System.arraycopy(bArr3, 0, arrayList.get(blockSize - 2), 0, this.engine.getBlockSize() / 2);
        }
        System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
        int blockSize6 = this.engine.getBlockSize() / 2;
        for (int i8 = 0; i8 < i3; i8++) {
            System.arraycopy(this.Btemp.get(i8), 0, bArr3, blockSize6, this.engine.getBlockSize() / 2);
            blockSize6 += this.engine.getBlockSize() / 2;
        }
        return bArr3;
    }
}
