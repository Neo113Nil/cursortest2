package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class MLDSAPublicKeyParameters extends MLDSAKeyParameters {
    final byte[] rho;
    final byte[] t1;

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        super(false, mLDSAParameters);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.t1 = Arrays.copyOfRange(bArr, 32, bArr.length);
    }

    public byte[] getEncoded() {
        return getEncoded(this.rho, this.t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT1() {
        return Arrays.clone(this.t1);
    }

    public static byte[] getEncoded(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2) {
        super(false, mLDSAParameters);
        this.rho = Arrays.clone(bArr);
        this.t1 = Arrays.clone(bArr2);
    }
}
