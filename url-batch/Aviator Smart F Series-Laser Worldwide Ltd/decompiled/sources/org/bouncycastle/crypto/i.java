package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface i extends f {
    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    /* synthetic */ int doFinal(byte[] bArr, int i8);

    int doFinal(byte[] bArr, int i8, int i9);

    int doOutput(byte[] bArr, int i8, int i9);

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    /* synthetic */ String getAlgorithmName();

    @Override // org.bouncycastle.crypto.f
    /* synthetic */ int getByteLength();

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    /* synthetic */ int getDigestSize();

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    /* synthetic */ void reset();

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    /* synthetic */ void update(byte b8);

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    /* synthetic */ void update(byte[] bArr, int i8, int i9);
}
