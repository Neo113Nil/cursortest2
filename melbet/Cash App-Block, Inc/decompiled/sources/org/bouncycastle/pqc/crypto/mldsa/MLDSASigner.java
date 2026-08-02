package org.bouncycastle.pqc.crypto.mldsa;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes10.dex */
public class MLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private MLDSAEngine engine;
    private SHAKEDigest msgDigest;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        MLDSAEngine mLDSAEngine = this.engine;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        byte[] generateSignature = mLDSAEngine.generateSignature(sHAKEDigest, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.s1, mLDSAPrivateKeyParameters.s2, bArr);
        reset();
        return generateSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        MLDSAParameters parameters;
        String str;
        byte[] bArr = EMPTY_CONTEXT;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            bArr = parametersWithContext.getContext();
            cipherParameters = parametersWithContext.getParameters();
            if (bArr.length > 255) {
                str = "context too long";
                a$$ExternalSyntheticBUOutline0.m$3(str);
            }
        }
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (MLDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (MLDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
            MLDSAEngine engine = parameters.getEngine(this.random);
            this.engine = engine;
            engine.initSign(this.privKey.tr, false, bArr);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = mLDSAPublicKeyParameters.getParameters();
            MLDSAEngine engine2 = parameters.getEngine(null);
            this.engine = engine2;
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
            engine2.initVerify(mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.t1, false, bArr);
        }
        if (!parameters.isPreHash()) {
            reset();
        } else {
            str = "\"pure\" ml-dsa must use non pre-hash parameters";
            a$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine engine = this.privKey.getParameters().getEngine(this.random);
        engine.initSign(this.privKey.tr, false, null);
        int length = bArr.length;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        return engine.signInternal(bArr, length, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.s1, mLDSAPrivateKeyParameters.s2, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine engine = this.pubKey.getParameters().getEngine(this.random);
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        engine.initVerify(mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.t1, false, null);
        SHAKEDigest shake256Digest = engine.getShake256Digest();
        shake256Digest.update(bArr, 0, bArr.length);
        int length = bArr2.length;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
        return engine.verifyInternal(bArr2, length, shake256Digest, mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.t1);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.msgDigest = this.engine.getShake256Digest();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.msgDigest.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr.length;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        boolean verifyInternal = mLDSAEngine.verifyInternal(bArr, length, sHAKEDigest, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.t1);
        reset();
        return verifyInternal;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.msgDigest.update(bArr, i, i2);
    }
}
