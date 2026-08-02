package org.bouncycastle.pqc.crypto.slhdsa;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class SLHDSAPrivateKeyParameters extends SLHDSAKeyParameters {
    final PK pk;
    final SK sk;

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(true, sLHDSAParameters);
        int n = sLHDSAParameters.getN();
        int i = n * 4;
        if (bArr.length != i) {
            a$$ExternalSyntheticBUOutline0.m$3("private key encoding does not match parameters");
            throw null;
        }
        int i2 = n * 2;
        this.sk = new SK(Arrays.copyOfRange(bArr, 0, n), Arrays.copyOfRange(bArr, n, i2));
        int i3 = n * 3;
        this.pk = new PK(Arrays.copyOfRange(bArr, i2, i3), Arrays.copyOfRange(bArr, i3, i));
    }

    public byte[] getEncoded() {
        SK sk = this.sk;
        byte[] bArr = sk.seed;
        byte[] bArr2 = sk.prf;
        PK pk = this.pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, pk.seed, pk.root});
    }

    public byte[] getEncodedPublicKey() {
        PK pk = this.pk;
        return Arrays.concatenate(pk.seed, pk.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.sk.prf);
    }

    public byte[] getPublicKey() {
        PK pk = this.pk;
        return Arrays.concatenate(pk.seed, pk.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.sk.seed);
    }

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, SK sk, PK pk) {
        super(true, sLHDSAParameters);
        this.sk = sk;
        this.pk = pk;
    }

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sLHDSAParameters);
        this.sk = new SK(bArr, bArr2);
        this.pk = new PK(bArr3, bArr4);
    }
}
