package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes9.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private final int blockSize;
    private boolean initialised;

    public NullEngine(int i) {
        this.blockSize = i;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Null";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        if (!this.initialised) {
            a$$ExternalSyntheticBUOutline0.m$1("Null engine not initialised");
            return 0;
        }
        int i4 = this.blockSize;
        if (i + i4 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
            return 0;
        }
        if (i4 + i2 > bArr2.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too short");
            return 0;
        }
        while (true) {
            int i5 = this.blockSize;
            if (i3 >= i5) {
                return i5;
            }
            bArr2[i2 + i3] = bArr[i + i3];
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public NullEngine() {
        this(1);
    }
}
