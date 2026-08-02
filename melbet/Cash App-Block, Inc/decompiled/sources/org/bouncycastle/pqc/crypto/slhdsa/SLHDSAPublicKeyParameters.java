package org.bouncycastle.pqc.crypto.slhdsa;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class SLHDSAPublicKeyParameters extends SLHDSAKeyParameters {
    private final PK pk;

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(false, sLHDSAParameters);
        int n = sLHDSAParameters.getN();
        int i = n * 2;
        if (bArr.length == i) {
            this.pk = new PK(Arrays.copyOfRange(bArr, 0, n), Arrays.copyOfRange(bArr, n, i));
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("public key encoding does not match parameters");
            throw null;
        }
    }

    public byte[] getEncoded() {
        PK pk = this.pk;
        return Arrays.concatenate(pk.seed, pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.pk.seed);
    }

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, PK pk) {
        super(false, sLHDSAParameters);
        this.pk = pk;
    }
}
