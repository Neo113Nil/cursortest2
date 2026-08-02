package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class MLDSAPrivateKeyParameters extends MLDSAKeyParameters {
    final byte[] k;
    final byte[] rho;
    final byte[] s1;
    final byte[] s2;
    private final byte[] seed;
    final byte[] t0;
    private final byte[] t1;
    final byte[] tr;

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, MLDSAPublicKeyParameters mLDSAPublicKeyParameters) {
        super(true, mLDSAParameters);
        MLDSAEngine engine = mLDSAParameters.getEngine(null);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.k = Arrays.copyOfRange(bArr, 32, 64);
        this.tr = Arrays.copyOfRange(bArr, 64, 128);
        int dilithiumL = (engine.getDilithiumL() * engine.getDilithiumPolyEtaPackedBytes()) + 128;
        this.s1 = Arrays.copyOfRange(bArr, 128, dilithiumL);
        int dilithiumK = (engine.getDilithiumK() * engine.getDilithiumPolyEtaPackedBytes()) + dilithiumL;
        this.s2 = Arrays.copyOfRange(bArr, dilithiumL, dilithiumK);
        this.t0 = Arrays.copyOfRange(bArr, dilithiumK, (engine.getDilithiumK() * 416) + dilithiumK);
        if (mLDSAPublicKeyParameters != null) {
            this.t1 = mLDSAPublicKeyParameters.getT1();
        } else {
            this.t1 = null;
        }
        this.seed = null;
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.k, this.tr, this.s1, this.s2, this.t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.k);
    }

    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return MLDSAPublicKeyParameters.getEncoded(this.rho, this.t1);
    }

    public MLDSAPublicKeyParameters getPublicKeyParameters() {
        return new MLDSAPublicKeyParameters(getParameters(), this.rho, this.t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.s2);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public byte[] getT0() {
        return Arrays.clone(this.t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.tr);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        super(true, mLDSAParameters);
        byte[][] generateKeyPairInternal = mLDSAParameters.getEngine(null).generateKeyPairInternal(bArr);
        this.rho = generateKeyPairInternal[0];
        this.k = generateKeyPairInternal[1];
        this.tr = generateKeyPairInternal[2];
        this.s1 = generateKeyPairInternal[3];
        this.s2 = generateKeyPairInternal[4];
        this.t0 = generateKeyPairInternal[5];
        this.t1 = generateKeyPairInternal[6];
        this.seed = generateKeyPairInternal[7];
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        this(mLDSAParameters, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, null);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        super(true, mLDSAParameters);
        this.rho = Arrays.clone(bArr);
        this.k = Arrays.clone(bArr2);
        this.tr = Arrays.clone(bArr3);
        this.s1 = Arrays.clone(bArr4);
        this.s2 = Arrays.clone(bArr5);
        this.t0 = Arrays.clone(bArr6);
        this.t1 = Arrays.clone(bArr7);
        this.seed = Arrays.clone(bArr8);
    }
}
