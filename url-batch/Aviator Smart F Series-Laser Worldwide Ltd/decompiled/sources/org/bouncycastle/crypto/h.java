package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface h {
    byte[] generateSignature();

    void init(boolean z7, c cVar);

    void reset();

    void update(byte b8);

    void update(byte[] bArr, int i8, int i9);

    boolean verifySignature(byte[] bArr);
}
