package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface e {
    int doFinal(byte[] bArr, int i8);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b8);

    void update(byte[] bArr, int i8, int i9);
}
