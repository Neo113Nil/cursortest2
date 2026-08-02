package org.bouncycastle.openssl;

/* loaded from: classes8.dex */
public interface PEMEncryptor {
    byte[] encrypt(byte[] bArr);

    String getAlgorithm();

    byte[] getIV();
}
