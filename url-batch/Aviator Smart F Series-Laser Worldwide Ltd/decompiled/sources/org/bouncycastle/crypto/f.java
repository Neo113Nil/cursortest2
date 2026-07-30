package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface f extends e {
    @Override // org.bouncycastle.crypto.e
    /* synthetic */ int doFinal(byte[] bArr, int i8);

    @Override // org.bouncycastle.crypto.e
    /* synthetic */ String getAlgorithmName();

    int getByteLength();

    @Override // org.bouncycastle.crypto.e
    /* synthetic */ int getDigestSize();

    @Override // org.bouncycastle.crypto.e
    /* synthetic */ void reset();

    @Override // org.bouncycastle.crypto.e
    /* synthetic */ void update(byte b8);

    @Override // org.bouncycastle.crypto.e
    /* synthetic */ void update(byte[] bArr, int i8, int i9);
}
