package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes9.dex */
public interface AEADCipher {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i);

    int getUpdateOutputSize(int i);

    void init(boolean z, CipherParameters cipherParameters);

    void processAADByte(byte b);

    void processAADBytes(byte[] bArr, int i, int i2);

    int processByte(byte b, byte[] bArr, int i);

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    void reset();
}
