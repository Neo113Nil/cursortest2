package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mldsa.HashMLDSASigner;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;

/* loaded from: classes9.dex */
public class HashSignatureSpi extends BaseDeterministicOrRandomSignature {
    private MLDSAParameters parameters;
    private HashMLDSASigner signer;

    public static class MLDSA extends HashSignatureSpi {
        public MLDSA() {
            super(new HashMLDSASigner());
        }
    }

    public static class MLDSA44 extends HashSignatureSpi {
        public MLDSA44() {
            super(new HashMLDSASigner(), MLDSAParameters.ml_dsa_44_with_sha512);
        }
    }

    public static class MLDSA65 extends HashSignatureSpi {
        public MLDSA65() {
            super(new HashMLDSASigner(), MLDSAParameters.ml_dsa_65_with_sha512);
        }
    }

    public static class MLDSA87 extends HashSignatureSpi {
        public MLDSA87() {
            super(new HashMLDSASigner(), MLDSAParameters.ml_dsa_87_with_sha512);
        }
    }

    public HashSignatureSpi(HashMLDSASigner hashMLDSASigner, MLDSAParameters mLDSAParameters) {
        super(MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName());
        this.signer = hashMLDSASigner;
        this.parameters = mLDSAParameters;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        try {
            return this.signer.generateSignature();
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        return this.signer.verifySignature(bArr);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, CipherParameters cipherParameters) {
        this.signer.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) {
        ((Signature) this).appRandom = secureRandom;
        if (!(privateKey instanceof BCMLDSAPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown private key passed to ML-DSA");
            return;
        }
        BCMLDSAPrivateKey bCMLDSAPrivateKey = (BCMLDSAPrivateKey) privateKey;
        this.keyParams = bCMLDSAPrivateKey.getKeyParams();
        MLDSAParameters mLDSAParameters = this.parameters;
        if (mLDSAParameters != null) {
            String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
            if (!name.equals(bCMLDSAPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(name));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b) {
        this.signer.update(b);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) {
        if (!(publicKey instanceof BCMLDSAPublicKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown public key passed to ML-DSA");
            return;
        }
        BCMLDSAPublicKey bCMLDSAPublicKey = (BCMLDSAPublicKey) publicKey;
        this.keyParams = bCMLDSAPublicKey.getKeyParams();
        MLDSAParameters mLDSAParameters = this.parameters;
        if (mLDSAParameters != null) {
            String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
            if (!name.equals(bCMLDSAPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(name));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }

    public HashSignatureSpi(HashMLDSASigner hashMLDSASigner) {
        super("HashMLDSA");
        this.signer = hashMLDSASigner;
        this.parameters = null;
    }
}
