package org.bouncycastle.crypto.digests;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: classes9.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest(int i) {
        super(checkBitLength(i), CryptoServicePurpose.ANY);
    }

    private static int checkBitLength(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "'bitLength' ", " not supported for SHA-3"));
        return 0;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 < 0 || i2 > 7) {
            a$$ExternalSyntheticBUOutline0.m$3("'partialBits' must be in the range [0,7]");
            return 0;
        }
        int i3 = (b & ((1 << i2) - 1)) | (2 << i2);
        int i4 = i2 + 2;
        if (i4 >= 8) {
            absorb((byte) i3);
            i4 = i2 - 6;
            i3 >>>= 8;
        }
        return super.doFinal(bArr, i, (byte) i3, i4);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    public SHA3Digest() {
        this(256, CryptoServicePurpose.ANY);
    }

    public SHA3Digest(int i, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i), cryptoServicePurpose);
    }

    public SHA3Digest(CryptoServicePurpose cryptoServicePurpose) {
        this(256, cryptoServicePurpose);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i);
    }
}
