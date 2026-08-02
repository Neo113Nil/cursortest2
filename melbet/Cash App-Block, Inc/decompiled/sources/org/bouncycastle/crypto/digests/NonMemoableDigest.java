package org.bouncycastle.crypto.digests;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.ExtendedDigest;

/* loaded from: classes9.dex */
public class NonMemoableDigest implements ExtendedDigest {
    private ExtendedDigest baseDigest;

    public NonMemoableDigest(ExtendedDigest extendedDigest) {
        if (extendedDigest != null) {
            this.baseDigest = extendedDigest;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("baseDigest must not be null");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return this.baseDigest.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.baseDigest.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.baseDigest.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.baseDigest.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.baseDigest.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.baseDigest.update(b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.baseDigest.update(bArr, i, i2);
    }
}
