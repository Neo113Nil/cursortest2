package org.bouncycastle.crypto.modes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class SICBlockCipher extends StreamBlockCipher implements CTRModeCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j) {
        long j2;
        long j3;
        int i = this.byteCount;
        int i2 = 5;
        if (j >= 0) {
            long j4 = (i + j) / this.blockSize;
            if (j4 > 255) {
                j3 = j4;
                while (i2 >= 1) {
                    long j5 = 1 << (i2 * 8);
                    while (j3 >= j5) {
                        incrementCounterAt(i2);
                        j3 -= j5;
                    }
                    i2--;
                }
            } else {
                j3 = j4;
            }
            incrementCounter((int) j3);
            this.byteCount = (int) ((j + this.byteCount) - (this.blockSize * j4));
            return;
        }
        long j6 = ((-j) - i) / this.blockSize;
        if (j6 > 255) {
            j2 = j6;
            while (i2 >= 1) {
                long j7 = 1 << (i2 * 8);
                while (j2 > j7) {
                    decrementCounterAt(i2);
                    j2 -= j7;
                }
                i2--;
            }
        } else {
            j2 = j6;
        }
        for (long j8 = 0; j8 != j2; j8++) {
            decrementCounterAt(0);
        }
        int i3 = (int) ((this.blockSize * j6) + this.byteCount + j);
        if (i3 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i3;
        }
    }

    private void checkCounter() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                if (this.counter[length] != this.IV[length]) {
                    a$$ExternalSyntheticBUOutline0.m$1("Counter in CTR/SIC mode out of range.");
                    return;
                }
            }
        }
    }

    private void checkLastIncrement() {
        byte[] bArr = this.IV;
        if (bArr.length >= this.blockSize || this.counter[bArr.length - 1] == bArr[bArr.length - 1]) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Counter in CTR/SIC mode out of range.");
    }

    private void decrementCounterAt(int i) {
        byte b;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b = (byte) (r1[length] - 1);
            this.counter[length] = b;
        } while (b == -1);
    }

    private void incrementCounter(int i) {
        byte[] bArr = this.counter;
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + ((byte) i));
        if ((b & 255) + i > 255) {
            incrementCounterAt(1);
        }
    }

    private void incrementCounterAt(int i) {
        byte b;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }

    public static CTRModeCipher newInstance(BlockCipher blockCipher) {
        return new SICBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        int i = this.byteCount;
        if (i == 0) {
            checkLastIncrement();
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i2 = this.byteCount;
            this.byteCount = i2 + 1;
            return (byte) (bArr[i2] ^ b);
        }
        byte[] bArr2 = this.counterOut;
        int i3 = i + 1;
        this.byteCount = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.counter.length) {
            this.byteCount = 0;
            incrementCounter();
        }
        return b2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = length - 1;
        while (i >= 1) {
            byte[] bArr3 = this.IV;
            int i2 = i < bArr3.length ? (bArr2[i] & 255) - (bArr3[i] & 255) : bArr2[i] & 255;
            if (i2 < 0) {
                int i3 = i - 1;
                bArr2[i3] = (byte) (bArr2[i3] - 1);
                i2 += 256;
            }
            bArr2[i] = (byte) i2;
            i--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * this.blockSize) + this.byteCount;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a$$ExternalSyntheticBUOutline0.m$3("CTR/SIC mode requires ParametersWithIV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] clone = Arrays.clone(parametersWithIV.getIV());
        this.IV = clone;
        int i = this.blockSize;
        if (i < clone.length) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockSize, " bytes.", new StringBuilder("CTR/SIC mode requires IV no greater than: ")));
            return;
        }
        int i2 = 8 > i / 2 ? i / 2 : 8;
        if (i - clone.length > i2) {
            Mod$$ExternalSyntheticBUOutline0.m("CTR/SIC mode requires IV of at least: ", this.blockSize - i2, " bytes.");
            return;
        }
        if (parametersWithIV.getParameters() != null) {
            this.cipher.init(true, parametersWithIV.getParameters());
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.byteCount;
        int i4 = this.blockSize;
        if (i3 != 0) {
            processBytes(bArr, i, i4, bArr2, i2);
        } else {
            int i5 = i + i4;
            int length = bArr.length;
            if (i5 > length) {
                f$$ExternalSyntheticLambda0.m$4("input buffer too small");
                return 0;
            }
            if (i2 + i4 > bArr2.length) {
                f$$ExternalSyntheticLambda0.m$3("output buffer too short");
                return 0;
            }
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            for (int i6 = 0; i6 < this.blockSize; i6++) {
                bArr2[i2 + i6] = (byte) (bArr[i + i6] ^ this.counterOut[i6]);
            }
            incrementCounter();
        }
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte b;
        if (i + i2 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too small");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = this.byteCount;
            if (i5 == 0) {
                checkLastIncrement();
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b2 = bArr[i + i4];
                byte[] bArr3 = this.counterOut;
                int i6 = this.byteCount;
                this.byteCount = i6 + 1;
                b = (byte) (b2 ^ bArr3[i6]);
            } else {
                byte b3 = bArr[i + i4];
                byte[] bArr4 = this.counterOut;
                int i7 = i5 + 1;
                this.byteCount = i7;
                b = (byte) (bArr4[i5] ^ b3);
                if (i7 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounter();
                }
            }
            bArr2[i3 + i4] = b;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j) {
        adjustCounter(j);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j;
    }

    private void incrementCounter() {
        byte b;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }
}
